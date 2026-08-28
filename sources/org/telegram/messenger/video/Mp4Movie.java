package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private yb.d matrix = yb.d.f49725j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i9, long j10, MediaCodec.BufferInfo bufferInfo) {
        if (i9 >= 0 && i9 < this.tracks.size()) {
            this.tracks.get(i9).addSample(j10, bufferInfo);
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

    public long getLastFrameTimestamp(int i9) {
        if (i9 >= 0 && i9 < this.tracks.size()) {
            return this.tracks.get(i9).getLastFrameTimestamp();
        }
        return 0L;
    }

    public yb.d getMatrix() {
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

    public void setRotation(int i9) {
        if (i9 == 0) {
            this.matrix = yb.d.f49725j;
        } else if (i9 == 90) {
            this.matrix = yb.d.f49726k;
        } else if (i9 == 180) {
            this.matrix = yb.d.f49727l;
        } else if (i9 == 270) {
            this.matrix = yb.d.f49728m;
        }
    }

    public void setSize(int i9, int i10) {
        this.width = i9;
        this.height = i10;
    }
}
