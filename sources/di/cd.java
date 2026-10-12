package di;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fm;
public final class cd implements Utilities.Callback {
    public final int f6745a;
    public final boolean f6746b;
    public final Object f6747c;
    public final Object d;

    public cd(Object obj, boolean z10, Object obj2, int i10) {
        this.f6745a = i10;
        this.f6747c = obj;
        this.f6746b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: di.cd.run(java.lang.Object):void");
    }

    public cd(fm fmVar, File file, boolean z10) {
        this.f6745a = 1;
        this.f6747c = fmVar;
        this.d = file;
        this.f6746b = z10;
    }

    public cd(boolean z10, Object obj, Object obj2, int i10) {
        this.f6745a = i10;
        this.f6746b = z10;
        this.f6747c = obj;
        this.d = obj2;
    }
}
