package defpackage;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class e29 extends ImageView {
    public HashMap a;
    public b29 b;
    public c29 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public final void a() {
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.stop();
        }
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.K();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        b29 b29Var = this.b;
        if (b29Var != null && b29Var.l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        b29 b29Var = this.b;
        if (b29Var != null || this.c != null) {
            this.f = true;
            if (this.e) {
                if (b29Var != null) {
                    b29Var.start();
                }
                c29 c29Var = this.c;
                if (c29Var != null) {
                    c29Var.w0(false);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        f(i, i2, i3, null);
    }

    public final void f(int i, int i2, int i3, int[] iArr) {
        setAnimation(new b29(i, hl.L(i2), hl.L(i3), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e29.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public b29 getAnimatedDrawable() {
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
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.L(i, str);
        }
    }

    public final void i() {
        b29 b29Var = this.b;
        if (b29Var != null || this.c != null) {
            this.f = false;
            if (this.e) {
                if (b29Var != null) {
                    b29Var.stop();
                }
                c29 c29Var = this.c;
                if (c29Var != null) {
                    c29Var.x0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.I();
            if (this.f) {
                this.c.w0(false);
            }
        }
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.stop();
        }
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.K();
        }
    }

    public void setAnimation(b29 b29Var) {
        if (this.b == b29Var) {
            return;
        }
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.K();
            this.c = null;
        }
        this.b = b29Var;
        b29Var.M(this);
        if (this.d) {
            this.b.F(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                b29 b29Var2 = this.b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                b29Var2.s.put((String) entry.getKey(), num);
                b29Var2.B();
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
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.m0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z) {
        this.n = z;
    }

    public void setProgress(float f) {
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.O(true, f);
        }
    }

    public void c() {
    }
}
