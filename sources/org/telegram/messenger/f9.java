package org.telegram.messenger;

import android.os.Bundle;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bd0;
public final class f9 implements v0.g {
    public final CancellationToken f23966a;
    public final TaskCompletionSource f23967b;
    public final bd0 f23968c;
    public final int d;
    public final Runnable[] f23969e;

    public f9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, bd0 bd0Var, int i7, Runnable[] runnableArr) {
        this.f23966a = cancellationToken;
        this.f23967b = taskCompletionSource;
        this.f23968c = bd0Var;
        this.d = i7;
        this.f23969e = runnableArr;
    }

    @Override
    public final void T(Object obj) {
        w0.i iVar = (w0.i) obj;
        if (this.f23966a.isCancellationRequested()) {
            return;
        }
        boolean z10 = iVar instanceof w0.k;
        TaskCompletionSource taskCompletionSource = this.f23967b;
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
        TaskCompletionSource taskCompletionSource = this.f23967b;
        CancellationToken cancellationToken = this.f23966a;
        if (!cancellationToken.isCancellationRequested()) {
            try {
                String string = new JSONObject(((Bundle) nVar.f59150a.f6389a).getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON")).getJSONObject("data").getJSONObject("vp_token").getJSONArray("firebase").getString(0);
                this.f23968c.run();
                TLRPC.TL_auth_finishFirebasePnvLogin tL_auth_finishFirebasePnvLogin = new TLRPC.TL_auth_finishFirebasePnvLogin();
                tL_auth_finishFirebasePnvLogin.google_token = string;
                int i7 = this.d;
                e9 e9Var = new e9(i7, ConnectionsManager.getInstance(i7).sendRequestTyped(tL_auth_finishFirebasePnvLogin, new d3.b(1), new z3(1, cancellationToken, taskCompletionSource), 8), 1);
                Runnable[] runnableArr = this.f23969e;
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
