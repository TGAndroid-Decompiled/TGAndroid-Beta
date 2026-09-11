package di;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.rl;
public final class hd implements Utilities.Callback {
    public final int f7353a;
    public final boolean f7354b;
    public final Object f7355c;
    public final Object d;

    public hd(Object obj, boolean z10, Object obj2, int i10) {
        this.f7353a = i10;
        this.f7355c = obj;
        this.f7354b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: di.hd.run(java.lang.Object):void");
    }

    public hd(rl rlVar, File file, boolean z10) {
        this.f7353a = 1;
        this.f7355c = rlVar;
        this.d = file;
        this.f7354b = z10;
    }

    public hd(boolean z10, Object obj, Object obj2, int i10) {
        this.f7353a = i10;
        this.f7354b = z10;
        this.f7355c = obj;
        this.d = obj2;
    }
}
