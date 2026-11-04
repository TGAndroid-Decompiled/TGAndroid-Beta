package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class ty {
    public String f25619e;
    public String f25620f;
    public String f25621g;
    public long h;
    public long f25622i;
    public int f25623j;
    public double f25624k;
    public long f25625l;
    public long f25626m;
    public final yy f25628o;
    public final HashMap f25616a = new HashMap();
    public final HashMap f25617b = new HashMap();
    public final HashMap f25618c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f25627n = Integer.MAX_VALUE;

    public ty(yy yyVar) {
        this.f25628o = yyVar;
    }

    public final void a(String str, long j10, float f10) {
        this.f25617b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f25618c;
        hashMap.put(str, valueOf);
        this.f25622i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f25622i = ((Long) entry.getValue()).longValue() + this.f25622i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f25622i;
        long j12 = this.f25626m;
        if (j11 != j12) {
            long j13 = this.f25625l;
            if (elapsedRealtime != j13) {
                double d = (j11 - j12) / ((elapsedRealtime - j13) / 1000.0d);
                double d10 = this.f25624k;
                if (d10 == 0.0d) {
                    this.f25624k = d;
                } else {
                    this.f25624k = (0.99d * d10) + (d * 0.01d);
                }
                this.f25627n = (int) (((this.h - j11) * 1000) / this.f25624k);
                this.f25626m = j11;
                this.f25625l = elapsedRealtime;
            }
        }
        int i3 = (int) ((((float) j11) / ((float) this.h)) * 100.0f);
        if (this.f25623j != i3) {
            this.f25623j = i3;
            this.f25628o.getNotificationCenter().k(hs.f23327w1, this.f25619e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f25620f;
        tL_stickers_createStickerSet.short_name = this.f25619e;
        String str = this.f25621g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((ry) arrayList.get(i3)).f25253f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f25628o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new sy(this, tL_stickers_createStickerSet));
    }
}
