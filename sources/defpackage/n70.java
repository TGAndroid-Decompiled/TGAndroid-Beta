package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Task;
public abstract class n70 {
    public static final long a = SystemClock.elapsedRealtime();
    public static final int b = 0;

    public static void a(Task task, Activity activity) {
        ?? obj = new Object();
        int incrementAndGet = vld.f.incrementAndGet();
        obj.a = incrementAndGet;
        vld.e.put(incrementAndGet, obj);
        vld.d.postDelayed(obj, 600000L);
        task.addOnCompleteListener(obj);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i = obj.a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", a);
        Fragment fragment = new Fragment();
        fragment.setArguments(bundle);
        int i2 = obj.a;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i2);
        beginTransaction.add(fragment, sb.toString()).commit();
    }

    public static void b(Activity activity, int i, int i2, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
                return;
            }
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException e) {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Exception sending pending result", e);
            }
        }
    }
}
