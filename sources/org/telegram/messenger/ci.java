package org.telegram.messenger;

import java.util.ArrayList;
public final class ci implements Runnable {
    public final int f18103a;
    public final SecretChatHelper f18104b;
    public final ArrayList f18105c;

    public ci(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18103a = i10;
        this.f18104b = secretChatHelper;
        this.f18105c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18103a) {
            case 0:
                SecretChatHelper.z(this.f18104b, this.f18105c);
                return;
            default:
                SecretChatHelper.v(this.f18104b, this.f18105c);
                return;
        }
    }
}
