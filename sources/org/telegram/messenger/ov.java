package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ov {
    public long f26106a;
    public boolean f26107b;
    public int f26108c;
    public fj d;
    public int f26109e;
    public long f26110f;
    public long f26111g;
    public long h;
    public boolean f26112i;
    public int f26113j;
    public int f26114k;

    public static ov a(int i7, TLRPC.Message message) {
        ?? obj = new Object();
        obj.f26106a = fj.Q1(j10.i(i7).e(), message);
        obj.f26107b = false;
        obj.f26108c = message.f28426id;
        obj.d = new fj(i7, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return obj;
    }

    public static ov b(int i7, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ?? obj = new Object();
        obj.f26106a = n5.o(saveddialog.peer);
        obj.f26107b = saveddialog.pinned;
        obj.f26108c = saveddialog.top_message;
        obj.f26110f = saveddialog.unread_count;
        obj.f26111g = saveddialog.read_inbox_max_id;
        obj.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                message = (TLRPC.Message) arrayList.get(i10);
                if (obj.f26108c == message.f28426id) {
                    break;
                }
                i10++;
            } else {
                message = null;
                break;
            }
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            obj.d = new fj(i7, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return obj;
    }

    public final int c() {
        TLRPC.Message message;
        fj fjVar = this.d;
        if (fjVar != null && (message = fjVar.f23968k) != null) {
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }
        return this.f26113j;
    }

    public final boolean d() {
        TLRPC.Message message;
        fj fjVar = this.d;
        if (fjVar != null && (message = fjVar.f23968k) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
            return true;
        }
        return false;
    }
}
