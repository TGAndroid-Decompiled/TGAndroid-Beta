package defpackage;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class q07 extends q59 {
    public final x07 c;

    public q07(x07 x07Var) {
        this.c = x07Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        x07 x07Var = this.c;
        ArrayList arrayList = x07Var.c;
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
            p(!x07Var.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override
    public final int b() {
        x07 x07Var = this.c;
        int i = 1;
        return ((x07Var.c.isEmpty() || !x07Var.x) ? 0 : 0) + x07Var.c.size() + (!x07Var.B ? 1 : 0);
    }

    @Override
    public final int d(int i) {
        x07 x07Var = this.c;
        if (i == 0 && !x07Var.B) {
            return 2;
        }
        if (i == b() - 1 && !x07Var.c.isEmpty() && x07Var.x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        x07 x07Var = this.c;
        ArrayList arrayList = x07Var.c;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            l07 l07Var = (l07) view;
            int i3 = i - (!x07Var.B ? 1 : 0);
            LongSparseArray longSparseArray = x07Var.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i3);
            if (i3 == arrayList.size() - 1 && !x07Var.x) {
                z = false;
            } else {
                z = true;
            }
            lka lkaVar = l07Var.d;
            l07Var.e = tL_chatInviteImporter;
            l07Var.f = z;
            l07Var.setWillNotDraw(!z);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            pc0 pc0Var = l07Var.a;
            pc0Var.q(user);
            l07Var.b.f(user, pc0Var);
            l07Var.c.l(m9c.r(user), false);
            String s = jb6.s(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                lkaVar.l(jb6.M0(2131748826, null), false);
                return;
            }
            long j = tL_chatInviteImporter.approved_by;
            if (j == 0) {
                lkaVar.l(jb6.a0("RequestedToJoinAt", null, 2131745893, s), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j);
            if (user2 != null) {
                lkaVar.l(jb6.a0("AddedBy", null, 2131754358, m9c.k(user2, true), s), false);
            } else {
                lkaVar.l("", false);
            }
        } else if (i2 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        l07 l07Var;
        x07 x07Var = this.c;
        boolean z = x07Var.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        l07Var = new l07(viewGroup.getContext(), x07Var, z);
                    } else {
                        d dVar = x07Var.g;
                        jm2 jm2Var = new jm2(dVar.getParentActivity(), dVar.getResourceProvider(), (byte) 2);
                        if (x07Var.B) {
                            anb.h(cmb.c6, dVar.getResourceProvider(), jm2Var);
                        }
                        jm2Var.e(cmb.c6, cmb.Z6, -1);
                        jm2Var.setViewType(15);
                        jm2Var.setMemberRequestButton(z);
                        jm2Var.setIsSingleCell(true);
                        jm2Var.setItemsCount(1);
                        jm2Var.setTag(-33024);
                        l07Var = jm2Var;
                    }
                } else {
                    l07Var = new View(viewGroup.getContext());
                }
            } else {
                o72 o72Var = new o72(viewGroup.getContext(), (byte) 12);
                o72Var.setTag(-33024);
                l07Var = o72Var;
            }
        } else {
            l07Var = new View(viewGroup.getContext());
        }
        return new u69(l07Var);
    }
}
