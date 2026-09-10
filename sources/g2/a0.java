package g2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
public final class a0 extends c {
    public final Context f8471a;
    public m f8472b;
    public AssetFileDescriptor f8473c;
    public FileInputStream d;
    public long e;
    public boolean f8474f;

    public a0(Context context) {
        super(false);
        this.f8471a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override
    public final void close() {
        this.f8472b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8473c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new j(null, e, 2000);
                    }
                } finally {
                    this.f8473c = null;
                    if (this.f8474f) {
                        this.f8474f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e7) {
                throw new j(null, e7, 2000);
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f8473c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f8473c = null;
                    if (this.f8474f) {
                        this.f8474f = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e10) {
                    throw new j(null, e10, 2000);
                }
            } finally {
                this.f8473c = null;
                if (this.f8474f) {
                    this.f8474f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        m mVar = this.f8472b;
        if (mVar != null) {
            return mVar.f8508a;
        }
        return null;
    }

    @Override
    public final long open(m mVar) {
        String host;
        Resources resourcesForApplication;
        int parseInt;
        int i10;
        Resources resources;
        long min;
        this.f8472b = mVar;
        transferInitializing(mVar);
        Uri uri = mVar.f8508a;
        long j3 = mVar.f8511f;
        long j10 = mVar.e;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f8471a;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i10 = Integer.parseInt(pathSegments.get(0));
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
                } catch (PackageManager.NameNotFoundException e) {
                    throw new j("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new j("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(a4.a.C(host, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new j("Resource not found.", null, 2005);
                }
            }
            i10 = parseInt;
            resources = resourcesForApplication;
        } else {
            throw new j("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i10);
            if (openRawResourceFd != null) {
                this.f8473c = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.f8473c.getFileDescriptor());
                this.d = fileInputStream;
                int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                try {
                    if (i11 != 0 && j10 > length) {
                        throw new j(null, null, 2008);
                    }
                    long startOffset = this.f8473c.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                    if (skip == j10) {
                        if (i11 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.e = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.e = size;
                                if (size < 0) {
                                    throw new j(null, null, 2008);
                                }
                            }
                        } else {
                            long j11 = length - skip;
                            this.e = j11;
                            if (j11 < 0) {
                                throw new j(2008);
                            }
                        }
                        int i12 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                        if (i12 != 0) {
                            long j12 = this.e;
                            if (j12 == -1) {
                                min = j3;
                            } else {
                                min = Math.min(j12, j3);
                            }
                            this.e = min;
                        }
                        this.f8474f = true;
                        transferStarted(mVar);
                        if (i12 != 0) {
                            return j3;
                        }
                        return this.e;
                    }
                    throw new j(null, null, 2008);
                } catch (z e7) {
                    throw e7;
                } catch (IOException e10) {
                    throw new j(null, e10, 2000);
                }
            }
            throw new j("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new j(null, e11, 2005);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.e;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i11 = (int) Math.min(j3, i11);
                } catch (IOException e) {
                    throw new j(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = e2.d0.f7188a;
            int read = fileInputStream.read(bArr, i10, i11);
            if (read == -1) {
                if (this.e != -1) {
                    throw new j("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
            } else {
                long j10 = this.e;
                if (j10 != -1) {
                    this.e = j10 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
