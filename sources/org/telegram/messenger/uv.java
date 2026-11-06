package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uv {
    public long f25894a;
    public boolean f25895b;
    public int f25896c;
    public ij d;
    public int f25897e;
    public long f25898f;
    public long f25899g;
    public long h;
    public boolean f25900i;
    public int f25901j;
    public int f25902k;

    public static uv a(int i7, TLRPC.Message message) {
        ?? obj = new Object();
        obj.f25894a = ij.R1(p10.i(i7).e(), message);
        obj.f25895b = false;
        obj.f25896c = message.f26974id;
        obj.d = new ij(i7, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return obj;
    }

    public static uv b(int i7, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ?? obj = new Object();
        obj.f25894a = m5.o(saveddialog.peer);
        obj.f25895b = saveddialog.pinned;
        obj.f25896c = saveddialog.top_message;
        obj.f25898f = saveddialog.unread_count;
        obj.f25899g = saveddialog.read_inbox_max_id;
        obj.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                message = (TLRPC.Message) arrayList.get(i10);
                if (obj.f25896c == message.f26974id) {
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
        if (ijVar != null && (message = ijVar.f23244k) != null) {
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }
        return this.f25901j;
    }

    public final boolean d() {
        TLRPC.Message message;
        ij ijVar = this.d;
        if (ijVar != null && (message = ijVar.f23244k) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
            return true;
        }
        return false;
    }
}
