package defpackage;

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
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.WallpapersListActivity;
public final class ny0 extends q59 {
    public final byte c;
    public final Object d;

    public ny0(Context context) {
        this.c = (byte) 7;
        this.d = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        switch (this.c) {
            case 0:
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
                return true;
            case 5:
                int i = u69Var.f;
                if (i != 0 && i != 2) {
                    return false;
                }
                return true;
            case 6:
                if (u69Var.f != 1) {
                    return false;
                }
                return true;
            case 7:
                int b = u69Var.b();
                if (b != 1 && b != 2 && b != 3 && b != 4 && b != 7) {
                    return false;
                }
                return true;
            case 8:
                int i2 = u69Var.f;
                if (i2 != 1 && i2 != 2) {
                    return false;
                }
                return true;
            case 9:
                return true;
            case 10:
                return false;
            case 11:
            default:
                return true;
        }
    }

    public final k47 E(int i) {
        ju9 ju9Var = (ju9) this.d;
        int i2 = ju9Var.w;
        if (i >= i2 && i < ju9Var.x) {
            return (k47) ju9Var.e.get(i - i2);
        }
        int i3 = ju9Var.E;
        if (i >= i3 && i < ju9Var.F) {
            return (k47) ju9Var.f.get(i - i3);
        }
        return null;
    }

    public final void H(int i, int i2) {
        int[] iArr = ((wsa) this.d).N2;
        if (iArr[0] == i && iArr[1] == i2) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        f();
    }

