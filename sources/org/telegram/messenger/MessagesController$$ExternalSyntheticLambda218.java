package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;

public final class MessagesController$$ExternalSyntheticLambda218 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda218 INSTANCE = new MessagesController$$ExternalSyntheticLambda218();

    private MessagesController$$ExternalSyntheticLambda218() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
