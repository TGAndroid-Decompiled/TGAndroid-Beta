package defpackage;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class vkc extends dw5 {
    public final TLRPC.User m1;
    public final TLRPC.Chat n1;
    public final String o1;
    public final TLRPC.InputPeer p1;
    public final boolean q1;
    public final boolean r1;
    public final Activity s1;
    public final e t1;
    public final k5 u1;

    public vkc(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z, boolean z2, Activity activity, e eVar, k5 k5Var) {
        super(context, chat);
        this.m1 = user;
        this.n1 = chat2;
        this.o1 = str;
        this.p1 = inputPeer;
        this.q1 = z;
        this.r1 = z2;
        this.s1 = activity;
        this.t1 = eVar;
        this.u1 = k5Var;
    }

    @Override
    public final void E0() {
        xkc.b(this.m1, this.n1, this.o1, this.p1, true, this.q1, this.r1, false, this.s1, this.t1, this.u1, false, false, false);
    }
}
