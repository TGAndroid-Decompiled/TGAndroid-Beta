package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class mi8 {
    public static int a(r47 r47Var) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i;
        int i2 = 0;
        if (r47Var.D == 17) {
            TLRPC.Message message = r47Var.k;
            int i3 = r47Var.K1;
            TLRPC.MessageMedia n1 = r47.n1(message);
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
                        B0 = wf3.n(messageFwdHeader.from_id);
                    } else {
                        B0 = r47.B0(r47Var.k);
                    }
                    TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-B0));
                    if (M0 != null) {
                        if (M0.left || M0.kicked) {
                            i2 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if (messageFwdHeader2 != null) {
                            i = messageFwdHeader2.date;
                        } else {
                            i = message.date;
                        }
                        if (i - M0.date < 86400) {
                            i2 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!tL_messageMediaPoll.poll.countries_iso2.contains(uc7.s1(i3).k4.Z.f)) {
                        return i2 | 4;
                    }
                    return i2;
                }
                return i2;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i, r47 r47Var) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i2;
        int i3;
        if (r47Var.D == 17) {
            TLRPC.Message message = r47Var.k;
            int i4 = r47Var.K1;
            TLRPC.MessageMedia n1 = r47.n1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(n1)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                if (vsd.a(i, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        String str = arrayList2.get(i5);
                        i5++;
                        String str2 = str;
                        String i0 = ob6.i0(2131750481, str2);
                        if (!TextUtils.isEmpty(i0)) {
                            str2 = i0;
                        }
                        arrayList.add(str2);
                    }
                    boolean z = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        if (z) {
                            i3 = 2131746844;
                        } else {
                            i3 = 2131746841;
                        }
                        return hl.S2(ob6.a0(null, null, i3, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i6 = 0; i6 < arrayList.size() - 1; i6++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i6));
                    }
                    if (z) {
                        i2 = 2131746843;
                    } else {
                        i2 = 2131746840;
                    }
                    return hl.S2(ob6.a0(null, null, i2, stringBuffer, c00.g(1, arrayList)));
                } else if (vsd.a(i, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = wf3.n(messageFwdHeader.from_id);
                    } else {
                        B0 = r47.B0(r47Var.k);
                    }
                    return hl.S2(ob6.a0(null, null, 2131746845, wf3.t(uc7.s1(i4).M0(Long.valueOf(-B0)))));
                } else if (vsd.a(i, 2)) {
                    return hl.S2(ob6.M0(2131746842, null));
                }
            }
        }
        return null;
    }
}
