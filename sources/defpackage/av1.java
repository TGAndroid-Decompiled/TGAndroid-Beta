package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class av1 extends LinearLayout {
    public final vnb a;
    public final am2 b;
    public final am2 c;
    public float d;

    public av1(ll0 ll0Var, kq1 kq1Var, vnb vnbVar, Context context) {
        super(context);
        am2 am2Var = new am2(this);
        this.b = am2Var;
        am2 am2Var2 = new am2(this);
        this.c = am2Var2;
        this.a = vnbVar;
        bv1 c = bv1.c(ll0Var, kq1Var, vnbVar, context);
        am2Var.b = c;
        c.setOnClickListener(new y00((byte) 1));
        iye.b((bv1) am2Var.b, 0.065f, 2.0f);
        bv1 c2 = bv1.c(ll0Var, kq1Var, vnbVar, context);
        am2Var2.b = c2;
        c2.setOnClickListener(new y00((byte) 1));
        iye.b((bv1) am2Var2.b, 0.065f, 2.0f);
        a(am2Var, ob6.M0(2131745990, null), 2131231514, false);
        a(am2Var2, ob6.M0(2131750547, null), 2131231506, true);
        setOrientation(0);
        setClipChildren(false);
        addView((bv1) am2Var.b, tre.m(1.0f, 0, 56, 1, -1, 0));
        addView((bv1) am2Var2.b, tre.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(am2 am2Var, String str, int i, boolean z) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(hl.L(21.0f), 0, hl.L(21.0f), 0);
        textView.setCompoundDrawablePadding(hl.L(6.0f));
        int i2 = aob.Ol;
        vnb vnbVar = this.a;
        yob.X(textView, i2, vnbVar);
        textView.setTypeface(hl.o());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        yob.x(this, mutate, aob.Nl, vnbVar, PorterDuff.Mode.MULTIPLY);
        if (z) {
            drawable = mutate;
            mutate = null;
        } else {
            drawable = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        am2Var.c = textView;
        ((bv1) am2Var.b).addView(textView, tre.e(-2, -2, 17));
    }

    public final void b(am2 am2Var) {
        int i;
        float f = this.d * ((fm0) am2Var.d).e;
        float f2 = (1.0f - f) * (-hl.L(54.0f));
        float interpolation = (1.0f - un.a.getInterpolation(f)) * (getMeasuredWidth() / 2.0f);
        if (am2Var == this.b) {
            interpolation *= -1.0f;
        }
        ((bv1) am2Var.b).setTranslationX(interpolation);
        ((bv1) am2Var.b).setTranslationY(f2);
        ((bv1) am2Var.b).setAlpha(f);
        bv1 bv1Var = (bv1) am2Var.b;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        bv1Var.setVisibility(i);
    }

    public View getForwardButton() {
        return (bv1) this.c.b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((bv1) this.c.b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((bv1) this.b.b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f) {
        if (this.d != f) {
            this.d = f;
            b(this.c);
            b(this.b);
        }
    }
}
