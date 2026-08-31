package fg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.bw0;
import org.telegram.ui.ib1;
import org.telegram.ui.rw0;
import org.telegram.ui.yh;
public final class c2 extends sl0 {
    public final d2 f6261c;

    public c2(d2 d2Var) {
        this.f6261c = d2Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f6261c.f6276c0;
    }

    @Override
    public final int j(int i10) {
        d2 d2Var = this.f6261c;
        if (i10 != d2Var.f6277d0) {
            if (i10 >= d2Var.f6278e0 && i10 < d2Var.f6279f0) {
                return d2Var.X();
            }
            if (i10 >= d2Var.f6280g0 && i10 < d2Var.f6281h0) {
                return 1;
            }
            if (i10 == d2Var.f6282i0) {
                return 2;
            }
            if (i10 == d2Var.f6283j0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == d2Var.f6284k0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.f5875a;
        d2 d2Var = this.f6261c;
        int i11 = d2Var.f6280g0;
        if (i10 >= i11 && i10 < d2Var.f6281h0) {
            bw0 bw0Var = (bw0) view;
            rw0 rw0Var = (rw0) d2Var.U.get(i10 - i11);
            boolean z4 = true;
            if (i10 == d2Var.f6281h0 - 1) {
                z4 = false;
            }
            bw0Var.a(rw0Var, z4);
        } else if (i10 >= d2Var.f6278e0 && i10 < d2Var.f6279f0) {
            d2Var.Y(view);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        int intValue;
        g6 g6Var2;
        int i11;
        b2 b2Var;
        g6 g6Var3;
        g6 g6Var4;
        Context context = viewGroup.getContext();
        d2 d2Var = this.f6261c;
        View Z = d2Var.Z(context, i10);
        if (Z != null) {
            return yh.o(Z, Z, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            g6Var4 = ((h3) d2Var).resourcesProvider;
                            b2Var = new b2(this, context, g6Var4);
                        } else {
                            g6Var3 = ((h3) d2Var).resourcesProvider;
                            jg.f0 f0Var = new jg.f0(context, g6Var3);
                            f0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = k6.f21720gc;
                            f0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final c2 f6640b;

                                {
                                    this.f6640b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            af.g.s(this.f6640b.f6261c.f6289q0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            af.g.s(this.f6640b.f6261c.f6289q0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final c2 f6640b;

                                {
                                    this.f6640b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            af.g.s(this.f6640b.f6261c.f6289q0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            af.g.s(this.f6640b.f6261c.f6289q0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            b2Var = f0Var;
                        }
                    } else {
                        b2Var = new a(context);
                    }
                } else {
                    b2Var = new jn(context, 2);
                }
            } else {
                b2Var = new z6(context, d2Var.getThemedColor(k6.f21605a7), 0);
            }
        } else {
            ib1 ib1Var = new ib1(this, context, 1);
            d2Var.f6288p0 = ib1Var;
            ib1Var.setOrientation(1);
            View view = d2Var.f6297y0;
            if (view == null) {
                d2Var.f6287o0 = new i(context, 1, 0, 1);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = k6.Mj;
                canvas.drawColor(i0.a.d(0.5f, d2Var.getThemedColor(i13), d2Var.getThemedColor(k6.f21731h5)));
                d2Var.f6287o0.setBackgroundBitmap(createBitmap);
                gg.a aVar = d2Var.f6287o0.f7087b;
                aVar.f7065w = i13;
                aVar.f7066x = k6.Lj;
                aVar.b();
                ib1Var.addView(d2Var.f6287o0, c6.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) d2Var.f6297y0.getParent()).removeView(d2Var.f6297y0);
                }
                d2Var.W(ib1Var);
            }
            if (d2Var.K0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                d2Var.K0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = d2Var.f6290r0;
                if (num == null) {
                    intValue = d2Var.getThemedColor(k6.f21979v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                d2Var.L0 = new g90[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    g90[] g90VarArr = d2Var.L0;
                    g6Var2 = ((h3) d2Var).resourcesProvider;
                    g90VarArr[i14] = new a2(context, 0, g6Var2);
                    g90 g90Var = d2Var.L0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    g90Var.setVisibility(i11);
                    d2Var.L0[i14].setTextSize(1, 16.0f);
                    d2Var.L0[i14].setTypeface(AndroidUtilities.bold());
                    d2Var.L0[i14].setGravity(1);
                    d2Var.L0[i14].setTextColor(d2Var.getThemedColor(k6.G6));
                    d2Var.L0[i14].setLinkTextColor(d2Var.getThemedColor(k6.J6));
                    d2Var.K0.addView(d2Var.L0[i14], c6.c(-2.0f, -1));
                }
            }
            if (d2Var.K0.getParent() != null) {
                ((ViewGroup) d2Var.K0.getParent()).removeView(d2Var.K0);
            }
            ib1Var.addView(d2Var.K0, c6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (d2Var.M0 == null) {
                Context context2 = d2Var.getContext();
                g6Var = ((h3) d2Var).resourcesProvider;
                g90 g90Var2 = new g90(context2, g6Var);
                d2Var.M0 = g90Var2;
                g90Var2.setTextSize(1, 14.0f);
                d2Var.M0.setGravity(1);
                d2Var.M0.setTextColor(d2Var.getThemedColor(k6.G6));
                d2Var.M0.setLinkTextColor(d2Var.getThemedColor(k6.J6));
            }
            if (d2Var.M0.getParent() != null) {
                ((ViewGroup) d2Var.M0.getParent()).removeView(d2Var.M0);
            }
            ib1Var.addView(d2Var.M0, c6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            d2Var.a0(false);
            d2Var.f6286n0 = new h(context, 1);
            eg.s2 s2Var = new eg.s2(this, context, 5);
            s2Var.setClipChildren(false);
            s2Var.addView(d2Var.f6286n0);
            s2Var.addView(ib1Var);
            i iVar = d2Var.f6287o0;
            b2Var = s2Var;
            if (iVar != null) {
                iVar.setStarParticlesView(d2Var.f6286n0);
                b2Var = s2Var;
            }
        }
        b2Var.setLayoutParams(new f2.x0(-1, -2));
        d2Var.V(i10, b2Var);
        return new f2.m1(b2Var);
    }
}
