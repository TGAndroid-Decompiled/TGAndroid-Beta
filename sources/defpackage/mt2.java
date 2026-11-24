package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ContactsActivity;
public final class mt2 implements e39, no7, ed {
    public final ContactsActivity a;

    public mt2(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        io5 H0 = gl.H0(vxcVar, false);
        int i = H0.d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.l0 = i;
        dg0.e(contactsActivity.d, H0.b, i, a.getCurrentActionBarHeight(), contactsActivity.i0);
        contactsActivity.d0();
        contactsActivity.c0();
        return vxc.b;
    }

    @Override
    public final boolean d(int i, View view) {
        ContactsActivity contactsActivity = this.a;
        w39 adapter = contactsActivity.d.getAdapter();
        ot2 ot2Var = contactsActivity.b;
        if (adapter == ot2Var) {
            int S = ot2Var.S(i);
            int Q = contactsActivity.b.Q(i);
            m21 m21Var = m21.w;
            if (m21Var != null) {
                m21Var.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z = contactsActivity.J;
        if (!z && !contactsActivity.K && (view instanceof v6c)) {
            contactsActivity.m0((v6c) view);
            return true;
        } else if (!z && !contactsActivity.K && (view instanceof rr8)) {
            rr8 rr8Var = (rr8) view;
            if (rr8Var.getUser() != null && rr8Var.getUser().contact) {
                contactsActivity.m0(rr8Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        ContactsActivity contactsActivity = this.a;
        vf6 vf6Var = contactsActivity.a0;
        ArrayList arrayList = new ArrayList(vf6Var.m());
        for (int i2 = 0; i2 < vf6Var.m(); i2++) {
            arrayList.add((TLRPC.User) vf6Var.f(vf6Var.j(i2)));
        }
        qu2 contactsController = contactsActivity.getContactsController();
        Activity parentActivity = contactsActivity.getParentActivity();
        contactsController.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.User user = (TLRPC.User) arrayList.get(i3);
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.g0.get(Long.valueOf(user.id));
                user.contact = false;
                contactsController.f0.remove(tL_contact);
                contactsController.g0.remove(Long.valueOf(user.id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            kk7 notificationCenter = contactsController.getNotificationCenter();
            int i4 = na7.q5;
            notificationCenter.k(2, 1);
            contactsController.getNotificationCenter().k(kk7.N, new Object[0]);
            e21 e21Var = new e21(parentActivity, contactsActivity.getResourceProvider());
            e21Var.setTimer();
            e21Var.b.setText(k96.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            k21 k21Var = new k21(contactsActivity.getResourceProvider(), parentActivity, true, true);
            k21Var.b = new n92(contactsController, hashMap, (byte) 29);
            k21Var.c = new fu2(contactsController, arrayList, (byte) 1);
            e21Var.setButton(k21Var);
            m21.g(contactsActivity, e21Var, 5000).j();
        }
        contactsActivity.h0();
    }
}
