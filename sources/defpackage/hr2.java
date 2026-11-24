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
public abstract class hr2 extends gr2 implements ufc, me5, es9 {
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public boolean I;
    public boolean J;
    public final ix2 b;
    public final in3 c;
    public final g36 d;
    public final ry e;
    public tfc f;
    public fs9 h;
    public yq7 n;
    public final fr2 r;
    public final ry s;
    public final AtomicInteger w;
    public final br2 x;
    public final CopyOnWriteArrayList y;

    public hr2() {
        ix2 ix2Var = new ix2();
        this.b = ix2Var;
        this.c = new in3(new xf2(this, (byte) 8));
        g36 g36Var = new g36(this);
        this.d = g36Var;
        ry ryVar = new ry(this);
        this.e = ryVar;
        this.n = null;
        fr2 fr2Var = new fr2(this);
        this.r = fr2Var;
        this.s = new ry(fr2Var, new yq2(this, (byte) 0));
        this.w = new AtomicInteger();
        this.x = new br2(this);
        this.y = new CopyOnWriteArrayList();
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = false;
        this.J = false;
        g36Var.a(new cr2(this, (byte) 0));
        g36Var.a(new cr2(this, (byte) 1));
        g36Var.a(new cr2(this, (byte) 2));
        ryVar.e();
        oed.b(this);
        if (Build.VERSION.SDK_INT <= 23) {
            cr2 cr2Var = new cr2();
            cr2Var.b = this;
            g36Var.a(cr2Var);
        }
        ((op) ryVar.d).f("android:support:activity-result", new zq2(this, (byte) 0));
        ar2 ar2Var = new ar2(this, (byte) 0);
        if (((hr2) ix2Var.c) != null) {
            ar2Var.a();
        }
        ((CopyOnWriteArraySet) ix2Var.b).add(ar2Var);
    }

    public static void n(hr2 hr2Var) {
        super.onBackPressed();
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        this.r.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override
    public final sfc c() {
        Bundle bundle;
        fs9 fs9Var = this.h;
        if (fs9Var == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            fs9Var = new fs9(application, this, bundle);
            this.h = fs9Var;
        }
        return fs9Var;
    }

    @Override
    public final ij7 d() {
        ij7 ij7Var = new ij7();
        LinkedHashMap linkedHashMap = (LinkedHashMap) ij7Var.a;
        if (getApplication() != null) {
            linkedHashMap.put(rfc.I, getApplication());
        }
        linkedHashMap.put(oed.a, this);
        linkedHashMap.put(oed.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(oed.c, getIntent().getExtras());
        }
        return ij7Var;
    }

    @Override
    public final tfc f() {
        if (getApplication() != null) {
            tfc tfcVar = this.f;
            if (tfcVar == null) {
                er2 er2Var = (er2) getLastNonConfigurationInstance();
                if (er2Var != null) {
                    this.f = er2Var.a;
                }
                tfc tfcVar2 = this.f;
                if (tfcVar2 == null) {
                    tfc tfcVar3 = new tfc();
                    this.f = tfcVar3;
                    return tfcVar3;
                }
                return tfcVar2;
            }
            return tfcVar;
        }
        dq9.m("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override
    public final op g() {
        return (op) this.e.d;
    }

    @Override
    public final g36 m() {
        return this.d;
    }

    public final void o(gu2 gu2Var) {
        this.y.add(gu2Var);
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
            ((gu2) it.next()).accept(configuration);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.e.f(bundle);
        ix2 ix2Var = this.b;
        ix2Var.getClass();
        ix2Var.c = this;
        Iterator it = ((CopyOnWriteArraySet) ix2Var.b).iterator();
        while (it.hasNext()) {
            ((ar2) it.next()).a();
        }
        super.onCreate(bundle);
        int i = ga9.b;
        ea9.b(this);
    }

    @Override
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                ((aq4) it.next()).a.k();
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
                if (((aq4) it.next()).a.p()) {
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
                ((gu2) it.next()).accept(new vi7(z));
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
            ((gu2) it.next()).accept(intent);
        }
    }

    @Override
    public final void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((aq4) it.next()).a.q();
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
                ((gu2) it.next()).accept(new dc8(z));
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
                ((aq4) it.next()).a.t();
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
        er2 er2Var;
        tfc tfcVar = this.f;
        if (tfcVar == null && (er2Var = (er2) getLastNonConfigurationInstance()) != null) {
            tfcVar = er2Var.a;
        }
        if (tfcVar == null) {
            return null;
        }
        ?? obj = new Object();
        obj.a = tfcVar;
        return obj;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        g36 g36Var = this.d;
        if (g36Var != null) {
            g36Var.d("setCurrentState");
            g36Var.f(v26.c);
        }
        super.onSaveInstanceState(bundle);
        this.e.g(bundle);
    }

    @Override
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((gu2) it.next()).accept(Integer.valueOf(i));
        }
    }

    public final yq7 p() {
        if (this.n == null) {
            this.n = new yq7(new o1(this, (byte) 18));
            this.d.a(new cr2(this, (byte) 3));
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
            if (yxe.b()) {
                yxe.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ry ryVar = this.s;
            synchronized (ryVar.c) {
                ryVar.b = true;
                ArrayList arrayList = (ArrayList) ryVar.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((pr4) obj).invoke();
                }
                ((ArrayList) ryVar.d).clear();
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

    public final u9 t(r9 r9Var, s9 s9Var) {
        String str = "activity_rq#" + this.w.getAndIncrement();
        br2 br2Var = this.x;
        HashMap hashMap = br2Var.c;
        g36 g36Var = this.d;
        if (g36Var.b.compareTo(v26.d) < 0) {
            br2Var.d(str);
            w9 w9Var = (w9) hashMap.get(str);
            if (w9Var == null) {
                w9Var = new w9(g36Var);
            }
            t9 t9Var = new t9(br2Var, str, r9Var, s9Var);
            w9Var.a.a(t9Var);
            w9Var.b.add(t9Var);
            hashMap.put(str, w9Var);
            return new u9(br2Var, str, s9Var, (byte) 0);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(this);
        v26 v26Var = g36Var.b;
        sb.append(" is attempting to register while current state is ");
        sb.append(v26Var);
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
            ((gu2) it.next()).accept(new vi7(z));
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.J) {
            return;
        }
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((gu2) it.next()).accept(new dc8(z));
        }
    }
}
