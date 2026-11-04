package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mv {
    public long f24264a;
    public boolean f24265b;
    public int f24266c;
    public zi d;
    public int f24267e;
    public long f24268f;
    public long f24269g;
    public long h;
    public boolean f24270i;
    public int f24271j;
    public int f24272k;

    public static mv a(int i3, TLRPC.Message message) {
        ?? obj = new Object();
        obj.f24264a = zi.R1(h10.i(i3).e(), message);
        obj.f24265b = false;
        obj.f24266c = message.f27022id;
        obj.d = new zi(i3, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return obj;
    }

    public static mv b(int i3, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ?? obj = new Object();
        obj.f24264a = m5.o(saveddialog.peer);
        obj.f24265b = saveddialog.pinned;
        obj.f24266c = saveddialog.top_message;
        obj.f24268f = saveddialog.unread_count;
        obj.f24269g = saveddialog.read_inbox_max_id;
        obj.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                message = (TLRPC.Message) arrayList.get(i10);
                if (obj.f24266c == message.f27022id) {
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
            obj.d = new zi(i3, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return obj;
    }

    public final int c() {
        TLRPC.Message message;
        zi ziVar = this.d;
        if (ziVar != null && (message = ziVar.f26868k) != null) {
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }
        return this.f24271j;
    }

    public final boolean d() {
        TLRPC.Message message;
        zi ziVar = this.d;
        if (ziVar != null && (message = ziVar.f26868k) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
            return true;
        }
        return false;
    }
}
