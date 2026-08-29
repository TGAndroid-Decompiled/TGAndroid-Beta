package nh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class jb {
    public final org.telegram.ui.Components.d6 f17976a;
    public final int f17977b;
    public final short[] d;
    public short f17979e;
    public final MediaExtractor f17980f;
    public final MediaFormat f17981g;
    public final long h;
    public final FfmpegAudioWaveformLoader f17984k;
    public final qb f17985l;
    public int f17978c = 0;
    public final Object f17982i = new Object();
    public boolean f17983j = false;

    public jb(qb qbVar, String str, int i10) {
        long j10;
        this.f17985l = qbVar;
        this.f17976a = new org.telegram.ui.Components.d6(qbVar, 0L, 600L, jr.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f17980f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f17980f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f17980f.selectTrack(i11);
                        this.f17981g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f17981g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        lb lbVar = qbVar.h;
        if (lbVar != null) {
            j10 = lbVar.f18060e;
        } else if (!qbVar.f18454s.isEmpty()) {
            j10 = qbVar.getBaseDuration();
        } else if (qbVar.A) {
            j10 = qbVar.D;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, qbVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f17977b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f17981g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new m6(this, 9));
            } else {
                this.f17984k = new FfmpegAudioWaveformLoader(str, min, new t4(this, 3));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f17984k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new m6(this, 9));
        synchronized (this.f17982i) {
            this.f17983j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f17978c;
            int i13 = i12 + i11;
            short[] sArr2 = this.d;
            if (i13 >= sArr2.length) {
                break;
            }
            sArr2[i12 + i11] = sArr[i11];
            short s10 = this.f17979e;
            short s11 = sArr[i11];
            if (s10 < s11) {
                this.f17979e = s11;
            }
        }
        this.f17978c += i10;
        this.f17985l.invalidate();
    }
}
