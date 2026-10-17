package ai;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ba {
    public final org.telegram.ui.ActionBar.n2 f1035a;
    public final long f1036b;
    public final org.telegram.ui.Components.qc f1037c;
    public final org.telegram.ui.Components.kc d;
    public final org.telegram.ui.Components.oc e;
    public final org.telegram.ui.Components.jc f1038f;
    public int f1039g;
    public long h;
    public x8 f1040i;
    public final ArrayList f1041j = new ArrayList();
    public final HashSet f1042k = new HashSet();
    public final long f1043l = System.currentTimeMillis();
    public boolean f1044m = true;
    public boolean f1045n;
    public boolean f1046o;
    public final aa f1047p;

    public ba(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final ba f974b;

            {
                this.f974b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f974b.a();
                        return;
                    default:
                        ba baVar = this.f974b;
                        if (!baVar.f1045n && !baVar.f1046o && baVar.f1044m) {
                            baVar.f1045n = true;
                            x8 x8Var = baVar.f1040i;
                            if (x8Var != null) {
                                x8Var.run(baVar.f1042k);
                            }
                            if (baVar.e != null) {
                                baVar.f1037c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f1047p = r22;
        this.f1035a = n2Var;
        this.f1036b = j10;
        Context t10 = fa.t(n2Var);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, n2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(t10, n2Var.getResourceProvider());
        this.f1038f = jcVar;
        jcVar.f27495b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, n2Var.getResourceProvider()));
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.f28918a = new Runnable(this) {
            public final ba f974b;

            {
                this.f974b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f974b.a();
                        return;
                    default:
                        ba baVar = this.f974b;
                        if (!baVar.f1045n && !baVar.f1046o && baVar.f1044m) {
                            baVar.f1045n = true;
                            x8 x8Var = baVar.f1040i;
                            if (x8Var != null) {
                                x8Var.run(baVar.f1042k);
                            }
                            if (baVar.e != null) {
                                baVar.f1037c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ocVar.addView(jcVar, w7.z5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(n2Var).b(kcVar, -1);
        this.f1037c = b10;
        b10.f29647r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final ba f974b;

            {
                this.f974b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f974b.a();
                        return;
                    default:
                        ba baVar = this.f974b;
                        if (!baVar.f1045n && !baVar.f1046o && baVar.f1044m) {
                            baVar.f1045n = true;
                            x8 x8Var = baVar.f1040i;
                            if (x8Var != null) {
                                x8Var.run(baVar.f1042k);
                            }
                            if (baVar.e != null) {
                                baVar.f1037c.b();
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
        if (!this.f1045n && !this.f1046o) {
            this.f1046o = true;
            ArrayList arrayList = this.f1041j;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            if (this.e != null) {
                this.f1037c.b();
            }
        }
    }
}
