package h3;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class l {

    public final Context f8008a;

    public final za.b f8009b = new za.b(25);

    public int f8010c = 0;

    public l(Context context) {
        this.f8008a = context;
    }

    public j3.j0 a(Context context) {
        a5.n nVar = new a5.n(25);
        j3.g gVarA = j3.g.a(context);
        gVarA.getClass();
        nVar.f100b = gVarA;
        return nVar.e();
    }

    public final e[] b(Handler handler, h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4) {
        char c10;
        char c11;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        int i14 = this.f8010c;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Context context = this.f8008a;
        za.b bVar = this.f8009b;
        arrayList.add(new e5.i(context, bVar, handler, h0Var));
        if (i14 == 0) {
            c10 = 0;
        } else {
            int size = arrayList.size();
            if (i14 == 2) {
                size--;
            }
            int i15 = size;
            c10 = 0;
            try {
                try {
                    c11 = 2;
                    try {
                        i10 = i15 + 1;
                        try {
                            arrayList.add(i15, (e) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, h0.class, cls).newInstance(5000L, handler, h0Var, 50));
                            d5.a.v("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            i15 = i10;
                            i10 = i15;
                        }
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (ClassNotFoundException unused3) {
                    c11 = 2;
                }
                try {
                    Class<?> cls3 = Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer");
                    Class<?>[] clsArr = new Class[4];
                    clsArr[0] = cls2;
                    clsArr[1] = Handler.class;
                    clsArr[c11] = h0.class;
                    clsArr[3] = cls;
                    Constructor<?> constructor = cls3.getConstructor(clsArr);
                    Object[] objArr = new Object[4];
                    objArr[0] = 5000L;
                    objArr[1] = handler;
                    objArr[c11] = h0Var;
                    objArr[3] = 50;
                    arrayList.add(i10, (e) constructor.newInstance(objArr));
                    d5.a.v("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused4) {
                } catch (Exception e9) {
                    throw new RuntimeException("Error instantiating AV1 extension", e9);
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating VP9 extension", e10);
            }
        }
        j3.j0 j0VarA = a(context);
        int i16 = this.f8010c;
        arrayList.add(new j3.n0(this.f8008a, bVar, handler, h0Var2, j0VarA));
        if (i16 != 0) {
            int size2 = arrayList.size();
            if (i16 == 2) {
                size2--;
            }
            try {
                try {
                    i11 = size2 + 1;
                    try {
                        arrayList.add(size2, (e) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                        d5.a.v("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        size2 = i11;
                        i11 = size2;
                    }
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating MIDI extension", e11);
                }
            } catch (ClassNotFoundException unused6) {
            }
            try {
                try {
                    Class<?> cls4 = Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer");
                    Class<?>[] clsArr2 = new Class[3];
                    clsArr2[c10] = Handler.class;
                    clsArr2[1] = j3.o.class;
                    clsArr2[2] = j3.t.class;
                    Constructor<?> constructor2 = cls4.getConstructor(clsArr2);
                    Object[] objArr2 = new Object[3];
                    objArr2[c10] = handler;
                    objArr2[1] = h0Var2;
                    objArr2[2] = j0VarA;
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (e) constructor2.newInstance(objArr2));
                        d5.a.v("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused7) {
                        i11 = i12;
                        i12 = i11;
                    }
                } catch (ClassNotFoundException unused8) {
                }
                try {
                    try {
                        Class<?> cls5 = Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer");
                        Class<?>[] clsArr3 = new Class[3];
                        clsArr3[c10] = Handler.class;
                        clsArr3[1] = j3.o.class;
                        clsArr3[2] = j3.t.class;
                        Constructor<?> constructor3 = cls5.getConstructor(clsArr3);
                        Object[] objArr3 = new Object[3];
                        objArr3[c10] = handler;
                        objArr3[1] = h0Var2;
                        objArr3[2] = j0VarA;
                        i13 = i12 + 1;
                        try {
                            arrayList.add(i12, (e) constructor3.newInstance(objArr3));
                            d5.a.v("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused9) {
                            i12 = i13;
                            i13 = i12;
                        }
                    } catch (Exception e12) {
                        throw new RuntimeException("Error instantiating FLAC extension", e12);
                    }
                } catch (ClassNotFoundException unused10) {
                }
                try {
                    Class[] clsArr4 = new Class[3];
                    clsArr4[c10] = Handler.class;
                    clsArr4[1] = j3.o.class;
                    clsArr4[2] = j3.t.class;
                    Constructor constructor4 = FfmpegAudioRenderer.class.getConstructor(clsArr4);
                    Object[] objArr4 = new Object[3];
                    objArr4[c10] = handler;
                    objArr4[1] = h0Var2;
                    objArr4[2] = j0VarA;
                    arrayList.add(i13, (e) constructor4.newInstance(objArr4));
                    d5.a.v("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused11) {
                } catch (Exception e13) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e13);
                }
            } catch (Exception e14) {
                throw new RuntimeException("Error instantiating Opus extension", e14);
            }
        }
        arrayList.add(new r4.m(h0Var3, handler.getLooper()));
        arrayList.add(new z3.f(h0Var4, handler.getLooper()));
        arrayList.add(new f5.a());
        return (e[]) arrayList.toArray(new e[0]);
    }
}
