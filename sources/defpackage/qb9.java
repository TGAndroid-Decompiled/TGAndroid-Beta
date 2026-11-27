package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
public class qb9 extends Fragment {
    public static final int b = 0;
    public xh4 a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final pb9 Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            pb9.a(activity);
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
            int i = qb9.b;
            ob9.a(activity, y26.ON_CREATE);
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = qb9.b;
            ob9.a(activity, y26.ON_RESUME);
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = qb9.b;
            ob9.a(activity, y26.ON_START);
        }

        @Override
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = qb9.b;
            ob9.a(activity, y26.ON_DESTROY);
        }

        @Override
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = qb9.b;
            ob9.a(activity, y26.ON_PAUSE);
        }

        @Override
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = qb9.b;
            ob9.a(activity, y26.ON_STOP);
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

    public final void a(y26 y26Var) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            ob9.a(activity, y26Var);
        }
    }

    @Override
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(y26.ON_CREATE);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        a(y26.ON_DESTROY);
        this.a = null;
    }

    @Override
    public final void onPause() {
        super.onPause();
        a(y26.ON_PAUSE);
    }

    @Override
    public final void onResume() {
        super.onResume();
        xh4 xh4Var = this.a;
        if (xh4Var != null) {
            ((qo8) xh4Var.b).a();
        }
        a(y26.ON_RESUME);
    }

    @Override
    public final void onStart() {
        super.onStart();
        xh4 xh4Var = this.a;
        if (xh4Var != null) {
            qo8 qo8Var = (qo8) xh4Var.b;
            int i = qo8Var.a + 1;
            qo8Var.a = i;
            if (i == 1 && qo8Var.d) {
                qo8Var.f.e(y26.ON_START);
                qo8Var.d = false;
            }
        }
        a(y26.ON_START);
    }

    @Override
    public final void onStop() {
        super.onStop();
        a(y26.ON_STOP);
    }
}
