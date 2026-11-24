package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public final class haa extends FrameLayout {
    public final View a;
    public final jia b;
    public final jia c;
    public final si9 d;
    public boolean e;
    public AnimatorSet f;
    public final Paint h;
    public final RectF n;
    public final taa r;

    public haa(taa taaVar, Context context) {
        super(context);
        this.r = taaVar;
        this.h = new Paint(1);
        this.n = new RectF();
        View view = new View(context);
        this.a = view;
        int L = gl.L(18.0f);
        int i = bkb.N5;
        int i2 = taa.T2;
        Drawable b0 = bkb.b0(L, bkb.v0(i, taaVar.J0));
        vkb M = zkb.M(i);
        wjb wjbVar = taaVar.J0;
        view.setBackground(b0);
        zkb.j(view, b0, M, null, wjbVar);
        addView(view, nme.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        si9 si9Var = new si9((byte) 5, context, this);
        this.d = si9Var;
        addView(si9Var, nme.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        int i3 = bkb.dh;
        zkb.W(jiaVar, i3, taaVar.J0);
        jiaVar.setTextSize(13);
        jiaVar.setLeftDrawable(2131232401);
        jiaVar.l(k96.M0(2131743133, null), false);
        jiaVar.setGravity(17);
        addView(jiaVar, nme.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        jiaVar.setOnClickListener(new View.OnClickListener(this) {
            public final haa b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                haa haaVar = this.b;
                switch (b) {
                    case 0:
                        haaVar.a(0);
                        return;
                    default:
                        haaVar.a(1);
                        return;
                }
            }
        });
        jia jiaVar2 = new jia(context);
        this.b = jiaVar2;
        zkb.W(jiaVar2, i3, taaVar.J0);
        jiaVar2.setTextSize(13);
        jiaVar2.setLeftDrawable(2131232402);
        jiaVar2.l(k96.M0(2131743132, null), false);
        jiaVar2.setGravity(17);
        addView(jiaVar2, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        jiaVar2.setOnClickListener(new View.OnClickListener(this) {
            public final haa b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                haa haaVar = this.b;
                switch (b) {
                    case 0:
                        haaVar.a(0);
                        return;
                    default:
                        haaVar.a(1);
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
        si9 si9Var = this.d;
        if (!z) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = si9Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(si9Var, View.TRANSLATION_X, measuredWidth));
        this.f.setDuration(180L);
        this.f.setInterpolator(s33.g);
        this.f.addListener(new ng9(this, (byte) 12));
        this.f.start();
        this.r.V0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int size = (View.MeasureSpec.getSize(i) - gl.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = gl.L(14.0f) + size;
        si9 si9Var = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) si9Var.getLayoutParams();
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
        si9Var.setTranslationX(f);
        super.onMeasure(i, i2);
    }
}
