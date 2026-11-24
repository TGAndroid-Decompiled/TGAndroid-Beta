package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
public final class a8d implements Continuation, z0c, ahf {
    public static final a8d a = new Object();

    @Override
    public final Object apply(Object obj) {
        return ((wqe) obj).a();
    }

    @Override
    public final Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new ok2(intent);
        }
        return null;
    }
}
