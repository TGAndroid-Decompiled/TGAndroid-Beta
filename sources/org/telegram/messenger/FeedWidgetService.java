package org.telegram.messenger;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class FeedWidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new FeedRemoteViewsFactory(getApplicationContext(), intent);
    }
}
