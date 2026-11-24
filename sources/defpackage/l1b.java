package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l1b {
    public String a;
    public String b;
    public String c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f;
    public TLRPC.InputFile g;
    public boolean h;
    public long i;
    public TLRPC.StickerSet j;
    public TLRPC.Document k;
    public String l;
    public f m;
    public qy1 n;
    public boolean o;
    public ArrayList p;
    public ArrayList q;
    public k47 r;
    public rcc s;
    public float t;
    public float u;

    public final void a() {
        ArrayList arrayList = this.q;
        ArrayList arrayList2 = this.p;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            try {
                ((File) obj).delete();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            try {
                ((File) obj2).delete();
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f;
        if (this.m == null) {
            f = 0.9f;
        } else {
            f = 1.0f;
        }
        if (this.s == null) {
            return f * this.u;
        }
        return mlb.A(this.u, 0.5f, this.t * 0.5f, f);
    }
}
