package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class caa implements gk7 {
    public final TLRPC.Dialog a;
    public final AtomicReference b;
    public final View c;
    public final taa d;

    public caa(taa taaVar, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = taaVar;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        float f;
        taa taaVar = this.d;
        o39 o39Var = taaVar.z1;
        raa raaVar = taaVar.G1;
        a aVar = taaVar.u2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = raaVar.f;
            AtomicReference atomicReference = this.b;
            if ((arrayList == null && na7.q1(taaVar.a).g4.l(-dialog.id) != null) || atomicReference.get() == null) {
                z = true;
            } else {
                z = false;
            }
            raaVar.f = na7.q1(taaVar.a).g4.l(-dialog.id);
            raaVar.d = l7c.v(na7.q1(taaVar.a).V1(Long.valueOf(dialog.id)));
            raaVar.e = l7c.w(na7.q1(taaVar.a).V1(Long.valueOf(dialog.id)));
            if (z) {
                raaVar.f();
            }
            if (raaVar.f != null) {
                kk7.f(taaVar.a).n(this, kk7.s5);
            }
            if (z) {
                o39Var.setVisibility(0);
                o39Var.setAlpha(0.0f);
                aVar.setVisibility(0);
                aVar.setAlpha(0.0f);
                if (l7c.v(na7.q1(taaVar.a).V1(Long.valueOf(dialog.id)))) {
                    aVar.setTitle(cf3.t(na7.q1(taaVar.a).V1(Long.valueOf(dialog.id))));
                    aVar.setSubtitle(k96.M0(2131745477, null));
                } else if (hc2.o0(taaVar.a, dialog.id)) {
                    int i3 = taaVar.a;
                    aVar.setTitle(mm4.j(i3, na7.q1(i3).K0(Long.valueOf(-dialog.id)), false));
                    aVar.setSubtitle(k96.M0(2131745477, null));
                } else {
                    aVar.setTitle(na7.q1(taaVar.a).K0(Long.valueOf(-dialog.id)).title);
                    aVar.setSubtitle(k96.M0(2131745457, null));
                }
                taaVar.H2 = taaVar.G2;
                yla ylaVar = taaVar.w2;
                if (ylaVar != null) {
                    ylaVar.d();
                }
                int[] iArr = new int[2];
                yla ylaVar2 = new yla(new ti4(0.0f));
                zla zlaVar = new zla(1000.0f);
                mu1 mu1Var = taaVar.a2;
                if (mu1Var != null && mu1Var.b) {
                    f = 10.0f;
                } else {
                    f = 800.0f;
                }
                zlaVar.b(f);
                zlaVar.a(1.0f);
                ylaVar2.m = zlaVar;
                taaVar.w2 = ylaVar2;
                ylaVar2.b(new n9a(this, this.c, iArr, (byte) 1));
                taaVar.w2.a(new zv0(this, (byte) 10));
                taaVar.w2.h();
                if (atomicReference.get() != null) {
                    gl.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
