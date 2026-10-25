package fi;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dm;
public final class kc implements Utilities.Callback {
    public final int f11138a;
    public final boolean f11139b;
    public final Object f11140c;
    public final Object d;

    public kc(Object obj, boolean z10, Object obj2, int i10) {
        this.f11138a = i10;
        this.f11140c = obj;
        this.f11139b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: fi.kc.run(java.lang.Object):void");
    }

    public kc(dm dmVar, File file, boolean z10) {
        this.f11138a = 1;
        this.f11140c = dmVar;
        this.d = file;
        this.f11139b = z10;
    }

    public kc(boolean z10, Object obj, Object obj2, int i10) {
        this.f11138a = i10;
        this.f11139b = z10;
        this.f11140c = obj;
        this.d = obj2;
    }
}
