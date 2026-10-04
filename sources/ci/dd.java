package ci;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ul;
public final class dd implements Utilities.Callback {
    public final int f4932a;
    public final boolean f4933b;
    public final Object f4934c;
    public final Object d;

    public dd(Object obj, boolean z10, Object obj2, int i10) {
        this.f4932a = i10;
        this.f4934c = obj;
        this.f4933b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.dd.run(java.lang.Object):void");
    }

    public dd(ul ulVar, File file, boolean z10) {
        this.f4932a = 1;
        this.f4934c = ulVar;
        this.d = file;
        this.f4933b = z10;
    }

    public dd(boolean z10, Object obj, Object obj2, int i10) {
        this.f4932a = i10;
        this.f4933b = z10;
        this.f4934c = obj;
        this.d = obj2;
    }
}
