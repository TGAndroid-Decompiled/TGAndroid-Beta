package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class nu1 extends LinearLayout {
    public final wjb a;
    public final gl2 b;
    public final gl2 c;
    public float d;

    public nu1(kl0 kl0Var, wp1 wp1Var, wjb wjbVar, Context context) {
        super(context);
        gl2 gl2Var = new gl2(this);
        this.b = gl2Var;
        gl2 gl2Var2 = new gl2(this);
        this.c = gl2Var2;
        this.a = wjbVar;
        ou1 c = ou1.c(kl0Var, wp1Var, wjbVar, context);
        gl2Var.b = c;
        c.setOnClickListener(new x00((byte) 1));
        ote.b((ou1) gl2Var.b, 0.065f, 2.0f);
        ou1 c2 = ou1.c(kl0Var, wp1Var, wjbVar, context);
        gl2Var2.b = c2;
        c2.setOnClickListener(new x00((byte) 1));
        ote.b((ou1) gl2Var2.b, 0.065f, 2.0f);
        a(gl2Var, k96.M0(2131746070, null), 2131231514, false);
        a(gl2Var2, k96.M0(2131750570, null), 2131231506, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ou1) gl2Var.b, nme.m(1.0f, 0, 56, 1, -1, 0));
        addView((ou1) gl2Var2.b, nme.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(gl2 gl2Var, String str, int i, boolean z) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(gl.L(21.0f), 0, gl.L(21.0f), 0);
        textView.setCompoundDrawablePadding(gl.L(6.0f));
        int i2 = bkb.Nl;
        wjb wjbVar = this.a;
        zkb.X(textView, i2, wjbVar);
        textView.setTypeface(gl.o());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        zkb.x(this, mutate, bkb.Ml, wjbVar, PorterDuff.Mode.MULTIPLY);
        if (z) {
            drawable = mutate;
            mutate = null;
        } else {
            drawable = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        gl2Var.c = textView;
        ((ou1) gl2Var.b).addView(textView, nme.e(-2, -2, 17));
    }

    public final void b(gl2 gl2Var) {
        int i;
        float f = this.d * ((fm0) gl2Var.d).e;
        float f2 = (1.0f - f) * (-gl.L(54.0f));
        float interpolation = (1.0f - tn.a.getInterpolation(f)) * (getMeasuredWidth() / 2.0f);
        if (gl2Var == this.b) {
            interpolation *= -1.0f;
        }
        ((ou1) gl2Var.b).setTranslationX(interpolation);
        ((ou1) gl2Var.b).setTranslationY(f2);
        ((ou1) gl2Var.b).setAlpha(f);
        ou1 ou1Var = (ou1) gl2Var.b;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        ou1Var.setVisibility(i);
    }

    public View getForwardButton() {
        return (ou1) this.c.b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ou1) this.c.b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ou1) this.b.b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f) {
        if (this.d != f) {
            this.d = f;
            b(this.c);
            b(this.b);
        }
    }
}
