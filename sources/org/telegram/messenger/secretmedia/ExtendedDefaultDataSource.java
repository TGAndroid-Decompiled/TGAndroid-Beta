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
public final class ExtendedDefaultDataSource implements h73 {
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String TAG = "ExtendedDefaultDataSource";
    private h73 assetDataSource;
    private final h73 baseDataSource;
    private h73 contentDataSource;
    private final Context context;
    private h73 dataSchemeDataSource;
    private h73 dataSource;
    private h73 encryptedFileDataSource;
    private h73 fileDataSource;
    private final LongSparseArray<Uri> mtprotoUris;
    private h73 rawResourceDataSource;
    private h73 rtmpDataSource;
    private hd4 streamLoadOperation;
    private final List<v2c> transferListeners;

    public ExtendedDefaultDataSource(Context context, h73 h73Var, LongSparseArray<Uri> longSparseArray) {
        this.context = context.getApplicationContext();
        h73Var.getClass();
        this.baseDataSource = h73Var;
        this.transferListeners = new ArrayList();
        this.mtprotoUris = longSparseArray;
    }

    private void addListenersToDataSource(h73 h73Var) {
        for (int i = 0; i < this.transferListeners.size(); i++) {
            h73Var.addTransferListener(this.transferListeners.get(i));
        }
    }

    private h73 getAssetDataSource() {
        if (this.assetDataSource == null) {
            lx lxVar = new lx(this.context);
            this.assetDataSource = lxVar;
            addListenersToDataSource(lxVar);
        }
        return this.assetDataSource;
    }

    private h73 getContentDataSource() {
        if (this.contentDataSource == null) {
            tv2 tv2Var = new tv2(this.context);
            this.contentDataSource = tv2Var;
            addListenersToDataSource(tv2Var);
        }
        return this.contentDataSource;
    }

    private h73 getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            sf0 sf0Var = new sf0(false);
            this.dataSchemeDataSource = sf0Var;
            addListenersToDataSource(sf0Var);
        }
        return this.dataSchemeDataSource;
    }

    private h73 getEncryptedFileDataSource() {
        if (this.encryptedFileDataSource == null) {
            EncryptedFileDataSource encryptedFileDataSource = new EncryptedFileDataSource();
            this.encryptedFileDataSource = encryptedFileDataSource;
            addListenersToDataSource(encryptedFileDataSource);
        }
        return this.encryptedFileDataSource;
    }

    private h73 getFileDataSource() {
        if (this.fileDataSource == null) {
            sf0 sf0Var = new sf0(false);
            this.fileDataSource = sf0Var;
            addListenersToDataSource(sf0Var);
        }
        return this.fileDataSource;
    }

    private h73 getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            x29 x29Var = new x29(this.context);
            this.rawResourceDataSource = x29Var;
            addListenersToDataSource(x29Var);
        }
        return this.rawResourceDataSource;
    }

    private h73 getRtmpDataSource() {
        h73 h73Var = this.rtmpDataSource;
        if (h73Var == null) {
            try {
                h73 h73Var2 = (h73) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.rtmpDataSource = h73Var2;
                addListenersToDataSource(h73Var2);
            } catch (ClassNotFoundException unused) {
                Log.w("ExtendedDefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                grb.j("Error instantiating RTMP extension", e);
                return null;
            }
            h73 h73Var3 = this.rtmpDataSource;
            if (h73Var3 == null) {
                h73 h73Var4 = this.baseDataSource;
                this.rtmpDataSource = h73Var4;
                return h73Var4;
            }
            return h73Var3;
        }
        return h73Var;
    }

    private h73 getStreamDataSource() {
        if (this.streamLoadOperation == null) {
            hd4 hd4Var = new hd4();
            this.streamLoadOperation = hd4Var;
            addListenersToDataSource(hd4Var);
        }
        return this.streamLoadOperation;
    }

    private void maybeAddListenerToDataSource(h73 h73Var, v2c v2cVar) {
        if (h73Var != null) {
            h73Var.addTransferListener(v2cVar);
        }
    }

    @Override
    public void addTransferListener(v2c v2cVar) {
        this.baseDataSource.addTransferListener(v2cVar);
        this.transferListeners.add(v2cVar);
        maybeAddListenerToDataSource(this.fileDataSource, v2cVar);
        maybeAddListenerToDataSource(this.assetDataSource, v2cVar);
        maybeAddListenerToDataSource(this.contentDataSource, v2cVar);
        maybeAddListenerToDataSource(this.rtmpDataSource, v2cVar);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, v2cVar);
        maybeAddListenerToDataSource(this.rawResourceDataSource, v2cVar);
    }

    @Override
    public void close() {
        h73 h73Var = this.dataSource;
        if (h73Var != null) {
            try {
                h73Var.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        h73 h73Var = this.dataSource;
        if (h73Var == null) {
            return Collections.EMPTY_MAP;
        }
        return h73Var.getResponseHeaders();
    }

    @Override
    public Uri getUri() {
        h73 h73Var = this.dataSource;
        if (h73Var == null) {
            return null;
        }
        return h73Var.getUri();
    }

    @Override
    public long open(n73 n73Var) {
        boolean z;
        h73 fileDataSource;
        if (this.dataSource == null) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        Uri uri = n73Var.a;
        if ("mtproto".equals(uri.getScheme())) {
            uri = this.mtprotoUris.get(Long.parseLong(n73Var.a.toString().substring(8)));
            m73 a = n73Var.a();
            a.a = uri;
            n73Var = a.a();
        }
        String scheme = uri.getScheme();
        String str = gcc.a;
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
        return fileDataSource.open(n73Var);
    }

    @Override
    public int read(byte[] bArr, int i, int i2) {
        h73 h73Var = this.dataSource;
        h73Var.getClass();
        return h73Var.read(bArr, i, i2);
    }

    public ExtendedDefaultDataSource(Context context, String str, int i, int i2, boolean z) {
        this(context, new pb3(str, i, i2, z, new um4()), (LongSparseArray<Uri>) null);
    }

    public ExtendedDefaultDataSource(Context context, String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }

    @Deprecated
    public ExtendedDefaultDataSource(Context context, v2c v2cVar, h73 h73Var, LongSparseArray<Uri> longSparseArray) {
        this(context, h73Var, longSparseArray);
        if (v2cVar != null) {
            this.transferListeners.add(v2cVar);
            h73Var.addTransferListener(v2cVar);
        }
    }
}
