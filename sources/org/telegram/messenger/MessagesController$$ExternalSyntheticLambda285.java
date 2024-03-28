package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda285 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda285 INSTANCE = new MessagesController$$ExternalSyntheticLambda285();

    private MessagesController$$ExternalSyntheticLambda285() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
