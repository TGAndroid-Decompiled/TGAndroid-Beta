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
public final class bh1 implements Runnable {
    public final byte a = 0;
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

    public bh1(b61 b61Var, TLObject tLObject, int i, long j, my0 my0Var, TL_payments.starRefProgram starrefprogram, long j2, boolean z, Context context, ylb ylbVar, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = b61Var;
        this.d = tLObject;
        this.b = i;
        this.f = j;
        this.r = my0Var;
        this.s = starrefprogram;
        this.h = j2;
        this.e = z;
        this.w = context;
        this.x = ylbVar;
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
                my0 my0Var = (my0) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                ylb ylbVar = (ylb) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((b61) obj6).setLoading(false);
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i = this.b;
                    ku0 g = ku0.g(i);
                    long j2 = this.f;
                    hu0 d = g.d(j2);
                    int i2 = d.a;
                    oc7.r1(i2).d4(connectedstarrefbots.users, false);
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
                    nm7.f(i2).k(240, Long.valueOf(d.b));
                    d.a();
                    my0Var.dismiss();
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
                    if ((j != j2 || z3) && (S = LaunchActivity.S()) != null && (!(S instanceof mh1) || ((mh1) S).S != j2)) {
                        S.presentFragment(new mh1(j2));
                    }
                    if (connectedbotstarref != null) {
                        iu0 e = ku0.g(i).e(j2);
                        long j3 = connectedbotstarref.bot_id;
                        ArrayList arrayList3 = e.e;
                        int i4 = 0;
                        while (true) {
                            if (i4 < arrayList3.size()) {
                                if (((TL_payments.starRefProgram) arrayList3.get(i4)).bot_id == j3) {
                                    arrayList3.remove(i4);
                                    e.c--;
                                    nm7.f(e.a).k(239, Long.valueOf(e.b));
                                } else {
                                    i4++;
                                }
                            }
                        }
                        new c41(mh1.K0(context, i, connectedbotstarref, j2, ylbVar).F, ylbVar).V(Arrays.asList(user), jb6.M0(2131754332, null), jb6.M0(2131754333, null), null).j();
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    wi8.u(my0Var.F, ylbVar, tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                o42 o42Var = (o42) obj6;
                j5 j5Var = (j5) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = o42Var.Q;
                SparseArray sparseArray = o42Var.P;
                ArrayList arrayList8 = o42Var.N;
                HashMap hashMap = o42Var.R;
                ArrayList arrayList9 = o42Var.M;
                ArrayList arrayList10 = o42Var.O;
                p42 p42Var = o42Var.Y;
                if (this.b == o42Var.U) {
                    o42Var.T = false;
                    c42 c42Var = p42Var.M;
                    if (tL_error != null) {
                        c42Var.d.setText(jb6.M0(2131745534, null));
                        c42Var.e.setVisibility(0);
                        c42Var.e.setText(jb6.M0(2131745541, null));
                        c42Var.e(false, true);
                        return;
                    }
                    d42 d42Var = p42Var.r;
                    c42Var.e(false, true);
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    o42Var.H = messages_messages.next_rate;
                    int i5 = j5Var.a;
                    d42 d42Var2 = d42Var;
                    cf7.Y(i5).j1(messages_messages.users, messages_messages.chats, true, true);
                    oc7.r1(i5).d4(messages_messages.users, false);
                    oc7.r1(i5).X3(messages_messages.chats, false);
                    if (!z3) {
                        arrayList10.clear();
                        sparseArray.clear();
                        arrayList7.clear();
                        hashMap.clear();
                    }
                    int i6 = messages_messages.count;
                    o42Var.L = str;
                    int size = arrayList4.size();
                    int i7 = 0;
                    while (i7 < size) {
                        k47 k47Var = (k47) arrayList4.get(i7);
                        String str2 = k47Var.Y;
                        ArrayList arrayList11 = (ArrayList) hashMap.get(str2);
                        ArrayList arrayList12 = arrayList4;
                        if (arrayList11 == null) {
                            arrayList = new ArrayList();
                            hashMap.put(str2, arrayList);
                            arrayList7.add(str2);
                        } else {
                            arrayList = arrayList11;
                        }
                        arrayList.add(k47Var);
                        arrayList10.add(k47Var);
                        sparseArray.put(k47Var.e1(), k47Var);
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
                    o42Var.W = z2;
                    if (arrayList10.isEmpty()) {
                        if (TextUtils.isEmpty(o42Var.L) && this.f == 0 && j == 0) {
                            xna xnaVar = c42Var.d;
                            l66 l66Var = c42Var.e;
                            xnaVar.setText(jb6.M0(2131745535, null));
                            l66Var.setVisibility(0);
                            l66Var.setText(jb6.M0(2131745540, null));
                        } else {
                            xna xnaVar2 = c42Var.d;
                            l66 l66Var2 = c42Var.e;
                            xnaVar2.setText(jb6.M0(2131745534, null));
                            l66Var2.setVisibility(0);
                            l66Var2.setText(jb6.M0(2131745541, null));
                        }
                    }
                    if (!z3) {
                        arrayList9.clear();
                        if (arrayList5 != null) {
                            arrayList9.addAll(arrayList5);
                        }
                        if (str.length() >= 3 && (jb6.M0(2131745635, null).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                            int i8 = 0;
                            while (true) {
                                if (i8 < arrayList9.size()) {
                                    if (!(arrayList9.get(i8) instanceof TLRPC.User) || z8c.h(z8c.t0).f().id != ((TLRPC.User) arrayList9.get(i8)).id) {
                                        i8++;
                                    }
                                } else {
                                    arrayList9.add(0, z8c.h(z8c.t0).f());
                                }
                            }
                        }
                        arrayList8.clear();
                        arrayList8.addAll(arrayList6);
                        o42Var.a0(arrayList9, arrayList8, TextUtils.isEmpty(o42Var.L));
                    }
                    int i9 = -1;
                    int i10 = 0;
                    tk4 tk4Var = null;
                    while (true) {
                        d42 d42Var3 = d42Var2;
                        if (i10 < size) {
                            View childAt = d42Var3.getChildAt(i10);
                            if (childAt instanceof tk4) {
                                i9 = RecyclerView.R(childAt);
                                tk4Var = childAt;
                            }
                            i10++;
                            d42Var2 = d42Var3;
                        } else {
                            if (tk4Var != null) {
                                d42Var3.removeView(tk4Var);
                            }
                            if ((p42Var.K.getVisibility() == 0 && d42Var3.getChildCount() <= 1) || tk4Var != null) {
                                p42Var.getViewTreeObserver().addOnPreDrawListener(new m42(o42Var, tk4Var, i9, (byte) 0));
                            }
                            o42Var.f();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
        }
    }

    public bh1(o42 o42Var, int i, TLRPC.TL_error tL_error, TLObject tLObject, j5 j5Var, boolean z, String str, ArrayList arrayList, long j, long j2, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = o42Var;
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
