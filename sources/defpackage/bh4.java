package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class bh4 implements o13 {
    public final CancellationToken a;
    public final TaskCompletionSource b;
    public final kz5 c;
    public final int d;
    public final Runnable[] e;

    public bh4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, kz5 kz5Var, int i, Runnable[] runnableArr) {
        this.a = cancellationToken;
        this.b = taskCompletionSource;
        this.c = kz5Var;
        this.d = i;
        this.e = runnableArr;
    }

    @Override
    public final void M(Object obj) {
        us4 us4Var = (us4) obj;
        if (this.a.isCancellationRequested()) {
            return;
        }
        boolean z = us4Var instanceof pj7;
        TaskCompletionSource taskCompletionSource = this.b;
        if (z) {
            taskCompletionSource.trySetException(new Exception("EMPTY"));
        } else if (!(us4Var instanceof rs4) && !(us4Var instanceof vs4)) {
            taskCompletionSource.trySetException(us4Var);
        } else {
            taskCompletionSource.trySetException(new CancellationException());
        }
    }

    @Override
    public final void onResult(Object obj) {
        xs4 xs4Var = (xs4) obj;
        TaskCompletionSource taskCompletionSource = this.b;
        CancellationToken cancellationToken = this.a;
        if (!cancellationToken.isCancellationRequested()) {
            try {
                String string = new JSONObject(((Bundle) xs4Var.a.a).getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON")).getJSONObject("data").getJSONObject("vp_token").getJSONArray("firebase").getString(0);
                this.c.run();
                TLRPC.TL_auth_finishFirebasePnvLogin tL_auth_finishFirebasePnvLogin = new TLRPC.TL_auth_finishFirebasePnvLogin();
                tL_auth_finishFirebasePnvLogin.google_token = string;
                int i = this.d;
                gs2 gs2Var = new gs2(i, ConnectionsManager.getInstance(i).sendRequestTyped(tL_auth_finishFirebasePnvLogin, new hc((byte) 0), new ae2(cancellationToken, taskCompletionSource, (byte) 13), 8), (byte) 3);
                Runnable[] runnableArr = this.e;
                runnableArr[0] = gs2Var;
                if (cancellationToken.isCancellationRequested()) {
                    runnableArr[0].run();
                }
            } catch (Exception e) {
                taskCompletionSource.trySetException(e);
            }
        }
    }
}
