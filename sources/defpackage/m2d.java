package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
public final class m2d extends BasePendingResult {
    public final Status o;

    public m2d(Status status) {
        super(null);
        this.o = status;
    }

    @Override
    public final ua9 d(Status status) {
        return this.o;
    }
}
