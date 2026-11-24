package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class mm8 implements Runnable {
    public final byte a;
    public final TLRPC.User b;

    public mm8(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                gl.g("@" + l7c.o(user));
                return;
            case 1:
                mi8.g1(new ArrayList(Arrays.asList(user)));
                return;
            case 2:
                mi8.g1(new ArrayList(Arrays.asList(user)));
                return;
            default:
                mi8.g1(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
