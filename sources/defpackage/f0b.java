package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
public final class f0b extends BasePendingResult {
    public final byte o;

    public f0b(z3d z3dVar, byte b) {
        super(z3dVar);
        this.o = b;
    }

    @Override
    public final uc9 d(Status status) {
        switch (this.o) {
            case 0:
                return status;
            default:
                return new xed(status, (byte) 0);
        }
    }
}
