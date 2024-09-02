package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;

public final class MessagesController$$ExternalSyntheticLambda300 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda300 INSTANCE = new MessagesController$$ExternalSyntheticLambda300();

    private MessagesController$$ExternalSyntheticLambda300() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
