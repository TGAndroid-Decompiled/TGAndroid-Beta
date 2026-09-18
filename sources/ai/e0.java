package ai;

import android.content.Context;
import org.telegram.messenger.Utilities;
public final class e0 extends yh.n8 {
    public final Utilities.Callback[] m0;

    public e0(Context context, d dVar, Utilities.Callback[] callbackArr) {
        super(context, dVar);
        this.m0 = callbackArr;
    }

    @Override
    public final void e(int i10) {
        this.m0[0].run(Integer.valueOf(i10));
    }
}
