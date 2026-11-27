package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class tda implements fn7 {
    public final TLRPC.Dialog a;
    public final AtomicReference b;
    public final View c;
    public final kea d;

    public tda(kea keaVar, TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
        this.d = keaVar;
        this.a = dialog;
        this.b = atomicReference;
        this.c = view;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        float f;
        kea keaVar = this.d;
        d79 d79Var = keaVar.z1;
        iea ieaVar = keaVar.G1;
        a aVar = keaVar.u2;
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.Dialog dialog = this.a;
        if (longValue == (-dialog.id)) {
            ArrayList arrayList = ieaVar.f;
            AtomicReference atomicReference = this.b;
            if ((arrayList == null && uc7.s1(keaVar.a).h4.l(-dialog.id) != null) || atomicReference.get() == null) {
                z = true;
            } else {
                z = false;
            }
            ieaVar.f = uc7.s1(keaVar.a).h4.l(-dialog.id);
            ieaVar.d = lbc.w(uc7.s1(keaVar.a).X1(Long.valueOf(dialog.id)));
            ieaVar.e = lbc.x(uc7.s1(keaVar.a).X1(Long.valueOf(dialog.id)));
            if (z) {
                ieaVar.f();
            }
            if (ieaVar.f != null) {
                jn7.f(keaVar.a).n(this, jn7.t5);
            }
            if (z) {
                d79Var.setVisibility(0);
                d79Var.setAlpha(0.0f);
                aVar.setVisibility(0);
                aVar.setAlpha(0.0f);
                if (lbc.w(uc7.s1(keaVar.a).X1(Long.valueOf(dialog.id)))) {
                    aVar.setTitle(wf3.t(uc7.s1(keaVar.a).X1(Long.valueOf(dialog.id))));
                    aVar.setSubtitle(ob6.M0(2131745397, null));
                } else if (xc2.o0(keaVar.a, dialog.id)) {
                    int i3 = keaVar.a;
                    aVar.setTitle(ro4.j(i3, uc7.s1(i3).M0(Long.valueOf(-dialog.id)), false));
                    aVar.setSubtitle(ob6.M0(2131745397, null));
                } else {
                    aVar.setTitle(uc7.s1(keaVar.a).M0(Long.valueOf(-dialog.id)).title);
                    aVar.setSubtitle(ob6.M0(2131745377, null));
                }
                keaVar.H2 = keaVar.G2;
                vpa vpaVar = keaVar.w2;
                if (vpaVar != null) {
                    vpaVar.d();
                }
                int[] iArr = new int[2];
                vpa vpaVar2 = new vpa(new xk4(0.0f));
                wpa wpaVar = new wpa(1000.0f);
                zu1 zu1Var = keaVar.a2;
                if (zu1Var != null && zu1Var.b) {
                    f = 10.0f;
                } else {
                    f = 800.0f;
                }
                wpaVar.b(f);
                wpaVar.a(1.0f);
                vpaVar2.m = wpaVar;
                keaVar.w2 = vpaVar2;
                vpaVar2.b(new eda(this, this.c, iArr, (byte) 1));
                keaVar.w2.a(new iw0(this, (byte) 11));
                keaVar.w2.h();
                if (atomicReference.get() != null) {
                    hl.r((Runnable) atomicReference.get());
                    atomicReference.set(null);
                }
            }
        }
    }
}
