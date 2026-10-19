package org.telegram.messenger;

import java.util.ArrayList;
public final class ci implements Runnable {
    public final int f18106a;
    public final SecretChatHelper f18107b;
    public final ArrayList f18108c;

    public ci(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18106a = i10;
        this.f18107b = secretChatHelper;
        this.f18108c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18106a) {
            case 0:
                SecretChatHelper.z(this.f18107b, this.f18108c);
                return;
            default:
                SecretChatHelper.v(this.f18107b, this.f18108c);
                return;
        }
    }
}
