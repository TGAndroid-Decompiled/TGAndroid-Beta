package ci;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.mp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class d {
    public static final d[] f5613f = new d[4];
    public final int f5614a;
    public TLRPC.TL_shareThemeBackdrops f5615b;
    public boolean f5616c;
    public boolean d;
    public final ArrayList f5617e = new ArrayList();

    public d(int i7) {
        this.f5614a = i7;
        String string = mp.u1(i7).h7.getString("qrBackdrops", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                    this.f5615b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
                }
                serializedData.cleanup();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
