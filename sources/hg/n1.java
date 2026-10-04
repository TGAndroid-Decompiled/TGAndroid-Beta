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
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import org.telegram.ui.yf1;
public final class n1 implements org.telegram.ui.ActionBar.a2, oy {
    public final int f11279a;
    public final KeyEvent.Callback f11280b;
    public final Object f11281c;
    public final Object d;
    public final Object f11282e;
    public final Object f11283f;

    public n1(r1 r1Var, e4 e4Var, int i10, a2 a2Var, TextView textView, Utilities.Callback callback) {
        this.f11280b = r1Var;
        this.f11281c = e4Var;
        this.f11279a = i10;
        this.d = a2Var;
        this.f11282e = textView;
        this.f11283f = callback;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean H(uy uyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        r1 r1Var = (r1) this.f11280b;
        e4 e4Var = (e4) this.f11281c;
        a2 a2Var = (a2) this.d;
        TextView textView = (TextView) this.f11282e;
        Utilities.Callback callback = (Utilities.Callback) this.f11283f;
        String obj = r1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b2 f7 = b2.f(this.f11279a);
            if (a2Var == null) {
                i11 = -1;
            } else {
                i11 = a2Var.f11115a;
            }
            a2 d = f7.d(obj);
            if (d != null && d.f11115a != i11) {
                AndroidUtilities.shakeView(r1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                e4Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            b2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(r1Var);
        e4Var.run(Boolean.FALSE);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f11280b;
        final TLRPC.User user = (TLRPC.User) this.f11281c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f11282e;
        final uy uyVar2 = (uy) this.f11283f;
        Pattern pattern = LaunchActivity.B1;
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3));
        final int i12 = this.f11279a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.B1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.i8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, uyVar2, user, j3, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
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
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.B1;
                    Bundle i14 = a4.a.i("scrollToTopOnResume", true);
                    long j10 = -j3;
                    i14.putLong("chat_id", j10);
                    yn ynVar = new yn(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j10, user, 0, str3, ynVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(ynVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public n1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, uy uyVar) {
        this.f11280b = launchActivity;
        this.f11279a = i10;
        this.f11281c = user;
        this.d = str;
        this.f11282e = str2;
        this.f11283f = uyVar;
    }
}
