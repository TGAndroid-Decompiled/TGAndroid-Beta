package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ca {
    public final org.telegram.ui.ActionBar.o2 f1093a;
    public final long f1094b;
    public final org.telegram.ui.Components.qc f1095c;
    public final org.telegram.ui.Components.kc d;
    public final org.telegram.ui.Components.oc e;
    public final ga f1096f;
    public int f1097g;
    public long h;
    public y8 f1098i;
    public final ArrayList f1099j = new ArrayList();
    public final HashSet f1100k = new HashSet();
    public final long f1101l = System.currentTimeMillis();
    public boolean f1102m = true;
    public boolean f1103n;
    public boolean f1104o;
    public final ba f1105p;

    public ca(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final ca f1046b;

            {
                this.f1046b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1046b.a();
                        return;
                    default:
                        ca caVar = this.f1046b;
                        if (!caVar.f1103n && !caVar.f1104o && caVar.f1102m) {
                            caVar.f1103n = true;
                            y8 y8Var = caVar.f1098i;
                            if (y8Var != null) {
                                y8Var.run(caVar.f1100k);
                            }
                            if (caVar.e != null) {
                                caVar.f1095c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f1105p = r22;
        this.f1093a = o2Var;
        this.f1094b = j10;
        Context t10 = ha.t(o2Var);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, o2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        ?? jcVar = new org.telegram.ui.Components.jc(t10, o2Var.getResourceProvider());
        this.f1096f = jcVar;
        jcVar.f27663b = 3000L;
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.g6 resourceProvider = o2Var.getResourceProvider();
        aa.a aVar = new aa.a(15);
        aa.a aVar2 = new aa.a(16);
        int R = org.telegram.ui.ActionBar.r6.R(i10, -1, 0, 0.0f, resourceProvider);
        aVar2.d(R, jcVar);
        org.telegram.ui.ActionBar.l6 y3 = org.telegram.ui.ActionBar.r6.y(101, jcVar);
        y3.c(i10, -1, 0, 0.0f, resourceProvider);
        y3.f21619n = aVar;
        y3.f21620o = aVar2;
        y3.f21618m = false;
        y3.f21613g = R;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, o2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f29152b = new Runnable(this) {
            public final ca f1046b;

            {
                this.f1046b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1046b.a();
                        return;
                    default:
                        ca caVar = this.f1046b;
                        if (!caVar.f1103n && !caVar.f1104o && caVar.f1102m) {
                            caVar.f1103n = true;
                            y8 y8Var = caVar.f1098i;
                            if (y8Var != null) {
                                y8Var.run(caVar.f1100k);
                            }
                            if (caVar.e != null) {
                                caVar.f1095c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ocVar.addView((View) jcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.e.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(o2Var).b(kcVar, -1);
        this.f1095c = b10;
        b10.f29840r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final ca f1046b;

            {
                this.f1046b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f1046b.a();
                        return;
                    default:
                        ca caVar = this.f1046b;
                        if (!caVar.f1103n && !caVar.f1104o && caVar.f1102m) {
                            caVar.f1103n = true;
                            y8 y8Var = caVar.f1098i;
                            if (y8Var != null) {
                                y8Var.run(caVar.f1100k);
                            }
                            if (caVar.e != null) {
                                caVar.f1095c.b();
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
        if (!this.f1103n && !this.f1104o) {
            this.f1104o = true;
            ArrayList arrayList = this.f1099j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f1095c.b();
            }
        }
    }
}
