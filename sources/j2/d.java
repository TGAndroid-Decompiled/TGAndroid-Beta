package j2;

import android.content.SharedPreferences;
import android.widget.EditText;
import bi.c7;
import e2.m;
import java.util.List;
import m4.a0;
import m4.c1;
import m4.e1;
import m4.f1;
import m4.j1;
import m4.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.xu0;
public final class d implements m, c1, e1, RequestDelegateTimestamp, a2, MessagesStorage.StringCallback {
    public final int f13198a;
    public final int f13199b;
    public final long f13200c;
    public final Object d;

    public d(long j3, int i10, Object obj, int i11) {
        this.f13198a = i11;
        this.f13200c = j3;
        this.f13199b = i10;
        this.d = obj;
    }

    @Override
    public void g(b2 b2Var, int i10) {
        int i11 = this.f13198a;
        Object obj = this.d;
        int i12 = this.f13199b;
        long j3 = this.f13200c;
        switch (i11) {
            case 4:
                EditText editText = (EditText) obj;
                String str = "";
                if (j3 > 0) {
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (userFull != null) {
                        String str2 = userFull.about;
                        if (str2 != null) {
                            str = str2;
                        }
                        if (str.equals(trim)) {
                            AndroidUtilities.hideKeyboard(editText);
                            b2Var.dismiss();
                            return;
                        }
                        userFull.about = trim;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j3), userFull);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j3));
                    ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new c7(12), 2);
                } else {
                    long j10 = -j3;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(j10);
                    String obj2 = editText.getText().toString();
                    if (chatFull != null) {
                        String str3 = chatFull.about;
                        if (str3 != null) {
                            str = str3;
                        }
                        if (str.equals(obj2)) {
                            AndroidUtilities.hideKeyboard(editText);
                            b2Var.dismiss();
                            return;
                        }
                        chatFull.about = obj2;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                        int i13 = NotificationCenter.chatInfoDidLoad;
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, chatFull, 0, bool, bool);
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j3));
                    MessagesController.getInstance(i12).updateChatAbout(j10, obj2, chatFull);
                }
                b2Var.dismiss();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                if (j3 != 0) {
                    edit.putInt("color_" + j3, 0);
                } else if (i12 == 1) {
                    edit.putInt("MessagesLed", 0);
                } else if (i12 == 0) {
                    edit.putInt("GroupLed", 0);
                } else if (i12 == 3) {
                    edit.putInt("StoriesLed", 0);
                } else if (i12 != 5 && i12 != 4) {
                    edit.putInt("ChannelLed", 0);
                } else {
                    edit.putInt("ReactionsLed", 0);
                }
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public Object h(a0 a0Var, r rVar, int i10) {
        int i11;
        long j3;
        List list = (List) this.d;
        int i12 = this.f13199b;
        if (i12 == -1) {
            i11 = a0Var.f15870t.l0();
        } else {
            i11 = i12;
        }
        if (i12 == -1) {
            j3 = a0Var.f15870t.J0();
        } else {
            j3 = this.f13200c;
        }
        return a0Var.q(rVar, list, i11, j3);
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        bVar.f((a) this.d, this.f13199b, this.f13200c);
    }

    @Override
    public void j(j1 j1Var, r rVar) {
        j1Var.s(((f1) this.d).K0(rVar, j1Var, this.f13199b), this.f13200c);
    }

    @Override
    public void run(String str) {
        xu0.i((xu0) this.d, this.f13200c, this.f13199b, str);
    }

    public d(a aVar, int i10, long j3, long j10) {
        this.f13198a = 0;
        this.d = aVar;
        this.f13199b = i10;
        this.f13200c = j3;
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.f13199b, this.f13200c, tLObject, tL_error, j3);
    }

    public d(Object obj, int i10, long j3, int i11) {
        this.f13198a = i11;
        this.d = obj;
        this.f13199b = i10;
        this.f13200c = j3;
    }

    public d(xu0 xu0Var, long j3, int i10) {
        this.f13198a = 6;
        this.d = xu0Var;
        this.f13200c = j3;
        this.f13199b = i10;
    }
}
