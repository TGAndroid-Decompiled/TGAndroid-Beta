package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda293 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda293 INSTANCE = new MessagesController$$ExternalSyntheticLambda293();

    private MessagesController$$ExternalSyntheticLambda293() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
