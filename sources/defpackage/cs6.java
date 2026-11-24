package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class cs6 {
    public String a;
    public long b;
    public int c;
    public long d;
    public long e;
    public short[] f;
    public boolean g;
    public float h = 0.0f;
    public float i = 1.0f;

    public static cs6 a(MediaController mediaController, String str, boolean z) {
        TLRPC.TL_document tL_document = mediaController.g1;
        if (tL_document == null) {
            return null;
        }
        cs6 cs6Var = new cs6();
        cs6Var.a = str;
        cs6Var.b = mediaController.w1;
        cs6Var.c = mediaController.m1;
        cs6Var.d = mediaController.l1;
        cs6Var.e = tL_document.id;
        cs6Var.f = mediaController.v1;
        cs6Var.g = z;
        cs6Var.h = 0.0f;
        cs6Var.i = 1.0f;
        return cs6Var;
    }

    public final String toString() {
        char[] cArr = new char[this.f.length];
        int i = 0;
        while (true) {
            short[] sArr = this.f;
            if (i < sArr.length) {
                cArr[i] = (char) sArr[i];
                i++;
            } else {
                return "@" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + "\n" + (this.g ? 1 : 0) + ";" + this.h + ";" + this.i + "\n" + new String(cArr);
            }
        }
    }
}
