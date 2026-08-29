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
public final class d1 implements Runnable {
    public final int f19988a;
    public final Object f19989b;

    public d1(Object obj, int i10) {
        this.f19988a = i10;
        this.f19989b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19988a) {
            case 0:
                CompoundEmoji.DrawableInfo.a((CompoundEmoji.DrawableInfo) this.f19989b);
                return;
            case 1:
                ((FeedRemoteViewsFactory) this.f19989b).lambda$onDataSetChanged$0();
                return;
            case 2:
                ((FilesMigrationService.AnonymousClass1) this.f19989b).lambda$run$0();
                return;
            case 3:
                ((ImageLoader.AnonymousClass6) this.f19989b).lambda$onReceive$0();
                return;
            case 4:
                ((LocaleController.TimeZoneChangedReceiver) this.f19989b).lambda$onReceive$0();
                return;
            case 5:
                ((MediaController.AnonymousClass7) this.f19989b).lambda$onSurfaceDestroyed$0();
                return;
            case 6:
                ((MediaController.AnonymousClass9) this.f19989b).lambda$onSurfaceDestroyed$0();
                return;
            case 7:
                ((MediaController.GalleryObserverInternal) this.f19989b).lambda$scheduleReloadRunnable$0();
                return;
            case 8:
                ((MediaController.MusicListenReporter) this.f19989b).report();
                return;
            case 9:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.f19989b);
                return;
            case 10:
                ((TelegramMediaSession.SessionCallback) this.f19989b).lambda$notifyPlayStateForNotificationRefresh$0();
                return;
            case 11:
                ANRDetector.a((ANRDetector) this.f19989b);
                return;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.f19989b);
                return;
            case 13:
                BotFullscreenButtons.a((BotFullscreenButtons) this.f19989b);
                return;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.f19989b).invalidateSelf();
                return;
            case 15:
                CodeHighlighting.a((CodeHighlighting.LockedSpannableString) this.f19989b);
                return;
            case 16:
                CompoundEmoji.CompoundEmojiDrawable.a((CompoundEmoji.CompoundEmojiDrawable) this.f19989b);
                return;
            case 17:
                ((ContactsLoadingObserver) this.f19989b).lambda$new$1();
                return;
            case 18:
                ((DispatchQueueMainThreadSync) this.f19989b).lambda$recycle$0();
                return;
            case 19:
                ((FactCheckController) this.f19989b).loadMissing();
                return;
            case 20:
                FileLoaderPriorityQueue.a((FileLoaderPriorityQueue) this.f19989b);
                return;
            case 21:
                ((FilePathDatabase) this.f19989b).lambda$clear$3();
                return;
            case 22:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.f19989b);
                return;
            case 23:
                ((ImageReceiver) this.f19989b).invalidate();
                return;
            case 24:
                MediaController.lambda$saveFile$46((org.telegram.ui.ActionBar.c2) this.f19989b);
                return;
            case 25:
                ((org.telegram.ui.Components.kc) this.f19989b).f();
                return;
            case 26:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.f19989b);
                return;
            case 27:
                MessagesController.lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f19989b);
                return;
            case 28:
                MessagesController.lambda$performLogout$321((TLObject) this.f19989b);
                return;
            default:
                MessagesController.lambda$setContentSettings$503((TLRPC.TL_error) this.f19989b);
                return;
        }
    }
}
