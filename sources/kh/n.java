package kh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import f2.m1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z8;
public final class n extends sl0 {
    public final v f11277c;

    public n(v vVar) {
        this.f11277c = vVar;
    }

    @Override
    public final boolean D(m1 m1Var) {
        if (m1Var.f5879f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        v vVar = this.f11277c;
        ArrayList arrayList = vVar.f11306c;
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
        v vVar = this.f11277c;
        int i10 = 1;
        return ((vVar.f11306c.isEmpty() || !vVar.f11324x) ? 0 : 0) + vVar.f11306c.size() + (!vVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        v vVar = this.f11277c;
        if (i10 == 0 && !vVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !vVar.f11306c.isEmpty() && vVar.f11324x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(m1 m1Var, int i10) {
        boolean z4;
        v vVar = this.f11277c;
        ArrayList arrayList = vVar.f11306c;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i11 == 0) {
            g5 g5Var = (g5) view;
            int i12 = i10 - (!vVar.B ? 1 : 0);
            LongSparseArray longSparseArray = vVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !vVar.f11324x) {
                z4 = false;
            } else {
                z4 = true;
            }
            l5 l5Var = g5Var.d;
            g5Var.f22850e = tL_chatInviteImporter;
            g5Var.f22851f = z4;
            g5Var.setWillNotDraw(!z4);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            z8 z8Var = g5Var.f22847a;
            z8Var.r(user);
            g5Var.f22848b.e(user, z8Var);
            g5Var.f22849c.l(UserObject.getUserName(user), false);
            String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                l5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j10 = tL_chatInviteImporter.approved_by;
            if (j10 == 0) {
                l5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
            if (user2 != null) {
                l5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
            } else {
                l5Var.l("", false);
            }
        } else if (i11 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final m1 x(ViewGroup viewGroup, int i10) {
        g5 g5Var;
        v vVar = this.f11277c;
        boolean z4 = vVar.f11304a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        g5Var = new g5(viewGroup.getContext(), vVar, z4);
                    } else {
                        p2 p2Var = vVar.f11309g;
                        m mVar = new m(p2Var.getParentActivity(), 0, p2Var.getResourceProvider());
                        if (vVar.B) {
                            mVar.setBackgroundColor(k6.v0(k6.f21659d6, p2Var.getResourceProvider()));
                        }
                        mVar.f(k6.f21659d6, k6.f21605a7, -1);
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
                jn jnVar = new jn(viewGroup.getContext(), 3);
                jnVar.setTag(-33024);
                g5Var = jnVar;
            }
        } else {
            g5Var = new View(viewGroup.getContext());
        }
        return new m1(g5Var);
    }
}
