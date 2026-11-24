package defpackage;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
public final class pc1 {
    public static final pc1 b;
    public final HashSet a;

    static {
        new pc1(Collections.EMPTY_LIST);
        new pc1(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new pc1(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
        new pc1(Arrays.asList(ForegroundCarColorSpan.class));
        b = new pc1(Arrays.asList(DistanceSpan.class, DurationSpan.class));
        new pc1(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
        new pc1(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new pc1(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    public pc1(List list) {
        this.a = new HashSet(list);
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.a.contains(cls)) {
                w26.j("CarSpan type is not allowed: ".concat(cls.getSimpleName()));
                return;
            }
        }
    }
}
