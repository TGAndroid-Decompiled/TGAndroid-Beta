package j2;

import android.content.SharedPreferences;
import android.widget.EditText;
import ci.e6;
import e2.o;
import e2.x;
import java.util.List;
import m4.e1;
import m4.f0;
import m4.g1;
import m4.i1;
import m4.m1;
import m4.v;
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
import org.telegram.ui.Components.tv0;
import v7.u6;
import z3.n;
public final class d implements o, e1, g1, RequestDelegateTimestamp, a2, MessagesStorage.StringCallback, e2.j {
    public final int f13937a;
    public final int f13938b;
    public final long f13939c;
    public final Object d;

    public d(long j10, int i10, Object obj, int i11) {
        this.f13937a = i11;
        this.f13939c = j10;
        this.f13938b = i10;
        this.d = obj;
    }

    @Override
    public void accept(Object obj) {
        boolean z10;
        n nVar = (n) this.d;
        z3.a aVar = (z3.a) obj;
        nVar.h.getClass();
        byte[] s22 = sb.a.s2(aVar.f50634a, aVar.f50636c);
        x xVar = nVar.f50658c;
        xVar.getClass();
        xVar.L(s22.length, s22);
        nVar.f50656a.d(s22.length, xVar);
        long j10 = aVar.f50635b;
        int i10 = (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1));
        long j11 = this.f13939c;
        if (i10 == 0) {
            if (nVar.h.f4134x == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
        } else {
            long j12 = nVar.h.f4134x;
            if (j12 == Long.MAX_VALUE) {
                j11 += j10;
            } else {
                j11 = j10 + j12;
            }
        }
        nVar.f50656a.c(j11, this.f13938b | 1, s22.length, 0, null);
    }

    @Override
    public void d(m1 m1Var, v vVar) {
        m1Var.r(((i1) this.d).K0(vVar, m1Var, this.f13938b), this.f13939c);
    }

    @Override
    public Object e(f0 f0Var, v vVar, int i10) {
        int i11;
        long j10;
        List list = (List) this.d;
        int i12 = this.f13938b;
        if (i12 == -1) {
            i11 = f0Var.f16536t.n0();
        } else {
            i11 = i12;
        }
        if (i12 == -1) {
            j10 = f0Var.f16536t.M0();
        } else {
            j10 = this.f13939c;
        }
        return f0Var.q(vVar, list, i11, j10);
    }

    @Override
    public void g(b2 b2Var, int i10) {
        int i11 = this.f13937a;
        Object obj = this.d;
        int i12 = this.f13938b;
        long j10 = this.f13939c;
        switch (i11) {
            case 4:
                EditText editText = (EditText) obj;
                String str = "";
                if (j10 > 0) {
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
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new e6(12), 2);
                } else {
                    long j11 = -j10;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(j11);
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
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    MessagesController.getInstance(i12).updateChatAbout(j11, obj2, chatFull);
                }
                b2Var.dismiss();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                if (j10 != 0) {
                    edit.putInt("color_" + j10, 0);
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
    public void invoke(Object obj) {
        b bVar = (b) obj;
        bVar.f((a) this.d, this.f13938b, this.f13939c);
    }

    @Override
    public void run(String str) {
        tv0.i((tv0) this.d, this.f13939c, this.f13938b, str);
    }

    public d(a aVar, int i10, long j10, long j11) {
        this.f13937a = 0;
        this.d = aVar;
        this.f13938b = i10;
        this.f13939c = j10;
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.f13938b, this.f13939c, tLObject, tL_error, j10);
    }

    public d(Object obj, int i10, long j10, int i11) {
        this.f13937a = i11;
        this.d = obj;
        this.f13938b = i10;
        this.f13939c = j10;
    }

    public d(Object obj, long j10, int i10, int i11) {
        this.f13937a = i11;
        this.d = obj;
        this.f13939c = j10;
        this.f13938b = i10;
    }
}
