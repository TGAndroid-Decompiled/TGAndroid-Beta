package ei;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class yb {
    public final org.telegram.ui.Components.f6 f10152a;
    public final int f10153b;
    public final short[] d;
    public short e;
    public final MediaExtractor f10155f;
    public final MediaFormat f10156g;
    public final long h;
    public final FfmpegAudioWaveformLoader f10159k;
    public final gc f10160l;
    public int f10154c = 0;
    public final Object f10157i = new Object();
    public boolean f10158j = false;

    public yb(gc gcVar, String str, int i10) {
        long j10;
        this.f10160l = gcVar;
        this.f10152a = new org.telegram.ui.Components.f6(gcVar, 0L, 600L, bs.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f10155f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f10155f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f10155f.selectTrack(i11);
                        this.f10156g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f10156g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        ac acVar = gcVar.h;
        if (acVar != null) {
            j10 = acVar.e;
        } else if (!gcVar.f9120s.isEmpty()) {
            j10 = gcVar.getBaseDuration();
        } else if (gcVar.E) {
            j10 = gcVar.H;
        } else {
            j10 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j10, gcVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f10153b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f10156g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new com.google.firebase.messaging.s(this, 28));
            } else {
                this.f10159k = new FfmpegAudioWaveformLoader(str, min, new ai.q(this, 20));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f10159k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new com.google.firebase.messaging.s(this, 28));
        synchronized (this.f10157i) {
            this.f10158j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f10154c;
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
        this.f10154c += i10;
        this.f10160l.invalidate();
    }
}
