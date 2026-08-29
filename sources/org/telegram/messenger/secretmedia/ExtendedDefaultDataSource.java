package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.c;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.y0;
import com.google.android.exoplayer2.upstream.z;
import f5.a;
import f5.d0;
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
    private final List<y0> transferListeners;

    public ExtendedDefaultDataSource(Context context, String str, boolean z10) {
        this(context, str, 8000, 8000, z10);
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
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.context);
            this.rawResourceDataSource = rawResourceDataSource;
            addListenersToDataSource(rawResourceDataSource);
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
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
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

    private void maybeAddListenerToDataSource(m mVar, y0 y0Var) {
        if (mVar != null) {
            mVar.addTransferListener(y0Var);
        }
    }

    @Override
    public void addTransferListener(y0 y0Var) {
        this.baseDataSource.addTransferListener(y0Var);
        this.transferListeners.add(y0Var);
        maybeAddListenerToDataSource(this.fileDataSource, y0Var);
        maybeAddListenerToDataSource(this.assetDataSource, y0Var);
        maybeAddListenerToDataSource(this.contentDataSource, y0Var);
        maybeAddListenerToDataSource(this.rtmpDataSource, y0Var);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, y0Var);
        maybeAddListenerToDataSource(this.rawResourceDataSource, y0Var);
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
    public long open(q qVar) {
        boolean z10;
        if (this.dataSource == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.i(z10);
        Uri uri = qVar.f3599a;
        if ("mtproto".equals(uri.getScheme())) {
            uri = this.mtprotoUris.get(Long.parseLong(qVar.f3599a.toString().substring(8)));
            qVar.f3599a = uri;
        }
        String scheme = uri.getScheme();
        int i10 = d0.f6579a;
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
        return this.dataSource.open(qVar);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        m mVar = this.dataSource;
        mVar.getClass();
        return mVar.read(bArr, i10, i11);
    }

    public ExtendedDefaultDataSource(Context context, String str, int i10, int i11, boolean z10) {
        this(context, new z(str, i10, i11, z10, null, 0), (LongSparseArray<Uri>) null);
    }

    public ExtendedDefaultDataSource(Context context, m mVar, LongSparseArray<Uri> longSparseArray) {
        this.context = context.getApplicationContext();
        mVar.getClass();
        this.baseDataSource = mVar;
        this.transferListeners = new ArrayList();
        this.mtprotoUris = longSparseArray;
    }

    @Deprecated
    public ExtendedDefaultDataSource(Context context, y0 y0Var, m mVar, LongSparseArray<Uri> longSparseArray) {
        this(context, mVar, longSparseArray);
        if (y0Var != null) {
            this.transferListeners.add(y0Var);
            mVar.addTransferListener(y0Var);
        }
    }
}
