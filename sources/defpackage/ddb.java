package defpackage;

import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.app.RemoteAction;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.provider.Settings;
import android.util.Rational;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class ddb {
    public final mb3 a;
    public LaunchActivity b;
    public gdb c;
    public a06 d;
    public xa8 e;
    public xa8 f;
    public ya8 g;
    public View h;
    public boolean i;
    public boolean j;
    public uu6 k;
    public String n;
    public boolean o;
    public boolean q;
    public String r;
    public boolean u;
    public final RectF l = new RectF();
    public final int[] m = new int[2];
    public final Rect p = new Rect();
    public final StringBuilder s = new StringBuilder();
    public final ArrayList t = new ArrayList();
    public final zj v = new zj(this, (byte) 13);

    public ddb(mb3 mb3Var) {
        this.a = mb3Var;
    }

    public final void a(xa8 xa8Var) {
        PictureInPictureParams b = b(xa8Var);
        String str = this.r;
        if (str != null && str.equals(this.n)) {
            return;
        }
        this.n = this.r;
        gl.q3(this.b, b);
    }

    public final PictureInPictureParams b(xa8 xa8Var) {
        Rational rational;
        PictureInPictureParams.Builder c = fk.c();
        StringBuilder sb = this.s;
        boolean z = false;
        sb.setLength(0);
        int Q0 = xa8Var.a.Q0();
        sa8 sa8Var = xa8Var.a;
        int S1 = sa8Var.S1();
        if (Q0 > 0 && S1 > 0) {
            float f = Q0 / S1;
            if (f < 0.45f) {
                rational = new Rational(45, 100);
            } else if (f > 2.35f) {
                rational = new Rational(235, 100);
            } else {
                rational = new Rational(Q0, S1);
            }
            c.setAspectRatio(rational);
            sb.append(rational);
        }
        byte b = xa8Var.c;
        Rect rect = this.p;
        if (b != 2) {
            this.q = e(xa8Var, rect);
        }
        if (this.q) {
            c.setSourceRectHint(rect);
            sb.append('|');
            sb.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.t;
        arrayList2.clear();
        sa8Var.o2(this.b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i = 0; i < arrayList2.size(); i++) {
            ra8 ra8Var = (ra8) arrayList2.get(i);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.b.getPackageName());
            intent.putExtra("action_id", (int) ra8Var.a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.b, ra8Var.a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.b, ra8Var.b);
            String str = ra8Var.c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, str, str, broadcast);
            remoteAction.setEnabled(ra8Var.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.u) {
            this.u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i2 = Build.VERSION.SDK_INT;
            LaunchActivity launchActivity = this.b;
            zj zjVar = this.v;
            if (i2 >= 33) {
                launchActivity.registerReceiver(zjVar, intentFilter, 4);
            } else {
                launchActivity.registerReceiver(zjVar, intentFilter);
            }
        }
        c.setActions(arrayList);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            RemoteAction remoteAction2 = (RemoteAction) arrayList.get(i3);
            sb.append('|');
            sb.append(remoteAction2.getTitle());
            sb.append(remoteAction2.isEnabled());
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            if (i4 >= 31 && xa8Var.c != 2) {
                z = true;
            }
            c.setAutoEnterEnabled(z);
            sb.append('|');
            sb.append(z);
        }
        this.r = sb.toString();
        return c.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.u && (launchActivity = this.b) != null) {
            this.u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        gdb gdbVar = this.c;
        if (gdbVar != null) {
            gl.B2(gdbVar);
            this.c = null;
        }
        a06 a06Var = this.d;
        if (a06Var != null) {
            a06Var.a();
            this.d = null;
        }
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddb.d():void");
    }

    public final boolean e(xa8 xa8Var, Rect rect) {
        if (this.b != null) {
            if (xa8Var.f()) {
                sj4 sj4Var = xa8Var.e;
                RectF rectF = this.l;
                sj4Var.g(rectF);
                rectF.round(rect);
            } else {
                xa8Var.a.n0(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.b.getWindow().getDecorView();
                int[] iArr = this.m;
                decorView.getLocationOnScreen(iArr);
                rect.offset(-iArr[0], -iArr[1]);
                float width = rect.width() / rect.height();
                if (rect.intersect(0, 0, decorView.getWidth(), decorView.getHeight()) && Math.abs(((rect.width() / rect.height()) / width) - 1.0f) < 0.02f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(Object obj) {
        xa8 xa8Var;
        if (Build.VERSION.SDK_INT >= 35 && ug8.A(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f == null && (xa8Var = this.e) != null) {
            i(xa8Var);
        }
    }

    public final void g() {
        int i;
        if (this.b != null && (i = Build.VERSION.SDK_INT) >= 26 && i < 31 && this.f == null) {
            j();
            xa8 xa8Var = this.e;
            if (xa8Var != null) {
                PictureInPictureParams b = b(xa8Var);
                i(this.e);
                try {
                    if (!this.b.enterPictureInPictureMode(b)) {
                        d();
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    d();
                }
            }
        }
    }

    public final void h() {
        uu6 uu6Var = this.k;
        if (uu6Var != null) {
            try {
                synchronized (uu6.c) {
                    uu6.d.remove(uu6Var.a.i);
                }
                uu6Var.a.p();
            } catch (Exception unused) {
            }
            this.k = null;
        }
    }

    public final void i(xa8 xa8Var) {
        View view;
        boolean z;
        sj4 sj4Var;
        if (this.c != null && this.b != null) {
            StringBuilder sb = new StringBuilder("system: start enter, from state ");
            byte b = xa8Var.c;
            sa8 sa8Var = xa8Var.a;
            sb.append((int) b);
            mb3.e(sb.toString());
            Rect rect = new Rect();
            if (!e(xa8Var, rect)) {
                rect.setEmpty();
            }
            this.f = xa8Var;
            ya8 ya8Var = null;
            this.e = null;
            this.o = true;
            xa8Var.d = xa8Var.c;
            if (xa8Var.e == null) {
                view = sa8Var.p0(this.b);
            } else {
                view = null;
            }
            if (view != null && rect.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            a06 a06Var = this.d;
            if (a06Var != null && !z) {
                a06Var.b(true);
            }
            if (view != null) {
                if (z) {
                    view.setVisibility(4);
                }
                this.c.a(view, rect);
                sa8Var.L1(view);
            } else if (xa8Var.c == 1 && (sj4Var = xa8Var.e) != null) {
                ya8 ya8Var2 = sj4Var.j;
                sj4Var.j = null;
                sj4Var.d();
                sj4Var.l();
                if (ya8Var2 != null) {
                    gl.B2(ya8Var2);
                }
                this.c.a(ya8Var2, rect);
                ya8Var = ya8Var2;
            } else {
                ya8Var = new ya8(this.b);
                this.c.a(ya8Var, rect);
                sa8Var.H0(ya8Var);
            }
            this.c.bringToFront();
            this.g = ya8Var;
            this.h = view;
            xa8Var.c = (byte) 2;
            k(xa8Var);
        }
    }

    public final void j() {
        xa8 xa8Var;
        sj4 sj4Var;
        LaunchActivity launchActivity = this.b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            xa8 xa8Var2 = this.f;
            if (xa8Var2 != null) {
                if (!this.o) {
                    a(xa8Var2);
                }
                k(this.f);
                return;
            }
            if (wqe.a(launchActivity) && !Settings.canDrawOverlays(this.b)) {
                ArrayList arrayList = (ArrayList) this.a.c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        xa8Var = (xa8) arrayList.get(size);
                        byte b = xa8Var.c;
                        sa8 sa8Var = xa8Var.a;
                        if (b == 0 && sa8Var.C0() == null && sa8Var.G0() && sa8Var.a1()) {
                            break;
                        }
                        size--;
                    } else {
                        xa8Var = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            xa8 xa8Var3 = (xa8) arrayList.get(size2);
                            byte b2 = xa8Var3.c;
                            sa8 sa8Var2 = xa8Var3.a;
                            if (b2 == 1 && sa8Var2.a1() && ((sj4Var = xa8Var3.e) == null ? !(!xa8Var3.f || xa8Var3.g) : !(sj4Var.f || sj4Var.k != null)) && (xa8Var == null || sa8Var2.u() > xa8Var.a.u())) {
                                xa8Var = xa8Var3;
                            }
                        }
                        if (xa8Var == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                xa8 xa8Var4 = (xa8) arrayList.get(size3);
                                byte b3 = xa8Var4.c;
                                sa8 sa8Var3 = xa8Var4.a;
                                if (b3 == 0 && sa8Var3.p1() && sa8Var3.a1() && (xa8Var == null || sa8Var3.u() > xa8Var.a.u())) {
                                    xa8Var = xa8Var4;
                                }
                            }
                        }
                    }
                }
            } else {
                xa8Var = null;
            }
            this.e = xa8Var;
            if (xa8Var != null) {
                this.j = true;
                a(xa8Var);
            } else if (this.j) {
                this.j = false;
                this.n = null;
                gl.X2(this.b);
            }
            h();
        }
    }

    public final void k(xa8 xa8Var) {
        oc8 oc8Var;
        if (xa8Var != null) {
            oc8Var = xa8Var.a.k1();
        } else {
            oc8Var = null;
        }
        if (oc8Var == null) {
            h();
            return;
        }
        uu6 uu6Var = this.k;
        if (uu6Var != null) {
            tv6 tv6Var = uu6Var.a;
            tv6Var.t();
            if (tv6Var.t.a == oc8Var) {
                return;
            }
        }
        h();
        try {
            ou6 ou6Var = new ou6(this.b, oc8Var);
            ou6Var.c = "utils-pip-media-session";
            this.k = ou6Var.a();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
