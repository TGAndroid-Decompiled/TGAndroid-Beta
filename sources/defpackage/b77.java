package defpackage;

import org.telegram.tgnet.TLRPC;
public final class b77 {
    public final oj a;
    public final long b;

    public b77(oj ojVar, long j) {
        this.a = ojVar;
        this.b = j;
    }

    public static b77 a() {
        return new b77(oj.h(0L, pj.a), 0L);
    }

    public static b77 b(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return a();
        }
        return new b77(oj.m(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        oj ojVar = this.a;
        if (ojVar != null && !ojVar.l()) {
            suggestedPost.price = ojVar.q();
        }
        long j = this.b;
        if (j > 0) {
            suggestedPost.schedule_date = (int) j;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
