package a;

import a5.i;
import java.util.Map;
public abstract class a {
    public static i a(i iVar, String[] strArr, Map map) {
        int i10 = 0;
        if (iVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (i) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                i iVar2 = new i();
                int length = strArr.length;
                while (i10 < length) {
                    iVar2.a((i) map.get(strArr[i10]));
                    i10++;
                }
                return iVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            iVar.a((i) map.get(strArr[0]));
            return iVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i10 < length2) {
                iVar.a((i) map.get(strArr[i10]));
                i10++;
            }
        }
        return iVar;
    }
}
