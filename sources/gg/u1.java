package gg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.wl0;
public abstract class u1 extends wl0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context f9928c;
    public ArrayList d;
    public ArrayList e;
    public c2 f9929f;
    public a0.i h;
    public Timer f9930n;
    public boolean f9931r;
    public boolean f9932s;
    public boolean v;
    public boolean f9933w;
    public long f9934x;
    public boolean f9935y;

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42962f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        c2 c2Var = this.f9929f;
        int size3 = c2Var.e.size();
        int size4 = c2Var.f9677j.size();
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
            return c2Var.f9677j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return c2Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f9930n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.d.clear();
        this.H.clear();
        this.e.clear();
        if (this.f9931r) {
            this.f9929f.g(null, true, false, this.f9932s, this.v, this.f9934x, this.f9933w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f9930n = timer2;
            timer2.schedule(new s1(this, str, 0), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        c2 c2Var = this.f9929f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = c2Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = c2Var.f9677j.size();
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
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: gg.u1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        v3 v3Var;
        Context context = this.f9928c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            v3Var = new r8(16, context, false);
                        } else {
                            v00 v00Var = new v00(context, null);
                            v00Var.setIsSingleCell(true);
                            v00Var.setViewType(29);
                            v00Var.setBackgroundColor(h6.w0(null, h6.f19059d6, false));
                            v3Var = v00Var;
                        }
                    } else {
                        View mnVar = new mn(context, 7);
                        mnVar.setId(9);
                        mnVar.setTag(-33024);
                        v3Var = mnVar;
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
        return new s4.c1(v3Var);
    }
}
