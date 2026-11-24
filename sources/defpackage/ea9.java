package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.ga9;
public abstract class ea9 {
    public static void a(Activity activity, u26 u26Var) {
        u26Var.getClass();
        if (activity instanceof e36) {
            g36 m = ((e36) activity).m();
            if (wi8.A(m)) {
                m.e(u26Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            ga9.a.Companion.getClass();
            fa9.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
