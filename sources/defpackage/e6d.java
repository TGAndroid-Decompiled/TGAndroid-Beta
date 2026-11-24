package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
public final class e6d implements SuccessContinuation, ohe, OnFailureListener {
    public static final e6d a = new Object();

    @Override
    public final byte[] a(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public final Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = fm9.h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }
}
