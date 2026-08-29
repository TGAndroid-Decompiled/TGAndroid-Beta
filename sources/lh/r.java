package lh;

import android.content.Context;
import jh.ab;
import org.telegram.messenger.Utilities;
public final class r extends ab {
    public final Utilities.Callback[] f16143i0;

    public r(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.f16143i0 = callbackArr;
    }

    @Override
    public final void e(int i10) {
        this.f16143i0[0].run(Integer.valueOf(i10));
    }
}
