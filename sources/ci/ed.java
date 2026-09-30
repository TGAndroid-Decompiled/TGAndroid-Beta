package ci;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ul;
public final class ed implements Utilities.Callback {
    public final int f4671a;
    public final boolean f4672b;
    public final Object f4673c;
    public final Object d;

    public ed(Object obj, boolean z10, Object obj2, int i10) {
        this.f4671a = i10;
        this.f4673c = obj;
        this.f4672b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.ed.run(java.lang.Object):void");
    }

    public ed(ul ulVar, File file, boolean z10) {
        this.f4671a = 1;
        this.f4673c = ulVar;
        this.d = file;
        this.f4672b = z10;
    }

    public ed(boolean z10, Object obj, Object obj2, int i10) {
        this.f4671a = i10;
        this.f4672b = z10;
        this.f4673c = obj;
        this.d = obj2;
    }
}
