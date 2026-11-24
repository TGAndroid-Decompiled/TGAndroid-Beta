package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.util.concurrent.CopyOnWriteArraySet;
public abstract class en4 extends wp2 {
    public boolean M;
    public boolean N;
    public final pj4 K = new pj4(new dn4(this), (byte) 1);
    public final g16 L = new g16(this);
    public boolean O = true;

    public en4() {
        ((oo) this.e.d).f("android:support:lifecycle", new op2(this, (byte) 1));
        o(new vs2(this) {
            public final en4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                en4 en4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        en4Var.K.T();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        en4Var.K.T();
                        return;
                }
            }
        });
        this.F.add(new vs2(this) {
            public final en4 b;

            {
                this.b = this;
            }

            @Override
            public final void accept(Object obj) {
                byte b = r2;
                en4 en4Var = this.b;
                switch (b) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        en4Var.K.T();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        en4Var.K.T();
                        return;
                }
            }
        });
        pp2 pp2Var = new pp2(this, (byte) 1);
        yv2 yv2Var = this.b;
        yv2Var.getClass();
        if (((wp2) yv2Var.c) != null) {
            pp2Var.a();
        }
        ((CopyOnWriteArraySet) yv2Var.b).add(pp2Var);
    }

    public static boolean v(go4 go4Var) {
        en4 en4Var;
        boolean z = false;
        for (bn4 bn4Var : go4Var.c.s()) {
            if (bn4Var != null) {
                dn4 dn4Var = bn4Var.L;
                if (dn4Var == null) {
                    en4Var = null;
                } else {
                    en4Var = dn4Var.e;
                }
                if (en4Var != null) {
                    z |= v(bn4Var.l());
                }
                if (bn4Var.e0.b.compareTo(v06.d) >= 0) {
                    g16 g16Var = bn4Var.e0;
                    g16Var.d("setCurrentState");
                    g16Var.f(v06.c);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override
    public final void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en4.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        this.K.T();
        super.onActivityResult(i, i2, intent);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L.e(u06.ON_CREATE);
        ho4 ho4Var = ((dn4) this.K.b).d;
        ho4Var.H = false;
        ho4Var.I = false;
        ho4Var.O.g = false;
        ho4Var.u(1);
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        fn4 fn4Var = (fn4) ((dn4) this.K.b).d.f.onCreateView(null, str, context, attributeSet);
        if (fn4Var == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return fn4Var;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ((dn4) this.K.b).d.l();
        this.L.e(u06.ON_DESTROY);
    }

    @Override
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((dn4) this.K.b).d.j();
        }
        return false;
    }

    @Override
    public void onPause() {
        super.onPause();
        this.N = false;
        ((dn4) this.K.b).d.u(5);
        this.L.e(u06.ON_PAUSE);
    }

    @Override
    public final void onPostResume() {
        super.onPostResume();
        this.L.e(u06.ON_RESUME);
        ho4 ho4Var = ((dn4) this.K.b).d;
        ho4Var.H = false;
        ho4Var.I = false;
        ho4Var.O.g = false;
        ho4Var.u(7);
    }

    @Override
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.K.T();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override
    public void onResume() {
        pj4 pj4Var = this.K;
        pj4Var.T();
        super.onResume();
        this.N = true;
        ((dn4) pj4Var.b).d.A(true);
    }

    @Override
    public void onStart() {
        pj4 pj4Var = this.K;
        pj4Var.T();
        dn4 dn4Var = (dn4) pj4Var.b;
        super.onStart();
        this.O = false;
        if (!this.M) {
            this.M = true;
            ho4 ho4Var = dn4Var.d;
            ho4Var.H = false;
            ho4Var.I = false;
            ho4Var.O.g = false;
            ho4Var.u(4);
        }
        dn4Var.d.A(true);
        this.L.e(u06.ON_START);
        ho4 ho4Var2 = dn4Var.d;
        ho4Var2.H = false;
        ho4Var2.I = false;
        ho4Var2.O.g = false;
        ho4Var2.u(5);
    }

    @Override
    public final void onStateNotSaved() {
        this.K.T();
    }

    @Override
    public void onStop() {
        super.onStop();
        this.O = true;
        do {
        } while (v(u()));
        ho4 ho4Var = ((dn4) this.K.b).d;
        ho4Var.I = true;
        ho4Var.O.g = true;
        ho4Var.u(4);
        this.L.e(u06.ON_STOP);
    }

    public final ho4 u() {
        return ((dn4) this.K.b).d;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        fn4 fn4Var = (fn4) ((dn4) this.K.b).d.f.onCreateView(view, str, context, attributeSet);
        return fn4Var == null ? super.onCreateView(view, str, context, attributeSet) : fn4Var;
    }
}
