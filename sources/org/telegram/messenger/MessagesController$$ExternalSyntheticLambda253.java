package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda253 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda253 INSTANCE = new MessagesController$$ExternalSyntheticLambda253();

    private MessagesController$$ExternalSyntheticLambda253() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
