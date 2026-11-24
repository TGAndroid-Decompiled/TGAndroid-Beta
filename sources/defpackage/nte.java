package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
public abstract class nte {
    public static wp9 a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new wp9();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                str.getClass();
                hashMap.put(str, bundle2.get(str));
            }
            return new wp9(hashMap);
        }
        ClassLoader classLoader = wp9.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                obj.getClass();
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new wp9(linkedHashMap);
        }
        sc8.j("Invalid bundle passed as restored state");
        return null;
    }
}
