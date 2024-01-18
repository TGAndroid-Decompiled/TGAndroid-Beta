package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda266 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda266 INSTANCE = new MessagesController$$ExternalSyntheticLambda266();

    private MessagesController$$ExternalSyntheticLambda266() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
