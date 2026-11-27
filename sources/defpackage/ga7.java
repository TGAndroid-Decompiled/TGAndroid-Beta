package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.WearReplyReceiver;
import org.telegram.tgnet.TLRPC;
public final class ga7 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public ga7(fu5 fu5Var, int i, long j, long j2, fu5 fu5Var2, zu1 zu1Var, vnb vnbVar) {
        this.e = fu5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = fu5Var2;
        this.h = zu1Var;
        this.n = vnbVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga7.run():void");
    }

    public ga7(uc7 uc7Var, TLRPC.updates_ChannelDifference updates_channeldifference, long j, TLRPC.Chat chat, zh6 zh6Var, int i, long j2) {
        this.e = uc7Var;
        this.f = updates_channeldifference;
        this.c = j;
        this.h = chat;
        this.n = zh6Var;
        this.b = i;
        this.d = j2;
    }

    public ga7(r7a r7aVar, long j, long j2, int i, TLRPC.Message message, ArrayList arrayList, r47 r47Var) {
        this.e = r7aVar;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.f = message;
        this.h = arrayList;
        this.n = r47Var;
    }

    public ga7(WearReplyReceiver wearReplyReceiver, k5 k5Var, TLRPC.Chat chat, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = k5Var;
        this.h = chat;
        this.f = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }

    public ga7(WearReplyReceiver wearReplyReceiver, k5 k5Var, TLRPC.User user, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = k5Var;
        this.f = user;
        this.h = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }
}
