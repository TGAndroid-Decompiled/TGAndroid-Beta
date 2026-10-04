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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.hj;
import w7.b6;
import w7.z5;
public final class c extends LinearLayout {
    public static final int f14136e = 0;
    public final d6 f14137a;
    public final cf.c f14138b;
    public final cf.c f14139c;
    public float d;

    public c(Context context, d6 d6Var, hj hjVar, ah.c cVar) {
        super(context);
        cf.c cVar2 = new cf.c(this);
        this.f14138b = cVar2;
        cf.c cVar3 = new cf.c(this);
        this.f14139c = cVar3;
        this.f14137a = d6Var;
        ih.a c10 = ih.a.c(cVar, context, hjVar, d6Var);
        cVar2.f4602a = c10;
        c10.setOnClickListener(new e2(5));
        b6.b((ih.a) cVar2.f4602a, 0.065f, 2.0f);
        ih.a c11 = ih.a.c(cVar, context, hjVar, d6Var);
        cVar3.f4602a = c11;
        c11.setOnClickListener(new e2(5));
        b6.b((ih.a) cVar3.f4602a, 0.065f, 2.0f);
        a(cVar2, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(cVar3, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ih.a) cVar2.f4602a, z5.m(1.0f, 0, 56, 1, -1, 0));
        addView((ih.a) cVar3.f4602a, z5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(cf.c cVar, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = i6.Xk;
        d6 d6Var = this.f14137a;
        textView.setTextColor(i6.v0(i11, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.Wk, d6Var), PorterDuff.Mode.MULTIPLY));
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        cVar.f4603b = textView;
        ((ih.a) cVar.f4602a).addView(textView, z5.e(-2, -2, 17));
    }

    public final void b(cf.c cVar) {
        int i10;
        float f7 = this.d * ((le.b) cVar.f4604c).f15434e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - ke.a.f14758a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (cVar == this.f14138b) {
            interpolation *= -1.0f;
        }
        ((ih.a) cVar.f4602a).setTranslationX(interpolation);
        ((ih.a) cVar.f4602a).setTranslationY(f10);
        ((ih.a) cVar.f4602a).setAlpha(f7);
        ih.a aVar = (ih.a) cVar.f4602a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (ih.a) this.f14139c.f4602a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f14139c);
        b(this.f14138b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.f14139c.f4602a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.f14138b.f4602a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.f14139c);
            b(this.f14138b);
        }
    }
}
