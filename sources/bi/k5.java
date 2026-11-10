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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.e61;
import org.telegram.ui.lf0;
import org.telegram.ui.ls0;
import org.telegram.ui.mf0;
import org.telegram.ui.rs0;
import org.telegram.ui.sc1;
import org.telegram.ui.th0;
import org.telegram.ui.uh0;
import org.telegram.ui.uz;
import org.telegram.ui.vh0;
import org.telegram.ui.wc1;
import org.telegram.ui.ys0;
import org.telegram.ui.zt;
public final class k5 extends oj0 {
    public final int f4143c;
    public final Object d;

    public k5(Object obj, int i7) {
        this.f4143c = i7;
        this.d = obj;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        switch (this.f4143c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i7 = d1Var.f57056f;
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
                int i10 = d1Var.f57056f;
                if (i10 != 0 && i10 != 2) {
                    return false;
                }
                return true;
            case 9:
                return true;
            case 10:
                return false;
            default:
                if (d1Var.f57056f == 1) {
                    return true;
                }
                return false;
        }
    }

    public ij E(int i7) {
        dl0 dl0Var = (dl0) this.d;
        int i10 = dl0Var.f33030w;
        if (i7 >= i10 && i7 < dl0Var.f33031x) {
            return (ij) dl0Var.f33025e.get(i7 - i10);
        }
        int i11 = dl0Var.D;
        if (i7 >= i11 && i7 < dl0Var.E) {
            return (ij) dl0Var.f33026f.get(i7 - i11);
        }
        return null;
    }

    public void H(int i7, int i10) {
        int[] iArr = ((k7) this.d).N2;
        if (iArr[0] == i7 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i7;
        iArr[1] = i10;
        f();
    }

    @Override
    public final int b() {
        switch (this.f4143c) {
            case 0:
                return ((k7) this.d).N2.length;
            case 1:
                return ((jg.q0) this.d).f16891e3.size();
            case 2:
                return 1;
            case 3:
                return ((dl0) this.d).f33028r;
            case 4:
                return ((ql0) this.d).f37327r.size();
            case 5:
                return ((s01) this.d).R.size();
            case 6:
                if (((zt) this.d).f52533b2.h()) {
                    return 1;
                }
                return 3;
            case 7:
                return ((mf0) this.d).f47943c.size();
            case 8:
                return ((vh0) this.d).h;
            case 9:
                return 12;
            case 10:
                return ((ug.i) this.d).d.size();
            default:
                return ((ug.f1) this.d).f56574a2;
        }
    }

    @Override
    public long c(int i7) {
        th0 th0Var;
        switch (this.f4143c) {
            case 8:
                vh0 vh0Var = (vh0) this.d;
                int i10 = vh0Var.D;
                if (i7 >= i10 && i7 < vh0Var.E) {
                    th0Var = (th0) vh0Var.f50728b.get(i7 - i10);
                } else {
                    int i11 = vh0Var.f50732n;
                    if (i7 >= i11 && i7 < vh0Var.f50733r) {
                        th0Var = (th0) vh0Var.f50727a.get(i7 - i11);
                    } else {
                        th0Var = null;
                    }
                }
                if (th0Var != null) {
                    return th0Var.f50283c;
                }
                vh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == vh0Var.f50737y) {
                    return 2L;
                }
                if (i7 == vh0Var.f50734s) {
                    return 3L;
                }
                if (i7 == vh0Var.f50735w) {
                    return 4L;
                }
                if (i7 == vh0Var.f50736x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i7);
        }
    }

