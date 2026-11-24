package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class wzb extends b4c {
    static {
        b4c.h(new b4c());
    }

    public static c4c i(int i, String str, String str2, String str3, tzb tzbVar) {
        return j(i, str, str2, str3, tzbVar, false, null, null);
    }

    public static c4c j(int i, String str, String str2, String str3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2, a0 a0Var) {
        c4c K = c4c.K(wzb.class);
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
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        View.OnClickListener onClickListener;
        int i;
        boolean z2;
        int i2;
        xzb xzbVar = (xzb) view;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        CharSequence charSequence3 = c4cVar.o;
        View.OnClickListener onClickListener2 = c4cVar.E;
        boolean z3 = c4cVar.e;
        View.OnClickListener onClickListener3 = c4cVar.F;
        Object obj = c4cVar.H;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = xzbVar.r;
        LinearLayout linearLayout2 = xzbVar.h;
        LinearLayout linearLayout3 = xzbVar.b;
        xzbVar.c.setText(charSequence);
        xzbVar.d.setText(charSequence2);
        xzbVar.e.setText(charSequence3);
        ImageView imageView = xzbVar.f;
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
        xzbVar.n.a(z3, false);
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
        linearLayout.setOnClickListener(new vzb(xzbVar, onClickListener, (byte) 1));
        xzbVar.updateColors();
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        if (TextUtils.equals(c4cVar.m, c4cVar2.m) && TextUtils.equals(c4cVar.n, c4cVar2.n) && TextUtils.equals(c4cVar.o, c4cVar2.o) && c4cVar.F == c4cVar2.F) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new xzb(context, wjbVar);
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
