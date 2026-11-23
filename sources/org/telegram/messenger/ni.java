package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ni {
    public String f25731a;
    public long f25732b;
    public int f25733c;
    public long d;
    public long f25734e;
    public short[] f25735f;
    public boolean f25736g;
    public float h = 0.0f;
    public float f25737i = 1.0f;

    public static ni a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f22706g1;
        if (tL_document == null) {
            return null;
        }
        ni niVar = new ni();
        niVar.f25731a = str;
        niVar.f25732b = mediaController.f22739w1;
        niVar.f25733c = mediaController.f22716m1;
        niVar.d = mediaController.l1;
        niVar.f25734e = tL_document.f28404id;
        niVar.f25735f = mediaController.f22736v1;
        niVar.f25736g = z10;
        niVar.h = 0.0f;
        niVar.f25737i = 1.0f;
        return niVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f25735f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f25735f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f25731a + "\n" + this.f25732b + "\n" + this.f25733c + "\n" + this.d + "\n" + (this.f25736g ? 1 : 0) + ";" + this.h + ";" + this.f25737i + "\n" + new String(cArr);
            }
        }
    }
}
