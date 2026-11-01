package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class mz {
    public String e;
    public String f17224f;
    public String f17225g;
    public long h;
    public long f17226i;
    public int f17227j;
    public double f17228k;
    public long f17229l;
    public long f17230m;
    public final rz f17232o;
    public final HashMap f17221a = new HashMap();
    public final HashMap f17222b = new HashMap();
    public final HashMap f17223c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f17231n = Integer.MAX_VALUE;

    public mz(rz rzVar) {
        this.f17232o = rzVar;
    }

    public final void a(String str, long j10, float f7) {
        this.f17222b.put(str, Float.valueOf(f7));
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f17223c;
        hashMap.put(str, valueOf);
        this.f17226i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f17226i = ((Long) entry.getValue()).longValue() + this.f17226i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f17226i;
        long j12 = this.f17230m;
        if (j11 != j12) {
            long j13 = this.f17229l;
            if (elapsedRealtime != j13) {
                double d = (j11 - j12) / ((elapsedRealtime - j13) / 1000.0d);
                double d10 = this.f17228k;
                if (d10 == 0.0d) {
                    this.f17228k = d;
                } else {
                    this.f17228k = (0.99d * d10) + (d * 0.01d);
                }
                this.f17231n = (int) (((this.h - j11) * 1000) / this.f17228k);
                this.f17230m = j11;
                this.f17229l = elapsedRealtime;
            }
        }
        int i10 = (int) ((((float) j11) / ((float) this.h)) * 100.0f);
        if (this.f17227j != i10) {
            this.f17227j = i10;
            this.f17232o.getNotificationCenter().k(at.f14808w1, this.e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f17224f;
        tL_stickers_createStickerSet.short_name = this.e;
        String str = this.f17225g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((kz) arrayList.get(i10)).f16849f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f17232o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new lz(this, tL_stickers_createStickerSet));
    }
}
