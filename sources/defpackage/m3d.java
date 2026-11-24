package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Map;
public final class m3d implements b38 {
    public final BasePendingResult a;
    public final aec b;

    public m3d(aec aecVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(aecVar);
        this.b = aecVar;
    }

    @Override
    public final void a(Status status) {
        ((Map) this.b.b).remove(this.a);
    }
}
