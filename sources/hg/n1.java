package hg;

import ai.f4;
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
import org.telegram.ui.eg1;
import org.telegram.ui.my;
import org.telegram.ui.sy;
public final class n1 implements org.telegram.ui.ActionBar.z1, my {
    public final int f11328a;
    public final KeyEvent.Callback f11329b;
    public final Object f11330c;
    public final Object d;
    public final Object f11331e;
    public final Object f11332f;

    public n1(s1 s1Var, f4 f4Var, int i10, b2 b2Var, TextView textView, Utilities.Callback callback) {
        this.f11329b = s1Var;
        this.f11330c = f4Var;
        this.f11328a = i10;
        this.d = b2Var;
        this.f11331e = textView;
        this.f11332f = callback;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(sy syVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        s1 s1Var = (s1) this.f11329b;
        f4 f4Var = (f4) this.f11330c;
        b2 b2Var = (b2) this.d;
        TextView textView = (TextView) this.f11331e;
        Utilities.Callback callback = (Utilities.Callback) this.f11332f;
        String obj = s1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            c2 f7 = c2.f(this.f11328a);
            if (b2Var == null) {
                i11 = -1;
            } else {
                i11 = b2Var.f11173a;
            }
            b2 d = f7.d(obj);
            if (d != null && d.f11173a != i11) {
                AndroidUtilities.shakeView(s1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                f4Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            a2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(s1Var);
        f4Var.run(Boolean.FALSE);
    }

    @Override
    public boolean w(sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f11329b;
        final TLRPC.User user = (TLRPC.User) this.f11330c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.f11331e;
        final sy syVar2 = (sy) this.f11332f;
        Pattern pattern = LaunchActivity.B1;
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3));
        final int i12 = this.f11328a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.B1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.i8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, syVar2, user, j3, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
            a2Var.R = string;
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.z1() {
                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.B1;
                    Bundle i14 = a1.g.i("scrollToTopOnResume", true);
                    long j10 = -j3;
                    i14.putLong("chat_id", j10);
                    zn znVar = new zn(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j10, user, 0, str3, znVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(znVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public n1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, sy syVar) {
        this.f11329b = launchActivity;
        this.f11328a = i10;
        this.f11330c = user;
        this.d = str;
        this.f11331e = str2;
        this.f11332f = syVar;
    }
}
