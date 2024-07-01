package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;

public final class MessagesController$$ExternalSyntheticLambda292 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda292 INSTANCE = new MessagesController$$ExternalSyntheticLambda292();

    private MessagesController$$ExternalSyntheticLambda292() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
