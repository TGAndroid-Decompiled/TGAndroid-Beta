package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class vy {
    public String f27617e;
    public String f27618f;
    public String f27619g;
    public long h;
    public long f27620i;
    public int f27621j;
    public double f27622k;
    public long f27623l;
    public long f27624m;
    public final az f27626o;
    public final HashMap f27614a = new HashMap();
    public final HashMap f27615b = new HashMap();
    public final HashMap f27616c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f27625n = Integer.MAX_VALUE;

    public vy(az azVar) {
        this.f27626o = azVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f27615b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f27616c;
        hashMap.put(str, valueOf);
        this.f27620i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f27620i = ((Long) entry.getValue()).longValue() + this.f27620i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27620i;
        long j11 = this.f27624m;
        if (j10 != j11) {
            long j12 = this.f27623l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f27622k;
                if (d2 == 0.0d) {
                    this.f27622k = d;
                } else {
                    this.f27622k = (0.99d * d2) + (d * 0.01d);
                }
                this.f27625n = (int) (((this.h - j10) * 1000) / this.f27622k);
                this.f27624m = j10;
                this.f27623l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f27621j != i7) {
            this.f27621j = i7;
            this.f27626o.getNotificationCenter().k(ls.f25370w1, this.f27617e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f27618f;
        tL_stickers_createStickerSet.short_name = this.f27617e;
        String str = this.f27619g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((ty) arrayList.get(i7)).f27096f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f27626o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new uy(this, tL_stickers_createStickerSet));
    }
}
