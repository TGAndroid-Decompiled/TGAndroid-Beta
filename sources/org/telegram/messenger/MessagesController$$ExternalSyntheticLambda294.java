package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda294 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda294 INSTANCE = new MessagesController$$ExternalSyntheticLambda294();

    private MessagesController$$ExternalSyntheticLambda294() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
