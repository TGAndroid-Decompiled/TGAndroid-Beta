package org.telegram.messenger;

import android.os.Bundle;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zc0;
public final class h9 implements v0.g {
    public final CancellationToken f22853a;
    public final TaskCompletionSource f22854b;
    public final zc0 f22855c;
    public final int d;
    public final Runnable[] f22856e;

    public h9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, zc0 zc0Var, int i7, Runnable[] runnableArr) {
        this.f22853a = cancellationToken;
        this.f22854b = taskCompletionSource;
        this.f22855c = zc0Var;
        this.d = i7;
        this.f22856e = runnableArr;
    }

    @Override
    public final void a(Object obj) {
        w0.i iVar = (w0.i) obj;
        if (this.f22853a.isCancellationRequested()) {
            return;
        }
        boolean z9 = iVar instanceof w0.k;
        TaskCompletionSource taskCompletionSource = this.f22854b;
        if (z9) {
            taskCompletionSource.trySetException(new Exception("EMPTY"));
        } else if (!(iVar instanceof w0.g) && !(iVar instanceof w0.j)) {
            taskCompletionSource.trySetException(iVar);
        } else {
            taskCompletionSource.trySetException(new CancellationException());
        }
    }

    @Override
    public final void onResult(Object obj) {
        v0.o oVar = (v0.o) obj;
        TaskCompletionSource taskCompletionSource = this.f22854b;
        CancellationToken cancellationToken = this.f22853a;
        if (!cancellationToken.isCancellationRequested()) {
            try {
                String string = new JSONObject(((Bundle) oVar.f56883a.f3500a).getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON")).getJSONObject("data").getJSONObject("vp_token").getJSONArray("firebase").getString(0);
                this.f22855c.run();
                TLRPC.TL_auth_finishFirebasePnvLogin tL_auth_finishFirebasePnvLogin = new TLRPC.TL_auth_finishFirebasePnvLogin();
                tL_auth_finishFirebasePnvLogin.google_token = string;
                int i7 = this.d;
                g9 g9Var = new g9(i7, ConnectionsManager.getInstance(i7).sendRequestTyped(tL_auth_finishFirebasePnvLogin, new d3.b(1), new x3(1, cancellationToken, taskCompletionSource), 8), 1);
                Runnable[] runnableArr = this.f22856e;
                runnableArr[0] = g9Var;
                if (cancellationToken.isCancellationRequested()) {
                    runnableArr[0].run();
                }
            } catch (Exception e10) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }
}
