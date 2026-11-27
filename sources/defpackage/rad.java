package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
public final class rad implements Continuation, y2c, pjf {
    public static final rad a = new Object();

    @Override
    public final Object apply(Object obj) {
        return ((kte) obj).a();
    }

    @Override
    public final Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new wj2(intent);
        }
        return null;
    }
}
