package defpackage;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class qy6 extends n39 {
    public final xy6 c;

    public qy6(xy6 xy6Var) {
        this.c = xy6Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        xy6 xy6Var = this.c;
        ArrayList arrayList = xy6Var.c;
        boolean isEmpty = arrayList.isEmpty();
        int i = 0;
        while (i < list.size()) {
            long j = ((TLRPC.TL_chatInviteImporter) list.get(i)).user_id;
            int i2 = i + 1;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                } else if (((TLRPC.TL_chatInviteImporter) list.get(i2)).user_id == j) {
                    list.remove(i);
                    i--;
                    break;
                } else {
                    i2++;
                }
            }
            i++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            p(!xy6Var.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override
    public final int b() {
        xy6 xy6Var = this.c;
        int i = 1;
        return ((xy6Var.c.isEmpty() || !xy6Var.x) ? 0 : 0) + xy6Var.c.size() + (!xy6Var.B ? 1 : 0);
    }

    @Override
    public final int d(int i) {
        xy6 xy6Var = this.c;
        if (i == 0 && !xy6Var.B) {
            return 2;
        }
        if (i == b() - 1 && !xy6Var.c.isEmpty() && xy6Var.x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        xy6 xy6Var = this.c;
        ArrayList arrayList = xy6Var.c;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            ly6 ly6Var = (ly6) view;
            int i3 = i - (!xy6Var.B ? 1 : 0);
            LongSparseArray longSparseArray = xy6Var.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i3);
            if (i3 == arrayList.size() - 1 && !xy6Var.x) {
                z = false;
            } else {
                z = true;
            }
            jia jiaVar = ly6Var.d;
            ly6Var.e = tL_chatInviteImporter;
            ly6Var.f = z;
            ly6Var.setWillNotDraw(!z);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            pb0 pb0Var = ly6Var.a;
            pb0Var.q(user);
            ly6Var.b.f(user, pb0Var);
            ly6Var.c.l(l7c.q(user), false);
            String s = k96.s(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                jiaVar.l(k96.M0(2131748877, null), false);
                return;
            }
            long j = tL_chatInviteImporter.approved_by;
            if (j == 0) {
                jiaVar.l(k96.a0("RequestedToJoinAt", null, 2131745967, s), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j);
            if (user2 != null) {
                jiaVar.l(k96.a0("AddedBy", null, 2131754358, l7c.k(user2, true), s), false);
            } else {
                jiaVar.l("", false);
            }
        } else if (i2 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ly6 ly6Var;
        xy6 xy6Var = this.c;
        boolean z = xy6Var.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        ly6Var = new ly6(viewGroup.getContext(), xy6Var, z);
                    } else {
                        d dVar = xy6Var.g;
                        xk2 xk2Var = new xk2(dVar.getParentActivity(), dVar.getResourceProvider(), (byte) 2);
                        if (xy6Var.B) {
                            zkb.h(bkb.c6, dVar.getResourceProvider(), xk2Var);
                        }
                        xk2Var.e(bkb.c6, bkb.Z6, -1);
                        xk2Var.setViewType(15);
                        xk2Var.setMemberRequestButton(z);
                        xk2Var.setIsSingleCell(true);
                        xk2Var.setItemsCount(1);
                        xk2Var.setTag(-33024);
                        ly6Var = xk2Var;
                    }
                } else {
                    ly6Var = new View(viewGroup.getContext());
                }
            } else {
                d62 d62Var = new d62(viewGroup.getContext(), (byte) 12);
                d62Var.setTag(-33024);
                ly6Var = d62Var;
            }
        } else {
            ly6Var = new View(viewGroup.getContext());
        }
        return new s49(ly6Var);
    }
}