    @Override
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return 1;
            case 1:
                if (((wf3) obj).b2.h()) {
                    return 1;
                }
                return 3;
            case 2:
                return ((aa4) obj).d.size();
            case 3:
                return ((uh4) obj).f3.size();
            case 4:
                return ((t57) obj).c.size();
            case 5:
                return ((ep7) obj).h;
            case 6:
                return ((yj8) obj).a2;
            case 7:
                return 6;
            case 8:
                return ((ju9) obj).r;
            case 9:
                return ((xu9) obj).r.size();
            case 10:
                return ((wsa) obj).N2.length;
            case 11:
                return ((oyb) obj).U.size();
            default:
                return 12;
        }
    }

    @Override
    public final long c(int i) {
        cp7 cp7Var;
        switch (this.c) {
            case 5:
                ep7 ep7Var = (ep7) this.d;
                int i2 = ep7Var.E;
                if (i >= i2 && i < ep7Var.F) {
                    cp7Var = (cp7) ep7Var.b.get(i - i2);
                } else {
                    int i3 = ep7Var.n;
                    if (i >= i3 && i < ep7Var.r) {
                        cp7Var = (cp7) ep7Var.a.get(i - i3);
                    } else {
                        cp7Var = null;
                    }
                }
                if (cp7Var != null) {
                    return cp7Var.c;
                }
                if (i == 0) {
                    return 1L;
                }
                if (i == ep7Var.y) {
                    return 2L;
                }
                if (i == ep7Var.s) {
                    return 3L;
                }
                if (i == ep7Var.w) {
                    return 4L;
                }
                if (i == ep7Var.x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i);
        }
    }

    @Override
    public final int d(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
            case 1:
                return i;
            case 2:
                return ((y94) ((aa4) obj).d.get(i)).a;
            case 3:
            case 4:
            default:
                return super.d(i);
            case 5:
                ep7 ep7Var = (ep7) obj;
                if (i < ep7Var.E || i >= ep7Var.F) {
                    if (i == 0 || i == ep7Var.y) {
                        return 1;
                    }
                    if (i == ep7Var.s) {
                        return 2;
                    }
                    if (i == ep7Var.w || i == ep7Var.x) {
                        return 3;
                    }
                }
                return 0;
            case 6:
                yj8 yj8Var = (yj8) obj;
                if (i != yj8Var.b2) {
                    if (i >= yj8Var.c2 && i < yj8Var.d2) {
                        return yj8Var.a1();
                    }
                    if (i >= yj8Var.e2 && i < yj8Var.f2) {
                        return 1;
                    }
                    if (i == yj8Var.g2) {
                        return 2;
                    }
                    if (i == yj8Var.h2) {
                        return 3;
                    }
                    if (i == 0) {
                        return 4;
                    }
                    if (i == yj8Var.i2) {
                        return 5;
                    }
                }
                return 0;
            case 7:
                if (i == 0 || i == 6) {
                    return 0;
                }
                if (i == 7) {
                    return 1;
                }
                if (i == 5 || i == 8) {
                    return 3;
                }
                return 2;
            case 8:
                ju9 ju9Var = (ju9) obj;
                if (i == ju9Var.s || i == ju9Var.y) {
                    return 0;
                }
                k47 E = E(i);
                if (E != null && E.I3()) {
                    return 2;
                }
                return 1;
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        String M0;
        String M02;
        String M03;
        boolean z4;
        int e1;
        boolean z5;
        int e12;
        boolean z6;
        String M04;
        String M05;
        boolean z7;
        vu9 vu9Var;
        ty2 ty2Var;
        int i2;
        float f = 0.0f;
        cp7 cp7Var = null;
        boolean z8 = true;
        switch (this.c) {
            case 0:
            case 1:
                return;
            case 2:
                aa4 aa4Var = (aa4) this.d;
                ArrayList arrayList = aa4Var.d;
                if (((y94) arrayList.get(i)).a == 1) {
                    z94 z94Var = (z94) u69Var.a;
                    z94Var.c.setColorFilter(new PorterDuffColorFilter(aa4Var.e.getPixel(i, 0), PorterDuff.Mode.MULTIPLY));
                    z94Var.c.setImageDrawable(aa4Var.getContext().getDrawable(((y94) arrayList.get(i)).b));
                    z94Var.a.setText(((y94) arrayList.get(i)).c);
                    z94Var.b.setText(((y94) arrayList.get(i)).d);
                    return;
                }
                return;
            case 3:
                ((th4) u69Var).v.setData((sh4) ((uh4) this.d).f3.get(i));
                return;
            case 4:
                t57 t57Var = (t57) this.d;
                ((s57) u69Var.a).a((TLObject) t57Var.c.get(i), ((Integer) t57Var.b.get(i)).intValue(), false);
                return;
            case 5:
                ep7 ep7Var = (ep7) this.d;
                ylb ylbVar = ep7Var.f;
                int i3 = u69Var.f;
                View view = u69Var.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y23 y23Var = (y23) view;
                            Drawable drawable = y23Var.getContext().getResources().getDrawable(2131232576);
                            Drawable drawable2 = y23Var.getContext().getResources().getDrawable(2131232577);
                            int i4 = cmb.M6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            anb.x(y23Var, drawable, i4, ylbVar, mode);
                            anb.x(y23Var, drawable2, cmb.j7, ylbVar, mode);
                            sn2 sn2Var = new sn2(drawable, drawable2);
                            y23Var.a.l(jb6.M0(2131743490, null), false);
                            y23Var.b.setImageDrawable(sn2Var);
                            y23Var.c = false;
                            return;
                        }
                        return;
                    }
                    jf5 jf5Var = (jf5) view;
                    if (i == 0) {
                        jf5Var.setText(jb6.M0(2131743896, null));
                        return;
                    } else if (i == ep7Var.y) {
                        jf5Var.setText(jb6.M0(2131743974, null));
                        return;
                    } else {
                        return;
                    }
                }
                dp7 dp7Var = (dp7) view;
                int i5 = ep7Var.E;
                if (i >= i5 && i < ep7Var.F) {
                    cp7Var = (cp7) ep7Var.b.get(i - i5);
                }
                int i6 = ep7Var.n;
                if (i >= i6 && i < ep7Var.r) {
                    cp7Var = (cp7) ep7Var.a.get(i - i6);
                }
                if (cp7Var != null) {
                    if (dp7Var.e == cp7Var) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cp7Var == ep7Var.H) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (ep7Var.J.get(cp7Var.c) != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    dp7Var.e = cp7Var;
                    dp7Var.a.setText(cp7Var.f);
                    if (i == ep7Var.F - 1) {
                        z8 = false;
                    }
                    dp7Var.d = z8;
                    dp7Var.b.a(z2, z);
                    dp7Var.c.a(z3, z);
                    return;
                }
                return;
            case 6:
                View view2 = u69Var.a;
                yj8 yj8Var = (yj8) this.d;
                int i7 = yj8Var.e2;
                if (i >= i7 && i < yj8Var.f2) {
                    lj8 lj8Var = (lj8) view2;
                    hk8 hk8Var = (hk8) yj8Var.S1.get(i - i7);
                    if (i == yj8Var.f2 - 1) {
                        z8 = false;
                    }
                    lj8Var.a(hk8Var, z8);
                    return;
                } else if (i >= yj8Var.c2 && i < yj8Var.d2) {
                    yj8Var.b1(view2);
                    return;
                } else {
                    return;
                }
            case 7:
                int i8 = u69Var.f;
                if (i8 == 0) {
                    jf5 jf5Var2 = (jf5) u69Var.a;
                    if (i == 0) {
                        M03 = jb6.M0(2131745721, null);
                    } else {
                        M03 = jb6.M0(2131745725, null);
                    }
                    jf5Var2.setText(M03);
                    return;
                }
                View view3 = u69Var.a;
                if (i8 == 1) {
                    String M06 = jb6.M0(2131745724, null);
                    in0 in0Var = yed.h;
                    in0Var.a();
                    ((bjb) view3).f(M06, in0Var.d, false);
                    return;
                } else if (i8 == 2) {
                    vkb vkbVar = (vkb) view3;
                    if (i == 1) {
                        vkbVar.c(jb6.M0(2131745719, null), hg9.k(new StringBuilder(), ((sn9) yed.d.a()).a, "p"), false, true);
                        return;
                    } else if (i == 2) {
                        String M07 = jb6.M0(2131745729, null);
                        on9 on9Var = (on9) yed.e.a();
                        if (on9Var == on9.a) {
                            M02 = jb6.M0(2131745728, null);
                        } else if (on9Var == on9.b) {
                            M02 = jb6.M0(2131745726, null);
                        } else {
                            M02 = jb6.M0(2131745727, null);
                        }
                        vkbVar.c(M07, M02, false, true);
                        return;
                    } else if (i == 3) {
                        vkbVar.c(jb6.M0(2131745722, null), hg9.k(new StringBuilder(), ((pn9) yed.f.a()).a, " FPS"), false, true);
                        return;
                    } else {
                        vkbVar.c(jb6.M0(2131745730, null), vn9.b0(yed.g.a()), false, false);
                        return;
                    }
                } else {
                    njb njbVar = (njb) view3;
                    if (i == 5) {
                        M0 = jb6.M0(2131745720, null);
                    } else {
                        M0 = jb6.M0(2131745723, null);
                    }
                    njbVar.setText(M0);
                    return;
                }
            case 8:
                ju9 ju9Var = (ju9) this.d;
                ug4 ug4Var = ju9Var.K;
                int i9 = u69Var.f;
                View view4 = u69Var.a;
                if (i9 == 0) {
                    l55 l55Var = (l55) view4;
                    if (i == ju9Var.s) {
                        String M08 = jb6.M0(2131751281, null);
                        boolean equals = l55Var.getText().equals(M08);
                        boolean z9 = ju9Var.I;
                        if (equals) {
                            if (z9) {
                                M05 = jb6.M0(2131747166, null);
                            } else {
                                M05 = jb6.M0(2131745786, null);
                            }
                            boolean z10 = ju9Var.I;
                            rj rjVar = l55Var.b;
                            rjVar.c(M05, true, z10);
                            rjVar.setVisibility(0);
                            return;
                        }
                        if (z9) {
                            M04 = jb6.M0(2131747166, null);
                        } else {
                            M04 = jb6.M0(2131745786, null);
                        }
                        l55Var.b(M08, M04, new iu9(this));
                        return;
                    } else if (i == ju9Var.y) {
                        l55Var.b(jb6.M0(2131746095, null), jb6.M0(2131745229, null), new wk8(this, (byte) 18));
                        return;
                    } else {
                        return;
                    }
                }
                k47 E = E(i);
                if (E != null) {
                    if (ju9Var.J.u() && i >= ju9Var.w && i < ju9Var.x) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i9 == 1) {
                        gu9 gu9Var = (gu9) view4;
                        anb.h(cmb.c6, null, gu9Var);
                        ida idaVar = gu9Var.a;
                        if (idaVar.getMessage() == null) {
                            e12 = 0;
                        } else {
                            e12 = idaVar.getMessage().e1();
                        }
                        idaVar.c(E, true);
                        int e13 = idaVar.getMessage().e1();
                        ug4Var.a = k47.B0(idaVar.getMessage().k);
                        ug4Var.b = e13;
                        boolean e = ju9Var.J.e(ug4Var);
                        if (e12 == E.e1()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        idaVar.b(e, z6);
                        if (e12 != E.e1()) {
                            z8 = false;
                        }
                        if (idaVar.P != z4) {
                            idaVar.P = z4;
                            if (!z8) {
                                if (z4) {
                                    f = 1.0f;
                                }
                                idaVar.Q = f;
                            }
                            idaVar.invalidate();
                            return;
                        }
                        return;
                    } else if (i9 == 2) {
                        eda edaVar = (eda) view4;
                        if (edaVar.getMessage() == null) {
                            e1 = 0;
                        } else {
                            e1 = edaVar.getMessage().e1();
                        }
                        edaVar.f(E, true);
                        int e14 = edaVar.getMessage().e1();
                        ug4Var.a = k47.B0(edaVar.getMessage().k);
                        ug4Var.b = e14;
                        boolean e2 = ju9Var.J.e(ug4Var);
                        if (e1 == E.e1()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        edaVar.e(e2, z5);
                        if (e1 != E.e1()) {
                            z8 = false;
                        }
                        if (edaVar.e0 != z4) {
                            edaVar.e0 = z4;
                            if (!z8) {
                                if (z4) {
                                    f = 1.0f;
                                }
                                edaVar.f0 = f;
                            }
                            edaVar.invalidate();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                View view5 = u69Var.a;
                xu9 xu9Var = (xu9) this.d;
                ArrayList arrayList2 = xu9Var.r;
                if (i >= 0 && i < arrayList2.size()) {
                    uu9 uu9Var = (uu9) arrayList2.get(i);
                    wu9 wu9Var = (wu9) view5;
                    k39 k39Var = wu9Var.d;
                    if (k39Var != null && k39Var.equals(uu9Var.a)) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = uu9Var.a.g();
                        tL_reactionCount.count = uu9Var.b;
                        xu9 xu9Var2 = wu9Var.s;
                        vu9 vu9Var2 = new vu9(wu9Var, xu9Var2.a, wu9Var, tL_reactionCount, xu9Var2.c);
                        wu9Var.a = vu9Var2;
                        vu9Var2.E.d(gm.L(29.0f), gm.L(100.0f));
                        vu9Var = wu9Var.a;
                        vu9Var.p = true;
                        vu9Var.R = true;
                    } else {
                        vu9Var = wu9Var.a;
                        vu9Var.v = uu9Var.b;
                    }
                    wu9Var.d = uu9Var.a;
                    if (!z7) {
                        vu9Var.e = vu9Var.z;
                    }
                    vu9Var.z = gm.L(44.33f);
                    wu9Var.a.t = !TextUtils.isEmpty(uu9Var.c);
                    vu9 vu9Var3 = wu9Var.a;
                    boolean z11 = vu9Var3.t;
                    ho hoVar = vu9Var3.F;
                    if (z11) {
                        hoVar.t(gw3.m(uu9Var.c, hoVar.a.getFontMetricsInt(), false, null, 0), !z7, true);
                    } else if (hoVar != null) {
                        hoVar.t("", !z7, true);
                    }
                    wu9Var.a.getClass();
                    wu9Var.a.E.c(uu9Var.b, !z7);
                    vu9 vu9Var4 = wu9Var.a;
                    if (vu9Var4.E != null && (vu9Var4.v > 0 || vu9Var4.t)) {
                        float f2 = vu9Var4.z;
                        int ceil = (int) Math.ceil(ty2Var.m);
                        if (wu9Var.a.t) {
                            f = 4.0f;
                        }
                        vu9 vu9Var5 = wu9Var.a;
                        vu9Var4.z = (int) (gm.L(f) + ceil + vu9Var5.F.d + f2);
                        vu9Var4 = vu9Var5;
                    }
                    if (z7) {
                        vu9Var4.e = vu9Var4.z;
                    }
                    vu9Var4.A = gm.L(28.0f);
                    vu9 vu9Var6 = wu9Var.a;
                    vu9Var6.o = wu9Var.e;
                    if (wu9Var.r) {
                        vu9Var6.a();
                    }
                    if (!z7) {
                        wu9Var.requestLayout();
                    }
                    wu9 wu9Var2 = (wu9) view5;
                    if (uu9Var.a.h != xu9Var.h) {
                        z8 = false;
                    }
                    wu9Var2.a(z8, false);
                    return;
                }
                return;
            case 10:
                int[] iArr = ((wsa) this.d).N2;
                oy0 oy0Var = (oy0) u69Var.a;
                int i10 = iArr[(iArr.length - 1) - i];
                if (oy0Var.a != i10) {
                    oy0Var.a = i10;
                    oy0Var.requestLayout();
                    return;
                }
                return;
            case 11:
                myb mybVar = (myb) u69Var.a;
                lyb lybVar = (lyb) ((oyb) this.d).U.get(i);
                oyb oybVar = mybVar.s;
                bf0 bf0Var = mybVar.a;
                lyb lybVar2 = mybVar.e;
                if (lybVar2 == null || lybVar2.a != lybVar.a || !Objects.equals(lybVar2.b, lybVar.b)) {
                    z8 = false;
                }
                if (oybVar.a0 >= 1.0f && oybVar.k0 == null) {
                    mybVar.setScaleX(1.0f);
                    mybVar.setScaleY(1.0f);
                    mybVar.setAlpha(1.0f);
                }
                mybVar.e = lybVar;
                if (!z8) {
                    bf0Var.setAnimatedEmojiDrawable(null);
                    mybVar.h = null;
                    mybVar.n = 0;
                    if (lybVar.a != 0) {
                        mybVar.f = null;
                        bf0Var.setVisibility(0);
                        vm vmVar = new vm(3, oybVar.a, lybVar.a);
                        mybVar.h = vmVar;
                        bf0Var.setAnimatedEmojiDrawable(vmVar);
                    } else {
                        if (lybVar.b.booleanValue()) {
                            i2 = 2131743678;
                        } else {
                            i2 = 2131743677;
                        }
                        mybVar.f = jb6.M0(i2, null);
                        bf0Var.setVisibility(8);
                    }
                    mybVar.setContentDescription(mybVar.f);
                }
                mybVar.a(z8);
                mybVar.requestLayout();
                mybVar.invalidate();
                return;
            default:
                ((ltc) u69Var.a).a = WallpapersListActivity.j0[i];
                return;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout;
        View view;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        jf5 jf5Var;
        int intValue;
        int i8;
        xj8 xj8Var;
        vkb vkbVar;
        FrameLayout frameLayout;
        byte b = this.c;
        int i9 = 20;
        int i10 = 3;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new u69(((py0) obj).S1);
            case 1:
                wf3 wf3Var = (wf3) obj;
                if (i == 0) {
                    linearLayout = wf3Var.Y1;
                } else if (i == 2) {
                    View view2 = wf3Var.Z1;
                    g69 g69Var = new g69(-1, -2);
                    int i11 = wf3Var.u0;
                    ((ViewGroup.MarginLayoutParams) g69Var).leftMargin = i11;
                    ((ViewGroup.MarginLayoutParams) g69Var).rightMargin = i11;
                    view2.setLayoutParams(g69Var);
                    linearLayout = view2;
                } else {
                    njb njbVar = new njb(viewGroup.getContext());
                    njbVar.setFixedSize(12);
                    int i12 = cmb.Z6;
                    ColorDrawable colorDrawable = new ColorDrawable(cmb.w0(null, i12, false));
                    anb.x(njbVar, colorDrawable, i12, null, PorterDuff.Mode.SRC_IN);
                    sn2 sn2Var = new sn2(colorDrawable, cmb.W0(viewGroup.getContext(), 2131231234, cmb.a7));
                    sn2Var.x = true;
                    njbVar.setBackgroundDrawable(sn2Var);
                    linearLayout = njbVar;
                }
                return new u69(linearLayout);
            case 2:
                aa4 aa4Var = (aa4) obj;
                ylb ylbVar = aa4Var.a;
                if (i == 0) {
                    view = new x94(aa4Var, aa4Var.getContext());
                } else if (i == 2) {
                    view = new ak4(aa4Var.getContext(), 16, (byte) 0);
                } else {
                    Context context = aa4Var.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout2.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout2.addView(imageView, qoe.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout2.a = textView;
                    textView.setTypeface(gm.o());
                    anb.X(textView, cmb.F6, ylbVar);
                    textView.setTextSize(1, 14.0f);
                    frameLayout2.addView(textView, qoe.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.b = textView2;
                    anb.X(textView2, cmb.x6, ylbVar);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout2.addView(textView2, qoe.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout2;
                }
                return kt6.h(view, view, -1, -2);
            case 3:
                rh4 rh4Var = new rh4(viewGroup.getContext(), ((uh4) obj).o2);
                ?? u69Var = new u69(rh4Var);
                u69Var.v = rh4Var;
                rh4Var.setLayoutParams(new g69(-2, gm.L(30.0f)));
                return u69Var;
            case 4:
                s57 s57Var = new s57(viewGroup.getContext());
                s57Var.setLayoutParams(new g69(-1, gm.L(50.0f)));
                return new u69(s57Var);
            case 5:
                ylb ylbVar2 = ((ep7) obj).f;
                Context context2 = viewGroup.getContext();
                int i13 = 61;
                if (i != 0) {
                    if (i != 2) {
                        if (i != 3) {
                            jf5 jf5Var2 = new jf5(context2, ylbVar2);
                            anb.h(cmb.c6, ylbVar2, jf5Var2);
                            jf5Var = jf5Var2;
                        } else {
                            jf5Var = new bba(context2, (hg9) null);
                        }
                    } else {
                        y23 y23Var = new y23(70, ylbVar2, context2);
                        y23Var.d = (byte) 61;
                        anb.h(cmb.c6, ylbVar2, y23Var);
                        jf5Var = y23Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.b = radioButton;
                    radioButton.setSize(gm.L(20.0f));
                    anb.O(radioButton, cmb.f7, cmb.g7, ylbVar2);
                    boolean z = jb6.a0;
                    if (z) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    int i14 = i2 | 16;
                    if (z) {
                        i3 = 0;
                    } else {
                        i3 = 20;
                    }
                    float f = i3;
                    if (!z) {
                        i9 = 0;
                    }
                    frameLayout3.addView(radioButton, qoe.d(22, 22.0f, i14, f, 0.0f, i9, 0.0f));
                    jh2 jh2Var = new jh2(24, ylbVar2, context2);
                    frameLayout3.c = jh2Var;
                    int i15 = cmb.c6;
                    jh2Var.b(-1, i15, cmb.j7);
                    jh2Var.setDrawUnchecked(false);
                    jh2Var.setDrawBackgroundAsArc(3);
                    boolean z2 = jb6.a0;
                    if (z2) {
                        i4 = 5;
                    } else {
                        i4 = 3;
                    }
                    int i16 = i4 | 16;
                    int i17 = 18;
                    if (z2) {
                        i5 = 0;
                    } else {
                        i5 = 18;
                    }
                    float f2 = i5;
                    if (!z2) {
                        i17 = 0;
                    }
                    frameLayout3.addView(jh2Var, qoe.d(26, 26.0f, i16, f2, 0.0f, i17, 0.0f));
                    jh2Var.a(true, false);
                    TextView textView3 = new TextView(context2);
                    frameLayout3.a = textView3;
                    anb.X(textView3, cmb.F6, ylbVar2);
                    wi8.w(textView3, 1, 16.0f, 1, 1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    if (jb6.a0) {
                        i6 = 5;
                    } else {
                        i6 = 3;
                    }
                    textView3.setGravity(i6 | 16);
                    boolean z3 = jb6.a0;
                    if (z3) {
                        i10 = 5;
                    }
                    int i18 = i10 | 16;
                    if (z3) {
                        i7 = 23;
                    } else {
                        i7 = 61;
                    }
                    float f3 = i7;
                    if (!z3) {
                        i13 = 23;
                    }
                    frameLayout3.addView(textView3, qoe.d(-2, -2.0f, i18, f3, 0.0f, i13, 0.0f));
                    anb.h(i15, ylbVar2, frameLayout3);
                    jf5Var = frameLayout3;
                }
                return kt6.h(jf5Var, jf5Var, -1, -2);
            case 6:
                Context context3 = viewGroup.getContext();
                yj8 yj8Var = (yj8) obj;
                View c1 = yj8Var.c1(context3, i);
                if (c1 != null) {
                    return kt6.h(c1, c1, -1, -2);
                }
                if (i != 0) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    xj8Var = new xj8(this, context3, yj8Var.J0);
                                } else {
                                    mjb mjbVar = new mjb(context3, yj8Var.J0);
                                    mjbVar.setBackground(true);
                                    String M0 = jb6.M0(2131749439, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i19 = cmb.Wc;
                                    mjbVar.setText(gm.G2(gm.N2(M0, i19, 0, new Runnable(this) {
                                        public final ny0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b2 = r2;
                                            ny0 ny0Var = this.b;
                                            switch (b2) {
                                                case 0:
                                                    l11.u(((yj8) ny0Var.d).o2.getParentActivity(), jb6.M0(2131743881, null));
                                                    return;
                                                default:
                                                    l11.u(((yj8) ny0Var.d).o2.getParentActivity(), jb6.M0(2131746516, null));
                                                    return;
                                            }
                                        }
                                    }, null), gm.N2(jb6.M0(2131749440, "GiftPremiumPrivacyPolicy"), i19, 0, new Runnable(this) {
                                        public final ny0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b2 = r2;
                                            ny0 ny0Var = this.b;
                                            switch (b2) {
                                                case 0:
                                                    l11.u(((yj8) ny0Var.d).o2.getParentActivity(), jb6.M0(2131743881, null));
                                                    return;
                                                default:
                                                    l11.u(((yj8) ny0Var.d).o2.getParentActivity(), jb6.M0(2131746516, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    xj8Var = mjbVar;
                                }
                            } else {
                                xj8Var = new t1(context3, (byte) 0);
                            }
                        } else {
                            xj8Var = new o72(context3, (byte) 20);
                        }
                    } else {
                        int i20 = cmb.Z6;
                        bba bbaVar = new bba(context3, cmb.v0(i20, yj8Var.J0), 0);
                        anb.h(i20, yj8Var.J0, bbaVar);
                        xj8Var = bbaVar;
                    }
                } else {
                    qmb qmbVar = new qmb((byte) 10, context3, this);
                    yj8Var.n2 = qmbVar;
                    qmbVar.setOrientation(1);
                    View view3 = yj8Var.w2;
                    if (view3 == null) {
                        yj8Var.m2 = new w94(context3, 1, 0, (byte) 3);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i21 = cmb.Ck;
                        canvas.drawColor(on2.f(0.5f, cmb.v0(i21, yj8Var.J0), cmb.v0(cmb.g5, yj8Var.J0)));
                        yj8Var.m2.setBackgroundBitmap(createBitmap);
                        vs4 vs4Var = yj8Var.m2.b;
                        vs4Var.z = i21;
                        vs4Var.A = cmb.Bk;
                        vs4Var.b();
                        qmbVar.addView(yj8Var.m2, qoe.r(160, 160, 1));
                    } else {
                        if (view3.getParent() != null) {
                            ((ViewGroup) yj8Var.w2.getParent()).removeView(yj8Var.w2);
                        }
                        yj8Var.Z0(qmbVar);
                    }
                    if (yj8Var.I2 == null) {
                        FrameLayout frameLayout4 = new FrameLayout(context3);
                        yj8Var.I2 = frameLayout4;
                        frameLayout4.setClipChildren(false);
                        Integer num = yj8Var.p2;
                        if (num == null) {
                            intValue = cmb.v0(cmb.u6, yj8Var.J0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        yj8Var.J2 = new l66[2];
                        for (int i22 = 0; i22 < 2; i22++) {
                            yj8Var.J2[i22] = new a31(context3, yj8Var.J0, (byte) 5);
                            l66 l66Var = yj8Var.J2[i22];
                            if (i22 == 0) {
                                i8 = 0;
                            } else {
                                i8 = 8;
                            }
                            l66Var.setVisibility(i8);
                            yj8Var.J2[i22].setTextSize(1, 16.0f);
                            yj8Var.J2[i22].setTypeface(gm.o());
                            yj8Var.J2[i22].setGravity(1);
                            anb.X(yj8Var.J2[i22], cmb.F6, yj8Var.J0);
                            anb.G(yj8Var.J2[i22], cmb.I6, yj8Var.J0);
                            yj8Var.I2.addView(yj8Var.J2[i22], qoe.c(-2.0f, -1));
                        }
                    }
                    if (yj8Var.I2.getParent() != null) {
                        ((ViewGroup) yj8Var.I2.getParent()).removeView(yj8Var.I2);
                    }
                    qmbVar.addView(yj8Var.I2, qoe.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (yj8Var.K2 == null) {
                        l66 l66Var2 = new l66(yj8Var.getContext(), yj8Var.J0);
                        yj8Var.K2 = l66Var2;
                        l66Var2.setTextSize(1, 14.0f);
                        yj8Var.K2.setGravity(1);
                        anb.X(yj8Var.K2, cmb.F6, yj8Var.J0);
                        anb.G(yj8Var.K2, cmb.I6, yj8Var.J0);
                    }
                    if (yj8Var.K2.getParent() != null) {
                        ((ViewGroup) yj8Var.K2.getParent()).removeView(yj8Var.K2);
                    }
                    qmbVar.addView(yj8Var.K2, qoe.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    yj8Var.e1(false);
                    yj8Var.l2 = new ub(context3, (byte) 5);
                    ne6 ne6Var = new ne6((byte) 12, context3, this);
                    ne6Var.setClipChildren(false);
                    ne6Var.addView(yj8Var.l2);
                    ne6Var.addView(qmbVar);
                    w94 w94Var = yj8Var.m2;
                    xj8Var = ne6Var;
                    if (w94Var != null) {
                        w94Var.setStarParticlesView(yj8Var.l2);
                        xj8Var = ne6Var;
                    }
                }
                xj8Var.setLayoutParams(new g69(-1, -2));
                yj8Var.Y0(i, xj8Var);
                return new u69(xj8Var);
            case 7:
                Context context4 = (Context) obj;
                if (i == 0) {
                    vkbVar = new jf5(context4);
                } else if (i == 1) {
                    vkbVar = new bjb(context4);
                } else if (i == 2) {
                    vkb vkbVar2 = new vkb(context4);
                    vkbVar2.setCanDisable(true);
                    vkbVar = vkbVar2;
                } else {
                    vkbVar = new njb(context4);
                }
                vkbVar.setLayoutParams(new g69(-1, -2));
                return new u69(vkbVar);
            case 8:
                if (i == 0) {
                    frameLayout = new l55(viewGroup.getContext(), null);
                } else if (i == 1) {
                    Context context5 = viewGroup.getContext();
                    ?? frameLayout5 = new FrameLayout(context5);
                    ida idaVar = new ida(2, null, context5);
                    frameLayout5.a = idaVar;
                    idaVar.r.setVisibility(8);
                    frameLayout5.addView(idaVar);
                    frameLayout = frameLayout5;
                } else {
                    frameLayout = new eda(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new g69(-1, -2));
                return new u69(frameLayout);
            case 9:
                xu9 xu9Var = (xu9) obj;
                return new u69(new wu9(xu9Var, xu9Var.getContext()));
            case 10:
                ?? view4 = new View(((wsa) obj).getContext());
                view4.a = 0;
                return new u69(view4);
            case 11:
                myb mybVar = new myb((oyb) obj, viewGroup.getContext());
                mybVar.setLayoutParams(new g69(-2, -1));
                return new u69(mybVar);
            default:
                qtc qtcVar = (qtc) obj;
                return new u69(new ltc(qtcVar.F, qtcVar.c));
        }
    }

    @Override
    public final void y(u69 u69Var) {
        boolean z;
        switch (this.c) {
            case 9:
                xu9 xu9Var = (xu9) this.d;
                ArrayList arrayList = xu9Var.r;
                int b = u69Var.b();
                if (b >= 0 && b < arrayList.size()) {
                    wu9 wu9Var = (wu9) u69Var.a;
                    if (((uu9) arrayList.get(b)).a.h == xu9Var.h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    wu9Var.a(z, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ny0(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    private final void F(u69 u69Var, int i) {
    }

    private final void G(u69 u69Var, int i) {
    }
}
