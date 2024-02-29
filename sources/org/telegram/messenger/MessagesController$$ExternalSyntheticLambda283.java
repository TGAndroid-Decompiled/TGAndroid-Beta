package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda283 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda283 INSTANCE = new MessagesController$$ExternalSyntheticLambda283();

    private MessagesController$$ExternalSyntheticLambda283() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
