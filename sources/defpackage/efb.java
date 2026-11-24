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
public final class efb {
    public final yc3 a;
    public LaunchActivity b;
    public hfb c;
    public a26 d;
    public ad8 e;
    public ad8 f;
    public bd8 g;
    public View h;
    public boolean i;
    public boolean j;
    public uw6 k;
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
    public final zk v = new zk(this, (byte) 13);

    public efb(yc3 yc3Var) {
        this.a = yc3Var;
    }

    public final void a(ad8 ad8Var) {
        PictureInPictureParams b = b(ad8Var);
        String str = this.r;
        if (str != null && str.equals(this.n)) {
            return;
        }
        this.n = this.r;
        gm.q3(this.b, b);
    }

    public final PictureInPictureParams b(ad8 ad8Var) {
        Rational rational;
        PictureInPictureParams.Builder c = fl.c();
        StringBuilder sb = this.s;
        boolean z = false;
        sb.setLength(0);
        int S = ad8Var.a.S();
        vc8 vc8Var = ad8Var.a;
        int o0 = vc8Var.o0();
        if (S > 0 && o0 > 0) {
            float f = S / o0;
            if (f < 0.45f) {
                rational = new Rational(45, 100);
            } else if (f > 2.35f) {
                rational = new Rational(235, 100);
            } else {
                rational = new Rational(S, o0);
            }
            c.setAspectRatio(rational);
            sb.append(rational);
        }
        byte b = ad8Var.c;
        Rect rect = this.p;
        if (b != 2) {
            this.q = e(ad8Var, rect);
        }
        if (this.q) {
            c.setSourceRectHint(rect);
            sb.append('|');
            sb.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.t;
        arrayList2.clear();
        vc8Var.q0(this.b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i = 0; i < arrayList2.size(); i++) {
            uc8 uc8Var = (uc8) arrayList2.get(i);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.b.getPackageName());
            intent.putExtra("action_id", (int) uc8Var.a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.b, uc8Var.a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.b, uc8Var.b);
            String str = uc8Var.c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, str, str, broadcast);
            remoteAction.setEnabled(uc8Var.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.u) {
            this.u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i2 = Build.VERSION.SDK_INT;
            LaunchActivity launchActivity = this.b;
            zk zkVar = this.v;
            if (i2 >= 33) {
                launchActivity.registerReceiver(zkVar, intentFilter, 4);
            } else {
                launchActivity.registerReceiver(zkVar, intentFilter);
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
            if (i4 >= 31 && ad8Var.c != 2) {
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
                fc4.g(e, true);
            }
        }
        hfb hfbVar = this.c;
        if (hfbVar != null) {
            gm.B2(hfbVar);
            this.c = null;
        }
        a26 a26Var = this.d;
        if (a26Var != null) {
            a26Var.a();
            this.d = null;
        }
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efb.d():void");
    }

    public final boolean e(ad8 ad8Var, Rect rect) {
        if (this.b != null) {
            if (ad8Var.f()) {
                tl4 tl4Var = ad8Var.e;
                RectF rectF = this.l;
                tl4Var.g(rectF);
                rectF.round(rect);
            } else {
                ad8Var.a.I(rect);
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
        ad8 ad8Var;
        if (Build.VERSION.SDK_INT >= 35 && wi8.A(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f == null && (ad8Var = this.e) != null) {
            i(ad8Var);
        }
    }

    public final void g() {
        int i;
        if (this.b != null && (i = Build.VERSION.SDK_INT) >= 26 && i < 31 && this.f == null) {
            j();
            ad8 ad8Var = this.e;
            if (ad8Var != null) {
                PictureInPictureParams b = b(ad8Var);
                i(this.e);
                try {
                    if (!this.b.enterPictureInPictureMode(b)) {
                        d();
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    d();
                }
            }
        }
    }

    public final void h() {
        uw6 uw6Var = this.k;
        if (uw6Var != null) {
            try {
                synchronized (uw6.c) {
                    uw6.d.remove(uw6Var.a.i);
                }
                uw6Var.a.p();
            } catch (Exception unused) {
            }
            this.k = null;
        }
    }

    public final void i(ad8 ad8Var) {
        View view;
        boolean z;
        tl4 tl4Var;
        if (this.c != null && this.b != null) {
            StringBuilder sb = new StringBuilder("system: start enter, from state ");
            byte b = ad8Var.c;
            vc8 vc8Var = ad8Var.a;
            sb.append((int) b);
            yc3.e(sb.toString());
            Rect rect = new Rect();
            if (!e(ad8Var, rect)) {
                rect.setEmpty();
            }
            this.f = ad8Var;
            bd8 bd8Var = null;
            this.e = null;
            this.o = true;
            ad8Var.d = ad8Var.c;
            if (ad8Var.e == null) {
                view = vc8Var.J(this.b);
            } else {
                view = null;
            }
            if (view != null && rect.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            a26 a26Var = this.d;
            if (a26Var != null && !z) {
                a26Var.b(true);
            }
            if (view != null) {
                if (z) {
                    view.setVisibility(4);
                }
                this.c.a(view, rect);
                vc8Var.m0(view);
            } else if (ad8Var.c == 1 && (tl4Var = ad8Var.e) != null) {
                bd8 bd8Var2 = tl4Var.j;
                tl4Var.j = null;
                tl4Var.d();
                tl4Var.l();
                if (bd8Var2 != null) {
                    gm.B2(bd8Var2);
                }
                this.c.a(bd8Var2, rect);
                bd8Var = bd8Var2;
            } else {
                bd8Var = new bd8(this.b);
                this.c.a(bd8Var, rect);
                vc8Var.Q(bd8Var);
            }
            this.c.bringToFront();
            this.g = bd8Var;
            this.h = view;
            ad8Var.c = (byte) 2;
            k(ad8Var);
        }
    }

    public final void j() {
        ad8 ad8Var;
        tl4 tl4Var;
        LaunchActivity launchActivity = this.b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            ad8 ad8Var2 = this.f;
            if (ad8Var2 != null) {
                if (!this.o) {
                    a(ad8Var2);
                }
                k(this.f);
                return;
            }
            if (zse.a(launchActivity) && !Settings.canDrawOverlays(this.b)) {
                ArrayList arrayList = (ArrayList) this.a.c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        ad8Var = (ad8) arrayList.get(size);
                        byte b = ad8Var.c;
                        vc8 vc8Var = ad8Var.a;
                        if (b == 0 && vc8Var.O() == null && vc8Var.P() && vc8Var.V()) {
                            break;
                        }
                        size--;
                    } else {
                        ad8Var = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            ad8 ad8Var3 = (ad8) arrayList.get(size2);
                            byte b2 = ad8Var3.c;
                            vc8 vc8Var2 = ad8Var3.a;
                            if (b2 == 1 && vc8Var2.V() && ((tl4Var = ad8Var3.e) == null ? !(!ad8Var3.f || ad8Var3.g) : !(tl4Var.f || tl4Var.k != null)) && (ad8Var == null || vc8Var2.p() > ad8Var.a.p())) {
                                ad8Var = ad8Var3;
                            }
                        }
                        if (ad8Var == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                ad8 ad8Var4 = (ad8) arrayList.get(size3);
                                byte b3 = ad8Var4.c;
                                vc8 vc8Var3 = ad8Var4.a;
                                if (b3 == 0 && vc8Var3.a0() && vc8Var3.V() && (ad8Var == null || vc8Var3.p() > ad8Var.a.p())) {
                                    ad8Var = ad8Var4;
                                }
                            }
                        }
                    }
                }
            } else {
                ad8Var = null;
            }
            this.e = ad8Var;
            if (ad8Var != null) {
                this.j = true;
                a(ad8Var);
            } else if (this.j) {
                this.j = false;
                this.n = null;
                gm.X2(this.b);
            }
            h();
        }
    }

    public final void k(ad8 ad8Var) {
        re8 re8Var;
        if (ad8Var != null) {
            re8Var = ad8Var.a.Y();
        } else {
            re8Var = null;
        }
        if (re8Var == null) {
            h();
            return;
        }
        uw6 uw6Var = this.k;
        if (uw6Var != null) {
            tx6 tx6Var = uw6Var.a;
            tx6Var.t();
            if (tx6Var.t.a == re8Var) {
                return;
            }
        }
        h();
        try {
            ow6 ow6Var = new ow6(this.b, re8Var);
            ow6Var.c = "utils-pip-media-session";
            this.k = ow6Var.a();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
