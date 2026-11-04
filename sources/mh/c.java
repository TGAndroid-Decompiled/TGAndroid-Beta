package mh;

import ai.t;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.ke;
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ki;
public final class c extends LinearLayout {
    public static final int f19392e = 0;
    public final e6 f19393a;
    public final ke f19394b;
    public final ke f19395c;
    public float d;

    public c(Context context, e6 e6Var, ki kiVar, eh.c cVar) {
        super(context);
        ke keVar = new ke(this);
        this.f19394b = keVar;
        ke keVar2 = new ke(this);
        this.f19395c = keVar2;
        this.f19393a = e6Var;
        lh.a c2 = lh.a.c(context, cVar, kiVar, e6Var);
        keVar.f2716b = c2;
        c2.setOnClickListener(new t(9));
        pf.b((lh.a) keVar.f2716b, 0.065f, 2.0f);
        lh.a c10 = lh.a.c(context, cVar, kiVar, e6Var);
        keVar2.f2716b = c10;
        c10.setOnClickListener(new t(9));
        pf.b((lh.a) keVar2.f2716b, 0.065f, 2.0f);
        a(keVar, bd.M0(2131746271, null), 2131231510, false);
        a(keVar2, bd.M0(2131750588, null), 2131231502, true);
        setOrientation(0);
        setClipChildren(false);
        addView((lh.a) keVar.f2716b, mf.m(1.0f, 0, 56, 1, -1, 0));
        addView((lh.a) keVar2.f2716b, mf.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(ke keVar, String str, int i3, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(g0.L(21.0f), 0, g0.L(21.0f), 0);
        textView.setCompoundDrawablePadding(g0.L(6.0f));
        int i10 = k6.Ll;
        e6 e6Var = this.f19393a;
        r6.V(textView, i10, e6Var);
        textView.setTypeface(g0.o());
        Drawable mutate = getContext().getResources().getDrawable(i3).mutate();
        r6.y(this, mutate, k6.Kl, e6Var, PorterDuff.Mode.MULTIPLY);
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        keVar.f2717c = textView;
        ((lh.a) keVar.f2716b).addView(textView, mf.e(-2, -2, 17));
    }

    public final void b(ke keVar) {
        int i3;
        float f10 = this.d * ((qe.a) keVar.d).f53840e;
        float f11 = (1.0f - f10) * (-g0.L(54.0f));
        float interpolation = (1.0f - pe.a.f53446a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (keVar == this.f19394b) {
            interpolation *= -1.0f;
        }
        ((lh.a) keVar.f2716b).setTranslationX(interpolation);
        ((lh.a) keVar.f2716b).setTranslationY(f11);
        ((lh.a) keVar.f2716b).setAlpha(f10);
        lh.a aVar = (lh.a) keVar.f2716b;
        if (f10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        aVar.setVisibility(i3);
    }

    public View getForwardButton() {
        return (lh.a) this.f19395c.f2716b;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        b(this.f19395c);
        b(this.f19394b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((lh.a) this.f19395c.f2716b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((lh.a) this.f19394b.f2716b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.f19395c);
            b(this.f19394b);
        }
    }
}
