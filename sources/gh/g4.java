package gh;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr;
public final class g4 extends FrameLayout {
    public final fh.b2 f8100a;
    public final FrameLayout f8101b;
    public final org.telegram.ui.Components.o9 f8102c;
    public final TextView d;
    public final FrameLayout f8103e;
    public final ImageView f8104f;
    public TL_stars.StarGift h;
    public boolean f8105n;

    public g4(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, g7.e6.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.l1(0.12f, -4530177)));
        frameLayout.setForeground(new w4(AndroidUtilities.dp(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, g7.e6.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f8101b = frameLayout2;
        fh.b2 b2Var = new fh.b2(frameLayout2, null, false);
        this.f8100a = b2Var;
        frameLayout2.setBackground(b2Var);
        b2Var.f6376s = AndroidUtilities.dp(18.0f);
        b2Var.f6378u = false;
        frameLayout.addView(frameLayout2, g7.e6.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f8102c = o9Var;
        frameLayout2.addView(o9Var, g7.e6.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, g7.e6.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f8103e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, g7.e6.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f8104f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, g7.e6.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z10) {
        boolean z11;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            fh.b2 b2Var = this.f8100a;
            b2Var.d(stargiftattributebackdrop);
            b2Var.e((TL_stars.starGiftAttributePattern) v7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            oa.Z0(this.f8102c.getImageReceiver(), ((TL_stars.starGiftAttributeModel) v7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class)).document, 52);
            int b10 = org.telegram.ui.ActionBar.f6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.f6.l1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String F0 = mh.l.F0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(F0);
            textView.setBackground(new w4(AndroidUtilities.dp(10.0f), b10));
            this.f8103e.setBackground(new w4(AndroidUtilities.dp(10.0f), b10));
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
        int i9;
        float f13;
        float f14;
        int i10;
        float f15;
        FrameLayout frameLayout = this.f8101b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.f8103e;
        frameLayout2.animate().cancel();
        float f16 = 0.6f;
        float f17 = 0.0f;
        int i11 = 0;
        if (!z11) {
            if (z10) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            frameLayout.setVisibility(i9);
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
        gr grVar = gr.h;
        alpha.setInterpolator(grVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final g4 f8060b;

            {
                this.f8060b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        g4 g4Var = this.f8060b;
                        if (!z12) {
                            g4Var.f8103e.setVisibility(8);
                            return;
                        } else {
                            g4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        g4 g4Var2 = this.f8060b;
                        if (!z13) {
                            g4Var2.f8103e.setVisibility(8);
                            return;
                        } else {
                            g4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        g4 g4Var3 = this.f8060b;
                        if (!z14) {
                            g4Var3.f8103e.setVisibility(8);
                            return;
                        } else {
                            g4Var3.getClass();
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
        animate2.alpha(f12).setInterpolator(grVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final g4 f8060b;

            {
                this.f8060b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        g4 g4Var = this.f8060b;
                        if (!z12) {
                            g4Var.f8103e.setVisibility(8);
                            return;
                        } else {
                            g4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        g4 g4Var2 = this.f8060b;
                        if (!z13) {
                            g4Var2.f8103e.setVisibility(8);
                            return;
                        } else {
                            g4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        g4 g4Var3 = this.f8060b;
                        if (!z14) {
                            g4Var3.f8103e.setVisibility(8);
                            return;
                        } else {
                            g4Var3.getClass();
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
        animate3.alpha(f17).setInterpolator(grVar).setDuration(420L).withEndAction(new Runnable(this) {
            public final g4 f8060b;

            {
                this.f8060b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z10;
                        g4 g4Var = this.f8060b;
                        if (!z12) {
                            g4Var.f8103e.setVisibility(8);
                            return;
                        } else {
                            g4Var.getClass();
                            return;
                        }
                    case 1:
                        boolean z13 = z10;
                        g4 g4Var2 = this.f8060b;
                        if (!z13) {
                            g4Var2.f8103e.setVisibility(8);
                            return;
                        } else {
                            g4Var2.getClass();
                            return;
                        }
                    default:
                        boolean z14 = z10;
                        g4 g4Var3 = this.f8060b;
                        if (!z14) {
                            g4Var3.f8103e.setVisibility(8);
                            return;
                        } else {
                            g4Var3.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
    }
}
