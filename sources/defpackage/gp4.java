package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.util.concurrent.CopyOnWriteArraySet;
public abstract class gp4 extends hr2 {
    public boolean M;
    public boolean N;
    public final k44 K = new k44(new fp4(this), (byte) 4);
    public final g36 L = new g36(this);
    public boolean O = true;

    public gp4() {
        ((op) this.e.d).f("android:support:lifecycle", new zq2(this, (byte) 1));
        o(new gu2(this) {
            public final gp4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                gp4 gp4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        gp4Var.K.C();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        gp4Var.K.C();
                        return;
                }
            }
        });
        this.F.add(new gu2(this) {
            public final gp4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                gp4 gp4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        gp4Var.K.C();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        gp4Var.K.C();
                        return;
                }
            }
        });
        ar2 ar2Var = new ar2(this, (byte) 1);
        ix2 ix2Var = this.b;
        ix2Var.getClass();
        if (((hr2) ix2Var.c) != null) {
            ar2Var.a();
        }
        ((CopyOnWriteArraySet) ix2Var.b).add(ar2Var);
    }

    public static boolean v(hq4 hq4Var) {
        gp4 gp4Var;
        boolean z = false;
        for (dp4 dp4Var : hq4Var.c.u()) {
            if (dp4Var != null) {
                fp4 fp4Var = dp4Var.L;
                if (fp4Var == null) {
                    gp4Var = null;
                } else {
                    gp4Var = fp4Var.e;
                }
                if (gp4Var != null) {
                    z |= v(dp4Var.l());
                }
                if (dp4Var.e0.b.compareTo(v26.d) >= 0) {
                    g36 g36Var = dp4Var.e0;
                    g36Var.d("setCurrentState");
                    g36Var.f(v26.c);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override
    public final void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp4.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        this.K.C();
        super.onActivityResult(i, i2, intent);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L.e(u26.ON_CREATE);
        iq4 iq4Var = ((fp4) this.K.b).d;
        iq4Var.H = false;
        iq4Var.I = false;
        iq4Var.O.g = false;
        iq4Var.u(1);
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        hp4 hp4Var = (hp4) ((fp4) this.K.b).d.f.onCreateView(null, str, context, attributeSet);
        if (hp4Var == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return hp4Var;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ((fp4) this.K.b).d.l();
        this.L.e(u26.ON_DESTROY);
    }

    @Override
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((fp4) this.K.b).d.j();
        }
        return false;
    }

    @Override
    public void onPause() {
        super.onPause();
        this.N = false;
        ((fp4) this.K.b).d.u(5);
        this.L.e(u26.ON_PAUSE);
    }

    @Override
    public final void onPostResume() {
        super.onPostResume();
        this.L.e(u26.ON_RESUME);
        iq4 iq4Var = ((fp4) this.K.b).d;
        iq4Var.H = false;
        iq4Var.I = false;
        iq4Var.O.g = false;
        iq4Var.u(7);
    }

    @Override
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.K.C();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override
    public void onResume() {
        k44 k44Var = this.K;
        k44Var.C();
        super.onResume();
        this.N = true;
        ((fp4) k44Var.b).d.A(true);
    }

    @Override
    public void onStart() {
        k44 k44Var = this.K;
        k44Var.C();
        fp4 fp4Var = (fp4) k44Var.b;
        super.onStart();
        this.O = false;
        if (!this.M) {
            this.M = true;
            iq4 iq4Var = fp4Var.d;
            iq4Var.H = false;
            iq4Var.I = false;
            iq4Var.O.g = false;
            iq4Var.u(4);
        }
        fp4Var.d.A(true);
        this.L.e(u26.ON_START);
        iq4 iq4Var2 = fp4Var.d;
        iq4Var2.H = false;
        iq4Var2.I = false;
        iq4Var2.O.g = false;
        iq4Var2.u(5);
    }

    @Override
    public final void onStateNotSaved() {
        this.K.C();
    }

    @Override
    public void onStop() {
        super.onStop();
        this.O = true;
        do {
        } while (v(u()));
        iq4 iq4Var = ((fp4) this.K.b).d;
        iq4Var.I = true;
        iq4Var.O.g = true;
        iq4Var.u(4);
        this.L.e(u26.ON_STOP);
    }

    public final iq4 u() {
        return ((fp4) this.K.b).d;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        hp4 hp4Var = (hp4) ((fp4) this.K.b).d.f.onCreateView(view, str, context, attributeSet);
        return hp4Var == null ? super.onCreateView(view, str, context, attributeSet) : hp4Var;
    }
}
