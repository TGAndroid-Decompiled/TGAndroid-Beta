package ig;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import bi.r3;
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
import org.telegram.ui.eg1;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
public final class n1 implements org.telegram.ui.ActionBar.a2, oy {
    public final int f12161a;
    public final KeyEvent.Callback f12162b;
    public final Object f12163c;
    public final Object d;
    public final Object f12164e;
    public final Object f12165f;

    public n1(r1 r1Var, r3 r3Var, int i10, a2 a2Var, TextView textView, Utilities.Callback callback) {
        this.f12162b = r1Var;
        this.f12163c = r3Var;
        this.f12161a = i10;
        this.d = a2Var;
        this.f12164e = textView;
        this.f12165f = callback;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        r1 r1Var = (r1) this.f12162b;
        r3 r3Var = (r3) this.f12163c;
        a2 a2Var = (a2) this.d;
        TextView textView = (TextView) this.f12164e;
        Utilities.Callback callback = (Utilities.Callback) this.f12165f;
        String obj = r1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b2 f7 = b2.f(this.f12161a);
            if (a2Var == null) {
                i11 = -1;
            } else {
                i11 = a2Var.f11992a;
            }
            a2 d = f7.d(obj);
            if (d != null && d.f11992a != i11) {
                AndroidUtilities.shakeView(r1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                r3Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            b2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(r1Var);
        r3Var.run(Boolean.FALSE);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f12162b;
        final TLRPC.User user = (TLRPC.User) this.f12163c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f12164e;
        final uy uyVar2 = (uy) this.f12165f;
        Pattern pattern = LaunchActivity.B1;
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3));
        final int i12 = this.f12161a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.B1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.m8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, uyVar2, user, j3, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
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
                    co coVar = new co(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j10, user, 0, str3, coVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(coVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public n1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, uy uyVar) {
        this.f12162b = launchActivity;
        this.f12161a = i10;
        this.f12163c = user;
        this.d = str;
        this.f12164e = str2;
        this.f12165f = uyVar;
    }
}
