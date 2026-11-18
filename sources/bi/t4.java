package bi;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.r20;
public final class t4 implements Runnable {
    public final int f4056a;
    public final int f4057b;
    public final Object f4058c;
    public final Object d;
    public final Object f4059e;

    public t4(int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.f4056a = i10;
        this.f4057b = i7;
        this.d = obj;
        this.f4059e = obj2;
        this.f4058c = obj3;
    }

    private final void a() {
        boolean z10;
        f30 f30Var = (f30) this.d;
        TLObject tLObject = (TLObject) this.f4059e;
        String str = (String) this.f4058c;
        int i7 = f30Var.Q;
        ArrayList arrayList = f30Var.R;
        if (this.f4057b == f30Var.W) {
            boolean isEmpty = arrayList.isEmpty();
            f30Var.V = false;
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    f30Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    f30Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                }
                f30Var.f34924c0 = messages_messages.next_rate;
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
                ((im0) f30Var).f36150f0.f39202w0.h1(0, 0);
            }
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: bi.t4.b():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.t4.run():void");
    }

    public t4(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f4056a = i10;
        this.d = obj;
        this.f4057b = i7;
        this.f4059e = obj2;
        this.f4058c = obj3;
    }

    public t4(Object obj, int i7, String str, Serializable serializable, int i10) {
        this.f4056a = i10;
        this.d = obj;
        this.f4057b = i7;
        this.f4058c = str;
        this.f4059e = serializable;
    }

    public t4(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f4056a = i10;
        this.d = obj;
        this.f4059e = obj2;
        this.f4057b = i7;
        this.f4058c = obj3;
    }

    public t4(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f4056a = i10;
        this.d = obj;
        this.f4059e = obj2;
        this.f4058c = obj3;
        this.f4057b = i7;
    }

    public t4(r20 r20Var, String str, int i7, ArrayList arrayList) {
        this.f4056a = 25;
        this.d = r20Var;
        this.f4058c = str;
        this.f4057b = i7;
        this.f4059e = arrayList;
    }
}
