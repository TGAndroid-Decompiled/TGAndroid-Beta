package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import android.view.View;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
public final class n31 implements v76, cr7, um6, ifc, o09 {
    public final byte a;
    public boolean b;
    public Object c;

    public n31(boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.a = (byte) 8;
        if (!z && !z2 && !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.b = z4;
    }

    @Override
    public final void C(int i, int i2) {
        this.b = true;
        ((j79) this.c).p(i, i2);
    }

    @Override
    public final boolean R(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public final void S0(Object obj) {
        this.b = true;
        Void r2 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) ((l09) this.c).b;
        signInHubActivity.setResult(signInHubActivity.S, signInHubActivity.T);
        signInHubActivity.finish();
    }

    @Override
    public final int V() {
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.c;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.b ? 1 : 0).getCodecInfos();
            this.c = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr.length;
    }

    @Override
    public final void X(int i, int i2) {
        this.b = true;
        ((j79) this.c).q(i, i2);
    }

    @Override
    public final void a(n09 n09Var, int i) {
        StringBuilder sb = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public final void b(int i) {
        yve.p(!this.b);
        ((SparseBooleanArray) this.c).append(i, true);
    }

    public final void c(lk4 lk4Var) {
        for (int i = 0; i < lk4Var.a.size(); i++) {
            b(lk4Var.a(i));
        }
    }

    public final void d(int... iArr) {
        for (int i : iArr) {
            b(i);
        }
    }

    @Override
    public final MediaCodecInfo e(int i) {
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.c;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.b ? 1 : 0).getCodecInfos();
            this.c = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr[i];
    }

    public final lk4 f() {
        yve.p(!this.b);
        this.b = true;
        return new lk4((SparseBooleanArray) this.c);
    }

