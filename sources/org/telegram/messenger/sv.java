package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sv {
    public long f26569a;
    public boolean f26570b;
    public int f26571c;
    public gj d;
    public int f26572e;
    public long f26573f;
    public long f26574g;
    public long h;
    public boolean f26575i;
    public int f26576j;
    public int f26577k;

    public static sv a(int i7, TLRPC.Message message) {
        ?? obj = new Object();
        obj.f26569a = gj.Q1(m10.i(i7).e(), message);
        obj.f26570b = false;
        obj.f26571c = message.f28072id;
        obj.d = new gj(i7, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return obj;
    }

    public static sv b(int i7, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ?? obj = new Object();
        obj.f26569a = m5.o(saveddialog.peer);
        obj.f26570b = saveddialog.pinned;
        obj.f26571c = saveddialog.top_message;
        obj.f26573f = saveddialog.unread_count;
        obj.f26574g = saveddialog.read_inbox_max_id;
        obj.h = saveddialog.read_outbox_max_id;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                message = (TLRPC.Message) arrayList.get(i10);
                if (obj.f26571c == message.f28072id) {
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
        if (gjVar != null && (message = gjVar.f23817k) != null) {
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }
        return this.f26576j;
    }

    public final boolean d() {
        TLRPC.Message message;
        gj gjVar = this.d;
        if (gjVar != null && (message = gjVar.f23817k) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
            return true;
        }
        return false;
    }
}
