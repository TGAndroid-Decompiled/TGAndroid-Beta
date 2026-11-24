package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public abstract class ly7 {
    public static void a(Context context, int i, jac jacVar) {
        if (!e21.i) {
            return;
        }
        context.getClass();
        uk0 uk0Var = new uk0(context, (byte) 1);
        he heVar = new he(3, null, context);
        heVar.q(500L);
        ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.initPasskeyRegistration(), new kc((byte) 0), new v35(heVar, jacVar, uk0Var, context, i));
    }

    public static void b(boolean[] zArr, fh6 fh6Var, boolean z, uk0 uk0Var, Context context, int i, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (zArr[0]) {
            return;
        }
        if (tL_error != null) {
            fh6Var.a(0L, null, tL_error.text);
            return;
        }
        try {
            cv4 cv4Var = new cv4(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(cv4Var);
            xu4 xu4Var = new xu4(km2.k(arrayList), !z);
            try {
                CancellationSignal cancellationSignal = new CancellationSignal();
                uk0Var.e(context, xu4Var, cancellationSignal, context.getMainExecutor(), new jy7(fh6Var, context, i));
                runnableArr[0] = new a14(cancellationSignal, (byte) 23);
            } catch (Exception e) {
                fh6Var.a(0L, null, e.getMessage());
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
            fh6Var.a(0L, null, e2.getMessage());
        }
    }
}
