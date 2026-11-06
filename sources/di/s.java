package di;

import android.content.Context;
import bi.zd;
import org.telegram.messenger.c20;
public final class s extends zd {
    public final c20[] m0;

    public s(Context context, b bVar, c20[] c20VarArr) {
        super(context, bVar);
        this.m0 = c20VarArr;
    }

    @Override
    public final void e(int i7) {
        this.m0[0].a(Integer.valueOf(i7));
    }
}
