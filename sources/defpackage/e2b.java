package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
public final class e2b extends BasePendingResult {
    public final byte o;

    public e2b(o6d o6dVar, byte b) {
        super(o6dVar);
        this.o = b;
    }

    @Override
    public final ie9 d(Status status) {
        switch (this.o) {
            case 0:
                return status;
            default:
                return new ohd(status, (byte) 0);
        }
    }
}
