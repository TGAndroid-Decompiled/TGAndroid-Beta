package org.jni_zero;

import org.jni_zero.CommonApis;
public class CommonApisJni implements CommonApis.Natives {
    private static JniTestInstanceHolder sOverride;

    public static CommonApis.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (CommonApis.Natives) obj;
        }
        return new CommonApisJni();
    }

    public static void setInstanceForTesting(CommonApis.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void deleteDeleterBasePtr(long j, long j2) {
        GEN_JNI.org_jni_1zero_CommonApis_deleteDeleterBasePtr(j, j2);
    }

    @Override
    public void releaseRawPtr(long j) {
        GEN_JNI.org_jni_1zero_CommonApis_releaseRawPtr(j);
    }
}
