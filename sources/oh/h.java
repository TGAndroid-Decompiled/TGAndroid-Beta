package oh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
import rh.e4;
import rh.e6;
import rh.r1;
import rh.u5;
public final class h implements Runnable {
    public final int f14263a = 0;
    public final Object f14264b;
    public final boolean f14265c;
    public final boolean d;
    public final Object e;
    public final Object f14266f;
    public final Object h;
    public final Object f14267n;

    public h(q qVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = qVar;
        this.f14265c = z10;
        this.f14266f = runnable;
        this.f14264b = str;
        this.h = tL_error;
        this.f14267n = tLObject;
        this.d = z11;
    }

    @Override
    public final void run() {
        u5 F;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f14263a;
        Object obj = this.f14264b;
        Object obj2 = this.h;
        boolean z10 = this.d;
        Object obj3 = this.f14266f;
        boolean z11 = this.f14265c;
        Object obj4 = this.f14267n;
        Object obj5 = this.e;
        switch (i14) {
            case 0:
                q qVar = (q) obj5;
                Runnable runnable = (Runnable) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj4;
                qVar.f14310w = false;
                qVar.f14313z = true;
                if (z11) {
                    i0.r(runnable);
                }
                q.k(qVar.f14305q, false, false);
                if (TextUtils.equals(str, qVar.f14308t) && tL_error == null) {
                    qVar.f14313z = true;
                    qVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str, z10, false);
                    return;
                }
                return;
            case 1:
                un unVar = (un) obj5;
                String str2 = (String) obj;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                jj jjVar = (jj) obj2;
                q1 q1Var = (q1) obj4;
                if (str2.startsWith("video?")) {
                    unVar.c8(characterStyle, false, jjVar, q1Var);
                    return;
                } else if (z11 && !z10) {
                    unVar.getParentActivity();
                    gf.f.m(str2);
                    return;
                } else {
                    unVar.Z9(jjVar, false, false);
                    unVar.pa(characterStyle, str2, false, q1Var, jjVar);
                    return;
                }
            default:
                e4 e4Var = (e4) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.Document document = (TLRPC.Document) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj;
                k2 T = LaunchActivity.T();
                if (T != null) {
                    r1 r1Var = null;
                    if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                        e4Var.dismiss();
                        long x12 = e4Var.x1();
                        if (!z11) {
                            e6.y(e4Var.f21583a, false).P(x12);
                        }
                        if (x12 >= 0) {
                            cc a02 = cc.a0(T);
                            if (z10) {
                                i12 = 2131750132;
                            } else {
                                i12 = 2131750130;
                            }
                            String L0 = cd.L0(i12, null);
                            if (z10) {
                                i13 = 2131750133;
                            } else {
                                i13 = 2131750131;
                            }
                            String L02 = cd.L0(i13, null);
                            if (!(T instanceof ProfileActivity)) {
                                r1Var = new r1(x12, T);
                            }
                            a02.s(document, L0, i0.T2(L02, r1Var)).k(true);
                            return;
                        }
                        cc a03 = cc.a0(T);
                        if (z10) {
                            i10 = 2131750269;
                        } else {
                            i10 = 2131750267;
                        }
                        String L03 = cd.L0(i10, null);
                        if (z10) {
                            i11 = 2131750270;
                        } else {
                            i11 = 2131750268;
                        }
                        a03.s(document, L03, cd.L0(i11, null)).j();
                        return;
                    } else if (tL_error2 != null) {
                        if (z11 && e4Var.f46838x2 != null && (F = e6.y(e4Var.f21583a, false).F(e4Var.P1, false)) != null) {
                            F.m(e4Var.f46838x2, !savestargift.unsave);
                        }
                        e4Var.k().t(cd.a0(null, null, 2131743903, tL_error2.text), null).k(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public h(un unVar, String str, CharacterStyle characterStyle, jj jjVar, q1 q1Var, boolean z10, boolean z11) {
        this.e = unVar;
        this.f14264b = str;
        this.f14266f = characterStyle;
        this.h = jjVar;
        this.f14267n = q1Var;
        this.f14265c = z10;
        this.d = z11;
    }

    public h(e4 e4Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = e4Var;
        this.f14267n = tLObject;
        this.f14265c = z10;
        this.f14266f = document;
        this.d = z11;
        this.h = tL_error;
        this.f14264b = savestargift;
    }
}
