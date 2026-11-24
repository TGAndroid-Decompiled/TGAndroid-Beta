package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class dob {
    public final lm a;
    public final int b;
    public final short[] d;
    public short e;
    public final MediaExtractor f;
    public final MediaFormat g;
    public final long h;
    public final FfmpegAudioWaveformLoader k;
    public final kob l;
    public int c = 0;
    public final Object i = new Object();
    public boolean j = false;

    public dob(kob kobVar, String str, int i) {
        long j;
        this.l = kobVar;
        this.a = new lm(kobVar, 0L, 600L, s33.h);
        int i2 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i2 < trackCount) {
                    MediaFormat trackFormat = this.f.getTrackFormat(i2);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f.selectTrack(i2);
                        this.g = trackFormat;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        fob fobVar = kobVar.h;
        if (fobVar != null) {
            j = fobVar.e;
        } else if (!kobVar.s.isEmpty()) {
            j = kobVar.getBaseDuration();
        } else if (kobVar.F) {
            j = kobVar.I;
        } else {
            j = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j, kobVar.getMaxScrollDuration()))) * i) / Math.round(gl.N(3.3333f))), 4000);
        this.b = min;
        this.d = new short[min];
        if (this.h > 0 && this.g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.h.c(new cib(this, (byte) 7));
            } else {
                this.k = new FfmpegAudioWaveformLoader(str, min, new n4b(this, (byte) 5));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new cib(this, (byte) 7));
        synchronized (this.i) {
            this.j = true;
        }
    }

    public final void b(short[] sArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.c + i2;
            short[] sArr2 = this.d;
            if (i3 >= sArr2.length) {
                break;
            }
            sArr2[i3] = sArr[i2];
            short s = this.e;
            short s2 = sArr[i2];
            if (s < s2) {
                this.e = s2;
            }
        }
        this.c += i;
        this.l.invalidate();
    }
}
