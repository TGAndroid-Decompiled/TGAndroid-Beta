package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
public final class cya extends BasePendingResult {
    public final byte o;

    public cya(x1d x1dVar, byte b) {
        super(x1dVar);
        this.o = b;
    }

    @Override
    public final ua9 d(Status status) {
        switch (this.o) {
            case 0:
                return status;
            default:
                return new vcd(status, (byte) 0);
        }
    }
}
