package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ye8 {
    public static int a(k27 k27Var) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i;
        int i2 = 0;
        if (k27Var.D == 17) {
            TLRPC.Message message = k27Var.k;
            int i3 = k27Var.K1;
            TLRPC.MessageMedia n1 = k27.n1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(n1)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                if (poll.closed) {
                    i2 = 8;
                }
                if (poll.subscribers_only) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = cf3.n(messageFwdHeader.from_id);
                    } else {
                        B0 = k27.B0(k27Var.k);
                    }
                    TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-B0));
                    if (K0 != null) {
                        if (K0.left || K0.kicked) {
                            i2 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if (messageFwdHeader2 != null) {
                            i = messageFwdHeader2.date;
                        } else {
                            i = message.date;
                        }
                        if (i - K0.date < 86400) {
                            i2 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!tL_messageMediaPoll.poll.countries_iso2.contains(na7.q1(i3).k4.S.f)) {
                        return i2 | 4;
                    }
                    return i2;
                }
                return i2;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i, k27 k27Var) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i2;
        int i3;
        if (k27Var.D == 17) {
            TLRPC.Message message = k27Var.k;
            int i4 = k27Var.K1;
            TLRPC.MessageMedia n1 = k27.n1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(n1)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                if (fod.a(i, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        String str = arrayList2.get(i5);
                        i5++;
                        String str2 = str;
                        String i0 = k96.i0(2131750504, str2);
                        if (!TextUtils.isEmpty(i0)) {
                            str2 = i0;
                        }
                        arrayList.add(str2);
                    }
                    boolean z = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        if (z) {
                            i3 = 2131746924;
                        } else {
                            i3 = 2131746921;
                        }
                        return gl.S2(k96.a0(null, null, i3, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i6 = 0; i6 < arrayList.size() - 1; i6++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i6));
                    }
                    if (z) {
                        i2 = 2131746923;
                    } else {
                        i2 = 2131746920;
                    }
                    return gl.S2(k96.a0(null, null, i2, stringBuffer, b00.f(1, arrayList)));
                } else if (fod.a(i, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = cf3.n(messageFwdHeader.from_id);
                    } else {
                        B0 = k27.B0(k27Var.k);
                    }
                    return gl.S2(k96.a0(null, null, 2131746925, cf3.t(na7.q1(i4).K0(Long.valueOf(-B0)))));
                } else if (fod.a(i, 2)) {
                    return gl.S2(k96.M0(2131746922, null));
                }
            }
        }
        return null;
    }
}
