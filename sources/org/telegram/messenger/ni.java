package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ni {
    public String f25767a;
    public long f25768b;
    public int f25769c;
    public long d;
    public long f25770e;
    public short[] f25771f;
    public boolean f25772g;
    public float h = 0.0f;
    public float f25773i = 1.0f;

    public static ni a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f22742g1;
        if (tL_document == null) {
            return null;
        }
        ni niVar = new ni();
        niVar.f25767a = str;
        niVar.f25768b = mediaController.f22775w1;
        niVar.f25769c = mediaController.f22752m1;
        niVar.d = mediaController.l1;
        niVar.f25770e = tL_document.f28440id;
        niVar.f25771f = mediaController.f22772v1;
        niVar.f25772g = z10;
        niVar.h = 0.0f;
        niVar.f25773i = 1.0f;
        return niVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f25771f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f25771f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f25767a + "\n" + this.f25768b + "\n" + this.f25769c + "\n" + this.d + "\n" + (this.f25772g ? 1 : 0) + ";" + this.h + ";" + this.f25773i + "\n" + new String(cArr);
            }
        }
    }
}
