package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class zf3 implements View.OnClickListener {
    public final byte a;
    public final cj3 b;

    public zf3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        oh3 oh3Var;
        oh3 oh3Var2;
        int i = 0;
        switch (this.a) {
            case 0:
                cj3 cj3Var = this.b;
                if (cj3Var.x3() && (arrayList = cj3Var.F2) != null && !arrayList.isEmpty() && cj3Var.getParentActivity() != null) {
                    jm6 jm6Var = (jm6) cj3Var.F2.get(0);
                    hh3 hh3Var = cj3Var.D1;
                    if (hh3Var != null) {
                        charSequence = hh3Var.getFieldText();
                    } else {
                        charSequence = jm6Var.a;
                    }
                    ArrayList arrayList2 = cj3Var.F2;
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        ((jm6) obj).a = charSequence;
                    }
                    PhotoViewer.r0().T1(null, cj3Var, cj3Var.getResourceProvider());
                    PhotoViewer.r0().u7 = true;
                    PhotoViewer.r0().v7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(cj3Var.F2);
                    boolean[] zArr = new boolean[cj3Var.F2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.r0().o1(arrayList3, 0, 0, false, new ci3(cj3Var, zArr), null);
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
                cj3 cj3Var2 = this.b;
                if (cj3Var2.H0 && (oh3Var = cj3Var2.F0) != null && !oh3Var.g()) {
                    cj3Var2.N4(true, true);
                    return;
                } else {
                    cj3Var2.h5();
                    return;
                }
            case 2:
                cj3 cj3Var3 = this.b;
                if (cj3Var3.H0 && (oh3Var2 = cj3Var3.F0) != null && !oh3Var2.g()) {
                    cj3Var3.N4(true, true);
                    return;
                } else {
                    cj3Var3.h5();
                    return;
                }
            case 3:
                cj3 cj3Var4 = this.b;
                cj3Var4.g5(true, false, true, false);
                cj3Var4.Z.b(true);
                gl.d3(new wf3(cj3Var4, (byte) 16), 100L);
                return;
            case 4:
                cj3 cj3Var5 = this.b;
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cj3Var5.a3);
                cj3Var5.presentFragment(new pn2(bundle));
                return;
            case 5:
                cj3 cj3Var6 = this.b;
                ArrayList arrayList4 = cj3Var6.K2;
                if (cj3Var6.E2 != null && !arrayList4.isEmpty()) {
                    cj3Var6.O2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i < arrayList4.size()) {
                        arrayList5.add(zc7.a(((Long) arrayList4.get(i)).longValue(), 0L));
                        i++;
                    }
                    cj3Var6.E2.r(cj3Var6, arrayList5, cj3Var6.D1.getFieldText(), false, cj3Var6.L2, cj3Var6.M2, cj3Var6.N2, null);
                    return;
                }
                return;
            case 6:
                this.b.y3(true);
                return;
            case 7:
                this.b.finishPreviewFragment();
                return;
            case 8:
                cj3 cj3Var7 = this.b;
                cj3Var7.A0.setIsEditing(false);
                cj3Var7.Z4(false);
                return;
            case 9:
                cj3 cj3Var8 = this.b;
                cj3Var8.showDialog(new jh8((d) cj3Var8, 2, true));
                return;
            case 10:
                cj3 cj3Var9 = this.b;
                cj3Var9.getContactsController().B();
                cj3Var9.b5();
                return;
            case 11:
                this.b.A4(view);
                return;
            case 12:
                this.b.e4();
                return;
            case 13:
                this.b.j4();
                return;
            case 14:
                this.b.l4();
                return;
            case 15:
                cj3 cj3Var10 = this.b;
                cj3Var10.showDialog((fx0) ij.l(cj3Var10.getParentActivity(), k96.M0(2131751226, null), k96.M0(2131751231, null), null, new yf3(cj3Var10, (byte) 1), new sg3(cj3Var10, (byte) 12), false, false, cj3Var10.getResourceProvider()).a);
                return;
            case 16:
                this.b.o4();
                return;
            case 17:
                this.b.p4();
                return;
            case 18:
                cj3 cj3Var11 = this.b;
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.k0 = true;
                cj3Var11.presentFragment(premiumPreviewFragment);
                gl.d3(new wf3(cj3Var11, (byte) 10), 250L);
                return;
            case 19:
                this.b.f4();
                return;
            case 20:
                cj3 cj3Var12 = this.b;
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.k0 = true;
                cj3Var12.presentFragment(premiumPreviewFragment2);
                gl.d3(new sg3(cj3Var12, (byte) 8), 250L);
                return;
            case 21:
                cj3 cj3Var13 = this.b;
                cj3Var13.presentFragment(new r61());
                gl.d3(new sg3(cj3Var13, (byte) 6), 250L);
                return;
            case 22:
                this.b.B4();
                return;
            case 23:
                this.b.s4();
                return;
            case 24:
                this.b.g4();
                return;
            case 25:
                cj3 cj3Var14 = this.b;
                d01.t(cj3Var14.getParentActivity(), cj3Var14.getMessagesController().k4.o2.f);
                return;
            case 26:
                this.b.h4();
                return;
            case 27:
                this.b.C4();
                return;
            default:
                this.b.M3();
                return;
        }
    }
}
