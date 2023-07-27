package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda243 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda243 INSTANCE = new MessagesController$$ExternalSyntheticLambda243();

    private MessagesController$$ExternalSyntheticLambda243() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
