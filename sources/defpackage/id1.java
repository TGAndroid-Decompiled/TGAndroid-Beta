package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONObject;
public abstract class id1 {
    public static final Pattern a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
    public static final Random b = new Random(SystemClock.elapsedRealtime());

    public static String a(String str, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() <= 128) {
                if (str.startsWith("urn:x-cast:")) {
                    if (str.length() != 11) {
                        return;
                    }
                    w26.j("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
                    return;
                }
                w26.j("Namespace must begin with the prefix \"urn:x-cast:\"");
                return;
            }
            w26.j("Invalid namespace length");
            return;
        }
        w26.j("Namespace cannot be null or empty");
    }

    public static ArrayList c(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            i = tb4.g(iArr[i], i, 1, arrayList);
        }
        return arrayList;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj2 != null && obj.equals(obj2)) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] e(AbstractCollection abstractCollection) {
        int[] iArr = new int[abstractCollection.size()];
        Iterator it = abstractCollection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }
}
