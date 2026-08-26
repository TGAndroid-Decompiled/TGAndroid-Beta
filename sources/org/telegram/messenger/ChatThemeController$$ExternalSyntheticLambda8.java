package org.telegram.messenger;

import java.util.concurrent.Executor;

public final class ChatThemeController$$ExternalSyntheticLambda8 implements Executor {
    public final DispatchQueue f$0;

    public ChatThemeController$$ExternalSyntheticLambda8(DispatchQueue dispatchQueue) {
        this.f$0 = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f$0.postRunnable(runnable);
    }
}
