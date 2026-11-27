package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e;
public final class ag2 extends c79 {
    public final bg2 E;
    public final Context c;
    public final sv9 h;
    public zf2 n;
    public boolean s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public zh6 e = new zh6();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public ag2(bg2 bg2Var, Context context) {
        this.E = bg2Var;
        this.c = context;
        sv9 sv9Var = new sv9(true);
        this.h = sv9Var;
        sv9Var.a = new yf2(this);
    }

    @Override
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i) {
        sv9 sv9Var = this.h;
        ArrayList arrayList = sv9Var.e;
        ArrayList arrayList2 = sv9Var.g;
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
        sv9 sv9Var = this.h;
        bg2 bg2Var = this.E;
        if (bg2Var.O != 0) {
            z = true;
        } else {
            z = false;
        }
        if (xc2.T(bg2Var.n)) {
            j = this.E.N;
        } else {
            j = 0;
        }
        sv9Var.g(null, z, false, true, false, j, false, this.E.O, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.s = true;
            this.E.b.e(true, true);
            to3 to3Var = Utilities.g;
            zf2 zf2Var = new zf2(this, str, (byte) 0);
            this.n = zf2Var;
            to3Var.d(zf2Var, 300L);
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
        gu guVar;
        this.r = 0;
        sv9 sv9Var = this.h;
        int size = sv9Var.g.size();
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
        int size3 = sv9Var.e.size();
        if (size3 != 0) {
            int i2 = this.r;
            this.y = i2;
            this.r = size3 + 1 + i2;
        } else {
            this.y = -1;
        }
        bg2 bg2Var = this.E;
        if (bg2Var.o1 && (guVar = bg2Var.c) != null) {
            j79 adapter = guVar.getAdapter();
            ag2 ag2Var = bg2Var.e;
            if (adapter != ag2Var) {
                gu guVar2 = bg2Var.c;
                guVar2.X1 = true;
                guVar2.Y1 = false;
                guVar2.setAdapter(ag2Var);
                bg2Var.c.setFastScrollVisible(false);
                bg2Var.c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    @Override
    public final void t(defpackage.f89 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag2.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        boolean z;
        View view;
        vnb vnbVar;
        bg2 bg2Var = this.E;
        if (i != 0) {
            vnbVar = ((e) bg2Var).resourceProvider;
            view = new p55(26, vnbVar, this.c);
            view.setBackground(null);
        } else {
            if (bg2Var.e1 == 0) {
                z = true;
            } else {
                z = false;
            }
            lj6 lj6Var = new lj6(this.c, 2, 2, z, null);
            lj6Var.H = true;
            lj6Var.setDelegate(new yf2(this));
            view = lj6Var;
        }
        return new f89(view);
    }
}
