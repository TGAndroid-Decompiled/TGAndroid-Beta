package org.telegram.messenger;

import android.os.Bundle;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jd0;
public final class g9 implements v0.g {
    public final CancellationToken f23707a;
    public final TaskCompletionSource f23708b;
    public final jd0 f23709c;
    public final int d;
    public final Runnable[] f23710e;

    public g9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, jd0 jd0Var, int i7, Runnable[] runnableArr) {
        this.f23707a = cancellationToken;
        this.f23708b = taskCompletionSource;
        this.f23709c = jd0Var;
        this.d = i7;
        this.f23710e = runnableArr;
    }

    @Override
    public final void a(Object obj) {
        w0.i iVar = (w0.i) obj;
        if (this.f23707a.isCancellationRequested()) {
            return;
        }
        boolean z10 = iVar instanceof w0.k;
        TaskCompletionSource taskCompletionSource = this.f23708b;
        if (z10) {
            taskCompletionSource.trySetException(new Exception("EMPTY"));
        } else if (!(iVar instanceof w0.g) && !(iVar instanceof w0.j)) {
            taskCompletionSource.trySetException(iVar);
        } else {
            taskCompletionSource.trySetException(new CancellationException());
        }
    }

    @Override
    public final void onResult(Object obj) {
        v0.n nVar = (v0.n) obj;
        TaskCompletionSource taskCompletionSource = this.f23708b;
        CancellationToken cancellationToken = this.f23707a;
        if (!cancellationToken.isCancellationRequested()) {
            try {
                String string = new JSONObject(((Bundle) nVar.f58458a.f6115a).getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON")).getJSONObject("data").getJSONObject("vp_token").getJSONArray("firebase").getString(0);
                this.f23709c.run();
                TLRPC.TL_auth_finishFirebasePnvLogin tL_auth_finishFirebasePnvLogin = new TLRPC.TL_auth_finishFirebasePnvLogin();
                tL_auth_finishFirebasePnvLogin.google_token = string;
                int i7 = this.d;
                f9 f9Var = new f9(i7, ConnectionsManager.getInstance(i7).sendRequestTyped(tL_auth_finishFirebasePnvLogin, new d3.b(1), new x3(1, cancellationToken, taskCompletionSource), 8), 1);
                Runnable[] runnableArr = this.f23710e;
                runnableArr[0] = f9Var;
                if (cancellationToken.isCancellationRequested()) {
                    runnableArr[0].run();
                }
            } catch (Exception e10) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }
}
