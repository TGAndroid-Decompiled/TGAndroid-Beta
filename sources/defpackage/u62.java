package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class u62 implements b42, e12 {
    public final e72 a;
    public final x02 b;

    public u62(e72 e72Var, x02 x02Var) {
        this.a = e72Var;
        this.b = x02Var;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        x02 x02Var = this.b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.w = 600;
            pageblockmap.h = 400;
            e72 e72Var = this.a;
            e72Var.r.N1(pageblockmap);
            e72Var.Z(true);
            x02Var.a(true);
            return;
        }
        x02Var.a(true);
    }

    @Override
    public final void g(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.r.W1((k27) arrayList.get(0));
        }
        this.b.a(true);
    }
}
