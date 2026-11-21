package lh;

import a8.r7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.o;
import c8.ma;
import c8.ra;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.pi;
public final class c extends LinearLayout {
    public static final int f19878e = 0;
    public final h6 f19879a;
    public final r7 f19880b;
    public final r7 f19881c;
    public float d;

    public c(Context context, h6 h6Var, pi piVar, dh.c cVar) {
        super(context);
        r7 r7Var = new r7(this);
        this.f19880b = r7Var;
        r7 r7Var2 = new r7(this);
        this.f19881c = r7Var2;
        this.f19879a = h6Var;
        kh.a c10 = kh.a.c(context, cVar, piVar, h6Var);
        r7Var.f617b = c10;
        c10.setOnClickListener(new o(10));
        ra.b((kh.a) r7Var.f617b, 0.065f, 2.0f);
        kh.a c11 = kh.a.c(context, cVar, piVar, h6Var);
        r7Var2.f617b = c11;
        c11.setOnClickListener(new o(10));
        ra.b((kh.a) r7Var2.f617b, 0.065f, 2.0f);
        a(r7Var, gd.N0(2131746067, null), 2131231511, false);
        a(r7Var2, gd.N0(2131750570, null), 2131231503, true);
        setOrientation(0);
        setClipChildren(false);
        addView((kh.a) r7Var.f617b, ma.m(1.0f, 0, 56, 1, -1, 0));
        addView((kh.a) r7Var2.f617b, ma.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(r7 r7Var, String str, int i7, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(g0.L(21.0f), 0, g0.L(21.0f), 0);
        textView.setCompoundDrawablePadding(g0.L(6.0f));
        int i10 = m6.Ol;
        h6 h6Var = this.f19879a;
        t6.U(textView, i10, h6Var);
        textView.setTypeface(g0.o());
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        t6.x(this, mutate, m6.Nl, h6Var, PorterDuff.Mode.MULTIPLY);
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        r7Var.f618c = textView;
        ((kh.a) r7Var.f617b).addView(textView, ma.e(-2, -2, 17));
    }

    public final void b(r7 r7Var) {
        int i7;
        float f10 = this.d * ((te.a) r7Var.d).f57696e;
        float f11 = (1.0f - f10) * (-g0.L(54.0f));
        float interpolation = (1.0f - se.a.f57187a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (r7Var == this.f19880b) {
            interpolation *= -1.0f;
        }
        ((kh.a) r7Var.f617b).setTranslationX(interpolation);
        ((kh.a) r7Var.f617b).setTranslationY(f11);
        ((kh.a) r7Var.f617b).setAlpha(f10);
        kh.a aVar = (kh.a) r7Var.f617b;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        aVar.setVisibility(i7);
    }

    public View getForwardButton() {
        return (kh.a) this.f19881c.f617b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        b(this.f19881c);
        b(this.f19880b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.f19881c.f617b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.f19880b.f617b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.f19881c);
            b(this.f19880b);
        }
    }
}
