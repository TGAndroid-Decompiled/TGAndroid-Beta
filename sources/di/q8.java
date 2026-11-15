package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
public final class q8 {
    public final org.telegram.ui.ActionBar.e2 f9279a;
    public final long f9280b;
    public final org.telegram.ui.Components.xb f9281c;
    public final org.telegram.ui.Components.rb d;
    public final org.telegram.ui.Components.vb f9282e;
    public final u8 f9283f;
    public int f9284g;
    public long h;
    public t7 f9285i;
    public final ArrayList f9286j = new ArrayList();
    public final HashSet f9287k = new HashSet();
    public final long f9288l = System.currentTimeMillis();
    public boolean f9289m = true;
    public boolean f9290n;
    public boolean f9291o;
    public final p8 f9292p;

    public q8(org.telegram.ui.ActionBar.e2 e2Var, long j3) {
        ?? r22 = new Runnable(this) {
            public final q8 f9237b;

            {
                this.f9237b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9237b.a();
                        return;
                    default:
                        q8 q8Var = this.f9237b;
                        if (!q8Var.f9290n && !q8Var.f9291o && q8Var.f9289m) {
                            q8Var.f9290n = true;
                            t7 t7Var = q8Var.f9285i;
                            if (t7Var != null) {
                                t7Var.a(q8Var.f9287k);
                            }
                            if (q8Var.f9282e != null) {
                                q8Var.f9281c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f9292p = r22;
        this.f9279a = e2Var;
        this.f9280b = j3;
        Context t6 = v8.t(e2Var);
        org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(t6, e2Var.getResourceProvider());
        this.d = rbVar;
        rbVar.c(2131624227, new String[0]);
        ?? qbVar = new org.telegram.ui.Components.qb(t6, e2Var.getResourceProvider());
        this.f9283f = qbVar;
        qbVar.f38606b = 3000L;
        int i7 = org.telegram.ui.ActionBar.j6.xj;
        org.telegram.ui.ActionBar.e6 resourceProvider = e2Var.getResourceProvider();
        o oVar = new o(3);
        o oVar2 = new o(4);
        int P = org.telegram.ui.ActionBar.q6.P(i7, -1, 0, 0.0f, resourceProvider);
        oVar2.f(P, qbVar);
        org.telegram.ui.ActionBar.k6 w10 = org.telegram.ui.ActionBar.q6.w(101, qbVar);
        w10.c(i7, -1, 0, 0.0f, resourceProvider);
        w10.f29354n = oVar;
        w10.f29355o = oVar2;
        w10.f29353m = false;
        w10.f29348g = P;
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(t6, e2Var.getResourceProvider(), true, false);
        this.f9282e = vbVar;
        vbVar.e(hd.M0(2131745023, null));
        vbVar.f40369b = new Runnable(this) {
            public final q8 f9237b;

            {
                this.f9237b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9237b.a();
                        return;
                    default:
                        q8 q8Var = this.f9237b;
                        if (!q8Var.f9290n && !q8Var.f9291o && q8Var.f9289m) {
                            q8Var.f9290n = true;
                            t7 t7Var = q8Var.f9285i;
                            if (t7Var != null) {
                                t7Var.a(q8Var.f9287k);
                            }
                            if (q8Var.f9282e != null) {
                                q8Var.f9281c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        vbVar.addView((View) qbVar, c8.ja.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        vbVar.f40371e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        rbVar.setButton(vbVar);
        org.telegram.ui.Components.xb b10 = org.telegram.ui.Components.cc.a0(e2Var).b(rbVar, -1);
        this.f9281c = b10;
        b10.f41651r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final q8 f9237b;

            {
                this.f9237b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9237b.a();
                        return;
                    default:
                        q8 q8Var = this.f9237b;
                        if (!q8Var.f9290n && !q8Var.f9291o && q8Var.f9289m) {
                            q8Var.f9290n = true;
                            t7 t7Var = q8Var.f9285i;
                            if (t7Var != null) {
                                t7Var.a(q8Var.f9287k);
                            }
                            if (q8Var.f9282e != null) {
                                q8Var.f9281c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        org.telegram.messenger.g0.r(r22);
        org.telegram.messenger.g0.i3(r22, 3000L);
    }

    public final void a() {
        if (!this.f9290n && !this.f9291o) {
            this.f9291o = true;
            ArrayList arrayList = this.f9286j;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((Runnable) obj).run();
            }
            if (this.f9282e != null) {
                this.f9281c.b();
            }
        }
    }
}
