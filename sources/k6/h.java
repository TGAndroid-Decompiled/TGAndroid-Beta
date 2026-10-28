package k6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.r2;
public final class h implements Runnable {
    public final int f16409a = 0;
    public final boolean f16410b;
    public final Object f16411c;
    public final Object d;
    public final Object e;

    public h(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f16411c = intent;
        this.d = context;
        this.f16410b = z10;
        this.e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int a2;
        switch (this.f16409a) {
            case 0:
                Intent intent2 = (Intent) this.f16411c;
                Context context = (Context) this.d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        a2 = FirebaseInstanceIdReceiver.b(intent);
                    } else {
                        a2 = FirebaseInstanceIdReceiver.a(context, intent2);
                    }
                    if (this.f16410b) {
                        pendingResult.setResultCode(a2);
                    }
                    pendingResult.finish();
                    return;
                } catch (Throwable th2) {
                    pendingResult.finish();
                    throw th2;
                }
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.e;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    r2 r2Var = (r2) this.f16411c;
                    if (r2Var != null) {
                        r2Var.onTransitionAnimationStart(false, false);
                    }
                    ((r2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.f16410b);
                    return;
                }
                return;
        }
    }

    public h(ActionBarLayout actionBarLayout, r2 r2Var, r2 r2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.f16411c = r2Var;
        this.d = r2Var2;
        this.f16410b = z10;
    }
}
