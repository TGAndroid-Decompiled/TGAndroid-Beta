package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class gx8 {
    public static final gx8[] f = new gx8[4];
    public final int a;
    public TLRPC.TL_shareThemeBackdrops b;
    public boolean c;
    public boolean d;
    public final ArrayList e = new ArrayList();

    public gx8(int i) {
        this.a = i;
        String string = oc7.r1(i).X3.getString("qrBackdrops", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                    this.b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
                }
                serializedData.cleanup();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
