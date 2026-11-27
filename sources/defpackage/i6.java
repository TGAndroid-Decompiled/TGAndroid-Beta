package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.e;
public final class i6 implements nr7, fd, sy4 {
    public final byte a;
    public final e b;

    public i6(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        byte b = this.a;
        return this.b.onInsetsInternal(view, l2dVar);
    }

    @Override
    public final int h() {
        return this.b.getThemedColor(aob.a7);
    }

    @Override
    public final void w(defpackage.id r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6.w(id, int):void");
    }
}
