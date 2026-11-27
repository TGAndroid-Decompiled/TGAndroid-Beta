package defpackage;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class ihb implements Vector.TLDeserializer {
    public final byte a;

    public ihb(byte b) {
        this.a = b;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 0:
                return TLRPC.TodoCompletion.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TLRPC.ReactionCount.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TLRPC.MessagePeerReaction.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TLRPC.MessageReactor.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TLRPC.StickerSet.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TLRPC.StickerSetCovered.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TLRPC.TL_availableEffect.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TLRPC.TL_availableReaction.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TLRPC.BotInlineResult.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TLRPC.Message.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TLRPC.TL_forumTopic.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.TL_chatAdminWithInvites.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TLRPC.TL_chatInviteImporter.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.DialogFilter.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TLRPC.ForumTopic.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TLRPC.Dialog.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TLRPC.EmojiGroup.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TLRPC.ExportedChatInvite.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TLRPC.TL_stickerPack.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TLRPC.DialogPeer.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TLRPC.TL_emojiLanguage.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TLRPC.TL_readParticipantDate.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TLRPC.TL_messages_searchCounter.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TLRPC.TL_dialogFilterSuggested.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TLRPC.TL_transcriptionModel.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TLRPC.TL_voipModel.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TLRPC.TL_highScore.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TLRPC.TL_missingInvitee.TLdeserialize(inputSerializedData, i, z);
            case 28:
                return TLRPC.TL_messageViews.TLdeserialize(inputSerializedData, i, z);
            default:
                return TLRPC.InlineQueryPeerType.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
