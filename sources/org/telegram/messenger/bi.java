package org.telegram.messenger;

import java.util.ArrayList;
public final class bi implements Runnable {
    public final int f17977a;
    public final SecretChatHelper f17978b;
    public final ArrayList f17979c;

    public bi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17977a = i10;
        this.f17978b = secretChatHelper;
        this.f17979c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17977a) {
            case 0:
                SecretChatHelper.z(this.f17978b, this.f17979c);
                return;
            default:
                SecretChatHelper.v(this.f17978b, this.f17979c);
                return;
        }
    }
}
