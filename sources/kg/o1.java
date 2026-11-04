package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.d5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sm;
public abstract class o1 extends sj0 {
    public boolean E;
    public int F;
    public int G;
    public ArrayList H;
    public ArrayList I;
    public String J;
    public int K;
    public Context f17126c;
    public ArrayList d;
    public ArrayList f17127e;
    public v1 f17128f;
    public a0.h h;
    public Timer f17129n;
    public boolean f17130r;
    public boolean f17131s;
    public boolean f17132w;
    public boolean f17133x;
    public long f17134y;

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 0 && i3 != 2 && i3 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i3) {
        int size = this.d.size();
        int size2 = this.I.size();
        v1 v1Var = this.f17128f;
        int size3 = v1Var.f17209e.size();
        int size4 = v1Var.f17213j.size();
        if (i3 >= 0 && i3 < size) {
            return this.d.get(i3);
        }
        int i10 = i3 - size;
        if (size2 > 0) {
            if (i10 == 0) {
                return null;
            }
            if (i10 > 0 && i10 <= size2) {
                return this.I.get(i10 - 1);
            }
            i10 -= size2 + 1;
        }
        if (i10 >= 0 && i10 < size4) {
            return v1Var.f17213j.get(i10);
        }
        int i11 = i10 - size4;
        if (i11 <= 0 || i11 > size3) {
            return null;
        }
        return v1Var.f17209e.get(i11 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f17129n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        this.d.clear();
        this.I.clear();
        this.f17127e.clear();
        if (this.f17130r) {
            this.f17128f.g(null, true, false, this.f17131s, this.f17132w, this.f17134y, this.f17133x, 0, 0);
        }
        f();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f17129n = timer2;
            timer2.schedule(new m1(0, this, str), 200L, 300L);
        }
    }

    @Override
    public final int b() {
        v1 v1Var = this.f17128f;
        this.K = -1;
        int size = this.d.size();
        if (!this.I.isEmpty()) {
            this.K = size;
            size += this.I.size() + 1;
        }
        int size2 = v1Var.f17209e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = v1Var.f17213j.size();
        if (size3 != 0) {
            return size + size3;
        }
        return size;
    }

    @Override
    public final int d(int i3) {
        Object E = E(i3);
        if (E == null) {
            return 1;
        }
        if (E instanceof String) {
            if ("section".equals((String) E)) {
                return 1;
            }
            return 2;
        } else if (E instanceof d5) {
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public final void t(u4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: kg.o1.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        x3 x3Var;
        Context context = this.f17126c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            x3Var = new l8(16, context, false);
                        } else {
                            iz izVar = new iz(context, null);
                            izVar.setIsSingleCell(true);
                            izVar.setViewType(29);
                            r6.i(k6.f27878d6, izVar, null);
                            x3Var = izVar;
                        }
                    } else {
                        View smVar = new sm(context, 7);
                        smVar.setId(9);
                        smVar.setTag(-33024);
                        x3Var = smVar;
                    }
                } else {
                    f6 f6Var = new f6(context, null);
                    f6Var.N0 = true;
                    f6Var.F0 = true;
                    x3Var = f6Var;
                }
            } else {
                x3 x3Var2 = new x3(26, context, null);
                x3Var2.setNoBackground(true);
                x3Var = x3Var2;
            }
        } else {
            f6 f6Var2 = new f6(context, null);
            f6Var2.N0 = true;
            f6Var2.F0 = true;
            x3Var = f6Var2;
        }
        return new u4.d1(x3Var);
    }
}
