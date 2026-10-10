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
public final class f1 implements Runnable {
    public final int f17802a;
    public final Object f17803b;

    public f1(Object obj, int i10) {
        this.f17802a = i10;
        this.f17803b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17802a) {
            case 0:
                CompoundEmoji.DrawableInfo.a((CompoundEmoji.DrawableInfo) this.f17803b);
                return;
            case 1:
                ((FeedRemoteViewsFactory) this.f17803b).lambda$onDataSetChanged$0();
                return;
            case 2:
                ((FilesMigrationService.AnonymousClass1) this.f17803b).lambda$run$0();
                return;
            case 3:
                ((ImageLoader.AnonymousClass6) this.f17803b).lambda$onReceive$0();
                return;
            case 4:
                ((LocaleController.TimeZoneChangedReceiver) this.f17803b).lambda$onReceive$0();
                return;
            case 5:
                ((MediaController.AnonymousClass7) this.f17803b).lambda$onSurfaceDestroyed$0();
                return;
            case 6:
                ((MediaController.AnonymousClass9) this.f17803b).lambda$onSurfaceDestroyed$0();
                return;
            case 7:
                ((MediaController.GalleryObserverInternal) this.f17803b).lambda$scheduleReloadRunnable$0();
                return;
            case 8:
                ((MediaController.MusicListenReporter) this.f17803b).report();
                return;
            case 9:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.f17803b);
                return;
            case 10:
                ((TelegramMediaSession.SessionCallback) this.f17803b).lambda$notifyPlayStateForNotificationRefresh$0();
                return;
            case 11:
                ANRDetector.a((ANRDetector) this.f17803b);
                return;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.f17803b);
                return;
            case 13:
                BotFullscreenButtons.a((BotFullscreenButtons) this.f17803b);
                return;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.f17803b).invalidateSelf();
                return;
            case 15:
                CodeHighlighting.a((CodeHighlighting.LockedSpannableString) this.f17803b);
                return;
            case 16:
                CompoundEmoji.CompoundEmojiDrawable.a((CompoundEmoji.CompoundEmojiDrawable) this.f17803b);
                return;
            case 17:
                ContactsLoadingObserver.b((ContactsLoadingObserver) this.f17803b);
                return;
            case 18:
                ((FactCheckController) this.f17803b).loadMissing();
                return;
            case 19:
                FileLoaderPriorityQueue.a((FileLoaderPriorityQueue) this.f17803b);
                return;
            case 20:
                ((FilePathDatabase) this.f17803b).lambda$clear$3();
                return;
            case 21:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.f17803b);
                return;
            case 22:
                ((ImageReceiver) this.f17803b).invalidate();
                return;
            case 23:
                MediaController.lambda$saveFile$46((org.telegram.ui.ActionBar.b2) this.f17803b);
                return;
            case 24:
                ((org.telegram.ui.Components.rc) this.f17803b).f();
                return;
            case 25:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.f17803b);
                return;
            case 26:
                MessagesController.lambda$setContentSettings$506((TLRPC.TL_error) this.f17803b);
                return;
            case 27:
                MessagesController.lambda$performLogout$320((TLObject) this.f17803b);
                return;
            case 28:
                MessagesController.lambda$convertToGigaGroup$267((MessagesStorage.BooleanCallback) this.f17803b);
                return;
            default:
                ((MusicPlayerService) this.f17803b).stopSelf();
                return;
        }
    }
}
