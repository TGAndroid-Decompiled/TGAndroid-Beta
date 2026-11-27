package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
public final class po8 extends r24 {
    final qo8 this$0;

    public static final class a extends r24 {
        final qo8 this$0;

        public a(qo8 qo8Var) {
            this.this$0 = qo8Var;
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            qo8 qo8Var = this.this$0;
            int i = qo8Var.a + 1;
            qo8Var.a = i;
            if (i == 1 && qo8Var.d) {
                qo8Var.f.e(y26.ON_START);
                qo8Var.d = false;
            }
        }
    }

    public po8(qo8 qo8Var) {
        this.this$0 = qo8Var;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = qb9.b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((qb9) findFragmentByTag).a = this.this$0.n;
        }
    }

    @Override
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        qo8 qo8Var = this.this$0;
        int i = qo8Var.b - 1;
        qo8Var.b = i;
        if (i == 0) {
            Handler handler = qo8Var.e;
            handler.getClass();
            handler.postDelayed(qo8Var.h, 700L);
        }
    }

    @Override
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        oo8.a(activity, new a(this.this$0));
    }

    @Override
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        qo8 qo8Var = this.this$0;
        int i = qo8Var.a - 1;
        qo8Var.a = i;
        if (i == 0 && qo8Var.c) {
            qo8Var.f.e(y26.ON_STOP);
            qo8Var.d = true;
        }
    }
}
