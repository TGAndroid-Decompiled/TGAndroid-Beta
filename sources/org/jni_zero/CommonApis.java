package org.jni_zero;

import java.util.HashMap;
import java.util.Map;
@JNINamespace("jni_zero")
public class CommonApis {

    public interface Natives {
        void deleteDeleterBasePtr(long j, long j2);

        void releaseRawPtr(long j);
    }

    private static Map<Object, Object> arrayToMap(Object[] objArr) {
        int length = objArr.length;
        HashMap hashMap = new HashMap(length / 2);
        for (int i = 0; i < length; i += 2) {
            hashMap.put(objArr[i], objArr[i + 1]);
        }
        return hashMap;
    }

    private static Object[] mapToArray(Map<Object, Object> map) {
        Object[] objArr = new Object[map.size() << 1];
        int i = 0;
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            int i2 = i + 1;
            objArr[i] = entry.getKey();
            i += 2;
            objArr[i2] = entry.getValue();
        }
        return objArr;
    }
}
