package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda279 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda279 INSTANCE = new MessagesController$$ExternalSyntheticLambda279();

    private MessagesController$$ExternalSyntheticLambda279() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
