package di;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public final class x1 implements Runnable {
    public final int f9702a = 0;
    public final boolean f9703b;
    public final boolean f9704c;
    public final Object d;
    public final Object f9705e;
    public final Object f9706f;
    public final Object h;
    public final Object f9707n;

    public x1(c6 c6Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = c6Var;
        this.f9705e = tLObject;
        this.f9703b = z10;
        this.f9706f = document;
        this.f9704c = z11;
        this.h = tL_error;
        this.f9707n = savestargift;
    }

    @Override
    public final void run() {
        j8 F;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f9702a;
        boolean z10 = this.f9704c;
        Object obj = this.f9705e;
        Object obj2 = this.h;
        Object obj3 = this.f9707n;
        Object obj4 = this.f9706f;
        boolean z11 = this.f9703b;
        Object obj5 = this.d;
        switch (i13) {
            case 0:
                c6 c6Var = (c6) obj5;
                TLObject tLObject = (TLObject) obj;
                TLRPC.Document document = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj3;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    ch.r0 r0Var = null;
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        c6Var.dismiss();
                        long x12 = c6Var.x1();
                        if (!z11) {
                            u8.y(c6Var.f29679a, false).P(x12);
                        }
                        if (x12 >= 0) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(T);
                            if (z10) {
                                i11 = 2131750123;
                            } else {
                                i11 = 2131750121;
                            }
                            String M0 = hd.M0(i11, null);
                            if (z10) {
                                i12 = 2131750124;
                            } else {
                                i12 = 2131750122;
                            }
                            String M02 = hd.M0(i12, null);
                            if (!(T instanceof ProfileActivity)) {
                                r0Var = new ch.r0(x12, T);
                            }
                            a02.s(document, M0, org.telegram.messenger.g0.U2(M02, r0Var)).k(true);
                            return;
                        }
                        org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(T);
                        if (z10) {
                            i7 = 2131750260;
                        } else {
                            i7 = 2131750258;
                        }
                        String M03 = hd.M0(i7, null);
                        if (z10) {
                            i10 = 2131750261;
                        } else {
                            i10 = 2131750259;
                        }
                        a03.s(document, M03, hd.M0(i10, null)).j();
                        return;
                    } else if (tL_error != null) {
                        if (z11 && c6Var.B2 != null && (F = u8.y(c6Var.f29679a, false).F(c6Var.T1, false)) != null) {
                            F.m(c6Var.B2, !savestargift.unsave);
                        }
                        c6Var.k().t(hd.a0(null, null, 2131743878, tL_error.text), null).k(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                an anVar = (an) obj5;
                String str = (String) obj;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                gj gjVar = (gj) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                if (str.startsWith("video?")) {
                    anVar.l8(characterStyle, false, gjVar, q1Var);
                    return;
                } else if (z11 && !z10) {
                    anVar.getParentActivity();
                    vf.c.o(str);
                    return;
                } else {
                    anVar.ma(gjVar, false, false);
                    anVar.Ca(characterStyle, str, false, q1Var, gjVar);
                    return;
                }
            default:
                zh.l lVar = (zh.l) obj5;
                Runnable runnable = (Runnable) obj4;
                String str2 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                lVar.f61461w = false;
                lVar.f61464z = true;
                if (z11) {
                    org.telegram.messenger.g0.r(runnable);
                }
                zh.l.k(lVar.f61456q, false, false);
                if (TextUtils.equals(str2, lVar.f61459t) && tL_error2 == null) {
                    lVar.f61464z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject2, str2, z10, false);
                    return;
                }
                return;
        }
    }

    public x1(an anVar, String str, CharacterStyle characterStyle, gj gjVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        this.d = anVar;
        this.f9705e = str;
        this.f9706f = characterStyle;
        this.h = gjVar;
        this.f9707n = q1Var;
        this.f9703b = z10;
        this.f9704c = z11;
    }

    public x1(zh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = lVar;
        this.f9703b = z10;
        this.f9706f = runnable;
        this.f9707n = str;
        this.h = tL_error;
        this.f9705e = tLObject;
        this.f9704c = z11;
    }
}
