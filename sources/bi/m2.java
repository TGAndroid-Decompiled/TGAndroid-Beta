package bi;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
public final class m2 implements Runnable {
    public final int f4306a = 0;
    public final boolean f4307b;
    public final boolean f4308c;
    public final Object d;
    public final Object f4309e;
    public final Object f4310f;
    public final Object h;
    public final Object f4311n;

    public m2(k7 k7Var, TLObject tLObject, boolean z9, TLRPC.Document document, boolean z10, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.f4309e = tLObject;
        this.f4307b = z9;
        this.f4310f = document;
        this.f4308c = z10;
        this.h = tL_error;
        this.f4311n = savestargift;
    }

    @Override
    public final void run() {
        t9 F;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f4306a;
        boolean z9 = this.f4308c;
        Object obj = this.f4309e;
        Object obj2 = this.h;
        Object obj3 = this.f4311n;
        Object obj4 = this.f4310f;
        boolean z10 = this.f4307b;
        Object obj5 = this.d;
        switch (i13) {
            case 0:
                k7 k7Var = (k7) obj5;
                TLObject tLObject = (TLObject) obj;
                TLRPC.Document document = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj3;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    k3 k3Var = null;
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        k7Var.dismiss();
                        long w12 = k7Var.w1();
                        if (!z10) {
                            ea.y(k7Var.f28669a, false).P(w12);
                        }
                        if (w12 >= 0) {
                            org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(T);
                            if (z9) {
                                i11 = 2131750123;
                            } else {
                                i11 = 2131750121;
                            }
                            String M0 = org.telegram.messenger.id.M0(i11, null);
                            if (z9) {
                                i12 = 2131750124;
                            } else {
                                i12 = 2131750122;
                            }
                            String M02 = org.telegram.messenger.id.M0(i12, null);
                            if (!(T instanceof ProfileActivity)) {
                                k3Var = new k3(w12, T);
                            }
                            a02.s(document, M0, org.telegram.messenger.g0.U2(M02, k3Var)).k(true);
                            return;
                        }
                        org.telegram.ui.Components.gc a03 = org.telegram.ui.Components.gc.a0(T);
                        if (z9) {
                            i7 = 2131750260;
                        } else {
                            i7 = 2131750258;
                        }
                        String M03 = org.telegram.messenger.id.M0(i7, null);
                        if (z9) {
                            i10 = 2131750261;
                        } else {
                            i10 = 2131750259;
                        }
                        a03.s(document, M03, org.telegram.messenger.id.M0(i10, null)).j();
                        return;
                    } else if (tL_error != null) {
                        if (z10 && k7Var.A2 != null && (F = ea.y(k7Var.f28669a, false).F(k7Var.S1, false)) != null) {
                            F.m(k7Var.A2, !savestargift.unsave);
                        }
                        k7Var.k().t(org.telegram.messenger.id.a0(null, null, 2131743878, tL_error.text), null).k(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                cn cnVar = (cn) obj5;
                String str = (String) obj;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                ij ijVar = (ij) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                if (str.startsWith("video?")) {
                    cnVar.k8(characterStyle, false, ijVar, q1Var);
                    return;
                } else if (z10 && !z9) {
                    cnVar.getParentActivity();
                    vf.c.o(str);
                    return;
                } else {
                    cnVar.la(ijVar, false, false);
                    cnVar.Ba(characterStyle, str, false, q1Var, ijVar);
                    return;
                }
            default:
                yh.m mVar = (yh.m) obj5;
                Runnable runnable = (Runnable) obj4;
                String str2 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                mVar.f59569w = false;
                mVar.f59572z = true;
                if (z10) {
                    org.telegram.messenger.g0.r(runnable);
                }
                yh.m.k(mVar.f59564q, false, false);
                if (TextUtils.equals(str2, mVar.f59567t) && tL_error2 == null) {
                    mVar.f59572z = true;
                    mVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject2, str2, z9, false);
                    return;
                }
                return;
        }
    }

    public m2(cn cnVar, String str, CharacterStyle characterStyle, ij ijVar, org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
        this.d = cnVar;
        this.f4309e = str;
        this.f4310f = characterStyle;
        this.h = ijVar;
        this.f4311n = q1Var;
        this.f4307b = z9;
        this.f4308c = z10;
    }

    public m2(yh.m mVar, boolean z9, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.d = mVar;
        this.f4307b = z9;
        this.f4310f = runnable;
        this.f4311n = str;
        this.h = tL_error;
        this.f4309e = tLObject;
        this.f4308c = z10;
    }
}
