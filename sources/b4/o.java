package b4;

import android.content.SharedPreferences;
import android.widget.EditText;
import b8.zb;
import ei.u5;
import g2.y;
import java.util.List;
import o4.d1;
import o4.e0;
import o4.f1;
import o4.h1;
import o4.l1;
import o4.v;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.or;
import org.telegram.messenger.uh;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.ws0;
public final class o implements g2.k, g2.p, d1, f1, RequestDelegateTimestamp, p1, or {
    public final int f2380a;
    public final int f2381b;
    public final long f2382c;
    public final Object d;

    public o(long j10, int i3, Object obj, int i10) {
        this.f2380a = i10;
        this.f2382c = j10;
        this.f2381b = i3;
        this.d = obj;
    }

    @Override
    public void a(String str) {
        ws0.f((ws0) this.d, this.f2382c, this.f2381b, str);
    }

    @Override
    public void accept(Object obj) {
        boolean z10;
        p pVar = (p) this.d;
        a aVar = (a) obj;
        pVar.h.getClass();
        byte[] q42 = kb.a.q4(aVar.f2352a, aVar.f2354c);
        y yVar = pVar.f2385c;
        yVar.getClass();
        yVar.L(q42.length, q42);
        pVar.f2383a.e(q42.length, yVar);
        long j10 = aVar.f2353b;
        int i3 = (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1));
        long j11 = this.f2382c;
        if (i3 == 0) {
            if (pVar.h.f8493x == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
        } else {
            long j12 = pVar.h.f8493x;
            if (j12 == Long.MAX_VALUE) {
                j11 += j10;
            } else {
                j11 = j10 + j12;
            }
        }
        pVar.f2383a.d(j11, this.f2381b | 1, q42.length, 0, null);
    }

    @Override
    public void b(l1 l1Var, v vVar) {
        l1Var.r(((h1) this.d).M0(vVar, l1Var, this.f2381b), this.f2382c);
    }

    @Override
    public void g(s1 s1Var, int i3) {
        int i10 = this.f2380a;
        Object obj = this.d;
        int i11 = this.f2381b;
        long j10 = this.f2382c;
        switch (i10) {
            case 5:
                EditText editText = (EditText) obj;
                String str = "";
                if (j10 > 0) {
                    TLRPC.UserFull b22 = hp.s1(i11).b2(h10.i(i11).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (b22 != null) {
                        String str2 = b22.about;
                        if (str2 != null) {
                            str = str2;
                        }
                        if (str.equals(trim)) {
                            g0.v1(editText);
                            s1Var.dismiss();
                            return;
                        }
                        b22.about = trim;
                        hs.f(i11).k(67, Long.valueOf(j10), b22);
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    hs.e().k(292, 2, Long.valueOf(j10));
                    ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new u5(18), 2);
                } else {
                    long j11 = -j10;
                    TLRPC.ChatFull N0 = hp.s1(i11).N0(j11);
                    String obj2 = editText.getText().toString();
                    if (N0 != null) {
                        String str3 = N0.about;
                        if (str3 != null) {
                            str = str3;
                        }
                        if (str.equals(obj2)) {
                            g0.v1(editText);
                            s1Var.dismiss();
                            return;
                        }
                        N0.about = obj2;
                        hs f10 = hs.f(i11);
                        Boolean bool = Boolean.FALSE;
                        f10.k(30, N0, 0, bool, bool);
                    }
                    hs.e().k(292, 2, Long.valueOf(j10));
                    hp s12 = hp.s1(i11);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = s12.j1(-j11);
                    tL_messages_editChatAbout.about = obj2;
                    s12.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new uh(s12, N0, obj2, 7), 64);
                }
                s1Var.dismiss();
                return;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = hp.s1(h10.f22829t0).f22989d7.edit();
                if (j10 != 0) {
                    edit.putInt("color_" + j10, 0);
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
    public Object i(e0 e0Var, v vVar, int i3) {
        int i10;
        long j10;
        List list = (List) this.d;
        int i11 = this.f2381b;
        if (i11 == -1) {
            i10 = e0Var.f20636t.l0();
        } else {
            i10 = i11;
        }
        if (i11 == -1) {
            j10 = e0Var.f20636t.N0();
        } else {
            j10 = this.f2382c;
        }
        return e0Var.q(vVar, list, i10, j10);
    }

    @Override
    public void invoke(Object obj) {
        l2.b bVar = (l2.b) obj;
        bVar.z((l2.a) this.d, this.f2381b, this.f2382c);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.f2381b, this.f2382c, tLObject, tL_error, j10);
    }

    public o(Object obj, int i3, long j10, int i10) {
        this.f2380a = i10;
        this.d = obj;
        this.f2381b = i3;
        this.f2382c = j10;
    }

    public o(Object obj, long j10, int i3, int i10) {
        this.f2380a = i10;
        this.d = obj;
        this.f2382c = j10;
        this.f2381b = i3;
    }

    public o(l2.a aVar, int i3, long j10, long j11) {
        this.f2380a = 1;
        this.d = aVar;
        this.f2381b = i3;
        this.f2382c = j10;
    }
}
