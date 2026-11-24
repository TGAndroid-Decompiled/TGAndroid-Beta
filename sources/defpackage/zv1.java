package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class zv1 extends LinearLayout {
    public final ylb a;
    public final sm2 b;
    public final sm2 c;
    public float d;

    public zv1(km0 km0Var, jr1 jr1Var, ylb ylbVar, Context context) {
        super(context);
        sm2 sm2Var = new sm2(this);
        this.b = sm2Var;
        sm2 sm2Var2 = new sm2(this);
        this.c = sm2Var2;
        this.a = ylbVar;
        aw1 c = aw1.c(km0Var, jr1Var, ylbVar, context);
        sm2Var.b = c;
        c.setOnClickListener(new x10((byte) 1));
        rve.b((aw1) sm2Var.b, 0.065f, 2.0f);
        aw1 c2 = aw1.c(km0Var, jr1Var, ylbVar, context);
        sm2Var2.b = c2;
        c2.setOnClickListener(new x10((byte) 1));
        rve.b((aw1) sm2Var2.b, 0.065f, 2.0f);
        a(sm2Var, jb6.M0(2131745996, null), 2131231515, false);
        a(sm2Var2, jb6.M0(2131750519, null), 2131231507, true);
        setOrientation(0);
        setClipChildren(false);
        addView((aw1) sm2Var.b, qoe.m(1.0f, 0, 56, 1, -1, 0));
        addView((aw1) sm2Var2.b, qoe.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(sm2 sm2Var, String str, int i, boolean z) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(gm.L(21.0f), 0, gm.L(21.0f), 0);
        textView.setCompoundDrawablePadding(gm.L(6.0f));
        int i2 = cmb.Nl;
        ylb ylbVar = this.a;
        anb.X(textView, i2, ylbVar);
        textView.setTypeface(gm.o());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        anb.x(this, mutate, cmb.Ml, ylbVar, PorterDuff.Mode.MULTIPLY);
        if (z) {
            drawable = mutate;
            mutate = null;
        } else {
            drawable = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        sm2Var.c = textView;
        ((aw1) sm2Var.b).addView(textView, qoe.e(-2, -2, 17));
    }

    public final void b(sm2 sm2Var) {
        int i;
        float f = this.d * ((fn0) sm2Var.d).e;
        float f2 = (1.0f - f) * (-gm.L(54.0f));
        float interpolation = (1.0f - uo.a.getInterpolation(f)) * (getMeasuredWidth() / 2.0f);
        if (sm2Var == this.b) {
            interpolation *= -1.0f;
        }
        ((aw1) sm2Var.b).setTranslationX(interpolation);
        ((aw1) sm2Var.b).setTranslationY(f2);
        ((aw1) sm2Var.b).setAlpha(f);
        aw1 aw1Var = (aw1) sm2Var.b;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        aw1Var.setVisibility(i);
    }

    public View getForwardButton() {
        return (aw1) this.c.b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((aw1) this.c.b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((aw1) this.b.b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f) {
        if (this.d != f) {
            this.d = f;
            b(this.c);
            b(this.b);
        }
    }
}
