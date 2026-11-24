package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hh8 {
    public int a;
    public ArrayList b;
    public String c;
    public final byte[] d;
    public boolean e;
    public int f = 10;

    public hh8(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.a = tL_messages_votesList.count;
        this.b = tL_messages_votesList.votes;
        this.c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f, this.b.size());
        }
        return this.b.size();
    }
}
