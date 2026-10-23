package ei;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class yb {
    public final org.telegram.ui.Components.f6 f10168a;
    public final int f10169b;
    public final short[] d;
    public short e;
    public final MediaExtractor f10171f;
    public final MediaFormat f10172g;
    public final long h;
    public final FfmpegAudioWaveformLoader f10175k;
    public final gc f10176l;
    public int f10170c = 0;
    public final Object f10173i = new Object();
    public boolean f10174j = false;

    public yb(gc gcVar, String str, int i10) {
        long j10;
        this.f10176l = gcVar;
        this.f10168a = new org.telegram.ui.Components.f6(gcVar, 0L, 600L, bs.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f10171f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f10171f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f10171f.selectTrack(i11);
                        this.f10172g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f10172g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        ac acVar = gcVar.h;
        if (acVar != null) {
            j10 = acVar.e;
        } else if (!gcVar.f9129s.isEmpty()) {
            j10 = gcVar.getBaseDuration();
        } else if (gcVar.E) {
            j10 = gcVar.H;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, gcVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f10169b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f10172g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new com.google.firebase.messaging.s(this, 28));
            } else {
                this.f10175k = new FfmpegAudioWaveformLoader(str, min, new ai.q(this, 20));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f10175k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new com.google.firebase.messaging.s(this, 28));
        synchronized (this.f10173i) {
            this.f10174j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f10170c;
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
        this.f10170c += i10;
        this.f10176l.invalidate();
    }
}
