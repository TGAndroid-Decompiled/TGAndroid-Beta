package ji;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.vi;
public final class q1 implements bl, dj {
    public final c2 f14148a;
    public final vi f14149b;

    public q1(c2 c2Var, vi viVar) {
        this.f14148a = c2Var;
        this.f14149b = viVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        c2 c2Var = this.f14148a;
        c2Var.getClass();
        vi viVar = this.f14149b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20120w = 600;
            pageblockmap.h = 400;
            c2Var.P.Q1(pageblockmap);
            viVar.dismiss(true);
            return;
        }
        viVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f14148a.P.a2((MessageObject) arrayList.get(0));
        }
        this.f14149b.dismiss(true);
    }
}
