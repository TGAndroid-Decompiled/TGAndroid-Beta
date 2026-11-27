package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Map;
public final class d8d implements r68 {
    public final BasePendingResult a;
    public final zhc b;

    public d8d(zhc zhcVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(zhcVar);
        this.b = zhcVar;
    }

    @Override
    public final void a(Status status) {
        ((Map) this.b.b).remove(this.a);
    }
}
