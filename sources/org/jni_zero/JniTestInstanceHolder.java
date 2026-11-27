package org.jni_zero;

import java.util.ArrayList;
public class JniTestInstanceHolder {
    static ArrayList<JniTestInstanceHolder> sAllOverrides;
    public Object value;

    private JniTestInstanceHolder() {
    }

    public static synchronized JniTestInstanceHolder create() {
        JniTestInstanceHolder jniTestInstanceHolder;
        synchronized (JniTestInstanceHolder.class) {
            if (sAllOverrides == null) {
                sAllOverrides = new ArrayList<>();
            }
            jniTestInstanceHolder = new JniTestInstanceHolder();
            sAllOverrides.add(jniTestInstanceHolder);
        }
        return jniTestInstanceHolder;
    }
}
