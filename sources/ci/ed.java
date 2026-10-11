package ci;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.im;
public final class ed implements Utilities.Callback {
    public final int f5056a;
    public final boolean f5057b;
    public final Object f5058c;
    public final Object d;

    public ed(Object obj, boolean z10, Object obj2, int i10) {
        this.f5056a = i10;
        this.f5058c = obj;
        this.f5057b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.ed.run(java.lang.Object):void");
    }

    public ed(im imVar, File file, boolean z10) {
        this.f5056a = 1;
        this.f5058c = imVar;
        this.d = file;
        this.f5057b = z10;
    }

    public ed(boolean z10, Object obj, Object obj2, int i10) {
        this.f5056a = i10;
        this.f5057b = z10;
        this.f5058c = obj;
        this.d = obj2;
    }
}
