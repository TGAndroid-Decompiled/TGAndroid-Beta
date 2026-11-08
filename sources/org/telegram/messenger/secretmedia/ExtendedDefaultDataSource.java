package org.telegram.messenger.secretmedia;

import a8.ia;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import h2.m0;
import j$.util.Objects;
import j2.b;
import j2.b0;
import j2.c;
import j2.d0;
import j2.e;
import j2.h;
import j2.l;
import j2.m;
import j2.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.s8;
public final class ExtendedDefaultDataSource implements h {
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String TAG = "ExtendedDefaultDataSource";
    private h assetDataSource;
    private final h baseDataSource;
    private h contentDataSource;
    private final Context context;
    private h dataSchemeDataSource;
    private h dataSource;
    private h encryptedFileDataSource;
    private h fileDataSource;
    private final LongSparseArray<Uri> mtprotoUris;
    private h rawResourceDataSource;
    private h rtmpDataSource;
    private s8 streamLoadOperation;
    private final List<d0> transferListeners;

    public ExtendedDefaultDataSource(Context context, String str, boolean z9) {
        this(context, str, 8000, 8000, z9);
    }

    private void addListenersToDataSource(h hVar) {
        for (int i7 = 0; i7 < this.transferListeners.size(); i7++) {
            hVar.addTransferListener(this.transferListeners.get(i7));
        }
    }

    private h getAssetDataSource() {
        if (this.assetDataSource == null) {
            b bVar = new b(this.context);
            this.assetDataSource = bVar;
            addListenersToDataSource(bVar);
        }
        return this.assetDataSource;
    }

    private h getContentDataSource() {
        if (this.contentDataSource == null) {
            e eVar = new e(this.context);
            this.contentDataSource = eVar;
            addListenersToDataSource(eVar);
        }
        return this.contentDataSource;
    }

    private h getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            c cVar = new c(false);
            this.dataSchemeDataSource = cVar;
            addListenersToDataSource(cVar);
        }
        return this.dataSchemeDataSource;
    }

    private h getEncryptedFileDataSource() {
        if (this.encryptedFileDataSource == null) {
            EncryptedFileDataSource encryptedFileDataSource = new EncryptedFileDataSource();
            this.encryptedFileDataSource = encryptedFileDataSource;
            addListenersToDataSource(encryptedFileDataSource);
        }
        return this.encryptedFileDataSource;
    }

    private h getFileDataSource() {
        if (this.fileDataSource == null) {
            c cVar = new c(false);
            this.fileDataSource = cVar;
            addListenersToDataSource(cVar);
        }
        return this.fileDataSource;
    }

    private h getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            b0 b0Var = new b0(this.context);
            this.rawResourceDataSource = b0Var;
            addListenersToDataSource(b0Var);
        }
        return this.rawResourceDataSource;
    }

    private h getRtmpDataSource() {
        if (this.rtmpDataSource == null) {
            try {
                h hVar = (h) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.rtmpDataSource = hVar;
                addListenersToDataSource(hVar);
            } catch (ClassNotFoundException unused) {
                Log.w("ExtendedDefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.rtmpDataSource == null) {
                this.rtmpDataSource = this.baseDataSource;
            }
        }
        return this.rtmpDataSource;
    }

    private h getStreamDataSource() {
        if (this.streamLoadOperation == null) {
            s8 s8Var = new s8();
            this.streamLoadOperation = s8Var;
            addListenersToDataSource(s8Var);
        }
        return this.streamLoadOperation;
    }

    private void maybeAddListenerToDataSource(h hVar, d0 d0Var) {
        if (hVar != null) {
            hVar.addTransferListener(d0Var);
        }
    }

    @Override
    public void addTransferListener(d0 d0Var) {
        this.baseDataSource.addTransferListener(d0Var);
        this.transferListeners.add(d0Var);
        maybeAddListenerToDataSource(this.fileDataSource, d0Var);
        maybeAddListenerToDataSource(this.assetDataSource, d0Var);
        maybeAddListenerToDataSource(this.contentDataSource, d0Var);
        maybeAddListenerToDataSource(this.rtmpDataSource, d0Var);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, d0Var);
        maybeAddListenerToDataSource(this.rawResourceDataSource, d0Var);
    }

    @Override
    public void close() {
        h hVar = this.dataSource;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        h hVar = this.dataSource;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.getResponseHeaders();
    }

    @Override
    public Uri getUri() {
        h hVar = this.dataSource;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override
    public long open(m mVar) {
        boolean z9;
        if (this.dataSource == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        Uri uri = mVar.f16449a;
        if ("mtproto".equals(uri.getScheme())) {
            uri = this.mtprotoUris.get(Long.parseLong(mVar.f16449a.toString().substring(8)));
            l a10 = mVar.a();
            a10.f16445e = uri;
            mVar = a10.d();
        }
        String scheme = uri.getScheme();
        String str = m0.f14112a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !Objects.equals(scheme2, "file")) {
            if ("tg".equals(scheme)) {
                this.dataSource = getStreamDataSource();
            } else if ("asset".equals(scheme)) {
                this.dataSource = getAssetDataSource();
            } else if ("content".equals(scheme)) {
                this.dataSource = getContentDataSource();
            } else if ("rtmp".equals(scheme)) {
                this.dataSource = getRtmpDataSource();
            } else if ("data".equals(scheme)) {
                this.dataSource = getDataSchemeDataSource();
            } else if ("rawresource".equals(scheme)) {
                this.dataSource = getRawResourceDataSource();
            } else {
                this.dataSource = this.baseDataSource;
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.dataSource = getAssetDataSource();
            } else if (uri.getPath().endsWith(".enc")) {
                this.dataSource = getEncryptedFileDataSource();
            } else {
                this.dataSource = getFileDataSource();
            }
        }
        return this.dataSource.open(mVar);
    }

    @Override
    public int read(byte[] bArr, int i7, int i10) {
        h hVar = this.dataSource;
        hVar.getClass();
        return hVar.read(bArr, i7, i10);
    }

    public ExtendedDefaultDataSource(Context context, String str, int i7, int i10, boolean z9) {
        this(context, new s(str, i7, i10, z9, new wf.b(24)), (LongSparseArray<Uri>) null);
    }

    public ExtendedDefaultDataSource(Context context, h hVar, LongSparseArray<Uri> longSparseArray) {
        this.context = context.getApplicationContext();
        hVar.getClass();
        this.baseDataSource = hVar;
        this.transferListeners = new ArrayList();
        this.mtprotoUris = longSparseArray;
    }

    @Deprecated
    public ExtendedDefaultDataSource(Context context, d0 d0Var, h hVar, LongSparseArray<Uri> longSparseArray) {
        this(context, hVar, longSparseArray);
        if (d0Var != null) {
            this.transferListeners.add(d0Var);
            hVar.addTransferListener(d0Var);
        }
    }
}
