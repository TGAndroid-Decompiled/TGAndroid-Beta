package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi {
    public String f17441a;
    public long f17442b;
    public int f17443c;
    public long d;
    public long e;
    public short[] f17444f;
    public boolean f17445g;
    public float h = 0.0f;
    public float f17446i = 1.0f;

    public static pi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f14449e1;
        if (tL_document == null) {
            return null;
        }
        pi piVar = new pi();
        piVar.f17441a = str;
        piVar.f17442b = mediaController.f14483u1;
        piVar.f17443c = mediaController.f14462k1;
        piVar.d = mediaController.f14460j1;
        piVar.e = tL_document.f19799id;
        piVar.f17444f = mediaController.f14481t1;
        piVar.f17445g = z10;
        piVar.h = 0.0f;
        piVar.f17446i = 1.0f;
        return piVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f17444f.length];
        int i10 = 0;
        while (true) {
            short[] sArr = this.f17444f;
            if (i10 < sArr.length) {
                cArr[i10] = (char) sArr[i10];
                i10++;
            } else {
                return "@" + this.f17441a + "\n" + this.f17442b + "\n" + this.f17443c + "\n" + this.d + "\n" + (this.f17445g ? 1 : 0) + ";" + this.h + ";" + this.f17446i + "\n" + new String(cArr);
            }
        }
    }
}
