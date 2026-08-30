package j8;

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
    public static final long f9241a = TimeUnit.MINUTES.toMillis(10);
    public static final long f9242b = SystemClock.elapsedRealtime();
    public static final int f9243c = 0;

    public static void a(Task task, Activity activity) {
        ?? obj = new Object();
        int incrementAndGet = u.f9308f.incrementAndGet();
        obj.f9309a = incrementAndGet;
        u.e.put(incrementAndGet, obj);
        u.d.postDelayed(obj, f9241a);
        task.addOnCompleteListener(obj);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i10 = obj.f9309a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i10);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", f9242b);
        Fragment fragment = new Fragment();
        fragment.setArguments(bundle);
        int i11 = obj.f9309a;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i11);
        beginTransaction.add(fragment, sb.toString()).commit();
    }

    public static void b(Activity activity, int i10, int i11, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i10, intent, 1073741824);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
                return;
            }
            return;
        }
        try {
            createPendingResult.send(i11);
        } catch (PendingIntent.CanceledException e) {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Exception sending pending result", e);
            }
        }
    }
}
