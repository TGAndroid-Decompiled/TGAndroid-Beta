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
public abstract class pq2 extends oq2 implements shc, pe5, vt9 {
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public boolean I;
    public boolean J;
    public final sw2 b;
    public final pm3 c;
    public final k36 d;
    public final rx e;
    public rhc f;
    public wt9 h;
    public vr7 n;
    public final nq2 r;
    public final rx s;
    public final AtomicInteger w;
    public final jq2 x;
    public final CopyOnWriteArrayList y;

    public pq2() {
        sw2 sw2Var = new sw2();
        this.b = sw2Var;
        this.c = new pm3(new vd2(this, (byte) 9));
        k36 k36Var = new k36(this);
        this.d = k36Var;
        rx rxVar = new rx(this);
        this.e = rxVar;
        this.n = null;
        nq2 nq2Var = new nq2(this);
        this.r = nq2Var;
        this.s = new rx(nq2Var, new gq2(this, (byte) 0));
        this.w = new AtomicInteger();
        this.x = new jq2(this);
        this.y = new CopyOnWriteArrayList();
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = false;
        this.J = false;
        k36Var.a(new kq2(this, (byte) 0));
        k36Var.a(new kq2(this, (byte) 1));
        k36Var.a(new kq2(this, (byte) 2));
        rxVar.f();
        fhd.b(this);
        if (Build.VERSION.SDK_INT <= 23) {
            kq2 kq2Var = new kq2();
            kq2Var.b = this;
            k36Var.a(kq2Var);
        }
        ((po) rxVar.d).f("android:support:activity-result", new hq2(this, (byte) 0));
        iq2 iq2Var = new iq2(this, (byte) 0);
        if (((pq2) sw2Var.c) != null) {
            iq2Var.a();
        }
        ((CopyOnWriteArraySet) sw2Var.b).add(iq2Var);
    }

    public static void n(pq2 pq2Var) {
        super.onBackPressed();
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        this.r.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override
    public final qhc c() {
        Bundle bundle;
        wt9 wt9Var = this.h;
        if (wt9Var == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            wt9Var = new wt9(application, this, bundle);
            this.h = wt9Var;
        }
        return wt9Var;
    }

    @Override
    public final oj7 d() {
        oj7 oj7Var = new oj7();
        LinkedHashMap linkedHashMap = (LinkedHashMap) oj7Var.a;
        if (getApplication() != null) {
            linkedHashMap.put(phc.I, getApplication());
        }
        linkedHashMap.put(fhd.a, this);
        linkedHashMap.put(fhd.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(fhd.c, getIntent().getExtras());
        }
        return oj7Var;
    }

    @Override
    public final rhc f() {
        if (getApplication() != null) {
            rhc rhcVar = this.f;
            if (rhcVar == null) {
                mq2 mq2Var = (mq2) getLastNonConfigurationInstance();
                if (mq2Var != null) {
                    this.f = mq2Var.a;
                }
                rhc rhcVar2 = this.f;
                if (rhcVar2 == null) {
                    rhc rhcVar3 = new rhc();
                    this.f = rhcVar3;
                    return rhcVar3;
                }
                return rhcVar2;
            }
            return rhcVar;
        }
        grb.i("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override
    public final po g() {
        return (po) this.e.d;
    }

    @Override
    public final k36 m() {
        return this.d;
    }

    public final void o(pt2 pt2Var) {
        this.y.add(pt2Var);
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
            ((pt2) it.next()).accept(configuration);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.e.g(bundle);
        sw2 sw2Var = this.b;
        sw2Var.getClass();
        sw2Var.c = this;
        Iterator it = ((CopyOnWriteArraySet) sw2Var.b).iterator();
        while (it.hasNext()) {
            ((iq2) it.next()).a();
        }
        super.onCreate(bundle);
        int i = qb9.b;
        ob9.b(this);
    }

    @Override
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                ((dq4) it.next()).a.k();
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
                if (((dq4) it.next()).a.p()) {
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
                ((pt2) it.next()).accept(new bj7(z));
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
            ((pt2) it.next()).accept(intent);
        }
    }

    @Override
    public final void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((dq4) it.next()).a.q();
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
                ((pt2) it.next()).accept(new sd8(z));
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
                ((dq4) it.next()).a.t();
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
        mq2 mq2Var;
        rhc rhcVar = this.f;
        if (rhcVar == null && (mq2Var = (mq2) getLastNonConfigurationInstance()) != null) {
            rhcVar = mq2Var.a;
        }
        if (rhcVar == null) {
            return null;
        }
        ?? obj = new Object();
        obj.a = rhcVar;
        return obj;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        k36 k36Var = this.d;
        if (k36Var != null) {
            k36Var.d("setCurrentState");
            k36Var.f(z26.c);
        }
        super.onSaveInstanceState(bundle);
        this.e.h(bundle);
    }

    @Override
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((pt2) it.next()).accept(Integer.valueOf(i));
        }
    }

    public final vr7 p() {
        if (this.n == null) {
            this.n = new vr7(new p1(this, (byte) 18));
            this.d.a(new kq2(this, (byte) 3));
        }
        return this.n;
    }

    public final void r() {
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
            if (q0f.b()) {
                q0f.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            rx rxVar = this.s;
            synchronized (rxVar.c) {
                rxVar.b = true;
                ArrayList arrayList = (ArrayList) rxVar.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((sr4) obj).invoke();
                }
                ((ArrayList) rxVar.d).clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public final void setContentView(int i) {
        r();
        this.r.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    public final v9 t(s9 s9Var, t9 t9Var) {
        String str = "activity_rq#" + this.w.getAndIncrement();
        jq2 jq2Var = this.x;
        HashMap hashMap = jq2Var.c;
        k36 k36Var = this.d;
        if (k36Var.b.compareTo(z26.d) < 0) {
            jq2Var.d(str);
            x9 x9Var = (x9) hashMap.get(str);
            if (x9Var == null) {
                x9Var = new x9(k36Var);
            }
            u9 u9Var = new u9(jq2Var, str, s9Var, t9Var);
            x9Var.a.a(u9Var);
            x9Var.b.add(u9Var);
            hashMap.put(str, x9Var);
            return new v9(jq2Var, str, t9Var, (byte) 0);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(this);
        z26 z26Var = k36Var.b;
        sb.append(" is attempting to register while current state is ");
        sb.append(z26Var);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }

    @Override
    public void setContentView(View view) {
        r();
        this.r.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
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
            ((pt2) it.next()).accept(new bj7(z));
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.J) {
            return;
        }
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((pt2) it.next()).accept(new sd8(z));
        }
    }
}
