package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;
public final class ExtendedDefaultDataSourceFactory implements y73 {
    private final y73 baseDataSourceFactory;
    private final Context context;
    private final w0c listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, w0c w0cVar, y73 y73Var) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = w0cVar;
        this.baseDataSourceFactory = y73Var;
    }

    @Override
    public ExtendedDefaultDataSource createDataSource() {
        return new ExtendedDefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource(), this.mtprotoUris);
    }

    public void putDocumentUri(long j, Uri uri) {
        this.mtprotoUris.put(j, uri);
    }

    public ExtendedDefaultDataSourceFactory(android.content.Context r3, java.lang.String r4, defpackage.w0c r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory.<init>(android.content.Context, java.lang.String, w0c):void");
    }

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (w0c) null);
    }
}
