package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
public final class sg0 extends b99 {
    @Override
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            ((BasePendingResult) message.obj).e(Status.n);
            return;
        }
        Pair pair = (Pair) message.obj;
        baf bafVar = (baf) pair.first;
        ie9 ie9Var = (ie9) pair.second;
        try {
            bafVar.a(ie9Var);
        } catch (RuntimeException e) {
            BasePendingResult.m(ie9Var);
            throw e;
        }
    }
}
