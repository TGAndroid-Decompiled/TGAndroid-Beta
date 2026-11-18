package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class uy {
    public String f27289e;
    public String f27290f;
    public String f27291g;
    public long h;
    public long f27292i;
    public int f27293j;
    public double f27294k;
    public long f27295l;
    public long f27296m;
    public final zy f27298o;
    public final HashMap f27286a = new HashMap();
    public final HashMap f27287b = new HashMap();
    public final HashMap f27288c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f27297n = Integer.MAX_VALUE;

    public uy(zy zyVar) {
        this.f27298o = zyVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f27287b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f27288c;
        hashMap.put(str, valueOf);
        this.f27292i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f27292i = ((Long) entry.getValue()).longValue() + this.f27292i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27292i;
        long j11 = this.f27296m;
        if (j10 != j11) {
            long j12 = this.f27295l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f27294k;
                if (d2 == 0.0d) {
                    this.f27294k = d;
                } else {
                    this.f27294k = (0.99d * d2) + (d * 0.01d);
                }
                this.f27297n = (int) (((this.h - j10) * 1000) / this.f27294k);
                this.f27296m = j10;
                this.f27295l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f27293j != i7) {
            this.f27293j = i7;
            this.f27298o.getNotificationCenter().k(ks.f25212w1, this.f27289e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f27290f;
        tL_stickers_createStickerSet.short_name = this.f27289e;
        String str = this.f27291g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((sy) arrayList.get(i7)).f26904f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f27298o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new ty(this, tL_stickers_createStickerSet));
    }
}
