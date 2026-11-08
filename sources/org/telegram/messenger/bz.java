package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public String f21754e;
    public String f21755f;
    public String f21756g;
    public long h;
    public long f21757i;
    public int f21758j;
    public double f21759k;
    public long f21760l;
    public long f21761m;
    public final gz f21763o;
    public final HashMap f21751a = new HashMap();
    public final HashMap f21752b = new HashMap();
    public final HashMap f21753c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f21762n = Integer.MAX_VALUE;

    public bz(gz gzVar) {
        this.f21763o = gzVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f21752b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f21753c;
        hashMap.put(str, valueOf);
        this.f21757i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f21757i = ((Long) entry.getValue()).longValue() + this.f21757i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f21757i;
        long j11 = this.f21761m;
        if (j10 != j11) {
            long j12 = this.f21760l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f21759k;
                if (d2 == 0.0d) {
                    this.f21759k = d;
                } else {
                    this.f21759k = (0.99d * d2) + (d * 0.01d);
                }
                this.f21762n = (int) (((this.h - j10) * 1000) / this.f21759k);
                this.f21761m = j10;
                this.f21760l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f21758j != i7) {
            this.f21758j = i7;
            this.f21763o.getNotificationCenter().k(qs.f25098w1, this.f21754e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f21755f;
        tL_stickers_createStickerSet.short_name = this.f21754e;
        String str = this.f21756g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((zy) arrayList.get(i7)).f26946f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f21763o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new az(this, tL_stickers_createStickerSet));
    }
}
