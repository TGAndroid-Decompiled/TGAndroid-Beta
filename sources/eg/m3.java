package eg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class m3 {
    public String f5356a;
    public String f5357b;
    public String f5358c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f5359e;
    public TLRPC.TL_messageMediaDocument f5360f;
    public TLRPC.InputFile f5361g;
    public boolean h;
    public long f5362i;
    public TLRPC.StickerSet f5363j;
    public TLRPC.Document f5364k;
    public String f5365l;
    public Utilities.Callback2 f5366m;
    public Utilities.Callback f5367n;
    public boolean f5368o;
    public ArrayList f5369p;
    public ArrayList f5370q;
    public MessageObject f5371r;
    public VideoEditedInfo f5372s;
    public float f5373t;
    public float f5374u;

    public final void a() {
        ArrayList arrayList = this.f5370q;
        ArrayList arrayList2 = this.f5369p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            try {
                ((File) obj2).delete();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f10;
        if (this.f5366m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f5372s == null) {
            return f10 * this.f5374u;
        }
        return e2.c.y(this.f5374u, 0.5f, this.f5373t * 0.5f, f10);
    }
}
