package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
public final class cl8 extends w14 {
    final dl8 this$0;

    public static final class a extends w14 {
        final dl8 this$0;

        public a(dl8 dl8Var) {
            this.this$0 = dl8Var;
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            dl8 dl8Var = this.this$0;
            int i = dl8Var.a + 1;
            dl8Var.a = i;
            if (i == 1 && dl8Var.d) {
                dl8Var.f.e(u06.ON_START);
                dl8Var.d = false;
            }
        }
    }

    public cl8(dl8 dl8Var) {
        this.this$0 = dl8Var;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = e89.b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((e89) findFragmentByTag).a = this.this$0.n;
        }
    }

    @Override
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        dl8 dl8Var = this.this$0;
        int i = dl8Var.b - 1;
        dl8Var.b = i;
        if (i == 0) {
            Handler handler = dl8Var.e;
            handler.getClass();
            handler.postDelayed(dl8Var.h, 700L);
        }
    }

    @Override
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        bl8.a(activity, new a(this.this$0));
    }

    @Override
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        dl8 dl8Var = this.this$0;
        int i = dl8Var.a - 1;
        dl8Var.a = i;
        if (i == 0 && dl8Var.c) {
            dl8Var.f.e(u06.ON_STOP);
            dl8Var.d = true;
        }
    }
}
