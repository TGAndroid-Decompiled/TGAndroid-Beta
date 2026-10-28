package ai;

import android.graphics.Matrix;
import di.v6;
import fi.w7;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r2;
public final class e0 implements Runnable {
    public final int f1475a;
    public final Object f1476b;
    public final Object f1477c;
    public final Object d;
    public final Object e;

    public e0(v6 v6Var, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f1475a = 12;
        this.d = v6Var;
        this.e = tLObject;
        this.f1477c = callback;
        this.f1476b = tL_error;
    }

    private final void a() {
        String path;
        String path2;
        String path3;
        String path4;
        int i10;
        long j10;
        float f7;
        float f10;
        int i11;
        long j11;
        long j12;
        int[] iArr;
        int i12;
        String path5;
        ArrayList arrayList;
        w7 w7Var = (w7) this.d;
        String str = (String) this.e;
        int[][] iArr2 = (int[][]) this.f1476b;
        Utilities.Callback callback = (Utilities.Callback) this.f1477c;
        w7Var.getClass();
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        char c10 = 1;
        videoEditedInfo.isStory = true;
        videoEditedInfo.fromCamera = w7Var.f11895c1;
        videoEditedInfo.originalWidth = w7Var.f11910k0;
        videoEditedInfo.originalHeight = w7Var.f11912l0;
        videoEditedInfo.resultWidth = w7Var.f11906i0;
        videoEditedInfo.resultHeight = w7Var.f11908j0;
        File file = w7Var.P0;
        if (file == null) {
            path = null;
        } else {
            path = file.getPath();
        }
        videoEditedInfo.paintPath = path;
        File file2 = w7Var.W0;
        if (file2 == null) {
            path2 = null;
        } else {
            path2 = file2.getPath();
        }
        videoEditedInfo.messagePath = path2;
        File file3 = w7Var.X0;
        if (file3 == null) {
            path3 = null;
        } else {
            path3 = file3.getPath();
        }
        videoEditedInfo.messageVideoMaskPath = path3;
        File file4 = w7Var.Y0;
        if (file4 == null) {
            path4 = null;
        } else {
            path4 = file4.getPath();
        }
        videoEditedInfo.backgroundPath = path4;
        int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
        if (w7Var.K && str != null && !w7Var.v()) {
            videoEditedInfo.originalPath = str;
            videoEditedInfo.isPhoto = false;
            videoEditedInfo.framerate = Math.min(59, iArr2[0][7]);
            int videoBitrate = MediaController.getVideoBitrate(str);
            if (videoBitrate == -1) {
                videoBitrate = iArr2[0][3];
            }
            videoEditedInfo.originalBitrate = videoBitrate;
            if (videoBitrate < 1000000 && (arrayList = w7Var.T0) != null && !arrayList.isEmpty()) {
                videoEditedInfo.bitrate = 2000000;
                videoEditedInfo.originalBitrate = -1;
            } else {
                int i13 = videoEditedInfo.originalBitrate;
                if (i13 < 500000) {
                    videoEditedInfo.bitrate = 2500000;
                    videoEditedInfo.originalBitrate = -1;
                } else {
                    videoEditedInfo.bitrate = Utilities.clamp(i13, 3000000, 500000);
                }
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(videoEditedInfo.originalBitrate);
            sb2.append(" => ");
            org.telegram.messenger.t.o(videoEditedInfo.bitrate, sb2);
            long j13 = iArr2[0][4];
            w7Var.f11904h0 = j13;
            videoEditedInfo.originalDuration = j13 * 1000;
            float f11 = (float) j13;
            long j14 = w7Var.Z * f11 * 1000;
            videoEditedInfo.startTime = j14;
            long j15 = w7Var.f11888a0 * f11 * 1000;
            videoEditedInfo.endTime = j15;
            videoEditedInfo.estimatedDuration = j15 - j14;
            videoEditedInfo.volume = w7Var.P;
            videoEditedInfo.muted = w7Var.Y;
            videoEditedInfo.estimatedSize = a1.g.C(i12 / 1000.0f, extractRealEncoderBitrate, 8.0f, iArr[5]);
            videoEditedInfo.estimatedSize = Math.max(w7Var.L.length(), videoEditedInfo.estimatedSize);
            videoEditedInfo.filterState = w7Var.f11889a1;
            File file5 = w7Var.Q0;
            if (file5 == null) {
                path5 = null;
            } else {
                path5 = file5.getPath();
            }
            videoEditedInfo.blurPath = path5;
            j10 = 0;
        } else {
            File file6 = w7Var.Z0;
            if (file6 != null) {
                videoEditedInfo.originalPath = file6.getAbsolutePath();
            } else {
                videoEditedInfo.originalPath = str;
            }
            videoEditedInfo.isPhoto = true;
            videoEditedInfo.collage = w7Var.S;
            if (w7Var.v()) {
                int i14 = 0;
                boolean z10 = false;
                while (i14 < w7Var.T.size()) {
                    w7 w7Var2 = (w7) w7Var.T.get(i14);
                    if (w7Var2.K) {
                        w7Var2.f11910k0 = Math.max(w7Var2.f11910k0, iArr2[i14][c10]);
                        w7Var2.f11912l0 = Math.max(w7Var2.f11912l0, iArr2[i14][2]);
                        i11 = extractRealEncoderBitrate;
                        w7Var2.f11904h0 = Math.max(w7Var2.f11904h0, iArr2[i14][4]);
                        z10 = true;
                    } else {
                        i11 = extractRealEncoderBitrate;
                    }
                    i14++;
                    extractRealEncoderBitrate = i11;
                    c10 = 1;
                }
                i10 = extractRealEncoderBitrate;
                ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(w7Var);
                videoEditedInfo.collageParts = parts;
                if (!z10) {
                    long j16 = w7Var.S0;
                    w7Var.f11904h0 = j16;
                    videoEditedInfo.originalDuration = j16;
                    videoEditedInfo.estimatedDuration = j16;
                } else {
                    int size = parts.size();
                    long j17 = 0;
                    VideoEditedInfo.Part part = null;
                    int i15 = 0;
                    while (i15 < size) {
                        VideoEditedInfo.Part part2 = parts.get(i15);
                        i15++;
                        VideoEditedInfo.Part part3 = part2;
                        if (part3.isVideo) {
                            long j18 = part3.duration;
                            if (j18 > j17) {
                                part = part3;
                                j17 = j18;
                            }
                        }
                    }
                    if (part != null) {
                        long j19 = (part.right - part.left) * ((float) part.duration);
                        w7Var.f11904h0 = j19;
                        videoEditedInfo.originalDuration = j19;
                        videoEditedInfo.estimatedDuration = j19;
                        j10 = -(part.offset + (f10 * f7));
                        part.offset = j10;
                        ArrayList<VideoEditedInfo.Part> arrayList2 = videoEditedInfo.collageParts;
                        int size2 = arrayList2.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            VideoEditedInfo.Part part4 = arrayList2.get(i16);
                            i16++;
                            VideoEditedInfo.Part part5 = part4;
                            if (part5.isVideo && part5 != part) {
                                part5.offset += j10;
                            }
                        }
                        videoEditedInfo.startTime = -1L;
                        videoEditedInfo.endTime = -1L;
                        videoEditedInfo.muted = true;
                        videoEditedInfo.originalBitrate = -1;
                        videoEditedInfo.volume = 1.0f;
                        videoEditedInfo.bitrate = -1;
                        videoEditedInfo.framerate = 30;
                        videoEditedInfo.estimatedSize = ((((float) w7Var.f11904h0) / 1000.0f) * i10) / 8.0f;
                        videoEditedInfo.filterState = null;
                    }
                }
            } else {
                i10 = extractRealEncoderBitrate;
                if (w7Var.f11917o0 != null) {
                    long j20 = (w7Var.f11927t0 - w7Var.f11925s0) * ((float) w7Var.f11921q0);
                    w7Var.f11904h0 = j20;
                    videoEditedInfo.originalDuration = j20;
                    videoEditedInfo.estimatedDuration = j20;
                } else if (w7Var.f11935y != null) {
                    long j21 = (w7Var.F - w7Var.E) * ((float) w7Var.C);
                    w7Var.f11904h0 = j21;
                    videoEditedInfo.originalDuration = j21;
                    videoEditedInfo.estimatedDuration = j21;
                } else {
                    long j22 = w7Var.S0;
                    w7Var.f11904h0 = j22;
                    videoEditedInfo.originalDuration = j22;
                    videoEditedInfo.estimatedDuration = j22;
                }
            }
            j10 = 0;
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
            videoEditedInfo.muted = true;
            videoEditedInfo.originalBitrate = -1;
            videoEditedInfo.volume = 1.0f;
            videoEditedInfo.bitrate = -1;
            videoEditedInfo.framerate = 30;
            videoEditedInfo.estimatedSize = ((((float) w7Var.f11904h0) / 1000.0f) * i10) / 8.0f;
            videoEditedInfo.filterState = null;
        }
        videoEditedInfo.account = w7Var.f11887a;
        videoEditedInfo.wallpaperPeerId = w7Var.f11938z0;
        videoEditedInfo.isDark = w7Var.f11936y0;
        videoEditedInfo.avatarStartTime = -1L;
        MediaController.CropState cropState = w7Var.m0;
        if (cropState != null) {
            videoEditedInfo.cropState = cropState.clone();
        } else {
            videoEditedInfo.cropState = new MediaController.CropState();
        }
        videoEditedInfo.cropState.useMatrix = new Matrix();
        videoEditedInfo.cropState.useMatrix.set(w7Var.f11915n0);
        videoEditedInfo.mediaEntities = w7Var.T0;
        videoEditedInfo.gradientTopColor = Integer.valueOf(w7Var.A0);
        videoEditedInfo.gradientBottomColor = Integer.valueOf(w7Var.B0);
        videoEditedInfo.forceFragmenting = true;
        videoEditedInfo.hdrInfo = w7Var.f11897d1;
        videoEditedInfo.mixedSoundInfos.clear();
        if (w7Var.v() && !w7Var.Y) {
            ArrayList<VideoEditedInfo.Part> arrayList3 = videoEditedInfo.collageParts;
            int size3 = arrayList3.size();
            int i17 = 0;
            while (i17 < size3) {
                VideoEditedInfo.Part part6 = arrayList3.get(i17);
                i17++;
                VideoEditedInfo.Part part7 = part6;
                if (part7.isVideo && part7.volume > 0.0f && !part7.muted) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(part7.path);
                    mixedSoundInfo.volume = part7.volume;
                    float f12 = part7.left;
                    float f13 = (float) part7.duration;
                    mixedSoundInfo.audioOffset = f12 * f13 * 1000;
                    mixedSoundInfo.startTime = part7.offset * 1000;
                    mixedSoundInfo.duration = (part7.right - f12) * f13 * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
                }
            }
        }
        File file7 = w7Var.f11917o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = w7Var.f11929u0;
            float f14 = w7Var.f11925s0;
            float f15 = (float) w7Var.f11921q0;
            long j23 = f14 * f15 * 1000;
            mixedSoundInfo2.audioOffset = j23;
            if (w7Var.K) {
                mixedSoundInfo2.startTime = (((float) w7Var.f11923r0) - (w7Var.Z * ((float) w7Var.f11904h0))) * 1000;
                j12 = 0;
            } else {
                j12 = 0;
                mixedSoundInfo2.startTime = 0L;
            }
            long j24 = mixedSoundInfo2.startTime + j10;
            mixedSoundInfo2.startTime = j24;
            if (j24 < j12) {
                mixedSoundInfo2.audioOffset = j23 - j24;
                mixedSoundInfo2.startTime = j12;
            }
            mixedSoundInfo2.duration = (w7Var.f11927t0 - f14) * f15 * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
        }
        String str2 = w7Var.f11935y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = w7Var.G;
            float f16 = w7Var.E;
            float f17 = (float) w7Var.C;
            long j25 = f16 * f17 * 1000;
            mixedSoundInfo3.audioOffset = j25;
            if (w7Var.K) {
                mixedSoundInfo3.startTime = (((float) w7Var.D) - (w7Var.Z * ((float) w7Var.f11904h0))) * 1000;
                j11 = 0;
            } else {
                j11 = 0;
                mixedSoundInfo3.startTime = 0L;
            }
            long j26 = mixedSoundInfo3.startTime + j10;
            mixedSoundInfo3.startTime = j26;
            if (j26 < j11) {
                mixedSoundInfo3.audioOffset = j25 - j26;
                mixedSoundInfo3.startTime = j11;
            }
            mixedSoundInfo3.duration = (w7Var.F - f16) * f17 * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
        }
        callback.run(videoEditedInfo);
    }

    private final void b() {
        com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.d;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
        m4.i iVar = (m4.i) this.f1476b;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f1477c;
        synchronized (qVar.f7757a) {
            try {
                if (!atomicBoolean.get()) {
                    qVar.h(iVar);
                } else {
                    atomicBoolean2.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.e0.run():void");
    }

    public e0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1475a = i10;
        this.d = obj;
        this.e = obj2;
        this.f1476b = obj3;
        this.f1477c = obj4;
    }

    public e0(String str, Utilities.CallbackReturn callbackReturn, r2 r2Var, Utilities.Callback callback) {
        this.f1475a = 1;
        this.d = str;
        this.f1476b = callbackReturn;
        this.e = r2Var;
        this.f1477c = callback;
    }
}
