package oh;

import android.content.Context;
import mh.bb;
import org.telegram.messenger.Utilities;
public final class r extends bb {
    public final Utilities.Callback[] f17675j0;

    public r(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.f17675j0 = callbackArr;
    }

    @Override
    public final void e(int i10) {
        this.f17675j0[0].run(Integer.valueOf(i10));
    }
}
