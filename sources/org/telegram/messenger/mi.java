package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mi {
    public String f25663a;
    public long f25664b;
    public int f25665c;
    public long d;
    public long f25666e;
    public short[] f25667f;
    public boolean f25668g;
    public float h = 0.0f;
    public float f25669i = 1.0f;

    public static mi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f22809g1;
        if (tL_document == null) {
            return null;
        }
        mi miVar = new mi();
        miVar.f25663a = str;
        miVar.f25664b = mediaController.f22842w1;
        miVar.f25665c = mediaController.f22819m1;
        miVar.d = mediaController.l1;
        miVar.f25666e = tL_document.f28498id;
        miVar.f25667f = mediaController.f22839v1;
        miVar.f25668g = z10;
        miVar.h = 0.0f;
        miVar.f25669i = 1.0f;
        return miVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f25667f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f25667f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f25663a + "\n" + this.f25664b + "\n" + this.f25665c + "\n" + this.d + "\n" + (this.f25668g ? 1 : 0) + ";" + this.h + ";" + this.f25669i + "\n" + new String(cArr);
            }
        }
    }
}
