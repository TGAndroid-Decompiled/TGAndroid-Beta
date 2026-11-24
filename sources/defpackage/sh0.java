package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
public final class sh0 extends q79 {
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
        m7f m7fVar = (m7f) pair.first;
        uc9 uc9Var = (uc9) pair.second;
        try {
            m7fVar.a(uc9Var);
        } catch (RuntimeException e) {
            BasePendingResult.m(uc9Var);
            throw e;
        }
    }
}
