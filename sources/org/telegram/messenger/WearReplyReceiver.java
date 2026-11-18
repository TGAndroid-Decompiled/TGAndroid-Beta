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
    public static final int f22800a = 0;

    public static void a(c cVar, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        fj fjVar;
        int i10 = cVar.f23221a;
        fj fjVar2 = null;
        if (i7 != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f28426id = i7;
            tL_message.peer_id = mp.u1(i10).B1(j3);
            fjVar = new fj(i10, tL_message, false, false);
        } else {
            fjVar = null;
        }
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.f28426id = (int) j10;
            tL_message2.peer_id = mp.u1(i10).B1(j3);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            fjVar2 = new fj(i10, tL_message2, false, false);
        }
        zy.C(i10).r0(xy.b(charSequence.toString(), j3, fjVar, fjVar2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList arrayList = new ArrayList(iArr.length);
            int length = iArr.length;
            int i12 = 0;
            while (i12 < length) {
                i12 = com.google.android.gms.internal.vision.e2.f(iArr[i12], i12, 1, arrayList);
            }
            tr a02 = tr.a0(i10);
            if (!arrayList.isEmpty()) {
                a02.f27054a.c(new gr(a02, arrayList, j3, 0));
            }
        }
        if (i11 == 0) {
            mp.u1(i10).q3(j3, i7, i7, 0, false, j10, 0, true, 0);
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
                if (longExtra != 0 && intExtra != 0 && j10.r(intExtra2)) {
                    final c a10 = c.a(intExtra2);
                    if (n5.E(longExtra)) {
                        if (mp.u1(a10.f23221a).c2(Long.valueOf(longExtra)) == null) {
                            Utilities.f22782e.c(new Runnable(this) {
                                public final WearReplyReceiver f24150b;

                                {
                                    this.f24150b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r10) {
                                        case 0:
                                            int i7 = WearReplyReceiver.f22800a;
                                            c cVar = a10;
                                            tr a02 = tr.a0(cVar.f23221a);
                                            long j3 = longExtra;
                                            g0.g3(new jm(this.f24150b, cVar, a02.k0(j3), charSequence, j3, longExtra2, intExtra, intArrayExtra));
                                            return;
                                        default:
                                            int i10 = WearReplyReceiver.f22800a;
                                            c cVar2 = a10;
                                            tr a03 = tr.a0(cVar2.f23221a);
                                            long j10 = longExtra;
                                            g0.g3(new jm(this.f24150b, cVar2, a03.P(-j10), charSequence, j10, longExtra2, intExtra, intArrayExtra));
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    } else if (n5.z(longExtra) && mp.u1(a10.f23221a).O0(Long.valueOf(-longExtra)) == null) {
                        Utilities.f22782e.c(new Runnable(this) {
                            public final WearReplyReceiver f24150b;

                            {
                                this.f24150b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r10) {
                                    case 0:
                                        int i7 = WearReplyReceiver.f22800a;
                                        c cVar = a10;
                                        tr a02 = tr.a0(cVar.f23221a);
                                        long j3 = longExtra;
                                        g0.g3(new jm(this.f24150b, cVar, a02.k0(j3), charSequence, j3, longExtra2, intExtra, intArrayExtra));
                                        return;
                                    default:
                                        int i10 = WearReplyReceiver.f22800a;
                                        c cVar2 = a10;
                                        tr a03 = tr.a0(cVar2.f23221a);
                                        long j10 = longExtra;
                                        g0.g3(new jm(this.f24150b, cVar2, a03.P(-j10), charSequence, j10, longExtra2, intExtra, intArrayExtra));
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
