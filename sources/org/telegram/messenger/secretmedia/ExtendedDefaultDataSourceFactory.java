package org.telegram.messenger.secretmedia;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.upstream.TransferListener;
public final class ExtendedDefaultDataSourceFactory implements DataSource.Factory {
    private final DataSource.Factory baseDataSourceFactory;
    private final Context context;
    private final TransferListener listener;

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (TransferListener) null);
    }

    public ExtendedDefaultDataSourceFactory(Context context, String str, TransferListener transferListener) {
        this(context, transferListener, new DefaultHttpDataSourceFactory(str, transferListener));
    }

    public ExtendedDefaultDataSourceFactory(Context context, TransferListener transferListener, DataSource.Factory factory) {
        this.context = context.getApplicationContext();
        this.listener = transferListener;
        this.baseDataSourceFactory = factory;
    }

    @Override
    public ExtendedDefaultDataSource createDataSource() {
        return new ExtendedDefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource());
    }
}
