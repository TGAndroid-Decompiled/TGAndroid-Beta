package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class gp2 implements jac {
    public final byte a;
    public final boolean b;
    public final jm7 c;

    public gp2(jm7 jm7Var, boolean z, byte b) {
        this.a = b;
        this.c = jm7Var;
        this.b = z;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z;
        float f;
        xka xkaVar;
        TLRPC.PhotoSize w;
        byte b = this.a;
        int i = 0;
        boolean z2 = this.b;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                pp2 pp2Var = (pp2) jm7Var;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    boolean equals = TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text);
                    ViewGroup viewGroup = pp2Var.b;
                    if (equals) {
                        yp2.f(new c41((FrameLayout) viewGroup, pp2Var.J0), 2, z2);
                        pp2Var.n1.E(0);
                        return;
                    }
                    wi8.u((FrameLayout) viewGroup, pp2Var.J0, tL_error, false);
                    return;
                }
                yp2.f(new c41((FrameLayout) pp2Var.b, pp2Var.J0), 1, z2);
                pp2Var.n1.E(0);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) jm7Var;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.e7;
                if (!profileActivity.W1()) {
                    if (c41.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            c41.l(null, profileActivity, z2).j();
                        } else if (num.intValue() == 2) {
                            c41.l(pg3.s(profileActivity.e1), profileActivity, z2).j();
                        } else if (tL_error2 != null) {
                            c41.e0(tL_error2);
                        }
                    }
                    s34 s34Var = profileActivity.Y1;
                    if (s34Var != null) {
                        s34Var.i();
                        return;
                    }
                    return;
                }
                return;
            default:
                v9b v9bVar = (v9b) jm7Var;
                Bitmap bitmap = (Bitmap) obj2;
                int i2 = v9bVar.c;
                if (obj != null && v9bVar.q2 == null && !v9bVar.X && v9bVar.H()) {
                    if (z2) {
                        if (v9bVar.L1 != null) {
                            v9bVar.s();
                            v9bVar.L1.j = true;
                            if (obj instanceof jo6) {
                                z8b z8bVar = v9bVar.w1;
                                z8bVar.a0(z8bVar.h0(((jo6) obj).I, false));
                            } else if (obj instanceof TLObject) {
                                z8b z8bVar2 = v9bVar.w1;
                                TLObject tLObject = (TLObject) obj;
                                z8bVar2.f2 = true;
                                tv7 tv7Var = z8bVar2.H0;
                                if ((tLObject instanceof TLRPC.Photo) && (w = bc4.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) != null) {
                                    f = w.w / w.h;
                                } else {
                                    f = 1.0f;
                                }
                                if (f > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(z8bVar2.H1, tv7Var.getMeasuredWidth()) * 0.5d);
                                    xkaVar = new xka(floor, floor / f);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(z8bVar2.I1, tv7Var.getMeasuredHeight()) * 0.5d);
                                    xkaVar = new xka(f * floor2, floor2);
                                }
                                g88 g88Var = new g88(z8bVar2.getContext(), z8bVar2.b0(), xkaVar, tLObject);
                                g88Var.setDelegate(z8bVar2);
                                tv7Var.addView(g88Var);
                                z8bVar2.c0();
                                z8bVar2.a0(g88Var);
                            }
                            v9bVar.c(false);
                        } else {
                            return;
                        }
                    } else {
                        v9bVar.h0(false, true);
                        v9bVar.R0.a(v9bVar.P1);
                        j49 j49Var = v9bVar.P0;
                        if (v9bVar.P1 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j49Var.o0 = -1.0f;
                        j49Var.p0 = z;
                        j49Var.invalidate();
                        v9bVar.c(false);
                        boolean z3 = obj instanceof jo6;
                        if (z3) {
                            jo6 jo6Var = (jo6) obj;
                            if (jo6Var.b && !jo6Var.d()) {
                                i = 1;
                            }
                            v9bVar.P1 = i;
                            g6b l = g6b.l(jo6Var);
                            l.M0 = bitmap;
                            l.J0 = v9bVar.w0;
                            l.K0 = v9bVar.x0;
                            l.z();
                            v9bVar.M1 = true;
                            if (v9bVar.B0.i()) {
                                v9bVar.H1 = null;
                                l.P = 1.0f;
                                if (v9bVar.B0.l(l)) {
                                    v9bVar.L1 = g6b.a(v9bVar.B0.getLayout(), v9bVar.B0.getContent());
                                }
                                v9bVar.l0(true);
                            } else {
                                l.A();
                                v9bVar.L1 = l;
                                if (z3) {
                                    c8b.a(i2, l);
                                }
                                v9bVar.I(1, true);
                            }
                        } else if (obj instanceof g6b) {
                            g6b g6bVar = (g6b) obj;
                            if (g6bVar.L == null && !g6bVar.v()) {
                                v9bVar.f1.c("Failed to load draft");
                                oc7.r1(i2).N1().w.b(g6bVar);
                                return;
                            }
                            g6bVar.J0 = v9bVar.w0;
                            g6bVar.K0 = v9bVar.x0;
                            v9bVar.P1 = g6bVar.K ? 1 : 0;
                            g6bVar.M0 = bitmap;
                            v9bVar.M1 = false;
                            v9bVar.B0.n(g6bVar);
                            v9bVar.L1 = g6bVar;
                            if (z3) {
                                c8b.a(i2, g6bVar);
                            }
                            v9bVar.I(1, true);
                        } else {
                            return;
                        }
                    }
                    wt4 wt4Var = v9bVar.N0;
                    if (wt4Var != null) {
                        v9bVar.m2 = wt4Var.e.d0();
                        v9bVar.n2 = v9bVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
