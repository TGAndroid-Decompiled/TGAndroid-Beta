package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f82 implements m52, p22 {
    public final p82 a;
    public final i22 b;

    public f82(p82 p82Var, i22 i22Var) {
        this.a = p82Var;
        this.b = i22Var;
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        i22 i22Var = this.b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.w = 600;
            pageblockmap.h = 400;
            p82 p82Var = this.a;
            p82Var.r.N1(pageblockmap);
            p82Var.Z(true);
            i22Var.a(true);
            return;
        }
        i22Var.a(true);
    }

    @Override
    public final void f(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.r.W1((k47) arrayList.get(0));
        }
        this.b.a(true);
    }
}
