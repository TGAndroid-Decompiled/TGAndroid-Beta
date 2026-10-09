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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.kj;
import w7.x5;
import w7.z5;
public final class c extends LinearLayout {
    public static final int f14173e = 0;
    public final e6 f14174a;
    public final u5 f14175b;
    public final u5 f14176c;
    public float d;

    public c(Context context, e6 e6Var, kj kjVar, ah.c cVar) {
        super(context);
        u5 u5Var = new u5(this);
        this.f14175b = u5Var;
        u5 u5Var2 = new u5(this);
        this.f14176c = u5Var2;
        this.f14174a = e6Var;
        ih.a c10 = ih.a.c(cVar, context, kjVar, e6Var);
        u5Var.f6065a = c10;
        c10.setOnClickListener(new e2(5));
        z5.b((ih.a) u5Var.f6065a, 0.065f, 2.0f);
        ih.a c11 = ih.a.c(cVar, context, kjVar, e6Var);
        u5Var2.f6065a = c11;
        c11.setOnClickListener(new e2(5));
        z5.b((ih.a) u5Var2.f6065a, 0.065f, 2.0f);
        a(u5Var, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(u5Var2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ih.a) u5Var.f6065a, x5.m(1.0f, 0, 56, 1, -1, 0));
        addView((ih.a) u5Var2.f6065a, x5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(u5 u5Var, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = i6.Xk;
        e6 e6Var = this.f14174a;
        textView.setTextColor(i6.w0(i11, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(i6.Wk, e6Var), PorterDuff.Mode.MULTIPLY));
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        u5Var.f6066b = textView;
        ((ih.a) u5Var.f6065a).addView(textView, x5.e(-2, -2, 17));
    }

    public final void b(u5 u5Var) {
        int i10;
        float f7 = this.d * ((me.b) u5Var.f6067c).f16337e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - le.a.f15501a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (u5Var == this.f14175b) {
            interpolation *= -1.0f;
        }
        ((ih.a) u5Var.f6065a).setTranslationX(interpolation);
        ((ih.a) u5Var.f6065a).setTranslationY(f10);
        ((ih.a) u5Var.f6065a).setAlpha(f7);
        ih.a aVar = (ih.a) u5Var.f6065a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (ih.a) this.f14176c.f6065a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f14176c);
        b(this.f14175b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.f14176c.f6065a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.f14175b.f6065a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f14176c);
            b(this.f14175b);
        }
    }
}
