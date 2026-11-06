package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.qp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class f {
    public static final f[] f1171f = new f[4];
    public final int f1172a;
    public TLRPC.TL_shareThemeBackdrops f1173b;
    public boolean f1174c;
    public boolean d;
    public final ArrayList f1175e = new ArrayList();

    public f(int i7) {
        this.f1172a = i7;
        String string = qp.s1(i7).f24767e7.getString("qrBackdrops", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                    this.f1173b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
                }
                serializedData.cleanup();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
