package org.jni_zero;

import java.util.ArrayList;
public class JniTestInstancesSnapshot {
    static final boolean $assertionsDisabled = false;
    private final Object[] mValues;

    private JniTestInstancesSnapshot(Object[] objArr) {
        this.mValues = objArr;
    }

    public static void clearAllForTesting() {
        restoreSnapshotForTesting(new JniTestInstancesSnapshot(new Object[0]));
    }

    public static void restoreSnapshotForTesting(JniTestInstancesSnapshot jniTestInstancesSnapshot) {
        synchronized (JniTestInstanceHolder.class) {
            Object[] objArr = jniTestInstancesSnapshot.mValues;
            ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
            int length = objArr.length;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < length; i++) {
                arrayList.get(i).value = objArr[i];
            }
            while (length < size) {
                arrayList.get(length).value = null;
                length++;
            }
        }
    }

    public static JniTestInstancesSnapshot snapshotOverridesForTesting() {
        synchronized (JniTestInstanceHolder.class) {
            ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
            if (arrayList == null) {
                return new JniTestInstancesSnapshot(new Object[0]);
            }
            Object[] objArr = new Object[arrayList.size()];
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                objArr[i] = arrayList.get(i).value;
            }
            return new JniTestInstancesSnapshot(objArr);
        }
    }
}
