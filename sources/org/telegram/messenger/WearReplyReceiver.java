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

    public static void a(j5 j5Var, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        k27 k27Var;
        int i2 = j5Var.a;
        k27 k27Var2 = null;
        if (i != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.id = i;
            tL_message.peer_id = na7.q1(i2).w1(j);
            k27Var = new k27(i2, tL_message, false, false);
        } else {
            k27Var = null;
        }
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i3 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.id = (int) j2;
            tL_message2.peer_id = na7.q1(i2).w1(j);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            k27Var2 = new k27(i2, tL_message2, false, false);
        }
        z3a.B(i2).q0(x3a.b(charSequence.toString(), j, k27Var, k27Var2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList arrayList = new ArrayList(iArr.length);
            int length = iArr.length;
            int i4 = 0;
            while (i4 < length) {
                i4 = tb4.g(iArr[i4], i4, 1, arrayList);
            }
            ad7 Y = ad7.Y(i2);
            if (!arrayList.isEmpty()) {
                Y.a.c(new jc7(Y, arrayList, j, (byte) 0));
            }
        }
        if (i3 == 0) {
            na7.q1(i2).l3(j, i, i, 0, false, j2, 0, true, 0);
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
                if (longExtra != 0 && intExtra != 0 && y6c.q(intExtra2)) {
                    final j5 a2 = j5.a(intExtra2);
                    if (cf3.D(longExtra)) {
                        if (na7.q1(a2.a).V1(Long.valueOf(longExtra)) == null) {
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
                                            j5 j5Var = a2;
                                            ad7 Y = ad7.Y(j5Var.a);
                                            long j = longExtra;
                                            gl.c3(new r77(this.b, j5Var, Y.h0(j), charSequence, j, longExtra2, intExtra, intArrayExtra));
                                            return;
                                        default:
                                            int i2 = WearReplyReceiver.a;
                                            j5 j5Var2 = a2;
                                            ad7 Y2 = ad7.Y(j5Var2.a);
                                            long j2 = longExtra;
                                            gl.c3(new r77(this.b, j5Var2, Y2.O(-j2), charSequence, j2, longExtra2, intExtra, intArrayExtra));
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    } else if (cf3.y(longExtra) && na7.q1(a2.a).K0(Long.valueOf(-longExtra)) == null) {
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
                                        j5 j5Var = a2;
                                        ad7 Y = ad7.Y(j5Var.a);
                                        long j = longExtra;
                                        gl.c3(new r77(this.b, j5Var, Y.h0(j), charSequence, j, longExtra2, intExtra, intArrayExtra));
                                        return;
                                    default:
                                        int i2 = WearReplyReceiver.a;
                                        j5 j5Var2 = a2;
                                        ad7 Y2 = ad7.Y(j5Var2.a);
                                        long j2 = longExtra;
                                        gl.c3(new r77(this.b, j5Var2, Y2.O(-j2), charSequence, j2, longExtra2, intExtra, intArrayExtra));
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
