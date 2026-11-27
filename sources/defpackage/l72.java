package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class l72 implements r42, u12 {
    public final v72 a;
    public final n12 b;

    public l72(v72 v72Var, n12 n12Var) {
        this.a = v72Var;
        this.b = n12Var;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        n12 n12Var = this.b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.w = 600;
            pageblockmap.h = 400;
            v72 v72Var = this.a;
            v72Var.r.O1(pageblockmap);
            v72Var.Y(true);
            n12Var.a(true);
            return;
        }
        n12Var.a(true);
    }

    @Override
    public final void d(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.r.X1((r47) arrayList.get(0));
        }
        this.b.a(true);
    }
}
