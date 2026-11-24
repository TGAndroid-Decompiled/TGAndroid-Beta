package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeMap;
import org.webrtc.SurfaceTextureHelper;
public final class vz0 {
    public final String a;
    public final HandlerThread b;
    public final Handler c;
    public SurfaceTextureHelper d;
    public Surface e;
    public MediaCodec g;
    public String h;
    public int i;
    public int j;
    public ByteBuffer k;
    public ByteBuffer l;
    public MediaExtractor n;
    public boolean o;
    public boolean q;
    public boolean t;
    public boolean u;
    public final wz0 v;
    public final TreeMap f = new TreeMap();
    public long m = -1;
    public long p = -1;
    public final ArrayDeque r = new ArrayDeque();
    public final MediaCodec.BufferInfo s = new MediaCodec.BufferInfo();

    public vz0(wz0 wz0Var, String str) {
        this.v = wz0Var;
        this.a = str;
        HandlerThread handlerThread = new HandlerThread("BroadcastTile");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.c = handler;
        handler.post(new tz0(this, (byte) 1));
    }

    public final void a() {
        TreeMap treeMap;
        long j;
        long[] jArr;
        boolean z;
        String str;
        String str2;
        long[] jArr2;
        String str3;
        String str4;
        char c;
        int dequeueInputBuffer;
        int i;
        MediaFormat mediaFormat;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        String str5;
        boolean z2;
        boolean z3;
        long nanoTime = System.nanoTime() / 1000000;
        Iterator it = this.v.e.iterator();
        long[] jArr3 = null;
        while (it.hasNext()) {
            long[] jArr4 = (long[]) it.next();
            if (jArr4[1] > nanoTime) {
                break;
            }
            jArr3 = jArr4;
        }
        if (jArr3 != null) {
            long j2 = jArr3[0];
            while (true) {
                treeMap = this.f;
                if (treeMap.isEmpty() || ((Long) treeMap.firstKey()).longValue() >= j2) {
                    break;
                }
                treeMap.pollFirstEntry();
            }
            sz0 sz0Var = (sz0) treeMap.get(Long.valueOf(j2));
            if (sz0Var != null) {
                int i2 = (this.m > j2 ? 1 : (this.m == j2 ? 0 : -1));
                ArrayDeque arrayDeque = this.r;
                if (i2 != 0) {
                    MediaExtractor mediaExtractor = this.n;
                    if (mediaExtractor != null) {
                        mediaExtractor.release();
                        this.n = null;
                    }
                    this.m = -1L;
                    MediaExtractor mediaExtractor2 = new MediaExtractor();
                    this.n = mediaExtractor2;
                    mediaExtractor2.setDataSource(new rz0(sz0Var.a));
                    int i3 = 0;
                    while (true) {
                        if (i3 < this.n.getTrackCount()) {
                            mediaFormat = this.n.getTrackFormat(i3);
                            String string = mediaFormat.getString("mime");
                            if (string != null && string.startsWith("video/")) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            mediaFormat = null;
                            break;
                        }
                    }
                    if (i3 < 0) {
                        this.m = j2;
                        this.o = true;
                        j = nanoTime;
                        jArr = jArr3;
                        z = true;
                        str = "height";
                        str2 = "width";
                        jArr2 = null;
                    } else {
                        this.n.selectTrack(i3);
                        String string2 = mediaFormat.getString("mime");
                        int integer = mediaFormat.getInteger("width");
                        int integer2 = mediaFormat.getInteger("height");
                        if (mediaFormat.containsKey("csd-0")) {
                            byteBuffer = mediaFormat.getByteBuffer("csd-0");
                        } else {
                            byteBuffer = null;
                        }
                        z = true;
                        if (mediaFormat.containsKey("csd-1")) {
                            byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                        } else {
                            byteBuffer2 = null;
                        }
                        j = nanoTime;
                        if (this.g != null && string2.equals(this.h) && integer == this.i && integer2 == this.j) {
                            ByteBuffer byteBuffer3 = this.k;
                            if (byteBuffer != null && byteBuffer3 != null) {
                                z2 = byteBuffer.equals(byteBuffer3);
                            } else if (byteBuffer == byteBuffer3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                ByteBuffer byteBuffer4 = this.l;
                                if (byteBuffer2 != null && byteBuffer4 != null) {
                                    z3 = byteBuffer2.equals(byteBuffer4);
                                } else if (byteBuffer2 == byteBuffer4) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    this.g.flush();
                                    jArr = jArr3;
                                    str = "height";
                                    str2 = "width";
                                    jArr2 = null;
                                    this.d.setFrameRotation(sz0Var.b);
                                    arrayDeque.clear();
                                    this.o = false;
                                    this.q = false;
                                    this.p = this.n.getSampleTime();
                                    this.m = j2;
                                }
                            }
                        }
                        arrayDeque.clear();
                        MediaCodec mediaCodec = this.g;
                        if (mediaCodec != null) {
                            try {
                                mediaCodec.stop();
                            } catch (Throwable unused) {
                            }
                            this.g.release();
                            str5 = null;
                            this.g = null;
                        } else {
                            str5 = null;
                        }
                        this.h = str5;
                        String c2 = wz0.c(string2);
                        if (c2 != null) {
                            MediaCodec createByCodecName = MediaCodec.createByCodecName(c2);
                            this.g = createByCodecName;
                            jArr = jArr3;
                            str = "height";
                            str2 = "width";
                            jArr2 = null;
                            createByCodecName.configure(mediaFormat, this.e, (MediaCrypto) null, 0);
                            this.g.start();
                            this.h = string2;
                            this.i = integer;
                            this.j = integer2;
                            this.k = byteBuffer;
                            this.l = byteBuffer2;
                            this.d.setTextureSize(integer, integer2);
                            if (w01.a) {
                                StringBuilder sb = new StringBuilder("[BroadcastHwVideo] ");
                                ls6.u(sb, this.a, ": ", c2, " ");
                                sb.append(integer);
                                sb.append("x");
                                sb.append(integer2);
                                fa4.b(sb.toString());
                            }
                            this.d.setFrameRotation(sz0Var.b);
                            arrayDeque.clear();
                            this.o = false;
                            this.q = false;
                            this.p = this.n.getSampleTime();
                            this.m = j2;
                        } else {
                            sc8.j(b00.h("no hardware decoder for ", string2));
                            return;
                        }
                    }
                } else {
                    j = nanoTime;
                    jArr = jArr3;
                    z = true;
                    str = "height";
                    str2 = "width";
                    jArr2 = null;
                }
                double d = (jArr[2] / 1000.0d) + ((j - jArr[z ? 1 : 0]) / 1000.0d);
                if (this.g != null && this.n != null) {
                    while (!this.o && (dequeueInputBuffer = this.g.dequeueInputBuffer(0L)) >= 0) {
                        ByteBuffer inputBuffer = this.g.getInputBuffer(dequeueInputBuffer);
                        if (inputBuffer != null) {
                            i = this.n.readSampleData(inputBuffer, 0);
                        } else {
                            i = -1;
                        }
                        MediaCodec mediaCodec2 = this.g;
                        if (i < 0) {
                            mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            this.o = z;
                        } else {
                            mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, i, this.n.getSampleTime(), 0);
                            this.n.advance();
                        }
                        z = true;
                    }
                }
                if (this.g != null) {
                    while (true) {
                        MediaCodec mediaCodec3 = this.g;
                        MediaCodec.BufferInfo bufferInfo = this.s;
                        int dequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, 0L);
                        if (dequeueOutputBuffer >= 0) {
                            if ((bufferInfo.flags & 4) != 0 && bufferInfo.size == 0) {
                                this.g.releaseOutputBuffer(dequeueOutputBuffer, false);
                            } else {
                                arrayDeque.addLast(new long[]{dequeueOutputBuffer, bufferInfo.presentationTimeUs});
                            }
                            str3 = str2;
                            str4 = str;
                        } else if (dequeueOutputBuffer == -2) {
                            MediaFormat outputFormat = this.g.getOutputFormat();
                            str3 = str2;
                            int integer3 = outputFormat.getInteger(str3);
                            str4 = str;
                            int integer4 = outputFormat.getInteger(str4);
                            if (outputFormat.containsKey("crop-right") && outputFormat.containsKey("crop-left")) {
                                integer3 = (outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1;
                            }
                            if (outputFormat.containsKey("crop-bottom") && outputFormat.containsKey("crop-top")) {
                                integer4 = (outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1;
                            }
                            this.d.setTextureSize(integer3, integer4);
                        } else {
                            str3 = str2;
                            str4 = str;
                            if (dequeueOutputBuffer == -1) {
                                break;
                            }
                        }
                        str2 = str3;
                        str = str4;
                    }
                    if (!arrayDeque.isEmpty()) {
                        long j3 = this.p;
                        if (j3 >= 0) {
                            c = 1;
                        } else {
                            c = 1;
                            j3 = ((long[]) arrayDeque.peekFirst())[1];
                        }
                        long j4 = j3 + ((long) (d * 1000000.0d));
                        while (!arrayDeque.isEmpty() && ((long[]) arrayDeque.peekFirst())[c] <= j4) {
                            if (jArr2 != null) {
                                this.g.releaseOutputBuffer((int) jArr2[0], false);
                            }
                            jArr2 = (long[]) arrayDeque.pollFirst();
                            c = 1;
                        }
                        if (jArr2 == null && !this.q) {
                            jArr2 = (long[]) arrayDeque.pollFirst();
                        }
                        if (jArr2 != null) {
                            this.g.releaseOutputBuffer((int) jArr2[0], true);
                            this.q = true;
                        }
                    }
                }
            }
        }
    }
}
