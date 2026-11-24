package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class up9 {
    public long a;
    public boolean b;
    public int c;
    public k27 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;

    public static up9 a(int i, TLRPC.Message message) {
        ?? obj = new Object();
        obj.a = k27.Q1(y6c.h(i).e(), message);
        obj.b = false;
        obj.c = message.id;
        obj.d = new k27(i, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return obj;
    }

    public static up9 b(int i, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ?? obj = new Object();
        obj.a = cf3.n(saveddialog.peer);
        obj.b = saveddialog.pinned;
        obj.c = saveddialog.top_message;
        obj.f = saveddialog.unread_count;
        obj.g = saveddialog.read_inbox_max_id;
        obj.h = saveddialog.read_outbox_max_id;
        int i2 = 0;
        while (true) {
            if (i2 < arrayList.size()) {
                message = (TLRPC.Message) arrayList.get(i2);
                if (obj.c == message.id) {
                    break;
                }
                i2++;
            } else {
                message = null;
                break;
            }
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            obj.d = new k27(i, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return obj;
    }

    public final int c() {
        TLRPC.Message message;
        k27 k27Var = this.d;
        if (k27Var != null && (message = k27Var.k) != null) {
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }
        return this.j;
    }

    public final boolean d() {
        TLRPC.Message message;
        k27 k27Var = this.d;
        if (k27Var != null && (message = k27Var.k) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
            return true;
        }
        return false;
    }
}
