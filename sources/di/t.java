package di;

import android.content.Context;
import bi.yd;
import org.telegram.messenger.Utilities;
public final class t extends yd {
    public final Utilities.Callback[] m0;

    public t(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.m0 = callbackArr;
    }

    @Override
    public final void e(int i10) {
        this.m0[0].run(Integer.valueOf(i10));
    }
}
