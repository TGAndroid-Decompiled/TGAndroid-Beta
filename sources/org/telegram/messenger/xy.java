package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class xy {
    public String f26544a;
    public TLRPC.InputPeer f26549g;
    public long h;
    public long f26550i;
    public long f26551j;
    public long f26552k;
    public int f26553l;
    public double f26554m;
    public long f26555n;
    public long f26556o;
    public final gz f26558q;
    public ArrayList f26545b = new ArrayList();
    public final HashSet f26546c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f26547e = new HashMap();
    public final ArrayList f26548f = new ArrayList();
    public int f26557p = Integer.MAX_VALUE;

    public xy(gz gzVar) {
        this.f26558q = gzVar;
    }

    public static void a(xy xyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = xyVar.f26549g;
        tL_messages_startHistoryImport.import_id = xyVar.f26552k;
        xyVar.f26558q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new wy(xyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f26547e;
        hashMap.put(str, valueOf);
        this.f26550i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f26550i = ((Long) entry.getValue()).longValue() + this.f26550i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f26544a)) {
            long j10 = this.f26550i;
            long j11 = this.f26556o;
            if (j10 != j11) {
                long j12 = this.f26555n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f26554m;
                    if (d2 == 0.0d) {
                        this.f26554m = d;
                    } else {
                        this.f26554m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f26557p = (int) (((this.h - j10) * 1000) / this.f26554m);
                    this.f26556o = j10;
                    this.f26555n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f26550i) / ((float) this.h)) * 100.0f);
        if (this.f26553l != i7) {
            this.f26553l = i7;
            this.f26558q.getNotificationCenter().k(qs.f25091v1, Long.valueOf(this.f26551j));
        }
    }

    public final void c(int i7) {
        gz gzVar = this.f26558q;
        if (i7 == 100) {
            gzVar.D.l(this.f26551j);
        }
        gzVar.getNotificationCenter().k(qs.f25091v1, Long.valueOf(this.f26551j));
    }
}
