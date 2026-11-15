package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ni {
    public String f25196a;
    public long f25197b;
    public int f25198c;
    public long d;
    public long f25199e;
    public short[] f25200f;
    public boolean f25201g;
    public float h = 0.0f;
    public float f25202i = 1.0f;

    public static ni a(MediaController mediaController, String str, boolean z10) {
        TLRPC.TL_document tL_document = mediaController.f22348g1;
        if (tL_document == null) {
            return null;
        }
        ni niVar = new ni();
        niVar.f25196a = str;
        niVar.f25197b = mediaController.f22381w1;
        niVar.f25198c = mediaController.f22358m1;
        niVar.d = mediaController.l1;
        niVar.f25199e = tL_document.f28057id;
        niVar.f25200f = mediaController.f22378v1;
        niVar.f25201g = z10;
        niVar.h = 0.0f;
        niVar.f25202i = 1.0f;
        return niVar;
    }

    public final String toString() {
        char[] cArr = new char[this.f25200f.length];
        int i7 = 0;
        while (true) {
            short[] sArr = this.f25200f;
            if (i7 < sArr.length) {
                cArr[i7] = (char) sArr[i7];
                i7++;
            } else {
                return "@" + this.f25196a + "\n" + this.f25197b + "\n" + this.f25198c + "\n" + this.d + "\n" + (this.f25201g ? 1 : 0) + ";" + this.h + ";" + this.f25202i + "\n" + new String(cArr);
            }
        }
    }
}
