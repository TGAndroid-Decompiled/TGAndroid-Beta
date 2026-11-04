package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class py {
    public String f24819a;
    public TLRPC.InputPeer f24824g;
    public long h;
    public long f24825i;
    public long f24826j;
    public long f24827k;
    public int f24828l;
    public double f24829m;
    public long f24830n;
    public long f24831o;
    public final yy f24833q;
    public ArrayList f24820b = new ArrayList();
    public final HashSet f24821c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f24822e = new HashMap();
    public final ArrayList f24823f = new ArrayList();
    public int f24832p = Integer.MAX_VALUE;

    public py(yy yyVar) {
        this.f24833q = yyVar;
    }

    public static void a(py pyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = pyVar.f24824g;
        tL_messages_startHistoryImport.import_id = pyVar.f24827k;
        pyVar.f24833q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new oy(pyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j10, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f24822e;
        hashMap.put(str, valueOf);
        this.f24825i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f24825i = ((Long) entry.getValue()).longValue() + this.f24825i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f24819a)) {
            long j11 = this.f24825i;
            long j12 = this.f24831o;
            if (j11 != j12) {
                long j13 = this.f24830n;
                if (elapsedRealtime != j13) {
                    double d = (j11 - j12) / ((elapsedRealtime - j13) / 1000.0d);
                    double d10 = this.f24829m;
                    if (d10 == 0.0d) {
                        this.f24829m = d;
                    } else {
                        this.f24829m = (0.99d * d10) + (d * 0.01d);
                    }
                    this.f24832p = (int) (((this.h - j11) * 1000) / this.f24829m);
                    this.f24831o = j11;
                    this.f24830n = elapsedRealtime;
                }
            }
        }
        int i3 = (int) ((((float) this.f24825i) / ((float) this.h)) * 100.0f);
        if (this.f24828l != i3) {
            this.f24828l = i3;
            this.f24833q.getNotificationCenter().k(hs.f23320v1, Long.valueOf(this.f24826j));
        }
    }

    public final void c(int i3) {
        yy yyVar = this.f24833q;
        if (i3 == 100) {
            yyVar.E.l(this.f24826j);
        }
        yyVar.getNotificationCenter().k(hs.f23320v1, Long.valueOf(this.f24826j));
    }
}
