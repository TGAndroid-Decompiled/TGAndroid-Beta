package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
public final class o4d extends BasePendingResult {
    public final Status o;

    public o4d(Status status) {
        super(null);
        this.o = status;
    }

    @Override
    public final uc9 d(Status status) {
        return this.o;
    }
}
