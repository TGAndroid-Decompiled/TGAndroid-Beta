package ki;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
public final class q {
    public final File f13816a;
    public final int f13817b;
    public final boolean f13818c;
    public final k d;
    public final ah.b e;
    public MP4Builder f13820g;
    public MediaFormat h;
    public MediaFormat f13821i;
    public long f13824l;
    public long f13825m;
    public long f13826n;
    public boolean f13827o;
    public final ArrayList f13819f = new ArrayList();
    public int f13822j = -1;
    public int f13823k = -1;

    public q(File file, int i10, boolean z10, k kVar, ah.b bVar) {
        this.f13816a = file;
        this.f13817b = i10;
        this.f13818c = z10;
        this.d = kVar;
        this.e = bVar;
    }

    public static IOException a(String str, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        return new IOException(str, exc);
    }

    public final synchronized void b(File file) {
        if (this.f13820g != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f13820g.finishMovie(file);
                k kVar = this.d;
                kVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e) {
                throw a("Unable to create preview MP4", e);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void c() {
        if (this.f13827o) {
            return;
        }
        if (this.f13820g != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f13820g.finishMovie();
                this.f13827o = true;
                e(this.f13816a.length());
                k kVar = this.d;
                kVar.b("MP4 finalized: file=" + this.f13816a.getName() + ", size=" + this.f13816a.length() + ", videoSamples=" + this.f13825m + ", audioSamples=" + this.f13826n + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e) {
                throw a("Unable to finish MP4", e);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final void d() {
        ArrayList arrayList = this.f13819f;
        if (this.h != null) {
            boolean z10 = this.f13818c;
            if (!z10 || this.f13821i != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f13816a;
                mp4Movie.setCacheFile(file);
                int i10 = this.f13817b;
                mp4Movie.setSize(i10, i10);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f13820g = createMovie;
                    this.f13822j = createMovie.addTrack(this.h, false);
                    if (z10) {
                        this.f13823k = this.f13820g.addTrack(this.f13821i, true);
                    }
                    k kVar = this.d;
                    kVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        p pVar = (p) arrayList.get(i11);
                        h(pVar.f13809a, pVar.f13810b, pVar.f13811c);
                    }
                    arrayList.clear();
                } catch (Exception e) {
                    throw a("Unable to initialize MP4", e);
                }
            }
        }
    }

    public final void e(long j3) {
        if (j3 <= this.f13824l) {
            return;
        }
        this.f13824l = j3;
        ah.b bVar = this.e;
        q0 q0Var = (q0) bVar.f417b;
        m0 m0Var = (m0) bVar.f418c;
        synchronized (q0Var.f13831f) {
            try {
                long j10 = m0Var.f13782c;
                long j11 = j3 - j10;
                if (j11 > 0 && !m0Var.d) {
                    m0Var.f13782c = j3;
                    q0Var.f13834j.execute(new a3.g0(q0Var, m0Var, j10, j11, 3));
                }
            } finally {
            }
        }
    }

    public final synchronized void f(MediaFormat mediaFormat, boolean z10) {
        try {
            if (!this.f13827o && this.f13820g == null) {
                if (z10) {
                    this.h = mediaFormat;
                } else if (this.f13818c) {
                    this.f13821i = mediaFormat;
                }
                d();
            }
        } finally {
        }
    }

    public final synchronized void g(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.f13827o) {
                if (!z10) {
                    if (this.f13818c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    bufferInfo2.set(bufferInfo.offset, bufferInfo.size, Math.max(0L, j3 + bufferInfo.presentationTimeUs), bufferInfo.flags);
                    if (this.f13820g == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        bufferInfo2.offset = 0;
                        this.f13819f.add(new p(z10, allocateDirect, bufferInfo2));
                        return;
                    }
                    h(z10, byteBuffer, bufferInfo2);
                }
            }
        } finally {
        }
    }

    public final void h(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        try {
            MP4Builder mP4Builder = this.f13820g;
            if (z10) {
                i10 = this.f13822j;
            } else {
                i10 = this.f13823k;
            }
            long writeSampleData = mP4Builder.writeSampleData(i10, byteBuffer, bufferInfo, z10);
            if (z10) {
                this.f13825m++;
            } else {
                this.f13826n++;
            }
            if (writeSampleData > 0) {
                e(writeSampleData);
            }
        } catch (Exception e) {
            throw a("Unable to write MP4 sample", e);
        }
    }
}
