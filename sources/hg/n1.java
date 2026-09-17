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
import org.telegram.ui.fg1;
import org.telegram.ui.qy;
import org.telegram.ui.wy;
public final class n1 implements org.telegram.ui.ActionBar.b2, qy {
    public final int f10370a;
    public final KeyEvent.Callback f10371b;
    public final Object f10372c;
    public final Object d;
    public final Object e;
    public final Object f10373f;

    public n1(r1 r1Var, e4 e4Var, int i10, a2 a2Var, TextView textView, Utilities.Callback callback) {
        this.f10371b = r1Var;
        this.f10372c = e4Var;
        this.f10370a = i10;
        this.d = a2Var;
        this.e = textView;
        this.f10373f = callback;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(wy wyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        r1 r1Var = (r1) this.f10371b;
        e4 e4Var = (e4) this.f10372c;
        a2 a2Var = (a2) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f10373f;
        String obj = r1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b2 f7 = b2.f(this.f10370a);
            if (a2Var == null) {
                i11 = -1;
            } else {
                i11 = a2Var.f10222a;
            }
            a2 d = f7.d(obj);
            if (d != null && d.f10222a != i11) {
                AndroidUtilities.shakeView(r1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                e4Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            c2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(r1Var);
        e4Var.run(Boolean.FALSE);
    }

    @Override
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f10371b;
        final TLRPC.User user = (TLRPC.User) this.f10372c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final wy wyVar2 = (wy) this.f10373f;
        Pattern pattern = LaunchActivity.B1;
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3));
        final int i12 = this.f10370a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.B1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.m8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, wyVar2, user, j3, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
            c2Var.R = string;
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.b2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.B1;
                    Bundle i14 = a4.a.i("scrollToTopOnResume", true);
                    long j10 = -j3;
                    i14.putLong("chat_id", j10);
                    bo boVar = new bo(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j10, user, 0, str3, boVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(boVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public n1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, wy wyVar) {
        this.f10371b = launchActivity;
        this.f10370a = i10;
        this.f10372c = user;
        this.d = str;
        this.e = str2;
        this.f10373f = wyVar;
    }
}
