package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
public abstract class y26 {
    protected final c36 mLifecycleFragment;

    public y26(c36 c36Var) {
        this.mLifecycleFragment = c36Var;
    }

    public static c36 getFragment(x26 x26Var) {
        o6d o6dVar;
        ppd ppdVar;
        Activity activity = x26Var.a;
        if (activity instanceof gp4) {
            gp4 gp4Var = (gp4) activity;
            WeakHashMap weakHashMap = ppd.m0;
            iq4 u = gp4Var.u();
            WeakHashMap weakHashMap2 = ppd.m0;
            WeakReference weakReference = (WeakReference) weakHashMap2.get(gp4Var);
            if (weakReference != null && (ppdVar = (ppd) weakReference.get()) != null) {
                return ppdVar;
            }
            try {
                ppd ppdVar2 = (ppd) u.D("SLifecycleFragmentImpl");
                if (ppdVar2 == null || ppdVar2.x) {
                    ppdVar2 = new ppd();
                    ie0 ie0Var = new ie0(u);
                    ie0Var.f(0, ppdVar2, "SLifecycleFragmentImpl");
                    ie0Var.e(true, true);
                }
                weakHashMap2.put(gp4Var, new WeakReference(ppdVar2));
                return ppdVar2;
            } catch (ClassCastException e) {
                wa3.h("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                return null;
            }
        }
        WeakHashMap weakHashMap3 = o6d.b;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(activity);
        if (weakReference2 != null && (o6dVar = (o6d) weakReference2.get()) != null) {
            return o6dVar;
        }
        try {
            o6d o6dVar2 = (o6d) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (o6dVar2 == null || o6dVar2.isRemoving()) {
                o6dVar2 = new o6d();
                activity.getFragmentManager().beginTransaction().add(o6dVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap3.put(activity, new WeakReference(o6dVar2));
            return o6dVar2;
        } catch (ClassCastException e2) {
            wa3.h("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
            return null;
        }
    }

    public Activity getActivity() {
        Activity e = this.mLifecycleFragment.e();
        ite.h(e);
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

    public static c36 getFragment(Activity activity) {
        return getFragment(new x26(activity));
    }

    public static c36 getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
