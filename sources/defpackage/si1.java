package defpackage;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class si1 implements ResultCallback {
    public final int a;
    public final ti1 b;

    public si1(ti1 ti1Var, int i) {
        this.b = ti1Var;
        this.a = i;
    }

    @Override
    public final void onComplete(Object obj) {
        nm7.f(this.a).d(new y31(this, (List) obj, (byte) 25));
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }

    @Override
    public final void onError(Throwable th) {
    }
}
