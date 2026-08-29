package cg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bg.x2;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.fw0;
import org.telegram.ui.qv0;
import org.telegram.ui.th;
import org.telegram.ui.ua1;
public final class e2 extends il0 {
    public final f2 f3111c;

    public e2(f2 f2Var) {
        this.f3111c = f2Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f3111c.f3123b0;
    }

    @Override
    public final int j(int i10) {
        f2 f2Var = this.f3111c;
        if (i10 != f2Var.f3124c0) {
            if (i10 >= f2Var.f3125d0 && i10 < f2Var.f3126e0) {
                return f2Var.X();
            }
            if (i10 >= f2Var.f3127f0 && i10 < f2Var.f3128g0) {
                return 1;
            }
            if (i10 == f2Var.f3129h0) {
                return 2;
            }
            if (i10 == f2Var.f3130i0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == f2Var.f3131j0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.f6432a;
        f2 f2Var = this.f3111c;
        int i11 = f2Var.f3127f0;
        if (i10 >= i11 && i10 < f2Var.f3128g0) {
            qv0 qv0Var = (qv0) view;
            fw0 fw0Var = (fw0) f2Var.T.get(i10 - i11);
            boolean z10 = true;
            if (i10 == f2Var.f3128g0 - 1) {
                z10 = false;
            }
            qv0Var.a(fw0Var, z10);
        } else if (i10 >= f2Var.f3125d0 && i10 < f2Var.f3126e0) {
            f2Var.Y(view);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        int intValue;
        c6 c6Var2;
        int i11;
        d2 d2Var;
        c6 c6Var3;
        c6 c6Var4;
        Context context = viewGroup.getContext();
        f2 f2Var = this.f3111c;
        View Z = f2Var.Z(context, i10);
        if (Z != null) {
            return th.m(Z, Z, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            c6Var4 = ((f3) f2Var).resourcesProvider;
                            d2Var = new d2(this, context, c6Var4);
                        } else {
                            c6Var3 = ((f3) f2Var).resourcesProvider;
                            gg.f0 f0Var = new gg.f0(context, c6Var3);
                            f0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = g6.gc;
                            f0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final e2 f3076b;

                                {
                                    this.f3076b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ye.d.s(this.f3076b.f3111c.f3136p0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            ye.d.s(this.f3076b.f3111c.f3136p0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final e2 f3076b;

                                {
                                    this.f3076b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ye.d.s(this.f3076b.f3111c.f3136p0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            ye.d.s(this.f3076b.f3111c.f3136p0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            d2Var = f0Var;
                        }
                    } else {
                        d2Var = new a(context);
                    }
                } else {
                    d2Var = new fn(context, 2);
                }
            } else {
                d2Var = new x6(context, f2Var.getThemedColor(g6.f23009a7), 0);
            }
        } else {
            ua1 ua1Var = new ua1(this, context, 1);
            f2Var.f3135o0 = ua1Var;
            ua1Var.setOrientation(1);
            View view = f2Var.f3144x0;
            if (view == null) {
                f2Var.f3134n0 = new i(context, 1, 0, 1);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = g6.Mj;
                canvas.drawColor(i0.a.d(0.5f, f2Var.getThemedColor(i13), f2Var.getThemedColor(g6.f23133h5)));
                f2Var.f3134n0.setBackgroundBitmap(createBitmap);
                dg.a aVar = f2Var.f3134n0.f5590b;
                aVar.f5568w = i13;
                aVar.f5569x = g6.Lj;
                aVar.b();
                ua1Var.addView(f2Var.f3134n0, f6.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) f2Var.f3144x0.getParent()).removeView(f2Var.f3144x0);
                }
                f2Var.W(ua1Var);
            }
            if (f2Var.J0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                f2Var.J0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = f2Var.f3137q0;
                if (num == null) {
                    intValue = f2Var.getThemedColor(g6.f23383v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                f2Var.K0 = new y80[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    y80[] y80VarArr = f2Var.K0;
                    c6Var2 = ((f3) f2Var).resourcesProvider;
                    y80VarArr[i14] = new c2(context, 0, c6Var2);
                    y80 y80Var = f2Var.K0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    y80Var.setVisibility(i11);
                    f2Var.K0[i14].setTextSize(1, 16.0f);
                    f2Var.K0[i14].setTypeface(AndroidUtilities.bold());
                    f2Var.K0[i14].setGravity(1);
                    f2Var.K0[i14].setTextColor(f2Var.getThemedColor(g6.G6));
                    f2Var.K0[i14].setLinkTextColor(f2Var.getThemedColor(g6.J6));
                    f2Var.J0.addView(f2Var.K0[i14], f6.c(-2.0f, -1));
                }
            }
            if (f2Var.J0.getParent() != null) {
                ((ViewGroup) f2Var.J0.getParent()).removeView(f2Var.J0);
            }
            ua1Var.addView(f2Var.J0, f6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (f2Var.L0 == null) {
                Context context2 = f2Var.getContext();
                c6Var = ((f3) f2Var).resourcesProvider;
                y80 y80Var2 = new y80(context2, c6Var);
                f2Var.L0 = y80Var2;
                y80Var2.setTextSize(1, 14.0f);
                f2Var.L0.setGravity(1);
                f2Var.L0.setTextColor(f2Var.getThemedColor(g6.G6));
                f2Var.L0.setLinkTextColor(f2Var.getThemedColor(g6.J6));
            }
            if (f2Var.L0.getParent() != null) {
                ((ViewGroup) f2Var.L0.getParent()).removeView(f2Var.L0);
            }
            ua1Var.addView(f2Var.L0, f6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            f2Var.a0(false);
            f2Var.m0 = new h(context, 1);
            x2 x2Var = new x2(this, context, 5);
            x2Var.setClipChildren(false);
            x2Var.addView(f2Var.m0);
            x2Var.addView(ua1Var);
            i iVar = f2Var.f3134n0;
            d2Var = x2Var;
            if (iVar != null) {
                iVar.setStarParticlesView(f2Var.m0);
                d2Var = x2Var;
            }
        }
        d2Var.setLayoutParams(new f2.x0(-1, -2));
        f2Var.V(i10, d2Var);
        return new f2.n1(d2Var);
    }
}
