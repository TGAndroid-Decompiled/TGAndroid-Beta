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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class eg1 implements Runnable {
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

    public eg1(c51 c51Var, TLObject tLObject, int i, long j, nx0 nx0Var, TL_payments.starRefProgram starrefprogram, long j2, boolean z, Context context, vnb vnbVar, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = c51Var;
        this.d = tLObject;
        this.b = i;
        this.f = j;
        this.r = nx0Var;
        this.s = starrefprogram;
        this.h = j2;
        this.e = z;
        this.w = context;
        this.x = vnbVar;
        this.y = user;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        boolean z;
        TL_payments.connectedBotStarRef connectedbotstarref;
        e S;
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
                nx0 nx0Var = (nx0) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                vnb vnbVar = (vnb) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((c51) obj6).setLoading(false);
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i = this.b;
                    kt0 g = kt0.g(i);
                    long j2 = this.f;
                    ht0 d = g.d(j2);
                    int i2 = d.a;
                    uc7.s1(i2).j4(connectedstarrefbots.users, false);
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
                    jn7.f(i2).k(240, Long.valueOf(d.b));
                    d.a();
                    nx0Var.dismiss();
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
                    if ((j != j2 || z3) && (S = LaunchActivity.S()) != null && (!(S instanceof ng1) || ((ng1) S).S != j2)) {
                        S.presentFragment(new ng1(j2));
                    }
                    if (connectedbotstarref != null) {
                        it0 e = kt0.g(i).e(j2);
                        long j3 = connectedbotstarref.bot_id;
                        ArrayList arrayList3 = e.e;
                        int i4 = 0;
                        while (true) {
                            if (i4 < arrayList3.size()) {
                                if (((TL_payments.starRefProgram) arrayList3.get(i4)).bot_id == j3) {
                                    arrayList3.remove(i4);
                                    e.c--;
                                    jn7.f(e.a).k(239, Long.valueOf(e.b));
                                } else {
                                    i4++;
                                }
                            }
                        }
                        new d31(ng1.K0(context, i, connectedbotstarref, j2, vnbVar).F, vnbVar).V(Arrays.asList(user), ob6.M0(2131754328, null), ob6.M0(2131754329, null), null).j();
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ik8.u(nx0Var.F, vnbVar, tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                t32 t32Var = (t32) obj6;
                k5 k5Var = (k5) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = t32Var.Q;
                SparseArray sparseArray = t32Var.P;
                ArrayList arrayList8 = t32Var.N;
                HashMap hashMap = t32Var.R;
                ArrayList arrayList9 = t32Var.M;
                ArrayList arrayList10 = t32Var.O;
                u32 u32Var = t32Var.Y;
                if (this.b == t32Var.U) {
                    t32Var.T = false;
                    h32 h32Var = u32Var.M;
                    if (tL_error != null) {
                        h32Var.d.setText(ob6.M0(2131745528, null));
                        h32Var.e.setVisibility(0);
                        h32Var.e.setText(ob6.M0(2131745535, null));
                        h32Var.e(false, true);
                        return;
                    }
                    i32 i32Var = u32Var.r;
                    h32Var.e(false, true);
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    t32Var.H = messages_messages.next_rate;
                    int i5 = k5Var.a;
                    i32 i32Var2 = i32Var;
                    jf7.Y(i5).j1(messages_messages.users, messages_messages.chats, true, true);
                    uc7.s1(i5).j4(messages_messages.users, false);
                    uc7.s1(i5).c4(messages_messages.chats, false);
                    if (!z3) {
                        arrayList10.clear();
                        sparseArray.clear();
                        arrayList7.clear();
                        hashMap.clear();
                    }
                    int i6 = messages_messages.count;
                    t32Var.L = str;
                    int size = arrayList4.size();
                    int i7 = 0;
                    while (i7 < size) {
                        r47 r47Var = (r47) arrayList4.get(i7);
                        String str2 = r47Var.Y;
                        ArrayList arrayList11 = (ArrayList) hashMap.get(str2);
                        ArrayList arrayList12 = arrayList4;
                        if (arrayList11 == null) {
                            arrayList = new ArrayList();
                            hashMap.put(str2, arrayList);
                            arrayList7.add(str2);
                        } else {
                            arrayList = arrayList11;
                        }
                        arrayList.add(r47Var);
                        arrayList10.add(r47Var);
                        sparseArray.put(r47Var.e1(), r47Var);
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
                    t32Var.W = z2;
                    if (arrayList10.isEmpty()) {
                        if (TextUtils.isEmpty(t32Var.L) && this.f == 0 && j == 0) {
                            tpa tpaVar = h32Var.d;
                            p66 p66Var = h32Var.e;
                            tpaVar.setText(ob6.M0(2131745529, null));
                            p66Var.setVisibility(0);
                            p66Var.setText(ob6.M0(2131745534, null));
                        } else {
                            tpa tpaVar2 = h32Var.d;
                            p66 p66Var2 = h32Var.e;
                            tpaVar2.setText(ob6.M0(2131745528, null));
                            p66Var2.setVisibility(0);
                            p66Var2.setText(ob6.M0(2131745535, null));
                        }
                    }
                    if (!z3) {
                        arrayList9.clear();
                        if (arrayList5 != null) {
                            arrayList9.addAll(arrayList5);
                        }
                        if (str.length() >= 3 && (ob6.M0(2131745629, null).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                            int i8 = 0;
                            while (true) {
                                if (i8 < arrayList9.size()) {
                                    if (!(arrayList9.get(i8) instanceof TLRPC.User) || yac.h(yac.t0).f().id != ((TLRPC.User) arrayList9.get(i8)).id) {
                                        i8++;
                                    }
                                } else {
                                    arrayList9.add(0, yac.h(yac.t0).f());
                                }
                            }
                        }
                        arrayList8.clear();
                        arrayList8.addAll(arrayList6);
                        t32Var.a0(arrayList9, arrayList8, TextUtils.isEmpty(t32Var.L));
                    }
                    int i9 = -1;
                    int i10 = 0;
                    tk4 tk4Var = null;
                    while (true) {
                        i32 i32Var3 = i32Var2;
                        if (i10 < size) {
                            View childAt = i32Var3.getChildAt(i10);
                            if (childAt instanceof tk4) {
                                i9 = RecyclerView.S(childAt);
                                tk4Var = childAt;
                            }
                            i10++;
                            i32Var2 = i32Var3;
                        } else {
                            if (tk4Var != null) {
                                i32Var3.removeView(tk4Var);
                            }
                            if ((u32Var.K.getVisibility() == 0 && i32Var3.getChildCount() <= 1) || tk4Var != null) {
                                u32Var.getViewTreeObserver().addOnPreDrawListener(new r32(t32Var, tk4Var, i9, (byte) 0));
                            }
                            t32Var.f();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
        }
    }

    public eg1(t32 t32Var, int i, TLRPC.TL_error tL_error, TLObject tLObject, k5 k5Var, boolean z, String str, ArrayList arrayList, long j, long j2, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = t32Var;
        this.b = i;
        this.c = tL_error;
        this.d = tLObject;
        this.r = k5Var;
        this.e = z;
        this.s = str;
        this.w = arrayList;
        this.f = j;
        this.h = j2;
        this.x = arrayList2;
        this.y = arrayList3;
    }
}
