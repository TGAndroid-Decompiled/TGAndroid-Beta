package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessagingService;
public final class c3d extends Binder {
    public final v34 a;

    public c3d(v34 v34Var) {
        this.a = v34Var;
    }

    public final void a(d3d d3dVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = d3dVar.a;
            FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.a.b;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            firebaseMessagingService.a.execute(new cv2(firebaseMessagingService, intent, taskCompletionSource, (byte) 22));
            taskCompletionSource.getTask().addOnCompleteListener(new ic((byte) 1), new ftb(d3dVar, (byte) 25));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
