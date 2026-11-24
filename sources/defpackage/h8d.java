package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
public final class h8d implements Continuation, v76, lr2, pje {
    public static final h8d b = new h8d((byte) 0);
    public final byte a;

    public h8d(byte b2) {
        this.a = b2;
    }

    @Override
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 2:
                cg7 cg7Var = (cg7) sm2Var.a(cg7.class);
                synchronized (agf.class) {
                    agf.a(new Object());
                }
                return new Object();
            default:
                return new uha((Context) sm2Var.a(Context.class));
        }
    }

    @Override
    public final byte[] a(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override
    public final void c(Object obj) {
        ((m05) obj).getClass();
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