    @Override
    public int d(int i7) {
        switch (this.f4143c) {
            case 2:
                return i7;
            case 3:
                dl0 dl0Var = (dl0) this.d;
                if (i7 != dl0Var.f33029s && i7 != dl0Var.f33032y) {
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
                vh0 vh0Var = (vh0) this.d;
                if (i7 >= vh0Var.D && i7 < vh0Var.E) {
                    return 0;
                }
                vh0Var.getClass();
                if (i7 != 0 && i7 != vh0Var.f50737y) {
                    if (i7 == vh0Var.f50734s) {
                        return 2;
                    }
                    if (i7 != vh0Var.f50735w && i7 != vh0Var.f50736x) {
                        return 0;
                    }
                    return 3;
                }
                return 1;
            case 10:
                return ((ug.g) ((ug.i) this.d).d.get(i7)).f56599a;
            case 11:
                ug.f1 f1Var = (ug.f1) this.d;
                if (i7 != f1Var.f56575b2) {
                    if (i7 >= f1Var.f56576c2 && i7 < f1Var.d2) {
                        return f1Var.f1();
                    }
                    if (i7 >= f1Var.f56577e2 && i7 < f1Var.f56578f2) {
                        return 1;
                    }
                    if (i7 == f1Var.f56579g2) {
                        return 2;
                    }
                    if (i7 == f1Var.f56580h2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == f1Var.f56581i2) {
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
        int i10 = this.f4143c;
        float f10 = 0.0f;
        th0 th0Var = null;
        boolean z16 = false;
        boolean z17 = true;
        Object obj = this.d;
        switch (i10) {
            case 0:
                int[] iArr = ((k7) obj).N2;
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) d1Var.f57052a;
                int i11 = iArr[(iArr.length - 1) - i7];
                if (eaVar.f33196a != i11) {
                    eaVar.f33196a = i11;
                    eaVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((jg.p0) d1Var).v.setData((jg.o0) ((jg.q0) obj).f16891e3.get(i7));
                return;
            case 2:
                return;
            case 3:
                dl0 dl0Var = (dl0) obj;
                uz uzVar = dl0Var.J;
                int i12 = d1Var.f57056f;
                View view = d1Var.f57052a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 == dl0Var.f33029s) {
                        String M03 = org.telegram.messenger.id.M0(2131751344, null);
                        if (x3Var.getText().equals(M03)) {
                            if (dl0Var.H) {
                                M02 = org.telegram.messenger.id.M0(2131747433, null);
                            } else {
                                M02 = org.telegram.messenger.id.M0(2131746053, null);
                            }
                            boolean z18 = dl0Var.H;
                            org.telegram.ui.Cells.w3 w3Var = x3Var.f30892b;
                            w3Var.c(M02, true, z18);
                            w3Var.setVisibility(0);
                            return;
                        }
                        if (dl0Var.H) {
                            M0 = org.telegram.messenger.id.M0(2131747433, null);
                        } else {
                            M0 = org.telegram.messenger.id.M0(2131746053, null);
                        }
                        x3Var.b(M03, M0, new cl0(this));
                        return;
                    } else if (i7 == dl0Var.f33032y) {
                        x3Var.b(org.telegram.messenger.id.M0(2131746362, null), org.telegram.messenger.id.M0(2131745495, null), new la0(this, 7));
                        return;
                    } else {
                        return;
                    }
                }
                ij E = E(i7);
                if (E != null) {
                    if (dl0Var.I.i() && i7 >= dl0Var.f33030w && i7 < dl0Var.f33031x) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i12 == 1) {
                        al0 al0Var = (al0) view;
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, al0Var, null);
                        org.telegram.ui.Cells.h7 h7Var = al0Var.f31878a;
                        if (h7Var.getMessage() == null) {
                            e13 = 0;
                        } else {
                            e13 = h7Var.getMessage().e1();
                        }
                        h7Var.c(E, true);
                        int e14 = h7Var.getMessage().e1();
                        uzVar.f50595a = ij.B0(h7Var.getMessage().f23266k);
                        uzVar.f50596b = e14;
                        boolean f11 = dl0Var.I.f(uzVar);
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
                        uzVar.f50595a = ij.B0(g7Var.getMessage().f23266k);
                        uzVar.f50596b = e15;
                        boolean f12 = dl0Var.I.f(uzVar);
                        if (e12 == E.e1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g7Var.e(f12, z10);
                        if (e12 == E.e1()) {
                            z16 = true;
                        }
                        if (g7Var.f29200d0 != z9) {
                            g7Var.f29200d0 = z9;
                            if (!z16) {
                                if (z9) {
                                    f10 = 1.0f;
                                }
                                g7Var.f29202e0 = f10;
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
                View view2 = d1Var.f57052a;
                ql0 ql0Var = (ql0) obj;
                ArrayList arrayList = ql0Var.f37327r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    nl0 nl0Var = (nl0) arrayList.get(i7);
                    pl0 pl0Var = (pl0) view2;
                    ch.o0 o0Var = pl0Var.d;
                    if (o0Var != null && o0Var.equals(nl0Var.f36332a)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = nl0Var.f36332a.g();
                        tL_reactionCount.count = nl0Var.f36333b;
                        ql0 ql0Var2 = pl0Var.f37016s;
                        ol0 ol0Var = new ol0(pl0Var, ql0Var2.f37321a, pl0Var, tL_reactionCount, ql0Var2.f37323c);
                        pl0Var.f37009a = ol0Var;
                        ol0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        ol0 ol0Var2 = pl0Var.f37009a;
                        ol0Var2.f6331p = true;
                        ol0Var2.R = true;
                    } else {
                        pl0Var.f37009a.v = nl0Var.f36333b;
                    }
                    pl0Var.d = nl0Var.f36332a;
                    if (!z12) {
                        ol0 ol0Var3 = pl0Var.f37009a;
                        ol0Var3.f6319e = ol0Var3.f6340z;
                    }
                    pl0Var.f37009a.f6340z = org.telegram.messenger.g0.L(44.33f);
                    pl0Var.f37009a.f6335t = !TextUtils.isEmpty(nl0Var.f36334c);
                    ol0 ol0Var4 = pl0Var.f37009a;
                    boolean z19 = ol0Var4.f6335t;
                    org.telegram.ui.Components.h6 h6Var = ol0Var4.F;
                    if (z19) {
                        h6Var.t(org.telegram.messenger.i6.m(nl0Var.f36334c, h6Var.f34185a.getFontMetricsInt(), false, null, 0), !z12, true);
                    } else if (h6Var != null) {
                        h6Var.t("", !z12, true);
                    }
                    ol0 ol0Var5 = pl0Var.f37009a;
                    Integer.toString(nl0Var.f36333b);
                    ol0Var5.getClass();
                    pl0Var.f37009a.E.c(nl0Var.f36333b, !z12);
                    ol0 ol0Var6 = pl0Var.f37009a;
                    if (ol0Var6.E != null && (ol0Var6.v > 0 || ol0Var6.f6335t)) {
                        float f13 = ol0Var6.f6340z;
                        int ceil = (int) Math.ceil(bqVar.f32331m);
                        if (pl0Var.f37009a.f6335t) {
                            f10 = 4.0f;
                        }
                        ol0Var6.f6340z = (int) (org.telegram.messenger.g0.L(f10) + ceil + pl0Var.f37009a.F.d + f13);
                    }
                    if (z12) {
                        ol0 ol0Var7 = pl0Var.f37009a;
                        ol0Var7.f6319e = ol0Var7.f6340z;
                    }
                    pl0Var.f37009a.A = org.telegram.messenger.g0.L(28.0f);
                    ol0 ol0Var8 = pl0Var.f37009a;
                    ol0Var8.f6330o = pl0Var.f37012e;
                    if (pl0Var.f37015r) {
                        ol0Var8.a();
                    }
                    if (!z12) {
                        pl0Var.requestLayout();
                    }
                    pl0 pl0Var2 = (pl0) view2;
                    if (nl0Var.f36332a.h != ql0Var.h) {
                        z17 = false;
                    }
                    pl0Var2.a(z17, false);
                    return;
                }
                return;
            case 5:
                ((q01) d1Var.f57052a).getClass();
                ((o01) ((s01) obj).R.get(i7)).getClass();
                throw null;
            case 6:
                return;
            case 7:
                mf0 mf0Var = (mf0) obj;
                ((lf0) d1Var.f57052a).a((TLObject) mf0Var.f47943c.get(i7), ((Integer) mf0Var.f47942b.get(i7)).intValue(), false);
                return;
            case 8:
                vh0 vh0Var = (vh0) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = vh0Var.f50731f;
                int i13 = d1Var.f57056f;
                View view3 = d1Var.f57052a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view3;
                            Drawable drawable = i2Var.getContext().getResources().getDrawable(2131232559);
                            Drawable drawable2 = i2Var.getContext().getResources().getDrawable(2131232560);
                            int i14 = org.telegram.ui.ActionBar.m6.N6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.t6.x(i2Var, drawable, i14, h6Var2, mode);
                            org.telegram.ui.ActionBar.t6.x(i2Var, drawable2, org.telegram.ui.ActionBar.m6.f28020k7, h6Var2, mode);
                            xp xpVar = new xp(drawable, drawable2);
                            i2Var.f29318a.l(org.telegram.messenger.id.M0(2131743803, null), false);
                            i2Var.f29319b.setImageDrawable(xpVar);
                            i2Var.f29320c = false;
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view3;
                    if (i7 == 0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131744211, null));
                        return;
                    } else if (i7 == vh0Var.f50737y) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131744289, null));
                        return;
                    } else {
                        return;
                    }
                }
                uh0 uh0Var = (uh0) view3;
                int i15 = vh0Var.D;
                if (i7 >= i15 && i7 < vh0Var.E) {
                    th0Var = (th0) vh0Var.f50728b.get(i7 - i15);
                }
                int i16 = vh0Var.f50732n;
                if (i7 >= i16 && i7 < vh0Var.f50733r) {
                    th0Var = (th0) vh0Var.f50727a.get(i7 - i16);
                }
                if (th0Var != null) {
                    if (uh0Var.f50506e == th0Var) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (th0Var == vh0Var.G) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (vh0Var.I.get(th0Var.f50283c) != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    uh0Var.f50506e = th0Var;
                    uh0Var.f50503a.setText(th0Var.f50285f);
                    if (i7 != vh0Var.E - 1) {
                        z16 = true;
                    }
                    uh0Var.d = z16;
                    uh0Var.f50504b.a(z14, z13);
                    uh0Var.f50505c.a(z15, z13);
                    return;
                }
                return;
            case 9:
                ((sc1) d1Var.f57052a).f49830a = WallpapersListActivity.f43487i0[i7];
                return;
            case 10:
                ug.i iVar = (ug.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((ug.g) arrayList2.get(i7)).f56599a == 1) {
                    ug.h hVar = (ug.h) d1Var.f57052a;
                    hVar.f56607c.setColorFilter(new PorterDuffColorFilter(iVar.f56613e.getPixel(i7, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.f56607c.setImageDrawable(iVar.getContext().getDrawable(((ug.g) arrayList2.get(i7)).f56600b));
                    hVar.f56605a.setText(((ug.g) arrayList2.get(i7)).f56601c);
                    hVar.f56606b.setText(((ug.g) arrayList2.get(i7)).d);
                    return;
                }
                return;
            default:
                View view4 = d1Var.f57052a;
                ug.f1 f1Var = (ug.f1) obj;
                int i17 = f1Var.f56577e2;
                if (i7 >= i17 && i7 < f1Var.f56578f2) {
                    ls0 ls0Var = (ls0) view4;
                    ys0 ys0Var = (ys0) f1Var.S1.get(i7 - i17);
                    if (i7 != f1Var.f56578f2 - 1) {
                        z16 = true;
                    }
                    ls0Var.a(ys0Var, z16);
                    return;
                } else if (i7 >= f1Var.f56576c2 && i7 < f1Var.d2) {
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
        rs0 rs0Var;
        int i17 = this.f4143c;
        int i18 = 3;
        Object obj = this.d;
        switch (i17) {
            case 0:
                ?? view2 = new View(((k7) obj).getContext());
                view2.f33196a = 0;
                return new v4.d1(view2);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).f36980n2);
                ?? d1Var = new v4.d1(n0Var);
                d1Var.v = n0Var;
                n0Var.setLayoutParams(new v4.o0(-2, org.telegram.messenger.g0.L(30.0f)));
                return d1Var;
            case 2:
                return new v4.d1(((org.telegram.ui.Components.fa) obj).S1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(2, context, null);
                    frameLayout2.f31878a = h7Var;
                    h7Var.f29305r.setVisibility(8);
                    frameLayout2.addView(h7Var);
                    frameLayout = frameLayout2;
                } else {
                    frameLayout = new org.telegram.ui.Cells.g7(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new v4.o0(-1, -2));
                return new v4.d1(frameLayout);
            case 4:
                ql0 ql0Var = (ql0) obj;
                return new v4.d1(new pl0(ql0Var, ql0Var.getContext()));
            case 5:
                q01 q01Var = new q01((s01) obj, viewGroup.getContext());
                q01Var.setLayoutParams(new v4.o0(-2, -1));
                return new v4.d1(q01Var);
            case 6:
                zt ztVar = (zt) obj;
                if (i7 == 0) {
                    linearLayout = ztVar.Y1;
                } else if (i7 == 2) {
                    View view3 = ztVar.Z1;
                    v4.o0 o0Var = new v4.o0(-1, -2);
                    int i19 = ztVar.f28705t0;
                    ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i19;
                    ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i19;
                    view3.setLayoutParams(o0Var);
                    linearLayout = view3;
                } else {
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                    z8Var.setFixedSize(12);
                    int i20 = org.telegram.ui.ActionBar.m6.f27834a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, i20, false));
                    org.telegram.ui.ActionBar.t6.x(z8Var, colorDrawable, i20, null, PorterDuff.Mode.SRC_IN);
                    xp xpVar = new xp(colorDrawable, org.telegram.ui.ActionBar.m6.Y0(viewGroup.getContext(), 2131231230, org.telegram.ui.ActionBar.m6.f27854b7));
                    xpVar.f40383x = true;
                    z8Var.setBackgroundDrawable(xpVar);
                    linearLayout = z8Var;
                }
                return new v4.d1(linearLayout);
            case 7:
                lf0 lf0Var = new lf0(viewGroup.getContext());
                lf0Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new v4.d1(lf0Var);
            case 8:
                org.telegram.ui.ActionBar.h6 h6Var = ((vh0) obj).f50731f;
                Context context2 = viewGroup.getContext();
                int i21 = 61;
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context2, h6Var);
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, n4Var2, h6Var);
                            n4Var = n4Var2;
                        } else {
                            n4Var = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.f1) null);
                        }
                    } else {
                        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context2, h6Var);
                        i2Var.d = 61;
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, i2Var, h6Var);
                        n4Var = i2Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.f50504b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.t6.O(radioButton, org.telegram.ui.ActionBar.m6.f27946g7, org.telegram.ui.ActionBar.m6.h7, h6Var);
                    boolean z9 = org.telegram.messenger.id.f23161a0;
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
                    wo woVar = new wo(24, context2, h6Var);
                    frameLayout3.f50505c = woVar;
                    int i24 = org.telegram.ui.ActionBar.m6.f27890d6;
                    woVar.b(-1, i24, org.telegram.ui.ActionBar.m6.f28020k7);
                    woVar.setDrawUnchecked(false);
                    woVar.setDrawBackgroundAsArc(3);
                    boolean z10 = org.telegram.messenger.id.f23161a0;
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
                    frameLayout3.f50503a = textView;
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (org.telegram.messenger.id.f23161a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView.setGravity(i14 | 16);
                    boolean z11 = org.telegram.messenger.id.f23161a0;
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
                    org.telegram.ui.ActionBar.t6.h(i24, frameLayout3, h6Var);
                    n4Var = frameLayout3;
                }
                return jg.g.r(n4Var, n4Var, -1, -2);
            case 9:
                wc1 wc1Var = (wc1) obj;
                return new v4.d1(new sc1(wc1Var.E, wc1Var.f50991c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = iVar.f56533a;
                if (i7 == 0) {
                    view = new ug.f(iVar, iVar.getContext());
                } else if (i7 == 2) {
                    view = new org.telegram.ui.Cells.v3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    ?? frameLayout4 = new FrameLayout(context3);
                    ImageView imageView = new ImageView(context3);
                    frameLayout4.f56607c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout4.addView(imageView, c8.ha.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    frameLayout4.f56605a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.G6, h6Var2);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView2, c8.ha.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout4.f56606b = textView3;
                    org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f28282y6, h6Var2);
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
                                    rs0Var = new rs0(this, context4, f1Var.I0);
                                } else {
                                    yg.d0 d0Var = new yg.d0(context4, f1Var.I0);
                                    d0Var.setBackground(true);
                                    String M0 = org.telegram.messenger.id.M0(2131749662, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i28 = org.telegram.ui.ActionBar.m6.Uc;
                                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(M0, i28, 0, new Runnable(this) {
                                        public final k5 f56568b;

                                        {
                                            this.f56568b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            k5 k5Var = this.f56568b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((f1) k5Var.d).f56587o2.getParentActivity(), id.M0(2131744196, null));
                                                    return;
                                                default:
                                                    vf.c.t(((f1) k5Var.d).f56587o2.getParentActivity(), id.M0(2131746781, null));
                                                    return;
                                            }
                                        }
                                    }, null), org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131749663, "GiftPremiumPrivacyPolicy"), i28, 0, new Runnable(this) {
                                        public final k5 f56568b;

                                        {
                                            this.f56568b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            k5 k5Var = this.f56568b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((f1) k5Var.d).f56587o2.getParentActivity(), id.M0(2131744196, null));
                                                    return;
                                                default:
                                                    vf.c.t(((f1) k5Var.d).f56587o2.getParentActivity(), id.M0(2131746781, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    rs0Var = d0Var;
                                }
                            } else {
                                rs0Var = new t(context4);
                            }
                        } else {
                            rs0Var = new yh.g(context4, 1);
                        }
                    } else {
                        int i29 = org.telegram.ui.ActionBar.m6.f27834a7;
                        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context4, org.telegram.ui.ActionBar.m6.w0(i29, f1Var.I0), 0);
                        org.telegram.ui.ActionBar.t6.h(i29, y6Var, f1Var.I0);
                        rs0Var = y6Var;
                    }
                } else {
                    e61 e61Var = new e61(24, context4, this);
                    f1Var.f56586n2 = e61Var;
                    e61Var.setOrientation(1);
                    View view4 = f1Var.f56595w2;
                    if (view4 == null) {
                        f1Var.f56585m2 = new qd(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i30 = org.telegram.ui.ActionBar.m6.Ak;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.w0(i30, f1Var.I0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, f1Var.I0)));
                        f1Var.f56585m2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = f1Var.f56585m2.f57420b;
                        fVar.f57404z = i30;
                        fVar.A = org.telegram.ui.ActionBar.m6.zk;
                        fVar.b();
                        e61Var.addView(f1Var.f56585m2, c8.ha.r(160, 160, 1));
                    } else {
                        if (view4.getParent() != null) {
                            ((ViewGroup) f1Var.f56595w2.getParent()).removeView(f1Var.f56595w2);
                        }
                        f1Var.e1(e61Var);
                    }
                    if (f1Var.I2 == null) {
                        FrameLayout frameLayout5 = new FrameLayout(context4);
                        f1Var.I2 = frameLayout5;
                        frameLayout5.setClipChildren(false);
                        Integer num = f1Var.f56588p2;
                        if (num == null) {
                            intValue = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28225v6, f1Var.I0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        f1Var.J2 = new w70[2];
                        for (int i31 = 0; i31 < 2; i31++) {
                            f1Var.J2[i31] = new org.telegram.ui.Components.ib(4, context4, f1Var.I0);
                            w70 w70Var = f1Var.J2[i31];
                            if (i31 == 0) {
                                i16 = 0;
                            } else {
                                i16 = 8;
                            }
                            w70Var.setVisibility(i16);
                            f1Var.J2[i31].setTextSize(1, 16.0f);
                            f1Var.J2[i31].setTypeface(org.telegram.messenger.g0.o());
                            f1Var.J2[i31].setGravity(1);
                            org.telegram.ui.ActionBar.t6.U(f1Var.J2[i31], org.telegram.ui.ActionBar.m6.G6, f1Var.I0);
                            org.telegram.ui.ActionBar.t6.G(f1Var.J2[i31], org.telegram.ui.ActionBar.m6.J6, f1Var.I0);
                            f1Var.I2.addView(f1Var.J2[i31], c8.ha.c(-2.0f, -1));
                        }
                    }
                    if (f1Var.I2.getParent() != null) {
                        ((ViewGroup) f1Var.I2.getParent()).removeView(f1Var.I2);
                    }
                    e61Var.addView(f1Var.I2, c8.ha.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (f1Var.K2 == null) {
                        w70 w70Var2 = new w70(f1Var.getContext(), f1Var.I0);
                        f1Var.K2 = w70Var2;
                        w70Var2.setTextSize(1, 14.0f);
                        f1Var.K2.setGravity(1);
                        org.telegram.ui.ActionBar.t6.U(f1Var.K2, org.telegram.ui.ActionBar.m6.G6, f1Var.I0);
                        org.telegram.ui.ActionBar.t6.G(f1Var.K2, org.telegram.ui.ActionBar.m6.J6, f1Var.I0);
                    }
                    if (f1Var.K2.getParent() != null) {
                        ((ViewGroup) f1Var.K2.getParent()).removeView(f1Var.K2);
                    }
                    e61Var.addView(f1Var.K2, c8.ha.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    f1Var.j1(false);
                    f1Var.f56584l2 = new hi.e(context4, 5);
                    w41 w41Var = new w41(12, context4, this);
                    w41Var.setClipChildren(false);
                    w41Var.addView(f1Var.f56584l2);
                    w41Var.addView(e61Var);
                    qd qdVar = f1Var.f56585m2;
                    rs0Var = w41Var;
                    if (qdVar != null) {
                        qdVar.setStarParticlesView(f1Var.f56584l2);
                        rs0Var = w41Var;
                    }
                }
                rs0Var.setLayoutParams(new v4.o0(-1, -2));
                f1Var.d1(i7, rs0Var);
                return new v4.d1(rs0Var);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        boolean z9;
        switch (this.f4143c) {
            case 4:
                ql0 ql0Var = (ql0) this.d;
                ArrayList arrayList = ql0Var.f37327r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    pl0 pl0Var = (pl0) d1Var.f57052a;
                    if (((nl0) arrayList.get(b10)).f36332a.h == ql0Var.h) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    pl0Var.a(z9, false);
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
