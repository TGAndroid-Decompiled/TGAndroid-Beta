package of;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.vk0;
public abstract class o1 extends vk0 {
    public int A;
    public int B;
    public ArrayList C;
    public ArrayList D;
    public String E;
    public int F;
    public Context f19438c;
    public ArrayList d;
    public ArrayList f19439e;
    public v1 f19440f;
    public a0.h h;
    public Timer f19441n;
    public boolean f19442r;
    public boolean f19443s;
    public boolean v;
    public boolean f19444w;
    public long f19445x;
    public boolean f19446y;

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 0 && i9 != 2 && i9 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i9) {
        int size = this.d.size();
        int size2 = this.D.size();
        v1 v1Var = this.f19440f;
        int size3 = v1Var.f19527e.size();
        int size4 = v1Var.f19531j.size();
        if (i9 >= 0 && i9 < size) {
            return this.d.get(i9);
        }
        int i10 = i9 - size;
        if (size2 > 0) {
            if (i10 == 0) {
                return null;
            }
            if (i10 > 0 && i10 <= size2) {
                return this.D.get(i10 - 1);
            }
            i10 -= size2 + 1;
        }
        if (i10 >= 0 && i10 < size4) {
            return v1Var.f19531j.get(i10);
        }
        int i11 = i10 - size4;
        if (i11 <= 0 || i11 > size3) {
            return null;
        }
        return v1Var.f19527e.get(i11 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f19441n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.d.clear();
        this.D.clear();
        this.f19439e.clear();
        if (this.f19442r) {
            this.f19440f.g(null, true, false, this.f19443s, this.v, this.f19445x, this.f19444w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f19441n = timer2;
            timer2.schedule(new m1(this, str, 0), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        v1 v1Var = this.f19440f;
        this.F = -1;
        int size = this.d.size();
        if (!this.D.isEmpty()) {
            this.F = size;
            size += this.D.size() + 1;
        }
        int size2 = v1Var.f19527e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = v1Var.f19531j.size();
        if (size3 != 0) {
            return size + size3;
        }
        return size;
    }

    @Override
    public final int j(int i9) {
        Object E = E(i9);
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
    public final void v(f2.q1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: of.o1.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        v3 v3Var;
        Context context = this.f19438c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            v3Var = new p8(16, context, false);
                        } else {
                            e00 e00Var = new e00(context, null);
                            e00Var.setIsSingleCell(true);
                            e00Var.setViewType(29);
                            e00Var.setBackgroundColor(f6.w0(null, f6.f23001d6, false));
                            v3Var = e00Var;
                        }
                    } else {
                        View anVar = new an(context, 8);
                        anVar.setId(9);
                        anVar.setTag(-33024);
                        v3Var = anVar;
                    }
                } else {
                    h6 h6Var = new h6(context, null);
                    h6Var.I0 = true;
                    h6Var.A0 = true;
                    v3Var = h6Var;
                }
            } else {
                v3 v3Var2 = new v3(context, 26, null);
                v3Var2.setNoBackground(true);
                v3Var = v3Var2;
            }
        } else {
            h6 h6Var2 = new h6(context, null);
            h6Var2.I0 = true;
            h6Var2.A0 = true;
            v3Var = h6Var2;
        }
        return new f2.q1(v3Var);
    }
}
