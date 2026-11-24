package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private ml6 matrix = ml6.j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i, long j, MediaCodec.BufferInfo bufferInfo) {
        if (i >= 0 && i < this.tracks.size()) {
            this.tracks.get(i).addSample(j, bufferInfo);
        }
    }

    public int addTrack(MediaFormat mediaFormat, boolean z) {
        this.tracks.add(new Track(this.tracks.size(), mediaFormat, z));
        return this.tracks.size() - 1;
    }

    public File getCacheFile() {
        return this.cacheFile;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp(int i) {
        if (i >= 0 && i < this.tracks.size()) {
            return this.tracks.get(i).getLastFrameTimestamp();
        }
        return 0L;
    }

    public ml6 getMatrix() {
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

    public void setRotation(int i) {
        if (i == 0) {
            this.matrix = ml6.j;
        } else if (i == 90) {
            this.matrix = ml6.k;
        } else if (i == 180) {
            this.matrix = ml6.l;
        } else if (i == 270) {
            this.matrix = ml6.m;
        }
    }

    public void setSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
