package defpackage;

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
public final class x29 extends sf0 {
    public final Context a;
    public n73 b;
    public AssetFileDescriptor c;
    public FileInputStream d;
    public long e;
    public boolean f;

    public x29(Context context) {
        super(false);
        this.a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override
    public final void close() {
        this.b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new k73(null, e, 2000);
                    }
                } finally {
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e2) {
                throw new k73(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new k73(null, e3, 2000);
                }
            } finally {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        n73 n73Var = this.b;
        if (n73Var != null) {
            return n73Var.a;
        }
        return null;
    }

    @Override
    public final long open(n73 n73Var) {
        String host;
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        long j;
        long min;
        this.b = n73Var;
        transferInitializing(n73Var);
        Uri uri = n73Var.a;
        long j2 = n73Var.f;
        long j3 = n73Var.e;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.a;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new k73("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                throw new k73("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
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
                    throw new k73("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new k73("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(qd4.y(host, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new k73("Resource not found.", null, 2005);
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        } else {
            throw new k73("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd != null) {
                this.c = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.c.getFileDescriptor());
                this.d = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                try {
                    if (i2 != 0 && j3 > length) {
                        throw new k73(null, null, 2008);
                    }
                    long startOffset = this.c.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                    if (skip == j3) {
                        if (i2 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.e = -1L;
                                j = -1;
                            } else {
                                j = channel.size() - channel.position();
                                this.e = j;
                                if (j < 0) {
                                    throw new k73(null, null, 2008);
                                }
                            }
                        } else {
                            j = length - skip;
                            this.e = j;
                            if (j < 0) {
                                throw new k73(2008);
                            }
                        }
                        int i3 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                        if (i3 != 0) {
                            if (j == -1) {
                                min = j2;
                            } else {
                                min = Math.min(j, j2);
                            }
                            this.e = min;
                        }
                        this.f = true;
                        transferStarted(n73Var);
                        if (i3 != 0) {
                            return j2;
                        }
                        return this.e;
                    }
                    throw new k73(null, null, 2008);
                } catch (w29 e2) {
                    throw e2;
                } catch (IOException e3) {
                    throw new k73(null, e3, 2000);
                }
            }
            throw new k73("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e4) {
            throw new k73(null, e4, 2005);
        }
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new k73(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = gcc.a;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.e;
            if (read == -1) {
                if (j2 != -1) {
                    throw new k73("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
            } else {
                if (j2 != -1) {
                    this.e = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
