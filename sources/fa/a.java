package fa;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
public final class a implements FilenameFilter {
    public final int f11527a;

    @Override
    public final boolean accept(File file, String str) {
        switch (this.f11527a) {
            case 0:
                return str.startsWith("event");
            case 1:
                if (str.startsWith("event") && !str.endsWith("_")) {
                    return true;
                }
                return false;
            case 2:
                return str.startsWith("aqs.");
            case 3:
                return str.startsWith(".ae");
            default:
                Object[] objArr = {"trigger-type-anomaly", "trigger-type-oom"};
                ArrayList arrayList = new ArrayList(2);
                for (int i3 = 0; i3 < 2; i3++) {
                    Object obj = objArr[i3];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                return DesugarCollections.unmodifiableList(arrayList).contains(str);
        }
    }
}
