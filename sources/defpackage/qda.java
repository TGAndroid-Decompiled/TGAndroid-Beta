package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
public final class qda implements tp4, af7, hk3 {
    public final nha a;

    public qda(nha nhaVar) {
        this.a = nhaVar;
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
        nha nhaVar = this.a;
        if (!z) {
            nhaVar.requestLayout();
        }
        nhaVar.setVisibleHeight(nhaVar.Q1);
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        UndoView undoView;
        nha nhaVar = this.a;
        SparseArray[] sparseArrayArr = nhaVar.c1;
        d dVar = nhaVar.y1;
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
                    arrayList2.add((k47) sparseArrayArr[i3].get(num.intValue()));
                }
            }
            sparseArrayArr[i3].clear();
            i3--;
        }
        nhaVar.d1 = 0;
        nhaVar.l1(false);
        yga ygaVar = nhaVar.U;
        if (ygaVar != null) {
            ygaVar.x.clear();
        }
        UndoView undoView2 = null;
        if (arrayList.size() <= 1 && ((bf7) arrayList.get(0)).a != dVar.getUserConfig().e() && charSequence == null) {
            long j = ((bf7) arrayList.get(0)).a;
            Bundle l = ts2.l("scrollToTopOnResume", true);
            if (pg3.B(j)) {
                l.putInt("enc_id", (int) (j & 4294967295L));
            } else {
                if (pg3.D(j)) {
                    l.putLong("user_id", j);
                } else {
                    l.putLong("chat_id", -j);
                }
                if (!dVar.getMessagesController().A(l, nk3Var, null, null)) {
                    return true;
                }
            }
            dVar.getNotificationCenter().k(nm7.s, new Object[0]);
            yv1 yv1Var = new yv1(l);
            no4.a(yv1Var, (bf7) arrayList.get(0));
            nk3Var.presentFragment(yv1Var, true);
            yv1Var.cc(arrayList2);
            return true;
        }
        nhaVar.J1(true);
        int i6 = 0;
        while (i6 < arrayList.size()) {
            long j2 = ((bf7) arrayList.get(i6)).a;
            if (charSequence != null) {
                dVar.getSendMessagesHelper().q0(y5a.b(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            dVar.getSendMessagesHelper().p0(arrayList2, j2, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i6++;
            z3 = z3;
            undoView2 = undoView2;
        }
        boolean z4 = z3;
        UndoView undoView3 = undoView2;
        nk3Var.finishFragment();
        if (dVar instanceof ProfileActivity) {
            undoView = ((ProfileActivity) dVar).M;
        } else {
            undoView = undoView3;
        }
        if (undoView != null) {
            if (arrayList.size() == z4) {
                undoView.m(Integer.valueOf(arrayList2.size()), 53, ((bf7) arrayList.get(0)).a);
                return z4;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z4;
        }
        return z4;
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }
}
