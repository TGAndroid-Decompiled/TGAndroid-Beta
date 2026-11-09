package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.k5;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xp;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.d61;
import org.telegram.ui.kf0;
import org.telegram.ui.ks0;
import org.telegram.ui.lf0;
import org.telegram.ui.qs0;
import org.telegram.ui.rc1;
import org.telegram.ui.sh0;
import org.telegram.ui.th0;
import org.telegram.ui.tz;
import org.telegram.ui.uh0;
import org.telegram.ui.vc1;
import org.telegram.ui.xs0;
import org.telegram.ui.yt;
public final class k5 extends pj0 {
    public final int f4146c;
    public final Object d;

    public k5(Object obj, int i7) {
        this.f4146c = i7;
        this.d = obj;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.f4146c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i7 = d1Var.f57060f;
                if (i7 == 1 || i7 == 2) {
                    return true;
                }
                return false;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return false;
            case 7:
                return true;
            case 8:
                int i10 = d1Var.f57060f;
                if (i10 != 0 && i10 != 2) {
                    return false;
                }
                return true;
            case 9:
                return true;
            case 10:
                return false;
            default:
                if (d1Var.f57060f == 1) {
                    return true;
                }
                return false;
        }
    }

    public ij E(int i7) {
        el0 el0Var = (el0) this.d;
        int i10 = el0Var.f33445w;
        if (i7 >= i10 && i7 < el0Var.f33446x) {
            return (ij) el0Var.f33440e.get(i7 - i10);
        }
        int i11 = el0Var.D;
        if (i7 >= i11 && i7 < el0Var.E) {
            return (ij) el0Var.f33441f.get(i7 - i11);
        }
        return null;
    }

    public void H(int i7, int i10) {
        int[] iArr = ((k7) this.d).K2;
        if (iArr[0] == i7 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i7;
        iArr[1] = i10;
        f();
    }

    @Override
    public final int b() {
        switch (this.f4146c) {
            case 0:
                return ((k7) this.d).K2.length;
            case 1:
                return ((jg.q0) this.d).f16891e3.size();
            case 2:
                return 1;
            case 3:
                return ((el0) this.d).f33443r;
            case 4:
                return ((rl0) this.d).f37739r.size();
            case 5:
                return ((t01) this.d).R.size();
            case 6:
                if (((yt) this.d).Y1.h()) {
                    return 1;
                }
                return 3;
            case 7:
                return ((lf0) this.d).f47592c.size();
            case 8:
                return ((uh0) this.d).h;
            case 9:
                return 12;
            case 10:
                return ((ug.i) this.d).d.size();
            default:
                return ((ug.f1) this.d).X1;
        }
    }

    @Override
    public long c(int i7) {
        sh0 sh0Var;
        switch (this.f4146c) {
            case 8:
                uh0 uh0Var = (uh0) this.d;
                int i10 = uh0Var.D;
                if (i7 >= i10 && i7 < uh0Var.E) {
                    sh0Var = (sh0) uh0Var.f50402b.get(i7 - i10);
                } else {
                    int i11 = uh0Var.f50406n;
                    if (i7 >= i11 && i7 < uh0Var.f50407r) {
                        sh0Var = (sh0) uh0Var.f50401a.get(i7 - i11);
                    } else {
                        sh0Var = null;
                    }
                }
                if (sh0Var != null) {
                    return sh0Var.f49915c;
                }
                uh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == uh0Var.f50411y) {
                    return 2L;
                }
                if (i7 == uh0Var.f50408s) {
                    return 3L;
                }
                if (i7 == uh0Var.f50409w) {
                    return 4L;
                }
                if (i7 == uh0Var.f50410x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i7);
        }
    }

    @Override
    public int d(int i7) {
        switch (this.f4146c) {
            case 2:
                return i7;
            case 3:
                el0 el0Var = (el0) this.d;
                if (i7 != el0Var.f33444s && i7 != el0Var.f33447y) {
                    ij E = E(i7);
                    if (E == null || !E.I3()) {
                        return 1;
                    }
                    return 2;
                }
                return 0;
            case 4:
            case 5:
            case 7:
            case 9:
            default:
                return super.d(i7);
            case 6:
                return i7;
            case 8:
                uh0 uh0Var = (uh0) this.d;
                if (i7 >= uh0Var.D && i7 < uh0Var.E) {
                    return 0;
                }
                uh0Var.getClass();
                if (i7 != 0 && i7 != uh0Var.f50411y) {
                    if (i7 == uh0Var.f50408s) {
                        return 2;
                    }
                    if (i7 != uh0Var.f50409w && i7 != uh0Var.f50410x) {
                        return 0;
                    }
                    return 3;
                }
                return 1;
            case 10:
                return ((ug.g) ((ug.i) this.d).d.get(i7)).f56600a;
            case 11:
                ug.f1 f1Var = (ug.f1) this.d;
                if (i7 != f1Var.Y1) {
                    if (i7 >= f1Var.Z1 && i7 < f1Var.f56575a2) {
                        return f1Var.f1();
                    }
                    if (i7 >= f1Var.f56576b2 && i7 < f1Var.f56577c2) {
                        return 1;
                    }
                    if (i7 == f1Var.d2) {
                        return 2;
                    }
                    if (i7 == f1Var.f56578e2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == f1Var.f56579f2) {
                        return 5;
                    }
                }
                return 0;
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int e12;
        boolean z10;
        int e13;
        boolean z11;
        String M0;
        String M02;
        boolean z12;
        bq bqVar;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10 = this.f4146c;
        float f10 = 0.0f;
        sh0 sh0Var = null;
        boolean z16 = false;
        boolean z17 = true;
        Object obj = this.d;
        switch (i10) {
            case 0:
                int[] iArr = ((k7) obj).K2;
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) d1Var.f57056a;
                int i11 = iArr[(iArr.length - 1) - i7];
                if (faVar.f33610a != i11) {
                    faVar.f33610a = i11;
                    faVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((jg.p0) d1Var).v.setData((jg.o0) ((jg.q0) obj).f16891e3.get(i7));
                return;
            case 2:
                return;
            case 3:
                el0 el0Var = (el0) obj;
                tz tzVar = el0Var.J;
                int i12 = d1Var.f57060f;
                View view = d1Var.f57056a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 == el0Var.f33444s) {
                        String M03 = org.telegram.messenger.id.M0(2131751344, null);
                        if (x3Var.getText().equals(M03)) {
                            if (el0Var.H) {
                                M02 = org.telegram.messenger.id.M0(2131747433, null);
                            } else {
                                M02 = org.telegram.messenger.id.M0(2131746053, null);
                            }
                            boolean z18 = el0Var.H;
                            org.telegram.ui.Cells.w3 w3Var = x3Var.f30881b;
                            w3Var.c(M02, true, z18);
                            w3Var.setVisibility(0);
                            return;
                        }
                        if (el0Var.H) {
                            M0 = org.telegram.messenger.id.M0(2131747433, null);
                        } else {
                            M0 = org.telegram.messenger.id.M0(2131746053, null);
                        }
                        x3Var.b(M03, M0, new dl0(this));
                        return;
                    } else if (i7 == el0Var.f33447y) {
                        x3Var.b(org.telegram.messenger.id.M0(2131746362, null), org.telegram.messenger.id.M0(2131745495, null), new ma0(this, 7));
                        return;
                    } else {
                        return;
                    }
                }
                ij E = E(i7);
                if (E != null) {
                    if (el0Var.I.i() && i7 >= el0Var.f33445w && i7 < el0Var.f33446x) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i12 == 1) {
                        bl0 bl0Var = (bl0) view;
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, bl0Var, null);
                        org.telegram.ui.Cells.h7 h7Var = bl0Var.f32275a;
                        if (h7Var.getMessage() == null) {
                            e13 = 0;
                        } else {
                            e13 = h7Var.getMessage().e1();
                        }
                        h7Var.c(E, true);
                        int e14 = h7Var.getMessage().e1();
                        tzVar.f50267a = ij.B0(h7Var.getMessage().f23262k);
                        tzVar.f50268b = e14;
                        boolean f11 = el0Var.I.f(tzVar);
                        if (e13 == E.e1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        h7Var.b(f11, z11);
                        if (e13 == E.e1()) {
                            z16 = true;
                        }
                        if (h7Var.O != z9) {
                            h7Var.O = z9;
                            if (!z16) {
                                if (z9) {
                                    f10 = 1.0f;
                                }
                                h7Var.P = f10;
                            }
                            h7Var.invalidate();
                            return;
                        }
                        return;
                    } else if (i12 == 2) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                        if (g7Var.getMessage() == null) {
                            e12 = 0;
                        } else {
                            e12 = g7Var.getMessage().e1();
                        }
                        g7Var.f(E, true);
                        int e15 = g7Var.getMessage().e1();
                        tzVar.f50267a = ij.B0(g7Var.getMessage().f23262k);
                        tzVar.f50268b = e15;
                        boolean f12 = el0Var.I.f(tzVar);
                        if (e12 == E.e1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g7Var.e(f12, z10);
                        if (e12 == E.e1()) {
                            z16 = true;
                        }
                        if (g7Var.f29189d0 != z9) {
                            g7Var.f29189d0 = z9;
                            if (!z16) {
                                if (z9) {
                                    f10 = 1.0f;
                                }
                                g7Var.f29191e0 = f10;
                            }
                            g7Var.invalidate();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                View view2 = d1Var.f57056a;
                rl0 rl0Var = (rl0) obj;
                ArrayList arrayList = rl0Var.f37739r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    ol0 ol0Var = (ol0) arrayList.get(i7);
                    ql0 ql0Var = (ql0) view2;
                    ch.o0 o0Var = ql0Var.d;
                    if (o0Var != null && o0Var.equals(ol0Var.f36742a)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ol0Var.f36742a.g();
                        tL_reactionCount.count = ol0Var.f36743b;
                        rl0 rl0Var2 = ql0Var.f37417s;
                        pl0 pl0Var = new pl0(ql0Var, rl0Var2.f37733a, ql0Var, tL_reactionCount, rl0Var2.f37735c);
                        ql0Var.f37410a = pl0Var;
                        pl0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        pl0 pl0Var2 = ql0Var.f37410a;
                        pl0Var2.f6326p = true;
                        pl0Var2.R = true;
                    } else {
                        ql0Var.f37410a.v = ol0Var.f36743b;
                    }
                    ql0Var.d = ol0Var.f36742a;
                    if (!z12) {
                        pl0 pl0Var3 = ql0Var.f37410a;
                        pl0Var3.f6314e = pl0Var3.f6335z;
                    }
                    ql0Var.f37410a.f6335z = org.telegram.messenger.g0.L(44.33f);
                    ql0Var.f37410a.f6330t = !TextUtils.isEmpty(ol0Var.f36744c);
                    pl0 pl0Var4 = ql0Var.f37410a;
                    boolean z19 = pl0Var4.f6330t;
                    org.telegram.ui.Components.i6 i6Var = pl0Var4.F;
                    if (z19) {
                        i6Var.t(org.telegram.messenger.i6.m(ol0Var.f36744c, i6Var.f34585a.getFontMetricsInt(), false, null, 0), !z12, true);
                    } else if (i6Var != null) {
                        i6Var.t("", !z12, true);
                    }
                    pl0 pl0Var5 = ql0Var.f37410a;
                    Integer.toString(ol0Var.f36743b);
                    pl0Var5.getClass();
                    ql0Var.f37410a.E.c(ol0Var.f36743b, !z12);
                    pl0 pl0Var6 = ql0Var.f37410a;
                    if (pl0Var6.E != null && (pl0Var6.v > 0 || pl0Var6.f6330t)) {
                        float f13 = pl0Var6.f6335z;
                        int ceil = (int) Math.ceil(bqVar.f32372m);
                        if (ql0Var.f37410a.f6330t) {
                            f10 = 4.0f;
                        }
                        pl0Var6.f6335z = (int) (org.telegram.messenger.g0.L(f10) + ceil + ql0Var.f37410a.F.d + f13);
                    }
                    if (z12) {
                        pl0 pl0Var7 = ql0Var.f37410a;
                        pl0Var7.f6314e = pl0Var7.f6335z;
                    }
                    ql0Var.f37410a.A = org.telegram.messenger.g0.L(28.0f);
                    pl0 pl0Var8 = ql0Var.f37410a;
                    pl0Var8.f6325o = ql0Var.f37413e;
                    if (ql0Var.f37416r) {
                        pl0Var8.a();
                    }
                    if (!z12) {
                        ql0Var.requestLayout();
                    }
                    ql0 ql0Var2 = (ql0) view2;
                    if (ol0Var.f36742a.h != rl0Var.h) {
                        z17 = false;
                    }
                    ql0Var2.a(z17, false);
                    return;
                }
                return;
            case 5:
                ((r01) d1Var.f57056a).getClass();
                ((p01) ((t01) obj).R.get(i7)).getClass();
                throw null;
            case 6:
                return;
            case 7:
                lf0 lf0Var = (lf0) obj;
                ((kf0) d1Var.f57056a).a((TLObject) lf0Var.f47592c.get(i7), ((Integer) lf0Var.f47591b.get(i7)).intValue(), false);
                return;
            case 8:
                uh0 uh0Var = (uh0) obj;
                org.telegram.ui.ActionBar.g6 g6Var = uh0Var.f50405f;
                int i13 = d1Var.f57060f;
                View view3 = d1Var.f57056a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view3;
                            Drawable drawable = i2Var.getContext().getResources().getDrawable(2131232559);
                            Drawable drawable2 = i2Var.getContext().getResources().getDrawable(2131232560);
                            int i14 = org.telegram.ui.ActionBar.l6.N6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.s6.x(i2Var, drawable, i14, g6Var, mode);
                            org.telegram.ui.ActionBar.s6.x(i2Var, drawable2, org.telegram.ui.ActionBar.l6.f27995k7, g6Var, mode);
                            xp xpVar = new xp(drawable, drawable2);
                            i2Var.f29307a.l(org.telegram.messenger.id.M0(2131743803, null), false);
                            i2Var.f29308b.setImageDrawable(xpVar);
                            i2Var.f29309c = false;
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view3;
                    if (i7 == 0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131744211, null));
                        return;
                    } else if (i7 == uh0Var.f50411y) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131744289, null));
                        return;
                    } else {
                        return;
                    }
                }
                th0 th0Var = (th0) view3;
                int i15 = uh0Var.D;
                if (i7 >= i15 && i7 < uh0Var.E) {
                    sh0Var = (sh0) uh0Var.f50402b.get(i7 - i15);
                }
                int i16 = uh0Var.f50406n;
                if (i7 >= i16 && i7 < uh0Var.f50407r) {
                    sh0Var = (sh0) uh0Var.f50401a.get(i7 - i16);
                }
                if (sh0Var != null) {
                    if (th0Var.f50187e == sh0Var) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (sh0Var == uh0Var.G) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (uh0Var.I.get(sh0Var.f49915c) != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    th0Var.f50187e = sh0Var;
                    th0Var.f50184a.setText(sh0Var.f49917f);
                    if (i7 != uh0Var.E - 1) {
                        z16 = true;
                    }
                    th0Var.d = z16;
                    th0Var.f50185b.a(z14, z13);
                    th0Var.f50186c.a(z15, z13);
                    return;
                }
                return;
            case 9:
                ((rc1) d1Var.f57056a).f49452a = WallpapersListActivity.f43485i0[i7];
                return;
            case 10:
                ug.i iVar = (ug.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((ug.g) arrayList2.get(i7)).f56600a == 1) {
                    ug.h hVar = (ug.h) d1Var.f57056a;
                    hVar.f56608c.setColorFilter(new PorterDuffColorFilter(iVar.f56614e.getPixel(i7, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.f56608c.setImageDrawable(iVar.getContext().getDrawable(((ug.g) arrayList2.get(i7)).f56601b));
                    hVar.f56606a.setText(((ug.g) arrayList2.get(i7)).f56602c);
                    hVar.f56607b.setText(((ug.g) arrayList2.get(i7)).d);
                    return;
                }
                return;
            default:
                View view4 = d1Var.f57056a;
                ug.f1 f1Var = (ug.f1) obj;
                int i17 = f1Var.f56576b2;
                if (i7 >= i17 && i7 < f1Var.f56577c2) {
                    ks0 ks0Var = (ks0) view4;
                    xs0 xs0Var = (xs0) f1Var.P1.get(i7 - i17);
                    if (i7 != f1Var.f56577c2 - 1) {
                        z16 = true;
                    }
                    ks0Var.a(xs0Var, z16);
                    return;
                } else if (i7 >= f1Var.Z1 && i7 < f1Var.f56575a2) {
                    f1Var.g1(view4);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        LinearLayout linearLayout;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        org.telegram.ui.Cells.n4 n4Var;
        View view;
        int intValue;
        int i16;
        qs0 qs0Var;
        int i17 = this.f4146c;
        int i18 = 3;
        Object obj = this.d;
        switch (i17) {
            case 0:
                ?? view2 = new View(((k7) obj).getContext());
                view2.f33610a = 0;
                return new v4.d1(view2);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).f37381n2);
                ?? d1Var = new v4.d1(n0Var);
                d1Var.v = n0Var;
                n0Var.setLayoutParams(new v4.o0(-2, org.telegram.messenger.g0.L(30.0f)));
                return d1Var;
            case 2:
                return new v4.d1(((org.telegram.ui.Components.ga) obj).P1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(2, context, null);
                    frameLayout2.f32275a = h7Var;
                    h7Var.f29294r.setVisibility(8);
                    frameLayout2.addView(h7Var);
                    frameLayout = frameLayout2;
                } else {
                    frameLayout = new org.telegram.ui.Cells.g7(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new v4.o0(-1, -2));
                return new v4.d1(frameLayout);
            case 4:
                rl0 rl0Var = (rl0) obj;
                return new v4.d1(new ql0(rl0Var, rl0Var.getContext()));
            case 5:
                r01 r01Var = new r01((t01) obj, viewGroup.getContext());
                r01Var.setLayoutParams(new v4.o0(-2, -1));
                return new v4.d1(r01Var);
            case 6:
                yt ytVar = (yt) obj;
                if (i7 == 0) {
                    linearLayout = ytVar.V1;
                } else if (i7 == 2) {
                    View view3 = ytVar.W1;
                    v4.o0 o0Var = new v4.o0(-1, -2);
                    int i19 = ytVar.f28654t0;
                    ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i19;
                    ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i19;
                    view3.setLayoutParams(o0Var);
                    linearLayout = view3;
                } else {
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                    z8Var.setFixedSize(12);
                    int i20 = org.telegram.ui.ActionBar.l6.f27809a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.l6.x0(null, i20, false));
                    org.telegram.ui.ActionBar.s6.x(z8Var, colorDrawable, i20, null, PorterDuff.Mode.SRC_IN);
                    xp xpVar = new xp(colorDrawable, org.telegram.ui.ActionBar.l6.Y0(viewGroup.getContext(), 2131231230, org.telegram.ui.ActionBar.l6.f27829b7));
                    xpVar.f40453x = true;
                    z8Var.setBackgroundDrawable(xpVar);
                    linearLayout = z8Var;
                }
                return new v4.d1(linearLayout);
            case 7:
                kf0 kf0Var = new kf0(viewGroup.getContext());
                kf0Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new v4.d1(kf0Var);
            case 8:
                org.telegram.ui.ActionBar.g6 g6Var = ((uh0) obj).f50405f;
                Context context2 = viewGroup.getContext();
                int i21 = 61;
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context2, g6Var);
                            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, n4Var2, g6Var);
                            n4Var = n4Var2;
                        } else {
                            n4Var = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.f1) null);
                        }
                    } else {
                        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context2, g6Var);
                        i2Var.d = 61;
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, i2Var, g6Var);
                        n4Var = i2Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.f50185b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.s6.O(radioButton, org.telegram.ui.ActionBar.l6.f27921g7, org.telegram.ui.ActionBar.l6.h7, g6Var);
                    boolean z9 = org.telegram.messenger.id.f23157a0;
                    if (z9) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    int i22 = i10 | 16;
                    int i23 = 20;
                    if (z9) {
                        i11 = 0;
                    } else {
                        i11 = 20;
                    }
                    float f10 = i11;
                    if (!z9) {
                        i23 = 0;
                    }
                    frameLayout3.addView(radioButton, c8.ha.d(22, 22.0f, i22, f10, 0.0f, i23, 0.0f));
                    wo woVar = new wo(24, context2, g6Var);
                    frameLayout3.f50186c = woVar;
                    int i24 = org.telegram.ui.ActionBar.l6.f27865d6;
                    woVar.b(-1, i24, org.telegram.ui.ActionBar.l6.f27995k7);
                    woVar.setDrawUnchecked(false);
                    woVar.setDrawBackgroundAsArc(3);
                    boolean z10 = org.telegram.messenger.id.f23157a0;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i25 = i12 | 16;
                    int i26 = 18;
                    if (z10) {
                        i13 = 0;
                    } else {
                        i13 = 18;
                    }
                    float f11 = i13;
                    if (!z10) {
                        i26 = 0;
                    }
                    frameLayout3.addView(woVar, c8.ha.d(26, 26.0f, i25, f11, 0.0f, i26, 0.0f));
                    woVar.a(true, false);
                    TextView textView = new TextView(context2);
                    frameLayout3.f50184a = textView;
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (org.telegram.messenger.id.f23157a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView.setGravity(i14 | 16);
                    boolean z11 = org.telegram.messenger.id.f23157a0;
                    if (z11) {
                        i18 = 5;
                    }
                    int i27 = i18 | 16;
                    if (z11) {
                        i15 = 23;
                    } else {
                        i15 = 61;
                    }
                    float f12 = i15;
                    if (!z11) {
                        i21 = 23;
                    }
                    frameLayout3.addView(textView, c8.ha.d(-2, -2.0f, i27, f12, 0.0f, i21, 0.0f));
                    org.telegram.ui.ActionBar.s6.h(i24, frameLayout3, g6Var);
                    n4Var = frameLayout3;
                }
                return jg.g.r(n4Var, n4Var, -1, -2);
            case 9:
                vc1 vc1Var = (vc1) obj;
                return new v4.d1(new rc1(vc1Var.E, vc1Var.f50644c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.g6 g6Var2 = iVar.f56534a;
                if (i7 == 0) {
                    view = new ug.f(iVar, iVar.getContext());
                } else if (i7 == 2) {
                    view = new org.telegram.ui.Cells.v3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    ?? frameLayout4 = new FrameLayout(context3);
                    ImageView imageView = new ImageView(context3);
                    frameLayout4.f56608c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout4.addView(imageView, c8.ha.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    frameLayout4.f56606a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.G6, g6Var2);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView2, c8.ha.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout4.f56607b = textView3;
                    org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.f28257y6, g6Var2);
                    textView3.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView3, c8.ha.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout4;
                }
                return jg.g.r(view, view, -1, -2);
            default:
                Context context4 = viewGroup.getContext();
                ug.f1 f1Var = (ug.f1) obj;
                View h12 = f1Var.h1(context4, i7);
                if (h12 != null) {
                    return jg.g.r(h12, h12, -1, -2);
                }
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    qs0Var = new qs0(this, context4, f1Var.I0);
                                } else {
                                    yg.d0 d0Var = new yg.d0(context4, f1Var.I0);
                                    d0Var.setBackground(true);
                                    String M0 = org.telegram.messenger.id.M0(2131749662, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i28 = org.telegram.ui.ActionBar.l6.Uc;
                                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(M0, i28, 0, new Runnable(this) {
                                        public final k5 f56569b;

                                        {
                                            this.f56569b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            k5 k5Var = this.f56569b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((f1) k5Var.d).f56585l2.getParentActivity(), id.M0(2131744196, null));
                                                    return;
                                                default:
                                                    vf.c.t(((f1) k5Var.d).f56585l2.getParentActivity(), id.M0(2131746781, null));
                                                    return;
                                            }
                                        }
                                    }, null), org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131749663, "GiftPremiumPrivacyPolicy"), i28, 0, new Runnable(this) {
                                        public final k5 f56569b;

                                        {
                                            this.f56569b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            k5 k5Var = this.f56569b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((f1) k5Var.d).f56585l2.getParentActivity(), id.M0(2131744196, null));
                                                    return;
                                                default:
                                                    vf.c.t(((f1) k5Var.d).f56585l2.getParentActivity(), id.M0(2131746781, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    qs0Var = d0Var;
                                }
                            } else {
                                qs0Var = new t(context4);
                            }
                        } else {
                            qs0Var = new yh.g(context4, 1);
                        }
                    } else {
                        int i29 = org.telegram.ui.ActionBar.l6.f27809a7;
                        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context4, org.telegram.ui.ActionBar.l6.w0(i29, f1Var.I0), 0);
                        org.telegram.ui.ActionBar.s6.h(i29, y6Var, f1Var.I0);
                        qs0Var = y6Var;
                    }
                } else {
                    d61 d61Var = new d61(24, context4, this);
                    f1Var.f56584k2 = d61Var;
                    d61Var.setOrientation(1);
                    View view4 = f1Var.f56593t2;
                    if (view4 == null) {
                        f1Var.f56583j2 = new qd(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i30 = org.telegram.ui.ActionBar.l6.Ak;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.l6.w0(i30, f1Var.I0), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, f1Var.I0)));
                        f1Var.f56583j2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = f1Var.f56583j2.f57424b;
                        fVar.f57408z = i30;
                        fVar.A = org.telegram.ui.ActionBar.l6.zk;
                        fVar.b();
                        d61Var.addView(f1Var.f56583j2, c8.ha.r(160, 160, 1));
                    } else {
                        if (view4.getParent() != null) {
                            ((ViewGroup) f1Var.f56593t2.getParent()).removeView(f1Var.f56593t2);
                        }
                        f1Var.e1(d61Var);
                    }
                    if (f1Var.F2 == null) {
                        FrameLayout frameLayout5 = new FrameLayout(context4);
                        f1Var.F2 = frameLayout5;
                        frameLayout5.setClipChildren(false);
                        Integer num = f1Var.f56586m2;
                        if (num == null) {
                            intValue = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28200v6, f1Var.I0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        f1Var.G2 = new x70[2];
                        for (int i31 = 0; i31 < 2; i31++) {
                            f1Var.G2[i31] = new org.telegram.ui.Components.jb(4, context4, f1Var.I0);
                            x70 x70Var = f1Var.G2[i31];
                            if (i31 == 0) {
                                i16 = 0;
                            } else {
                                i16 = 8;
                            }
                            x70Var.setVisibility(i16);
                            f1Var.G2[i31].setTextSize(1, 16.0f);
                            f1Var.G2[i31].setTypeface(org.telegram.messenger.g0.o());
                            f1Var.G2[i31].setGravity(1);
                            org.telegram.ui.ActionBar.s6.U(f1Var.G2[i31], org.telegram.ui.ActionBar.l6.G6, f1Var.I0);
                            org.telegram.ui.ActionBar.s6.G(f1Var.G2[i31], org.telegram.ui.ActionBar.l6.J6, f1Var.I0);
                            f1Var.F2.addView(f1Var.G2[i31], c8.ha.c(-2.0f, -1));
                        }
                    }
                    if (f1Var.F2.getParent() != null) {
                        ((ViewGroup) f1Var.F2.getParent()).removeView(f1Var.F2);
                    }
                    d61Var.addView(f1Var.F2, c8.ha.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (f1Var.H2 == null) {
                        x70 x70Var2 = new x70(f1Var.getContext(), f1Var.I0);
                        f1Var.H2 = x70Var2;
                        x70Var2.setTextSize(1, 14.0f);
                        f1Var.H2.setGravity(1);
                        org.telegram.ui.ActionBar.s6.U(f1Var.H2, org.telegram.ui.ActionBar.l6.G6, f1Var.I0);
                        org.telegram.ui.ActionBar.s6.G(f1Var.H2, org.telegram.ui.ActionBar.l6.J6, f1Var.I0);
                    }
                    if (f1Var.H2.getParent() != null) {
                        ((ViewGroup) f1Var.H2.getParent()).removeView(f1Var.H2);
                    }
                    d61Var.addView(f1Var.H2, c8.ha.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    f1Var.j1(false);
                    f1Var.f56582i2 = new hi.e(context4, 5);
                    w41 w41Var = new w41(12, context4, this);
                    w41Var.setClipChildren(false);
                    w41Var.addView(f1Var.f56582i2);
                    w41Var.addView(d61Var);
                    qd qdVar = f1Var.f56583j2;
                    qs0Var = w41Var;
                    if (qdVar != null) {
                        qdVar.setStarParticlesView(f1Var.f56582i2);
                        qs0Var = w41Var;
                    }
                }
                qs0Var.setLayoutParams(new v4.o0(-1, -2));
                f1Var.d1(i7, qs0Var);
                return new v4.d1(qs0Var);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        boolean z9;
        switch (this.f4146c) {
            case 4:
                rl0 rl0Var = (rl0) this.d;
                ArrayList arrayList = rl0Var.f37739r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ql0 ql0Var = (ql0) d1Var.f57056a;
                    if (((ol0) arrayList.get(b10)).f36742a.h == rl0Var.h) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ql0Var.a(z9, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void F(v4.d1 d1Var, int i7) {
    }

    private final void G(v4.d1 d1Var, int i7) {
    }
}
