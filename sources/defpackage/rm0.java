package defpackage;

import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.scilab.forge.jlatexmath.ParseException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.CallAudioDevice;
import org.webrtc.CallSessionFileRotatingLogSink;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.audio.JavaAudioDeviceModule;
public final class rm0 implements dq7, fd, occ, zla, ama, lz0, yma, JavaAudioDeviceModule.SamplesReadyCallback, NativeLifecycleLock.NativeDisposer, ea9, uka, wic, q69, nl0, hj, on5 {
    public final byte a;

    public static RenderNode g(Object obj) {
        return (RenderNode) obj;
    }

    public static void k(String str) {
        throw new ParseException(str);
    }

    @Override
    public final void a(View view, RectF rectF) {
        view.invalidate();
    }

    @Override
    public final float b(RecyclerView recyclerView) {
        return wka.j(recyclerView);
    }

    @Override
    public final String c(int i) {
        return String.format("%02d", Integer.valueOf(i * 5));
    }

    @Override
    public final void mo15call() {
        throw null;
    }

    @Override
    public final void d(Object obj, float f) {
        xw0 xw0Var = (xw0) obj;
        xw0Var.c = f;
        xw0Var.f.invalidate();
        xw0Var.Y.setAlpha(f);
        xw0Var.J();
        xw0Var.H();
    }

    @Override
    public final void dispose(long j) {
        CallSessionFileRotatingLogSink.lambda$dispose$0(j);
    }

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override
    public final float get(Object obj) {
        return ((xw0) obj).c;
    }

    @Override
    public final RecyclerView h(View view) {
        return ((cj1) view).a;
    }

    @Override
    public final void j(int i) {
        if (i == 0) {
            xea.z(3);
        } else if (i == 1) {
            xea.z(0);
        } else if (i == 2) {
            xea.z(1);
        } else if (i == 3) {
            xea.z(2);
        }
    }

    @Override
    public final int l(vnb vnbVar, boolean z) {
        return Integer.MIN_VALUE;
    }

    @Override
    public final void o(RecyclerView recyclerView) {
        uh9.d(recyclerView);
    }

    @Override
    public final void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        CallAudioDevice.lambda$createJavaModule$1(audioSamples);
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Drawable t = imageReceiver.t();
        if (t instanceof b29) {
            b29 b29Var = (b29) t;
            b29Var.K(0);
            b29Var.stop();
            b29Var.O(false, 0.0f);
        }
    }

    @Override
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 1:
                idVar.dismiss();
                return;
            case 2:
                idVar.dismiss();
                return;
            case 6:
                idVar.dismiss();
                return;
            case 7:
                idVar.dismiss();
                return;
            case 14:
                idVar.dismiss();
                return;
            default:
                idVar.dismiss();
                return;
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        switch (this.a) {
            case 27:
                MediaController.z().F0(1, i, z, false);
                return;
            default:
                MediaController.z().F0(1, i, z, false);
                return;
        }
    }

    public rm0(byte b) {
        this.a = b;
    }

    public rm0(Object obj, byte b) {
        this.a = b;
    }

    @Override
    public final void cancel() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }
}
