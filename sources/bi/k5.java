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
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.c61;
import org.telegram.ui.if0;
import org.telegram.ui.is0;
import org.telegram.ui.jf0;
import org.telegram.ui.nc1;
import org.telegram.ui.os0;
import org.telegram.ui.qh0;
import org.telegram.ui.rc1;
import org.telegram.ui.rh0;
import org.telegram.ui.rz;
import org.telegram.ui.sh0;
import org.telegram.ui.vs0;
import org.telegram.ui.wt;
public final class k5 extends oj0 {
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
                int i7 = d1Var.f56956f;
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
                int i10 = d1Var.f56956f;
                if (i10 != 0 && i10 != 2) {
                    return false;
                }
                return true;
            case 9:
                return true;
            case 10:
                return false;
            default:
                if (d1Var.f56956f == 1) {
                    return true;
                }
                return false;
        }
    }

    public ij E(int i7) {
        dl0 dl0Var = (dl0) this.d;
        int i10 = dl0Var.f33006w;
        if (i7 >= i10 && i7 < dl0Var.f33007x) {
            return (ij) dl0Var.f33001e.get(i7 - i10);
        }
        int i11 = dl0Var.D;
        if (i7 >= i11 && i7 < dl0Var.E) {
            return (ij) dl0Var.f33002f.get(i7 - i11);
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
                return ((jg.q0) this.d).f16888e3.size();
            case 2:
                return 1;
            case 3:
                return ((dl0) this.d).f33004r;
            case 4:
                return ((ql0) this.d).f37338r.size();
            case 5:
                return ((r01) this.d).R.size();
            case 6:
                if (((wt) this.d).Y1.h()) {
                    return 1;
                }
                return 3;
            case 7:
                return ((jf0) this.d).f46952c.size();
            case 8:
                return ((sh0) this.d).h;
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
        qh0 qh0Var;
        switch (this.f4146c) {
            case 8:
                sh0 sh0Var = (sh0) this.d;
                int i10 = sh0Var.D;
                if (i7 >= i10 && i7 < sh0Var.E) {
                    qh0Var = (qh0) sh0Var.f49768b.get(i7 - i10);
                } else {
                    int i11 = sh0Var.f49772n;
                    if (i7 >= i11 && i7 < sh0Var.f49773r) {
                        qh0Var = (qh0) sh0Var.f49767a.get(i7 - i11);
                    } else {
                        qh0Var = null;
                    }
                }
                if (qh0Var != null) {
                    return qh0Var.f49235c;
                }
                sh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == sh0Var.f49777y) {
                    return 2L;
                }
                if (i7 == sh0Var.f49774s) {
                    return 3L;
                }
                if (i7 == sh0Var.f49775w) {
                    return 4L;
                }
                if (i7 == sh0Var.f49776x) {
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
                dl0 dl0Var = (dl0) this.d;
                if (i7 != dl0Var.f33005s && i7 != dl0Var.f33008y) {
                    ij E = E(i7);
                    if (E == null || !E.J3()) {
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
                sh0 sh0Var = (sh0) this.d;
                if (i7 >= sh0Var.D && i7 < sh0Var.E) {
                    return 0;
                }
                sh0Var.getClass();
                if (i7 != 0 && i7 != sh0Var.f49777y) {
                    if (i7 == sh0Var.f49774s) {
                        return 2;
                    }
                    if (i7 != sh0Var.f49775w && i7 != sh0Var.f49776x) {
                        return 0;
                    }
                    return 3;
                }
                return 1;
            case 10:
                return ((ug.g) ((ug.i) this.d).d.get(i7)).f56496a;
            case 11:
                ug.f1 f1Var = (ug.f1) this.d;
                if (i7 != f1Var.Y1) {
                    if (i7 >= f1Var.Z1 && i7 < f1Var.f56471a2) {
                        return f1Var.f1();
                    }
                    if (i7 >= f1Var.f56472b2 && i7 < f1Var.f56473c2) {
                        return 1;
                    }
                    if (i7 == f1Var.d2) {
                        return 2;
                    }
                    if (i7 == f1Var.f56474e2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == f1Var.f56475f2) {
                        return 5;
                    }
                }
                return 0;
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int f12;
        boolean z10;
        int f13;
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
        qh0 qh0Var = null;
        boolean z16 = true;
        Object obj = this.d;
        switch (i10) {
            case 0:
                int[] iArr = ((k7) obj).K2;
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) d1Var.f56952a;
                int i11 = iArr[(iArr.length - 1) - i7];
                if (faVar.f33491a != i11) {
                    faVar.f33491a = i11;
                    faVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((jg.p0) d1Var).v.setData((jg.o0) ((jg.q0) obj).f16888e3.get(i7));
                return;
            case 2:
                return;
            case 3:
                dl0 dl0Var = (dl0) obj;
                rz rzVar = dl0Var.J;
                int i12 = d1Var.f56956f;
                View view = d1Var.f56952a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 == dl0Var.f33005s) {
                        String M03 = org.telegram.messenger.hd.M0(2131751345, null);
                        if (x3Var.getText().equals(M03)) {
                            if (dl0Var.H) {
                                M02 = org.telegram.messenger.hd.M0(2131747432, null);
                            } else {
                                M02 = org.telegram.messenger.hd.M0(2131746054, null);
                            }
                            boolean z17 = dl0Var.H;
                            org.telegram.ui.Cells.w3 w3Var = x3Var.f30872b;
                            w3Var.c(M02, true, z17);
                            w3Var.setVisibility(0);
                            return;
                        }
                        if (dl0Var.H) {
                            M0 = org.telegram.messenger.hd.M0(2131747432, null);
                        } else {
                            M0 = org.telegram.messenger.hd.M0(2131746054, null);
                        }
                        x3Var.b(M03, M0, new cl0(this));
                        return;
                    } else if (i7 == dl0Var.f33008y) {
                        x3Var.b(org.telegram.messenger.hd.M0(2131746361, null), org.telegram.messenger.hd.M0(2131745496, null), new la0(this, 7));
                        return;
                    } else {
                        return;
                    }
                }
                ij E = E(i7);
                if (E != null) {
                    if (dl0Var.I.i() && i7 >= dl0Var.f33006w && i7 < dl0Var.f33007x) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i12 == 1) {
                        al0 al0Var = (al0) view;
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, al0Var, null);
                        org.telegram.ui.Cells.h7 h7Var = al0Var.f31846a;
                        if (h7Var.getMessage() == null) {
                            f13 = 0;
                        } else {
                            f13 = h7Var.getMessage().f1();
                        }
                        h7Var.c(E, true);
                        int f14 = h7Var.getMessage().f1();
                        rzVar.f49590a = ij.B0(h7Var.getMessage().f23237k);
                        rzVar.f49591b = f14;
                        boolean f11 = dl0Var.I.f(rzVar);
                        if (f13 == E.f1()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        h7Var.b(f11, z11);
                        if (f13 != E.f1()) {
                            z16 = false;
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
                            f12 = 0;
                        } else {
                            f12 = g7Var.getMessage().f1();
                        }
                        g7Var.f(E, true);
                        int f15 = g7Var.getMessage().f1();
                        rzVar.f49590a = ij.B0(g7Var.getMessage().f23237k);
                        rzVar.f49591b = f15;
                        boolean f16 = dl0Var.I.f(rzVar);
                        if (f12 == E.f1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g7Var.e(f16, z10);
                        if (f12 != E.f1()) {
                            z16 = false;
                        }
                        if (g7Var.f29181d0 != z9) {
                            g7Var.f29181d0 = z9;
                            if (!z16) {
                                if (z9) {
                                    f10 = 1.0f;
                                }
                                g7Var.f29183e0 = f10;
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
                View view2 = d1Var.f56952a;
                ql0 ql0Var = (ql0) obj;
                ArrayList arrayList = ql0Var.f37338r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    nl0 nl0Var = (nl0) arrayList.get(i7);
                    pl0 pl0Var = (pl0) view2;
                    ch.o0 o0Var = pl0Var.d;
                    if (o0Var != null && o0Var.equals(nl0Var.f36329a)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = nl0Var.f36329a.g();
                        tL_reactionCount.count = nl0Var.f36330b;
                        ql0 ql0Var2 = pl0Var.f36974s;
                        ol0 ol0Var = new ol0(pl0Var, ql0Var2.f37332a, pl0Var, tL_reactionCount, ql0Var2.f37334c);
                        pl0Var.f36967a = ol0Var;
                        ol0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        ol0 ol0Var2 = pl0Var.f36967a;
                        ol0Var2.f6328p = true;
                        ol0Var2.R = true;
                    } else {
                        pl0Var.f36967a.v = nl0Var.f36330b;
                    }
                    pl0Var.d = nl0Var.f36329a;
                    if (!z12) {
                        ol0 ol0Var3 = pl0Var.f36967a;
                        ol0Var3.f6316e = ol0Var3.f6337z;
                    }
                    pl0Var.f36967a.f6337z = org.telegram.messenger.g0.L(44.33f);
                    pl0Var.f36967a.f6332t = !TextUtils.isEmpty(nl0Var.f36331c);
                    ol0 ol0Var4 = pl0Var.f36967a;
                    boolean z18 = ol0Var4.f6332t;
                    org.telegram.ui.Components.i6 i6Var = ol0Var4.F;
                    if (z18) {
                        i6Var.t(org.telegram.messenger.i6.m(nl0Var.f36331c, i6Var.f34475a.getFontMetricsInt(), false, null, 0), !z12, true);
                    } else if (i6Var != null) {
                        i6Var.t("", !z12, true);
                    }
                    ol0 ol0Var5 = pl0Var.f36967a;
                    Integer.toString(nl0Var.f36330b);
                    ol0Var5.getClass();
                    pl0Var.f36967a.E.c(nl0Var.f36330b, !z12);
                    ol0 ol0Var6 = pl0Var.f36967a;
                    if (ol0Var6.E != null && (ol0Var6.v > 0 || ol0Var6.f6332t)) {
                        float f17 = ol0Var6.f6337z;
                        int ceil = (int) Math.ceil(bqVar.f32260m);
                        if (pl0Var.f36967a.f6332t) {
                            f10 = 4.0f;
                        }
                        ol0Var6.f6337z = (int) (org.telegram.messenger.g0.L(f10) + ceil + pl0Var.f36967a.F.d + f17);
                    }
                    if (z12) {
                        ol0 ol0Var7 = pl0Var.f36967a;
                        ol0Var7.f6316e = ol0Var7.f6337z;
                    }
                    pl0Var.f36967a.A = org.telegram.messenger.g0.L(28.0f);
                    ol0 ol0Var8 = pl0Var.f36967a;
                    ol0Var8.f6327o = pl0Var.f36970e;
                    if (pl0Var.f36973r) {
                        ol0Var8.a();
                    }
                    if (!z12) {
                        pl0Var.requestLayout();
                    }
                    pl0 pl0Var2 = (pl0) view2;
                    if (nl0Var.f36329a.h != ql0Var.h) {
                        z16 = false;
                    }
                    pl0Var2.a(z16, false);
                    return;
                }
                return;
            case 5:
                p01 p01Var = (p01) d1Var.f56952a;
                n01 n01Var = (n01) ((r01) obj).R.get(i7);
                org.telegram.ui.Components.l9 l9Var = p01Var.f36718a;
                boolean equals = n01Var.f36123a.equals(p01Var.f36721e);
                r01 r01Var = p01Var.f36725s;
                if (r01Var.T >= 1.0f && r01Var.f37464g0 == null) {
                    p01Var.setScaleX(1.0f);
                    p01Var.setScaleY(1.0f);
                    p01Var.setAlpha(1.0f);
                }
                p01Var.f36721e = n01Var.f36123a;
                String valueOf = String.valueOf(n01Var.f36125c);
                p01Var.f36722f = valueOf;
                p01Var.setContentDescription(valueOf);
                if (!equals) {
                    l9Var.setAnimatedEmojiDrawable(null);
                    l9Var.b();
                    p01Var.h = null;
                    p01Var.f36723n = 0;
                    if (n01Var.f36124b.icon_emoji_id != 0) {
                        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(3, r01Var.f37453a, n01Var.f36124b.icon_emoji_id);
                        p01Var.h = i5Var;
                        l9Var.setAnimatedEmojiDrawable(i5Var);
                    } else {
                        l9Var.setImageDrawable(new qg.a(n01Var.f36124b.icon_color));
                    }
                }
                p01Var.a(equals);
                p01Var.requestLayout();
                p01Var.invalidate();
                return;
            case 6:
                return;
            case 7:
                jf0 jf0Var = (jf0) obj;
                ((if0) d1Var.f56952a).a((TLObject) jf0Var.f46952c.get(i7), ((Integer) jf0Var.f46951b.get(i7)).intValue(), false);
                return;
            case 8:
                sh0 sh0Var = (sh0) obj;
                org.telegram.ui.ActionBar.f6 f6Var = sh0Var.f49771f;
                int i13 = d1Var.f56956f;
                View view3 = d1Var.f56952a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view3;
                            Drawable drawable = i2Var.getContext().getResources().getDrawable(2131232559);
                            Drawable drawable2 = i2Var.getContext().getResources().getDrawable(2131232560);
                            int i14 = org.telegram.ui.ActionBar.k6.N6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.r6.y(i2Var, drawable, i14, f6Var, mode);
                            org.telegram.ui.ActionBar.r6.y(i2Var, drawable2, org.telegram.ui.ActionBar.k6.f27978k7, f6Var, mode);
                            xp xpVar = new xp(drawable, drawable2);
                            i2Var.f29299a.l(org.telegram.messenger.hd.M0(2131743804, null), false);
                            i2Var.f29300b.setImageDrawable(xpVar);
                            i2Var.f29301c = false;
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view3;
                    if (i7 == 0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131744212, null));
                        return;
                    } else if (i7 == sh0Var.f49777y) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131744290, null));
                        return;
                    } else {
                        return;
                    }
                }
                rh0 rh0Var = (rh0) view3;
                int i15 = sh0Var.D;
                if (i7 >= i15 && i7 < sh0Var.E) {
                    qh0Var = (qh0) sh0Var.f49768b.get(i7 - i15);
                }
                int i16 = sh0Var.f49772n;
                if (i7 >= i16 && i7 < sh0Var.f49773r) {
                    qh0Var = (qh0) sh0Var.f49767a.get(i7 - i16);
                }
                if (qh0Var != null) {
                    if (rh0Var.f49519e == qh0Var) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (qh0Var == sh0Var.G) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (sh0Var.I.get(qh0Var.f49235c) != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    rh0Var.f49519e = qh0Var;
                    rh0Var.f49516a.setText(qh0Var.f49237f);
                    if (i7 == sh0Var.E - 1) {
                        z16 = false;
                    }
                    rh0Var.d = z16;
                    rh0Var.f49517b.a(z14, z13);
                    rh0Var.f49518c.a(z15, z13);
                    return;
                }
                return;
            case 9:
                ((nc1) d1Var.f56952a).f48025a = WallpapersListActivity.f43479i0[i7];
                return;
            case 10:
                ug.i iVar = (ug.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((ug.g) arrayList2.get(i7)).f56496a == 1) {
                    ug.h hVar = (ug.h) d1Var.f56952a;
                    hVar.f56504c.setColorFilter(new PorterDuffColorFilter(iVar.f56510e.getPixel(i7, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.f56504c.setImageDrawable(iVar.getContext().getDrawable(((ug.g) arrayList2.get(i7)).f56497b));
                    hVar.f56502a.setText(((ug.g) arrayList2.get(i7)).f56498c);
                    hVar.f56503b.setText(((ug.g) arrayList2.get(i7)).d);
                    return;
                }
                return;
            default:
                View view4 = d1Var.f56952a;
                ug.f1 f1Var = (ug.f1) obj;
                int i17 = f1Var.f56472b2;
                if (i7 >= i17 && i7 < f1Var.f56473c2) {
                    is0 is0Var = (is0) view4;
                    vs0 vs0Var = (vs0) f1Var.P1.get(i7 - i17);
                    if (i7 == f1Var.f56473c2 - 1) {
                        z16 = false;
                    }
                    is0Var.a(vs0Var, z16);
                    return;
                } else if (i7 >= f1Var.Z1 && i7 < f1Var.f56471a2) {
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
        os0 os0Var;
        int i17 = this.f4146c;
        int i18 = 3;
        Object obj = this.d;
        switch (i17) {
            case 0:
                ?? view2 = new View(((k7) obj).getContext());
                view2.f33491a = 0;
                return new v4.d1(view2);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).f36939n2);
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
                    frameLayout2.f31846a = h7Var;
                    h7Var.f29286r.setVisibility(8);
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
                p01 p01Var = new p01((r01) obj, viewGroup.getContext());
                p01Var.setLayoutParams(new v4.o0(-2, -1));
                return new v4.d1(p01Var);
            case 6:
                wt wtVar = (wt) obj;
                if (i7 == 0) {
                    linearLayout = wtVar.V1;
                } else if (i7 == 2) {
                    View view3 = wtVar.W1;
                    v4.o0 o0Var = new v4.o0(-1, -2);
                    int i19 = wtVar.f28645t0;
                    ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i19;
                    ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i19;
                    view3.setLayoutParams(o0Var);
                    linearLayout = view3;
                } else {
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                    z8Var.setFixedSize(12);
                    int i20 = org.telegram.ui.ActionBar.k6.f27792a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i20, false));
                    org.telegram.ui.ActionBar.r6.y(z8Var, colorDrawable, i20, null, PorterDuff.Mode.SRC_IN);
                    xp xpVar = new xp(colorDrawable, org.telegram.ui.ActionBar.k6.Y0(viewGroup.getContext(), 2131231230, org.telegram.ui.ActionBar.k6.f27812b7));
                    xpVar.f40324x = true;
                    z8Var.setBackgroundDrawable(xpVar);
                    linearLayout = z8Var;
                }
                return new v4.d1(linearLayout);
            case 7:
                if0 if0Var = new if0(viewGroup.getContext());
                if0Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new v4.d1(if0Var);
            case 8:
                org.telegram.ui.ActionBar.f6 f6Var = ((sh0) obj).f49771f;
                Context context2 = viewGroup.getContext();
                int i21 = 61;
                if (i7 != 0) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context2, f6Var);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, n4Var2, f6Var);
                            n4Var = n4Var2;
                        } else {
                            n4Var = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.f1) null);
                        }
                    } else {
                        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context2, f6Var);
                        i2Var.d = 61;
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, i2Var, f6Var);
                        n4Var = i2Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.f49517b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.f27904g7, org.telegram.ui.ActionBar.k6.h7, f6Var);
                    boolean z9 = org.telegram.messenger.hd.f22871a0;
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
                    wo woVar = new wo(24, context2, f6Var);
                    frameLayout3.f49518c = woVar;
                    int i24 = org.telegram.ui.ActionBar.k6.f27848d6;
                    woVar.b(-1, i24, org.telegram.ui.ActionBar.k6.f27978k7);
                    woVar.setDrawUnchecked(false);
                    woVar.setDrawBackgroundAsArc(3);
                    boolean z10 = org.telegram.messenger.hd.f22871a0;
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
                    frameLayout3.f49516a = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    if (org.telegram.messenger.hd.f22871a0) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView.setGravity(i14 | 16);
                    boolean z11 = org.telegram.messenger.hd.f22871a0;
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
                    org.telegram.ui.ActionBar.r6.i(i24, frameLayout3, f6Var);
                    n4Var = frameLayout3;
                }
                return jg.g.r(n4Var, n4Var, -1, -2);
            case 9:
                rc1 rc1Var = (rc1) obj;
                return new v4.d1(new nc1(rc1Var.E, rc1Var.f49484c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.f6 f6Var2 = iVar.f56430a;
                if (i7 == 0) {
                    view = new ug.f(iVar, iVar.getContext());
                } else if (i7 == 2) {
                    view = new org.telegram.ui.Cells.v3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    ?? frameLayout4 = new FrameLayout(context3);
                    ImageView imageView = new ImageView(context3);
                    frameLayout4.f56504c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout4.addView(imageView, c8.ha.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    frameLayout4.f56502a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.G6, f6Var2);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout4.addView(textView2, c8.ha.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    frameLayout4.f56503b = textView3;
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28240y6, f6Var2);
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
                                    os0Var = new os0(this, context4, f1Var.I0);
                                } else {
                                    yg.d0 d0Var = new yg.d0(context4, f1Var.I0);
                                    d0Var.setBackground(true);
                                    String M0 = org.telegram.messenger.hd.M0(2131749661, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i28 = org.telegram.ui.ActionBar.k6.Uc;
                                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(M0, i28, 0, new Runnable(this) {
                                        public final k5 f56465b;

                                        {
                                            this.f56465b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            k5 k5Var = this.f56465b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((f1) k5Var.d).f56481l2.getParentActivity(), hd.M0(2131744197, null));
                                                    return;
                                                default:
                                                    vf.c.t(((f1) k5Var.d).f56481l2.getParentActivity(), hd.M0(2131746780, null));
                                                    return;
                                            }
                                        }
                                    }, null), org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131749662, "GiftPremiumPrivacyPolicy"), i28, 0, new Runnable(this) {
                                        public final k5 f56465b;

                                        {
                                            this.f56465b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            int i29 = r2;
                                            k5 k5Var = this.f56465b;
                                            switch (i29) {
                                                case 0:
                                                    vf.c.t(((f1) k5Var.d).f56481l2.getParentActivity(), hd.M0(2131744197, null));
                                                    return;
                                                default:
                                                    vf.c.t(((f1) k5Var.d).f56481l2.getParentActivity(), hd.M0(2131746780, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    os0Var = d0Var;
                                }
                            } else {
                                os0Var = new t(context4);
                            }
                        } else {
                            os0Var = new yh.g(context4, 1);
                        }
                    } else {
                        int i29 = org.telegram.ui.ActionBar.k6.f27792a7;
                        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context4, org.telegram.ui.ActionBar.k6.w0(i29, f1Var.I0), 0);
                        org.telegram.ui.ActionBar.r6.i(i29, y6Var, f1Var.I0);
                        os0Var = y6Var;
                    }
                } else {
                    c61 c61Var = new c61(24, context4, this);
                    f1Var.f56480k2 = c61Var;
                    c61Var.setOrientation(1);
                    View view4 = f1Var.f56489t2;
                    if (view4 == null) {
                        f1Var.f56479j2 = new qd(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i30 = org.telegram.ui.ActionBar.k6.Ak;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.w0(i30, f1Var.I0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, f1Var.I0)));
                        f1Var.f56479j2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = f1Var.f56479j2.f57320b;
                        fVar.f57304z = i30;
                        fVar.A = org.telegram.ui.ActionBar.k6.zk;
                        fVar.b();
                        c61Var.addView(f1Var.f56479j2, c8.ha.r(160, 160, 1));
                    } else {
                        if (view4.getParent() != null) {
                            ((ViewGroup) f1Var.f56489t2.getParent()).removeView(f1Var.f56489t2);
                        }
                        f1Var.e1(c61Var);
                    }
                    if (f1Var.F2 == null) {
                        FrameLayout frameLayout5 = new FrameLayout(context4);
                        f1Var.F2 = frameLayout5;
                        frameLayout5.setClipChildren(false);
                        Integer num = f1Var.f56482m2;
                        if (num == null) {
                            intValue = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28183v6, f1Var.I0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        f1Var.G2 = new w70[2];
                        for (int i31 = 0; i31 < 2; i31++) {
                            f1Var.G2[i31] = new org.telegram.ui.Components.jb(4, context4, f1Var.I0);
                            w70 w70Var = f1Var.G2[i31];
                            if (i31 == 0) {
                                i16 = 0;
                            } else {
                                i16 = 8;
                            }
                            w70Var.setVisibility(i16);
                            f1Var.G2[i31].setTextSize(1, 16.0f);
                            f1Var.G2[i31].setTypeface(org.telegram.messenger.g0.o());
                            f1Var.G2[i31].setGravity(1);
                            org.telegram.ui.ActionBar.r6.V(f1Var.G2[i31], org.telegram.ui.ActionBar.k6.G6, f1Var.I0);
                            org.telegram.ui.ActionBar.r6.H(f1Var.G2[i31], org.telegram.ui.ActionBar.k6.J6, f1Var.I0);
                            f1Var.F2.addView(f1Var.G2[i31], c8.ha.c(-2.0f, -1));
                        }
                    }
                    if (f1Var.F2.getParent() != null) {
                        ((ViewGroup) f1Var.F2.getParent()).removeView(f1Var.F2);
                    }
                    c61Var.addView(f1Var.F2, c8.ha.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (f1Var.H2 == null) {
                        w70 w70Var2 = new w70(f1Var.getContext(), f1Var.I0);
                        f1Var.H2 = w70Var2;
                        w70Var2.setTextSize(1, 14.0f);
                        f1Var.H2.setGravity(1);
                        org.telegram.ui.ActionBar.r6.V(f1Var.H2, org.telegram.ui.ActionBar.k6.G6, f1Var.I0);
                        org.telegram.ui.ActionBar.r6.H(f1Var.H2, org.telegram.ui.ActionBar.k6.J6, f1Var.I0);
                    }
                    if (f1Var.H2.getParent() != null) {
                        ((ViewGroup) f1Var.H2.getParent()).removeView(f1Var.H2);
                    }
                    c61Var.addView(f1Var.H2, c8.ha.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    f1Var.j1(false);
                    f1Var.f56478i2 = new hi.e(context4, 5);
                    u41 u41Var = new u41(12, context4, this);
                    u41Var.setClipChildren(false);
                    u41Var.addView(f1Var.f56478i2);
                    u41Var.addView(c61Var);
                    qd qdVar = f1Var.f56479j2;
                    os0Var = u41Var;
                    if (qdVar != null) {
                        qdVar.setStarParticlesView(f1Var.f56478i2);
                        os0Var = u41Var;
                    }
                }
                os0Var.setLayoutParams(new v4.o0(-1, -2));
                f1Var.d1(i7, os0Var);
                return new v4.d1(os0Var);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        boolean z9;
        switch (this.f4146c) {
            case 4:
                ql0 ql0Var = (ql0) this.d;
                ArrayList arrayList = ql0Var.f37338r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    pl0 pl0Var = (pl0) d1Var.f56952a;
                    if (((nl0) arrayList.get(b10)).f36329a.h == ql0Var.h) {
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
