package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi {
    public String f24552a;
    public long f24553b;
    public int f24554c;
    public long d;
    public long f24555e;
    public short[] f24556f;
    public boolean f24557g;
    public float h = 0.0f;
    public float f24558i = 1.0f;

    public static pi a(MediaController mediaController, String str, boolean z9) {
        TLRPC.TL_document tL_document = mediaController.f21263f1;
        if (tL_document == null) {
            return null;
        }
        pi piVar = new pi();
        piVar.f24552a = str;
        piVar.f24553b = mediaController.f21295v1;
        piVar.f24554c = mediaController.l1;
        piVar.d = mediaController.f21273k1;
        piVar.f24555e = tL_document.f26958id;
        piVar.f24556f = mediaController.f21293u1;
        piVar.f24557g = z9;
        piVar.h = 0.0f;
        piVar.f24558i = 1.0f;
        return piVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f24556f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f24556f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f24552a + "\n" + this.f24553b + "\n" + this.f24554c + "\n" + this.d + "\n" + (this.f24557g ? 1 : 0) + ";" + this.h + ";" + this.f24558i + "\n" + new String(cArr);
            }
        }
    }
}
