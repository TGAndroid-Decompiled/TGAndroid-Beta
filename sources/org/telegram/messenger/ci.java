package org.telegram.messenger;

import java.util.ArrayList;
public final class ci implements Runnable {
    public final int f18107a;
    public final SecretChatHelper f18108b;
    public final ArrayList f18109c;

    public ci(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18107a = i10;
        this.f18108b = secretChatHelper;
        this.f18109c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18107a) {
            case 0:
                SecretChatHelper.z(this.f18108b, this.f18109c);
                return;
            default:
                SecretChatHelper.v(this.f18108b, this.f18109c);
                return;
        }
    }
}
