package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gw {
    public long f15965a;
    public boolean f15966b;
    public int f15967c;
    public kj d;
    public int e;
    public long f15968f;
    public long f15969g;
    public long h;
    public boolean f15970i;
    public int f15971j;
    public int f15972k;

    public static gw a(int i10, TLRPC.Message message) {
        ?? obj = new Object();
        obj.f15965a = kj.R1(e20.i(i10).e(), message);
        obj.f15966b = false;
        obj.f15967c = message.f19815id;
        obj.d = new kj(i10, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return obj;
    }

    public static gw b(int i10, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ?? obj = new Object();
        obj.f15965a = o5.o(saveddialog.peer);
        obj.f15966b = saveddialog.pinned;
        obj.f15967c = saveddialog.top_message;
        obj.f15968f = saveddialog.unread_count;
        obj.f15969g = saveddialog.read_inbox_max_id;
        obj.h = saveddialog.read_outbox_max_id;
        int i11 = 0;
        while (true) {
            if (i11 < arrayList.size()) {
                message = (TLRPC.Message) arrayList.get(i11);
                if (obj.f15967c == message.f19815id) {
                    break;
                }
                i11++;
            } else {
                message = null;
                break;
            }
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            obj.d = new kj(i10, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return obj;
    }

    public final int c() {
        TLRPC.Message message;
        kj kjVar = this.d;
        if (kjVar != null && (message = kjVar.f16690k) != null) {
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }
        return this.f15971j;
    }

    public final boolean d() {
        TLRPC.Message message;
        kj kjVar = this.d;
        if (kjVar != null && (message = kjVar.f16690k) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
            return true;
        }
        return false;
    }
}
