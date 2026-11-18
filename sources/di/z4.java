package di;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lr;
public final class z4 extends FrameLayout {
    public final bi.y2 f10116a;
    public final FrameLayout f10117b;
    public final org.telegram.ui.Components.q9 f10118c;
    public final TextView d;
    public final FrameLayout f10119e;
    public final ImageView f10120f;
    public TL_stars.StarGift h;
    public boolean f10121n;

    public z4(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ma.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.n6.r1(0.12f, -4530177)));
        frameLayout.setForeground(new p5(org.telegram.messenger.g0.L(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231078);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, c8.ma.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f10117b = frameLayout2;
        bi.y2 y2Var = new bi.y2(frameLayout2, null, false);
        this.f10116a = y2Var;
        frameLayout2.setBackground(y2Var);
        y2Var.f4268s = org.telegram.messenger.g0.L(18.0f);
        y2Var.v = false;
        frameLayout.addView(frameLayout2, c8.ma.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f10118c = q9Var;
        frameLayout2.addView(q9Var, c8.ma.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, c8.ma.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f10119e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, c8.ma.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f10120f = imageView2;
        imageView2.setImageResource(2131232098);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, c8.ma.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z10) {
        boolean z11;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) x8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            bi.y2 y2Var = this.f10116a;
            y2Var.d(stargiftattributebackdrop);
            y2Var.e((TL_stars.starGiftAttributePattern) x8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            pb.d1(this.f10118c.getImageReceiver(), ((TL_stars.starGiftAttributeModel) x8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class)).document, 52);
            int b10 = org.telegram.ui.ActionBar.n6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.n6.r1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String J0 = ki.k.J0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(J0);
            textView.setBackground(new p5(org.telegram.messenger.g0.L(10.0f), b10));
            this.f10119e.setBackground(new p5(org.telegram.messenger.g0.L(10.0f), b10));
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
        int i7;
        float f13;
        float f14;
        int i10;
        float f15;
        FrameLayout frameLayout = this.f10117b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.f10119e;
        frameLayout2.animate().cancel();
        float f16 = 0.6f;
        float f17 = 0.0f;
        int i11 = 0;
        if (!z11) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
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
        lr lrVar = lr.h;
        alpha.setInterpolator(lrVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final z4 f10071b;

            {
                this.f10071b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        z4 z4Var = this.f10071b;
                        if (!z12) {
                            z4Var.f10119e.setVisibility(8);
                            return;
                        } else {
                            z4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        z4 z4Var2 = this.f10071b;
                        if (!z13) {
                            z4Var2.f10119e.setVisibility(8);
                            return;
                        } else {
                            z4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        z4 z4Var3 = this.f10071b;
                        if (!z14) {
                            z4Var3.f10119e.setVisibility(8);
                            return;
                        } else {
                            z4Var3.getClass();
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
        animate2.alpha(f12).setInterpolator(lrVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final z4 f10071b;

            {
                this.f10071b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        z4 z4Var = this.f10071b;
                        if (!z12) {
                            z4Var.f10119e.setVisibility(8);
                            return;
                        } else {
                            z4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        z4 z4Var2 = this.f10071b;
                        if (!z13) {
                            z4Var2.f10119e.setVisibility(8);
                            return;
                        } else {
                            z4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        z4 z4Var3 = this.f10071b;
                        if (!z14) {
                            z4Var3.f10119e.setVisibility(8);
                            return;
                        } else {
                            z4Var3.getClass();
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
        animate3.alpha(f17).setInterpolator(lrVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final z4 f10071b;

            {
                this.f10071b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        z4 z4Var = this.f10071b;
                        if (!z12) {
                            z4Var.f10119e.setVisibility(8);
                            return;
                        } else {
                            z4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        z4 z4Var2 = this.f10071b;
                        if (!z13) {
                            z4Var2.f10119e.setVisibility(8);
                            return;
                        } else {
                            z4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        z4 z4Var3 = this.f10071b;
                        if (!z14) {
                            z4Var3.f10119e.setVisibility(8);
                            return;
                        } else {
                            z4Var3.getClass();
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
