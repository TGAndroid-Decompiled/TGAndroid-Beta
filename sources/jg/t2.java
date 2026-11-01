package jg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.y20;
import org.telegram.tgnet.TLRPC;
public final class t2 {
    public String f10270a;
    public String f10271b;
    public String f10272c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f10273f;
    public TLRPC.InputFile f10274g;
    public boolean h;
    public long f10275i;
    public TLRPC.StickerSet f10276j;
    public TLRPC.Document f10277k;
    public String f10278l;
    public k20 f10279m;
    public r20 f10280n;
    public boolean f10281o;
    public ArrayList f10282p;
    public ArrayList f10283q;
    public kj f10284r;
    public y20 f10285s;
    public float f10286t;
    public float f10287u;

    public final void a() {
        ArrayList arrayList = this.f10283q;
        ArrayList arrayList2 = this.f10282p;
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
        if (this.f10279m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f10285s == null) {
            return f7 * this.f10287u;
        }
        return c3.i0.C(this.f10287u, 0.5f, this.f10286t * 0.5f, f7);
    }
}
