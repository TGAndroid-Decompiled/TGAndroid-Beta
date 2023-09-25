package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda252 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda252 INSTANCE = new MessagesController$$ExternalSyntheticLambda252();

    private MessagesController$$ExternalSyntheticLambda252() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
