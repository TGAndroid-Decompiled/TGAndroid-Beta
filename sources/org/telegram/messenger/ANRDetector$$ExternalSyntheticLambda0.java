package org.telegram.messenger;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.Bulletin;

public final class ANRDetector$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public ANRDetector$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ANRDetector) this.f$0).run();
                break;
            case 1:
                ((CompoundEmoji.DrawableInfo) this.f$0).lambda$load$0();
                break;
            case 2:
                ((FeedRemoteViewsFactory) this.f$0).lambda$onDataSetChanged$0();
                break;
            case 3:
                ((FilesMigrationService.AnonymousClass1) this.f$0).lambda$run$0();
                break;
            case 4:
                ((ImageLoader.AnonymousClass6) this.f$0).lambda$onReceive$0();
                break;
            case 5:
                ((LocaleController.TimeZoneChangedReceiver) this.f$0).lambda$onReceive$0();
                break;
            case 6:
                ((MediaController.AnonymousClass7) this.f$0).lambda$onSurfaceDestroyed$0();
                break;
            case 7:
                ((MediaController.AnonymousClass9) this.f$0).lambda$onSurfaceDestroyed$0();
                break;
            case 8:
                ((MediaController.GalleryObserverInternal) this.f$0).lambda$scheduleReloadRunnable$0();
                break;
            case 9:
                ((MediaController.MusicListenReporter) this.f$0).report();
                break;
            case 10:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.f$0);
                break;
            case 11:
                ((TelegramMediaSession.SessionCallback) this.f$0).lambda$notifyPlayStateForNotificationRefresh$0();
                break;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.f$0);
                break;
            case 13:
                ((BotFullscreenButtons) this.f$0).lambda$new$0();
                break;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.f$0).invalidateSelf();
                break;
            case 15:
                CodeHighlighting.lambda$highlight$3((CodeHighlighting.LockedSpannableString) this.f$0);
                break;
            case 16:
                ((CompoundEmoji.CompoundEmojiDrawable) this.f$0).invalidate();
                break;
            case 17:
                ((ContactsLoadingObserver) this.f$0).lambda$new$1();
                break;
            case 18:
                ((DispatchQueueMainThreadSync) this.f$0).lambda$recycle$0();
                break;
            case 19:
                ((FactCheckController) this.f$0).loadMissing();
                break;
            case 20:
                ((FileLoaderPriorityQueue) this.f$0).lambda$new$0();
                break;
            case 21:
                ((FilePathDatabase) this.f$0).lambda$clear$3();
                break;
            case 22:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.f$0);
                break;
            case 23:
                ((ImageReceiver) this.f$0).invalidate();
                break;
            case 24:
                MediaController.lambda$saveFile$46((AlertDialog) this.f$0);
                break;
            case 25:
                ((Bulletin.UndoButton) this.f$0).undo();
                break;
            case 26:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.f$0);
                break;
            case 27:
                MessagesController.lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f$0);
                break;
            case 28:
                MessagesController.lambda$performLogout$321((TLObject) this.f$0);
                break;
            default:
                MessagesController.lambda$setContentSettings$503((TLRPC.TL_error) this.f$0);
                break;
        }
    }
}
