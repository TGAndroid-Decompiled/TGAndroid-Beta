package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi {
    public String f24567a;
    public long f24568b;
    public int f24569c;
    public long d;
    public long f24570e;
    public short[] f24571f;
    public boolean f24572g;
    public float h = 0.0f;
    public float f24573i = 1.0f;

    public static pi a(MediaController mediaController, String str, boolean z9) {
        TLRPC.TL_document tL_document = mediaController.f21266f1;
        if (tL_document == null) {
            return null;
        }
        pi piVar = new pi();
        piVar.f24567a = str;
        piVar.f24568b = mediaController.f21298v1;
        piVar.f24569c = mediaController.l1;
        piVar.d = mediaController.f21276k1;
        piVar.f24570e = tL_document.f26962id;
        piVar.f24571f = mediaController.f21296u1;
        piVar.f24572g = z9;
        piVar.h = 0.0f;
        piVar.f24573i = 1.0f;
        return piVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f24571f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f24571f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f24567a + "\n" + this.f24568b + "\n" + this.f24569c + "\n" + this.d + "\n" + (this.f24572g ? 1 : 0) + ";" + this.h + ";" + this.f24573i + "\n" + new String(cArr);
            }
        }
    }
}
