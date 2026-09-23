package hg;

import ai.e4;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ly;
import org.telegram.ui.ry;
import org.telegram.ui.wf1;
public final class o1 implements org.telegram.ui.ActionBar.a2, ly {
    public final int f10361a;
    public final KeyEvent.Callback f10362b;
    public final Object f10363c;
    public final Object d;
    public final Object e;
    public final Object f10364f;

    public o1(s1 s1Var, e4 e4Var, int i10, b2 b2Var, TextView textView, Utilities.Callback callback) {
        this.f10362b = s1Var;
        this.f10363c = e4Var;
        this.f10361a = i10;
        this.d = b2Var;
        this.e = textView;
        this.f10364f = callback;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(ry ryVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        s1 s1Var = (s1) this.f10362b;
        e4 e4Var = (e4) this.f10363c;
        b2 b2Var2 = (b2) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f10364f;
        String obj = s1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            c2 f7 = c2.f(this.f10361a);
            if (b2Var2 == null) {
                i11 = -1;
            } else {
                i11 = b2Var2.f10205a;
            }
            b2 d = f7.d(obj);
            if (d != null && d.f10205a != i11) {
                AndroidUtilities.shakeView(s1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                e4Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            b2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(s1Var);
        e4Var.run(Boolean.FALSE);
    }

    @Override
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f10362b;
        final TLRPC.User user = (TLRPC.User) this.f10363c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final ry ryVar2 = (ry) this.f10364f;
        Pattern pattern = LaunchActivity.B1;
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3));
        final int i12 = this.f10361a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.B1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.m8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, ryVar2, user, j3, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
            b2Var.R = string;
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.a2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.B1;
                    Bundle i14 = a4.a.i("scrollToTopOnResume", true);
                    long j10 = -j3;
                    i14.putLong("chat_id", j10);
                    xn xnVar = new xn(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j10, user, 0, str3, xnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(xnVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public o1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, ry ryVar) {
        this.f10362b = launchActivity;
        this.f10361a = i10;
        this.f10363c = user;
        this.d = str;
        this.e = str2;
        this.f10364f = ryVar;
    }
}
