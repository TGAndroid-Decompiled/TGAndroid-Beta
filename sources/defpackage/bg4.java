package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
public class bg4 extends ze3 {
    public final Handler B0 = new Handler(Looper.getMainLooper());
    public final ez3 C0 = new ez3(this, (byte) 4);
    public lj0 D0;
    public int E0;
    public int F0;
    public ImageView G0;
    public TextView H0;

    @Override
    public final void E() {
        this.V = true;
        this.B0.removeCallbacksAndMessages(null);
    }

    @Override
    public final void F() {
        this.V = true;
        lj0 lj0Var = this.D0;
        lj0Var.w = 0;
        lj0Var.d(1);
        lj0 lj0Var2 = this.D0;
        String q = q(2131689608);
        hh7 hh7Var = lj0Var2.y;
        if (hh7Var == null) {
            hh7Var = new hh7();
            lj0Var2.y = hh7Var;
        }
        lj0.f(hh7Var, q);
    }

    @Override
    public final Dialog P() {
        String str;
        String str2;
        dd ddVar = new dd(K(), (byte) 0);
        hj0 hj0Var = this.D0.d;
        String str3 = null;
        if (hj0Var != null) {
            str = hj0Var.a;
        } else {
            str = null;
        }
        pc pcVar = (pc) ddVar.c;
        pcVar.f = str;
        View inflate = LayoutInflater.from((ContextThemeWrapper) pcVar.c).inflate(2131492911, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(2131296438);
        if (textView != null) {
            this.D0.getClass();
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) inflate.findViewById(2131296435);
        if (textView2 != null) {
            hj0 hj0Var2 = this.D0.d;
            if (hj0Var2 != null) {
                str2 = hj0Var2.b;
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str2);
            }
        }
        this.G0 = (ImageView) inflate.findViewById(2131296437);
        this.H0 = (TextView) inflate.findViewById(2131296436);
        if (wmd.b(this.D0.c())) {
            str3 = q(2131689577);
        } else {
            lj0 lj0Var = this.D0;
            String str4 = lj0Var.i;
            if (str4 != null) {
                str3 = str4;
            } else {
                hj0 hj0Var3 = lj0Var.d;
                if (hj0Var3 != null && (str3 = hj0Var3.c) == null) {
                    str3 = "";
                }
            }
        }
        kj0 kj0Var = new kj0(this);
        pcVar.g = str3;
        pcVar.j = kj0Var;
        pcVar.i = inflate;
        id Y = ddVar.Y();
        Y.setCanceledOnTouchOutside(false);
        return Y;
    }

    public final int Q(int i) {
        Context n = n();
        en4 k = k();
        if (n != null && k != null) {
            TypedValue typedValue = new TypedValue();
            n.getTheme().resolveAttribute(i, typedValue, true);
            TypedArray obtainStyledAttributes = k.obtainStyledAttributes(typedValue.data, new int[]{i});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            return color;
        }
        Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
        return 0;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        lj0 lj0Var = this.D0;
        hh7 hh7Var = lj0Var.v;
        if (hh7Var == null) {
            hh7Var = new hh7();
            lj0Var.v = hh7Var;
        }
        lj0.f(hh7Var, Boolean.TRUE);
    }

    @Override
    public final void z(Bundle bundle) {
        int i;
        super.z(bundle);
        en4 k = k();
        if (k != null) {
            lj0 lj0Var = (lj0) new g29(k).k(lj0.class);
            this.D0 = lj0Var;
            hh7 hh7Var = lj0Var.x;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var.x = hh7Var;
            }
            hh7Var.d(this, new z24(this, (byte) 2));
            lj0 lj0Var2 = this.D0;
            hh7 hh7Var2 = lj0Var2.y;
            if (hh7Var2 == null) {
                hh7Var2 = new hh7();
                lj0Var2.y = hh7Var2;
            }
            hh7Var2.d(this, new s34(this, (byte) 1));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.E0 = Q(ag4.a());
        } else {
            Context n = n();
            if (n != null) {
                i = n.getColor(2131099681);
            } else {
                i = 0;
            }
            this.E0 = i;
        }
        this.F0 = Q(16842808);
    }
}
