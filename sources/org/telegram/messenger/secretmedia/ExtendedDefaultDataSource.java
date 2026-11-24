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
public final class ExtendedDefaultDataSource implements o63 {
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String TAG = "ExtendedDefaultDataSource";
    private o63 assetDataSource;
    private final o63 baseDataSource;
    private o63 contentDataSource;
    private final Context context;
    private o63 dataSchemeDataSource;
    private o63 dataSource;
    private o63 encryptedFileDataSource;
    private o63 fileDataSource;
    private final LongSparseArray<Uri> mtprotoUris;
    private o63 rawResourceDataSource;
    private o63 rtmpDataSource;
    private kb4 streamLoadOperation;
    private final List<vyb> transferListeners;

    public ExtendedDefaultDataSource(Context context, o63 o63Var, LongSparseArray<Uri> longSparseArray) {
        this.context = context.getApplicationContext();
        o63Var.getClass();
        this.baseDataSource = o63Var;
        this.transferListeners = new ArrayList();
        this.mtprotoUris = longSparseArray;
    }

    private void addListenersToDataSource(o63 o63Var) {
        for (int i = 0; i < this.transferListeners.size(); i++) {
            o63Var.addTransferListener(this.transferListeners.get(i));
        }
    }

    private o63 getAssetDataSource() {
        if (this.assetDataSource == null) {
            kx kxVar = new kx(this.context);
            this.assetDataSource = kxVar;
            addListenersToDataSource(kxVar);
        }
        return this.assetDataSource;
    }

    private o63 getContentDataSource() {
        if (this.contentDataSource == null) {
            zu2 zu2Var = new zu2(this.context);
            this.contentDataSource = zu2Var;
            addListenersToDataSource(zu2Var);
        }
        return this.contentDataSource;
    }

    private o63 getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            qf0 qf0Var = new qf0(false);
            this.dataSchemeDataSource = qf0Var;
            addListenersToDataSource(qf0Var);
        }
        return this.dataSchemeDataSource;
    }

    private o63 getEncryptedFileDataSource() {
        if (this.encryptedFileDataSource == null) {
            EncryptedFileDataSource encryptedFileDataSource = new EncryptedFileDataSource();
            this.encryptedFileDataSource = encryptedFileDataSource;
            addListenersToDataSource(encryptedFileDataSource);
        }
        return this.encryptedFileDataSource;
    }

    private o63 getFileDataSource() {
        if (this.fileDataSource == null) {
            qf0 qf0Var = new qf0(false);
            this.fileDataSource = qf0Var;
            addListenersToDataSource(qf0Var);
        }
        return this.fileDataSource;
    }

    private o63 getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            kz8 kz8Var = new kz8(this.context);
            this.rawResourceDataSource = kz8Var;
            addListenersToDataSource(kz8Var);
        }
        return this.rawResourceDataSource;
    }

    private o63 getRtmpDataSource() {
        o63 o63Var = this.rtmpDataSource;
        if (o63Var == null) {
            try {
                o63 o63Var2 = (o63) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.rtmpDataSource = o63Var2;
                addListenersToDataSource(o63Var2);
            } catch (ClassNotFoundException unused) {
                Log.w("ExtendedDefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                fyb.j("Error instantiating RTMP extension", e);
                return null;
            }
            o63 o63Var3 = this.rtmpDataSource;
            if (o63Var3 == null) {
                o63 o63Var4 = this.baseDataSource;
                this.rtmpDataSource = o63Var4;
                return o63Var4;
            }
            return o63Var3;
        }
        return o63Var;
    }

    private o63 getStreamDataSource() {
        if (this.streamLoadOperation == null) {
            kb4 kb4Var = new kb4();
            this.streamLoadOperation = kb4Var;
            addListenersToDataSource(kb4Var);
        }
        return this.streamLoadOperation;
    }

    private void maybeAddListenerToDataSource(o63 o63Var, vyb vybVar) {
        if (o63Var != null) {
            o63Var.addTransferListener(vybVar);
        }
    }

    @Override
    public void addTransferListener(vyb vybVar) {
        this.baseDataSource.addTransferListener(vybVar);
        this.transferListeners.add(vybVar);
        maybeAddListenerToDataSource(this.fileDataSource, vybVar);
        maybeAddListenerToDataSource(this.assetDataSource, vybVar);
        maybeAddListenerToDataSource(this.contentDataSource, vybVar);
        maybeAddListenerToDataSource(this.rtmpDataSource, vybVar);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, vybVar);
        maybeAddListenerToDataSource(this.rawResourceDataSource, vybVar);
    }

    @Override
    public void close() {
        o63 o63Var = this.dataSource;
        if (o63Var != null) {
            try {
                o63Var.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        o63 o63Var = this.dataSource;
        if (o63Var == null) {
            return Collections.EMPTY_MAP;
        }
        return o63Var.getResponseHeaders();
    }

    @Override
    public Uri getUri() {
        o63 o63Var = this.dataSource;
        if (o63Var == null) {
            return null;
        }
        return o63Var.getUri();
    }

    @Override
    public long open(u63 u63Var) {
        boolean z;
        o63 fileDataSource;
        if (this.dataSource == null) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        Uri uri = u63Var.a;
        if ("mtproto".equals(uri.getScheme())) {
            uri = this.mtprotoUris.get(Long.parseLong(u63Var.a.toString().substring(8)));
            t63 a = u63Var.a();
            a.a = uri;
            u63Var = a.a();
        }
        String scheme = uri.getScheme();
        String str = g8c.a;
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
        return fileDataSource.open(u63Var);
    }

    @Override
    public int read(byte[] bArr, int i, int i2) {
        o63 o63Var = this.dataSource;
        o63Var.getClass();
        return o63Var.read(bArr, i, i2);
    }

    public ExtendedDefaultDataSource(Context context, String str, int i, int i2, boolean z) {
        this(context, new wa3(str, i, i2, z, new wk4()), (LongSparseArray<Uri>) null);
    }

    public ExtendedDefaultDataSource(Context context, String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }

    @Deprecated
    public ExtendedDefaultDataSource(Context context, vyb vybVar, o63 o63Var, LongSparseArray<Uri> longSparseArray) {
        this(context, o63Var, longSparseArray);
        if (vybVar != null) {
            this.transferListeners.add(vybVar);
            o63Var.addTransferListener(vybVar);
        }
    }
}
