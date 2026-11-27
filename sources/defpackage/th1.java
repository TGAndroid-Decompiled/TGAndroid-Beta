package defpackage;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class th1 implements ResultCallback {
    public final int a;
    public final uh1 b;

    public th1(uh1 uh1Var, int i) {
        this.b = uh1Var;
        this.a = i;
    }

    @Override
    public final void onComplete(Object obj) {
        jn7.f(this.a).d(new z21(this, (List) obj, (byte) 24));
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }

    @Override
    public final void onError(Throwable th) {
    }
}
