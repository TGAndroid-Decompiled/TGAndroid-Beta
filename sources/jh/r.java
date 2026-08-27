package jh;

import android.content.Context;
import hh.gb;
import org.telegram.messenger.Utilities;

public final class r extends gb {

    public final Utilities.Callback[] f13878i0;

    public r(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.f13878i0 = callbackArr;
    }

    @Override
    public final void e(int i10) {
        this.f13878i0[0].run(Integer.valueOf(i10));
    }
}
