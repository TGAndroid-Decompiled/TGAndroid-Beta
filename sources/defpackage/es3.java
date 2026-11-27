package defpackage;

import androidx.car.app.model.DurationSpan;
import j$.time.Duration;
import j$.util.Objects;
public abstract class es3 {
    public static DurationSpan a(Duration duration) {
        Objects.requireNonNull(duration);
        return new DurationSpan(duration.getSeconds());
    }
}
