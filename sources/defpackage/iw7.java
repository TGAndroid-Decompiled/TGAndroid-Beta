package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public abstract class iw7 {
    public static void a(Context context, int i, i8c i8cVar) {
        if (!w01.i) {
            return;
        }
        context.getClass();
        p13 p13Var = new p13(context, (byte) 0);
        hd hdVar = new hd(3, null, context);
        hdVar.q(500L);
        ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.initPasskeyRegistration(), new hc((byte) 0), new u15(hdVar, i8cVar, p13Var, context, i));
    }

    public static void b(boolean[] zArr, ef6 ef6Var, boolean z, p13 p13Var, Context context, int i, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (zArr[0]) {
            return;
        }
        if (tL_error != null) {
            ef6Var.a(0L, null, tL_error.text);
            return;
        }
        try {
            bt4 bt4Var = new bt4(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(bt4Var);
            ws4 ws4Var = new ws4(yk2.k(arrayList), !z);
            try {
                CancellationSignal cancellationSignal = new CancellationSignal();
                p13Var.d(context, ws4Var, cancellationSignal, context.getMainExecutor(), new gw7(ef6Var, context, i));
                runnableArr[0] = new s54(cancellationSignal, (byte) 16);
            } catch (Exception e) {
                ef6Var.a(0L, null, e.getMessage());
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
            ef6Var.a(0L, null, e2.getMessage());
        }
    }
}
