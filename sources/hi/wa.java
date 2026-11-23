package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class wa {
    public final org.telegram.ui.Components.d6 f15644a;
    public final int f15645b;
    public final short[] d;
    public short f15647e;
    public final MediaExtractor f15648f;
    public final MediaFormat f15649g;
    public final long h;
    public final FfmpegAudioWaveformLoader f15652k;
    public final db f15653l;
    public int f15646c = 0;
    public final Object f15650i = new Object();
    public boolean f15651j = false;

    public wa(db dbVar, String str, int i7) {
        long j3;
        this.f15653l = dbVar;
        this.f15644a = new org.telegram.ui.Components.d6(dbVar, 0L, 600L, nr.h);
        int i10 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f15648f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i10 < trackCount) {
                    MediaFormat trackFormat = this.f15648f.getTrackFormat(i10);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f15648f.selectTrack(i10);
                        this.f15649g = trackFormat;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f15649g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ya yaVar = dbVar.h;
        if (yaVar != null) {
            j3 = yaVar.f15740e;
        } else if (!dbVar.f14461s.isEmpty()) {
            j3 = dbVar.getBaseDuration();
        } else if (dbVar.F) {
            j3 = dbVar.I;
        } else {
            j3 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j3, dbVar.getMaxScrollDuration()))) * i7) / Math.round(org.telegram.messenger.g0.N(3.3333f))), 4000);
        this.f15645b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f15649g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.h.c(new b0(this, 21));
            } else {
                this.f15652k = new FfmpegAudioWaveformLoader(str, min, new e7(this, 2));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f15652k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new b0(this, 21));
        synchronized (this.f15650i) {
            this.f15651j = true;
        }
    }

    public final void b(short[] sArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f15646c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s5 = this.f15647e;
            short s9 = sArr[i10];
            if (s5 < s9) {
                this.f15647e = s9;
            }
        }
        this.f15646c += i7;
        this.f15653l.invalidate();
    }
}
