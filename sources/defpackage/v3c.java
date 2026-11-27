package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class v3c extends a8c {
    static {
        a8c.h(new a8c());
    }

    public static b8c i(int i, String str, String str2, String str3, t3c t3cVar) {
        return j(i, str, str2, str3, t3cVar, false, null, null);
    }

    public static b8c j(int i, String str, String str2, String str3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2, b0 b0Var) {
        b8c K = b8c.K(v3c.class);
        K.d = i;
        K.m = str;
        K.n = str2;
        K.o = str3;
        K.E = onClickListener;
        K.e = z;
        K.F = onClickListener2;
        K.H = b0Var;
        return K;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        View.OnClickListener onClickListener;
        int i;
        boolean z2;
        int i2;
        w3c w3cVar = (w3c) view;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        CharSequence charSequence3 = b8cVar.o;
        View.OnClickListener onClickListener2 = b8cVar.E;
        boolean z3 = b8cVar.e;
        View.OnClickListener onClickListener3 = b8cVar.F;
        Object obj = b8cVar.H;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = w3cVar.r;
        LinearLayout linearLayout2 = w3cVar.h;
        LinearLayout linearLayout3 = w3cVar.b;
        w3cVar.c.setText(charSequence);
        w3cVar.d.setText(charSequence2);
        w3cVar.e.setText(charSequence3);
        ImageView imageView = w3cVar.f;
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
        w3cVar.n.a(z3, false);
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
        linearLayout.setOnClickListener(new jjb(w3cVar, onClickListener, (byte) 4));
        w3cVar.updateColors();
    }

    @Override
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        if (TextUtils.equals(b8cVar.m, b8cVar2.m) && TextUtils.equals(b8cVar.n, b8cVar2.n) && TextUtils.equals(b8cVar.o, b8cVar2.o) && b8cVar.F == b8cVar2.F) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new w3c(context, vnbVar);
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
