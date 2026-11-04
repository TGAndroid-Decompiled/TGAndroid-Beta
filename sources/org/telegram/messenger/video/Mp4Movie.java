package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private mc.d matrix = mc.d.f19264j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i3, long j10, MediaCodec.BufferInfo bufferInfo) {
        if (i3 >= 0 && i3 < this.tracks.size()) {
            this.tracks.get(i3).addSample(j10, bufferInfo);
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

    public long getLastFrameTimestamp(int i3) {
        if (i3 >= 0 && i3 < this.tracks.size()) {
            return this.tracks.get(i3).getLastFrameTimestamp();
        }
        return 0L;
    }

    public mc.d getMatrix() {
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

    public void setRotation(int i3) {
        if (i3 == 0) {
            this.matrix = mc.d.f19264j;
        } else if (i3 == 90) {
            this.matrix = mc.d.f19265k;
        } else if (i3 == 180) {
            this.matrix = mc.d.f19266l;
        } else if (i3 == 270) {
            this.matrix = mc.d.f19267m;
        }
    }

    public void setSize(int i3, int i10) {
        this.width = i3;
        this.height = i10;
    }
}
