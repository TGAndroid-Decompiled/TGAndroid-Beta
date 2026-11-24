package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yz3 extends cy3 {
    public final t14 g0;

    public yz3(t14 t14Var, Context context, wjb wjbVar, boolean z, ly3 ly3Var, boolean z2) {
        super(context, wjbVar, true, false, true, z, 0, ly3Var, bkb.v0(bkb.u6, wjbVar), z2);
        this.g0 = t14Var;
    }

    @Override
    public final boolean d() {
        return this.g0.V0;
    }

    @Override
    public final void e() {
        t14 t14Var = this.g0;
        ArrayList arrayList = t14Var.o1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && na7.q1(t14Var.d1).Y3.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            y6c.h(y6c.t0);
        }
    }

    @Override
    public final boolean g(h04 h04Var) {
        if (!h04Var.f && !this.g0.q1.contains(Long.valueOf(h04Var.b.id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.f2;
    }

    @Override
    public final boolean h(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz3.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            t14 t14Var = this.g0;
            View view = t14Var.P;
            if (view != null) {
                view.setTranslationY(f);
            }
            t14Var.K.invalidate();
        }
    }
}
