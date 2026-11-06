package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public String f21718e;
    public String f21719f;
    public String f21720g;
    public long h;
    public long f21721i;
    public int f21722j;
    public double f21723k;
    public long f21724l;
    public long f21725m;
    public final gz f21727o;
    public final HashMap f21715a = new HashMap();
    public final HashMap f21716b = new HashMap();
    public final HashMap f21717c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f21726n = Integer.MAX_VALUE;

    public bz(gz gzVar) {
        this.f21727o = gzVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f21716b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f21717c;
        hashMap.put(str, valueOf);
        this.f21721i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f21721i = ((Long) entry.getValue()).longValue() + this.f21721i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f21721i;
        long j11 = this.f21725m;
        if (j10 != j11) {
            long j12 = this.f21724l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f21723k;
                if (d2 == 0.0d) {
                    this.f21723k = d;
                } else {
                    this.f21723k = (0.99d * d2) + (d * 0.01d);
                }
                this.f21726n = (int) (((this.h - j10) * 1000) / this.f21723k);
                this.f21725m = j10;
                this.f21724l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f21722j != i7) {
            this.f21722j = i7;
            this.f21727o.getNotificationCenter().k(qs.f25089w1, this.f21718e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f21719f;
        tL_stickers_createStickerSet.short_name = this.f21718e;
        String str = this.f21720g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((zy) arrayList.get(i7)).f26943f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f21727o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new az(this, tL_stickers_createStickerSet));
    }
}
