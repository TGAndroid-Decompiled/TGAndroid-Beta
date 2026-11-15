package jg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.d5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.tj0;
public abstract class s1 extends tj0 {
    public boolean E;
    public int F;
    public int G;
    public ArrayList H;
    public ArrayList I;
    public String J;
    public int K;
    public Context f17267c;
    public ArrayList d;
    public ArrayList f17268e;
    public z1 f17269f;
    public a0.h h;
    public Timer f17270n;
    public boolean f17271r;
    public boolean f17272s;
    public boolean f17273w;
    public boolean f17274x;
    public long f17275y;

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 0 && i7 != 2 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i7) {
        int size = this.d.size();
        int size2 = this.I.size();
        z1 z1Var = this.f17269f;
        int size3 = z1Var.f17347e.size();
        int size4 = z1Var.f17351j.size();
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
            return z1Var.f17351j.get(i10);
        }
        int i11 = i10 - size4;
        if (i11 <= 0 || i11 > size3) {
            return null;
        }
        return z1Var.f17347e.get(i11 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f17270n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        this.d.clear();
        this.I.clear();
        this.f17268e.clear();
        if (this.f17271r) {
            this.f17269f.g(null, true, false, this.f17272s, this.f17273w, this.f17275y, this.f17274x, 0, 0);
        }
        f();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f17270n = timer2;
            timer2.schedule(new q1(0, this, str), 200L, 300L);
        }
    }

    @Override
    public final int b() {
        z1 z1Var = this.f17269f;
        this.K = -1;
        int size = this.d.size();
        if (!this.I.isEmpty()) {
            this.K = size;
            size += this.I.size() + 1;
        }
        int size2 = z1Var.f17347e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = z1Var.f17351j.size();
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
    public final void t(v4.e1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: jg.s1.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        x3 x3Var;
        Context context = this.f17267c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            x3Var = new l8(16, context, false);
                        } else {
                            pz pzVar = new pz(context, null);
                            pzVar.setIsSingleCell(true);
                            pzVar.setViewType(29);
                            q6.h(j6.f28849d6, pzVar, null);
                            x3Var = pzVar;
                        }
                    } else {
                        View bnVar = new bn(context, 5);
                        bnVar.setId(9);
                        bnVar.setTag(-33024);
                        x3Var = bnVar;
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
        return new v4.e1(x3Var);
    }
}
