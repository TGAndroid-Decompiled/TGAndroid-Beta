package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class lz {
    public String e;
    public String f16840f;
    public String f16841g;
    public long h;
    public long f16842i;
    public int f16843j;
    public double f16844k;
    public long f16845l;
    public long f16846m;
    public final qz f16848o;
    public final HashMap f16837a = new HashMap();
    public final HashMap f16838b = new HashMap();
    public final HashMap f16839c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f16847n = Integer.MAX_VALUE;

    public lz(qz qzVar) {
        this.f16848o = qzVar;
    }

    public final void a(String str, long j10, float f7) {
        this.f16838b.put(str, Float.valueOf(f7));
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f16839c;
        hashMap.put(str, valueOf);
        this.f16842i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f16842i = ((Long) entry.getValue()).longValue() + this.f16842i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f16842i;
        long j12 = this.f16846m;
        if (j11 != j12) {
            long j13 = this.f16845l;
            if (elapsedRealtime != j13) {
                double d = (j11 - j12) / ((elapsedRealtime - j13) / 1000.0d);
                double d10 = this.f16844k;
                if (d10 == 0.0d) {
                    this.f16844k = d;
                } else {
                    this.f16844k = (0.99d * d10) + (d * 0.01d);
                }
                this.f16847n = (int) (((this.h - j11) * 1000) / this.f16844k);
                this.f16846m = j11;
                this.f16845l = elapsedRealtime;
            }
        }
        int i10 = (int) ((((float) j11) / ((float) this.h)) * 100.0f);
        if (this.f16843j != i10) {
            this.f16843j = i10;
            this.f16848o.getNotificationCenter().k(zs.f19712w1, this.e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f16840f;
        tL_stickers_createStickerSet.short_name = this.e;
        String str = this.f16841g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((jz) arrayList.get(i10)).f16496f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f16848o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new kz(this, tL_stickers_createStickerSet));
    }
}
