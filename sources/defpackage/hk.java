package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class hk implements Runnable {
    public final byte a;
    public final Intent b;

    public hk(Intent intent, byte b) {
        this.a = b;
        this.b = intent;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Intent intent = this.b;
        switch (b) {
            case 0:
                try {
                    int i = y6c.t0;
                    a.v();
                    if (!gl.n2(false) && !gba.B) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(parseLong));
                            if (V1 == null && (V1 = ad7.Y(i).h0(parseLong)) != null) {
                                na7.q1(i).Z3(V1, true, false);
                            }
                            if (V1 != null) {
                                qu2.r(i);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new xt2(stringExtra2, (byte) 0));
                                }
                                z3a.B(i).q0(x3a.b(stringExtra, V1.id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                a.b.sendBroadcast(intent);
                return;
            case 2:
                a.b.sendBroadcast(intent);
                return;
            case 3:
                a.b.sendBroadcast(intent);
                return;
            case 4:
                try {
                    a.b.sendBroadcast(intent);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                a.b.sendBroadcast(intent);
                return;
        }
    }
}
