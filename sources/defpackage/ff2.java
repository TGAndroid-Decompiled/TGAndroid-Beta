package defpackage;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ff2 implements ResultCallback {
    public final uf2 a;
    public final if2 b;

    public ff2(if2 if2Var, uf2 uf2Var) {
        this.b = if2Var;
        this.a = uf2Var;
    }

    @Override
    public final void onComplete(Object obj) {
        int i;
        Void r6 = (Void) obj;
        uf2 uf2Var = this.a;
        if (uf2Var.f.c) {
            i = 2;
        } else {
            i = 0;
        }
        ArrayList d = uf2Var.d(i | 5);
        if2 if2Var = this.b;
        nm7.f(if2Var.a).d(new ra2(this, d, (byte) 12));
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
