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
public final class j9 implements r10 {
    public final int f14839a;
    public final boolean f14840b;
    public final gs f14841c;

    public j9(gs gsVar, boolean z10, int i7) {
        this.f14839a = i7;
        this.f14841c = gsVar;
        this.f14840b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        float f10;
        yt0 yt0Var;
        TLRPC.PhotoSize w10;
        int i7 = this.f14839a;
        int i10 = 0;
        boolean z11 = this.f14840b;
        gs gsVar = this.f14841c;
        switch (i7) {
            case 0:
                sa saVar = (sa) gsVar;
                Bitmap bitmap = (Bitmap) obj2;
                int i11 = saVar.f15392c;
                if (obj != null && saVar.f15436q2 == null && !saVar.X && saVar.I()) {
                    if (z11) {
                        if (saVar.L1 != null) {
                            saVar.t();
                            saVar.L1.f14359j = true;
                            if (obj instanceof ff) {
                                u9 u9Var = saVar.f15456w1;
                                u9Var.b0(u9Var.h0(((ff) obj).I, false));
                            } else if (obj instanceof TLObject) {
                                u9 u9Var2 = saVar.f15456w1;
                                TLObject tLObject = (TLObject) obj;
                                u9Var2.V1 = true;
                                f5 f5Var = u9Var2.B0;
                                if ((tLObject instanceof TLRPC.Photo) && (w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) != null) {
                                    f10 = w10.f28459w / w10.h;
                                } else {
                                    f10 = 1.0f;
                                }
                                if (f10 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(u9Var2.B1, f5Var.getMeasuredWidth()) * 0.5d);
                                    yt0Var = new yt0(floor, floor / f10);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(u9Var2.C1, f5Var.getMeasuredHeight()) * 0.5d);
                                    yt0Var = new yt0(f10 * floor2, floor2);
                                }
                                tg.p1 p1Var = new tg.p1(u9Var2.getContext(), u9Var2.c0(), yt0Var, tLObject);
                                p1Var.setDelegate(u9Var2);
                                f5Var.addView(p1Var);
                                u9Var2.d0();
                                u9Var2.b0(p1Var);
                            }
                            saVar.e(false);
                        } else {
                            return;
                        }
                    } else {
                        saVar.h0(false, true);
                        saVar.R0.a(saVar.P1);
                        d6 d6Var = saVar.P0;
                        if (saVar.P1 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d6Var.f14531o0 = -1.0f;
                        d6Var.f14532p0 = z10;
                        d6Var.invalidate();
                        saVar.e(false);
                        boolean z12 = obj instanceof ff;
                        if (z12) {
                            ff ffVar = (ff) obj;
                            if (ffVar.f28059b && !ffVar.d()) {
                                i10 = 1;
                            }
                            saVar.P1 = i10;
                            c7 l10 = c7.l(ffVar);
                            l10.M0 = bitmap;
                            l10.J0 = saVar.f15455w0;
                            l10.K0 = saVar.f15459x0;
                            l10.A();
                            saVar.M1 = true;
                            if (saVar.B0.j()) {
                                saVar.H1 = null;
                                l10.P = 1.0f;
                                if (saVar.B0.l(l10)) {
                                    saVar.L1 = c7.a(saVar.B0.getLayout(), saVar.B0.getContent());
                                }
                                saVar.l0(true);
                            } else {
                                l10.B();
                                saVar.L1 = l10;
                                if (z12) {
                                    q8.a(i11, l10);
                                }
                                saVar.J(1, true);
                            }
                        } else if (obj instanceof c7) {
                            c7 c7Var = (c7) obj;
                            if (c7Var.L == null && !c7Var.v()) {
                                saVar.f15404f1.c("Failed to load draft");
                                np.u1(i11).R1().f12444w.b(c7Var);
                                return;
                            }
                            c7Var.J0 = saVar.f15455w0;
                            c7Var.K0 = saVar.f15459x0;
                            saVar.P1 = c7Var.K ? 1 : 0;
                            c7Var.M0 = bitmap;
                            saVar.M1 = false;
                            saVar.B0.n(c7Var);
                            saVar.L1 = c7Var;
                            if (z12) {
                                q8.a(i11, c7Var);
                            }
                            saVar.J(1, true);
                        } else {
                            return;
                        }
                    }
                    g3 g3Var = saVar.N0;
                    if (g3Var != null) {
                        saVar.f15424m2 = g3Var.f14494e.e0();
                        saVar.f15427n2 = saVar.N0.getSelectedAlbum();
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
                        li.l0.f(new lc((FrameLayout) d0Var.f30176b, d0Var.J0), 2, z11);
                        d0Var.f19933o1.A(0);
                        return;
                    }
                    org.telegram.ui.Cells.c0.t((FrameLayout) d0Var.f30176b, d0Var.J0, tL_error, false);
                    return;
                }
                li.l0.f(new lc((FrameLayout) d0Var.f30176b, d0Var.J0), 1, z11);
                d0Var.f19933o1.A(0);
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
                            lc.l(org.telegram.messenger.n5.t(profileActivity.f43585e1), profileActivity, z11).j();
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
