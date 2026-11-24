package defpackage;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class ry8 extends ImageView {
    public HashMap a;
    public oy8 b;
    public py8 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public final void a() {
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.stop();
        }
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.K();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        oy8 oy8Var = this.b;
        if (oy8Var != null && oy8Var.l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        oy8 oy8Var = this.b;
        if (oy8Var != null || this.c != null) {
            this.f = true;
            if (this.e) {
                if (oy8Var != null) {
                    oy8Var.start();
                }
                py8 py8Var = this.c;
                if (py8Var != null) {
                    py8Var.w0(false);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        f(i, i2, i3, null);
    }

    public final void f(int i, int i2, int i3, int[] iArr) {
        setAnimation(new oy8(i, gl.L(i2), gl.L(i3), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry8.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public oy8 getAnimatedDrawable() {
        return this.b;
    }

    public ImageReceiver getImageReceiver() {
        return this.c;
    }

    public final void h(int i, String str) {
        HashMap hashMap = this.a;
        if (hashMap == null) {
            hashMap = new HashMap();
            this.a = hashMap;
        }
        hashMap.put(str, Integer.valueOf(i));
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.L(i, str);
        }
    }

    public final void i() {
        oy8 oy8Var = this.b;
        if (oy8Var != null || this.c != null) {
            this.f = false;
            if (this.e) {
                if (oy8Var != null) {
                    oy8Var.stop();
                }
                py8 py8Var = this.c;
                if (py8Var != null) {
                    py8Var.x0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.I();
            if (this.f) {
                this.c.w0(false);
            }
        }
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.stop();
        }
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.K();
        }
    }

    public void setAnimation(oy8 oy8Var) {
        if (this.b == oy8Var) {
            return;
        }
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.K();
            this.c = null;
        }
        this.b = oy8Var;
        oy8Var.M(this);
        if (this.d) {
            this.b.F(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                oy8 oy8Var2 = this.b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                oy8Var2.s.put((String) entry.getKey(), num);
                oy8Var2.B();
            }
            this.b.j();
        }
        this.b.E(true);
        setImageDrawable(this.b);
    }

    public void setAutoRepeat(boolean z) {
        this.d = z;
    }

    @Override
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        py8 py8Var = this.c;
        if (py8Var != null) {
            py8Var.m0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z) {
        this.n = z;
    }

    public void setProgress(float f) {
        oy8 oy8Var = this.b;
        if (oy8Var != null) {
            oy8Var.O(true, f);
        }
    }

    public void c() {
    }
}
