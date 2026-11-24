package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public abstract class sr9 extends n39 {
    public boolean E;
    public int F;
    public int G;
    public ArrayList H;
    public ArrayList I;
    public String J;
    public int K;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public zr9 f;
    public vf6 h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public long y;

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 0 && i != 2 && i != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i) {
        int size = this.d.size();
        int size2 = this.I.size();
        zr9 zr9Var = this.f;
        int size3 = zr9Var.e.size();
        ArrayList arrayList = zr9Var.j;
        int size4 = arrayList.size();
        if (i >= 0 && i < size) {
            return this.d.get(i);
        }
        int i2 = i - size;
        if (size2 > 0) {
            if (i2 != 0) {
                if (i2 > 0 && i2 <= size2) {
                    return this.I.get(i2 - 1);
                }
                i2 -= size2 + 1;
            } else {
                return null;
            }
        }
        if (i2 >= 0 && i2 < size4) {
            return arrayList.get(i2);
        }
        int i3 = i2 - size4;
        if (i3 > 0 && i3 <= size3) {
            return zr9Var.e.get(i3 - 1);
        }
        return null;
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        this.d.clear();
        this.I.clear();
        this.e.clear();
        if (this.r) {
            this.f.g(null, true, false, this.s, this.w, this.y, this.x, 0, 0);
        }
        f();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.n = timer2;
            timer2.schedule(new ox2(this, str, (byte) 3), 200L, 300L);
        }
    }

    @Override
    public final int b() {
        zr9 zr9Var = this.f;
        this.K = -1;
        int size = this.d.size();
        if (!this.I.isEmpty()) {
            this.K = size;
            size += this.I.size() + 1;
        }
        int size2 = zr9Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = zr9Var.j.size();
        if (size3 != 0) {
            return size + size3;
        }
        return size;
    }

    @Override
    public final int d(int i) {
        Object E = E(i);
        if (E == null) {
            return 1;
        }
        if (E instanceof String) {
            if ("section".equals((String) E)) {
                return 1;
            }
            return 2;
        } else if (E instanceof nu2) {
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public final void t(defpackage.s49 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr9.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        rr8 rr8Var;
        View view;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            view = new wgb(16, context, false);
                        } else {
                            pi4 pi4Var = new pi4(context, null);
                            pi4Var.setIsSingleCell(true);
                            pi4Var.setViewType(29);
                            zkb.h(bkb.c6, null, pi4Var);
                            rr8Var = pi4Var;
                        }
                    } else {
                        view = new d62(context, (byte) 23);
                        view.setId(9);
                        view.setTag(-33024);
                    }
                    return new s49(view);
                }
                rr8 rr8Var2 = new rr8(context, null);
                rr8Var2.N0 = true;
                rr8Var2.F0 = true;
                rr8Var = rr8Var2;
            } else {
                l35 l35Var = new l35(26, null, context);
                l35Var.setNoBackground(true);
                rr8Var = l35Var;
            }
        } else {
            rr8 rr8Var3 = new rr8(context, null);
            rr8Var3.N0 = true;
            rr8Var3.F0 = true;
            rr8Var = rr8Var3;
        }
        view = rr8Var;
        return new s49(view);
    }
}
