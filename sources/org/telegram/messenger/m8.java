package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class m8 implements Runnable {
    public final int f15763a;
    public final MediaDataController f15764b;
    public final TLObject f15765c;
    public final SharedPreferences d;

    public m8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f15763a = i10;
        this.f15764b = mediaDataController;
        this.f15765c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f15763a) {
            case 0:
                this.f15764b.lambda$loadRestrictedStatusEmojis$245(this.f15765c, this.d);
                return;
            default:
                this.f15764b.lambda$loadReplyIcons$243(this.f15765c, this.d);
                return;
        }
    }
}
