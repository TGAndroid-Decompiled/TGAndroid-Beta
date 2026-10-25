package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public final class x5 extends FrameLayout {
    public final zh.d1 f5677a;
    public final FrameLayout f5678b;
    public final org.telegram.ui.Components.y9 f5679c;
    public final TextView d;
    public final FrameLayout e;
    public final ImageView f5680f;
    public TL_stars.StarGift h;
    public boolean f5681n;

    public x5(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, gb1.h(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.o1(0.12f, -4530177)));
        frameLayout.setForeground(new p6(AndroidUtilities.dp(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, gb1.i(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f5678b = frameLayout2;
        zh.d1 d1Var = new zh.d1(frameLayout2, null, false);
        this.f5677a = d1Var;
        frameLayout2.setBackground(d1Var);
        d1Var.f52945s = AndroidUtilities.dp(18.0f);
        d1Var.v = false;
        frameLayout.addView(frameLayout2, gb1.i(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f5679c = y9Var;
        frameLayout2.addView(y9Var, gb1.i(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, gb1.h(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, gb1.h(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f5680f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, gb1.i(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z10) {
        boolean z11;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ca.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            zh.d1 d1Var = this.f5677a;
            d1Var.d(stargiftattributebackdrop);
            d1Var.e((TL_stars.starGiftAttributePattern) ca.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            dd.Y0(this.f5679c.getImageReceiver(), ((TL_stars.starGiftAttributeModel) ca.l(starGift.attributes, TL_stars.starGiftAttributeModel.class)).document, 52);
            int b10 = org.telegram.ui.ActionBar.y6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.y6.o1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String F0 = hi.k.F0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(F0);
            textView.setBackground(new p6(AndroidUtilities.dp(10.0f), b10));
            this.e.setBackground(new p6(AndroidUtilities.dp(10.0f), b10));
        }
        if (starGift != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        b(z11, z10);
    }

    public final void b(final boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        float f14;
        FrameLayout frameLayout = this.f5678b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.e;
        frameLayout2.animate().cancel();
        float f15 = 0.6f;
        float f16 = 0.0f;
        int i12 = 0;
        if (!z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.6f;
            }
            frameLayout.setScaleX(f12);
            if (z10) {
                f15 = 1.0f;
            }
            frameLayout.setScaleY(f15);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            frameLayout.setAlpha(f13);
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            textView.setAlpha(f14);
            if (!z10) {
                i12 = 8;
            }
            frameLayout2.setVisibility(i12);
            if (z10) {
                f16 = 1.0f;
            }
            frameLayout2.setAlpha(f16);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator animate = frameLayout.animate();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f7);
        if (z10) {
            f15 = 1.0f;
        }
        ViewPropertyAnimator scaleY = scaleX.scaleY(f15);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = scaleY.alpha(f10);
        ds dsVar = ds.h;
        alpha.setInterpolator(dsVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final x5 f5603b;

            {
                this.f5603b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        x5 x5Var = this.f5603b;
                        if (!z12) {
                            x5Var.e.setVisibility(8);
                            return;
                        } else {
                            x5Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        x5 x5Var2 = this.f5603b;
                        if (!z13) {
                            x5Var2.e.setVisibility(8);
                            return;
                        } else {
                            x5Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        x5 x5Var3 = this.f5603b;
                        if (!z14) {
                            x5Var3.e.setVisibility(8);
                            return;
                        } else {
                            x5Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
        textView.setVisibility(0);
        ViewPropertyAnimator animate2 = textView.animate();
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        animate2.alpha(f11).setInterpolator(dsVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final x5 f5603b;

            {
                this.f5603b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        x5 x5Var = this.f5603b;
                        if (!z12) {
                            x5Var.e.setVisibility(8);
                            return;
                        } else {
                            x5Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        x5 x5Var2 = this.f5603b;
                        if (!z13) {
                            x5Var2.e.setVisibility(8);
                            return;
                        } else {
                            x5Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        x5 x5Var3 = this.f5603b;
                        if (!z14) {
                            x5Var3.e.setVisibility(8);
                            return;
                        } else {
                            x5Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        ViewPropertyAnimator animate3 = frameLayout2.animate();
        if (z10) {
            f16 = 1.0f;
        }
        animate3.alpha(f16).setInterpolator(dsVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final x5 f5603b;

            {
                this.f5603b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        x5 x5Var = this.f5603b;
                        if (!z12) {
                            x5Var.e.setVisibility(8);
                            return;
                        } else {
                            x5Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        x5 x5Var2 = this.f5603b;
                        if (!z13) {
                            x5Var2.e.setVisibility(8);
                            return;
                        } else {
                            x5Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        x5 x5Var3 = this.f5603b;
                        if (!z14) {
                            x5Var3.e.setVisibility(8);
                            return;
                        } else {
                            x5Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
    }
}
