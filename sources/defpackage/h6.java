package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class h6 implements qq7, ee, py4 {
    public final byte a;
    public final d b;

    public h6(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        byte b = this.a;
        return this.b.onInsetsInternal(view, wzcVar);
    }

    @Override
    public final int i() {
        return this.b.getThemedColor(cmb.Z6);
    }

    @Override
    public final void r(defpackage.he r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.r(he, int):void");
    }
}
