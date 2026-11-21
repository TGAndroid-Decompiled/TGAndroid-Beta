package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class uy {
    public String f27317e;
    public String f27318f;
    public String f27319g;
    public long h;
    public long f27320i;
    public int f27321j;
    public double f27322k;
    public long f27323l;
    public long f27324m;
    public final zy f27326o;
    public final HashMap f27314a = new HashMap();
    public final HashMap f27315b = new HashMap();
    public final HashMap f27316c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f27325n = Integer.MAX_VALUE;

    public uy(zy zyVar) {
        this.f27326o = zyVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f27315b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f27316c;
        hashMap.put(str, valueOf);
        this.f27320i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f27320i = ((Long) entry.getValue()).longValue() + this.f27320i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27320i;
        long j11 = this.f27324m;
        if (j10 != j11) {
            long j12 = this.f27323l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f27322k;
                if (d2 == 0.0d) {
                    this.f27322k = d;
                } else {
                    this.f27322k = (0.99d * d2) + (d * 0.01d);
                }
                this.f27325n = (int) (((this.h - j10) * 1000) / this.f27322k);
                this.f27324m = j10;
                this.f27323l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f27321j != i7) {
            this.f27321j = i7;
            this.f27326o.getNotificationCenter().k(ks.f25240w1, this.f27317e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f27318f;
        tL_stickers_createStickerSet.short_name = this.f27317e;
        String str = this.f27319g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((sy) arrayList.get(i7)).f26932f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f27326o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new ty(this, tL_stickers_createStickerSet));
    }
}
