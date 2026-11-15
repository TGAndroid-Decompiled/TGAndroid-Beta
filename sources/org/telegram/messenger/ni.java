package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ni {
    public String f25199a;
    public long f25200b;
    public int f25201c;
    public long d;
    public long f25202e;
    public short[] f25203f;
    public boolean f25204g;
    public float h = 0.0f;
    public float f25205i = 1.0f;

    public static ni a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f22348g1;
        if (tL_document == null) {
            return null;
        }
        ni niVar = new ni();
        niVar.f25199a = str;
        niVar.f25200b = mediaController.f22381w1;
        niVar.f25201c = mediaController.f22358m1;
        niVar.d = mediaController.l1;
        niVar.f25202e = tL_document.f28057id;
        niVar.f25203f = mediaController.f22378v1;
        niVar.f25204g = z10;
        niVar.h = 0.0f;
        niVar.f25205i = 1.0f;
        return niVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f25203f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f25203f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f25199a + "\n" + this.f25200b + "\n" + this.f25201c + "\n" + this.d + "\n" + (this.f25204g ? 1 : 0) + ";" + this.h + ";" + this.f25205i + "\n" + new String(cArr);
            }
        }
    }
}
