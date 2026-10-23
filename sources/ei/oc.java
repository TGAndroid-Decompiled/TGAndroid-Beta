package ei;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cm;
public final class oc implements Utilities.Callback {
    public final int f9585a;
    public final boolean f9586b;
    public final Object f9587c;
    public final Object d;

    public oc(Object obj, boolean z10, Object obj2, int i10) {
        this.f9585a = i10;
        this.f9587c = obj;
        this.f9586b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: ei.oc.run(java.lang.Object):void");
    }

    public oc(cm cmVar, File file, boolean z10) {
        this.f9585a = 1;
        this.f9587c = cmVar;
        this.d = file;
        this.f9586b = z10;
    }

    public oc(boolean z10, Object obj, Object obj2, int i10) {
        this.f9585a = i10;
        this.f9586b = z10;
        this.f9587c = obj;
        this.d = obj2;
    }
}
