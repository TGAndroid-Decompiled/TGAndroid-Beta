package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class va {
    public final org.telegram.ui.Components.d6 f15669a;
    public final int f15670b;
    public final short[] d;
    public short f15672e;
    public final MediaExtractor f15673f;
    public final MediaFormat f15674g;
    public final long h;
    public final FfmpegAudioWaveformLoader f15677k;
    public final cb f15678l;
    public int f15671c = 0;
    public final Object f15675i = new Object();
    public boolean f15676j = false;

    public va(cb cbVar, String str, int i7) {
        long j3;
        this.f15678l = cbVar;
        this.f15669a = new org.telegram.ui.Components.d6(cbVar, 0L, 600L, nr.h);
        int i10 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f15673f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i10 < trackCount) {
                    MediaFormat trackFormat = this.f15673f.getTrackFormat(i10);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f15673f.selectTrack(i10);
                        this.f15674g = trackFormat;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f15674g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        xa xaVar = cbVar.h;
        if (xaVar != null) {
            j3 = xaVar.f15767e;
        } else if (!cbVar.f14437s.isEmpty()) {
            j3 = cbVar.getBaseDuration();
        } else if (cbVar.F) {
            j3 = cbVar.I;
        } else {
            j3 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j3, cbVar.getMaxScrollDuration()))) * i7) / Math.round(org.telegram.messenger.g0.N(3.3333f))), 4000);
        this.f15670b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f15674g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.h.c(new l(this, 22));
            } else {
                this.f15677k = new FfmpegAudioWaveformLoader(str, min, new d7(this, 2));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f15677k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new l(this, 22));
        synchronized (this.f15675i) {
            this.f15676j = true;
        }
    }

    public final void b(short[] sArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f15671c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s5 = this.f15672e;
            short s9 = sArr[i10];
            if (s5 < s9) {
                this.f15672e = s9;
            }
        }
        this.f15671c += i7;
        this.f15678l.invalidate();
    }
}
