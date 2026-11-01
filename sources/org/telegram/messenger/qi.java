package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi {
    public String f17776a;
    public long f17777b;
    public int f17778c;
    public long d;
    public long e;
    public short[] f17779f;
    public boolean f17780g;
    public float h = 0.0f;
    public float f17781i = 1.0f;

    public static qi a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f14450e1;
        if (tL_document == null) {
            return null;
        }
        qi qiVar = new qi();
        qiVar.f17776a = str;
        qiVar.f17777b = mediaController.f14484u1;
        qiVar.f17778c = mediaController.f14463k1;
        qiVar.d = mediaController.f14461j1;
        qiVar.e = tL_document.f19800id;
        qiVar.f17779f = mediaController.f14482t1;
        qiVar.f17780g = z10;
        qiVar.h = 0.0f;
        qiVar.f17781i = 1.0f;
        return qiVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f17779f.length];
        int i10 = 0;
        while (true) {
            short[] sArr = this.f17779f;
            if (i10 < sArr.length) {
                cArr[i10] = (char) sArr[i10];
                i10++;
            } else {
                return "@" + this.f17776a + "\n" + this.f17777b + "\n" + this.f17778c + "\n" + this.d + "\n" + (this.f17780g ? 1 : 0) + ";" + this.h + ";" + this.f17781i + "\n" + new String(cArr);
            }
        }
    }
}
