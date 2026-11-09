package fi;

import java.io.File;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.hl;
public final class nb implements c20 {
    public final int f12500a;
    public final boolean f12501b;
    public final Object f12502c;
    public final Object d;

    public nb(Object obj, boolean z9, Object obj2, int i7) {
        this.f12500a = i7;
        this.f12502c = obj;
        this.f12501b = z9;
        this.d = obj2;
    }

    @Override
    public final void a(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: fi.nb.a(java.lang.Object):void");
    }

    public nb(hl hlVar, File file, boolean z9) {
        this.f12500a = 1;
        this.f12502c = hlVar;
        this.d = file;
        this.f12501b = z9;
    }

    public nb(boolean z9, Object obj, Object obj2, int i7) {
        this.f12500a = i7;
        this.f12501b = z9;
        this.f12502c = obj;
        this.d = obj2;
    }
}
