package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ContactsActivity;
public final class xu2 implements h59, qq7, ee {
    public final ContactsActivity a;

    public xu2(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        iq5 H0 = gm.H0(wzcVar, false);
        int i = H0.d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.l0 = i;
        eh0.e(contactsActivity.d, H0.b, i, a.getCurrentActionBarHeight(), contactsActivity.i0);
        contactsActivity.e0();
        contactsActivity.d0();
        return wzc.b;
    }

    @Override
    public final boolean g(int i, View view) {
        ContactsActivity contactsActivity = this.a;
        y59 adapter = contactsActivity.d.getAdapter();
        zu2 zu2Var = contactsActivity.b;
        if (adapter == zu2Var) {
            int S = zu2Var.S(i);
            int Q = contactsActivity.b.Q(i);
            u31 u31Var = u31.x;
            if (u31Var != null) {
                u31Var.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z = contactsActivity.J;
        if (!z && !contactsActivity.K && (view instanceof w8c)) {
            contactsActivity.n0((w8c) view);
            return true;
        } else if (!z && !contactsActivity.K && (view instanceof ut8)) {
            ut8 ut8Var = (ut8) view;
            if (ut8Var.getUser() != null && ut8Var.getUser().contact) {
                contactsActivity.n0(ut8Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        ContactsActivity contactsActivity = this.a;
        vh6 vh6Var = contactsActivity.a0;
        ArrayList arrayList = new ArrayList(vh6Var.m());
        for (int i2 = 0; i2 < vh6Var.m(); i2++) {
            arrayList.add((TLRPC.User) vh6Var.f(vh6Var.j(i2)));
        }
        bw2 contactsController = contactsActivity.getContactsController();
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
            nm7 notificationCenter = contactsController.getNotificationCenter();
            int i4 = oc7.s5;
            notificationCenter.k(2, 1);
            contactsController.getNotificationCenter().k(nm7.N, new Object[0]);
            m31 m31Var = new m31(parentActivity, contactsActivity.getResourceProvider());
            m31Var.setTimer();
            m31Var.b.setText(jb6.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            s31 s31Var = new s31(contactsActivity.getResourceProvider(), parentActivity, true, true);
            s31Var.b = new mv2(contactsController, hashMap, (byte) 0);
            s31Var.c = new rv2(contactsController, arrayList, (byte) 1);
            m31Var.setButton(s31Var);
            u31.g(contactsActivity, m31Var, 5000).j();
        }
        contactsActivity.i0();
    }
}
