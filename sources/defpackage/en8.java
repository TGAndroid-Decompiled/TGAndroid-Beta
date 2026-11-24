package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
public final class en8 extends h34 {
    final fn8 this$0;

    public static final class a extends h34 {
        final fn8 this$0;

        public a(fn8 fn8Var) {
            this.this$0 = fn8Var;
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            fn8 fn8Var = this.this$0;
            int i = fn8Var.a + 1;
            fn8Var.a = i;
            if (i == 1 && fn8Var.d) {
                fn8Var.f.e(u26.ON_START);
                fn8Var.d = false;
            }
        }
    }

    public en8(fn8 fn8Var) {
        this.this$0 = fn8Var;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = ga9.b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((ga9) findFragmentByTag).a = this.this$0.n;
        }
    }

    @Override
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        fn8 fn8Var = this.this$0;
        int i = fn8Var.b - 1;
        fn8Var.b = i;
        if (i == 0) {
            Handler handler = fn8Var.e;
            handler.getClass();
            handler.postDelayed(fn8Var.h, 700L);
        }
    }

    @Override
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        dn8.a(activity, new a(this.this$0));
    }

    @Override
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        fn8 fn8Var = this.this$0;
        int i = fn8Var.a - 1;
        fn8Var.a = i;
        if (i == 0 && fn8Var.c) {
            fn8Var.f.e(u26.ON_STOP);
            fn8Var.d = true;
        }
    }
}
