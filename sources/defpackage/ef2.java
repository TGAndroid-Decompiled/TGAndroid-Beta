package defpackage;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ef2 implements ResultCallback {
    public final uf2 a;
    public final if2 b;

    public ef2(if2 if2Var, uf2 uf2Var) {
        this.b = if2Var;
        this.a = uf2Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        ArrayList d = this.a.d(7);
        if2 if2Var = this.b;
        nm7.f(if2Var.a).d(new ra2(this, d, (byte) 11));
        if2Var.U1 = false;
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }

    @Override
    public final void onError(Throwable th) {
    }
}
