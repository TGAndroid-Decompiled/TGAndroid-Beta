package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Timer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.u51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class MediaController implements AudioManager.OnAudioFocusChangeListener, ls, SensorEventListener {
    public static final String[] V1;
    public static final String[] W1;
    public static final ConcurrentHashMap X1;
    public static Runnable Y1;
    public static we Z1;
    public static we f21244a2;
    public static ArrayList f21245b2;
    public static ArrayList f21246c2;
    public static jg.c1 d2;
    public static volatile MediaController f21247e2;
    public static long f21248f2;
    public static boolean f21249g2;
    public boolean A0;
    public boolean B0;
    public int B1;
    public h2.a0 C0;
    public boolean C1;
    public int D;
    public rf.a D0;
    public int D1;
    public int E;
    public u51 E0;
    public boolean E1;
    public int F;
    public boolean F0;
    public e0.g F1;
    public long G;
    public TextureView G0;
    public di.d1 G1;
    public PipRoundVideoView H0;
    public boolean H1;
    public boolean I;
    public int I0;
    public boolean I1;
    public boolean J;
    public LaunchActivity J0;
    public boolean J1;
    public View K0;
    public ac.e K1;
    public boolean L;
    public org.telegram.ui.j4 L0;
    public wd L1;
    public boolean M;
    public boolean M0;
    public final p5 M1;
    public boolean N;
    public FrameLayout N0;
    public final p5 N1;
    public boolean O;
    public float O0;
    public boolean P;
    public boolean P0;
    public float P1;
    public float Q;
    public kp Q0;
    public ValueAnimator Q1;
    public androidx.emoji2.text.j S1;
    public boolean T1;
    public int U;
    public int U0;
    public jf U1;
    public boolean V;
    public boolean V0;
    public boolean W;
    public boolean X0;
    public boolean Y;
    public long Y0;
    public int Z0;
    public lf f21251a0;
    public long f21252a1;
    public SensorManager f21256c;
    public PowerManager.WakeLock d;
    public boolean f21259d0;
    public boolean f21260d1;
    public Sensor f21261e;
    public ArrayList f21262e0;
    public AudioRecord f21263e1;
    public Sensor f21264f;
    public SparseArray f21265f0;
    public TLRPC.TL_document f21266f1;
    public Sensor h;
    public int f21270h1;
    public File f21272i1;
    public File f21274j1;
    public long f21276k1;
    public boolean f21277l0;
    public int l1;
    public int m0;
    public long f21278m1;
    public Sensor f21279n;
    public String f21280n0;
    public long n1;
    public long f21281o0;
    public long f21282o1;
    public nj f21284p1;
    public ij f21286q1;
    public boolean f21287r;
    public ij f21289r1;
    public org.telegram.ui.cn f21290s;
    public TL_stories.StoryItem f21292s1;
    public float f21293t0;
    public hw f21294t1;
    public ij f21295u0;
    public ij f21297v0;
    public long f21298v1;
    public boolean f21299w;
    public ef f21300w0;
    public long f21302x;
    public boolean f21303x0;
    public int f21305y;
    public final ByteBuffer f21307y1;
    public final ud f21250a = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public final void onAudioFocusChange(int i7) {
            MediaController mediaController = MediaController.this;
            if (i7 != 1) {
                mediaController.V = false;
                return;
            }
            String[] strArr = MediaController.V1;
            mediaController.getClass();
        }
    };
    public final Object f21253b = new Object();
    public long H = 0;
    public float K = -100.0f;
    public final float[] R = new float[3];
    public final float[] S = new float[3];
    public final float[] T = new float[3];
    public int X = 0;
    public final ArrayList Z = new ArrayList();
    public final ArrayList f21254b0 = new ArrayList();
    public final HashMap f21257c0 = new HashMap();
    public boolean f21267g0 = false;
    public boolean f21269h0 = false;
    public u51 f21271i0 = null;
    public u51 f21273j0 = null;
    public int f21275k0 = 0;
    public float f21283p0 = 1.0f;
    public float f21285q0 = 1.0f;
    public float f21288r0 = 1.0f;
    public float f21291s0 = 1.0f;
    public Timer f21306y0 = null;
    public final Object f21308z0 = new Object();
    public final ArrayList R0 = new ArrayList();
    public final HashMap S0 = new HashMap();
    public final ArrayList T0 = new ArrayList();
    public final boolean[] W0 = {false, false};
    public final int[] f21255b1 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public final se f21258c1 = new se(this);
    public int f21268g1 = -1;
    public short[] f21296u1 = new short[1024];
    public final Object f21301w1 = new Object();
    public final ArrayList f21304x1 = new ArrayList();
    public int f21309z1 = 1280;
    public int A1 = 48000;
    public final m.f3 O1 = new m.f3(this, 6);
    public final di.n4 R1 = new di.n4(this, 6);

    static {
        String str;
        String str2;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 <= 28) {
            str = "datetaken";
        } else {
            str = "date_modified";
        }
        V1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str, "orientation", "width", "height", "_size"};
        if (i7 <= 28) {
            str2 = "datetaken";
        } else {
            str2 = "date_modified";
        }
        W1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str2, "duration", "width", "height", "_size"};
        X1 = new ConcurrentHashMap();
        f21245b2 = new ArrayList();
        f21246c2 = new ArrayList();
    }

    public MediaController() {
        p5 p5Var = new p5("recordQueue");
        this.M1 = p5Var;
        p5Var.setPriority(10);
        p5 p5Var2 = new p5("fileEncodingQueue");
        this.N1 = p5Var2;
        p5Var2.setPriority(10);
        p5Var.c(new vd(this, 0));
        Utilities.f21336e.c(new vd(this, 1));
        this.f21307y1 = ByteBuffer.allocateDirect(1920);
        g0.h3(new vd(this, 2));
        ContentResolver contentResolver = t0.f25566b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.f2(null, 1));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.f2(null, 2));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.f2(null, 1));
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.f2(null, 2));
        } catch (Exception e13) {
            a8.g(e13, true);
        }
    }

    public static java.lang.String A(android.net.Uri r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.A(android.net.Uri):java.lang.String");
    }

    public static MediaController B() {
        MediaController mediaController;
        MediaController mediaController2 = f21247e2;
        if (mediaController2 == null) {
            synchronized (MediaController.class) {
                try {
                    mediaController = f21247e2;
                    if (mediaController == null) {
                        mediaController = new MediaController();
                        f21247e2 = mediaController;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return mediaController;
        }
        return mediaController2;
    }

    public static int E(String str) {
        int i7;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e10) {
            a8.g(e10, true);
            i7 = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        return i7;
    }

    public static boolean G(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = t0.f25566b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[3];
                    if (inputStream.read(bArr, 0, 3) == 3) {
                        if (new String(bArr).equalsIgnoreCase("gif")) {
                            try {
                                inputStream.close();
                                return true;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return true;
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e12) {
                a8.g(e12, true);
                return false;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
            }
            throw th2;
        }
    }

    public static void H0(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String h = rf.b.h(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = h.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length <= 65535) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                int read = fileInputStream.read();
                int read2 = fileInputStream.read();
                if (read == 255 && read2 == 216) {
                    outputStream.write(255);
                    outputStream.write(216);
                    outputStream.write(255);
                    outputStream.write(225);
                    outputStream.write((length >> 8) & 255);
                    outputStream.write(length & 255);
                    outputStream.write(bytes);
                    outputStream.write(bytes2);
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read3 = fileInputStream.read(bArr);
                        if (read3 > 0) {
                            if (zArr != null && zArr[0]) {
                                fileInputStream.close();
                                return;
                            }
                            outputStream.write(bArr, 0, read3);
                        } else {
                            fileInputStream.close();
                            FileInputStream fileInputStream2 = new FileInputStream(file2);
                            try {
                                byte[] bArr2 = new byte[65536];
                                while (true) {
                                    int read4 = fileInputStream2.read(bArr2);
                                    if (read4 > 0) {
                                        if (zArr != null && zArr[0]) {
                                            fileInputStream2.close();
                                            return;
                                        }
                                        outputStream.write(bArr2, 0, read4);
                                    } else {
                                        fileInputStream2.close();
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
                                    fileInputStream2.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                    }
                } else {
                    throw new IOException("Not a JPEG: " + file);
                }
            } catch (Throwable th4) {
                try {
                    fileInputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } else {
            throw new IOException(jg.g.j(length, "XMP segment too large: "));
        }
    }

    public static boolean M(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = t0.f25566b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[12];
                    if (inputStream.read(bArr, 0, 12) == 12) {
                        String lowerCase = new String(bArr).toLowerCase();
                        if (lowerCase.startsWith("riff")) {
                            if (lowerCase.endsWith("webp")) {
                                try {
                                    inputStream.close();
                                    return true;
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                    return true;
                                }
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                }
                throw th2;
            }
        } catch (Exception e13) {
            a8.g(e13, true);
        }
    }

    public static void O(int i7) {
        Thread thread = new Thread(new hi.j2(i7, 2));
        thread.setPriority(1);
        thread.start();
    }

    public static int Q(int r5, int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.Q(int, int, int, int, int):int");
    }

    public static void a(MediaController mediaController, boolean z9) {
        mediaController.stopRecord();
        TLRPC.TL_document tL_document = mediaController.f21266f1;
        File N = mediaController.N(mediaController.f21272i1, mediaController.f21274j1, tL_document);
        if (tL_document != null && N != null) {
            g0.h3(new aa.d0(mediaController, N, z9, tL_document, 13));
        }
    }

    public static void b(final MediaController mediaController, final int i7, final int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem, hw hwVar) {
        String absolutePath;
        if (mediaController.f21263e1 != null) {
            g0.h3(new Runnable(mediaController) {
                public final MediaController f21650b;

                {
                    this.f21650b = mediaController;
                }

                @Override
                public final void run() {
                    int i11 = r4;
                    int i12 = i10;
                    int i13 = i7;
                    MediaController mediaController2 = this.f21650b;
                    switch (i11) {
                        case 0:
                            mediaController2.L1 = null;
                            qs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 1:
                            mediaController2.L1 = null;
                            qs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 2:
                            mediaController2.L1 = null;
                            qs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        default:
                            mediaController2.L1 = null;
                            qs.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                            return;
                    }
                }
            });
            return;
        }
        j0(true);
        mediaController.B1 = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        mediaController.f21266f1 = tL_document;
        mediaController.f21268g1 = i10;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = Integer.MIN_VALUE;
        tL_document.f26962id = iz.p();
        mediaController.f21266f1.user_id = p10.i(i7).e();
        TLRPC.TL_document tL_document2 = mediaController.f21266f1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        iz.y();
        File z9 = w7.z(1);
        mediaController.f21274j1 = new File(z9, System.currentTimeMillis() + "_" + w7.r(null, mediaController.f21266f1));
        w7.z(4).mkdirs();
        if (r2.f25212a) {
            a8.b("start recording internal " + mediaController.f21274j1.getPath() + " " + mediaController.f21274j1.exists());
        }
        File file = mediaController.f21274j1;
        Set set = z0.f26790a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            z0.f26790a.add(absolutePath);
        }
        try {
            if (mediaController.startRecord(mediaController.f21274j1.getPath(), mediaController.A1) == 0) {
                g0.h3(new Runnable(mediaController) {
                    public final MediaController f21650b;

                    {
                        this.f21650b = mediaController;
                    }

                    @Override
                    public final void run() {
                        int i11 = r4;
                        int i12 = i10;
                        int i13 = i7;
                        MediaController mediaController2 = this.f21650b;
                        switch (i11) {
                            case 0:
                                mediaController2.L1 = null;
                                qs.f(i13).k(156, Integer.valueOf(i12));
                                return;
                            case 1:
                                mediaController2.L1 = null;
                                qs.f(i13).k(156, Integer.valueOf(i12));
                                return;
                            case 2:
                                mediaController2.L1 = null;
                                qs.f(i13).k(156, Integer.valueOf(i12));
                                return;
                            default:
                                mediaController2.L1 = null;
                                qs.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                                return;
                        }
                    }
                });
                if (r2.f25212a) {
                    a8.b("cant init encoder");
                    return;
                }
                return;
            }
            mediaController.f21260d1 = false;
            mediaController.f21263e1 = new AudioRecord(0, mediaController.A1, 16, 2, mediaController.f21309z1);
            System.currentTimeMillis();
            long j11 = 0;
            mediaController.f21276k1 = 0L;
            mediaController.l1 = 0;
            mediaController.f21298v1 = 0L;
            mediaController.f21278m1 = j3;
            mediaController.f21282o1 = j10;
            mediaController.f21284p1 = njVar;
            if (ijVar != null) {
                j11 = ij.b2(mediaController.f21270h1, ijVar.f23262k, false, false);
            }
            mediaController.n1 = j11;
            mediaController.f21270h1 = i7;
            mediaController.f21286q1 = ijVar2;
            mediaController.f21289r1 = ijVar;
            mediaController.f21292s1 = storyItem;
            mediaController.f21294t1 = hwVar;
            mediaController.f21307y1.rewind();
            mediaController.f21263e1.startRecording();
            mediaController.M1.c(mediaController.O1);
            g0.h3(new Runnable(mediaController) {
                public final MediaController f21650b;

                {
                    this.f21650b = mediaController;
                }

                @Override
                public final void run() {
                    int i11 = r4;
                    int i12 = i10;
                    int i13 = i7;
                    MediaController mediaController2 = this.f21650b;
                    switch (i11) {
                        case 0:
                            mediaController2.L1 = null;
                            qs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 1:
                            mediaController2.L1 = null;
                            qs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 2:
                            mediaController2.L1 = null;
                            qs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        default:
                            mediaController2.L1 = null;
                            qs.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            a8.g(e10, true);
            mediaController.f21266f1 = null;
            mediaController.stopRecord();
            z0.b(mediaController.f21274j1);
            mediaController.f21274j1.delete();
            mediaController.f21274j1 = null;
            File file2 = mediaController.f21272i1;
            if (file2 != null) {
                file2.delete();
                mediaController.f21272i1 = null;
            }
            try {
                mediaController.f21263e1.release();
                mediaController.f21263e1 = null;
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            j0(false);
            g0.h3(new Runnable(mediaController) {
                public final MediaController f21650b;

                {
                    this.f21650b = mediaController;
                }

                @Override
                public final void run() {
                    int i11 = r4;
                    int i12 = i10;
                    int i13 = i7;
                    MediaController mediaController2 = this.f21650b;
                    switch (i11) {
                        case 0:
                            mediaController2.L1 = null;
                            qs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 1:
                            mediaController2.L1 = null;
                            qs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 2:
                            mediaController2.L1 = null;
                            qs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        default:
                            mediaController2.L1 = null;
                            qs.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                            return;
                    }
                }
            });
        }
    }

    public static void c(final MediaController mediaController, File file, File file2, final TLRPC.TL_document tL_document, final int i7, final boolean z9, final int i10, final boolean z10) {
        mediaController.stopRecord();
        final File N = mediaController.N(file, file2, tL_document);
        if (N == null) {
            if (r2.f25212a) {
                a8.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (r2.f25212a) {
            a8.b("stop recording internal in queue " + N.exists() + " " + N.length());
        }
        g0.h3(new Runnable() {
            @Override
            public final void run() {
                boolean z11;
                char c10;
                int i11;
                int i12;
                String[] strArr = MediaController.V1;
                boolean z12 = r2.f25212a;
                MediaController mediaController2 = MediaController.this;
                File file3 = N;
                if (z12) {
                    StringBuilder sb2 = new StringBuilder("stop recording internal ");
                    sb2.append(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController2.f21276k1 + " writedFrames" + mediaController2.l1);
                    a8.b(sb2.toString());
                }
                if (!file3.exists()) {
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.f21276k1 + " writedFrames" + mediaController2.l1), true);
                }
                ui.b0(mediaController2.f21270h1).B1(mediaController2.f21278m1, mediaController2.n1, null);
                int currentTime = ConnectionsManager.getInstance(mediaController2.f21270h1).getCurrentTime();
                TLRPC.TL_document tL_document2 = tL_document;
                tL_document2.date = currentTime;
                tL_document2.size = (int) file3.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file3.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                long j3 = mediaController2.f21276k1;
                tL_documentAttributeAudio.duration = j3 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                if (j3 > 700) {
                    int i13 = i7;
                    if (i13 == 1) {
                        String absolutePath = file3.getAbsolutePath();
                        long j10 = mediaController2.f21278m1;
                        ij ijVar = mediaController2.f21286q1;
                        ij ijVar2 = mediaController2.f21289r1;
                        if (z10) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        c10 = 1;
                        i11 = 2;
                        ez f10 = ez.f(tL_document2, null, absolutePath, j10, ijVar, ijVar2, null, null, null, null, z9, i10, 0, i12, null, null, false);
                        f10.R = mediaController2.f21282o1;
                        f10.T = mediaController2.f21284p1;
                        f10.H = mediaController2.f21292s1;
                        f10.K = mediaController2.f21294t1;
                        f10.Q = 0L;
                        gz.C(mediaController2.f21270h1).r0(f10);
                    } else {
                        c10 = 1;
                        i11 = 2;
                    }
                    qs f11 = qs.f(mediaController2.f21270h1);
                    Integer valueOf = Integer.valueOf(mediaController2.f21268g1);
                    String str = null;
                    if (i13 != i11) {
                        tL_document2 = null;
                    }
                    if (i13 == i11) {
                        str = file3.getAbsolutePath();
                    }
                    Object[] objArr = new Object[3];
                    z11 = false;
                    objArr[0] = valueOf;
                    objArr[c10] = tL_document2;
                    objArr[i11] = str;
                    f11.k(qs.f25073s2, objArr);
                } else {
                    z11 = false;
                    qs.f(mediaController2.f21270h1).k(qs.f25079t2, Integer.valueOf(mediaController2.f21268g1), Boolean.FALSE, Integer.valueOf((int) j3));
                    z0.b(file3);
                    file3.delete();
                }
                mediaController2.Y(z11);
            }
        });
    }

    public static native boolean cropOpusFile(String str, String str2, long j3, long j10);

    public static void d(MediaController mediaController) {
        mediaController.f21272i1 = mediaController.f21274j1;
        File z9 = w7.z(1);
        pe peVar = new pe(1, z9, System.currentTimeMillis() + "_" + w7.r(null, mediaController.f21266f1));
        mediaController.f21274j1 = peVar;
        if (mediaController.startRecord(peVar.getPath(), mediaController.A1) == 0) {
            g0.h3(new vd(mediaController, 7));
            if (r2.f25212a) {
                a8.b("cant resume audio encoder");
                return;
            }
            return;
        }
        g0.h3(new vd(mediaController, 8));
    }

    public static void d0(java.lang.String r12, android.content.Context r13, int r14, java.lang.String r15, java.lang.String r16, org.telegram.messenger.c20 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.d0(java.lang.String, android.content.Context, int, java.lang.String, java.lang.String, org.telegram.messenger.c20):void");
    }

    public static void e0(String str, String str2, Context context, c20 c20Var) {
        org.telegram.ui.ActionBar.u1 u1Var;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && context != null) {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists() && file2.exists()) {
                if (!g0.I1(Uri.fromFile(file), 0) && !g0.I1(Uri.fromFile(file2), 0)) {
                    boolean[] zArr = {false};
                    boolean[] zArr2 = new boolean[1];
                    try {
                        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(2, context, null);
                        u1Var2.n(id.M0(2131748779, null));
                        u1Var2.setCanceledOnTouchOutside(false);
                        u1Var2.setCancelable(true);
                        u1Var2.setOnCancelListener(new ce(zArr, 1));
                        g0.i3(new de(zArr2, u1Var2, 1), 250L);
                        u1Var = u1Var2;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        u1Var = null;
                    }
                    new Thread(new yj(file, file2, zArr, c20Var, u1Var, zArr2)).start();
                    return;
                }
                return;
            }
            d0(str, context, 0, null, null, c20Var);
        }
    }

    public static void f(MediaController mediaController, ij ijVar, int[] iArr, boolean z9, boolean z10, int i7) {
        ij ijVar2;
        se seVar = mediaController.f21258c1;
        if (mediaController.E0 != null) {
            if (i7 != 4 && i7 != 1) {
                try {
                    mediaController.J0.getWindow().addFlags(128);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else {
                try {
                    mediaController.J0.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (i7 == 3) {
                mediaController.F0 = true;
                ij ijVar3 = mediaController.f21295u0;
                if (ijVar3 != null && (ij.L4(ijVar3.f23262k) || mediaController.f21295u0.h4())) {
                    g0.r(seVar);
                    w7.G(ijVar.I1).Z(mediaController.f21295u0.F0(), true, false);
                }
                mediaController.P0 = true;
            } else if (i7 == 2) {
                if (z10 && (ijVar2 = mediaController.f21295u0) != null) {
                    if (ij.L4(ijVar2.f23262k) || mediaController.f21295u0.h4()) {
                        if (mediaController.F0) {
                            seVar.run();
                        } else {
                            g0.i3(seVar, 1000L);
                        }
                    }
                }
            } else if (mediaController.E0.d0() && i7 == 4) {
                ij ijVar4 = mediaController.f21295u0;
                if (ijVar4 != null && ij.L4(ijVar4.f23262k) && !z9 && (iArr == null || iArr[0] < 4)) {
                    mediaController.E0.p0(0L);
                    if (iArr != null) {
                        iArr[0] = iArr[0] + 1;
                    }
                } else if (!mediaController.a0()) {
                    mediaController.q(true, mediaController.F(), true, false);
                }
            }
        }
    }

    public static Uri f0(int i7, File file, String str) {
        String str2;
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String D = w7.D(file);
            if (D != null) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D);
            } else {
                str2 = null;
            }
            if ((i7 == 0 || i7 == 1) && str2 != null) {
                if (str2.startsWith("image")) {
                    i7 = 0;
                }
                if (str2.startsWith("video")) {
                    i7 = 1;
                }
            }
            if (i7 == 0) {
                if (str == null) {
                    str = g0.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", str2);
            } else if (i7 == 1) {
                if (str == null) {
                    str = g0.p0(1, D);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i7 == 2) {
                if (str == null) {
                    str = file.getName();
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                contentUri = MediaStore.Downloads.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else {
                if (str == null) {
                    str = file.getName();
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MUSIC, "Telegram") + File.separator);
                contentUri = MediaStore.Audio.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            }
            contentValues.put("mime_type", str2);
            Uri insert = t0.f25566b.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                g0.D(fileInputStream, t0.f25566b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static void g0(Context context, c cVar, ArrayList arrayList, sr srVar) {
        di.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        ?? obj = new Object();
        obj.d = new HashMap();
        obj.f21842a = cVar;
        obj.f21844c = arrayList;
        obj.f21849s = srVar;
        obj.f21850w = ((ij) arrayList.get(0)).I3();
        int i7 = cVar.f21765a;
        qs.f(i7).b(obj, qs.Y1);
        qs.f(i7).b(obj, qs.X1);
        qs.f(i7).b(obj, qs.Z1);
        if (PhotoViewer.p1().P1()) {
            bVar = new di.b();
        } else {
            bVar = null;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(2, context, bVar);
        obj.f21843b = u1Var;
        u1Var.n(id.M0(2131748779, null));
        u1Var.setCancelable(true);
        u1Var.H = true;
        u1Var.setOnCancelListener(new ce(obj, 3));
        g0.i3(new bf(obj, 1), 250L);
        new Thread(new bf(obj, 2)).start();
    }

    public static native byte[] getWaveform(String str);

    public static native int isOpusFile(String str);

    public static void j0(boolean z9) {
        AudioManager audioManager = (AudioManager) t0.f25566b.getSystemService("audio");
        if (iz.f23441u0 && !c8.ia.d("android.permission.BLUETOOTH_CONNECT")) {
            iz.f23441u0 = false;
            iz.y();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && iz.f23441u0) || !z9) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                try {
                    if (defaultAdapter.getProfileConnectionState(1) != 2) {
                    }
                    if (!z9 && !audioManager.isBluetoothScoOn()) {
                        audioManager.startBluetoothSco();
                        return;
                    } else if (z9 && audioManager.isBluetoothScoOn()) {
                        audioManager.stopBluetoothSco();
                        return;
                    }
                } catch (SecurityException unused) {
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            }
            if (z9) {
                return;
            }
            if (!z9) {
            }
            if (z9) {
            }
        }
    }

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    public static boolean s0(int i7) {
        xi.a aVar = xi.e.f58867b;
        aVar.a();
        if (aVar.f58859c) {
            aVar.a();
            return aVar.d;
        } else if (!((h0) qp.s1(i7).f24942x7.f24439f0.f13889b).f22780c) {
            return true;
        } else {
            return false;
        }
    }

    private native int startRecord(String str, int i7);

    private native void stopRecord();

    public static java.lang.String t(long r15, android.net.Uri r17, java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.t(long, android.net.Uri, java.lang.String):java.lang.String");
    }

    public static File u(String str) {
        int lastIndexOf;
        File file;
        try {
            File g12 = g0.g1();
            g12.mkdirs();
            if (g0.I1(Uri.fromFile(g12), 0)) {
                return null;
            }
            int i7 = 0;
            do {
                File g13 = g0.g1();
                if (i7 == 0) {
                    file = new File(g13, str);
                } else {
                    if (str.lastIndexOf(".") > 0) {
                        file = new File(g13, str.substring(0, lastIndexOf) + " (" + i7 + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(g13, str + " (" + i7 + ")");
                    }
                }
                i7++;
            } while (file.exists());
            return file;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static int v(int r5, int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.v(int, int, int, boolean):int");
    }

    public static int w(MediaExtractor mediaExtractor, boolean z9) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i7 = 0; i7 < trackCount; i7++) {
            String string = mediaExtractor.getTrackFormat(i7).getString("mime");
            if (z9) {
                if (string.startsWith("audio/")) {
                    return i7;
                }
            } else if (string.startsWith("video/")) {
                return i7;
            }
        }
        return -5;
    }

    public native int writeFrame(ByteBuffer byteBuffer, int i7);

    public static boolean y() {
        AudioDeviceInfo[] devices;
        try {
            for (AudioDeviceInfo audioDeviceInfo : dt.f22079o0.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public final void A0(org.telegram.ui.cn cnVar, boolean z9, boolean z10) {
        int i7;
        if (this.O) {
            this.O = false;
            return;
        }
        if (z10) {
            if (this.f21266f1 != null && !K()) {
                D0(false);
            } else {
                if (z9) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                B0(i7, 0, false, false);
            }
        }
        if (this.P && !this.O) {
            if ((this.f21264f != null || this.f21279n != null) && this.f21261e != null && this.f21290s == cnVar) {
                this.f21290s = null;
                this.P = false;
                this.f21299w = false;
                this.I = false;
                this.f21287r = false;
                this.L = false;
                Utilities.f21336e.c(new vd(this, 5));
                PowerManager.WakeLock wakeLock = this.d;
                if (wakeLock != null && wakeLock.isHeld()) {
                    this.d.release();
                }
            }
        }
    }

    public final void B0(final int i7, final int i10, final boolean z9, final boolean z10) {
        e0.g gVar;
        if (this.H1) {
            ac.e eVar = this.K1;
            if (eVar != null) {
                this.K1 = null;
                if (i7 == 0) {
                    x(false);
                    return;
                }
                this.B1 = i7;
                this.C1 = z9;
                this.D1 = i10;
                this.E1 = z10;
                s(eVar);
                return;
            } else if (this.I1) {
                if (this.B1 == 3) {
                    this.B1 = i7;
                    this.C1 = z9;
                    this.D1 = i10;
                    this.E1 = z10;
                    if (i7 == 0) {
                        e0.g gVar2 = this.F1;
                        if (gVar2 != null) {
                            gVar2.f10052b = false;
                            ((vi.h) gVar2.f10054e).b();
                        }
                        x(false);
                        return;
                    }
                    return;
                }
                return;
            } else if (i7 == 2 && (gVar = this.F1) != null && gVar.e()) {
                this.f21303x0 = false;
                this.f21287r = false;
                this.O = false;
                return;
            } else {
                di.d1 d1Var = this.G1;
                if (d1Var != null) {
                    g0.r(d1Var);
                    this.G1 = null;
                }
                this.I1 = true;
                this.B1 = i7;
                this.C1 = z9;
                this.D1 = i10;
                this.E1 = z10;
                e0.g gVar3 = this.F1;
                if (gVar3 == null) {
                    x(false);
                } else {
                    vi.h hVar = (vi.h) gVar3.f10054e;
                    if (i7 == 0) {
                        gVar3.f10052b = false;
                        hVar.b();
                        x(false);
                    } else {
                        gVar3.f10052b = true;
                        hVar.getClass();
                        vi.h.q();
                        int i11 = hVar.e().f3009a;
                        if (gVar3.f10052b && (i11 == 3 || i11 == 5)) {
                            gVar3.f10052b = false;
                            hVar.h();
                        }
                    }
                }
                try {
                    this.K0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                final int i12 = this.f21270h1;
                final int i13 = this.f21268g1;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        String[] strArr = MediaController.V1;
                        qs f10 = qs.f(i12);
                        Integer valueOf = Integer.valueOf(i13);
                        if (i7 == 2) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        f10.k(qs.f25042n2, valueOf, Integer.valueOf(i14));
                    }
                });
                return;
            }
        }
        wd wdVar = this.L1;
        p5 p5Var = this.M1;
        if (wdVar != null) {
            p5Var.a(wdVar);
            this.L1 = null;
        }
        p5Var.c(new Runnable() {
            @Override
            public final void run() {
                MediaController mediaController = MediaController.this;
                int i14 = mediaController.B1;
                int i15 = i7;
                boolean z11 = z9;
                int i16 = i10;
                boolean z12 = z10;
                if (i14 == 3) {
                    mediaController.B1 = 0;
                    mediaController.C0(i15, i16, z11, z12);
                    return;
                }
                AudioRecord audioRecord = mediaController.f21263e1;
                if (audioRecord == null) {
                    mediaController.f21266f1 = null;
                    mediaController.f21303x0 = false;
                    mediaController.f21287r = false;
                    mediaController.O = false;
                    return;
                }
                try {
                    mediaController.B1 = i15;
                    mediaController.C1 = z11;
                    mediaController.D1 = i16;
                    mediaController.E1 = z12;
                    audioRecord.stop();
                    MediaController.j0(false);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    if (mediaController.f21274j1 != null) {
                        if (r2.f25212a) {
                            a8.d("delete voice file");
                        }
                        mediaController.f21274j1.delete();
                    }
                }
                if (i15 == 0) {
                    mediaController.C0(0, 0, false, false);
                }
                try {
                    mediaController.K0.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                g0.h3(new yd(mediaController, i15, 0));
            }
        });
    }

    public final float C(boolean z9) {
        if (z9) {
            return this.f21285q0;
        }
        return this.f21283p0;
    }

    public final void C0(int i7, int i10, boolean z9, boolean z10) {
        MediaController mediaController;
        File file;
        if (i7 != 0 && (file = this.f21274j1) != null) {
            TLRPC.TL_document tL_document = this.f21266f1;
            File file2 = this.f21272i1;
            if (r2.f25212a) {
                a8.b("stop recording internal filename " + this.f21274j1.getPath());
            }
            mediaController = this;
            mediaController.N1.c(new fi.x8(mediaController, file2, file, tL_document, i7, z9, i10, z10));
        } else {
            mediaController = this;
            z0.b(mediaController.f21274j1);
            File file3 = mediaController.f21274j1;
            if (file3 != null) {
                file3.delete();
            }
            Y(false);
        }
        try {
            AudioRecord audioRecord = mediaController.f21263e1;
            if (audioRecord != null) {
                audioRecord.release();
                mediaController.f21263e1 = null;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        mediaController.f21266f1 = null;
        mediaController.f21272i1 = null;
        mediaController.f21274j1 = null;
        mediaController.f21303x0 = false;
        mediaController.f21287r = false;
        mediaController.O = false;
    }

    public final long D(ij ijVar) {
        ij ijVar2 = this.f21295u0;
        if ((this.f21271i0 != null || this.E0 != null) && ijVar != null && ijVar2 != null && L(ijVar)) {
            try {
                u51 u51Var = this.f21271i0;
                if (u51Var != null) {
                    return u51Var.S();
                }
                u51 u51Var2 = this.E0;
                if (u51Var2 != null) {
                    return u51Var2.S();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void D0(boolean z9) {
        boolean z10;
        if (this.H1) {
            this.J1 = z9;
            e0.g gVar = this.F1;
            if (gVar != null) {
                if (gVar.e()) {
                    Y(true);
                    j0(true);
                }
                e0.g gVar2 = this.F1;
                vi.h hVar = (vi.h) gVar2.f10054e;
                hVar.getClass();
                vi.h.q();
                int i7 = hVar.e().f3009a;
                if (i7 == 3) {
                    ((vi.h) gVar2.f10054e).n();
                    return;
                } else if (i7 == 5) {
                    vi.h hVar2 = (vi.h) gVar2.f10054e;
                    hVar2.getClass();
                    vi.h.q();
                    if (hVar2.G == 5) {
                        hVar2.h.b("resume requested: trim=" + hVar2.f57568r + ".." + hVar2.f57569s + ", sourceDurationMs=" + hVar2.j());
                        hVar2.p();
                        hVar2.s(6);
                        vi.g gVar3 = hVar2.f57575z;
                        if (gVar3 == null) {
                            hVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j3 = hVar2.f57568r;
                        long j10 = hVar2.f57569s;
                        if (j10 >= vi.h.r(hVar2.f57566p)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        hVar2.k(1);
                        long j11 = ((j10 - j3) * 48000) / 1000;
                        hVar2.f57566p = j11;
                        hVar2.f57568r = 0L;
                        hVar2.f57569s = vi.h.r(j11);
                        hVar2.d();
                        hVar2.h.b("resume prefix selected: source=" + gVar3.f57550b.getName() + ", trim=" + j3 + ".." + j10);
                        File file = gVar3.f57550b;
                        if (z10) {
                            j10 = -1;
                        }
                        hVar2.u(j3, j10, file);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        this.M1.c(new xd(this, z9, 0));
    }

    public final boolean E0(int i7, ArrayList arrayList) {
        boolean z9;
        int size;
        ij ijVar;
        int i10;
        ij ijVar2;
        int i11 = this.U0;
        int i12 = 0;
        if (ConnectionsManager.getInstance(p10.f24470s0).getConnectionState() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.U0 += i7;
        if (z9) {
            while (this.U0 < arrayList.size() && (i10 = this.U0) >= 0 && ((ijVar2 = (ij) arrayList.get(i10)) == null || !ijVar2.f23311x0)) {
                this.U0 += i7;
            }
        }
        if (this.U0 < arrayList.size() && this.U0 >= 0) {
            return false;
        }
        if (this.U0 >= arrayList.size()) {
            size = 0;
        } else {
            size = arrayList.size() - 1;
        }
        this.U0 = size;
        if (z9) {
            while (true) {
                int i13 = this.U0;
                if (i13 < 0 || i13 >= arrayList.size()) {
                    break;
                }
                int i14 = this.U0;
                if (i7 > 0) {
                    if (i14 > i11) {
                        break;
                    }
                    ijVar = (ij) arrayList.get(this.U0);
                    if (ijVar == null && ijVar.f23311x0) {
                        break;
                    }
                    this.U0 += i7;
                } else {
                    if (i14 < i11) {
                        break;
                    }
                    ijVar = (ij) arrayList.get(this.U0);
                    if (ijVar == null) {
                    }
                    this.U0 += i7;
                }
            }
            if (this.U0 >= arrayList.size() || this.U0 < 0) {
                if (this.U0 < arrayList.size()) {
                    i12 = arrayList.size() - 1;
                }
                this.U0 = i12;
            }
        }
        return true;
    }

    public final boolean F() {
        ArrayList arrayList;
        ij ijVar = this.f21295u0;
        if (ijVar == null || ((!ij.R4(ijVar.f23262k) && !this.f21295u0.h4()) || (arrayList = this.f21262e0) == null || arrayList.size() <= 1 || !this.f21262e0.contains(this.f21295u0) || this.f21262e0.indexOf(this.f21295u0) >= this.f21262e0.size() - 1)) {
            return true;
        }
        return false;
    }

    public final void F0() {
        ij ijVar = this.f21295u0;
        if (ijVar != null && H() && this.f21269h0 && (ij.R4(ijVar.f23262k) || ijVar.I3())) {
            S(ijVar);
        }
        this.f21269h0 = false;
    }

    public final void G0(File file, long j3, byte[] bArr) {
        TLRPC.TL_document tL_document = this.f21266f1;
        if (tL_document == null) {
            return;
        }
        tL_document.date = ConnectionsManager.getInstance(this.f21270h1).getCurrentTime();
        this.f21266f1.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        tL_documentAttributeAudio.waveform = bArr;
        if (bArr != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = j3 / 1000.0d;
        this.f21266f1.attributes.clear();
        this.f21266f1.attributes.add(tL_documentAttributeAudio);
    }

    public final boolean H() {
        if (!this.f21267g0 && !this.A0) {
            return false;
        }
        return true;
    }

    public final boolean I(ij ijVar) {
        ij ijVar2;
        boolean z9;
        if (ijVar == null || !ijVar.f23251h2) {
            if ((this.f21271i0 != null || this.E0 != null) && ijVar != null && (ijVar2 = this.f21295u0) != null) {
                long j3 = ijVar2.T;
                if (j3 != 0 && j3 == ijVar.T) {
                    z9 = this.A0;
                } else if (L(ijVar)) {
                    z9 = this.A0;
                } else {
                    return false;
                }
                return !z9;
            }
            return false;
        }
        return false;
    }

    public final boolean J() {
        if (this.L1 == null && this.G1 == null && this.f21266f1 == null) {
            return false;
        }
        return true;
    }

    public final boolean K() {
        if (this.H1) {
            e0.g gVar = this.F1;
            if (gVar != null && gVar.e()) {
                return true;
            }
            return false;
        }
        return this.f21260d1;
    }

    public final boolean L(ij ijVar) {
        boolean z9;
        boolean z10;
        ij ijVar2 = this.f21295u0;
        if (ijVar2 != null && ij.B0(ijVar2.f23262k) == ij.B0(ijVar.f23262k) && this.f21295u0.e1() == ijVar.e1()) {
            if (this.f21295u0.T == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (ijVar.T == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 == z10) {
                return true;
            }
        }
        return false;
    }

    public final File N(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            File z9 = w7.z(1);
            File file3 = new File(z9, System.currentTimeMillis() + "_" + w7.r(null, tL_document));
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), file3.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.f21274j1) {
                    this.f21274j1 = file3;
                }
                file2 = file3;
            }
            file.delete();
            if (file == this.f21272i1) {
                this.f21272i1 = null;
            }
        }
        return file2;
    }

    public final void P() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.P():void");
    }

    public final boolean R(ij ijVar, boolean z9) {
        if ((this.f21271i0 != null || this.E0 != null) && ijVar != null && this.f21295u0 != null && L(ijVar)) {
            z0();
            try {
                if (this.f21271i0 != null) {
                    if (z9 && !d1.f.u() && !ij.R4(this.f21295u0.f23262k) && this.f21295u0.L0() * (1.0f - this.f21295u0.f23222b0) > 1.0d && LaunchActivity.F1) {
                        ValueAnimator valueAnimator = this.Q1;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            this.Q1.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        this.Q1 = ofFloat;
                        ofFloat.addUpdateListener(this.R1);
                        this.Q1.setDuration(300L);
                        this.Q1.addListener(new m.a(this, 5));
                        this.Q1.start();
                    } else {
                        this.f21271i0.g0();
                    }
                } else {
                    u51 u51Var = this.E0;
                    if (u51Var != null) {
                        u51Var.g0();
                    }
                }
                this.f21267g0 = true;
                qs.f(this.f21295u0.I1).k(qs.f25004g2, Integer.valueOf(this.f21295u0.e1()));
                try {
                    d1.f.b(1);
                    if (!this.T1) {
                        if (wf.b.Z().d0()) {
                            wf.b.Z().h0(z());
                        }
                        d1.f.x(false);
                    }
                    return true;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return true;
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                this.f21267g0 = false;
            }
        }
        return false;
    }

    public final boolean S(final org.telegram.messenger.ij r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.S(org.telegram.messenger.ij):boolean");
    }

    public final void T(int i7) {
        int i10 = this.U0;
        if (i10 >= 0) {
            ArrayList arrayList = this.R0;
            if (i10 < arrayList.size()) {
                this.U0 = i7;
                this.B0 = true;
                ij ijVar = (ij) arrayList.get(i7);
                if (this.f21295u0 != null && !L(ijVar)) {
                    this.f21295u0.G5();
                }
                S(ijVar);
            }
        }
    }

    public final void U(boolean z9) {
        ArrayList arrayList;
        boolean z10;
        int i7;
        int i10;
        if (iz.N0) {
            arrayList = this.T0;
        } else {
            arrayList = this.R0;
        }
        if (z9 && (((i10 = iz.S0) == 2 || (i10 == 1 && arrayList.size() == 1)) && !this.V0)) {
            q(false, false, false, false);
            int i11 = this.U0;
            if (i11 >= 0 && i11 < arrayList.size()) {
                ij ijVar = (ij) arrayList.get(this.U0);
                ijVar.f23222b0 = 0.0f;
                ijVar.f23245g0 = 0;
                S(ijVar);
                return;
            }
            return;
        }
        if (this.Q0 != null) {
            if (!iz.O0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = iz.O0;
        }
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        if (E0(i7, arrayList) && z9 && iz.S0 == 0 && !this.V0) {
            u51 u51Var = this.f21271i0;
            if (u51Var != null || this.E0 != null) {
                if (u51Var != null) {
                    ef efVar = this.f21300w0;
                    if (efVar != null) {
                        efVar.b();
                        this.f21300w0 = null;
                    }
                    try {
                        this.f21271i0.m0();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    this.f21271i0 = null;
                    org.telegram.ui.ActionBar.l6.N1(this.f21295u0);
                } else {
                    this.L0 = null;
                    this.N0 = null;
                    this.P0 = false;
                    this.G0 = null;
                    this.E0.m0();
                    this.E0 = null;
                    try {
                        this.J0.getWindow().clearFlags(128);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    g0.r(this.f21258c1);
                    w7.G(this.f21295u0.I1).Z(this.f21295u0.F0(), true, false);
                }
                z0();
                this.f21267g0 = true;
                ij ijVar2 = this.f21295u0;
                ijVar2.f23222b0 = 0.0f;
                ijVar2.f23245g0 = 0;
                qs.f(ijVar2.I1).k(qs.f24992e2, Integer.valueOf(this.f21295u0.e1()), 0);
                qs.f(this.f21295u0.I1).k(qs.f25004g2, Integer.valueOf(this.f21295u0.e1()));
                return;
            }
            return;
        }
        int i12 = this.U0;
        if (i12 >= 0 && i12 < arrayList.size()) {
            ij ijVar3 = this.f21295u0;
            if (ijVar3 != null) {
                ijVar3.G5();
            }
            this.B0 = true;
            S((ij) arrayList.get(this.U0));
        }
    }

    public final void V() {
        ArrayList arrayList;
        int i7;
        boolean z9;
        int i10;
        if (iz.N0) {
            arrayList = this.T0;
        } else {
            arrayList = this.R0;
        }
        if (!arrayList.isEmpty() && (i7 = this.U0) >= 0 && i7 < arrayList.size()) {
            ij ijVar = (ij) arrayList.get(this.U0);
            if (ijVar.f23245g0 > 10) {
                i0(ijVar, 0.0f);
                return;
            }
            if (this.Q0 != null) {
                if (!iz.O0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else {
                z9 = iz.O0;
            }
            if (z9) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            E0(i10, arrayList);
            if (this.U0 < arrayList.size()) {
                this.B0 = true;
                S((ij) arrayList.get(this.U0));
            }
        }
    }

    public final void W(boolean z9) {
        hw hwVar;
        long j3;
        if (this.f21266f1 != null) {
            D0(false);
        } else if (z9) {
            int currentAccount = this.f21290s.getCurrentAccount();
            long a10 = this.f21290s.a();
            org.telegram.ui.cn cnVar = this.f21290s;
            ij ijVar = cnVar.f44527l4;
            int classGuid = cnVar.getClassGuid();
            org.telegram.ui.cn cnVar2 = this.f21290s;
            nj njVar = null;
            if (cnVar2 != null) {
                hwVar = cnVar2.X8();
            } else {
                hwVar = null;
            }
            org.telegram.ui.cn cnVar3 = this.f21290s;
            if (cnVar3 != null) {
                j3 = cnVar3.i9();
            } else {
                j3 = 0;
            }
            org.telegram.ui.cn cnVar4 = this.f21290s;
            if (cnVar4 != null) {
                njVar = cnVar4.f44667w5;
            }
            x0(currentAccount, a10, null, ijVar, null, classGuid, false, hwVar, j3, njVar);
        } else {
            B0(2, 0, false, false);
        }
    }

    public final boolean X() {
        ac.e eVar = this.K1;
        if (eVar != null) {
            File file = (File) eVar.f1024b;
            z0.b(file);
            file.delete();
            Z();
            return true;
        }
        e0.g gVar = this.F1;
        if (gVar != null && gVar.e()) {
            this.F1 = null;
            if (!gVar.c()) {
                ((vi.h) gVar.f10054e).o();
                gVar.f10053c = true;
            }
            Z();
            return true;
        }
        return false;
    }

    public final void Y(boolean z9) {
        ud udVar = this.f21250a;
        if (z9) {
            if (!this.V && iz.F0 && dt.f22079o0.requestAudioFocus(udVar, 3, 2) == 1) {
                this.V = true;
            }
        } else if (this.V) {
            dt.f22079o0.abandonAudioFocus(udVar);
            this.V = false;
        }
    }

    public final void Z() {
        this.f21266f1 = null;
        this.f21272i1 = null;
        this.f21274j1 = null;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = null;
        this.B1 = 0;
    }

    public final boolean a0() {
        ArrayList arrayList;
        int i7;
        ij ijVar;
        jf jfVar = this.U1;
        if (jfVar != null) {
            ij ijVar2 = jfVar.f23542a;
            this.U1 = null;
            if (iz.N0) {
                arrayList = this.T0;
            } else {
                arrayList = this.R0;
            }
            if (arrayList != null && (i7 = this.U0) >= 0 && i7 < arrayList.size() && (ijVar = (ij) arrayList.get(this.U0)) != null && ij.B0(ijVar.f23262k) == ij.B0(ijVar2.f23262k) && ijVar.e1() == ijVar2.e1()) {
                this.B0 = false;
                float f10 = jfVar.f23543b;
                ijVar.f23227c0 = f10;
                ijVar.f23222b0 = f10;
                ijVar.f23231d0 = jfVar.f23544c;
                ijVar.f23245g0 = jfVar.d;
                S(ijVar);
                R(ijVar, false);
                return true;
            }
        }
        return false;
    }

    public final void b0(ij ijVar) {
        if ((this.f21271i0 != null || this.E0 != null) && ijVar != null && this.f21295u0 != null && L(ijVar)) {
            try {
                v0(this.f21295u0);
                ValueAnimator valueAnimator = this.Q1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.Q1.cancel();
                }
                if (!ij.R4(ijVar.f23262k) && !ijVar.h4()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.P1, 1.0f);
                    this.Q1 = ofFloat;
                    ofFloat.addUpdateListener(this.R1);
                    this.Q1.setDuration(300L);
                    this.Q1.start();
                } else {
                    this.P1 = 1.0f;
                    n0();
                }
                u51 u51Var = this.f21271i0;
                if (u51Var != null) {
                    u51Var.h0();
                } else {
                    u51 u51Var2 = this.E0;
                    if (u51Var2 != null) {
                        u51Var2.h0();
                    }
                }
                j(ijVar);
                this.f21267g0 = false;
                qs.f(this.f21295u0.I1).k(qs.f25004g2, Integer.valueOf(this.f21295u0.e1()));
                try {
                    d1.f.b(1);
                    if (!this.T1) {
                        d1.f.x(true);
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
    }

    public final void c0() {
        ij ijVar;
        u51 u51Var = this.f21271i0;
        if (u51Var != null && (ijVar = this.f21295u0) != null && !this.f21267g0) {
            if (u51Var.d != null && u51Var.L == 2) {
                q(false, false, false, false);
                S(ijVar);
                return;
            }
            u51Var.h0();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        kp kpVar;
        ij ijVar;
        ArrayList arrayList;
        char c10;
        int indexOf;
        int i11 = 0;
        if (i7 != qs.Y1 && i7 != qs.R1) {
            if (i7 == qs.f25096w) {
                if (!((Boolean) objArr[2]).booleanValue()) {
                    long longValue = ((Long) objArr[1]).longValue();
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    ij ijVar2 = this.f21295u0;
                    if (ijVar2 != null && longValue == ijVar2.f23262k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(ijVar2.e1()))) {
                        q(true, true, false, false);
                    }
                    ArrayList arrayList3 = this.f21262e0;
                    if (arrayList3 != null && !arrayList3.isEmpty() && longValue == ((ij) this.f21262e0.get(0)).f23262k.peer_id.channel_id) {
                        while (i11 < arrayList2.size()) {
                            Integer num = (Integer) arrayList2.get(i11);
                            ij ijVar3 = (ij) this.f21265f0.get(num.intValue());
                            this.f21265f0.remove(num.intValue());
                            if (ijVar3 != null) {
                                this.f21262e0.remove(ijVar3);
                            }
                            i11++;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i7 == qs.f24990e0) {
                long longValue2 = ((Long) objArr[0]).longValue();
                ij ijVar4 = this.f21295u0;
                if (ijVar4 != null && ij.B0(ijVar4.f23262k) == longValue2) {
                    q(false, true, false, false);
                    return;
                }
                return;
            } else {
                int i12 = qs.K0;
                int[] iArr = this.f21255b1;
                HashMap hashMap = this.S0;
                ArrayList arrayList4 = this.R0;
                if (i7 == i12) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    long longValue4 = ((Long) objArr[3]).longValue();
                    ij ijVar5 = this.f21295u0;
                    if (ijVar5 != null && ijVar5.I3() && ij.B0(this.f21295u0.f23262k) == longValue3 && this.f21252a1 == longValue4 && !this.f21295u0.f23281p1) {
                        arrayList4.addAll(0, (ArrayList) objArr[1]);
                        arrayList4.addAll((ArrayList) objArr[2]);
                        int size = arrayList4.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            ij ijVar6 = (ij) arrayList4.get(i13);
                            hashMap.put(Integer.valueOf(ijVar6.e1()), ijVar6);
                            iArr[0] = Math.min(iArr[0], ijVar6.e1());
                        }
                        t0();
                        if (iz.N0) {
                            g();
                        } else {
                            ij ijVar7 = this.f21295u0;
                            if (ijVar7 != null && (indexOf = arrayList4.indexOf(ijVar7)) >= 0) {
                                this.U0 = indexOf;
                            }
                        }
                        this.Z0 = ConnectionsManager.generateClassGuid();
                        return;
                    }
                    return;
                }
                int i14 = qs.V;
                int i15 = qs.L0;
                if (i7 == i14) {
                    if (((Integer) objArr[3]).intValue() == this.Z0 && this.f21295u0 != null) {
                        long longValue5 = ((Long) objArr[0]).longValue();
                        ((Integer) objArr[4]).getClass();
                        ArrayList arrayList5 = (ArrayList) objArr[2];
                        if (longValue5 == this.Y0) {
                            c10 = 1;
                        } else {
                            c10 = 0;
                        }
                        if (!arrayList5.isEmpty()) {
                            this.W0[c10] = ((Boolean) objArr[5]).booleanValue();
                        }
                        int i16 = 0;
                        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                            ij ijVar8 = (ij) arrayList5.get(i17);
                            if (!ijVar8.S4() && !hashMap.containsKey(Integer.valueOf(ijVar8.e1()))) {
                                i16++;
                                arrayList4.add(0, ijVar8);
                                hashMap.put(Integer.valueOf(ijVar8.e1()), ijVar8);
                                iArr[c10] = Math.min(iArr[c10], ijVar8.e1());
                            }
                        }
                        t0();
                        int indexOf2 = arrayList4.indexOf(this.f21295u0);
                        if (indexOf2 >= 0) {
                            this.U0 = indexOf2;
                        }
                        this.X0 = false;
                        if (iz.N0) {
                            g();
                        }
                        if (i16 != 0) {
                            qs.f(this.f21295u0.I1).k(i15, Integer.valueOf(i16));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    if (!((Boolean) objArr[2]).booleanValue() && (arrayList = this.f21262e0) != null && !arrayList.isEmpty() && ((Long) objArr[0]).longValue() == ij.B0(((ij) this.f21262e0.get(0)).f23262k)) {
                        ArrayList arrayList6 = (ArrayList) objArr[1];
                        while (i11 < arrayList6.size()) {
                            ij ijVar9 = (ij) arrayList6.get(i11);
                            if ((ij.R4(ijVar9.f23262k) || ijVar9.h4()) && !ijVar9.S4() && !ijVar9.g4() && (!this.f21259d0 || (ijVar9.f23262k.media_unread && !ijVar9.N3()))) {
                                this.f21262e0.add(ijVar9);
                                this.f21265f0.put(ijVar9.e1(), ijVar9);
                            }
                            i11++;
                        }
                        return;
                    }
                    return;
                } else if (i7 == qs.H4) {
                    u51 u51Var = (u51) objArr[0];
                    if (this.E0 != u51Var && this.f21271i0 != u51Var) {
                        ij ijVar10 = this.f21295u0;
                        if (ijVar10 != null && I(ijVar10) && !H() && (ijVar10.I3() || ij.R4(ijVar10.f23262k))) {
                            this.f21269h0 = true;
                        }
                        R(ijVar10, true);
                        return;
                    }
                    return;
                } else if (i7 == qs.T3 && (kpVar = this.Q0) != null && objArr[0] == kpVar) {
                    int size2 = kpVar.f23741c.size() - arrayList4.size();
                    arrayList4.clear();
                    arrayList4.addAll(this.Q0.f23741c);
                    t0();
                    if (iz.N0) {
                        g();
                    } else {
                        ij ijVar11 = this.f21295u0;
                        if (ijVar11 != null) {
                            int indexOf3 = arrayList4.indexOf(ijVar11);
                            if (indexOf3 >= 0) {
                                this.U0 = indexOf3;
                            } else {
                                int i18 = this.U0;
                                if (i18 < 0 || i18 >= arrayList4.size()) {
                                    this.U0 = 0;
                                }
                                if (arrayList4.size() == 0) {
                                    o();
                                } else {
                                    S((ij) arrayList4.get(0));
                                }
                            }
                        }
                    }
                    if (size2 != 0 && (ijVar = this.f21295u0) != null) {
                        qs.f(ijVar.I1).k(i15, Integer.valueOf(size2));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        String str = (String) objArr[0];
        ij ijVar12 = this.f21295u0;
        if (ijVar12 != null && ijVar12.I1 == i10 && w7.r(null, ijVar12.F0()).equals(str)) {
            if (this.A0) {
                this.B0 = true;
                S(this.f21295u0);
            } else if (this.D0 == null) {
                try {
                    w7.G(p10.f24470s0);
                    this.D0 = rf.a.a(w7.M(this.f21295u0.f23262k, false, true));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void g() {
        ij ijVar;
        ArrayList arrayList = this.R0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            ArrayList arrayList3 = this.T0;
            arrayList3.clear();
            int i7 = this.U0;
            if (i7 >= 0 && i7 < arrayList.size()) {
                ijVar = (ij) arrayList.get(this.U0);
                arrayList2.remove(this.U0);
            } else {
                ijVar = null;
            }
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                int nextInt = Utilities.f21334b.nextInt(arrayList2.size());
                arrayList3.add((ij) arrayList2.get(nextInt));
                arrayList2.remove(nextInt);
            }
            if (ijVar != null) {
                arrayList3.add(ijVar);
                this.U0 = arrayList3.size() - 1;
            }
        }
    }

    public native byte[] getWaveform2(short[] sArr, int i7);

    public final boolean h() {
        ij ijVar = this.f21295u0;
        if (ijVar != null) {
            if ((ijVar.I3() || ij.R4(this.f21295u0.f23262k) || this.f21295u0.h4()) && !this.f21295u0.S4() && !this.f21295u0.g4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h0(ij ijVar, boolean z9, boolean z10, boolean z11) {
        j20 j20Var;
        if (ijVar != null) {
            j20Var = ijVar.f23280p0;
        } else {
            j20Var = null;
        }
        if (ijVar != null && j20Var != null) {
            ArrayList arrayList = this.f21254b0;
            if (!z9 || arrayList.isEmpty()) {
                if (z9) {
                    new File(ijVar.f23262k.attachPath).delete();
                }
                ?? obj = new Object();
                obj.f23887a = ijVar;
                obj.f23889c = ijVar.I1;
                obj.f23888b = j20Var;
                obj.d = z11;
                arrayList.add(obj);
                if (z10) {
                    this.Z.add(obj);
                    k(false);
                }
                if (arrayList.size() == 1) {
                    y0();
                }
                return true;
            }
        }
        return false;
    }

    public final void i(ij ijVar) {
        if (ijVar != null && !this.f21254b0.isEmpty()) {
            for (int i7 = 0; i7 < this.f21254b0.size(); i7++) {
                lf lfVar = (lf) this.f21254b0.get(i7);
                ij ijVar2 = lfVar.f23887a;
                if (ijVar2.T(ijVar) && ijVar2.I1 == ijVar.I1) {
                    if (i7 == 0) {
                        synchronized (this.f21253b) {
                            lfVar.f23888b.W = true;
                        }
                        return;
                    }
                    this.Z.remove((lf) this.f21254b0.remove(i7));
                    k(true);
                    return;
                }
            }
        }
    }

    public final void i0(ij ijVar, float f10) {
        ij ijVar2 = this.f21295u0;
        if ((this.f21271i0 != null || this.E0 != null) && ijVar != null && ijVar2 != null && L(ijVar)) {
            try {
                u51 u51Var = this.f21271i0;
                if (u51Var != null) {
                    long U = u51Var.U();
                    if (U == -9223372036854775807L) {
                        this.f21293t0 = f10;
                    } else {
                        ijVar2.f23222b0 = f10;
                        long j3 = (int) (((float) U) * f10);
                        this.f21271i0.q0(j3, false);
                        if (!this.T1) {
                            d1.f.v(j3);
                        }
                    }
                } else {
                    u51 u51Var2 = this.E0;
                    if (u51Var2 != null) {
                        u51Var2.p0(((float) u51Var2.U()) * f10);
                        if (!this.T1) {
                            d1.f.v(((float) this.E0.U()) * f10);
                        }
                    }
                }
                qs.f(ijVar.I1).k(qs.f25016i2, Integer.valueOf(ijVar2.e1()), Float.valueOf(f10));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void j(ij ijVar) {
        int i7;
        int i10;
        int requestAudioFocus;
        if (!ij.R4(ijVar.f23262k) && !ijVar.h4()) {
            i7 = 1;
        } else if (this.L) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        if (this.U != i7) {
            this.U = i7;
            if (i7 == 3) {
                requestAudioFocus = dt.f22079o0.requestAudioFocus(this, 0, 1);
            } else {
                AudioManager audioManager = dt.f22079o0;
                if (i7 == 2 && !iz.G0) {
                    i10 = 3;
                } else {
                    i10 = 1;
                }
                requestAudioFocus = audioManager.requestAudioFocus(this, 3, i10);
            }
            if (requestAudioFocus == 1) {
                this.X = 2;
            }
        }
    }

    public final void k(boolean z9) {
        if (!this.Z.isEmpty()) {
            this.f21251a0 = (lf) this.Z.get(0);
        } else {
            this.f21251a0 = null;
        }
        if (this.f21251a0 != null || z9) {
            if (VideoEncodingService.f21343e == null) {
                try {
                    t0.f25566b.startService(new Intent(t0.f25566b, VideoEncodingService.class));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else if (z9) {
                lf lfVar = B().f21251a0;
                VideoEncodingService videoEncodingService = VideoEncodingService.f21343e;
                if (videoEncodingService.f21345b != lfVar) {
                    if (lfVar != null) {
                        videoEncodingService.a(lfVar);
                    } else {
                        videoEncodingService.stopSelf();
                    }
                }
            }
        }
    }

    public final void k0(boolean z9) {
        org.telegram.ui.j4 j4Var = this.L0;
        if (j4Var != null) {
            if (z9) {
                PipRoundVideoView pipRoundVideoView = this.H0;
                if (pipRoundVideoView != null) {
                    this.I0 = 2;
                    pipRoundVideoView.a(true);
                    this.H0 = null;
                    return;
                }
                if (j4Var.getParent() == null) {
                    this.N0.addView(this.L0);
                }
                this.E0.A0(this.G0);
            } else if (j4Var.getParent() != null) {
                this.I0 = 1;
                this.N0.removeView(this.L0);
            } else {
                if (this.H0 == null) {
                    try {
                        PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                        this.H0 = pipRoundVideoView2;
                        pipRoundVideoView2.d(this.J0, new vd(this, 4));
                    } catch (Exception unused) {
                        this.H0 = null;
                    }
                }
                PipRoundVideoView pipRoundVideoView3 = this.H0;
                if (pipRoundVideoView3 != null) {
                    this.E0.A0(pipRoundVideoView3.f31433c);
                }
            }
        }
    }

    public final void l(int i7) {
        ArrayList arrayList;
        boolean z9;
        int i10;
        File M;
        z5 q10 = z5.q(i7);
        int e10 = t0.e();
        int i11 = 2;
        if (e10 == 1) {
            if (!q10.N.f26594g || !q10.p().d) {
                return;
            }
        } else if (e10 == 2) {
            if (!q10.O.f26594g || !q10.o().d) {
                return;
            }
        } else if (!q10.M.f26594g || !q10.n().d) {
            return;
        }
        if (iz.N0) {
            arrayList = this.T0;
        } else {
            arrayList = this.R0;
        }
        if (arrayList != null && arrayList.size() >= 2) {
            if (this.Q0 != null) {
                if (!iz.O0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else {
                z9 = iz.O0;
            }
            if (z9) {
                i10 = this.U0 + 1;
                if (i10 >= arrayList.size()) {
                    i10 = 0;
                }
            } else {
                i10 = this.U0 - 1;
                if (i10 < 0) {
                    i10 = arrayList.size() - 1;
                }
            }
            if (i10 >= 0 && i10 < arrayList.size()) {
                ij ijVar = (ij) arrayList.get(i10);
                File file = null;
                if (!TextUtils.isEmpty(ijVar.f23262k.attachPath)) {
                    File file2 = new File(ijVar.f23262k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file != null) {
                    M = file;
                } else {
                    w7.G(i7);
                    M = w7.M(ijVar.f23262k, false, true);
                }
                M.exists();
                if (M != file && !M.exists() && ijVar.I3()) {
                    w7 G = w7.G(i7);
                    TLRPC.Document F0 = ijVar.F0();
                    if (!ij.R5(ijVar.f23262k)) {
                        i11 = 0;
                    }
                    G.W(F0, ijVar, 0, i11);
                }
            }
        }
    }

    public final void l0(int i7) {
        boolean z9 = iz.N0;
        if (i7 == 2) {
            iz.N0 = true;
            iz.O0 = false;
        } else if (i7 == 1) {
            iz.O0 = true;
            iz.N0 = false;
        } else {
            iz.O0 = false;
            iz.N0 = false;
        }
        MediaController B = B();
        ij ijVar = B.f21295u0;
        if (ijVar != null && ijVar.I3()) {
            B.l(B.f21295u0.I1);
        }
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("shuffleMusic", iz.N0);
        edit.putBoolean("playOrderReversed", iz.O0);
        edit.apply();
        boolean z10 = iz.N0;
        if (z9 != z10) {
            if (z10) {
                g();
                return;
            }
            ij ijVar2 = this.f21295u0;
            if (ijVar2 != null) {
                int indexOf = this.R0.indexOf(ijVar2);
                this.U0 = indexOf;
                if (indexOf == -1) {
                    r();
                    q(true, true, false, false);
                }
            }
        }
    }

    public final void m() {
        int i7;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - f21248f2) >= 5000) {
                AudioManager audioManager = (AudioManager) t0.f25566b.getSystemService("audio");
                if (this.L) {
                    i7 = 0;
                } else {
                    i7 = 3;
                }
                int streamVolume = audioManager.getStreamVolume(i7);
                if (streamVolume == 0) {
                    audioManager.adjustStreamVolume(i7, streamVolume, 1);
                    f21248f2 = currentTimeMillis;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void m0(boolean z9, float f10) {
        String str;
        String str2;
        float f11;
        if (z9) {
            if (this.f21285q0 >= 6.0f && f10 == 1.0f && this.f21295u0 != null) {
                this.f21271i0.g0();
                ij ijVar = this.f21295u0;
                g0.i3(new ie(this, ijVar, ijVar.f23222b0, 0), 50L);
            }
            this.f21285q0 = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.f21291s0 = f10;
            }
        } else {
            this.f21283p0 = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.f21288r0 = f10;
            }
        }
        u51 u51Var = this.f21271i0;
        if (u51Var != null) {
            u51Var.v0(Math.round(f10 * 10.0f) / 10.0f);
        } else {
            u51 u51Var2 = this.E0;
            if (u51Var2 != null) {
                u51Var2.v0(Math.round(f10 * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor edit = qp.e1().edit();
        if (z9) {
            str = "musicPlaybackSpeed";
        } else {
            str = "playbackSpeed";
        }
        SharedPreferences.Editor putFloat = edit.putFloat(str, f10);
        if (z9) {
            str2 = "fastMusicPlaybackSpeed";
        } else {
            str2 = "fastPlaybackSpeed";
        }
        if (z9) {
            f11 = this.f21291s0;
        } else {
            f11 = this.f21288r0;
        }
        putFloat.putFloat(str2, f11).commit();
        qs.e().k(qs.J4, new Object[0]);
        if (!this.T1) {
            d1.f.z(f10);
        }
    }

    public final void n(boolean z9) {
        File file;
        File file2;
        boolean z10;
        File file3;
        e0.g gVar;
        e0.g gVar2;
        if (this.H1) {
            di.d1 d1Var = this.G1;
            if (d1Var != null) {
                g0.r(d1Var);
                this.G1 = null;
            }
            if (!z9 && (gVar2 = this.F1) != null) {
                z10 = gVar2.c();
            } else {
                z10 = false;
            }
            if (!z10 && (gVar = this.F1) != null) {
                gVar.f10052b = false;
                ((vi.h) gVar.f10054e).b();
            }
            if (z10 && (file3 = this.f21274j1) != null) {
                z0.b(file3);
            }
            x(!z9);
            return;
        }
        this.f21266f1 = null;
        z0.b(this.f21274j1);
        if (z9 && (file2 = this.f21274j1) != null) {
            try {
                file2.delete();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        this.f21274j1 = null;
        if (z9 && (file = this.f21272i1) != null) {
            file.delete();
        }
        this.f21272i1 = null;
        this.f21303x0 = false;
        this.f21287r = false;
        this.O = false;
    }

    public final void n0() {
        float f10;
        try {
            if (this.X != 1) {
                f10 = 1.0f;
            } else {
                f10 = 0.2f;
            }
            u51 u51Var = this.f21271i0;
            float f11 = 0.0f;
            if (u51Var != null) {
                if (!d1.f.u()) {
                    f11 = this.P1 * f10;
                }
                u51Var.B0(f11);
                return;
            }
            u51 u51Var2 = this.E0;
            if (u51Var2 != null) {
                if (d1.f.u()) {
                    f10 = 0.0f;
                }
                u51Var2.B0(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void o() {
        q(true, true, false, false);
        this.D0 = null;
        this.B0 = false;
        for (int i7 = 0; i7 < 4; i7++) {
            z5 q10 = z5.q(i7);
            q10.f26818b.clear();
            q10.f26819c.clear();
            q10.d.clear();
            q10.f26820e.clear();
            q10.f26821f.clear();
            q10.h.clear();
            q10.F.b();
        }
        this.f21254b0.clear();
        this.f21257c0.clear();
        this.U1 = null;
        this.f21262e0 = null;
        this.f21265f0 = null;
        r();
    }

    public final boolean o0(ArrayList arrayList, ij ijVar, long j3, boolean z9, h2.a0 a0Var, long j10) {
        HashMap hashMap;
        ij ijVar2 = this.f21295u0;
        ArrayList arrayList2 = this.R0;
        if (ijVar2 == ijVar) {
            int indexOf = arrayList2.indexOf(ijVar);
            if (indexOf >= 0) {
                this.U0 = indexOf;
            }
            return S(ijVar);
        }
        this.V0 = !z9;
        this.Y0 = j3;
        this.B0 = !arrayList2.isEmpty();
        r();
        this.C0 = a0Var;
        this.f21252a1 = j10;
        boolean z10 = false;
        if (!arrayList.isEmpty() && m5.C(ij.B0(((ij) arrayList.get(0)).f23262k))) {
            z10 = true;
        }
        int size = arrayList.size() - 1;
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        while (true) {
            hashMap = this.S0;
            if (size < 0) {
                break;
            }
            ij ijVar3 = (ij) arrayList.get(size);
            if (ijVar3.I3()) {
                int e12 = ijVar3.e1();
                if (e12 > 0 || z10) {
                    i7 = Math.min(i7, e12);
                    i10 = Math.max(i10, e12);
                }
                arrayList2.add(ijVar3);
                hashMap.put(Integer.valueOf(e12), ijVar3);
            }
            size--;
        }
        t0();
        int indexOf2 = arrayList2.indexOf(ijVar);
        this.U0 = indexOf2;
        if (indexOf2 == -1) {
            r();
            this.U0 = arrayList2.size();
            arrayList2.add(ijVar);
            hashMap.put(Integer.valueOf(ijVar.e1()), ijVar);
        }
        if (ijVar.I3() && !ijVar.f23281p1) {
            if (iz.N0) {
                g();
            }
            if (z9) {
                if (this.C0 == null) {
                    final ui b02 = ui.b0(ijVar.I1);
                    final long B0 = ij.B0(ijVar.f23262k);
                    final long j11 = this.f21252a1;
                    final long j12 = i7;
                    final long j13 = i10;
                    b02.getMessagesStorage().f26719a.c(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vh.run():void");
                        }
                    });
                } else {
                    this.Z0 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return S(ijVar);
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        g0.h3(new yd(this, i7, 1));
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public final void p(boolean z9, boolean z10) {
        q(z9, z10, false, false);
    }

    public final void p0(TextureView textureView, org.telegram.ui.j4 j4Var, FrameLayout frameLayout, boolean z9) {
        if (textureView != null) {
            boolean z10 = true;
            if (!z9 && this.G0 == textureView) {
                this.I0 = 1;
                this.G0 = null;
                this.L0 = null;
                this.N0 = null;
                return;
            }
            u51 u51Var = this.E0;
            if (u51Var != null && textureView != this.G0) {
                if (j4Var == null || !j4Var.d) {
                    z10 = false;
                }
                this.M0 = z10;
                this.G0 = textureView;
                PipRoundVideoView pipRoundVideoView = this.H0;
                if (pipRoundVideoView != null) {
                    u51Var.A0(pipRoundVideoView.f31433c);
                } else {
                    u51Var.A0(textureView);
                }
                this.L0 = j4Var;
                this.N0 = frameLayout;
                if (this.P0 && j4Var != null) {
                    j4Var.a(this.O0, 0);
                }
            }
        }
    }

    public final void q(boolean r21, boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.q(boolean, boolean, boolean, boolean):void");
    }

    public final void q0() {
        this.L = true;
        AudioManager audioManager = dt.f22079o0;
        audioManager.setBluetoothScoOn(false);
        audioManager.setSpeakerphoneOn(false);
    }

    public final void r() {
        this.Q0 = null;
        this.R0.clear();
        this.S0.clear();
        this.T0.clear();
        this.Z0 = 0;
        boolean[] zArr = this.W0;
        zArr[1] = false;
        zArr[0] = false;
        this.Y0 = 0L;
        this.f21252a1 = 0L;
        int[] iArr = this.f21255b1;
        iArr[1] = Integer.MAX_VALUE;
        iArr[0] = Integer.MAX_VALUE;
        this.X0 = false;
        this.C0 = null;
        this.U1 = null;
    }

    public final void r0(ArrayList arrayList, boolean z9) {
        ArrayList arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        this.f21262e0 = arrayList2;
        if (arrayList2 != null) {
            this.f21259d0 = z9;
            this.f21265f0 = new SparseArray();
            for (int i7 = 0; i7 < this.f21262e0.size(); i7++) {
                ij ijVar = (ij) this.f21262e0.get(i7);
                this.f21265f0.put(ijVar.e1(), ijVar);
            }
        }
    }

    public final void s(ac.e eVar) {
        byte[] bArr;
        TLRPC.TL_document tL_document;
        int i7;
        File file = (File) eVar.f1024b;
        this.f21274j1 = file;
        long j3 = eVar.f1023a;
        this.f21276k1 = j3;
        byte[] bArr2 = (byte[]) eVar.f1025c;
        String str = null;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr2.clone();
        }
        G0(file, j3, bArr);
        if (this.B1 == 3) {
            this.K1 = eVar;
            e0.g gVar = this.F1;
            if (gVar != null) {
                ((vi.h) gVar.f10054e).o();
                gVar.f10053c = true;
                this.F1 = null;
            }
            Y(false);
            j0(false);
            return;
        }
        ui.b0(this.f21270h1).B1(this.f21278m1, this.n1, null);
        if (this.B1 == 1) {
            TLRPC.TL_document tL_document2 = this.f21266f1;
            String absolutePath = file.getAbsolutePath();
            long j10 = this.f21278m1;
            ij ijVar = this.f21286q1;
            ij ijVar2 = this.f21289r1;
            boolean z9 = this.C1;
            int i10 = this.D1;
            if (this.E1) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = 0;
            }
            ez f10 = ez.f(tL_document2, null, absolutePath, j10, ijVar, ijVar2, null, null, null, null, z9, i10, 0, i7, null, null, false);
            f10.R = this.f21282o1;
            f10.T = this.f21284p1;
            f10.H = this.f21292s1;
            f10.K = this.f21294t1;
            f10.Q = 0L;
            gz.C(this.f21270h1).r0(f10);
        }
        qs f11 = qs.f(this.f21270h1);
        Integer valueOf = Integer.valueOf(this.f21268g1);
        int i11 = this.B1;
        if (i11 == 2) {
            tL_document = this.f21266f1;
        } else {
            tL_document = null;
        }
        if (i11 == 2) {
            str = file.getAbsolutePath();
        }
        f11.k(qs.f25073s2, valueOf, tL_document, str);
        x(true);
    }

    public final void t0() {
        Collections.sort(this.R0, new jg.x(17));
    }

    public final void u0(boolean z9) {
        boolean z10;
        ij ijVar = this.f21295u0;
        if (ijVar != null) {
            int i7 = 0;
            qs.f(ijVar.I1).k(qs.f25086u2, Boolean.valueOf(this.L));
            u51 u51Var = this.E0;
            if (u51Var != null) {
                if (!this.L) {
                    i7 = 3;
                }
                u51Var.x0(i7);
                if (!z9) {
                    if (this.E0.S() < 1000) {
                        this.E0.p0(0L);
                    }
                    this.E0.h0();
                    return;
                }
                R(this.f21295u0, true);
                return;
            }
            u51 u51Var2 = this.f21271i0;
            if (u51Var2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ij ijVar2 = this.f21295u0;
            float f10 = ijVar2.f23222b0;
            int i10 = ijVar2.f23249h0;
            if (!z9 && u51Var2 != null && u51Var2.d0() && i10 * f10 <= 1.0f) {
                ijVar2.f23222b0 = 0.0f;
            } else {
                ijVar2.f23222b0 = f10;
            }
            q(false, true, false, false);
            S(ijVar2);
            if (z9) {
                if (z10) {
                    g0.i3(new x4(21, this, ijVar2), 100L);
                } else {
                    R(ijVar2, true);
                }
            }
        }
    }

    public final void v0(ij ijVar) {
        synchronized (this.f21308z0) {
            Timer timer = this.f21306y0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f21306y0 = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            ijVar.S0();
            Timer timer2 = new Timer();
            this.f21306y0 = timer2;
            timer2.schedule(new jg.q1(1, this, ijVar), 0L, 17L);
        }
    }

    public final void w0(org.telegram.ui.cn cnVar) {
        if (cnVar != null) {
            if ((this.f21264f != null || this.f21279n != null) && this.f21261e != null) {
                if (!iz.k(false)) {
                    ij ijVar = this.f21295u0;
                    if (ijVar != null) {
                        if (!ij.R4(ijVar.f23262k) && !this.f21295u0.h4()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f21290s = cnVar;
                if (!this.P) {
                    float[] fArr = this.R;
                    fArr[2] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    float[] fArr2 = this.T;
                    fArr2[2] = 0.0f;
                    fArr2[1] = 0.0f;
                    fArr2[0] = 0.0f;
                    float[] fArr3 = this.S;
                    fArr3[2] = 0.0f;
                    fArr3[1] = 0.0f;
                    fArr3[0] = 0.0f;
                    this.H = 0L;
                    this.Q = 0.0f;
                    this.f21305y = 0;
                    this.D = 0;
                    this.F = 0;
                    this.E = 0;
                    Utilities.f21336e.c(new vd(this, 3));
                    this.P = true;
                }
            }
        }
    }

    public final void x(boolean z9) {
        File file;
        Y(false);
        j0(false);
        e0.g gVar = this.F1;
        if (gVar != null) {
            ((vi.h) gVar.f10054e).o();
            gVar.f10053c = true;
            this.F1 = null;
        }
        if (!z9 && (file = this.f21274j1) != null) {
            z0.b(file);
            this.f21274j1.delete();
        }
        Z();
        this.f21303x0 = false;
        this.f21287r = false;
        this.O = false;
    }

    public final void x0(int i7, long j3, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem, int i10, boolean z9, hw hwVar, long j10, nj njVar) {
        boolean z10;
        long j11;
        long b22;
        long j12;
        ij ijVar3 = this.f21295u0;
        if (ijVar3 != null && I(ijVar3) && !H()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21303x0 = z9;
        Y(true);
        try {
            this.K0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.H1 && !X()) {
            g0.h3(new g9(i7, i10, 2));
        } else if (s0(i7)) {
            this.H1 = true;
            this.I1 = false;
            this.J1 = false;
            this.f21270h1 = i7;
            this.f21268g1 = i10;
            this.f21278m1 = j3;
            this.f21282o1 = j10;
            this.f21284p1 = njVar;
            if (ijVar2 == null) {
                b22 = 0;
            } else {
                b22 = ij.b2(i7, ijVar2.f23262k, false, false);
            }
            this.n1 = b22;
            this.f21286q1 = ijVar;
            this.f21289r1 = ijVar2;
            this.f21292s1 = storyItem;
            this.f21294t1 = hwVar;
            this.f21272i1 = null;
            this.f21274j1 = null;
            this.f21276k1 = 0L;
            this.l1 = 0;
            this.f21298v1 = 0L;
            this.B1 = 0;
            di.d1 d1Var = new di.d1(i7, i10, 1, j3, this);
            this.G1 = d1Var;
            if (z10) {
                j12 = 500;
            } else {
                j12 = 50;
            }
            g0.i3(d1Var, j12);
        } else {
            if (r2.f25212a) {
                a8.b("AudioRecorder legacy selected: account=" + i7 + ", dialog=" + j3 + ", guid=" + i10);
            }
            wd wdVar = new wd(this, i7, i10, j3, j10, njVar, ijVar2, ijVar, storyItem, hwVar);
            this.L1 = wdVar;
            if (z10) {
                j11 = 500;
            } else {
                j11 = 50;
            }
            this.M1.d(wdVar, j11);
        }
    }

    public final void y0() {
        if (!this.f21254b0.isEmpty()) {
            lf lfVar = (lf) this.f21254b0.get(0);
            j20 j20Var = lfVar.f23888b;
            synchronized (this.f21253b) {
                if (j20Var != null) {
                    try {
                        j20Var.W = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            new Thread(new a(lfVar, 20)).start();
        }
    }

    public final g7.c z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.z():g7.c");
    }

    public final void z0() {
        synchronized (this.f21308z0) {
            Timer timer = this.f21306y0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f21306y0 = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
