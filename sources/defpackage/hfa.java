package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
public final class hfa implements wp4, hf7, oj3 {
    public final eja a;

    public hfa(eja ejaVar) {
        this.a = ejaVar;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void a(String str) {
        this.a.w0(str);
    }

    public final void b(boolean z) {
        eja ejaVar = this.a;
        if (!z) {
            ejaVar.requestLayout();
        }
        ejaVar.setVisibleHeight(ejaVar.Q1);
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        UndoView undoView;
        eja ejaVar = this.a;
        SparseArray[] sparseArrayArr = ejaVar.c1;
        e eVar = ejaVar.y1;
        ArrayList arrayList2 = new ArrayList();
        boolean z3 = true;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (i3 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i5 = 0; i5 < sparseArrayArr[i3].size(); i5++) {
                arrayList3.add(Integer.valueOf(sparseArrayArr[i3].keyAt(i5)));
            }
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            while (i4 < size) {
                Object obj = arrayList3.get(i4);
                i4++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    arrayList2.add((r47) sparseArrayArr[i3].get(num.intValue()));
                }
            }
            sparseArrayArr[i3].clear();
            i3--;
        }
        ejaVar.d1 = 0;
        ejaVar.l1(false);
        pia piaVar = ejaVar.U;
        if (piaVar != null) {
            piaVar.x.clear();
        }
        UndoView undoView2 = null;
        if (arrayList.size() <= 1 && ((if7) arrayList.get(0)).a != eVar.getUserConfig().e() && charSequence == null) {
            long j = ((if7) arrayList.get(0)).a;
            Bundle l = bs2.l("scrollToTopOnResume", true);
            if (wf3.B(j)) {
                l.putInt("enc_id", (int) (j & 4294967295L));
            } else {
                if (wf3.D(j)) {
                    l.putLong("user_id", j);
                } else {
                    l.putLong("chat_id", -j);
                }
                if (!eVar.getMessagesController().C(l, uj3Var, null, null)) {
                    return true;
                }
            }
            eVar.getNotificationCenter().k(jn7.s, new Object[0]);
            zu1 zu1Var = new zu1(l);
            ro4.a(zu1Var, (if7) arrayList.get(0));
            uj3Var.presentFragment(zu1Var, true);
            zu1Var.cc(arrayList2);
            return true;
        }
        ejaVar.J1(true);
        int i6 = 0;
        while (i6 < arrayList.size()) {
            long j2 = ((if7) arrayList.get(i6)).a;
            if (charSequence != null) {
                eVar.getSendMessagesHelper().q0(p7a.b(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            eVar.getSendMessagesHelper().p0(arrayList2, j2, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i6++;
            z3 = z3;
            undoView2 = undoView2;
        }
        boolean z4 = z3;
        UndoView undoView3 = undoView2;
        uj3Var.finishFragment();
        if (eVar instanceof ProfileActivity) {
            undoView = ((ProfileActivity) eVar).M;
        } else {
            undoView = undoView3;
        }
        if (undoView != null) {
            if (arrayList.size() == z4) {
                undoView.m(((if7) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
                return z4;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z4;
        }
        return z4;
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }
}
