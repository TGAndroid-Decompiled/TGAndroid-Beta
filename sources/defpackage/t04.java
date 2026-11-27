package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t04 extends xy3 {
    public final o24 g0;

    public t04(o24 o24Var, Context context, vnb vnbVar, boolean z, gz3 gz3Var, boolean z2) {
        super(context, vnbVar, true, false, true, z, 0, gz3Var, aob.v0(aob.v6, vnbVar), z2);
        this.g0 = o24Var;
    }

    @Override
    public final boolean d() {
        return this.g0.V0;
    }

    @Override
    public final void e() {
        o24 o24Var = this.g0;
        ArrayList arrayList = o24Var.o1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && uc7.s1(o24Var.d1).Y3.getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            yac.h(yac.t0);
        }
    }

    @Override
    public final boolean g(c14 c14Var) {
        if (!c14Var.f && !this.g0.q1.contains(Long.valueOf(c14Var.b.id))) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t04.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            o24 o24Var = this.g0;
            View view = o24Var.P;
            if (view != null) {
                view.setTranslationY(f);
            }
            o24Var.K.invalidate();
        }
    }
}
