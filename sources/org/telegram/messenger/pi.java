package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi {
    public String f24560a;
    public long f24561b;
    public int f24562c;
    public long d;
    public long f24563e;
    public short[] f24564f;
    public boolean f24565g;
    public float h = 0.0f;
    public float f24566i = 1.0f;

    public static pi a(MediaController mediaController, String str, boolean z9) {
        TLRPC.TL_document tL_document = mediaController.f21263f1;
        if (tL_document == null) {
            return null;
        }
        pi piVar = new pi();
        piVar.f24560a = str;
        piVar.f24561b = mediaController.f21295v1;
        piVar.f24562c = mediaController.l1;
        piVar.d = mediaController.f21273k1;
        piVar.f24563e = tL_document.f26959id;
        piVar.f24564f = mediaController.f21293u1;
        piVar.f24565g = z9;
        piVar.h = 0.0f;
        piVar.f24566i = 1.0f;
        return piVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f24564f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f24564f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f24560a + "\n" + this.f24561b + "\n" + this.f24562c + "\n" + this.d + "\n" + (this.f24565g ? 1 : 0) + ";" + this.h + ";" + this.f24566i + "\n" + new String(cArr);
            }
        }
    }
}
