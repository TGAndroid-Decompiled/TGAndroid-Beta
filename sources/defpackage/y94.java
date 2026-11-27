package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnectionFactory;
public final class y94 implements Continuation, NativeLifecycleLock.NativePointerCallable, a8b {
    public final byte a;
    public final String b;

    public y94(am2 am2Var, String str) {
        this.a = (byte) 2;
        this.b = str;
    }

    @Override
    public final Object call(long j) {
        MediaStream lambda$createLocalMediaStream$1;
        lambda$createLocalMediaStream$1 = PeerConnectionFactory.lambda$createLocalMediaStream$1(this.b, j);
        return lambda$createLocalMediaStream$1;
    }

    @Override
    public final Bitmap i(BitmapFactory.Options options) {
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
                    return Tasks.forException(am2.z(task));
                }
                return Tasks.forResult(new Pair((String) task.getResult(), str));
        }
    }

    public y94(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
