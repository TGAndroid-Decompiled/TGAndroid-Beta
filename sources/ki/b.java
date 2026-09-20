package ki;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
public final class b implements Runnable {
    public final int f13655a;
    public final h f13656b;

    public b(h hVar, int i10) {
        this.f13655a = i10;
        this.f13656b = hVar;
    }

    @Override
    public final void run() {
        j jVar;
        boolean z10;
        switch (this.f13655a) {
            case 0:
                h hVar = this.f13656b;
                Handler handler = hVar.f13714n;
                if (handler != null) {
                    handler.post(new b(hVar, 2));
                    return;
                }
                return;
            case 1:
                this.f13656b.j();
                return;
            case 2:
                h hVar2 = this.f13656b;
                if (hVar2.M && hVar2.f13724y != null && (jVar = hVar2.f13722w) != null) {
                    synchronized (jVar) {
                        z10 = jVar.f13750t;
                    }
                    if (!z10) {
                        try {
                            hVar2.f13722w.n();
                            o oVar = hVar2.v;
                            if (oVar != null) {
                                long j3 = hVar2.f13722w.f13751u;
                                if (j3 > 0) {
                                    oVar.f13782g = j3;
                                    oVar.f13799z = -1L;
                                    oVar.A = 0L;
                                    oVar.B = -1L;
                                    oVar.V = true;
                                } else {
                                    throw new IllegalArgumentException("Invalid recording time origin");
                                }
                            }
                            k kVar = hVar2.f13707j;
                            kVar.b("first camera frame received; codecs started: segmentElapsedMs=" + h.l(hVar2.X));
                            o0 o0Var = (o0) hVar2.f13709k.f13384b;
                            o0Var.h.post(new y(o0Var, 3));
                            return;
                        } catch (RuntimeException e) {
                            hVar2.s(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                h hVar3 = this.f13656b;
                CameraCaptureSession cameraCaptureSession = hVar3.f13724y;
                CaptureRequest.Builder builder = hVar3.f13725z;
                if (hVar3.M && cameraCaptureSession != null && builder != null) {
                    try {
                        hVar3.b(builder);
                        hVar3.a(builder);
                        hVar3.A();
                        return;
                    } catch (CameraAccessException | IllegalArgumentException e7) {
                        if (hVar3.F == j0.FPS_60) {
                            hVar3.m("60 fps updated request rejected", e7);
                            return;
                        } else {
                            hVar3.s(e7);
                            return;
                        }
                    }
                }
                return;
            case 4:
                this.f13656b.q();
                return;
            case 5:
                h hVar4 = this.f13656b;
                hVar4.M = false;
                hVar4.h();
                j jVar2 = hVar4.f13722w;
                if (jVar2 != null) {
                    jVar2.o();
                    hVar4.f13722w = null;
                }
                hVar4.R = false;
                o0 o0Var2 = (o0) hVar4.f13709k.f13384b;
                o0Var2.h.post(new y(o0Var2, 2));
                return;
            default:
                this.f13656b.C();
                return;
        }
    }
}
