package org.telegram.messenger;

import java.util.concurrent.Executor;

public final class a implements Executor {
    @Override
    public final void execute(Runnable runnable) {
        AndroidUtilities.runOnUIThread(runnable);
    }
}
