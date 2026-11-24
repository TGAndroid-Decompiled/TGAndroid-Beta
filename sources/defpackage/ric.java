package defpackage;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ric extends yv5 {
    public final TLRPC.User m1;
    public final TLRPC.Chat n1;
    public final String o1;
    public final TLRPC.InputPeer p1;
    public final boolean q1;
    public final boolean r1;
    public final boolean s1;
    public final Activity t1;
    public final d u1;
    public final j5 v1;
    public final boolean w1;

    public ric(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3, Activity activity, d dVar, j5 j5Var, boolean z4) {
        super(context, chat);
        this.m1 = user;
        this.n1 = chat2;
        this.o1 = str;
        this.p1 = inputPeer;
        this.q1 = z;
        this.r1 = z2;
        this.s1 = z3;
        this.t1 = activity;
        this.u1 = dVar;
        this.v1 = j5Var;
        this.w1 = z4;
    }

    @Override
    public final void D0() {
        sic.b(this.m1, this.n1, this.o1, this.p1, false, this.q1, this.r1, this.s1, this.t1, this.u1, this.v1, false, true, this.w1);
    }
}
