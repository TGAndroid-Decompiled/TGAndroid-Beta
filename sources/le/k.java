package le;

import java.util.ArrayList;
public abstract class k {
    public static final je.d[] f18197a = new je.d[0];

    public static final void a(int i3, int i10, je.d descriptor) {
        String str;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i3) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(descriptor.g(i12));
            }
            i11 >>>= 1;
        }
        String serialName = descriptor.a();
        kotlin.jvm.internal.j.e(serialName, "serialName");
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        throw new he.b(arrayList, str, null);
    }
}
