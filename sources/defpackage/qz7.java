package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public abstract class qz7 {
    public static void a(Context context, int i, icc iccVar) {
        if (!f11.i) {
            return;
        }
        context.getClass();
        vj0 vj0Var = new vj0(context, (byte) 1);
        id idVar = new id(3, null, context);
        idVar.q(500L);
        ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.initPasskeyRegistration(), new ic((byte) 0), new g45(idVar, iccVar, vj0Var, context, i));
    }

    public static void b(boolean[] zArr, ih6 ih6Var, boolean z, vj0 vj0Var, Context context, int i, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (zArr[0]) {
            return;
        }
        if (tL_error != null) {
            ih6Var.a(0L, null, tL_error.text);
            return;
        }
        try {
            fv4 fv4Var = new fv4(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(fv4Var);
            av4 av4Var = new av4(sl2.k(arrayList), !z);
            try {
                CancellationSignal cancellationSignal = new CancellationSignal();
                vj0Var.d(context, av4Var, cancellationSignal, context.getMainExecutor(), new oz7(ih6Var, context, i));
                runnableArr[0] = new lw3(cancellationSignal, (byte) 29);
            } catch (Exception e) {
                ih6Var.a(0L, null, e.getMessage());
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
            ih6Var.a(0L, null, e2.getMessage());
        }
    }
}
