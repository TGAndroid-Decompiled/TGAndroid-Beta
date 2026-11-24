package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
public final class qba implements rn4, yc7, wi3 {
    public final nfa a;

    public qba(nfa nfaVar) {
        this.a = nfaVar;
    }

    @Override
    public final boolean F() {
        return false;
    }

    @Override
    public final void a(String str) {
        this.a.w0(str);
    }

    public final void b(boolean z) {
        nfa nfaVar = this.a;
        if (!z) {
            nfaVar.requestLayout();
        }
        nfaVar.setVisibleHeight(nfaVar.Q1);
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        UndoView undoView;
        nfa nfaVar = this.a;
        SparseArray[] sparseArrayArr = nfaVar.c1;
        d dVar = nfaVar.y1;
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
                    arrayList2.add((k27) sparseArrayArr[i3].get(num.intValue()));
                }
            }
            sparseArrayArr[i3].clear();
            i3--;
        }
        nfaVar.d1 = 0;
        nfaVar.l1(false);
        yea yeaVar = nfaVar.U;
        if (yeaVar != null) {
            yeaVar.x.clear();
        }
        UndoView undoView2 = null;
        if (arrayList.size() <= 1 && ((zc7) arrayList.get(0)).a != dVar.getUserConfig().e() && charSequence == null) {
            long j = ((zc7) arrayList.get(0)).a;
            Bundle l = ir2.l("scrollToTopOnResume", true);
            if (cf3.B(j)) {
                l.putInt("enc_id", (int) (j & 4294967295L));
            } else {
                if (cf3.D(j)) {
                    l.putLong("user_id", j);
                } else {
                    l.putLong("chat_id", -j);
                }
                if (!dVar.getMessagesController().A(l, cj3Var, null, null)) {
                    return true;
                }
            }
            dVar.getNotificationCenter().k(kk7.s, new Object[0]);
            mu1 mu1Var = new mu1(l);
            mm4.a(mu1Var, (zc7) arrayList.get(0));
            cj3Var.presentFragment(mu1Var, true);
            mu1Var.Ob(arrayList2);
            return true;
        }
        nfaVar.J1(true);
        int i6 = 0;
        while (i6 < arrayList.size()) {
            long j2 = ((zc7) arrayList.get(i6)).a;
            if (charSequence != null) {
                dVar.getSendMessagesHelper().q0(x3a.b(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            dVar.getSendMessagesHelper().p0(arrayList2, j2, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i6++;
            z3 = z3;
            undoView2 = undoView2;
        }
        boolean z4 = z3;
        UndoView undoView3 = undoView2;
        cj3Var.finishFragment();
        if (dVar instanceof ProfileActivity) {
            undoView = ((ProfileActivity) dVar).M;
        } else {
            undoView = undoView3;
        }
        if (undoView != null) {
            if (arrayList.size() == z4) {
                undoView.m(Integer.valueOf(arrayList2.size()), 53, ((zc7) arrayList.get(0)).a);
                return z4;
            }
            undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
            return z4;
        }
        return z4;
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }
}
