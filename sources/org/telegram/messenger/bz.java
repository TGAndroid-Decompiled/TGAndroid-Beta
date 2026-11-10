package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public String f21759e;
    public String f21760f;
    public String f21761g;
    public long h;
    public long f21762i;
    public int f21763j;
    public double f21764k;
    public long f21765l;
    public long f21766m;
    public final gz f21768o;
    public final HashMap f21756a = new HashMap();
    public final HashMap f21757b = new HashMap();
    public final HashMap f21758c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f21767n = Integer.MAX_VALUE;

    public bz(gz gzVar) {
        this.f21768o = gzVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f21757b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f21758c;
        hashMap.put(str, valueOf);
        this.f21762i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f21762i = ((Long) entry.getValue()).longValue() + this.f21762i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f21762i;
        long j11 = this.f21766m;
        if (j10 != j11) {
            long j12 = this.f21765l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f21764k;
                if (d2 == 0.0d) {
                    this.f21764k = d;
                } else {
                    this.f21764k = (0.99d * d2) + (d * 0.01d);
                }
                this.f21767n = (int) (((this.h - j10) * 1000) / this.f21764k);
                this.f21766m = j10;
                this.f21765l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f21763j != i7) {
            this.f21763j = i7;
            this.f21768o.getNotificationCenter().k(qs.f25102w1, this.f21759e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f21760f;
        tL_stickers_createStickerSet.short_name = this.f21759e;
        String str = this.f21761g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((zy) arrayList.get(i7)).f26950f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f21768o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new az(this, tL_stickers_createStickerSet));
    }
}
