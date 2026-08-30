package dg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class o3 {
    public String f4697a;
    public String f4698b;
    public String f4699c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f4700f;
    public TLRPC.InputFile f4701g;
    public boolean h;
    public long f4702i;
    public TLRPC.StickerSet f4703j;
    public TLRPC.Document f4704k;
    public String f4705l;
    public Utilities.Callback2 f4706m;
    public Utilities.Callback f4707n;
    public boolean f4708o;
    public ArrayList f4709p;
    public ArrayList f4710q;
    public MessageObject f4711r;
    public VideoEditedInfo f4712s;
    public float f4713t;
    public float f4714u;

    public final void a() {
        ArrayList arrayList = this.f4710q;
        ArrayList arrayList2 = this.f4709p;
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
        if (this.f4706m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f4712s == null) {
            return f10 * this.f4714u;
        }
        return e2.c.y(this.f4714u, 0.5f, this.f4713t * 0.5f, f10);
    }
}
