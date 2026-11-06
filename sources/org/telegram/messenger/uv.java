package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uv {
    public long f25886a;
    public boolean f25887b;
    public int f25888c;
    public ij d;
    public int f25889e;
    public long f25890f;
    public long f25891g;
    public long h;
    public boolean f25892i;
    public int f25893j;
    public int f25894k;

    public static uv a(int i7, TLRPC.Message message) {
        ?? obj = new Object();
        obj.f25886a = ij.R1(p10.i(i7).e(), message);
        obj.f25887b = false;
        obj.f25888c = message.f26973id;
        obj.d = new ij(i7, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return obj;
    }

    public static uv b(int i7, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ?? obj = new Object();
        obj.f25886a = m5.o(saveddialog.peer);
        obj.f25887b = saveddialog.pinned;
        obj.f25888c = saveddialog.top_message;
        obj.f25890f = saveddialog.unread_count;
        obj.f25891g = saveddialog.read_inbox_max_id;
        obj.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                message = (TLRPC.Message) arrayList.get(i10);
                if (obj.f25888c == message.f26973id) {
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
            obj.d = new ij(i7, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return obj;
    }

    public final int c() {
        TLRPC.Message message;
        ij ijVar = this.d;
        if (ijVar != null && (message = ijVar.f23237k) != null) {
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }
        return this.f25893j;
    }

    public final boolean d() {
        TLRPC.Message message;
        ij ijVar = this.d;
        if (ijVar != null && (message = ijVar.f23237k) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
            return true;
        }
        return false;
    }
}
