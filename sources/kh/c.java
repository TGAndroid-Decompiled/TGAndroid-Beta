package kh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.jj;
import w7.x5;
import w7.z5;
public final class c extends LinearLayout {
    public static final int f14966e = 0;
    public final f6 f14967a;
    public final cf.c f14968b;
    public final cf.c f14969c;
    public float d;

    public c(Context context, f6 f6Var, jj jjVar, bh.b bVar) {
        super(context);
        cf.c cVar = new cf.c(this);
        this.f14968b = cVar;
        cf.c cVar2 = new cf.c(this);
        this.f14969c = cVar2;
        this.f14967a = f6Var;
        jh.a c10 = jh.a.c(context, bVar, jjVar, f6Var);
        cVar.f4823a = c10;
        c10.setOnClickListener(new ah.f(6));
        z5.b((jh.a) cVar.f4823a, 0.065f, 2.0f);
        jh.a c11 = jh.a.c(context, bVar, jjVar, f6Var);
        cVar2.f4823a = c11;
        c11.setOnClickListener(new ah.f(6));
        z5.b((jh.a) cVar2.f4823a, 0.065f, 2.0f);
        a(cVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(cVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((jh.a) cVar.f4823a, x5.m(1.0f, 0, 56, 1, -1, 0));
        addView((jh.a) cVar2.f4823a, x5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(cf.c cVar, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = j6.Xk;
        f6 f6Var = this.f14967a;
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
        cVar.f4824b = textView;
        ((jh.a) cVar.f4823a).addView(textView, x5.e(-2, -2, 17));
    }

    public final void b(cf.c cVar) {
        int i10;
        float f7 = this.d * ((le.b) cVar.f4825c).f15395e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - ke.a.f14926a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (cVar == this.f14968b) {
            interpolation *= -1.0f;
        }
        ((jh.a) cVar.f4823a).setTranslationX(interpolation);
        ((jh.a) cVar.f4823a).setTranslationY(f10);
        ((jh.a) cVar.f4823a).setAlpha(f7);
        jh.a aVar = (jh.a) cVar.f4823a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (jh.a) this.f14969c.f4823a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f14969c);
        b(this.f14968b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((jh.a) this.f14969c.f4823a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((jh.a) this.f14968b.f4823a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f14969c);
            b(this.f14968b);
        }
    }
}
