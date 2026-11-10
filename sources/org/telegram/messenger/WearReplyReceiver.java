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
    public static final int f21359a = 0;

    public static void a(c cVar, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        ij ijVar;
        int i10 = cVar.f21770a;
        ij ijVar2 = null;
        if (i7 != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f26981id = i7;
            tL_message.peer_id = qp.s1(i10).z1(j3);
            ijVar = new ij(i10, tL_message, false, false);
        } else {
            ijVar = null;
        }
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.f26981id = (int) j10;
            tL_message2.peer_id = qp.s1(i10).z1(j3);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            ijVar2 = new ij(i10, tL_message2, false, false);
        }
        gz.C(i10).r0(ez.b(charSequence.toString(), j3, ijVar, ijVar2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList arrayList = new ArrayList(iArr.length);
            int length = iArr.length;
            int i12 = 0;
            while (i12 < length) {
                i12 = com.google.android.recaptcha.internal.a.f(iArr[i12], i12, 1, arrayList);
            }
            yr a02 = yr.a0(i10);
            if (!arrayList.isEmpty()) {
                a02.f26723a.c(new lr(a02, arrayList, j3, 0));
            }
        }
        if (i11 == 0) {
            qp.s1(i10).j3(j3, i7, i7, 0, false, j10, 0, true, 0);
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
                if (longExtra != 0 && intExtra != 0 && p10.r(intExtra2)) {
                    final c a10 = c.a(intExtra2);
                    if (m5.E(longExtra)) {
                        if (qp.s1(a10.f21770a).a2(Long.valueOf(longExtra)) == null) {
                            Utilities.f21341e.c(new Runnable(this) {
                                public final WearReplyReceiver f23840b;

                                {
                                    this.f23840b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r10) {
                                        case 0:
                                            int i7 = WearReplyReceiver.f21359a;
                                            c cVar = a10;
                                            yr a02 = yr.a0(cVar.f21770a);
                                            long j3 = longExtra;
                                            g0.h3(new fm(this.f23840b, cVar, a02.k0(j3), charSequence, j3, longExtra2, intExtra, intArrayExtra));
                                            return;
                                        default:
                                            int i10 = WearReplyReceiver.f21359a;
                                            c cVar2 = a10;
                                            yr a03 = yr.a0(cVar2.f21770a);
                                            long j10 = longExtra;
                                            g0.h3(new fm(this.f23840b, cVar2, a03.P(-j10), charSequence, j10, longExtra2, intExtra, intArrayExtra));
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    } else if (m5.z(longExtra) && qp.s1(a10.f21770a).M0(Long.valueOf(-longExtra)) == null) {
                        Utilities.f21341e.c(new Runnable(this) {
                            public final WearReplyReceiver f23840b;

                            {
                                this.f23840b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r10) {
                                    case 0:
                                        int i7 = WearReplyReceiver.f21359a;
                                        c cVar = a10;
                                        yr a02 = yr.a0(cVar.f21770a);
                                        long j3 = longExtra;
                                        g0.h3(new fm(this.f23840b, cVar, a02.k0(j3), charSequence, j3, longExtra2, intExtra, intArrayExtra));
                                        return;
                                    default:
                                        int i10 = WearReplyReceiver.f21359a;
                                        c cVar2 = a10;
                                        yr a03 = yr.a0(cVar2.f21770a);
                                        long j10 = longExtra;
                                        g0.h3(new fm(this.f23840b, cVar2, a03.P(-j10), charSequence, j10, longExtra2, intExtra, intArrayExtra));
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
