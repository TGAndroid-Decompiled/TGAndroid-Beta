package defpackage;

import org.telegram.tgnet.TLRPC;
public final class u47 {
    public final nj a;
    public final long b;

    public u47(nj njVar, long j) {
        this.a = njVar;
        this.b = j;
    }

    public static u47 a() {
        return new u47(nj.h(0L, oj.a), 0L);
    }

    public static u47 b(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return a();
        }
        return new u47(nj.m(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        nj njVar = this.a;
        if (njVar != null && !njVar.l()) {
            suggestedPost.price = njVar.q();
        }
        long j = this.b;
        if (j > 0) {
            suggestedPost.schedule_date = (int) j;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
