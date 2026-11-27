package defpackage;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class wkc extends dw5 {
    public final TLRPC.User m1;
    public final TLRPC.Chat n1;
    public final String o1;
    public final TLRPC.InputPeer p1;
    public final boolean q1;
    public final boolean r1;
    public final boolean s1;
    public final Activity t1;
    public final e u1;
    public final k5 v1;
    public final boolean w1;

    public wkc(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3, Activity activity, e eVar, k5 k5Var, boolean z4) {
        super(context, chat);
        this.m1 = user;
        this.n1 = chat2;
        this.o1 = str;
        this.p1 = inputPeer;
        this.q1 = z;
        this.r1 = z2;
        this.s1 = z3;
        this.t1 = activity;
        this.u1 = eVar;
        this.v1 = k5Var;
        this.w1 = z4;
    }

    @Override
    public final void E0() {
        xkc.b(this.m1, this.n1, this.o1, this.p1, false, this.q1, this.r1, this.s1, this.t1, this.u1, this.v1, false, true, this.w1);
    }
}
