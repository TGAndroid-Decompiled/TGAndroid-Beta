package ci;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class rc {
    public final org.telegram.ui.Components.c6 f5466a;
    public final int f5467b;
    public final short[] d;
    public short e;
    public final MediaExtractor f5469f;
    public final MediaFormat f5470g;
    public final long h;
    public final FfmpegAudioWaveformLoader f5473k;
    public final zc f5474l;
    public int f5468c = 0;
    public final Object f5471i = new Object();
    public boolean f5472j = false;

    public rc(zc zcVar, String str, int i10) {
        long j3;
        this.f5474l = zcVar;
        this.f5466a = new org.telegram.ui.Components.c6(zcVar, 0L, 600L, qr.h);
        int i11 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f5469f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i11 < trackCount) {
                    MediaFormat trackFormat = this.f5469f.getTrackFormat(i11);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f5469f.selectTrack(i11);
                        this.f5470g = trackFormat;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.f5470g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        tc tcVar = zcVar.h;
        if (tcVar != null) {
            j3 = tcVar.e;
        } else if (!zcVar.f5918s.isEmpty()) {
            j3 = zcVar.getBaseDuration();
        } else if (zcVar.E) {
            j3 = zcVar.H;
        } else {
            j3 = this.h * 1000;
        }
        int min = Math.min(Math.round(((((float) (this.h * 1000)) / ((float) Math.min(j3, zcVar.getMaxScrollDuration()))) * i10) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.f5467b = min;
        this.d = new short[min];
        if (this.h > 0 && this.f5470g != null) {
            if (!"audio/mpeg".equals(str2) && !"audio/mp3".equals(str2) && !"audio/mp4a".equals(str2) && !"audio/mp4a-latm".equals(str2)) {
                Utilities.phoneBookQueue.postRunnable(new androidx.fragment.app.a0(this, 28));
            } else {
                this.f5473k = new FfmpegAudioWaveformLoader(str, min, new bi.v(this, 9));
            }
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.f5473k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new androidx.fragment.app.a0(this, 28));
        synchronized (this.f5471i) {
            this.f5472j = true;
        }
    }

    public final void b(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f5468c;
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
        this.f5468c += i10;
        this.f5474l.invalidate();
    }
}
