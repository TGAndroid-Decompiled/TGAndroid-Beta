package defpackage;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ke2 implements ResultCallback {
    public final af2 a;
    public final oe2 b;

    public ke2(oe2 oe2Var, af2 af2Var) {
        this.b = oe2Var;
        this.a = af2Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList d = this.a.d(7);
        oe2 oe2Var = this.b;
        jn7.f(oe2Var.a).d(new ea2(this, d, (byte) 9));
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
