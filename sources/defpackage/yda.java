package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public final class yda extends FrameLayout {
    public final View a;
    public final ema b;
    public final ema c;
    public final nf9 d;
    public boolean e;
    public AnimatorSet f;
    public final Paint h;
    public final RectF n;
    public final kea r;

    public yda(kea keaVar, Context context) {
        super(context);
        this.r = keaVar;
        this.h = new Paint(1);
        this.n = new RectF();
        View view = new View(context);
        this.a = view;
        int L = hl.L(18.0f);
        int i = aob.O5;
        int i2 = kea.T2;
        Drawable b0 = aob.b0(L, aob.v0(i, keaVar.J0));
        uob M = yob.M(i);
        vnb vnbVar = keaVar.J0;
        view.setBackground(b0);
        yob.j(view, b0, M, null, vnbVar);
        addView(view, tre.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        nf9 nf9Var = new nf9((byte) 6, context, this);
        this.d = nf9Var;
        addView(nf9Var, tre.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ema emaVar = new ema(context);
        this.c = emaVar;
        int i3 = aob.eh;
        yob.W(emaVar, i3, keaVar.J0);
        emaVar.setTextSize(13);
        emaVar.setLeftDrawable(2131232401);
        emaVar.l(ob6.M0(2131743027, null), false);
        emaVar.setGravity(17);
        addView(emaVar, tre.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        emaVar.setOnClickListener(new View.OnClickListener(this) {
            public final yda b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                yda ydaVar = this.b;
                switch (b) {
                    case 0:
                        ydaVar.a(0);
                        return;
                    default:
                        ydaVar.a(1);
                        return;
                }
            }
        });
        ema emaVar2 = new ema(context);
        this.b = emaVar2;
        yob.W(emaVar2, i3, keaVar.J0);
        emaVar2.setTextSize(13);
        emaVar2.setLeftDrawable(2131232402);
        emaVar2.l(ob6.M0(2131743026, null), false);
        emaVar2.setGravity(17);
        addView(emaVar2, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        emaVar2.setOnClickListener(new View.OnClickListener(this) {
            public final yda b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                yda ydaVar = this.b;
                switch (b) {
                    case 0:
                        ydaVar.a(0);
                        return;
                    default:
                        ydaVar.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i) {
        float measuredWidth;
        if (this.e == i) {
            return;
        }
        this.e = i;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        boolean z = this.e;
        nf9 nf9Var = this.d;
        if (!z) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = nf9Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(nf9Var, View.TRANSLATION_X, measuredWidth));
        this.f.setDuration(180L);
        this.f.setInterpolator(k43.g);
        this.f.addListener(new po9(this, (byte) 11));
        this.f.start();
        this.r.W0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int size = (View.MeasureSpec.getSize(i) - hl.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = hl.L(14.0f) + size;
        nf9 nf9Var = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) nf9Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (!this.e) {
            f = 0.0f;
        } else {
            f = layoutParams2.width;
        }
        nf9Var.setTranslationX(f);
        super.onMeasure(i, i2);
    }
}
