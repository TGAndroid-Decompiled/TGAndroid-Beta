package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
public final class kb3 extends Handler {
    public final byte a = 0;
    public boolean b;
    public final Object c;

    public kb3(tu6 tu6Var, Looper looper) {
        super(looper);
        this.c = tu6Var;
        this.b = false;
    }

    public final boolean a(Message message, ms6 ms6Var) {
        Throwable iOException;
        long min;
        lb3 lb3Var = (lb3) message.obj;
        if (lb3Var.b) {
            int i = lb3Var.e + 1;
            lb3Var.e = i;
            ((mb3) this.c).i.getClass();
            if (i <= 3) {
                da6 da6Var = new da6(lb3Var.a, ms6Var.a, SystemClock.elapsedRealtime());
                da6Var.d = ms6Var.b;
                da6Var.e = ms6Var.c;
                da6Var.f = SystemClock.elapsedRealtime() - lb3Var.c;
                da6Var.g = ms6Var.d;
                ea6 ea6Var = new ea6(da6Var);
                if (ms6Var.getCause() instanceof IOException) {
                    iOException = (IOException) ms6Var.getCause();
                } else {
                    iOException = new IOException(ms6Var.getCause());
                }
                k4f k4fVar = ((mb3) this.c).i;
                int i2 = lb3Var.e;
                k4fVar.getClass();
                while (iOException != null) {
                    if (!(iOException instanceof bx7) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof hi5) && !(iOException instanceof la6) && (!(iOException instanceof d83) || ((d83) iOException).a != 2008)) {
                        iOException = iOException.getCause();
                    } else {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i2 - 1) * 1000, 5000);
                if (min != -9223372036854775807L) {
                    synchronized (((mb3) this.c).o) {
                        ai4 ai4Var = ((mb3) this.c).y;
                        if (ai4Var != null) {
                            ((jo5) ai4Var.b).c(ea6Var);
                        }
                    }
                    synchronized (this) {
                        if (this.b) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), min);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    @Override
    public final void handleMessage(Message message) {
        ls6 ls6Var;
        ea6 ea6Var;
        switch (this.a) {
            case 0:
                lb3 lb3Var = (lb3) message.obj;
                try {
                    int i = message.what;
                    if (i != 1) {
                        if (i == 2) {
                            mb3 mb3Var = (mb3) this.c;
                            ls6 q = mb3Var.k.q(mb3Var.l, (r64) lb3Var.d);
                            synchronized (((mb3) this.c).o) {
                                try {
                                    ai4 ai4Var = ((mb3) this.c).y;
                                    if (ai4Var != null && (ea6Var = q.b) != null) {
                                        da6 a = ea6Var.a();
                                        a.a = lb3Var.a;
                                        a.f = SystemClock.elapsedRealtime() - lb3Var.c;
                                        ((jo5) ai4Var.b).c(new ea6(a));
                                    }
                                } finally {
                                }
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        ls6Var = ((mb3) this.c).k.r((s64) lb3Var.d);
                    }
                } catch (ms6 e) {
                    boolean a2 = a(message, e);
                    ls6Var = e;
                    if (a2) {
                        return;
                    }
                } catch (Exception e2) {
                    ncd.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    ls6Var = e2;
                }
                k4f k4fVar = ((mb3) this.c).i;
                long j = lb3Var.a;
                k4fVar.getClass();
                synchronized (this) {
                    if (!this.b) {
                        ((mb3) this.c).n.obtainMessage(message.what, Pair.create(lb3Var.d, ls6Var)).sendToTarget();
                    }
                }
                return;
            default:
                tu6 tu6Var = (tu6) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            mx6.D(message.getData());
                            String str = (String) message.obj;
                            return;
                        case 2:
                            tu6Var.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            tu6Var.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            wo6 wo6Var = (wo6) message.obj;
                            return;
                        case 5:
                            List list = (List) message.obj;
                            return;
                        case 6:
                            CharSequence charSequence = (CharSequence) message.obj;
                            return;
                        case 7:
                            mx6.D((Bundle) message.obj);
                            return;
                        case 8:
                            tu6Var.d();
                            return;
                        case 9:
                            ((Integer) message.obj).getClass();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            ((Boolean) message.obj).getClass();
                            return;
                        case 12:
                            ((Integer) message.obj).getClass();
                            return;
                    }
                }
                return;
        }
    }

    public kb3(mb3 mb3Var, Looper looper) {
        super(looper);
        this.c = mb3Var;
    }
}
