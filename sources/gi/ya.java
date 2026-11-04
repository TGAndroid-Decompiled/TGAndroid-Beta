package gi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class ya {
    public final org.telegram.ui.Components.u5 f13986a;
    public final int f13987b;
    public final short[] d;
    public short f13989e;
    public final MediaExtractor f13990f;
    public final MediaFormat f13991g;
    public final long h;
    public final FfmpegAudioWaveformLoader f13994k;
    public final fb f13995l;
    public int f13988c = 0;
    public final Object f13992i = new Object();
    public boolean f13993j = false;

    public ya(fb fbVar, String str, int i3) {
        long j10;
        this.f13995l = fbVar;
        this.f13986a = new org.telegram.ui.Components.u5(fbVar, 0L, 600L, xq.h);
        int i10 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f13990f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i10 < trackCount) {
                    MediaFormat trackFormat = this.f13990f.getTrackFormat(i10);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f13990f.selectTrack(i10);
                        this.f13991g = trackFormat;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f13991g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ab abVar = fbVar.h;
        if (abVar != null) {
            j10 = abVar.f12415e;
        } else if (!fbVar.f12798s.isEmpty()) {
            j10 = fbVar.getBaseDuration();
        } else if (fbVar.F) {
            j10 = fbVar.I;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, fbVar.getMaxScrollDuration()))) * i3) / Math.round(org.telegram.messenger.g0.N(3.3333f))), 4000);
        this.f13987b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f13991g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.h.c(new f6(this, 9));
            } else {
                this.f13994k = new FfmpegAudioWaveformLoader(str, min, new q4(this, 3));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f13994k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new f6(this, 9));
        synchronized (this.f13992i) {
            this.f13993j = true;
        }
    }

    public final void b(short[] sArr, int i3) {
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = this.f13988c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s6 = this.f13989e;
            short s10 = sArr[i10];
            if (s6 < s10) {
                this.f13989e = s10;
            }
        }
        this.f13988c += i3;
        this.f13995l.invalidate();
    }
}
