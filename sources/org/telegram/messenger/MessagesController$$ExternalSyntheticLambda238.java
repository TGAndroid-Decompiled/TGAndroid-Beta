package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda238 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda238 INSTANCE = new MessagesController$$ExternalSyntheticLambda238();

    private MessagesController$$ExternalSyntheticLambda238() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
