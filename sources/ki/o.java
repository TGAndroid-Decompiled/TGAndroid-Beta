package ki;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
public final class o {
    public final File f13780a;
    public final int f13781b;
    public final boolean f13782c;
    public final j d;
    public final ah.b e;
    public MP4Builder f13784g;
    public MediaFormat h;
    public MediaFormat f13785i;
    public long f13788l;
    public long f13789m;
    public long f13790n;
    public boolean f13791o;
    public final ArrayList f13783f = new ArrayList();
    public int f13786j = -1;
    public int f13787k = -1;

    public o(File file, int i10, boolean z10, j jVar, ah.b bVar) {
        this.f13780a = file;
        this.f13781b = i10;
        this.f13782c = z10;
        this.d = jVar;
        this.e = bVar;
    }

    public static IOException a(String str, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        return new IOException(str, exc);
    }

    public final synchronized void b(File file) {
        if (this.f13784g != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f13784g.finishMovie(file);
                j jVar = this.d;
                jVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e) {
                throw a("Unable to create preview MP4", e);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void c() {
        if (this.f13791o) {
            return;
        }
        if (this.f13784g != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f13784g.finishMovie();
                this.f13791o = true;
                e(this.f13780a.length());
                j jVar = this.d;
                jVar.b("MP4 finalized: file=" + this.f13780a.getName() + ", size=" + this.f13780a.length() + ", videoSamples=" + this.f13789m + ", audioSamples=" + this.f13790n + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e) {
                throw a("Unable to finish MP4", e);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final void d() {
        ArrayList arrayList = this.f13783f;
        if (this.h != null) {
            boolean z10 = this.f13782c;
            if (!z10 || this.f13785i != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f13780a;
                mp4Movie.setCacheFile(file);
                int i10 = this.f13781b;
                mp4Movie.setSize(i10, i10);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f13784g = createMovie;
                    this.f13786j = createMovie.addTrack(this.h, false);
                    if (z10) {
                        this.f13787k = this.f13784g.addTrack(this.f13785i, true);
                    }
                    j jVar = this.d;
                    jVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        n nVar = (n) arrayList.get(i11);
                        h(nVar.f13777a, nVar.f13778b, nVar.f13779c);
                    }
                    arrayList.clear();
                } catch (Exception e) {
                    throw a("Unable to initialize MP4", e);
                }
            }
        }
    }

    public final void e(long j3) {
        if (j3 <= this.f13788l) {
            return;
        }
        this.f13788l = j3;
        ah.b bVar = this.e;
        h0 h0Var = (h0) bVar.f420b;
        e0 e0Var = (e0) bVar.f421c;
        synchronized (h0Var.f13708f) {
            try {
                long j10 = e0Var.f13672c;
                long j11 = j3 - j10;
                if (j11 > 0 && !e0Var.d) {
                    e0Var.f13672c = j3;
                    h0Var.f13711j.execute(new a3.g0(h0Var, e0Var, j10, j11, 3));
                }
            } finally {
            }
        }
    }

    public final synchronized void f(MediaFormat mediaFormat, boolean z10) {
        try {
            if (!this.f13791o && this.f13784g == null) {
                if (z10) {
                    this.h = mediaFormat;
                } else if (this.f13782c) {
                    this.f13785i = mediaFormat;
                }
                d();
            }
        } finally {
        }
    }

    public final synchronized void g(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.f13791o) {
                if (!z10) {
                    if (this.f13782c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    bufferInfo2.set(bufferInfo.offset, bufferInfo.size, Math.max(0L, j3 + bufferInfo.presentationTimeUs), bufferInfo.flags);
                    if (this.f13784g == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        bufferInfo2.offset = 0;
                        this.f13783f.add(new n(z10, allocateDirect, bufferInfo2));
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
            MP4Builder mP4Builder = this.f13784g;
            if (z10) {
                i10 = this.f13786j;
            } else {
                i10 = this.f13787k;
            }
            long writeSampleData = mP4Builder.writeSampleData(i10, byteBuffer, bufferInfo, z10);
            if (z10) {
                this.f13789m++;
            } else {
                this.f13790n++;
            }
            if (writeSampleData > 0) {
                e(writeSampleData);
            }
        } catch (Exception e) {
            throw a("Unable to write MP4 sample", e);
        }
    }
}
