package hi;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.ff;
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.ProfileActivity;
public final class k9 implements r10 {
    public final int f14823a;
    public final boolean f14824b;
    public final gs f14825c;

    public k9(gs gsVar, boolean z10, int i7) {
        this.f14823a = i7;
        this.f14825c = gsVar;
        this.f14824b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        float f10;
        yt0 yt0Var;
        TLRPC.PhotoSize w10;
        int i7 = this.f14823a;
        int i10 = 0;
        boolean z11 = this.f14824b;
        gs gsVar = this.f14825c;
        switch (i7) {
            case 0:
                ta taVar = (ta) gsVar;
                Bitmap bitmap = (Bitmap) obj2;
                int i11 = taVar.f15395c;
                if (obj != null && taVar.f15439q2 == null && !taVar.X && taVar.I()) {
                    if (z11) {
                        if (taVar.L1 != null) {
                            taVar.t();
                            taVar.L1.f14383j = true;
                            if (obj instanceof ff) {
                                v9 v9Var = taVar.f15459w1;
                                v9Var.b0(v9Var.h0(((ff) obj).I, false));
                            } else if (obj instanceof TLObject) {
                                v9 v9Var2 = taVar.f15459w1;
                                TLObject tLObject = (TLObject) obj;
                                v9Var2.V1 = true;
                                g5 g5Var = v9Var2.B0;
                                if ((tLObject instanceof TLRPC.Photo) && (w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) != null) {
                                    f10 = w10.f28423w / w10.h;
                                } else {
                                    f10 = 1.0f;
                                }
                                if (f10 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(v9Var2.B1, g5Var.getMeasuredWidth()) * 0.5d);
                                    yt0Var = new yt0(floor, floor / f10);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(v9Var2.C1, g5Var.getMeasuredHeight()) * 0.5d);
                                    yt0Var = new yt0(f10 * floor2, floor2);
                                }
                                tg.p1 p1Var = new tg.p1(v9Var2.getContext(), v9Var2.c0(), yt0Var, tLObject);
                                p1Var.setDelegate(v9Var2);
                                g5Var.addView(p1Var);
                                v9Var2.d0();
                                v9Var2.b0(p1Var);
                            }
                            taVar.e(false);
                        } else {
                            return;
                        }
                    } else {
                        taVar.h0(false, true);
                        taVar.R0.a(taVar.P1);
                        e6 e6Var = taVar.P0;
                        if (taVar.P1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e6Var.f14529o0 = -1.0f;
                        e6Var.f14530p0 = z10;
                        e6Var.invalidate();
                        taVar.e(false);
                        boolean z12 = obj instanceof ff;
                        if (z12) {
                            ff ffVar = (ff) obj;
                            if (ffVar.f28023b && !ffVar.d()) {
                                i10 = 1;
                            }
                            taVar.P1 = i10;
                            d7 l10 = d7.l(ffVar);
                            l10.M0 = bitmap;
                            l10.J0 = taVar.f15458w0;
                            l10.K0 = taVar.f15462x0;
                            l10.A();
                            taVar.M1 = true;
                            if (taVar.B0.j()) {
                                taVar.H1 = null;
                                l10.P = 1.0f;
                                if (taVar.B0.l(l10)) {
                                    taVar.L1 = d7.a(taVar.B0.getLayout(), taVar.B0.getContent());
                                }
                                taVar.l0(true);
                            } else {
                                l10.B();
                                taVar.L1 = l10;
                                if (z12) {
                                    r8.a(i11, l10);
                                }
                                taVar.J(1, true);
                            }
                        } else if (obj instanceof d7) {
                            d7 d7Var = (d7) obj;
                            if (d7Var.L == null && !d7Var.v()) {
                                taVar.f15407f1.c("Failed to load draft");
                                np.u1(i11).R1().f12396w.b(d7Var);
                                return;
                            }
                            d7Var.J0 = taVar.f15458w0;
                            d7Var.K0 = taVar.f15462x0;
                            taVar.P1 = d7Var.K ? 1 : 0;
                            d7Var.M0 = bitmap;
                            taVar.M1 = false;
                            taVar.B0.n(d7Var);
                            taVar.L1 = d7Var;
                            if (z12) {
                                r8.a(i11, d7Var);
                            }
                            taVar.J(1, true);
                        } else {
                            return;
                        }
                    }
                    g3 g3Var = taVar.N0;
                    if (g3Var != null) {
                        taVar.f15427m2 = g3Var.f14340e.e0();
                        taVar.f15430n2 = taVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                li.d0 d0Var = (li.d0) gsVar;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        li.l0.f(new lc((FrameLayout) d0Var.f30142b, d0Var.J0), 2, z11);
                        d0Var.f19899o1.A(0);
                        return;
                    }
                    org.telegram.ui.Cells.c0.t((FrameLayout) d0Var.f30142b, d0Var.J0, tL_error, false);
                    return;
                }
                li.l0.f(new lc((FrameLayout) d0Var.f30142b, d0Var.J0), 1, z11);
                d0Var.f19899o1.A(0);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) gsVar;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.Z6;
                if (!profileActivity.c4()) {
                    if (lc.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            lc.l(null, profileActivity, z11).j();
                        } else if (num.intValue() == 2) {
                            lc.l(org.telegram.messenger.n5.t(profileActivity.f43550e1), profileActivity, z11).j();
                        } else if (tL_error2 != null) {
                            lc.e0(tL_error2);
                        }
                    }
                    org.telegram.messenger.n6 n6Var = profileActivity.Y1;
                    if (n6Var != null) {
                        n6Var.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
