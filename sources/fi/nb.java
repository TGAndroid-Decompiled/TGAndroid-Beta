package fi;

import java.io.File;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.gl;
public final class nb implements c20 {
    public final int f12504a;
    public final boolean f12505b;
    public final Object f12506c;
    public final Object d;

    public nb(Object obj, boolean z9, Object obj2, int i7) {
        this.f12504a = i7;
        this.f12506c = obj;
        this.f12505b = z9;
        this.d = obj2;
    }

    @Override
    public final void a(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: fi.nb.a(java.lang.Object):void");
    }

    public nb(gl glVar, File file, boolean z9) {
        this.f12504a = 1;
        this.f12506c = glVar;
        this.d = file;
        this.f12505b = z9;
    }

    public nb(boolean z9, Object obj, Object obj2, int i7) {
        this.f12504a = i7;
        this.f12505b = z9;
        this.f12506c = obj;
        this.d = obj2;
    }
}
