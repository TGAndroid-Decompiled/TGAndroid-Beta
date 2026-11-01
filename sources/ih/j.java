package ih;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.kj;
import org.telegram.messenger.o5;
import org.telegram.messenger.q0;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import v7.u7;
public abstract class j {
    public static int a(kj kjVar) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i10;
        int i11 = 0;
        if (kjVar.D == 17) {
            TLRPC.Message message = kjVar.f16690k;
            int i12 = kjVar.I1;
            TLRPC.MessageMedia o12 = kj.o1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(o12)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(o12);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                if (poll.closed) {
                    i11 = 8;
                }
                if (poll.subscribers_only) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = o5.o(messageFwdHeader.from_id);
                    } else {
                        B0 = kj.B0(kjVar.f16690k);
                    }
                    TLRPC.Chat L0 = wp.r1(i12).L0(Long.valueOf(-B0));
                    if (L0 != null) {
                        if (L0.left || L0.kicked) {
                            i11 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if (messageFwdHeader2 != null) {
                            i10 = messageFwdHeader2.date;
                        } else {
                            i10 = message.date;
                        }
                        if (i10 - L0.date < 86400) {
                            i11 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!tL_messageMediaPoll.poll.countries_iso2.contains(((q0) wp.r1(i12).f19300y7.O.f13481b).f17725c)) {
                        return i11 | 4;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i10, kj kjVar) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i11;
        int i12;
        if (kjVar.D == 17) {
            TLRPC.Message message = kjVar.f16690k;
            int i13 = kjVar.I1;
            TLRPC.MessageMedia o12 = kj.o1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(o12)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(o12);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                if (u7.a(i10, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        String str = arrayList2.get(i14);
                        i14++;
                        String str2 = str;
                        String i02 = dd.i0(2131750530, str2);
                        if (!TextUtils.isEmpty(i02)) {
                            str2 = i02;
                        }
                        arrayList.add(str2);
                    }
                    boolean z10 = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        if (z10) {
                            i12 = 2131747132;
                        } else {
                            i12 = 2131747129;
                        }
                        return i0.W2(dd.a0(null, null, i12, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i15 = 0; i15 < arrayList.size() - 1; i15++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i15));
                    }
                    if (z10) {
                        i11 = 2131747131;
                    } else {
                        i11 = 2131747128;
                    }
                    return i0.W2(dd.a0(null, null, i11, stringBuffer, i0.a.g(1, arrayList)));
                } else if (u7.a(i10, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = o5.o(messageFwdHeader.from_id);
                    } else {
                        B0 = kj.B0(kjVar.f16690k);
                    }
                    return i0.W2(dd.a0(null, null, 2131747133, o5.u(wp.r1(i13).L0(Long.valueOf(-B0)))));
                } else if (u7.a(i10, 2)) {
                    return i0.W2(dd.L0(2131747130, null));
                }
            }
        }
        return null;
    }
}
