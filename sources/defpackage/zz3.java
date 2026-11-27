package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
public final class zz3 implements Runnable {
    public final byte a;
    public Object b;

    public zz3() {
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
        MediaController z4 = MediaController.z();
        so6 so6Var = (so6) this.b;
        r47 r47Var = so6Var.a;
        oec oecVar = so6Var.b;
        if (r47Var != null && oecVar != null) {
            String str3 = oecVar.o;
            long j2 = oecVar.p;
            long j3 = oecVar.a;
            long j4 = oecVar.c;
            long j5 = oecVar.b;
            int i5 = oecVar.k;
            int i6 = oecVar.l;
            int i7 = oecVar.g;
            int i8 = oecVar.h;
            int i9 = oecVar.i;
            int i10 = oecVar.n;
            int i11 = oecVar.m;
            int i12 = oecVar.j;
            if (!wf3.B(r47.B0(r47Var.k)) && !oecVar.U) {
                z = false;
            } else {
                z = true;
            }
            File file2 = new File(r47Var.k.attachPath);
            if (file2.exists()) {
                file2.delete();
            }
            if (f11.a) {
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
                cc4.b(sb.toString());
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
                    long j6 = oecVar.v;
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
            if (!oecVar.Y && i10 > 40 && Math.min(i6, i5) <= 480) {
                i10 = 30;
            }
            if (j4 == -1 && oecVar.H == null && oecVar.G == null && oecVar.B == null && oecVar.A == null && i5 == i8 && i6 == i9 && i7 == 0 && !oecVar.s && j3 == -1 && oecVar.a0.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("videoconvert", 0);
            long currentTimeMillis = System.currentTimeMillis();
            File file3 = file;
            guc gucVar = new guc(z4, oecVar, file3, so6Var);
            oecVar.W = true;
            MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
            MediaCodecVideoConvertor.ConvertVideoParams of = MediaCodecVideoConvertor.ConvertVideoParams.of(str2, file3, j2, i7, z, i8, i9, i5, i6, i10, i4, i3, j3, j5, j4, z2, j, gucVar, oecVar);
            of.soundInfos.addAll(oecVar.a0);
            boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of);
            boolean z5 = oecVar.V;
            if (!z5) {
                synchronized (z4.b) {
                    z5 = oecVar.V;
                }
            }
            if (f11.a) {
                cc4.b("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z5);
            }
            sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
            long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
            boolean z6 = z5;
            long length = file3.length();
            if (!convertVideo && !z6) {
                z3 = false;
            } else {
                z3 = true;
            }
            oec oecVar2 = so6Var.b;
            boolean z7 = oecVar2.W;
            if (z7) {
                oecVar2.W = false;
            }
            hl.c3(new nn6(z4, z3, true, so6Var, file3, 1.0f, lastFrameTimestamp, z7, length));
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz3.run():void");
    }

    public zz3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
