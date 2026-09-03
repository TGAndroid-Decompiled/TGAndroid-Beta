package o3;

import java.util.UUID;
public final class x implements n3.b {
    public static final boolean d;
    public final UUID f16264a;
    public final byte[] f16265b;
    public final boolean f16266c;

    static {
        boolean z4;
        if ("Amazon".equals(h5.d0.f6926c)) {
            String str = h5.d0.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z4 = true;
                d = z4;
            }
        }
        z4 = false;
        d = z4;
    }

    public x(UUID uuid, byte[] bArr, boolean z4) {
        this.f16264a = uuid;
        this.f16265b = bArr;
        this.f16266c = z4;
    }
}
