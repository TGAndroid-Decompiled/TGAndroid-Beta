package a4;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.mediarouter.app.m0;
import c2.x0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jd.e0;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.h20;
import org.telegram.ui.PhotoViewer;
public final class d extends Handler {
    public final int f64a;
    public final Object f65b;

    public d(Object obj, int i10) {
        this.f64a = i10;
        this.f65b = obj;
    }

    @Override
    public final void handleMessage(Message msg) {
        String string;
        switch (this.f64a) {
            case 0:
                f fVar = (f) this.f65b;
                fVar.getClass();
                int i10 = msg.what;
                e eVar = null;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            AtomicReference atomicReference = fVar.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                            while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                            }
                        } else {
                            fVar.f74e.c();
                        }
                    } else {
                        e eVar2 = (e) msg.obj;
                        int i11 = eVar2.f66a;
                        MediaCodec.CryptoInfo cryptoInfo = eVar2.f68c;
                        long j10 = eVar2.d;
                        int i12 = eVar2.f69e;
                        try {
                            synchronized (f.h) {
                                fVar.f71a.queueSecureInputBuffer(i11, 0, cryptoInfo, j10, i12);
                            }
                        } catch (RuntimeException e10) {
                            AtomicReference atomicReference2 = fVar.d;
                            while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                            }
                        }
                        eVar = eVar2;
                    }
                } else {
                    e eVar3 = (e) msg.obj;
                    try {
                        fVar.f71a.queueInputBuffer(eVar3.f66a, 0, eVar3.f67b, eVar3.d, eVar3.f69e);
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference3 = fVar.d;
                        while (!atomicReference3.compareAndSet(null, e11) && atomicReference3.get() == null) {
                        }
                    }
                    eVar = eVar3;
                }
                if (eVar != null) {
                    f.d(eVar);
                    return;
                }
                return;
            case 1:
                androidx.mediarouter.app.f fVar2 = (androidx.mediarouter.app.f) this.f65b;
                d dVar = fVar2.I;
                int i13 = msg.what;
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3 && fVar2.f1708r.isEmpty()) {
                            fVar2.i(3);
                            dVar.removeMessages(2);
                            dVar.removeMessages(3);
                            dVar.removeMessages(1);
                            fVar2.f1706f.h(fVar2.h);
                            return;
                        }
                        return;
                    } else if (fVar2.f1708r.isEmpty()) {
                        fVar2.i(2);
                        dVar.removeMessages(2);
                        dVar.removeMessages(3);
                        dVar.sendMessageDelayed(dVar.obtainMessage(3), 15000L);
                        return;
                    } else {
                        return;
                    }
                }
                fVar2.e((List) msg.obj);
                return;
            case 2:
                if (msg.what == 1) {
                    androidx.mediarouter.app.b0 b0Var = (androidx.mediarouter.app.b0) this.f65b;
                    b0Var.B = SystemClock.uptimeMillis();
                    b0Var.f1685s.clear();
                    b0Var.f1685s.addAll((List) msg.obj);
                    b0Var.v.D();
                    return;
                }
                return;
            case 3:
                m0 m0Var = (m0) this.f65b;
                int i14 = msg.what;
                if (i14 != 1) {
                    if (i14 == 2 && m0Var.I != null) {
                        m0Var.I = null;
                        m0Var.o();
                        return;
                    }
                    return;
                }
                m0Var.n();
                return;
            case 4:
                int i15 = msg.what;
                int i16 = msg.arg1;
                Object obj = msg.obj;
                Bundle peekData = msg.peekData();
                SparseArray sparseArray = ((c2.h) this.f65b).f2845j;
                x0 x0Var = (x0) sparseArray.get(i16);
                if (x0Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i16);
                if (i15 != 3) {
                    if (i15 == 4) {
                        if (peekData == null) {
                            string = null;
                        } else {
                            string = peekData.getString("error");
                        }
                        x0.a(string, (Bundle) obj);
                        return;
                    }
                    return;
                }
                x0Var.b((Bundle) obj);
                return;
            case 5:
                c2.t tVar = (c2.t) this.f65b;
                int i17 = msg.what;
                if (i17 != 1) {
                    if (i17 == 2) {
                        tVar.f2898b = false;
                        tVar.f((c2.o) tVar.h);
                        return;
                    }
                    return;
                }
                tVar.f2899c = false;
                ha.c cVar = (ha.c) tVar.f2901f;
                if (cVar != null) {
                    c2.u uVar = (c2.u) tVar.f2902n;
                    c2.e eVar4 = (c2.e) cVar.f7981b;
                    c2.a0 d = eVar4.d(tVar);
                    if (d != null) {
                        eVar4.m(d, uVar);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                kotlin.jvm.internal.j.e(msg, "msg");
                if (msg.what == 3) {
                    Bundle data = msg.getData();
                    String str = (data == null || (str = data.getString("SessionUpdateExtra")) == null) ? "" : "";
                    Log.d("SessionLifecycleClient", "Session update received: ".concat(str));
                    e0.q(e0.b((sc.h) this.f65b), new ja.v(str, null, 1));
                    return;
                }
                Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
                super.handleMessage(msg);
                return;
            case 7:
                f20 f20Var = (f20) this.f65b;
                e20 e20Var = f20Var.f28277g;
                int i18 = msg.what;
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 == 3) {
                            d20 d20Var = f20Var.h;
                            if (d20Var != null) {
                                if (!f20Var.f28278i) {
                                    ((PhotoViewer) d20Var).Z1(f20Var.f28283n);
                                    return;
                                } else {
                                    f20Var.f28279j = true;
                                    return;
                                }
                            }
                            return;
                        }
                        throw new RuntimeException("Unknown message " + msg);
                    }
                    f20Var.f28276f.removeMessages(3);
                    f20Var.f28279j = false;
                    f20Var.f28280k = true;
                    e20Var.onLongPress(f20Var.f28283n);
                    return;
                }
                e20Var.getClass();
                return;
            default:
                g20 g20Var = (g20) this.f65b;
                h20 h20Var = g20Var.f28723f;
                int i19 = msg.what;
                if (i19 != 1) {
                    if (i19 != 2) {
                        if (i19 == 3) {
                            h20 h20Var2 = g20Var.f28724g;
                            if (h20Var2 != null) {
                                if (!g20Var.h) {
                                    h20Var2.onSingleTapConfirmed(g20Var.f28729m);
                                    return;
                                } else {
                                    g20Var.f28725i = true;
                                    return;
                                }
                            }
                            return;
                        }
                        throw new RuntimeException("Unknown message " + msg);
                    }
                    g20Var.f28722e.removeMessages(3);
                    g20Var.f28725i = false;
                    g20Var.f28726j = true;
                    h20Var.onLongPress(g20Var.f28729m);
                    return;
                }
                h20Var.onShowPress(g20Var.f28729m);
                return;
        }
    }

    public d(sc.h hVar) {
        super(Looper.getMainLooper());
        this.f64a = 6;
        this.f65b = hVar;
    }

    public d(f fVar, Looper looper) {
        super(looper);
        this.f64a = 0;
        this.f65b = fVar;
    }

    public d(c2.h hVar) {
        super(Looper.getMainLooper());
        this.f64a = 4;
        this.f65b = hVar;
    }
}
