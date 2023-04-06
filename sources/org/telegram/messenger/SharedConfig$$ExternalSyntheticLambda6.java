package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.SharedConfig;
public final class SharedConfig$$ExternalSyntheticLambda6 implements Comparator {
    public static final SharedConfig$$ExternalSyntheticLambda6 INSTANCE = new SharedConfig$$ExternalSyntheticLambda6();

    private SharedConfig$$ExternalSyntheticLambda6() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$saveProxyList$4;
        lambda$saveProxyList$4 = SharedConfig.lambda$saveProxyList$4((SharedConfig.ProxyInfo) obj, (SharedConfig.ProxyInfo) obj2);
        return lambda$saveProxyList$4;
    }
}
