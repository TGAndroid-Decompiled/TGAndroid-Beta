package hi;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.ef;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.ProfileActivity;
public final class ea implements p10 {
    public final int f14406a;
    public final boolean f14407b;
    public final fs f14408c;

    public ea(fs fsVar, boolean z10, int i7) {
        this.f14406a = i7;
        this.f14408c = fsVar;
        this.f14407b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        float f10;
        xt0 xt0Var;
        TLRPC.PhotoSize w10;
        int i7 = this.f14406a;
        int i10 = 0;
        boolean z11 = this.f14407b;
        fs fsVar = this.f14408c;
        switch (i7) {
            case 0:
                nb nbVar = (nb) fsVar;
                Bitmap bitmap = (Bitmap) obj2;
                int i11 = nbVar.f15062c;
                if (obj != null && nbVar.f15106q2 == null && !nbVar.X && nbVar.I()) {
                    if (z11) {
                        if (nbVar.L1 != null) {
                            nbVar.t();
                            nbVar.L1.f15754j = true;
                            if (obj instanceof ef) {
                                pa paVar = nbVar.f15126w1;
                                paVar.c0(paVar.j0(((ef) obj).I, false));
                            } else if (obj instanceof TLObject) {
                                pa paVar2 = nbVar.f15126w1;
                                TLObject tLObject = (TLObject) obj;
                                paVar2.Z1 = true;
                                q5 q5Var = paVar2.B0;
                                if ((tLObject instanceof TLRPC.Photo) && (w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) != null) {
                                    f10 = w10.f28517w / w10.h;
                                } else {
                                    f10 = 1.0f;
                                }
                                if (f10 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(paVar2.B1, q5Var.getMeasuredWidth()) * 0.5d);
                                    xt0Var = new xt0(floor, floor / f10);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(paVar2.C1, q5Var.getMeasuredHeight()) * 0.5d);
                                    xt0Var = new xt0(f10 * floor2, floor2);
                                }
                                tg.s1 s1Var = new tg.s1(paVar2.getContext(), paVar2.d0(), xt0Var, tLObject);
                                s1Var.setDelegate(paVar2);
                                q5Var.addView(s1Var);
                                paVar2.e0();
                                paVar2.c0(s1Var);
                            }
                            nbVar.e(false);
                        } else {
                            return;
                        }
                    } else {
                        nbVar.h0(false, true);
                        nbVar.R0.a(nbVar.P1);
                        n6 n6Var = nbVar.P0;
                        if (nbVar.P1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        n6Var.f15032o0 = -1.0f;
                        n6Var.f15033p0 = z10;
                        n6Var.invalidate();
                        nbVar.e(false);
                        boolean z12 = obj instanceof ef;
                        if (z12) {
                            ef efVar = (ef) obj;
                            if (efVar.f27963b && !efVar.d()) {
                                i10 = 1;
                            }
                            nbVar.P1 = i10;
                            x7 l10 = x7.l(efVar);
                            l10.M0 = bitmap;
                            l10.J0 = nbVar.f15125w0;
                            l10.K0 = nbVar.f15129x0;
                            l10.A();
                            nbVar.M1 = true;
                            if (nbVar.B0.j()) {
                                nbVar.H1 = null;
                                l10.P = 1.0f;
                                if (nbVar.B0.l(l10)) {
                                    nbVar.L1 = x7.a(nbVar.B0.getLayout(), nbVar.B0.getContent());
                                }
                                nbVar.l0(true);
                            } else {
                                l10.B();
                                nbVar.L1 = l10;
                                if (z12) {
                                    l9.a(i11, l10);
                                }
                                nbVar.J(1, true);
                            }
                        } else if (obj instanceof x7) {
                            x7 x7Var = (x7) obj;
                            if (x7Var.L == null && !x7Var.v()) {
                                nbVar.f15074f1.c("Failed to load draft");
                                mp.u1(i11).R1().f12406w.b(x7Var);
                                return;
                            }
                            x7Var.J0 = nbVar.f15125w0;
                            x7Var.K0 = nbVar.f15129x0;
                            nbVar.P1 = x7Var.K ? 1 : 0;
                            x7Var.M0 = bitmap;
                            nbVar.M1 = false;
                            nbVar.B0.n(x7Var);
                            nbVar.L1 = x7Var;
                            if (z12) {
                                l9.a(i11, x7Var);
                            }
                            nbVar.J(1, true);
                        } else {
                            return;
                        }
                    }
                    p3 p3Var = nbVar.N0;
                    if (p3Var != null) {
                        nbVar.f15094m2 = p3Var.f14894e.e0();
                        nbVar.f15097n2 = nbVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                li.c0 c0Var = (li.c0) fsVar;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        li.k0.f(new org.telegram.ui.Components.kc((FrameLayout) c0Var.f30226b, c0Var.J0), 2, z11);
                        c0Var.f19996o1.C(0);
                        return;
                    }
                    org.telegram.ui.Cells.c0.t((FrameLayout) c0Var.f30226b, c0Var.J0, tL_error, false);
                    return;
                }
                li.k0.f(new org.telegram.ui.Components.kc((FrameLayout) c0Var.f30226b, c0Var.J0), 1, z11);
                c0Var.f19996o1.C(0);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) fsVar;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.Z6;
                if (!profileActivity.c4()) {
                    if (org.telegram.ui.Components.kc.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            org.telegram.ui.Components.kc.l(null, profileActivity, z11).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.kc.l(org.telegram.messenger.n5.t(profileActivity.f43666e1), profileActivity, z11).j();
                        } else if (tL_error2 != null) {
                            org.telegram.ui.Components.kc.e0(tL_error2);
                        }
                    }
                    org.telegram.messenger.n6 n6Var2 = profileActivity.Y1;
                    if (n6Var2 != null) {
                        n6Var2.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
