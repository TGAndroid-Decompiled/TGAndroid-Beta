package gi;

import java.io.File;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.gl;
public final class nb implements u10 {
    public final int f13315a;
    public final boolean f13316b;
    public final Object f13317c;
    public final Object d;

    public nb(Object obj, boolean z10, Object obj2, int i3) {
        this.f13315a = i3;
        this.f13317c = obj;
        this.f13316b = z10;
        this.d = obj2;
    }

    @Override
    public final void a(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: gi.nb.a(java.lang.Object):void");
    }

    public nb(gl glVar, File file, boolean z10) {
        this.f13315a = 1;
        this.f13317c = glVar;
        this.d = file;
        this.f13316b = z10;
    }

    public nb(boolean z10, Object obj, Object obj2, int i3) {
        this.f13315a = i3;
        this.f13316b = z10;
        this.f13317c = obj;
        this.d = obj2;
    }
}
