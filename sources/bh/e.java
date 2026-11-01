package bh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.jj;
import w7.b6;
import w7.e6;
public final class e extends LinearLayout {
    public static final int e = 0;
    public final p6 f2780a;
    public final d f2781b;
    public final d f2782c;
    public float d;

    public e(Context context, p6 p6Var, jj jjVar, tg.b bVar) {
        super(context);
        d dVar = new d(this);
        this.f2781b = dVar;
        d dVar2 = new d(this);
        this.f2782c = dVar2;
        this.f2780a = p6Var;
        ah.a c10 = ah.a.c(context, p6Var, bVar, jjVar);
        dVar.f2777a = c10;
        c10.setOnClickListener(new c(0));
        e6.b((ah.a) dVar.f2777a, 0.065f, 2.0f);
        ah.a c11 = ah.a.c(context, p6Var, bVar, jjVar);
        dVar2.f2777a = c11;
        c11.setOnClickListener(new c(0));
        e6.b((ah.a) dVar2.f2777a, 0.065f, 2.0f);
        a(dVar, dd.L0(2131746278, null), 2131231511, false);
        a(dVar2, dd.L0(2131750588, null), 2131231503, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ah.a) dVar.f2777a, b6.m(1.0f, 0, 56, 1, -1, 0));
        addView((ah.a) dVar2.f2777a, b6.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(d dVar, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(i0.L(21.0f), 0, i0.L(21.0f), 0);
        textView.setCompoundDrawablePadding(i0.L(6.0f));
        int i11 = t6.Ll;
        p6 p6Var = this.f2780a;
        a7.V(textView, i11, p6Var);
        textView.setTypeface(i0.o());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        a7.y(this, mutate, t6.Kl, p6Var, PorterDuff.Mode.MULTIPLY);
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        dVar.f2778b = textView;
        ((ah.a) dVar.f2777a).addView(textView, b6.e(-2, -2, 17));
    }

    public final void b(d dVar) {
        int i10;
        float f7 = this.d * ((fe.b) dVar.f2779c).e;
        float f10 = (1.0f - f7) * (-i0.L(54.0f));
        float interpolation = (1.0f - ee.a.f6489a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (dVar == this.f2781b) {
            interpolation *= -1.0f;
        }
        ((ah.a) dVar.f2777a).setTranslationX(interpolation);
        ((ah.a) dVar.f2777a).setTranslationY(f10);
        ((ah.a) dVar.f2777a).setAlpha(f7);
        ah.a aVar = (ah.a) dVar.f2777a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (ah.a) this.f2782c.f2777a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f2782c);
        b(this.f2781b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ah.a) this.f2782c.f2777a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ah.a) this.f2781b.f2777a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f2782c);
            b(this.f2781b);
        }
    }
}
