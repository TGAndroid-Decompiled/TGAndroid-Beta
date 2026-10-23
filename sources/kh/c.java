package kh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cast.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.bj;
import w7.b6;
public final class c extends LinearLayout {
    public static final int e = 0;
    public final g6 f15112a;
    public final z5 f15113b;
    public final z5 f15114c;
    public float d;

    public c(Context context, g6 g6Var, bj bjVar, bh.b bVar) {
        super(context);
        z5 z5Var = new z5(this);
        this.f15113b = z5Var;
        z5 z5Var2 = new z5(this);
        this.f15114c = z5Var2;
        this.f15112a = g6Var;
        jh.a c10 = jh.a.c(context, bVar, bjVar, g6Var);
        z5Var.f6893b = c10;
        c10.setOnClickListener(new ah.f(6));
        b6.b((jh.a) z5Var.f6893b, 0.065f, 2.0f);
        jh.a c11 = jh.a.c(context, bVar, bjVar, g6Var);
        z5Var2.f6893b = c11;
        c11.setOnClickListener(new ah.f(6));
        b6.b((jh.a) z5Var2.f6893b, 0.065f, 2.0f);
        a(z5Var, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(z5Var2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((jh.a) z5Var.f6893b, w7.z5.m(1.0f, 0, 56, 1, -1, 0));
        addView((jh.a) z5Var2.f6893b, w7.z5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(z5 z5Var, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = k6.Xk;
        g6 g6Var = this.f15112a;
        r6.W(textView, i11, g6Var);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        r6.z(this, mutate, k6.Wk, g6Var, PorterDuff.Mode.MULTIPLY);
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        z5Var.f6894c = textView;
        ((jh.a) z5Var.f6893b).addView(textView, w7.z5.e(-2, -2, 17));
    }

    public final void b(z5 z5Var) {
        int i10;
        float f7 = this.d * ((ne.b) z5Var.f6892a).e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - me.a.f16916a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (z5Var == this.f15113b) {
            interpolation *= -1.0f;
        }
        ((jh.a) z5Var.f6893b).setTranslationX(interpolation);
        ((jh.a) z5Var.f6893b).setTranslationY(f10);
        ((jh.a) z5Var.f6893b).setAlpha(f7);
        jh.a aVar = (jh.a) z5Var.f6893b;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (jh.a) this.f15114c.f6893b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f15114c);
        b(this.f15113b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((jh.a) this.f15114c.f6893b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((jh.a) this.f15113b.f6893b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f15114c);
            b(this.f15113b);
        }
    }
}
