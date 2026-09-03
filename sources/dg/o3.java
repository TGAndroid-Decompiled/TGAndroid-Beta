package dg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class o3 {
    public String f4703a;
    public String f4704b;
    public String f4705c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f4706f;
    public TLRPC.InputFile f4707g;
    public boolean h;
    public long f4708i;
    public TLRPC.StickerSet f4709j;
    public TLRPC.Document f4710k;
    public String f4711l;
    public Utilities.Callback2 f4712m;
    public Utilities.Callback f4713n;
    public boolean f4714o;
    public ArrayList f4715p;
    public ArrayList f4716q;
    public MessageObject f4717r;
    public VideoEditedInfo f4718s;
    public float f4719t;
    public float f4720u;

    public final void a() {
        ArrayList arrayList = this.f4716q;
        ArrayList arrayList2 = this.f4715p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            try {
                ((File) obj2).delete();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f10;
        if (this.f4712m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f4718s == null) {
            return f10 * this.f4720u;
        }
        return e2.c.y(this.f4720u, 0.5f, this.f4719t * 0.5f, f10);
    }
}
