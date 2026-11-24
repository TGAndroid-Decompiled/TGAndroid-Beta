package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.c;
import org.telegram.ui.ProfileActivity;
public final class ph implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ph(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        byte b = this.a;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                oo7 oo7Var = (oo7) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = oc7.r1(z8c.t0).W3.edit();
                if (i == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.M0.run();
                oo7Var.run();
                return;
            case 1:
                ((vg1) obj3).S0(i, (ArrayList) obj2, (Integer) obj);
                return;
            case 2:
                c cVar = (c) obj3;
                final dlc dlcVar = (dlc) obj2;
                ArrayList arrayList = dlcVar.b;
                mc8 mc8Var = (mc8) obj;
                cVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (final int i2 = 0; i2 < arrayList.size(); i2++) {
                    Context context = cVar.a.getContext();
                    CharSequence charSequence = (CharSequence) arrayList.get(i2);
                    if (i2 == dlcVar.c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    d53 d53Var = un3.I0;
                    arrayList2.add(new k7(context, charSequence, null, this.b, z));
                    arrayList3.add(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            int i3 = i2;
                            dlc dlcVar2 = dlcVar;
                            switch (b2) {
                                case 0:
                                    dlcVar2.d.a(Integer.valueOf(i3));
                                    return;
                                default:
                                    dlcVar2.d.a(Integer.valueOf(i3));
                                    return;
                            }
                        }
                    });
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = mc8Var.s;
                Activity activity = mc8Var.a;
                ylb ylbVar = mc8Var.r;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232582, 0, ylbVar, activity);
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232063, jb6.M0(2131753721, null), false, mc8Var.r).setOnClickListener(new m67(mc8Var, (byte) 20));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(new j8(activity, ylbVar), qoe.o(-1, 8));
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    View view2 = (View) arrayList2.get(i3);
                    view2.setBackground(cmb.f0(cmb.p1(0.12f, cmb.v0(cmb.D8, ylbVar)), 2, -1));
                    view2.setMinimumWidth(gm.L(220.0f));
                    view2.setOnClickListener(new lc8(mc8Var, (Runnable) arrayList3.get(i3), (byte) 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(view2, qoe.o(-1, 44));
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(actionBarPopupWindow$ActionBarPopupWindowLayout.b(actionBarPopupWindow$ActionBarPopupWindowLayout2));
                return;
            case 3:
                c cVar2 = (c) obj3;
                final dlc dlcVar2 = (dlc) obj2;
                ArrayList arrayList4 = dlcVar2.b;
                xv4 xv4Var = (xv4) obj;
                cVar2.getClass();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (final int i4 = 0; i4 < arrayList4.size(); i4++) {
                    Context context2 = cVar2.a.getContext();
                    CharSequence charSequence2 = (CharSequence) arrayList4.get(i4);
                    if (i4 == dlcVar2.c) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    d53 d53Var2 = un3.I0;
                    arrayList5.add(new k7(context2, charSequence2, null, this.b, z2));
                    arrayList6.add(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            int i32 = i4;
                            dlc dlcVar22 = dlcVar2;
                            switch (b2) {
                                case 0:
                                    dlcVar22.d.a(Integer.valueOf(i32));
                                    return;
                                default:
                                    dlcVar22.d.a(Integer.valueOf(i32));
                                    return;
                            }
                        }
                    });
                }
                xv4Var.g(arrayList5, arrayList6);
                return;
            case 4:
                g95 g95Var = (g95) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i < arrayList7.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) g95Var.T2.d.f(k47.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    g95Var.r1(groupCallParticipant, k47.B1(groupCallParticipant.peer), ((Integer) arrayList7.get(i)).intValue());
                    k85 k85Var = g95Var.U4;
                    if (k85Var != null) {
                        k85Var.dismiss();
                        return;
                    } else if (((Integer) arrayList7.get(i)).intValue() != 9 && ((Integer) arrayList7.get(i)).intValue() != 10 && ((Integer) arrayList7.get(i)).intValue() != 11) {
                        g95Var.T0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                b61 b61Var = (b61) obj3;
                Context context3 = (Context) obj2;
                my0 my0Var = (my0) obj;
                if (!b61Var.R) {
                    b61Var.setLoading(true);
                    int i5 = this.b;
                    ly7.a(context3, i5, new e(b61Var, context3, my0Var, i5, (byte) 7));
                    return;
                }
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.e7;
                ((m8) ((AtomicReference) obj2).get()).dismiss();
                try {
                    gm.g(str);
                    if (i == profileActivity.P3) {
                        c41.b0(profileActivity).i(jb6.M0(2131752714, null)).j();
                    } else {
                        c41.b0(profileActivity).i(jb6.M0(2131752646, null)).j();
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                sxb sxbVar = (sxb) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                oc7 messagesController = sxbVar.getMessagesController();
                long j = -sxbVar.a;
                if (messagesController.o2(j, tL_forumTopic.id, null)) {
                    sxbVar.getNotificationsController().G(j, tL_forumTopic.id, false);
                    sxbVar.finishPreviewFragment();
                    if (c41.a(sxbVar)) {
                        c41.z(sxbVar, 4, 0, sxbVar.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i);
                return;
        }
    }

    public ph(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public ph(d dVar, Object obj, Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = dVar;
        this.d = obj;
        this.e = serializable;
        this.b = i;
    }
}
