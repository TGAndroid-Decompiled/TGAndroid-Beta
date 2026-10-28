package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kb1;
public final class x9 {
    public final org.telegram.ui.ActionBar.r2 f5692a;
    public final long f5693b;
    public final org.telegram.ui.Components.qc f5694c;
    public final org.telegram.ui.Components.kc d;
    public final org.telegram.ui.Components.oc e;
    public final ba f5695f;
    public int f5696g;
    public long h;
    public t8 f5697i;
    public final ArrayList f5698j = new ArrayList();
    public final HashSet f5699k = new HashSet();
    public final long f5700l = System.currentTimeMillis();
    public boolean f5701m = true;
    public boolean f5702n;
    public boolean f5703o;
    public final w9 f5704p;

    public x9(org.telegram.ui.ActionBar.r2 r2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final x9 f5619b;

            {
                this.f5619b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5619b.a();
                        return;
                    default:
                        x9 x9Var = this.f5619b;
                        if (!x9Var.f5702n && !x9Var.f5703o && x9Var.f5701m) {
                            x9Var.f5702n = true;
                            t8 t8Var = x9Var.f5697i;
                            if (t8Var != null) {
                                t8Var.run(x9Var.f5699k);
                            }
                            if (x9Var.e != null) {
                                x9Var.f5694c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f5704p = r22;
        this.f5692a = r2Var;
        this.f5693b = j10;
        Context t10 = ca.t(r2Var);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, r2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        ?? jcVar = new org.telegram.ui.Components.jc(t10, r2Var.getResourceProvider());
        this.f5695f = jcVar;
        jcVar.f29634b = 3000L;
        int i10 = org.telegram.ui.ActionBar.y6.Gi;
        org.telegram.ui.ActionBar.u6 resourceProvider = r2Var.getResourceProvider();
        ag.w wVar = new ag.w(27);
        ag.w wVar2 = new ag.w(28);
        int Q = org.telegram.ui.ActionBar.f7.Q(i10, -1, 0, 0.0f, resourceProvider);
        wVar2.d(Q, jcVar);
        org.telegram.ui.ActionBar.z6 x9 = org.telegram.ui.ActionBar.f7.x(101, jcVar);
        x9.c(i10, -1, 0, 0.0f, resourceProvider);
        x9.f23810n = wVar;
        x9.f23811o = wVar2;
        x9.f23809m = false;
        x9.f23804g = Q;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, r2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f31259b = new Runnable(this) {
            public final x9 f5619b;

            {
                this.f5619b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5619b.a();
                        return;
                    default:
                        x9 x9Var = this.f5619b;
                        if (!x9Var.f5702n && !x9Var.f5703o && x9Var.f5701m) {
                            x9Var.f5702n = true;
                            t8 t8Var = x9Var.f5697i;
                            if (t8Var != null) {
                                t8Var.run(x9Var.f5699k);
                            }
                            if (x9Var.e != null) {
                                x9Var.f5694c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ocVar.addView((View) jcVar, kb1.h(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.e.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.wc.b0(r2Var).b(kcVar, -1);
        this.f5694c = b10;
        b10.f31870s = false;
        b10.k(true);
        b10.f31873w = new Runnable(this) {
            public final x9 f5619b;

            {
                this.f5619b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5619b.a();
                        return;
                    default:
                        x9 x9Var = this.f5619b;
                        if (!x9Var.f5702n && !x9Var.f5703o && x9Var.f5701m) {
                            x9Var.f5702n = true;
                            t8 t8Var = x9Var.f5697i;
                            if (t8Var != null) {
                                t8Var.run(x9Var.f5699k);
                            }
                            if (x9Var.e != null) {
                                x9Var.f5694c.b();
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
        if (!this.f5702n && !this.f5703o) {
            this.f5703o = true;
            ArrayList arrayList = this.f5698j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f5694c.b();
            }
        }
    }
}
