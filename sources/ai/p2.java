package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.ma;
import ci.wb;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
public final class p2 extends q31 {
    public static final int f878b = 0;

    static {
        q31.h(new q31());
    }

    public static r31 i(int i3, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        r31 K = r31.K(p2.class);
        K.f37636u = 1;
        K.f37640z = i3;
        K.G = starGift;
        K.f37621e = z10;
        K.H = Boolean.valueOf(z11);
        K.f37633r = z13;
        K.f37632q = z12;
        K.f37635t = z14;
        return K;
    }

    @Override
    public final void a(tj0 tj0Var, View view, r31 r31Var) {
        ((q2) view).e(r31Var.h, false);
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        boolean z11;
        float f10;
        int i3;
        q2 q2Var = (q2) view;
        Object obj = r31Var.G;
        boolean z12 = false;
        if (obj instanceof vg.j) {
            vg.j jVar = (vg.j) obj;
            o2 o2Var = q2Var.K;
            TextView textView = q2Var.J;
            TextView textView2 = q2Var.I;
            m2 m2Var = q2Var.f898e;
            k9 k9Var = q2Var.E;
            TextView textView3 = q2Var.M;
            TextView textView4 = q2Var.N;
            int d = jVar.d();
            if (q2Var.f906k0 != jVar) {
                ma f12 = wb.f1(k9Var, k9Var.getImageReceiver(), d);
                q2Var.O = f12;
                f12.run();
                q2Var.O = null;
            }
            m2Var.d(null);
            m2Var.e(null);
            m2Var.g(null);
            textView2.setText(bd.G(d, "Gift2Months", new Object[0]));
            textView.setText(bd.M0(2131744240, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            k9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            q2Var.f908n.setVisibility(8);
            q2Var.G.setVisibility(8);
            if (jVar.f56679c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    i3 = -1333971;
                } else {
                    i3 = -2722014;
                }
                textView4.setTextColor(i3);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + bd.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                wp[] wpVarArr = new wp[1];
                textView4.setText(wb.a1(false, bd.V(null, null, 2131747036, spannableStringBuilder), 0.48f, wpVarArr));
                wpVarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = q2Var.F;
            layoutParams.gravity = 49;
            k9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            q2Var.f917t0 = 0;
            q2Var.L.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) o2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) o2Var.getLayoutParams()).gravity = 49;
            q2Var.f906k0 = jVar;
            q2Var.f907l0 = null;
            q2Var.f894b0 = jVar;
            q2Var.f896c0 = null;
            q2Var.f899e0 = false;
            q2Var.f901f0 = null;
            q2Var.f902g0 = false;
            q2Var.f903h0 = false;
            q2Var.f904i0 = false;
            q2Var.R = null;
            q2Var.S = null;
            q2Var.d(false, false);
            q2Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = r31Var.f37621e;
            Object obj2 = r31Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            q2Var.h(starGift, z13, z11, r31Var.f37632q, r31Var.f37633r, r31Var.f37635t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = q2Var.i((TL_stars.SavedStarGift) obj, r31Var.f37632q, r31Var.f37633r);
        }
        if (r31Var.f37622f) {
            q2Var.c(r31Var.f37621e, z12);
        }
        q2Var.e(r31Var.h, z12);
        FrameLayout frameLayout = q2Var.d;
        float f11 = 1.0f;
        if (r31Var.f37623g) {
            f10 = 1.0f;
        } else {
            f10 = 0.65f;
        }
        frameLayout.setAlpha(f10);
        r2 r2Var = q2Var.f900f;
        if (!r31Var.f37623g) {
            f11 = 0.5f;
        }
        r2Var.setAlpha(f11);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new q2(i3, context, e6Var);
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.f37632q == r31Var2.f37632q) {
            Object obj = r31Var.G;
            if (obj != null || r31Var2.G != null) {
                if (obj instanceof vg.j) {
                    if (obj == r31Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = r31Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f27230id == ((TL_stars.StarGift) obj2).f27230id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = r31Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f27230id == savedStarGift2.gift.f27230id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (r31Var.f37640z == r31Var2.f37640z && r31Var.f37621e == r31Var2.f37621e && r31Var.B == r31Var2.B && TextUtils.equals(r31Var.f37627l, r31Var2.f37627l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
