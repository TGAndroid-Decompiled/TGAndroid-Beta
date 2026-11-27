package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import org.telegram.messenger.a;
public final class rx implements im6, s99 {
    public final byte a;
    public boolean b;
    public Object c;
    public Object d;

    public rx(ByteBuffer byteBuffer, int i, RectF rectF) {
        this.a = (byte) 9;
        this.c = rectF;
        this.b = i;
        try {
            this.d = File.createTempFile("paint", ".bin", a.b.getCacheDir());
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (((File) this.d) != null) {
            try {
                byte[] array = byteBuffer.array();
                FileOutputStream fileOutputStream = new FileOutputStream((File) this.d);
                Deflater deflater = new Deflater(1, true);
                deflater.setInput(array, byteBuffer.arrayOffset(), byteBuffer.remaining());
                deflater.finish();
                byte[] bArr = new byte[1024];
                while (!deflater.finished()) {
                    fileOutputStream.write(bArr, 0, deflater.deflate(bArr));
                }
                deflater.end();
                fileOutputStream.close();
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        y76 y76Var;
        boolean z;
        hsd hsdVar = (hsd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            y76Var = ((a86) this.c).b;
            z = this.b;
            ((a86) this.c).b = null;
        }
        if (y76Var == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            uif.U3(hsdVar, y76Var, z, taskCompletionSource);
        }
    }

    public final void b(int i) {
        String str;
        boolean z = this.b;
        if (i == z) {
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        String str2 = "String";
        if (!z) {
            str = "String";
        } else if (z) {
            str = "ArrayBuffer";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" expected, but got ");
        if (i != 0) {
            if (i == 1) {
                str2 = "ArrayBuffer";
            } else {
                str2 = "Unknown";
            }
        }
        sb.append(str2);
        throw new IllegalStateException(sb.toString());
    }

    @Override
    public final sx a(fp fpVar) {
        MediaCodec mediaCodec;
        lm6 uxVar;
        int i;
        sx sxVar;
        String str = ((nm6) fpVar.a).a;
        sx sxVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (this.b && Build.VERSION.SDK_INT >= 36) {
                    uxVar = new pq8(mediaCodec, (byte) 20);
                    i = 4;
                } else {
                    uxVar = new ux(mediaCodec, (HandlerThread) ((qx) this.d).get());
                    i = 0;
                }
                sxVar = new sx(mediaCodec, (HandlerThread) ((qx) this.c).get(), uxVar, (fi6) fpVar.f);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            Trace.endSection();
            Surface surface = (Surface) fpVar.d;
            if (surface == null && ((nm6) fpVar.a).h && Build.VERSION.SDK_INT >= 35) {
                i |= 8;
            }
            sxVar.p((MediaFormat) fpVar.b, surface, (MediaCrypto) fpVar.e, i);
            return sxVar;
        } catch (Exception e3) {
            e = e3;
            sxVar2 = sxVar;
            if (sxVar2 == null) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
            } else {
                sxVar2.release();
            }
            throw e;
        }
    }

    public final void d(Canvas canvas, float f, float f2, float f3, float f4, int i, Shader shader, int i2) {
        uj4 uj4Var = (uj4) this.c;
        float f5 = ((mm) this.d).c;
        if (f5 > 0.0f && f2 > f) {
            TextPaint textPaint = uj4Var.a;
            TextPaint textPaint2 = uj4Var.a;
            if (Math.abs(textPaint.getTextSize() - f4) > 0.1f) {
                uj4Var.w(f4);
            }
            uj4Var.u(i);
            float c = uj4Var.c();
            if (c > 0.0f) {
                float min = Math.min(1.0f, (f2 - f) / c);
                int ceil = (int) Math.ceil(f4);
                if (ob6.a0) {
                    f = f2 - (c * min);
                }
                canvas.save();
                canvas.translate(f, f3);
                canvas.scale(min, min);
                uj4Var.setBounds(0, -ceil, hl.L(4000.0f), ceil);
                uj4Var.C = (int) (i2 * f5);
                Shader shader2 = textPaint2.getShader();
                if (shader != null) {
                    textPaint2.setShader(shader);
                }
                uj4Var.draw(canvas);
                if (shader != null) {
                    textPaint2.setShader(shader2);
                }
                canvas.restore();
            }
        }
    }

    public final void e() {
        switch (this.a) {
            case 6:
                this.b = false;
                return;
            default:
                this.b = false;
                return;
        }
    }

    public final void f() {
        vt9 vt9Var = (vt9) this.c;
        k36 m = vt9Var.m();
        if (m.b == z26.b) {
            m.a(new z59(vt9Var, (byte) 0));
            final po poVar = (po) this.d;
            if (!poVar.c) {
                m.a(new f36() {
                    @Override
                    public final void b(i36 i36Var, y26 y26Var) {
                        y26 y26Var2 = y26.ON_START;
                        po poVar2 = po.this;
                        if (y26Var == y26Var2) {
                            poVar2.e = true;
                        } else if (y26Var == y26.ON_STOP) {
                            poVar2.e = false;
                        }
                    }
                });
                poVar.c = true;
                this.b = true;
                return;
            }
            grb.i("SavedStateRegistry was already attached.");
            return;
        }
        grb.i("Restarter must be created only during owner's initialization stage");
    }

    public final void g(Bundle bundle) {
        Bundle bundle2;
        if (!this.b) {
            f();
        }
        k36 m = ((vt9) this.c).m();
        if (m.b.compareTo(z26.d) < 0) {
            po poVar = (po) this.d;
            if (poVar.c) {
                if (!poVar.d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    poVar.a = bundle2;
                    poVar.d = true;
                    return;
                }
                grb.i("SavedStateRegistry was already restored.");
                return;
            }
            grb.i("You must call performAttach() before calling performRestore(Bundle).");
            return;
        }
        z26 z26Var = m.b;
        throw new IllegalStateException(("performRestore cannot be called when owner is " + z26Var).toString());
    }

    public final void h(Bundle bundle) {
        po poVar = (po) this.d;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) poVar.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        os9 os9Var = (os9) poVar.f;
        ms9 ms9Var = new ms9(os9Var);
        os9Var.c.put(ms9Var, Boolean.FALSE);
        while (ms9Var.hasNext()) {
            Map.Entry entry = (Map.Entry) ms9Var.next();
            bundle2.putBundle((String) entry.getKey(), ((ut9) entry.getValue()).c());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void i(CharSequence charSequence, boolean z) {
        boolean z2;
        uj4 uj4Var = (uj4) this.c;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z3 = !isEmpty;
        if (!isEmpty) {
            if (z && this.b && !ob6.a0) {
                z2 = true;
            } else {
                z2 = false;
            }
            uj4Var.t(charSequence, z2, true);
        }
        if (this.b != z3) {
            this.b = z3;
            if (!z) {
                ((mm) this.d).f(z3, true);
            }
        }
        uj4Var.invalidateSelf();
    }

    public final synchronized a86 j() {
        return (a86) this.c;
    }

    public final byte[] k() {
        hdd hddVar;
        zq7 zq7Var;
        kpd kpdVar;
        zq7 zq7Var2;
        gnd gndVar;
        zq7 zq7Var3;
        switch (this.a) {
            case 13:
                z3f z3fVar = z3f.h;
                u8a u8aVar = (u8a) this.c;
                ((gxe) this.d).h = false;
                gxe gxeVar = (gxe) this.d;
                gxeVar.f = Boolean.FALSE;
                u8aVar.a = new sxe(gxeVar);
                try {
                    z3f.p();
                    yme ymeVar = new yme(u8aVar);
                    rw8 rw8Var = new rw8((byte) 1);
                    z3fVar.e(rw8Var);
                    HashMap hashMap = new HashMap(rw8Var.b);
                    HashMap hashMap2 = new HashMap(rw8Var.c);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        hddVar = new hdd(byteArrayOutputStream, hashMap, hashMap2);
                        zq7Var = (zq7) hashMap.get(yme.class);
                    } catch (IOException unused) {
                    }
                    if (zq7Var != null) {
                        zq7Var.a(ymeVar, hddVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(yme.class)));
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 14:
                qf5 qf5Var = qf5.r;
                fp fpVar = (fp) this.c;
                ((gxe) this.d).h = false;
                gxe gxeVar2 = (gxe) this.d;
                gxeVar2.f = Boolean.FALSE;
                fpVar.a = new u5f(gxeVar2);
                try {
                    faf.D0();
                    gye gyeVar = new gye(fpVar);
                    rw8 rw8Var2 = new rw8((byte) 3);
                    qf5Var.e(rw8Var2);
                    HashMap hashMap3 = new HashMap(rw8Var2.b);
                    HashMap hashMap4 = new HashMap(rw8Var2.c);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        kpdVar = new kpd(byteArrayOutputStream2, hashMap3, hashMap4);
                        zq7Var2 = (zq7) hashMap3.get(gye.class);
                    } catch (IOException unused2) {
                    }
                    if (zq7Var2 != null) {
                        zq7Var2.a(gyeVar, kpdVar);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(gye.class)));
                } catch (UnsupportedEncodingException e2) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e2);
                }
            default:
                sjf sjfVar = sjf.E;
                oxb oxbVar = (oxb) this.c;
                ((gxe) this.d).h = false;
                gxe gxeVar3 = (gxe) this.d;
                gxeVar3.f = Boolean.FALSE;
                oxbVar.a = new rhf(gxeVar3);
                try {
                    sjf.S();
                    iaf iafVar = new iaf(oxbVar);
                    rw8 rw8Var3 = new rw8((byte) 2);
                    sjfVar.A(rw8Var3);
                    HashMap hashMap5 = new HashMap(rw8Var3.b);
                    HashMap hashMap6 = new HashMap(rw8Var3.c);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        gndVar = new gnd(byteArrayOutputStream3, hashMap5, hashMap6);
                        zq7Var3 = (zq7) hashMap5.get(iaf.class);
                    } catch (IOException unused3) {
                    }
                    if (zq7Var3 != null) {
                        zq7Var3.a(iafVar, gndVar);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(iaf.class)));
                } catch (UnsupportedEncodingException e3) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e3);
                }
        }
    }

    public rx(qa4 qa4Var, a86 a86Var) {
        this.a = (byte) 12;
        this.d = qa4Var;
        this.b = true;
        this.c = a86Var;
    }

    public rx(xma xmaVar, Object obj, byte b) {
        this.a = b;
        this.d = xmaVar;
        this.c = obj;
    }

    public rx(String str, String str2, boolean z) {
        this.a = (byte) 15;
        this.d = str;
        this.c = str2;
        this.b = z;
    }

    public rx(fp fpVar, int i) {
        this.a = (byte) 14;
        this.d = new Object();
        this.c = fpVar;
        faf.D0();
        this.b = i;
    }

    public rx(u8a u8aVar, int i) {
        this.a = (byte) 13;
        this.d = new Object();
        this.c = u8aVar;
        z3f.p();
        this.b = i;
    }

    public rx(oxb oxbVar, int i) {
        this.a = (byte) 16;
        this.d = new Object();
        this.c = oxbVar;
        sjf.S();
        this.b = i;
    }

    public rx() {
        this.a = (byte) 5;
    }

    public rx(View view) {
        this.a = (byte) 3;
        uj4 uj4Var = new uj4(view);
        this.c = uj4Var;
        uj4Var.K = false;
        uj4Var.N = hl.L(4000.0f);
        uj4Var.L = true;
        mm mmVar = new mm(view, 0L, 220L, k43.h);
        this.d = mmVar;
        mmVar.e(true, 0.0f);
    }

    public rx(vt9 vt9Var) {
        this.a = (byte) 8;
        this.c = vt9Var;
        this.d = new po();
    }

    public rx(nq2 nq2Var, gq2 gq2Var) {
        this.a = (byte) 4;
        this.c = new Object();
        this.d = new ArrayList();
    }

    public rx(rg0 rg0Var) {
        this.a = (byte) 2;
        rg0Var.getClass();
        this.c = rg0Var;
        this.d = new us6();
    }

    public rx(String str) {
        this.a = (byte) 11;
        this.c = str;
        this.d = null;
        this.b = false;
    }

    public rx(qx qxVar, qx qxVar2) {
        this.a = (byte) 0;
        this.c = qxVar;
        this.d = qxVar2;
        this.b = true;
    }

    public rx(byte[] bArr) {
        this.a = (byte) 11;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.c = null;
        this.b = true;
    }

    public rx(bv1 bv1Var, fm0 fm0Var) {
        this.a = (byte) 1;
        this.c = bv1Var;
        this.d = fm0Var;
    }

    public rx(knc kncVar) {
        this.a = (byte) 10;
        this.d = kncVar;
        this.c = new int[2];
    }
}
