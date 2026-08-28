package kh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class zb {
    public final org.telegram.ui.Components.y5 f16479a;
    public final int f16480b;
    public final short[] d;
    public short f16482e;
    public final MediaExtractor f16483f;
    public final MediaFormat f16484g;
    public final long h;
    public final FfmpegAudioWaveformLoader f16487k;
    public final gc f16488l;
    public int f16481c = 0;
    public final Object f16485i = new Object();
    public boolean f16486j = false;

    public zb(gc gcVar, String str, int i9) {
        long j10;
        this.f16488l = gcVar;
        this.f16479a = new org.telegram.ui.Components.y5(gcVar, 0L, 600L, gr.h);
        int i10 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f16483f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i10 < trackCount) {
                    MediaFormat trackFormat = this.f16483f.getTrackFormat(i10);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f16483f.selectTrack(i10);
                        this.f16484g = trackFormat;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f16484g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        bc bcVar = gcVar.h;
        if (bcVar != null) {
            j10 = bcVar.f15015e;
        } else if (!gcVar.f15367s.isEmpty()) {
            j10 = gcVar.getBaseDuration();
        } else if (gcVar.A) {
            j10 = gcVar.D;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, gcVar.getMaxScrollDuration()))) * i9) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f16480b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f16484g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new f1(this, 18));
            } else {
                this.f16487k = new FfmpegAudioWaveformLoader(str, min, new b8(this, 2));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f16487k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new f1(this, 18));
        synchronized (this.f16485i) {
            this.f16486j = true;
        }
    }

    public final void b(short[] sArr, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.f16481c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s10 = this.f16482e;
            short s11 = sArr[i10];
            if (s10 < s11) {
                this.f16482e = s11;
            }
        }
        this.f16481c += i9;
        this.f16488l.invalidate();
    }
}
