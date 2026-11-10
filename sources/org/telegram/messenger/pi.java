package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi {
    public String f24571a;
    public long f24572b;
    public int f24573c;
    public long d;
    public long f24574e;
    public short[] f24575f;
    public boolean f24576g;
    public float h = 0.0f;
    public float f24577i = 1.0f;

    public static pi a(MediaController mediaController, String str, boolean z9) {
        TLRPC.TL_document tL_document = mediaController.f21271f1;
        if (tL_document == null) {
            return null;
        }
        pi piVar = new pi();
        piVar.f24571a = str;
        piVar.f24572b = mediaController.f21303v1;
        piVar.f24573c = mediaController.l1;
        piVar.d = mediaController.f21281k1;
        piVar.f24574e = tL_document.f26966id;
        piVar.f24575f = mediaController.f21301u1;
        piVar.f24576g = z9;
        piVar.h = 0.0f;
        piVar.f24577i = 1.0f;
        return piVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f24575f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f24575f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f24571a + "\n" + this.f24572b + "\n" + this.f24573c + "\n" + this.d + "\n" + (this.f24576g ? 1 : 0) + ";" + this.h + ";" + this.f24577i + "\n" + new String(cArr);
            }
        }
    }
}
