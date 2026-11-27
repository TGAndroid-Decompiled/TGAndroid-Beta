package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
public final class sy2 implements FilenameFilter {
    public final byte a;

    public sy2(byte b) {
        this.a = b;
    }

    @Override
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                Object[] objArr = {"trigger-type-anomaly", "trigger-type-oom"};
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    Object obj = objArr[i];
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
