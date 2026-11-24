package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class mv4 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    public static c4c i(int i, TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        c4c K = c4c.K(mv4.class);
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
    public final void a(o39 o39Var, View view, c4c c4cVar) {
        ((nv4) view).e(c4cVar.h, false);
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        boolean z2;
        float f;
        int i;
        nv4 nv4Var = (nv4) view;
        Object obj = c4cVar.H;
        boolean z3 = false;
        if (obj instanceof mu4) {
            mu4 mu4Var = (mu4) obj;
            yc ycVar = nv4Var.K;
            TextView textView = nv4Var.J;
            TextView textView2 = nv4Var.I;
            TextView textView3 = nv4Var.N;
            kv4 kv4Var = nv4Var.e;
            be0 be0Var = nv4Var.E;
            TextView textView4 = nv4Var.M;
            int d = mu4Var.d();
            if (nv4Var.k0 != mu4Var) {
                cua f1 = jva.f1(be0Var, be0Var.getImageReceiver(), d);
                nv4Var.O = f1;
                f1.run();
                nv4Var.O = null;
            }
            kv4Var.d(null);
            kv4Var.e(null);
            kv4Var.g(null);
            textView2.setText(k96.G(d, "Gift2Months", new Object[0]));
            textView.setText(k96.M0(2131743989, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            be0Var.setTranslationY(-gl.L(8.0f));
            nv4Var.n.setVisibility(8);
            nv4Var.G.setVisibility(8);
            if (mu4Var.c == null && mu4Var.d == null) {
                textView3.setVisibility(8);
            } else {
                if (bkb.I.o()) {
                    i = -1333971;
                } else {
                    i = -2722014;
                }
                textView3.setTextColor(i);
                textView3.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.E(mu4Var.g(), ','));
                spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
                cm2[] cm2VarArr = new cm2[1];
                textView3.setText(jva.a1(false, k96.V(null, null, 2131746837, spannableStringBuilder), 0.48f, cm2VarArr));
                cm2VarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = nv4Var.F;
            layoutParams.gravity = 49;
            be0Var.setLayoutParams(layoutParams);
            textView4.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
            textView4.setTextSize(1, 12.0f);
            textView4.setText(mu4Var.c());
            nv4Var.t0 = (byte) 0;
            nv4Var.L.setBackground(bkb.b0(gl.L(13.0f), 422810068));
            textView4.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) ycVar.getLayoutParams()).topMargin = gl.L(130.0f);
            ((FrameLayout.LayoutParams) ycVar.getLayoutParams()).gravity = 49;
            nv4Var.k0 = mu4Var;
            nv4Var.l0 = null;
            nv4Var.b0 = mu4Var;
            nv4Var.c0 = null;
            nv4Var.e0 = false;
            nv4Var.f0 = null;
            nv4Var.g0 = false;
            nv4Var.h0 = false;
            nv4Var.i0 = false;
            nv4Var.R = null;
            nv4Var.S = null;
            nv4Var.d(false, false);
            nv4Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z4 = c4cVar.e;
            Object obj2 = c4cVar.I;
            if (obj2 instanceof Boolean) {
                z2 = ((Boolean) obj2).booleanValue();
            } else {
                z2 = false;
            }
            nv4Var.h(starGift, z4, z2, c4cVar.r, c4cVar.s, c4cVar.u);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z3 = nv4Var.i((TL_stars.SavedStarGift) obj, c4cVar.r, c4cVar.s);
        }
        if (c4cVar.f) {
            nv4Var.c(c4cVar.e, z3);
        }
        nv4Var.e(c4cVar.h, z3);
        FrameLayout frameLayout = nv4Var.d;
        float f2 = 1.0f;
        if (c4cVar.g) {
            f = 1.0f;
        } else {
            f = 0.65f;
        }
        frameLayout.setAlpha(f);
        ov4 ov4Var = nv4Var.f;
        if (!c4cVar.g) {
            f2 = 0.5f;
        }
        ov4Var.setAlpha(f2);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new nv4(i, wjbVar, context);
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.r == c4cVar2.r) {
            Object obj = c4cVar.H;
            if (obj != null || c4cVar2.H != null) {
                if (obj instanceof mu4) {
                    if (obj == c4cVar2.H) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = c4cVar2.H;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = c4cVar2.H;
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
            if (c4cVar.A == c4cVar2.A && c4cVar.e == c4cVar2.e && c4cVar.C == c4cVar2.C && TextUtils.equals(c4cVar.m, c4cVar2.m)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
