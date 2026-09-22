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
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.t00;
public abstract class u1 extends kl0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context f9943c;
    public ArrayList d;
    public ArrayList e;
    public c2 f9944f;
    public a0.i h;
    public Timer f9945n;
    public boolean f9946r;
    public boolean f9947s;
    public boolean v;
    public boolean f9948w;
    public long f9949x;
    public boolean f9950y;

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42674f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        c2 c2Var = this.f9944f;
        int size3 = c2Var.e.size();
        int size4 = c2Var.f9692j.size();
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
            return c2Var.f9692j.get(i11);
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
            Timer timer = this.f9945n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.d.clear();
        this.H.clear();
        this.e.clear();
        if (this.f9946r) {
            this.f9944f.g(null, true, false, this.f9947s, this.v, this.f9949x, this.f9948w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f9945n = timer2;
            timer2.schedule(new s1(this, str, 0), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        c2 c2Var = this.f9944f;
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
        int size3 = c2Var.f9692j.size();
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
        Context context = this.f9943c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            v3Var = new r8(16, context, false);
                        } else {
                            t00 t00Var = new t00(context, null);
                            t00Var.setIsSingleCell(true);
                            t00Var.setViewType(29);
                            t00Var.setBackgroundColor(i6.w0(null, i6.f18834d6, false));
                            v3Var = t00Var;
                        }
                    } else {
                        View knVar = new kn(context, 7);
                        knVar.setId(9);
                        knVar.setTag(-33024);
                        v3Var = knVar;
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
        return new s4.c1(v3Var);
    }
}
