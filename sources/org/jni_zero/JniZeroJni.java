package org.jni_zero;

import org.jni_zero.JniZero;
class JniZeroJni implements JniZero.Natives {
    private static JniTestInstanceHolder sOverride;

    public static JniZero.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (JniZero.Natives) obj;
        }
        return new JniZeroJni();
    }

    public static void setInstanceForTesting(JniZero.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void setJniClassLoader(ClassLoader classLoader) {
        GEN_JNI.org_jni_1zero_JniZero_setJniClassLoader(classLoader);
    }
}
