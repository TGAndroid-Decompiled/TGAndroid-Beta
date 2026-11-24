package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
public final class f6d implements Continuation, v56, aq2, ohe {
    public static final f6d b = new f6d((byte) 0);
    public final byte a;

    public f6d(byte b2) {
        this.a = b2;
    }

    @Override
    public final void G(Object obj) {
        ((ly4) obj).getClass();
    }

    @Override
    public final Object K(gl2 gl2Var) {
        switch (this.a) {
            case 2:
                ae7 ae7Var = (ae7) gl2Var.a(ae7.class);
                synchronized (zdf.class) {
                    zdf.a(new Object());
                }
                return new Object();
            default:
                return new sfa((Context) gl2Var.a(Context.class));
        }
    }

    @Override
    public final byte[] a(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override
    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
