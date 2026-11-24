package defpackage;

import org.telegram.tgnet.TLRPC;
public final class v67 {
    public final nk a;
    public final long b;

    public v67(nk nkVar, long j) {
        this.a = nkVar;
        this.b = j;
    }

    public static v67 a() {
        return new v67(nk.h(0L, ok.a), 0L);
    }

    public static v67 b(TLRPC.SuggestedPost suggestedPost) {
        if (suggestedPost == null) {
            return a();
        }
        return new v67(nk.m(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        nk nkVar = this.a;
        if (nkVar != null && !nkVar.l()) {
            suggestedPost.price = nkVar.q();
        }
        long j = this.b;
        if (j > 0) {
            suggestedPost.schedule_date = (int) j;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
