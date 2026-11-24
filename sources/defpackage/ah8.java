package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ah8 {
    public static int a(k47 k47Var) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i;
        int i2 = 0;
        if (k47Var.D == 17) {
            TLRPC.Message message = k47Var.k;
            int i3 = k47Var.K1;
            TLRPC.MessageMedia n1 = k47.n1(message);
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
                        B0 = pg3.n(messageFwdHeader.from_id);
                    } else {
                        B0 = k47.B0(k47Var.k);
                    }
                    TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-B0));
                    if (L0 != null) {
                        if (L0.left || L0.kicked) {
                            i2 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if (messageFwdHeader2 != null) {
                            i = messageFwdHeader2.date;
                        } else {
                            i = message.date;
                        }
                        if (i - L0.date < 86400) {
                            i2 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!tL_messageMediaPoll.poll.countries_iso2.contains(oc7.r1(i3).l4.S.f)) {
                        return i2 | 4;
                    }
                    return i2;
                }
                return i2;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i, k47 k47Var) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i2;
        int i3;
        if (k47Var.D == 17) {
            TLRPC.Message message = k47Var.k;
            int i4 = k47Var.K1;
            TLRPC.MessageMedia n1 = k47.n1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(n1)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                if (iqd.a(i, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        String str = arrayList2.get(i5);
                        i5++;
                        String str2 = str;
                        String i0 = jb6.i0(2131750453, str2);
                        if (!TextUtils.isEmpty(i0)) {
                            str2 = i0;
                        }
                        arrayList.add(str2);
                    }
                    boolean z = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        if (z) {
                            i3 = 2131746850;
                        } else {
                            i3 = 2131746847;
                        }
                        return gm.S2(jb6.a0(null, null, i3, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i6 = 0; i6 < arrayList.size() - 1; i6++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i6));
                    }
                    if (z) {
                        i2 = 2131746849;
                    } else {
                        i2 = 2131746846;
                    }
                    return gm.S2(jb6.a0(null, null, i2, stringBuffer, b10.f(1, arrayList)));
                } else if (iqd.a(i, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = pg3.n(messageFwdHeader.from_id);
                    } else {
                        B0 = k47.B0(k47Var.k);
                    }
                    return gm.S2(jb6.a0(null, null, 2131746851, pg3.t(oc7.r1(i4).L0(Long.valueOf(-B0)))));
                } else if (iqd.a(i, 2)) {
                    return gm.S2(jb6.M0(2131746848, null));
                }
            }
        }
        return null;
    }
}
