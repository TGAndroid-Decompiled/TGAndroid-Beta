package gi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.os.Looper;
import android.view.Surface;
import android.view.ViewGroup;
import b8.zb;
import java.nio.ByteBuffer;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.gt0;
public final class f6 implements Runnable {
    public final int f12700a;
    public final Object f12701b;

    public f6(Object obj, int i3) {
        this.f12700a = i3;
        this.f12701b = obj;
    }

    @Override
    public final void run() {
        int i3;
        boolean z10;
        boolean z11;
        long j10;
        MediaCodec.BufferInfo bufferInfo;
        int i10;
        short s6;
        boolean z12;
        Object obj;
        Bitmap bitmap = null;
        boolean z13 = true;
        switch (this.f12700a) {
            case 0:
                h6 h6Var = (h6) ((g6) this.f12701b).f12836q;
                h6Var.R = System.currentTimeMillis();
                h6Var.S = 0L;
                h6Var.f12908s0 = true;
                ((s9) h6Var.f12883a).f13580a.K0.a(0L, true);
                h6Var.invalidate();
                return;
            case 1:
                p pVar = (p) this.f12701b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 2:
                d dVar = (d) this.f12701b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 3:
                ((q8) ((bh.l) this.f12701b).f3332n).fullScroll(130);
                return;
            case 4:
                ua uaVar = (ua) this.f12701b;
                uaVar.f13668h0.onTouchEvent(org.telegram.messenger.g0.R());
                uaVar.f13667g0.y(org.telegram.messenger.g0.R());
                return;
            case 5:
                va vaVar = (va) ((g3) this.f12701b).m0;
                vaVar.u(true);
                vaVar.B0.setCameraThumb(vaVar.z());
                return;
            case 6:
                ((x9) this.f12701b).f13872k2.f13749q1.setVisibility(8);
                return;
            case 7:
                y9 y9Var = (y9) this.f12701b;
                va vaVar2 = y9Var.f13985c0;
                if (!vaVar2.R1 && !vaVar2.Q1 && vaVar2.C0 != null && vaVar2.f13720g0 == 0 && vaVar2.f13740n1 != null) {
                    if (y9Var.isFrontface()) {
                        i3 = 2131744720;
                    } else {
                        i3 = 2131744719;
                    }
                    String M0 = bd.M0(i3, null);
                    l3 l3Var = vaVar2.f13740n1;
                    l3Var.h = l3.a(M0, l3Var.getTextPaint());
                    vaVar2.f13740n1.u(M0);
                    vaVar2.f13740n1.w();
                    hp.e1().edit().putInt("storysvddualhint", hp.e1().getInt("storysvddualhint", 0) + 1).apply();
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Components.k9) this.f12701b).setVisibility(8);
                return;
            case 9:
                ya yaVar = (ya) this.f12701b;
                try {
                    int round = Math.round((((float) (yaVar.h * yaVar.f13991g.getInteger("sample-rate"))) / yaVar.f13987b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(yaVar.f13991g.getString("mime"));
                    if (createDecoderByType != null) {
                        createDecoderByType.configure(yaVar.f13991g, (Surface) null, (MediaCrypto) null, 0);
                        createDecoderByType.start();
                        createDecoderByType.getInputBuffers();
                        createDecoderByType.getOutputBuffers();
                        short[] sArr = new short[32];
                        int i11 = -1;
                        boolean z14 = false;
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        short s10 = 0;
                        while (true) {
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                            if (dequeueInputBuffer >= 0) {
                                int readSampleData = yaVar.f13990f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                                if (readSampleData < 0) {
                                    j10 = 2500;
                                    i10 = 8;
                                    try {
                                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                        z10 = z13;
                                        bufferInfo = bufferInfo2;
                                        z14 = z10;
                                    } catch (Exception e10) {
                                        e = e10;
                                        z11 = z13;
                                        org.telegram.messenger.a8.g(e, z11);
                                        return;
                                    }
                                } else {
                                    j10 = 2500;
                                    i10 = 8;
                                    z10 = z13;
                                    bufferInfo = bufferInfo2;
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, yaVar.f13990f.getSampleTime(), 0);
                                    yaVar.f13990f.advance();
                                }
                            } else {
                                z10 = z13;
                                j10 = 2500;
                                bufferInfo = bufferInfo2;
                                i10 = 8;
                            }
                            if (i11 >= 0) {
                                try {
                                    createDecoderByType.getOutputBuffer(i11).position(0);
                                } catch (Exception e11) {
                                    e = e11;
                                    z11 = z10;
                                    org.telegram.messenger.a8.g(e, z11);
                                    return;
                                }
                            }
                            i11 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j10);
                            while (true) {
                                if (i11 != -1 && !z14) {
                                    if (i11 >= 0) {
                                        ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i11);
                                        if (outputBuffer != null && bufferInfo.size > 0) {
                                            int i15 = i14;
                                            while (outputBuffer.remaining() > 0) {
                                                short s11 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                                if (i15 >= round) {
                                                    sArr[i12 - i13] = s10;
                                                    int i16 = i12 + 1;
                                                    int i17 = i16 - i13;
                                                    if (i17 >= sArr.length || i16 >= yaVar.f13987b) {
                                                        org.telegram.messenger.g0.h3(new ai.e3(yaVar, sArr, i17, 15));
                                                        sArr = new short[sArr.length];
                                                        i13 = i16;
                                                    }
                                                    if (i16 >= yaVar.d.length) {
                                                        i14 = 0;
                                                        s10 = 0;
                                                        i12 = i16;
                                                    } else {
                                                        s6 = 0;
                                                        i12 = i16;
                                                        i15 = 0;
                                                    }
                                                } else {
                                                    s6 = s10;
                                                }
                                                if (s6 < s11) {
                                                    s10 = s11;
                                                } else {
                                                    s10 = s6;
                                                }
                                                i15++;
                                                int i18 = i10;
                                                if (outputBuffer.remaining() < i18) {
                                                    i14 = i15;
                                                } else {
                                                    outputBuffer.position(outputBuffer.position() + i18);
                                                    i10 = 8;
                                                }
                                            }
                                            i14 = i15;
                                        }
                                        createDecoderByType.releaseOutputBuffer(i11, false);
                                        if ((bufferInfo.flags & 4) != 0) {
                                            z14 = z10;
                                        }
                                    } else if (i11 == -3) {
                                        createDecoderByType.getOutputBuffers();
                                    }
                                    i11 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                                    i10 = 8;
                                }
                            }
                            int i19 = i12;
                            synchronized (yaVar.f13992i) {
                                if (!yaVar.f13993j) {
                                    if (!z14 && i19 < yaVar.f13987b) {
                                        i12 = i19;
                                        z13 = z10;
                                    }
                                }
                            }
                        }
                        createDecoderByType.stop();
                        createDecoderByType.release();
                        yaVar.f13990f.release();
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    e = e12;
                    z10 = z13;
                }
                break;
            case 10:
                ab abVar = (ab) this.f12701b;
                db dbVar = abVar.f12414c;
                if (dbVar != null) {
                    long j11 = dbVar.f12602a;
                    if (j11 > 0) {
                        abVar.f12415e = j11;
                        abVar.f12421l.q();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                db dbVar2 = (db) this.f12701b;
                MediaMetadataRetriever mediaMetadataRetriever = dbVar2.f12605e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(dbVar2.f12609j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(dbVar2.f12606f, dbVar2.f12607g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(dbVar2.f12606f / bitmap.getWidth(), dbVar2.f12607g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) com.google.android.recaptcha.internal.a.c(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.recaptcha.internal.a.c(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.recaptcha.internal.a.x(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.recaptcha.internal.a.x(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                            if (dbVar2.h) {
                                if (dbVar2.f12612m == null) {
                                    dbVar2.f12612m = new Path();
                                }
                                dbVar2.f12612m.rewind();
                                dbVar2.f12612m.addCircle(dbVar2.f12606f / 2.0f, dbVar2.f12607g / 2.0f, Math.min(dbVar2.f12606f, dbVar2.f12607g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(dbVar2.f12612m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, dbVar2.f12611l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, true);
                    }
                    org.telegram.messenger.g0.h3(new g2.c(27, dbVar2, bitmap));
                    return;
                }
                return;
            case 12:
                ((g2.k0) this.f12701b).getClass();
                return;
            case 13:
                hi.g gVar = (hi.g) this.f12701b;
                gt0 gt0Var = gVar.V;
                if (gt0Var != null && gVar.f14433b0 != -1) {
                    gt0Var.a();
                    return;
                }
                return;
            case 14:
                ((ii.e0) this.f12701b).invalidateSelf();
                return;
            case 15:
                ((ii.f0) this.f12701b).invalidateSelf();
                return;
            case 16:
                ((ii.h0) this.f12701b).d();
                return;
            case 17:
                ((ii.t0) this.f12701b).c();
                return;
            case 18:
                ((ii.t0) this.f12701b).c();
                return;
            case 19:
                ((ii.u0) this.f12701b).a();
                return;
            case 20:
                ((ii.v0) this.f12701b).a();
                return;
            case 21:
                ((ii.z2) this.f12701b).invalidate();
                return;
            case 22:
                ((g2.g) this.f12701b).e();
                return;
            case 23:
                ii.c4 c4Var = (ii.c4) this.f12701b;
                c4Var.R = c4Var.f14880r;
                return;
            case 24:
                k2.i0 i0Var = (k2.i0) this.f12701b;
                g2.d dVar2 = i0Var.C;
                Context context = i0Var.f16546e;
                String str = g2.n0.f11873a;
                int generateAudioSessionId = e2.h.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                dVar2.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((g2.j0) dVar2.f11820c).f11857a.getLooper()) {
                    obj = dVar2.f11821e;
                } else {
                    if (myLooper == ((g2.j0) dVar2.f11819b).f11857a.getLooper()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zb.p(z12);
                    obj = dVar2.f11822f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    dVar2.f11822f = valueOf;
                    g2.b bVar = new g2.b(dVar2, valueOf, 0);
                    g2.j0 j0Var = (g2.j0) dVar2.f11820c;
                    if (j0Var.f11857a.getLooper().getThread().isAlive()) {
                        j0Var.d(bVar);
                    }
                    i0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    i0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 25:
                k2.i0 i0Var2 = ((k2.c0) this.f12701b).f16459a;
                i0Var2.x1(null);
                i0Var2.q1(0, 0);
                return;
            case 26:
                try {
                    k2.r0.g((k2.m1) this.f12701b);
                    return;
                } catch (k2.l e14) {
                    g2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e14);
                    throw new RuntimeException(e14);
                }
            case 27:
                ei.l6 l6Var = ((kg.i1) this.f12701b).E;
                if (l6Var != null) {
                    l6Var.p(3, true);
                    return;
                }
                return;
            case 28:
                l2.f fVar = (l2.f) this.f12701b;
                l2.a Q = fVar.Q();
                fVar.V(Q, 1028, new l2.c(Q, 9));
                fVar.f17698f.d();
                return;
            default:
                lg.c cVar = (lg.c) this.f12701b;
                cVar.f18250b.f35594g3.O(true);
                cVar.a0(true);
                return;
        }
    }

    public f6(k2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f12700a = 25;
        this.f12701b = c0Var;
    }

    public f6(k2.r0 r0Var, k2.m1 m1Var) {
        this.f12700a = 26;
        this.f12701b = m1Var;
    }
}
