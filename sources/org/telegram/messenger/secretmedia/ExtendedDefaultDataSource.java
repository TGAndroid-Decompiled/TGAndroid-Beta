package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LongSparseArray;
import g5.c;
import g5.g;
import g5.i;
import g5.m;
import g5.p;
import g5.r0;
import g5.v0;
import g5.x;
import h5.a;
import h5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.FileStreamLoadOperation;
public final class ExtendedDefaultDataSource implements m {
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String TAG = "ExtendedDefaultDataSource";
    private m assetDataSource;
    private final m baseDataSource;
    private m contentDataSource;
    private final Context context;
    private m dataSchemeDataSource;
    private m dataSource;
    private m encryptedFileDataSource;
    private m fileDataSource;
    private final LongSparseArray<Uri> mtprotoUris;
    private m rawResourceDataSource;
    private m rtmpDataSource;
    private FileStreamLoadOperation streamLoadOperation;
    private final List<v0> transferListeners;

    public ExtendedDefaultDataSource(Context context, String str, boolean z4) {
        this(context, str, 8000, 8000, z4);
    }

    private void addListenersToDataSource(m mVar) {
        for (int i10 = 0; i10 < this.transferListeners.size(); i10++) {
            mVar.addTransferListener(this.transferListeners.get(i10));
        }
    }

    private m getAssetDataSource() {
        if (this.assetDataSource == null) {
            c cVar = new c(this.context);
            this.assetDataSource = cVar;
            addListenersToDataSource(cVar);
        }
        return this.assetDataSource;
    }

    private m getContentDataSource() {
        if (this.contentDataSource == null) {
            i iVar = new i(this.context);
            this.contentDataSource = iVar;
            addListenersToDataSource(iVar);
        }
        return this.contentDataSource;
    }

    private m getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            g gVar = new g(false);
            this.dataSchemeDataSource = gVar;
            addListenersToDataSource(gVar);
        }
        return this.dataSchemeDataSource;
    }

    private m getEncryptedFileDataSource() {
        if (this.encryptedFileDataSource == null) {
            EncryptedFileDataSource encryptedFileDataSource = new EncryptedFileDataSource();
            this.encryptedFileDataSource = encryptedFileDataSource;
            addListenersToDataSource(encryptedFileDataSource);
        }
        return this.encryptedFileDataSource;
    }

    private m getFileDataSource() {
        if (this.fileDataSource == null) {
            g gVar = new g(false);
            this.fileDataSource = gVar;
            addListenersToDataSource(gVar);
        }
        return this.fileDataSource;
    }

    private m getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            r0 r0Var = new r0(this.context);
            this.rawResourceDataSource = r0Var;
            addListenersToDataSource(r0Var);
        }
        return this.rawResourceDataSource;
    }

    private m getRtmpDataSource() {
        if (this.rtmpDataSource == null) {
            try {
                m mVar = (m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.rtmpDataSource = mVar;
                addListenersToDataSource(mVar);
            } catch (ClassNotFoundException unused) {
                a.K("ExtendedDefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.rtmpDataSource == null) {
                this.rtmpDataSource = this.baseDataSource;
            }
        }
        return this.rtmpDataSource;
    }

    private m getStreamDataSource() {
        if (this.streamLoadOperation == null) {
            FileStreamLoadOperation fileStreamLoadOperation = new FileStreamLoadOperation();
            this.streamLoadOperation = fileStreamLoadOperation;
            addListenersToDataSource(fileStreamLoadOperation);
        }
        return this.streamLoadOperation;
    }

    private void maybeAddListenerToDataSource(m mVar, v0 v0Var) {
        if (mVar != null) {
            mVar.addTransferListener(v0Var);
        }
    }

    @Override
    public void addTransferListener(v0 v0Var) {
        this.baseDataSource.addTransferListener(v0Var);
        this.transferListeners.add(v0Var);
        maybeAddListenerToDataSource(this.fileDataSource, v0Var);
        maybeAddListenerToDataSource(this.assetDataSource, v0Var);
        maybeAddListenerToDataSource(this.contentDataSource, v0Var);
        maybeAddListenerToDataSource(this.rtmpDataSource, v0Var);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, v0Var);
        maybeAddListenerToDataSource(this.rawResourceDataSource, v0Var);
    }

    @Override
    public void close() {
        m mVar = this.dataSource;
        if (mVar != null) {
            try {
                mVar.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        m mVar = this.dataSource;
        if (mVar == null) {
            return Collections.EMPTY_MAP;
        }
        return mVar.getResponseHeaders();
    }

    @Override
    public Uri getUri() {
        m mVar = this.dataSource;
        if (mVar == null) {
            return null;
        }
        return mVar.getUri();
    }

    @Override
    public long open(p pVar) {
        boolean z4;
        if (this.dataSource == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        a.i(z4);
        Uri uri = pVar.f6401a;
        if ("mtproto".equals(uri.getScheme())) {
            uri = this.mtprotoUris.get(Long.parseLong(pVar.f6401a.toString().substring(8)));
            c4.c a2 = pVar.a();
            a2.e = uri;
            pVar = a2.d();
        }
        String scheme = uri.getScheme();
        int i10 = d0.f6924a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
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
        return this.dataSource.open(pVar);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        m mVar = this.dataSource;
        mVar.getClass();
        return mVar.read(bArr, i10, i11);
    }

    public ExtendedDefaultDataSource(Context context, String str, int i10, int i11, boolean z4) {
        this(context, new x(str, i10, i11, z4, null), (LongSparseArray<Uri>) null);
    }

    public ExtendedDefaultDataSource(Context context, m mVar, LongSparseArray<Uri> longSparseArray) {
        this.context = context.getApplicationContext();
        mVar.getClass();
        this.baseDataSource = mVar;
        this.transferListeners = new ArrayList();
        this.mtprotoUris = longSparseArray;
    }

    @Deprecated
    public ExtendedDefaultDataSource(Context context, v0 v0Var, m mVar, LongSparseArray<Uri> longSparseArray) {
        this(context, mVar, longSparseArray);
        if (v0Var != null) {
            this.transferListeners.add(v0Var);
            mVar.addTransferListener(v0Var);
        }
    }
}
