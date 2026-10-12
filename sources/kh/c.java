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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.oj;
import w7.a6;
public final class c extends LinearLayout {
    public static final int e = 0;
    public final c6 f14263a;
    public final z5 f14264b;
    public final z5 f14265c;
    public float d;

    public c(Context context, c6 c6Var, oj ojVar, bh.b bVar) {
        super(context);
        z5 z5Var = new z5(this);
        this.f14264b = z5Var;
        z5 z5Var2 = new z5(this);
        this.f14265c = z5Var2;
        this.f14263a = c6Var;
        jh.a c10 = jh.a.c(context, bVar, ojVar, c6Var);
        z5Var.f5426b = c10;
        c10.setOnClickListener(new ah.f(6));
        w7.c6.b((jh.a) z5Var.f5426b, 0.065f, 2.0f);
        jh.a c11 = jh.a.c(context, bVar, ojVar, c6Var);
        z5Var2.f5426b = c11;
        c11.setOnClickListener(new ah.f(6));
        w7.c6.b((jh.a) z5Var2.f5426b, 0.065f, 2.0f);
        a(z5Var, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(z5Var2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((jh.a) z5Var.f5426b, a6.m(1.0f, 0, 56, 1, -1, 0));
        addView((jh.a) z5Var2.f5426b, a6.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(z5 z5Var, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = g6.Xk;
        c6 c6Var = this.f14263a;
        textView.setTextColor(g6.w0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.Wk, c6Var), PorterDuff.Mode.MULTIPLY));
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        z5Var.f5427c = textView;
        ((jh.a) z5Var.f5426b).addView(textView, a6.e(-2, -2, 17));
    }

    public final void b(z5 z5Var) {
        int i10;
        float f7 = this.d * ((ne.b) z5Var.f5425a).e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - me.a.f15760a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (z5Var == this.f14264b) {
            interpolation *= -1.0f;
        }
        ((jh.a) z5Var.f5426b).setTranslationX(interpolation);
        ((jh.a) z5Var.f5426b).setTranslationY(f10);
        ((jh.a) z5Var.f5426b).setAlpha(f7);
        jh.a aVar = (jh.a) z5Var.f5426b;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (jh.a) this.f14265c.f5426b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f14265c);
        b(this.f14264b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((jh.a) this.f14265c.f5426b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((jh.a) this.f14264b.f5426b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f14265c);
            b(this.f14264b);
        }
    }
}
