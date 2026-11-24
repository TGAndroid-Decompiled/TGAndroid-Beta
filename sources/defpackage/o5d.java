package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Map;
public final class o5d implements d58 {
    public final BasePendingResult a;
    public final rhb b;

    public o5d(rhb rhbVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(rhbVar);
        this.b = rhbVar;
    }

    @Override
    public final void a(Status status) {
        ((Map) this.b.b).remove(this.a);
    }
}
