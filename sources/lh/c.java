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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.pi;
public final class c extends LinearLayout {
    public static final int f19853e = 0;
    public final i6 f19854a;
    public final r7 f19855b;
    public final r7 f19856c;
    public float d;

    public c(Context context, i6 i6Var, pi piVar, dh.c cVar) {
        super(context);
        r7 r7Var = new r7(this);
        this.f19855b = r7Var;
        r7 r7Var2 = new r7(this);
        this.f19856c = r7Var2;
        this.f19854a = i6Var;
        kh.a c10 = kh.a.c(context, cVar, piVar, i6Var);
        r7Var.f617b = c10;
        c10.setOnClickListener(new o(10));
        ra.b((kh.a) r7Var.f617b, 0.065f, 2.0f);
        kh.a c11 = kh.a.c(context, cVar, piVar, i6Var);
        r7Var2.f617b = c11;
        c11.setOnClickListener(new o(10));
        ra.b((kh.a) r7Var2.f617b, 0.065f, 2.0f);
        a(r7Var, gd.M0(2131746068, null), 2131231511, false);
        a(r7Var2, gd.M0(2131750571, null), 2131231503, true);
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
        int i10 = n6.Ol;
        i6 i6Var = this.f19854a;
        u6.U(textView, i10, i6Var);
        textView.setTypeface(g0.o());
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        u6.x(this, mutate, n6.Nl, i6Var, PorterDuff.Mode.MULTIPLY);
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
        float f10 = this.d * ((te.a) r7Var.d).f57657e;
        float f11 = (1.0f - f10) * (-g0.L(54.0f));
        float interpolation = (1.0f - se.a.f57146a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (r7Var == this.f19855b) {
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
        return (kh.a) this.f19856c.f617b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        b(this.f19856c);
        b(this.f19855b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.f19856c.f617b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.f19855b.f617b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.f19856c);
            b(this.f19855b);
        }
    }
}
