package jh;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.jr;
public final class e4 extends FrameLayout {
    public final ih.v1 f11999a;
    public final FrameLayout f12000b;
    public final org.telegram.ui.Components.t9 f12001c;
    public final TextView d;
    public final FrameLayout f12002e;
    public final ImageView f12003f;
    public TL_stars.StarGift h;
    public boolean f12004n;

    public e4(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, i7.f6.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, -4530177)));
        frameLayout.setForeground(new t4(AndroidUtilities.dp(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, i7.f6.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12000b = frameLayout2;
        ih.v1 v1Var = new ih.v1(frameLayout2, null, false);
        this.f11999a = v1Var;
        frameLayout2.setBackground(v1Var);
        v1Var.f9450s = AndroidUtilities.dp(18.0f);
        v1Var.f9452u = false;
        frameLayout.addView(frameLayout2, i7.f6.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f12001c = t9Var;
        frameLayout2.addView(t9Var, i7.f6.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, i7.f6.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f12002e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, i7.f6.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f12003f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, i7.f6.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z10) {
        boolean z11;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            ih.v1 v1Var = this.f11999a;
            v1Var.d(stargiftattributebackdrop);
            v1Var.e((TL_stars.starGiftAttributePattern) s7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            ia.Z0(this.f12001c.getImageReceiver(), ((TL_stars.starGiftAttributeModel) s7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class)).document, 52);
            int b10 = org.telegram.ui.ActionBar.g6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.g6.l1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String G0 = ph.j.G0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(G0);
            textView.setBackground(new t4(AndroidUtilities.dp(10.0f), b10));
            this.f12002e.setBackground(new t4(AndroidUtilities.dp(10.0f), b10));
        }
        if (starGift != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        b(z11, z10);
    }

    public final void b(final boolean z10, boolean z11) {
        float f9;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        float f14;
        FrameLayout frameLayout = this.f12000b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.f12002e;
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
            f9 = 1.0f;
        } else {
            f9 = 0.6f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f9);
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
        jr jrVar = jr.h;
        alpha.setInterpolator(jrVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final e4 f11903b;

            {
                this.f11903b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        e4 e4Var = this.f11903b;
                        if (!z12) {
                            e4Var.f12002e.setVisibility(8);
                            return;
                        } else {
                            e4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        e4 e4Var2 = this.f11903b;
                        if (!z13) {
                            e4Var2.f12002e.setVisibility(8);
                            return;
                        } else {
                            e4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        e4 e4Var3 = this.f11903b;
                        if (!z14) {
                            e4Var3.f12002e.setVisibility(8);
                            return;
                        } else {
                            e4Var3.getClass();
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
        animate2.alpha(f11).setInterpolator(jrVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final e4 f11903b;

            {
                this.f11903b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        e4 e4Var = this.f11903b;
                        if (!z12) {
                            e4Var.f12002e.setVisibility(8);
                            return;
                        } else {
                            e4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        e4 e4Var2 = this.f11903b;
                        if (!z13) {
                            e4Var2.f12002e.setVisibility(8);
                            return;
                        } else {
                            e4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        e4 e4Var3 = this.f11903b;
                        if (!z14) {
                            e4Var3.f12002e.setVisibility(8);
                            return;
                        } else {
                            e4Var3.getClass();
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
        animate3.alpha(f16).setInterpolator(jrVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final e4 f11903b;

            {
                this.f11903b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        e4 e4Var = this.f11903b;
                        if (!z12) {
                            e4Var.f12002e.setVisibility(8);
                            return;
                        } else {
                            e4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        e4 e4Var2 = this.f11903b;
                        if (!z13) {
                            e4Var2.f12002e.setVisibility(8);
                            return;
                        } else {
                            e4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        e4 e4Var3 = this.f11903b;
                        if (!z14) {
                            e4Var3.f12002e.setVisibility(8);
                            return;
                        } else {
                            e4Var3.getClass();
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
