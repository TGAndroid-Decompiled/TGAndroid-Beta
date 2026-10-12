package jh;

import ai.e2;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.u5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.oj;
import w7.w5;
import w7.y5;
public final class c extends LinearLayout {
    public static final int f14170e = 0;
    public final c6 f14171a;
    public final u5 f14172b;
    public final u5 f14173c;
    public float d;

    public c(Context context, c6 c6Var, oj ojVar, ah.c cVar) {
        super(context);
        u5 u5Var = new u5(this);
        this.f14172b = u5Var;
        u5 u5Var2 = new u5(this);
        this.f14173c = u5Var2;
        this.f14171a = c6Var;
        ih.a c10 = ih.a.c(cVar, context, ojVar, c6Var);
        u5Var.f6063a = c10;
        c10.setOnClickListener(new e2(5));
        y5.b((ih.a) u5Var.f6063a, 0.065f, 2.0f);
        ih.a c11 = ih.a.c(cVar, context, ojVar, c6Var);
        u5Var2.f6063a = c11;
        c11.setOnClickListener(new e2(5));
        y5.b((ih.a) u5Var2.f6063a, 0.065f, 2.0f);
        a(u5Var, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(u5Var2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ih.a) u5Var.f6063a, w5.m(1.0f, 0, 56, 1, -1, 0));
        addView((ih.a) u5Var2.f6063a, w5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(u5 u5Var, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = h6.Xk;
        c6 c6Var = this.f14171a;
        textView.setTextColor(h6.w0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.Wk, c6Var), PorterDuff.Mode.MULTIPLY));
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        u5Var.f6064b = textView;
        ((ih.a) u5Var.f6063a).addView(textView, w5.e(-2, -2, 17));
    }

    public final void b(u5 u5Var) {
        int i10;
        float f7 = this.d * ((me.b) u5Var.f6065c).f16088e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - le.a.f15248a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (u5Var == this.f14172b) {
            interpolation *= -1.0f;
        }
        ((ih.a) u5Var.f6063a).setTranslationX(interpolation);
        ((ih.a) u5Var.f6063a).setTranslationY(f10);
        ((ih.a) u5Var.f6063a).setAlpha(f7);
        ih.a aVar = (ih.a) u5Var.f6063a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (ih.a) this.f14173c.f6063a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f14173c);
        b(this.f14172b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.f14173c.f6063a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.f14172b.f6063a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f14173c);
            b(this.f14172b);
        }
    }
}
