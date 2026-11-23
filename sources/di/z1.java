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
import org.telegram.ui.bn;
public final class z1 implements Runnable {
    public final int f10089a = 0;
    public final boolean f10090b;
    public final boolean f10091c;
    public final Object d;
    public final Object f10092e;
    public final Object f10093f;
    public final Object h;
    public final Object f10094n;

    public z1(f6 f6Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = f6Var;
        this.f10092e = tLObject;
        this.f10090b = z10;
        this.f10093f = document;
        this.f10091c = z11;
        this.h = tL_error;
        this.f10094n = savestargift;
    }

    @Override
    public final void run() {
        n8 F;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f10089a;
        boolean z10 = this.f10091c;
        Object obj = this.f10092e;
        Object obj2 = this.h;
        Object obj3 = this.f10094n;
        Object obj4 = this.f10093f;
        boolean z11 = this.f10090b;
        Object obj5 = this.d;
        switch (i13) {
            case 0:
                f6 f6Var = (f6) obj5;
                TLObject tLObject = (TLObject) obj;
                TLRPC.Document document = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj3;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    ch.r0 r0Var = null;
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        f6Var.dismiss();
                        long C1 = f6Var.C1();
                        if (!z11) {
                            y8.y(f6Var.f30139a, false).O(C1);
                        }
                        if (C1 >= 0) {
                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(T);
                            if (z10) {
                                i11 = 2131750106;
                            } else {
                                i11 = 2131750104;
                            }
                            String N0 = hd.N0(i11, null);
                            if (z10) {
                                i12 = 2131750107;
                            } else {
                                i12 = 2131750105;
                            }
                            String N02 = hd.N0(i12, null);
                            if (!(T instanceof ProfileActivity)) {
                                r0Var = new ch.r0(C1, T);
                            }
                            b02.s(document, N0, org.telegram.messenger.g0.T2(N02, r0Var)).k(true);
                            return;
                        }
                        org.telegram.ui.Components.lc b03 = org.telegram.ui.Components.lc.b0(T);
                        if (z10) {
                            i7 = 2131750243;
                        } else {
                            i7 = 2131750241;
                        }
                        String N03 = hd.N0(i7, null);
                        if (z10) {
                            i10 = 2131750244;
                        } else {
                            i10 = 2131750242;
                        }
                        b03.s(document, N03, hd.N0(i10, null)).j();
                        return;
                    } else if (tL_error != null) {
                        if (z11 && f6Var.B2 != null && (F = y8.y(f6Var.f30139a, false).F(f6Var.T1, false)) != null) {
                            F.m(f6Var.B2, true ^ savestargift.unsave);
                        }
                        f6Var.k().t(org.telegram.ui.Components.lc.W(tL_error.text), null).k(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                bn bnVar = (bn) obj5;
                String str = (String) obj;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                gj gjVar = (gj) obj2;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj3;
                if (str.startsWith("video?")) {
                    bnVar.l8(characterStyle, false, gjVar, r1Var);
                    return;
                } else if (z11 && !z10) {
                    bnVar.getParentActivity();
                    vf.c.o(str);
                    return;
                } else {
                    bnVar.ma(gjVar, false, false);
                    bnVar.Ca(characterStyle, str, false, r1Var, gjVar);
                    return;
                }
            default:
                zh.l lVar = (zh.l) obj5;
                Runnable runnable = (Runnable) obj4;
                String str2 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                lVar.f62038w = false;
                lVar.f62041z = true;
                if (z11) {
                    org.telegram.messenger.g0.r(runnable);
                }
                zh.l.k(lVar.f62033q, false, false);
                if (TextUtils.equals(str2, lVar.f62036t) && tL_error2 == null) {
                    lVar.f62041z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject2, str2, z10, false);
                    return;
                }
                return;
        }
    }

    public z1(bn bnVar, String str, CharacterStyle characterStyle, gj gjVar, org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
        this.d = bnVar;
        this.f10092e = str;
        this.f10093f = characterStyle;
        this.h = gjVar;
        this.f10094n = r1Var;
        this.f10090b = z10;
        this.f10091c = z11;
    }

    public z1(zh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = lVar;
        this.f10090b = z10;
        this.f10093f = runnable;
        this.f10094n = str;
        this.h = tL_error;
        this.f10092e = tLObject;
        this.f10091c = z11;
    }
}
