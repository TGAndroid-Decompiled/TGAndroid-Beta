package org.telegram.messenger;

import org.telegram.p009ui.ActionBar.Theme;

public final class MessagesController$$ExternalSyntheticLambda213 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda213 INSTANCE = new MessagesController$$ExternalSyntheticLambda213();

    private MessagesController$$ExternalSyntheticLambda213() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
