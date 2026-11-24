package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class cse extends l6d {
    public final byte c;
    public final TaskCompletionSource d;

    public cse(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 0);
        this.c = b;
        this.d = taskCompletionSource;
    }

    @Override
    public final void U(Bundle bundle) {
        byte b = this.c;
        TaskCompletionSource taskCompletionSource = this.d;
        switch (b) {
            case 0:
                taskCompletionSource.setResult(bundle);
                return;
            case 1:
                taskCompletionSource.setResult(bundle);
                return;
            default:
                taskCompletionSource.setResult(bundle);
                return;
        }
    }
}
