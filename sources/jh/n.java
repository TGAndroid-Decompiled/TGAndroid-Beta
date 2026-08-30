package jh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import f2.l1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.z8;
public final class n extends rl0 {
    public final v f9455c;

    public n(v vVar) {
        this.f9455c = vVar;
    }

    @Override
    public final boolean D(l1 l1Var) {
        if (l1Var.f5788f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        v vVar = this.f9455c;
        ArrayList arrayList = vVar.f9481c;
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
            s(!vVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override
    public final int h() {
        v vVar = this.f9455c;
        int i10 = 1;
        return ((vVar.f9481c.isEmpty() || !vVar.f9498x) ? 0 : 0) + vVar.f9481c.size() + (!vVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        v vVar = this.f9455c;
        if (i10 == 0 && !vVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !vVar.f9481c.isEmpty() && vVar.f9498x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(l1 l1Var, int i10) {
        boolean z4;
        v vVar = this.f9455c;
        ArrayList arrayList = vVar.f9481c;
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i11 == 0) {
            g5 g5Var = (g5) view;
            int i12 = i10 - (!vVar.B ? 1 : 0);
            LongSparseArray longSparseArray = vVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !vVar.f9498x) {
                z4 = false;
            } else {
                z4 = true;
            }
            k5 k5Var = g5Var.d;
            g5Var.e = tL_chatInviteImporter;
            g5Var.f21101f = z4;
            g5Var.setWillNotDraw(!z4);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            z8 z8Var = g5Var.f21098a;
            z8Var.r(user);
            g5Var.f21099b.e(user, z8Var);
            g5Var.f21100c.l(UserObject.getUserName(user), false);
            String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                k5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j10 = tL_chatInviteImporter.approved_by;
            if (j10 == 0) {
                k5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
            if (user2 != null) {
                k5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
            } else {
                k5Var.l("", false);
            }
        } else if (i11 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final l1 x(ViewGroup viewGroup, int i10) {
        g5 g5Var;
        v vVar = this.f9455c;
        boolean z4 = vVar.f9479a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        g5Var = new g5(viewGroup.getContext(), vVar, z4);
                    } else {
                        p2 p2Var = vVar.f9483g;
                        m mVar = new m(p2Var.getParentActivity(), 0, p2Var.getResourceProvider());
                        if (vVar.B) {
                            mVar.setBackgroundColor(j6.v0(j6.f19906d6, p2Var.getResourceProvider()));
                        }
                        mVar.f(j6.f19906d6, j6.f19852a7, -1);
                        mVar.setViewType(15);
                        mVar.setMemberRequestButton(z4);
                        mVar.setIsSingleCell(true);
                        mVar.setItemsCount(1);
                        mVar.setTag(-33024);
                        g5Var = mVar;
                    }
                } else {
                    g5Var = new View(viewGroup.getContext());
                }
            } else {
                hn hnVar = new hn(viewGroup.getContext(), 3);
                hnVar.setTag(-33024);
                g5Var = hnVar;
            }
        } else {
            g5Var = new View(viewGroup.getContext());
        }
        return new l1(g5Var);
    }
}
