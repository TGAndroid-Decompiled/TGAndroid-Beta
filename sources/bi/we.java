package bi;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wl;
public final class we implements Utilities.Callback {
    public final int f3848a;
    public final boolean f3849b;
    public final Object f3850c;
    public final Object d;

    public we(Object obj, boolean z10, Object obj2, int i10) {
        this.f3848a = i10;
        this.f3850c = obj;
        this.f3849b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.we.run(java.lang.Object):void");
    }

    public we(wl wlVar, File file, boolean z10) {
        this.f3848a = 1;
        this.f3850c = wlVar;
        this.d = file;
        this.f3849b = z10;
    }

    public we(boolean z10, Object obj, Object obj2, int i10) {
        this.f3848a = i10;
        this.f3849b = z10;
        this.f3850c = obj;
        this.d = obj2;
    }
}
