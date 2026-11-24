package defpackage;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class xjc extends FrameLayout {
    public TextView[] a;
    public TextView b;
    public FrameLayout c;
    public bkc d;
    public CharSequence e;
    public boolean f;
    public ValueAnimator h;
    public boolean n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(gm.L(15.0f));
        view2.setAlpha(0.0f);
        this.f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new vjc(view2, view, (byte) 0));
        this.h.addListener(new rb2((Object) this, (Object) view, (Object) view2, (Object) runnable, (byte) 5));
        this.h.setDuration(250L).setInterpolator(d53.f);
        this.h.start();
    }

    public final void b(String str, boolean z, boolean z2) {
        View view = this.d;
        View[] viewArr = this.a;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new s0(viewArr), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            str = spannableStringBuilder;
        }
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z2 = false;
        }
        if (!z2) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f = false;
            viewArr[0].setText(str);
            viewArr[0].setVisibility(0);
            viewArr[1].setVisibility(8);
            view.setVisibility(8);
        } else if (this.f) {
            this.e = str;
        } else if (this.n) {
            viewArr[0].setText(str);
            a(view, viewArr[0], null);
        } else if (!viewArr[0].getText().equals(str)) {
            viewArr[1].setText(str);
            a(viewArr[0], viewArr[1], new f8c(this, (byte) 23));
        }
    }

    public final void c(boolean z) {
        FrameLayout frameLayout = this.c;
        if (z) {
            if (frameLayout.getVisibility() != 0) {
                frameLayout.setVisibility(0);
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleY(0.6f);
                frameLayout.setScaleX(0.6f);
                frameLayout.animate().setListener(null).cancel();
                wi8.t(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), d53.k, 300L);
            }
        } else if (frameLayout.getVisibility() == 8) {
        } else {
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(d53.f).setListener(new wjc(this, (byte) 1)).setDuration(300L).start();
        }
    }

    public final void d(boolean z, boolean z2) {
        TextView textView = this.b;
        int i = 0;
        if (!z2) {
            textView.animate().setListener(null).cancel();
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        } else if (z) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
            textView.animate().setListener(null).cancel();
            textView.animate().alpha(1.0f).setDuration(150L).start();
        } else {
            textView.animate().alpha(0.0f).setListener(new wjc(this, (byte) 0)).setDuration(150L).start();
        }
    }

    public final void e(boolean z) {
        bkc bkcVar = this.d;
        View[] viewArr = this.a;
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z = false;
        }
        if (this.n) {
            return;
        }
        bkcVar.a();
        if (!z) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.n = true;
            this.f = false;
            viewArr[0].setVisibility(8);
            viewArr[1].setVisibility(8);
            bkcVar.setVisibility(0);
        } else if (this.f) {
            this.e = "timer";
        } else {
            this.n = true;
            a(viewArr[0], bkcVar, null);
        }
    }

    public void setSignalBarCount(int i) {
        this.d.setSignalBarCount(i);
    }
}
