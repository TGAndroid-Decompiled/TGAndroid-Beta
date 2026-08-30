package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;
import g5.l;
import g5.v0;
public final class ExtendedDefaultDataSourceFactory implements l {
    private final l baseDataSourceFactory;
    private final Context context;
    private final v0 listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (v0) null);
    }

    public void putDocumentUri(long j10, Uri uri) {
        this.mtprotoUris.put(j10, uri);
    }

    public ExtendedDefaultDataSourceFactory(android.content.Context r2, java.lang.String r3, g5.v0 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory.<init>(android.content.Context, java.lang.String, g5.v0):void");
    }

    @Override
    public ExtendedDefaultDataSource createDataSource() {
        return new ExtendedDefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource(), this.mtprotoUris);
    }

    public ExtendedDefaultDataSourceFactory(Context context, v0 v0Var, l lVar) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = v0Var;
        this.baseDataSourceFactory = lVar;
    }
}
