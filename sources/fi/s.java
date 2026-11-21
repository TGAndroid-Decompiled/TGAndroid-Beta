package fi;

import android.content.Context;
import di.jc;
import org.telegram.messenger.x10;
public final class s extends jc {
    public final x10[] f12550n0;

    public s(Context context, b bVar, x10[] x10VarArr) {
        super(context, bVar);
        this.f12550n0 = x10VarArr;
    }

    @Override
    public final void e(int i7) {
        this.f12550n0[0].a(Integer.valueOf(i7));
    }
}
