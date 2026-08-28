package kh;

import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.il;
public final class oc implements Utilities.Callback {
    public final int f15809a;
    public final boolean f15810b;
    public final Object f15811c;
    public final Object d;

    public oc(Object obj, boolean z10, Object obj2, int i9) {
        this.f15809a = i9;
        this.f15811c = obj;
        this.f15810b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: kh.oc.run(java.lang.Object):void");
    }

    public oc(il ilVar, File file, boolean z10) {
        this.f15809a = 1;
        this.f15811c = ilVar;
        this.d = file;
        this.f15810b = z10;
    }

    public oc(boolean z10, Object obj, Object obj2, int i9) {
        this.f15809a = i9;
        this.f15810b = z10;
        this.f15811c = obj;
        this.d = obj2;
    }
}
