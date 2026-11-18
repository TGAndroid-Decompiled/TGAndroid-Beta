package ab;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q10;
import org.telegram.ui.Wallet.WalletEngine2;
public final class i0 implements Callable {
    public final int f941a;
    public final Object f942b;
    public final Object f943c;
    public final Object d;
    public final Object f944e;
    public final Object f945f;
    public final Object f946g;

    public i0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f941a = i7;
        this.f942b = obj;
        this.f943c = obj2;
        this.d = obj3;
        this.f944e = obj4;
        this.f945f = obj5;
        this.f946g = obj6;
    }

    @Override
    public final Object call() {
        h0 h0Var;
        Void lambda$emulateSendNFT$23;
        switch (this.f941a) {
            case 0:
                Context context = (Context) this.f942b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f943c;
                v vVar = (v) this.d;
                o9.g gVar = (o9.g) this.f944e;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f945f;
                va.d dVar = (va.d) this.f946g;
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
                lambda$emulateSendNFT$23 = ((WalletEngine2) this.f942b).lambda$emulateSendNFT$23((AtomicBoolean) this.f943c, (String) this.d, (String) this.f944e, (String) this.f945f, (q10) this.f946g);
                return lambda$emulateSendNFT$23;
        }
    }
}
