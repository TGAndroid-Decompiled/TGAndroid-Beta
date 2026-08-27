package cg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class z implements Runnable {

    public final int f2893a;

    public final TLRPC.Chat f2894b;

    public final int f2895c;
    public final ArrayList d;

    public final Utilities.Callback f2896e;

    public z(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f2893a = i11;
        this.f2894b = chat;
        this.f2895c = i10;
        this.d = arrayList;
        this.f2896e = callback;
    }

    @Override
    public final void run() {
        switch (this.f2893a) {
            case 0:
                TLRPC.Chat chat = this.f2894b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    q0.m(this.f2895c, arrayList);
                }
                this.f2896e.run(arrayList);
                break;
            default:
                TLRPC.Chat chat2 = this.f2894b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    q0.m(this.f2895c, arrayList2);
                }
                this.f2896e.run(arrayList2);
                break;
        }
    }
}
