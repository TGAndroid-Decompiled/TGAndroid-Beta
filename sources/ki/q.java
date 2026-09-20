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
    public final File f13825a;
    public final int f13826b;
    public final boolean f13827c;
    public final k d;
    public final ah.b e;
    public MP4Builder f13829g;
    public MediaFormat h;
    public MediaFormat f13830i;
    public long f13833l;
    public long f13834m;
    public long f13835n;
    public boolean f13836o;
    public final ArrayList f13828f = new ArrayList();
    public int f13831j = -1;
    public int f13832k = -1;

    public q(File file, int i10, boolean z10, k kVar, ah.b bVar) {
        this.f13825a = file;
        this.f13826b = i10;
        this.f13827c = z10;
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
        if (this.f13829g != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f13829g.finishMovie(file);
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
        if (this.f13836o) {
            return;
        }
        if (this.f13829g != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f13829g.finishMovie();
                this.f13836o = true;
                e(this.f13825a.length());
                k kVar = this.d;
                kVar.b("MP4 finalized: file=" + this.f13825a.getName() + ", size=" + this.f13825a.length() + ", videoSamples=" + this.f13834m + ", audioSamples=" + this.f13835n + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e) {
                throw a("Unable to finish MP4", e);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final void d() {
        ArrayList arrayList = this.f13828f;
        if (this.h != null) {
            boolean z10 = this.f13827c;
            if (!z10 || this.f13830i != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f13825a;
                mp4Movie.setCacheFile(file);
                int i10 = this.f13826b;
                mp4Movie.setSize(i10, i10);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f13829g = createMovie;
                    this.f13831j = createMovie.addTrack(this.h, false);
                    if (z10) {
                        this.f13832k = this.f13829g.addTrack(this.f13830i, true);
                    }
                    k kVar = this.d;
                    kVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        p pVar = (p) arrayList.get(i11);
                        h(pVar.f13822a, pVar.f13823b, pVar.f13824c);
                    }
                    arrayList.clear();
                } catch (Exception e) {
                    throw a("Unable to initialize MP4", e);
                }
            }
        }
    }

    public final void e(long j3) {
        if (j3 <= this.f13833l) {
            return;
        }
        this.f13833l = j3;
        ah.b bVar = this.e;
        o0 o0Var = (o0) bVar.f420b;
        k0 k0Var = (k0) bVar.f421c;
        synchronized (o0Var.f13803f) {
            try {
                long j10 = k0Var.f13764c;
                long j11 = j3 - j10;
                if (j11 > 0 && !k0Var.d) {
                    k0Var.f13764c = j3;
                    o0Var.f13806j.execute(new a3.g0(o0Var, k0Var, j10, j11, 3));
                }
            } finally {
            }
        }
    }

    public final synchronized void f(MediaFormat mediaFormat, boolean z10) {
        try {
            if (!this.f13836o && this.f13829g == null) {
                if (z10) {
                    this.h = mediaFormat;
                } else if (this.f13827c) {
                    this.f13830i = mediaFormat;
                }
                d();
            }
        } finally {
        }
    }

    public final synchronized void g(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.f13836o) {
                if (!z10) {
                    if (this.f13827c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    bufferInfo2.set(bufferInfo.offset, bufferInfo.size, Math.max(0L, j3 + bufferInfo.presentationTimeUs), bufferInfo.flags);
                    if (this.f13829g == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        bufferInfo2.offset = 0;
                        this.f13828f.add(new p(z10, allocateDirect, bufferInfo2));
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
            MP4Builder mP4Builder = this.f13829g;
            if (z10) {
                i10 = this.f13831j;
            } else {
                i10 = this.f13832k;
            }
            long writeSampleData = mP4Builder.writeSampleData(i10, byteBuffer, bufferInfo, z10);
            if (z10) {
                this.f13834m++;
            } else {
                this.f13835n++;
            }
            if (writeSampleData > 0) {
                e(writeSampleData);
            }
        } catch (Exception e) {
            throw a("Unable to write MP4 sample", e);
        }
    }
}
