package defpackage;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class le2 implements ResultCallback {
    public final af2 a;
    public final oe2 b;

    public le2(oe2 oe2Var, af2 af2Var) {
        this.b = oe2Var;
        this.a = af2Var;
    }

    @Override
    public final void onComplete(Object obj) {
        int i;
        Void r6 = (Void) obj;
        af2 af2Var = this.a;
        if (af2Var.f.c) {
            i = 2;
        } else {
            i = 0;
        }
        ArrayList d = af2Var.d(i | 5);
        oe2 oe2Var = this.b;
        jn7.f(oe2Var.a).d(new ea2(this, d, (byte) 10));
        oe2Var.U1 = false;
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }

    @Override
    public final void onError(Throwable th) {
    }
}
