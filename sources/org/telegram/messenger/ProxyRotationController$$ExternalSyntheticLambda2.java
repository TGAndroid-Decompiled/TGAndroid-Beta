package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.SharedConfig;
public final class ProxyRotationController$$ExternalSyntheticLambda2 implements Comparator {
    public static final ProxyRotationController$$ExternalSyntheticLambda2 INSTANCE = new ProxyRotationController$$ExternalSyntheticLambda2();

    private ProxyRotationController$$ExternalSyntheticLambda2() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$switchToAvailable$3;
        lambda$switchToAvailable$3 = ProxyRotationController.lambda$switchToAvailable$3((SharedConfig.ProxyInfo) obj, (SharedConfig.ProxyInfo) obj2);
        return lambda$switchToAvailable$3;
    }
}
