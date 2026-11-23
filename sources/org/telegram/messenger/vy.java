package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class vy {
    public String f27653e;
    public String f27654f;
    public String f27655g;
    public long h;
    public long f27656i;
    public int f27657j;
    public double f27658k;
    public long f27659l;
    public long f27660m;
    public final az f27662o;
    public final HashMap f27650a = new HashMap();
    public final HashMap f27651b = new HashMap();
    public final HashMap f27652c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f27661n = Integer.MAX_VALUE;

    public vy(az azVar) {
        this.f27662o = azVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f27651b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f27652c;
        hashMap.put(str, valueOf);
        this.f27656i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f27656i = ((Long) entry.getValue()).longValue() + this.f27656i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27656i;
        long j11 = this.f27660m;
        if (j10 != j11) {
            long j12 = this.f27659l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f27658k;
                if (d2 == 0.0d) {
                    this.f27658k = d;
                } else {
                    this.f27658k = (0.99d * d2) + (d * 0.01d);
                }
                this.f27661n = (int) (((this.h - j10) * 1000) / this.f27658k);
                this.f27660m = j10;
                this.f27659l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f27657j != i7) {
            this.f27657j = i7;
            this.f27662o.getNotificationCenter().k(ls.f25406w1, this.f27653e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f27654f;
        tL_stickers_createStickerSet.short_name = this.f27653e;
        String str = this.f27655g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((ty) arrayList.get(i7)).f27132f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f27662o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new uy(this, tL_stickers_createStickerSet));
    }
}
