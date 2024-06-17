package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;

public final class MessagesController$$ExternalSyntheticLambda289 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda289 INSTANCE = new MessagesController$$ExternalSyntheticLambda289();

    private MessagesController$$ExternalSyntheticLambda289() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
