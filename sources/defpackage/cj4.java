package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class cj4 implements h23 {
    public final CancellationToken a;
    public final TaskCompletionSource b;
    public final z56 c;
    public final int d;
    public final Runnable[] e;

    public cj4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, z56 z56Var, int i, Runnable[] runnableArr) {
        this.a = cancellationToken;
        this.b = taskCompletionSource;
        this.c = z56Var;
        this.d = i;
        this.e = runnableArr;
    }

    @Override
    public final void B(Object obj) {
        yu4 yu4Var = (yu4) obj;
        if (this.a.isCancellationRequested()) {
            return;
        }
        boolean z = yu4Var instanceof om7;
        TaskCompletionSource taskCompletionSource = this.b;
        if (z) {
            taskCompletionSource.trySetException(new Exception("EMPTY"));
        } else if (!(yu4Var instanceof vu4) && !(yu4Var instanceof zu4)) {
            taskCompletionSource.trySetException(yu4Var);
        } else {
            taskCompletionSource.trySetException(new CancellationException());
        }
    }

    @Override
    public final void onResult(Object obj) {
        bv4 bv4Var = (bv4) obj;
        TaskCompletionSource taskCompletionSource = this.b;
        CancellationToken cancellationToken = this.a;
        if (!cancellationToken.isCancellationRequested()) {
            try {
                String string = new JSONObject(((Bundle) bv4Var.a.a).getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON")).getJSONObject("data").getJSONObject("vp_token").getJSONArray("firebase").getString(0);
                this.c.run();
                TLRPC.TL_auth_finishFirebasePnvLogin tL_auth_finishFirebasePnvLogin = new TLRPC.TL_auth_finishFirebasePnvLogin();
                tL_auth_finishFirebasePnvLogin.google_token = string;
                int i = this.d;
                zs2 zs2Var = new zs2(i, ConnectionsManager.getInstance(i).sendRequestTyped(tL_auth_finishFirebasePnvLogin, new ic((byte) 0), new qe2(cancellationToken, taskCompletionSource, (byte) 13), 8), (byte) 3);
                Runnable[] runnableArr = this.e;
                runnableArr[0] = zs2Var;
                if (cancellationToken.isCancellationRequested()) {
                    runnableArr[0].run();
                }
            } catch (Exception e) {
                taskCompletionSource.trySetException(e);
            }
        }
    }
}
