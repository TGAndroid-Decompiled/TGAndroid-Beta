package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class qy {
    public String f26511a;
    public TLRPC.InputPeer f26516g;
    public long h;
    public long f26517i;
    public long f26518j;
    public long f26519k;
    public int f26520l;
    public double f26521m;
    public long f26522n;
    public long f26523o;
    public final zy f26525q;
    public ArrayList f26512b = new ArrayList();
    public final HashSet f26513c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f26514e = new HashMap();
    public final ArrayList f26515f = new ArrayList();
    public int f26524p = Integer.MAX_VALUE;

    public qy(zy zyVar) {
        this.f26525q = zyVar;
    }

    public static void a(qy qyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = qyVar.f26516g;
        tL_messages_startHistoryImport.import_id = qyVar.f26519k;
        qyVar.f26525q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new py(qyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f26514e;
        hashMap.put(str, valueOf);
        this.f26517i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f26517i = ((Long) entry.getValue()).longValue() + this.f26517i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f26511a)) {
            long j10 = this.f26517i;
            long j11 = this.f26523o;
            if (j10 != j11) {
                long j12 = this.f26522n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f26521m;
                    if (d2 == 0.0d) {
                        this.f26521m = d;
                    } else {
                        this.f26521m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f26524p = (int) (((this.h - j10) * 1000) / this.f26521m);
                    this.f26523o = j10;
                    this.f26522n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f26517i) / ((float) this.h)) * 100.0f);
        if (this.f26520l != i7) {
            this.f26520l = i7;
            this.f26525q.getNotificationCenter().k(ks.f25233v1, Long.valueOf(this.f26518j));
        }
    }

    public final void c(int i7) {
        zy zyVar = this.f26525q;
        if (i7 == 100) {
            zyVar.E.l(this.f26518j);
        }
        zyVar.getNotificationCenter().k(ks.f25233v1, Long.valueOf(this.f26518j));
    }
}
