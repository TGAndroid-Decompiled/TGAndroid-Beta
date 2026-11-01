package oh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.tk0;
import s4.c1;
public final class j extends tk0 {
    public final q f14269c;

    public j(q qVar) {
        this.f14269c = qVar;
    }

    @Override
    public final boolean D(c1 c1Var) {
        if (c1Var.f47912f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        q qVar = this.f14269c;
        ArrayList arrayList = qVar.f14295c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = 0;
        while (i10 < list.size()) {
            long j10 = ((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id;
            int i11 = i10 + 1;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                } else if (((TLRPC.TL_chatInviteImporter) list.get(i11)).user_id == j10) {
                    list.remove(i10);
                    i10--;
                    break;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            o(!qVar.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override
    public final int b() {
        q qVar = this.f14269c;
        int i10 = 1;
        return ((qVar.f14295c.isEmpty() || !qVar.f14312x) ? 0 : 0) + qVar.f14295c.size() + (!qVar.B ? 1 : 0);
    }

    @Override
    public final int d(int i10) {
        q qVar = this.f14269c;
        if (i10 == 0 && !qVar.B) {
            return 2;
        }
        if (i10 == b() - 1 && !qVar.f14295c.isEmpty() && qVar.f14312x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void t(c1 c1Var, int i10) {
        boolean z10;
        q qVar = this.f14269c;
        ArrayList arrayList = qVar.f14295c;
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i11 == 0) {
            i5 i5Var = (i5) view;
            int i12 = i10 - (!qVar.B ? 1 : 0);
            LongSparseArray longSparseArray = qVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !qVar.f14312x) {
                z10 = false;
            } else {
                z10 = true;
            }
            u5 u5Var = i5Var.d;
            i5Var.e = tL_chatInviteImporter;
            i5Var.f22037f = z10;
            i5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            r8 r8Var = i5Var.f22034a;
            r8Var.r(user);
            i5Var.f22035b.e(user, r8Var);
            i5Var.f22036c.l(i20.p(user), false);
            String s10 = dd.s(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                u5Var.l(dd.L0(2131749079, null), false);
                return;
            }
            long j10 = tL_chatInviteImporter.approved_by;
            if (j10 == 0) {
                u5Var.l(dd.a0("RequestedToJoinAt", null, 2131746177, s10), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
            if (user2 != null) {
                u5Var.l(dd.a0("AddedBy", null, 2131754361, i20.j(user2, true), s10), false);
            } else {
                u5Var.l("", false);
            }
        } else if (i11 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final c1 w(ViewGroup viewGroup, int i10) {
        i5 i5Var;
        q qVar = this.f14269c;
        boolean z10 = qVar.f14293a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        i5Var = new i5(viewGroup.getContext(), qVar, z10);
                    } else {
                        k2 k2Var = qVar.f14297g;
                        i iVar = new i(0, k2Var.getParentActivity(), k2Var.getResourceProvider());
                        if (qVar.B) {
                            a7.i(t6.f20930d6, iVar, k2Var.getResourceProvider());
                        }
                        iVar.e(t6.f20930d6, t6.f20873a7, -1);
                        iVar.setViewType(15);
                        iVar.setMemberRequestButton(z10);
                        iVar.setIsSingleCell(true);
                        iVar.setItemsCount(1);
                        iVar.setTag(-33024);
                        i5Var = iVar;
                    }
                } else {
                    i5Var = new View(viewGroup.getContext());
                }
            } else {
                bn bnVar = new bn(viewGroup.getContext(), 3);
                bnVar.setTag(-33024);
                i5Var = bnVar;
            }
        } else {
            i5Var = new View(viewGroup.getContext());
        }
        return new c1(i5Var);
    }
}
