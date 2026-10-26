package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private sc.d matrix = sc.d.f48082j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i10, long j10, MediaCodec.BufferInfo bufferInfo) {
        if (i10 >= 0 && i10 < this.tracks.size()) {
            this.tracks.get(i10).addSample(j10, bufferInfo);
        }
    }

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        this.tracks.add(new Track(this.tracks.size(), mediaFormat, z10));
        return this.tracks.size() - 1;
    }

    public File getCacheFile() {
        return this.cacheFile;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp(int i10) {
        if (i10 >= 0 && i10 < this.tracks.size()) {
            return this.tracks.get(i10).getLastFrameTimestamp();
        }
        return 0L;
    }

    public sc.d getMatrix() {
        return this.matrix;
    }

    public ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCacheFile(File file) {
        this.cacheFile = file;
    }

    public void setRotation(int i10) {
        if (i10 == 0) {
            this.matrix = sc.d.f48082j;
        } else if (i10 == 90) {
            this.matrix = sc.d.f48083k;
        } else if (i10 == 180) {
            this.matrix = sc.d.f48084l;
        } else if (i10 == 270) {
            this.matrix = sc.d.f48085m;
        }
    }

    public void setSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }
}
