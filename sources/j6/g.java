package j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m2;
public final class g implements Runnable {
    public final int f14041a = 0;
    public final boolean f14042b;
    public final Object f14043c;
    public final Object d;
    public final Object f14044e;

    public g(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f14043c = intent;
        this.d = context;
        this.f14042b = z10;
        this.f14044e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int a2;
        switch (this.f14041a) {
            case 0:
                Intent intent2 = (Intent) this.f14043c;
                Context context = (Context) this.d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f14044e;
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
                    if (this.f14042b) {
                        pendingResult.setResultCode(a2);
                    }
                    pendingResult.finish();
                    return;
                } catch (Throwable th2) {
                    pendingResult.finish();
                    throw th2;
                }
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f14044e;
                if (actionBarLayout.f20092e == this) {
                    actionBarLayout.f20092e = null;
                    m2 m2Var = (m2) this.f14043c;
                    if (m2Var != null) {
                        m2Var.onTransitionAnimationStart(false, false);
                    }
                    ((m2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f14042b);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, m2 m2Var, m2 m2Var2, boolean z10) {
        this.f14044e = actionBarLayout;
        this.f14043c = m2Var;
        this.d = m2Var2;
        this.f14042b = z10;
    }
}
