package lh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
public final class p7 {
    public final org.telegram.ui.ActionBar.p2 f12924a;
    public final long f12925b;
    public final ic f12926c;
    public final cc d;
    public final gc e;
    public final bc f12927f;
    public int f12928g;
    public long h;
    public m6 f12929i;
    public final ArrayList f12930j = new ArrayList();
    public final HashSet f12931k = new HashSet();
    public final long f12932l = System.currentTimeMillis();
    public boolean f12933m = true;
    public boolean f12934n;
    public boolean f12935o;
    public final o7 f12936p;

    public p7(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final p7 f12890b;

            {
                this.f12890b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f12890b.a();
                        return;
                    default:
                        p7 p7Var = this.f12890b;
                        if (!p7Var.f12934n && !p7Var.f12935o && p7Var.f12933m) {
                            p7Var.f12934n = true;
                            m6 m6Var = p7Var.f12929i;
                            if (m6Var != null) {
                                m6Var.run(p7Var.f12931k);
                            }
                            if (p7Var.e != null) {
                                p7Var.f12926c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f12936p = r22;
        this.f12924a = p2Var;
        this.f12925b = j10;
        Context t6 = t7.t(p2Var);
        cc ccVar = new cc(t6, p2Var.getResourceProvider());
        this.d = ccVar;
        ccVar.c(R.raw.stars_topup, new String[0]);
        bc bcVar = new bc(t6, p2Var.getResourceProvider());
        this.f12927f = bcVar;
        bcVar.f23628b = 3000L;
        bcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, p2Var.getResourceProvider()));
        gc gcVar = new gc(t6, p2Var.getResourceProvider(), true, false);
        this.e = gcVar;
        gcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        gcVar.f25097a = new Runnable(this) {
            public final p7 f12890b;

            {
                this.f12890b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f12890b.a();
                        return;
                    default:
                        p7 p7Var = this.f12890b;
                        if (!p7Var.f12934n && !p7Var.f12935o && p7Var.f12933m) {
                            p7Var.f12934n = true;
                            m6 m6Var = p7Var.f12929i;
                            if (m6Var != null) {
                                m6Var.run(p7Var.f12931k);
                            }
                            if (p7Var.e != null) {
                                p7Var.f12926c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        gcVar.addView(bcVar, k7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        gcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ccVar.setButton(gcVar);
        ic b10 = qc.a0(p2Var).b(ccVar, -1);
        this.f12926c = b10;
        b10.f25680r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final p7 f12890b;

            {
                this.f12890b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f12890b.a();
                        return;
                    default:
                        p7 p7Var = this.f12890b;
                        if (!p7Var.f12934n && !p7Var.f12935o && p7Var.f12933m) {
                            p7Var.f12934n = true;
                            m6 m6Var = p7Var.f12929i;
                            if (m6Var != null) {
                                m6Var.run(p7Var.f12931k);
                            }
                            if (p7Var.e != null) {
                                p7Var.f12926c.b();
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
        if (!this.f12934n && !this.f12935o) {
            this.f12935o = true;
            ArrayList arrayList = this.f12930j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f12926c.b();
            }
        }
    }
}
