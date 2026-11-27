package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
public abstract class c36 {
    protected final g36 mLifecycleFragment;

    public c36(g36 g36Var) {
        this.mLifecycleFragment = g36Var;
    }

    public static g36 getFragment(b36 b36Var) {
        d9d d9dVar;
        dsd dsdVar;
        Activity activity = b36Var.a;
        if (activity instanceof jp4) {
            jp4 jp4Var = (jp4) activity;
            WeakHashMap weakHashMap = dsd.m0;
            lq4 u = jp4Var.u();
            WeakHashMap weakHashMap2 = dsd.m0;
            WeakReference weakReference = (WeakReference) weakHashMap2.get(jp4Var);
            if (weakReference != null && (dsdVar = (dsd) weakReference.get()) != null) {
                return dsdVar;
            }
            try {
                dsd dsdVar2 = (dsd) u.D("SLifecycleFragmentImpl");
                if (dsdVar2 == null || dsdVar2.x) {
                    dsdVar2 = new dsd();
                    kd0 kd0Var = new kd0(u);
                    kd0Var.f(0, dsdVar2, "SLifecycleFragmentImpl");
                    kd0Var.e(true, true);
                }
                weakHashMap2.put(jp4Var, new WeakReference(dsdVar2));
                return dsdVar2;
            } catch (ClassCastException e) {
                su3.f("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                return null;
            }
        }
        WeakHashMap weakHashMap3 = d9d.b;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(activity);
        if (weakReference2 != null && (d9dVar = (d9d) weakReference2.get()) != null) {
            return d9dVar;
        }
        try {
            d9d d9dVar2 = (d9d) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (d9dVar2 == null || d9dVar2.isRemoving()) {
                d9dVar2 = new d9d();
                activity.getFragmentManager().beginTransaction().add(d9dVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap3.put(activity, new WeakReference(d9dVar2));
            return d9dVar2;
        } catch (ClassCastException e2) {
            su3.f("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
            return null;
        }
    }

    public Activity getActivity() {
        Activity e = this.mLifecycleFragment.e();
        xve.h(e);
        return e;
    }

    public abstract void onStop();

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public static g36 getFragment(Activity activity) {
        return getFragment(new b36(activity));
    }

    public static g36 getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
