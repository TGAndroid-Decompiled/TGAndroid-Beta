package org.telegram.messenger;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e1 implements Runnable {
    public final int f20141a;
    public final Object f20142b;

    public e1(Object obj, int i9) {
        this.f20141a = i9;
        this.f20142b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20141a) {
            case 0:
                CompoundEmoji.DrawableInfo.a((CompoundEmoji.DrawableInfo) this.f20142b);
                return;
            case 1:
                ((FeedRemoteViewsFactory) this.f20142b).lambda$onDataSetChanged$0();
                return;
            case 2:
                ((FilesMigrationService.AnonymousClass1) this.f20142b).lambda$run$0();
                return;
            case 3:
                ((ImageLoader.AnonymousClass6) this.f20142b).lambda$onReceive$0();
                return;
            case 4:
                ((LocaleController.TimeZoneChangedReceiver) this.f20142b).lambda$onReceive$0();
                return;
            case 5:
                ((MediaController.AnonymousClass7) this.f20142b).lambda$onSurfaceDestroyed$0();
                return;
            case 6:
                ((MediaController.AnonymousClass9) this.f20142b).lambda$onSurfaceDestroyed$0();
                return;
            case 7:
                ((MediaController.GalleryObserverInternal) this.f20142b).lambda$scheduleReloadRunnable$0();
                return;
            case 8:
                ((MediaController.MusicListenReporter) this.f20142b).report();
                return;
            case 9:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.f20142b);
                return;
            case 10:
                ((TelegramMediaSession.SessionCallback) this.f20142b).lambda$notifyPlayStateForNotificationRefresh$0();
                return;
            case 11:
                ANRDetector.a((ANRDetector) this.f20142b);
                return;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.f20142b);
                return;
            case 13:
                BotFullscreenButtons.a((BotFullscreenButtons) this.f20142b);
                return;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.f20142b).invalidateSelf();
                return;
            case 15:
                CodeHighlighting.a((CodeHighlighting.LockedSpannableString) this.f20142b);
                return;
            case 16:
                CompoundEmoji.CompoundEmojiDrawable.a((CompoundEmoji.CompoundEmojiDrawable) this.f20142b);
                return;
            case 17:
                ((ContactsLoadingObserver) this.f20142b).lambda$new$1();
                return;
            case 18:
                ((DispatchQueueMainThreadSync) this.f20142b).lambda$recycle$0();
                return;
            case 19:
                ((FactCheckController) this.f20142b).loadMissing();
                return;
            case 20:
                FileLoaderPriorityQueue.a((FileLoaderPriorityQueue) this.f20142b);
                return;
            case 21:
                ((FilePathDatabase) this.f20142b).lambda$clear$3();
                return;
            case 22:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.f20142b);
                return;
            case 23:
                ((ImageReceiver) this.f20142b).invalidate();
                return;
            case 24:
                MediaController.lambda$saveFile$46((org.telegram.ui.ActionBar.c2) this.f20142b);
                return;
            case 25:
                ((org.telegram.ui.Components.ec) this.f20142b).f();
                return;
            case 26:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.f20142b);
                return;
            case 27:
                MessagesController.lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f20142b);
                return;
            case 28:
                MessagesController.lambda$performLogout$321((TLObject) this.f20142b);
                return;
            default:
                MessagesController.lambda$setContentSettings$503((TLRPC.TL_error) this.f20142b);
                return;
        }
    }
}
