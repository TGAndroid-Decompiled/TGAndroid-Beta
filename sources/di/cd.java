package di;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.em;
public final class cd implements Utilities.Callback {
    public final int f6748a;
    public final boolean f6749b;
    public final Object f6750c;
    public final Object d;

    public cd(Object obj, boolean z10, Object obj2, int i10) {
        this.f6748a = i10;
        this.f6750c = obj;
        this.f6749b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: di.cd.run(java.lang.Object):void");
    }

    public cd(em emVar, File file, boolean z10) {
        this.f6748a = 1;
        this.f6750c = emVar;
        this.d = file;
        this.f6749b = z10;
    }

    public cd(boolean z10, Object obj, Object obj2, int i10) {
        this.f6748a = i10;
        this.f6749b = z10;
        this.f6750c = obj;
        this.d = obj2;
    }
}
