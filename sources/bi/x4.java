package bi;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.u20;
public final class x4 implements Runnable {
    public final int f4241a;
    public final int f4242b;
    public final Object f4243c;
    public final Object d;
    public final Object f4244e;

    public x4(int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.f4241a = i10;
        this.f4242b = i7;
        this.d = obj;
        this.f4244e = obj2;
        this.f4243c = obj3;
    }

    private final void a() {
        boolean z10;
        i30 i30Var = (i30) this.d;
        TLObject tLObject = (TLObject) this.f4244e;
        String str = (String) this.f4243c;
        int i7 = i30Var.Q;
        ArrayList arrayList = i30Var.R;
        if (this.f4242b == i30Var.W) {
            boolean isEmpty = arrayList.isEmpty();
            i30Var.V = false;
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    i30Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    i30Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                }
                i30Var.f36142c0 = messages_messages.next_rate;
                mp.u1(i7).f4(messages_messages.users, false);
                mp.u1(i7).Z3(messages_messages.chats, false);
                for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                    fj fjVar = new fj(i7, messages_messages.messages.get(i10), false, true);
                    fjVar.K5(str, true);
                    arrayList.add(fjVar);
                }
                if (arrayList.size() >= i30Var.Z) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i30Var.Y = z10;
                i30Var.X();
            } else {
                i30Var.Y = true;
                i30Var.Z = arrayList.size();
            }
            i30Var.O(true);
            if (isEmpty) {
                ((lm0) i30Var).f37238f0.f40527w0.h1(0, 0);
            }
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: bi.x4.b():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.x4.run():void");
    }

    public x4(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f4241a = i10;
        this.d = obj;
        this.f4242b = i7;
        this.f4244e = obj2;
        this.f4243c = obj3;
    }

    public x4(Object obj, int i7, String str, Serializable serializable, int i10) {
        this.f4241a = i10;
        this.d = obj;
        this.f4242b = i7;
        this.f4243c = str;
        this.f4244e = serializable;
    }

    public x4(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f4241a = i10;
        this.d = obj;
        this.f4244e = obj2;
        this.f4242b = i7;
        this.f4243c = obj3;
    }

    public x4(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f4241a = i10;
        this.d = obj;
        this.f4244e = obj2;
        this.f4243c = obj3;
        this.f4242b = i7;
    }

    public x4(u20 u20Var, String str, int i7, ArrayList arrayList) {
        this.f4241a = 25;
        this.d = u20Var;
        this.f4243c = str;
        this.f4242b = i7;
        this.f4244e = arrayList;
    }
}
