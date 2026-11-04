package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class d {
    public static final d[] f3689f = new d[4];
    public final int f3690a;
    public TLRPC.TL_shareThemeBackdrops f3691b;
    public boolean f3692c;
    public boolean d;
    public final ArrayList f3693e = new ArrayList();

    public d(int i3) {
        this.f3690a = i3;
        String string = hp.s1(i3).f22999e7.getString("qrBackdrops", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                    this.f3691b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
                }
                serializedData.cleanup();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
