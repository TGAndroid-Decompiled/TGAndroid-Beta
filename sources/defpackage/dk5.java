package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.concurrent.Future;
public final class dk5 implements Closeable {
    public final URL a;
    public volatile Future b;
    public Task c;

    public dk5(URL url) {
        this.a = url;
    }

    public final Bitmap a() {
        byte[] a;
        int i;
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.a;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                a51 a51Var = new a51(inputStream);
                ArrayDeque arrayDeque = new ArrayDeque(20);
                int i2 = 128;
                int i3 = 0;
                loop0: while (true) {
                    int i4 = 2;
                    if (i3 < 2147483639) {
                        int min = Math.min(i2, 2147483639 - i3);
                        byte[] bArr = new byte[min];
                        arrayDeque.add(bArr);
                        int i5 = 0;
                        while (i5 < min) {
                            int read = a51Var.read(bArr, i5, min - i5);
                            if (read == -1) {
                                a = bqd.a(arrayDeque, i3);
                                break loop0;
                            }
                            i5 += read;
                            i3 += read;
                        }
                        long j = i2;
                        if (i2 < 4096) {
                            i4 = 4;
                        }
                        long j2 = j * i4;
                        if (j2 > 2147483647L) {
                            i = Integer.MAX_VALUE;
                        } else if (j2 < -2147483648L) {
                            i = Integer.MIN_VALUE;
                        } else {
                            i = (int) j2;
                        }
                        i2 = i;
                    } else if (a51Var.read() == -1) {
                        a = bqd.a(arrayDeque, 2147483639);
                    } else {
                        throw new OutOfMemoryError("input is too large to fit in a byte array");
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + a.length + " bytes from " + url);
                }
                if (a.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                        }
                        return decodeByteArray;
                    }
                    zf.e(url, "Failed to decode image: ");
                    return null;
                }
                k93.f("Image exceeds max size of 1048576");
                return null;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        k93.f("Content-Length exceeds max size of 1048576");
        return null;
    }

    @Override
    public final void close() {
        this.b.cancel(true);
    }
}
