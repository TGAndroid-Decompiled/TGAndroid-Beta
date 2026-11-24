package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class a2c extends b6c {
    static {
        b6c.h(new b6c());
    }

    public static c6c i(int i, CharSequence charSequence, boolean z, View.OnClickListener onClickListener, k66 k66Var, View.OnClickListener onClickListener2) {
        c6c K = c6c.K(a2c.class);
        K.d = i;
        K.m = charSequence;
        K.f = z;
        K.u = false;
        K.E = onClickListener;
        K.H = k66Var;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        k66 k66Var;
        CharSequence cloneSpans;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        int i4;
        ImageView imageView;
        b2c b2cVar = (b2c) view;
        CharSequence charSequence = c6cVar.m;
        boolean z4 = c6cVar.f;
        View.OnClickListener onClickListener = c6cVar.E;
        Object obj = c6cVar.H;
        if (obj != null) {
            k66Var = (k66) obj;
        } else {
            k66Var = null;
        }
        boolean z5 = c6cVar.u;
        View.OnClickListener onClickListener2 = c6cVar.F;
        ImageView imageView2 = b2cVar.n;
        TextView textView = b2cVar.d;
        y1c y1cVar = b2cVar.c;
        z1c z1cVar = b2cVar.f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = gn.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        int i5 = 0;
        ta6[] ta6VarArr = (ta6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ta6.class);
        if (ta6VarArr != null) {
            while (i5 < ta6VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ta6VarArr[i5]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ta6VarArr[i5]);
                boolean z6 = z5;
                spannableStringBuilder.removeSpan(ta6VarArr[i5]);
                int i6 = i5;
                ta6 ta6Var = ta6VarArr[i6];
                View.OnClickListener onClickListener3 = onClickListener2;
                ta6 ta6Var2 = new ta6(z1cVar, ta6Var.a, ta6Var.d, null);
                ta6 ta6Var3 = ta6VarArr[i6];
                ta6Var2.f = ta6Var3.f;
                ta6Var2.h = ta6Var3.h;
                ta6Var2.n = ta6Var3.n;
                if (ta6Var3.n && on2.h(cmb.v0(cmb.F6, b2cVar.a)) > 0.5d) {
                    float max = Math.max(0.05f, ta6VarArr[i6].h);
                    imageView = imageView2;
                    ta6Var2.a(cmb.p1(Math.min(1.0f, 0.07f / max), -1), cmb.p1(Math.min(1.0f, 0.115f / max), -1));
                } else {
                    imageView = imageView2;
                }
                spannableStringBuilder.setSpan(ta6Var2, spanStart, spanEnd, 33);
                i5 = i6 + 1;
                z5 = z6;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z7 = z5;
        ImageView imageView3 = imageView2;
        if (b2cVar.h && !z4) {
            z2 = 0;
            y1cVar.setVisibility(0);
            z1cVar.setVisibility(0);
            ViewPropertyAnimator withEndAction = y1cVar.animate().alpha(0.0f).withEndAction(new zcb(b2cVar, (byte) 23));
            TimeInterpolator timeInterpolator = d53.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            z1cVar.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            z2 = 0;
            if (z4) {
                i = 0;
            } else {
                i = 8;
            }
            y1cVar.setVisibility(i);
            if (!z4) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            z1cVar.setVisibility(i2);
        }
        b2cVar.h = z4;
        if (z4) {
            i3 = z2;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        textView.setOnClickListener(onClickListener);
        b2cVar.setClipChildren(z4);
        y1cVar.setText(spannableStringBuilder);
        z1cVar.setText(spannableStringBuilder);
        if (!z7 && (ta6VarArr == null || ta6VarArr.length == 0)) {
            z3 = true;
        } else {
            z3 = z2;
        }
        z1cVar.setTextIsSelectable(z3);
        z1cVar.setOnLinkPressListener(k66Var);
        if (onClickListener4 != null) {
            i4 = z2;
        } else {
            i4 = 8;
        }
        imageView3.setVisibility(i4);
        imageView3.setOnClickListener(onClickListener4);
        b2cVar.b = z;
        b2cVar.setWillNotDraw(!z);
    }

    @Override
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        if (TextUtils.equals(c6cVar.m, c6cVar2.m) && c6cVar.f == c6cVar2.f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new b2c(context, ylbVar);
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.d == c6cVar2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
