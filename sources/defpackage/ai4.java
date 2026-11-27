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
public class ai4 extends tf3 {
    public final Handler B0 = new Handler(Looper.getMainLooper());
    public final zz3 C0 = new zz3(this, (byte) 4);
    public mj0 D0;
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
        mj0 mj0Var = this.D0;
        mj0Var.w = 0;
        mj0Var.d(1);
        mj0 mj0Var2 = this.D0;
        String q = q(2131689608);
        rj7 rj7Var = mj0Var2.y;
        if (rj7Var == null) {
            rj7Var = new rj7();
            mj0Var2.y = rj7Var;
        }
        mj0.f(rj7Var, q);
    }

    @Override
    public final Dialog P() {
        String str;
        String str2;
        ed edVar = new ed(K(), (byte) 0);
        ij0 ij0Var = this.D0.d;
        String str3 = null;
        if (ij0Var != null) {
            str = ij0Var.a;
        } else {
            str = null;
        }
        qc qcVar = (qc) edVar.c;
        qcVar.f = str;
        View inflate = LayoutInflater.from((ContextThemeWrapper) qcVar.c).inflate(2131492911, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(2131296438);
        if (textView != null) {
            this.D0.getClass();
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) inflate.findViewById(2131296435);
        if (textView2 != null) {
            ij0 ij0Var2 = this.D0.d;
            if (ij0Var2 != null) {
                str2 = ij0Var2.b;
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
        if (nrd.b(this.D0.c())) {
            str3 = q(2131689577);
        } else {
            mj0 mj0Var = this.D0;
            String str4 = mj0Var.i;
            if (str4 != null) {
                str3 = str4;
            } else {
                ij0 ij0Var3 = mj0Var.d;
                if (ij0Var3 != null && (str3 = ij0Var3.c) == null) {
                    str3 = "";
                }
            }
        }
        lj0 lj0Var = new lj0(this);
        qcVar.g = str3;
        qcVar.j = lj0Var;
        qcVar.i = inflate;
        jd a0 = edVar.a0();
        a0.setCanceledOnTouchOutside(false);
        return a0;
    }

    public final int Q(int i) {
        Context n = n();
        jp4 k = k();
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
        mj0 mj0Var = this.D0;
        rj7 rj7Var = mj0Var.v;
        if (rj7Var == null) {
            rj7Var = new rj7();
            mj0Var.v = rj7Var;
        }
        mj0.f(rj7Var, Boolean.TRUE);
    }

    @Override
    public final void z(Bundle bundle) {
        super.z(bundle);
        jp4 k = k();
        int i = 0;
        if (k != null) {
            mj0 mj0Var = (mj0) new pq8(k).n(mj0.class);
            this.D0 = mj0Var;
            rj7 rj7Var = mj0Var.x;
            if (rj7Var == null) {
                rj7Var = new rj7();
                mj0Var.x = rj7Var;
            }
            rj7Var.d(this, new xh4(this, (byte) 0));
            mj0 mj0Var2 = this.D0;
            rj7 rj7Var2 = mj0Var2.y;
            if (rj7Var2 == null) {
                rj7Var2 = new rj7();
                mj0Var2.y = rj7Var2;
            }
            rj7Var2.d(this, new aj3(this, (byte) 4));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.E0 = Q(zh4.a());
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
