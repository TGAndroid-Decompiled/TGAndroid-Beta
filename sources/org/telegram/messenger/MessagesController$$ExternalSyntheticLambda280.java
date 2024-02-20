package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda280 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda280 INSTANCE = new MessagesController$$ExternalSyntheticLambda280();

    private MessagesController$$ExternalSyntheticLambda280() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
