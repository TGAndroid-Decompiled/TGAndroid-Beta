package jh;

import ai.e2;
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
import w7.a6;
import w7.y5;
public final class c extends LinearLayout {
    public static final int e = 0;
    public final f6 f13016a;
    public final cf.c f13017b;
    public final cf.c f13018c;
    public float d;

    public c(Context context, f6 f6Var, jj jjVar, ah.c cVar) {
        super(context);
        cf.c cVar2 = new cf.c(this);
        this.f13017b = cVar2;
        cf.c cVar3 = new cf.c(this);
        this.f13018c = cVar3;
        this.f13016a = f6Var;
        ih.a c10 = ih.a.c(cVar, context, jjVar, f6Var);
        cVar2.f4259a = c10;
        c10.setOnClickListener(new e2(5));
        a6.b((ih.a) cVar2.f4259a, 0.065f, 2.0f);
        ih.a c11 = ih.a.c(cVar, context, jjVar, f6Var);
        cVar3.f4259a = c11;
        c11.setOnClickListener(new e2(5));
        a6.b((ih.a) cVar3.f4259a, 0.065f, 2.0f);
        a(cVar2, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(cVar3, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ih.a) cVar2.f4259a, y5.m(1.0f, 0, 56, 1, -1, 0));
        addView((ih.a) cVar3.f4259a, y5.m(1.0f, 0, 56, -1, 1, 0));
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
        f6 f6Var = this.f13016a;
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
        cVar.f4260b = textView;
        ((ih.a) cVar.f4259a).addView(textView, y5.e(-2, -2, 17));
    }

    public final void b(cf.c cVar) {
        int i10;
        float f7 = this.d * ((le.b) cVar.f4261c).e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - ke.a.f13587a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (cVar == this.f13017b) {
            interpolation *= -1.0f;
        }
        ((ih.a) cVar.f4259a).setTranslationX(interpolation);
        ((ih.a) cVar.f4259a).setTranslationY(f10);
        ((ih.a) cVar.f4259a).setAlpha(f7);
        ih.a aVar = (ih.a) cVar.f4259a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (ih.a) this.f13018c.f4259a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f13018c);
        b(this.f13017b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.f13018c.f4259a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.f13017b.f4259a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f13018c);
            b(this.f13017b);
        }
    }
}
