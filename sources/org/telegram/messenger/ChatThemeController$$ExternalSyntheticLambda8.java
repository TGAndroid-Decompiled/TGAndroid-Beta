package org.telegram.messenger;

import java.util.concurrent.Executor;

public final class ChatThemeController$$ExternalSyntheticLambda8 implements Executor {
    public final DispatchQueue f$0;

    @Override
    public final void execute(Runnable runnable) {
        this.f$0.postRunnable(runnable);
    }
}
