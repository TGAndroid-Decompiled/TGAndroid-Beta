package ab;

import a8.r7;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import hi.b7;
import java.util.concurrent.ExecutionException;
public final class t implements Continuation, b7 {
    public final int f996a;
    public final String f997b;

    public t(r7 r7Var, String str) {
        this.f996a = 1;
        this.f997b = str;
    }

    @Override
    public Bitmap d(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f997b, options);
    }

    @Override
    public Object then(Task task) {
        switch (this.f996a) {
            case 0:
                if (task.isSuccessful()) {
                    String str = (String) task.getResult();
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = this.f997b;
                        if (str.endsWith(str2)) {
                            return str2;
                        }
                    }
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                throw new ExecutionException(task.getException());
            default:
                if (!task.isSuccessful()) {
                    return Tasks.forException(r7.s(task));
                }
                return Tasks.forResult(new Pair((String) task.getResult(), this.f997b));
        }
    }

    public t(String str, int i7) {
        this.f996a = i7;
        this.f997b = str;
    }
}
