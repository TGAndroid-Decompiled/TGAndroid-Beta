package eg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.hb1;
import org.telegram.ui.pw0;
import org.telegram.ui.yh;
import org.telegram.ui.zv0;
public final class d2 extends rl0 {
    public final e2 f5248c;

    public d2(e2 e2Var) {
        this.f5248c = e2Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f5248c.f5260c0;
    }

    @Override
    public final int j(int i10) {
        e2 e2Var = this.f5248c;
        if (i10 != e2Var.f5261d0) {
            if (i10 >= e2Var.f5262e0 && i10 < e2Var.f5263f0) {
                return e2Var.X();
            }
            if (i10 >= e2Var.f5264g0 && i10 < e2Var.f5265h0) {
                return 1;
            }
            if (i10 == e2Var.f5266i0) {
                return 2;
            }
            if (i10 == e2Var.f5267j0) {
                return 3;
            }
            if (i10 == 0) {
                return 4;
            }
            if (i10 == e2Var.f5268k0) {
                return 5;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.f5785a;
        e2 e2Var = this.f5248c;
        int i11 = e2Var.f5264g0;
        if (i10 >= i11 && i10 < e2Var.f5265h0) {
            zv0 zv0Var = (zv0) view;
            pw0 pw0Var = (pw0) e2Var.U.get(i10 - i11);
            boolean z4 = true;
            if (i10 == e2Var.f5265h0 - 1) {
                z4 = false;
            }
            zv0Var.a(pw0Var, z4);
        } else if (i10 >= e2Var.f5262e0 && i10 < e2Var.f5263f0) {
            e2Var.Y(view);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        int intValue;
        f6 f6Var2;
        int i11;
        c2 c2Var;
        f6 f6Var3;
        f6 f6Var4;
        Context context = viewGroup.getContext();
        e2 e2Var = this.f5248c;
        View Z = e2Var.Z(context, i10);
        if (Z != null) {
            return yh.o(Z, Z, -1, -2);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            f6Var4 = ((g3) e2Var).resourcesProvider;
                            c2Var = new c2(this, context, f6Var4);
                        } else {
                            f6Var3 = ((g3) e2Var).resourcesProvider;
                            ig.f0 f0Var = new ig.f0(context, f6Var3);
                            f0Var.setBackground(true);
                            String string = LocaleController.getString("GiftPremiumPrivacyPolicyAndTerms", R.string.GiftPremiumPrivacyPolicyAndTerms);
                            int i12 = j6.f19966gc;
                            f0Var.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(string, i12, 0, new Runnable(this) {
                                public final d2 f5217b;

                                {
                                    this.f5217b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            af.g.s(this.f5217b.f5248c.f5273q0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            af.g.s(this.f5217b.f5248c.f5273q0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            }), AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumPrivacyPolicy", R.string.GiftPremiumPrivacyPolicy), i12, 0, new Runnable(this) {
                                public final d2 f5217b;

                                {
                                    this.f5217b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            af.g.s(this.f5217b.f5248c.f5273q0.getParentActivity(), LocaleController.getString(R.string.TermsOfServiceUrl));
                                            return;
                                        default:
                                            af.g.s(this.f5217b.f5248c.f5273q0.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                                            return;
                                    }
                                }
                            })));
                            c2Var = f0Var;
                        }
                    } else {
                        c2Var = new a(context);
                    }
                } else {
                    c2Var = new hn(context, 2);
                }
            } else {
                c2Var = new z6(context, e2Var.getThemedColor(j6.f19852a7), 0);
            }
        } else {
            hb1 hb1Var = new hb1(this, context, 1);
            e2Var.f5272p0 = hb1Var;
            hb1Var.setOrientation(1);
            View view = e2Var.f5281y0;
            if (view == null) {
                e2Var.f5271o0 = new i(context, 1, 0, 1);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i13 = j6.Mj;
                canvas.drawColor(i0.a.d(0.5f, e2Var.getThemedColor(i13), e2Var.getThemedColor(j6.f19977h5)));
                e2Var.f5271o0.setBackgroundBitmap(createBitmap);
                fg.a aVar = e2Var.f5271o0.f6156b;
                aVar.f6135w = i13;
                aVar.f6136x = j6.Lj;
                aVar.b();
                hb1Var.addView(e2Var.f5271o0, b6.q(160, 160, 1));
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) e2Var.f5281y0.getParent()).removeView(e2Var.f5281y0);
                }
                e2Var.W(hb1Var);
            }
            if (e2Var.K0 == null) {
                FrameLayout frameLayout = new FrameLayout(context);
                e2Var.K0 = frameLayout;
                frameLayout.setClipChildren(false);
                Integer num = e2Var.f5274r0;
                if (num == null) {
                    intValue = e2Var.getThemedColor(j6.f20225v6);
                } else {
                    intValue = num.intValue();
                }
                new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                e2Var.L0 = new e90[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    e90[] e90VarArr = e2Var.L0;
                    f6Var2 = ((g3) e2Var).resourcesProvider;
                    e90VarArr[i14] = new b2(context, 0, f6Var2);
                    e90 e90Var = e2Var.L0[i14];
                    if (i14 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    e90Var.setVisibility(i11);
                    e2Var.L0[i14].setTextSize(1, 16.0f);
                    e2Var.L0[i14].setTypeface(AndroidUtilities.bold());
                    e2Var.L0[i14].setGravity(1);
                    e2Var.L0[i14].setTextColor(e2Var.getThemedColor(j6.G6));
                    e2Var.L0[i14].setLinkTextColor(e2Var.getThemedColor(j6.J6));
                    e2Var.K0.addView(e2Var.L0[i14], b6.c(-2.0f, -1));
                }
            }
            if (e2Var.K0.getParent() != null) {
                ((ViewGroup) e2Var.K0.getParent()).removeView(e2Var.K0);
            }
            hb1Var.addView(e2Var.K0, b6.p(-2, -2, 0.0f, 1, 40, 0, 40, 0));
            if (e2Var.M0 == null) {
                Context context2 = e2Var.getContext();
                f6Var = ((g3) e2Var).resourcesProvider;
                e90 e90Var2 = new e90(context2, f6Var);
                e2Var.M0 = e90Var2;
                e90Var2.setTextSize(1, 14.0f);
                e2Var.M0.setGravity(1);
                e2Var.M0.setTextColor(e2Var.getThemedColor(j6.G6));
                e2Var.M0.setLinkTextColor(e2Var.getThemedColor(j6.J6));
            }
            if (e2Var.M0.getParent() != null) {
                ((ViewGroup) e2Var.M0.getParent()).removeView(e2Var.M0);
            }
            hb1Var.addView(e2Var.M0, b6.p(-1, -2, 0.0f, 0, 24, 9, 24, 20));
            e2Var.a0(false);
            e2Var.f5270n0 = new h(context, 1);
            dg.u2 u2Var = new dg.u2(this, context, 5);
            u2Var.setClipChildren(false);
            u2Var.addView(e2Var.f5270n0);
            u2Var.addView(hb1Var);
            i iVar = e2Var.f5271o0;
            c2Var = u2Var;
            if (iVar != null) {
                iVar.setStarParticlesView(e2Var.f5270n0);
                c2Var = u2Var;
            }
        }
        c2Var.setLayoutParams(new f2.w0(-1, -2));
        e2Var.V(i10, c2Var);
        return new f2.l1(c2Var);
    }
}
