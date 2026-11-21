package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mi {
    public String f25596a;
    public long f25597b;
    public int f25598c;
    public long d;
    public long f25599e;
    public short[] f25600f;
    public boolean f25601g;
    public float h = 0.0f;
    public float f25602i = 1.0f;

    public static mi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f22739g1;
        if (tL_document == null) {
            return null;
        }
        mi miVar = new mi();
        miVar.f25596a = str;
        miVar.f25597b = mediaController.f22772w1;
        miVar.f25598c = mediaController.f22749m1;
        miVar.d = mediaController.l1;
        miVar.f25599e = tL_document.f28437id;
        miVar.f25600f = mediaController.f22769v1;
        miVar.f25601g = z10;
        miVar.h = 0.0f;
        miVar.f25602i = 1.0f;
        return miVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f25600f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f25600f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f25596a + "\n" + this.f25597b + "\n" + this.f25598c + "\n" + this.d + "\n" + (this.f25601g ? 1 : 0) + ";" + this.h + ";" + this.f25602i + "\n" + new String(cArr);
            }
        }
    }
}
