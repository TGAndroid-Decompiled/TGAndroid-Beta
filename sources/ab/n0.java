package ab;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class n0 extends Binder {
    public final cb.c f975a;

    public n0(cb.c cVar) {
        this.f975a = cVar;
    }

    public final void a(o0 o0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = o0Var.f978a;
            h hVar = (h) this.f975a.f4868b;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            hVar.f932a.execute(new aa.r(hVar, intent, taskCompletionSource, 1));
            taskCompletionSource.getTask().addOnCompleteListener(new d3.b(3), new a1.c(o0Var, 6));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
