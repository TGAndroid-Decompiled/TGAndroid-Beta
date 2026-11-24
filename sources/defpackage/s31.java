package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class s31 extends o21 implements vlb {
    public final ylb a;
    public Runnable b;
    public Runnable c;
    public u31 d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public s31(ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        int w0;
        float f;
        float f2;
        this.a = ylbVar;
        int i = cmb.wj;
        if (ylbVar != null) {
            w0 = ylbVar.h(i);
        } else {
            w0 = cmb.w0(null, i, false);
        }
        if (z) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(cmb.f0((w0 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            ts2.s(textView, 1, 14.0f);
            wi8.x(textView, i, ylbVar, null, 2131743572);
            textView.setGravity(16);
            if (z2) {
                f = 34.0f;
            } else {
                f = 12.0f;
            }
            if (jb6.a0) {
                f2 = 12.0f;
            } else {
                f2 = f;
                f = 12.0f;
            }
            vze.a(textView, f2, 8.0f, f, 8.0f);
            addView(textView, qoe.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z2) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231004);
            anb.s(imageView, i, ylbVar, PorterDuff.Mode.MULTIPLY);
            if (!z) {
                imageView.setBackground(cmb.f0((w0 & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            vze.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, qoe.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new j1(this, (byte) 25));
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
    public final void d(u31 u31Var) {
        this.d = u31Var;
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
            u31 u31Var = this.d;
            if (u31Var != null) {
                u31Var.b();
            }
        }
    }

    @Override
    public final void updateColors() {
        int w0;
        Drawable drawable;
        try {
            int i = cmb.wj;
            ylb ylbVar = this.a;
            if (ylbVar != null) {
                w0 = ylbVar.h(i);
            } else {
                w0 = cmb.w0(null, i, false);
            }
            int i2 = (w0 & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                cmb.F1(drawable, i2, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                cmb.F1(drawable2, i2, true);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public s31(ylb ylbVar, Context context, boolean z) {
        this(ylbVar, context, z, !z);
    }
}
