package defpackage;

import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
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
public final class ry implements gm6, h89 {
    public final byte a;
    public boolean b;
    public Object c;
    public Object d;

    public ry(ByteBuffer byteBuffer, int i, RectF rectF) {
        this.a = (byte) 8;
        this.c = rectF;
        this.b = i;
        try {
            this.d = File.createTempFile("paint", ".bin", a.b.getCacheDir());
        } catch (Exception e) {
            fc4.g(e, true);
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
                fc4.g(e2, true);
            }
        }
    }

    public final void a(int i) {
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
    public final void accept(Object obj, Object obj2) {
        u76 u76Var;
        boolean z;
        tpd tpdVar = (tpd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            u76Var = ((w76) this.c).b;
            z = this.b;
            ((w76) this.c).b = null;
        }
        if (u76Var == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            fgf.T3(tpdVar, u76Var, z, taskCompletionSource);
        }
    }

    @Override
    public final sy b(eq eqVar) {
        MediaCodec mediaCodec;
        jm6 uyVar;
        int i;
        sy syVar;
        String str = ((lm6) eqVar.a).a;
        sy syVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (this.b && Build.VERSION.SDK_INT >= 36) {
                    uyVar = new et8(mediaCodec, (byte) 17);
                    i = 4;
                } else {
                    uyVar = new uy(mediaCodec, (HandlerThread) ((qy) this.d).get());
                    i = 0;
                }
                syVar = new sy(mediaCodec, (HandlerThread) ((qy) this.c).get(), uyVar, (bi6) eqVar.f);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            Trace.endSection();
            Surface surface = (Surface) eqVar.d;
            if (surface == null && ((lm6) eqVar.a).h && Build.VERSION.SDK_INT >= 35) {
                i |= 8;
            }
            syVar.p((MediaFormat) eqVar.b, surface, (MediaCrypto) eqVar.e, i);
            return syVar;
        } catch (Exception e3) {
            e = e3;
            syVar2 = syVar;
            if (syVar2 == null) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
            } else {
                syVar2.release();
            }
            throw e;
        }
    }

    public final void d() {
        switch (this.a) {
            case 5:
                this.b = false;
                return;
            default:
                this.b = false;
                return;
        }
    }

    public final void e() {
        es9 es9Var = (es9) this.c;
        g36 m = es9Var.m();
        if (m.b == v26.b) {
            m.a(new n49(es9Var, (byte) 0));
            final op opVar = (op) this.d;
            if (!opVar.c) {
                m.a(new b36() {
                    @Override
                    public final void b(e36 e36Var, u26 u26Var) {
                        u26 u26Var2 = u26.ON_START;
                        op opVar2 = op.this;
                        if (u26Var == u26Var2) {
                            opVar2.e = true;
                        } else if (u26Var == u26.ON_STOP) {
                            opVar2.e = false;
                        }
                    }
                });
                opVar.c = true;
                this.b = true;
                return;
            }
            dq9.m("SavedStateRegistry was already attached.");
            return;
        }
        dq9.m("Restarter must be created only during owner's initialization stage");
    }

    public final void f(Bundle bundle) {
        Bundle bundle2;
        if (!this.b) {
            e();
        }
        g36 m = ((es9) this.c).m();
        if (m.b.compareTo(v26.d) < 0) {
            op opVar = (op) this.d;
            if (opVar.c) {
                if (!opVar.d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    opVar.a = bundle2;
                    opVar.d = true;
                    return;
                }
                dq9.m("SavedStateRegistry was already restored.");
                return;
            }
            dq9.m("You must call performAttach() before calling performRestore(Bundle).");
            return;
        }
        v26 v26Var = m.b;
        throw new IllegalStateException(("performRestore cannot be called when owner is " + v26Var).toString());
    }

    public final void g(Bundle bundle) {
        op opVar = (op) this.d;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) opVar.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        xq9 xq9Var = (xq9) opVar.f;
        vq9 vq9Var = new vq9(xq9Var);
        xq9Var.c.put(vq9Var, Boolean.FALSE);
        while (vq9Var.hasNext()) {
            Map.Entry entry = (Map.Entry) vq9Var.next();
            bundle2.putBundle((String) entry.getKey(), ((ds9) entry.getValue()).c());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final synchronized w76 h() {
        return (w76) this.c;
    }

    public final byte[] i() {
        qad qadVar;
        cq7 cq7Var;
        vmd vmdVar;
        cq7 cq7Var2;
        rkd rkdVar;
        cq7 cq7Var3;
        switch (this.a) {
            case 12:
                k1f k1fVar = k1f.h;
                e7a e7aVar = (e7a) this.c;
                ((sue) this.d).h = false;
                sue sueVar = (sue) this.d;
                sueVar.f = Boolean.FALSE;
                e7aVar.a = new eve(sueVar);
                try {
                    k1f.o();
                    ike ikeVar = new ike(e7aVar);
                    jv8 jv8Var = new jv8((byte) 1);
                    k1fVar.j(jv8Var);
                    HashMap hashMap = new HashMap(jv8Var.b);
                    HashMap hashMap2 = new HashMap(jv8Var.c);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        qadVar = new qad(byteArrayOutputStream, hashMap, hashMap2);
                        cq7Var = (cq7) hashMap.get(ike.class);
                    } catch (IOException unused) {
                    }
                    if (cq7Var != null) {
                        cq7Var.a(ikeVar, qadVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(ike.class)));
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 13:
                nf5 nf5Var = nf5.r;
                eq eqVar = (eq) this.c;
                ((sue) this.d).h = false;
                sue sueVar2 = (sue) this.d;
                sueVar2.f = Boolean.FALSE;
                eqVar.a = new f3f(sueVar2);
                try {
                    q7f.C0();
                    sve sveVar = new sve(eqVar);
                    jv8 jv8Var2 = new jv8((byte) 3);
                    nf5Var.h(jv8Var2);
                    HashMap hashMap3 = new HashMap(jv8Var2.b);
                    HashMap hashMap4 = new HashMap(jv8Var2.c);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        vmdVar = new vmd(byteArrayOutputStream2, hashMap3, hashMap4);
                        cq7Var2 = (cq7) hashMap3.get(sve.class);
                    } catch (IOException unused2) {
                    }
                    if (cq7Var2 != null) {
                        cq7Var2.a(sveVar, vmdVar);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(sve.class)));
                } catch (UnsupportedEncodingException e2) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e2);
                }
            default:
                dhf dhfVar = dhf.E;
                ovb ovbVar = (ovb) this.c;
                ((sue) this.d).h = false;
                sue sueVar3 = (sue) this.d;
                sueVar3.f = Boolean.FALSE;
                ovbVar.a = new cff(sueVar3);
                try {
                    dhf.S();
                    t7f t7fVar = new t7f(ovbVar);
                    jv8 jv8Var3 = new jv8((byte) 2);
                    dhfVar.x(jv8Var3);
                    HashMap hashMap5 = new HashMap(jv8Var3.b);
                    HashMap hashMap6 = new HashMap(jv8Var3.c);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        rkdVar = new rkd(byteArrayOutputStream3, hashMap5, hashMap6);
                        cq7Var3 = (cq7) hashMap5.get(t7f.class);
                    } catch (IOException unused3) {
                    }
                    if (cq7Var3 != null) {
                        cq7Var3.a(t7fVar, rkdVar);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(t7f.class)));
                } catch (UnsupportedEncodingException e3) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e3);
                }
        }
    }

    public ry(ua4 ua4Var, w76 w76Var) {
        this.a = (byte) 11;
        this.d = ua4Var;
        this.b = true;
        this.c = w76Var;
    }

    public ry(fla flaVar, Object obj, byte b) {
        this.a = b;
        this.d = flaVar;
        this.c = obj;
    }

    public ry(String str, String str2, boolean z) {
        this.a = (byte) 14;
        this.d = str;
        this.c = str2;
        this.b = z;
    }

    public ry(eq eqVar, int i) {
        this.a = (byte) 13;
        this.d = new Object();
        this.c = eqVar;
        q7f.C0();
        this.b = i;
    }

    public ry(e7a e7aVar, int i) {
        this.a = (byte) 12;
        this.d = new Object();
        this.c = e7aVar;
        k1f.o();
        this.b = i;
    }

    public ry(ovb ovbVar, int i) {
        this.a = (byte) 15;
        this.d = new Object();
        this.c = ovbVar;
        dhf.S();
        this.b = i;
    }

    public ry() {
        this.a = (byte) 4;
    }

    public ry(es9 es9Var) {
        this.a = (byte) 7;
        this.c = es9Var;
        this.d = new op();
    }

    public ry(fr2 fr2Var, yq2 yq2Var) {
        this.a = (byte) 3;
        this.c = new Object();
        this.d = new ArrayList();
    }

    public ry(rh0 rh0Var) {
        this.a = (byte) 2;
        rh0Var.getClass();
        this.c = rh0Var;
        this.d = new qs6();
    }

    public ry(String str) {
        this.a = (byte) 10;
        this.c = str;
        this.d = null;
        this.b = false;
    }

    public ry(qy qyVar, qy qyVar2) {
        this.a = (byte) 0;
        this.c = qyVar;
        this.d = qyVar2;
        this.b = true;
    }

    public ry(byte[] bArr) {
        this.a = (byte) 10;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.c = null;
        this.b = true;
    }

    public ry(aw1 aw1Var, fn0 fn0Var) {
        this.a = (byte) 1;
        this.c = aw1Var;
        this.d = fn0Var;
    }

    public ry(ykc ykcVar) {
        this.a = (byte) 9;
        this.d = ykcVar;
        this.c = new int[2];
    }
}
