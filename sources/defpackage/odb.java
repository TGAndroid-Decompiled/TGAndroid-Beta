package defpackage;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class odb implements Vector.TLDeserializer {
    public final byte a;

    public odb(byte b) {
        this.a = b;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 0:
                return TLRPC.TL_searchResultsCalendarPeriod.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TLRPC.TL_searchResultPosition.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TLRPC.TL_sponsoredMessage.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TLRPC.TL_stickerKeyword.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TL_iv.RichMessage.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TLRPC.MessagePeerVote.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TLRPC.TL_bankCardOpenUrl.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TLRPC.TL_premiumGiftCodeOption.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TLRPC.TL_paymentFormMethod.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TLRPC.TL_paymentSavedCredentialsCard.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.TL_shippingOption.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TLRPC.Photo.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.PollAnswerVoters.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TL_keyboard.KeyboardInlineButtonRow.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TL_keyboard.KeyboardButtonRow.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TLRPC.TL_messageReportOption.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TLRPC.SecureRequiredType.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TLRPC.SecureFile.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TLRPC.TL_shareThemeBackdropOption.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TLRPC.TL_themeSettings.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TLRPC.TL_topPeer.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TLRPC.Update.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TLRPC.EncryptedMessage.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TLRPC.TL_fileHash.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TLRPC.TL_premiumGiftOption.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TLRPC.WebPageAttribute.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TL_account.Passkey.TLdeserialize(inputSerializedData, i, z);
            case 28:
                return TL_account.TL_businessWeeklyOpen.TLdeserialize(inputSerializedData, i, z);
            default:
                return TLRPC.EmojiStatus.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
