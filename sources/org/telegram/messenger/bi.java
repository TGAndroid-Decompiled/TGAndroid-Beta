package org.telegram.messenger;

import java.util.ArrayList;
public final class bi implements Runnable {
    public final int f17974a;
    public final SecretChatHelper f17975b;
    public final ArrayList f17976c;

    public bi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17974a = i10;
        this.f17975b = secretChatHelper;
        this.f17976c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17974a) {
            case 0:
                SecretChatHelper.z(this.f17975b, this.f17976c);
                return;
            default:
                SecretChatHelper.v(this.f17975b, this.f17976c);
                return;
        }
    }
}
