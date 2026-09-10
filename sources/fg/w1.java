package fg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.ul0;
public abstract class w1 extends ul0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context f8245c;
    public ArrayList d;
    public ArrayList e;
    public d2 f8246f;
    public a0.i h;
    public Timer f8247n;
    public boolean f8248r;
    public boolean f8249s;
    public boolean v;
    public boolean f8250w;
    public long f8251x;
    public boolean f8252y;

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        d2 d2Var = this.f8246f;
        int size3 = d2Var.e.size();
        int size4 = d2Var.f7985j.size();
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
            return d2Var.f7985j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return d2Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f8247n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.d.clear();
        this.H.clear();
        this.e.clear();
        if (this.f8248r) {
            this.f8246f.g(null, true, false, this.f8249s, this.v, this.f8251x, this.f8250w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f8247n = timer2;
            timer2.schedule(new u1(this, str, 0), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        d2 d2Var = this.f8246f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = d2Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = d2Var.f7985j.size();
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
        throw new UnsupportedOperationException("Method not decompiled: fg.w1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        u3 u3Var;
        Context context = this.f8245c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            u3Var = new s8(16, context, false);
                        } else {
                            a10 a10Var = new a10(context, null);
                            a10Var.setIsSingleCell(true);
                            a10Var.setViewType(29);
                            a10Var.setBackgroundColor(j6.w0(null, j6.f17928d6, false));
                            u3Var = a10Var;
                        }
                    } else {
                        View qnVar = new qn(context, 6);
                        qnVar.setId(9);
                        qnVar.setTag(-33024);
                        u3Var = qnVar;
                    }
                } else {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
                    j6Var.M0 = true;
                    j6Var.E0 = true;
                    u3Var = j6Var;
                }
            } else {
                u3 u3Var2 = new u3(context, 26, null);
                u3Var2.setNoBackground(true);
                u3Var = u3Var2;
            }
        } else {
            org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, null);
            j6Var2.M0 = true;
            j6Var2.E0 = true;
            u3Var = j6Var2;
        }
        return new s4.c1(u3Var);
    }
}
