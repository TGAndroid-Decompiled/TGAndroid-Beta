package ab;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.v10;
import org.telegram.ui.Wallet.WalletEngine2;
public final class i0 implements Callable {
    public final int f943a;
    public final Object f944b;
    public final Object f945c;
    public final Object d;
    public final Object f946e;
    public final Object f947f;
    public final Object f948g;

    public i0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f943a = i7;
        this.f944b = obj;
        this.f945c = obj2;
        this.d = obj3;
        this.f946e = obj4;
        this.f947f = obj5;
        this.f948g = obj6;
    }

    @Override
    public final Object call() {
        h0 h0Var;
        Void lambda$emulateSendNFT$20;
        switch (this.f943a) {
            case 0:
                Context context = (Context) this.f944b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f945c;
                v vVar = (v) this.d;
                o9.g gVar = (o9.g) this.f946e;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f947f;
                va.d dVar = (va.d) this.f948g;
                synchronized (h0.class) {
                    try {
                        WeakReference weakReference = h0.d;
                        if (weakReference != null) {
                            h0Var = (h0) weakReference.get();
                        } else {
                            h0Var = null;
                        }
                        if (h0Var == null) {
                            h0 h0Var2 = new h0(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor);
                            h0Var2.b();
                            h0.d = new WeakReference(h0Var2);
                            h0Var = h0Var2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new j0(vVar, h0Var, new android.support.v4.media.session.a0(gVar, firebaseMessaging, dVar, 6), context, scheduledThreadPoolExecutor);
            default:
                lambda$emulateSendNFT$20 = ((WalletEngine2) this.f944b).lambda$emulateSendNFT$20((AtomicBoolean) this.f945c, (String) this.d, (String) this.f946e, (String) this.f947f, (v10) this.f948g);
                return lambda$emulateSendNFT$20;
        }
    }
}
