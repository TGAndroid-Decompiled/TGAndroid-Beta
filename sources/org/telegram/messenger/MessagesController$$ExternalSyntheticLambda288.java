package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda288 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda288 INSTANCE = new MessagesController$$ExternalSyntheticLambda288();

    private MessagesController$$ExternalSyntheticLambda288() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
