package mh;

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
    public final org.telegram.ui.ActionBar.p2 f14590a;
    public final long f14591b;
    public final ic f14592c;
    public final cc d;
    public final gc f14593e;
    public final bc f14594f;
    public int f14595g;
    public long h;
    public m6 f14596i;
    public final ArrayList f14597j = new ArrayList();
    public final HashSet f14598k = new HashSet();
    public final long f14599l = System.currentTimeMillis();
    public boolean f14600m = true;
    public boolean f14601n;
    public boolean f14602o;
    public final o7 f14603p;

    public p7(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final p7 f14540b;

            {
                this.f14540b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14540b.a();
                        return;
                    default:
                        p7 p7Var = this.f14540b;
                        if (!p7Var.f14601n && !p7Var.f14602o && p7Var.f14600m) {
                            p7Var.f14601n = true;
                            m6 m6Var = p7Var.f14596i;
                            if (m6Var != null) {
                                m6Var.run(p7Var.f14598k);
                            }
                            if (p7Var.f14593e != null) {
                                p7Var.f14592c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f14603p = r22;
        this.f14590a = p2Var;
        this.f14591b = j10;
        Context t6 = t7.t(p2Var);
        cc ccVar = new cc(t6, p2Var.getResourceProvider());
        this.d = ccVar;
        ccVar.c(R.raw.stars_topup, new String[0]);
        bc bcVar = new bc(t6, p2Var.getResourceProvider());
        this.f14594f = bcVar;
        bcVar.f25559b = 3000L;
        bcVar.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, p2Var.getResourceProvider()));
        gc gcVar = new gc(t6, p2Var.getResourceProvider(), true, false);
        this.f14593e = gcVar;
        gcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        gcVar.f27161a = new Runnable(this) {
            public final p7 f14540b;

            {
                this.f14540b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14540b.a();
                        return;
                    default:
                        p7 p7Var = this.f14540b;
                        if (!p7Var.f14601n && !p7Var.f14602o && p7Var.f14600m) {
                            p7Var.f14601n = true;
                            m6 m6Var = p7Var.f14596i;
                            if (m6Var != null) {
                                m6Var.run(p7Var.f14598k);
                            }
                            if (p7Var.f14593e != null) {
                                p7Var.f14592c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        gcVar.addView(bcVar, k7.c6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        gcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ccVar.setButton(gcVar);
        ic b10 = qc.a0(p2Var).b(ccVar, -1);
        this.f14592c = b10;
        b10.f27753r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final p7 f14540b;

            {
                this.f14540b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14540b.a();
                        return;
                    default:
                        p7 p7Var = this.f14540b;
                        if (!p7Var.f14601n && !p7Var.f14602o && p7Var.f14600m) {
                            p7Var.f14601n = true;
                            m6 m6Var = p7Var.f14596i;
                            if (m6Var != null) {
                                m6Var.run(p7Var.f14598k);
                            }
                            if (p7Var.f14593e != null) {
                                p7Var.f14592c.b();
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
        if (!this.f14601n && !this.f14602o) {
            this.f14602o = true;
            ArrayList arrayList = this.f14597j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.f14593e != null) {
                this.f14592c.b();
            }
        }
    }
}
