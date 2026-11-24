package defpackage;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class s09 extends ImageView {
    public HashMap a;
    public p09 b;
    public q09 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public final void a() {
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.stop();
        }
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.K();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        p09 p09Var = this.b;
        if (p09Var != null && p09Var.l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        p09 p09Var = this.b;
        if (p09Var != null || this.c != null) {
            this.f = true;
            if (this.e) {
                if (p09Var != null) {
                    p09Var.start();
                }
                q09 q09Var = this.c;
                if (q09Var != null) {
                    q09Var.w0(false);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        f(i, i2, i3, null);
    }

    public final void f(int i, int i2, int i3, int[] iArr) {
        setAnimation(new p09(i, gm.L(i2), gm.L(i3), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s09.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public p09 getAnimatedDrawable() {
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
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.L(i, str);
        }
    }

    public final void i() {
        p09 p09Var = this.b;
        if (p09Var != null || this.c != null) {
            this.f = false;
            if (this.e) {
                if (p09Var != null) {
                    p09Var.stop();
                }
                q09 q09Var = this.c;
                if (q09Var != null) {
                    q09Var.x0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.I();
            if (this.f) {
                this.c.w0(false);
            }
        }
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.stop();
        }
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.K();
        }
    }

    public void setAnimation(p09 p09Var) {
        if (this.b == p09Var) {
            return;
        }
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.K();
            this.c = null;
        }
        this.b = p09Var;
        p09Var.M(this);
        if (this.d) {
            this.b.F(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                p09 p09Var2 = this.b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                p09Var2.s.put((String) entry.getKey(), num);
                p09Var2.B();
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
        q09 q09Var = this.c;
        if (q09Var != null) {
            q09Var.m0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z) {
        this.n = z;
    }

    public void setProgress(float f) {
        p09 p09Var = this.b;
        if (p09Var != null) {
            p09Var.O(true, f);
        }
    }

    public void c() {
    }
}
