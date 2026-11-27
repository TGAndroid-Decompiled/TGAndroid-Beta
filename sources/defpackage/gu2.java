package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ContactsActivity;
public final class gu2 implements t69, nr7, fd {
    public final ContactsActivity a;

    public gu2(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        mq5 H0 = hl.H0(l2dVar, false);
        int i = H0.d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.l0 = i;
        eg0.g(contactsActivity.d, H0.b, i, a.getCurrentActionBarHeight(), contactsActivity.i0);
        contactsActivity.d0();
        contactsActivity.c0();
        return l2d.b;
    }

    @Override
    public final boolean e(int i, View view) {
        ContactsActivity contactsActivity = this.a;
        j79 adapter = contactsActivity.d.getAdapter();
        iu2 iu2Var = contactsActivity.b;
        if (adapter == iu2Var) {
            int S = iu2Var.S(i);
            int Q = contactsActivity.b.Q(i);
            v21 v21Var = v21.x;
            if (v21Var != null) {
                v21Var.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z = contactsActivity.J;
        if (!z && !contactsActivity.K && (view instanceof vac)) {
            contactsActivity.m0((vac) view);
            return true;
        } else if (!z && !contactsActivity.K && (view instanceof bv8)) {
            bv8 bv8Var = (bv8) view;
            if (bv8Var.getUser() != null && bv8Var.getUser().contact) {
                contactsActivity.m0(bv8Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        ContactsActivity contactsActivity = this.a;
        zh6 zh6Var = contactsActivity.a0;
        ArrayList arrayList = new ArrayList(zh6Var.m());
        for (int i2 = 0; i2 < zh6Var.m(); i2++) {
            arrayList.add((TLRPC.User) zh6Var.f(zh6Var.j(i2)));
        }
        lv2 contactsController = contactsActivity.getContactsController();
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
            jn7 notificationCenter = contactsController.getNotificationCenter();
            int i4 = uc7.s5;
            notificationCenter.k(2, 1);
            contactsController.getNotificationCenter().k(jn7.N, new Object[0]);
            n21 n21Var = new n21(parentActivity, contactsActivity.getResourceProvider());
            n21Var.setTimer();
            n21Var.b.setText(ob6.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            t21 t21Var = new t21(contactsActivity.getResourceProvider(), parentActivity, true, true);
            t21Var.b = new ea2(contactsController, hashMap, (byte) 28);
            t21Var.c = new zu2(contactsController, arrayList, (byte) 2);
            n21Var.setButton(t21Var);
            v21.g(contactsActivity, n21Var, 5000).j();
        }
        contactsActivity.h0();
    }
}
