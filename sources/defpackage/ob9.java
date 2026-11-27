package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.qb9;
public abstract class ob9 {
    public static void a(Activity activity, y26 y26Var) {
        y26Var.getClass();
        if (activity instanceof i36) {
            k36 m = ((i36) activity).m();
            if (ik8.A(m)) {
                m.e(y26Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            qb9.a.Companion.getClass();
            pb9.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
