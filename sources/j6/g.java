package j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;
public final class g implements Runnable {
    public final int f9686a = 0;
    public final boolean f9687b;
    public final Object f9688c;
    public final Object d;
    public final Object e;

    public g(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f9688c = intent;
        this.d = context;
        this.f9687b = z10;
        this.e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int a2;
        switch (this.f9686a) {
            case 0:
                Intent intent2 = (Intent) this.f9688c;
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
                    if (this.f9687b) {
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
                    k2 k2Var = (k2) this.f9688c;
                    if (k2Var != null) {
                        k2Var.onTransitionAnimationStart(false, false);
                    }
                    ((k2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.f9687b);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, k2 k2Var, k2 k2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.f9688c = k2Var;
        this.d = k2Var2;
        this.f9687b = z10;
    }
}
