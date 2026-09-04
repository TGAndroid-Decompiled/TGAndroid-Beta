package hg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.t00;
public abstract class u1 extends kl0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context f11269c;
    public ArrayList d;
    public ArrayList f11270e;
    public b2 f11271f;
    public a0.i h;
    public Timer f11272n;
    public boolean f11273r;
    public boolean f11274s;
    public boolean v;
    public boolean f11275w;
    public long f11276x;
    public boolean f11277y;

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        b2 b2Var = this.f11271f;
        int size3 = b2Var.f10982e.size();
        int size4 = b2Var.f10986j.size();
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
            return b2Var.f10986j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return b2Var.f10982e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f11272n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.d.clear();
        this.H.clear();
        this.f11270e.clear();
        if (this.f11273r) {
            this.f11271f.g(null, true, false, this.f11274s, this.v, this.f11276x, this.f11275w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f11272n = timer2;
            timer2.schedule(new s1(this, str, 0), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        b2 b2Var = this.f11271f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = b2Var.f10982e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = b2Var.f10986j.size();
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
        throw new UnsupportedOperationException("Method not decompiled: hg.u1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        u3 u3Var;
        Context context = this.f11269c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            u3Var = new r8(16, context, false);
                        } else {
                            t00 t00Var = new t00(context, null);
                            t00Var.setIsSingleCell(true);
                            t00Var.setViewType(29);
                            t00Var.setBackgroundColor(j6.w0(null, j6.f20663d6, false));
                            u3Var = t00Var;
                        }
                    } else {
                        View jnVar = new jn(context, 7);
                        jnVar.setId(9);
                        jnVar.setTag(-33024);
                        u3Var = jnVar;
                    }
                } else {
                    h6 h6Var = new h6(context, null);
                    h6Var.M0 = true;
                    h6Var.E0 = true;
                    u3Var = h6Var;
                }
            } else {
                u3 u3Var2 = new u3(context, 26, null);
                u3Var2.setNoBackground(true);
                u3Var = u3Var2;
            }
        } else {
            h6 h6Var2 = new h6(context, null);
            h6Var2.M0 = true;
            h6Var2.E0 = true;
            u3Var = h6Var2;
        }
        return new s4.c1(u3Var);
    }
}
