package defpackage;

import java.util.Map;
public abstract class s0f {
    public static r6c a(r6c r6cVar, String[] strArr, Map map) {
        int i = 0;
        if (r6cVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (r6c) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                r6c r6cVar2 = new r6c();
                int length = strArr.length;
                while (i < length) {
                    r6cVar2.a((r6c) map.get(strArr[i]));
                    i++;
                }
                return r6cVar2;
            }
        } else if (strArr != null) {
            if (strArr.length == 1) {
                r6cVar.a((r6c) map.get(strArr[0]));
                return r6cVar;
            } else if (strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    r6cVar.a((r6c) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return r6cVar;
    }
}
