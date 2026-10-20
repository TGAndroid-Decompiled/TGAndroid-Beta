package org.telegram.messenger;

import java.util.ArrayList;
public final class di implements Runnable {
    public final int f18200a;
    public final SecretChatHelper f18201b;
    public final ArrayList f18202c;

    public di(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18200a = i10;
        this.f18201b = secretChatHelper;
        this.f18202c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18200a) {
            case 0:
                SecretChatHelper.z(this.f18201b, this.f18202c);
                return;
            default:
                SecretChatHelper.v(this.f18201b, this.f18202c);
                return;
        }
    }
}
