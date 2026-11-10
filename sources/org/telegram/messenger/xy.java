package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class xy {
    public String f26548a;
    public TLRPC.InputPeer f26553g;
    public long h;
    public long f26554i;
    public long f26555j;
    public long f26556k;
    public int f26557l;
    public double f26558m;
    public long f26559n;
    public long f26560o;
    public final gz f26562q;
    public ArrayList f26549b = new ArrayList();
    public final HashSet f26550c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f26551e = new HashMap();
    public final ArrayList f26552f = new ArrayList();
    public int f26561p = Integer.MAX_VALUE;

    public xy(gz gzVar) {
        this.f26562q = gzVar;
    }

    public static void a(xy xyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = xyVar.f26553g;
        tL_messages_startHistoryImport.import_id = xyVar.f26556k;
        xyVar.f26562q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new wy(xyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f26551e;
        hashMap.put(str, valueOf);
        this.f26554i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f26554i = ((Long) entry.getValue()).longValue() + this.f26554i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f26548a)) {
            long j10 = this.f26554i;
            long j11 = this.f26560o;
            if (j10 != j11) {
                long j12 = this.f26559n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f26558m;
                    if (d2 == 0.0d) {
                        this.f26558m = d;
                    } else {
                        this.f26558m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f26561p = (int) (((this.h - j10) * 1000) / this.f26558m);
                    this.f26560o = j10;
                    this.f26559n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f26554i) / ((float) this.h)) * 100.0f);
        if (this.f26557l != i7) {
            this.f26557l = i7;
            this.f26562q.getNotificationCenter().k(qs.f25095v1, Long.valueOf(this.f26555j));
        }
    }

    public final void c(int i7) {
        gz gzVar = this.f26562q;
        if (i7 == 100) {
            gzVar.D.l(this.f26555j);
        }
        gzVar.getNotificationCenter().k(qs.f25095v1, Long.valueOf(this.f26555j));
    }
}
