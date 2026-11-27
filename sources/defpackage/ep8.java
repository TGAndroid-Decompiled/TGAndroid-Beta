package defpackage;

import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class ep8 implements Runnable {
    public final byte a;
    public final ProfileActivity b;
    public final TLRPC.TL_error c;
    public final TLObject d;
    public final TLRPC.TL_channels_getParticipants e;

    public ep8(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, byte b) {
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
                if (this.c == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity.getMessagesController().j4(tL_channels_channelParticipants.users, false);
                    profileActivity.getMessagesController().c4(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity.D1 = true;
                    }
                    if (this.e.offset == 0) {
                        profileActivity.C1.b();
                        profileActivity.v2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity.getMessagesStorage().j1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        jf7 messagesStorage = profileActivity.getMessagesStorage();
                        messagesStorage.a.c(new se7(messagesStorage, profileActivity.f1, tL_channels_channelParticipants.participants, (byte) 7));
                    }
                    for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long B1 = r47.B1(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = B1;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity.C1.h(B1) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity.v2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity.v2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity.C1.k(tL_chatChannelParticipant.user_id, tL_chatChannelParticipant);
                        }
                    }
                }
                profileActivity.B1 = false;
                profileActivity.j3();
                profileActivity.Z3(true, false);
                return;
            default:
                RectF rectF2 = ProfileActivity.Z6;
                ProfileActivity profileActivity2 = this.b;
                profileActivity2.getNotificationCenter().d(new ep8(profileActivity2, this.c, this.d, this.e, (byte) 0));
                return;
        }
    }
}
