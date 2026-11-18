package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class wa {
    public final org.telegram.ui.Components.c6 f15693a;
    public final int f15694b;
    public final short[] d;
    public short f15696e;
    public final MediaExtractor f15697f;
    public final MediaFormat f15698g;
    public final long h;
    public final FfmpegAudioWaveformLoader f15701k;
    public final db f15702l;
    public int f15695c = 0;
    public final Object f15699i = new Object();
    public boolean f15700j = false;

    public wa(db dbVar, String str, int i7) {
        long j3;
        this.f15702l = dbVar;
        this.f15693a = new org.telegram.ui.Components.c6(dbVar, 0L, 600L, lr.h);
        int i10 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f15697f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i10 < trackCount) {
                    MediaFormat trackFormat = this.f15697f.getTrackFormat(i10);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f15697f.selectTrack(i10);
                        this.f15698g = trackFormat;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f15698g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ya yaVar = dbVar.h;
        if (yaVar != null) {
            j3 = yaVar.f15784e;
        } else if (!dbVar.f14484s.isEmpty()) {
            j3 = dbVar.getBaseDuration();
        } else if (dbVar.F) {
            j3 = dbVar.I;
        } else {
            j3 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j3, dbVar.getMaxScrollDuration()))) * i7) / Math.round(org.telegram.messenger.g0.N(3.3333f))), 4000);
        this.f15694b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f15698g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.h.c(new k(this, 22));
            } else {
                this.f15701k = new FfmpegAudioWaveformLoader(str, min, new e7(this, 2));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f15701k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new k(this, 22));
        synchronized (this.f15699i) {
            this.f15700j = true;
        }
    }

    public final void b(short[] sArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f15695c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s5 = this.f15696e;
            short s9 = sArr[i10];
            if (s5 < s9) {
                this.f15696e = s9;
            }
        }
        this.f15695c += i7;
        this.f15702l.invalidate();
    }
}
