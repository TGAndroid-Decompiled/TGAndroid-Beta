package hh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.il0;
public final class n extends il0 {
    public final v f8093c;

    public n(v vVar) {
        this.f8093c = vVar;
    }

    @Override
    public final boolean D(n1 n1Var) {
        if (n1Var.f6436f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        v vVar = this.f8093c;
        ArrayList arrayList = vVar.f8122c;
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
        v vVar = this.f8093c;
        int i10 = 1;
        return ((vVar.f8122c.isEmpty() || !vVar.f8140x) ? 0 : 0) + vVar.f8122c.size() + (!vVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        v vVar = this.f8093c;
        if (i10 == 0 && !vVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !vVar.f8122c.isEmpty() && vVar.f8140x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(n1 n1Var, int i10) {
        boolean z10;
        v vVar = this.f8093c;
        ArrayList arrayList = vVar.f8122c;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i11 == 0) {
            e5 e5Var = (e5) view;
            int i12 = i10 - (!vVar.B ? 1 : 0);
            LongSparseArray longSparseArray = vVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !vVar.f8140x) {
                z10 = false;
            } else {
                z10 = true;
            }
            h5 h5Var = e5Var.d;
            e5Var.f24291e = tL_chatInviteImporter;
            e5Var.f24292f = z10;
            e5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            e9 e9Var = e5Var.f24288a;
            e9Var.r(user);
            e5Var.f24289b.e(user, e9Var);
            e5Var.f24290c.l(UserObject.getUserName(user), false);
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
        } else if (i11 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        e5 e5Var;
        v vVar = this.f8093c;
        boolean z10 = vVar.f8120a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        e5Var = new e5(viewGroup.getContext(), vVar, z10);
                    } else {
                        o2 o2Var = vVar.f8125g;
                        m mVar = new m(o2Var.getParentActivity(), 0, o2Var.getResourceProvider());
                        if (vVar.B) {
                            mVar.setBackgroundColor(g6.v0(g6.f23062d6, o2Var.getResourceProvider()));
                        }
                        mVar.f(g6.f23062d6, g6.f23009a7, -1);
                        mVar.setViewType(15);
                        mVar.setMemberRequestButton(z10);
                        mVar.setIsSingleCell(true);
                        mVar.setItemsCount(1);
                        mVar.setTag(-33024);
                        e5Var = mVar;
                    }
                } else {
                    e5Var = new View(viewGroup.getContext());
                }
            } else {
                fn fnVar = new fn(viewGroup.getContext(), 3);
                fnVar.setTag(-33024);
                e5Var = fnVar;
            }
        } else {
            e5Var = new View(viewGroup.getContext());
        }
        return new n1(e5Var);
    }
}
