package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import java.io.FileNotFoundException;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_communities;
public final class c1b implements OnFailureListener, ee, kac, sac, Vector.TLDeserializer {
    public final byte a;

    public c1b(byte b) {
        this.a = b;
    }

    public static void a(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static void b(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 8:
                return TLRPC.AttachMenuPeerType.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TLRPC.TL_attachMenuBotIcon.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TLRPC.TL_attachMenuBotIconColor.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.AttachMenuBot.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TLRPC.User.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.RestrictionReason.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TLRPC.TL_username.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TL_bots.BotInfo.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TLRPC.TL_messageRange.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TLRPC.TL_channelAdminLogEvent.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TLRPC.Chat.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TLRPC.ChannelParticipant.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TLRPC.TL_sendAsPeer.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TLRPC.TL_sponsoredMessageReportOption.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TLRPC.ChatParticipant.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TLRPC.Reaction.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TLRPC.ThemeSettings.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TL_communities.CommunityPeer.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TLRPC.TL_dcOption.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TLRPC.TL_peerBlocked.TLdeserialize(inputSerializedData, i, z);
            case 28:
                return TLRPC.TL_contact.TLdeserialize(inputSerializedData, i, z);
            default:
                return TLRPC.TL_contactStatus.TLdeserialize(inputSerializedData, i, z);
        }
    }

    @Override
    public final Object j(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        if (num.intValue() == 0) {
            if (num2.intValue() == 0) {
                return jb6.M0(2131748562, null);
            }
            return jb6.H(',', "Stars", num2.intValue());
        }
        return String.valueOf(num2);
    }

    @Override
    public final void r(he heVar, int i) {
        heVar.dismiss();
    }

    @Override
    public final void onFailure(Exception exc) {
    }
}
