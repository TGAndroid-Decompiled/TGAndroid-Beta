package hg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.un;
public abstract class t1 extends hm0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context f12056c;
    public ArrayList d;
    public ArrayList e;
    public a2 f12057f;
    public a0.h h;
    public Timer f12058n;
    public boolean f12059r;
    public boolean f12060s;
    public boolean v;
    public boolean f12061w;
    public long f12062x;
    public boolean f12063y;

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45913f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        a2 a2Var = this.f12057f;
        int size3 = a2Var.e.size();
        int size4 = a2Var.f11799j.size();
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
            return a2Var.f11799j.get(i11);
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
            Timer timer = this.f12058n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.d.clear();
        this.H.clear();
        this.e.clear();
        if (this.f12059r) {
            this.f12057f.g(null, true, false, this.f12060s, this.v, this.f12062x, this.f12061w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f12058n = timer2;
            timer2.schedule(new r1(this, str, 0), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        a2 a2Var = this.f12057f;
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
        int size3 = a2Var.f11799j.size();
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
        u3 u3Var;
        Context context = this.f12056c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            u3Var = new q8(16, context, false);
                        } else {
                            b10 b10Var = new b10(context, null);
                            b10Var.setIsSingleCell(true);
                            b10Var.setViewType(29);
                            b10Var.setBackgroundColor(h6.x0(null, h6.f20986d6, false));
                            u3Var = b10Var;
                        }
                    } else {
                        View unVar = new un(context, 7);
                        unVar.setId(9);
                        unVar.setTag(-33024);
                        u3Var = unVar;
                    }
                } else {
                    org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
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
            org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, null);
            h6Var2.M0 = true;
            h6Var2.E0 = true;
            u3Var = h6Var2;
        }
        return new s4.b1(u3Var);
    }
}
