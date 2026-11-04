package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gi {
    public String f22723a;
    public long f22724b;
    public int f22725c;
    public long d;
    public long f22726e;
    public short[] f22727f;
    public boolean f22728g;
    public float h = 0.0f;
    public float f22729i = 1.0f;

    public static gi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f21319g1;
        if (tL_document == null) {
            return null;
        }
        gi giVar = new gi();
        giVar.f22723a = str;
        giVar.f22724b = mediaController.f21352w1;
        giVar.f22725c = mediaController.m1;
        giVar.d = mediaController.f21328l1;
        giVar.f22726e = tL_document.f27007id;
        giVar.f22727f = mediaController.f21349v1;
        giVar.f22728g = z10;
        giVar.h = 0.0f;
        giVar.f22729i = 1.0f;
        return giVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f22727f.length];
        int i3 = 0;
        while (true) {
            short[] sArr = this.f22727f;
            if (i3 < sArr.length) {
                cArr[i3] = (char) sArr[i3];
                i3++;
            } else {
                return "@" + this.f22723a + "\n" + this.f22724b + "\n" + this.f22725c + "\n" + this.d + "\n" + (this.f22728g ? 1 : 0) + ";" + this.h + ";" + this.f22729i + "\n" + new String(cArr);
            }
        }
    }
}
