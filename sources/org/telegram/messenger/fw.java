package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fw {
    public long f15624a;
    public boolean f15625b;
    public int f15626c;
    public jj d;
    public int e;
    public long f15627f;
    public long f15628g;
    public long h;
    public boolean f15629i;
    public int f15630j;
    public int f15631k;

    public static fw a(int i10, TLRPC.Message message) {
        ?? obj = new Object();
        obj.f15624a = jj.R1(d20.i(i10).e(), message);
        obj.f15625b = false;
        obj.f15626c = message.f19814id;
        obj.d = new jj(i10, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return obj;
    }

    public static fw b(int i10, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        ?? obj = new Object();
        obj.f15624a = o5.o(saveddialog.peer);
        obj.f15625b = saveddialog.pinned;
        obj.f15626c = saveddialog.top_message;
        obj.f15627f = saveddialog.unread_count;
        obj.f15628g = saveddialog.read_inbox_max_id;
        obj.h = saveddialog.read_outbox_max_id;
        int i11 = 0;
        while (true) {
            if (i11 < arrayList.size()) {
                message = (TLRPC.Message) arrayList.get(i11);
                if (obj.f15626c == message.f19814id) {
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
            obj.d = new jj(i10, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return obj;
    }

    public final int c() {
        TLRPC.Message message;
        jj jjVar = this.d;
        if (jjVar != null && (message = jjVar.f16337k) != null) {
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }
        return this.f15630j;
    }

    public final boolean d() {
        TLRPC.Message message;
        jj jjVar = this.d;
        if (jjVar != null && (message = jjVar.f16337k) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
            return true;
        }
        return false;
    }
}
