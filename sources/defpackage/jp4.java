package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.util.concurrent.CopyOnWriteArraySet;
public abstract class jp4 extends pq2 {
    public boolean M;
    public boolean N;
    public final v34 K = new v34(new ip4(this), (byte) 3);
    public final k36 L = new k36(this);
    public boolean O = true;

    public jp4() {
        ((po) this.e.d).f("android:support:lifecycle", new hq2(this, (byte) 1));
        o(new pt2(this) {
            public final jp4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                jp4 jp4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        jp4Var.K.M();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        jp4Var.K.M();
                        return;
                }
            }
        });
        this.F.add(new pt2(this) {
            public final jp4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                jp4 jp4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        jp4Var.K.M();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        jp4Var.K.M();
                        return;
                }
            }
        });
        iq2 iq2Var = new iq2(this, (byte) 1);
        sw2 sw2Var = this.b;
        sw2Var.getClass();
        if (((pq2) sw2Var.c) != null) {
            iq2Var.a();
        }
        ((CopyOnWriteArraySet) sw2Var.b).add(iq2Var);
    }

    public static boolean v(kq4 kq4Var) {
        jp4 jp4Var;
        boolean z = false;
        for (gp4 gp4Var : kq4Var.c.u()) {
            if (gp4Var != null) {
                ip4 ip4Var = gp4Var.L;
                if (ip4Var == null) {
                    jp4Var = null;
                } else {
                    jp4Var = ip4Var.e;
                }
                if (jp4Var != null) {
                    z |= v(gp4Var.l());
                }
                if (gp4Var.e0.b.compareTo(z26.d) >= 0) {
                    k36 k36Var = gp4Var.e0;
                    k36Var.d("setCurrentState");
                    k36Var.f(z26.c);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override
    public final void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp4.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        this.K.M();
        super.onActivityResult(i, i2, intent);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L.e(y26.ON_CREATE);
        lq4 lq4Var = ((ip4) this.K.b).d;
        lq4Var.H = false;
        lq4Var.I = false;
        lq4Var.O.g = false;
        lq4Var.u(1);
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        kp4 kp4Var = (kp4) ((ip4) this.K.b).d.f.onCreateView(null, str, context, attributeSet);
        if (kp4Var == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return kp4Var;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ((ip4) this.K.b).d.l();
        this.L.e(y26.ON_DESTROY);
    }

    @Override
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((ip4) this.K.b).d.j();
        }
        return false;
    }

    @Override
    public void onPause() {
        super.onPause();
        this.N = false;
        ((ip4) this.K.b).d.u(5);
        this.L.e(y26.ON_PAUSE);
    }

    @Override
    public final void onPostResume() {
        super.onPostResume();
        this.L.e(y26.ON_RESUME);
        lq4 lq4Var = ((ip4) this.K.b).d;
        lq4Var.H = false;
        lq4Var.I = false;
        lq4Var.O.g = false;
        lq4Var.u(7);
    }

    @Override
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.K.M();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override
    public void onResume() {
        v34 v34Var = this.K;
        v34Var.M();
        super.onResume();
        this.N = true;
        ((ip4) v34Var.b).d.A(true);
    }

    @Override
    public void onStart() {
        v34 v34Var = this.K;
        v34Var.M();
        ip4 ip4Var = (ip4) v34Var.b;
        super.onStart();
        this.O = false;
        if (!this.M) {
            this.M = true;
            lq4 lq4Var = ip4Var.d;
            lq4Var.H = false;
            lq4Var.I = false;
            lq4Var.O.g = false;
            lq4Var.u(4);
        }
        ip4Var.d.A(true);
        this.L.e(y26.ON_START);
        lq4 lq4Var2 = ip4Var.d;
        lq4Var2.H = false;
        lq4Var2.I = false;
        lq4Var2.O.g = false;
        lq4Var2.u(5);
    }

    @Override
    public final void onStateNotSaved() {
        this.K.M();
    }

    @Override
    public void onStop() {
        super.onStop();
        this.O = true;
        do {
        } while (v(u()));
        lq4 lq4Var = ((ip4) this.K.b).d;
        lq4Var.I = true;
        lq4Var.O.g = true;
        lq4Var.u(4);
        this.L.e(y26.ON_STOP);
    }

    public final lq4 u() {
        return ((ip4) this.K.b).d;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        kp4 kp4Var = (kp4) ((ip4) this.K.b).d.f.onCreateView(view, str, context, attributeSet);
        return kp4Var == null ? super.onCreateView(view, str, context, attributeSet) : kp4Var;
    }
}
