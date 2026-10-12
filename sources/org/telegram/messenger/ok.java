package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ok implements Utilities.Callback {
    @Override
    public final void run(Object obj) {
        SendMessagesHelper.lambda$sendCallback$42((String) obj);
    }
}
