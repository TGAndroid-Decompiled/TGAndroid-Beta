package defpackage;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class kh1 implements ResultCallback {
    public final int a;
    public final lh1 b;

    public kh1(lh1 lh1Var, int i) {
        this.b = lh1Var;
        this.a = i;
    }

    @Override
    public final void onComplete(Object obj) {
        kk7.f(this.a).d(new q21(this, (List) obj, (byte) 24));
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }

    @Override
    public final void onError(Throwable th) {
    }
}
