package hi;

import java.io.File;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.ol;
public final class kb implements z10 {
    public final int f14527a;
    public final boolean f14528b;
    public final Object f14529c;
    public final Object d;

    public kb(Object obj, boolean z10, Object obj2, int i7) {
        this.f14527a = i7;
        this.f14529c = obj;
        this.f14528b = z10;
        this.d = obj2;
    }

    @Override
    public final void a(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: hi.kb.a(java.lang.Object):void");
    }

    public kb(ol olVar, File file, boolean z10) {
        this.f14527a = 1;
        this.f14529c = olVar;
        this.d = file;
        this.f14528b = z10;
    }

    public kb(boolean z10, Object obj, Object obj2, int i7) {
        this.f14527a = i7;
        this.f14528b = z10;
        this.f14529c = obj;
        this.d = obj2;
    }
}
