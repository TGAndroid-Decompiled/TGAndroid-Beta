package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mi {
    public String f25570a;
    public long f25571b;
    public int f25572c;
    public long d;
    public long f25573e;
    public short[] f25574f;
    public boolean f25575g;
    public float h = 0.0f;
    public float f25576i = 1.0f;

    public static mi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f22714g1;
        if (tL_document == null) {
            return null;
        }
        mi miVar = new mi();
        miVar.f25570a = str;
        miVar.f25571b = mediaController.f22747w1;
        miVar.f25572c = mediaController.f22724m1;
        miVar.d = mediaController.l1;
        miVar.f25573e = tL_document.f28411id;
        miVar.f25574f = mediaController.f22744v1;
        miVar.f25575g = z10;
        miVar.h = 0.0f;
        miVar.f25576i = 1.0f;
        return miVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f25574f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f25574f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f25570a + "\n" + this.f25571b + "\n" + this.f25572c + "\n" + this.d + "\n" + (this.f25575g ? 1 : 0) + ";" + this.h + ";" + this.f25576i + "\n" + new String(cArr);
            }
        }
    }
}
