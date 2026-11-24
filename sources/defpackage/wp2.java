package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
public abstract class wp2 extends vp2 implements tdc, oc5, dq9 {
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public boolean I;
    public boolean J;
    public final yv2 b;
    public final xl3 c;
    public final g16 d;
    public final qx e;
    public sdc f;
    public eq9 h;
    public vo7 n;
    public final up2 r;
    public final qx s;
    public final AtomicInteger w;
    public final qp2 x;
    public final CopyOnWriteArrayList y;

    public wp2() {
        yv2 yv2Var = new yv2();
        this.b = yv2Var;
        this.c = new xl3(new mk2(this, (byte) 3));
        g16 g16Var = new g16(this);
        this.d = g16Var;
        qx qxVar = new qx(this);
        this.e = qxVar;
        this.n = null;
        up2 up2Var = new up2(this);
        this.r = up2Var;
        this.s = new qx(up2Var, new np2(this, (byte) 0));
        this.w = new AtomicInteger();
        this.x = new qp2(this);
        this.y = new CopyOnWriteArrayList();
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = false;
        this.J = false;
        g16Var.a(new rp2(this, (byte) 0));
        g16Var.a(new rp2(this, (byte) 1));
        g16Var.a(new rp2(this, (byte) 2));
        qxVar.e();
        mcd.b(this);
        if (Build.VERSION.SDK_INT <= 23) {
            rp2 rp2Var = new rp2();
            rp2Var.b = this;
            g16Var.a(rp2Var);
        }
        ((oo) qxVar.d).f("android:support:activity-result", new op2(this, (byte) 0));
        pp2 pp2Var = new pp2(this, (byte) 0);
        if (((wp2) yv2Var.c) != null) {
            pp2Var.a();
        }
        ((CopyOnWriteArraySet) yv2Var.b).add(pp2Var);
    }

    public static void n(wp2 wp2Var) {
        super.onBackPressed();
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        this.r.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override
    public final rdc c() {
        Bundle bundle;
        eq9 eq9Var = this.h;
        if (eq9Var == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            eq9Var = new eq9(application, this, bundle);
            this.h = eq9Var;
        }
        return eq9Var;
    }

    @Override
    public final fh7 d() {
        fh7 fh7Var = new fh7();
        LinkedHashMap linkedHashMap = (LinkedHashMap) fh7Var.a;
        if (getApplication() != null) {
            linkedHashMap.put(qdc.I, getApplication());
        }
        linkedHashMap.put(mcd.a, this);
        linkedHashMap.put(mcd.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(mcd.c, getIntent().getExtras());
        }
        return fh7Var;
    }

    @Override
    public final sdc f() {
        if (getApplication() != null) {
            sdc sdcVar = this.f;
            if (sdcVar == null) {
                tp2 tp2Var = (tp2) getLastNonConfigurationInstance();
                if (tp2Var != null) {
                    this.f = tp2Var.a;
                }
                sdc sdcVar2 = this.f;
                if (sdcVar2 == null) {
                    sdc sdcVar3 = new sdc();
                    this.f = sdcVar3;
                    return sdcVar3;
                }
                return sdcVar2;
            }
            return sdcVar;
        }
        sc8.j("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override
    public final oo g() {
        return (oo) this.e.d;
    }

    @Override
    public final g16 m() {
        return this.d;
    }

    public final void o(vs2 vs2Var) {
        this.y.add(vs2Var);
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.x.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public void onBackPressed() {
        p().a();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((vs2) it.next()).accept(configuration);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.e.f(bundle);
        yv2 yv2Var = this.b;
        yv2Var.getClass();
        yv2Var.c = this;
        Iterator it = ((CopyOnWriteArraySet) yv2Var.b).iterator();
        while (it.hasNext()) {
            ((pp2) it.next()).a();
        }
        super.onCreate(bundle);
        int i = e89.b;
        c89.b(this);
    }

    @Override
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                ((zn4) it.next()).a.k();
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                if (((zn4) it.next()).a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.I = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.I = false;
            Iterator it = this.G.iterator();
            while (it.hasNext()) {
                configuration.getClass();
                ((vs2) it.next()).accept(new sg7(z));
            }
        } catch (Throwable th) {
            this.I = false;
            throw th;
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((vs2) it.next()).accept(intent);
        }
    }

    @Override
    public final void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((zn4) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.J = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.J = false;
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                configuration.getClass();
                ((vs2) it.next()).accept(new ca8(z));
            }
        } catch (Throwable th) {
            this.J = false;
            throw th;
        }
    }

    @Override
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                ((zn4) it.next()).a.t();
            }
            return true;
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.x.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override
    public final Object onRetainNonConfigurationInstance() {
        tp2 tp2Var;
        sdc sdcVar = this.f;
        if (sdcVar == null && (tp2Var = (tp2) getLastNonConfigurationInstance()) != null) {
            sdcVar = tp2Var.a;
        }
        if (sdcVar == null) {
            return null;
        }
        ?? obj = new Object();
        obj.a = sdcVar;
        return obj;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        g16 g16Var = this.d;
        if (g16Var != null) {
            g16Var.d("setCurrentState");
            g16Var.f(v06.c);
        }
        super.onSaveInstanceState(bundle);
        this.e.g(bundle);
    }

    @Override
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((vs2) it.next()).accept(Integer.valueOf(i));
        }
    }

    public final vo7 p() {
        if (this.n == null) {
            this.n = new vo7(new o1(this, (byte) 18));
            this.d.a(new rp2(this, (byte) 3));
        }
        return this.n;
    }

    public final void q() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(2131296731, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131296734, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(2131296733, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(2131296732, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(2131296624, this);
    }

    @Override
    public final void reportFullyDrawn() {
        try {
            if (wve.b()) {
                wve.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            qx qxVar = this.s;
            synchronized (qxVar.c) {
                qxVar.b = true;
                ArrayList arrayList = (ArrayList) qxVar.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((op4) obj).invoke();
                }
                ((ArrayList) qxVar.d).clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final u9 s(r9 r9Var, s9 s9Var) {
        String str = "activity_rq#" + this.w.getAndIncrement();
        qp2 qp2Var = this.x;
        HashMap hashMap = qp2Var.c;
        g16 g16Var = this.d;
        if (g16Var.b.compareTo(v06.d) < 0) {
            qp2Var.d(str);
            w9 w9Var = (w9) hashMap.get(str);
            if (w9Var == null) {
                w9Var = new w9(g16Var);
            }
            t9 t9Var = new t9(qp2Var, str, r9Var, s9Var);
            w9Var.a.a(t9Var);
            w9Var.b.add(t9Var);
            hashMap.put(str, w9Var);
            return new u9(qp2Var, str, s9Var, (byte) 0);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(this);
        v06 v06Var = g16Var.b;
        sb.append(" is attempting to register while current state is ");
        sb.append(v06Var);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }

    @Override
    public final void setContentView(int i) {
        q();
        this.r.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override
    public void setContentView(View view) {
        q();
        this.r.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        this.r.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override
    public void onMultiWindowModeChanged(boolean z) {
        if (this.I) {
            return;
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((vs2) it.next()).accept(new sg7(z));
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.J) {
            return;
        }
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((vs2) it.next()).accept(new ca8(z));
        }
    }
}
