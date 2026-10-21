package ai;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ca {
    public final org.telegram.ui.ActionBar.n2 f1091a;
    public final long f1092b;
    public final org.telegram.ui.Components.qc f1093c;
    public final org.telegram.ui.Components.kc d;
    public final org.telegram.ui.Components.oc e;
    public final org.telegram.ui.Components.jc f1094f;
    public int f1095g;
    public long h;
    public y8 f1096i;
    public final ArrayList f1097j = new ArrayList();
    public final HashSet f1098k = new HashSet();
    public final long f1099l = System.currentTimeMillis();
    public boolean f1100m = true;
    public boolean f1101n;
    public boolean f1102o;
    public final ba f1103p;

    public ca(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final ca f1050b;

            {
                this.f1050b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1050b.a();
                        return;
                    default:
                        ca caVar = this.f1050b;
                        if (!caVar.f1101n && !caVar.f1102o && caVar.f1100m) {
                            caVar.f1101n = true;
                            y8 y8Var = caVar.f1096i;
                            if (y8Var != null) {
                                y8Var.run(caVar.f1098k);
                            }
                            if (caVar.e != null) {
                                caVar.f1093c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f1103p = r22;
        this.f1091a = n2Var;
        this.f1092b = j10;
        Context t10 = ga.t(n2Var);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, n2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(t10, n2Var.getResourceProvider());
        this.f1094f = jcVar;
        jcVar.f27492b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, n2Var.getResourceProvider()));
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f28983a = new Runnable(this) {
            public final ca f1050b;

            {
                this.f1050b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1050b.a();
                        return;
                    default:
                        ca caVar = this.f1050b;
                        if (!caVar.f1101n && !caVar.f1102o && caVar.f1100m) {
                            caVar.f1101n = true;
                            y8 y8Var = caVar.f1096i;
                            if (y8Var != null) {
                                y8Var.run(caVar.f1098k);
                            }
                            if (caVar.e != null) {
                                caVar.f1093c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ocVar.addView(jcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(n2Var).b(kcVar, -1);
        this.f1093c = b10;
        b10.f29539r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final ca f1050b;

            {
                this.f1050b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1050b.a();
                        return;
                    default:
                        ca caVar = this.f1050b;
                        if (!caVar.f1101n && !caVar.f1102o && caVar.f1100m) {
                            caVar.f1101n = true;
                            y8 y8Var = caVar.f1096i;
                            if (y8Var != null) {
                                y8Var.run(caVar.f1098k);
                            }
                            if (caVar.e != null) {
                                caVar.f1093c.b();
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
        if (!this.f1101n && !this.f1102o) {
            this.f1102o = true;
            ArrayList arrayList = this.f1097j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f1093c.b();
            }
        }
    }
}
