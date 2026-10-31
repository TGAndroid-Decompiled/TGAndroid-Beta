package jg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.x20;
import org.telegram.tgnet.TLRPC;
public final class t2 {
    public String f10269a;
    public String f10270b;
    public String f10271c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f10272f;
    public TLRPC.InputFile f10273g;
    public boolean h;
    public long f10274i;
    public TLRPC.StickerSet f10275j;
    public TLRPC.Document f10276k;
    public String f10277l;
    public j20 f10278m;
    public q20 f10279n;
    public boolean f10280o;
    public ArrayList f10281p;
    public ArrayList f10282q;
    public jj f10283r;
    public x20 f10284s;
    public float f10285t;
    public float f10286u;

    public final void a() {
        ArrayList arrayList = this.f10282q;
        ArrayList arrayList2 = this.f10281p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            try {
                ((File) obj2).delete();
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f7;
        if (this.f10278m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f10284s == null) {
            return f7 * this.f10286u;
        }
        return c3.i0.C(this.f10286u, 0.5f, this.f10285t * 0.5f, f7);
    }
}
