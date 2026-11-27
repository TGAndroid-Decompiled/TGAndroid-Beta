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
public final class ox0 extends c79 {
    public final byte c;
    public final Object d;

    public ox0(Context context) {
        this.c = (byte) 7;
        this.d = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        switch (this.c) {
            case 0:
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
                return true;
            case 5:
                int i = f89Var.f;
                if (i != 0 && i != 2) {
                    return false;
                }
                return true;
            case 6:
                if (f89Var.f != 1) {
                    return false;
                }
                return true;
            case 7:
                int b = f89Var.b();
                if (b != 1 && b != 2 && b != 3 && b != 4 && b != 7) {
                    return false;
                }
                return true;
            case 8:
                int i2 = f89Var.f;
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

    public final r47 E(int i) {
        aw9 aw9Var = (aw9) this.d;
        int i2 = aw9Var.w;
        if (i >= i2 && i < aw9Var.x) {
            return (r47) aw9Var.e.get(i - i2);
        }
        int i3 = aw9Var.E;
        if (i >= i3 && i < aw9Var.F) {
            return (r47) aw9Var.f.get(i - i3);
        }
        return null;
    }

    public final void H(int i, int i2) {
        int[] iArr = ((wua) this.d).N2;
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
                if (((df3) obj).b2.h()) {
                    return 1;
                }
                return 3;
            case 2:
                return ((m94) obj).d.size();
            case 3:
                return ((rh4) obj).f3.size();
            case 4:
                return ((a67) obj).c.size();
            case 5:
                return ((aq7) obj).h;
            case 6:
                return ((kl8) obj).a2;
            case 7:
                return 6;
            case 8:
                return ((aw9) obj).r;
            case 9:
                return ((ow9) obj).r.size();
            case 10:
                return ((wua) obj).N2.length;
            case 11:
                return ((n0c) obj).U.size();
            default:
                return 12;
        }
    }

    @Override
    public final long c(int i) {
        yp7 yp7Var;
        switch (this.c) {
            case 5:
                aq7 aq7Var = (aq7) this.d;
                int i2 = aq7Var.E;
                if (i >= i2 && i < aq7Var.F) {
                    yp7Var = (yp7) aq7Var.b.get(i - i2);
                } else {
                    int i3 = aq7Var.n;
                    if (i >= i3 && i < aq7Var.r) {
                        yp7Var = (yp7) aq7Var.a.get(i - i3);
                    } else {
                        yp7Var = null;
                    }
                }
                if (yp7Var != null) {
                    return yp7Var.c;
                }
                if (i == 0) {
                    return 1L;
                }
                if (i == aq7Var.y) {
                    return 2L;
                }
                if (i == aq7Var.s) {
                    return 3L;
                }
                if (i == aq7Var.w) {
                    return 4L;
                }
                if (i == aq7Var.x) {
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
                return ((k94) ((m94) obj).d.get(i)).a;
            case 3:
            case 4:
            default:
                return super.d(i);
            case 5:
                aq7 aq7Var = (aq7) obj;
                if (i < aq7Var.E || i >= aq7Var.F) {
                    if (i == 0 || i == aq7Var.y) {
                        return 1;
                    }
                    if (i == aq7Var.s) {
                        return 2;
                    }
                    if (i == aq7Var.w || i == aq7Var.x) {
                        return 3;
                    }
                }
                return 0;
            case 6:
                kl8 kl8Var = (kl8) obj;
                if (i != kl8Var.b2) {
                    if (i >= kl8Var.c2 && i < kl8Var.d2) {
                        return kl8Var.b1();
                    }
                    if (i >= kl8Var.e2 && i < kl8Var.f2) {
                        return 1;
                    }
                    if (i == kl8Var.g2) {
                        return 2;
                    }
                    if (i == kl8Var.h2) {
                        return 3;
                    }
                    if (i == 0) {
                        return 4;
                    }
                    if (i == kl8Var.i2) {
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
                aw9 aw9Var = (aw9) obj;
                if (i == aw9Var.s || i == aw9Var.y) {
                    return 0;
                }
                r47 E = E(i);
                if (E != null && E.I3()) {
                    return 2;
                }
                return 1;
        }
    }

    @Override
    public final void t(f89 f89Var, int i) {
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
        mw9 mw9Var;
        dy2 dy2Var;
        int i2;
        float f = 0.0f;
        yp7 yp7Var = null;
        boolean z8 = true;
        switch (this.c) {
            case 0:
            case 1:
                return;
            case 2:
                m94 m94Var = (m94) this.d;
                ArrayList arrayList = m94Var.d;
                if (((k94) arrayList.get(i)).a == 1) {
                    l94 l94Var = (l94) f89Var.a;
                    l94Var.c.setColorFilter(new PorterDuffColorFilter(m94Var.e.getPixel(i, 0), PorterDuff.Mode.MULTIPLY));
                    l94Var.c.setImageDrawable(m94Var.getContext().getDrawable(((k94) arrayList.get(i)).b));
                    l94Var.a.setText(((k94) arrayList.get(i)).c);
                    l94Var.b.setText(((k94) arrayList.get(i)).d);
                    return;
                }
                return;
            case 3:
                ((qh4) f89Var).v.setData((ph4) ((rh4) this.d).f3.get(i));
                return;
            case 4:
                a67 a67Var = (a67) this.d;
                ((z57) f89Var.a).a((TLObject) a67Var.c.get(i), ((Integer) a67Var.b.get(i)).intValue(), false);
                return;
            case 5:
                aq7 aq7Var = (aq7) this.d;
                vnb vnbVar = aq7Var.f;
                int i3 = f89Var.f;
                View view = f89Var.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            f23 f23Var = (f23) view;
                            Drawable drawable = f23Var.getContext().getResources().getDrawable(2131232575);
                            Drawable drawable2 = f23Var.getContext().getResources().getDrawable(2131232576);
                            int i4 = aob.N6;
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            yob.x(f23Var, drawable, i4, vnbVar, mode);
                            yob.x(f23Var, drawable2, aob.k7, vnbVar, mode);
                            zm2 zm2Var = new zm2(drawable, drawable2);
                            f23Var.a.l(ob6.M0(2131743458, null), false);
                            f23Var.b.setImageDrawable(zm2Var);
                            f23Var.c = false;
                            return;
                        }
                        return;
                    }
                    mf5 mf5Var = (mf5) view;
                    if (i == 0) {
                        mf5Var.setText(ob6.M0(2131743864, null));
                        return;
                    } else if (i == aq7Var.y) {
                        mf5Var.setText(ob6.M0(2131743942, null));
                        return;
                    } else {
                        return;
                    }
                }
                zp7 zp7Var = (zp7) view;
                int i5 = aq7Var.E;
                if (i >= i5 && i < aq7Var.F) {
                    yp7Var = (yp7) aq7Var.b.get(i - i5);
                }
                int i6 = aq7Var.n;
                if (i >= i6 && i < aq7Var.r) {
                    yp7Var = (yp7) aq7Var.a.get(i - i6);
                }
                if (yp7Var != null) {
                    if (zp7Var.e == yp7Var) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (yp7Var == aq7Var.H) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (aq7Var.J.get(yp7Var.c) != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zp7Var.e = yp7Var;
                    zp7Var.a.setText(yp7Var.f);
                    if (i == aq7Var.F - 1) {
                        z8 = false;
                    }
                    zp7Var.d = z8;
                    zp7Var.b.a(z2, z);
                    zp7Var.c.a(z3, z);
                    return;
                }
                return;
            case 6:
                View view2 = f89Var.a;
                kl8 kl8Var = (kl8) this.d;
                int i7 = kl8Var.e2;
                if (i >= i7 && i < kl8Var.f2) {
                    yk8 yk8Var = (yk8) view2;
                    sl8 sl8Var = (sl8) kl8Var.S1.get(i - i7);
                    if (i == kl8Var.f2 - 1) {
                        z8 = false;
                    }
                    yk8Var.a(sl8Var, z8);
                    return;
                } else if (i >= kl8Var.c2 && i < kl8Var.d2) {
                    kl8Var.c1(view2);
                    return;
                } else {
                    return;
                }
            case 7:
                int i8 = f89Var.f;
                if (i8 == 0) {
                    mf5 mf5Var2 = (mf5) f89Var.a;
                    if (i == 0) {
                        M03 = ob6.M0(2131745715, null);
                    } else {
                        M03 = ob6.M0(2131745719, null);
                    }
                    mf5Var2.setText(M03);
                    return;
                }
                View view3 = f89Var.a;
                if (i8 == 1) {
                    String M06 = ob6.M0(2131745718, null);
                    im0 im0Var = phd.h;
                    im0Var.a();
                    ((wkb) view3).f(M06, im0Var.d, false);
                    return;
                } else if (i8 == 2) {
                    qmb qmbVar = (qmb) view3;
                    if (i == 1) {
                        qmbVar.c(ob6.M0(2131745713, null), uh9.l(new StringBuilder(), ((hp9) phd.d.a()).a, "p"), false, true);
                        return;
                    } else if (i == 2) {
                        String M07 = ob6.M0(2131745723, null);
                        dp9 dp9Var = (dp9) phd.e.a();
                        if (dp9Var == dp9.a) {
                            M02 = ob6.M0(2131745722, null);
                        } else if (dp9Var == dp9.b) {
                            M02 = ob6.M0(2131745720, null);
                        } else {
                            M02 = ob6.M0(2131745721, null);
                        }
                        qmbVar.c(M07, M02, false, true);
                        return;
                    } else if (i == 3) {
                        qmbVar.c(ob6.M0(2131745716, null), uh9.l(new StringBuilder(), ((ep9) phd.f.a()).a, " FPS"), false, true);
                        return;
                    } else {
                        qmbVar.c(ob6.M0(2131745724, null), kp9.a0(phd.g.a()), false, false);
                        return;
                    }
                } else {
                    ilb ilbVar = (ilb) view3;
                    if (i == 5) {
                        M0 = ob6.M0(2131745714, null);
                    } else {
                        M0 = ob6.M0(2131745717, null);
                    }
                    ilbVar.setText(M0);
                    return;
                }
            case 8:
                aw9 aw9Var = (aw9) this.d;
                qg4 qg4Var = aw9Var.K;
                int i9 = f89Var.f;
                View view4 = f89Var.a;
                if (i9 == 0) {
                    p55 p55Var = (p55) view4;
                    if (i == aw9Var.s) {
                        String M08 = ob6.M0(2131751309, null);
                        boolean equals = p55Var.getText().equals(M08);
                        boolean z9 = aw9Var.I;
                        if (equals) {
                            if (z9) {
                                M05 = ob6.M0(2131747160, null);
                            } else {
                                M05 = ob6.M0(2131745780, null);
                            }
                            boolean z10 = aw9Var.I;
                            si siVar = p55Var.b;
                            siVar.c(M05, true, z10);
                            siVar.setVisibility(0);
                            return;
                        }
                        if (z9) {
                            M04 = ob6.M0(2131747160, null);
                        } else {
                            M04 = ob6.M0(2131745780, null);
                        }
                        p55Var.b(M08, M04, new zv9(this));
                        return;
                    } else if (i == aw9Var.y) {
                        p55Var.b(ob6.M0(2131746089, null), ob6.M0(2131745223, null), new jn8(this, (byte) 17));
                        return;
                    } else {
                        return;
                    }
                }
                r47 E = E(i);
                if (E != null) {
                    if (aw9Var.J.u() && i >= aw9Var.w && i < aw9Var.x) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i9 == 1) {
                        xv9 xv9Var = (xv9) view4;
                        yob.h(aob.d6, null, xv9Var);
                        zea zeaVar = xv9Var.a;
                        if (zeaVar.getMessage() == null) {
                            e12 = 0;
                        } else {
                            e12 = zeaVar.getMessage().e1();
                        }
                        zeaVar.c(E, true);
                        int e13 = zeaVar.getMessage().e1();
                        qg4Var.a = r47.B0(zeaVar.getMessage().k);
                        qg4Var.b = e13;
                        boolean d = aw9Var.J.d(qg4Var);
                        if (e12 == E.e1()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zeaVar.b(d, z6);
                        if (e12 != E.e1()) {
                            z8 = false;
                        }
                        if (zeaVar.P != z4) {
                            zeaVar.P = z4;
                            if (!z8) {
                                if (z4) {
                                    f = 1.0f;
                                }
                                zeaVar.Q = f;
                            }
                            zeaVar.invalidate();
                            return;
                        }
                        return;
                    } else if (i9 == 2) {
                        vea veaVar = (vea) view4;
                        if (veaVar.getMessage() == null) {
                            e1 = 0;
                        } else {
                            e1 = veaVar.getMessage().e1();
                        }
                        veaVar.f(E, true);
                        int e14 = veaVar.getMessage().e1();
                        qg4Var.a = r47.B0(veaVar.getMessage().k);
                        qg4Var.b = e14;
                        boolean d2 = aw9Var.J.d(qg4Var);
                        if (e1 == E.e1()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        veaVar.e(d2, z5);
                        if (e1 != E.e1()) {
                            z8 = false;
                        }
                        if (veaVar.e0 != z4) {
                            veaVar.e0 = z4;
                            if (!z8) {
                                if (z4) {
                                    f = 1.0f;
                                }
                                veaVar.f0 = f;
                            }
                            veaVar.invalidate();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                View view5 = f89Var.a;
                ow9 ow9Var = (ow9) this.d;
                ArrayList arrayList2 = ow9Var.r;
                if (i >= 0 && i < arrayList2.size()) {
                    lw9 lw9Var = (lw9) arrayList2.get(i);
                    nw9 nw9Var = (nw9) view5;
                    w49 w49Var = nw9Var.d;
                    if (w49Var != null && w49Var.equals(lw9Var.a)) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = lw9Var.a.g();
                        tL_reactionCount.count = lw9Var.b;
                        ow9 ow9Var2 = nw9Var.s;
                        mw9 mw9Var2 = new mw9(nw9Var, ow9Var2.a, nw9Var, tL_reactionCount, ow9Var2.c);
                        nw9Var.a = mw9Var2;
                        mw9Var2.E.d(hl.L(29.0f), hl.L(100.0f));
                        mw9Var = nw9Var.a;
                        mw9Var.p = true;
                        mw9Var.R = true;
                    } else {
                        mw9Var = nw9Var.a;
                        mw9Var.v = lw9Var.b;
                    }
                    nw9Var.d = lw9Var.a;
                    if (!z7) {
                        mw9Var.e = mw9Var.z;
                    }
                    mw9Var.z = hl.L(44.33f);
                    nw9Var.a.t = !TextUtils.isEmpty(lw9Var.c);
                    mw9 mw9Var3 = nw9Var.a;
                    boolean z11 = mw9Var3.t;
                    hn hnVar = mw9Var3.F;
                    if (z11) {
                        hnVar.t(pv3.m(lw9Var.c, hnVar.a.getFontMetricsInt(), false, null, 0), !z7, true);
                    } else if (hnVar != null) {
                        hnVar.t("", !z7, true);
                    }
                    nw9Var.a.getClass();
                    nw9Var.a.E.c(lw9Var.b, !z7);
                    mw9 mw9Var4 = nw9Var.a;
                    if (mw9Var4.E != null && (mw9Var4.v > 0 || mw9Var4.t)) {
                        float f2 = mw9Var4.z;
                        int ceil = (int) Math.ceil(dy2Var.m);
                        if (nw9Var.a.t) {
                            f = 4.0f;
                        }
                        mw9 mw9Var5 = nw9Var.a;
                        mw9Var4.z = (int) (hl.L(f) + ceil + mw9Var5.F.d + f2);
                        mw9Var4 = mw9Var5;
                    }
                    if (z7) {
                        mw9Var4.e = mw9Var4.z;
                    }
                    mw9Var4.A = hl.L(28.0f);
                    mw9 mw9Var6 = nw9Var.a;
                    mw9Var6.o = nw9Var.e;
                    if (nw9Var.r) {
                        mw9Var6.a();
                    }
                    if (!z7) {
                        nw9Var.requestLayout();
                    }
                    nw9 nw9Var2 = (nw9) view5;
                    if (lw9Var.a.h != ow9Var.h) {
                        z8 = false;
                    }
                    nw9Var2.a(z8, false);
                    return;
                }
                return;
            case 10:
                int[] iArr = ((wua) this.d).N2;
                px0 px0Var = (px0) f89Var.a;
                int i10 = iArr[(iArr.length - 1) - i];
                if (px0Var.a != i10) {
                    px0Var.a = i10;
                    px0Var.requestLayout();
                    return;
                }
                return;
            case 11:
                l0c l0cVar = (l0c) f89Var.a;
                k0c k0cVar = (k0c) ((n0c) this.d).U.get(i);
                n0c n0cVar = l0cVar.s;
                de0 de0Var = l0cVar.a;
                k0c k0cVar2 = l0cVar.e;
                if (k0cVar2 == null || k0cVar2.a != k0cVar.a || !Objects.equals(k0cVar2.b, k0cVar.b)) {
                    z8 = false;
                }
                if (n0cVar.a0 >= 1.0f && n0cVar.k0 == null) {
                    l0cVar.setScaleX(1.0f);
                    l0cVar.setScaleY(1.0f);
                    l0cVar.setAlpha(1.0f);
                }
                l0cVar.e = k0cVar;
                if (!z8) {
                    de0Var.setAnimatedEmojiDrawable(null);
                    l0cVar.h = null;
                    l0cVar.n = 0;
                    if (k0cVar.a != 0) {
                        l0cVar.f = null;
                        de0Var.setVisibility(0);
                        wl wlVar = new wl(3, n0cVar.a, k0cVar.a);
                        l0cVar.h = wlVar;
                        de0Var.setAnimatedEmojiDrawable(wlVar);
                    } else {
                        if (k0cVar.b.booleanValue()) {
                            i2 = 2131743646;
                        } else {
                            i2 = 2131743645;
                        }
                        l0cVar.f = ob6.M0(i2, null);
                        de0Var.setVisibility(8);
                    }
                    l0cVar.setContentDescription(l0cVar.f);
                }
                l0cVar.a(z8);
                l0cVar.requestLayout();
                l0cVar.invalidate();
                return;
            default:
                ((xvc) f89Var.a).a = WallpapersListActivity.j0[i];
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout;
        View view;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        mf5 mf5Var;
        int intValue;
        int i9;
        jl8 jl8Var;
        qmb qmbVar;
        FrameLayout frameLayout;
        byte b = this.c;
        int i10 = 20;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new f89(((qx0) obj).S1);
            case 1:
                df3 df3Var = (df3) obj;
                if (i == 0) {
                    linearLayout = df3Var.Y1;
                } else if (i == 2) {
                    View view2 = df3Var.Z1;
                    r79 r79Var = new r79(-1, -2);
                    int i11 = df3Var.u0;
                    ((ViewGroup.MarginLayoutParams) r79Var).leftMargin = i11;
                    ((ViewGroup.MarginLayoutParams) r79Var).rightMargin = i11;
                    view2.setLayoutParams(r79Var);
                    linearLayout = view2;
                } else {
                    ilb ilbVar = new ilb(viewGroup.getContext());
                    ilbVar.setFixedSize(12);
                    int i12 = aob.a7;
                    ColorDrawable colorDrawable = new ColorDrawable(aob.w0(null, i12, false));
                    yob.x(ilbVar, colorDrawable, i12, null, PorterDuff.Mode.SRC_IN);
                    zm2 zm2Var = new zm2(colorDrawable, aob.W0(viewGroup.getContext(), 2131231233, aob.b7));
                    zm2Var.x = true;
                    ilbVar.setBackgroundDrawable(zm2Var);
                    linearLayout = ilbVar;
                }
                return new f89(linearLayout);
            case 2:
                m94 m94Var = (m94) obj;
                vnb vnbVar = m94Var.a;
                if (i == 0) {
                    view = new j94(m94Var, m94Var.getContext());
                } else if (i == 2) {
                    view = new ak4(m94Var.getContext(), 16, (byte) 0);
                } else {
                    Context context = m94Var.getContext();
                    ?? frameLayout2 = new FrameLayout(context);
                    ImageView imageView = new ImageView(context);
                    frameLayout2.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    frameLayout2.addView(imageView, tre.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    frameLayout2.a = textView;
                    textView.setTypeface(hl.o());
                    yob.X(textView, aob.G6, vnbVar);
                    textView.setTextSize(1, 14.0f);
                    frameLayout2.addView(textView, tre.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.b = textView2;
                    yob.X(textView2, aob.y6, vnbVar);
                    textView2.setTextSize(1, 14.0f);
                    frameLayout2.addView(textView2, tre.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = frameLayout2;
                }
                return qu6.h(view, view, -1, -2);
            case 3:
                oh4 oh4Var = new oh4(viewGroup.getContext(), ((rh4) obj).o2);
                ?? f89Var = new f89(oh4Var);
                f89Var.v = oh4Var;
                oh4Var.setLayoutParams(new r79(-2, hl.L(30.0f)));
                return f89Var;
            case 4:
                z57 z57Var = new z57(viewGroup.getContext());
                z57Var.setLayoutParams(new r79(-1, hl.L(50.0f)));
                return new f89(z57Var);
            case 5:
                vnb vnbVar2 = ((aq7) obj).f;
                Context context2 = viewGroup.getContext();
                int i13 = 61;
                if (i != 0) {
                    if (i != 2) {
                        if (i != 3) {
                            mf5 mf5Var2 = new mf5(context2, vnbVar2);
                            yob.h(aob.d6, vnbVar2, mf5Var2);
                            mf5Var = mf5Var2;
                        } else {
                            mf5Var = new sca(context2, (uh9) null);
                        }
                    } else {
                        f23 f23Var = new f23(70, vnbVar2, context2);
                        f23Var.d = (byte) 61;
                        yob.h(aob.d6, vnbVar2, f23Var);
                        mf5Var = f23Var;
                    }
                } else {
                    ?? frameLayout3 = new FrameLayout(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    frameLayout3.b = radioButton;
                    radioButton.setSize(hl.L(20.0f));
                    yob.O(radioButton, aob.g7, aob.h7, vnbVar2);
                    boolean z = ob6.a0;
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
                        i10 = 0;
                    }
                    frameLayout3.addView(radioButton, tre.d(22, 22.0f, i14, f, 0.0f, i10, 0.0f));
                    og2 og2Var = new og2(24, vnbVar2, context2);
                    frameLayout3.c = og2Var;
                    int i15 = aob.d6;
                    og2Var.b(-1, i15, aob.k7);
                    og2Var.setDrawUnchecked(false);
                    og2Var.setDrawBackgroundAsArc(3);
                    boolean z2 = ob6.a0;
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
                    frameLayout3.addView(og2Var, tre.d(26, 26.0f, i16, f2, 0.0f, i17, 0.0f));
                    og2Var.a(true, false);
                    TextView textView3 = new TextView(context2);
                    frameLayout3.a = textView3;
                    yob.X(textView3, aob.G6, vnbVar2);
                    ik8.w(textView3, 1, 16.0f, 1, 1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    if (ob6.a0) {
                        i6 = 5;
                    } else {
                        i6 = 3;
                    }
                    textView3.setGravity(i6 | 16);
                    boolean z3 = ob6.a0;
                    if (z3) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    int i18 = i7 | 16;
                    if (z3) {
                        i8 = 23;
                    } else {
                        i8 = 61;
                    }
                    float f3 = i8;
                    if (!z3) {
                        i13 = 23;
                    }
                    frameLayout3.addView(textView3, tre.d(-2, -2.0f, i18, f3, 0.0f, i13, 0.0f));
                    yob.h(i15, vnbVar2, frameLayout3);
                    mf5Var = frameLayout3;
                }
                return qu6.h(mf5Var, mf5Var, -1, -2);
            case 6:
                Context context3 = viewGroup.getContext();
                kl8 kl8Var = (kl8) obj;
                View d1 = kl8Var.d1(context3, i);
                if (d1 != null) {
                    return qu6.h(d1, d1, -1, -2);
                }
                if (i != 0) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    jl8Var = new jl8(this, context3, kl8Var.J0);
                                } else {
                                    hlb hlbVar = new hlb(context3, kl8Var.J0);
                                    hlbVar.setBackground(true);
                                    String M0 = ob6.M0(2131749451, "GiftPremiumPrivacyPolicyAndTerms");
                                    int i19 = aob.Xc;
                                    hlbVar.setText(hl.G2(hl.N2(M0, i19, 0, new Runnable(this) {
                                        public final ox0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b2 = r2;
                                            ox0 ox0Var = this.b;
                                            switch (b2) {
                                                case 0:
                                                    m01.u(((kl8) ox0Var.d).o2.getParentActivity(), ob6.M0(2131743849, null));
                                                    return;
                                                default:
                                                    m01.u(((kl8) ox0Var.d).o2.getParentActivity(), ob6.M0(2131746510, null));
                                                    return;
                                            }
                                        }
                                    }, null), hl.N2(ob6.M0(2131749452, "GiftPremiumPrivacyPolicy"), i19, 0, new Runnable(this) {
                                        public final ox0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b2 = r2;
                                            ox0 ox0Var = this.b;
                                            switch (b2) {
                                                case 0:
                                                    m01.u(((kl8) ox0Var.d).o2.getParentActivity(), ob6.M0(2131743849, null));
                                                    return;
                                                default:
                                                    m01.u(((kl8) ox0Var.d).o2.getParentActivity(), ob6.M0(2131746510, null));
                                                    return;
                                            }
                                        }
                                    }, null), "%1$s"));
                                    jl8Var = hlbVar;
                                }
                            } else {
                                jl8Var = new u1(context3, (byte) 0);
                            }
                        } else {
                            jl8Var = new t62(context3, (byte) 20);
                        }
                    } else {
                        int i20 = aob.a7;
                        sca scaVar = new sca(context3, aob.v0(i20, kl8Var.J0), 0);
                        yob.h(i20, kl8Var.J0, scaVar);
                        jl8Var = scaVar;
                    }
                } else {
                    oob oobVar = new oob((byte) 10, context3, this);
                    kl8Var.n2 = oobVar;
                    oobVar.setOrientation(1);
                    View view3 = kl8Var.w2;
                    if (view3 == null) {
                        kl8Var.m2 = new i94(context3, 1, 0, (byte) 3);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i21 = aob.Dk;
                        canvas.drawColor(vm2.f(0.5f, aob.v0(i21, kl8Var.J0), aob.v0(aob.h5, kl8Var.J0)));
                        kl8Var.m2.setBackgroundBitmap(createBitmap);
                        ys4 ys4Var = kl8Var.m2.b;
                        ys4Var.z = i21;
                        ys4Var.A = aob.Ck;
                        ys4Var.b();
                        oobVar.addView(kl8Var.m2, tre.r(160, 160, 1));
                    } else {
                        if (view3.getParent() != null) {
                            ((ViewGroup) kl8Var.w2.getParent()).removeView(kl8Var.w2);
                        }
                        kl8Var.a1(oobVar);
                    }
                    if (kl8Var.I2 == null) {
                        FrameLayout frameLayout4 = new FrameLayout(context3);
                        kl8Var.I2 = frameLayout4;
                        frameLayout4.setClipChildren(false);
                        Integer num = kl8Var.p2;
                        if (num == null) {
                            intValue = aob.v0(aob.v6, kl8Var.J0);
                        } else {
                            intValue = num.intValue();
                        }
                        new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                        kl8Var.J2 = new p66[2];
                        for (int i22 = 0; i22 < 2; i22++) {
                            kl8Var.J2[i22] = new b21(context3, kl8Var.J0, (byte) 6);
                            p66 p66Var = kl8Var.J2[i22];
                            if (i22 == 0) {
                                i9 = 0;
                            } else {
                                i9 = 8;
                            }
                            p66Var.setVisibility(i9);
                            kl8Var.J2[i22].setTextSize(1, 16.0f);
                            kl8Var.J2[i22].setTypeface(hl.o());
                            kl8Var.J2[i22].setGravity(1);
                            yob.X(kl8Var.J2[i22], aob.G6, kl8Var.J0);
                            yob.G(kl8Var.J2[i22], aob.J6, kl8Var.J0);
                            kl8Var.I2.addView(kl8Var.J2[i22], tre.c(-2.0f, -1));
                        }
                    }
                    if (kl8Var.I2.getParent() != null) {
                        ((ViewGroup) kl8Var.I2.getParent()).removeView(kl8Var.I2);
                    }
                    oobVar.addView(kl8Var.I2, tre.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (kl8Var.K2 == null) {
                        p66 p66Var2 = new p66(kl8Var.getContext(), kl8Var.J0);
                        kl8Var.K2 = p66Var2;
                        p66Var2.setTextSize(1, 14.0f);
                        kl8Var.K2.setGravity(1);
                        yob.X(kl8Var.K2, aob.G6, kl8Var.J0);
                        yob.G(kl8Var.K2, aob.J6, kl8Var.J0);
                    }
                    if (kl8Var.K2.getParent() != null) {
                        ((ViewGroup) kl8Var.K2.getParent()).removeView(kl8Var.K2);
                    }
                    oobVar.addView(kl8Var.K2, tre.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    kl8Var.f1(false);
                    kl8Var.l2 = new vb(context3, (byte) 5);
                    d26 d26Var = new d26((byte) 14, context3, this);
                    d26Var.setClipChildren(false);
                    d26Var.addView(kl8Var.l2);
                    d26Var.addView(oobVar);
                    i94 i94Var = kl8Var.m2;
                    jl8Var = d26Var;
                    if (i94Var != null) {
                        i94Var.setStarParticlesView(kl8Var.l2);
                        jl8Var = d26Var;
                    }
                }
                jl8Var.setLayoutParams(new r79(-1, -2));
                kl8Var.Z0(i, jl8Var);
                return new f89(jl8Var);
            case 7:
                Context context4 = (Context) obj;
                if (i == 0) {
                    qmbVar = new mf5(context4);
                } else if (i == 1) {
                    qmbVar = new wkb(context4);
                } else if (i == 2) {
                    qmb qmbVar2 = new qmb(context4);
                    qmbVar2.setCanDisable(true);
                    qmbVar = qmbVar2;
                } else {
                    qmbVar = new ilb(context4);
                }
                qmbVar.setLayoutParams(new r79(-1, -2));
                return new f89(qmbVar);
            case 8:
                if (i == 0) {
                    frameLayout = new p55(viewGroup.getContext(), null);
                } else if (i == 1) {
                    Context context5 = viewGroup.getContext();
                    ?? frameLayout5 = new FrameLayout(context5);
                    zea zeaVar = new zea(2, null, context5);
                    frameLayout5.a = zeaVar;
                    zeaVar.r.setVisibility(8);
                    frameLayout5.addView(zeaVar);
                    frameLayout = frameLayout5;
                } else {
                    frameLayout = new vea(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new r79(-1, -2));
                return new f89(frameLayout);
            case 9:
                ow9 ow9Var = (ow9) obj;
                return new f89(new nw9(ow9Var, ow9Var.getContext()));
            case 10:
                ?? view4 = new View(((wua) obj).getContext());
                view4.a = 0;
                return new f89(view4);
            case 11:
                l0c l0cVar = new l0c((n0c) obj, viewGroup.getContext());
                l0cVar.setLayoutParams(new r79(-2, -1));
                return new f89(l0cVar);
            default:
                cwc cwcVar = (cwc) obj;
                return new f89(new xvc(cwcVar.F, cwcVar.c));
        }
    }

    @Override
    public final void y(f89 f89Var) {
        boolean z;
        switch (this.c) {
            case 9:
                ow9 ow9Var = (ow9) this.d;
                ArrayList arrayList = ow9Var.r;
                int b = f89Var.b();
                if (b >= 0 && b < arrayList.size()) {
                    nw9 nw9Var = (nw9) f89Var.a;
                    if (((lw9) arrayList.get(b)).a.h == ow9Var.h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nw9Var.a(z, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ox0(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    private final void F(f89 f89Var, int i) {
    }

    private final void G(f89 f89Var, int i) {
    }
}
