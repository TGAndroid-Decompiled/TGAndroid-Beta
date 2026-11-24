package defpackage;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ud2 implements ResultCallback {
    public final je2 a;
    public final xd2 b;

    public ud2(xd2 xd2Var, je2 je2Var) {
        this.b = xd2Var;
        this.a = je2Var;
    }

    @Override
    public final void onComplete(Object obj) {
        int i;
        Void r6 = (Void) obj;
        je2 je2Var = this.a;
        if (je2Var.f.c) {
            i = 2;
        } else {
            i = 0;
        }
        ArrayList d = je2Var.d(i | 5);
        xd2 xd2Var = this.b;
        kk7.f(xd2Var.a).d(new n92(this, d, (byte) 11));
        xd2Var.U1 = false;
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }

    @Override
    public final void onError(Throwable th) {
    }
}
