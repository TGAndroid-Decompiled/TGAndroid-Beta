package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.e89;
public abstract class c89 {
    public static void a(Activity activity, u06 u06Var) {
        u06Var.getClass();
        if (activity instanceof e16) {
            g16 m = ((e16) activity).m();
            if (ug8.A(m)) {
                m.e(u06Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            e89.a.Companion.getClass();
            d89.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
