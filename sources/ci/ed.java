package ci;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.km;
public final class ed implements Utilities.Callback {
    public final int f5055a;
    public final boolean f5056b;
    public final Object f5057c;
    public final Object d;

    public ed(Object obj, boolean z10, Object obj2, int i10) {
        this.f5055a = i10;
        this.f5057c = obj;
        this.f5056b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.ed.run(java.lang.Object):void");
    }

    public ed(km kmVar, File file, boolean z10) {
        this.f5055a = 1;
        this.f5057c = kmVar;
        this.d = file;
        this.f5056b = z10;
    }

    public ed(boolean z10, Object obj, Object obj2, int i10) {
        this.f5055a = i10;
        this.f5056b = z10;
        this.f5057c = obj;
        this.d = obj2;
    }
}
