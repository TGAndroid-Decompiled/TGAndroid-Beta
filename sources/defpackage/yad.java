package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
public final class yad implements Continuation, z76, tq2, fme {
    public static final yad b = new yad((byte) 0);
    public final byte a;

    public yad(byte b2) {
        this.a = b2;
    }

    @Override
    public final void R(Object obj) {
        ((r05) obj).getClass();
    }

    @Override
    public final byte[] a(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 2:
                jg7 jg7Var = (jg7) am2Var.a(jg7.class);
                synchronized (pif.class) {
                    pif.a(new Object());
                }
                return new Object();
            default:
                return new lja((Context) am2Var.a(Context.class));
        }
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
