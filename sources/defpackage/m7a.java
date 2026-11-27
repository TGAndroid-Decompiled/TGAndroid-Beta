package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class m7a {
    public String e;
    public String f;
    public String g;
    public long h;
    public long i;
    public int j;
    public double k;
    public long l;
    public long m;
    public final r7a o;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int n = Integer.MAX_VALUE;

    public m7a(r7a r7aVar) {
        this.o = r7aVar;
    }

    public final void a(String str, long j, float f) {
        this.b.put(str, Float.valueOf(f));
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.c;
        hashMap.put(str, valueOf);
        this.i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.i = ((Long) entry.getValue()).longValue() + this.i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.i;
        long j3 = this.m;
        if (j2 != j3) {
            long j4 = this.l;
            if (elapsedRealtime != j4) {
                double d = (j2 - j3) / ((elapsedRealtime - j4) / 1000.0d);
                double d2 = this.k;
                if (d2 == 0.0d) {
                    this.k = d;
                } else {
                    d = (d * 0.01d) + (0.99d * d2);
                    this.k = d;
                }
                this.n = (int) (((this.h - j2) * 1000) / d);
                this.m = j2;
                this.l = elapsedRealtime;
            }
        }
        int i = (int) ((((float) j2) / ((float) this.h)) * 100.0f);
        if (this.j != i) {
            this.j = i;
            this.o.getNotificationCenter().k(jn7.w1, this.e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f;
        tL_stickers_createStickerSet.short_name = this.e;
        String str = this.g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((k7a) arrayList.get(i)).f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new l7a(this, tL_stickers_createStickerSet));
    }
}
