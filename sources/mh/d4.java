package mh;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.pr;
public final class d4 extends FrameLayout {
    public final lh.u1 f13888a;
    public final FrameLayout f13889b;
    public final org.telegram.ui.Components.p9 f13890c;
    public final TextView d;
    public final FrameLayout f13891e;
    public final ImageView f13892f;
    public TL_stars.StarGift h;
    public boolean f13893n;

    public d4(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, k7.c6.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.l1(0.12f, -4530177)));
        frameLayout.setForeground(new s4(AndroidUtilities.dp(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, k7.c6.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f13889b = frameLayout2;
        lh.u1 u1Var = new lh.u1(frameLayout2, null, false);
        this.f13888a = u1Var;
        frameLayout2.setBackground(u1Var);
        u1Var.f13008s = AndroidUtilities.dp(18.0f);
        u1Var.f13010u = false;
        frameLayout.addView(frameLayout2, k7.c6.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f13890c = p9Var;
        frameLayout2.addView(p9Var, k7.c6.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, k7.c6.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f13891e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, k7.c6.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f13892f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, k7.c6.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z4) {
        boolean z10;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            lh.u1 u1Var = this.f13888a;
            u1Var.d(stargiftattributebackdrop);
            u1Var.e((TL_stars.starGiftAttributePattern) t7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            ja.Z0(this.f13890c.getImageReceiver(), ((TL_stars.starGiftAttributeModel) t7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class)).document, 52);
            int b10 = org.telegram.ui.ActionBar.k6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.k6.l1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String G0 = sh.j.G0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(G0);
            textView.setBackground(new s4(AndroidUtilities.dp(10.0f), b10));
            this.f13891e.setBackground(new s4(AndroidUtilities.dp(10.0f), b10));
        }
        if (starGift != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b(z10, z4);
    }

    public final void b(final boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        float f15;
        FrameLayout frameLayout = this.f13889b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.f13891e;
        frameLayout2.animate().cancel();
        float f16 = 0.6f;
        float f17 = 0.0f;
        int i12 = 0;
        if (!z10) {
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z4) {
                f13 = 1.0f;
            } else {
                f13 = 0.6f;
            }
            frameLayout.setScaleX(f13);
            if (z4) {
                f16 = 1.0f;
            }
            frameLayout.setScaleY(f16);
            if (z4) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            frameLayout.setAlpha(f14);
            if (z4) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            if (z4) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            textView.setAlpha(f15);
            if (!z4) {
                i12 = 8;
            }
            frameLayout2.setVisibility(i12);
            if (z4) {
                f17 = 1.0f;
            }
            frameLayout2.setAlpha(f17);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator animate = frameLayout.animate();
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f10);
        if (z4) {
            f16 = 1.0f;
        }
        ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        ViewPropertyAnimator alpha = scaleY.alpha(f11);
        pr prVar = pr.h;
        alpha.setInterpolator(prVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final d4 f13793b;

            {
                this.f13793b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z11 = z4;
                        d4 d4Var = this.f13793b;
                        if (!z11) {
                            d4Var.f13891e.setVisibility(8);
                            return;
                        } else {
                            d4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z12 = z4;
                        d4 d4Var2 = this.f13793b;
                        if (!z12) {
                            d4Var2.f13891e.setVisibility(8);
                            return;
                        } else {
                            d4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z4;
                        d4 d4Var3 = this.f13793b;
                        if (!z13) {
                            d4Var3.f13891e.setVisibility(8);
                            return;
                        } else {
                            d4Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
        textView.setVisibility(0);
        ViewPropertyAnimator animate2 = textView.animate();
        if (z4) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        animate2.alpha(f12).setInterpolator(prVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final d4 f13793b;

            {
                this.f13793b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z11 = z4;
                        d4 d4Var = this.f13793b;
                        if (!z11) {
                            d4Var.f13891e.setVisibility(8);
                            return;
                        } else {
                            d4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z12 = z4;
                        d4 d4Var2 = this.f13793b;
                        if (!z12) {
                            d4Var2.f13891e.setVisibility(8);
                            return;
                        } else {
                            d4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z4;
                        d4 d4Var3 = this.f13793b;
                        if (!z13) {
                            d4Var3.f13891e.setVisibility(8);
                            return;
                        } else {
                            d4Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        ViewPropertyAnimator animate3 = frameLayout2.animate();
        if (z4) {
            f17 = 1.0f;
        }
        animate3.alpha(f17).setInterpolator(prVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final d4 f13793b;

            {
                this.f13793b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z11 = z4;
                        d4 d4Var = this.f13793b;
                        if (!z11) {
                            d4Var.f13891e.setVisibility(8);
                            return;
                        } else {
                            d4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z12 = z4;
                        d4 d4Var2 = this.f13793b;
                        if (!z12) {
                            d4Var2.f13891e.setVisibility(8);
                            return;
                        } else {
                            d4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z4;
                        d4 d4Var3 = this.f13793b;
                        if (!z13) {
                            d4Var3.f13891e.setVisibility(8);
                            return;
                        } else {
                            d4Var3.getClass();
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
