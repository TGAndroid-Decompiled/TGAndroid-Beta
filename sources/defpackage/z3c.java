package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class z3c extends a8c {
    static {
        a8c.h(new a8c());
    }

    public static b8c i(int i, CharSequence charSequence, boolean z, View.OnClickListener onClickListener, o66 o66Var, View.OnClickListener onClickListener2) {
        b8c K = b8c.K(z3c.class);
        K.d = i;
        K.m = charSequence;
        K.f = z;
        K.u = false;
        K.E = onClickListener;
        K.H = o66Var;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        o66 o66Var;
        CharSequence cloneSpans;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        int i4;
        ImageView imageView;
        a4c a4cVar = (a4c) view;
        CharSequence charSequence = b8cVar.m;
        boolean z4 = b8cVar.f;
        View.OnClickListener onClickListener = b8cVar.E;
        Object obj = b8cVar.H;
        if (obj != null) {
            o66Var = (o66) obj;
        } else {
            o66Var = null;
        }
        boolean z5 = b8cVar.u;
        View.OnClickListener onClickListener2 = b8cVar.F;
        ImageView imageView2 = a4cVar.n;
        TextView textView = a4cVar.d;
        x3c x3cVar = a4cVar.c;
        y3c y3cVar = a4cVar.f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = hm.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        int i5 = 0;
        ya6[] ya6VarArr = (ya6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ya6.class);
        if (ya6VarArr != null) {
            while (i5 < ya6VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ya6VarArr[i5]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ya6VarArr[i5]);
                boolean z6 = z5;
                spannableStringBuilder.removeSpan(ya6VarArr[i5]);
                int i6 = i5;
                ya6 ya6Var = ya6VarArr[i6];
                View.OnClickListener onClickListener3 = onClickListener2;
                ya6 ya6Var2 = new ya6(y3cVar, ya6Var.a, ya6Var.d, null);
                ya6 ya6Var3 = ya6VarArr[i6];
                ya6Var2.f = ya6Var3.f;
                ya6Var2.h = ya6Var3.h;
                ya6Var2.n = ya6Var3.n;
                if (ya6Var3.n && vm2.h(aob.v0(aob.G6, a4cVar.a)) > 0.5d) {
                    float max = Math.max(0.05f, ya6VarArr[i6].h);
                    imageView = imageView2;
                    ya6Var2.a(aob.p1(Math.min(1.0f, 0.07f / max), -1), aob.p1(Math.min(1.0f, 0.115f / max), -1));
                } else {
                    imageView = imageView2;
                }
                spannableStringBuilder.setSpan(ya6Var2, spanStart, spanEnd, 33);
                i5 = i6 + 1;
                z5 = z6;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z7 = z5;
        ImageView imageView3 = imageView2;
        if (a4cVar.h && !z4) {
            z2 = 0;
            x3cVar.setVisibility(0);
            y3cVar.setVisibility(0);
            ViewPropertyAnimator withEndAction = x3cVar.animate().alpha(0.0f).withEndAction(new azb(a4cVar, (byte) 2));
            TimeInterpolator timeInterpolator = k43.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            y3cVar.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            z2 = 0;
            if (z4) {
                i = 0;
            } else {
                i = 8;
            }
            x3cVar.setVisibility(i);
            if (!z4) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            y3cVar.setVisibility(i2);
        }
        a4cVar.h = z4;
        if (z4) {
            i3 = z2;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        textView.setOnClickListener(onClickListener);
        a4cVar.setClipChildren(z4);
        x3cVar.setText(spannableStringBuilder);
        y3cVar.setText(spannableStringBuilder);
        if (!z7 && (ya6VarArr == null || ya6VarArr.length == 0)) {
            z3 = true;
        } else {
            z3 = z2;
        }
        y3cVar.setTextIsSelectable(z3);
        y3cVar.setOnLinkPressListener(o66Var);
        if (onClickListener4 != null) {
            i4 = z2;
        } else {
            i4 = 8;
        }
        imageView3.setVisibility(i4);
        imageView3.setOnClickListener(onClickListener4);
        a4cVar.b = z;
        a4cVar.setWillNotDraw(!z);
    }

    @Override
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        if (TextUtils.equals(b8cVar.m, b8cVar2.m) && b8cVar.f == b8cVar2.f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new a4c(context, vnbVar);
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.d == b8cVar2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
