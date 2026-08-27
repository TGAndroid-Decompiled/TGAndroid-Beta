package hh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yb;

public final class q7 {

    public final org.telegram.ui.ActionBar.n2 f9921a;

    public final long f9922b;

    public final ec f9923c;
    public final yb d;

    public final cc f9924e;

    public final xb f9925f;

    public int f9926g;
    public long h;

    public o6 f9927i;

    public final ArrayList f9928j = new ArrayList();

    public final HashSet f9929k = new HashSet();

    public final long f9930l = System.currentTimeMillis();

    public boolean f9931m = true;

    public boolean f9932n;

    public boolean f9933o;

    public final p7 f9934p;

    public q7(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        final int i10 = 0;
        ?? r10 = new Runnable(this) {

            public final q7 f9879b;

            {
                this.f9879b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f9879b.a();
                        break;
                    default:
                        q7 q7Var = this.f9879b;
                        if (!q7Var.f9932n && !q7Var.f9933o && q7Var.f9931m) {
                            q7Var.f9932n = true;
                            o6 o6Var = q7Var.f9927i;
                            if (o6Var != null) {
                                o6Var.run(q7Var.f9929k);
                            }
                            if (q7Var.f9924e != null) {
                                q7Var.f9923c.b();
                            }
                            break;
                        }
                        break;
                }
            }
        };
        this.f9934p = r10;
        this.f9921a = n2Var;
        this.f9922b = j10;
        Context contextT = u7.t(n2Var);
        yb ybVar = new yb(contextT, n2Var.getResourceProvider());
        this.d = ybVar;
        ybVar.c(R.raw.stars_topup, new String[0]);
        xb xbVar = new xb(contextT, n2Var.getResourceProvider());
        this.f9925f = xbVar;
        xbVar.f34571b = 3000L;
        xbVar.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, n2Var.getResourceProvider()));
        cc ccVar = new cc(contextT, n2Var.getResourceProvider(), true, false);
        this.f9924e = ccVar;
        ccVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        ccVar.f27402a = new Runnable(this) {

            public final q7 f9879b;

            {
                this.f9879b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f9879b.a();
                        break;
                    default:
                        q7 q7Var = this.f9879b;
                        if (!q7Var.f9932n && !q7Var.f9933o && q7Var.f9931m) {
                            q7Var.f9932n = true;
                            o6 o6Var = q7Var.f9927i;
                            if (o6Var != null) {
                                o6Var.run(q7Var.f9929k);
                            }
                            if (q7Var.f9924e != null) {
                                q7Var.f9923c.b();
                            }
                            break;
                        }
                        break;
                }
            }
        };
        ccVar.addView(xbVar, h7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ccVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ybVar.setButton(ccVar);
        ec ecVarB = mc.a0(n2Var).b(ybVar, -1);
        this.f9923c = ecVarB;
        ecVarB.f28028r = false;
        ecVarB.k(true);
        final int i12 = 0;
        ecVarB.v = new Runnable(this) {

            public final q7 f9879b;

            {
                this.f9879b = this;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f9879b.a();
                        break;
                    default:
                        q7 q7Var = this.f9879b;
                        if (!q7Var.f9932n && !q7Var.f9933o && q7Var.f9931m) {
                            q7Var.f9932n = true;
                            o6 o6Var = q7Var.f9927i;
                            if (o6Var != null) {
                                o6Var.run(q7Var.f9929k);
                            }
                            if (q7Var.f9924e != null) {
                                q7Var.f9923c.b();
                            }
                            break;
                        }
                        break;
                }
            }
        };
        AndroidUtilities.cancelRunOnUIThread(r10);
        AndroidUtilities.runOnUIThread(r10, 3000L);
    }

    public final void a() {
        if (this.f9932n || this.f9933o) {
            return;
        }
        this.f9933o = true;
        ArrayList arrayList = this.f9928j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        if (this.f9924e != null) {
            this.f9923c.b();
        }
    }
}
