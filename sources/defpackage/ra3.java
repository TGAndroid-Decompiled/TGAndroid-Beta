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
public final class ra3 extends Handler {
    public final byte a = 0;
    public boolean b;
    public final Object c;

    public ra3(yu6 yu6Var, Looper looper) {
        super(looper);
        this.c = yu6Var;
        this.b = false;
    }

    public final boolean a(Message message, qs6 qs6Var) {
        Throwable iOException;
        long min;
        sa3 sa3Var = (sa3) message.obj;
        if (sa3Var.b) {
            int i = sa3Var.e + 1;
            sa3Var.e = i;
            ((ta3) this.c).i.getClass();
            if (i <= 3) {
                ia6 ia6Var = new ia6(sa3Var.a, qs6Var.a, SystemClock.elapsedRealtime());
                ia6Var.d = qs6Var.b;
                ia6Var.e = qs6Var.c;
                ia6Var.f = SystemClock.elapsedRealtime() - sa3Var.c;
                ia6Var.g = qs6Var.d;
                ja6 ja6Var = new ja6(ia6Var);
                if (qs6Var.getCause() instanceof IOException) {
                    iOException = (IOException) qs6Var.getCause();
                } else {
                    iOException = new IOException(qs6Var.getCause());
                }
                z6f z6fVar = ((ta3) this.c).i;
                int i2 = sa3Var.e;
                z6fVar.getClass();
                while (iOException != null) {
                    if (!(iOException instanceof hy7) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof ki5) && !(iOException instanceof qa6) && (!(iOException instanceof k73) || ((k73) iOException).a != 2008)) {
                        iOException = iOException.getCause();
                    } else {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i2 - 1) * 1000, 5000);
                if (min != -9223372036854775807L) {
                    synchronized (((ta3) this.c).o) {
                        xh4 xh4Var = ((ta3) this.c).y;
                        if (xh4Var != null) {
                            ((mo5) xh4Var.b).c(ja6Var);
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
        ps6 ps6Var;
        ja6 ja6Var;
        switch (this.a) {
            case 0:
                sa3 sa3Var = (sa3) message.obj;
                try {
                    int i = message.what;
                    if (i != 1) {
                        if (i == 2) {
                            ta3 ta3Var = (ta3) this.c;
                            ps6 o = ta3Var.k.o(ta3Var.l, (b64) sa3Var.d);
                            synchronized (((ta3) this.c).o) {
                                try {
                                    xh4 xh4Var = ((ta3) this.c).y;
                                    if (xh4Var != null && (ja6Var = o.b) != null) {
                                        ia6 a = ja6Var.a();
                                        a.a = sa3Var.a;
                                        a.f = SystemClock.elapsedRealtime() - sa3Var.c;
                                        ((mo5) xh4Var.b).c(new ja6(a));
                                    }
                                } finally {
                                }
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        ps6Var = ((ta3) this.c).k.p((c64) sa3Var.d);
                    }
                } catch (qs6 e) {
                    boolean a2 = a(message, e);
                    ps6Var = e;
                    if (a2) {
                        return;
                    }
                } catch (Exception e2) {
                    efd.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    ps6Var = e2;
                }
                z6f z6fVar = ((ta3) this.c).i;
                long j = sa3Var.a;
                z6fVar.getClass();
                synchronized (this) {
                    if (!this.b) {
                        ((ta3) this.c).n.obtainMessage(message.what, Pair.create(sa3Var.d, ps6Var)).sendToTarget();
                    }
                }
                return;
            default:
                yu6 yu6Var = (yu6) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            rx6.D(message.getData());
                            String str = (String) message.obj;
                            return;
                        case 2:
                            yu6Var.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            yu6Var.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            ap6 ap6Var = (ap6) message.obj;
                            return;
                        case 5:
                            List list = (List) message.obj;
                            return;
                        case 6:
                            CharSequence charSequence = (CharSequence) message.obj;
                            return;
                        case 7:
                            rx6.D((Bundle) message.obj);
                            return;
                        case 8:
                            yu6Var.d();
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

    public ra3(ta3 ta3Var, Looper looper) {
        super(looper);
        this.c = ta3Var;
    }
}
