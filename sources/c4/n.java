package c4;

import a8.ja;
import android.content.SharedPreferences;
import android.widget.EditText;
import fi.m5;
import h2.x;
import java.util.List;
import org.telegram.messenger.bi;
import org.telegram.messenger.g0;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.ys0;
import p4.a1;
import p4.c1;
import p4.d0;
import p4.g1;
import p4.v;
import p4.y0;
import w7.s;
public final class n implements h2.j, h2.o, RequestDelegateTimestamp, q1, tr, y0, a1 {
    public final int f4118a;
    public final int f4119b;
    public final long f4120c;
    public final Object d;

    public n(long j3, int i7, Object obj, int i10) {
        this.f4118a = i10;
        this.f4120c = j3;
        this.f4119b = i7;
        this.d = obj;
    }

    @Override
    public void a(String str) {
        ys0.f((ys0) this.d, this.f4120c, this.f4119b, str);
    }

    @Override
    public void accept(Object obj) {
        boolean z10;
        o oVar = (o) this.d;
        a aVar = (a) obj;
        oVar.h.getClass();
        byte[] k02 = s.k0(aVar.f4094a, aVar.f4096c);
        x xVar = oVar.f4123c;
        xVar.getClass();
        xVar.L(k02.length, k02);
        oVar.f4121a.b(k02.length, xVar);
        long j3 = aVar.f4095b;
        int i7 = (j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1));
        long j10 = this.f4120c;
        if (i7 == 0) {
            if (oVar.h.f10455x == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.p(z10);
        } else {
            long j11 = oVar.h.f10455x;
            if (j11 == Long.MAX_VALUE) {
                j10 += j3;
            } else {
                j10 = j3 + j11;
            }
        }
        oVar.f4121a.c(j10, this.f4119b | 1, k02.length, 0, null);
    }

    @Override
    public void c(g1 g1Var, v vVar) {
        g1Var.s(((c1) this.d).m1(vVar, g1Var, this.f4119b), this.f4120c);
    }

    @Override
    public void h(t1 t1Var, int i7) {
        int i10 = this.f4118a;
        Object obj = this.d;
        int i11 = this.f4119b;
        long j3 = this.f4120c;
        switch (i10) {
            case 3:
                EditText editText = (EditText) obj;
                String str = "";
                if (j3 > 0) {
                    TLRPC.UserFull b22 = np.s1(i11).b2(m10.i(i11).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (b22 != null) {
                        String str2 = b22.about;
                        if (str2 != null) {
                            str = str2;
                        }
                        if (str.equals(trim)) {
                            g0.v1(editText);
                            t1Var.dismiss();
                            return;
                        }
                        b22.about = trim;
                        ns.f(i11).k(67, Long.valueOf(j3), b22);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    ns.e().k(292, 2, Long.valueOf(j3));
                    ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new m5(18), 2);
                } else {
                    long j10 = -j3;
                    TLRPC.ChatFull N0 = np.s1(i11).N0(j10);
                    String obj2 = editText.getText().toString();
                    if (N0 != null) {
                        String str3 = N0.about;
                        if (str3 != null) {
                            str = str3;
                        }
                        if (str.equals(obj2)) {
                            g0.v1(editText);
                            t1Var.dismiss();
                            return;
                        }
                        N0.about = obj2;
                        ns f10 = ns.f(i11);
                        Boolean bool = Boolean.FALSE;
                        f10.k(30, N0, 0, bool, bool);
                    }
                    ns.e().k(292, 2, Long.valueOf(j3));
                    np s12 = np.s1(i11);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = s12.j1(-j10);
                    tL_messages_editChatAbout.about = obj2;
                    s12.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new bi(s12, N0, obj2, 7), 64);
                }
                t1Var.dismiss();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = np.s1(m10.f24940t0).f25273e7.edit();
                if (j3 != 0) {
                    edit.putInt("color_" + j3, 0);
                } else if (i11 == 1) {
                    edit.putInt("MessagesLed", 0);
                } else if (i11 == 0) {
                    edit.putInt("GroupLed", 0);
                } else if (i11 == 3) {
                    edit.putInt("StoriesLed", 0);
                } else if (i11 != 5 && i11 != 4) {
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
        m2.b bVar = (m2.b) obj;
        bVar.p((m2.a) this.d, this.f4119b, this.f4120c);
    }

    @Override
    public Object k(d0 d0Var, v vVar, int i7) {
        int i10;
        long j3;
        List list = (List) this.d;
        int i11 = this.f4119b;
        if (i11 == -1) {
            i10 = d0Var.f54635t.o0();
        } else {
            i10 = i11;
        }
        if (i11 == -1) {
            j3 = d0Var.f54635t.l();
        } else {
            j3 = this.f4120c;
        }
        return d0Var.q(vVar, list, i10, j3);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.f4119b, this.f4120c, tLObject, tL_error, j3);
    }

    public n(Object obj, int i7, long j3, int i10) {
        this.f4118a = i10;
        this.d = obj;
        this.f4119b = i7;
        this.f4120c = j3;
    }

    public n(Object obj, long j3, int i7, int i10) {
        this.f4118a = i10;
        this.d = obj;
        this.f4120c = j3;
        this.f4119b = i7;
    }

    public n(m2.a aVar, int i7, long j3, long j10) {
        this.f4118a = 1;
        this.d = aVar;
        this.f4119b = i7;
        this.f4120c = j3;
    }
}
