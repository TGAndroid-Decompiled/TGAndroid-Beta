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
public final class j1 implements Runnable {
    public final int f20395a;
    public final Object f20396b;

    public j1(Object obj, int i10) {
        this.f20395a = i10;
        this.f20396b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20395a) {
            case 0:
                CompoundEmoji.DrawableInfo.a((CompoundEmoji.DrawableInfo) this.f20396b);
                return;
            case 1:
                ((FeedRemoteViewsFactory) this.f20396b).lambda$onDataSetChanged$0();
                return;
            case 2:
                ((FilesMigrationService.AnonymousClass1) this.f20396b).lambda$run$0();
                return;
            case 3:
                ((ImageLoader.AnonymousClass6) this.f20396b).lambda$onReceive$0();
                return;
            case 4:
                ((LocaleController.TimeZoneChangedReceiver) this.f20396b).lambda$onReceive$0();
                return;
            case 5:
                ((MediaController.AnonymousClass7) this.f20396b).lambda$onSurfaceDestroyed$0();
                return;
            case 6:
                ((MediaController.AnonymousClass9) this.f20396b).lambda$onSurfaceDestroyed$0();
                return;
            case 7:
                ((MediaController.GalleryObserverInternal) this.f20396b).lambda$scheduleReloadRunnable$0();
                return;
            case 8:
                ((MediaController.MusicListenReporter) this.f20396b).report();
                return;
            case 9:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.f20396b);
                return;
            case 10:
                ((TelegramMediaSession.SessionCallback) this.f20396b).lambda$notifyPlayStateForNotificationRefresh$0();
                return;
            case 11:
                ANRDetector.a((ANRDetector) this.f20396b);
                return;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.f20396b);
                return;
            case 13:
                BotFullscreenButtons.a((BotFullscreenButtons) this.f20396b);
                return;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.f20396b).invalidateSelf();
                return;
            case 15:
                CompoundEmoji.CompoundEmojiDrawable.a((CompoundEmoji.CompoundEmojiDrawable) this.f20396b);
                return;
            case 16:
                ContactsLoadingObserver.b((ContactsLoadingObserver) this.f20396b);
                return;
            case 17:
                ((FactCheckController) this.f20396b).loadMissing();
                return;
            case 18:
                ((FilePathDatabase) this.f20396b).lambda$clear$3();
                return;
            case 19:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.f20396b);
                return;
            case 20:
                ((ImageReceiver) this.f20396b).invalidate();
                return;
            case 21:
                MediaController.lambda$saveFile$49((org.telegram.ui.ActionBar.e2) this.f20396b);
                return;
            case 22:
                ((org.telegram.ui.Components.oc) this.f20396b).f();
                return;
            case 23:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.f20396b);
                return;
            case 24:
                MessagesController.lambda$performLogout$322((TLObject) this.f20396b);
                return;
            case 25:
                MessagesController.lambda$convertToGigaGroup$267((MessagesStorage.BooleanCallback) this.f20396b);
                return;
            case 26:
                MessagesController.lambda$setContentSettings$509((TLRPC.TL_error) this.f20396b);
                return;
            case 27:
                ((MusicPlayerService) this.f20396b).stopSelf();
                return;
            case 28:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f20396b);
                return;
            default:
                NotificationsSettingsFacade.b((NotificationsSettingsFacade) this.f20396b);
                return;
        }
    }
}
