package org.telegram.messenger;

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f26723a;
    public final Intent f26724b;

    public s(Intent intent, int i7) {
        this.f26723a = i7;
        this.f26724b = intent;
    }

    @Override
    public final void run() {
        switch (this.f26723a) {
            case 0:
                Intent intent = this.f26724b;
                try {
                    int i7 = k10.f24968t0;
                    t0.w();
                    if (!g0.p2(false) && !cz.C) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(parseLong));
                            if (c22 == null && (c22 = ur.a0(i7).k0(parseLong)) != null) {
                                np.u1(i7).e4(c22, true, false);
                            }
                            if (c22 != null) {
                                i5.r(i7);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new n4(stringExtra2, 0));
                                }
                                az.C(i7).r0(yy.b(stringExtra, c22.f28583id, null, null, null, true, null, null, null, true, 0, 0, null, false));
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
                t0.f26931b.sendBroadcast(this.f26724b);
                return;
            case 2:
                t0.f26931b.sendBroadcast(this.f26724b);
                return;
            case 3:
                t0.f26931b.sendBroadcast(this.f26724b);
                return;
            case 4:
                try {
                    t0.f26931b.sendBroadcast(this.f26724b);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                t0.f26931b.sendBroadcast(this.f26724b);
                return;
        }
    }
}
