package ih;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.d5;
import bi.u6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.lj;
import w7.a6;
import w7.c6;
public final class c extends LinearLayout {
    public static final int e = 0;
    public final f6 f10604a;
    public final u6 f10605b;
    public final u6 f10606c;
    public float d;

    public c(Context context, f6 f6Var, lj ljVar, zg.a aVar) {
        super(context);
        u6 u6Var = new u6(this);
        this.f10605b = u6Var;
        u6 u6Var2 = new u6(this);
        this.f10606c = u6Var2;
        this.f10604a = f6Var;
        hh.a c10 = hh.a.c(context, ljVar, f6Var, aVar);
        u6Var.f3719a = c10;
        c10.setOnClickListener(new d5(4));
        c6.b((hh.a) u6Var.f3719a, 0.065f, 2.0f);
        hh.a c11 = hh.a.c(context, ljVar, f6Var, aVar);
        u6Var2.f3719a = c11;
        c11.setOnClickListener(new d5(4));
        c6.b((hh.a) u6Var2.f3719a, 0.065f, 2.0f);
        a(u6Var, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(u6Var2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((hh.a) u6Var.f3719a, a6.m(1.0f, 0, 56, 1, -1, 0));
        addView((hh.a) u6Var2.f3719a, a6.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(u6 u6Var, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = j6.Xk;
        f6 f6Var = this.f10604a;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Wk, f6Var), PorterDuff.Mode.MULTIPLY));
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        u6Var.f3720b = textView;
        ((hh.a) u6Var.f3719a).addView(textView, a6.e(-2, -2, 17));
    }

    public final void b(u6 u6Var) {
        int i10;
        float f7 = this.d * ((le.b) u6Var.f3721c).e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - ke.a.f12431a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (u6Var == this.f10605b) {
            interpolation *= -1.0f;
        }
        ((hh.a) u6Var.f3719a).setTranslationX(interpolation);
        ((hh.a) u6Var.f3719a).setTranslationY(f10);
        ((hh.a) u6Var.f3719a).setAlpha(f7);
        hh.a aVar = (hh.a) u6Var.f3719a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (hh.a) this.f10606c.f3719a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f10606c);
        b(this.f10605b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((hh.a) this.f10606c.f3719a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((hh.a) this.f10605b.f3719a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f10606c);
            b(this.f10605b);
        }
    }
}
