package org.telegram.messenger;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class d1 implements Runnable {

    public final int f20005a;

    public final Object f20006b;

    public d1(Object obj, int i10) {
        this.f20005a = i10;
        this.f20006b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20005a) {
            case 0:
                ((CompoundEmoji.DrawableInfo) this.f20006b).lambda$load$0();
                break;
            case 1:
                ((FeedRemoteViewsFactory) this.f20006b).lambda$onDataSetChanged$0();
                break;
            case 2:
                ((FilesMigrationService.AnonymousClass1) this.f20006b).lambda$run$0();
                break;
            case 3:
                ((ImageLoader.AnonymousClass6) this.f20006b).lambda$onReceive$0();
                break;
            case 4:
                ((LocaleController.TimeZoneChangedReceiver) this.f20006b).lambda$onReceive$0();
                break;
            case 5:
                ((MediaController.AnonymousClass7) this.f20006b).lambda$onSurfaceDestroyed$0();
                break;
            case 6:
                ((MediaController.AnonymousClass9) this.f20006b).lambda$onSurfaceDestroyed$0();
                break;
            case 7:
                ((MediaController.GalleryObserverInternal) this.f20006b).lambda$scheduleReloadRunnable$0();
                break;
            case 8:
                ((MediaController.MusicListenReporter) this.f20006b).report();
                break;
            case 9:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.f20006b);
                break;
            case 10:
                ((TelegramMediaSession.SessionCallback) this.f20006b).lambda$notifyPlayStateForNotificationRefresh$0();
                break;
            case 11:
                ((ANRDetector) this.f20006b).run();
                break;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.f20006b);
                break;
            case 13:
                ((BotFullscreenButtons) this.f20006b).lambda$new$0();
                break;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.f20006b).invalidateSelf();
                break;
            case 15:
                CodeHighlighting.lambda$highlight$3((CodeHighlighting.LockedSpannableString) this.f20006b);
                break;
            case 16:
                ((CompoundEmoji.CompoundEmojiDrawable) this.f20006b).invalidate();
                break;
            case 17:
                ((ContactsLoadingObserver) this.f20006b).lambda$new$1();
                break;
            case 18:
                ((DispatchQueueMainThreadSync) this.f20006b).lambda$recycle$0();
                break;
            case 19:
                ((FactCheckController) this.f20006b).loadMissing();
                break;
            case 20:
                ((FileLoaderPriorityQueue) this.f20006b).lambda$new$0();
                break;
            case 21:
                ((FilePathDatabase) this.f20006b).lambda$clear$3();
                break;
            case 22:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.f20006b);
                break;
            case 23:
                ((ImageReceiver) this.f20006b).invalidate();
                break;
            case 24:
                MediaController.lambda$saveFile$46((org.telegram.ui.ActionBar.b2) this.f20006b);
                break;
            case 25:
                ((org.telegram.ui.Components.cc) this.f20006b).f();
                break;
            case 26:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.f20006b);
                break;
            case 27:
                MessagesController.lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f20006b);
                break;
            case 28:
                MessagesController.lambda$performLogout$321((TLObject) this.f20006b);
                break;
            default:
                MessagesController.lambda$setContentSettings$503((TLRPC.TL_error) this.f20006b);
                break;
        }
    }
}
