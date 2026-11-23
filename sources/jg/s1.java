package jg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.f5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.yz;
public abstract class s1 extends dk0 {
    public boolean E;
    public int F;
    public int G;
    public ArrayList H;
    public ArrayList I;
    public String J;
    public int K;
    public Context f17678c;
    public ArrayList d;
    public ArrayList f17679e;
    public z1 f17680f;
    public a0.h h;
    public Timer f17681n;
    public boolean f17682r;
    public boolean f17683s;
    public boolean f17684w;
    public boolean f17685x;
    public long f17686y;

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 0 && i7 != 2 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i7) {
        int size = this.d.size();
        int size2 = this.I.size();
        z1 z1Var = this.f17680f;
        int size3 = z1Var.f17758e.size();
        int size4 = z1Var.f17762j.size();
        if (i7 >= 0 && i7 < size) {
            return this.d.get(i7);
        }
        int i10 = i7 - size;
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
            return z1Var.f17762j.get(i10);
        }
        int i11 = i10 - size4;
        if (i11 <= 0 || i11 > size3) {
            return null;
        }
        return z1Var.f17758e.get(i11 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f17681n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        this.d.clear();
        this.I.clear();
        this.f17679e.clear();
        if (this.f17682r) {
            this.f17680f.g(null, true, false, this.f17683s, this.f17684w, this.f17686y, this.f17685x, 0, 0);
        }
        f();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f17681n = timer2;
            timer2.schedule(new q1(0, this, str), 200L, 300L);
        }
    }

    @Override
    public final int b() {
        z1 z1Var = this.f17680f;
        this.K = -1;
        int size = this.d.size();
        if (!this.I.isEmpty()) {
            this.K = size;
            size += this.I.size() + 1;
        }
        int size2 = z1Var.f17758e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = z1Var.f17762j.size();
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
        } else if (E instanceof f5) {
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public final void t(v4.f1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: jg.s1.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        y3 y3Var;
        Context context = this.f17678c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            y3Var = new n8(16, context, false);
                        } else {
                            yz yzVar = new yz(context, null);
                            yzVar.setIsSingleCell(true);
                            yzVar.setViewType(29);
                            t6.h(m6.f29381d6, yzVar, null);
                            y3Var = yzVar;
                        }
                    } else {
                        View lnVar = new ln(context, 5);
                        lnVar.setId(9);
                        lnVar.setTag(-33024);
                        y3Var = lnVar;
                    }
                } else {
                    h6 h6Var = new h6(context, null);
                    h6Var.N0 = true;
                    h6Var.F0 = true;
                    y3Var = h6Var;
                }
            } else {
                y3 y3Var2 = new y3(26, context, null);
                y3Var2.setNoBackground(true);
                y3Var = y3Var2;
            }
        } else {
            h6 h6Var2 = new h6(context, null);
            h6Var2.N0 = true;
            h6Var2.F0 = true;
            y3Var = h6Var2;
        }
        return new v4.f1(y3Var);
    }
}
