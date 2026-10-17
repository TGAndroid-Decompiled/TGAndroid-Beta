package kh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cast.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.dj;
import w7.b6;
public final class c extends LinearLayout {
    public static final int e = 0;
    public final d6 f15060a;
    public final z5 f15061b;
    public final z5 f15062c;
    public float d;

    public c(Context context, d6 d6Var, dj djVar, bh.b bVar) {
        super(context);
        z5 z5Var = new z5(this);
        this.f15061b = z5Var;
        z5 z5Var2 = new z5(this);
        this.f15062c = z5Var2;
        this.f15060a = d6Var;
        jh.a c10 = jh.a.c(context, bVar, djVar, d6Var);
        z5Var.f6883b = c10;
        c10.setOnClickListener(new ah.f(6));
        b6.b((jh.a) z5Var.f6883b, 0.065f, 2.0f);
        jh.a c11 = jh.a.c(context, bVar, djVar, d6Var);
        z5Var2.f6883b = c11;
        c11.setOnClickListener(new ah.f(6));
        b6.b((jh.a) z5Var2.f6883b, 0.065f, 2.0f);
        a(z5Var, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(z5Var2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((jh.a) z5Var.f6883b, w7.z5.m(1.0f, 0, 56, 1, -1, 0));
        addView((jh.a) z5Var2.f6883b, w7.z5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(z5 z5Var, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = h6.Xk;
        d6 d6Var = this.f15060a;
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
        z5Var.f6884c = textView;
        ((jh.a) z5Var.f6883b).addView(textView, w7.z5.e(-2, -2, 17));
    }

    public final void b(z5 z5Var) {
        int i10;
        float f7 = this.d * ((ne.b) z5Var.f6882a).e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - me.a.f16847a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (z5Var == this.f15061b) {
            interpolation *= -1.0f;
        }
        ((jh.a) z5Var.f6883b).setTranslationX(interpolation);
        ((jh.a) z5Var.f6883b).setTranslationY(f10);
        ((jh.a) z5Var.f6883b).setAlpha(f7);
        jh.a aVar = (jh.a) z5Var.f6883b;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (jh.a) this.f15062c.f6883b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f15062c);
        b(this.f15061b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((jh.a) this.f15062c.f6883b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((jh.a) this.f15061b.f6883b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f15062c);
            b(this.f15061b);
        }
    }
}
