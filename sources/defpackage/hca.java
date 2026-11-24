package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public final class hca extends FrameLayout {
    public final View a;
    public final lka b;
    public final lka c;
    public final xd9 d;
    public boolean e;
    public AnimatorSet f;
    public final Paint h;
    public final RectF n;
    public final tca r;

    public hca(tca tcaVar, Context context) {
        super(context);
        this.r = tcaVar;
        this.h = new Paint(1);
        this.n = new RectF();
        View view = new View(context);
        this.a = view;
        int L = gm.L(18.0f);
        int i = cmb.N5;
        int i2 = tca.T2;
        Drawable b0 = cmb.b0(L, cmb.v0(i, tcaVar.J0));
        wmb M = anb.M(i);
        ylb ylbVar = tcaVar.J0;
        view.setBackground(b0);
        anb.j(view, b0, M, null, ylbVar);
        addView(view, qoe.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        xd9 xd9Var = new xd9((byte) 6, context, this);
        this.d = xd9Var;
        addView(xd9Var, qoe.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        int i3 = cmb.dh;
        anb.W(lkaVar, i3, tcaVar.J0);
        lkaVar.setTextSize(13);
        lkaVar.setLeftDrawable(2131232402);
        lkaVar.l(jb6.M0(2131743059, null), false);
        lkaVar.setGravity(17);
        addView(lkaVar, qoe.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        lkaVar.setOnClickListener(new View.OnClickListener(this) {
            public final hca b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                hca hcaVar = this.b;
                switch (b) {
                    case 0:
                        hcaVar.a(0);
                        return;
                    default:
                        hcaVar.a(1);
                        return;
                }
            }
        });
        lka lkaVar2 = new lka(context);
        this.b = lkaVar2;
        anb.W(lkaVar2, i3, tcaVar.J0);
        lkaVar2.setTextSize(13);
        lkaVar2.setLeftDrawable(2131232403);
        lkaVar2.l(jb6.M0(2131743058, null), false);
        lkaVar2.setGravity(17);
        addView(lkaVar2, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        lkaVar2.setOnClickListener(new View.OnClickListener(this) {
            public final hca b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                hca hcaVar = this.b;
                switch (b) {
                    case 0:
                        hcaVar.a(0);
                        return;
                    default:
                        hcaVar.a(1);
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
        xd9 xd9Var = this.d;
        if (!z) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = xd9Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(xd9Var, View.TRANSLATION_X, measuredWidth));
        this.f.setDuration(180L);
        this.f.setInterpolator(d53.g);
        this.f.addListener(new c39(this, (byte) 14));
        this.f.start();
        this.r.V0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int size = (View.MeasureSpec.getSize(i) - gm.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = gm.L(14.0f) + size;
        xd9 xd9Var = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) xd9Var.getLayoutParams();
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
        xd9Var.setTranslationX(f);
        super.onMeasure(i, i2);
    }
}
