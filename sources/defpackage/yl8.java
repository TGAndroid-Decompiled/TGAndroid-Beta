package defpackage;

import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class yl8 implements Runnable {
    public final byte a;
    public final ProfileActivity b;
    public final TLRPC.TL_error c;
    public final TLObject d;
    public final TLRPC.TL_channels_getParticipants e;

    public yl8(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, byte b) {
        this.a = b;
        this.b = profileActivity;
        this.c = tL_error;
        this.d = tLObject;
        this.e = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                ProfileActivity profileActivity = this.b;
                profileActivity.getNotificationCenter().d(new yl8(profileActivity, this.c, this.d, this.e, (byte) 1));
                return;
            default:
                RectF rectF2 = ProfileActivity.Z6;
                ProfileActivity profileActivity2 = this.b;
                if (this.c == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().b4(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().V3(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.D1 = true;
                    }
                    if (this.e.offset == 0) {
                        profileActivity2.C1.b();
                        profileActivity2.v2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().j1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        ad7 messagesStorage = profileActivity2.getMessagesStorage();
                        messagesStorage.a.c(new jc7(messagesStorage, profileActivity2.f1, tL_channels_channelParticipants.participants, (byte) 3));
                    }
                    for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long B1 = k27.B1(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = B1;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.C1.h(B1) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.v2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.v2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.C1.k(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.B1 = false;
                profileActivity2.i3();
                profileActivity2.Y3(true, false);
                return;
        }
    }
}
