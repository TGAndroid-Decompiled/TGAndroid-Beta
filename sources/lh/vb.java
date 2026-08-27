package lh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

public final class vb {

    public final org.telegram.ui.Components.y5 f16955a;

    public final int f16956b;
    public final short[] d;

    public short f16958e;

    public final MediaExtractor f16959f;

    public final MediaFormat f16960g;
    public final long h;

    public final FfmpegAudioWaveformLoader f16963k;

    public final cc f16964l;

    public int f16957c = 0;

    public final Object f16961i = new Object();

    public boolean f16962j = false;

    public vb(cc ccVar, String str, int i10) {
        this.f16964l = ccVar;
        this.f16955a = new org.telegram.ui.Components.y5(ccVar, 0L, 600L, er.h);
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f16959f = mediaExtractor;
        String string = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            for (int i11 = 0; i11 < trackCount; i11++) {
                MediaFormat trackFormat = this.f16959f.getTrackFormat(i11);
                string = trackFormat.getString("mime");
                if (string != null && string.startsWith("audio/")) {
                    this.f16959f.selectTrack(i11);
                    this.f16960g = trackFormat;
                    break;
                }
            }
            MediaFormat mediaFormat = this.f16960g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        xb xbVar = ccVar.h;
        int iMin = Math.min(Math.round((((this.h * 1000) / Math.min(xbVar != null ? xbVar.f17059e : !ccVar.f15805s.isEmpty() ? ccVar.getBaseDuration() : ccVar.A ? ccVar.D : this.h * 1000, ccVar.getMaxScrollDuration())) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f16956b = iMin;
        this.d = new short[iMin];
        if (this.h <= 0 || this.f16960g == null) {
            return;
        }
        if ("audio/mpeg".equals(string) || "audio/mp3".equals(string) || "audio/mp4a".equals(string) || "audio/mp4a-latm".equals(string)) {
            this.f16963k = new FfmpegAudioWaveformLoader(str, iMin, new a8(this, 2));
        } else {
            Utilities.phoneBookQueue.postRunnable(new kh.c(this, 25));
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f16963k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new kh.c(this, 25));
        synchronized (this.f16961i) {
            this.f16962j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f16957c;
            int i13 = i12 + i11;
            short[] sArr2 = this.d;
            if (i13 >= sArr2.length) {
                break;
            }
            sArr2[i12 + i11] = sArr[i11];
            short s10 = this.f16958e;
            short s11 = sArr[i11];
            if (s10 < s11) {
                this.f16958e = s11;
            }
        }
        this.f16957c += i10;
        this.f16964l.invalidate();
    }
}
