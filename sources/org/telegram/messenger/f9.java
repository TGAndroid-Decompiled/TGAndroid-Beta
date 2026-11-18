package org.telegram.messenger;

import android.os.Bundle;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.n60;
public final class f9 implements v0.g {
    public final CancellationToken f23861a;
    public final TaskCompletionSource f23862b;
    public final n60 f23863c;
    public final int d;
    public final Runnable[] f23864e;

    public f9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, n60 n60Var, int i7, Runnable[] runnableArr) {
        this.f23861a = cancellationToken;
        this.f23862b = taskCompletionSource;
        this.f23863c = n60Var;
        this.d = i7;
        this.f23864e = runnableArr;
    }

    @Override
    public final void a(Object obj) {
        w0.i iVar = (w0.i) obj;
        if (this.f23861a.isCancellationRequested()) {
            return;
        }
        boolean z10 = iVar instanceof w0.k;
        TaskCompletionSource taskCompletionSource = this.f23862b;
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
        TaskCompletionSource taskCompletionSource = this.f23862b;
        CancellationToken cancellationToken = this.f23861a;
        if (!cancellationToken.isCancellationRequested()) {
            try {
                String string = new JSONObject(((Bundle) nVar.f59025a.f6398a).getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON")).getJSONObject("data").getJSONObject("vp_token").getJSONArray("firebase").getString(0);
                this.f23863c.run();
                TLRPC.TL_auth_finishFirebasePnvLogin tL_auth_finishFirebasePnvLogin = new TLRPC.TL_auth_finishFirebasePnvLogin();
                tL_auth_finishFirebasePnvLogin.google_token = string;
                int i7 = this.d;
                e9 e9Var = new e9(i7, ConnectionsManager.getInstance(i7).sendRequestTyped(tL_auth_finishFirebasePnvLogin, new d3.b(1), new z3(1, cancellationToken, taskCompletionSource), 8), 1);
                Runnable[] runnableArr = this.f23864e;
                runnableArr[0] = e9Var;
                if (cancellationToken.isCancellationRequested()) {
                    runnableArr[0].run();
                }
            } catch (Exception e10) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }
}
