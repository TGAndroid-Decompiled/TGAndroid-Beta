package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j14 extends mz3 {
    public final e34 g0;

    public j14(e34 e34Var, Context context, ylb ylbVar, boolean z, vz3 vz3Var, boolean z2) {
        super(context, ylbVar, true, false, true, z, 0, vz3Var, cmb.v0(cmb.u6, ylbVar), z2);
        this.g0 = e34Var;
    }

    @Override
    public final boolean d() {
        return this.g0.V0;
    }

    @Override
    public final void e() {
        e34 e34Var = this.g0;
        ArrayList arrayList = e34Var.o1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && oc7.r1(e34Var.d1).Y3.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            z8c.h(z8c.t0);
        }
    }

    @Override
    public final boolean g(s14 s14Var) {
        if (!s14Var.f && !this.g0.q1.contains(Long.valueOf(s14Var.b.id))) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j14.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            e34 e34Var = this.g0;
            View view = e34Var.P;
            if (view != null) {
                view.setTranslationY(f);
            }
            e34Var.K.invalidate();
        }
    }
}
