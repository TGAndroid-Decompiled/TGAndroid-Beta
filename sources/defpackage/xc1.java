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
public final class xc1 {
    public static final xc1 b;
    public final HashSet a;

    static {
        new xc1(Collections.EMPTY_LIST);
        new xc1(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new xc1(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
        new xc1(Arrays.asList(ForegroundCarColorSpan.class));
        b = new xc1(Arrays.asList(DistanceSpan.class, DurationSpan.class));
        new xc1(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
        new xc1(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new xc1(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    public xc1(List list) {
        this.a = new HashSet(list);
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.a.contains(cls)) {
                lq5.j("CarSpan type is not allowed: ".concat(cls.getSimpleName()));
                return;
            }
        }
    }
}
