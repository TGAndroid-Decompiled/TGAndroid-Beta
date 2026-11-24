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
public class di4 extends mg3 {
    public final Handler B0 = new Handler(Looper.getMainLooper());
    public final o04 C0 = new o04(this, (byte) 4);
    public lk0 D0;
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
        lk0 lk0Var = this.D0;
        lk0Var.w = 0;
        lk0Var.d(1);
        lk0 lk0Var2 = this.D0;
        String q = q(2131689608);
        kj7 kj7Var = lk0Var2.y;
        if (kj7Var == null) {
            kj7Var = new kj7();
            lk0Var2.y = kj7Var;
        }
        lk0.f(kj7Var, q);
    }

    @Override
    public final Dialog P() {
        String str;
        String str2;
        de deVar = new de(K(), (byte) 0);
        hk0 hk0Var = this.D0.d;
        String str3 = null;
        if (hk0Var != null) {
            str = hk0Var.a;
        } else {
            str = null;
        }
        pd pdVar = (pd) deVar.c;
        pdVar.f = str;
        View inflate = LayoutInflater.from((ContextThemeWrapper) pdVar.c).inflate(2131492911, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(2131296438);
        if (textView != null) {
            this.D0.getClass();
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) inflate.findViewById(2131296435);
        if (textView2 != null) {
            hk0 hk0Var2 = this.D0.d;
            if (hk0Var2 != null) {
                str2 = hk0Var2.b;
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
        if (zod.b(this.D0.c())) {
            str3 = q(2131689577);
        } else {
            lk0 lk0Var = this.D0;
            String str4 = lk0Var.i;
            if (str4 != null) {
                str3 = str4;
            } else {
                hk0 hk0Var3 = lk0Var.d;
                if (hk0Var3 != null && (str3 = hk0Var3.c) == null) {
                    str3 = "";
                }
            }
        }
        kk0 kk0Var = new kk0(this);
        pdVar.g = str3;
        pdVar.j = kk0Var;
        pdVar.i = inflate;
        ie a0 = deVar.a0();
        a0.setCanceledOnTouchOutside(false);
        return a0;
    }

    public final int Q(int i) {
        Context n = n();
        gp4 k = k();
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
        lk0 lk0Var = this.D0;
        kj7 kj7Var = lk0Var.v;
        if (kj7Var == null) {
            kj7Var = new kj7();
            lk0Var.v = kj7Var;
        }
        lk0.f(kj7Var, Boolean.TRUE);
    }

    @Override
    public final void z(Bundle bundle) {
        super.z(bundle);
        gp4 k = k();
        int i = 0;
        if (k != null) {
            lk0 lk0Var = (lk0) new et8(k).l(lk0.class);
            this.D0 = lk0Var;
            kj7 kj7Var = lk0Var.x;
            if (kj7Var == null) {
                kj7Var = new kj7();
                lk0Var.x = kj7Var;
            }
            kj7Var.d(this, new ai4(this, (byte) 0));
            lk0 lk0Var2 = this.D0;
            kj7 kj7Var2 = lk0Var2.y;
            if (kj7Var2 == null) {
                kj7Var2 = new kj7();
                lk0Var2.y = kj7Var2;
            }
            kj7Var2.d(this, new fk3(this));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.E0 = Q(ci4.a());
        } else {
            Context n = n();
            if (n != null) {
                i = n.getColor(2131099681);
            }
            this.E0 = i;
        }
        this.F0 = Q(16842808);
    }
}
