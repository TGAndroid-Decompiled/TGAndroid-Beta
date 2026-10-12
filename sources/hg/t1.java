package hg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.dt;
public abstract class t1 extends lm0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context f10747c;
    public ArrayList d;
    public ArrayList e;
    public a2 f10748f;
    public a0.h h;
    public Timer f10749n;
    public boolean f10750r;
    public boolean f10751s;
    public boolean v;
    public boolean f10752w;
    public long f10753x;
    public boolean f10754y;

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        a2 a2Var = this.f10748f;
        int size3 = a2Var.e.size();
        int size4 = a2Var.f10490j.size();
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
            return a2Var.f10490j.get(i11);
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
            Timer timer = this.f10749n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.d.clear();
        this.H.clear();
        this.e.clear();
        if (this.f10750r) {
            this.f10748f.g(null, true, false, this.f10751s, this.v, this.f10753x, this.f10752w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f10749n = timer2;
            timer2.schedule(new r1((dt) this, str, 0), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        a2 a2Var = this.f10748f;
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
        int size3 = a2Var.f10490j.size();
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
    public final void v(s4.b1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: hg.t1.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        v3 v3Var;
        Context context = this.f10747c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            v3Var = new r8(16, context, false);
                        } else {
                            f10 f10Var = new f10(context, null);
                            f10Var.setIsSingleCell(true);
                            f10Var.setViewType(29);
                            f10Var.setBackgroundColor(g6.x0(null, g6.f19901d6, false));
                            v3Var = f10Var;
                        }
                    } else {
                        View xnVar = new xn(context, 7);
                        xnVar.setId(9);
                        xnVar.setTag(-33024);
                        v3Var = xnVar;
                    }
                } else {
                    i6 i6Var = new i6(context, null);
                    i6Var.M0 = true;
                    i6Var.E0 = true;
                    v3Var = i6Var;
                }
            } else {
                v3 v3Var2 = new v3(context, 26, null);
                v3Var2.setNoBackground(true);
                v3Var = v3Var2;
            }
        } else {
            i6 i6Var2 = new i6(context, null);
            i6Var2.M0 = true;
            i6Var2.E0 = true;
            v3Var = i6Var2;
        }
        return new s4.b1(v3Var);
    }
}
