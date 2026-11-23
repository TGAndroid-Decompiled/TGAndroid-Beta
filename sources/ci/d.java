package ci;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.np;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class d {
    public static final d[] f5608f = new d[4];
    public final int f5609a;
    public TLRPC.TL_shareThemeBackdrops f5610b;
    public boolean f5611c;
    public boolean d;
    public final ArrayList f5612e = new ArrayList();

    public d(int i7) {
        this.f5609a = i7;
        String string = np.u1(i7).h7.getString("qrBackdrops", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                    this.f5610b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
                }
                serializedData.cleanup();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
