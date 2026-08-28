package ih;

import android.content.Context;
import gh.gb;
import org.telegram.messenger.Utilities;
public final class t extends gb {
    public final Utilities.Callback[] f12141i0;

    public t(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.f12141i0 = callbackArr;
    }

    @Override
    public final void e(int i9) {
        this.f12141i0[0].run(Integer.valueOf(i9));
    }
}
