package j2;

import a8.yb;
import android.content.SharedPreferences;
import android.widget.EditText;
import di.d6;
import e2.o;
import e2.x;
import java.util.List;
import m4.f0;
import m4.f1;
import m4.h1;
import m4.j1;
import m4.n1;
import m4.w;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.bw0;
import z3.n;
public final class c implements o, f1, h1, RequestDelegateTimestamp, b2, MessagesStorage.StringCallback, e2.j {
    public final int f15192a;
    public final int f15193b;
    public final long f15194c;
    public final Object d;

    public c(long j10, int i10, Object obj, int i11) {
        this.f15192a = i11;
        this.f15194c = j10;
        this.f15193b = i10;
        this.d = obj;
    }

    @Override
    public void accept(Object obj) {
        boolean z10;
        n nVar = (n) this.d;
        z3.a aVar = (z3.a) obj;
        nVar.h.getClass();
        byte[] f7 = pa.d.f(aVar.f52700a, aVar.f52702c);
        x xVar = nVar.f52724c;
        xVar.getClass();
        xVar.L(f7.length, f7);
        nVar.f52722a.d(f7.length, xVar);
        long j10 = aVar.f52701b;
        int i10 = (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1));
        long j11 = this.f15194c;
        if (i10 == 0) {
            if (nVar.h.f3590x == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
        } else {
            long j12 = nVar.h.f3590x;
            if (j12 == Long.MAX_VALUE) {
                j11 += j10;
            } else {
                j11 = j10 + j12;
            }
        }
        nVar.f52722a.c(j11, this.f15193b | 1, f7.length, 0, null);
    }

    @Override
    public Object c(f0 f0Var, w wVar, int i10) {
        int i11;
        long j10;
        List list = (List) this.d;
        int i12 = this.f15193b;
        if (i12 == -1) {
            i11 = f0Var.f18056t.n0();
        } else {
            i11 = i12;
        }
        if (i12 == -1) {
            j10 = f0Var.f18056t.M0();
        } else {
            j10 = this.f15194c;
        }
        return f0Var.q(wVar, list, i11, j10);
    }

    @Override
    public void e(n1 n1Var, w wVar) {
        n1Var.r(((j1) this.d).K0(wVar, n1Var, this.f15193b), this.f15194c);
    }

    @Override
    public void h(e2 e2Var, int i10) {
        int i11 = this.f15192a;
        Object obj = this.d;
        int i12 = this.f15193b;
        long j10 = this.f15194c;
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
                            e2Var.dismiss();
                            return;
                        }
                        userFull.about = trim;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 2, Long.valueOf(j10));
                    ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new d6(12), 2);
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
                            e2Var.dismiss();
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
                e2Var.dismiss();
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
        bVar.f((a) this.d, this.f15193b, this.f15194c);
    }

    @Override
    public void run(String str) {
        bw0.j((bw0) this.d, this.f15194c, this.f15193b, str);
    }

    public c(a aVar, int i10, long j10, long j11) {
        this.f15192a = 0;
        this.d = aVar;
        this.f15193b = i10;
        this.f15194c = j10;
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.f15193b, this.f15194c, tLObject, tL_error, j10);
    }

    public c(Object obj, int i10, long j10, int i11) {
        this.f15192a = i11;
        this.d = obj;
        this.f15193b = i10;
        this.f15194c = j10;
    }

    public c(Object obj, long j10, int i10, int i11) {
        this.f15192a = i11;
        this.d = obj;
        this.f15194c = j10;
        this.f15193b = i10;
    }
}
