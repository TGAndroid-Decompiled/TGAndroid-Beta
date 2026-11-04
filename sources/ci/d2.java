package ci;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wm;
public final class d2 implements Runnable {
    public final int f4948a = 0;
    public final boolean f4949b;
    public final boolean f4950c;
    public final Object d;
    public final Object f4951e;
    public final Object f4952f;
    public final Object h;
    public final Object f4953n;

    public d2(l6 l6Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = l6Var;
        this.f4951e = tLObject;
        this.f4949b = z10;
        this.f4952f = document;
        this.f4950c = z11;
        this.h = tL_error;
        this.f4953n = savestargift;
    }

    @Override
    public final void run() {
        s8 F;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = this.f4948a;
        boolean z10 = this.f4950c;
        Object obj = this.f4951e;
        Object obj2 = this.h;
        Object obj3 = this.f4953n;
        Object obj4 = this.f4952f;
        boolean z11 = this.f4949b;
        Object obj5 = this.d;
        switch (i13) {
            case 0:
                l6 l6Var = (l6) obj5;
                TLObject tLObject = (TLObject) obj;
                TLRPC.Document document = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj3;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    x2 x2Var = null;
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        l6Var.dismiss();
                        long x12 = l6Var.x1();
                        if (!z11) {
                            e9.y(l6Var.f28583a, false).P(x12);
                        }
                        if (x12 >= 0) {
                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(T);
                            if (z10) {
                                i11 = 2131750131;
                            } else {
                                i11 = 2131750129;
                            }
                            String M0 = bd.M0(i11, null);
                            if (z10) {
                                i12 = 2131750132;
                            } else {
                                i12 = 2131750130;
                            }
                            String M02 = bd.M0(i12, null);
                            if (!(T instanceof ProfileActivity)) {
                                x2Var = new x2(x12, T);
                            }
                            a02.s(document, M0, org.telegram.messenger.g0.U2(M02, x2Var)).k(true);
                            return;
                        }
                        org.telegram.ui.Components.fc a03 = org.telegram.ui.Components.fc.a0(T);
                        if (z10) {
                            i3 = 2131750268;
                        } else {
                            i3 = 2131750266;
                        }
                        String M03 = bd.M0(i3, null);
                        if (z10) {
                            i10 = 2131750269;
                        } else {
                            i10 = 2131750267;
                        }
                        a03.s(document, M03, bd.M0(i10, null)).j();
                        return;
                    } else if (tL_error != null) {
                        if (z11 && l6Var.f5487y2 != null && (F = e9.y(l6Var.f28583a, false).F(l6Var.Q1, false)) != null) {
                            F.m(l6Var.f5487y2, !savestargift.unsave);
                        }
                        l6Var.k().t(bd.a0(null, null, 2131743888, tL_error.text), null).k(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                wm wmVar = (wm) obj5;
                String str = (String) obj;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                zi ziVar = (zi) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                if (str.startsWith("video?")) {
                    wmVar.j8(characterStyle, false, ziVar, q1Var);
                    return;
                } else if (z11 && !z10) {
                    wmVar.getParentActivity();
                    sf.c.o(str);
                    return;
                } else {
                    wmVar.ja(ziVar, false, false);
                    wmVar.za(characterStyle, str, false, q1Var, ziVar);
                    return;
                }
            default:
                zh.k kVar = (zh.k) obj5;
                Runnable runnable = (Runnable) obj4;
                String str2 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                kVar.f60599w = false;
                kVar.f60602z = true;
                if (z11) {
                    org.telegram.messenger.g0.r(runnable);
                }
                zh.k.k(kVar.f60594q, false, false);
                if (TextUtils.equals(str2, kVar.f60597t) && tL_error2 == null) {
                    kVar.f60602z = true;
                    kVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject2, str2, z10, false);
                    return;
                }
                return;
        }
    }

    public d2(wm wmVar, String str, CharacterStyle characterStyle, zi ziVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        this.d = wmVar;
        this.f4951e = str;
        this.f4952f = characterStyle;
        this.h = ziVar;
        this.f4953n = q1Var;
        this.f4949b = z10;
        this.f4950c = z11;
    }

    public d2(zh.k kVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = kVar;
        this.f4949b = z10;
        this.f4952f = runnable;
        this.f4953n = str;
        this.h = tL_error;
        this.f4951e = tLObject;
        this.f4950c = z11;
    }
}
