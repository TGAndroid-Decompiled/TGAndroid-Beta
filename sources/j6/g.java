package j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.p2;
public final class g implements Runnable {
    public final int f11788a = 0;
    public final boolean f11789b;
    public final Object f11790c;
    public final Object d;
    public final Object e;

    public g(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f11790c = intent;
        this.d = context;
        this.f11789b = z10;
        this.e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int a2;
        switch (this.f11788a) {
            case 0:
                Intent intent2 = (Intent) this.f11790c;
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
                    if (this.f11789b) {
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
                    p2 p2Var = (p2) this.f11790c;
                    if (p2Var != null) {
                        p2Var.onTransitionAnimationStart(false, false);
                    }
                    ((p2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f11789b);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, p2 p2Var, p2 p2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.f11790c = p2Var;
        this.d = p2Var2;
        this.f11789b = z10;
    }
}
