package f8;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
public abstract class a {
    public static final long f5911a = TimeUnit.MINUTES.toMillis(10);
    public static final long f5912b = SystemClock.elapsedRealtime();
    public static final int f5913c = 0;

    public static void a(Task task, Activity activity) {
        ?? obj = new Object();
        int incrementAndGet = u.f5985f.incrementAndGet();
        obj.f5986a = incrementAndGet;
        u.f5984e.put(incrementAndGet, obj);
        u.d.postDelayed(obj, f5911a);
        task.addOnCompleteListener(obj);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i9 = obj.f5986a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i9);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", f5912b);
        Fragment fragment = new Fragment();
        fragment.setArguments(bundle);
        int i10 = obj.f5986a;
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb2.append(i10);
        beginTransaction.add(fragment, sb2.toString()).commit();
    }

    public static void b(Activity activity, int i9, int i10, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i9, intent, 1073741824);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
                return;
            }
            return;
        }
        try {
            createPendingResult.send(i10);
        } catch (PendingIntent.CanceledException e10) {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Exception sending pending result", e10);
            }
        }
    }
}
