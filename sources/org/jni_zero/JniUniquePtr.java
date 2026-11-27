package org.jni_zero;

import org.jni_zero.JniTypeToken;
public interface JniUniquePtr<T extends JniTypeToken> extends JniPtr<T> {
    void destroy();
}
