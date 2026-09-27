package ci;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.tl;
public final class dd implements Utilities.Callback {
    public final int f4564a;
    public final boolean f4565b;
    public final Object f4566c;
    public final Object d;

    public dd(Object obj, boolean z10, Object obj2, int i10) {
        this.f4564a = i10;
        this.f4566c = obj;
        this.f4565b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.dd.run(java.lang.Object):void");
    }

    public dd(tl tlVar, File file, boolean z10) {
        this.f4564a = 1;
        this.f4566c = tlVar;
        this.d = file;
        this.f4565b = z10;
    }

    public dd(boolean z10, Object obj, Object obj2, int i10) {
        this.f4564a = i10;
        this.f4565b = z10;
        this.f4566c = obj;
        this.d = obj2;
    }
}
