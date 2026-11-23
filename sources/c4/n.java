package c4;

import a8.la;
import android.content.SharedPreferences;
import android.widget.EditText;
import fi.l5;
import h2.x;
import java.util.List;
import org.telegram.messenger.di;
import org.telegram.messenger.g0;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.sr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.jt0;
import p4.a1;
import p4.c1;
import p4.e0;
import p4.e1;
import p4.i1;
import p4.v;
import w7.s;
public final class n implements h2.j, h2.o, RequestDelegateTimestamp, q1, sr, a1, c1 {
    public final int f4428a;
    public final int f4429b;
    public final long f4430c;
    public final Object d;

    public n(long j3, int i7, Object obj, int i10) {
        this.f4428a = i10;
        this.f4430c = j3;
        this.f4429b = i7;
        this.d = obj;
    }

    @Override
    public void a(String str) {
        jt0.f((jt0) this.d, this.f4430c, this.f4429b, str);
    }

    @Override
    public void accept(Object obj) {
        boolean z10;
        o oVar = (o) this.d;
        a aVar = (a) obj;
        oVar.h.getClass();
        byte[] a02 = s.a0(aVar.f4404a, aVar.f4406c);
        x xVar = oVar.f4433c;
        xVar.getClass();
        xVar.L(a02.length, a02);
        oVar.f4431a.b(a02.length, xVar);
        long j3 = aVar.f4405b;
        int i7 = (j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1));
        long j10 = this.f4430c;
        if (i7 == 0) {
            if (oVar.h.f10802x == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        } else {
            long j11 = oVar.h.f10802x;
            if (j11 == Long.MAX_VALUE) {
                j10 += j3;
            } else {
                j10 = j3 + j11;
            }
        }
        oVar.f4431a.c(j10, this.f4429b | 1, a02.length, 0, null);
    }

    @Override
    public void c(i1 i1Var, v vVar) {
        i1Var.s(((e1) this.d).m1(vVar, i1Var, this.f4429b), this.f4430c);
    }

    @Override
    public void h(t1 t1Var, int i7) {
        int i10 = this.f4428a;
        Object obj = this.d;
        int i11 = this.f4429b;
        long j3 = this.f4430c;
        switch (i10) {
            case 3:
                EditText editText = (EditText) obj;
                String str = "";
                if (j3 > 0) {
                    TLRPC.UserFull d2 = np.u1(i11).d2(k10.i(i11).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (d2 != null) {
                        String str2 = d2.about;
                        if (str2 != null) {
                            str = str2;
                        }
                        if (str.equals(trim)) {
                            g0.v1(editText);
                            t1Var.dismiss();
                            return;
                        }
                        d2.about = trim;
                        ls.f(i11).k(67, Long.valueOf(j3), d2);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    ls.e().k(295, 2, Long.valueOf(j3));
                    ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new l5(18), 2);
                } else {
                    long j10 = -j3;
                    TLRPC.ChatFull P0 = np.u1(i11).P0(j10);
                    String obj2 = editText.getText().toString();
                    if (P0 != null) {
                        String str3 = P0.about;
                        if (str3 != null) {
                            str = str3;
                        }
                        if (str.equals(obj2)) {
                            g0.v1(editText);
                            t1Var.dismiss();
                            return;
                        }
                        P0.about = obj2;
                        ls f10 = ls.f(i11);
                        Boolean bool = Boolean.FALSE;
                        f10.k(30, P0, 0, bool, bool);
                    }
                    ls.e().k(295, 2, Long.valueOf(j3));
                    np u12 = np.u1(i11);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = u12.l1(-j10);
                    tL_messages_editChatAbout.about = obj2;
                    u12.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new di(u12, P0, obj2, 7), 64);
                }
                t1Var.dismiss();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = np.u1(k10.f24968t0).f25857g7.edit();
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
        bVar.c((m2.a) this.d, this.f4429b, this.f4430c);
    }

    @Override
    public Object k(e0 e0Var, v vVar, int i7) {
        int i10;
        long j3;
        List list = (List) this.d;
        int i11 = this.f4429b;
        if (i11 == -1) {
            i10 = e0Var.f55249t.o0();
        } else {
            i10 = i11;
        }
        if (i11 == -1) {
            j3 = e0Var.f55249t.l();
        } else {
            j3 = this.f4430c;
        }
        return e0Var.q(vVar, list, i10, j3);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.f4429b, this.f4430c, tLObject, tL_error, j3);
    }

    public n(Object obj, int i7, long j3, int i10) {
        this.f4428a = i10;
        this.d = obj;
        this.f4429b = i7;
        this.f4430c = j3;
    }

    public n(Object obj, long j3, int i7, int i10) {
        this.f4428a = i10;
        this.d = obj;
        this.f4430c = j3;
        this.f4429b = i7;
    }

    public n(m2.a aVar, int i7, long j3, long j10) {
        this.f4428a = 1;
        this.d = aVar;
        this.f4429b = i7;
        this.f4430c = j3;
    }
}
