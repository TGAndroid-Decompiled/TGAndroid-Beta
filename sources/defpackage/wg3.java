package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class wg3 implements View.OnClickListener {
    public final byte a;
    public final uj3 b;

    public wg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override
    public final void onClick(View view) {
        ii3 ii3Var;
        ii3 ii3Var2;
        ArrayList arrayList;
        CharSequence charSequence;
        int i = 0;
        switch (this.a) {
            case 0:
                uj3 uj3Var = this.b;
                uj3Var.k5(true, false, true, false);
                uj3Var.Z.b(true);
                hl.d3(new rg3(uj3Var, (byte) 24), 100L);
                return;
            case 1:
                uj3 uj3Var2 = this.b;
                if (uj3Var2.H0 && (ii3Var = uj3Var2.F0) != null && !ii3Var.g()) {
                    uj3Var2.R4(true, true);
                    return;
                } else {
                    uj3Var2.l5();
                    return;
                }
            case 2:
                uj3 uj3Var3 = this.b;
                if (uj3Var3.H0 && (ii3Var2 = uj3Var3.F0) != null && !ii3Var2.g()) {
                    uj3Var3.R4(true, true);
                    return;
                } else {
                    uj3Var3.l5();
                    return;
                }
            case 3:
                uj3 uj3Var4 = this.b;
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", uj3Var4.a3);
                uj3Var4.presentFragment(new io2(bundle));
                return;
            case 4:
                uj3 uj3Var5 = this.b;
                ArrayList arrayList2 = uj3Var5.K2;
                if (uj3Var5.E2 != null && !arrayList2.isEmpty()) {
                    uj3Var5.O2 = false;
                    ArrayList arrayList3 = new ArrayList();
                    while (i < arrayList2.size()) {
                        arrayList3.add(if7.a(((Long) arrayList2.get(i)).longValue(), 0L));
                        i++;
                    }
                    uj3Var5.E2.q(uj3Var5, arrayList3, uj3Var5.D1.getFieldText(), false, uj3Var5.L2, uj3Var5.M2, uj3Var5.N2, null);
                    return;
                }
                return;
            case 5:
                this.b.A3(true);
                return;
            case 6:
                this.b.finishPreviewFragment();
                return;
            case 7:
                uj3 uj3Var6 = this.b;
                uj3Var6.A0.setIsEditing(false);
                uj3Var6.d5(false);
                return;
            case 8:
                uj3 uj3Var7 = this.b;
                uj3Var7.showDialog(new xk8((e) uj3Var7, 2, true));
                return;
            case 9:
                uj3 uj3Var8 = this.b;
                uj3Var8.getContactsController().B();
                uj3Var8.f5();
                return;
            case 10:
                this.b.E4(view);
                return;
            case 11:
                uj3 uj3Var9 = this.b;
                if (uj3Var9.z3() && (arrayList = uj3Var9.F2) != null && !arrayList.isEmpty() && uj3Var9.getParentActivity() != null) {
                    no6 no6Var = (no6) uj3Var9.F2.get(0);
                    bi3 bi3Var = uj3Var9.D1;
                    if (bi3Var != null) {
                        charSequence = bi3Var.getFieldText();
                    } else {
                        charSequence = no6Var.a;
                    }
                    ArrayList arrayList4 = uj3Var9.F2;
                    int size = arrayList4.size();
                    while (i < size) {
                        Object obj = arrayList4.get(i);
                        i++;
                        ((no6) obj).a = charSequence;
                    }
                    PhotoViewer.q0().T1(null, uj3Var9, uj3Var9.getResourceProvider());
                    PhotoViewer.q0().u7 = true;
                    PhotoViewer.q0().v7 = charSequence;
                    ArrayList arrayList5 = new ArrayList(uj3Var9.F2);
                    boolean[] zArr = new boolean[uj3Var9.F2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.q0().o1(arrayList5, 0, 0, false, new wi3(uj3Var9, zArr), null);
                    PhotoViewer q0 = PhotoViewer.q0();
                    q0.f4 = true;
                    CheckBox checkBox = q0.O0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = q0.P0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
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
                uj3 uj3Var10 = this.b;
                uj3Var10.showDialog((nx0) jj.l(uj3Var10.getParentActivity(), ob6.M0(2131751203, null), ob6.M0(2131751208, null), null, new sg3(uj3Var10, (byte) 1), new rg3(uj3Var10, (byte) 6), false, false, uj3Var10.getResourceProvider()).b);
                return;
            case 16:
                this.b.r4();
                return;
            case 17:
                this.b.s4();
                return;
            case 18:
                uj3 uj3Var11 = this.b;
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.k0 = true;
                uj3Var11.presentFragment(premiumPreviewFragment);
                hl.d3(new rg3(uj3Var11, (byte) 20), 250L);
                return;
            case 19:
                this.b.i4();
                return;
            case 20:
                this.b.G4();
                return;
            case 21:
                uj3 uj3Var12 = this.b;
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.k0 = true;
                uj3Var12.presentFragment(premiumPreviewFragment2);
                hl.d3(new rg3(uj3Var12, (byte) 3), 250L);
                return;
            case 22:
                uj3 uj3Var13 = this.b;
                uj3Var13.presentFragment(new z61());
                hl.d3(new rg3(uj3Var13, (byte) 1), 250L);
                return;
            case 23:
                this.b.F4();
                return;
            case 24:
                this.b.v4();
                return;
            case 25:
                this.b.j4();
                return;
            case 26:
                uj3 uj3Var14 = this.b;
                m01.u(uj3Var14.getParentActivity(), uj3Var14.getMessagesController().k4.w2.f);
                return;
            case 27:
                this.b.k4();
                return;
            default:
                this.b.P3();
                return;
        }
    }
}
