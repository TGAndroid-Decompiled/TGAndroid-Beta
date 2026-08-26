package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class FileRefController$$ExternalSyntheticLambda11 implements RequestDelegate {
    public final int $r8$classId;

    public FileRefController$$ExternalSyntheticLambda11(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                FileRefController.lambda$onUpdateObjectReference$40(tLObject, tL_error);
                break;
            case 1:
                ImageLoader.HttpImageTask.lambda$doInBackground$2(tLObject, tL_error);
                break;
            case 2:
                ChatThemeController.lambda$clearWallpaper$15(tLObject, tL_error);
                break;
            case 3:
                ContactsController.lambda$resetImportedContacts$10(tLObject, tL_error);
                break;
            case 4:
                DownloadController.lambda$savePresetToServer$3(tLObject, tL_error);
                break;
            case 5:
                FileRefController.lambda$onUpdateObjectReference$37(tLObject, tL_error);
                break;
            case 6:
                FileRefController.lambda$onUpdateObjectReference$38(tLObject, tL_error);
                break;
            case 7:
                FileRefController.lambda$onUpdateObjectReference$39(tLObject, tL_error);
                break;
            case 8:
                MediaDataController.lambda$saveDraft$188(tLObject, tL_error);
                break;
            case 9:
                MediaDataController.lambda$removeInline$152(tLObject, tL_error);
                break;
            case 10:
                MediaDataController.lambda$markFeaturedStickersByIdAsRead$66(tLObject, tL_error);
                break;
            case 11:
                MediaDataController.lambda$removePeer$154(tLObject, tL_error);
                break;
            case 12:
                MediaDataController.lambda$markFeaturedStickersAsRead$65(tLObject, tL_error);
                break;
            case 13:
                MediaDataController.lambda$removeWebapp$153(tLObject, tL_error);
                break;
            case 14:
                MessagesController.lambda$markPollVotesAsRead$437(tLObject, tL_error);
                break;
            case 15:
                MessagesController.lambda$deleteParticipantFromChat$314(tLObject, tL_error);
                break;
            case 16:
                MessagesController.lambda$deleteParticipantFromChat$311(tLObject, tL_error);
                break;
            case 17:
                MessagesController.lambda$setContentSettings$504(tLObject, tL_error);
                break;
            case 18:
                MessagesController.lambda$unregistedPush$320(tLObject, tL_error);
                break;
            case 19:
                MessagesController.lambda$completeReadTask$237(tLObject, tL_error);
                break;
            case 20:
                MessagesController.lambda$completeReadTask$239(tLObject, tL_error);
                break;
            case 21:
                MessagesController.lambda$markMentionMessageAsRead$233(tLObject, tL_error);
                break;
            case 22:
                MessagesController.lambda$hidePeerSettingsBar$75(tLObject, tL_error);
                break;
            case 23:
                MessagesController.lambda$markMessageContentAsRead$231(tLObject, tL_error);
                break;
            case 24:
                MessagesController.lambda$saveTheme$116(tLObject, tL_error);
                break;
            case 25:
                MessagesController.lambda$reportSpam$76(tLObject, tL_error);
                break;
            case 26:
                MessagesController.lambda$markReactionsAsRead$436(tLObject, tL_error);
                break;
            case 27:
                MessagesController.lambda$reportSpam$77(tLObject, tL_error);
                break;
            case 28:
                MessagesController.lambda$removeSuggestion$40(tLObject, tL_error);
                break;
            default:
                MessagesController.lambda$reportSpam$78(tLObject, tL_error);
                break;
        }
    }
}
