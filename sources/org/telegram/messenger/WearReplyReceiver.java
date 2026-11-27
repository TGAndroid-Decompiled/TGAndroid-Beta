package org.telegram.messenger;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.WearReplyReceiver;
import org.telegram.tgnet.TLRPC;
public class WearReplyReceiver extends BroadcastReceiver {
    public static final int a = 0;

    public static void a(k5 k5Var, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        r47 r47Var;
        int i2 = k5Var.a;
        r47 r47Var2 = null;
        if (i != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.id = i;
            tL_message.peer_id = uc7.s1(i2).y1(j);
            r47Var = new r47(i2, tL_message, false, false);
        } else {
            r47Var = null;
        }
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i3 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.id = (int) j2;
            tL_message2.peer_id = uc7.s1(i2).y1(j);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            r47Var2 = new r47(i2, tL_message2, false, false);
        }
        r7a.B(i2).q0(p7a.b(charSequence.toString(), j, r47Var, r47Var2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList arrayList = new ArrayList(iArr.length);
            int length = iArr.length;
            int i4 = 0;
            while (i4 < length) {
                i4 = qd4.g(iArr[i4], i4, 1, arrayList);
            }
            kf7 a0 = kf7.a0(i2);
            if (!arrayList.isEmpty()) {
                a0.a.c(new te7(a0, arrayList, j, (byte) 0));
            }
        }
        if (i3 == 0) {
            uc7.s1(i2).r3(j, i, i, 0, false, j2, 0, true, 0);
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        a.v();
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            final CharSequence charSequence = resultsFromIntent.getCharSequence("extra_voice_reply");
            if (!TextUtils.isEmpty(charSequence)) {
                final long longExtra = intent.getLongExtra("dialog_id", 0L);
                final int intExtra = intent.getIntExtra("max_id", 0);
                final long longExtra2 = intent.getLongExtra("topic_id", 0L);
                int intExtra2 = intent.getIntExtra("currentAccount", 0);
                final int[] intArrayExtra = intent.getIntArrayExtra("voice_msg_ids");
                if (longExtra != 0 && intExtra != 0 && yac.q(intExtra2)) {
                    final k5 a2 = k5.a(intExtra2);
                    if (wf3.D(longExtra)) {
                        if (uc7.s1(a2.a).X1(Long.valueOf(longExtra)) == null) {
                            Utilities.e.c(new Runnable(this) {
                                public final WearReplyReceiver b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run() {
                                    switch (r10) {
                                        case 0:
                                            int i = WearReplyReceiver.a;
                                            k5 k5Var = a2;
                                            kf7 a0 = kf7.a0(k5Var.a);
                                            long j = longExtra;
                                            hl.c3(new ga7(this.b, k5Var, a0.j0(j), charSequence, j, longExtra2, intExtra, intArrayExtra));
                                            return;
                                        default:
                                            int i2 = WearReplyReceiver.a;
                                            k5 k5Var2 = a2;
                                            kf7 a02 = kf7.a0(k5Var2.a);
                                            long j2 = longExtra;
                                            hl.c3(new ga7(this.b, k5Var2, a02.Q(-j2), charSequence, j2, longExtra2, intExtra, intArrayExtra));
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    } else if (wf3.y(longExtra) && uc7.s1(a2.a).M0(Long.valueOf(-longExtra)) == null) {
                        Utilities.e.c(new Runnable(this) {
                            public final WearReplyReceiver b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r10) {
                                    case 0:
                                        int i = WearReplyReceiver.a;
                                        k5 k5Var = a2;
                                        kf7 a0 = kf7.a0(k5Var.a);
                                        long j = longExtra;
                                        hl.c3(new ga7(this.b, k5Var, a0.j0(j), charSequence, j, longExtra2, intExtra, intArrayExtra));
                                        return;
                                    default:
                                        int i2 = WearReplyReceiver.a;
                                        k5 k5Var2 = a2;
                                        kf7 a02 = kf7.a0(k5Var2.a);
                                        long j2 = longExtra;
                                        hl.c3(new ga7(this.b, k5Var2, a02.Q(-j2), charSequence, j2, longExtra2, intExtra, intArrayExtra));
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    a(a2, charSequence, longExtra, longExtra2, intExtra, intArrayExtra);
                }
            }
        }
    }
}
