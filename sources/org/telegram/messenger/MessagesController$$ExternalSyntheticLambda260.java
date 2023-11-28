package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;
public final class MessagesController$$ExternalSyntheticLambda260 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda260 INSTANCE = new MessagesController$$ExternalSyntheticLambda260();

    private MessagesController$$ExternalSyntheticLambda260() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
