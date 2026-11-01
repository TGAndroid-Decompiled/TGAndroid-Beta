package org.telegram.messenger;

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f18186a;
    public final Intent f18187b;

    public t(Intent intent, int i10) {
        this.f18186a = i10;
        this.f18187b = intent;
    }

    @Override
    public final void run() {
        switch (this.f18186a) {
            case 0:
                Intent intent = this.f18187b;
                try {
                    int i10 = e20.f15506s0;
                    w0.w();
                    if (!i0.p2(false) && !uz.C) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(parseLong));
                            if (Z1 == null && (Z1 = is.a0(i10).k0(parseLong)) != null) {
                                wp.r1(i10).U3(Z1, true, false);
                            }
                            if (Z1 != null) {
                                i5.r(i10);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new o4(stringExtra2, 0));
                                }
                                rz.C(i10).r0(pz.b(stringExtra, Z1.f19943id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                w0.f18945b.sendBroadcast(this.f18187b);
                return;
            case 2:
                w0.f18945b.sendBroadcast(this.f18187b);
                return;
            case 3:
                w0.f18945b.sendBroadcast(this.f18187b);
                return;
            case 4:
                try {
                    w0.f18945b.sendBroadcast(this.f18187b);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                w0.f18945b.sendBroadcast(this.f18187b);
                return;
        }
    }
}
