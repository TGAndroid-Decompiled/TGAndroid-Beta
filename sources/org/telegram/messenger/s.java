package org.telegram.messenger;

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class s implements Runnable {
    public final int f26742a;
    public final Intent f26743b;

    public s(Intent intent, int i7) {
        this.f26742a = i7;
        this.f26743b = intent;
    }

    @Override
    public final void run() {
        switch (this.f26742a) {
            case 0:
                Intent intent = this.f26743b;
                try {
                    int i7 = j10.f24798t0;
                    t0.w();
                    if (!g0.p2(false) && !bz.C) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(parseLong));
                            if (c22 == null && (c22 = tr.a0(i7).k0(parseLong)) != null) {
                                mp.u1(i7).e4(c22, true, false);
                            }
                            if (c22 != null) {
                                i5.r(i7);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new n4(stringExtra2, 0));
                                }
                                zy.C(i7).r0(xy.b(stringExtra, c22.f28580id, null, null, null, true, null, null, null, true, 0, 0, null, false));
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
                t0.f26941b.sendBroadcast(this.f26743b);
                return;
            case 2:
                t0.f26941b.sendBroadcast(this.f26743b);
                return;
            case 3:
                t0.f26941b.sendBroadcast(this.f26743b);
                return;
            case 4:
                try {
                    t0.f26941b.sendBroadcast(this.f26743b);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                t0.f26941b.sendBroadcast(this.f26743b);
                return;
        }
    }
}
