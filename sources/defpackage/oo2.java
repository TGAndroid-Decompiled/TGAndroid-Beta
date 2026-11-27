package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class oo2 implements icc {
    public final byte a;
    public final boolean b;
    public final fn7 c;

    public oo2(fn7 fn7Var, boolean z, byte b) {
        this.a = b;
        this.c = fn7Var;
        this.b = z;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z;
        float f;
        qma qmaVar;
        TLRPC.PhotoSize w;
        byte b = this.a;
        int i = 0;
        boolean z2 = this.b;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                xo2 xo2Var = (xo2) fn7Var;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    boolean equals = TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text);
                    ViewGroup viewGroup = xo2Var.b;
                    if (equals) {
                        gp2.f(new d31((FrameLayout) viewGroup, xo2Var.J0), 2, z2);
                        xo2Var.n1.F(0);
                        return;
                    }
                    ik8.u((FrameLayout) viewGroup, xo2Var.J0, tL_error, false);
                    return;
                }
                gp2.f(new d31((FrameLayout) xo2Var.b, xo2Var.J0), 1, z2);
                xo2Var.n1.F(0);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) fn7Var;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.Z6;
                if (!profileActivity.V1()) {
                    if (d31.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            d31.l(null, profileActivity, z2).j();
                        } else if (num.intValue() == 2) {
                            d31.l(wf3.s(profileActivity.e1), profileActivity, z2).j();
                        } else if (tL_error2 != null) {
                            d31.e0(tL_error2);
                        }
                    }
                    c34 c34Var = profileActivity.Y1;
                    if (c34Var != null) {
                        c34Var.i();
                        return;
                    }
                    return;
                }
                return;
            default:
                sbb sbbVar = (sbb) fn7Var;
                Bitmap bitmap = (Bitmap) obj2;
                int i2 = sbbVar.c;
                if (obj != null && sbbVar.q2 == null && !sbbVar.X && sbbVar.H()) {
                    if (z2) {
                        if (sbbVar.L1 != null) {
                            sbbVar.s();
                            sbbVar.L1.j = true;
                            if (obj instanceof no6) {
                                wab wabVar = sbbVar.w1;
                                wabVar.a0(wabVar.h0(((no6) obj).I, false));
                            } else if (obj instanceof TLObject) {
                                wab wabVar2 = sbbVar.w1;
                                TLObject tLObject = (TLObject) obj;
                                wabVar2.Z1 = true;
                                zw7 zw7Var = wabVar2.B0;
                                if ((tLObject instanceof TLRPC.Photo) && (w = xb4.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) != null) {
                                    f = w.w / w.h;
                                } else {
                                    f = 1.0f;
                                }
                                if (f > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(wabVar2.B1, zw7Var.getMeasuredWidth()) * 0.5d);
                                    qmaVar = new qma(floor, floor / f);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(wabVar2.C1, zw7Var.getMeasuredHeight()) * 0.5d);
                                    qmaVar = new qma(f * floor2, floor2);
                                }
                                v98 v98Var = new v98(wabVar2.getContext(), wabVar2.b0(), qmaVar, tLObject);
                                v98Var.setDelegate(wabVar2);
                                zw7Var.addView(v98Var);
                                wabVar2.c0();
                                wabVar2.a0(v98Var);
                            }
                            sbbVar.c(false);
                        } else {
                            return;
                        }
                    } else {
                        sbbVar.h0(false, true);
                        sbbVar.R0.a(sbbVar.P1);
                        u59 u59Var = sbbVar.P0;
                        if (sbbVar.P1 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        u59Var.o0 = -1.0f;
                        u59Var.p0 = z;
                        u59Var.invalidate();
                        sbbVar.c(false);
                        boolean z3 = obj instanceof no6;
                        if (z3) {
                            no6 no6Var = (no6) obj;
                            if (no6Var.b && !no6Var.d()) {
                                i = 1;
                            }
                            sbbVar.P1 = i;
                            c8b l = c8b.l(no6Var);
                            l.M0 = bitmap;
                            l.J0 = sbbVar.w0;
                            l.K0 = sbbVar.x0;
                            l.z();
                            sbbVar.M1 = true;
                            if (sbbVar.B0.i()) {
                                sbbVar.H1 = null;
                                l.P = 1.0f;
                                if (sbbVar.B0.l(l)) {
                                    sbbVar.L1 = c8b.a(sbbVar.B0.getLayout(), sbbVar.B0.getContent());
                                }
                                sbbVar.l0(true);
                            } else {
                                l.A();
                                sbbVar.L1 = l;
                                if (z3) {
                                    y9b.a(i2, l);
                                }
                                sbbVar.I(1, true);
                            }
                        } else if (obj instanceof c8b) {
                            c8b c8bVar = (c8b) obj;
                            if (c8bVar.L == null && !c8bVar.v()) {
                                sbbVar.f1.c("Failed to load draft");
                                uc7.s1(i2).O1().w.b(c8bVar);
                                return;
                            }
                            c8bVar.J0 = sbbVar.w0;
                            c8bVar.K0 = sbbVar.x0;
                            sbbVar.P1 = c8bVar.K ? 1 : 0;
                            c8bVar.M0 = bitmap;
                            sbbVar.M1 = false;
                            sbbVar.B0.n(c8bVar);
                            sbbVar.L1 = c8bVar;
                            if (z3) {
                                y9b.a(i2, c8bVar);
                            }
                            sbbVar.I(1, true);
                        } else {
                            return;
                        }
                    }
                    zt4 zt4Var = sbbVar.N0;
                    if (zt4Var != null) {
                        sbbVar.m2 = zt4Var.e.d0();
                        sbbVar.n2 = sbbVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
