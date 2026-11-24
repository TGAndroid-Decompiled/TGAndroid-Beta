package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class cca implements jm7 {
    public final TLRPC.Dialog a;
    public final AtomicReference b;
    public final View c;
    public final tca d;

    public cca(tca tcaVar, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = tcaVar;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        float f;
        tca tcaVar = this.d;
        r59 r59Var = tcaVar.z1;
        rca rcaVar = tcaVar.G1;
        a aVar = tcaVar.u2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = rcaVar.f;
            AtomicReference atomicReference = this.b;
            if ((arrayList == null && oc7.r1(tcaVar.a).g4.l(-dialog.id) != null) || atomicReference.get() == null) {
                z = true;
            } else {
                z = false;
            }
            rcaVar.f = oc7.r1(tcaVar.a).g4.l(-dialog.id);
            rcaVar.d = m9c.w(oc7.r1(tcaVar.a).W1(Long.valueOf(dialog.id)));
            rcaVar.e = m9c.x(oc7.r1(tcaVar.a).W1(Long.valueOf(dialog.id)));
            if (z) {
                rcaVar.f();
            }
            if (rcaVar.f != null) {
                nm7.f(tcaVar.a).n(this, nm7.u5);
            }
            if (z) {
                r59Var.setVisibility(0);
                r59Var.setAlpha(0.0f);
                aVar.setVisibility(0);
                aVar.setAlpha(0.0f);
                if (m9c.w(oc7.r1(tcaVar.a).W1(Long.valueOf(dialog.id)))) {
                    aVar.setTitle(pg3.t(oc7.r1(tcaVar.a).W1(Long.valueOf(dialog.id))));
                    aVar.setSubtitle(jb6.M0(2131745403, null));
                } else if (sd2.o0(tcaVar.a, dialog.id)) {
                    int i3 = tcaVar.a;
                    aVar.setTitle(no4.j(i3, oc7.r1(i3).L0(Long.valueOf(-dialog.id)), false));
                    aVar.setSubtitle(jb6.M0(2131745403, null));
                } else {
                    aVar.setTitle(oc7.r1(tcaVar.a).L0(Long.valueOf(-dialog.id)).title);
                    aVar.setSubtitle(jb6.M0(2131745383, null));
                }
                tcaVar.H2 = tcaVar.G2;
                zna znaVar = tcaVar.w2;
                if (znaVar != null) {
                    znaVar.d();
                }
                int[] iArr = new int[2];
                zna znaVar2 = new zna(new xk4(0.0f));
                aoa aoaVar = new aoa(1000.0f);
                yv1 yv1Var = tcaVar.a2;
                if (yv1Var != null && yv1Var.b) {
                    f = 10.0f;
                } else {
                    f = 800.0f;
                }
                aoaVar.b(f);
                aoaVar.a(1.0f);
                znaVar2.m = aoaVar;
                tcaVar.w2 = znaVar2;
                znaVar2.b(new nba(this, this.c, iArr, (byte) 1));
                tcaVar.w2.a(new hx0(this, (byte) 10));
                tcaVar.w2.h();
                if (atomicReference.get() != null) {
                    gm.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
