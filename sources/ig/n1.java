package ig;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import bi.u3;
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
import org.telegram.ui.kg1;
import org.telegram.ui.sy;
import org.telegram.ui.yy;
public final class n1 implements org.telegram.ui.ActionBar.z1, sy {
    public final int f11591a;
    public final KeyEvent.Callback f11592b;
    public final Object f11593c;
    public final Object d;
    public final Object e;
    public final Object f11594f;

    public n1(r1 r1Var, u3 u3Var, int i10, a2 a2Var, TextView textView, Utilities.Callback callback) {
        this.f11592b = r1Var;
        this.f11593c = u3Var;
        this.f11591a = i10;
        this.d = a2Var;
        this.e = textView;
        this.f11594f = callback;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean L(yy yyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        r1 r1Var = (r1) this.f11592b;
        u3 u3Var = (u3) this.f11593c;
        a2 a2Var2 = (a2) this.d;
        TextView textView = (TextView) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f11594f;
        String obj = r1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            b2 f7 = b2.f(this.f11591a);
            if (a2Var2 == null) {
                i11 = -1;
            } else {
                i11 = a2Var2.f11438a;
            }
            a2 d = f7.d(obj);
            if (d != null && d.f11438a != i11) {
                AndroidUtilities.shakeView(r1Var);
                textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                u3Var.run(Boolean.TRUE);
                return;
            }
            callback.run(obj);
            a2Var.dismiss();
            return;
        }
        AndroidUtilities.shakeView(r1Var);
        u3Var.run(Boolean.FALSE);
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f11592b;
        final TLRPC.User user = (TLRPC.User) this.f11593c;
        final String str2 = (String) this.d;
        final String str3 = (String) this.e;
        final yy yyVar2 = (yy) this.f11594f;
        Pattern pattern = LaunchActivity.B1;
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j10));
        final int i12 = this.f11591a;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i12).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    Pattern pattern2 = LaunchActivity.B1;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.l8(LaunchActivity.this, str2, tL_chatAdminRights2, z12, str3, i12, chat, yyVar2, user, j10, str4));
                }
            });
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String string = LocaleController.getString(R.string.AddBot);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
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
                public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i13) {
                    Pattern pattern2 = LaunchActivity.B1;
                    Bundle h = a1.g.h("scrollToTopOnResume", true);
                    long j11 = -j10;
                    h.putLong("chat_id", j11);
                    fo foVar = new fo(h);
                    int i14 = i12;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    MessagesController.getInstance(i14).addUserToChat(j11, user, 0, str3, foVar, null);
                    ((ActionBarLayout) LaunchActivity.this.O()).S(foVar, true, false);
                }
            });
            alertDialog$Builder.o();
        }
        return true;
    }

    public n1(LaunchActivity launchActivity, int i10, TLRPC.User user, String str, String str2, yy yyVar) {
        this.f11592b = launchActivity;
        this.f11591a = i10;
        this.f11593c = user;
        this.d = str;
        this.e = str2;
        this.f11594f = yyVar;
    }
}
