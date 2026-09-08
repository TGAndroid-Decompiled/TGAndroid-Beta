package j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n2;
public final class g implements Runnable {
    public final int f13559a = 0;
    public final boolean f13560b;
    public final Object f13561c;
    public final Object d;
    public final Object f13562e;

    public g(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f13561c = intent;
        this.d = context;
        this.f13560b = z10;
        this.f13562e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int a2;
        switch (this.f13559a) {
            case 0:
                Intent intent2 = (Intent) this.f13561c;
                Context context = (Context) this.d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f13562e;
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
                    if (this.f13560b) {
                        pendingResult.setResultCode(a2);
                    }
                    pendingResult.finish();
                    return;
                } catch (Throwable th2) {
                    pendingResult.finish();
                    throw th2;
                }
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f13562e;
                if (actionBarLayout.f20175e == this) {
                    actionBarLayout.f20175e = null;
                    n2 n2Var = (n2) this.f13561c;
                    if (n2Var != null) {
                        n2Var.onTransitionAnimationStart(false, false);
                    }
                    ((n2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f13560b);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, n2 n2Var, n2 n2Var2, boolean z10) {
        this.f13562e = actionBarLayout;
        this.f13561c = n2Var;
        this.d = n2Var2;
        this.f13560b = z10;
    }
}
