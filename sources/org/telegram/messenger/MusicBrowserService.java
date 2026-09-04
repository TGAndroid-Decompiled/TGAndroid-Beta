package org.telegram.messenger;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Process;
import android.service.media.MediaBrowserService;
import android.widget.Toast;
import java.util.List;
public class MusicBrowserService extends MediaBrowserService {
    private static final String MEDIA_ID_ROOT = "__ROOT__";

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationLoader.postInitApplication();
        setSessionToken(TelegramMediaSession.getInstance(this).getFrameworkSessionToken());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
        if (str == null) {
            return null;
        }
        if ((1000 != i10 && Process.myUid() != i10 && !PackageValidator.isKnownCaller(this, str, i10)) || TelegramMediaSession.getInstance(this).isPasscodeLocked()) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot("__ROOT__", TelegramMediaSession.getInstance(this).buildRootHints());
    }

    @Override
    public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        TelegramMediaSession telegramMediaSession = TelegramMediaSession.getInstance(this);
        if (telegramMediaSession.isPasscodeLocked()) {
            Toast.makeText(getApplicationContext(), LocaleController.getString(R.string.EnterYourTelegramPasscode), 1).show();
            stopSelf();
            result.detach();
            return;
        }
        result.detach();
        telegramMediaSession.loadBrowseChildren(str, new c0(result, 8));
    }
}
