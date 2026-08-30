package o3;

import h5.d0;
import java.util.UUID;
public final class w implements n3.b {
    public static final boolean d;
    public final UUID f16279a;
    public final byte[] f16280b;
    public final boolean f16281c;

    static {
        boolean z4;
        if ("Amazon".equals(d0.f6939c)) {
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
        this.f16279a = uuid;
        this.f16280b = bArr;
        this.f16281c = z4;
    }
}
