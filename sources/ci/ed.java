package ci;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.tl;
public final class ed implements Utilities.Callback {
    public final int f4663a;
    public final boolean f4664b;
    public final Object f4665c;
    public final Object d;

    public ed(Object obj, boolean z10, Object obj2, int i10) {
        this.f4663a = i10;
        this.f4665c = obj;
        this.f4664b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.ed.run(java.lang.Object):void");
    }

    public ed(tl tlVar, File file, boolean z10) {
        this.f4663a = 1;
        this.f4665c = tlVar;
        this.d = file;
        this.f4664b = z10;
    }

    public ed(boolean z10, Object obj, Object obj2, int i10) {
        this.f4663a = i10;
        this.f4664b = z10;
        this.f4665c = obj;
        this.d = obj2;
    }
}
