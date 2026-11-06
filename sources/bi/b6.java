package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xq;
public final class b6 extends FrameLayout {
    public final zh.w0 f3511a;
    public final FrameLayout f3512b;
    public final org.telegram.ui.Components.l9 f3513c;
    public final TextView d;
    public final FrameLayout f3514e;
    public final ImageView f3515f;
    public TL_stars.StarGift h;
    public boolean f3516n;

    public b6(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ha.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.r1(0.12f, -4530177)));
        frameLayout.setForeground(new t6(org.telegram.messenger.g0.L(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231078);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, c8.ha.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3512b = frameLayout2;
        zh.w0 w0Var = new zh.w0(frameLayout2, null, false);
        this.f3511a = w0Var;
        frameLayout2.setBackground(w0Var);
        w0Var.f60458s = org.telegram.messenger.g0.L(18.0f);
        w0Var.v = false;
        frameLayout.addView(frameLayout2, c8.ha.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f3513c = l9Var;
        frameLayout2.addView(l9Var, c8.ha.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, c8.ha.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f3514e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, c8.ha.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f3515f = imageView2;
        imageView2.setImageResource(2131232096);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, c8.ha.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z9) {
        boolean z10;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ea.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            zh.w0 w0Var = this.f3511a;
            w0Var.d(stargiftattributebackdrop);
            w0Var.e((TL_stars.starGiftAttributePattern) ea.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            dd.c1(this.f3513c.getImageReceiver(), ((TL_stars.starGiftAttributeModel) ea.l(starGift.attributes, TL_stars.starGiftAttributeModel.class)).document, 52);
            int b10 = org.telegram.ui.ActionBar.k6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.k6.r1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String J0 = hi.j.J0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(J0);
            textView.setBackground(new t6(org.telegram.messenger.g0.L(10.0f), b10));
            this.f3514e.setBackground(new t6(org.telegram.messenger.g0.L(10.0f), b10));
        }
        if (starGift != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b(z10, z9);
    }

    public final void b(final boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        int i7;
        float f13;
        float f14;
        int i10;
        float f15;
        FrameLayout frameLayout = this.f3512b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.f3514e;
        frameLayout2.animate().cancel();
        float f16 = 0.6f;
        float f17 = 0.0f;
        int i11 = 0;
        if (!z10) {
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            if (z9) {
                f13 = 1.0f;
            } else {
                f13 = 0.6f;
            }
            frameLayout.setScaleX(f13);
            if (z9) {
                f16 = 1.0f;
            }
            frameLayout.setScaleY(f16);
            if (z9) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            frameLayout.setAlpha(f14);
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            if (z9) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            textView.setAlpha(f15);
            if (!z9) {
                i11 = 8;
            }
            frameLayout2.setVisibility(i11);
            if (z9) {
                f17 = 1.0f;
            }
            frameLayout2.setAlpha(f17);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator animate = frameLayout.animate();
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f10);
        if (z9) {
            f16 = 1.0f;
        }
        ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        ViewPropertyAnimator alpha = scaleY.alpha(f11);
        xq xqVar = xq.h;
        alpha.setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final b6 f3452b;

            {
                this.f3452b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z11 = z9;
                        b6 b6Var = this.f3452b;
                        if (!z11) {
                            b6Var.f3514e.setVisibility(8);
                            return;
                        } else {
                            b6Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z12 = z9;
                        b6 b6Var2 = this.f3452b;
                        if (!z12) {
                            b6Var2.f3514e.setVisibility(8);
                            return;
                        } else {
                            b6Var2.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z9;
                        b6 b6Var3 = this.f3452b;
                        if (!z13) {
                            b6Var3.f3514e.setVisibility(8);
                            return;
                        } else {
                            b6Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
        textView.setVisibility(0);
        ViewPropertyAnimator animate2 = textView.animate();
        if (z9) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        animate2.alpha(f12).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final b6 f3452b;

            {
                this.f3452b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z11 = z9;
                        b6 b6Var = this.f3452b;
                        if (!z11) {
                            b6Var.f3514e.setVisibility(8);
                            return;
                        } else {
                            b6Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z12 = z9;
                        b6 b6Var2 = this.f3452b;
                        if (!z12) {
                            b6Var2.f3514e.setVisibility(8);
                            return;
                        } else {
                            b6Var2.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z9;
                        b6 b6Var3 = this.f3452b;
                        if (!z13) {
                            b6Var3.f3514e.setVisibility(8);
                            return;
                        } else {
                            b6Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        ViewPropertyAnimator animate3 = frameLayout2.animate();
        if (z9) {
            f17 = 1.0f;
        }
        animate3.alpha(f17).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final b6 f3452b;

            {
                this.f3452b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z11 = z9;
                        b6 b6Var = this.f3452b;
                        if (!z11) {
                            b6Var.f3514e.setVisibility(8);
                            return;
                        } else {
                            b6Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z12 = z9;
                        b6 b6Var2 = this.f3452b;
                        if (!z12) {
                            b6Var2.f3514e.setVisibility(8);
                            return;
                        } else {
                            b6Var2.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z9;
                        b6 b6Var3 = this.f3452b;
                        if (!z13) {
                            b6Var3.f3514e.setVisibility(8);
                            return;
                        } else {
                            b6Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), 1073741824));
    }
}
