package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c5 implements RequestDelegate {
    public final int f17328a;

    public c5(int i10) {
        this.f17328a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17328a) {
            case 0:
                ImageLoader.HttpImageTask.lambda$doInBackground$2(tLObject, tL_error);
                return;
            case 1:
                ChatThemeController.lambda$clearWallpaper$15(tLObject, tL_error);
                return;
            case 2:
                ContactsController.lambda$resetImportedContacts$10(tLObject, tL_error);
                return;
            case 3:
                DownloadController.lambda$savePresetToServer$3(tLObject, tL_error);
                return;
            case 4:
                FileRefController.lambda$onUpdateObjectReference$40(tLObject, tL_error);
                return;
            case 5:
                FileRefController.lambda$onUpdateObjectReference$37(tLObject, tL_error);
                return;
            case 6:
                FileRefController.lambda$onUpdateObjectReference$38(tLObject, tL_error);
                return;
            case 7:
                FileRefController.lambda$onUpdateObjectReference$39(tLObject, tL_error);
                return;
            case 8:
                MediaDataController.lambda$saveDraft$188(tLObject, tL_error);
                return;
            case 9:
                MediaDataController.lambda$removeInline$152(tLObject, tL_error);
                return;
            case 10:
                MediaDataController.lambda$markFeaturedStickersByIdAsRead$66(tLObject, tL_error);
                return;
            case 11:
                MediaDataController.lambda$removePeer$154(tLObject, tL_error);
                return;
            case 12:
                MediaDataController.lambda$markFeaturedStickersAsRead$65(tLObject, tL_error);
                return;
            case 13:
                MediaDataController.lambda$removeWebapp$153(tLObject, tL_error);
                return;
            case 14:
                MessagesController.lambda$markPollVotesAsRead$437(tLObject, tL_error);
                return;
            case 15:
                MessagesController.lambda$deleteParticipantFromChat$311(tLObject, tL_error);
                return;
            case 16:
                MessagesController.lambda$setContentSettings$504(tLObject, tL_error);
                return;
            case 17:
                MessagesController.lambda$unregistedPush$320(tLObject, tL_error);
                return;
            case 18:
                MessagesController.lambda$completeReadTask$237(tLObject, tL_error);
                return;
            case 19:
                MessagesController.lambda$completeReadTask$239(tLObject, tL_error);
                return;
            case 20:
                MessagesController.lambda$markMentionMessageAsRead$233(tLObject, tL_error);
                return;
            case 21:
                MessagesController.lambda$hidePeerSettingsBar$75(tLObject, tL_error);
                return;
            case 22:
                MessagesController.lambda$installTheme$117(tLObject, tL_error);
                return;
            case 23:
                MessagesController.lambda$markMessageContentAsRead$231(tLObject, tL_error);
                return;
            case 24:
                MessagesController.lambda$reportSpam$76(tLObject, tL_error);
                return;
            case 25:
                MessagesController.lambda$installTheme$118(tLObject, tL_error);
                return;
            case 26:
                MessagesController.lambda$reportSpam$77(tLObject, tL_error);
                return;
            case 27:
                MessagesController.lambda$saveTheme$116(tLObject, tL_error);
                return;
            case 28:
                MessagesController.lambda$reportSpam$78(tLObject, tL_error);
                return;
            default:
                MessagesController.lambda$markReactionsAsRead$436(tLObject, tL_error);
                return;
        }
    }
}
