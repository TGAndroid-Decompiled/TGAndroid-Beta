package j2;

import ag.c3;
import android.content.SharedPreferences;
import android.widget.EditText;
import e2.o;
import e2.x;
import java.util.List;
import m4.f0;
import m4.f1;
import m4.h1;
import m4.j1;
import m4.n1;
import m4.w;
import org.telegram.messenger.ci;
import org.telegram.messenger.d20;
import org.telegram.messenger.fs;
import org.telegram.messenger.i0;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.zt0;
import v7.t6;
import z3.n;
public final class d implements o, f1, h1, RequestDelegateTimestamp, u1, fs, e2.j {
    public final int f9343a;
    public final int f9344b;
    public final long f9345c;
    public final Object d;

    public d(long j10, int i10, Object obj, int i11) {
        this.f9343a = i11;
        this.f9345c = j10;
        this.f9344b = i10;
        this.d = obj;
    }

    @Override
    public void a(String str) {
        zt0.d((zt0) this.d, this.f9345c, this.f9344b, str);
    }

    @Override
    public void accept(Object obj) {
        boolean z10;
        n nVar = (n) this.d;
        z3.a aVar = (z3.a) obj;
        nVar.h.getClass();
        byte[] o42 = oa.d.o4(aVar.f54552a, aVar.f54554c);
        x xVar = nVar.f54576c;
        xVar.getClass();
        xVar.L(o42.length, o42);
        nVar.f54574a.d(o42.length, xVar);
        long j10 = aVar.f54553b;
        int i10 = (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1));
        long j11 = this.f9345c;
        if (i10 == 0) {
            if (nVar.h.f2427x == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.p(z10);
        } else {
            long j12 = nVar.h.f2427x;
            if (j12 == Long.MAX_VALUE) {
                j11 += j10;
            } else {
                j11 = j10 + j12;
            }
        }
        nVar.f54574a.c(j11, this.f9344b | 1, o42.length, 0, null);
    }

    @Override
    public Object f(f0 f0Var, w wVar, int i10) {
        int i11;
        long j10;
        List list = (List) this.d;
        int i12 = this.f9344b;
        if (i12 == -1) {
            i11 = f0Var.f12754t.m0();
        } else {
            i11 = i12;
        }
        if (i12 == -1) {
            j10 = f0Var.f12754t.M0();
        } else {
            j10 = this.f9345c;
        }
        return f0Var.q(wVar, list, i11, j10);
    }

    @Override
    public void g(n1 n1Var, w wVar) {
        n1Var.r(((j1) this.d).M0(wVar, n1Var, this.f9344b), this.f9345c);
    }

    @Override
    public void h(x1 x1Var, int i10) {
        int i11 = this.f9343a;
        Object obj = this.d;
        int i12 = this.f9344b;
        long j10 = this.f9345c;
        switch (i11) {
            case 4:
                EditText editText = (EditText) obj;
                String str = "";
                if (j10 > 0) {
                    TLRPC.UserFull a2 = vp.r1(i12).a2(d20.i(i12).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (a2 != null) {
                        String str2 = a2.about;
                        if (str2 != null) {
                            str = str2;
                        }
                        if (str.equals(trim)) {
                            i0.v1(editText);
                            x1Var.dismiss();
                            return;
                        }
                        a2.about = trim;
                        zs.f(i12).k(67, Long.valueOf(j10), a2);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    zs.e().k(292, 2, Long.valueOf(j10));
                    ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new c3(13), 2);
                } else {
                    long j11 = -j10;
                    TLRPC.ChatFull M0 = vp.r1(i12).M0(j11);
                    String obj2 = editText.getText().toString();
                    if (M0 != null) {
                        String str3 = M0.about;
                        if (str3 != null) {
                            str = str3;
                        }
                        if (str.equals(obj2)) {
                            i0.v1(editText);
                            x1Var.dismiss();
                            return;
                        }
                        M0.about = obj2;
                        zs f7 = zs.f(i12);
                        Boolean bool = Boolean.FALSE;
                        f7.k(30, M0, 0, bool, bool);
                    }
                    zs.e().k(292, 2, Long.valueOf(j10));
                    vp r12 = vp.r1(i12);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = r12.i1(-j11);
                    tL_messages_editChatAbout.about = obj2;
                    r12.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new ci(r12, M0, obj2, 7), 64);
                }
                x1Var.dismiss();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = vp.r1(d20.f15147s0).e7.edit();
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
        bVar.t((a) this.d, this.f9344b, this.f9345c);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.f9344b, this.f9345c, tLObject, tL_error, j10);
    }

    public d(a aVar, int i10, long j10, long j11) {
        this.f9343a = 0;
        this.d = aVar;
        this.f9344b = i10;
        this.f9345c = j10;
    }

    public d(Object obj, int i10, long j10, int i11) {
        this.f9343a = i11;
        this.d = obj;
        this.f9344b = i10;
        this.f9345c = j10;
    }

    public d(Object obj, long j10, int i10, int i11) {
        this.f9343a = i11;
        this.d = obj;
        this.f9345c = j10;
        this.f9344b = i10;
    }
}
