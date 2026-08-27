package fh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import f2.o1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zm;

public final class n extends yk0 {

    public final v f6146c;

    public n(v vVar) {
        this.f6146c = vVar;
    }

    @Override
    public final boolean D(o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    public final void E(List list) {
        v vVar = this.f6146c;
        ArrayList arrayList = vVar.f6175c;
        boolean zIsEmpty = arrayList.isEmpty();
        int i10 = 0;
        while (i10 < list.size()) {
            long j10 = ((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id;
            for (int i11 = i10 + 1; i11 < list.size(); i11++) {
                if (((TLRPC.TL_chatInviteImporter) list.get(i11)).user_id == j10) {
                    list.remove(i10);
                    i10--;
                    break;
                }
            }
            i10++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (zIsEmpty) {
            s(!vVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override
    public final int h() {
        v vVar = this.f6146c;
        return ((vVar.f6175c.isEmpty() || !vVar.f6193x) ? 0 : 1) + vVar.f6175c.size() + (!vVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        v vVar = this.f6146c;
        if (i10 != 0 || vVar.B) {
            return (i10 == h() + (-1) && !vVar.f6175c.isEmpty() && vVar.f6193x) ? 4 : 0;
        }
        return 2;
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        v vVar = this.f6146c;
        ArrayList arrayList = vVar.f6175c;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 != 0) {
            if (i11 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        d5 d5Var = (d5) view;
        int i12 = i10 - (!vVar.B ? 1 : 0);
        LongSparseArray longSparseArray = vVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
        boolean z10 = i12 != arrayList.size() - 1 || vVar.f6193x;
        h5 h5Var = d5Var.d;
        d5Var.f24218e = tL_chatInviteImporter;
        d5Var.f24219f = z10;
        d5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        y8 y8Var = d5Var.f24215a;
        y8Var.r(user);
        d5Var.f24216b.e(user, y8Var);
        d5Var.f24217c.l(UserObject.getUserName(user), false);
        String dateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            h5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
            return;
        }
        long j10 = tL_chatInviteImporter.approved_by;
        if (j10 == 0) {
            h5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, dateAudio), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
        if (user2 != null) {
            h5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), dateAudio), false);
        } else {
            h5Var.l("", false);
        }
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        View view;
        v vVar = this.f6146c;
        boolean z10 = vVar.f6173a;
        if (i10 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i10 == 2) {
            zm zmVar = new zm(viewGroup.getContext(), 3);
            zmVar.setTag(-33024);
            view = zmVar;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new d5(viewGroup.getContext(), vVar, z10);
        } else {
            n2 n2Var = vVar.f6178g;
            m mVar = new m(n2Var.getParentActivity(), 0, n2Var.getResourceProvider());
            if (vVar.B) {
                mVar.setBackgroundColor(g6.v0(g6.f23053d6, n2Var.getResourceProvider()));
            }
            mVar.f(g6.f23053d6, g6.f22999a7, -1);
            mVar.setViewType(15);
            mVar.setMemberRequestButton(z10);
            mVar.setIsSingleCell(true);
            mVar.setItemsCount(1);
            mVar.setTag(-33024);
            view = mVar;
        }
        return new lk0(view);
    }
}
