package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class nx4 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    public static c6c i(int i, TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        c6c K = c6c.K(nx4.class);
        K.v = 1;
        K.A = i;
        K.H = starGift;
        K.e = z;
        K.I = Boolean.valueOf(z2);
        K.s = z4;
        K.r = z3;
        K.u = z5;
        return K;
    }

    @Override
    public final void a(r59 r59Var, View view, c6c c6cVar) {
        ((ox4) view).e(c6cVar.h, false);
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        boolean z2;
        float f;
        int i;
        ox4 ox4Var = (ox4) view;
        Object obj = c6cVar.H;
        boolean z3 = false;
        if (obj instanceof nw4) {
            nw4 nw4Var = (nw4) obj;
            yd ydVar = ox4Var.K;
            TextView textView = ox4Var.J;
            TextView textView2 = ox4Var.I;
            TextView textView3 = ox4Var.N;
            lx4 lx4Var = ox4Var.e;
            bf0 bf0Var = ox4Var.E;
            TextView textView4 = ox4Var.M;
            int d = nw4Var.d();
            if (ox4Var.k0 != nw4Var) {
                gwa g1 = nxa.g1(bf0Var, bf0Var.getImageReceiver(), d);
                ox4Var.O = g1;
                g1.run();
                ox4Var.O = null;
            }
            lx4Var.d(null);
            lx4Var.e(null);
            lx4Var.g(null);
            textView2.setText(jb6.G(d, "Gift2Months", new Object[0]));
            textView.setText(jb6.M0(2131743915, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            bf0Var.setTranslationY(-gm.L(8.0f));
            ox4Var.n.setVisibility(8);
            ox4Var.G.setVisibility(8);
            if (nw4Var.c == null && nw4Var.d == null) {
                textView3.setVisibility(8);
            } else {
                if (cmb.I.o()) {
                    i = -1333971;
                } else {
                    i = -2722014;
                }
                textView3.setTextColor(i);
                textView3.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.E(nw4Var.g(), ','));
                spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
                pn2[] pn2VarArr = new pn2[1];
                textView3.setText(nxa.b1(false, jb6.V(null, null, 2131746763, spannableStringBuilder), 0.48f, pn2VarArr));
                pn2VarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = ox4Var.F;
            layoutParams.gravity = 49;
            bf0Var.setLayoutParams(layoutParams);
            textView4.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
            textView4.setTextSize(1, 12.0f);
            textView4.setText(nw4Var.c());
            ox4Var.t0 = (byte) 0;
            ox4Var.L.setBackground(cmb.b0(gm.L(13.0f), 422810068));
            textView4.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) ydVar.getLayoutParams()).topMargin = gm.L(130.0f);
            ((FrameLayout.LayoutParams) ydVar.getLayoutParams()).gravity = 49;
            ox4Var.k0 = nw4Var;
            ox4Var.l0 = null;
            ox4Var.b0 = nw4Var;
            ox4Var.c0 = null;
            ox4Var.e0 = false;
            ox4Var.f0 = null;
            ox4Var.g0 = false;
            ox4Var.h0 = false;
            ox4Var.i0 = false;
            ox4Var.R = null;
            ox4Var.S = null;
            ox4Var.d(false, false);
            ox4Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z4 = c6cVar.e;
            Object obj2 = c6cVar.I;
            if (obj2 instanceof Boolean) {
                z2 = ((Boolean) obj2).booleanValue();
            } else {
                z2 = false;
            }
            ox4Var.h(starGift, z4, z2, c6cVar.r, c6cVar.s, c6cVar.u);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z3 = ox4Var.i((TL_stars.SavedStarGift) obj, c6cVar.r, c6cVar.s);
        }
        if (c6cVar.f) {
            ox4Var.c(c6cVar.e, z3);
        }
        ox4Var.e(c6cVar.h, z3);
        FrameLayout frameLayout = ox4Var.d;
        float f2 = 1.0f;
        if (c6cVar.g) {
            f = 1.0f;
        } else {
            f = 0.65f;
        }
        frameLayout.setAlpha(f);
        px4 px4Var = ox4Var.f;
        if (!c6cVar.g) {
            f2 = 0.5f;
        }
        px4Var.setAlpha(f2);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ox4(i, ylbVar, context);
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.r == c6cVar2.r) {
            Object obj = c6cVar.H;
            if (obj != null || c6cVar2.H != null) {
                if (obj instanceof nw4) {
                    if (obj == c6cVar2.H) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = c6cVar2.H;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = c6cVar2.H;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (c6cVar.A == c6cVar2.A && c6cVar.e == c6cVar2.e && c6cVar.C == c6cVar2.C && TextUtils.equals(c6cVar.m, c6cVar2.m)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
