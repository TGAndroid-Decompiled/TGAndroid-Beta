package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class vn2 implements i8c {
    public final byte a;
    public final boolean b;
    public final gk7 c;

    public vn2(gk7 gk7Var, boolean z, byte b) {
        this.a = b;
        this.c = gk7Var;
        this.b = z;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z;
        float f;
        via viaVar;
        TLRPC.PhotoSize w;
        byte b = this.a;
        int i = 0;
        boolean z2 = this.b;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                eo2 eo2Var = (eo2) gk7Var;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    boolean equals = TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text);
                    ViewGroup viewGroup = eo2Var.b;
                    if (equals) {
                        no2.f(new u21((FrameLayout) viewGroup, eo2Var.J0), 2, z2);
                        eo2Var.n1.E(0);
                        return;
                    }
                    ug8.u((FrameLayout) viewGroup, eo2Var.J0, tL_error, false);
                    return;
                }
                no2.f(new u21((FrameLayout) eo2Var.b, eo2Var.J0), 1, z2);
                eo2Var.n1.E(0);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) gk7Var;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.Z6;
                if (!profileActivity.U1()) {
                    if (u21.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            u21.l(null, profileActivity, z2).j();
                        } else if (num.intValue() == 2) {
                            u21.l(cf3.s(profileActivity.e1), profileActivity, z2).j();
                        } else if (tL_error2 != null) {
                            u21.e0(tL_error2);
                        }
                    }
                    h24 h24Var = profileActivity.Y1;
                    if (h24Var != null) {
                        h24Var.i();
                        return;
                    }
                    return;
                }
                return;
            default:
                t7b t7bVar = (t7b) gk7Var;
                Bitmap bitmap = (Bitmap) obj2;
                int i2 = t7bVar.c;
                if (obj != null && t7bVar.q2 == null && !t7bVar.X && t7bVar.H()) {
                    if (z2) {
                        if (t7bVar.L1 != null) {
                            t7bVar.s();
                            t7bVar.L1.j = true;
                            if (obj instanceof jm6) {
                                x6b x6bVar = t7bVar.w1;
                                x6bVar.a0(x6bVar.h0(((jm6) obj).I, false));
                            } else if (obj instanceof TLObject) {
                                x6b x6bVar2 = t7bVar.w1;
                                TLObject tLObject = (TLObject) obj;
                                x6bVar2.f2 = true;
                                st7 st7Var = x6bVar2.H0;
                                if ((tLObject instanceof TLRPC.Photo) && (w = ba4.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) != null) {
                                    f = w.w / w.h;
                                } else {
                                    f = 1.0f;
                                }
                                if (f > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(x6bVar2.H1, st7Var.getMeasuredWidth()) * 0.5d);
                                    viaVar = new via(floor, floor / f);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(x6bVar2.I1, st7Var.getMeasuredHeight()) * 0.5d);
                                    viaVar = new via(f * floor2, floor2);
                                }
                                e68 e68Var = new e68(x6bVar2.getContext(), x6bVar2.b0(), viaVar, tLObject);
                                e68Var.setDelegate(x6bVar2);
                                st7Var.addView(e68Var);
                                x6bVar2.c0();
                                x6bVar2.a0(e68Var);
                            }
                            t7bVar.c(false);
                        } else {
                            return;
                        }
                    } else {
                        t7bVar.h0(false, true);
                        t7bVar.R0.a(t7bVar.P1);
                        f29 f29Var = t7bVar.P0;
                        if (t7bVar.P1 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        f29Var.o0 = -1.0f;
                        f29Var.p0 = z;
                        f29Var.invalidate();
                        t7bVar.c(false);
                        boolean z3 = obj instanceof jm6;
                        if (z3) {
                            jm6 jm6Var = (jm6) obj;
                            if (jm6Var.b && !jm6Var.d()) {
                                i = 1;
                            }
                            t7bVar.P1 = i;
                            f4b l = f4b.l(jm6Var);
                            l.M0 = bitmap;
                            l.J0 = t7bVar.w0;
                            l.K0 = t7bVar.x0;
                            l.z();
                            t7bVar.M1 = true;
                            if (t7bVar.B0.i()) {
                                t7bVar.H1 = null;
                                l.P = 1.0f;
                                if (t7bVar.B0.l(l)) {
                                    t7bVar.L1 = f4b.a(t7bVar.B0.getLayout(), t7bVar.B0.getContent());
                                }
                                t7bVar.l0(true);
                            } else {
                                l.A();
                                t7bVar.L1 = l;
                                if (z3) {
                                    a6b.a(i2, l);
                                }
                                t7bVar.I(1, true);
                            }
                        } else if (obj instanceof f4b) {
                            f4b f4bVar = (f4b) obj;
                            if (f4bVar.L == null && !f4bVar.v()) {
                                t7bVar.f1.c("Failed to load draft");
                                na7.q1(i2).M1().w.b(f4bVar);
                                return;
                            }
                            f4bVar.J0 = t7bVar.w0;
                            f4bVar.K0 = t7bVar.x0;
                            t7bVar.P1 = f4bVar.K ? 1 : 0;
                            f4bVar.M0 = bitmap;
                            t7bVar.M1 = false;
                            t7bVar.B0.n(f4bVar);
                            t7bVar.L1 = f4bVar;
                            if (z3) {
                                a6b.a(i2, f4bVar);
                            }
                            t7bVar.I(1, true);
                        } else {
                            return;
                        }
                    }
                    vr4 vr4Var = t7bVar.N0;
                    if (vr4Var != null) {
                        t7bVar.m2 = vr4Var.e.d0();
                        t7bVar.n2 = t7bVar.N0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
