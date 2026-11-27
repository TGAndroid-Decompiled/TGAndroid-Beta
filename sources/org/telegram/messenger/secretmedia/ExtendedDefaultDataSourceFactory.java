package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;
public final class ExtendedDefaultDataSourceFactory implements f73 {
    private final f73 baseDataSourceFactory;
    private final Context context;
    private final v2c listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, v2c v2cVar, f73 f73Var) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = v2cVar;
        this.baseDataSourceFactory = f73Var;
    }

    @Override
    public ExtendedDefaultDataSource createDataSource() {
        return new ExtendedDefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource(), this.mtprotoUris);
    }

    public void putDocumentUri(long j, Uri uri) {
        this.mtprotoUris.put(j, uri);
    }

    public ExtendedDefaultDataSourceFactory(android.content.Context r3, java.lang.String r4, defpackage.v2c r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory.<init>(android.content.Context, java.lang.String, v2c):void");
    }

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (v2c) null);
    }
}
