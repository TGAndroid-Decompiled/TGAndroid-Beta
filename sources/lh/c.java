package lh;

import a8.r7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.l1;
import c8.ha;
import c8.ka;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.oi;
public final class c extends LinearLayout {
    public static final int f18353e = 0;
    public final f6 f18354a;
    public final r7 f18355b;
    public final r7 f18356c;
    public float d;

    public c(Context context, f6 f6Var, oi oiVar, dh.c cVar) {
        super(context);
        r7 r7Var = new r7(this);
        this.f18355b = r7Var;
        r7 r7Var2 = new r7(this);
        this.f18356c = r7Var2;
        this.f18354a = f6Var;
        kh.a c10 = kh.a.c(context, cVar, oiVar, f6Var);
        r7Var.f614b = c10;
        c10.setOnClickListener(new l1(5));
        ka.b((kh.a) r7Var.f614b, 0.065f, 2.0f);
        kh.a c11 = kh.a.c(context, cVar, oiVar, f6Var);
        r7Var2.f614b = c11;
        c11.setOnClickListener(new l1(5));
        ka.b((kh.a) r7Var2.f614b, 0.065f, 2.0f);
        a(r7Var, id.M0(2131746264, null), 2131231510, false);
        a(r7Var2, id.M0(2131750588, null), 2131231502, true);
        setOrientation(0);
        setClipChildren(false);
        addView((kh.a) r7Var.f614b, ha.m(1.0f, 0, 56, 1, -1, 0));
        addView((kh.a) r7Var2.f614b, ha.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(r7 r7Var, String str, int i7, boolean z9) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(g0.L(21.0f), 0, g0.L(21.0f), 0);
        textView.setCompoundDrawablePadding(g0.L(6.0f));
        int i10 = k6.Ll;
        f6 f6Var = this.f18354a;
        r6.V(textView, i10, f6Var);
        textView.setTypeface(g0.o());
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        r6.y(this, mutate, k6.Kl, f6Var, PorterDuff.Mode.MULTIPLY);
        if (z9) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z9) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        r7Var.f615c = textView;
        ((kh.a) r7Var.f614b).addView(textView, ha.e(-2, -2, 17));
    }

    public final void b(r7 r7Var) {
        int i7;
        float f10 = this.d * ((te.a) r7Var.d).f55486e;
        float f11 = (1.0f - f10) * (-g0.L(54.0f));
        float interpolation = (1.0f - se.a.f55004a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (r7Var == this.f18355b) {
            interpolation *= -1.0f;
        }
        ((kh.a) r7Var.f614b).setTranslationX(interpolation);
        ((kh.a) r7Var.f614b).setTranslationY(f11);
        ((kh.a) r7Var.f614b).setAlpha(f10);
        kh.a aVar = (kh.a) r7Var.f614b;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        aVar.setVisibility(i7);
    }

    public View getForwardButton() {
        return (kh.a) this.f18356c.f614b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        b(this.f18356c);
        b(this.f18355b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.f18356c.f614b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.f18355b.f614b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.f18356c);
            b(this.f18355b);
        }
    }
}
