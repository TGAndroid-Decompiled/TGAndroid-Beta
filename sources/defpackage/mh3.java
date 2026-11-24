package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class mh3 implements View.OnClickListener {
    public final byte a;
    public final nk3 b;

    public mh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        aj3 aj3Var;
        aj3 aj3Var2;
        int i = 0;
        switch (this.a) {
            case 0:
                nk3 nk3Var = this.b;
                if (nk3Var.z3() && (arrayList = nk3Var.F2) != null && !arrayList.isEmpty() && nk3Var.getParentActivity() != null) {
                    jo6 jo6Var = (jo6) nk3Var.F2.get(0);
                    ti3 ti3Var = nk3Var.D1;
                    if (ti3Var != null) {
                        charSequence = ti3Var.getFieldText();
                    } else {
                        charSequence = jo6Var.a;
                    }
                    ArrayList arrayList2 = nk3Var.F2;
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        ((jo6) obj).a = charSequence;
                    }
                    PhotoViewer.r0().T1(null, nk3Var, nk3Var.getResourceProvider());
                    PhotoViewer.r0().u7 = true;
                    PhotoViewer.r0().v7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(nk3Var.F2);
                    boolean[] zArr = new boolean[nk3Var.F2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.r0().o1(arrayList3, 0, 0, false, new oj3(nk3Var, zArr), null);
                    PhotoViewer r0 = PhotoViewer.r0();
                    r0.f4 = true;
                    CheckBox checkBox = r0.O0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = r0.P0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                nk3 nk3Var2 = this.b;
                if (nk3Var2.H0 && (aj3Var = nk3Var2.F0) != null && !aj3Var.g()) {
                    nk3Var2.R4(true, true);
                    return;
                } else {
                    nk3Var2.l5();
                    return;
                }
            case 2:
                nk3 nk3Var3 = this.b;
                if (nk3Var3.H0 && (aj3Var2 = nk3Var3.F0) != null && !aj3Var2.g()) {
                    nk3Var3.R4(true, true);
                    return;
                } else {
                    nk3Var3.l5();
                    return;
                }
            case 3:
                nk3 nk3Var4 = this.b;
                nk3Var4.k5(true, false, true, false);
                nk3Var4.Z.b(true);
                gm.d3(new kh3(nk3Var4, (byte) 16), 100L);
                return;
            case 4:
                nk3 nk3Var5 = this.b;
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", nk3Var5.a3);
                nk3Var5.presentFragment(new ap2(bundle));
                return;
            case 5:
                nk3 nk3Var6 = this.b;
                ArrayList arrayList4 = nk3Var6.K2;
                if (nk3Var6.E2 != null && !arrayList4.isEmpty()) {
                    nk3Var6.O2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i < arrayList4.size()) {
                        arrayList5.add(bf7.a(((Long) arrayList4.get(i)).longValue(), 0L));
                        i++;
                    }
                    nk3Var6.E2.q(nk3Var6, arrayList5, nk3Var6.D1.getFieldText(), false, nk3Var6.L2, nk3Var6.M2, nk3Var6.N2, null);
                    return;
                }
                return;
            case 6:
                this.b.A3(true);
                return;
            case 7:
                this.b.finishPreviewFragment();
                return;
            case 8:
                nk3 nk3Var7 = this.b;
                nk3Var7.A0.setIsEditing(false);
                nk3Var7.d5(false);
                return;
            case 9:
                nk3 nk3Var8 = this.b;
                nk3Var8.showDialog(new kj8((d) nk3Var8, 2, true));
                return;
            case 10:
                nk3 nk3Var9 = this.b;
                nk3Var9.getContactsController().B();
                nk3Var9.f5();
                return;
            case 11:
                this.b.E4(view);
                return;
            case 12:
                this.b.h4();
                return;
            case 13:
                this.b.m4();
                return;
            case 14:
                this.b.o4();
                return;
            case 15:
                nk3 nk3Var10 = this.b;
                nk3Var10.showDialog((my0) ik.l(nk3Var10.getParentActivity(), jb6.M0(2131751175, null), jb6.M0(2131751180, null), null, new lh3(nk3Var10, (byte) 1), new di3(nk3Var10, (byte) 13), false, false, nk3Var10.getResourceProvider()).b);
                return;
            case 16:
                this.b.r4();
                return;
            case 17:
                this.b.s4();
                return;
            case 18:
                nk3 nk3Var11 = this.b;
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.k0 = true;
                nk3Var11.presentFragment(premiumPreviewFragment);
                gm.d3(new kh3(nk3Var11, (byte) 10), 250L);
                return;
            case 19:
                this.b.i4();
                return;
            case 20:
                nk3 nk3Var12 = this.b;
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.k0 = true;
                nk3Var12.presentFragment(premiumPreviewFragment2);
                gm.d3(new di3(nk3Var12, (byte) 9), 250L);
                return;
            case 21:
                nk3 nk3Var13 = this.b;
                nk3Var13.presentFragment(new y71());
                gm.d3(new di3(nk3Var13, (byte) 7), 250L);
                return;
            case 22:
                this.b.F4();
                return;
            case 23:
                this.b.v4();
                return;
            case 24:
                this.b.j4();
                return;
            case 25:
                nk3 nk3Var14 = this.b;
                l11.u(nk3Var14.getParentActivity(), nk3Var14.getMessagesController().l4.o2.f);
                return;
            case 26:
                this.b.k4();
                return;
            case 27:
                this.b.G4();
                return;
            default:
                this.b.P3();
                return;
        }
    }
}
