package org.telegram.messenger;

import org.telegram.p009ui.ActionBar.Theme;

public final class MessagesController$$ExternalSyntheticLambda229 implements Runnable {
    public static final MessagesController$$ExternalSyntheticLambda229 INSTANCE = new MessagesController$$ExternalSyntheticLambda229();

    private MessagesController$$ExternalSyntheticLambda229() {
    }

    @Override
    public final void run() {
        Theme.checkAutoNightThemeConditions();
    }
}
