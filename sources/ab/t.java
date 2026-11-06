package ab;

import a8.r7;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import fi.c7;
import java.util.concurrent.ExecutionException;
public final class t implements Continuation, c7 {
    public final int f997a;
    public final String f998b;

    public t(r7 r7Var, String str) {
        this.f997a = 1;
        this.f998b = str;
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f998b, options);
    }

    @Override
    public Object then(Task task) {
        switch (this.f997a) {
            case 0:
                if (task.isSuccessful()) {
                    String str = (String) task.getResult();
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = this.f998b;
                        if (str.endsWith(str2)) {
                            return str2;
                        }
                    }
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                throw new ExecutionException(task.getException());
            default:
                if (!task.isSuccessful()) {
                    return Tasks.forException(r7.q(task));
                }
                return Tasks.forResult(new Pair((String) task.getResult(), this.f998b));
        }
    }

    public t(String str, int i7) {
        this.f997a = i7;
        this.f998b = str;
    }
}
