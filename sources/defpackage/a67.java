package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a67 implements Runnable {
    public final byte a;
    public final na7 b;
    public final int c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f;
    public final vf6 h;
    public final TLRPC.TL_messages_dialogs n;

    public a67(na7 na7Var, int i, ArrayList arrayList, boolean z, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, vf6 vf6Var, TLRPC.TL_messages_dialogs tL_messages_dialogs, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = i;
        this.d = arrayList;
        this.e = z;
        this.f = tL_messages_peerDialogs;
        this.h = vf6Var;
        this.n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a67.run():void");
    }
}
