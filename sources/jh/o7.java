package jh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
public final class o7 {
    public final org.telegram.ui.ActionBar.o2 f12569a;
    public final long f12570b;
    public final mc f12571c;
    public final gc d;
    public final kc f12572e;
    public final fc f12573f;
    public int f12574g;
    public long h;
    public m6 f12575i;
    public final ArrayList f12576j = new ArrayList();
    public final HashSet f12577k = new HashSet();
    public final long f12578l = System.currentTimeMillis();
    public boolean f12579m = true;
    public boolean f12580n;
    public boolean f12581o;
    public final n7 f12582p;

    public o7(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final o7 f12516b;

            {
                this.f12516b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f12516b.a();
                        return;
                    default:
                        o7 o7Var = this.f12516b;
                        if (!o7Var.f12580n && !o7Var.f12581o && o7Var.f12579m) {
                            o7Var.f12580n = true;
                            m6 m6Var = o7Var.f12575i;
                            if (m6Var != null) {
                                m6Var.run(o7Var.f12577k);
                            }
                            if (o7Var.f12572e != null) {
                                o7Var.f12571c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f12582p = r22;
        this.f12569a = o2Var;
        this.f12570b = j10;
        Context t10 = s7.t(o2Var);
        gc gcVar = new gc(t10, o2Var.getResourceProvider());
        this.d = gcVar;
        gcVar.c(R.raw.stars_topup, new String[0]);
        fc fcVar = new fc(t10, o2Var.getResourceProvider());
        this.f12573f = fcVar;
        fcVar.f28371b = 3000L;
        fcVar.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, o2Var.getResourceProvider()));
        kc kcVar = new kc(t10, o2Var.getResourceProvider(), true, false);
        this.f12572e = kcVar;
        kcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        kcVar.f30007a = new Runnable(this) {
            public final o7 f12516b;

            {
                this.f12516b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f12516b.a();
                        return;
                    default:
                        o7 o7Var = this.f12516b;
                        if (!o7Var.f12580n && !o7Var.f12581o && o7Var.f12579m) {
                            o7Var.f12580n = true;
                            m6 m6Var = o7Var.f12575i;
                            if (m6Var != null) {
                                m6Var.run(o7Var.f12577k);
                            }
                            if (o7Var.f12572e != null) {
                                o7Var.f12571c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        kcVar.addView(fcVar, i7.f6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        kcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        gcVar.setButton(kcVar);
        mc b10 = tc.a0(o2Var).b(gcVar, -1);
        this.f12571c = b10;
        b10.f30660r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final o7 f12516b;

            {
                this.f12516b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f12516b.a();
                        return;
                    default:
                        o7 o7Var = this.f12516b;
                        if (!o7Var.f12580n && !o7Var.f12581o && o7Var.f12579m) {
                            o7Var.f12580n = true;
                            m6 m6Var = o7Var.f12575i;
                            if (m6Var != null) {
                                m6Var.run(o7Var.f12577k);
                            }
                            if (o7Var.f12572e != null) {
                                o7Var.f12571c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        AndroidUtilities.cancelRunOnUIThread(r22);
        AndroidUtilities.runOnUIThread(r22, 3000L);
    }

    public final void a() {
        if (!this.f12580n && !this.f12581o) {
            this.f12581o = true;
            ArrayList arrayList = this.f12576j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f12572e != null) {
                this.f12571c.b();
            }
        }
    }
}
