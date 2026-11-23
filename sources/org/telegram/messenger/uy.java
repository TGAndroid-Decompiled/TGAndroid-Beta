package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class uy {
    public String f27393e;
    public String f27394f;
    public String f27395g;
    public long h;
    public long f27396i;
    public int f27397j;
    public double f27398k;
    public long f27399l;
    public long f27400m;
    public final zy f27402o;
    public final HashMap f27390a = new HashMap();
    public final HashMap f27391b = new HashMap();
    public final HashMap f27392c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f27401n = Integer.MAX_VALUE;

    public uy(zy zyVar) {
        this.f27402o = zyVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f27391b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f27392c;
        hashMap.put(str, valueOf);
        this.f27396i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f27396i = ((Long) entry.getValue()).longValue() + this.f27396i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27396i;
        long j11 = this.f27400m;
        if (j10 != j11) {
            long j12 = this.f27399l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f27398k;
                if (d2 == 0.0d) {
                    this.f27398k = d;
                } else {
                    this.f27398k = (0.99d * d2) + (d * 0.01d);
                }
                this.f27401n = (int) (((this.h - j10) * 1000) / this.f27398k);
                this.f27400m = j10;
                this.f27399l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f27397j != i7) {
            this.f27397j = i7;
            this.f27402o.getNotificationCenter().k(ks.f25311w1, this.f27393e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f27394f;
        tL_stickers_createStickerSet.short_name = this.f27393e;
        String str = this.f27395g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((sy) arrayList.get(i7)).f27005f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f27402o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new ty(this, tL_stickers_createStickerSet));
    }
}
