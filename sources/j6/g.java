package j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n2;
public final class g implements Runnable {
    public final int f14006a = 0;
    public final boolean f14007b;
    public final Object f14008c;
    public final Object d;
    public final Object f14009e;

    public g(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f14008c = intent;
        this.d = context;
        this.f14007b = z10;
        this.f14009e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int a2;
        switch (this.f14006a) {
            case 0:
                Intent intent2 = (Intent) this.f14008c;
                Context context = (Context) this.d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f14009e;
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
                    if (this.f14007b) {
                        pendingResult.setResultCode(a2);
                    }
                    pendingResult.finish();
                    return;
                } catch (Throwable th2) {
                    pendingResult.finish();
                    throw th2;
                }
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f14009e;
                if (actionBarLayout.f20318e == this) {
                    actionBarLayout.f20318e = null;
                    n2 n2Var = (n2) this.f14008c;
                    if (n2Var != null) {
                        n2Var.onTransitionAnimationStart(false, false);
                    }
                    ((n2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f14007b);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, n2 n2Var, n2 n2Var2, boolean z10) {
        this.f14009e = actionBarLayout;
        this.f14008c = n2Var;
        this.d = n2Var2;
        this.f14007b = z10;
    }
}
