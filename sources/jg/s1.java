package jg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.d5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tm;
public abstract class s1 extends pj0 {
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context f16916c;
    public ArrayList d;
    public ArrayList f16917e;
    public z1 f16918f;
    public a0.h h;
    public Timer f16919n;
    public boolean f16920r;
    public boolean f16921s;
    public boolean f16922w;
    public boolean f16923x;
    public long f16924y;

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 0 && i7 != 2 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i7) {
        int size = this.d.size();
        int size2 = this.H.size();
        z1 z1Var = this.f16918f;
        int size3 = z1Var.f16995e.size();
        int size4 = z1Var.f16999j.size();
        if (i7 >= 0 && i7 < size) {
            return this.d.get(i7);
        }
        int i10 = i7 - size;
        if (size2 > 0) {
            if (i10 == 0) {
                return null;
            }
            if (i10 > 0 && i10 <= size2) {
                return this.H.get(i10 - 1);
            }
            i10 -= size2 + 1;
        }
        if (i10 >= 0 && i10 < size4) {
            return z1Var.f16999j.get(i10);
        }
        int i11 = i10 - size4;
        if (i11 <= 0 || i11 > size3) {
            return null;
        }
        return z1Var.f16995e.get(i11 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f16919n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        this.d.clear();
        this.H.clear();
        this.f16917e.clear();
        if (this.f16920r) {
            this.f16918f.g(null, true, false, this.f16921s, this.f16922w, this.f16924y, this.f16923x, 0, 0);
        }
        f();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f16919n = timer2;
            timer2.schedule(new q1(0, this, str), 200L, 300L);
        }
    }

    @Override
    public final int b() {
        z1 z1Var = this.f16918f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = z1Var.f16995e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = z1Var.f16999j.size();
        if (size3 != 0) {
            return size + size3;
        }
        return size;
    }

    @Override
    public final int d(int i7) {
        Object E = E(i7);
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
    public final void t(v4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: jg.s1.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        x3 x3Var;
        Context context = this.f16916c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            x3Var = new m8(16, context, false);
                        } else {
                            mz mzVar = new mz(context, null);
                            mzVar.setIsSingleCell(true);
                            mzVar.setViewType(29);
                            s6.h(l6.f27865d6, mzVar, null);
                            x3Var = mzVar;
                        }
                    } else {
                        View tmVar = new tm(context, 6);
                        tmVar.setId(9);
                        tmVar.setTag(-33024);
                        x3Var = tmVar;
                    }
                } else {
                    g6 g6Var = new g6(context, null);
                    g6Var.M0 = true;
                    g6Var.E0 = true;
                    x3Var = g6Var;
                }
            } else {
                x3 x3Var2 = new x3(26, context, null);
                x3Var2.setNoBackground(true);
                x3Var = x3Var2;
            }
        } else {
            g6 g6Var2 = new g6(context, null);
            g6Var2.M0 = true;
            g6Var2.E0 = true;
            x3Var = g6Var2;
        }
        return new v4.d1(x3Var);
    }
}
