package di;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.rl;
public final class hd implements Utilities.Callback {
    public final int f7381a;
    public final boolean f7382b;
    public final Object f7383c;
    public final Object d;

    public hd(Object obj, boolean z10, Object obj2, int i10) {
        this.f7381a = i10;
        this.f7383c = obj;
        this.f7382b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: di.hd.run(java.lang.Object):void");
    }

    public hd(rl rlVar, File file, boolean z10) {
        this.f7381a = 1;
        this.f7383c = rlVar;
        this.d = file;
        this.f7382b = z10;
    }

    public hd(boolean z10, Object obj, Object obj2, int i10) {
        this.f7381a = i10;
        this.f7382b = z10;
        this.f7383c = obj;
        this.d = obj2;
    }
}
