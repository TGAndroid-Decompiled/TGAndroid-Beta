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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.kj;
import w7.x5;
import w7.z5;
public final class c extends LinearLayout {
    public static final int f14172e = 0;
    public final d6 f14173a;
    public final u5 f14174b;
    public final u5 f14175c;
    public float d;

    public c(Context context, d6 d6Var, kj kjVar, ah.c cVar) {
        super(context);
        u5 u5Var = new u5(this);
        this.f14174b = u5Var;
        u5 u5Var2 = new u5(this);
        this.f14175c = u5Var2;
        this.f14173a = d6Var;
        ih.a c10 = ih.a.c(cVar, context, kjVar, d6Var);
        u5Var.f6064a = c10;
        c10.setOnClickListener(new e2(5));
        z5.b((ih.a) u5Var.f6064a, 0.065f, 2.0f);
        ih.a c11 = ih.a.c(cVar, context, kjVar, d6Var);
        u5Var2.f6064a = c11;
        c11.setOnClickListener(new e2(5));
        z5.b((ih.a) u5Var2.f6064a, 0.065f, 2.0f);
        a(u5Var, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(u5Var2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ih.a) u5Var.f6064a, x5.m(1.0f, 0, 56, 1, -1, 0));
        addView((ih.a) u5Var2.f6064a, x5.m(1.0f, 0, 56, -1, 1, 0));
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
        d6 d6Var = this.f14173a;
        textView.setTextColor(h6.w0(i11, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.Wk, d6Var), PorterDuff.Mode.MULTIPLY));
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        u5Var.f6065b = textView;
        ((ih.a) u5Var.f6064a).addView(textView, x5.e(-2, -2, 17));
    }

    public final void b(u5 u5Var) {
        int i10;
        float f7 = this.d * ((me.b) u5Var.f6066c).f16401e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - le.a.f15540a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (u5Var == this.f14174b) {
            interpolation *= -1.0f;
        }
        ((ih.a) u5Var.f6064a).setTranslationX(interpolation);
        ((ih.a) u5Var.f6064a).setTranslationY(f10);
        ((ih.a) u5Var.f6064a).setAlpha(f7);
        ih.a aVar = (ih.a) u5Var.f6064a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (ih.a) this.f14175c.f6064a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f14175c);
        b(this.f14174b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.f14175c.f6064a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.f14174b.f6064a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f14175c);
            b(this.f14174b);
        }
    }
}
