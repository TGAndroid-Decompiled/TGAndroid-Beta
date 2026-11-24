package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class a0c extends b4c {
    static {
        b4c.h(new b4c());
    }

    public static c4c i(int i, CharSequence charSequence, boolean z, View.OnClickListener onClickListener, k46 k46Var, View.OnClickListener onClickListener2) {
        c4c K = c4c.K(a0c.class);
        K.d = i;
        K.m = charSequence;
        K.f = z;
        K.u = false;
        K.E = onClickListener;
        K.H = k46Var;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        k46 k46Var;
        CharSequence cloneSpans;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        int i4;
        ImageView imageView;
        b0c b0cVar = (b0c) view;
        CharSequence charSequence = c4cVar.m;
        boolean z4 = c4cVar.f;
        View.OnClickListener onClickListener = c4cVar.E;
        Object obj = c4cVar.H;
        if (obj != null) {
            k46Var = (k46) obj;
        } else {
            k46Var = null;
        }
        boolean z5 = c4cVar.u;
        View.OnClickListener onClickListener2 = c4cVar.F;
        ImageView imageView2 = b0cVar.n;
        TextView textView = b0cVar.d;
        yzb yzbVar = b0cVar.c;
        zzb zzbVar = b0cVar.f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = gm.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        int i5 = 0;
        u86[] u86VarArr = (u86[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u86.class);
        if (u86VarArr != null) {
            while (i5 < u86VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(u86VarArr[i5]);
                int spanEnd = spannableStringBuilder.getSpanEnd(u86VarArr[i5]);
                boolean z6 = z5;
                spannableStringBuilder.removeSpan(u86VarArr[i5]);
                int i6 = i5;
                u86 u86Var = u86VarArr[i6];
                View.OnClickListener onClickListener3 = onClickListener2;
                u86 u86Var2 = new u86(zzbVar, u86Var.a, u86Var.d, null);
                u86 u86Var3 = u86VarArr[i6];
                u86Var2.f = u86Var3.f;
                u86Var2.h = u86Var3.h;
                u86Var2.n = u86Var3.n;
                if (u86Var3.n && bm2.h(bkb.v0(bkb.F6, b0cVar.a)) > 0.5d) {
                    float max = Math.max(0.05f, u86VarArr[i6].h);
                    imageView = imageView2;
                    u86Var2.a(bkb.p1(Math.min(1.0f, 0.07f / max), -1), bkb.p1(Math.min(1.0f, 0.115f / max), -1));
                } else {
                    imageView = imageView2;
                }
                spannableStringBuilder.setSpan(u86Var2, spanStart, spanEnd, 33);
                i5 = i6 + 1;
                z5 = z6;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z7 = z5;
        ImageView imageView3 = imageView2;
        if (b0cVar.h && !z4) {
            z2 = 0;
            yzbVar.setVisibility(0);
            zzbVar.setVisibility(0);
            ViewPropertyAnimator withEndAction = yzbVar.animate().alpha(0.0f).withEndAction(new cib(b0cVar, (byte) 15));
            TimeInterpolator timeInterpolator = s33.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            zzbVar.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            z2 = 0;
            if (z4) {
                i = 0;
            } else {
                i = 8;
            }
            yzbVar.setVisibility(i);
            if (!z4) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            zzbVar.setVisibility(i2);
        }
        b0cVar.h = z4;
        if (z4) {
            i3 = z2;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        textView.setOnClickListener(onClickListener);
        b0cVar.setClipChildren(z4);
        yzbVar.setText(spannableStringBuilder);
        zzbVar.setText(spannableStringBuilder);
        if (!z7 && (u86VarArr == null || u86VarArr.length == 0)) {
            z3 = true;
        } else {
            z3 = z2;
        }
        zzbVar.setTextIsSelectable(z3);
        zzbVar.setOnLinkPressListener(k46Var);
        if (onClickListener4 != null) {
            i4 = z2;
        } else {
            i4 = 8;
        }
        imageView3.setVisibility(i4);
        imageView3.setOnClickListener(onClickListener4);
        b0cVar.b = z;
        b0cVar.setWillNotDraw(!z);
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        if (TextUtils.equals(c4cVar.m, c4cVar2.m) && c4cVar.f == c4cVar2.f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new b0c(context, wjbVar);
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.d == c4cVar2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
