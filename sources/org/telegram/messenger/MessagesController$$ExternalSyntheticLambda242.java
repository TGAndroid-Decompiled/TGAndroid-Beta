package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda242 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda242 INSTANCE = new MessagesController$$ExternalSyntheticLambda242();

    private MessagesController$$ExternalSyntheticLambda242() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
