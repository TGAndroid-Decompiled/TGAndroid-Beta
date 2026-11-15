package fi;

import android.content.Context;
import di.gc;
import org.telegram.messenger.z10;
public final class s extends gc {
    public final z10[] f12296n0;

    public s(Context context, b bVar, z10[] z10VarArr) {
        super(context, bVar);
        this.f12296n0 = z10VarArr;
    }

    @Override
    public final void e(int i7) {
        this.f12296n0[0].a(Integer.valueOf(i7));
    }
}
