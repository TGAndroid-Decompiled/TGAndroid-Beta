package org.telegram.messenger;

import org.telegram.p009ui.ActionBar.Theme;

public final class MessagesController$$ExternalSyntheticLambda230 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda230 INSTANCE = new MessagesController$$ExternalSyntheticLambda230();

    private MessagesController$$ExternalSyntheticLambda230() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
