package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public String f21712e;
    public String f21713f;
    public String f21714g;
    public long h;
    public long f21715i;
    public int f21716j;
    public double f21717k;
    public long f21718l;
    public long f21719m;
    public final gz f21721o;
    public final HashMap f21709a = new HashMap();
    public final HashMap f21710b = new HashMap();
    public final HashMap f21711c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f21720n = Integer.MAX_VALUE;

    public bz(gz gzVar) {
        this.f21721o = gzVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f21710b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f21711c;
        hashMap.put(str, valueOf);
        this.f21715i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f21715i = ((Long) entry.getValue()).longValue() + this.f21715i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f21715i;
        long j11 = this.f21719m;
        if (j10 != j11) {
            long j12 = this.f21718l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f21717k;
                if (d2 == 0.0d) {
                    this.f21717k = d;
                } else {
                    this.f21717k = (0.99d * d2) + (d * 0.01d);
                }
                this.f21720n = (int) (((this.h - j10) * 1000) / this.f21717k);
                this.f21719m = j10;
                this.f21718l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f21716j != i7) {
            this.f21716j = i7;
            this.f21721o.getNotificationCenter().k(qs.f25081w1, this.f21712e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f21713f;
        tL_stickers_createStickerSet.short_name = this.f21712e;
        String str = this.f21714g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((zy) arrayList.get(i7)).f26942f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f21721o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new az(this, tL_stickers_createStickerSet));
    }
}
