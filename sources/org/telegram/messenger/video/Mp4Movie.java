package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private pc.d matrix = pc.d.f53575j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i7, long j3, MediaCodec.BufferInfo bufferInfo) {
        if (i7 >= 0 && i7 < this.tracks.size()) {
            this.tracks.get(i7).addSample(j3, bufferInfo);
        }
    }

    public int addTrack(MediaFormat mediaFormat, boolean z9) {
        this.tracks.add(new Track(this.tracks.size(), mediaFormat, z9));
        return this.tracks.size() - 1;
    }

    public File getCacheFile() {
        return this.cacheFile;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp(int i7) {
        if (i7 >= 0 && i7 < this.tracks.size()) {
            return this.tracks.get(i7).getLastFrameTimestamp();
        }
        return 0L;
    }

    public pc.d getMatrix() {
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

    public void setRotation(int i7) {
        if (i7 == 0) {
            this.matrix = pc.d.f53575j;
        } else if (i7 == 90) {
            this.matrix = pc.d.f53576k;
        } else if (i7 == 180) {
            this.matrix = pc.d.f53577l;
        } else if (i7 == 270) {
            this.matrix = pc.d.f53578m;
        }
    }

    public void setSize(int i7, int i10) {
        this.width = i7;
        this.height = i10;
    }
}
