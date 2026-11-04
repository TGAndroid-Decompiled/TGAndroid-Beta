package org.telegram.messenger;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public class WearReplyReceiver extends BroadcastReceiver {
    public static final int f21405a = 0;

    public static void a(c cVar, CharSequence charSequence, long j10, long j11, int i3, int[] iArr) {
        zi ziVar;
        int i10 = cVar.f21919a;
        zi ziVar2 = null;
        if (i3 != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f27022id = i3;
            tL_message.peer_id = hp.s1(i10).z1(j10);
            ziVar = new zi(i10, tL_message, false, false);
        } else {
            ziVar = null;
        }
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.f27022id = (int) j11;
            tL_message2.peer_id = hp.s1(i10).z1(j10);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            ziVar2 = new zi(i10, tL_message2, false, false);
        }
        yy.C(i10).r0(wy.b(charSequence.toString(), j10, ziVar, ziVar2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList arrayList = new ArrayList(iArr.length);
            int length = iArr.length;
            int i12 = 0;
            while (i12 < length) {
                i12 = com.google.android.recaptcha.internal.a.f(iArr[i12], i12, 1, arrayList);
            }
            qr a02 = qr.a0(i10);
            if (!arrayList.isEmpty()) {
                a02.f24934a.c(new dr(a02, arrayList, j10, 0));
            }
        }
        if (i11 == 0) {
            hp.s1(i10).j3(j10, i3, i3, 0, false, j11, 0, true, 0);
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        t0.w();
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            final CharSequence charSequence = resultsFromIntent.getCharSequence("extra_voice_reply");
            if (!TextUtils.isEmpty(charSequence)) {
                final long longExtra = intent.getLongExtra("dialog_id", 0L);
                final int intExtra = intent.getIntExtra("max_id", 0);
                final long longExtra2 = intent.getLongExtra("topic_id", 0L);
                int intExtra2 = intent.getIntExtra("currentAccount", 0);
                final int[] intArrayExtra = intent.getIntArrayExtra("voice_msg_ids");
                if (longExtra != 0 && intExtra != 0 && h10.r(intExtra2)) {
                    final c a10 = c.a(intExtra2);
                    if (m5.E(longExtra)) {
                        if (hp.s1(a10.f21919a).a2(Long.valueOf(longExtra)) == null) {
                            Utilities.f21387e.c(new Runnable(this) {
                                public final WearReplyReceiver f22130b;

                                {
                                    this.f22130b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r10) {
                                        case 0:
                                            int i3 = WearReplyReceiver.f21405a;
                                            c cVar = a10;
                                            qr a02 = qr.a0(cVar.f21919a);
                                            long j10 = longExtra;
                                            g0.h3(new vl(this.f22130b, cVar, a02.k0(j10), charSequence, j10, longExtra2, intExtra, intArrayExtra));
                                            return;
                                        default:
                                            int i10 = WearReplyReceiver.f21405a;
                                            c cVar2 = a10;
                                            qr a03 = qr.a0(cVar2.f21919a);
                                            long j11 = longExtra;
                                            g0.h3(new vl(this.f22130b, cVar2, a03.P(-j11), charSequence, j11, longExtra2, intExtra, intArrayExtra));
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    } else if (m5.z(longExtra) && hp.s1(a10.f21919a).M0(Long.valueOf(-longExtra)) == null) {
                        Utilities.f21387e.c(new Runnable(this) {
                            public final WearReplyReceiver f22130b;

                            {
                                this.f22130b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r10) {
                                    case 0:
                                        int i3 = WearReplyReceiver.f21405a;
                                        c cVar = a10;
                                        qr a02 = qr.a0(cVar.f21919a);
                                        long j10 = longExtra;
                                        g0.h3(new vl(this.f22130b, cVar, a02.k0(j10), charSequence, j10, longExtra2, intExtra, intArrayExtra));
                                        return;
                                    default:
                                        int i10 = WearReplyReceiver.f21405a;
                                        c cVar2 = a10;
                                        qr a03 = qr.a0(cVar2.f21919a);
                                        long j11 = longExtra;
                                        g0.h3(new vl(this.f22130b, cVar2, a03.P(-j11), charSequence, j11, longExtra2, intExtra, intArrayExtra));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    a(a10, charSequence, longExtra, longExtra2, intExtra, intArrayExtra);
                }
            }
        }
    }
}
