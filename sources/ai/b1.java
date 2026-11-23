package ai;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.u20;
public final class b1 implements Runnable {
    public final int f1129a;
    public final Object f1130b;
    public final int f1131c;
    public final Object d;
    public final Object f1132e;

    public b1(int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.f1129a = i10;
        this.f1131c = i7;
        this.d = obj;
        this.f1132e = obj2;
        this.f1130b = obj3;
    }

    private final void a() {
        boolean z10;
        i30 i30Var = (i30) this.d;
        TLObject tLObject = (TLObject) this.f1132e;
        String str = (String) this.f1130b;
        int i7 = i30Var.Q;
        ArrayList arrayList = i30Var.R;
        if (this.f1131c == i30Var.W) {
            boolean isEmpty = arrayList.isEmpty();
            i30Var.V = false;
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    i30Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    i30Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                }
                i30Var.f36136c0 = messages_messages.next_rate;
                np.u1(i7).f4(messages_messages.users, false);
                np.u1(i7).Z3(messages_messages.chats, false);
                for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                    gj gjVar = new gj(i7, messages_messages.messages.get(i10), false, true);
                    gjVar.K5(str, true);
                    arrayList.add(gjVar);
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
                ((lm0) i30Var).f37244f0.f40520w0.h1(0, 0);
            }
        }
    }

    private final void b() {
        Context context = ((em0) this.d).getContext();
        TLRPC.Reaction g10 = ((bm0) this.f1132e).f33856a.g();
        em0.c(context, this.f1131c, g10, (h6) this.f1130b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.b1.run():void");
    }

    public b1(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f1129a = i10;
        this.d = obj;
        this.f1131c = i7;
        this.f1132e = obj2;
        this.f1130b = obj3;
    }

    public b1(Object obj, int i7, String str, Serializable serializable, int i10) {
        this.f1129a = i10;
        this.d = obj;
        this.f1131c = i7;
        this.f1130b = str;
        this.f1132e = serializable;
    }

    public b1(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f1129a = i10;
        this.d = obj;
        this.f1132e = obj2;
        this.f1131c = i7;
        this.f1130b = obj3;
    }

    public b1(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f1129a = i10;
        this.d = obj;
        this.f1132e = obj2;
        this.f1130b = obj3;
        this.f1131c = i7;
    }

    public b1(u20 u20Var, String str, int i7, ArrayList arrayList) {
        this.f1129a = 26;
        this.d = u20Var;
        this.f1130b = str;
        this.f1131c = i7;
        this.f1132e = arrayList;
    }
}
