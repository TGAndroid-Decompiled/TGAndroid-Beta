package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class spa extends FrameLayout {
    public final kv4 a;
    public final FrameLayout b;
    public final be0 c;
    public final TextView d;
    public final FrameLayout e;
    public final ImageView f;
    public TL_stars.StarGift h;
    public boolean n;

    public spa(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, nme.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(bkb.b0(gl.L(18.0f), bkb.p1(0.12f, -4530177)));
        frameLayout.setForeground(new iqa(gl.L(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231080);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, nme.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b = frameLayout2;
        kv4 kv4Var = new kv4(frameLayout2, null, false);
        this.a = kv4Var;
        frameLayout2.setBackground(kv4Var);
        kv4Var.s = gl.L(18.0f);
        kv4Var.v = false;
        frameLayout.addView(frameLayout2, nme.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        frameLayout2.addView(be0Var, nme.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(gl.L(5.0f), 0, gl.L(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, nme.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, nme.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(2131232101);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, nme.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z) {
        boolean z2;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            kv4 kv4Var = this.a;
            kv4Var.d(stargiftattributebackdrop);
            kv4Var.e((TL_stars.starGiftAttributePattern) gta.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
            jva.d1(this.c.getImageReceiver(), ((TL_stars.starGiftAttributeModel) gta.i(starGift.attributes, TL_stars.starGiftAttributeModel.class)).document, 52);
            int a = bkb.a(-0.05f, -0.15f, bkb.p1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String I0 = bc.I0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(I0);
            textView.setBackground(new iqa(gl.L(10.0f), a));
            this.e.setBackground(new iqa(gl.L(10.0f), a));
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
        s33 s33Var = s33.h;
        alpha.setInterpolator(s33Var).setDuration(420L).withEndAction(new Runnable(this) {
            public final spa b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z;
                spa spaVar = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    case 1:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
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
        animate2.alpha(f3).setInterpolator(s33Var).setDuration(420L).withEndAction(new Runnable(this) {
            public final spa b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z;
                spa spaVar = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    case 1:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
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
        animate3.alpha(f8).setInterpolator(s33Var).setDuration(420L).withEndAction(new Runnable(this) {
            public final spa b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z;
                spa spaVar = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    case 1:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(76.0f), 1073741824));
    }
}
