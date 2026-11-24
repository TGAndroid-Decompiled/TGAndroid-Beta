package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class sra extends FrameLayout {
    public final lx4 a;
    public final FrameLayout b;
    public final bf0 c;
    public final TextView d;
    public final FrameLayout e;
    public final ImageView f;
    public TL_stars.StarGift h;
    public boolean n;

    public sra(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, qoe.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(cmb.b0(gm.L(18.0f), cmb.p1(0.12f, -4530177)));
        frameLayout.setForeground(new isa(gm.L(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231081);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, qoe.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b = frameLayout2;
        lx4 lx4Var = new lx4(frameLayout2, null, false);
        this.a = lx4Var;
        frameLayout2.setBackground(lx4Var);
        lx4Var.s = gm.L(18.0f);
        lx4Var.v = false;
        frameLayout.addView(frameLayout2, qoe.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        frameLayout2.addView(bf0Var, qoe.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(gm.L(5.0f), 0, gm.L(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, qoe.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, qoe.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(2131232102);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, qoe.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z) {
        boolean z2;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            lx4 lx4Var = this.a;
            lx4Var.d(stargiftattributebackdrop);
            lx4Var.e((TL_stars.starGiftAttributePattern) jva.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            nxa.e1(this.c.getImageReceiver(), ((TL_stars.starGiftAttributeModel) jva.i(starGift.attributes, TL_stars.starGiftAttributeModel.class)).document, 52);
            int a = cmb.a(-0.05f, -0.15f, cmb.p1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String J0 = bc.J0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(J0);
            textView.setBackground(new isa(gm.L(10.0f), a));
            this.e.setBackground(new isa(gm.L(10.0f), a));
            z2 = true;
        } else {
            z2 = false;
        }
        b(z2, z);
    }

    public final void b(final boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        int i2;
        float f6;
        FrameLayout frameLayout = this.b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.e;
        frameLayout2.animate().cancel();
        float f7 = 0.6f;
        float f8 = 0.0f;
        int i3 = 0;
        if (!z2) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            frameLayout.setVisibility(i);
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.6f;
            }
            frameLayout.setScaleX(f4);
            if (z) {
                f7 = 1.0f;
            }
            frameLayout.setScaleY(f7);
            if (z) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            frameLayout.setAlpha(f5);
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            if (z) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            textView.setAlpha(f6);
            if (!z) {
                i3 = 8;
            }
            frameLayout2.setVisibility(i3);
            if (z) {
                f8 = 1.0f;
            }
            frameLayout2.setAlpha(f8);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator animate = frameLayout.animate();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f);
        if (z) {
            f7 = 1.0f;
        }
        ViewPropertyAnimator scaleY = scaleX.scaleY(f7);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        ViewPropertyAnimator alpha = scaleY.alpha(f2);
        d53 d53Var = d53.h;
        alpha.setInterpolator(d53Var).setDuration(420L).withEndAction(new Runnable(this) {
            public final sra b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z;
                sra sraVar = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    case 1:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        textView.setVisibility(0);
        ViewPropertyAnimator animate2 = textView.animate();
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        animate2.alpha(f3).setInterpolator(d53Var).setDuration(420L).withEndAction(new Runnable(this) {
            public final sra b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z;
                sra sraVar = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    case 1:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        ViewPropertyAnimator animate3 = frameLayout2.animate();
        if (z) {
            f8 = 1.0f;
        }
        animate3.alpha(f8).setInterpolator(d53Var).setDuration(420L).withEndAction(new Runnable(this) {
            public final sra b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z;
                sra sraVar = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    case 1:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(76.0f), 1073741824));
    }
}
