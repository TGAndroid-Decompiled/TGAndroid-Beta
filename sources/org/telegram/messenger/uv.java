package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uv {
    public long f25900a;
    public boolean f25901b;
    public int f25902c;
    public ij d;
    public int f25903e;
    public long f25904f;
    public long f25905g;
    public long h;
    public boolean f25906i;
    public int f25907j;
    public int f25908k;

    public static uv a(int i7, TLRPC.Message message) {
        ?? obj = new Object();
        obj.f25900a = ij.Q1(p10.i(i7).e(), message);
        obj.f25901b = false;
        obj.f25902c = message.f26981id;
        obj.d = new ij(i7, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return obj;
    }

    public static uv b(int i7, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ?? obj = new Object();
        obj.f25900a = m5.o(saveddialog.peer);
        obj.f25901b = saveddialog.pinned;
        obj.f25902c = saveddialog.top_message;
        obj.f25904f = saveddialog.unread_count;
        obj.f25905g = saveddialog.read_inbox_max_id;
        obj.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                message = (TLRPC.Message) arrayList.get(i10);
                if (obj.f25902c == message.f26981id) {
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
        if (ijVar != null && (message = ijVar.f23266k) != null) {
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }
        return this.f25907j;
    }

    public final boolean d() {
        TLRPC.Message message;
        ij ijVar = this.d;
        if (ijVar != null && (message = ijVar.f23266k) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
            return true;
        }
        return false;
    }
}
