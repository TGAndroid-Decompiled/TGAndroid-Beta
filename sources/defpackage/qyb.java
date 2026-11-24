package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;
public final class qyb implements Callable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public qyb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override
    public final Object call() {
        pyb pybVar;
        Void lambda$emulateSendNFT$23;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.c;
                mf7 mf7Var = (mf7) this.d;
                li4 li4Var = (li4) this.e;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f;
                ti4 ti4Var = (ti4) this.g;
                synchronized (pyb.class) {
                    WeakReference weakReference = pyb.d;
                    if (weakReference != null) {
                        pybVar = (pyb) weakReference.get();
                    } else {
                        pybVar = null;
                    }
                    if (pybVar == null) {
                        pyb pybVar2 = new pyb(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor);
                        pybVar2.b();
                        pyb.d = new WeakReference(pybVar2);
                        pybVar = pybVar2;
                    }
                }
                return new ryb(mf7Var, pybVar, new wm9(li4Var, firebaseMessaging, ti4Var), context, scheduledThreadPoolExecutor);
            default:
                lambda$emulateSendNFT$23 = ((WalletEngine2) this.b).lambda$emulateSendNFT$23((AtomicBoolean) this.c, (String) this.d, (String) this.e, (String) this.f, (jac) this.g);
                return lambda$emulateSendNFT$23;
        }
    }
}
