package ai;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.r20;
public final class x0 implements Runnable {
    public final int f1589a;
    public final Object f1590b;
    public final int f1591c;
    public final Object d;
    public final Object f1592e;

    public x0(int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.f1589a = i10;
        this.f1591c = i7;
        this.d = obj;
        this.f1592e = obj2;
        this.f1590b = obj3;
    }

    private final void a() {
        boolean z10;
        f30 f30Var = (f30) this.d;
        TLObject tLObject = (TLObject) this.f1592e;
        String str = (String) this.f1590b;
        int i7 = f30Var.Q;
        ArrayList arrayList = f30Var.R;
        if (this.f1591c == f30Var.W) {
            boolean isEmpty = arrayList.isEmpty();
            f30Var.V = false;
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    f30Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    f30Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                }
                f30Var.f34996c0 = messages_messages.next_rate;
                mp.u1(i7).f4(messages_messages.users, false);
                mp.u1(i7).Z3(messages_messages.chats, false);
                for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                    fj fjVar = new fj(i7, messages_messages.messages.get(i10), false, true);
                    fjVar.K5(str, true);
                    arrayList.add(fjVar);
                }
                if (arrayList.size() >= f30Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f30Var.Y = z10;
                f30Var.X();
            } else {
                f30Var.Y = true;
                f30Var.Z = arrayList.size();
            }
            f30Var.O(true);
            if (isEmpty) {
                ((km0) f30Var).f36810f0.f40102w0.h1(0, 0);
            }
        }
    }

    private final void b() {
        Context context = ((em0) this.d).getContext();
        TLRPC.Reaction g10 = ((bm0) this.f1592e).f33768a.g();
        em0.c(context, this.f1591c, g10, (i6) this.f1590b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.x0.run():void");
    }

    public x0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f1589a = i10;
        this.d = obj;
        this.f1591c = i7;
        this.f1592e = obj2;
        this.f1590b = obj3;
    }

    public x0(Object obj, int i7, String str, Serializable serializable, int i10) {
        this.f1589a = i10;
        this.d = obj;
        this.f1591c = i7;
        this.f1590b = str;
        this.f1592e = serializable;
    }

    public x0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f1589a = i10;
        this.d = obj;
        this.f1592e = obj2;
        this.f1591c = i7;
        this.f1590b = obj3;
    }

    public x0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f1589a = i10;
        this.d = obj;
        this.f1592e = obj2;
        this.f1590b = obj3;
        this.f1591c = i7;
    }

    public x0(r20 r20Var, String str, int i7, ArrayList arrayList) {
        this.f1589a = 26;
        this.d = r20Var;
        this.f1590b = str;
        this.f1591c = i7;
        this.f1592e = arrayList;
    }
}
