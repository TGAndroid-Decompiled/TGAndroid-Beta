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
import org.telegram.ui.Components.i61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class MediaController implements AudioManager.OnAudioFocusChangeListener, gs, SensorEventListener {
    public static final String[] W1;
    public static final String[] X1;
    public static final ConcurrentHashMap Y1;
    public static Runnable Z1;
    public static ve f22681a2;
    public static ve f22682b2;
    public static ArrayList f22683c2;
    public static ArrayList d2;
    public static bi.i5 f22684e2;
    public static volatile MediaController f22685f2;
    public static long f22686g2;
    public static boolean f22687h2;
    public boolean B0;
    public boolean C0;
    public int C1;
    public h2.a0 D0;
    public boolean D1;
    public int E;
    public rf.a E0;
    public int E1;
    public int F;
    public i61 F0;
    public boolean F1;
    public int G;
    public boolean G0;
    public e0.g G1;
    public long H;
    public TextureView H0;
    public fi.z0 H1;
    public PipRoundVideoView I0;
    public boolean I1;
    public boolean J;
    public int J0;
    public boolean J1;
    public boolean K;
    public LaunchActivity K0;
    public boolean K1;
    public View L0;
    public ac.e L1;
    public boolean M;
    public org.telegram.ui.j4 M0;
    public vd M1;
    public boolean N;
    public boolean N0;
    public final q5 N1;
    public boolean O;
    public FrameLayout O0;
    public final q5 O1;
    public boolean P;
    public float P0;
    public boolean Q;
    public boolean Q0;
    public float Q1;
    public float R;
    public hp R0;
    public ValueAnimator R1;
    public androidx.emoji2.text.j T1;
    public boolean U1;
    public int V;
    public int V0;
    public hf V1;
    public boolean W;
    public boolean W0;
    public boolean X;
    public boolean Y0;
    public boolean Z;
    public long Z0;
    public int f22690a1;
    public kf f22692b0;
    public long f22693b1;
    public SensorManager f22694c;
    public PowerManager.WakeLock d;
    public Sensor f22699e;
    public boolean f22700e0;
    public boolean f22701e1;
    public Sensor f22702f;
    public ArrayList f22703f0;
    public AudioRecord f22704f1;
    public SparseArray f22705g0;
    public TLRPC.TL_document f22706g1;
    public Sensor h;
    public int f22710i1;
    public File f22712j1;
    public File f22714k1;
    public long l1;
    public boolean m0;
    public int f22716m1;
    public Sensor f22717n;
    public int f22718n0;
    public long n1;
    public String f22719o0;
    public long f22720o1;
    public long f22721p0;
    public long f22722p1;
    public lj f22724q1;
    public boolean f22725r;
    public gj f22727r1;
    public org.telegram.ui.bn f22728s;
    public gj f22730s1;
    public TL_stories.StoryItem f22732t1;
    public float f22733u0;
    public cw f22734u1;
    public gj f22735v0;
    public boolean f22737w;
    public gj f22738w0;
    public long f22739w1;
    public long f22740x;
    public df f22741x0;
    public int f22743y;
    public boolean f22744y0;
    public final ByteBuffer f22747z1;
    public final td f22688a = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public final void onAudioFocusChange(int i7) {
            MediaController mediaController = MediaController.this;
            if (i7 != 1) {
                mediaController.W = false;
                return;
            }
            String[] strArr = MediaController.W1;
            mediaController.getClass();
        }
    };
    public final Object f22691b = new Object();
    public long I = 0;
    public float L = -100.0f;
    public final float[] S = new float[3];
    public final float[] T = new float[3];
    public final float[] U = new float[3];
    public int Y = 0;
    public final ArrayList f22689a0 = new ArrayList();
    public final ArrayList f22695c0 = new ArrayList();
    public final HashMap f22697d0 = new HashMap();
    public boolean f22707h0 = false;
    public boolean f22709i0 = false;
    public i61 f22711j0 = null;
    public i61 f22713k0 = null;
    public int f22715l0 = 0;
    public float f22723q0 = 1.0f;
    public float f22726r0 = 1.0f;
    public float f22729s0 = 1.0f;
    public float f22731t0 = 1.0f;
    public Timer f22746z0 = null;
    public final Object A0 = new Object();
    public final ArrayList S0 = new ArrayList();
    public final HashMap T0 = new HashMap();
    public final ArrayList U0 = new ArrayList();
    public final boolean[] X0 = {false, false};
    public final int[] f22696c1 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public final re f22698d1 = new re(this);
    public int f22708h1 = -1;
    public short[] f22736v1 = new short[1024];
    public final Object f22742x1 = new Object();
    public final ArrayList f22745y1 = new ArrayList();
    public int A1 = 1280;
    public int B1 = 48000;
    public final j6.o P1 = new j6.o(this, 9);
    public final fi.d4 S1 = new fi.d4(this, 6);

    static {
        String str;
        String str2;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 <= 28) {
            str = "datetaken";
        } else {
            str = "date_modified";
        }
        W1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str, "orientation", "width", "height", "_size"};
        if (i7 <= 28) {
            str2 = "datetaken";
        } else {
            str2 = "date_modified";
        }
        X1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str2, "duration", "width", "height", "_size"};
        Y1 = new ConcurrentHashMap();
        f22683c2 = new ArrayList();
        d2 = new ArrayList();
    }

    public MediaController() {
        q5 q5Var = new q5("recordQueue");
        this.N1 = q5Var;
        q5Var.setPriority(10);
        q5 q5Var2 = new q5("fileEncodingQueue");
        this.O1 = q5Var2;
        q5Var2.setPriority(10);
        q5Var.c(new ud(this, 0));
        Utilities.f22774e.c(new ud(this, 1));
        this.f22747z1 = ByteBuffer.allocateDirect(1920);
        g0.g3(new ud(this, 2));
        ContentResolver contentResolver = t0.f26895b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.e2(null, 1));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.e2(null, 2));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.e2(null, 1));
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.e2(null, 2));
        } catch (Exception e13) {
            a8.g(e13, true);
        }
    }

    public static java.lang.String A(android.net.Uri r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.A(android.net.Uri):java.lang.String");
    }

    public static MediaController B() {
        MediaController mediaController;
        MediaController mediaController2 = f22685f2;
        if (mediaController2 == null) {
            synchronized (MediaController.class) {
                try {
                    mediaController = f22685f2;
                    if (mediaController == null) {
                        mediaController = new MediaController();
                        f22685f2 = mediaController;
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
                    inputStream = t0.f26895b.getContentResolver().openInputStream(uri);
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
        String j3 = p5.c.j(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = j3.getBytes("UTF-8");
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
            throw new IOException(i5.c.i(length, "XMP segment too large: "));
        }
    }

    public static boolean M(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = t0.f26895b.getContentResolver().openInputStream(uri);
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
        Thread thread = new Thread(new jg.x(i7, 2));
        thread.setPriority(1);
        thread.start();
    }

    public static int Q(int r5, int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.Q(int, int, int, int, int):int");
    }

    public static void a(MediaController mediaController, boolean z10) {
        mediaController.stopRecord();
        TLRPC.TL_document tL_document = mediaController.f22706g1;
        File N = mediaController.N(mediaController.f22712j1, mediaController.f22714k1, tL_document);
        if (tL_document != null && N != null) {
            g0.g3(new aa.c0(mediaController, N, z10, tL_document, 13));
        }
    }

    public static void b(final MediaController mediaController, final int i7, final int i10, long j3, long j10, lj ljVar, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem, cw cwVar) {
        String absolutePath;
        if (mediaController.f22704f1 != null) {
            g0.g3(new Runnable(mediaController) {
                public final MediaController f22869b;

                {
                    this.f22869b = mediaController;
                }

                @Override
                public final void run() {
                    int i11 = r4;
                    int i12 = i10;
                    int i13 = i7;
                    MediaController mediaController2 = this.f22869b;
                    switch (i11) {
                        case 0:
                            mediaController2.M1 = null;
                            ls.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 1:
                            mediaController2.M1 = null;
                            ls.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 2:
                            mediaController2.M1 = null;
                            ls.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        default:
                            mediaController2.M1 = null;
                            ls.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                            return;
                    }
                }
            });
            return;
        }
        j0(true);
        mediaController.C1 = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        mediaController.f22706g1 = tL_document;
        mediaController.f22708h1 = i10;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = Integer.MIN_VALUE;
        tL_document.f28404id = cz.p();
        mediaController.f22706g1.user_id = k10.i(i7).e();
        TLRPC.TL_document tL_document2 = mediaController.f22706g1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        cz.y();
        File z10 = w7.z(1);
        mediaController.f22714k1 = new File(z10, System.currentTimeMillis() + "_" + w7.r(null, mediaController.f22706g1));
        w7.z(4).mkdirs();
        if (s2.f26694a) {
            a8.b("start recording internal " + mediaController.f22714k1.getPath() + " " + mediaController.f22714k1.exists());
        }
        File file = mediaController.f22714k1;
        Set set = z0.f28239a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            z0.f28239a.add(absolutePath);
        }
        try {
            if (mediaController.startRecord(mediaController.f22714k1.getPath(), mediaController.B1) == 0) {
                g0.g3(new Runnable(mediaController) {
                    public final MediaController f22869b;

                    {
                        this.f22869b = mediaController;
                    }

                    @Override
                    public final void run() {
                        int i11 = r4;
                        int i12 = i10;
                        int i13 = i7;
                        MediaController mediaController2 = this.f22869b;
                        switch (i11) {
                            case 0:
                                mediaController2.M1 = null;
                                ls.f(i13).k(156, Integer.valueOf(i12));
                                return;
                            case 1:
                                mediaController2.M1 = null;
                                ls.f(i13).k(156, Integer.valueOf(i12));
                                return;
                            case 2:
                                mediaController2.M1 = null;
                                ls.f(i13).k(156, Integer.valueOf(i12));
                                return;
                            default:
                                mediaController2.M1 = null;
                                ls.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                                return;
                        }
                    }
                });
                if (s2.f26694a) {
                    a8.b("cant init encoder");
                    return;
                }
                return;
            }
            mediaController.f22701e1 = false;
            mediaController.f22704f1 = new AudioRecord(0, mediaController.B1, 16, 2, mediaController.A1);
            System.currentTimeMillis();
            long j11 = 0;
            mediaController.l1 = 0L;
            mediaController.f22716m1 = 0;
            mediaController.f22739w1 = 0L;
            mediaController.n1 = j3;
            mediaController.f22722p1 = j10;
            mediaController.f22724q1 = ljVar;
            if (gjVar != null) {
                j11 = gj.b2(mediaController.f22710i1, gjVar.f24177k, false, false);
            }
            mediaController.f22720o1 = j11;
            mediaController.f22710i1 = i7;
            mediaController.f22727r1 = gjVar2;
            mediaController.f22730s1 = gjVar;
            mediaController.f22732t1 = storyItem;
            mediaController.f22734u1 = cwVar;
            mediaController.f22747z1.rewind();
            mediaController.f22704f1.startRecording();
            mediaController.N1.c(mediaController.P1);
            g0.g3(new Runnable(mediaController) {
                public final MediaController f22869b;

                {
                    this.f22869b = mediaController;
                }

                @Override
                public final void run() {
                    int i11 = r4;
                    int i12 = i10;
                    int i13 = i7;
                    MediaController mediaController2 = this.f22869b;
                    switch (i11) {
                        case 0:
                            mediaController2.M1 = null;
                            ls.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 1:
                            mediaController2.M1 = null;
                            ls.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 2:
                            mediaController2.M1 = null;
                            ls.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        default:
                            mediaController2.M1 = null;
                            ls.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            a8.g(e10, true);
            mediaController.f22706g1 = null;
            mediaController.stopRecord();
            z0.b(mediaController.f22714k1);
            mediaController.f22714k1.delete();
            mediaController.f22714k1 = null;
            File file2 = mediaController.f22712j1;
            if (file2 != null) {
                file2.delete();
                mediaController.f22712j1 = null;
            }
            try {
                mediaController.f22704f1.release();
                mediaController.f22704f1 = null;
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            j0(false);
            g0.g3(new Runnable(mediaController) {
                public final MediaController f22869b;

                {
                    this.f22869b = mediaController;
                }

                @Override
                public final void run() {
                    int i11 = r4;
                    int i12 = i10;
                    int i13 = i7;
                    MediaController mediaController2 = this.f22869b;
                    switch (i11) {
                        case 0:
                            mediaController2.M1 = null;
                            ls.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 1:
                            mediaController2.M1 = null;
                            ls.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 2:
                            mediaController2.M1 = null;
                            ls.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        default:
                            mediaController2.M1 = null;
                            ls.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                            return;
                    }
                }
            });
        }
    }

    public static void c(final MediaController mediaController, File file, File file2, final TLRPC.TL_document tL_document, final int i7, final boolean z10, final int i10, final boolean z11) {
        mediaController.stopRecord();
        final File N = mediaController.N(file, file2, tL_document);
        if (N == null) {
            if (s2.f26694a) {
                a8.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (s2.f26694a) {
            a8.b("stop recording internal in queue " + N.exists() + " " + N.length());
        }
        g0.g3(new Runnable() {
            @Override
            public final void run() {
                boolean z12;
                char c10;
                int i11;
                int i12;
                String[] strArr = MediaController.W1;
                boolean z13 = s2.f26694a;
                MediaController mediaController2 = MediaController.this;
                File file3 = N;
                if (z13) {
                    StringBuilder sb2 = new StringBuilder("stop recording internal ");
                    sb2.append(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.f22716m1);
                    a8.b(sb2.toString());
                }
                if (!file3.exists()) {
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.f22716m1), true);
                }
                si.d0(mediaController2.f22710i1).F1(mediaController2.n1, mediaController2.f22720o1, null);
                int currentTime = ConnectionsManager.getInstance(mediaController2.f22710i1).getCurrentTime();
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
                long j3 = mediaController2.l1;
                tL_documentAttributeAudio.duration = j3 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                if (j3 > 700) {
                    int i13 = i7;
                    if (i13 == 1) {
                        String absolutePath = file3.getAbsolutePath();
                        long j10 = mediaController2.n1;
                        gj gjVar = mediaController2.f22727r1;
                        gj gjVar2 = mediaController2.f22730s1;
                        if (z11) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        c10 = 1;
                        i11 = 2;
                        yy f10 = yy.f(tL_document2, null, absolutePath, j10, gjVar, gjVar2, null, null, null, null, z10, i10, 0, i12, null, null, false);
                        f10.R = mediaController2.f22722p1;
                        f10.T = mediaController2.f22724q1;
                        f10.H = mediaController2.f22732t1;
                        f10.K = mediaController2.f22734u1;
                        f10.Q = 0L;
                        az.C(mediaController2.f22710i1).r0(f10);
                    } else {
                        c10 = 1;
                        i11 = 2;
                    }
                    ls f11 = ls.f(mediaController2.f22710i1);
                    Integer valueOf = Integer.valueOf(mediaController2.f22708h1);
                    String str = null;
                    if (i13 != i11) {
                        tL_document2 = null;
                    }
                    if (i13 == i11) {
                        str = file3.getAbsolutePath();
                    }
                    Object[] objArr = new Object[3];
                    z12 = false;
                    objArr[0] = valueOf;
                    objArr[c10] = tL_document2;
                    objArr[i11] = str;
                    f11.k(ls.f25345s2, objArr);
                } else {
                    z12 = false;
                    ls.f(mediaController2.f22710i1).k(ls.f25351t2, Integer.valueOf(mediaController2.f22708h1), Boolean.FALSE, Integer.valueOf((int) j3));
                    z0.b(file3);
                    file3.delete();
                }
                mediaController2.Y(z12);
            }
        });
    }

    public static native boolean cropOpusFile(String str, String str2, long j3, long j10);

    public static void d(MediaController mediaController) {
        mediaController.f22712j1 = mediaController.f22714k1;
        File z10 = w7.z(1);
        oe oeVar = new oe(1, z10, System.currentTimeMillis() + "_" + w7.r(null, mediaController.f22706g1));
        mediaController.f22714k1 = oeVar;
        if (mediaController.startRecord(oeVar.getPath(), mediaController.B1) == 0) {
            g0.g3(new ud(mediaController, 7));
            if (s2.f26694a) {
                a8.b("cant resume audio encoder");
                return;
            }
            return;
        }
        g0.g3(new ud(mediaController, 8));
    }

    public static void d0(java.lang.String r12, android.content.Context r13, int r14, java.lang.String r15, java.lang.String r16, org.telegram.messenger.y10 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.d0(java.lang.String, android.content.Context, int, java.lang.String, java.lang.String, org.telegram.messenger.y10):void");
    }

    public static void e0(String str, String str2, Context context, y10 y10Var) {
        org.telegram.ui.ActionBar.t1 t1Var;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && context != null) {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists() && file2.exists()) {
                if (!g0.I1(Uri.fromFile(file), 0) && !g0.I1(Uri.fromFile(file2), 0)) {
                    boolean[] zArr = {false};
                    boolean[] zArr2 = new boolean[1];
                    try {
                        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(2, context, null);
                        t1Var2.n(hd.N0(2131748586, null));
                        t1Var2.setCanceledOnTouchOutside(false);
                        t1Var2.setCancelable(true);
                        t1Var2.setOnCancelListener(new be(zArr, 1));
                        g0.h3(new ce(zArr2, t1Var2, 1), 250L);
                        t1Var = t1Var2;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        t1Var = null;
                    }
                    new Thread(new uj(file, file2, zArr, y10Var, t1Var, zArr2)).start();
                    return;
                }
                return;
            }
            d0(str, context, 0, null, null, y10Var);
        }
    }

    public static void f(MediaController mediaController, gj gjVar, int[] iArr, boolean z10, boolean z11, int i7) {
        gj gjVar2;
        re reVar = mediaController.f22698d1;
        if (mediaController.F0 != null) {
            if (i7 != 4 && i7 != 1) {
                try {
                    mediaController.K0.getWindow().addFlags(128);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else {
                try {
                    mediaController.K0.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (i7 == 3) {
                mediaController.G0 = true;
                gj gjVar3 = mediaController.f22735v0;
                if (gjVar3 != null && (gj.L4(gjVar3.f24177k) || mediaController.f22735v0.h4())) {
                    g0.r(reVar);
                    w7.G(gjVar.K1).Z(mediaController.f22735v0.F0(), true, false);
                }
                mediaController.Q0 = true;
            } else if (i7 == 2) {
                if (z11 && (gjVar2 = mediaController.f22735v0) != null) {
                    if (gj.L4(gjVar2.f24177k) || mediaController.f22735v0.h4()) {
                        if (mediaController.G0) {
                            reVar.run();
                        } else {
                            g0.h3(reVar, 1000L);
                        }
                    }
                }
            } else if (mediaController.F0.d0() && i7 == 4) {
                gj gjVar4 = mediaController.f22735v0;
                if (gjVar4 != null && gj.L4(gjVar4.f24177k) && !z10 && (iArr == null || iArr[0] < 4)) {
                    mediaController.F0.p0(0L);
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
            Uri insert = t0.f26895b.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                g0.D(fileInputStream, t0.f26895b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static void g0(Context context, c cVar, ArrayList arrayList, or orVar) {
        fi.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        ?? obj = new Object();
        obj.d = new HashMap();
        obj.f23042a = cVar;
        obj.f23044c = arrayList;
        obj.f23049s = orVar;
        obj.f23050w = ((gj) arrayList.get(0)).I3();
        int i7 = cVar.f23166a;
        ls.f(i7).b(obj, ls.Y1);
        ls.f(i7).b(obj, ls.X1);
        ls.f(i7).b(obj, ls.Z1);
        if (PhotoViewer.p1().P1()) {
            bVar = new fi.b();
        } else {
            bVar = null;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(2, context, bVar);
        obj.f23043b = t1Var;
        t1Var.n(hd.N0(2131748586, null));
        t1Var.setCancelable(true);
        t1Var.I = true;
        t1Var.setOnCancelListener(new be(obj, 3));
        g0.h3(new af(obj, 1), 250L);
        new Thread(new af(obj, 2)).start();
    }

    public static native byte[] getWaveform(String str);

    public static native int isOpusFile(String str);

    public static void j0(boolean z10) {
        AudioManager audioManager = (AudioManager) t0.f26895b.getSystemService("audio");
        if (cz.f23410u0 && !c8.oa.d("android.permission.BLUETOOTH_CONNECT")) {
            cz.f23410u0 = false;
            cz.y();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && cz.f23410u0) || !z10) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                try {
                    if (defaultAdapter.getProfileConnectionState(1) != 2) {
                    }
                    if (!z10 && !audioManager.isBluetoothScoOn()) {
                        audioManager.startBluetoothSco();
                        return;
                    } else if (z10 && audioManager.isBluetoothScoOn()) {
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
            if (z10) {
                return;
            }
            if (!z10) {
            }
            if (z10) {
            }
        }
    }

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    public static boolean s0(int i7) {
        aj.a aVar = aj.e.f1620b;
        aVar.a();
        if (aVar.f1612c) {
            aVar.a();
            return aVar.d;
        } else if (!((h0) np.u1(i7).A7.f26196l0.f13993b).f24305c) {
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

    public static int w(MediaExtractor mediaExtractor, boolean z10) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i7 = 0; i7 < trackCount; i7++) {
            String string = mediaExtractor.getTrackFormat(i7).getString("mime");
            if (z10) {
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
            for (AudioDeviceInfo audioDeviceInfo : ys.f28136p0.getDevices(2)) {
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

    public final void A0(org.telegram.ui.bn bnVar, boolean z10, boolean z11) {
        int i7;
        if (this.P) {
            this.P = false;
            return;
        }
        if (z11) {
            if (this.f22706g1 != null && !K()) {
                D0(false);
            } else {
                if (z10) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                B0(i7, 0, false, false);
            }
        }
        if (this.Q && !this.P) {
            if ((this.f22702f != null || this.f22717n != null) && this.f22699e != null && this.f22728s == bnVar) {
                this.f22728s = null;
                this.Q = false;
                this.f22737w = false;
                this.J = false;
                this.f22725r = false;
                this.M = false;
                Utilities.f22774e.c(new ud(this, 5));
                PowerManager.WakeLock wakeLock = this.d;
                if (wakeLock != null && wakeLock.isHeld()) {
                    this.d.release();
                }
            }
        }
    }

    public final void B0(final int i7, final int i10, final boolean z10, final boolean z11) {
        e0.g gVar;
        if (this.I1) {
            ac.e eVar = this.L1;
            if (eVar != null) {
                this.L1 = null;
                if (i7 == 0) {
                    x(false);
                    return;
                }
                this.C1 = i7;
                this.D1 = z10;
                this.E1 = i10;
                this.F1 = z11;
                s(eVar);
                return;
            } else if (this.J1) {
                if (this.C1 == 3) {
                    this.C1 = i7;
                    this.D1 = z10;
                    this.E1 = i10;
                    this.F1 = z11;
                    if (i7 == 0) {
                        e0.g gVar2 = this.G1;
                        if (gVar2 != null) {
                            gVar2.f10198b = false;
                            ((yi.j) gVar2.f10200e).b();
                        }
                        x(false);
                        return;
                    }
                    return;
                }
                return;
            } else if (i7 == 2 && (gVar = this.G1) != null && gVar.e()) {
                this.f22744y0 = false;
                this.f22725r = false;
                this.P = false;
                return;
            } else {
                fi.z0 z0Var = this.H1;
                if (z0Var != null) {
                    g0.r(z0Var);
                    this.H1 = null;
                }
                this.J1 = true;
                this.C1 = i7;
                this.D1 = z10;
                this.E1 = i10;
                this.F1 = z11;
                e0.g gVar3 = this.G1;
                if (gVar3 == null) {
                    x(false);
                } else {
                    yi.j jVar = (yi.j) gVar3.f10200e;
                    if (i7 == 0) {
                        gVar3.f10198b = false;
                        jVar.b();
                        x(false);
                    } else {
                        gVar3.f10198b = true;
                        jVar.getClass();
                        yi.j.q();
                        int i11 = jVar.e().f2931a;
                        if (gVar3.f10198b && (i11 == 3 || i11 == 5)) {
                            gVar3.f10198b = false;
                            jVar.h();
                        }
                    }
                }
                try {
                    this.L0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                final int i12 = this.f22710i1;
                final int i13 = this.f22708h1;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        String[] strArr = MediaController.W1;
                        ls f10 = ls.f(i12);
                        Integer valueOf = Integer.valueOf(i13);
                        if (i7 == 2) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        f10.k(ls.f25314n2, valueOf, Integer.valueOf(i14));
                    }
                });
                return;
            }
        }
        vd vdVar = this.M1;
        q5 q5Var = this.N1;
        if (vdVar != null) {
            q5Var.a(vdVar);
            this.M1 = null;
        }
        q5Var.c(new Runnable() {
            @Override
            public final void run() {
                MediaController mediaController = MediaController.this;
                int i14 = mediaController.C1;
                int i15 = i7;
                boolean z12 = z10;
                int i16 = i10;
                boolean z13 = z11;
                if (i14 == 3) {
                    mediaController.C1 = 0;
                    mediaController.C0(i15, i16, z12, z13);
                    return;
                }
                AudioRecord audioRecord = mediaController.f22704f1;
                if (audioRecord == null) {
                    mediaController.f22706g1 = null;
                    mediaController.f22744y0 = false;
                    mediaController.f22725r = false;
                    mediaController.P = false;
                    return;
                }
                try {
                    mediaController.C1 = i15;
                    mediaController.D1 = z12;
                    mediaController.E1 = i16;
                    mediaController.F1 = z13;
                    audioRecord.stop();
                    MediaController.j0(false);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    if (mediaController.f22714k1 != null) {
                        if (s2.f26694a) {
                            a8.d("delete voice file");
                        }
                        mediaController.f22714k1.delete();
                    }
                }
                if (i15 == 0) {
                    mediaController.C0(0, 0, false, false);
                }
                try {
                    mediaController.L0.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                g0.g3(new xd(mediaController, i15, 0));
            }
        });
    }

    public final float C(boolean z10) {
        if (z10) {
            return this.f22726r0;
        }
        return this.f22723q0;
    }

    public final void C0(int i7, int i10, boolean z10, boolean z11) {
        MediaController mediaController;
        File file;
        if (i7 != 0 && (file = this.f22714k1) != null) {
            TLRPC.TL_document tL_document = this.f22706g1;
            File file2 = this.f22712j1;
            if (s2.f26694a) {
                a8.b("stop recording internal filename " + this.f22714k1.getPath());
            }
            mediaController = this;
            mediaController.O1.c(new hi.v8(mediaController, file2, file, tL_document, i7, z10, i10, z11));
        } else {
            mediaController = this;
            z0.b(mediaController.f22714k1);
            File file3 = mediaController.f22714k1;
            if (file3 != null) {
                file3.delete();
            }
            Y(false);
        }
        try {
            AudioRecord audioRecord = mediaController.f22704f1;
            if (audioRecord != null) {
                audioRecord.release();
                mediaController.f22704f1 = null;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        mediaController.f22706g1 = null;
        mediaController.f22712j1 = null;
        mediaController.f22714k1 = null;
        mediaController.f22744y0 = false;
        mediaController.f22725r = false;
        mediaController.P = false;
    }

    public final long D(gj gjVar) {
        gj gjVar2 = this.f22735v0;
        if ((this.f22711j0 != null || this.F0 != null) && gjVar != null && gjVar2 != null && L(gjVar)) {
            try {
                i61 i61Var = this.f22711j0;
                if (i61Var != null) {
                    return i61Var.S();
                }
                i61 i61Var2 = this.F0;
                if (i61Var2 != null) {
                    return i61Var2.S();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void D0(boolean z10) {
        boolean z11;
        if (this.I1) {
            this.K1 = z10;
            e0.g gVar = this.G1;
            if (gVar != null) {
                if (gVar.e()) {
                    Y(true);
                    j0(true);
                }
                e0.g gVar2 = this.G1;
                yi.j jVar = (yi.j) gVar2.f10200e;
                jVar.getClass();
                yi.j.q();
                int i7 = jVar.e().f2931a;
                if (i7 == 3) {
                    ((yi.j) gVar2.f10200e).n();
                    return;
                } else if (i7 == 5) {
                    yi.j jVar2 = (yi.j) gVar2.f10200e;
                    jVar2.getClass();
                    yi.j.q();
                    if (jVar2.G == 5) {
                        jVar2.h.b("resume requested: trim=" + jVar2.f61342r + ".." + jVar2.f61343s + ", sourceDurationMs=" + jVar2.j());
                        jVar2.p();
                        jVar2.s(6);
                        yi.h hVar = jVar2.f61349z;
                        if (hVar == null) {
                            jVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j3 = jVar2.f61342r;
                        long j10 = jVar2.f61343s;
                        if (j10 >= yi.j.r(jVar2.f61340p)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        jVar2.k(1);
                        long j11 = ((j10 - j3) * 48000) / 1000;
                        jVar2.f61340p = j11;
                        jVar2.f61342r = 0L;
                        jVar2.f61343s = yi.j.r(j11);
                        jVar2.d();
                        jVar2.h.b("resume prefix selected: source=" + hVar.f61324b.getName() + ", trim=" + j3 + ".." + j10);
                        File file = hVar.f61324b;
                        if (z11) {
                            j10 = -1;
                        }
                        jVar2.u(j3, j10, file);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        this.N1.c(new wd(this, z10, 0));
    }

    public final boolean E0(int i7, ArrayList arrayList) {
        boolean z10;
        int size;
        gj gjVar;
        int i10;
        gj gjVar2;
        int i11 = this.V0;
        int i12 = 0;
        if (ConnectionsManager.getInstance(k10.f24932t0).getConnectionState() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V0 += i7;
        if (z10) {
            while (this.V0 < arrayList.size() && (i10 = this.V0) >= 0 && ((gjVar2 = (gj) arrayList.get(i10)) == null || !gjVar2.f24236z0)) {
                this.V0 += i7;
            }
        }
        if (this.V0 < arrayList.size() && this.V0 >= 0) {
            return false;
        }
        if (this.V0 >= arrayList.size()) {
            size = 0;
        } else {
            size = arrayList.size() - 1;
        }
        this.V0 = size;
        if (z10) {
            while (true) {
                int i13 = this.V0;
                if (i13 < 0 || i13 >= arrayList.size()) {
                    break;
                }
                int i14 = this.V0;
                if (i7 > 0) {
                    if (i14 > i11) {
                        break;
                    }
                    gjVar = (gj) arrayList.get(this.V0);
                    if (gjVar == null && gjVar.f24236z0) {
                        break;
                    }
                    this.V0 += i7;
                } else {
                    if (i14 < i11) {
                        break;
                    }
                    gjVar = (gj) arrayList.get(this.V0);
                    if (gjVar == null) {
                    }
                    this.V0 += i7;
                }
            }
            if (this.V0 >= arrayList.size() || this.V0 < 0) {
                if (this.V0 < arrayList.size()) {
                    i12 = arrayList.size() - 1;
                }
                this.V0 = i12;
            }
        }
        return true;
    }

    public final boolean F() {
        ArrayList arrayList;
        gj gjVar = this.f22735v0;
        if (gjVar == null || ((!gj.R4(gjVar.f24177k) && !this.f22735v0.h4()) || (arrayList = this.f22703f0) == null || arrayList.size() <= 1 || !this.f22703f0.contains(this.f22735v0) || this.f22703f0.indexOf(this.f22735v0) >= this.f22703f0.size() - 1)) {
            return true;
        }
        return false;
    }

    public final void F0() {
        gj gjVar = this.f22735v0;
        if (gjVar != null && H() && this.f22709i0 && (gj.R4(gjVar.f24177k) || gjVar.I3())) {
            S(gjVar);
        }
        this.f22709i0 = false;
    }

    public final void G0(File file, long j3, byte[] bArr) {
        TLRPC.TL_document tL_document = this.f22706g1;
        if (tL_document == null) {
            return;
        }
        tL_document.date = ConnectionsManager.getInstance(this.f22710i1).getCurrentTime();
        this.f22706g1.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        tL_documentAttributeAudio.waveform = bArr;
        if (bArr != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = j3 / 1000.0d;
        this.f22706g1.attributes.clear();
        this.f22706g1.attributes.add(tL_documentAttributeAudio);
    }

    public final boolean H() {
        if (!this.f22707h0 && !this.B0) {
            return false;
        }
        return true;
    }

    public final boolean I(gj gjVar) {
        gj gjVar2;
        boolean z10;
        if (gjVar == null || !gjVar.f24176j2) {
            if ((this.f22711j0 != null || this.F0 != null) && gjVar != null && (gjVar2 = this.f22735v0) != null) {
                long j3 = gjVar2.T;
                if (j3 != 0 && j3 == gjVar.T) {
                    z10 = this.B0;
                } else if (L(gjVar)) {
                    z10 = this.B0;
                } else {
                    return false;
                }
                return !z10;
            }
            return false;
        }
        return false;
    }

    public final boolean J() {
        if (this.M1 == null && this.H1 == null && this.f22706g1 == null) {
            return false;
        }
        return true;
    }

    public final boolean K() {
        if (this.I1) {
            e0.g gVar = this.G1;
            if (gVar != null && gVar.e()) {
                return true;
            }
            return false;
        }
        return this.f22701e1;
    }

    public final boolean L(gj gjVar) {
        boolean z10;
        boolean z11;
        gj gjVar2 = this.f22735v0;
        if (gjVar2 != null && gj.B0(gjVar2.f24177k) == gj.B0(gjVar.f24177k) && this.f22735v0.e1() == gjVar.e1()) {
            if (this.f22735v0.T == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (gjVar.T == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                return true;
            }
        }
        return false;
    }

    public final File N(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            File z10 = w7.z(1);
            File file3 = new File(z10, System.currentTimeMillis() + "_" + w7.r(null, tL_document));
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), file3.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.f22714k1) {
                    this.f22714k1 = file3;
                }
                file2 = file3;
            }
            file.delete();
            if (file == this.f22712j1) {
                this.f22712j1 = null;
            }
        }
        return file2;
    }

    public final void P() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.P():void");
    }

    public final boolean R(gj gjVar, boolean z10) {
        if ((this.f22711j0 != null || this.F0 != null) && gjVar != null && this.f22735v0 != null && L(gjVar)) {
            z0();
            try {
                if (this.f22711j0 != null) {
                    if (z10 && !d1.f.u() && !gj.R4(this.f22735v0.f24177k) && this.f22735v0.L0() * (1.0f - this.f22735v0.f24137b0) > 1.0d && LaunchActivity.G1) {
                        ValueAnimator valueAnimator = this.R1;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            this.R1.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        this.R1 = ofFloat;
                        ofFloat.addUpdateListener(this.S1);
                        this.R1.setDuration(300L);
                        this.R1.addListener(new ki.m3(this, 6));
                        this.R1.start();
                    } else {
                        this.f22711j0.g0();
                    }
                } else {
                    i61 i61Var = this.F0;
                    if (i61Var != null) {
                        i61Var.g0();
                    }
                }
                this.f22707h0 = true;
                ls.f(this.f22735v0.K1).k(ls.f25276g2, Integer.valueOf(this.f22735v0.e1()));
                try {
                    d1.f.b(1);
                    if (!this.U1) {
                        if (wf.b.J().M()) {
                            wf.b.J().Q(z());
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
                this.f22707h0 = false;
            }
        }
        return false;
    }

    public final boolean S(final org.telegram.messenger.gj r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.S(org.telegram.messenger.gj):boolean");
    }

    public final void T(int i7) {
        int i10 = this.V0;
        if (i10 >= 0) {
            ArrayList arrayList = this.S0;
            if (i10 < arrayList.size()) {
                this.V0 = i7;
                this.C0 = true;
                gj gjVar = (gj) arrayList.get(i7);
                if (this.f22735v0 != null && !L(gjVar)) {
                    this.f22735v0.G5();
                }
                S(gjVar);
            }
        }
    }

    public final void U(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        int i7;
        int i10;
        if (cz.N0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (z10 && (((i10 = cz.S0) == 2 || (i10 == 1 && arrayList.size() == 1)) && !this.W0)) {
            q(false, false, false, false);
            int i11 = this.V0;
            if (i11 >= 0 && i11 < arrayList.size()) {
                gj gjVar = (gj) arrayList.get(this.V0);
                gjVar.f24137b0 = 0.0f;
                gjVar.f24169i0 = 0;
                S(gjVar);
                return;
            }
            return;
        }
        if (this.R0 != null) {
            if (!cz.O0) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = cz.O0;
        }
        if (z11) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        if (E0(i7, arrayList) && z10 && cz.S0 == 0 && !this.W0) {
            i61 i61Var = this.f22711j0;
            if (i61Var != null || this.F0 != null) {
                if (i61Var != null) {
                    df dfVar = this.f22741x0;
                    if (dfVar != null) {
                        dfVar.b();
                        this.f22741x0 = null;
                    }
                    try {
                        this.f22711j0.m0();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    this.f22711j0 = null;
                    org.telegram.ui.ActionBar.m6.N1(this.f22735v0);
                } else {
                    this.M0 = null;
                    this.O0 = null;
                    this.Q0 = false;
                    this.H0 = null;
                    this.F0.m0();
                    this.F0 = null;
                    try {
                        this.K0.getWindow().clearFlags(128);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    g0.r(this.f22698d1);
                    w7.G(this.f22735v0.K1).Z(this.f22735v0.F0(), true, false);
                }
                z0();
                this.f22707h0 = true;
                gj gjVar2 = this.f22735v0;
                gjVar2.f24137b0 = 0.0f;
                gjVar2.f24169i0 = 0;
                ls.f(gjVar2.K1).k(ls.f25264e2, Integer.valueOf(this.f22735v0.e1()), 0);
                ls.f(this.f22735v0.K1).k(ls.f25276g2, Integer.valueOf(this.f22735v0.e1()));
                return;
            }
            return;
        }
        int i12 = this.V0;
        if (i12 >= 0 && i12 < arrayList.size()) {
            gj gjVar3 = this.f22735v0;
            if (gjVar3 != null) {
                gjVar3.G5();
            }
            this.C0 = true;
            S((gj) arrayList.get(this.V0));
        }
    }

    public final void V() {
        ArrayList arrayList;
        int i7;
        boolean z10;
        int i10;
        if (cz.N0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (!arrayList.isEmpty() && (i7 = this.V0) >= 0 && i7 < arrayList.size()) {
            gj gjVar = (gj) arrayList.get(this.V0);
            if (gjVar.f24169i0 > 10) {
                i0(gjVar, 0.0f);
                return;
            }
            if (this.R0 != null) {
                if (!cz.O0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = cz.O0;
            }
            if (z10) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            E0(i10, arrayList);
            if (this.V0 < arrayList.size()) {
                this.C0 = true;
                S((gj) arrayList.get(this.V0));
            }
        }
    }

    public final void W(boolean z10) {
        cw cwVar;
        long j3;
        if (this.f22706g1 != null) {
            D0(false);
        } else if (z10) {
            int currentAccount = this.f22728s.getCurrentAccount();
            long a10 = this.f22728s.a();
            org.telegram.ui.bn bnVar = this.f22728s;
            gj gjVar = bnVar.f46067m4;
            int classGuid = bnVar.getClassGuid();
            org.telegram.ui.bn bnVar2 = this.f22728s;
            lj ljVar = null;
            if (bnVar2 != null) {
                cwVar = bnVar2.Y8();
            } else {
                cwVar = null;
            }
            org.telegram.ui.bn bnVar3 = this.f22728s;
            if (bnVar3 != null) {
                j3 = bnVar3.j9();
            } else {
                j3 = 0;
            }
            org.telegram.ui.bn bnVar4 = this.f22728s;
            if (bnVar4 != null) {
                ljVar = bnVar4.f46221y5;
            }
            x0(currentAccount, a10, null, gjVar, null, classGuid, false, cwVar, j3, ljVar);
        } else {
            B0(2, 0, false, false);
        }
    }

    public final boolean X() {
        ac.e eVar = this.L1;
        if (eVar != null) {
            File file = (File) eVar.f1021b;
            z0.b(file);
            file.delete();
            Z();
            return true;
        }
        e0.g gVar = this.G1;
        if (gVar != null && gVar.e()) {
            this.G1 = null;
            if (!gVar.c()) {
                ((yi.j) gVar.f10200e).o();
                gVar.f10199c = true;
            }
            Z();
            return true;
        }
        return false;
    }

    public final void Y(boolean z10) {
        td tdVar = this.f22688a;
        if (z10) {
            if (!this.W && cz.F0 && ys.f28136p0.requestAudioFocus(tdVar, 3, 2) == 1) {
                this.W = true;
            }
        } else if (this.W) {
            ys.f28136p0.abandonAudioFocus(tdVar);
            this.W = false;
        }
    }

    public final void Z() {
        this.f22706g1 = null;
        this.f22712j1 = null;
        this.f22714k1 = null;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.L1 = null;
        this.C1 = 0;
    }

    public final boolean a0() {
        ArrayList arrayList;
        int i7;
        gj gjVar;
        hf hfVar = this.V1;
        if (hfVar != null) {
            gj gjVar2 = hfVar.f24443a;
            this.V1 = null;
            if (cz.N0) {
                arrayList = this.U0;
            } else {
                arrayList = this.S0;
            }
            if (arrayList != null && (i7 = this.V0) >= 0 && i7 < arrayList.size() && (gjVar = (gj) arrayList.get(this.V0)) != null && gj.B0(gjVar.f24177k) == gj.B0(gjVar2.f24177k) && gjVar.e1() == gjVar2.e1()) {
                this.C0 = false;
                float f10 = hfVar.f24444b;
                gjVar.f24142c0 = f10;
                gjVar.f24137b0 = f10;
                gjVar.f24146d0 = hfVar.f24445c;
                gjVar.f24169i0 = hfVar.d;
                S(gjVar);
                R(gjVar, false);
                return true;
            }
        }
        return false;
    }

    public final void b0(gj gjVar) {
        if ((this.f22711j0 != null || this.F0 != null) && gjVar != null && this.f22735v0 != null && L(gjVar)) {
            try {
                v0(this.f22735v0);
                ValueAnimator valueAnimator = this.R1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.R1.cancel();
                }
                if (!gj.R4(gjVar.f24177k) && !gjVar.h4()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 1.0f);
                    this.R1 = ofFloat;
                    ofFloat.addUpdateListener(this.S1);
                    this.R1.setDuration(300L);
                    this.R1.start();
                } else {
                    this.Q1 = 1.0f;
                    n0();
                }
                i61 i61Var = this.f22711j0;
                if (i61Var != null) {
                    i61Var.h0();
                } else {
                    i61 i61Var2 = this.F0;
                    if (i61Var2 != null) {
                        i61Var2.h0();
                    }
                }
                j(gjVar);
                this.f22707h0 = false;
                ls.f(this.f22735v0.K1).k(ls.f25276g2, Integer.valueOf(this.f22735v0.e1()));
                try {
                    d1.f.b(1);
                    if (!this.U1) {
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
        gj gjVar;
        i61 i61Var = this.f22711j0;
        if (i61Var != null && (gjVar = this.f22735v0) != null && !this.f22707h0) {
            if (i61Var.d != null && i61Var.M == 2) {
                q(false, false, false, false);
                S(gjVar);
                return;
            }
            i61Var.h0();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        hp hpVar;
        gj gjVar;
        ArrayList arrayList;
        char c10;
        int indexOf;
        int i11 = 0;
        if (i7 != ls.Y1 && i7 != ls.R1) {
            if (i7 == ls.f25368w) {
                if (!((Boolean) objArr[2]).booleanValue()) {
                    long longValue = ((Long) objArr[1]).longValue();
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    gj gjVar2 = this.f22735v0;
                    if (gjVar2 != null && longValue == gjVar2.f24177k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(gjVar2.e1()))) {
                        q(true, true, false, false);
                    }
                    ArrayList arrayList3 = this.f22703f0;
                    if (arrayList3 != null && !arrayList3.isEmpty() && longValue == ((gj) this.f22703f0.get(0)).f24177k.peer_id.channel_id) {
                        while (i11 < arrayList2.size()) {
                            Integer num = (Integer) arrayList2.get(i11);
                            gj gjVar3 = (gj) this.f22705g0.get(num.intValue());
                            this.f22705g0.remove(num.intValue());
                            if (gjVar3 != null) {
                                this.f22703f0.remove(gjVar3);
                            }
                            i11++;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i7 == ls.f25262e0) {
                long longValue2 = ((Long) objArr[0]).longValue();
                gj gjVar4 = this.f22735v0;
                if (gjVar4 != null && gj.B0(gjVar4.f24177k) == longValue2) {
                    q(false, true, false, false);
                    return;
                }
                return;
            } else {
                int i12 = ls.K0;
                int[] iArr = this.f22696c1;
                HashMap hashMap = this.T0;
                ArrayList arrayList4 = this.S0;
                if (i7 == i12) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    long longValue4 = ((Long) objArr[3]).longValue();
                    gj gjVar5 = this.f22735v0;
                    if (gjVar5 != null && gjVar5.I3() && gj.B0(this.f22735v0.f24177k) == longValue3 && this.f22693b1 == longValue4 && !this.f22735v0.f24206r1) {
                        arrayList4.addAll(0, (ArrayList) objArr[1]);
                        arrayList4.addAll((ArrayList) objArr[2]);
                        int size = arrayList4.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            gj gjVar6 = (gj) arrayList4.get(i13);
                            hashMap.put(Integer.valueOf(gjVar6.e1()), gjVar6);
                            iArr[0] = Math.min(iArr[0], gjVar6.e1());
                        }
                        t0();
                        if (cz.N0) {
                            g();
                        } else {
                            gj gjVar7 = this.f22735v0;
                            if (gjVar7 != null && (indexOf = arrayList4.indexOf(gjVar7)) >= 0) {
                                this.V0 = indexOf;
                            }
                        }
                        this.f22690a1 = ConnectionsManager.generateClassGuid();
                        return;
                    }
                    return;
                }
                int i14 = ls.V;
                int i15 = ls.L0;
                if (i7 == i14) {
                    if (((Integer) objArr[3]).intValue() == this.f22690a1 && this.f22735v0 != null) {
                        long longValue5 = ((Long) objArr[0]).longValue();
                        ((Integer) objArr[4]).getClass();
                        ArrayList arrayList5 = (ArrayList) objArr[2];
                        if (longValue5 == this.Z0) {
                            c10 = 1;
                        } else {
                            c10 = 0;
                        }
                        if (!arrayList5.isEmpty()) {
                            this.X0[c10] = ((Boolean) objArr[5]).booleanValue();
                        }
                        int i16 = 0;
                        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                            gj gjVar8 = (gj) arrayList5.get(i17);
                            if (!gjVar8.S4() && !hashMap.containsKey(Integer.valueOf(gjVar8.e1()))) {
                                i16++;
                                arrayList4.add(0, gjVar8);
                                hashMap.put(Integer.valueOf(gjVar8.e1()), gjVar8);
                                iArr[c10] = Math.min(iArr[c10], gjVar8.e1());
                            }
                        }
                        t0();
                        int indexOf2 = arrayList4.indexOf(this.f22735v0);
                        if (indexOf2 >= 0) {
                            this.V0 = indexOf2;
                        }
                        this.Y0 = false;
                        if (cz.N0) {
                            g();
                        }
                        if (i16 != 0) {
                            ls.f(this.f22735v0.K1).k(i15, Integer.valueOf(i16));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    if (!((Boolean) objArr[2]).booleanValue() && (arrayList = this.f22703f0) != null && !arrayList.isEmpty() && ((Long) objArr[0]).longValue() == gj.B0(((gj) this.f22703f0.get(0)).f24177k)) {
                        ArrayList arrayList6 = (ArrayList) objArr[1];
                        while (i11 < arrayList6.size()) {
                            gj gjVar9 = (gj) arrayList6.get(i11);
                            if ((gj.R4(gjVar9.f24177k) || gjVar9.h4()) && !gjVar9.S4() && !gjVar9.g4() && (!this.f22700e0 || (gjVar9.f24177k.media_unread && !gjVar9.N3()))) {
                                this.f22703f0.add(gjVar9);
                                this.f22705g0.put(gjVar9.e1(), gjVar9);
                            }
                            i11++;
                        }
                        return;
                    }
                    return;
                } else if (i7 == ls.K4) {
                    i61 i61Var = (i61) objArr[0];
                    if (this.F0 != i61Var && this.f22711j0 != i61Var) {
                        gj gjVar10 = this.f22735v0;
                        if (gjVar10 != null && I(gjVar10) && !H() && (gjVar10.I3() || gj.R4(gjVar10.f24177k))) {
                            this.f22709i0 = true;
                        }
                        R(gjVar10, true);
                        return;
                    }
                    return;
                } else if (i7 == ls.W3 && (hpVar = this.R0) != null && objArr[0] == hpVar) {
                    int size2 = hpVar.f24486c.size() - arrayList4.size();
                    arrayList4.clear();
                    arrayList4.addAll(this.R0.f24486c);
                    t0();
                    if (cz.N0) {
                        g();
                    } else {
                        gj gjVar11 = this.f22735v0;
                        if (gjVar11 != null) {
                            int indexOf3 = arrayList4.indexOf(gjVar11);
                            if (indexOf3 >= 0) {
                                this.V0 = indexOf3;
                            } else {
                                int i18 = this.V0;
                                if (i18 < 0 || i18 >= arrayList4.size()) {
                                    this.V0 = 0;
                                }
                                if (arrayList4.size() == 0) {
                                    o();
                                } else {
                                    S((gj) arrayList4.get(0));
                                }
                            }
                        }
                    }
                    if (size2 != 0 && (gjVar = this.f22735v0) != null) {
                        ls.f(gjVar.K1).k(i15, Integer.valueOf(size2));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        String str = (String) objArr[0];
        gj gjVar12 = this.f22735v0;
        if (gjVar12 != null && gjVar12.K1 == i10 && w7.r(null, gjVar12.F0()).equals(str)) {
            if (this.B0) {
                this.C0 = true;
                S(this.f22735v0);
            } else if (this.E0 == null) {
                try {
                    w7.G(k10.f24932t0);
                    this.E0 = rf.a.a(w7.M(this.f22735v0.f24177k, false, true));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void g() {
        gj gjVar;
        ArrayList arrayList = this.S0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            ArrayList arrayList3 = this.U0;
            arrayList3.clear();
            int i7 = this.V0;
            if (i7 >= 0 && i7 < arrayList.size()) {
                gjVar = (gj) arrayList.get(this.V0);
                arrayList2.remove(this.V0);
            } else {
                gjVar = null;
            }
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                int nextInt = Utilities.f22772b.nextInt(arrayList2.size());
                arrayList3.add((gj) arrayList2.get(nextInt));
                arrayList2.remove(nextInt);
            }
            if (gjVar != null) {
                arrayList3.add(gjVar);
                this.V0 = arrayList3.size() - 1;
            }
        }
    }

    public native byte[] getWaveform2(short[] sArr, int i7);

    public final boolean h() {
        gj gjVar = this.f22735v0;
        if (gjVar != null) {
            if ((gjVar.I3() || gj.R4(this.f22735v0.f24177k) || this.f22735v0.h4()) && !this.f22735v0.S4() && !this.f22735v0.g4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h0(gj gjVar, boolean z10, boolean z11, boolean z12) {
        f20 f20Var;
        if (gjVar != null) {
            f20Var = gjVar.f24205r0;
        } else {
            f20Var = null;
        }
        if (gjVar != null && f20Var != null) {
            ArrayList arrayList = this.f22695c0;
            if (!z10 || arrayList.isEmpty()) {
                if (z10) {
                    new File(gjVar.f24177k.attachPath).delete();
                }
                ?? obj = new Object();
                obj.f25026a = gjVar;
                obj.f25028c = gjVar.K1;
                obj.f25027b = f20Var;
                obj.d = z12;
                arrayList.add(obj);
                if (z11) {
                    this.f22689a0.add(obj);
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

    public final void i(gj gjVar) {
        if (gjVar != null && !this.f22695c0.isEmpty()) {
            for (int i7 = 0; i7 < this.f22695c0.size(); i7++) {
                kf kfVar = (kf) this.f22695c0.get(i7);
                gj gjVar2 = kfVar.f25026a;
                if (gjVar2.T(gjVar) && gjVar2.K1 == gjVar.K1) {
                    if (i7 == 0) {
                        synchronized (this.f22691b) {
                            kfVar.f25027b.W = true;
                        }
                        return;
                    }
                    this.f22689a0.remove((kf) this.f22695c0.remove(i7));
                    k(true);
                    return;
                }
            }
        }
    }

    public final void i0(gj gjVar, float f10) {
        gj gjVar2 = this.f22735v0;
        if ((this.f22711j0 != null || this.F0 != null) && gjVar != null && gjVar2 != null && L(gjVar)) {
            try {
                i61 i61Var = this.f22711j0;
                if (i61Var != null) {
                    long U = i61Var.U();
                    if (U == -9223372036854775807L) {
                        this.f22733u0 = f10;
                    } else {
                        gjVar2.f24137b0 = f10;
                        long j3 = (int) (((float) U) * f10);
                        this.f22711j0.q0(j3, false);
                        gjVar2.f24150e0 = j3;
                        if (!this.U1) {
                            d1.f.v(j3);
                        }
                    }
                } else {
                    i61 i61Var2 = this.F0;
                    if (i61Var2 != null) {
                        i61Var2.p0(((float) i61Var2.U()) * f10);
                        if (!this.U1) {
                            d1.f.v(((float) this.F0.U()) * f10);
                        }
                    }
                }
                ls.f(gjVar.K1).k(ls.f25288i2, Integer.valueOf(gjVar2.e1()), Float.valueOf(f10));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void j(gj gjVar) {
        int i7;
        int i10;
        int requestAudioFocus;
        if (!gj.R4(gjVar.f24177k) && !gjVar.h4()) {
            i7 = 1;
        } else if (this.M) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        if (this.V != i7) {
            this.V = i7;
            if (i7 == 3) {
                requestAudioFocus = ys.f28136p0.requestAudioFocus(this, 0, 1);
            } else {
                AudioManager audioManager = ys.f28136p0;
                if (i7 == 2 && !cz.G0) {
                    i10 = 3;
                } else {
                    i10 = 1;
                }
                requestAudioFocus = audioManager.requestAudioFocus(this, 3, i10);
            }
            if (requestAudioFocus == 1) {
                this.Y = 2;
            }
        }
    }

    public final void k(boolean z10) {
        if (!this.f22689a0.isEmpty()) {
            this.f22692b0 = (kf) this.f22689a0.get(0);
        } else {
            this.f22692b0 = null;
        }
        if (this.f22692b0 != null || z10) {
            if (VideoEncodingService.f22781e == null) {
                try {
                    t0.f26895b.startService(new Intent(t0.f26895b, VideoEncodingService.class));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else if (z10) {
                kf kfVar = B().f22692b0;
                VideoEncodingService videoEncodingService = VideoEncodingService.f22781e;
                if (videoEncodingService.f22783b != kfVar) {
                    if (kfVar != null) {
                        videoEncodingService.a(kfVar);
                    } else {
                        videoEncodingService.stopSelf();
                    }
                }
            }
        }
    }

    public final void k0(boolean z10) {
        org.telegram.ui.j4 j4Var = this.M0;
        if (j4Var != null) {
            if (z10) {
                PipRoundVideoView pipRoundVideoView = this.I0;
                if (pipRoundVideoView != null) {
                    this.J0 = 2;
                    pipRoundVideoView.a(true);
                    this.I0 = null;
                    return;
                }
                if (j4Var.getParent() == null) {
                    this.O0.addView(this.M0);
                }
                this.F0.A0(this.H0);
            } else if (j4Var.getParent() != null) {
                this.J0 = 1;
                this.O0.removeView(this.M0);
            } else {
                if (this.I0 == null) {
                    try {
                        PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                        this.I0 = pipRoundVideoView2;
                        pipRoundVideoView2.d(this.K0, new ud(this, 4));
                    } catch (Exception unused) {
                        this.I0 = null;
                    }
                }
                PipRoundVideoView pipRoundVideoView3 = this.I0;
                if (pipRoundVideoView3 != null) {
                    this.F0.A0(pipRoundVideoView3.f33005c);
                }
            }
        }
    }

    public final void l(int i7) {
        ArrayList arrayList;
        boolean z10;
        int i10;
        File M;
        a6 q10 = a6.q(i7);
        int e10 = t0.e();
        int i11 = 2;
        if (e10 == 1) {
            if (!q10.O.f28263g || !q10.p().d) {
                return;
            }
        } else if (e10 == 2) {
            if (!q10.P.f28263g || !q10.o().d) {
                return;
            }
        } else if (!q10.N.f28263g || !q10.n().d) {
            return;
        }
        if (cz.N0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (arrayList != null && arrayList.size() >= 2) {
            if (this.R0 != null) {
                if (!cz.O0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = cz.O0;
            }
            if (z10) {
                i10 = this.V0 + 1;
                if (i10 >= arrayList.size()) {
                    i10 = 0;
                }
            } else {
                i10 = this.V0 - 1;
                if (i10 < 0) {
                    i10 = arrayList.size() - 1;
                }
            }
            if (i10 >= 0 && i10 < arrayList.size()) {
                gj gjVar = (gj) arrayList.get(i10);
                File file = null;
                if (!TextUtils.isEmpty(gjVar.f24177k.attachPath)) {
                    File file2 = new File(gjVar.f24177k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file != null) {
                    M = file;
                } else {
                    w7.G(i7);
                    M = w7.M(gjVar.f24177k, false, true);
                }
                M.exists();
                if (M != file && !M.exists() && gjVar.I3()) {
                    w7 G = w7.G(i7);
                    TLRPC.Document F0 = gjVar.F0();
                    if (!gj.R5(gjVar.f24177k)) {
                        i11 = 0;
                    }
                    G.W(F0, gjVar, 0, i11);
                }
            }
        }
    }

    public final void l0(int i7) {
        boolean z10 = cz.N0;
        if (i7 == 2) {
            cz.N0 = true;
            cz.O0 = false;
        } else if (i7 == 1) {
            cz.O0 = true;
            cz.N0 = false;
        } else {
            cz.O0 = false;
            cz.N0 = false;
        }
        MediaController B = B();
        gj gjVar = B.f22735v0;
        if (gjVar != null && gjVar.I3()) {
            B.l(B.f22735v0.K1);
        }
        SharedPreferences.Editor edit = np.g1().edit();
        edit.putBoolean("shuffleMusic", cz.N0);
        edit.putBoolean("playOrderReversed", cz.O0);
        edit.apply();
        boolean z11 = cz.N0;
        if (z10 != z11) {
            if (z11) {
                g();
                return;
            }
            gj gjVar2 = this.f22735v0;
            if (gjVar2 != null) {
                int indexOf = this.S0.indexOf(gjVar2);
                this.V0 = indexOf;
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
            if (Math.abs(currentTimeMillis - f22686g2) >= 5000) {
                AudioManager audioManager = (AudioManager) t0.f26895b.getSystemService("audio");
                if (this.M) {
                    i7 = 0;
                } else {
                    i7 = 3;
                }
                int streamVolume = audioManager.getStreamVolume(i7);
                if (streamVolume == 0) {
                    audioManager.adjustStreamVolume(i7, streamVolume, 1);
                    f22686g2 = currentTimeMillis;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void m0(boolean z10, float f10) {
        String str;
        String str2;
        float f11;
        if (z10) {
            if (this.f22726r0 >= 6.0f && f10 == 1.0f && this.f22735v0 != null) {
                this.f22711j0.g0();
                gj gjVar = this.f22735v0;
                g0.h3(new fe(this, gjVar, gjVar.f24137b0, 0), 50L);
            }
            this.f22726r0 = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.f22731t0 = f10;
            }
        } else {
            this.f22723q0 = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.f22729s0 = f10;
            }
        }
        i61 i61Var = this.f22711j0;
        if (i61Var != null) {
            i61Var.v0(Math.round(f10 * 10.0f) / 10.0f);
        } else {
            i61 i61Var2 = this.F0;
            if (i61Var2 != null) {
                i61Var2.v0(Math.round(f10 * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor edit = np.g1().edit();
        if (z10) {
            str = "musicPlaybackSpeed";
        } else {
            str = "playbackSpeed";
        }
        SharedPreferences.Editor putFloat = edit.putFloat(str, f10);
        if (z10) {
            str2 = "fastMusicPlaybackSpeed";
        } else {
            str2 = "fastPlaybackSpeed";
        }
        if (z10) {
            f11 = this.f22731t0;
        } else {
            f11 = this.f22729s0;
        }
        putFloat.putFloat(str2, f11).commit();
        ls.e().k(ls.M4, new Object[0]);
        if (!this.U1) {
            d1.f.z(f10);
        }
    }

    public final void n(boolean z10) {
        File file;
        File file2;
        boolean z11;
        File file3;
        e0.g gVar;
        e0.g gVar2;
        if (this.I1) {
            fi.z0 z0Var = this.H1;
            if (z0Var != null) {
                g0.r(z0Var);
                this.H1 = null;
            }
            if (!z10 && (gVar2 = this.G1) != null) {
                z11 = gVar2.c();
            } else {
                z11 = false;
            }
            if (!z11 && (gVar = this.G1) != null) {
                gVar.f10198b = false;
                ((yi.j) gVar.f10200e).b();
            }
            if (z11 && (file3 = this.f22714k1) != null) {
                z0.b(file3);
            }
            x(!z10);
            return;
        }
        this.f22706g1 = null;
        z0.b(this.f22714k1);
        if (z10 && (file2 = this.f22714k1) != null) {
            try {
                file2.delete();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        this.f22714k1 = null;
        if (z10 && (file = this.f22712j1) != null) {
            file.delete();
        }
        this.f22712j1 = null;
        this.f22744y0 = false;
        this.f22725r = false;
        this.P = false;
    }

    public final void n0() {
        float f10;
        try {
            if (this.Y != 1) {
                f10 = 1.0f;
            } else {
                f10 = 0.2f;
            }
            i61 i61Var = this.f22711j0;
            float f11 = 0.0f;
            if (i61Var != null) {
                if (!d1.f.u()) {
                    f11 = this.Q1 * f10;
                }
                i61Var.B0(f11);
                return;
            }
            i61 i61Var2 = this.F0;
            if (i61Var2 != null) {
                if (d1.f.u()) {
                    f10 = 0.0f;
                }
                i61Var2.B0(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void o() {
        q(true, true, false, false);
        this.E0 = null;
        this.C0 = false;
        for (int i7 = 0; i7 < 4; i7++) {
            a6 q10 = a6.q(i7);
            q10.f22832b.clear();
            q10.f22833c.clear();
            q10.d.clear();
            q10.f22834e.clear();
            q10.f22835f.clear();
            q10.h.clear();
            q10.G.b();
        }
        this.f22695c0.clear();
        this.f22697d0.clear();
        this.V1 = null;
        this.f22703f0 = null;
        this.f22705g0 = null;
        r();
    }

    public final boolean o0(ArrayList arrayList, gj gjVar, long j3, boolean z10, h2.a0 a0Var, long j10) {
        HashMap hashMap;
        gj gjVar2 = this.f22735v0;
        ArrayList arrayList2 = this.S0;
        if (gjVar2 == gjVar) {
            int indexOf = arrayList2.indexOf(gjVar);
            if (indexOf >= 0) {
                this.V0 = indexOf;
            }
            return S(gjVar);
        }
        this.W0 = !z10;
        this.Z0 = j3;
        this.C0 = !arrayList2.isEmpty();
        r();
        this.D0 = a0Var;
        this.f22693b1 = j10;
        boolean z11 = false;
        if (!arrayList.isEmpty() && n5.C(gj.B0(((gj) arrayList.get(0)).f24177k))) {
            z11 = true;
        }
        int size = arrayList.size() - 1;
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        while (true) {
            hashMap = this.T0;
            if (size < 0) {
                break;
            }
            gj gjVar3 = (gj) arrayList.get(size);
            if (gjVar3.I3()) {
                int e12 = gjVar3.e1();
                if (e12 > 0 || z11) {
                    i7 = Math.min(i7, e12);
                    i10 = Math.max(i10, e12);
                }
                arrayList2.add(gjVar3);
                hashMap.put(Integer.valueOf(e12), gjVar3);
            }
            size--;
        }
        t0();
        int indexOf2 = arrayList2.indexOf(gjVar);
        this.V0 = indexOf2;
        if (indexOf2 == -1) {
            r();
            this.V0 = arrayList2.size();
            arrayList2.add(gjVar);
            hashMap.put(Integer.valueOf(gjVar.e1()), gjVar);
        }
        if (gjVar.I3() && !gjVar.f24206r1) {
            if (cz.N0) {
                g();
            }
            if (z10) {
                if (this.D0 == null) {
                    final si d02 = si.d0(gjVar.K1);
                    final long B0 = gj.B0(gjVar.f24177k);
                    final long j11 = this.f22693b1;
                    final long j12 = i7;
                    final long j13 = i10;
                    d02.getMessagesStorage().f27214a.c(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.uh.run():void");
                        }
                    });
                } else {
                    this.f22690a1 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return S(gjVar);
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        g0.g3(new xd(this, i7, 1));
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public final void p(boolean z10, boolean z11) {
        q(z10, z11, false, false);
    }

    public final void p0(TextureView textureView, org.telegram.ui.j4 j4Var, FrameLayout frameLayout, boolean z10) {
        if (textureView != null) {
            boolean z11 = true;
            if (!z10 && this.H0 == textureView) {
                this.J0 = 1;
                this.H0 = null;
                this.M0 = null;
                this.O0 = null;
                return;
            }
            i61 i61Var = this.F0;
            if (i61Var != null && textureView != this.H0) {
                if (j4Var == null || !j4Var.d) {
                    z11 = false;
                }
                this.N0 = z11;
                this.H0 = textureView;
                PipRoundVideoView pipRoundVideoView = this.I0;
                if (pipRoundVideoView != null) {
                    i61Var.A0(pipRoundVideoView.f33005c);
                } else {
                    i61Var.A0(textureView);
                }
                this.M0 = j4Var;
                this.O0 = frameLayout;
                if (this.Q0 && j4Var != null) {
                    j4Var.a(this.P0, 0);
                }
            }
        }
    }

    public final void q(boolean r21, boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.q(boolean, boolean, boolean, boolean):void");
    }

    public final void q0() {
        this.M = true;
        AudioManager audioManager = ys.f28136p0;
        audioManager.setBluetoothScoOn(false);
        audioManager.setSpeakerphoneOn(false);
    }

    public final void r() {
        this.R0 = null;
        this.S0.clear();
        this.T0.clear();
        this.U0.clear();
        this.f22690a1 = 0;
        boolean[] zArr = this.X0;
        zArr[1] = false;
        zArr[0] = false;
        this.Z0 = 0L;
        this.f22693b1 = 0L;
        int[] iArr = this.f22696c1;
        iArr[1] = Integer.MAX_VALUE;
        iArr[0] = Integer.MAX_VALUE;
        this.Y0 = false;
        this.D0 = null;
        this.V1 = null;
    }

    public final void r0(ArrayList arrayList, boolean z10) {
        ArrayList arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        this.f22703f0 = arrayList2;
        if (arrayList2 != null) {
            this.f22700e0 = z10;
            this.f22705g0 = new SparseArray();
            for (int i7 = 0; i7 < this.f22703f0.size(); i7++) {
                gj gjVar = (gj) this.f22703f0.get(i7);
                this.f22705g0.put(gjVar.e1(), gjVar);
            }
        }
    }

    public final void s(ac.e eVar) {
        byte[] bArr;
        TLRPC.TL_document tL_document;
        int i7;
        File file = (File) eVar.f1021b;
        this.f22714k1 = file;
        long j3 = eVar.f1020a;
        this.l1 = j3;
        byte[] bArr2 = (byte[]) eVar.f1022c;
        String str = null;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr2.clone();
        }
        G0(file, j3, bArr);
        if (this.C1 == 3) {
            this.L1 = eVar;
            e0.g gVar = this.G1;
            if (gVar != null) {
                ((yi.j) gVar.f10200e).o();
                gVar.f10199c = true;
                this.G1 = null;
            }
            Y(false);
            j0(false);
            return;
        }
        si.d0(this.f22710i1).F1(this.n1, this.f22720o1, null);
        if (this.C1 == 1) {
            TLRPC.TL_document tL_document2 = this.f22706g1;
            String absolutePath = file.getAbsolutePath();
            long j10 = this.n1;
            gj gjVar = this.f22727r1;
            gj gjVar2 = this.f22730s1;
            boolean z10 = this.D1;
            int i10 = this.E1;
            if (this.F1) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = 0;
            }
            yy f10 = yy.f(tL_document2, null, absolutePath, j10, gjVar, gjVar2, null, null, null, null, z10, i10, 0, i7, null, null, false);
            f10.R = this.f22722p1;
            f10.T = this.f22724q1;
            f10.H = this.f22732t1;
            f10.K = this.f22734u1;
            f10.Q = 0L;
            az.C(this.f22710i1).r0(f10);
        }
        ls f11 = ls.f(this.f22710i1);
        Integer valueOf = Integer.valueOf(this.f22708h1);
        int i11 = this.C1;
        if (i11 == 2) {
            tL_document = this.f22706g1;
        } else {
            tL_document = null;
        }
        if (i11 == 2) {
            str = file.getAbsolutePath();
        }
        f11.k(ls.f25345s2, valueOf, tL_document, str);
        x(true);
    }

    public final void t0() {
        Collections.sort(this.S0, new jg.w(17));
    }

    public final void u0(boolean z10) {
        boolean z11;
        gj gjVar = this.f22735v0;
        if (gjVar != null) {
            int i7 = 0;
            ls.f(gjVar.K1).k(ls.f25358u2, Boolean.valueOf(this.M));
            i61 i61Var = this.F0;
            if (i61Var != null) {
                if (!this.M) {
                    i7 = 3;
                }
                i61Var.x0(i7);
                if (!z10) {
                    if (this.F0.S() < 1000) {
                        this.F0.p0(0L);
                    }
                    this.F0.h0();
                    return;
                }
                R(this.f22735v0, true);
                return;
            }
            i61 i61Var2 = this.f22711j0;
            if (i61Var2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            gj gjVar2 = this.f22735v0;
            float f10 = gjVar2.f24137b0;
            int i10 = gjVar2.f24174j0;
            if (!z10 && i61Var2 != null && i61Var2.d0() && i10 * f10 <= 1.0f) {
                gjVar2.f24137b0 = 0.0f;
            } else {
                gjVar2.f24137b0 = f10;
            }
            q(false, true, false, false);
            S(gjVar2);
            if (z10) {
                if (z11) {
                    g0.h3(new z4(21, this, gjVar2), 100L);
                } else {
                    R(gjVar2, true);
                }
            }
        }
    }

    public final void v0(gj gjVar) {
        synchronized (this.A0) {
            Timer timer = this.f22746z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f22746z0 = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            gjVar.S0();
            Timer timer2 = new Timer();
            this.f22746z0 = timer2;
            timer2.schedule(new jg.q1(1, this, gjVar), 0L, 17L);
        }
    }

    public final void w0(org.telegram.ui.bn bnVar) {
        if (bnVar != null) {
            if ((this.f22702f != null || this.f22717n != null) && this.f22699e != null) {
                if (!cz.k(false)) {
                    gj gjVar = this.f22735v0;
                    if (gjVar != null) {
                        if (!gj.R4(gjVar.f24177k) && !this.f22735v0.h4()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f22728s = bnVar;
                if (!this.Q) {
                    float[] fArr = this.S;
                    fArr[2] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    float[] fArr2 = this.U;
                    fArr2[2] = 0.0f;
                    fArr2[1] = 0.0f;
                    fArr2[0] = 0.0f;
                    float[] fArr3 = this.T;
                    fArr3[2] = 0.0f;
                    fArr3[1] = 0.0f;
                    fArr3[0] = 0.0f;
                    this.I = 0L;
                    this.R = 0.0f;
                    this.f22743y = 0;
                    this.E = 0;
                    this.G = 0;
                    this.F = 0;
                    Utilities.f22774e.c(new ud(this, 3));
                    this.Q = true;
                }
            }
        }
    }

    public final void x(boolean z10) {
        File file;
        Y(false);
        j0(false);
        e0.g gVar = this.G1;
        if (gVar != null) {
            ((yi.j) gVar.f10200e).o();
            gVar.f10199c = true;
            this.G1 = null;
        }
        if (!z10 && (file = this.f22714k1) != null) {
            z0.b(file);
            this.f22714k1.delete();
        }
        Z();
        this.f22744y0 = false;
        this.f22725r = false;
        this.P = false;
    }

    public final void x0(int i7, long j3, gj gjVar, gj gjVar2, TL_stories.StoryItem storyItem, int i10, boolean z10, cw cwVar, long j10, lj ljVar) {
        boolean z11;
        long j11;
        long b22;
        long j12;
        gj gjVar3 = this.f22735v0;
        if (gjVar3 != null && I(gjVar3) && !H()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22744y0 = z10;
        Y(true);
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.I1 && !X()) {
            g0.g3(new f9(i7, i10, 2));
        } else if (s0(i7)) {
            this.I1 = true;
            this.J1 = false;
            this.K1 = false;
            this.f22710i1 = i7;
            this.f22708h1 = i10;
            this.n1 = j3;
            this.f22722p1 = j10;
            this.f22724q1 = ljVar;
            if (gjVar2 == null) {
                b22 = 0;
            } else {
                b22 = gj.b2(i7, gjVar2.f24177k, false, false);
            }
            this.f22720o1 = b22;
            this.f22727r1 = gjVar;
            this.f22730s1 = gjVar2;
            this.f22732t1 = storyItem;
            this.f22734u1 = cwVar;
            this.f22712j1 = null;
            this.f22714k1 = null;
            this.l1 = 0L;
            this.f22716m1 = 0;
            this.f22739w1 = 0L;
            this.C1 = 0;
            fi.z0 z0Var = new fi.z0(i7, i10, 1, j3, this);
            this.H1 = z0Var;
            if (z11) {
                j12 = 500;
            } else {
                j12 = 50;
            }
            g0.h3(z0Var, j12);
        } else {
            if (s2.f26694a) {
                a8.b("AudioRecorder legacy selected: account=" + i7 + ", dialog=" + j3 + ", guid=" + i10);
            }
            vd vdVar = new vd(this, i7, i10, j3, j10, ljVar, gjVar2, gjVar, storyItem, cwVar);
            this.M1 = vdVar;
            if (z11) {
                j11 = 500;
            } else {
                j11 = 50;
            }
            this.N1.d(vdVar, j11);
        }
    }

    public final void y0() {
        if (!this.f22695c0.isEmpty()) {
            kf kfVar = (kf) this.f22695c0.get(0);
            f20 f20Var = kfVar.f25027b;
            synchronized (this.f22691b) {
                if (f20Var != null) {
                    try {
                        f20Var.W = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            new Thread(new a(kfVar, 20)).start();
        }
    }

    public final oi.y3 z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.z():oi.y3");
    }

    public final void z0() {
        synchronized (this.A0) {
            Timer timer = this.f22746z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f22746z0 = null;
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
