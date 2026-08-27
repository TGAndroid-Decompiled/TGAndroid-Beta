package jh;

import java.util.ArrayList;
import java.util.List;
import lh.nb;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.gy;
import org.telegram.ui.yw;

public final class b2 implements Utilities.Callback4 {

    public final int f13076a;

    public final Object f13077b;

    public final Object f13078c;

    public b2(int i10, Object obj, Object obj2) {
        this.f13076a = i10;
        this.f13077b = obj;
        this.f13078c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        yw ywVar;
        org.telegram.ui.ActionBar.b5 parentLayout;
        switch (this.f13076a) {
            case 0:
                e4 e4Var = (e4) this.f13077b;
                sb sbVar = (sb) this.f13078c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                i9 i9Var = e4Var.F0;
                if (bool.booleanValue()) {
                    org.telegram.ui.ActionBar.n2 n2Var = i9Var.f13478f;
                    o oVarE = null;
                    if (n2Var == null || (parentLayout = n2Var.getParentLayout()) == null) {
                        ywVar = null;
                    } else {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        int size = fragmentStack.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                                if (n2Var2 instanceof gy) {
                                    gy gyVar = (gy) n2Var2;
                                    gyVar.K3();
                                    ywVar = gyVar.A0;
                                    oVarE = ywVar != null ? ywVar.e(l11.longValue()) : null;
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) arrayList.get(i10), false);
                                    }
                                } else {
                                    arrayList.add(n2Var2);
                                    size--;
                                }
                            } else {
                                ywVar = null;
                            }
                        }
                    }
                    org.telegram.ui.ActionBar.n2 n2Var3 = i9Var.f13478f;
                    if (n2Var3 != null) {
                        n2Var3.clearSheets();
                    }
                    i9Var.v();
                    e4Var.Q3 = false;
                    if (ywVar == null || !ywVar.k(l11.longValue())) {
                        sbVar.Y(nb.c(oVarE));
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                    } else {
                        ywVar.U.add(new cg.k0(oVarE, ywVar, l11, sbVar, runnable, 13));
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    d4 d4Var = e4Var.I2;
                    if (d4Var == null || d4Var.f13192b != null) {
                        h9 h9Var = d4Var.f13192b;
                        h9Var.firstFrameRendered = false;
                        d4Var.f13195f = false;
                        h9Var.setOnReadyListener(new e2(0, jCurrentTimeMillis, runnable));
                        ((z8) e4Var.M1).g(false);
                        ri0 ri0Var = e4Var.f13282v0;
                        if (ri0Var != null) {
                            ri0Var.setAnimation(e4Var.f13275t1.f13100u);
                        }
                        if (e4Var.N2 > 0 && l10.longValue() > e4Var.N2 - 1400) {
                            l10 = 0L;
                        }
                        e4Var.T0(l10.longValue(), true);
                        e4Var.Q3 = false;
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                        if (bool.booleanValue()) {
                            e4Var.f1(false);
                        }
                    } else {
                        ((z8) e4Var.M1).g(false);
                        e4Var.setActive(true);
                        e4Var.Q3 = false;
                        e4Var.f13229e1 = new d2(0, runnable);
                        if (bool.booleanValue()) {
                            e4Var.f1(false);
                        }
                        AndroidUtilities.runOnUIThread(runnable, 400L);
                    }
                }
                break;
            default:
                st0 st0Var = (st0) this.f13077b;
                km kmVar = (km) this.f13078c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i11 = st0Var.d;
                MessagesController.getInstance(i11).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i11).putChats((ArrayList) obj3, true);
                org.telegram.ui.Components.k5.h(i11).d((ArrayList) obj4);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                    if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(st0Var.f32564w);
                    st0Var.f32561n.add(messageObject);
                }
                st0Var.G(true);
                AndroidUtilities.runOnUIThread(kmVar, 540L);
                break;
        }
    }
}
