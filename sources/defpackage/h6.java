package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class h6 implements no7, ed, nw4 {
    public final byte a;
    public final d b;

    public h6(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        byte b = this.a;
        return this.b.onInsetsInternal(view, vxcVar);
    }

    @Override
    public final int i() {
        return this.b.getThemedColor(bkb.Z6);
    }

    @Override
    public final void u(defpackage.hd r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.u(hd, int):void");
    }
}
