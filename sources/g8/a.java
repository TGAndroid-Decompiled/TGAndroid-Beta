package g8;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

public abstract class a {

    public static final long f6712a = TimeUnit.MINUTES.toMillis(10);

    public static final long f6713b = SystemClock.elapsedRealtime();

    public static final int f6714c = 0;

    public static void a(Task task, Activity activity) {
        t tVar = new t();
        int iIncrementAndGet = t.f6785f.incrementAndGet();
        tVar.f6786a = iIncrementAndGet;
        t.f6784e.put(iIncrementAndGet, tVar);
        t.d.postDelayed(tVar, f6712a);
        task.addOnCompleteListener(tVar);
        FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
        int i10 = tVar.f6786a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i10);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", f6713b);
        u uVar = new u();
        uVar.setArguments(bundle);
        int i11 = tVar.f6786a;
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb2.append(i11);
        fragmentTransactionBeginTransaction.add(uVar, sb2.toString()).commit();
    }

    public static void b(Activity activity, int i10, int i11, Intent intent) {
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(i10, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                pendingIntentCreatePendingResult.send(i11);
            } catch (PendingIntent.CanceledException e9) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e9);
                }
            }
        }
    }
}
