package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public abstract class lv9 extends c79 {
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
    public sv9 f;
    public zh6 h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public long y;

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 0 && i != 2 && i != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i) {
        int size = this.d.size();
        int size2 = this.I.size();
        sv9 sv9Var = this.f;
        int size3 = sv9Var.e.size();
        ArrayList arrayList = sv9Var.j;
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
            return sv9Var.e.get(i3 - 1);
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
            cc4.g(e, true);
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
            timer2.schedule(new iy2(this, str, (byte) 3), 200L, 300L);
        }
    }

    @Override
    public final int b() {
        sv9 sv9Var = this.f;
        this.K = -1;
        int size = this.d.size();
        if (!this.I.isEmpty()) {
            this.K = size;
            size += this.I.size() + 1;
        }
        int size2 = sv9Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = sv9Var.j.size();
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
        } else if (E instanceof iv2) {
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public final void t(defpackage.f89 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv9.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        bv8 bv8Var;
        View view;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            view = new skb(16, context, false);
                        } else {
                            tk4 tk4Var = new tk4(context, null);
                            tk4Var.setIsSingleCell(true);
                            tk4Var.setViewType(29);
                            yob.h(aob.d6, null, tk4Var);
                            bv8Var = tk4Var;
                        }
                    } else {
                        view = new t62(context, (byte) 23);
                        view.setId(9);
                        view.setTag(-33024);
                    }
                    return new f89(view);
                }
                bv8 bv8Var2 = new bv8(context, null);
                bv8Var2.O0 = true;
                bv8Var2.G0 = true;
                bv8Var = bv8Var2;
            } else {
                p55 p55Var = new p55(26, null, context);
                p55Var.setNoBackground(true);
                bv8Var = p55Var;
            }
        } else {
            bv8 bv8Var3 = new bv8(context, null);
            bv8Var3.O0 = true;
            bv8Var3.G0 = true;
            bv8Var = bv8Var3;
        }
        view = bv8Var;
        return new f89(view);
    }
}
