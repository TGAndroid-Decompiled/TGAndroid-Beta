package org.telegram.messenger;

import android.os.Bundle;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o60;
public final class g9 implements v0.g {
    public final CancellationToken f24070a;
    public final TaskCompletionSource f24071b;
    public final o60 f24072c;
    public final int d;
    public final Runnable[] f24073e;

    public g9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, o60 o60Var, int i7, Runnable[] runnableArr) {
        this.f24070a = cancellationToken;
        this.f24071b = taskCompletionSource;
        this.f24072c = o60Var;
        this.d = i7;
        this.f24073e = runnableArr;
    }

    @Override
    public final void a(Object obj) {
        w0.i iVar = (w0.i) obj;
        if (this.f24070a.isCancellationRequested()) {
            return;
        }
        boolean z10 = iVar instanceof w0.k;
        TaskCompletionSource taskCompletionSource = this.f24071b;
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
        TaskCompletionSource taskCompletionSource = this.f24071b;
        CancellationToken cancellationToken = this.f24070a;
        if (!cancellationToken.isCancellationRequested()) {
            try {
                String string = new JSONObject(((Bundle) nVar.f59033a.f6390a).getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON")).getJSONObject("data").getJSONObject("vp_token").getJSONArray("firebase").getString(0);
                this.f24072c.run();
                TLRPC.TL_auth_finishFirebasePnvLogin tL_auth_finishFirebasePnvLogin = new TLRPC.TL_auth_finishFirebasePnvLogin();
                tL_auth_finishFirebasePnvLogin.google_token = string;
                int i7 = this.d;
                f9 f9Var = new f9(i7, ConnectionsManager.getInstance(i7).sendRequestTyped(tL_auth_finishFirebasePnvLogin, new d3.b(1), new z3(1, cancellationToken, taskCompletionSource), 8), 1);
                Runnable[] runnableArr = this.f24073e;
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
