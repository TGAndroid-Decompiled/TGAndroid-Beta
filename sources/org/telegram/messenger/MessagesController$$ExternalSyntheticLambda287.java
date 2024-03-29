package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda287 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda287 INSTANCE = new MessagesController$$ExternalSyntheticLambda287();

    private MessagesController$$ExternalSyntheticLambda287() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
