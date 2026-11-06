package aa;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
public final class h implements FilenameFilter {
    public final int f812a;

    @Override
    public final boolean accept(File file, String str) {
        switch (this.f812a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                Object[] objArr = {"trigger-type-anomaly", "trigger-type-oom"};
                ArrayList arrayList = new ArrayList(2);
                for (int i7 = 0; i7 < 2; i7++) {
                    Object obj = objArr[i7];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                return DesugarCollections.unmodifiableList(arrayList).contains(str);
            case 3:
                return str.startsWith("event");
            default:
                if (!str.startsWith("event") || str.endsWith("_")) {
                    return false;
                }
                return true;
        }
    }
}
