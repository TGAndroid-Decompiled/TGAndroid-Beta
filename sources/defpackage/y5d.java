package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
public final class y5d implements Continuation, yyb, zef {
    public static final y5d a = new Object();

    @Override
    public final Object apply(Object obj) {
        return ((toe) obj).a();
    }

    @Override
    public final Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new aj2(intent);
        }
        return null;
    }
}
