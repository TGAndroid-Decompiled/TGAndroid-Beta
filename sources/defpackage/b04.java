package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class b04 extends w04 {
    public final e F0;
    public final boolean G0;
    public final o24 H0;

    public b04(o24 o24Var, Context context, vnb vnbVar, e eVar, boolean z) {
        super(o24Var, context, vnbVar);
        this.H0 = o24Var;
        this.F0 = eVar;
        this.G0 = z;
    }

    @Override
    public final void j() {
        c04 c04Var = this.H0.D0;
        if (c04Var != null) {
            c04Var.invalidate();
        }
    }

    @Override
    public final void o(int i, int i2) {
        o24 o24Var = this.H0;
        zz3 zz3Var = o24Var.g2;
        int i3 = o24Var.F1;
        int i4 = i - i3;
        int i5 = i2 - i3;
        int i6 = o24Var.d1;
        ls6 d0 = ls6.d0(i6);
        ArrayList arrayList = o24Var.e1;
        arrayList.add(i5, (TLRPC.TL_messages_stickerSet) arrayList.remove(i4));
        Collections.sort(d0.t0(0), new jz0(this, (byte) 2));
        ArrayList arrayList2 = o24Var.F2;
        if (arrayList2 != null) {
            arrayList2.clear();
            o24Var.F2.addAll(arrayList);
        }
        o24Var.C();
        hl.r(zz3Var);
        hl.d3(zz3Var, 1500L);
        ls6 d02 = ls6.d0(i6);
        d02.Y[0] = ls6.s(d02.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i7 = o24Var.f0; i7 < arrayList.size(); i7 = dze.c(i7, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i7)).set.id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i6).sendRequest(tL_messages_reorderStickerSets, new xe2((byte) 0));
        jn7.f(i6).k(jn7.x0, 0, Boolean.TRUE);
        o24Var.X(true);
        if (xea.W) {
            xea.N();
            e eVar = this.F0;
            if (eVar != null) {
                d31.b0(eVar).L(2131624018, ob6.M0(2131751302, null), ob6.M0(2131751301, null), ob6.N0("Settings"), new yv1(eVar, (byte) 1)).j();
                return;
            }
            FrameLayout frameLayout = o24Var.r;
            if (frameLayout != null) {
                new d31(frameLayout, o24Var.a2).I(2131624018, ob6.M0(2131751302, null), ob6.M0(2131751301, null)).j();
            }
        }
    }

    @Override
    public final void p() {
        o24 o24Var = this.H0;
        o24Var.Y();
        c04 c04Var = o24Var.D0;
        if (c04Var != null) {
            c04Var.invalidate();
        }
        invalidate();
        p14 p14Var = o24Var.u1;
        if (p14Var != null) {
            p14Var.t();
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
