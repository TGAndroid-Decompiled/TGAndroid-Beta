package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pv {
    public long f26314a;
    public boolean f26315b;
    public int f26316c;
    public gj d;
    public int f26317e;
    public long f26318f;
    public long f26319g;
    public long h;
    public boolean f26320i;
    public int f26321j;
    public int f26322k;

    public static pv a(int i7, TLRPC.Message message) {
        ?? obj = new Object();
        obj.f26314a = gj.Q1(k10.i(i7).e(), message);
        obj.f26315b = false;
        obj.f26316c = message.f28419id;
        obj.d = new gj(i7, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return obj;
    }

    public static pv b(int i7, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ?? obj = new Object();
        obj.f26314a = n5.o(saveddialog.peer);
        obj.f26315b = saveddialog.pinned;
        obj.f26316c = saveddialog.top_message;
        obj.f26318f = saveddialog.unread_count;
        obj.f26319g = saveddialog.read_inbox_max_id;
        obj.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                message = (TLRPC.Message) arrayList.get(i10);
                if (obj.f26316c == message.f28419id) {
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
            obj.d = new gj(i7, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return obj;
    }

    public final int c() {
        TLRPC.Message message;
        gj gjVar = this.d;
        if (gjVar != null && (message = gjVar.f24177k) != null) {
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }
        return this.f26321j;
    }

    public final boolean d() {
        TLRPC.Message message;
        gj gjVar = this.d;
        if (gjVar != null && (message = gjVar.f24177k) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
            return true;
        }
        return false;
    }
}
