package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class ExtendedDefaultDataSource implements a83 {
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String TAG = "ExtendedDefaultDataSource";
    private a83 assetDataSource;
    private final a83 baseDataSource;
    private a83 contentDataSource;
    private final Context context;
    private a83 dataSchemeDataSource;
    private a83 dataSource;
    private a83 encryptedFileDataSource;
    private a83 fileDataSource;
    private final LongSparseArray<Uri> mtprotoUris;
    private a83 rawResourceDataSource;
    private a83 rtmpDataSource;
    private kd4 streamLoadOperation;
    private final List<w0c> transferListeners;

    public ExtendedDefaultDataSource(Context context, a83 a83Var, LongSparseArray<Uri> longSparseArray) {
        this.context = context.getApplicationContext();
        a83Var.getClass();
        this.baseDataSource = a83Var;
        this.transferListeners = new ArrayList();
        this.mtprotoUris = longSparseArray;
    }

    private void addListenersToDataSource(a83 a83Var) {
        for (int i = 0; i < this.transferListeners.size(); i++) {
            a83Var.addTransferListener(this.transferListeners.get(i));
        }
    }

    private a83 getAssetDataSource() {
        if (this.assetDataSource == null) {
            ly lyVar = new ly(this.context);
            this.assetDataSource = lyVar;
            addListenersToDataSource(lyVar);
        }
        return this.assetDataSource;
    }

    private a83 getContentDataSource() {
        if (this.contentDataSource == null) {
            jw2 jw2Var = new jw2(this.context);
            this.contentDataSource = jw2Var;
            addListenersToDataSource(jw2Var);
        }
        return this.contentDataSource;
    }

    private a83 getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            qg0 qg0Var = new qg0(false);
            this.dataSchemeDataSource = qg0Var;
            addListenersToDataSource(qg0Var);
        }
        return this.dataSchemeDataSource;
    }

    private a83 getEncryptedFileDataSource() {
        if (this.encryptedFileDataSource == null) {
            EncryptedFileDataSource encryptedFileDataSource = new EncryptedFileDataSource();
            this.encryptedFileDataSource = encryptedFileDataSource;
            addListenersToDataSource(encryptedFileDataSource);
        }
        return this.encryptedFileDataSource;
    }

    private a83 getFileDataSource() {
        if (this.fileDataSource == null) {
            qg0 qg0Var = new qg0(false);
            this.fileDataSource = qg0Var;
            addListenersToDataSource(qg0Var);
        }
        return this.fileDataSource;
    }

    private a83 getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            l19 l19Var = new l19(this.context);
            this.rawResourceDataSource = l19Var;
            addListenersToDataSource(l19Var);
        }
        return this.rawResourceDataSource;
    }

    private a83 getRtmpDataSource() {
        a83 a83Var = this.rtmpDataSource;
        if (a83Var == null) {
            try {
                a83 a83Var2 = (a83) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.rtmpDataSource = a83Var2;
                addListenersToDataSource(a83Var2);
            } catch (ClassNotFoundException unused) {
                Log.w("ExtendedDefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                rjb.k("Error instantiating RTMP extension", e);
                return null;
            }
            a83 a83Var3 = this.rtmpDataSource;
            if (a83Var3 == null) {
                a83 a83Var4 = this.baseDataSource;
                this.rtmpDataSource = a83Var4;
                return a83Var4;
            }
            return a83Var3;
        }
        return a83Var;
    }

    private a83 getStreamDataSource() {
        if (this.streamLoadOperation == null) {
            kd4 kd4Var = new kd4();
            this.streamLoadOperation = kd4Var;
            addListenersToDataSource(kd4Var);
        }
        return this.streamLoadOperation;
    }

    private void maybeAddListenerToDataSource(a83 a83Var, w0c w0cVar) {
        if (a83Var != null) {
            a83Var.addTransferListener(w0cVar);
        }
    }

    @Override
    public void addTransferListener(w0c w0cVar) {
        this.baseDataSource.addTransferListener(w0cVar);
        this.transferListeners.add(w0cVar);
        maybeAddListenerToDataSource(this.fileDataSource, w0cVar);
        maybeAddListenerToDataSource(this.assetDataSource, w0cVar);
        maybeAddListenerToDataSource(this.contentDataSource, w0cVar);
        maybeAddListenerToDataSource(this.rtmpDataSource, w0cVar);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, w0cVar);
        maybeAddListenerToDataSource(this.rawResourceDataSource, w0cVar);
    }

    @Override
    public void close() {
        a83 a83Var = this.dataSource;
        if (a83Var != null) {
            try {
                a83Var.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        a83 a83Var = this.dataSource;
        if (a83Var == null) {
            return Collections.EMPTY_MAP;
        }
        return a83Var.getResponseHeaders();
    }

    @Override
    public Uri getUri() {
        a83 a83Var = this.dataSource;
        if (a83Var == null) {
            return null;
        }
        return a83Var.getUri();
    }

    @Override
    public long open(g83 g83Var) {
        boolean z;
        a83 fileDataSource;
        if (this.dataSource == null) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        Uri uri = g83Var.a;
        if ("mtproto".equals(uri.getScheme())) {
            uri = this.mtprotoUris.get(Long.parseLong(g83Var.a.toString().substring(8)));
            f83 a = g83Var.a();
            a.a = uri;
            g83Var = a.a();
        }
        String scheme = uri.getScheme();
        String str = hac.a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !Objects.equals(scheme2, "file")) {
            if ("tg".equals(scheme)) {
                fileDataSource = getStreamDataSource();
                this.dataSource = fileDataSource;
            } else if ("asset".equals(scheme)) {
                fileDataSource = getAssetDataSource();
                this.dataSource = fileDataSource;
            } else if ("content".equals(scheme)) {
                fileDataSource = getContentDataSource();
                this.dataSource = fileDataSource;
            } else if ("rtmp".equals(scheme)) {
                fileDataSource = getRtmpDataSource();
                this.dataSource = fileDataSource;
            } else if ("data".equals(scheme)) {
                fileDataSource = getDataSchemeDataSource();
                this.dataSource = fileDataSource;
            } else if ("rawresource".equals(scheme)) {
                fileDataSource = getRawResourceDataSource();
                this.dataSource = fileDataSource;
            } else {
                fileDataSource = this.baseDataSource;
                this.dataSource = fileDataSource;
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                fileDataSource = getAssetDataSource();
                this.dataSource = fileDataSource;
            } else if (uri.getPath().endsWith(".enc")) {
                fileDataSource = getEncryptedFileDataSource();
                this.dataSource = fileDataSource;
            } else {
                fileDataSource = getFileDataSource();
                this.dataSource = fileDataSource;
            }
        }
        return fileDataSource.open(g83Var);
    }

    @Override
    public int read(byte[] bArr, int i, int i2) {
        a83 a83Var = this.dataSource;
        a83Var.getClass();
        return a83Var.read(bArr, i, i2);
    }

    public ExtendedDefaultDataSource(Context context, String str, int i, int i2, boolean z) {
        this(context, new ic3(str, i, i2, z, new wm4()), (LongSparseArray<Uri>) null);
    }

    public ExtendedDefaultDataSource(Context context, String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }

    @Deprecated
    public ExtendedDefaultDataSource(Context context, w0c w0cVar, a83 a83Var, LongSparseArray<Uri> longSparseArray) {
        this(context, a83Var, longSparseArray);
        if (w0cVar != null) {
            this.transferListeners.add(w0cVar);
            a83Var.addTransferListener(w0cVar);
        }
    }
}
