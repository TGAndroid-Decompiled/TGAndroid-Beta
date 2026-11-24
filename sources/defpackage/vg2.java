package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
public final class vg2 extends q59 {
    public final wg2 E;
    public final Context c;
    public final bu9 h;
    public tg2 n;
    public boolean s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public vh6 e = new vh6();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public vg2(wg2 wg2Var, Context context) {
        this.E = wg2Var;
        this.c = context;
        bu9 bu9Var = new bu9(true);
        this.h = bu9Var;
        bu9Var.a = new ug2(this);
    }

    @Override
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i) {
        bu9 bu9Var = this.h;
        ArrayList arrayList = bu9Var.e;
        ArrayList arrayList2 = bu9Var.g;
        int size = arrayList2.size();
        if (size != 0) {
            int i2 = size + 1;
            if (i2 > i) {
                if (i != 0) {
                    return (TLObject) arrayList2.get(i - 1);
                }
                return null;
            }
            i -= i2;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i3 = size2 + 1;
            if (i3 > i) {
                if (i != 0) {
                    return (TLObject) this.d.get(i - 1);
                }
                return null;
            }
            i -= i3;
        }
        int size3 = arrayList.size();
        if (size3 != 0 && size3 + 1 > i && i != 0) {
            return (TLObject) arrayList.get(i - 1);
        }
        return null;
    }

    public final void F(String str) {
        boolean z;
        long j;
        if (this.n != null) {
            Utilities.g.a(this.n);
            this.n = null;
        }
        this.d.clear();
        this.e.b();
        this.f.clear();
        this.h.f(null, null);
        bu9 bu9Var = this.h;
        wg2 wg2Var = this.E;
        if (wg2Var.O != 0) {
            z = true;
        } else {
            z = false;
        }
        if (sd2.T(wg2Var.n)) {
            j = this.E.N;
        } else {
            j = 0;
        }
        bu9Var.g(null, z, false, true, false, j, false, this.E.O, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.s = true;
            this.E.b.e(true, true);
            mp3 mp3Var = Utilities.g;
            tg2 tg2Var = new tg2(this, str, (byte) 0);
            this.n = tg2Var;
            mp3Var.d(tg2Var, 300L);
        }
    }

    @Override
    public final int b() {
        return this.r;
    }

    @Override
    public final int d(int i) {
        if (i != this.y && i != this.w && i != this.x) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        fv fvVar;
        this.r = 0;
        bu9 bu9Var = this.h;
        int size = bu9Var.g.size();
        if (size != 0) {
            this.w = 0;
            this.r = size + 1 + this.r;
        } else {
            this.w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i = this.r;
            this.x = i;
            this.r = size2 + 1 + i;
        } else {
            this.x = -1;
        }
        int size3 = bu9Var.e.size();
        if (size3 != 0) {
            int i2 = this.r;
            this.y = i2;
            this.r = size3 + 1 + i2;
        } else {
            this.y = -1;
        }
        wg2 wg2Var = this.E;
        if (wg2Var.o1 && (fvVar = wg2Var.c) != null) {
            y59 adapter = fvVar.getAdapter();
            vg2 vg2Var = wg2Var.e;
            if (adapter != vg2Var) {
                fv fvVar2 = wg2Var.c;
                fvVar2.X1 = true;
                fvVar2.Y1 = false;
                fvVar2.setAdapter(vg2Var);
                wg2Var.c.setFastScrollVisible(false);
                wg2Var.c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    @Override
    public final void t(defpackage.u69 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg2.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        boolean z;
        View view;
        ylb ylbVar;
        wg2 wg2Var = this.E;
        if (i != 0) {
            ylbVar = ((d) wg2Var).resourceProvider;
            view = new l55(26, ylbVar, this.c);
            view.setBackground(null);
        } else {
            if (wg2Var.e1 == 0) {
                z = true;
            } else {
                z = false;
            }
            ij6 ij6Var = new ij6(this.c, 2, 2, z, null);
            ij6Var.H = true;
            ij6Var.setDelegate(new ug2(this));
            view = ij6Var;
        }
        return new u69(view);
    }
}
