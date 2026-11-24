package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class tf1 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final TLRPC.TL_error c;
    public final TLObject d;
    public final boolean e;
    public final long f;
    public final long h;
    public final Object n;
    public final Object r;
    public final Object s;
    public final Object w;
    public final Object x;
    public final Object y;

    public tf1(u41 u41Var, TLObject tLObject, int i, long j, fx0 fx0Var, TL_payments.starRefProgram starrefprogram, long j2, boolean z, Context context, wjb wjbVar, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = u41Var;
        this.d = tLObject;
        this.b = i;
        this.f = j;
        this.r = fx0Var;
        this.s = starrefprogram;
        this.h = j2;
        this.e = z;
        this.w = context;
        this.x = wjbVar;
        this.y = user;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        boolean z;
        TL_payments.connectedBotStarRef connectedbotstarref;
        d S;
        boolean z2;
        ArrayList arrayList;
        byte b = this.a;
        Object obj = this.y;
        Object obj2 = this.x;
        long j = this.h;
        Object obj3 = this.w;
        Object obj4 = this.s;
        boolean z3 = this.e;
        Object obj5 = this.r;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        Object obj6 = this.n;
        switch (b) {
            case 0:
                fx0 fx0Var = (fx0) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                wjb wjbVar = (wjb) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((u41) obj6).setLoading(false);
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i = this.b;
                    ct0 g = ct0.g(i);
                    long j2 = this.f;
                    zs0 d = g.d(j2);
                    int i2 = d.a;
                    na7.q1(i2).a4(connectedstarrefbots.users, false);
                    d.c = 0;
                    d.h = false;
                    d.d = false;
                    ArrayList arrayList2 = d.e;
                    arrayList2.clear();
                    if (d.i != 0) {
                        ConnectionsManager.getInstance(i2).cancelRequest(d.i, true);
                        d.i = 0;
                    }
                    d.g = false;
                    d.c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList2.size() < d.c) {
                        z = false;
                    } else {
                        z = true;
                    }
                    d.d = z;
                    d.h = false;
                    kk7.f(i2).k(239, Long.valueOf(d.b));
                    d.a();
                    fx0Var.dismiss();
                    int i3 = 0;
                    while (true) {
                        if (i3 < connectedstarrefbots.connected_bots.size()) {
                            connectedbotstarref = connectedstarrefbots.connected_bots.get(i3);
                            if (connectedbotstarref.bot_id != starrefprogram.bot_id) {
                                i3++;
                            }
                        } else {
                            connectedbotstarref = null;
                        }
                    }
                    if ((j != j2 || z3) && (S = LaunchActivity.S()) != null && (!(S instanceof eg1) || ((eg1) S).S != j2)) {
                        S.presentFragment(new eg1(j2));
                    }
                    if (connectedbotstarref != null) {
                        at0 e = ct0.g(i).e(j2);
                        long j3 = connectedbotstarref.bot_id;
                        ArrayList arrayList3 = e.e;
                        int i4 = 0;
                        while (true) {
                            if (i4 < arrayList3.size()) {
                                if (((TL_payments.starRefProgram) arrayList3.get(i4)).bot_id == j3) {
                                    arrayList3.remove(i4);
                                    e.c--;
                                    kk7.f(e.a).k(238, Long.valueOf(e.b));
                                } else {
                                    i4++;
                                }
                            }
                        }
                        new u21(eg1.J0(context, i, connectedbotstarref, j2, wjbVar).F, wjbVar).V(Arrays.asList(user), k96.M0(2131754332, null), k96.M0(2131754333, null), null).j();
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ug8.u(fx0Var.F, wjbVar, tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                c32 c32Var = (c32) obj6;
                j5 j5Var = (j5) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = c32Var.Q;
                SparseArray sparseArray = c32Var.P;
                ArrayList arrayList8 = c32Var.N;
                HashMap hashMap = c32Var.R;
                ArrayList arrayList9 = c32Var.M;
                ArrayList arrayList10 = c32Var.O;
                d32 d32Var = c32Var.Y;
                if (this.b == c32Var.U) {
                    c32Var.T = false;
                    q22 q22Var = d32Var.M;
                    if (tL_error != null) {
                        q22Var.d.setText(k96.M0(2131745608, null));
                        q22Var.e.setVisibility(0);
                        q22Var.e.setText(k96.M0(2131745615, null));
                        q22Var.e(false, true);
                        return;
                    }
                    r22 r22Var = d32Var.r;
                    q22Var.e(false, true);
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    c32Var.H = messages_messages.next_rate;
                    int i5 = j5Var.a;
                    r22 r22Var2 = r22Var;
                    ad7.Y(i5).j1(messages_messages.users, messages_messages.chats, true, true);
                    na7.q1(i5).a4(messages_messages.users, false);
                    na7.q1(i5).U3(messages_messages.chats, false);
                    if (!z3) {
                        arrayList10.clear();
                        sparseArray.clear();
                        arrayList7.clear();
                        hashMap.clear();
                    }
                    int i6 = messages_messages.count;
                    c32Var.L = str;
                    int size = arrayList4.size();
                    int i7 = 0;
                    while (i7 < size) {
                        k27 k27Var = (k27) arrayList4.get(i7);
                        String str2 = k27Var.Y;
                        ArrayList arrayList11 = (ArrayList) hashMap.get(str2);
                        ArrayList arrayList12 = arrayList4;
                        if (arrayList11 == null) {
                            arrayList = new ArrayList();
                            hashMap.put(str2, arrayList);
                            arrayList7.add(str2);
                        } else {
                            arrayList = arrayList11;
                        }
                        arrayList.add(k27Var);
                        arrayList10.add(k27Var);
                        sparseArray.put(k27Var.e1(), k27Var);
                        i7++;
                        arrayList4 = arrayList12;
                    }
                    if (arrayList10.size() > i6) {
                        i6 = arrayList10.size();
                    }
                    if (arrayList10.size() >= i6) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c32Var.W = z2;
                    if (arrayList10.isEmpty()) {
                        if (TextUtils.isEmpty(c32Var.L) && this.f == 0 && j == 0) {
                            wla wlaVar = q22Var.d;
                            l46 l46Var = q22Var.e;
                            wlaVar.setText(k96.M0(2131745609, null));
                            l46Var.setVisibility(0);
                            l46Var.setText(k96.M0(2131745614, null));
                        } else {
                            wla wlaVar2 = q22Var.d;
                            l46 l46Var2 = q22Var.e;
                            wlaVar2.setText(k96.M0(2131745608, null));
                            l46Var2.setVisibility(0);
                            l46Var2.setText(k96.M0(2131745615, null));
                        }
                    }
                    if (!z3) {
                        arrayList9.clear();
                        if (arrayList5 != null) {
                            arrayList9.addAll(arrayList5);
                        }
                        if (str.length() >= 3 && (k96.M0(2131745709, null).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                            int i8 = 0;
                            while (true) {
                                if (i8 < arrayList9.size()) {
                                    if (!(arrayList9.get(i8) instanceof TLRPC.User) || y6c.h(y6c.t0).f().id != ((TLRPC.User) arrayList9.get(i8)).id) {
                                        i8++;
                                    }
                                } else {
                                    arrayList9.add(0, y6c.h(y6c.t0).f());
                                }
                            }
                        }
                        arrayList8.clear();
                        arrayList8.addAll(arrayList6);
                        c32Var.a0(arrayList9, arrayList8, TextUtils.isEmpty(c32Var.L));
                    }
                    int i9 = -1;
                    int i10 = 0;
                    pi4 pi4Var = null;
                    while (true) {
                        r22 r22Var3 = r22Var2;
                        if (i10 < size) {
                            View childAt = r22Var3.getChildAt(i10);
                            if (childAt instanceof pi4) {
                                i9 = RecyclerView.R(childAt);
                                pi4Var = childAt;
                            }
                            i10++;
                            r22Var2 = r22Var3;
                        } else {
                            if (pi4Var != null) {
                                r22Var3.removeView(pi4Var);
                            }
                            if ((d32Var.K.getVisibility() == 0 && r22Var3.getChildCount() <= 1) || pi4Var != null) {
                                d32Var.getViewTreeObserver().addOnPreDrawListener(new a32(c32Var, pi4Var, i9, (byte) 0));
                            }
                            c32Var.f();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
        }
    }

    public tf1(c32 c32Var, int i, TLRPC.TL_error tL_error, TLObject tLObject, j5 j5Var, boolean z, String str, ArrayList arrayList, long j, long j2, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = c32Var;
        this.b = i;
        this.c = tL_error;
        this.d = tLObject;
        this.r = j5Var;
        this.e = z;
        this.s = str;
        this.w = arrayList;
        this.f = j;
        this.h = j2;
        this.x = arrayList2;
        this.y = arrayList3;
    }
}
