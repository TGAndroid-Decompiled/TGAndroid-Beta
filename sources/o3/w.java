package o3;

import h5.d0;
import java.util.UUID;
public final class w implements n3.b {
    public static final boolean d;
    public final UUID f16422a;
    public final byte[] f16423b;
    public final boolean f16424c;

    static {
        boolean z4;
        if ("Amazon".equals(d0.f7239c)) {
            String str = d0.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z4 = true;
                d = z4;
            }
        }
        z4 = false;
        d = z4;
    }

    public w(UUID uuid, byte[] bArr, boolean z4) {
        this.f16422a = uuid;
        this.f16423b = bArr;
        this.f16424c = z4;
    }
}
