package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda262 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda262 INSTANCE = new MessagesController$$ExternalSyntheticLambda262();

    private MessagesController$$ExternalSyntheticLambda262() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
