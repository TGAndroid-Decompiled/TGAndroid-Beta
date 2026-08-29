package bg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class s3 {
    public String f2510a;
    public String f2511b;
    public String f2512c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f2513e;
    public TLRPC.TL_messageMediaDocument f2514f;
    public TLRPC.InputFile f2515g;
    public boolean h;
    public long f2516i;
    public TLRPC.StickerSet f2517j;
    public TLRPC.Document f2518k;
    public String f2519l;
    public Utilities.Callback2 f2520m;
    public Utilities.Callback f2521n;
    public boolean f2522o;
    public ArrayList f2523p;
    public ArrayList f2524q;
    public MessageObject f2525r;
    public VideoEditedInfo f2526s;
    public float f2527t;
    public float f2528u;

    public final void a() {
        ArrayList arrayList = this.f2524q;
        ArrayList arrayList2 = this.f2523p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            try {
                ((File) obj2).delete();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f9;
        if (this.f2520m == null) {
            f9 = 0.9f;
        } else {
            f9 = 1.0f;
        }
        if (this.f2526s == null) {
            return f9 * this.f2528u;
        }
        return com.google.android.recaptcha.internal.a.B(this.f2528u, 0.5f, this.f2527t * 0.5f, f9);
    }
}
