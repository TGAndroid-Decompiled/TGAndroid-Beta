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
public final class ygb {
    public final fc3 a;
    public LaunchActivity b;
    public bhb c;
    public e26 d;
    public me8 e;
    public me8 f;
    public ne8 g;
    public View h;
    public boolean i;
    public boolean j;
    public zw6 k;
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
    public final ak v = new ak(this, (byte) 13);

    public ygb(fc3 fc3Var) {
        this.a = fc3Var;
    }

    public final void a(me8 me8Var) {
        PictureInPictureParams b = b(me8Var);
        String str = this.r;
        if (str != null && str.equals(this.n)) {
            return;
        }
        this.n = this.r;
        hl.q3(this.b, b);
    }

    public final PictureInPictureParams b(me8 me8Var) {
        Rational rational;
        PictureInPictureParams.Builder c = gk.c();
        StringBuilder sb = this.s;
        boolean z = false;
        sb.setLength(0);
        int U = me8Var.a.U();
        je8 je8Var = me8Var.a;
        int q0 = je8Var.q0();
        if (U > 0 && q0 > 0) {
            float f = U / q0;
            if (f < 0.45f) {
                rational = new Rational(45, 100);
            } else if (f > 2.35f) {
                rational = new Rational(235, 100);
            } else {
                rational = new Rational(U, q0);
            }
            c.setAspectRatio(rational);
            sb.append(rational);
        }
        byte b = me8Var.c;
        Rect rect = this.p;
        if (b != 2) {
            this.q = e(me8Var, rect);
        }
        if (this.q) {
            c.setSourceRectHint(rect);
            sb.append('|');
            sb.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.t;
        arrayList2.clear();
        je8Var.u0(this.b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i = 0; i < arrayList2.size(); i++) {
            ie8 ie8Var = (ie8) arrayList2.get(i);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.b.getPackageName());
            intent.putExtra("action_id", (int) ie8Var.a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.b, ie8Var.a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.b, ie8Var.b);
            String str = ie8Var.c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, str, str, broadcast);
            remoteAction.setEnabled(ie8Var.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.u) {
            this.u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i2 = Build.VERSION.SDK_INT;
            LaunchActivity launchActivity = this.b;
            ak akVar = this.v;
            if (i2 >= 33) {
                launchActivity.registerReceiver(akVar, intentFilter, 4);
            } else {
                launchActivity.registerReceiver(akVar, intentFilter);
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
            if (i4 >= 31 && me8Var.c != 2) {
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
                cc4.g(e, true);
            }
        }
        bhb bhbVar = this.c;
        if (bhbVar != null) {
            hl.B2(bhbVar);
            this.c = null;
        }
        e26 e26Var = this.d;
        if (e26Var != null) {
            e26Var.a();
            this.d = null;
        }
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygb.d():void");
    }

    public final boolean e(me8 me8Var, Rect rect) {
        if (this.b != null) {
            if (me8Var.g()) {
                xl4 xl4Var = me8Var.e;
                RectF rectF = this.l;
                xl4Var.g(rectF);
                rectF.round(rect);
            } else {
                me8Var.a.J(rect);
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
        me8 me8Var;
        if (Build.VERSION.SDK_INT >= 35 && ik8.A(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f == null && (me8Var = this.e) != null) {
            i(me8Var);
        }
    }

    public final void g() {
        int i;
        if (this.b != null && (i = Build.VERSION.SDK_INT) >= 26 && i < 31 && this.f == null) {
            j();
            me8 me8Var = this.e;
            if (me8Var != null) {
                PictureInPictureParams b = b(me8Var);
                i(this.e);
                try {
                    if (!this.b.enterPictureInPictureMode(b)) {
                        d();
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    d();
                }
            }
        }
    }

    public final void h() {
        zw6 zw6Var = this.k;
        if (zw6Var != null) {
            try {
                synchronized (zw6.c) {
                    zw6.d.remove(zw6Var.a.i);
                }
                zw6Var.a.p();
            } catch (Exception unused) {
            }
            this.k = null;
        }
    }

    public final void i(me8 me8Var) {
        View view;
        boolean z;
        xl4 xl4Var;
        if (this.c != null && this.b != null) {
            StringBuilder sb = new StringBuilder("system: start enter, from state ");
            byte b = me8Var.c;
            je8 je8Var = me8Var.a;
            sb.append((int) b);
            fc3.e(sb.toString());
            Rect rect = new Rect();
            if (!e(me8Var, rect)) {
                rect.setEmpty();
            }
            this.f = me8Var;
            ne8 ne8Var = null;
            this.e = null;
            this.o = true;
            me8Var.d = me8Var.c;
            if (me8Var.e == null) {
                view = je8Var.K(this.b);
            } else {
                view = null;
            }
            if (view != null && rect.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            e26 e26Var = this.d;
            if (e26Var != null && !z) {
                e26Var.b(true);
            }
            if (view != null) {
                if (z) {
                    view.setVisibility(4);
                }
                this.c.a(view, rect);
                je8Var.o0(view);
            } else if (me8Var.c == 1 && (xl4Var = me8Var.e) != null) {
                ne8 ne8Var2 = xl4Var.l;
                xl4Var.l = null;
                xl4Var.d();
                xl4Var.m();
                if (ne8Var2 != null) {
                    hl.B2(ne8Var2);
                }
                this.c.a(ne8Var2, rect);
                ne8Var = ne8Var2;
            } else {
                ne8Var = new ne8(this.b);
                this.c.a(ne8Var, rect);
                je8Var.R(ne8Var);
            }
            this.c.bringToFront();
            this.g = ne8Var;
            this.h = view;
            me8Var.c = (byte) 2;
            k(me8Var);
        }
    }

    public final void j() {
        me8 me8Var;
        boolean z;
        boolean z2;
        xl4 xl4Var;
        boolean z3;
        LaunchActivity launchActivity = this.b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            me8 me8Var2 = this.f;
            if (me8Var2 != null) {
                if (!this.o) {
                    a(me8Var2);
                }
                k(this.f);
                return;
            }
            if (ove.a(launchActivity) && !Settings.canDrawOverlays(this.b)) {
                ArrayList arrayList = (ArrayList) this.a.c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        me8Var = (me8) arrayList.get(size);
                        if (me8Var.a.S() != 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        je8 je8Var = me8Var.a;
                        if (z3 && me8Var.c == 0 && je8Var.P() == null && je8Var.Q() && je8Var.X()) {
                            break;
                        }
                        size--;
                    } else {
                        me8Var = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            me8 me8Var3 = (me8) arrayList.get(size2);
                            if (me8Var3.a.S() != 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            je8 je8Var2 = me8Var3.a;
                            if (z2 && me8Var3.c == 1 && je8Var2.X() && ((xl4Var = me8Var3.e) == null ? !(!me8Var3.g || me8Var3.h) : !(xl4Var.g || xl4Var.m != null)) && (me8Var == null || je8Var2.q() > me8Var.a.q())) {
                                me8Var = me8Var3;
                            }
                        }
                        if (me8Var == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                me8 me8Var4 = (me8) arrayList.get(size3);
                                if (me8Var4.a.S() != 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                je8 je8Var3 = me8Var4.a;
                                if (z && me8Var4.c == 0 && je8Var3.d0() && je8Var3.X() && (me8Var == null || je8Var3.q() > me8Var.a.q())) {
                                    me8Var = me8Var4;
                                }
                            }
                        }
                    }
                }
            } else {
                me8Var = null;
            }
            this.e = me8Var;
            if (me8Var != null) {
                this.j = true;
                a(me8Var);
            } else if (this.j) {
                this.j = false;
                this.n = null;
                hl.X2(this.b);
            }
            h();
        }
    }

    public final void k(me8 me8Var) {
        dg8 dg8Var;
        if (me8Var != null) {
            dg8Var = me8Var.a.a0();
        } else {
            dg8Var = null;
        }
        if (dg8Var == null) {
            h();
            return;
        }
        zw6 zw6Var = this.k;
        if (zw6Var != null) {
            yx6 yx6Var = zw6Var.a;
            yx6Var.t();
            if (yx6Var.t.a == dg8Var) {
                return;
            }
        }
        h();
        try {
            tw6 tw6Var = new tw6(this.b, dg8Var);
            tw6Var.c = "utils-pip-media-session";
            this.k = tw6Var.a();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