    public final void g() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            CancellationSignal cancellationSignal = (CancellationSignal) this.c;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                notifyAll();
            }
        }
    }

    public final boolean h() {
        return this.b;
    }

    public final boolean i(int i, CharSequence charSequence) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            if (((rj2) this.c) == null) {
                return h();
            }
            boolean z = true;
            for (int i2 = 0; i2 < i && z; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                n31 n31Var = elb.a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                z = true;
                                break;
                        }
                    }
                    z = false;
                }
                z = true;
            }
            if (!z) {
                return true;
            }
            if (z) {
                return false;
            }
            return h();
        }
        iy8.d();
        return false;
    }

    public final void j() {
        this.b = false;
    }

    public final void k(char c) {
        wj1 wj1Var = (wj1) this.c;
        wj1Var.a(wj1Var.c, 1);
        char[] cArr = wj1Var.b;
        int i = wj1Var.c;
        wj1Var.c = i + 1;
        cArr[i] = c;
    }

    public final void l(String str) {
        int i;
        str.getClass();
        wj1 wj1Var = (wj1) this.c;
        wj1Var.a(wj1Var.c, str.length() + 2);
        char[] cArr = wj1Var.b;
        int i2 = wj1Var.c;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = zcb.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    wj1Var.a(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = zcb.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            wj1Var.b[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = zcb.a[charAt];
                                str2.getClass();
                                wj1Var.a(i5, str2.length());
                                str2.getChars(0, str2.length(), wj1Var.b, i5);
                                int length3 = str2.length() + i5;
                                wj1Var.c = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = wj1Var.b;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                wj1Var.c = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        wj1Var.b[i5] = charAt;
                    }
                    i5 = i;
                }
                wj1Var.a(i5, 1);
                wj1Var.b[i5] = '\"';
                wj1Var.c = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        wj1Var.c = i4 + 1;
    }

    @Override
    public final void n(int i, int i2) {
        this.b = true;
        ((j79) this.c).j(i, i2);
    }

    @Override
    public final void onError(kfc kfcVar, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.G2 == kfcVar) {
            cc4.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.p0.b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.w2, photoViewer.E);
                String M0 = ob6.M0(2131689472, "AppName");
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131752543, null);
                alertDialog$Builder.j(ob6.M0(2131747544, "Open"), new jz7(this, (byte) 6));
                alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                photoViewer.b2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f0.invalidate();
        }
        if (!photoViewer.E2) {
            photoViewer.D0();
            photoViewer.q(false);
        }
        if (photoViewer.F2 != null) {
            kfc kfcVar = photoViewer.G2;
            if (kfcVar == null || !kfcVar.W) {
                hl.d3(new bc8(this, (byte) 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        kfc kfcVar;
        int i2;
        oec oecVar;
        kfc kfcVar2;
        boolean z2;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        ArrayList arrayList = photoViewer.f7;
        kfc kfcVar3 = photoViewer.G2;
        if (kfcVar3 != null) {
            if (!go.w() && !photoViewer.r) {
                z2 = false;
            } else {
                z2 = true;
            }
            kfcVar3.s0(z2);
        }
        if (this.b && (kfcVar = photoViewer.G2) != null && kfcVar.U() != -9223372036854775807L) {
            this.b = false;
            if (photoViewer.X6.isEmpty() && photoViewer.d7.isEmpty() && photoViewer.Z6.isEmpty() && !arrayList.isEmpty() && (i2 = photoViewer.P4) >= 0 && i2 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.P4);
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    if (no6Var.b && (oecVar = no6Var.s) != null) {
                        photoViewer.G2.o0(oecVar.d * ((float) kfcVar2.U()));
                        mb8 mb8Var = photoViewer.X7;
                        if (mb8Var != null) {
                            mb8Var.setProgress(no6Var.s.d);
                        }
                    }
                }
            }
        }
        photoViewer.M2(i, z);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        hl.c3(new bc8(this, (byte) 0));
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        float f2;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.z2 != null) {
            float f3 = i * f;
            int i4 = (int) f3;
            photoViewer.V = i4;
            float f4 = i2;
            photoViewer.W = (int) (f * f4);
            photoViewer.I0();
            dc8 dc8Var = photoViewer.z2;
            if (i2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = f3 / f4;
            }
            dc8Var.a(f2, 0);
            if (photoViewer.C2 instanceof kec) {
                ((kec) photoViewer.C2).setHDRInfo(photoViewer.G2.V(null));
                kec kecVar = (kec) photoViewer.C2;
                kecVar.d = i4;
                kecVar.e = i2;
                rf4 rf4Var = kecVar.b;
                if (rf4Var != null) {
                    rf4Var.postRunnable(new of4(rf4Var, i4, i2, (byte) 0));
                }
                if (photoViewer.d2 == 1) {
                    photoViewer.I1();
                }
            }
            photoViewer.I3 = true;
        }
    }

    public final void p(kte kteVar) {
        if (this.b) {
            old.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((g5c) this.c).a(p90.a(kteVar), new grb((byte) 10));
        } catch (Throwable unused) {
            old.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public final boolean t(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override
    public final boolean t0() {
        return true;
    }

    public final String toString() {
        switch (this.a) {
            case 6:
                return ((l09) this.c).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public final void x0(int i, int i2) {
        ((j79) this.c).n(i, i2, null);
    }

    public n31(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
    }

    public n31(Object obj, byte b) {
        this.a = b;
        this.c = obj;
        this.b = true;
    }

    public final void m() {
    }

    public final void o() {
    }

    public n31() {
        this.a = (byte) 5;
        this.c = new SparseBooleanArray();
    }

    public n31(rj2 rj2Var, boolean z) {
        this((byte) 11, (Object) rj2Var, false);
        this.a = (byte) 11;
        this.b = z;
    }

    public n31(fj6 fj6Var, boolean z) {
        this.a = (byte) 7;
        this.c = fj6Var;
        this.b = z;
    }

    public n31(m8d m8dVar, l09 l09Var) {
        this.a = (byte) 6;
        this.b = false;
        this.c = l09Var;
    }

    @Override
    public final void onSeekFinished(uj ujVar) {
    }

    @Override
    public final void onSeekStarted(uj ujVar) {
    }

    public n31(byte b) {
        this.a = b;
    }

    @Override
    public final void onRenderedFirstFrame(uj ujVar) {
        long j = ujVar.e;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (j == photoViewer.c8) {
            photoViewer.b8 = j;
            photoViewer.c8 = -1L;
            photoViewer.n();
        }
        if (photoViewer.F2 != null) {
            kfc kfcVar = photoViewer.G2;
            if (kfcVar == null || !kfcVar.W) {
                hl.d3(new bc8(this, (byte) 2), 64L);
            }
        }
    }
}
