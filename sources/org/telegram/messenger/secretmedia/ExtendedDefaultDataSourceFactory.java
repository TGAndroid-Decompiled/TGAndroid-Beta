package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;
import g2.d0;
import g2.g;
public final class ExtendedDefaultDataSourceFactory implements g {
    private final g baseDataSourceFactory;
    private final Context context;
    private final d0 listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (d0) null);
    }

    public void putDocumentUri(long j10, Uri uri) {
        this.mtprotoUris.put(j10, uri);
    }

    public ExtendedDefaultDataSourceFactory(android.content.Context r2, java.lang.String r3, g2.d0 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory.<init>(android.content.Context, java.lang.String, g2.d0):void");
    }

    @Override
    public ExtendedDefaultDataSource createDataSource() {
        return new ExtendedDefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource(), this.mtprotoUris);
    }

    public ExtendedDefaultDataSourceFactory(Context context, d0 d0Var, g gVar) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = d0Var;
        this.baseDataSourceFactory = gVar;
    }
}
