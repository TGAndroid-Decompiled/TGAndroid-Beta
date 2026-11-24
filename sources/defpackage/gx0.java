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
public final class gx0 extends n39 {
    public final byte c;
    public final Object d;

    public gx0(Context context) {
        this.c = (byte) 7;
        this.d = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        switch (this.c) {
            case 0:
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
                return true;
            case 5:
                int i = s49Var.f;
                if (i != 0 && i != 2) {
                    return false;
                }
                return true;
            case 6:
                if (s49Var.f != 1) {
                    return false;
                }
                return true;
            case 7:
                int b = s49Var.b();
                if (b != 1 && b != 2 && b != 3 && b != 4 && b != 7) {
                    return false;
                }
                return true;
            case 8:
                int i2 = s49Var.f;
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

    public final k27 E(int i) {
        hs9 hs9Var = (hs9) this.d;
        int i2 = hs9Var.w;
        if (i >= i2 && i < hs9Var.x) {
            return (k27) hs9Var.e.get(i - i2);
        }
        int i3 = hs9Var.E;
        if (i >= i3 && i < hs9Var.F) {
            return (k27) hs9Var.f.get(i - i3);
        }
        return null;
    }

    public final void H(int i, int i2) {
        int[] iArr = ((vqa) this.d).N2;
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
                if (((je3) obj).b2.h()) {
                    return 1;
                }
                return 3;
            case 2:
                return ((r84) obj).d.size();
            case 3:
                return ((tf4) obj).f3.size();
            case 4:
                return ((t37) obj).c.size();
            case 5:
                return ((an7) obj).h;
            case 6:
                return ((xh8) obj).a2;
            case 7:
                return 6;
            case 8:
                return ((hs9) obj).r;
            case 9:
                return ((vs9) obj).r.size();
            case 10:
                return ((vqa) obj).N2.length;
            case 11:
                return ((lwb) obj).U.size();
            default:
                return 12;
        }
    }

    @Override
    public final long c(int i) {
        ym7 ym7Var;
        switch (this.c) {
            case 5:
                an7 an7Var = (an7) this.d;
                int i2 = an7Var.E;
                if (i >= i2 && i < an7Var.F) {
                    ym7Var = (ym7) an7Var.b.get(i - i2);
                } else {
                    int i3 = an7Var.n;
                    if (i >= i3 && i < an7Var.r) {
                        ym7Var = (ym7) an7Var.a.get(i - i3);
                    } else {
                        ym7Var = null;
                    }
                }
                if (ym7Var != null) {
                    return ym7Var.c;
                }
                if (i == 0) {
                    return 1L;
                }
                if (i == an7Var.y) {
                    return 2L;
                }
                if (i == an7Var.s) {
                    return 3L;
                }
                if (i == an7Var.w) {
                    return 4L;
                }
                if (i == an7Var.x) {
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
                return ((p84) ((r84) obj).d.get(i)).a;
            case 3:
            case 4:
            default:
                return super.d(i);
            case 5:
                an7 an7Var = (an7) obj;
                if (i < an7Var.E || i >= an7Var.F) {
                    if (i == 0 || i == an7Var.y) {
                        return 1;
                    }
                    if (i == an7Var.s) {
                        return 2;
                    }
                    if (i == an7Var.w || i == an7Var.x) {
                        return 3;
                    }
                }
                return 0;
            case 6:
                xh8 xh8Var = (xh8) obj;
                if (i != xh8Var.b2) {
                    if (i >= xh8Var.c2 && i < xh8Var.d2) {
                        return xh8Var.a1();
                    }
                    if (i >= xh8Var.e2 && i < xh8Var.f2) {
                        return 1;
                    }
                    if (i == xh8Var.g2) {
                        return 2;
                    }
                    if (i == xh8Var.h2) {
                        return 3;
                    }
                    if (i == 0) {
                        return 4;
                    }
                    if (i == xh8Var.i2) {
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
                hs9 hs9Var = (hs9) obj;
                if (i == hs9Var.s || i == hs9Var.y) {
                    return 0;
                }
                k27 E = E(i);
                if (E != null && E.I3()) {
                    return 2;
                }
                return 1;
        }
    }

    @Override
    public final void t(s49 s49Var, int i) {
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
        ts9 ts9Var;
        jx2 jx2Var;
        int i2;
        float f = 0.0f;
        ym7 ym7Var = null;
        boolean z8 = true;
        switch (this.c) {
            case 0:
            case 1:
                return;
            case 2:
                r84 r84Var = (r84) this.d;
                ArrayList arrayList = r84Var.d;
                if (((p84) arrayList.get(i)).a == 1) {
                    q84 q84Var = (q84) s49Var.a;
                    q84Var.c.setColorFilter(new PorterDuffColorFilter(r84Var.e.getPixel(i, 0), PorterDuff.Mode.MULTIPLY));
                    q84Var.c.setImageDrawable(r84Var.getContext().getDrawable(((p84) arrayList.get(i)).b));
                    q84Var.a.setText(((p84) arrayList.get(i)).c);
                    q84Var.b.setText(((p84) arrayList.get(i)).d);
                    return;
                }
                return;
            case 3:
                ((sf4) s49Var).v.setData((rf4) ((tf4) this.d).f3.get(i));
                return;
            case 4:
                t37 t37Var = (t37) this.d;
                ((s37) s49Var.a).a((TLObject) t37Var.c.get(i), ((Integer) t37Var.b.get(i)).intValue(), false);
                return;
            case 5:
                an7 an7Var = (an7) this.d;
                wjb wjbVar = an7Var.f;
                int i3 = s49Var.f;
                View view = s49Var.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            m13 m13Var = (m13) view;
                            Drawable drawable = m13Var.getContext().getResources().getDrawable(2131232564);
                            Drawable drawable2 = m13Var.getContext().getResources().getDrawable(2131232565);
                            int i4 = bkb.M6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            zkb.x(m13Var, drawable, i4, wjbVar, mode);
                            zkb.x(m13Var, drawable2, bkb.j7, wjbVar, mode);
                            fm2 fm2Var = new fm2(drawable, drawable2);
                            m13Var.a.l(k96.M0(2131743564, null), false);
                            m13Var.b.setImageDrawable(fm2Var);
                            m13Var.c = false;
                            return;
                        }
                        return;
                    }
                    ld5 ld5Var = (ld5) view;
                    if (i == 0) {
                        ld5Var.setText(k96.M0(2131743970, null));
                        return;
                    } else if (i == an7Var.y) {
                        ld5Var.setText(k96.M0(2131744048, null));
                        return;
                    } else {
                        return;
                    }
                }
                zm7 zm7Var = (zm7) view;
                int i5 = an7Var.E;
                if (i >= i5 && i < an7Var.F) {
                    ym7Var = (ym7) an7Var.b.get(i - i5);
                }
                int i6 = an7Var.n;
                if (i >= i6 && i < an7Var.r) {
                    ym7Var = (ym7) an7Var.a.get(i - i6);
                }
                if (ym7Var != null) {
                    if (zm7Var.e == ym7Var) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ym7Var == an7Var.H) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (an7Var.J.get(ym7Var.c) != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zm7Var.e = ym7Var;
                    zm7Var.a.setText(ym7Var.f);
                    if (i == an7Var.F - 1) {
                        z8 = false;
                    }
                    zm7Var.d = z8;
                    zm7Var.b.a(z2, z);
                    zm7Var.c.a(z3, z);
                    return;
                }
                return;
            case 6:
                View view2 = s49Var.a;
                xh8 xh8Var = (xh8) this.d;
                int i7 = xh8Var.e2;
                if (i >= i7 && i < xh8Var.f2) {
                    kh8 kh8Var = (kh8) view2;
                    fi8 fi8Var = (fi8) xh8Var.S1.get(i - i7);
                    if (i == xh8Var.f2 - 1) {
                        z8 = false;
                    }
                    kh8Var.a(fi8Var, z8);
                    return;
                } else if (i >= xh8Var.c2 && i < xh8Var.d2) {
                    xh8Var.b1(view2);
                    return;
                } else {
                    return;
                }
            case 7:
                int i8 = s49Var.f;
                if (i8 == 0) {
                    ld5 ld5Var2 = (ld5) s49Var.a;
                    if (i == 0) {
                        M03 = k96.M0(2131745795, null);
                    } else {
                        M03 = k96.M0(2131745799, null);
                    }
                    ld5Var2.setText(M03);
                    return;
                }
                View view3 = s49Var.a;
                if (i8 == 1) {
                    String M06 = k96.M0(2131745798, null);
                    im0 im0Var = wcd.h;
                    im0Var.a();
                    ((ahb) view3).f(M06, im0Var.d, false);
                    return;
                } else if (i8 == 2) {
                    uib uibVar = (uib) view3;
                    if (i == 1) {
                        uibVar.c(k96.M0(2131745793, null), de9.l(new StringBuilder(), ((sl9) wcd.d.a()).a, "p"), false, true);
                        return;
                    } else if (i == 2) {
                        String M07 = k96.M0(2131745803, null);
                        ol9 ol9Var = (ol9) wcd.e.a();
                        if (ol9Var == ol9.a) {
                            M02 = k96.M0(2131745802, null);
                        } else if (ol9Var == ol9.b) {
                            M02 = k96.M0(2131745800, null);
                        } else {
                            M02 = k96.M0(2131745801, null);
                        }
                        uibVar.c(M07, M02, false, true);
                        return;
                    } else if (i == 3) {
                        uibVar.c(k96.M0(2131745796, null), de9.l(new StringBuilder(), ((pl9) wcd.f.a()).a, " FPS"), false, true);
                        return;
                    } else {
                        uibVar.c(k96.M0(2131745804, null), vl9.a0(wcd.g.a()), false, false);
                        return;
                    }
                } else {
                    mhb mhbVar = (mhb) view3;
                    if (i == 5) {
                        M0 = k96.M0(2131745794, null);
                    } else {
                        M0 = k96.M0(2131745797, null);
                    }
                    mhbVar.setText(M0);
                    return;
                }
            case 8:
                hs9 hs9Var = (hs9) this.d;
                se4 se4Var = hs9Var.K;
                int i9 = s49Var.f;
                View view4 = s49Var.a;
                if (i9 == 0) {
                    l35 l35Var = (l35) view4;
                    if (i == hs9Var.s) {
                        String M08 = k96.M0(2131751332, null);
                        boolean equals = l35Var.getText().equals(M08);
                        boolean z9 = hs9Var.I;
                        if (equals) {
                            if (z9) {
                                M05 = k96.M0(2131747240, null);
                            } else {
                                M05 = k96.M0(2131745860, null);
                            }
                            boolean z10 = hs9Var.I;
                            ri riVar = l35Var.b;
                            riVar.c(M05, true, z10);
                            riVar.setVisibility(0);
                            return;
                        }
                        if (z9) {
                            M04 = k96.M0(2131747240, null);
                        } else {
                            M04 = k96.M0(2131745860, null);
                        }
                        l35Var.b(M08, M04, new gs9(this));
                        return;
                    } else if (i == hs9Var.y) {
                        l35Var.b(k96.M0(2131746169, null), k96.M0(2131745303, null), new ik8(this, (byte) 15));
                        return;
                    } else {
                        return;
                    }
                }
                k27 E = E(i);
                if (E != null) {
                    if (hs9Var.J.t() && i >= hs9Var.w && i < hs9Var.x) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i9 == 1) {
                        es9 es9Var = (es9) view4;
                        zkb.h(bkb.c6, null, es9Var);
                        iba ibaVar = es9Var.a;
                        if (ibaVar.getMessage() == null) {
                            e12 = 0;
                        } else {
                            e12 = ibaVar.getMessage().e1();
                        }
                        ibaVar.c(E, true);
                        int e13 = ibaVar.getMessage().e1();
                        se4Var.a = k27.B0(ibaVar.getMessage().k);
                        se4Var.b = e13;
                        boolean b = hs9Var.J.b(se4Var);
                        if (e12 == E.e1()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        ibaVar.b(b, z6);
                        if (e12 != E.e1()) {
                            z8 = false;
                        }
                        if (ibaVar.P != z4) {
                            ibaVar.P = z4;
                            if (!z8) {
                                if (z4) {
                                    f = 1.0f;
                                }
                                ibaVar.Q = f;
                            }
                            ibaVar.invalidate();
                            return;
                        }
                        return;
                    } else if (i9 == 2) {
                        eba ebaVar = (eba) view4;
                        if (ebaVar.getMessage() == null) {
                            e1 = 0;
                        } else {
                            e1 = ebaVar.getMessage().e1();
                        }
                        ebaVar.f(E, true);
                        int e14 = ebaVar.getMessage().e1();
                        se4Var.a = k27.B0(ebaVar.getMessage().k);
                        se4Var.b = e14;
                        boolean b2 = hs9Var.J.b(se4Var);
                        if (e1 == E.e1()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        ebaVar.e(b2, z5);
                        if (e1 != E.e1()) {
                            z8 = false;
                        }
                        if (ebaVar.e0 != z4) {
                            ebaVar.e0 = z4;
                            if (!z8) {
                                if (z4) {
                                    f = 1.0f;
                                }
                                ebaVar.f0 = f;
                            }
                            ebaVar.invalidate();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                View view5 = s49Var.a;
                vs9 vs9Var = (vs9) this.d;
                ArrayList arrayList2 = vs9Var.r;
                if (i >= 0 && i < arrayList2.size()) {
                    ss9 ss9Var = (ss9) arrayList2.get(i);
                    us9 us9Var = (us9) view5;
                    h19 h19Var = us9Var.d;
                    if (h19Var != null && h19Var.equals(ss9Var.a)) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ss9Var.a.g();
                        tL_reactionCount.count = ss9Var.b;
                        vs9 vs9Var2 = us9Var.s;
                        ts9 ts9Var2 = new ts9(us9Var, vs9Var2.a, us9Var, tL_reactionCount, vs9Var2.c);
                        us9Var.a = ts9Var2;
                        ts9Var2.E.d(gl.L(29.0f), gl.L(100.0f));
                        ts9Var = us9Var.a;
                        ts9Var.p = true;
                        ts9Var.R = true;
                    } else {
                        ts9Var = us9Var.a;
                        ts9Var.v = ss9Var.b;
                    }
                    us9Var.d = ss9Var.a;
                    if (!z7) {
                        ts9Var.e = ts9Var.z;
                    }
                    ts9Var.z = gl.L(44.33f);
                    us9Var.a.t = !TextUtils.isEmpty(ss9Var.c);
                    ts9 ts9Var3 = us9Var.a;
                    boolean z11 = ts9Var3.t;
                    gn gnVar = ts9Var3.F;
                    if (z11) {
                        gnVar.t(vu3.m(ss9Var.c, gnVar.a.getFontMetricsInt(), false, null, 0), !z7, true);
                    } else if (gnVar != null) {
                        gnVar.t("", !z7, true);
                    }
                    us9Var.a.getClass();
                    us9Var.a.E.c(ss9Var.b, !z7);
                    ts9 ts9Var4 = us9Var.a;
                    if (ts9Var4.E != null && (ts9Var4.v > 0 || ts9Var4.t)) {
                        float f2 = ts9Var4.z;
                        int ceil = (int) Math.ceil(jx2Var.m);
                        if (us9Var.a.t) {
                            f = 4.0f;
                        }
                        ts9 ts9Var5 = us9Var.a;
                        ts9Var4.z = (int) (gl.L(f) + ceil + ts9Var5.F.d + f2);
                        ts9Var4 = ts9Var5;
                    }
                    if (z7) {
                        ts9Var4.e = ts9Var4.z;
                    }
                    ts9Var4.A = gl.L(28.0f);
                    ts9 ts9Var6 = us9Var.a;
                    ts9Var6.o = us9Var.e;
                    if (us9Var.r) {
                        ts9Var6.a();
                    }
                    if (!z7) {
                        us9Var.requestLayout();
                    }
                    us9 us9Var2 = (us9) view5;
                    if (ss9Var.a.h != vs9Var.h) {
                        z8 = false;
                    }
                    us9Var2.a(z8, false);
                    return;
                }
                return;
            case 10:
                int[] iArr = ((vqa) this.d).N2;
                hx0 hx0Var = (hx0) s49Var.a;
                int i10 = iArr[(iArr.length - 1) - i];
                if (hx0Var.a != i10) {
                    hx0Var.a = i10;
                    hx0Var.requestLayout();
                    return;
                }
                return;
            case 11:
                jwb jwbVar = (jwb) s49Var.a;
                iwb iwbVar = (iwb) ((lwb) this.d).U.get(i);
                lwb lwbVar = jwbVar.s;
                be0 be0Var = jwbVar.a;
                iwb iwbVar2 = jwbVar.e;
                if (iwbVar2 == null || iwbVar2.a != iwbVar.a || !Objects.equals(iwbVar2.b, iwbVar.b)) {
                    z8 = false;
                }
                if (lwbVar.a0 >= 1.0f && lwbVar.k0 == null) {
                    jwbVar.setScaleX(1.0f);
                    jwbVar.setScaleY(1.0f);
                    jwbVar.setAlpha(1.0f);
                }
                jwbVar.e = iwbVar;
                if (!z8) {
                    be0Var.setAnimatedEmojiDrawable(null);
                    jwbVar.h = null;
                    jwbVar.n = 0;
                    if (iwbVar.a != 0) {
                        jwbVar.f = null;
                        be0Var.setVisibility(0);
                        vl vlVar = new vl(3, lwbVar.a, iwbVar.a);
                        jwbVar.h = vlVar;
                        be0Var.setAnimatedEmojiDrawable(vlVar);
                    } else {
                        if (iwbVar.b.booleanValue()) {
                            i2 = 2131743752;
                        } else {
                            i2 = 2131743751;
                        }
                        jwbVar.f = k96.M0(i2, null);
                        be0Var.setVisibility(8);
                    }
                    jwbVar.setContentDescription(jwbVar.f);
                }
                jwbVar.a(z8);
                jwbVar.requestLayout();
                jwbVar.invalidate();
                return;
            default:
                ((jrc) s49Var.a).a = WallpapersListActivity.j0[i];
                return;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout;
        View view;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ld5 ld5Var;
        int intValue;
        int i8;
        wh8 wh8Var;
        uib uibVar;
        FrameLayout frameLayout;
        byte b = this.c;
        int i9 = 20;
        int i10 = 3;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new s49(((ix0) obj).S1);
            case 1:
                je3 je3Var = (je3) obj;
                if (i == 0) {
                    linearLayout = je3Var.Y1;
                } else if (i == 2) {
                    View view2 = je3Var.Z1;
                    e49 e49Var = new e49(-1, -2);
                    int i11 = je3Var.u0;
                    ((ViewGroup.MarginLayoutParams) e49Var).leftMargin = i11;
                    ((ViewGroup.MarginLayoutParams) e49Var).rightMargin = i11;
                    view2.setLayoutParams(e49Var);
                    linearLayout = view2;
                } else {
                    mhb mhbVar = new mhb(viewGroup.getContext());
                    mhbVar.setFixedSize(12);
                    int i12 = bkb.Z6;
                    ColorDrawable colorDrawable = new ColorDrawable(bkb.w0(null, i12, false));
                    zkb.x(mhbVar, colorDrawable, i12, null, PorterDuff.Mode.SRC_IN);
                    fm2 fm2Var = new fm2(colorDrawable, bkb.W0(viewGroup.getContext(), 2131231233, bkb.a7));
                    fm2Var.x = true;
                    mhbVar.setBackgroundDrawable(fm2Var);
                    linearLayout = mhbVar;
                }
                return new s49(linearLayout);
            case 2:
                r84 r84Var = (r84) obj;
                wjb wjbVar = r84Var.a;
                if (i == 0) {
                    view = new o84(r84Var, r84Var.getContext());
                } else if (i == 2) {
                    view = new wh4(r84Var.getContext(), 16, (byte) 0);
                } else {
                    Context context = r84Var.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout2.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout2.addView(imageView, nme.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout2.a = textView;
                    textView.setTypeface(gl.o());
                    zkb.X(textView, bkb.F6, wjbVar);
                    textView.setTextSize(1, 14.0f);
                    frameLayout2.addView(textView, nme.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.b = textView2;
                    zkb.X(textView2, bkb.x6, wjbVar);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout2.addView(textView2, nme.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout2;
                }
                return ls6.h(view, view, -1, -2);
            case 3:
                qf4 qf4Var = new qf4(viewGroup.getContext(), ((tf4) obj).o2);
                ?? s49Var = new s49(qf4Var);
                s49Var.v = qf4Var;
                qf4Var.setLayoutParams(new e49(-2, gl.L(30.0f)));
                return s49Var;
            case 4:
                s37 s37Var = new s37(viewGroup.getContext());
                s37Var.setLayoutParams(new e49(-1, gl.L(50.0f)));
                return new s49(s37Var);
            case 5:
                wjb wjbVar2 = ((an7) obj).f;
                Context context2 = viewGroup.getContext();
                int i13 = 61;
                if (i != 0) {
                    if (i != 2) {
                        if (i != 3) {
                            ld5 ld5Var2 = new ld5(context2, wjbVar2);
                            zkb.h(bkb.c6, wjbVar2, ld5Var2);
                            ld5Var = ld5Var2;
                        } else {
                            ld5Var = new b9a(context2, (de9) null);
                        }
                    } else {
                        m13 m13Var = new m13(70, wjbVar2, context2);
                        m13Var.d = (byte) 61;
                        zkb.h(bkb.c6, wjbVar2, m13Var);
                        ld5Var = m13Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.b = radioButton;
                    radioButton.setSize(gl.L(20.0f));
                    zkb.O(radioButton, bkb.f7, bkb.g7, wjbVar2);
                    boolean z = k96.a0;
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
                    frameLayout3.addView(radioButton, nme.d(22, 22.0f, i14, f, 0.0f, i9, 0.0f));
                    wf2 wf2Var = new wf2(24, wjbVar2, context2);
                    frameLayout3.c = wf2Var;
                    int i15 = bkb.c6;
                    wf2Var.b(-1, i15, bkb.j7);
                    wf2Var.setDrawUnchecked(false);
                    wf2Var.setDrawBackgroundAsArc(3);
                    boolean z2 = k96.a0;
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
                    frameLayout3.addView(wf2Var, nme.d(26, 26.0f, i16, f2, 0.0f, i17, 0.0f));
                    wf2Var.a(true, false);
                    TextView textView3 = new TextView(context2);
                    frameLayout3.a = textView3;
                    zkb.X(textView3, bkb.F6, wjbVar2);
                    ug8.w(textView3, 1, 16.0f, 1, 1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    if (k96.a0) {
                        i6 = 5;
                    } else {
                        i6 = 3;
                    }
                    textView3.setGravity(i6 | 16);
                    boolean z3 = k96.a0;
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
                    frameLayout3.addView(textView3, nme.d(-2, -2.0f, i18, f3, 0.0f, i13, 0.0f));
                    zkb.h(i15, wjbVar2, frameLayout3);
                    ld5Var = frameLayout3;
                }
                return ls6.h(ld5Var, ld5Var, -1, -2);
            case 6:
                Context context3 = viewGroup.getContext();
                xh8 xh8Var = (xh8) obj;
                View c1 = xh8Var.c1(context3, i);
                if (c1 != null) {
                    return ls6.h(c1, c1, -1, -2);
                }
                if (i != 0) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    wh8Var = new wh8(this, context3, xh8Var.J0);
                                } else {
                                    lhb lhbVar = new lhb(context3, xh8Var.J0);
                                    lhbVar.setBackground(true);
                                    String M0 = k96.M0(2131749490, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i19 = bkb.Wc;
                                    lhbVar.setText(gl.H2(gl.O2(M0, i19, 0, new Runnable(this) {
                                        public final gx0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b2 = r2;
                                            gx0 gx0Var = this.b;
                                            switch (b2) {
                                                case 0:
                                                    d01.t(((xh8) gx0Var.d).o2.getParentActivity(), k96.M0(2131743955, null));
                                                    return;
                                                default:
                                                    d01.t(((xh8) gx0Var.d).o2.getParentActivity(), k96.M0(2131746590, null));
                                                    return;
                                            }
                                        }
                                    }, null), gl.O2(k96.M0(2131749491, "GiftPremiumPrivacyPolicy"), i19, 0, new Runnable(this) {
                                        public final gx0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b2 = r2;
                                            gx0 gx0Var = this.b;
                                            switch (b2) {
                                                case 0:
                                                    d01.t(((xh8) gx0Var.d).o2.getParentActivity(), k96.M0(2131743955, null));
                                                    return;
                                                default:
                                                    d01.t(((xh8) gx0Var.d).o2.getParentActivity(), k96.M0(2131746590, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    wh8Var = lhbVar;
                                }
                            } else {
                                wh8Var = new t1(context3, (byte) 0);
                            }
                        } else {
                            wh8Var = new d62(context3, (byte) 20);
                        }
                    } else {
                        int i20 = bkb.Z6;
                        b9a b9aVar = new b9a(context3, bkb.v0(i20, xh8Var.J0), 0);
                        zkb.h(i20, xh8Var.J0, b9aVar);
                        wh8Var = b9aVar;
                    }
                } else {
                    pkb pkbVar = new pkb((byte) 10, context3, this);
                    xh8Var.n2 = pkbVar;
                    pkbVar.setOrientation(1);
                    View view3 = xh8Var.w2;
                    if (view3 == null) {
                        xh8Var.m2 = new n84(context3, 1, 0, (byte) 3);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i21 = bkb.Ck;
                        canvas.drawColor(bm2.f(0.5f, bkb.v0(i21, xh8Var.J0), bkb.v0(bkb.g5, xh8Var.J0)));
                        xh8Var.m2.setBackgroundBitmap(createBitmap);
                        uq4 uq4Var = xh8Var.m2.b;
                        uq4Var.z = i21;
                        uq4Var.A = bkb.Bk;
                        uq4Var.b();
                        pkbVar.addView(xh8Var.m2, nme.r(160, 160, 1));
                    } else {
                        if (view3.getParent() != null) {
                            ((ViewGroup) xh8Var.w2.getParent()).removeView(xh8Var.w2);
                        }
                        xh8Var.Z0(pkbVar);
                    }
                    if (xh8Var.I2 == null) {
                        FrameLayout frameLayout4 = new FrameLayout(context3);
                        xh8Var.I2 = frameLayout4;
                        frameLayout4.setClipChildren(false);
                        Integer num = xh8Var.p2;
                        if (num == null) {
                            intValue = bkb.v0(bkb.u6, xh8Var.J0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        xh8Var.J2 = new l46[2];
                        for (int i22 = 0; i22 < 2; i22++) {
                            xh8Var.J2[i22] = new s11(context3, xh8Var.J0, (byte) 5);
                            l46 l46Var = xh8Var.J2[i22];
                            if (i22 == 0) {
                                i8 = 0;
                            } else {
                                i8 = 8;
                            }
                            l46Var.setVisibility(i8);
                            xh8Var.J2[i22].setTextSize(1, 16.0f);
                            xh8Var.J2[i22].setTypeface(gl.o());
                            xh8Var.J2[i22].setGravity(1);
                            zkb.X(xh8Var.J2[i22], bkb.F6, xh8Var.J0);
                            zkb.G(xh8Var.J2[i22], bkb.I6, xh8Var.J0);
                            xh8Var.I2.addView(xh8Var.J2[i22], nme.c(-2.0f, -1));
                        }
                    }
                    if (xh8Var.I2.getParent() != null) {
                        ((ViewGroup) xh8Var.I2.getParent()).removeView(xh8Var.I2);
                    }
                    pkbVar.addView(xh8Var.I2, nme.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (xh8Var.K2 == null) {
                        l46 l46Var2 = new l46(xh8Var.getContext(), xh8Var.J0);
                        xh8Var.K2 = l46Var2;
                        l46Var2.setTextSize(1, 14.0f);
                        xh8Var.K2.setGravity(1);
                        zkb.X(xh8Var.K2, bkb.F6, xh8Var.J0);
                        zkb.G(xh8Var.K2, bkb.I6, xh8Var.J0);
                    }
                    if (xh8Var.K2.getParent() != null) {
                        ((ViewGroup) xh8Var.K2.getParent()).removeView(xh8Var.K2);
                    }
                    pkbVar.addView(xh8Var.K2, nme.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    xh8Var.e1(false);
                    xh8Var.l2 = new ub(context3, (byte) 5);
                    oc6 oc6Var = new oc6((byte) 12, context3, this);
                    oc6Var.setClipChildren(false);
                    oc6Var.addView(xh8Var.l2);
                    oc6Var.addView(pkbVar);
                    n84 n84Var = xh8Var.m2;
                    wh8Var = oc6Var;
                    if (n84Var != null) {
                        n84Var.setStarParticlesView(xh8Var.l2);
                        wh8Var = oc6Var;
                    }
                }
                wh8Var.setLayoutParams(new e49(-1, -2));
                xh8Var.Y0(i, wh8Var);
                return new s49(wh8Var);
            case 7:
                Context context4 = (Context) obj;
                if (i == 0) {
                    uibVar = new ld5(context4);
                } else if (i == 1) {
                    uibVar = new ahb(context4);
                } else if (i == 2) {
                    uib uibVar2 = new uib(context4);
                    uibVar2.setCanDisable(true);
                    uibVar = uibVar2;
                } else {
                    uibVar = new mhb(context4);
                }
                uibVar.setLayoutParams(new e49(-1, -2));
                return new s49(uibVar);
            case 8:
                if (i == 0) {
                    frameLayout = new l35(viewGroup.getContext(), null);
                } else if (i == 1) {
                    Context context5 = viewGroup.getContext();
                    ?? frameLayout5 = new FrameLayout(context5);
                    iba ibaVar = new iba(2, null, context5);
                    frameLayout5.a = ibaVar;
                    ibaVar.r.setVisibility(8);
                    frameLayout5.addView(ibaVar);
                    frameLayout = frameLayout5;
                } else {
                    frameLayout = new eba(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new e49(-1, -2));
                return new s49(frameLayout);
            case 9:
                vs9 vs9Var = (vs9) obj;
                return new s49(new us9(vs9Var, vs9Var.getContext()));
            case 10:
                ?? view4 = new View(((vqa) obj).getContext());
                view4.a = 0;
                return new s49(view4);
            case 11:
                jwb jwbVar = new jwb((lwb) obj, viewGroup.getContext());
                jwbVar.setLayoutParams(new e49(-2, -1));
                return new s49(jwbVar);
            default:
                orc orcVar = (orc) obj;
                return new s49(new jrc(orcVar.F, orcVar.c));
        }
    }

    @Override
    public final void y(s49 s49Var) {
        boolean z;
        switch (this.c) {
            case 9:
                vs9 vs9Var = (vs9) this.d;
                ArrayList arrayList = vs9Var.r;
                int b = s49Var.b();
                if (b >= 0 && b < arrayList.size()) {
                    us9 us9Var = (us9) s49Var.a;
                    if (((ss9) arrayList.get(b)).a.h == vs9Var.h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    us9Var.a(z, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public gx0(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    private final void F(s49 s49Var, int i) {
    }

    private final void G(s49 s49Var, int i) {
    }
}
