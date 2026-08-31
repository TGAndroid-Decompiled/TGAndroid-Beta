package j7;

import java.util.Map;
public abstract class l0 {
    public static c5.i a(c5.i iVar, String[] strArr, Map map) {
        int i10 = 0;
        if (iVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (c5.i) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                c5.i iVar2 = new c5.i();
                int length = strArr.length;
                while (i10 < length) {
                    iVar2.a((c5.i) map.get(strArr[i10]));
                    i10++;
                }
                return iVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            iVar.a((c5.i) map.get(strArr[0]));
            return iVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i10 < length2) {
                iVar.a((c5.i) map.get(strArr[i10]));
                i10++;
            }
        }
        return iVar;
    }
}
