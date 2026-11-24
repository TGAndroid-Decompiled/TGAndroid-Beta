package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class hl implements Runnable {
    public final byte a;
    public final Intent b;

    public hl(Intent intent, byte b) {
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
                    int i = z8c.t0;
                    a.v();
                    if (!gm.n2(false) && !gda.B) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(parseLong));
                            if (W1 == null && (W1 = cf7.Y(i).h0(parseLong)) != null) {
                                oc7.r1(i).c4(W1, true, false);
                            }
                            if (W1 != null) {
                                bw2.r(i);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new iv2(stringExtra2, (byte) 0));
                                }
                                a6a.B(i).q0(y5a.b(stringExtra, W1.id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
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
