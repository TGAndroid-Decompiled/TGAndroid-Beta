package g7;

import java.util.Map;
public abstract class n8 {
    public static y4.f a(y4.f fVar, String[] strArr, Map map) {
        int i9 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (y4.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                y4.f fVar2 = new y4.f();
                int length = strArr.length;
                while (i9 < length) {
                    fVar2.a((y4.f) map.get(strArr[i9]));
                    i9++;
                }
                return fVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            fVar.a((y4.f) map.get(strArr[0]));
            return fVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i9 < length2) {
                fVar.a((y4.f) map.get(strArr[i9]));
                i9++;
            }
        }
        return fVar;
    }
}
