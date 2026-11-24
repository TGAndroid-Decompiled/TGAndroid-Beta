package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
public class ga9 extends Fragment {
    public static final int b = 0;
    public lj4 a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final fa9 Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            fa9.a(activity);
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = ga9.b;
            ea9.a(activity, u26.ON_CREATE);
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = ga9.b;
            ea9.a(activity, u26.ON_RESUME);
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = ga9.b;
            ea9.a(activity, u26.ON_START);
        }

        @Override
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = ga9.b;
            ea9.a(activity, u26.ON_DESTROY);
        }

        @Override
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = ga9.b;
            ea9.a(activity, u26.ON_PAUSE);
        }

        @Override
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = ga9.b;
            ea9.a(activity, u26.ON_STOP);
        }

        @Override
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    public final void a(u26 u26Var) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            ea9.a(activity, u26Var);
        }
    }

    @Override
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(u26.ON_CREATE);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        a(u26.ON_DESTROY);
        this.a = null;
    }

    @Override
    public final void onPause() {
        super.onPause();
        a(u26.ON_PAUSE);
    }

    @Override
    public final void onResume() {
        super.onResume();
        lj4 lj4Var = this.a;
        if (lj4Var != null) {
            ((fn8) lj4Var.a).a();
        }
        a(u26.ON_RESUME);
    }

    @Override
    public final void onStart() {
        super.onStart();
        lj4 lj4Var = this.a;
        if (lj4Var != null) {
            fn8 fn8Var = (fn8) lj4Var.a;
            int i = fn8Var.a + 1;
            fn8Var.a = i;
            if (i == 1 && fn8Var.d) {
                fn8Var.f.e(u26.ON_START);
                fn8Var.d = false;
            }
        }
        a(u26.ON_START);
    }

    @Override
    public final void onStop() {
        super.onStop();
        a(u26.ON_STOP);
    }
}
