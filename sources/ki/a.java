package ki;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
public final class a implements Runnable {
    public final int f13650a;
    public final g f13651b;

    public a(g gVar, int i10) {
        this.f13650a = i10;
        this.f13651b = gVar;
    }

    @Override
    public final void run() {
        i iVar;
        boolean z10;
        int i10;
        switch (this.f13650a) {
            case 0:
                g gVar = this.f13651b;
                Handler handler = gVar.f13683j;
                if (handler != null) {
                    handler.post(new a(gVar, 1));
                    return;
                }
                return;
            case 1:
                g gVar2 = this.f13651b;
                if (gVar2.B && gVar2.f13694u != null && (iVar = gVar2.f13692s) != null) {
                    synchronized (iVar) {
                        z10 = iVar.f13742s;
                    }
                    if (!z10) {
                        try {
                            gVar2.f13692s.n();
                            m mVar = gVar2.f13691r;
                            if (mVar != null) {
                                long j3 = gVar2.f13692s.f13743t;
                                if (j3 > 0) {
                                    mVar.f13758f = j3;
                                    mVar.f13775y = -1L;
                                    mVar.f13776z = 0L;
                                    mVar.A = -1L;
                                    mVar.U = true;
                                } else {
                                    throw new IllegalArgumentException("Invalid recording time origin");
                                }
                            }
                            j jVar = gVar2.f13680f;
                            jVar.b("first camera frame received; codecs started: segmentElapsedMs=" + g.g(gVar2.I));
                            h0 h0Var = (h0) gVar2.f13681g.f13383b;
                            h0Var.h.post(new w(h0Var, 3));
                            return;
                        } catch (RuntimeException e) {
                            gVar2.k(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                this.f13651b.i();
                return;
            case 3:
                g gVar3 = this.f13651b;
                CameraCaptureSession cameraCaptureSession = gVar3.f13694u;
                CaptureRequest.Builder builder = gVar3.v;
                if (gVar3.B && cameraCaptureSession != null && builder != null) {
                    try {
                        gVar3.b(builder);
                        CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                        if (gVar3.A && gVar3.h()) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        builder.set(key, Integer.valueOf(i10));
                        cameraCaptureSession.setRepeatingRequest(builder.build(), null, gVar3.f13683j);
                        return;
                    } catch (CameraAccessException e7) {
                        gVar3.k(e7);
                        return;
                    }
                }
                return;
            case 4:
                g gVar4 = this.f13651b;
                gVar4.B = false;
                gVar4.f();
                i iVar2 = gVar4.f13692s;
                if (iVar2 != null) {
                    iVar2.o();
                    gVar4.f13692s = null;
                }
                gVar4.F = false;
                h0 h0Var2 = (h0) gVar4.f13681g.f13383b;
                h0Var2.h.post(new w(h0Var2, 2));
                return;
            default:
                this.f13651b.s();
                return;
        }
    }
}
