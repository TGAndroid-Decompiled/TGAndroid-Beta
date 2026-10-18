package ig;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import ci.y2;
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
import org.telegram.ui.ey;
import org.telegram.ui.te1;
import org.telegram.ui.xx;
public final class m1 implements org.telegram.ui.ActionBar.a2, xx {
    public final int f12966a;
    public final KeyEvent.Callback f12967b;
    public final Object f12968c;
    public final Object d;
    public final Object e;
    public final Object f12969f;

    public m1(q1 q1Var, y2 y2Var, int i10, z1 z1Var, TextView textView, Utilities.Callback callback) {
        this.f12967b = q1Var;
        this.f12968c = y2Var;
        this.f12966a = i10;
        this.d = z1Var;
        this.e = textView;
        this.f12969f = callback;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        q1 q1Var = (q1) this.f12967b;
        y2 y2Var = (y2) this.f12968c;
        z1 z1Var = (z1) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f12969f;
        String obj = q1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            a2 f7 = a2.f(this.f12966a);
            if (z1Var == null) {
                i11 = -1;
            } else {
                i11 = z1Var.f13098a;
            }
            z1 d = f7.d(obj);
            if (d != null && d.f13098a != i11) {
                AndroidUtilities.shakeView(q1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                y2Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            b2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(q1Var);
        y2Var.run(Boolean.FALSE);
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f12967b;
        final TLRPC.User user = (TLRPC.User) this.f12968c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final ey eyVar2 = (ey) this.f12969f;
        Pattern pattern = LaunchActivity.C1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j10));
        final int i12 = this.f12966a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.C1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.j8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, eyVar2, user, j10, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
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
                    Pattern pattern2 = LaunchActivity.C1;
                    Bundle h = a1.g.h("scrollToTopOnResume", true);
                    long j11 = -j10;
                    h.putLong("chat_id", j11);
                    sn snVar = new sn(h);
                    int i14 = i12;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i14).addUserToChat(j11, user, 0, str3, snVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(snVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public m1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, ey eyVar) {
        this.f12967b = launchActivity;
        this.f12966a = i10;
        this.f12968c = user;
        this.d = str;
        this.e = str2;
        this.f12969f = eyVar;
    }
}
