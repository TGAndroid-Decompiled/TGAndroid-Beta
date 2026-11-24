package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
public final class jf2 extends n39 {
    public final kf2 E;
    public final Context c;
    public final zr9 h;
    public hf2 n;
    public boolean s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public vf6 e = new vf6();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public jf2(kf2 kf2Var, Context context) {
        this.E = kf2Var;
        this.c = context;
        zr9 zr9Var = new zr9(true);
        this.h = zr9Var;
        zr9Var.a = new if2(this);
    }

    @Override
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i) {
        zr9 zr9Var = this.h;
        ArrayList arrayList = zr9Var.e;
        ArrayList arrayList2 = zr9Var.g;
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
        zr9 zr9Var = this.h;
        kf2 kf2Var = this.E;
        if (kf2Var.O != 0) {
            z = true;
        } else {
            z = false;
        }
        if (hc2.T(kf2Var.n)) {
            j = this.E.N;
        } else {
            j = 0;
        }
        zr9Var.g(null, z, false, true, false, j, false, this.E.O, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.s = true;
            this.E.b.e(true, true);
            co3 co3Var = Utilities.g;
            hf2 hf2Var = new hf2(this, str, (byte) 0);
            this.n = hf2Var;
            co3Var.d(hf2Var, 300L);
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
        fu fuVar;
        this.r = 0;
        zr9 zr9Var = this.h;
        int size = zr9Var.g.size();
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
        int size3 = zr9Var.e.size();
        if (size3 != 0) {
            int i2 = this.r;
            this.y = i2;
            this.r = size3 + 1 + i2;
        } else {
            this.y = -1;
        }
        kf2 kf2Var = this.E;
        if (kf2Var.o1 && (fuVar = kf2Var.c) != null) {
            w39 adapter = fuVar.getAdapter();
            jf2 jf2Var = kf2Var.e;
            if (adapter != jf2Var) {
                fu fuVar2 = kf2Var.c;
                fuVar2.X1 = true;
                fuVar2.Y1 = false;
                fuVar2.setAdapter(jf2Var);
                kf2Var.c.setFastScrollVisible(false);
                kf2Var.c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    @Override
    public final void t(defpackage.s49 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf2.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        boolean z;
        View view;
        wjb wjbVar;
        kf2 kf2Var = this.E;
        if (i != 0) {
            wjbVar = ((d) kf2Var).resourceProvider;
            view = new l35(26, wjbVar, this.c);
            view.setBackground(null);
        } else {
            if (kf2Var.e1 == 0) {
                z = true;
            } else {
                z = false;
            }
            gh6 gh6Var = new gh6(this.c, 2, 2, z, null);
            gh6Var.H = true;
            gh6Var.setDelegate(new if2(this));
            view = gh6Var;
        }
        return new s49(view);
    }
}
