package ci;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class oc {
    public final org.telegram.ui.Components.e6 f5264a;
    public final int f5265b;
    public final short[] d;
    public short e;
    public final MediaExtractor f5267f;
    public final MediaFormat f5268g;
    public final long h;
    public final FfmpegAudioWaveformLoader f5271k;
    public final wc f5272l;
    public int f5266c = 0;
    public final Object f5269i = new Object();
    public boolean f5270j = false;

    public oc(wc wcVar, String str, int i10) {
        long j3;
        this.f5272l = wcVar;
        this.f5264a = new org.telegram.ui.Components.e6(wcVar, 0L, 600L, sr.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f5267f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f5267f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f5267f.selectTrack(i11);
                        this.f5268g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f5268g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        qc qcVar = wcVar.h;
        if (qcVar != null) {
            j3 = qcVar.e;
        } else if (!wcVar.f5783s.isEmpty()) {
            j3 = wcVar.getBaseDuration();
        } else if (wcVar.E) {
            j3 = wcVar.H;
        } else {
            j3 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j3, wcVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f5265b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f5268g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new androidx.fragment.app.a0(this, 28));
            } else {
                this.f5271k = new FfmpegAudioWaveformLoader(str, min, new bi.v(this, 9));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f5271k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new androidx.fragment.app.a0(this, 28));
        synchronized (this.f5269i) {
            this.f5270j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f5266c;
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
        this.f5266c += i10;
        this.f5272l.invalidate();
    }
}
