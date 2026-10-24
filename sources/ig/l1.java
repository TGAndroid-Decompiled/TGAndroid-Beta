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
import org.telegram.ui.xe1;
import org.telegram.ui.xx;
public final class l1 implements org.telegram.ui.ActionBar.z1, xx {
    public final int f12987a;
    public final KeyEvent.Callback f12988b;
    public final Object f12989c;
    public final Object d;
    public final Object e;
    public final Object f12990f;

    public l1(p1 p1Var, y2 y2Var, int i10, y1 y1Var, TextView textView, Utilities.Callback callback) {
        this.f12988b = p1Var;
        this.f12989c = y2Var;
        this.f12987a = i10;
        this.d = y1Var;
        this.e = textView;
        this.f12990f = callback;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(ey eyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        p1 p1Var = (p1) this.f12988b;
        y2 y2Var = (y2) this.f12989c;
        y1 y1Var = (y1) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f12990f;
        String obj = p1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            z1 f7 = z1.f(this.f12987a);
            if (y1Var == null) {
                i11 = -1;
            } else {
                i11 = y1Var.f13129a;
            }
            y1 d = f7.d(obj);
            if (d != null && d.f13129a != i11) {
                AndroidUtilities.shakeView(p1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                y2Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            c2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(p1Var);
        y2Var.run(Boolean.FALSE);
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, xe1 xe1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f12988b;
        final TLRPC.User user = (TLRPC.User) this.f12989c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final ey eyVar2 = (ey) this.f12990f;
        Pattern pattern = LaunchActivity.D1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j10));
        final int i12 = this.f12987a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.D1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.n8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, eyVar2, user, j10, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.z1() {
                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.D1;
                    Bundle h = a1.g.h("scrollToTopOnResume", true);
                    long j11 = -j10;
                    h.putLong("chat_id", j11);
                    sn snVar = new sn(h);
                    int i14 = i12;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i14).addUserToChat(j11, user, 0, str3, snVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).T(snVar, true, false);
                }
            });
            alertDialog$Builder.p();
        }
        return true;
    }

    public l1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, ey eyVar) {
        this.f12988b = launchActivity;
        this.f12987a = i10;
        this.f12989c = user;
        this.d = str;
        this.e = str2;
        this.f12990f = eyVar;
    }
}
