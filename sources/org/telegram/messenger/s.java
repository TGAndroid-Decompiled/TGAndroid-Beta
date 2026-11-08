package org.telegram.messenger;

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f25397a;
    public final Intent f25398b;

    public s(Intent intent, int i7) {
        this.f25397a = i7;
        this.f25398b = intent;
    }

    @Override
    public final void run() {
        switch (this.f25397a) {
            case 0:
                Intent intent = this.f25398b;
                try {
                    int i7 = p10.f24470s0;
                    t0.w();
                    if (!g0.p2(false) && !iz.C) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(parseLong));
                            if (a22 == null && (a22 = yr.a0(i7).k0(parseLong)) != null) {
                                qp.s1(i7).X3(a22, true, false);
                            }
                            if (a22 != null) {
                                g5.r(i7);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new l4(stringExtra2, 0));
                                }
                                gz.C(i7).r0(ez.b(stringExtra, a22.f27105id, null, null, null, true, null, null, null, true, 0, 0, null, false));
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
                t0.f25566b.sendBroadcast(this.f25398b);
                return;
            case 2:
                t0.f25566b.sendBroadcast(this.f25398b);
                return;
            case 3:
                t0.f25566b.sendBroadcast(this.f25398b);
                return;
            case 4:
                try {
                    t0.f25566b.sendBroadcast(this.f25398b);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                t0.f25566b.sendBroadcast(this.f25398b);
                return;
        }
    }
}
