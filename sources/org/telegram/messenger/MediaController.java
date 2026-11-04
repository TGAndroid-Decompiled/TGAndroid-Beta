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
import org.telegram.ui.Components.m51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class MediaController implements AudioManager.OnAudioFocusChangeListener, cs, SensorEventListener {
    public static final String[] W1;
    public static final String[] X1;
    public static final ConcurrentHashMap Y1;
    public static Runnable Z1;
    public static pe f21294a2;
    public static pe f21295b2;
    public static ArrayList c2;
    public static ArrayList f21296d2;
    public static ai.d3 f21297e2;
    public static volatile MediaController f21298f2;
    public static long f21299g2;
    public static boolean f21300h2;
    public boolean B0;
    public boolean C0;
    public int C1;
    public g2.b0 D0;
    public boolean D1;
    public int E;
    public of.a E0;
    public int E1;
    public int F;
    public m51 F0;
    public boolean F1;
    public int G;
    public boolean G0;
    public e0.g G1;
    public long H;
    public TextureView H0;
    public ei.d1 H1;
    public PipRoundVideoView I0;
    public boolean I1;
    public boolean J;
    public int J0;
    public boolean J1;
    public boolean K;
    public LaunchActivity K0;
    public boolean K1;
    public View L0;
    public vi.f L1;
    public boolean M;
    public org.telegram.ui.l4 M0;
    public pd M1;
    public boolean N;
    public boolean N0;
    public final p5 N1;
    public boolean O;
    public FrameLayout O0;
    public final p5 O1;
    public boolean P;
    public float P0;
    public boolean Q;
    public boolean Q0;
    public float Q1;
    public float R;
    public bp R0;
    public ValueAnimator R1;
    public androidx.emoji2.text.j T1;
    public boolean U1;
    public int V;
    public int V0;
    public af V1;
    public boolean W;
    public boolean W0;
    public boolean X;
    public boolean Y0;
    public boolean Z;
    public long Z0;
    public int f21303a1;
    public cf f21305b0;
    public long f21306b1;
    public SensorManager f21307c;
    public PowerManager.WakeLock d;
    public Sensor f21312e;
    public boolean f21313e0;
    public boolean f21314e1;
    public Sensor f21315f;
    public ArrayList f21316f0;
    public AudioRecord f21317f1;
    public SparseArray f21318g0;
    public TLRPC.TL_document f21319g1;
    public Sensor h;
    public int f21323i1;
    public File f21325j1;
    public File k1;
    public long f21328l1;
    public boolean m0;
    public int m1;
    public Sensor f21329n;
    public int f21330n0;
    public long f21331n1;
    public String f21332o0;
    public long f21333o1;
    public long f21334p0;
    public long f21335p1;
    public ej f21337q1;
    public boolean f21338r;
    public zi f21340r1;
    public org.telegram.ui.wm f21341s;
    public zi f21343s1;
    public TL_stories.StoryItem f21345t1;
    public float f21346u0;
    public zv f21347u1;
    public zi f21348v0;
    public boolean f21350w;
    public zi f21351w0;
    public long f21352w1;
    public long f21353x;
    public we f21354x0;
    public int f21356y;
    public boolean f21357y0;
    public final ByteBuffer f21360z1;
    public final nd f21301a = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public final void onAudioFocusChange(int i3) {
            MediaController mediaController = MediaController.this;
            if (i3 != 1) {
                mediaController.W = false;
                return;
            }
            String[] strArr = MediaController.W1;
            mediaController.getClass();
        }
    };
    public final Object f21304b = new Object();
    public long I = 0;
    public float L = -100.0f;
    public final float[] S = new float[3];
    public final float[] T = new float[3];
    public final float[] U = new float[3];
    public int Y = 0;
    public final ArrayList f21302a0 = new ArrayList();
    public final ArrayList f21308c0 = new ArrayList();
    public final HashMap f21310d0 = new HashMap();
    public boolean f21320h0 = false;
    public boolean f21322i0 = false;
    public m51 f21324j0 = null;
    public m51 f21326k0 = null;
    public int f21327l0 = 0;
    public float f21336q0 = 1.0f;
    public float f21339r0 = 1.0f;
    public float f21342s0 = 1.0f;
    public float f21344t0 = 1.0f;
    public Timer f21359z0 = null;
    public final Object A0 = new Object();
    public final ArrayList S0 = new ArrayList();
    public final HashMap T0 = new HashMap();
    public final ArrayList U0 = new ArrayList();
    public final boolean[] X0 = {false, false};
    public final int[] f21309c1 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public final le f21311d1 = new le(this);
    public int f21321h1 = -1;
    public short[] f21349v1 = new short[1024];
    public final Object f21355x1 = new Object();
    public final ArrayList f21358y1 = new ArrayList();
    public int A1 = 1280;
    public int B1 = 48000;
    public final mi.b0 P1 = new mi.b0(this, 5);
    public final ei.n4 S1 = new ei.n4(this, 6);

    static {
        String str;
        String str2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 28) {
            str = "datetaken";
        } else {
            str = "date_modified";
        }
        W1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str, "orientation", "width", "height", "_size"};
        if (i3 <= 28) {
            str2 = "datetaken";
        } else {
            str2 = "date_modified";
        }
        X1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str2, "duration", "width", "height", "_size"};
        Y1 = new ConcurrentHashMap();
        c2 = new ArrayList();
        f21296d2 = new ArrayList();
    }

    public MediaController() {
        p5 p5Var = new p5("recordQueue");
        this.N1 = p5Var;
        p5Var.setPriority(10);
        p5 p5Var2 = new p5("fileEncodingQueue");
        this.O1 = p5Var2;
        p5Var2.setPriority(10);
        p5Var.c(new od(this, 0));
        Utilities.f21387e.c(new od(this, 1));
        this.f21360z1 = ByteBuffer.allocateDirect(1920);
        g0.h3(new od(this, 2));
        ContentResolver contentResolver = t0.f25457b.getContentResolver();
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
        MediaController mediaController2 = f21298f2;
        if (mediaController2 == null) {
            synchronized (MediaController.class) {
                try {
                    mediaController = f21298f2;
                    if (mediaController == null) {
                        mediaController = new MediaController();
                        f21298f2 = mediaController;
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
        int i3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e10) {
            a8.g(e10, true);
            i3 = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        return i3;
    }

    public static boolean G(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = t0.f25457b.getContentResolver().openInputStream(uri);
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
        String e10 = t4.c.e(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = e10.getBytes("UTF-8");
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
            throw new IOException(k2.p1.i(length, "XMP segment too large: "));
        }
    }

    public static boolean M(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = t0.f25457b.getContentResolver().openInputStream(uri);
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

    public static void O(int i3) {
        Thread thread = new Thread(new ii.i2(i3, 2));
        thread.setPriority(1);
        thread.start();
    }

    public static int Q(int r5, int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.Q(int, int, int, int, int):int");
    }

    public static void a(MediaController mediaController, boolean z10) {
        mediaController.stopRecord();
        TLRPC.TL_document tL_document = mediaController.f21319g1;
        File N = mediaController.N(mediaController.f21325j1, mediaController.k1, tL_document);
        if (tL_document != null && N != null) {
            g0.h3(new ci.u8(mediaController, N, z10, tL_document, 13));
        }
    }

    public static void b(final MediaController mediaController, final int i3, final int i10, long j10, long j11, ej ejVar, zi ziVar, zi ziVar2, TL_stories.StoryItem storyItem, zv zvVar) {
        String absolutePath;
        if (mediaController.f21317f1 != null) {
            g0.h3(new Runnable(mediaController) {
                public final MediaController f25851b;

                {
                    this.f25851b = mediaController;
                }

                @Override
                public final void run() {
                    int i11 = r4;
                    int i12 = i10;
                    int i13 = i3;
                    MediaController mediaController2 = this.f25851b;
                    switch (i11) {
                        case 0:
                            mediaController2.M1 = null;
                            hs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 1:
                            mediaController2.M1 = null;
                            hs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 2:
                            mediaController2.M1 = null;
                            hs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        default:
                            mediaController2.M1 = null;
                            hs.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                            return;
                    }
                }
            });
            return;
        }
        j0(true);
        mediaController.C1 = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        mediaController.f21319g1 = tL_document;
        mediaController.f21321h1 = i10;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = Integer.MIN_VALUE;
        tL_document.f27007id = az.p();
        mediaController.f21319g1.user_id = h10.i(i3).e();
        TLRPC.TL_document tL_document2 = mediaController.f21319g1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        az.y();
        File z10 = w7.z(1);
        mediaController.k1 = new File(z10, System.currentTimeMillis() + "_" + w7.r(null, mediaController.f21319g1));
        w7.z(4).mkdirs();
        if (r2.f25040a) {
            a8.b("start recording internal " + mediaController.k1.getPath() + " " + mediaController.k1.exists());
        }
        File file = mediaController.k1;
        Set set = z0.f26694a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            z0.f26694a.add(absolutePath);
        }
        try {
            if (mediaController.startRecord(mediaController.k1.getPath(), mediaController.B1) == 0) {
                g0.h3(new Runnable(mediaController) {
                    public final MediaController f25851b;

                    {
                        this.f25851b = mediaController;
                    }

                    @Override
                    public final void run() {
                        int i11 = r4;
                        int i12 = i10;
                        int i13 = i3;
                        MediaController mediaController2 = this.f25851b;
                        switch (i11) {
                            case 0:
                                mediaController2.M1 = null;
                                hs.f(i13).k(156, Integer.valueOf(i12));
                                return;
                            case 1:
                                mediaController2.M1 = null;
                                hs.f(i13).k(156, Integer.valueOf(i12));
                                return;
                            case 2:
                                mediaController2.M1 = null;
                                hs.f(i13).k(156, Integer.valueOf(i12));
                                return;
                            default:
                                mediaController2.M1 = null;
                                hs.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                                return;
                        }
                    }
                });
                if (r2.f25040a) {
                    a8.b("cant init encoder");
                    return;
                }
                return;
            }
            mediaController.f21314e1 = false;
            mediaController.f21317f1 = new AudioRecord(0, mediaController.B1, 16, 2, mediaController.A1);
            System.currentTimeMillis();
            long j12 = 0;
            mediaController.f21328l1 = 0L;
            mediaController.m1 = 0;
            mediaController.f21352w1 = 0L;
            mediaController.f21331n1 = j10;
            mediaController.f21335p1 = j11;
            mediaController.f21337q1 = ejVar;
            if (ziVar != null) {
                j12 = zi.c2(mediaController.f21323i1, ziVar.f26868k, false, false);
            }
            mediaController.f21333o1 = j12;
            mediaController.f21323i1 = i3;
            mediaController.f21340r1 = ziVar2;
            mediaController.f21343s1 = ziVar;
            mediaController.f21345t1 = storyItem;
            mediaController.f21347u1 = zvVar;
            mediaController.f21360z1.rewind();
            mediaController.f21317f1.startRecording();
            mediaController.N1.c(mediaController.P1);
            g0.h3(new Runnable(mediaController) {
                public final MediaController f25851b;

                {
                    this.f25851b = mediaController;
                }

                @Override
                public final void run() {
                    int i11 = r4;
                    int i12 = i10;
                    int i13 = i3;
                    MediaController mediaController2 = this.f25851b;
                    switch (i11) {
                        case 0:
                            mediaController2.M1 = null;
                            hs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 1:
                            mediaController2.M1 = null;
                            hs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 2:
                            mediaController2.M1 = null;
                            hs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        default:
                            mediaController2.M1 = null;
                            hs.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            a8.g(e10, true);
            mediaController.f21319g1 = null;
            mediaController.stopRecord();
            z0.b(mediaController.k1);
            mediaController.k1.delete();
            mediaController.k1 = null;
            File file2 = mediaController.f21325j1;
            if (file2 != null) {
                file2.delete();
                mediaController.f21325j1 = null;
            }
            try {
                mediaController.f21317f1.release();
                mediaController.f21317f1 = null;
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            j0(false);
            g0.h3(new Runnable(mediaController) {
                public final MediaController f25851b;

                {
                    this.f25851b = mediaController;
                }

                @Override
                public final void run() {
                    int i11 = r4;
                    int i12 = i10;
                    int i13 = i3;
                    MediaController mediaController2 = this.f25851b;
                    switch (i11) {
                        case 0:
                            mediaController2.M1 = null;
                            hs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 1:
                            mediaController2.M1 = null;
                            hs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        case 2:
                            mediaController2.M1 = null;
                            hs.f(i13).k(156, Integer.valueOf(i12));
                            return;
                        default:
                            mediaController2.M1 = null;
                            hs.f(i13).k(155, Integer.valueOf(i12), Boolean.TRUE);
                            return;
                    }
                }
            });
        }
    }

    public static void c(final MediaController mediaController, File file, File file2, final TLRPC.TL_document tL_document, final int i3, final boolean z10, final int i10, final boolean z11) {
        mediaController.stopRecord();
        final File N = mediaController.N(file, file2, tL_document);
        if (N == null) {
            if (r2.f25040a) {
                a8.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (r2.f25040a) {
            a8.b("stop recording internal in queue " + N.exists() + " " + N.length());
        }
        g0.h3(new Runnable() {
            @Override
            public final void run() {
                boolean z12;
                char c10;
                int i11;
                int i12;
                String[] strArr = MediaController.W1;
                boolean z13 = r2.f25040a;
                MediaController mediaController2 = MediaController.this;
                File file3 = N;
                if (z13) {
                    StringBuilder sb2 = new StringBuilder("stop recording internal ");
                    sb2.append(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController2.f21328l1 + " writedFrames" + mediaController2.m1);
                    a8.b(sb2.toString());
                }
                if (!file3.exists()) {
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.f21328l1 + " writedFrames" + mediaController2.m1), true);
                }
                li.b0(mediaController2.f21323i1).B1(mediaController2.f21331n1, mediaController2.f21333o1, null);
                int currentTime = ConnectionsManager.getInstance(mediaController2.f21323i1).getCurrentTime();
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
                long j10 = mediaController2.f21328l1;
                tL_documentAttributeAudio.duration = j10 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                if (j10 > 700) {
                    int i13 = i3;
                    if (i13 == 1) {
                        String absolutePath = file3.getAbsolutePath();
                        long j11 = mediaController2.f21331n1;
                        zi ziVar = mediaController2.f21340r1;
                        zi ziVar2 = mediaController2.f21343s1;
                        if (z11) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = 0;
                        }
                        c10 = 1;
                        i11 = 2;
                        wy f10 = wy.f(tL_document2, null, absolutePath, j11, ziVar, ziVar2, null, null, null, null, z10, i10, 0, i12, null, null, false);
                        f10.R = mediaController2.f21335p1;
                        f10.T = mediaController2.f21337q1;
                        f10.H = mediaController2.f21345t1;
                        f10.K = mediaController2.f21347u1;
                        f10.Q = 0L;
                        yy.C(mediaController2.f21323i1).r0(f10);
                    } else {
                        c10 = 1;
                        i11 = 2;
                    }
                    hs f11 = hs.f(mediaController2.f21323i1);
                    Integer valueOf = Integer.valueOf(mediaController2.f21321h1);
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
                    f11.k(hs.f23301s2, objArr);
                } else {
                    z12 = false;
                    hs.f(mediaController2.f21323i1).k(hs.f23308t2, Integer.valueOf(mediaController2.f21321h1), Boolean.FALSE, Integer.valueOf((int) j10));
                    z0.b(file3);
                    file3.delete();
                }
                mediaController2.Y(z12);
            }
        });
    }

    public static native boolean cropOpusFile(String str, String str2, long j10, long j11);

    public static void d(MediaController mediaController) {
        mediaController.f21325j1 = mediaController.k1;
        File z10 = w7.z(1);
        je jeVar = new je(1, z10, System.currentTimeMillis() + "_" + w7.r(null, mediaController.f21319g1));
        mediaController.k1 = jeVar;
        if (mediaController.startRecord(jeVar.getPath(), mediaController.B1) == 0) {
            g0.h3(new od(mediaController, 7));
            if (r2.f25040a) {
                a8.b("cant resume audio encoder");
                return;
            }
            return;
        }
        g0.h3(new od(mediaController, 8));
    }

    public static void d0(java.lang.String r12, android.content.Context r13, int r14, java.lang.String r15, java.lang.String r16, org.telegram.messenger.u10 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.d0(java.lang.String, android.content.Context, int, java.lang.String, java.lang.String, org.telegram.messenger.u10):void");
    }

    public static void e0(String str, String str2, Context context, u10 u10Var) {
        org.telegram.ui.ActionBar.s1 s1Var;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && context != null) {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists() && file2.exists()) {
                if (!g0.I1(Uri.fromFile(file), 0) && !g0.I1(Uri.fromFile(file2), 0)) {
                    boolean[] zArr = {false};
                    boolean[] zArr2 = new boolean[1];
                    try {
                        org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(2, context, null);
                        s1Var2.n(bd.M0(2131748787, null));
                        s1Var2.setCanceledOnTouchOutside(false);
                        s1Var2.setCancelable(true);
                        s1Var2.setOnCancelListener(new wd(zArr, 1));
                        g0.i3(new xd(zArr2, s1Var2, 1), 250L);
                        s1Var = s1Var2;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        s1Var = null;
                    }
                    new Thread(new pj(file, file2, zArr, u10Var, s1Var, zArr2)).start();
                    return;
                }
                return;
            }
            d0(str, context, 0, null, null, u10Var);
        }
    }

    public static void f(MediaController mediaController, zi ziVar, int[] iArr, boolean z10, boolean z11, int i3) {
        zi ziVar2;
        le leVar = mediaController.f21311d1;
        if (mediaController.F0 != null) {
            if (i3 != 4 && i3 != 1) {
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
            if (i3 == 3) {
                mediaController.G0 = true;
                zi ziVar3 = mediaController.f21348v0;
                if (ziVar3 != null && (zi.M4(ziVar3.f26868k) || mediaController.f21348v0.i4())) {
                    g0.r(leVar);
                    w7.G(ziVar.I1).a0(mediaController.f21348v0.F0(), true, false);
                }
                mediaController.Q0 = true;
            } else if (i3 == 2) {
                if (z11 && (ziVar2 = mediaController.f21348v0) != null) {
                    if (zi.M4(ziVar2.f26868k) || mediaController.f21348v0.i4()) {
                        if (mediaController.G0) {
                            leVar.run();
                        } else {
                            g0.i3(leVar, 1000L);
                        }
                    }
                }
            } else if (mediaController.F0.d0() && i3 == 4) {
                zi ziVar4 = mediaController.f21348v0;
                if (ziVar4 != null && zi.M4(ziVar4.f26868k) && !z10 && (iArr == null || iArr[0] < 4)) {
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

    public static Uri f0(int i3, File file, String str) {
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
            if ((i3 == 0 || i3 == 1) && str2 != null) {
                if (str2.startsWith("image")) {
                    i3 = 0;
                }
                if (str2.startsWith("video")) {
                    i3 = 1;
                }
            }
            if (i3 == 0) {
                if (str == null) {
                    str = g0.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", str2);
            } else if (i3 == 1) {
                if (str == null) {
                    str = g0.p0(1, D);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i3 == 2) {
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
            Uri insert = t0.f25457b.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                g0.D(fileInputStream, t0.f25457b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static void g0(Context context, c cVar, ArrayList arrayList, kr krVar) {
        ei.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        ?? obj = new Object();
        obj.d = new HashMap();
        obj.f25853a = cVar;
        obj.f25855c = arrayList;
        obj.f25860s = krVar;
        obj.f25861w = ((zi) arrayList.get(0)).J3();
        int i3 = cVar.f21919a;
        hs.f(i3).b(obj, hs.Y1);
        hs.f(i3).b(obj, hs.X1);
        hs.f(i3).b(obj, hs.Z1);
        if (PhotoViewer.v1().U1()) {
            bVar = new ei.b();
        } else {
            bVar = null;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(2, context, bVar);
        obj.f25854b = s1Var;
        s1Var.n(bd.M0(2131748787, null));
        s1Var.setCancelable(true);
        s1Var.I = true;
        s1Var.setOnCancelListener(new wd(obj, 3));
        g0.i3(new ue(obj, 1), 250L);
        new Thread(new ue(obj, 2)).start();
    }

    public static native byte[] getWaveform(String str);

    public static native int isOpusFile(String str);

    public static void j0(boolean z10) {
        AudioManager audioManager = (AudioManager) t0.f25457b.getSystemService("audio");
        if (az.f21668u0 && !b8.nf.d("android.permission.BLUETOOTH_CONNECT")) {
            az.f21668u0 = false;
            az.y();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && az.f21668u0) || !z10) {
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

    public static boolean s0(int i3) {
        xi.a aVar = xi.e.f58878b;
        aVar.a();
        if (aVar.f58870c) {
            aVar.a();
            return aVar.d;
        } else if (!((h0) hp.s1(i3).f23167x7.f24655f0.f13688b).f22814c) {
            return true;
        } else {
            return false;
        }
    }

    private native int startRecord(String str, int i3);

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
            int i3 = 0;
            do {
                File g13 = g0.g1();
                if (i3 == 0) {
                    file = new File(g13, str);
                } else {
                    if (str.lastIndexOf(".") > 0) {
                        file = new File(g13, str.substring(0, lastIndexOf) + " (" + i3 + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(g13, str + " (" + i3 + ")");
                    }
                }
                i3++;
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
        for (int i3 = 0; i3 < trackCount; i3++) {
            String string = mediaExtractor.getTrackFormat(i3).getString("mime");
            if (z10) {
                if (string.startsWith("audio/")) {
                    return i3;
                }
            } else if (string.startsWith("video/")) {
                return i3;
            }
        }
        return -5;
    }

    public native int writeFrame(ByteBuffer byteBuffer, int i3);

    public static boolean y() {
        AudioDeviceInfo[] devices;
        try {
            for (AudioDeviceInfo audioDeviceInfo : us.f25751p0.getDevices(2)) {
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

    public final void A0(org.telegram.ui.wm wmVar, boolean z10, boolean z11) {
        int i3;
        if (this.P) {
            this.P = false;
            return;
        }
        if (z11) {
            if (this.f21319g1 != null && !K()) {
                D0(false);
            } else {
                if (z10) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                B0(i3, 0, false, false);
            }
        }
        if (this.Q && !this.P) {
            if ((this.f21315f != null || this.f21329n != null) && this.f21312e != null && this.f21341s == wmVar) {
                this.f21341s = null;
                this.Q = false;
                this.f21350w = false;
                this.J = false;
                this.f21338r = false;
                this.M = false;
                Utilities.f21387e.c(new od(this, 5));
                PowerManager.WakeLock wakeLock = this.d;
                if (wakeLock != null && wakeLock.isHeld()) {
                    this.d.release();
                }
            }
        }
    }

    public final void B0(final int i3, final int i10, final boolean z10, final boolean z11) {
        e0.g gVar;
        if (this.I1) {
            vi.f fVar = this.L1;
            if (fVar != null) {
                this.L1 = null;
                if (i3 == 0) {
                    x(false);
                    return;
                }
                this.C1 = i3;
                this.D1 = z10;
                this.E1 = i10;
                this.F1 = z11;
                s(fVar);
                return;
            } else if (this.J1) {
                if (this.C1 == 3) {
                    this.C1 = i3;
                    this.D1 = z10;
                    this.E1 = i10;
                    this.F1 = z11;
                    if (i3 == 0) {
                        e0.g gVar2 = this.G1;
                        if (gVar2 != null) {
                            gVar2.f9234b = false;
                            ((vi.j) gVar2.f9236e).b();
                        }
                        x(false);
                        return;
                    }
                    return;
                }
                return;
            } else if (i3 == 2 && (gVar = this.G1) != null && gVar.e()) {
                this.f21357y0 = false;
                this.f21338r = false;
                this.P = false;
                return;
            } else {
                ei.d1 d1Var = this.H1;
                if (d1Var != null) {
                    g0.r(d1Var);
                    this.H1 = null;
                }
                this.J1 = true;
                this.C1 = i3;
                this.D1 = z10;
                this.E1 = i10;
                this.F1 = z11;
                e0.g gVar3 = this.G1;
                if (gVar3 == null) {
                    x(false);
                } else {
                    vi.j jVar = (vi.j) gVar3.f9236e;
                    if (i3 == 0) {
                        gVar3.f9234b = false;
                        jVar.b();
                        x(false);
                    } else {
                        gVar3.f9234b = true;
                        jVar.getClass();
                        vi.j.q();
                        int i11 = jVar.e().f156a;
                        if (gVar3.f9234b && (i11 == 3 || i11 == 5)) {
                            gVar3.f9234b = false;
                            jVar.h();
                        }
                    }
                }
                try {
                    this.L0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                final int i12 = this.f21323i1;
                final int i13 = this.f21321h1;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        String[] strArr = MediaController.W1;
                        hs f10 = hs.f(i12);
                        Integer valueOf = Integer.valueOf(i13);
                        if (i3 == 2) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        f10.k(hs.f23271n2, valueOf, Integer.valueOf(i14));
                    }
                });
                return;
            }
        }
        pd pdVar = this.M1;
        p5 p5Var = this.N1;
        if (pdVar != null) {
            p5Var.a(pdVar);
            this.M1 = null;
        }
        p5Var.c(new Runnable() {
            @Override
            public final void run() {
                MediaController mediaController = MediaController.this;
                int i14 = mediaController.C1;
                int i15 = i3;
                boolean z12 = z10;
                int i16 = i10;
                boolean z13 = z11;
                if (i14 == 3) {
                    mediaController.C1 = 0;
                    mediaController.C0(i15, i16, z12, z13);
                    return;
                }
                AudioRecord audioRecord = mediaController.f21317f1;
                if (audioRecord == null) {
                    mediaController.f21319g1 = null;
                    mediaController.f21357y0 = false;
                    mediaController.f21338r = false;
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
                    if (mediaController.k1 != null) {
                        if (r2.f25040a) {
                            a8.d("delete voice file");
                        }
                        mediaController.k1.delete();
                    }
                }
                if (i15 == 0) {
                    mediaController.C0(0, 0, false, false);
                }
                try {
                    mediaController.L0.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                g0.h3(new sd(mediaController, i15, 0));
            }
        });
    }

    public final float C(boolean z10) {
        if (z10) {
            return this.f21339r0;
        }
        return this.f21336q0;
    }

    public final void C0(int i3, int i10, boolean z10, boolean z11) {
        MediaController mediaController;
        File file;
        if (i3 != 0 && (file = this.k1) != null) {
            TLRPC.TL_document tL_document = this.f21319g1;
            File file2 = this.f21325j1;
            if (r2.f25040a) {
                a8.b("stop recording internal filename " + this.k1.getPath());
            }
            mediaController = this;
            mediaController.O1.c(new gi.y8(mediaController, file2, file, tL_document, i3, z10, i10, z11));
        } else {
            mediaController = this;
            z0.b(mediaController.k1);
            File file3 = mediaController.k1;
            if (file3 != null) {
                file3.delete();
            }
            Y(false);
        }
        try {
            AudioRecord audioRecord = mediaController.f21317f1;
            if (audioRecord != null) {
                audioRecord.release();
                mediaController.f21317f1 = null;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        mediaController.f21319g1 = null;
        mediaController.f21325j1 = null;
        mediaController.k1 = null;
        mediaController.f21357y0 = false;
        mediaController.f21338r = false;
        mediaController.P = false;
    }

    public final long D(zi ziVar) {
        zi ziVar2 = this.f21348v0;
        if ((this.f21324j0 != null || this.F0 != null) && ziVar != null && ziVar2 != null && L(ziVar)) {
            try {
                m51 m51Var = this.f21324j0;
                if (m51Var != null) {
                    return m51Var.S();
                }
                m51 m51Var2 = this.F0;
                if (m51Var2 != null) {
                    return m51Var2.S();
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
                vi.j jVar = (vi.j) gVar2.f9236e;
                jVar.getClass();
                vi.j.q();
                int i3 = jVar.e().f156a;
                if (i3 == 3) {
                    ((vi.j) gVar2.f9236e).n();
                    return;
                } else if (i3 == 5) {
                    vi.j jVar2 = (vi.j) gVar2.f9236e;
                    jVar2.getClass();
                    vi.j.q();
                    if (jVar2.G == 5) {
                        jVar2.h.b("resume requested: trim=" + jVar2.f56996r + ".." + jVar2.f56997s + ", sourceDurationMs=" + jVar2.j());
                        jVar2.p();
                        jVar2.s(6);
                        vi.i iVar = jVar2.f57003z;
                        if (iVar == null) {
                            jVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j10 = jVar2.f56996r;
                        long j11 = jVar2.f56997s;
                        if (j11 >= vi.j.r(jVar2.f56994p)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        jVar2.k(1);
                        long j12 = ((j11 - j10) * 48000) / 1000;
                        jVar2.f56994p = j12;
                        jVar2.f56996r = 0L;
                        jVar2.f56997s = vi.j.r(j12);
                        jVar2.d();
                        jVar2.h.b("resume prefix selected: source=" + iVar.f56978b.getName() + ", trim=" + j10 + ".." + j11);
                        File file = iVar.f56978b;
                        if (z11) {
                            j11 = -1;
                        }
                        jVar2.u(j10, j11, file);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        this.N1.c(new qd(this, z10, 0));
    }

    public final boolean E0(int i3, ArrayList arrayList) {
        boolean z10;
        int size;
        zi ziVar;
        int i10;
        zi ziVar2;
        int i11 = this.V0;
        int i12 = 0;
        if (ConnectionsManager.getInstance(h10.f22829t0).getConnectionState() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V0 += i3;
        if (z10) {
            while (this.V0 < arrayList.size() && (i10 = this.V0) >= 0 && ((ziVar2 = (zi) arrayList.get(i10)) == null || !ziVar2.f26917x0)) {
                this.V0 += i3;
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
                if (i3 > 0) {
                    if (i14 > i11) {
                        break;
                    }
                    ziVar = (zi) arrayList.get(this.V0);
                    if (ziVar == null && ziVar.f26917x0) {
                        break;
                    }
                    this.V0 += i3;
                } else {
                    if (i14 < i11) {
                        break;
                    }
                    ziVar = (zi) arrayList.get(this.V0);
                    if (ziVar == null) {
                    }
                    this.V0 += i3;
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
        zi ziVar = this.f21348v0;
        if (ziVar == null || ((!zi.S4(ziVar.f26868k) && !this.f21348v0.i4()) || (arrayList = this.f21316f0) == null || arrayList.size() <= 1 || !this.f21316f0.contains(this.f21348v0) || this.f21316f0.indexOf(this.f21348v0) >= this.f21316f0.size() - 1)) {
            return true;
        }
        return false;
    }

    public final void F0() {
        zi ziVar = this.f21348v0;
        if (ziVar != null && H() && this.f21322i0 && (zi.S4(ziVar.f26868k) || ziVar.J3())) {
            S(ziVar);
        }
        this.f21322i0 = false;
    }

    public final void G0(File file, long j10, byte[] bArr) {
        TLRPC.TL_document tL_document = this.f21319g1;
        if (tL_document == null) {
            return;
        }
        tL_document.date = ConnectionsManager.getInstance(this.f21323i1).getCurrentTime();
        this.f21319g1.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        tL_documentAttributeAudio.waveform = bArr;
        if (bArr != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = j10 / 1000.0d;
        this.f21319g1.attributes.clear();
        this.f21319g1.attributes.add(tL_documentAttributeAudio);
    }

    public final boolean H() {
        if (!this.f21320h0 && !this.B0) {
            return false;
        }
        return true;
    }

    public final boolean I(zi ziVar) {
        zi ziVar2;
        boolean z10;
        if (ziVar == null || !ziVar.f26857h2) {
            if ((this.f21324j0 != null || this.F0 != null) && ziVar != null && (ziVar2 = this.f21348v0) != null) {
                long j10 = ziVar2.T;
                if (j10 != 0 && j10 == ziVar.T) {
                    z10 = this.B0;
                } else if (L(ziVar)) {
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
        if (this.M1 == null && this.H1 == null && this.f21319g1 == null) {
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
        return this.f21314e1;
    }

    public final boolean L(zi ziVar) {
        boolean z10;
        boolean z11;
        zi ziVar2 = this.f21348v0;
        if (ziVar2 != null && zi.B0(ziVar2.f26868k) == zi.B0(ziVar.f26868k) && this.f21348v0.f1() == ziVar.f1()) {
            if (this.f21348v0.T == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ziVar.T == 0) {
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
                if (file2 == this.k1) {
                    this.k1 = file3;
                }
                file2 = file3;
            }
            file.delete();
            if (file == this.f21325j1) {
                this.f21325j1 = null;
            }
        }
        return file2;
    }

    public final void P() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.P():void");
    }

    public final boolean R(zi ziVar, boolean z10) {
        if ((this.f21324j0 != null || this.F0 != null) && ziVar != null && this.f21348v0 != null && L(ziVar)) {
            z0();
            try {
                if (this.f21324j0 != null) {
                    if (z10 && !d1.f.u() && !zi.S4(this.f21348v0.f26868k) && this.f21348v0.L0() * (1.0f - this.f21348v0.f26828b0) > 1.0d && LaunchActivity.I1) {
                        ValueAnimator valueAnimator = this.R1;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            this.R1.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        this.R1 = ofFloat;
                        ofFloat.addUpdateListener(this.S1);
                        this.R1.setDuration(300L);
                        this.R1.addListener(new ii.v3(this, 6));
                        this.R1.start();
                    } else {
                        this.f21324j0.g0();
                    }
                } else {
                    m51 m51Var = this.F0;
                    if (m51Var != null) {
                        m51Var.g0();
                    }
                }
                this.f21320h0 = true;
                hs.f(this.f21348v0.I1).k(hs.f23233g2, Integer.valueOf(this.f21348v0.f1()));
                try {
                    d1.f.b(1);
                    if (!this.U1) {
                        if (tf.b.t().u()) {
                            tf.b.t().z(z());
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
                this.f21320h0 = false;
            }
        }
        return false;
    }

    public final boolean S(final org.telegram.messenger.zi r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.S(org.telegram.messenger.zi):boolean");
    }

    public final void T(int i3) {
        int i10 = this.V0;
        if (i10 >= 0) {
            ArrayList arrayList = this.S0;
            if (i10 < arrayList.size()) {
                this.V0 = i3;
                this.C0 = true;
                zi ziVar = (zi) arrayList.get(i3);
                if (this.f21348v0 != null && !L(ziVar)) {
                    this.f21348v0.H5();
                }
                S(ziVar);
            }
        }
    }

    public final void U(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        int i3;
        int i10;
        if (az.N0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (z10 && (((i10 = az.S0) == 2 || (i10 == 1 && arrayList.size() == 1)) && !this.W0)) {
            q(false, false, false, false);
            int i11 = this.V0;
            if (i11 >= 0 && i11 < arrayList.size()) {
                zi ziVar = (zi) arrayList.get(this.V0);
                ziVar.f26828b0 = 0.0f;
                ziVar.f26851g0 = 0;
                S(ziVar);
                return;
            }
            return;
        }
        if (this.R0 != null) {
            if (!az.O0) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = az.O0;
        }
        if (z11) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        if (E0(i3, arrayList) && z10 && az.S0 == 0 && !this.W0) {
            m51 m51Var = this.f21324j0;
            if (m51Var != null || this.F0 != null) {
                if (m51Var != null) {
                    we weVar = this.f21354x0;
                    if (weVar != null) {
                        weVar.b();
                        this.f21354x0 = null;
                    }
                    try {
                        this.f21324j0.m0();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    this.f21324j0 = null;
                    org.telegram.ui.ActionBar.k6.N1(this.f21348v0);
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
                    g0.r(this.f21311d1);
                    w7.G(this.f21348v0.I1).a0(this.f21348v0.F0(), true, false);
                }
                z0();
                this.f21320h0 = true;
                zi ziVar2 = this.f21348v0;
                ziVar2.f26828b0 = 0.0f;
                ziVar2.f26851g0 = 0;
                hs.f(ziVar2.I1).k(hs.f23221e2, Integer.valueOf(this.f21348v0.f1()), 0);
                hs.f(this.f21348v0.I1).k(hs.f23233g2, Integer.valueOf(this.f21348v0.f1()));
                return;
            }
            return;
        }
        int i12 = this.V0;
        if (i12 >= 0 && i12 < arrayList.size()) {
            zi ziVar3 = this.f21348v0;
            if (ziVar3 != null) {
                ziVar3.H5();
            }
            this.C0 = true;
            S((zi) arrayList.get(this.V0));
        }
    }

    public final void V() {
        ArrayList arrayList;
        int i3;
        boolean z10;
        int i10;
        if (az.N0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (!arrayList.isEmpty() && (i3 = this.V0) >= 0 && i3 < arrayList.size()) {
            zi ziVar = (zi) arrayList.get(this.V0);
            if (ziVar.f26851g0 > 10) {
                i0(ziVar, 0.0f);
                return;
            }
            if (this.R0 != null) {
                if (!az.O0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = az.O0;
            }
            if (z10) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            E0(i10, arrayList);
            if (this.V0 < arrayList.size()) {
                this.C0 = true;
                S((zi) arrayList.get(this.V0));
            }
        }
    }

    public final void W(boolean z10) {
        zv zvVar;
        long j10;
        if (this.f21319g1 != null) {
            D0(false);
        } else if (z10) {
            int currentAccount = this.f21341s.getCurrentAccount();
            long a10 = this.f21341s.a();
            org.telegram.ui.wm wmVar = this.f21341s;
            zi ziVar = wmVar.f51397m4;
            int classGuid = wmVar.getClassGuid();
            org.telegram.ui.wm wmVar2 = this.f21341s;
            ej ejVar = null;
            if (wmVar2 != null) {
                zvVar = wmVar2.W8();
            } else {
                zvVar = null;
            }
            org.telegram.ui.wm wmVar3 = this.f21341s;
            if (wmVar3 != null) {
                j10 = wmVar3.h9();
            } else {
                j10 = 0;
            }
            org.telegram.ui.wm wmVar4 = this.f21341s;
            if (wmVar4 != null) {
                ejVar = wmVar4.f51540x5;
            }
            x0(currentAccount, a10, null, ziVar, null, classGuid, false, zvVar, j10, ejVar);
        } else {
            B0(2, 0, false, false);
        }
    }

    public final boolean X() {
        vi.f fVar = this.L1;
        if (fVar != null) {
            File file = (File) fVar.f56972b;
            z0.b(file);
            file.delete();
            Z();
            return true;
        }
        e0.g gVar = this.G1;
        if (gVar != null && gVar.e()) {
            this.G1 = null;
            if (!gVar.c()) {
                ((vi.j) gVar.f9236e).o();
                gVar.f9235c = true;
            }
            Z();
            return true;
        }
        return false;
    }

    public final void Y(boolean z10) {
        nd ndVar = this.f21301a;
        if (z10) {
            if (!this.W && az.F0 && us.f25751p0.requestAudioFocus(ndVar, 3, 2) == 1) {
                this.W = true;
            }
        } else if (this.W) {
            us.f25751p0.abandonAudioFocus(ndVar);
            this.W = false;
        }
    }

    public final void Z() {
        this.f21319g1 = null;
        this.f21325j1 = null;
        this.k1 = null;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.L1 = null;
        this.C1 = 0;
    }

    public final boolean a0() {
        ArrayList arrayList;
        int i3;
        zi ziVar;
        af afVar = this.V1;
        if (afVar != null) {
            zi ziVar2 = afVar.f21506a;
            this.V1 = null;
            if (az.N0) {
                arrayList = this.U0;
            } else {
                arrayList = this.S0;
            }
            if (arrayList != null && (i3 = this.V0) >= 0 && i3 < arrayList.size() && (ziVar = (zi) arrayList.get(this.V0)) != null && zi.B0(ziVar.f26868k) == zi.B0(ziVar2.f26868k) && ziVar.f1() == ziVar2.f1()) {
                this.C0 = false;
                float f10 = afVar.f21507b;
                ziVar.f26833c0 = f10;
                ziVar.f26828b0 = f10;
                ziVar.f26836d0 = afVar.f21508c;
                ziVar.f26851g0 = afVar.d;
                S(ziVar);
                R(ziVar, false);
                return true;
            }
        }
        return false;
    }

    public final void b0(zi ziVar) {
        if ((this.f21324j0 != null || this.F0 != null) && ziVar != null && this.f21348v0 != null && L(ziVar)) {
            try {
                v0(this.f21348v0);
                ValueAnimator valueAnimator = this.R1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.R1.cancel();
                }
                if (!zi.S4(ziVar.f26868k) && !ziVar.i4()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 1.0f);
                    this.R1 = ofFloat;
                    ofFloat.addUpdateListener(this.S1);
                    this.R1.setDuration(300L);
                    this.R1.start();
                } else {
                    this.Q1 = 1.0f;
                    n0();
                }
                m51 m51Var = this.f21324j0;
                if (m51Var != null) {
                    m51Var.h0();
                } else {
                    m51 m51Var2 = this.F0;
                    if (m51Var2 != null) {
                        m51Var2.h0();
                    }
                }
                j(ziVar);
                this.f21320h0 = false;
                hs.f(this.f21348v0.I1).k(hs.f23233g2, Integer.valueOf(this.f21348v0.f1()));
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
        zi ziVar;
        m51 m51Var = this.f21324j0;
        if (m51Var != null && (ziVar = this.f21348v0) != null && !this.f21320h0) {
            if (m51Var.d != null && m51Var.M == 2) {
                q(false, false, false, false);
                S(ziVar);
                return;
            }
            m51Var.h0();
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        bp bpVar;
        zi ziVar;
        ArrayList arrayList;
        char c10;
        int indexOf;
        int i11 = 0;
        if (i3 != hs.Y1 && i3 != hs.R1) {
            if (i3 == hs.f23325w) {
                if (!((Boolean) objArr[2]).booleanValue()) {
                    long longValue = ((Long) objArr[1]).longValue();
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    zi ziVar2 = this.f21348v0;
                    if (ziVar2 != null && longValue == ziVar2.f26868k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(ziVar2.f1()))) {
                        q(true, true, false, false);
                    }
                    ArrayList arrayList3 = this.f21316f0;
                    if (arrayList3 != null && !arrayList3.isEmpty() && longValue == ((zi) this.f21316f0.get(0)).f26868k.peer_id.channel_id) {
                        while (i11 < arrayList2.size()) {
                            Integer num = (Integer) arrayList2.get(i11);
                            zi ziVar3 = (zi) this.f21318g0.get(num.intValue());
                            this.f21318g0.remove(num.intValue());
                            if (ziVar3 != null) {
                                this.f21316f0.remove(ziVar3);
                            }
                            i11++;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i3 == hs.f23219e0) {
                long longValue2 = ((Long) objArr[0]).longValue();
                zi ziVar4 = this.f21348v0;
                if (ziVar4 != null && zi.B0(ziVar4.f26868k) == longValue2) {
                    q(false, true, false, false);
                    return;
                }
                return;
            } else {
                int i12 = hs.K0;
                int[] iArr = this.f21309c1;
                HashMap hashMap = this.T0;
                ArrayList arrayList4 = this.S0;
                if (i3 == i12) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    long longValue4 = ((Long) objArr[3]).longValue();
                    zi ziVar5 = this.f21348v0;
                    if (ziVar5 != null && ziVar5.J3() && zi.B0(this.f21348v0.f26868k) == longValue3 && this.f21306b1 == longValue4 && !this.f21348v0.f26887p1) {
                        arrayList4.addAll(0, (ArrayList) objArr[1]);
                        arrayList4.addAll((ArrayList) objArr[2]);
                        int size = arrayList4.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            zi ziVar6 = (zi) arrayList4.get(i13);
                            hashMap.put(Integer.valueOf(ziVar6.f1()), ziVar6);
                            iArr[0] = Math.min(iArr[0], ziVar6.f1());
                        }
                        t0();
                        if (az.N0) {
                            g();
                        } else {
                            zi ziVar7 = this.f21348v0;
                            if (ziVar7 != null && (indexOf = arrayList4.indexOf(ziVar7)) >= 0) {
                                this.V0 = indexOf;
                            }
                        }
                        this.f21303a1 = ConnectionsManager.generateClassGuid();
                        return;
                    }
                    return;
                }
                int i14 = hs.V;
                int i15 = hs.L0;
                if (i3 == i14) {
                    if (((Integer) objArr[3]).intValue() == this.f21303a1 && this.f21348v0 != null) {
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
                            zi ziVar8 = (zi) arrayList5.get(i17);
                            if (!ziVar8.T4() && !hashMap.containsKey(Integer.valueOf(ziVar8.f1()))) {
                                i16++;
                                arrayList4.add(0, ziVar8);
                                hashMap.put(Integer.valueOf(ziVar8.f1()), ziVar8);
                                iArr[c10] = Math.min(iArr[c10], ziVar8.f1());
                            }
                        }
                        t0();
                        int indexOf2 = arrayList4.indexOf(this.f21348v0);
                        if (indexOf2 >= 0) {
                            this.V0 = indexOf2;
                        }
                        this.Y0 = false;
                        if (az.N0) {
                            g();
                        }
                        if (i16 != 0) {
                            hs.f(this.f21348v0.I1).k(i15, Integer.valueOf(i16));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    if (!((Boolean) objArr[2]).booleanValue() && (arrayList = this.f21316f0) != null && !arrayList.isEmpty() && ((Long) objArr[0]).longValue() == zi.B0(((zi) this.f21316f0.get(0)).f26868k)) {
                        ArrayList arrayList6 = (ArrayList) objArr[1];
                        while (i11 < arrayList6.size()) {
                            zi ziVar9 = (zi) arrayList6.get(i11);
                            if ((zi.S4(ziVar9.f26868k) || ziVar9.i4()) && !ziVar9.T4() && !ziVar9.h4() && (!this.f21313e0 || (ziVar9.f26868k.media_unread && !ziVar9.O3()))) {
                                this.f21316f0.add(ziVar9);
                                this.f21318g0.put(ziVar9.f1(), ziVar9);
                            }
                            i11++;
                        }
                        return;
                    }
                    return;
                } else if (i3 == hs.H4) {
                    m51 m51Var = (m51) objArr[0];
                    if (this.F0 != m51Var && this.f21324j0 != m51Var) {
                        zi ziVar10 = this.f21348v0;
                        if (ziVar10 != null && I(ziVar10) && !H() && (ziVar10.J3() || zi.S4(ziVar10.f26868k))) {
                            this.f21322i0 = true;
                        }
                        R(ziVar10, true);
                        return;
                    }
                    return;
                } else if (i3 == hs.T3 && (bpVar = this.R0) != null && objArr[0] == bpVar) {
                    int size2 = bpVar.f21866c.size() - arrayList4.size();
                    arrayList4.clear();
                    arrayList4.addAll(this.R0.f21866c);
                    t0();
                    if (az.N0) {
                        g();
                    } else {
                        zi ziVar11 = this.f21348v0;
                        if (ziVar11 != null) {
                            int indexOf3 = arrayList4.indexOf(ziVar11);
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
                                    S((zi) arrayList4.get(0));
                                }
                            }
                        }
                    }
                    if (size2 != 0 && (ziVar = this.f21348v0) != null) {
                        hs.f(ziVar.I1).k(i15, Integer.valueOf(size2));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        String str = (String) objArr[0];
        zi ziVar12 = this.f21348v0;
        if (ziVar12 != null && ziVar12.I1 == i10 && w7.r(null, ziVar12.F0()).equals(str)) {
            if (this.B0) {
                this.C0 = true;
                S(this.f21348v0);
            } else if (this.E0 == null) {
                try {
                    w7.G(h10.f22829t0);
                    this.E0 = of.a.a(w7.N(this.f21348v0.f26868k, false, true));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void g() {
        zi ziVar;
        ArrayList arrayList = this.S0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            ArrayList arrayList3 = this.U0;
            arrayList3.clear();
            int i3 = this.V0;
            if (i3 >= 0 && i3 < arrayList.size()) {
                ziVar = (zi) arrayList.get(this.V0);
                arrayList2.remove(this.V0);
            } else {
                ziVar = null;
            }
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                int nextInt = Utilities.f21385b.nextInt(arrayList2.size());
                arrayList3.add((zi) arrayList2.get(nextInt));
                arrayList2.remove(nextInt);
            }
            if (ziVar != null) {
                arrayList3.add(ziVar);
                this.V0 = arrayList3.size() - 1;
            }
        }
    }

    public native byte[] getWaveform2(short[] sArr, int i3);

    public final boolean h() {
        zi ziVar = this.f21348v0;
        if (ziVar != null) {
            if ((ziVar.J3() || zi.S4(this.f21348v0.f26868k) || this.f21348v0.i4()) && !this.f21348v0.T4() && !this.f21348v0.h4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h0(zi ziVar, boolean z10, boolean z11, boolean z12) {
        b20 b20Var;
        if (ziVar != null) {
            b20Var = ziVar.f26886p0;
        } else {
            b20Var = null;
        }
        if (ziVar != null && b20Var != null) {
            ArrayList arrayList = this.f21308c0;
            if (!z10 || arrayList.isEmpty()) {
                if (z10) {
                    new File(ziVar.f26868k.attachPath).delete();
                }
                ?? obj = new Object();
                obj.f22014a = ziVar;
                obj.f22016c = ziVar.I1;
                obj.f22015b = b20Var;
                obj.d = z12;
                arrayList.add(obj);
                if (z11) {
                    this.f21302a0.add(obj);
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

    public final void i(zi ziVar) {
        if (ziVar != null && !this.f21308c0.isEmpty()) {
            for (int i3 = 0; i3 < this.f21308c0.size(); i3++) {
                cf cfVar = (cf) this.f21308c0.get(i3);
                zi ziVar2 = cfVar.f22014a;
                if (ziVar2.T(ziVar) && ziVar2.I1 == ziVar.I1) {
                    if (i3 == 0) {
                        synchronized (this.f21304b) {
                            cfVar.f22015b.W = true;
                        }
                        return;
                    }
                    this.f21302a0.remove((cf) this.f21308c0.remove(i3));
                    k(true);
                    return;
                }
            }
        }
    }

    public final void i0(zi ziVar, float f10) {
        zi ziVar2 = this.f21348v0;
        if ((this.f21324j0 != null || this.F0 != null) && ziVar != null && ziVar2 != null && L(ziVar)) {
            try {
                m51 m51Var = this.f21324j0;
                if (m51Var != null) {
                    long U = m51Var.U();
                    if (U == -9223372036854775807L) {
                        this.f21346u0 = f10;
                    } else {
                        ziVar2.f26828b0 = f10;
                        long j10 = (int) (((float) U) * f10);
                        this.f21324j0.q0(j10, false);
                        if (!this.U1) {
                            d1.f.v(j10);
                        }
                    }
                } else {
                    m51 m51Var2 = this.F0;
                    if (m51Var2 != null) {
                        m51Var2.p0(((float) m51Var2.U()) * f10);
                        if (!this.U1) {
                            d1.f.v(((float) this.F0.U()) * f10);
                        }
                    }
                }
                hs.f(ziVar.I1).k(hs.f23245i2, Integer.valueOf(ziVar2.f1()), Float.valueOf(f10));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void j(zi ziVar) {
        int i3;
        int i10;
        int requestAudioFocus;
        if (!zi.S4(ziVar.f26868k) && !ziVar.i4()) {
            i3 = 1;
        } else if (this.M) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        if (this.V != i3) {
            this.V = i3;
            if (i3 == 3) {
                requestAudioFocus = us.f25751p0.requestAudioFocus(this, 0, 1);
            } else {
                AudioManager audioManager = us.f25751p0;
                if (i3 == 2 && !az.G0) {
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
        if (!this.f21302a0.isEmpty()) {
            this.f21305b0 = (cf) this.f21302a0.get(0);
        } else {
            this.f21305b0 = null;
        }
        if (this.f21305b0 != null || z10) {
            if (VideoEncodingService.f21394e == null) {
                try {
                    t0.f25457b.startService(new Intent(t0.f25457b, VideoEncodingService.class));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else if (z10) {
                cf cfVar = B().f21305b0;
                VideoEncodingService videoEncodingService = VideoEncodingService.f21394e;
                if (videoEncodingService.f21396b != cfVar) {
                    if (cfVar != null) {
                        videoEncodingService.a(cfVar);
                    } else {
                        videoEncodingService.stopSelf();
                    }
                }
            }
        }
    }

    public final void k0(boolean z10) {
        org.telegram.ui.l4 l4Var = this.M0;
        if (l4Var != null) {
            if (z10) {
                PipRoundVideoView pipRoundVideoView = this.I0;
                if (pipRoundVideoView != null) {
                    this.J0 = 2;
                    pipRoundVideoView.a(true);
                    this.I0 = null;
                    return;
                }
                if (l4Var.getParent() == null) {
                    this.O0.addView(this.M0);
                }
                this.F0.A0(this.H0);
            } else if (l4Var.getParent() != null) {
                this.J0 = 1;
                this.O0.removeView(this.M0);
            } else {
                if (this.I0 == null) {
                    try {
                        PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                        this.I0 = pipRoundVideoView2;
                        pipRoundVideoView2.d(this.K0, new od(this, 4));
                    } catch (Exception unused) {
                        this.I0 = null;
                    }
                }
                PipRoundVideoView pipRoundVideoView3 = this.I0;
                if (pipRoundVideoView3 != null) {
                    this.F0.A0(pipRoundVideoView3.f31499c);
                }
            }
        }
    }

    public final void l(int i3) {
        ArrayList arrayList;
        boolean z10;
        int i10;
        File N;
        z5 q10 = z5.q(i3);
        int e10 = t0.e();
        int i11 = 2;
        if (e10 == 1) {
            if (!q10.O.f26529g || !q10.p().d) {
                return;
            }
        } else if (e10 == 2) {
            if (!q10.P.f26529g || !q10.o().d) {
                return;
            }
        } else if (!q10.N.f26529g || !q10.n().d) {
            return;
        }
        if (az.N0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (arrayList != null && arrayList.size() >= 2) {
            if (this.R0 != null) {
                if (!az.O0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = az.O0;
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
                zi ziVar = (zi) arrayList.get(i10);
                File file = null;
                if (!TextUtils.isEmpty(ziVar.f26868k.attachPath)) {
                    File file2 = new File(ziVar.f26868k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file != null) {
                    N = file;
                } else {
                    w7.G(i3);
                    N = w7.N(ziVar.f26868k, false, true);
                }
                N.exists();
                if (N != file && !N.exists() && ziVar.J3()) {
                    w7 G = w7.G(i3);
                    TLRPC.Document F0 = ziVar.F0();
                    if (!zi.S5(ziVar.f26868k)) {
                        i11 = 0;
                    }
                    G.X(F0, ziVar, 0, i11);
                }
            }
        }
    }

    public final void l0(int i3) {
        boolean z10 = az.N0;
        if (i3 == 2) {
            az.N0 = true;
            az.O0 = false;
        } else if (i3 == 1) {
            az.O0 = true;
            az.N0 = false;
        } else {
            az.O0 = false;
            az.N0 = false;
        }
        MediaController B = B();
        zi ziVar = B.f21348v0;
        if (ziVar != null && ziVar.J3()) {
            B.l(B.f21348v0.I1);
        }
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("shuffleMusic", az.N0);
        edit.putBoolean("playOrderReversed", az.O0);
        edit.apply();
        boolean z11 = az.N0;
        if (z10 != z11) {
            if (z11) {
                g();
                return;
            }
            zi ziVar2 = this.f21348v0;
            if (ziVar2 != null) {
                int indexOf = this.S0.indexOf(ziVar2);
                this.V0 = indexOf;
                if (indexOf == -1) {
                    r();
                    q(true, true, false, false);
                }
            }
        }
    }

    public final void m() {
        int i3;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - f21299g2) >= 5000) {
                AudioManager audioManager = (AudioManager) t0.f25457b.getSystemService("audio");
                if (this.M) {
                    i3 = 0;
                } else {
                    i3 = 3;
                }
                int streamVolume = audioManager.getStreamVolume(i3);
                if (streamVolume == 0) {
                    audioManager.adjustStreamVolume(i3, streamVolume, 1);
                    f21299g2 = currentTimeMillis;
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
            if (this.f21339r0 >= 6.0f && f10 == 1.0f && this.f21348v0 != null) {
                this.f21324j0.g0();
                zi ziVar = this.f21348v0;
                g0.i3(new ce(this, ziVar, ziVar.f26828b0, 0), 50L);
            }
            this.f21339r0 = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.f21344t0 = f10;
            }
        } else {
            this.f21336q0 = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.f21342s0 = f10;
            }
        }
        m51 m51Var = this.f21324j0;
        if (m51Var != null) {
            m51Var.v0(Math.round(f10 * 10.0f) / 10.0f);
        } else {
            m51 m51Var2 = this.F0;
            if (m51Var2 != null) {
                m51Var2.v0(Math.round(f10 * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor edit = hp.e1().edit();
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
            f11 = this.f21344t0;
        } else {
            f11 = this.f21342s0;
        }
        putFloat.putFloat(str2, f11).commit();
        hs.e().k(hs.J4, new Object[0]);
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
            ei.d1 d1Var = this.H1;
            if (d1Var != null) {
                g0.r(d1Var);
                this.H1 = null;
            }
            if (!z10 && (gVar2 = this.G1) != null) {
                z11 = gVar2.c();
            } else {
                z11 = false;
            }
            if (!z11 && (gVar = this.G1) != null) {
                gVar.f9234b = false;
                ((vi.j) gVar.f9236e).b();
            }
            if (z11 && (file3 = this.k1) != null) {
                z0.b(file3);
            }
            x(!z10);
            return;
        }
        this.f21319g1 = null;
        z0.b(this.k1);
        if (z10 && (file2 = this.k1) != null) {
            try {
                file2.delete();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        this.k1 = null;
        if (z10 && (file = this.f21325j1) != null) {
            file.delete();
        }
        this.f21325j1 = null;
        this.f21357y0 = false;
        this.f21338r = false;
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
            m51 m51Var = this.f21324j0;
            float f11 = 0.0f;
            if (m51Var != null) {
                if (!d1.f.u()) {
                    f11 = this.Q1 * f10;
                }
                m51Var.B0(f11);
                return;
            }
            m51 m51Var2 = this.F0;
            if (m51Var2 != null) {
                if (d1.f.u()) {
                    f10 = 0.0f;
                }
                m51Var2.B0(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void o() {
        q(true, true, false, false);
        this.E0 = null;
        this.C0 = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z5 q10 = z5.q(i3);
            q10.f26739b.clear();
            q10.f26740c.clear();
            q10.d.clear();
            q10.f26741e.clear();
            q10.f26742f.clear();
            q10.h.clear();
            q10.G.b();
        }
        this.f21308c0.clear();
        this.f21310d0.clear();
        this.V1 = null;
        this.f21316f0 = null;
        this.f21318g0 = null;
        r();
    }

    public final boolean o0(ArrayList arrayList, zi ziVar, long j10, boolean z10, g2.b0 b0Var, long j11) {
        HashMap hashMap;
        zi ziVar2 = this.f21348v0;
        ArrayList arrayList2 = this.S0;
        if (ziVar2 == ziVar) {
            int indexOf = arrayList2.indexOf(ziVar);
            if (indexOf >= 0) {
                this.V0 = indexOf;
            }
            return S(ziVar);
        }
        this.W0 = !z10;
        this.Z0 = j10;
        this.C0 = !arrayList2.isEmpty();
        r();
        this.D0 = b0Var;
        this.f21306b1 = j11;
        boolean z11 = false;
        if (!arrayList.isEmpty() && m5.C(zi.B0(((zi) arrayList.get(0)).f26868k))) {
            z11 = true;
        }
        int size = arrayList.size() - 1;
        int i3 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        while (true) {
            hashMap = this.T0;
            if (size < 0) {
                break;
            }
            zi ziVar3 = (zi) arrayList.get(size);
            if (ziVar3.J3()) {
                int f12 = ziVar3.f1();
                if (f12 > 0 || z11) {
                    i3 = Math.min(i3, f12);
                    i10 = Math.max(i10, f12);
                }
                arrayList2.add(ziVar3);
                hashMap.put(Integer.valueOf(f12), ziVar3);
            }
            size--;
        }
        t0();
        int indexOf2 = arrayList2.indexOf(ziVar);
        this.V0 = indexOf2;
        if (indexOf2 == -1) {
            r();
            this.V0 = arrayList2.size();
            arrayList2.add(ziVar);
            hashMap.put(Integer.valueOf(ziVar.f1()), ziVar);
        }
        if (ziVar.J3() && !ziVar.f26887p1) {
            if (az.N0) {
                g();
            }
            if (z10) {
                if (this.D0 == null) {
                    final li b02 = li.b0(ziVar.I1);
                    final long B0 = zi.B0(ziVar.f26868k);
                    final long j12 = this.f21306b1;
                    final long j13 = i3;
                    final long j14 = i10;
                    b02.getMessagesStorage().f24934a.c(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mh.run():void");
                        }
                    });
                } else {
                    this.f21303a1 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return S(ziVar);
    }

    @Override
    public final void onAudioFocusChange(int i3) {
        g0.h3(new sd(this, i3, 1));
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public final void p(boolean z10, boolean z11) {
        q(z10, z11, false, false);
    }

    public final void p0(TextureView textureView, org.telegram.ui.l4 l4Var, FrameLayout frameLayout, boolean z10) {
        if (textureView != null) {
            boolean z11 = true;
            if (!z10 && this.H0 == textureView) {
                this.J0 = 1;
                this.H0 = null;
                this.M0 = null;
                this.O0 = null;
                return;
            }
            m51 m51Var = this.F0;
            if (m51Var != null && textureView != this.H0) {
                if (l4Var == null || !l4Var.d) {
                    z11 = false;
                }
                this.N0 = z11;
                this.H0 = textureView;
                PipRoundVideoView pipRoundVideoView = this.I0;
                if (pipRoundVideoView != null) {
                    m51Var.A0(pipRoundVideoView.f31499c);
                } else {
                    m51Var.A0(textureView);
                }
                this.M0 = l4Var;
                this.O0 = frameLayout;
                if (this.Q0 && l4Var != null) {
                    l4Var.a(this.P0, 0);
                }
            }
        }
    }

    public final void q(boolean r21, boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.q(boolean, boolean, boolean, boolean):void");
    }

    public final void q0() {
        this.M = true;
        AudioManager audioManager = us.f25751p0;
        audioManager.setBluetoothScoOn(false);
        audioManager.setSpeakerphoneOn(false);
    }

    public final void r() {
        this.R0 = null;
        this.S0.clear();
        this.T0.clear();
        this.U0.clear();
        this.f21303a1 = 0;
        boolean[] zArr = this.X0;
        zArr[1] = false;
        zArr[0] = false;
        this.Z0 = 0L;
        this.f21306b1 = 0L;
        int[] iArr = this.f21309c1;
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
        this.f21316f0 = arrayList2;
        if (arrayList2 != null) {
            this.f21313e0 = z10;
            this.f21318g0 = new SparseArray();
            for (int i3 = 0; i3 < this.f21316f0.size(); i3++) {
                zi ziVar = (zi) this.f21316f0.get(i3);
                this.f21318g0.put(ziVar.f1(), ziVar);
            }
        }
    }

    public final void s(vi.f fVar) {
        byte[] bArr;
        TLRPC.TL_document tL_document;
        int i3;
        File file = (File) fVar.f56972b;
        this.k1 = file;
        long j10 = fVar.f56971a;
        this.f21328l1 = j10;
        byte[] bArr2 = (byte[]) fVar.f56973c;
        String str = null;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr2.clone();
        }
        G0(file, j10, bArr);
        if (this.C1 == 3) {
            this.L1 = fVar;
            e0.g gVar = this.G1;
            if (gVar != null) {
                ((vi.j) gVar.f9236e).o();
                gVar.f9235c = true;
                this.G1 = null;
            }
            Y(false);
            j0(false);
            return;
        }
        li.b0(this.f21323i1).B1(this.f21331n1, this.f21333o1, null);
        if (this.C1 == 1) {
            TLRPC.TL_document tL_document2 = this.f21319g1;
            String absolutePath = file.getAbsolutePath();
            long j11 = this.f21331n1;
            zi ziVar = this.f21340r1;
            zi ziVar2 = this.f21343s1;
            boolean z10 = this.D1;
            int i10 = this.E1;
            if (this.F1) {
                i3 = Integer.MAX_VALUE;
            } else {
                i3 = 0;
            }
            wy f10 = wy.f(tL_document2, null, absolutePath, j11, ziVar, ziVar2, null, null, null, null, z10, i10, 0, i3, null, null, false);
            f10.R = this.f21335p1;
            f10.T = this.f21337q1;
            f10.H = this.f21345t1;
            f10.K = this.f21347u1;
            f10.Q = 0L;
            yy.C(this.f21323i1).r0(f10);
        }
        hs f11 = hs.f(this.f21323i1);
        Integer valueOf = Integer.valueOf(this.f21321h1);
        int i11 = this.C1;
        if (i11 == 2) {
            tL_document = this.f21319g1;
        } else {
            tL_document = null;
        }
        if (i11 == 2) {
            str = file.getAbsolutePath();
        }
        f11.k(hs.f23301s2, valueOf, tL_document, str);
        x(true);
    }

    public final void t0() {
        Collections.sort(this.S0, new o0.a(7));
    }

    public final void u0(boolean z10) {
        boolean z11;
        zi ziVar = this.f21348v0;
        if (ziVar != null) {
            int i3 = 0;
            hs.f(ziVar.I1).k(hs.f23315u2, Boolean.valueOf(this.M));
            m51 m51Var = this.F0;
            if (m51Var != null) {
                if (!this.M) {
                    i3 = 3;
                }
                m51Var.x0(i3);
                if (!z10) {
                    if (this.F0.S() < 1000) {
                        this.F0.p0(0L);
                    }
                    this.F0.h0();
                    return;
                }
                R(this.f21348v0, true);
                return;
            }
            m51 m51Var2 = this.f21324j0;
            if (m51Var2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            zi ziVar2 = this.f21348v0;
            float f10 = ziVar2.f26828b0;
            int i10 = ziVar2.f26855h0;
            if (!z10 && m51Var2 != null && m51Var2.d0() && i10 * f10 <= 1.0f) {
                ziVar2.f26828b0 = 0.0f;
            } else {
                ziVar2.f26828b0 = f10;
            }
            q(false, true, false, false);
            S(ziVar2);
            if (z10) {
                if (z11) {
                    g0.i3(new y4(21, this, ziVar2), 100L);
                } else {
                    R(ziVar2, true);
                }
            }
        }
    }

    public final void v0(zi ziVar) {
        synchronized (this.A0) {
            Timer timer = this.f21359z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f21359z0 = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            ziVar.S0();
            Timer timer2 = new Timer();
            this.f21359z0 = timer2;
            timer2.schedule(new kg.m1(1, this, ziVar), 0L, 17L);
        }
    }

    public final void w0(org.telegram.ui.wm wmVar) {
        if (wmVar != null) {
            if ((this.f21315f != null || this.f21329n != null) && this.f21312e != null) {
                if (!az.k(false)) {
                    zi ziVar = this.f21348v0;
                    if (ziVar != null) {
                        if (!zi.S4(ziVar.f26868k) && !this.f21348v0.i4()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f21341s = wmVar;
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
                    this.f21356y = 0;
                    this.E = 0;
                    this.G = 0;
                    this.F = 0;
                    Utilities.f21387e.c(new od(this, 3));
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
            ((vi.j) gVar.f9236e).o();
            gVar.f9235c = true;
            this.G1 = null;
        }
        if (!z10 && (file = this.k1) != null) {
            z0.b(file);
            this.k1.delete();
        }
        Z();
        this.f21357y0 = false;
        this.f21338r = false;
        this.P = false;
    }

    public final void x0(int i3, long j10, zi ziVar, zi ziVar2, TL_stories.StoryItem storyItem, int i10, boolean z10, zv zvVar, long j11, ej ejVar) {
        boolean z11;
        long j12;
        long c22;
        long j13;
        zi ziVar3 = this.f21348v0;
        if (ziVar3 != null && I(ziVar3) && !H()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f21357y0 = z10;
        Y(true);
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.I1 && !X()) {
            g0.h3(new rd(i3, i10, 0));
        } else if (s0(i3)) {
            this.I1 = true;
            this.J1 = false;
            this.K1 = false;
            this.f21323i1 = i3;
            this.f21321h1 = i10;
            this.f21331n1 = j10;
            this.f21335p1 = j11;
            this.f21337q1 = ejVar;
            if (ziVar2 == null) {
                c22 = 0;
            } else {
                c22 = zi.c2(i3, ziVar2.f26868k, false, false);
            }
            this.f21333o1 = c22;
            this.f21340r1 = ziVar;
            this.f21343s1 = ziVar2;
            this.f21345t1 = storyItem;
            this.f21347u1 = zvVar;
            this.f21325j1 = null;
            this.k1 = null;
            this.f21328l1 = 0L;
            this.m1 = 0;
            this.f21352w1 = 0L;
            this.C1 = 0;
            ei.d1 d1Var = new ei.d1(i3, i10, 1, j10, this);
            this.H1 = d1Var;
            if (z11) {
                j13 = 500;
            } else {
                j13 = 50;
            }
            g0.i3(d1Var, j13);
        } else {
            if (r2.f25040a) {
                a8.b("AudioRecorder legacy selected: account=" + i3 + ", dialog=" + j10 + ", guid=" + i10);
            }
            pd pdVar = new pd(this, i3, i10, j10, j11, ejVar, ziVar2, ziVar, storyItem, zvVar);
            this.M1 = pdVar;
            if (z11) {
                j12 = 500;
            } else {
                j12 = 50;
            }
            this.N1.e(pdVar, j12);
        }
    }

    public final void y0() {
        if (!this.f21308c0.isEmpty()) {
            cf cfVar = (cf) this.f21308c0.get(0);
            b20 b20Var = cfVar.f22015b;
            synchronized (this.f21304b) {
                if (b20Var != null) {
                    try {
                        b20Var.W = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            new Thread(new a(cfVar, 19)).start();
        }
    }

    public final mi.z3 z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.z():mi.z3");
    }

    public final void z0() {
        synchronized (this.A0) {
            Timer timer = this.f21359z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f21359z0 = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
