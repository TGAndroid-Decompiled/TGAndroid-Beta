package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class t21 extends p11 implements snb {
    public final vnb a;
    public Runnable b;
    public Runnable c;
    public v21 d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public t21(vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        int w0;
        float f;
        float f2;
        this.a = vnbVar;
        int i = aob.xj;
        if (vnbVar != null) {
            w0 = vnbVar.h(i);
        } else {
            w0 = aob.w0(null, i, false);
        }
        if (z) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(aob.f0((w0 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            bs2.t(textView, 1, 14.0f);
            ik8.x(textView, i, vnbVar, null, 2131743540);
            textView.setGravity(16);
            if (z2) {
                f = 34.0f;
            } else {
                f = 12.0f;
            }
            if (ob6.a0) {
                f2 = 12.0f;
            } else {
                f2 = f;
                f = 12.0f;
            }
            l2f.a(textView, f2, 8.0f, f, 8.0f);
            addView(textView, tre.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z2) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231003);
            yob.s(imageView, i, vnbVar, PorterDuff.Mode.MULTIPLY);
            if (!z) {
                imageView.setBackground(aob.f0((w0 & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            l2f.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, tre.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new k1(this, (byte) 24));
    }

    @Override
    public final void c() {
        this.d = null;
        Runnable runnable = this.c;
        if (runnable != null && !this.f) {
            runnable.run();
        }
    }

    @Override
    public final void d(v21 v21Var) {
        this.d = v21Var;
    }

    public final void e(String str) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void f() {
        if (this.d != null) {
            this.f = true;
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
            v21 v21Var = this.d;
            if (v21Var != null) {
                v21Var.b();
            }
        }
    }

    @Override
    public final void updateColors() {
        int w0;
        Drawable drawable;
        try {
            int i = aob.xj;
            vnb vnbVar = this.a;
            if (vnbVar != null) {
                w0 = vnbVar.h(i);
            } else {
                w0 = aob.w0(null, i, false);
            }
            int i2 = (w0 & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                aob.F1(drawable, i2, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                aob.F1(drawable2, i2, true);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public t21(vnb vnbVar, Context context, boolean z) {
        this(vnbVar, context, z, !z);
    }
}
