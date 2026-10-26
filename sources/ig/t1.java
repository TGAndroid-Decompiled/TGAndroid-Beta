package ig;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.vn;
public abstract class t1 extends lm0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context f14251c;
    public ArrayList d;
    public ArrayList e;
    public a2 f14252f;
    public a0.h h;
    public Timer f14253n;
    public boolean f14254r;
    public boolean f14255s;
    public boolean v;
    public boolean f14256w;
    public long f14257x;
    public boolean f14258y;

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        a2 a2Var = this.f14252f;
        int size3 = a2Var.e.size();
        int size4 = a2Var.f13994j.size();
        if (i10 >= 0 && i10 < size) {
            return this.d.get(i10);
        }
        int i11 = i10 - size;
        if (size2 > 0) {
            if (i11 == 0) {
                return null;
            }
            if (i11 > 0 && i11 <= size2) {
                return this.H.get(i11 - 1);
            }
            i11 -= size2 + 1;
        }
        if (i11 >= 0 && i11 < size4) {
            return a2Var.f13994j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return a2Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f14253n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.d.clear();
        this.H.clear();
        this.e.clear();
        if (this.f14254r) {
            this.f14252f.g(null, true, false, this.f14255s, this.v, this.f14257x, this.f14256w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f14253n = timer2;
            timer2.schedule(new r1(this, str, 0), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        a2 a2Var = this.f14252f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = a2Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = a2Var.f13994j.size();
        if (size3 != 0) {
            return size + size3;
        }
        return size;
    }

    @Override
    public final int j(int i10) {
        Object E = E(i10);
        if (E == null) {
            return 1;
        }
        if (E instanceof String) {
            if ("section".equals((String) E)) {
                return 1;
            }
            return 2;
        } else if (E instanceof ContactsController.Contact) {
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public final void v(s4.e1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: ig.t1.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        z3 z3Var;
        Context context = this.f14251c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            z3Var = new v8(16, context, false);
                        } else {
                            c10 c10Var = new c10(context, null);
                            c10Var.setIsSingleCell(true);
                            c10Var.setViewType(29);
                            f7.i(y6.f23356d6, c10Var, null);
                            z3Var = c10Var;
                        }
                    } else {
                        View vnVar = new vn(context, 7);
                        vnVar.setId(9);
                        vnVar.setTag(-33024);
                        z3Var = vnVar;
                    }
                } else {
                    m6 m6Var = new m6(context, null);
                    m6Var.M0 = true;
                    m6Var.E0 = true;
                    z3Var = m6Var;
                }
            } else {
                z3 z3Var2 = new z3(context, 26, null);
                z3Var2.setNoBackground(true);
                z3Var = z3Var2;
            }
        } else {
            m6 m6Var2 = new m6(context, null);
            m6Var2.M0 = true;
            m6Var2.E0 = true;
            z3Var = m6Var2;
        }
        return new s4.e1(z3Var);
    }
}
