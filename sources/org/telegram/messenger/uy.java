package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class uy {
    public String f27291e;
    public String f27292f;
    public String f27293g;
    public long h;
    public long f27294i;
    public int f27295j;
    public double f27296k;
    public long f27297l;
    public long f27298m;
    public final zy f27300o;
    public final HashMap f27288a = new HashMap();
    public final HashMap f27289b = new HashMap();
    public final HashMap f27290c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f27299n = Integer.MAX_VALUE;

    public uy(zy zyVar) {
        this.f27300o = zyVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f27289b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f27290c;
        hashMap.put(str, valueOf);
        this.f27294i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f27294i = ((Long) entry.getValue()).longValue() + this.f27294i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27294i;
        long j11 = this.f27298m;
        if (j10 != j11) {
            long j12 = this.f27297l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f27296k;
                if (d2 == 0.0d) {
                    this.f27296k = d;
                } else {
                    this.f27296k = (0.99d * d2) + (d * 0.01d);
                }
                this.f27299n = (int) (((this.h - j10) * 1000) / this.f27296k);
                this.f27298m = j10;
                this.f27297l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f27295j != i7) {
            this.f27295j = i7;
            this.f27300o.getNotificationCenter().k(ks.f25214w1, this.f27291e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f27292f;
        tL_stickers_createStickerSet.short_name = this.f27291e;
        String str = this.f27293g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((sy) arrayList.get(i7)).f26906f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f27300o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new ty(this, tL_stickers_createStickerSet));
    }
}
