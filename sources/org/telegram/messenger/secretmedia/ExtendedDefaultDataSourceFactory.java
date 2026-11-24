package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;
public final class ExtendedDefaultDataSourceFactory implements m63 {
    private final m63 baseDataSourceFactory;
    private final Context context;
    private final vyb listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, vyb vybVar, m63 m63Var) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = vybVar;
        this.baseDataSourceFactory = m63Var;
    }

    @Override
    public ExtendedDefaultDataSource createDataSource() {
        return new ExtendedDefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource(), this.mtprotoUris);
    }

    public void putDocumentUri(long j, Uri uri) {
        this.mtprotoUris.put(j, uri);
    }

    public ExtendedDefaultDataSourceFactory(android.content.Context r3, java.lang.String r4, defpackage.vyb r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory.<init>(android.content.Context, java.lang.String, vyb):void");
    }

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (vyb) null);
    }
}
