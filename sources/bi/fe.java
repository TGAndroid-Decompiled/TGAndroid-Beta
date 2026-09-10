package bi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class fe {
    public final org.telegram.ui.Components.d6 f2722a;
    public final int f2723b;
    public final short[] d;
    public short e;
    public final MediaExtractor f2725f;
    public final MediaFormat f2726g;
    public final long h;
    public final FfmpegAudioWaveformLoader f2729k;
    public final me f2730l;
    public int f2724c = 0;
    public final Object f2727i = new Object();
    public boolean f2728j = false;

    public fe(me meVar, String str, int i10) {
        long j3;
        this.f2730l = meVar;
        this.f2722a = new org.telegram.ui.Components.d6(meVar, 0L, 600L, wr.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f2725f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f2725f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f2725f.selectTrack(i11);
                        this.f2726g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f2726g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        he heVar = meVar.h;
        if (heVar != null) {
            j3 = heVar.e;
        } else if (!meVar.f3188s.isEmpty()) {
            j3 = meVar.getBaseDuration();
        } else if (meVar.E) {
            j3 = meVar.H;
        } else {
            j3 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j3, meVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f2723b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f2726g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new wc(this, 4));
            } else {
                this.f2729k = new FfmpegAudioWaveformLoader(str, min, new ai.c0(this, 9));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f2729k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new wc(this, 4));
        synchronized (this.f2727i) {
            this.f2728j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f2724c;
            int i13 = i12 + i11;
            short[] sArr2 = this.d;
            if (i13 >= sArr2.length) {
                break;
            }
            sArr2[i12 + i11] = sArr[i11];
            short s10 = this.e;
            short s11 = sArr[i11];
            if (s10 < s11) {
                this.e = s11;
            }
        }
        this.f2724c += i10;
        this.f2730l.invalidate();
    }
}
