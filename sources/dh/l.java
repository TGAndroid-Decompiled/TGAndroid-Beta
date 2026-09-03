package dh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import k7.w8;
import kf.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class l {
    public static int a(MessageObject messageObject) {
        long dialogId;
        int i10;
        int i11 = 0;
        if (messageObject.type != 17) {
            return 0;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int i12 = messageObject.currentAccount;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
        if (tL_messageMediaPoll == null) {
            return 0;
        }
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        if (poll.closed) {
            i11 = 8;
        }
        if (poll.subscribers_only) {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader != null) {
                dialogId = DialogObject.getPeerDialogId(messageFwdHeader.from_id);
            } else {
                dialogId = messageObject.getDialogId();
            }
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-dialogId));
            if (chat != null) {
                if (chat.left || chat.kicked) {
                    i11 |= 1;
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                if (messageFwdHeader2 != null) {
                    i10 = messageFwdHeader2.date;
                } else {
                    i10 = message.date;
                }
                if (i10 - chat.date < 86400) {
                    i11 |= 2;
                }
            }
        }
        ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!tL_messageMediaPoll.poll.countries_iso2.contains(MessagesController.getInstance(i12).config.phoneCountryIso2.get())) {
                return i11 | 4;
            }
        }
        return i11;
    }

    public static SpannableStringBuilder b(MessageObject messageObject, int i10) {
        long dialogId;
        int i11;
        int i12;
        if (messageObject.type == 17) {
            TLRPC.Message message = messageObject.messageOwner;
            int i13 = messageObject.currentAccount;
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
            if (tL_messageMediaPoll != null) {
                if (w8.a(i10, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        String str = arrayList2.get(i14);
                        i14++;
                        String str2 = str;
                        String countryName = LocaleController.getCountryName(str2);
                        if (!TextUtils.isEmpty(countryName)) {
                            str2 = countryName;
                        }
                        arrayList.add(str2);
                    }
                    boolean z4 = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        if (z4) {
                            i12 = R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOne;
                        } else {
                            i12 = R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOne;
                        }
                        return AndroidUtilities.replaceTags(LocaleController.formatString(i12, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i15 = 0; i15 < arrayList.size() - 1; i15++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i15));
                    }
                    if (z4) {
                        i11 = R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOther;
                    } else {
                        i11 = R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOther;
                    }
                    return AndroidUtilities.replaceTags(LocaleController.formatString(i11, stringBuffer, k0.i(1, arrayList)));
                } else if (w8.a(i10, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        dialogId = DialogObject.getPeerDialogId(messageFwdHeader.from_id);
                    } else {
                        dialogId = messageObject.getDialogId();
                    }
                    return AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2ToastOnlySubscribersCanVote, DialogObject.getShortName(MessagesController.getInstance(i13).getChat(Long.valueOf(-dialogId)))));
                } else if (w8.a(i10, 2)) {
                    return AndroidUtilities.replaceTags(LocaleController.getString(R.string.PollV2ToastOnlySubscribersJoined24hCanVote));
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
