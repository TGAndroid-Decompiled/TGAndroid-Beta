package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class ry {
    public String f26694a;
    public TLRPC.InputPeer f26699g;
    public long h;
    public long f26700i;
    public long f26701j;
    public long f26702k;
    public int f26703l;
    public double f26704m;
    public long f26705n;
    public long f26706o;
    public final az f26708q;
    public ArrayList f26695b = new ArrayList();
    public final HashSet f26696c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f26697e = new HashMap();
    public final ArrayList f26698f = new ArrayList();
    public int f26707p = Integer.MAX_VALUE;

    public ry(az azVar) {
        this.f26708q = azVar;
    }

    public static void a(ry ryVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = ryVar.f26699g;
        tL_messages_startHistoryImport.import_id = ryVar.f26702k;
        ryVar.f26708q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new qy(ryVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f26697e;
        hashMap.put(str, valueOf);
        this.f26700i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f26700i = ((Long) entry.getValue()).longValue() + this.f26700i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f26694a)) {
            long j10 = this.f26700i;
            long j11 = this.f26706o;
            if (j10 != j11) {
                long j12 = this.f26705n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f26704m;
                    if (d2 == 0.0d) {
                        this.f26704m = d;
                    } else {
                        this.f26704m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f26707p = (int) (((this.h - j10) * 1000) / this.f26704m);
                    this.f26706o = j10;
                    this.f26705n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f26700i) / ((float) this.h)) * 100.0f);
        if (this.f26703l != i7) {
            this.f26703l = i7;
            this.f26708q.getNotificationCenter().k(ls.f25399v1, Long.valueOf(this.f26701j));
        }
    }

    public final void c(int i7) {
        az azVar = this.f26708q;
        if (i7 == 100) {
            azVar.E.l(this.f26701j);
        }
        azVar.getNotificationCenter().k(ls.f25399v1, Long.valueOf(this.f26701j));
    }
}
