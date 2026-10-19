package ai;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ca {
    public final org.telegram.ui.ActionBar.n2 f1088a;
    public final long f1089b;
    public final org.telegram.ui.Components.qc f1090c;
    public final org.telegram.ui.Components.kc d;
    public final org.telegram.ui.Components.oc e;
    public final org.telegram.ui.Components.jc f1091f;
    public int f1092g;
    public long h;
    public x8 f1093i;
    public final ArrayList f1094j = new ArrayList();
    public final HashSet f1095k = new HashSet();
    public final long f1096l = System.currentTimeMillis();
    public boolean f1097m = true;
    public boolean f1098n;
    public boolean f1099o;
    public final ba f1100p;

    public ca(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final ca f1040b;

            {
                this.f1040b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1040b.a();
                        return;
                    default:
                        ca caVar = this.f1040b;
                        if (!caVar.f1098n && !caVar.f1099o && caVar.f1097m) {
                            caVar.f1098n = true;
                            x8 x8Var = caVar.f1093i;
                            if (x8Var != null) {
                                x8Var.run(caVar.f1095k);
                            }
                            if (caVar.e != null) {
                                caVar.f1090c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f1100p = r22;
        this.f1088a = n2Var;
        this.f1089b = j10;
        Context t10 = ga.t(n2Var);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, n2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(t10, n2Var.getResourceProvider());
        this.f1091f = jcVar;
        jcVar.f27498b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, n2Var.getResourceProvider()));
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f28946a = new Runnable(this) {
            public final ca f1040b;

            {
                this.f1040b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1040b.a();
                        return;
                    default:
                        ca caVar = this.f1040b;
                        if (!caVar.f1098n && !caVar.f1099o && caVar.f1097m) {
                            caVar.f1098n = true;
                            x8 x8Var = caVar.f1093i;
                            if (x8Var != null) {
                                x8Var.run(caVar.f1095k);
                            }
                            if (caVar.e != null) {
                                caVar.f1090c.b();
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
        this.f1090c = b10;
        b10.f29604r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final ca f1040b;

            {
                this.f1040b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1040b.a();
                        return;
                    default:
                        ca caVar = this.f1040b;
                        if (!caVar.f1098n && !caVar.f1099o && caVar.f1097m) {
                            caVar.f1098n = true;
                            x8 x8Var = caVar.f1093i;
                            if (x8Var != null) {
                                x8Var.run(caVar.f1095k);
                            }
                            if (caVar.e != null) {
                                caVar.f1090c.b();
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
        if (!this.f1098n && !this.f1099o) {
            this.f1099o = true;
            ArrayList arrayList = this.f1094j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f1090c.b();
            }
        }
    }
}
