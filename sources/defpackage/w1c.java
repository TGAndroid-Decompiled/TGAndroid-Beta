package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class w1c extends b6c {
    static {
        b6c.h(new b6c());
    }

    public static c6c i(int i, String str, String str2, String str3, u1c u1cVar) {
        return j(i, str, str2, str3, u1cVar, false, null, null);
    }

    public static c6c j(int i, String str, String str2, String str3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2, a0 a0Var) {
        c6c K = c6c.K(w1c.class);
        K.d = i;
        K.m = str;
        K.n = str2;
        K.o = str3;
        K.E = onClickListener;
        K.e = z;
        K.F = onClickListener2;
        K.H = a0Var;
        return K;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        View.OnClickListener onClickListener;
        int i;
        boolean z2;
        int i2;
        x1c x1cVar = (x1c) view;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        CharSequence charSequence3 = c6cVar.o;
        View.OnClickListener onClickListener2 = c6cVar.E;
        boolean z3 = c6cVar.e;
        View.OnClickListener onClickListener3 = c6cVar.F;
        Object obj = c6cVar.H;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = x1cVar.r;
        LinearLayout linearLayout2 = x1cVar.h;
        LinearLayout linearLayout3 = x1cVar.b;
        x1cVar.c.setText(charSequence);
        x1cVar.d.setText(charSequence2);
        x1cVar.e.setText(charSequence3);
        ImageView imageView = x1cVar.f;
        int i3 = 8;
        if (onClickListener2 != null) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        linearLayout3.setOnClickListener(onClickListener2);
        if (onClickListener2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        linearLayout3.setClickable(z2);
        x1cVar.n.a(z3, false);
        if (onClickListener3 != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        linearLayout2.setOnClickListener(onClickListener3);
        if (onClickListener != null) {
            i3 = 0;
        }
        linearLayout.setVisibility(i3);
        linearLayout.setOnClickListener(new fyb(x1cVar, onClickListener, (byte) 2));
        x1cVar.updateColors();
    }

    @Override
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        if (TextUtils.equals(c6cVar.m, c6cVar2.m) && TextUtils.equals(c6cVar.n, c6cVar2.n) && TextUtils.equals(c6cVar.o, c6cVar2.o) && c6cVar.F == c6cVar2.F) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new x1c(context, ylbVar);
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
