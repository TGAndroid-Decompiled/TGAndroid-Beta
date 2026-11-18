package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mi {
    public String f25568a;
    public long f25569b;
    public int f25570c;
    public long d;
    public long f25571e;
    public short[] f25572f;
    public boolean f25573g;
    public float h = 0.0f;
    public float f25574i = 1.0f;

    public static mi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f22711g1;
        if (tL_document == null) {
            return null;
        }
        mi miVar = new mi();
        miVar.f25568a = str;
        miVar.f25569b = mediaController.f22744w1;
        miVar.f25570c = mediaController.f22721m1;
        miVar.d = mediaController.l1;
        miVar.f25571e = tL_document.f28409id;
        miVar.f25572f = mediaController.f22741v1;
        miVar.f25573g = z10;
        miVar.h = 0.0f;
        miVar.f25574i = 1.0f;
        return miVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f25572f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f25572f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f25568a + "\n" + this.f25569b + "\n" + this.f25570c + "\n" + this.d + "\n" + (this.f25573g ? 1 : 0) + ";" + this.h + ";" + this.f25574i + "\n" + new String(cArr);
            }
        }
    }
}
