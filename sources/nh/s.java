package nh;

import android.content.Context;
import lh.bb;
import org.telegram.messenger.Utilities;
public final class s extends bb {
    public final Utilities.Callback[] f15839j0;

    public s(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.f15839j0 = callbackArr;
    }

    @Override
    public final void e(int i10) {
        this.f15839j0[0].run(Integer.valueOf(i10));
    }
}
