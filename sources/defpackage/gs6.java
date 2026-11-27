package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class gs6 {
    public String a;
    public long b;
    public int c;
    public long d;
    public long e;
    public short[] f;
    public boolean g;
    public float h = 0.0f;
    public float i = 1.0f;

    public static gs6 a(MediaController mediaController, String str, boolean z) {
        TLRPC.TL_document tL_document = mediaController.g1;
        if (tL_document == null) {
            return null;
        }
        gs6 gs6Var = new gs6();
        gs6Var.a = str;
        gs6Var.b = mediaController.w1;
        gs6Var.c = mediaController.m1;
        gs6Var.d = mediaController.l1;
        gs6Var.e = tL_document.id;
        gs6Var.f = mediaController.v1;
        gs6Var.g = z;
        gs6Var.h = 0.0f;
        gs6Var.i = 1.0f;
        return gs6Var;
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
