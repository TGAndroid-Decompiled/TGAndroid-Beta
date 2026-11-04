package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xq;
public final class f5 extends FrameLayout {
    public final ai.m2 f5077a;
    public final FrameLayout f5078b;
    public final org.telegram.ui.Components.k9 f5079c;
    public final TextView d;
    public final FrameLayout f5080e;
    public final ImageView f5081f;
    public TL_stars.StarGift h;
    public boolean f5082n;

    public f5(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, mf.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.r1(0.12f, -4530177)));
        frameLayout.setForeground(new v5(org.telegram.messenger.g0.L(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231078);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, mf.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f5078b = frameLayout2;
        ai.m2 m2Var = new ai.m2(frameLayout2, null, false);
        this.f5077a = m2Var;
        frameLayout2.setBackground(m2Var);
        m2Var.f814s = org.telegram.messenger.g0.L(18.0f);
        m2Var.v = false;
        frameLayout.addView(frameLayout2, mf.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f5079c = k9Var;
        frameLayout2.addView(k9Var, mf.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, mf.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f5080e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, mf.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f5081f = imageView2;
        imageView2.setImageResource(2131232096);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, mf.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z10) {
        boolean z11;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e9.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            ai.m2 m2Var = this.f5077a;
            m2Var.d(stargiftattributebackdrop);
            m2Var.e((TL_stars.starGiftAttributePattern) e9.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            wb.c1(this.f5079c.getImageReceiver(), ((TL_stars.starGiftAttributeModel) e9.l(starGift.attributes, TL_stars.starGiftAttributeModel.class)).document, 52);
            int b10 = org.telegram.ui.ActionBar.k6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.k6.r1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String J0 = ii.k.J0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(J0);
            textView.setBackground(new v5(org.telegram.messenger.g0.L(10.0f), b10));
            this.f5080e.setBackground(new v5(org.telegram.messenger.g0.L(10.0f), b10));
        }
        if (starGift != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        b(z11, z10);
    }

    public final void b(final boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        int i3;
        float f13;
        float f14;
        int i10;
        float f15;
        FrameLayout frameLayout = this.f5078b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.f5080e;
        frameLayout2.animate().cancel();
        float f16 = 0.6f;
        float f17 = 0.0f;
        int i11 = 0;
        if (!z11) {
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            frameLayout.setVisibility(i3);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.6f;
            }
            frameLayout.setScaleX(f13);
            if (z10) {
                f16 = 1.0f;
            }
            frameLayout.setScaleY(f16);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            frameLayout.setAlpha(f14);
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            textView.setAlpha(f15);
            if (!z10) {
                i11 = 8;
            }
            frameLayout2.setVisibility(i11);
            if (z10) {
                f17 = 1.0f;
            }
            frameLayout2.setAlpha(f17);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator animate = frameLayout.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f10);
        if (z10) {
            f16 = 1.0f;
        }
        ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        ViewPropertyAnimator alpha = scaleY.alpha(f11);
        xq xqVar = xq.h;
        alpha.setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final f5 f5013b;

            {
                this.f5013b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        f5 f5Var = this.f5013b;
                        if (!z12) {
                            f5Var.f5080e.setVisibility(8);
                            return;
                        } else {
                            f5Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        f5 f5Var2 = this.f5013b;
                        if (!z13) {
                            f5Var2.f5080e.setVisibility(8);
                            return;
                        } else {
                            f5Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        f5 f5Var3 = this.f5013b;
                        if (!z14) {
                            f5Var3.f5080e.setVisibility(8);
                            return;
                        } else {
                            f5Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
        textView.setVisibility(0);
        ViewPropertyAnimator animate2 = textView.animate();
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        animate2.alpha(f12).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final f5 f5013b;

            {
                this.f5013b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        f5 f5Var = this.f5013b;
                        if (!z12) {
                            f5Var.f5080e.setVisibility(8);
                            return;
                        } else {
                            f5Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        f5 f5Var2 = this.f5013b;
                        if (!z13) {
                            f5Var2.f5080e.setVisibility(8);
                            return;
                        } else {
                            f5Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        f5 f5Var3 = this.f5013b;
                        if (!z14) {
                            f5Var3.f5080e.setVisibility(8);
                            return;
                        } else {
                            f5Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        ViewPropertyAnimator animate3 = frameLayout2.animate();
        if (z10) {
            f17 = 1.0f;
        }
        animate3.alpha(f17).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final f5 f5013b;

            {
                this.f5013b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        f5 f5Var = this.f5013b;
                        if (!z12) {
                            f5Var.f5080e.setVisibility(8);
                            return;
                        } else {
                            f5Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        f5 f5Var2 = this.f5013b;
                        if (!z13) {
                            f5Var2.f5080e.setVisibility(8);
                            return;
                        } else {
                            f5Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        f5 f5Var3 = this.f5013b;
                        if (!z14) {
                            f5Var3.f5080e.setVisibility(8);
                            return;
                        } else {
                            f5Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), 1073741824));
    }
}
