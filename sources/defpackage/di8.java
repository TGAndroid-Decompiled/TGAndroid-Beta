package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class di8 implements Runnable {
    public final byte a = 1;
    public final ji8 b;
    public final boolean c;
    public final TLRPC.PollAnswer d;
    public final e e;
    public final ArrayList f;

    public di8(ji8 ji8Var, boolean z, TLRPC.PollAnswer pollAnswer, e eVar, ArrayList arrayList) {
        this.b = ji8Var;
        this.c = z;
        this.d = pollAnswer;
        this.e = eVar;
        this.f = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.f;
        e eVar = this.e;
        TLRPC.PollAnswer pollAnswer = this.d;
        boolean z = this.c;
        ji8 ji8Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    eVar.getSendMessagesHelper().v0(ji8Var.I, null, null);
                } else {
                    arrayList.remove(pollAnswer);
                    eVar.getSendMessagesHelper().v0(ji8Var.I, arrayList, null);
                }
                ji8Var.b(true);
                return;
            default:
                if (!z) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    eVar.getSendMessagesHelper().v0(ji8Var.I, arrayList2, null);
                } else {
                    arrayList.add(pollAnswer);
                    eVar.getSendMessagesHelper().v0(ji8Var.I, arrayList, null);
                }
                ji8Var.b(true);
                return;
        }
    }

    public di8(ji8 ji8Var, boolean z, e eVar, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = ji8Var;
        this.c = z;
        this.e = eVar;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
