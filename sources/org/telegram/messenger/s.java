package org.telegram.messenger;

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f25259a;
    public final Intent f25260b;

    public s(Intent intent, int i3) {
        this.f25259a = i3;
        this.f25260b = intent;
    }

    @Override
    public final void run() {
        switch (this.f25259a) {
            case 0:
                Intent intent = this.f25260b;
                try {
                    int i3 = h10.f22829t0;
                    t0.w();
                    if (!g0.p2(false) && !az.C) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(parseLong));
                            if (a22 == null && (a22 = qr.a0(i3).k0(parseLong)) != null) {
                                hp.s1(i3).X3(a22, true, false);
                            }
                            if (a22 != null) {
                                g5.r(i3);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new l4(stringExtra2, 0));
                                }
                                yy.C(i3).r0(wy.b(stringExtra, a22.f27150id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                t0.f25457b.sendBroadcast(this.f25260b);
                return;
            case 2:
                t0.f25457b.sendBroadcast(this.f25260b);
                return;
            case 3:
                t0.f25457b.sendBroadcast(this.f25260b);
                return;
            case 4:
                try {
                    t0.f25457b.sendBroadcast(this.f25260b);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                t0.f25457b.sendBroadcast(this.f25260b);
                return;
        }
    }
}
