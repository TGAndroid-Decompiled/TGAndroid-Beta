package gg;

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
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.wy;
public final class w1 implements org.telegram.ui.ActionBar.c2, qy {
    public final int f9065a;
    public final KeyEvent.Callback f9066b;
    public final Object f9067c;
    public final Object d;
    public final Object e;
    public final Object f9068f;

    public w1(a2 a2Var, u1 u1Var, int i10, j2 j2Var, TextView textView, Utilities.Callback callback) {
        this.f9066b = a2Var;
        this.f9067c = u1Var;
        this.f9065a = i10;
        this.d = j2Var;
        this.e = textView;
        this.f9068f = callback;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean J(wy wyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        a2 a2Var = (a2) this.f9066b;
        u1 u1Var = (u1) this.f9067c;
        j2 j2Var = (j2) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f9068f;
        String obj = a2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            k2 f7 = k2.f(this.f9065a);
            if (j2Var == null) {
                i11 = -1;
            } else {
                i11 = j2Var.f8917a;
            }
            j2 d = f7.d(obj);
            if (d != null && d.f8917a != i11) {
                AndroidUtilities.shakeView(a2Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                u1Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            d2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(a2Var);
        u1Var.run(Boolean.FALSE);
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f9066b;
        final TLRPC.User user = (TLRPC.User) this.f9067c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final wy wyVar2 = (wy) this.f9068f;
        Pattern pattern = LaunchActivity.B1;
        final long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3));
        final int i12 = this.f9065a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.B1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.t8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, wyVar2, user, j3, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string;
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.AddBot), new org.telegram.ui.ActionBar.c2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.B1;
                    Bundle i14 = a4.a.i("scrollToTopOnResume", true);
                    long j10 = -j3;
                    i14.putLong("chat_id", j10);
                    eo eoVar = new eo(i14);
                    int i15 = i12;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i15).addUserToChat(j10, user, 0, str3, eoVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(eoVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public w1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, wy wyVar) {
        this.f9066b = launchActivity;
        this.f9065a = i10;
        this.f9067c = user;
        this.d = str;
        this.e = str2;
        this.f9068f = wyVar;
    }
}
