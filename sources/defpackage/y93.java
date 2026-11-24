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
public final class y93 extends Handler {
    public final byte a = 0;
    public boolean b;
    public final Object c;

    public y93(ts6 ts6Var, Looper looper) {
        super(looper);
        this.c = ts6Var;
        this.b = false;
    }

    public final boolean a(Message message, mq6 mq6Var) {
        Throwable iOException;
        long min;
        z93 z93Var = (z93) message.obj;
        if (z93Var.b) {
            int i = z93Var.e + 1;
            z93Var.e = i;
            ((aa3) this.c).i.getClass();
            if (i <= 3) {
                e86 e86Var = new e86(z93Var.a, mq6Var.a, SystemClock.elapsedRealtime());
                e86Var.d = mq6Var.b;
                e86Var.e = mq6Var.c;
                e86Var.f = SystemClock.elapsedRealtime() - z93Var.c;
                e86Var.g = mq6Var.d;
                f86 f86Var = new f86(e86Var);
                if (mq6Var.getCause() instanceof IOException) {
                    iOException = (IOException) mq6Var.getCause();
                } else {
                    iOException = new IOException(mq6Var.getCause());
                }
                i2f i2fVar = ((aa3) this.c).i;
                int i2 = z93Var.e;
                i2fVar.getClass();
                while (iOException != null) {
                    if (!(iOException instanceof av7) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof ig5) && !(iOException instanceof m86) && (!(iOException instanceof r63) || ((r63) iOException).a != 2008)) {
                        iOException = iOException.getCause();
                    } else {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i2 - 1) * 1000, 5000);
                if (min != -9223372036854775807L) {
                    synchronized (((aa3) this.c).o) {
                        z24 z24Var = ((aa3) this.c).y;
                        if (z24Var != null) {
                            ((jm5) z24Var.b).c(f86Var);
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
        lq6 lq6Var;
        f86 f86Var;
        switch (this.a) {
            case 0:
                z93 z93Var = (z93) message.obj;
                try {
                    int i = message.what;
                    if (i != 1) {
                        if (i == 2) {
                            aa3 aa3Var = (aa3) this.c;
                            lq6 q = aa3Var.k.q(aa3Var.l, (g54) z93Var.d);
                            synchronized (((aa3) this.c).o) {
                                try {
                                    z24 z24Var = ((aa3) this.c).y;
                                    if (z24Var != null && (f86Var = q.b) != null) {
                                        e86 a = f86Var.a();
                                        a.a = z93Var.a;
                                        a.f = SystemClock.elapsedRealtime() - z93Var.c;
                                        ((jm5) z24Var.b).c(new f86(a));
                                    }
                                } finally {
                                }
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        lq6Var = ((aa3) this.c).k.r((h54) z93Var.d);
                    }
                } catch (mq6 e) {
                    boolean a2 = a(message, e);
                    lq6Var = e;
                    if (a2) {
                        return;
                    }
                } catch (Exception e2) {
                    lad.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    lq6Var = e2;
                }
                i2f i2fVar = ((aa3) this.c).i;
                long j = z93Var.a;
                i2fVar.getClass();
                synchronized (this) {
                    if (!this.b) {
                        ((aa3) this.c).n.obtainMessage(message.what, Pair.create(z93Var.d, lq6Var)).sendToTarget();
                    }
                }
                return;
            default:
                ts6 ts6Var = (ts6) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            mv6.B(message.getData());
                            String str = (String) message.obj;
                            return;
                        case 2:
                            ts6Var.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            ts6Var.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            wm6 wm6Var = (wm6) message.obj;
                            return;
                        case 5:
                            List list = (List) message.obj;
                            return;
                        case 6:
                            CharSequence charSequence = (CharSequence) message.obj;
                            return;
                        case 7:
                            mv6.B((Bundle) message.obj);
                            return;
                        case 8:
                            ts6Var.d();
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

    public y93(aa3 aa3Var, Looper looper) {
        super(looper);
        this.c = aa3Var;
    }
}
