package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda264 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda264 INSTANCE = new MessagesController$$ExternalSyntheticLambda264();

    private MessagesController$$ExternalSyntheticLambda264() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
