package j2;

import a8.p0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import h2.l0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
public final class a0 extends c {
    public final Context f17167a;
    public m f17168b;
    public AssetFileDescriptor f17169c;
    public FileInputStream d;
    public long f17170e;
    public boolean f17171f;

    public a0(Context context) {
        super(false);
        this.f17167a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    @Override
    public final void close() {
        this.f17168b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f17169c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new j(null, e10, 2000);
                    }
                } finally {
                    this.f17169c = null;
                    if (this.f17171f) {
                        this.f17171f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e11) {
                throw new j(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f17169c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f17169c = null;
                    if (this.f17171f) {
                        this.f17171f = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new j(null, e12, 2000);
                }
            } finally {
                this.f17169c = null;
                if (this.f17171f) {
                    this.f17171f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        m mVar = this.f17168b;
        if (mVar != null) {
            return mVar.f17210a;
        }
        return null;
    }

    @Override
    public final long open(m mVar) {
        String host;
        Resources resourcesForApplication;
        int parseInt;
        int i7;
        Resources resources;
        long min;
        this.f17168b = mVar;
        transferInitializing(mVar);
        Uri uri = mVar.f17210a;
        long j3 = mVar.f17214f;
        long j10 = mVar.f17213e;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f17167a;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i7 = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new j("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                throw new j("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new j("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new j("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(p0.E(host, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new j("Resource not found.", null, 2005);
                }
            }
            i7 = parseInt;
            resources = resourcesForApplication;
        } else {
            throw new j("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i7);
            if (openRawResourceFd != null) {
                this.f17169c = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.f17169c.getFileDescriptor());
                this.d = fileInputStream;
                int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                try {
                    if (i10 != 0 && j10 > length) {
                        throw new j(null, null, 2008);
                    }
                    long startOffset = this.f17169c.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                    if (skip == j10) {
                        if (i10 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.f17170e = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.f17170e = size;
                                if (size < 0) {
                                    throw new j(null, null, 2008);
                                }
                            }
                        } else {
                            long j11 = length - skip;
                            this.f17170e = j11;
                            if (j11 < 0) {
                                throw new j(2008);
                            }
                        }
                        int i11 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                        if (i11 != 0) {
                            long j12 = this.f17170e;
                            if (j12 == -1) {
                                min = j3;
                            } else {
                                min = Math.min(j12, j3);
                            }
                            this.f17170e = min;
                        }
                        this.f17171f = true;
                        transferStarted(mVar);
                        if (i11 != 0) {
                            return j3;
                        }
                        return this.f17170e;
                    }
                    throw new j(null, null, 2008);
                } catch (z e11) {
                    throw e11;
                } catch (IOException e12) {
                    throw new j(null, e12, 2000);
                }
            }
            throw new j("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e13) {
            throw new j(null, e13, 2005);
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j3 = this.f17170e;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i10 = (int) Math.min(j3, i10);
                } catch (IOException e10) {
                    throw new j(null, e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = l0.f13812a;
            int read = fileInputStream.read(bArr, i7, i10);
            if (read == -1) {
                if (this.f17170e != -1) {
                    throw new j("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
            } else {
                long j10 = this.f17170e;
                if (j10 != -1) {
                    this.f17170e = j10 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
