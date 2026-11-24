package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class lo8 implements Runnable {
    public final byte a;
    public final TLRPC.User b;

    public lo8(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.e7;
                gm.g("@" + m9c.p(user));
                return;
            case 1:
                ok8.g1(new ArrayList(Arrays.asList(user)));
                return;
            case 2:
                ok8.g1(new ArrayList(Arrays.asList(user)));
                return;
            default:
                ok8.g1(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
