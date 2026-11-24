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
public final class qx implements dk6, f69 {
    public final byte a;
    public boolean b;
    public Object c;
    public Object d;

    public qx(ByteBuffer byteBuffer, int i, RectF rectF) {
        this.a = (byte) 8;
        this.c = rectF;
        this.b = i;
        try {
            this.d = File.createTempFile("paint", ".bin", a.b.getCacheDir());
        } catch (Exception e) {
            fa4.g(e, true);
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
                fa4.g(e2, true);
            }
        }
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        u56 u56Var;
        boolean z;
        qnd qndVar = (qnd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            u56Var = ((w56) this.c).b;
            z = this.b;
            ((w56) this.c).b = null;
        }
        if (u56Var == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            eef.T3(qndVar, u56Var, z, taskCompletionSource);
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
    public final rx a(ep epVar) {
        MediaCodec mediaCodec;
        gk6 txVar;
        int i;
        rx rxVar;
        String str = ((ik6) epVar.a).a;
        rx rxVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (this.b && Build.VERSION.SDK_INT >= 36) {
                    txVar = new g29(mediaCodec, (byte) 16);
                    i = 4;
                } else {
                    txVar = new tx(mediaCodec, (HandlerThread) ((px) this.d).get());
                    i = 0;
                }
                rxVar = new rx(mediaCodec, (HandlerThread) ((px) this.c).get(), txVar, (bg6) epVar.f);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            Trace.endSection();
            Surface surface = (Surface) epVar.d;
            if (surface == null && ((ik6) epVar.a).h && Build.VERSION.SDK_INT >= 35) {
                i |= 8;
            }
            rxVar.p((MediaFormat) epVar.b, surface, (MediaCrypto) epVar.e, i);
            return rxVar;
        } catch (Exception e3) {
            e = e3;
            rxVar2 = rxVar;
            if (rxVar2 == null) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
            } else {
                rxVar2.release();
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
        dq9 dq9Var = (dq9) this.c;
        g16 m = dq9Var.m();
        if (m.b == v06.b) {
            m.a(new k29(dq9Var, (byte) 0));
            final oo ooVar = (oo) this.d;
            if (!ooVar.c) {
                m.a(new b16() {
                    @Override
                    public final void b(e16 e16Var, u06 u06Var) {
                        u06 u06Var2 = u06.ON_START;
                        oo ooVar2 = oo.this;
                        if (u06Var == u06Var2) {
                            ooVar2.e = true;
                        } else if (u06Var == u06.ON_STOP) {
                            ooVar2.e = false;
                        }
                    }
                });
                ooVar.c = true;
                this.b = true;
                return;
            }
            sc8.j("SavedStateRegistry was already attached.");
            return;
        }
        sc8.j("Restarter must be created only during owner's initialization stage");
    }

    public final void f(Bundle bundle) {
        Bundle bundle2;
        if (!this.b) {
            e();
        }
        g16 m = ((dq9) this.c).m();
        if (m.b.compareTo(v06.d) < 0) {
            oo ooVar = (oo) this.d;
            if (ooVar.c) {
                if (!ooVar.d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    ooVar.a = bundle2;
                    ooVar.d = true;
                    return;
                }
                sc8.j("SavedStateRegistry was already restored.");
                return;
            }
            sc8.j("You must call performAttach() before calling performRestore(Bundle).");
            return;
        }
        v06 v06Var = m.b;
        throw new IllegalStateException(("performRestore cannot be called when owner is " + v06Var).toString());
    }

    public final void g(Bundle bundle) {
        oo ooVar = (oo) this.d;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) ooVar.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        wo9 wo9Var = (wo9) ooVar.f;
        uo9 uo9Var = new uo9(wo9Var);
        wo9Var.c.put(uo9Var, Boolean.FALSE);
        while (uo9Var.hasNext()) {
            Map.Entry entry = (Map.Entry) uo9Var.next();
            bundle2.putBundle((String) entry.getKey(), ((cq9) entry.getValue()).c());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final synchronized w56 h() {
        return (w56) this.c;
    }

    public final byte[] i() {
        o8d o8dVar;
        zn7 zn7Var;
        tkd tkdVar;
        zn7 zn7Var2;
        pid pidVar;
        zn7 zn7Var3;
        switch (this.a) {
            case 12:
                ize izeVar = ize.h;
                wtc wtcVar = (wtc) this.c;
                ((pse) this.d).h = false;
                pse pseVar = (pse) this.d;
                pseVar.f = Boolean.FALSE;
                wtcVar.a = new bte(pseVar);
                try {
                    ize.k();
                    hie hieVar = new hie(wtcVar);
                    it8 it8Var = new it8((byte) 1);
                    izeVar.a(it8Var);
                    HashMap hashMap = new HashMap(it8Var.b);
                    HashMap hashMap2 = new HashMap(it8Var.c);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        o8dVar = new o8d(byteArrayOutputStream, hashMap, hashMap2);
                        zn7Var = (zn7) hashMap.get(hie.class);
                    } catch (IOException unused) {
                    }
                    if (zn7Var != null) {
                        zn7Var.a(hieVar, o8dVar);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(hie.class)));
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            case 13:
                pd5 pd5Var = pd5.r;
                ep epVar = (ep) this.c;
                ((pse) this.d).h = false;
                pse pseVar2 = (pse) this.d;
                pseVar2.f = Boolean.FALSE;
                epVar.a = new d1f(pseVar2);
                try {
                    o5f.t0();
                    pte pteVar = new pte(epVar);
                    it8 it8Var2 = new it8((byte) 3);
                    pd5Var.g(it8Var2);
                    HashMap hashMap3 = new HashMap(it8Var2.b);
                    HashMap hashMap4 = new HashMap(it8Var2.c);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        tkdVar = new tkd(byteArrayOutputStream2, hashMap3, hashMap4);
                        zn7Var2 = (zn7) hashMap3.get(pte.class);
                    } catch (IOException unused2) {
                    }
                    if (zn7Var2 != null) {
                        zn7Var2.a(pteVar, tkdVar);
                        return byteArrayOutputStream2.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(pte.class)));
                } catch (UnsupportedEncodingException e2) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e2);
                }
            default:
                cff cffVar = cff.E;
                ntb ntbVar = (ntb) this.c;
                ((pse) this.d).h = false;
                pse pseVar3 = (pse) this.d;
                pseVar3.f = Boolean.FALSE;
                ntbVar.a = new bdf(pseVar3);
                try {
                    cff.R();
                    r5f r5fVar = new r5f(ntbVar);
                    it8 it8Var3 = new it8((byte) 2);
                    cffVar.z(it8Var3);
                    HashMap hashMap5 = new HashMap(it8Var3.b);
                    HashMap hashMap6 = new HashMap(it8Var3.c);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        pidVar = new pid(byteArrayOutputStream3, hashMap5, hashMap6);
                        zn7Var3 = (zn7) hashMap5.get(r5f.class);
                    } catch (IOException unused3) {
                    }
                    if (zn7Var3 != null) {
                        zn7Var3.a(r5fVar, pidVar);
                        return byteArrayOutputStream3.toByteArray();
                    }
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(r5f.class)));
                } catch (UnsupportedEncodingException e3) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e3);
                }
        }
    }

    public qx(u84 u84Var, w56 w56Var) {
        this.a = (byte) 11;
        this.d = u84Var;
        this.b = true;
        this.c = w56Var;
    }

    public qx(dja djaVar, Object obj, byte b) {
        this.a = b;
        this.d = djaVar;
        this.c = obj;
    }

    public qx(String str, String str2, boolean z) {
        this.a = (byte) 14;
        this.d = str;
        this.c = str2;
        this.b = z;
    }

    public qx(ep epVar, int i) {
        this.a = (byte) 13;
        this.d = new Object();
        this.c = epVar;
        o5f.t0();
        this.b = i;
    }

    public qx(ntb ntbVar, int i) {
        this.a = (byte) 15;
        this.d = new Object();
        this.c = ntbVar;
        cff.R();
        this.b = i;
    }

    public qx(wtc wtcVar, int i) {
        this.a = (byte) 12;
        this.d = new Object();
        this.c = wtcVar;
        ize.k();
        this.b = i;
    }

    public qx() {
        this.a = (byte) 4;
    }

    public qx(dq9 dq9Var) {
        this.a = (byte) 7;
        this.c = dq9Var;
        this.d = new oo();
    }

    public qx(up2 up2Var, np2 np2Var) {
        this.a = (byte) 3;
        this.c = new Object();
        this.d = new ArrayList();
    }

    public qx(qg0 qg0Var) {
        this.a = (byte) 2;
        qg0Var.getClass();
        this.c = qg0Var;
        this.d = new qq6();
    }

    public qx(String str) {
        this.a = (byte) 10;
        this.c = str;
        this.d = null;
        this.b = false;
    }

    public qx(px pxVar, px pxVar2) {
        this.a = (byte) 0;
        this.c = pxVar;
        this.d = pxVar2;
        this.b = true;
    }

    public qx(byte[] bArr) {
        this.a = (byte) 10;
        Objects.requireNonNull(bArr);
        this.d = bArr;
        this.c = null;
        this.b = true;
    }

    public qx(ou1 ou1Var, fm0 fm0Var) {
        this.a = (byte) 1;
        this.c = ou1Var;
        this.d = fm0Var;
    }

    public qx(yic yicVar) {
        this.a = (byte) 9;
        this.d = yicVar;
        this.c = new int[2];
    }
}
