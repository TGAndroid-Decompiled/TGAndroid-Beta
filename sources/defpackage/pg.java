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
public final class pg implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public pg(Object obj, int i, Object obj2, Object obj3, byte b) {
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
                lm7 lm7Var = (lm7) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = na7.q1(y6c.t0).W3.edit();
                if (i == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.M0.run();
                lm7Var.run();
                return;
            case 1:
                ((nf1) obj3).R0(i, (ArrayList) obj2, (Integer) obj);
                return;
            case 2:
                c cVar = (c) obj3;
                final djc djcVar = (djc) obj2;
                ArrayList arrayList = djcVar.b;
                vt4 vt4Var = (vt4) obj;
                cVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (final int i2 = 0; i2 < arrayList.size(); i2++) {
                    Context context = cVar.a.getContext();
                    CharSequence charSequence = (CharSequence) arrayList.get(i2);
                    if (i2 == djcVar.c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    s33 s33Var = jm3.I0;
                    arrayList2.add(new k7(context, charSequence, null, this.b, z));
                    arrayList3.add(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            int i3 = i2;
                            djc djcVar2 = djcVar;
                            switch (b2) {
                                case 0:
                                    djcVar2.d.a(Integer.valueOf(i3));
                                    return;
                                default:
                                    djcVar2.d.a(Integer.valueOf(i3));
                                    return;
                            }
                        }
                    });
                }
                vt4Var.g(arrayList2, arrayList3);
                return;
            case 3:
                c cVar2 = (c) obj3;
                final djc djcVar2 = (djc) obj2;
                ArrayList arrayList4 = djcVar2.b;
                ja8 ja8Var = (ja8) obj;
                cVar2.getClass();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (final int i3 = 0; i3 < arrayList4.size(); i3++) {
                    Context context2 = cVar2.a.getContext();
                    CharSequence charSequence2 = (CharSequence) arrayList4.get(i3);
                    if (i3 == djcVar2.c) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    s33 s33Var2 = jm3.I0;
                    arrayList5.add(new k7(context2, charSequence2, null, this.b, z2));
                    arrayList6.add(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            int i32 = i3;
                            djc djcVar22 = djcVar2;
                            switch (b2) {
                                case 0:
                                    djcVar22.d.a(Integer.valueOf(i32));
                                    return;
                                default:
                                    djcVar22.d.a(Integer.valueOf(i32));
                                    return;
                            }
                        }
                    });
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ja8Var.s;
                Activity activity = ja8Var.a;
                wjb wjbVar = ja8Var.r;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232570, 0, wjbVar, activity);
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232062, k96.M0(2131753753, null), false, ja8Var.r).setOnClickListener(new fr7(ja8Var, (byte) 17));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(new j8(activity, wjbVar), nme.o(-1, 8));
                for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                    View view2 = (View) arrayList5.get(i4);
                    view2.setBackground(bkb.f0(bkb.p1(0.12f, bkb.v0(bkb.D8, wjbVar)), 2, -1));
                    view2.setMinimumWidth(gl.L(220.0f));
                    view2.setOnClickListener(new ha8(ja8Var, (Runnable) arrayList6.get(i4), (byte) 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(view2, nme.o(-1, 44));
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(actionBarPopupWindow$ActionBarPopupWindowLayout.b(actionBarPopupWindow$ActionBarPopupWindowLayout2));
                return;
            case 4:
                h75 h75Var = (h75) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i < arrayList7.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) h75Var.T2.d.f(k27.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    h75Var.r1(groupCallParticipant, k27.B1(groupCallParticipant.peer), ((Integer) arrayList7.get(i)).intValue());
                    m65 m65Var = h75Var.U4;
                    if (m65Var != null) {
                        m65Var.dismiss();
                        return;
                    } else if (((Integer) arrayList7.get(i)).intValue() != 9 && ((Integer) arrayList7.get(i)).intValue() != 10 && ((Integer) arrayList7.get(i)).intValue() != 11) {
                        h75Var.T0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                u41 u41Var = (u41) obj3;
                Context context3 = (Context) obj2;
                fx0 fx0Var = (fx0) obj;
                if (!u41Var.R) {
                    u41Var.setLoading(true);
                    int i5 = this.b;
                    iw7.a(context3, i5, new e(u41Var, context3, fx0Var, i5, (byte) 7));
                    return;
                }
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.Z6;
                ((m8) ((AtomicReference) obj2).get()).dismiss();
                try {
                    gl.g(str);
                    if (i == profileActivity.P3) {
                        u21.b0(profileActivity).i(k96.M0(2131752749, null)).j();
                    } else {
                        u21.b0(profileActivity).i(k96.M0(2131752681, null)).j();
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                qvb qvbVar = (qvb) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                na7 messagesController = qvbVar.getMessagesController();
                long j = -qvbVar.a;
                if (messagesController.n2(j, tL_forumTopic.id, null)) {
                    qvbVar.getNotificationsController().G(j, tL_forumTopic.id, false);
                    qvbVar.finishPreviewFragment();
                    if (u21.a(qvbVar)) {
                        u21.z(qvbVar, 4, 0, qvbVar.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i);
                return;
        }
    }

    public pg(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public pg(d dVar, Object obj, Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = dVar;
        this.d = obj;
        this.e = serializable;
        this.b = i;
    }
}
