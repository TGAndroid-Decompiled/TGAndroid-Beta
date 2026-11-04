package i2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import g2.n0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
public final class b0 extends c {
    public final Context f14522a;
    public n f14523b;
    public AssetFileDescriptor f14524c;
    public FileInputStream d;
    public long f14525e;
    public boolean f14526f;

    public b0(Context context) {
        super(false);
        this.f14522a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i3) {
        return Uri.parse("rawresource:///" + i3);
    }

    @Override
    public final void close() {
        this.f14523b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14524c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new k(null, e10, 2000);
                    }
                } finally {
                    this.f14524c = null;
                    if (this.f14526f) {
                        this.f14526f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e11) {
                throw new k(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f14524c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f14524c = null;
                    if (this.f14526f) {
                        this.f14526f = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new k(null, e12, 2000);
                }
            } finally {
                this.f14524c = null;
                if (this.f14526f) {
                    this.f14526f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        n nVar = this.f14523b;
        if (nVar != null) {
            return nVar.f14564a;
        }
        return null;
    }

    @Override
    public final long open(n nVar) {
        String host;
        Resources resourcesForApplication;
        int parseInt;
        int i3;
        Resources resources;
        long min;
        this.f14523b = nVar;
        transferInitializing(nVar);
        Uri uri = nVar.f14564a;
        long j10 = nVar.f14568f;
        long j11 = nVar.f14567e;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f14522a;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i3 = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new k("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                throw new k("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
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
                    throw new k("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new k("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(a1.g.C(host, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new k("Resource not found.", null, 2005);
                }
            }
            i3 = parseInt;
            resources = resourcesForApplication;
        } else {
            throw new k("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i3);
            if (openRawResourceFd != null) {
                this.f14524c = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.f14524c.getFileDescriptor());
                this.d = fileInputStream;
                int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                try {
                    if (i10 != 0 && j11 > length) {
                        throw new k(null, null, 2008);
                    }
                    long startOffset = this.f14524c.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j11) - startOffset;
                    if (skip == j11) {
                        if (i10 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.f14525e = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.f14525e = size;
                                if (size < 0) {
                                    throw new k(null, null, 2008);
                                }
                            }
                        } else {
                            long j12 = length - skip;
                            this.f14525e = j12;
                            if (j12 < 0) {
                                throw new k(2008);
                            }
                        }
                        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                        if (i11 != 0) {
                            long j13 = this.f14525e;
                            if (j13 == -1) {
                                min = j10;
                            } else {
                                min = Math.min(j13, j10);
                            }
                            this.f14525e = min;
                        }
                        this.f14526f = true;
                        transferStarted(nVar);
                        if (i11 != 0) {
                            return j10;
                        }
                        return this.f14525e;
                    }
                    throw new k(null, null, 2008);
                } catch (a0 e11) {
                    throw e11;
                } catch (IOException e12) {
                    throw new k(null, e12, 2000);
                }
            }
            throw new k("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e13) {
            throw new k(null, e13, 2005);
        }
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f14525e;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e10) {
                    throw new k(null, e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = n0.f11873a;
            int read = fileInputStream.read(bArr, i3, i10);
            if (read == -1) {
                if (this.f14525e != -1) {
                    throw new k("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
            } else {
                long j11 = this.f14525e;
                if (j11 != -1) {
                    this.f14525e = j11 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
