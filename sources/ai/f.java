package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class f {
    public static final f[] f1480f = new f[4];
    public final int f1481a;
    public TLRPC.TL_shareThemeBackdrops f1482b;
    public boolean f1483c;
    public boolean d;
    public final ArrayList e = new ArrayList();

    public f(int i10) {
        this.f1481a = i10;
        String string = MessagesController.getMainSettings(i10).getString("qrBackdrops", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                    this.f1482b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
                }
                serializedData.cleanup();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
