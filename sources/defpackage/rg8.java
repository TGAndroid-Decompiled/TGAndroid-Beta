package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class rg8 implements Runnable {
    public final byte a = 1;
    public final xg8 b;
    public final boolean c;
    public final TLRPC.PollAnswer d;
    public final d e;
    public final ArrayList f;

    public rg8(xg8 xg8Var, boolean z, TLRPC.PollAnswer pollAnswer, d dVar, ArrayList arrayList) {
        this.b = xg8Var;
        this.c = z;
        this.d = pollAnswer;
        this.e = dVar;
        this.f = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.f;
        d dVar = this.e;
        TLRPC.PollAnswer pollAnswer = this.d;
        boolean z = this.c;
        xg8 xg8Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    dVar.getSendMessagesHelper().v0(xg8Var.I, null, null);
                } else {
                    arrayList.remove(pollAnswer);
                    dVar.getSendMessagesHelper().v0(xg8Var.I, arrayList, null);
                }
                xg8Var.b(true);
                return;
            default:
                if (!z) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    dVar.getSendMessagesHelper().v0(xg8Var.I, arrayList2, null);
                } else {
                    arrayList.add(pollAnswer);
                    dVar.getSendMessagesHelper().v0(xg8Var.I, arrayList, null);
                }
                xg8Var.b(true);
                return;
        }
    }

    public rg8(xg8 xg8Var, boolean z, d dVar, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = xg8Var;
        this.c = z;
        this.e = dVar;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
