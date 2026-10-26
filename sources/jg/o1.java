package jg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import di.y2;
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
import org.telegram.ui.af1;
import org.telegram.ui.cy;
import org.telegram.ui.ux;
public final class o1 implements org.telegram.ui.ActionBar.b2, ux {
    public final int f15798a;
    public final KeyEvent.Callback f15799b;
    public final Object f15800c;
    public final Object d;
    public final Object e;
    public final Object f15801f;

    public o1(s1 s1Var, y2 y2Var, int i10, b2 b2Var, TextView textView, Utilities.Callback callback) {
        this.f15799b = s1Var;
        this.f15800c = y2Var;
        this.f15798a = i10;
        this.d = b2Var;
        this.e = textView;
        this.f15801f = callback;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(cy cyVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        s1 s1Var = (s1) this.f15799b;
        y2 y2Var = (y2) this.f15800c;
        b2 b2Var = (b2) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f15801f;
        String obj = s1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            c2 f7 = c2.f(this.f15798a);
            if (b2Var == null) {
                i11 = -1;
            } else {
                i11 = b2Var.f15640a;
            }
            b2 d = f7.d(obj);
            if (d != null && d.f15640a != i11) {
                AndroidUtilities.shakeView(s1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                y2Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            e2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(s1Var);
        y2Var.run(Boolean.FALSE);
    }

    @Override
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f15799b;
        final TLRPC.User user = (TLRPC.User) this.f15800c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final cy cyVar2 = (cy) this.f15801f;
        Pattern pattern = LaunchActivity.D1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j10));
        final int i12 = this.f15798a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.D1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.o8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, cyVar2, user, j10, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
            e2Var.R = string;
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.b2() {
                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.D1;
                    Bundle i14 = a1.g.i("scrollToTopOnResume", true);
                    long j11 = -j10;
                    i14.putLong("chat_id", j11);
                    un unVar = new un(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j11, user, 0, str3, unVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).U(unVar, true, false);
                }
            });
            alertDialog$Builder.p();
        }
        return true;
    }

    public o1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, cy cyVar) {
        this.f15799b = launchActivity;
        this.f15798a = i10;
        this.f15800c = user;
        this.d = str;
        this.e = str2;
        this.f15801f = cyVar;
    }
}
