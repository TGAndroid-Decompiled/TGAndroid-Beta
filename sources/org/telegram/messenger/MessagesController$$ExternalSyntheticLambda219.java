package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;

public final class MessagesController$$ExternalSyntheticLambda219 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda219 INSTANCE = new MessagesController$$ExternalSyntheticLambda219();

    private MessagesController$$ExternalSyntheticLambda219() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
