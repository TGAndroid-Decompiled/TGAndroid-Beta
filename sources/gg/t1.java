package gg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.xs;
public abstract class t1 extends qm0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context f10813c;
    public ArrayList d;
    public ArrayList f10814e;
    public b2 f10815f;
    public a0.i h;
    public Timer f10816n;
    public boolean f10817r;
    public boolean f10818s;
    public boolean v;
    public boolean f10819w;
    public long f10820x;
    public boolean f10821y;

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47706f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        b2 b2Var = this.f10815f;
        int size3 = b2Var.f10535e.size();
        int size4 = b2Var.f10539j.size();
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
            return b2Var.f10539j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return b2Var.f10535e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f10816n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.d.clear();
        this.H.clear();
        this.f10814e.clear();
        if (this.f10817r) {
            this.f10815f.g(null, true, false, this.f10818s, this.v, this.f10820x, this.f10819w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f10816n = timer2;
            timer2.schedule(new r1((xs) this, str, 0), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        b2 b2Var = this.f10815f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = b2Var.f10535e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = b2Var.f10539j.size();
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
    public final void v(s4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: gg.t1.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        v3 v3Var;
        Context context = this.f10813c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            v3Var = new r8(16, context, false);
                        } else {
                            k10 k10Var = new k10(context, null);
                            k10Var.setIsSingleCell(true);
                            k10Var.setViewType(29);
                            k10Var.setBackgroundColor(i6.x0(null, i6.f20801d6, false));
                            v3Var = k10Var;
                        }
                    } else {
                        View aoVar = new ao(context, 7);
                        aoVar.setId(9);
                        aoVar.setTag(-33024);
                        v3Var = aoVar;
                    }
                } else {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
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
            org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, null);
            i6Var2.M0 = true;
            i6Var2.E0 = true;
            v3Var = i6Var2;
        }
        return new s4.d1(v3Var);
    }
}
