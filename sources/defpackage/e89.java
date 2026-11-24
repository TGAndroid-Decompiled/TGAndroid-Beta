package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
public class e89 extends Fragment {
    public static final int b = 0;
    public pj4 a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final d89 Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            d89.a(activity);
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
            int i = e89.b;
            c89.a(activity, u06.ON_CREATE);
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = e89.b;
            c89.a(activity, u06.ON_RESUME);
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = e89.b;
            c89.a(activity, u06.ON_START);
        }

        @Override
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = e89.b;
            c89.a(activity, u06.ON_DESTROY);
        }

        @Override
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = e89.b;
            c89.a(activity, u06.ON_PAUSE);
        }

        @Override
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = e89.b;
            c89.a(activity, u06.ON_STOP);
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

    public final void a(u06 u06Var) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            c89.a(activity, u06Var);
        }
    }

    @Override
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(u06.ON_CREATE);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        a(u06.ON_DESTROY);
        this.a = null;
    }

    @Override
    public final void onPause() {
        super.onPause();
        a(u06.ON_PAUSE);
    }

    @Override
    public final void onResume() {
        super.onResume();
        pj4 pj4Var = this.a;
        if (pj4Var != null) {
            ((dl8) pj4Var.b).a();
        }
        a(u06.ON_RESUME);
    }

    @Override
    public final void onStart() {
        super.onStart();
        pj4 pj4Var = this.a;
        if (pj4Var != null) {
            dl8 dl8Var = (dl8) pj4Var.b;
            int i = dl8Var.a + 1;
            dl8Var.a = i;
            if (i == 1 && dl8Var.d) {
                dl8Var.f.e(u06.ON_START);
                dl8Var.d = false;
            }
        }
        a(u06.ON_START);
    }

    @Override
    public final void onStop() {
        super.onStop();
        a(u06.ON_STOP);
    }
}
