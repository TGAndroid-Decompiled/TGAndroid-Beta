package org.telegram.messenger;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h1 implements Runnable {
    public final int f18491a;
    public final Object f18492b;

    public h1(Object obj, int i10) {
        this.f18491a = i10;
        this.f18492b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18491a) {
            case 0:
                CompoundEmoji.DrawableInfo.a((CompoundEmoji.DrawableInfo) this.f18492b);
                return;
            case 1:
                ((FeedRemoteViewsFactory) this.f18492b).lambda$onDataSetChanged$0();
                return;
            case 2:
                ((FilesMigrationService.AnonymousClass1) this.f18492b).lambda$run$0();
                return;
            case 3:
                ((ImageLoader.AnonymousClass6) this.f18492b).lambda$onReceive$0();
                return;
            case 4:
                ((LocaleController.TimeZoneChangedReceiver) this.f18492b).lambda$onReceive$0();
                return;
            case 5:
                ((MediaController.AnonymousClass7) this.f18492b).lambda$onSurfaceDestroyed$0();
                return;
            case 6:
                ((MediaController.AnonymousClass9) this.f18492b).lambda$onSurfaceDestroyed$0();
                return;
            case 7:
                ((MediaController.GalleryObserverInternal) this.f18492b).lambda$scheduleReloadRunnable$0();
                return;
            case 8:
                ((MediaController.MusicListenReporter) this.f18492b).report();
                return;
            case 9:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.f18492b);
                return;
            case 10:
                ((TelegramMediaSession.SessionCallback) this.f18492b).lambda$notifyPlayStateForNotificationRefresh$0();
                return;
            case 11:
                ANRDetector.a((ANRDetector) this.f18492b);
                return;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.f18492b);
                return;
            case 13:
                BotFullscreenButtons.a((BotFullscreenButtons) this.f18492b);
                return;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.f18492b).invalidateSelf();
                return;
            case 15:
                CompoundEmoji.CompoundEmojiDrawable.a((CompoundEmoji.CompoundEmojiDrawable) this.f18492b);
                return;
            case 16:
                ContactsLoadingObserver.b((ContactsLoadingObserver) this.f18492b);
                return;
            case 17:
                ((FactCheckController) this.f18492b).loadMissing();
                return;
            case 18:
                FileLoaderPriorityQueue.a((FileLoaderPriorityQueue) this.f18492b);
                return;
            case 19:
                ((FilePathDatabase) this.f18492b).lambda$clear$3();
                return;
            case 20:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.f18492b);
                return;
            case 21:
                ((ImageReceiver) this.f18492b).invalidate();
                return;
            case 22:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.b2) this.f18492b);
                return;
            case 23:
                ((org.telegram.ui.Components.oc) this.f18492b).f();
                return;
            case 24:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.f18492b);
                return;
            case 25:
                MessagesController.lambda$setContentSettings$506((TLRPC.TL_error) this.f18492b);
                return;
            case 26:
                MessagesController.lambda$performLogout$320((TLObject) this.f18492b);
                return;
            case 27:
                MessagesController.lambda$convertToGigaGroup$267((MessagesStorage.BooleanCallback) this.f18492b);
                return;
            case 28:
                ((MusicPlayerService) this.f18492b).stopSelf();
                return;
            default:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f18492b);
                return;
        }
    }
}
