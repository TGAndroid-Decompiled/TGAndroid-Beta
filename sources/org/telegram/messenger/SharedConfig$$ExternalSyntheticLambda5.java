package org.telegram.messenger;
public final class SharedConfig$$ExternalSyntheticLambda5 implements Runnable {
    public static final SharedConfig$$ExternalSyntheticLambda5 INSTANCE = new SharedConfig$$ExternalSyntheticLambda5();

    private SharedConfig$$ExternalSyntheticLambda5() {
    }

    @Override
    public final void run() {
        SharedConfig.saveConfig();
    }
}
