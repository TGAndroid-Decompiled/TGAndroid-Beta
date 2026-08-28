package gh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.zb;
public final class r7 {
    public final org.telegram.ui.ActionBar.o2 f8828a;
    public final long f8829b;
    public final gc f8830c;
    public final ac d;
    public final ec f8831e;
    public final zb f8832f;
    public int f8833g;
    public long h;
    public p6 f8834i;
    public final ArrayList f8835j = new ArrayList();
    public final HashSet f8836k = new HashSet();
    public final long f8837l = System.currentTimeMillis();
    public boolean f8838m = true;
    public boolean f8839n;
    public boolean f8840o;
    public final q7 f8841p;

    public r7(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        ?? r22 = new Runnable(this) {
            public final r7 f8756b;

            {
                this.f8756b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f8756b.a();
                        return;
                    default:
                        r7 r7Var = this.f8756b;
                        if (!r7Var.f8839n && !r7Var.f8840o && r7Var.f8838m) {
                            r7Var.f8839n = true;
                            p6 p6Var = r7Var.f8834i;
                            if (p6Var != null) {
                                p6Var.run(r7Var.f8836k);
                            }
                            if (r7Var.f8831e != null) {
                                r7Var.f8830c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f8841p = r22;
        this.f8828a = o2Var;
        this.f8829b = j10;
        Context t10 = v7.t(o2Var);
        ac acVar = new ac(t10, o2Var.getResourceProvider());
        this.d = acVar;
        acVar.c(R.raw.stars_topup, new String[0]);
        zb zbVar = new zb(t10, o2Var.getResourceProvider());
        this.f8832f = zbVar;
        zbVar.f35268b = 3000L;
        zbVar.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, o2Var.getResourceProvider()));
        ec ecVar = new ec(t10, o2Var.getResourceProvider(), true, false);
        this.f8831e = ecVar;
        ecVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ecVar.f27999a = new Runnable(this) {
            public final r7 f8756b;

            {
                this.f8756b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f8756b.a();
                        return;
                    default:
                        r7 r7Var = this.f8756b;
                        if (!r7Var.f8839n && !r7Var.f8840o && r7Var.f8838m) {
                            r7Var.f8839n = true;
                            p6 p6Var = r7Var.f8834i;
                            if (p6Var != null) {
                                p6Var.run(r7Var.f8836k);
                            }
                            if (r7Var.f8831e != null) {
                                r7Var.f8830c.b();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        ecVar.addView(zbVar, g7.e6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        acVar.setButton(ecVar);
        gc b10 = oc.a0(o2Var).b(acVar, -1);
        this.f8830c = b10;
        b10.f28745r = false;
        b10.k(true);
        b10.v = new Runnable(this) {
            public final r7 f8756b;

            {
                this.f8756b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f8756b.a();
                        return;
                    default:
                        r7 r7Var = this.f8756b;
                        if (!r7Var.f8839n && !r7Var.f8840o && r7Var.f8838m) {
                            r7Var.f8839n = true;
                            p6 p6Var = r7Var.f8834i;
                            if (p6Var != null) {
                                p6Var.run(r7Var.f8836k);
                            }
                            if (r7Var.f8831e != null) {
                                r7Var.f8830c.b();
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
        if (!this.f8839n && !this.f8840o) {
            this.f8840o = true;
            ArrayList arrayList = this.f8835j;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((Runnable) obj).run();
            }
            if (this.f8831e != null) {
                this.f8830c.b();
            }
        }
    }
}
