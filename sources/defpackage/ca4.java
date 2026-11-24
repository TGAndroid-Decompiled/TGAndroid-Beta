package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
public final class ca4 implements Continuation, e6b {
    public final byte a;
    public final String b;

    public ca4(sm2 sm2Var, String str) {
        this.a = (byte) 2;
        this.b = str;
    }

    @Override
    public final Bitmap n(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b, options);
    }

    @Override
    public final Object then(Task task) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 1:
                if (task.isSuccessful()) {
                    String str2 = (String) task.getResult();
                    if (!TextUtils.isEmpty(str2) && str2.endsWith(str)) {
                        return str;
                    }
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                throw new ExecutionException(task.getException());
            default:
                if (!task.isSuccessful()) {
                    return Tasks.forException(sm2.y(task));
                }
                return Tasks.forResult(new Pair((String) task.getResult(), str));
        }
    }

    public ca4(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
