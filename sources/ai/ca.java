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
    public final org.telegram.ui.Components.oc f1095c;
    public final org.telegram.ui.Components.ic d;
    public final org.telegram.ui.Components.mc e;
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
        org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(t10, o2Var.getResourceProvider());
        this.d = icVar;
        icVar.c(R.raw.stars_topup, new String[0]);
        ?? hcVar = new org.telegram.ui.Components.hc(t10, o2Var.getResourceProvider());
        this.f1096f = hcVar;
        hcVar.f27003b = 3000L;
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.g6 resourceProvider = o2Var.getResourceProvider();
        aa.a aVar = new aa.a(15);
        aa.a aVar2 = new aa.a(16);
        int R = org.telegram.ui.ActionBar.r6.R(i10, -1, 0, 0.0f, resourceProvider);
        aVar2.d(R, hcVar);
        org.telegram.ui.ActionBar.l6 y3 = org.telegram.ui.ActionBar.r6.y(101, hcVar);
        y3.c(i10, -1, 0, 0.0f, resourceProvider);
        y3.f21620n = aVar;
        y3.f21621o = aVar2;
        y3.f21619m = false;
        y3.f21614g = R;
        org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(t10, o2Var.getResourceProvider(), true, false);
        this.e = mcVar;
        mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        mcVar.f28574b = new Runnable(this) {
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
        mcVar.addView((View) hcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        mcVar.e.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        icVar.setButton(mcVar);
        org.telegram.ui.Components.oc b10 = org.telegram.ui.Components.vc.a0(o2Var).b(icVar, -1);
        this.f1095c = b10;
        b10.f29211r = false;
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
