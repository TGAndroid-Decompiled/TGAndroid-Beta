package eh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import f2.q1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.z8;
public final class p extends vk0 {
    public final x f5219c;

    public p(x xVar) {
        this.f5219c = xVar;
    }

    @Override
    public final boolean D(q1 q1Var) {
        if (q1Var.f5505f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        x xVar = this.f5219c;
        ArrayList arrayList = xVar.f5248c;
        boolean isEmpty = arrayList.isEmpty();
        int i9 = 0;
        while (i9 < list.size()) {
            long j10 = ((TLRPC.TL_chatInviteImporter) list.get(i9)).user_id;
            int i10 = i9 + 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id == j10) {
                    list.remove(i9);
                    i9--;
                    break;
                } else {
                    i10++;
                }
            }
            i9++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            s(!xVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override
    public final int h() {
        x xVar = this.f5219c;
        int i9 = 1;
        return ((xVar.f5248c.isEmpty() || !xVar.f5266x) ? 0 : 0) + xVar.f5248c.size() + (!xVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i9) {
        x xVar = this.f5219c;
        if (i9 == 0 && !xVar.B) {
            return 2;
        }
        if (i9 == h() - 1 && !xVar.f5248c.isEmpty() && xVar.f5266x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(q1 q1Var, int i9) {
        boolean z10;
        x xVar = this.f5219c;
        ArrayList arrayList = xVar.f5248c;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 == 0) {
            g5 g5Var = (g5) view;
            int i11 = i9 - (!xVar.B ? 1 : 0);
            LongSparseArray longSparseArray = xVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i11);
            if (i11 == arrayList.size() - 1 && !xVar.f5266x) {
                z10 = false;
            } else {
                z10 = true;
            }
            h5 h5Var = g5Var.d;
            g5Var.f24395e = tL_chatInviteImporter;
            g5Var.f24396f = z10;
            g5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            z8 z8Var = g5Var.f24392a;
            z8Var.r(user);
            g5Var.f24393b.e(user, z8Var);
            g5Var.f24394c.l(UserObject.getUserName(user), false);
            String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                h5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j10 = tL_chatInviteImporter.approved_by;
            if (j10 == 0) {
                h5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
            if (user2 != null) {
                h5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
            } else {
                h5Var.l("", false);
            }
        } else if (i10 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final q1 x(ViewGroup viewGroup, int i9) {
        g5 g5Var;
        x xVar = this.f5219c;
        boolean z10 = xVar.f5246a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        g5Var = new g5(viewGroup.getContext(), xVar, z10);
                    } else {
                        o2 o2Var = xVar.f5251g;
                        o oVar = new o(o2Var.getParentActivity(), 0, o2Var.getResourceProvider());
                        if (xVar.B) {
                            oVar.setBackgroundColor(f6.v0(f6.f23001d6, o2Var.getResourceProvider()));
                        }
                        oVar.f(f6.f23001d6, f6.f22947a7, -1);
                        oVar.setViewType(15);
                        oVar.setMemberRequestButton(z10);
                        oVar.setIsSingleCell(true);
                        oVar.setItemsCount(1);
                        oVar.setTag(-33024);
                        g5Var = oVar;
                    }
                } else {
                    g5Var = new View(viewGroup.getContext());
                }
            } else {
                an anVar = new an(viewGroup.getContext(), 1);
                anVar.setTag(-33024);
                g5Var = anVar;
            }
        } else {
            g5Var = new View(viewGroup.getContext());
        }
        return new q1(g5Var);
    }
}
