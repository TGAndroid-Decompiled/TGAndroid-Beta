package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class q04 extends m14 {
    public final d F0;
    public final boolean G0;
    public final e34 H0;

    public q04(e34 e34Var, Context context, ylb ylbVar, d dVar, boolean z) {
        super(e34Var, context, ylbVar);
        this.H0 = e34Var;
        this.F0 = dVar;
        this.G0 = z;
    }

    @Override
    public final void j() {
        r04 r04Var = this.H0.D0;
        if (r04Var != null) {
            r04Var.invalidate();
        }
    }

    @Override
    public final void o(int i, int i2) {
        e34 e34Var = this.H0;
        o04 o04Var = e34Var.g2;
        int i3 = e34Var.F1;
        int i4 = i - i3;
        int i5 = i2 - i3;
        int i6 = e34Var.d1;
        hs6 d0 = hs6.d0(i6);
        ArrayList arrayList = e34Var.e1;
        arrayList.add(i5, (TLRPC.TL_messages_stickerSet) arrayList.remove(i4));
        Collections.sort(d0.t0(0), new i01(this, (byte) 2));
        ArrayList arrayList2 = e34Var.F2;
        if (arrayList2 != null) {
            arrayList2.clear();
            e34Var.F2.addAll(arrayList);
        }
        e34Var.B();
        gm.r(o04Var);
        gm.d3(o04Var, 1500L);
        hs6 d02 = hs6.d0(i6);
        d02.Y[0] = hs6.s(d02.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i7 = e34Var.f0; i7 < arrayList.size(); i7 = mle.c(i7, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i7)).set.id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i6).sendRequest(tL_messages_reorderStickerSets, new nf2((byte) 0));
        nm7.f(i6).k(nm7.x0, 0, Boolean.TRUE);
        e34Var.Y(true);
        if (gda.W) {
            gda.N();
            d dVar = this.F0;
            if (dVar != null) {
                c41.b0(dVar).L(2131624018, jb6.M0(2131751274, null), jb6.M0(2131751273, null), jb6.N0("Settings"), new ww1(dVar, (byte) 1)).j();
                return;
            }
            FrameLayout frameLayout = e34Var.r;
            if (frameLayout != null) {
                new c41(frameLayout, e34Var.a2).I(2131624018, jb6.M0(2131751274, null), jb6.M0(2131751273, null)).j();
            }
        }
    }

    @Override
    public final void p() {
        e34 e34Var = this.H0;
        e34Var.Z();
        r04 r04Var = e34Var.D0;
        if (r04Var != null) {
            r04Var.invalidate();
        }
        invalidate();
        f24 f24Var = e34Var.u1;
        if (f24Var != null) {
            f24Var.t();
        }
    }

    @Override
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            if (!this.G0) {
                this.H0.y0.invalidate();
            }
        }
    }
}
