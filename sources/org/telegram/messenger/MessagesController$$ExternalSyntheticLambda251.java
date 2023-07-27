package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda251 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda251 INSTANCE = new MessagesController$$ExternalSyntheticLambda251();

    private MessagesController$$ExternalSyntheticLambda251() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
