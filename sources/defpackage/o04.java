package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
public final class o04 implements Runnable {
    public final byte a;
    public Object b;

    public o04() {
        this.a = (byte) 25;
    }

    private final void a() {
        boolean z;
        File file;
        int i;
        String str;
        int i2;
        String str2;
        int i3;
        int i4;
        long j;
        boolean z2;
        boolean z3;
        MediaController w = MediaController.w();
        oo6 oo6Var = (oo6) this.b;
        k47 k47Var = oo6Var.a;
        rcc rccVar = oo6Var.b;
        if (k47Var != null && rccVar != null) {
            String str3 = rccVar.o;
            long j2 = rccVar.p;
            long j3 = rccVar.a;
            long j4 = rccVar.c;
            long j5 = rccVar.b;
            int i5 = rccVar.k;
            int i6 = rccVar.l;
            int i7 = rccVar.g;
            int i8 = rccVar.h;
            int i9 = rccVar.i;
            int i10 = rccVar.n;
            int i11 = rccVar.m;
            int i12 = rccVar.j;
            if (!pg3.B(k47.B0(k47Var.k)) && !rccVar.U) {
                z = false;
            } else {
                z = true;
            }
            File file2 = new File(k47Var.k.attachPath);
            if (file2.exists()) {
                file2.delete();
            }
            if (e21.a) {
                file = file2;
                StringBuilder sb = new StringBuilder("begin convert ");
                sb.append(str3);
                sb.append(" startTime = ");
                sb.append(j3);
                sb.append(" avatarStartTime = ");
                sb.append(j4);
                sb.append(" endTime ");
                sb.append(j5);
                sb.append(" rWidth = ");
                sb.append(i5);
                sb.append(" rHeight = ");
                sb.append(i6);
                sb.append(" rotation = ");
                sb.append(i7);
                sb.append(" oWidth = ");
                sb.append(i8);
                sb.append(" oHeight = ");
                sb.append(i9);
                sb.append(" framerate = ");
                sb.append(i10);
                sb.append(" bitrate = ");
                i = i11;
                sb.append(i);
                str = str3;
                sb.append(" originalBitrate = ");
                i2 = i12;
                sb.append(i2);
                fc4.b(sb.toString());
            } else {
                file = file2;
                i = i11;
                str = str3;
                i2 = i12;
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i13 > 0 && j5 > 0) {
                j = j5 - j3;
                i3 = i2;
                i4 = i;
            } else {
                i3 = i2;
                if (j5 > 0) {
                    i4 = i;
                    j = j5;
                } else {
                    i4 = i;
                    long j6 = rccVar.v;
                    if (i13 > 0) {
                        j6 -= j3;
                    }
                    j = j6;
                }
            }
            if (i10 == 0) {
                i10 = 25;
            } else if (i10 > 59) {
                i10 = 59;
            }
            if (i7 == 90 || i7 == 270) {
                i6 = i5;
                i5 = i6;
            }
            if (!rccVar.Y && i10 > 40 && Math.min(i6, i5) <= 480) {
                i10 = 30;
            }
            if (j4 == -1 && rccVar.H == null && rccVar.G == null && rccVar.B == null && rccVar.A == null && i5 == i8 && i6 == i9 && i7 == 0 && !rccVar.s && j3 == -1 && rccVar.a0.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("videoconvert", 0);
            long currentTimeMillis = System.currentTimeMillis();
            File file3 = file;
            trc trcVar = new trc(w, rccVar, file3, oo6Var);
            rccVar.W = true;
            MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
            MediaCodecVideoConvertor.ConvertVideoParams of = MediaCodecVideoConvertor.ConvertVideoParams.of(str2, file3, j2, i7, z, i8, i9, i5, i6, i10, i4, i3, j3, j5, j4, z2, j, trcVar, rccVar);
            of.soundInfos.addAll(rccVar.a0);
            boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of);
            boolean z4 = rccVar.V;
            if (!z4) {
                synchronized (w.b) {
                    z4 = rccVar.V;
                }
            }
            if (e21.a) {
                fc4.b("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z4);
            }
            sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
            long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
            boolean z5 = z4;
            long length = file3.length();
            if (!convertVideo && !z5) {
                z3 = false;
            } else {
                z3 = true;
            }
            rcc rccVar2 = oo6Var.b;
            boolean z6 = rccVar2.W;
            if (z6) {
                rccVar2.W = false;
            }
            gm.c3(new en6(w, z3, true, oo6Var, file3, 1.0f, lastFrameTimestamp, z6, length));
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o04.run():void");
    }

    public o04(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
