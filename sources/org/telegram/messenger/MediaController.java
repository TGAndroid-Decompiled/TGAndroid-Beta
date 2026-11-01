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
import org.telegram.ui.Components.v61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class MediaController implements AudioManager.OnAudioFocusChangeListener, vs, SensorEventListener {
    public static final String[] U1;
    public static final String[] V1;
    public static final ConcurrentHashMap W1;
    public static Runnable X1;
    public static xe Y1;
    public static xe Z1;
    public static ArrayList a2;
    public static ArrayList f14433b2;
    public static ge f14434c2;
    public static volatile MediaController f14435d2;
    public static long f14436e2;
    public static boolean f14437f2;
    public boolean A0;
    public int A1;
    public boolean B0;
    public boolean B1;
    public e2.a0 C0;
    public int C1;
    public int D;
    public cf.a D0;
    public boolean D1;
    public int E;
    public v61 E0;
    public e0.h E1;
    public int F;
    public boolean F0;
    public yd F1;
    public long G;
    public TextureView G0;
    public boolean G1;
    public PipRoundVideoView H0;
    public boolean H1;
    public boolean I;
    public int I0;
    public boolean I1;
    public boolean J;
    public LaunchActivity J0;
    public ki.g J1;
    public View K0;
    public sd K1;
    public boolean L;
    public org.telegram.ui.k4 L0;
    public final r5 L1;
    public boolean M;
    public boolean M0;
    public final r5 M1;
    public boolean N;
    public FrameLayout N0;
    public boolean O;
    public float O0;
    public float O1;
    public boolean P;
    public boolean P0;
    public ValueAnimator P1;
    public float Q;
    public qp Q0;
    public androidx.emoji2.text.j R1;
    public boolean S1;
    public hf T1;
    public int U;
    public int U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public boolean X0;
    public boolean Y;
    public long Y0;
    public int Z0;
    public kf f14439a0;
    public SensorManager f14444c;
    public boolean f14446c1;
    public PowerManager.WakeLock d;
    public boolean f14447d0;
    public AudioRecord f14448d1;
    public Sensor e;
    public ArrayList f14449e0;
    public TLRPC.TL_document f14450e1;
    public Sensor f14451f;
    public SparseArray f14452f0;
    public int f14455g1;
    public Sensor h;
    public File f14457h1;
    public File f14459i1;
    public long f14461j1;
    public int f14463k1;
    public boolean f14464l0;
    public long l1;
    public int m0;
    public long f14465m1;
    public Sensor f14466n;
    public String f14467n0;
    public long f14468n1;
    public long f14469o0;
    public pj f14470o1;
    public kj f14472p1;
    public kj f14474q1;
    public boolean f14475r;
    public TL_stories.StoryItem f14477r1;
    public org.telegram.ui.un f14478s;
    public tw f14480s1;
    public float f14481t0;
    public kj f14483u0;
    public long f14484u1;
    public kj f14485v0;
    public boolean f14487w;
    public ef f14488w0;
    public long f14490x;
    public boolean f14491x0;
    public final ByteBuffer f14492x1;
    public int f14493y;
    public final qd f14438a = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public final void onAudioFocusChange(int i10) {
            MediaController mediaController = MediaController.this;
            if (i10 != 1) {
                mediaController.V = false;
                return;
            }
            String[] strArr = MediaController.U1;
            mediaController.getClass();
        }
    };
    public final Object f14441b = new Object();
    public long H = 0;
    public float K = -100.0f;
    public final float[] R = new float[3];
    public final float[] S = new float[3];
    public final float[] T = new float[3];
    public int X = 0;
    public final ArrayList Z = new ArrayList();
    public final ArrayList f14442b0 = new ArrayList();
    public final HashMap f14445c0 = new HashMap();
    public boolean f14454g0 = false;
    public boolean f14456h0 = false;
    public v61 f14458i0 = null;
    public v61 f14460j0 = null;
    public int f14462k0 = 0;
    public float f14471p0 = 1.0f;
    public float f14473q0 = 1.0f;
    public float f14476r0 = 1.0f;
    public float f14479s0 = 1.0f;
    public Timer f14494y0 = null;
    public final Object f14496z0 = new Object();
    public final ArrayList R0 = new ArrayList();
    public final HashMap S0 = new HashMap();
    public final ArrayList T0 = new ArrayList();
    public final boolean[] W0 = {false, false};
    public final int[] f14440a1 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public final se f14443b1 = new se(this);
    public int f14453f1 = -1;
    public short[] f14482t1 = new short[1024];
    public final Object f14486v1 = new Object();
    public final ArrayList f14489w1 = new ArrayList();
    public int f14495y1 = 1280;
    public int f14497z1 = 48000;
    public final mg.c2 N1 = new mg.c2(this, 4);
    public final bg.o Q1 = new bg.o(this, 4);

    static {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            str = "datetaken";
        } else {
            str = "date_modified";
        }
        U1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str, "orientation", "width", "height", "_size"};
        if (i10 <= 28) {
            str2 = "datetaken";
        } else {
            str2 = "date_modified";
        }
        V1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str2, "duration", "width", "height", "_size"};
        W1 = new ConcurrentHashMap();
        a2 = new ArrayList();
        f14433b2 = new ArrayList();
    }

    public MediaController() {
        r5 r5Var = new r5("recordQueue");
        this.L1 = r5Var;
        r5Var.setPriority(10);
        r5 r5Var2 = new r5("fileEncodingQueue");
        this.M1 = r5Var2;
        r5Var2.setPriority(10);
        r5Var.c(new rd(this, 0));
        Utilities.e.c(new rd(this, 1));
        this.f14492x1 = ByteBuffer.allocateDirect(1920);
        i0.g3(new rd(this, 2));
        ContentResolver contentResolver = w0.f18945b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.g2(null, 1));
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.g2(null, 2));
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.g2(null, 1));
        } catch (Exception e10) {
            f8.g(e10, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.g2(null, 2));
        } catch (Exception e11) {
            f8.g(e11, true);
        }
    }

    public static java.lang.String A(android.net.Uri r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.A(android.net.Uri):java.lang.String");
    }

    public static MediaController B() {
        MediaController mediaController;
        MediaController mediaController2 = f14435d2;
        if (mediaController2 == null) {
            synchronized (MediaController.class) {
                try {
                    mediaController = f14435d2;
                    if (mediaController == null) {
                        mediaController = new MediaController();
                        f14435d2 = mediaController;
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
        int i10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e) {
            f8.g(e, true);
            i10 = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        return i10;
    }

    public static boolean G(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = w0.f18945b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[3];
                    if (inputStream.read(bArr, 0, 3) == 3) {
                        if (new String(bArr).equalsIgnoreCase("gif")) {
                            try {
                                inputStream.close();
                                return true;
                            } catch (Exception e) {
                                f8.g(e, true);
                                return true;
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e10) {
                f8.g(e10, true);
                return false;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
            }
            throw th2;
        }
    }

    public static void H0(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String n10 = org.telegram.ui.Cells.f1.n(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = n10.getBytes("UTF-8");
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
            throw new IOException(i0.a.i(length, "XMP segment too large: "));
        }
    }

    public static boolean M(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = w0.f18945b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[12];
                    if (inputStream.read(bArr, 0, 12) == 12) {
                        String lowerCase = new String(bArr).toLowerCase();
                        if (lowerCase.startsWith("riff")) {
                            if (lowerCase.endsWith("webp")) {
                                try {
                                    inputStream.close();
                                    return true;
                                } catch (Exception e) {
                                    f8.g(e, true);
                                    return true;
                                }
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e10) {
                        f8.g(e10, true);
                    }
                }
                throw th2;
            }
        } catch (Exception e11) {
            f8.g(e11, true);
        }
    }

    public static void O(int i10) {
        Thread thread = new Thread(new xd(i10, 0));
        thread.setPriority(1);
        thread.start();
    }

    public static int Q(int r5, int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.Q(int, int, int, int, int):int");
    }

    public static void a(MediaController mediaController, boolean z10) {
        mediaController.stopRecord();
        TLRPC.TL_document tL_document = mediaController.f14450e1;
        File N = mediaController.N(mediaController.f14457h1, mediaController.f14459i1, tL_document);
        if (tL_document != null && N != null) {
            i0.g3(new bi.n4(mediaController, N, z10, tL_document, 11));
        }
    }

    public static void b(final MediaController mediaController, final int i10, final int i11, long j10, long j11, pj pjVar, kj kjVar, kj kjVar2, TL_stories.StoryItem storyItem, tw twVar) {
        String absolutePath;
        if (mediaController.f14448d1 != null) {
            i0.g3(new Runnable(mediaController) {
                public final MediaController f14600b;

                {
                    this.f14600b = mediaController;
                }

                @Override
                public final void run() {
                    int i12 = r4;
                    int i13 = i11;
                    int i14 = i10;
                    MediaController mediaController2 = this.f14600b;
                    switch (i12) {
                        case 0:
                            mediaController2.K1 = null;
                            at.f(i14).k(156, Integer.valueOf(i13));
                            return;
                        case 1:
                            mediaController2.K1 = null;
                            at.f(i14).k(156, Integer.valueOf(i13));
                            return;
                        case 2:
                            mediaController2.K1 = null;
                            at.f(i14).k(156, Integer.valueOf(i13));
                            return;
                        default:
                            mediaController2.K1 = null;
                            at.f(i14).k(155, Integer.valueOf(i13), Boolean.TRUE);
                            return;
                    }
                }
            });
            return;
        }
        j0(true);
        mediaController.A1 = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        mediaController.f14450e1 = tL_document;
        mediaController.f14453f1 = i11;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = Integer.MIN_VALUE;
        tL_document.f19800id = uz.p();
        mediaController.f14450e1.user_id = e20.i(i10).e();
        TLRPC.TL_document tL_document2 = mediaController.f14450e1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        uz.y();
        File z10 = b8.z(1);
        mediaController.f14459i1 = new File(z10, System.currentTimeMillis() + "_" + b8.r(null, mediaController.f14450e1));
        b8.z(4).mkdirs();
        if (v2.f18578a) {
            f8.b("start recording internal " + mediaController.f14459i1.getPath() + " " + mediaController.f14459i1.exists());
        }
        File file = mediaController.f14459i1;
        Set set = c1.f15048a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            c1.f15048a.add(absolutePath);
        }
        try {
            if (mediaController.startRecord(mediaController.f14459i1.getPath(), mediaController.f14497z1) == 0) {
                i0.g3(new Runnable(mediaController) {
                    public final MediaController f14600b;

                    {
                        this.f14600b = mediaController;
                    }

                    @Override
                    public final void run() {
                        int i12 = r4;
                        int i13 = i11;
                        int i14 = i10;
                        MediaController mediaController2 = this.f14600b;
                        switch (i12) {
                            case 0:
                                mediaController2.K1 = null;
                                at.f(i14).k(156, Integer.valueOf(i13));
                                return;
                            case 1:
                                mediaController2.K1 = null;
                                at.f(i14).k(156, Integer.valueOf(i13));
                                return;
                            case 2:
                                mediaController2.K1 = null;
                                at.f(i14).k(156, Integer.valueOf(i13));
                                return;
                            default:
                                mediaController2.K1 = null;
                                at.f(i14).k(155, Integer.valueOf(i13), Boolean.TRUE);
                                return;
                        }
                    }
                });
                if (v2.f18578a) {
                    f8.b("cant init encoder");
                    return;
                }
                return;
            }
            mediaController.f14446c1 = false;
            mediaController.f14448d1 = new AudioRecord(0, mediaController.f14497z1, 16, 2, mediaController.f14495y1);
            System.currentTimeMillis();
            long j12 = 0;
            mediaController.f14461j1 = 0L;
            mediaController.f14463k1 = 0;
            mediaController.f14484u1 = 0L;
            mediaController.l1 = j10;
            mediaController.f14468n1 = j11;
            mediaController.f14470o1 = pjVar;
            if (kjVar != null) {
                j12 = kj.c2(mediaController.f14455g1, kjVar.f16690k, false, false);
            }
            mediaController.f14465m1 = j12;
            mediaController.f14455g1 = i10;
            mediaController.f14472p1 = kjVar2;
            mediaController.f14474q1 = kjVar;
            mediaController.f14477r1 = storyItem;
            mediaController.f14480s1 = twVar;
            mediaController.f14492x1.rewind();
            mediaController.f14448d1.startRecording();
            mediaController.L1.c(mediaController.N1);
            i0.g3(new Runnable(mediaController) {
                public final MediaController f14600b;

                {
                    this.f14600b = mediaController;
                }

                @Override
                public final void run() {
                    int i12 = r4;
                    int i13 = i11;
                    int i14 = i10;
                    MediaController mediaController2 = this.f14600b;
                    switch (i12) {
                        case 0:
                            mediaController2.K1 = null;
                            at.f(i14).k(156, Integer.valueOf(i13));
                            return;
                        case 1:
                            mediaController2.K1 = null;
                            at.f(i14).k(156, Integer.valueOf(i13));
                            return;
                        case 2:
                            mediaController2.K1 = null;
                            at.f(i14).k(156, Integer.valueOf(i13));
                            return;
                        default:
                            mediaController2.K1 = null;
                            at.f(i14).k(155, Integer.valueOf(i13), Boolean.TRUE);
                            return;
                    }
                }
            });
        } catch (Exception e) {
            f8.g(e, true);
            mediaController.f14450e1 = null;
            mediaController.stopRecord();
            c1.b(mediaController.f14459i1);
            mediaController.f14459i1.delete();
            mediaController.f14459i1 = null;
            File file2 = mediaController.f14457h1;
            if (file2 != null) {
                file2.delete();
                mediaController.f14457h1 = null;
            }
            try {
                mediaController.f14448d1.release();
                mediaController.f14448d1 = null;
            } catch (Exception e7) {
                f8.g(e7, true);
            }
            j0(false);
            i0.g3(new Runnable(mediaController) {
                public final MediaController f14600b;

                {
                    this.f14600b = mediaController;
                }

                @Override
                public final void run() {
                    int i12 = r4;
                    int i13 = i11;
                    int i14 = i10;
                    MediaController mediaController2 = this.f14600b;
                    switch (i12) {
                        case 0:
                            mediaController2.K1 = null;
                            at.f(i14).k(156, Integer.valueOf(i13));
                            return;
                        case 1:
                            mediaController2.K1 = null;
                            at.f(i14).k(156, Integer.valueOf(i13));
                            return;
                        case 2:
                            mediaController2.K1 = null;
                            at.f(i14).k(156, Integer.valueOf(i13));
                            return;
                        default:
                            mediaController2.K1 = null;
                            at.f(i14).k(155, Integer.valueOf(i13), Boolean.TRUE);
                            return;
                    }
                }
            });
        }
    }

    public static void c(final MediaController mediaController, File file, File file2, final TLRPC.TL_document tL_document, final int i10, final boolean z10, final int i11, final boolean z11) {
        mediaController.stopRecord();
        final File N = mediaController.N(file, file2, tL_document);
        if (N == null) {
            if (v2.f18578a) {
                f8.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (v2.f18578a) {
            f8.b("stop recording internal in queue " + N.exists() + " " + N.length());
        }
        i0.g3(new Runnable() {
            @Override
            public final void run() {
                boolean z12;
                char c10;
                int i12;
                int i13;
                String[] strArr = MediaController.U1;
                boolean z13 = v2.f18578a;
                MediaController mediaController2 = MediaController.this;
                File file3 = N;
                if (z13) {
                    StringBuilder sb2 = new StringBuilder("stop recording internal ");
                    sb2.append(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController2.f14461j1 + " writedFrames" + mediaController2.f14463k1);
                    f8.b(sb2.toString());
                }
                if (!file3.exists()) {
                    f8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.f14461j1 + " writedFrames" + mediaController2.f14463k1), true);
                }
                vi.b0(mediaController2.f14455g1).B1(mediaController2.l1, mediaController2.f14465m1, null);
                int currentTime = ConnectionsManager.getInstance(mediaController2.f14455g1).getCurrentTime();
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
                long j10 = mediaController2.f14461j1;
                tL_documentAttributeAudio.duration = j10 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                if (j10 > 700) {
                    int i14 = i10;
                    if (i14 == 1) {
                        String absolutePath = file3.getAbsolutePath();
                        long j11 = mediaController2.l1;
                        kj kjVar = mediaController2.f14472p1;
                        kj kjVar2 = mediaController2.f14474q1;
                        if (z11) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 0;
                        }
                        c10 = 1;
                        i12 = 2;
                        pz f7 = pz.f(tL_document2, null, absolutePath, j11, kjVar, kjVar2, null, null, null, null, z10, i11, 0, i13, null, null, false);
                        f7.R = mediaController2.f14468n1;
                        f7.T = mediaController2.f14470o1;
                        f7.H = mediaController2.f14477r1;
                        f7.K = mediaController2.f14480s1;
                        f7.Q = 0L;
                        rz.C(mediaController2.f14455g1).r0(f7);
                    } else {
                        c10 = 1;
                        i12 = 2;
                    }
                    at f10 = at.f(mediaController2.f14455g1);
                    Integer valueOf = Integer.valueOf(mediaController2.f14453f1);
                    String str = null;
                    if (i14 != i12) {
                        tL_document2 = null;
                    }
                    if (i14 == i12) {
                        str = file3.getAbsolutePath();
                    }
                    Object[] objArr = new Object[3];
                    z12 = false;
                    objArr[0] = valueOf;
                    objArr[c10] = tL_document2;
                    objArr[i12] = str;
                    f10.k(at.f14782s2, objArr);
                } else {
                    z12 = false;
                    at.f(mediaController2.f14455g1).k(at.f14789t2, Integer.valueOf(mediaController2.f14453f1), Boolean.FALSE, Integer.valueOf((int) j10));
                    c1.b(file3);
                    file3.delete();
                }
                mediaController2.Y(z12);
            }
        });
    }

    public static native boolean cropOpusFile(String str, String str2, long j10, long j11);

    public static void d(MediaController mediaController) {
        mediaController.f14457h1 = mediaController.f14459i1;
        File z10 = b8.z(1);
        qe qeVar = new qe(1, z10, System.currentTimeMillis() + "_" + b8.r(null, mediaController.f14450e1));
        mediaController.f14459i1 = qeVar;
        if (mediaController.startRecord(qeVar.getPath(), mediaController.f14497z1) == 0) {
            i0.g3(new rd(mediaController, 7));
            if (v2.f18578a) {
                f8.b("cant resume audio encoder");
                return;
            }
            return;
        }
        i0.g3(new rd(mediaController, 8));
    }

    public static void d0(java.lang.String r12, android.content.Context r13, int r14, java.lang.String r15, java.lang.String r16, org.telegram.messenger.r20 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.d0(java.lang.String, android.content.Context, int, java.lang.String, java.lang.String, org.telegram.messenger.r20):void");
    }

    public static void e0(String str, String str2, Context context, r20 r20Var) {
        org.telegram.ui.ActionBar.x1 x1Var;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && context != null) {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists() && file2.exists()) {
                if (!i0.I1(Uri.fromFile(file), 0) && !i0.I1(Uri.fromFile(file2), 0)) {
                    boolean[] zArr = {false};
                    boolean[] zArr2 = new boolean[1];
                    try {
                        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(2, context, null);
                        x1Var2.n(dd.L0(2131748789, null));
                        x1Var2.setCanceledOnTouchOutside(false);
                        x1Var2.setCancelable(true);
                        x1Var2.setOnCancelListener(new be(zArr, 1));
                        i0.h3(new ce(zArr2, x1Var2, 1), 250L);
                        x1Var = x1Var2;
                    } catch (Exception e) {
                        f8.g(e, true);
                        x1Var = null;
                    }
                    new Thread(new fk(file, file2, zArr, r20Var, x1Var, zArr2)).start();
                    return;
                }
                return;
            }
            d0(str, context, 0, null, null, r20Var);
        }
    }

    public static void f(MediaController mediaController, kj kjVar, int[] iArr, boolean z10, boolean z11, int i10) {
        kj kjVar2;
        se seVar = mediaController.f14443b1;
        if (mediaController.E0 != null) {
            if (i10 != 4 && i10 != 1) {
                try {
                    mediaController.J0.getWindow().addFlags(128);
                } catch (Exception e) {
                    f8.g(e, true);
                }
            } else {
                try {
                    mediaController.J0.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            }
            if (i10 == 3) {
                mediaController.F0 = true;
                kj kjVar3 = mediaController.f14483u0;
                if (kjVar3 != null && (kj.L4(kjVar3.f16690k) || mediaController.f14483u0.h4())) {
                    i0.r(seVar);
                    b8.G(kjVar.I1).a0(mediaController.f14483u0.F0(), true, false);
                }
                mediaController.P0 = true;
            } else if (i10 == 2) {
                if (z11 && (kjVar2 = mediaController.f14483u0) != null) {
                    if (kj.L4(kjVar2.f16690k) || mediaController.f14483u0.h4()) {
                        if (mediaController.F0) {
                            seVar.run();
                        } else {
                            i0.h3(seVar, 1000L);
                        }
                    }
                }
            } else if (mediaController.E0.d0() && i10 == 4) {
                kj kjVar4 = mediaController.f14483u0;
                if (kjVar4 != null && kj.L4(kjVar4.f16690k) && !z10 && (iArr == null || iArr[0] < 4)) {
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

    public static Uri f0(int i10, File file, String str) {
        String str2;
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String D = b8.D(file);
            if (D != null) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D);
            } else {
                str2 = null;
            }
            if ((i10 == 0 || i10 == 1) && str2 != null) {
                if (str2.startsWith("image")) {
                    i10 = 0;
                }
                if (str2.startsWith("video")) {
                    i10 = 1;
                }
            }
            if (i10 == 0) {
                if (str == null) {
                    str = i0.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", str2);
            } else if (i10 == 1) {
                if (str == null) {
                    str = i0.p0(1, D);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i10 == 2) {
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
            Uri insert = w0.f18945b.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                i0.D(fileInputStream, w0.f18945b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static void g0(Context context, c cVar, ArrayList arrayList, cs csVar) {
        th.b bVar;
        if (arrayList.isEmpty()) {
            return;
        }
        ?? obj = new Object();
        obj.d = new HashMap();
        obj.f15373a = cVar;
        obj.f15375c = arrayList;
        obj.f15379s = csVar;
        obj.f15380w = ((kj) arrayList.get(0)).I3();
        int i10 = cVar.f15043a;
        at.f(i10).b(obj, at.Y1);
        at.f(i10).b(obj, at.X1);
        at.f(i10).b(obj, at.Z1);
        if (PhotoViewer.v1().U1()) {
            bVar = new th.b();
        } else {
            bVar = null;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(2, context, bVar);
        obj.f15374b = x1Var;
        x1Var.n(dd.L0(2131748789, null));
        x1Var.setCancelable(true);
        x1Var.H = true;
        x1Var.setOnCancelListener(new be(obj, 3));
        i0.h3(new cf(obj, 1), 250L);
        new Thread(new cf(obj, 2)).start();
    }

    public static native byte[] getWaveform(String str);

    public static native int isOpusFile(String str);

    public static void j0(boolean z10) {
        AudioManager audioManager = (AudioManager) w0.f18945b.getSystemService("audio");
        if (uz.f18556u0 && !w7.c6.d("android.permission.BLUETOOTH_CONNECT")) {
            uz.f18556u0 = false;
            uz.y();
        }
        if ((audioManager.isBluetoothScoAvailableOffCall() && uz.f18556u0) || !z10) {
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
                    f8.g(th2, true);
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

    public static boolean s0(int i10) {
        mi.a aVar = mi.e.f13386b;
        aVar.a();
        if (aVar.f13378c) {
            aVar.a();
            return aVar.d;
        } else if (!((j0) wp.r1(i10).f19300y7.f18026f0.f11588b).f16393c) {
            return true;
        } else {
            return false;
        }
    }

    private native int startRecord(String str, int i10);

    private native void stopRecord();

    public static java.lang.String t(long r15, android.net.Uri r17, java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.t(long, android.net.Uri, java.lang.String):java.lang.String");
    }

    public static File u(String str) {
        int lastIndexOf;
        File file;
        try {
            File g12 = i0.g1();
            g12.mkdirs();
            if (i0.I1(Uri.fromFile(g12), 0)) {
                return null;
            }
            int i10 = 0;
            do {
                File g13 = i0.g1();
                if (i10 == 0) {
                    file = new File(g13, str);
                } else {
                    if (str.lastIndexOf(".") > 0) {
                        file = new File(g13, str.substring(0, lastIndexOf) + " (" + i10 + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(g13, str + " (" + i10 + ")");
                    }
                }
                i10++;
            } while (file.exists());
            return file;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static int v(int r5, int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.v(int, int, int, boolean):int");
    }

    public static int w(MediaExtractor mediaExtractor, boolean z10) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            String string = mediaExtractor.getTrackFormat(i10).getString("mime");
            if (z10) {
                if (string.startsWith("audio/")) {
                    return i10;
                }
            } else if (string.startsWith("video/")) {
                return i10;
            }
        }
        return -5;
    }

    public native int writeFrame(ByteBuffer byteBuffer, int i10);

    public static boolean y() {
        AudioDeviceInfo[] devices;
        try {
            for (AudioDeviceInfo audioDeviceInfo : pt.f17640o0.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            f8.g(e, true);
            return false;
        }
    }

    public final void A0(org.telegram.ui.un unVar, boolean z10, boolean z11) {
        int i10;
        if (this.O) {
            this.O = false;
            return;
        }
        if (z11) {
            if (this.f14450e1 != null && !K()) {
                D0(false);
            } else {
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                B0(i10, 0, false, false);
            }
        }
        if (this.P && !this.O) {
            if ((this.f14451f != null || this.f14466n != null) && this.e != null && this.f14478s == unVar) {
                this.f14478s = null;
                this.P = false;
                this.f14487w = false;
                this.I = false;
                this.f14475r = false;
                this.L = false;
                Utilities.e.c(new rd(this, 5));
                PowerManager.WakeLock wakeLock = this.d;
                if (wakeLock != null && wakeLock.isHeld()) {
                    this.d.release();
                }
            }
        }
    }

    public final void B0(final int i10, final int i11, final boolean z10, final boolean z11) {
        e0.h hVar;
        if (this.G1) {
            ki.g gVar = this.J1;
            if (gVar != null) {
                this.J1 = null;
                if (i10 == 0) {
                    x(false);
                    return;
                }
                this.A1 = i10;
                this.B1 = z10;
                this.C1 = i11;
                this.D1 = z11;
                s(gVar);
                return;
            } else if (this.H1) {
                if (this.A1 == 3) {
                    this.A1 = i10;
                    this.B1 = z10;
                    this.C1 = i11;
                    this.D1 = z11;
                    if (i10 == 0) {
                        e0.h hVar2 = this.E1;
                        if (hVar2 != null) {
                            hVar2.f6020b = false;
                            ((ki.k) hVar2.e).b();
                        }
                        x(false);
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 2 && (hVar = this.E1) != null && hVar.e()) {
                this.f14491x0 = false;
                this.f14475r = false;
                this.O = false;
                return;
            } else {
                yd ydVar = this.F1;
                if (ydVar != null) {
                    i0.r(ydVar);
                    this.F1 = null;
                }
                this.H1 = true;
                this.A1 = i10;
                this.B1 = z10;
                this.C1 = i11;
                this.D1 = z11;
                e0.h hVar3 = this.E1;
                if (hVar3 == null) {
                    x(false);
                } else {
                    ki.k kVar = (ki.k) hVar3.e;
                    if (i10 == 0) {
                        hVar3.f6020b = false;
                        kVar.b();
                        x(false);
                    } else {
                        hVar3.f6020b = true;
                        kVar.getClass();
                        ki.k.q();
                        int i12 = kVar.e().f425a;
                        if (hVar3.f6020b && (i12 == 3 || i12 == 5)) {
                            hVar3.f6020b = false;
                            kVar.h();
                        }
                    }
                }
                try {
                    this.K0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                final int i13 = this.f14455g1;
                final int i14 = this.f14453f1;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i15;
                        String[] strArr = MediaController.U1;
                        at f7 = at.f(i13);
                        Integer valueOf = Integer.valueOf(i14);
                        if (i10 == 2) {
                            i15 = 1;
                        } else {
                            i15 = 0;
                        }
                        f7.k(at.f14751n2, valueOf, Integer.valueOf(i15));
                    }
                });
                return;
            }
        }
        sd sdVar = this.K1;
        r5 r5Var = this.L1;
        if (sdVar != null) {
            r5Var.a(sdVar);
            this.K1 = null;
        }
        r5Var.c(new Runnable() {
            @Override
            public final void run() {
                MediaController mediaController = MediaController.this;
                int i15 = mediaController.A1;
                int i16 = i10;
                boolean z12 = z10;
                int i17 = i11;
                boolean z13 = z11;
                if (i15 == 3) {
                    mediaController.A1 = 0;
                    mediaController.C0(i16, i17, z12, z13);
                    return;
                }
                AudioRecord audioRecord = mediaController.f14448d1;
                if (audioRecord == null) {
                    mediaController.f14450e1 = null;
                    mediaController.f14491x0 = false;
                    mediaController.f14475r = false;
                    mediaController.O = false;
                    return;
                }
                try {
                    mediaController.A1 = i16;
                    mediaController.B1 = z12;
                    mediaController.C1 = i17;
                    mediaController.D1 = z13;
                    audioRecord.stop();
                    MediaController.j0(false);
                } catch (Exception e) {
                    f8.g(e, true);
                    if (mediaController.f14459i1 != null) {
                        if (v2.f18578a) {
                            f8.d("delete voice file");
                        }
                        mediaController.f14459i1.delete();
                    }
                }
                if (i16 == 0) {
                    mediaController.C0(0, 0, false, false);
                }
                try {
                    mediaController.K0.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                i0.g3(new vd(mediaController, i16, 0));
            }
        });
    }

    public final float C(boolean z10) {
        if (z10) {
            return this.f14473q0;
        }
        return this.f14471p0;
    }

    public final void C0(int i10, int i11, boolean z10, boolean z11) {
        MediaController mediaController;
        File file;
        if (i10 != 0 && (file = this.f14459i1) != null) {
            TLRPC.TL_document tL_document = this.f14450e1;
            File file2 = this.f14457h1;
            if (v2.f18578a) {
                f8.b("stop recording internal filename " + this.f14459i1.getPath());
            }
            mediaController = this;
            mediaController.M1.c(new fe(mediaController, file2, file, tL_document, i10, z10, i11, z11));
        } else {
            mediaController = this;
            c1.b(mediaController.f14459i1);
            File file3 = mediaController.f14459i1;
            if (file3 != null) {
                file3.delete();
            }
            Y(false);
        }
        try {
            AudioRecord audioRecord = mediaController.f14448d1;
            if (audioRecord != null) {
                audioRecord.release();
                mediaController.f14448d1 = null;
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        mediaController.f14450e1 = null;
        mediaController.f14457h1 = null;
        mediaController.f14459i1 = null;
        mediaController.f14491x0 = false;
        mediaController.f14475r = false;
        mediaController.O = false;
    }

    public final long D(kj kjVar) {
        kj kjVar2 = this.f14483u0;
        if ((this.f14458i0 != null || this.E0 != null) && kjVar != null && kjVar2 != null && L(kjVar)) {
            try {
                v61 v61Var = this.f14458i0;
                if (v61Var != null) {
                    return v61Var.S();
                }
                v61 v61Var2 = this.E0;
                if (v61Var2 != null) {
                    return v61Var2.S();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void D0(boolean z10) {
        boolean z11;
        if (this.G1) {
            this.I1 = z10;
            e0.h hVar = this.E1;
            if (hVar != null) {
                if (hVar.e()) {
                    Y(true);
                    j0(true);
                }
                e0.h hVar2 = this.E1;
                ki.k kVar = (ki.k) hVar2.e;
                kVar.getClass();
                ki.k.q();
                int i10 = kVar.e().f425a;
                if (i10 == 3) {
                    ((ki.k) hVar2.e).n();
                    return;
                } else if (i10 == 5) {
                    ki.k kVar2 = (ki.k) hVar2.e;
                    kVar2.getClass();
                    ki.k.q();
                    if (kVar2.G == 5) {
                        kVar2.h.b("resume requested: trim=" + kVar2.f11427r + ".." + kVar2.f11428s + ", sourceDurationMs=" + kVar2.j());
                        kVar2.p();
                        kVar2.s(6);
                        ki.j jVar = kVar2.f11434z;
                        if (jVar == null) {
                            kVar2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j10 = kVar2.f11427r;
                        long j11 = kVar2.f11428s;
                        if (j11 >= ki.k.r(kVar2.f11425p)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        kVar2.k(1);
                        long j12 = ((j11 - j10) * 48000) / 1000;
                        kVar2.f11425p = j12;
                        kVar2.f11427r = 0L;
                        kVar2.f11428s = ki.k.r(j12);
                        kVar2.d();
                        kVar2.h.b("resume prefix selected: source=" + jVar.f11411b.getName() + ", trim=" + j10 + ".." + j11);
                        File file = jVar.f11411b;
                        if (z11) {
                            j11 = -1;
                        }
                        kVar2.u(j10, j11, file);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        this.L1.c(new td(this, z10, 0));
    }

    public final boolean E0(int i10, ArrayList arrayList) {
        boolean z10;
        int size;
        kj kjVar;
        int i11;
        kj kjVar2;
        int i12 = this.U0;
        int i13 = 0;
        if (ConnectionsManager.getInstance(e20.f15506s0).getConnectionState() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U0 += i10;
        if (z10) {
            while (this.U0 < arrayList.size() && (i11 = this.U0) >= 0 && ((kjVar2 = (kj) arrayList.get(i11)) == null || !kjVar2.f16740x0)) {
                this.U0 += i10;
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
        if (z10) {
            while (true) {
                int i14 = this.U0;
                if (i14 < 0 || i14 >= arrayList.size()) {
                    break;
                }
                int i15 = this.U0;
                if (i10 > 0) {
                    if (i15 > i12) {
                        break;
                    }
                    kjVar = (kj) arrayList.get(this.U0);
                    if (kjVar == null && kjVar.f16740x0) {
                        break;
                    }
                    this.U0 += i10;
                } else {
                    if (i15 < i12) {
                        break;
                    }
                    kjVar = (kj) arrayList.get(this.U0);
                    if (kjVar == null) {
                    }
                    this.U0 += i10;
                }
            }
            if (this.U0 >= arrayList.size() || this.U0 < 0) {
                if (this.U0 < arrayList.size()) {
                    i13 = arrayList.size() - 1;
                }
                this.U0 = i13;
            }
        }
        return true;
    }

    public final boolean F() {
        ArrayList arrayList;
        kj kjVar = this.f14483u0;
        if (kjVar == null || ((!kj.R4(kjVar.f16690k) && !this.f14483u0.h4()) || (arrayList = this.f14449e0) == null || arrayList.size() <= 1 || !this.f14449e0.contains(this.f14483u0) || this.f14449e0.indexOf(this.f14483u0) >= this.f14449e0.size() - 1)) {
            return true;
        }
        return false;
    }

    public final void F0() {
        kj kjVar = this.f14483u0;
        if (kjVar != null && H() && this.f14456h0 && (kj.R4(kjVar.f16690k) || kjVar.I3())) {
            S(kjVar);
        }
        this.f14456h0 = false;
    }

    public final void G0(File file, long j10, byte[] bArr) {
        TLRPC.TL_document tL_document = this.f14450e1;
        if (tL_document == null) {
            return;
        }
        tL_document.date = ConnectionsManager.getInstance(this.f14455g1).getCurrentTime();
        this.f14450e1.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        tL_documentAttributeAudio.waveform = bArr;
        if (bArr != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = j10 / 1000.0d;
        this.f14450e1.attributes.clear();
        this.f14450e1.attributes.add(tL_documentAttributeAudio);
    }

    public final boolean H() {
        if (!this.f14454g0 && !this.A0) {
            return false;
        }
        return true;
    }

    public final boolean I(kj kjVar) {
        kj kjVar2;
        boolean z10;
        if (kjVar == null || !kjVar.f16681h2) {
            if ((this.f14458i0 != null || this.E0 != null) && kjVar != null && (kjVar2 = this.f14483u0) != null) {
                long j10 = kjVar2.T;
                if (j10 != 0 && j10 == kjVar.T) {
                    z10 = this.A0;
                } else if (L(kjVar)) {
                    z10 = this.A0;
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
        if (this.K1 == null && this.F1 == null && this.f14450e1 == null) {
            return false;
        }
        return true;
    }

    public final boolean K() {
        if (this.G1) {
            e0.h hVar = this.E1;
            if (hVar != null && hVar.e()) {
                return true;
            }
            return false;
        }
        return this.f14446c1;
    }

    public final boolean L(kj kjVar) {
        boolean z10;
        boolean z11;
        kj kjVar2 = this.f14483u0;
        if (kjVar2 != null && kj.B0(kjVar2.f16690k) == kj.B0(kjVar.f16690k) && this.f14483u0.f1() == kjVar.f1()) {
            if (this.f14483u0.T == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (kjVar.T == 0) {
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
            File z10 = b8.z(1);
            File file3 = new File(z10, System.currentTimeMillis() + "_" + b8.r(null, tL_document));
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), file3.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.f14459i1) {
                    this.f14459i1 = file3;
                }
                file2 = file3;
            }
            file.delete();
            if (file == this.f14457h1) {
                this.f14457h1 = null;
            }
        }
        return file2;
    }

    public final void P() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.P():void");
    }

    public final boolean R(kj kjVar, boolean z10) {
        if ((this.f14458i0 != null || this.E0 != null) && kjVar != null && this.f14483u0 != null && L(kjVar)) {
            z0();
            try {
                if (this.f14458i0 != null) {
                    if (z10 && !b5.d.u() && !kj.R4(this.f14483u0.f16690k) && this.f14483u0.L0() * (1.0f - this.f14483u0.f16652b0) > 1.0d && LaunchActivity.G1) {
                        ValueAnimator valueAnimator = this.P1;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            this.P1.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        this.P1 = ofFloat;
                        ofFloat.addUpdateListener(this.Q1);
                        this.P1.setDuration(300L);
                        this.P1.addListener(new bg.e(this, 16));
                        this.P1.start();
                    } else {
                        this.f14458i0.g0();
                    }
                } else {
                    v61 v61Var = this.E0;
                    if (v61Var != null) {
                        v61Var.g0();
                    }
                }
                this.f14454g0 = true;
                at.f(this.f14483u0.I1).k(at.f14712g2, Integer.valueOf(this.f14483u0.f1()));
                try {
                    b5.d.b(1);
                    if (!this.S1) {
                        if (hf.b.e0().h0()) {
                            hf.b.e0().l0(z());
                        }
                        b5.d.x(false);
                    }
                    return true;
                } catch (Exception e) {
                    f8.g(e, true);
                    return true;
                }
            } catch (Exception e7) {
                f8.g(e7, true);
                this.f14454g0 = false;
            }
        }
        return false;
    }

    public final boolean S(final org.telegram.messenger.kj r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.S(org.telegram.messenger.kj):boolean");
    }

    public final void T(int i10) {
        int i11 = this.U0;
        if (i11 >= 0) {
            ArrayList arrayList = this.R0;
            if (i11 < arrayList.size()) {
                this.U0 = i10;
                this.B0 = true;
                kj kjVar = (kj) arrayList.get(i10);
                if (this.f14483u0 != null && !L(kjVar)) {
                    this.f14483u0.F5();
                }
                S(kjVar);
            }
        }
    }

    public final void U(boolean z10) {
        ArrayList arrayList;
        int i10;
        int i11;
        if (uz.N0) {
            arrayList = this.T0;
        } else {
            arrayList = this.R0;
        }
        if (z10 && (((i11 = uz.S0) == 2 || (i11 == 1 && arrayList.size() == 1)) && !this.V0)) {
            q(false, false, false, false);
            int i12 = this.U0;
            if (i12 >= 0 && i12 < arrayList.size()) {
                kj kjVar = (kj) arrayList.get(this.U0);
                kjVar.f16652b0 = 0.0f;
                kjVar.f16675g0 = 0;
                S(kjVar);
                return;
            }
            return;
        }
        if (uz.O0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        if (E0(i10, arrayList) && z10 && uz.S0 == 0 && !this.V0) {
            v61 v61Var = this.f14458i0;
            if (v61Var != null || this.E0 != null) {
                if (v61Var != null) {
                    ef efVar = this.f14488w0;
                    if (efVar != null) {
                        efVar.b();
                        this.f14488w0 = null;
                    }
                    try {
                        this.f14458i0.m0();
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    this.f14458i0 = null;
                    org.telegram.ui.ActionBar.t6.N1(this.f14483u0);
                } else {
                    this.L0 = null;
                    this.N0 = null;
                    this.P0 = false;
                    this.G0 = null;
                    this.E0.m0();
                    this.E0 = null;
                    try {
                        this.J0.getWindow().clearFlags(128);
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                    i0.r(this.f14443b1);
                    b8.G(this.f14483u0.I1).a0(this.f14483u0.F0(), true, false);
                }
                z0();
                this.f14454g0 = true;
                kj kjVar2 = this.f14483u0;
                kjVar2.f16652b0 = 0.0f;
                kjVar2.f16675g0 = 0;
                at.f(kjVar2.I1).k(at.f14700e2, Integer.valueOf(this.f14483u0.f1()), 0);
                at.f(this.f14483u0.I1).k(at.f14712g2, Integer.valueOf(this.f14483u0.f1()));
                return;
            }
            return;
        }
        int i13 = this.U0;
        if (i13 >= 0 && i13 < arrayList.size()) {
            kj kjVar3 = this.f14483u0;
            if (kjVar3 != null) {
                kjVar3.F5();
            }
            this.B0 = true;
            S((kj) arrayList.get(this.U0));
        }
    }

    public final void V() {
        ArrayList arrayList;
        int i10;
        int i11;
        if (uz.N0) {
            arrayList = this.T0;
        } else {
            arrayList = this.R0;
        }
        if (!arrayList.isEmpty() && (i10 = this.U0) >= 0 && i10 < arrayList.size()) {
            kj kjVar = (kj) arrayList.get(this.U0);
            if (kjVar.f16675g0 > 10) {
                i0(kjVar, 0.0f);
                return;
            }
            if (uz.O0) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            E0(i11, arrayList);
            if (this.U0 < arrayList.size()) {
                this.B0 = true;
                S((kj) arrayList.get(this.U0));
            }
        }
    }

    public final void W(boolean z10) {
        tw twVar;
        long j10;
        if (this.f14450e1 != null) {
            D0(false);
        } else if (z10) {
            int currentAccount = this.f14478s.getCurrentAccount();
            long a10 = this.f14478s.a();
            org.telegram.ui.un unVar = this.f14478s;
            kj kjVar = unVar.l4;
            int classGuid = unVar.getClassGuid();
            org.telegram.ui.un unVar2 = this.f14478s;
            pj pjVar = null;
            if (unVar2 != null) {
                twVar = unVar2.T8();
            } else {
                twVar = null;
            }
            org.telegram.ui.un unVar3 = this.f14478s;
            if (unVar3 != null) {
                j10 = unVar3.e9();
            } else {
                j10 = 0;
            }
            org.telegram.ui.un unVar4 = this.f14478s;
            if (unVar4 != null) {
                pjVar = unVar4.f42270w5;
            }
            x0(currentAccount, a10, null, kjVar, null, classGuid, false, twVar, j10, pjVar);
        } else {
            B0(2, 0, false, false);
        }
    }

    public final boolean X() {
        ki.g gVar = this.J1;
        if (gVar != null) {
            File file = (File) gVar.f11405b;
            c1.b(file);
            file.delete();
            Z();
            return true;
        }
        e0.h hVar = this.E1;
        if (hVar != null && hVar.e()) {
            this.E1 = null;
            if (!hVar.c()) {
                ((ki.k) hVar.e).o();
                hVar.f6021c = true;
            }
            Z();
            return true;
        }
        return false;
    }

    public final void Y(boolean z10) {
        qd qdVar = this.f14438a;
        if (z10) {
            if (!this.V && uz.F0 && pt.f17640o0.requestAudioFocus(qdVar, 3, 2) == 1) {
                this.V = true;
            }
        } else if (this.V) {
            pt.f17640o0.abandonAudioFocus(qdVar);
            this.V = false;
        }
    }

    public final void Z() {
        this.f14450e1 = null;
        this.f14457h1 = null;
        this.f14459i1 = null;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = null;
        this.A1 = 0;
    }

    public final boolean a0() {
        ArrayList arrayList;
        int i10;
        kj kjVar;
        hf hfVar = this.T1;
        if (hfVar != null) {
            kj kjVar2 = hfVar.f16050a;
            this.T1 = null;
            if (uz.N0) {
                arrayList = this.T0;
            } else {
                arrayList = this.R0;
            }
            if (arrayList != null && (i10 = this.U0) >= 0 && i10 < arrayList.size() && (kjVar = (kj) arrayList.get(this.U0)) != null && kj.B0(kjVar.f16690k) == kj.B0(kjVar2.f16690k) && kjVar.f1() == kjVar2.f1()) {
                this.B0 = false;
                float f7 = hfVar.f16051b;
                kjVar.f16657c0 = f7;
                kjVar.f16652b0 = f7;
                kjVar.f16661d0 = hfVar.f16052c;
                kjVar.f16675g0 = hfVar.d;
                S(kjVar);
                R(kjVar, false);
                return true;
            }
        }
        return false;
    }

    public final void b0(kj kjVar) {
        if ((this.f14458i0 != null || this.E0 != null) && kjVar != null && this.f14483u0 != null && L(kjVar)) {
            try {
                v0(this.f14483u0);
                ValueAnimator valueAnimator = this.P1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.P1.cancel();
                }
                if (!kj.R4(kjVar.f16690k) && !kjVar.h4()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O1, 1.0f);
                    this.P1 = ofFloat;
                    ofFloat.addUpdateListener(this.Q1);
                    this.P1.setDuration(300L);
                    this.P1.start();
                } else {
                    this.O1 = 1.0f;
                    n0();
                }
                v61 v61Var = this.f14458i0;
                if (v61Var != null) {
                    v61Var.h0();
                } else {
                    v61 v61Var2 = this.E0;
                    if (v61Var2 != null) {
                        v61Var2.h0();
                    }
                }
                j(kjVar);
                this.f14454g0 = false;
                at.f(this.f14483u0.I1).k(at.f14712g2, Integer.valueOf(this.f14483u0.f1()));
                try {
                    b5.d.b(1);
                    if (!this.S1) {
                        b5.d.x(true);
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
    }

    public final void c0() {
        kj kjVar;
        v61 v61Var = this.f14458i0;
        if (v61Var != null && (kjVar = this.f14483u0) != null && !this.f14454g0) {
            if (v61Var.d != null && v61Var.L == 2) {
                q(false, false, false, false);
                S(kjVar);
                return;
            }
            v61Var.h0();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        qp qpVar;
        kj kjVar;
        ArrayList arrayList;
        char c10;
        int indexOf;
        int i12 = 0;
        if (i10 != at.Y1 && i10 != at.R1) {
            if (i10 == at.f14806w) {
                if (!((Boolean) objArr[2]).booleanValue()) {
                    long longValue = ((Long) objArr[1]).longValue();
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    kj kjVar2 = this.f14483u0;
                    if (kjVar2 != null && longValue == kjVar2.f16690k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(kjVar2.f1()))) {
                        q(true, true, false, false);
                    }
                    ArrayList arrayList3 = this.f14449e0;
                    if (arrayList3 != null && !arrayList3.isEmpty() && longValue == ((kj) this.f14449e0.get(0)).f16690k.peer_id.channel_id) {
                        while (i12 < arrayList2.size()) {
                            Integer num = (Integer) arrayList2.get(i12);
                            kj kjVar3 = (kj) this.f14452f0.get(num.intValue());
                            this.f14452f0.remove(num.intValue());
                            if (kjVar3 != null) {
                                this.f14449e0.remove(kjVar3);
                            }
                            i12++;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == at.f14698e0) {
                long longValue2 = ((Long) objArr[0]).longValue();
                kj kjVar4 = this.f14483u0;
                if (kjVar4 != null && kj.B0(kjVar4.f16690k) == longValue2) {
                    q(false, true, false, false);
                    return;
                }
                return;
            } else {
                int i13 = at.K0;
                int[] iArr = this.f14440a1;
                HashMap hashMap = this.S0;
                ArrayList arrayList4 = this.R0;
                if (i10 == i13) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    kj kjVar5 = this.f14483u0;
                    if (kjVar5 != null && kjVar5.I3() && kj.B0(this.f14483u0.f16690k) == longValue3 && !this.f14483u0.f16710p1) {
                        arrayList4.addAll(0, (ArrayList) objArr[1]);
                        arrayList4.addAll((ArrayList) objArr[2]);
                        int size = arrayList4.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            kj kjVar6 = (kj) arrayList4.get(i14);
                            hashMap.put(Integer.valueOf(kjVar6.f1()), kjVar6);
                            iArr[0] = Math.min(iArr[0], kjVar6.f1());
                        }
                        t0();
                        if (uz.N0) {
                            g();
                        } else {
                            kj kjVar7 = this.f14483u0;
                            if (kjVar7 != null && (indexOf = arrayList4.indexOf(kjVar7)) >= 0) {
                                this.U0 = indexOf;
                            }
                        }
                        this.Z0 = ConnectionsManager.generateClassGuid();
                        return;
                    }
                    return;
                }
                int i15 = at.V;
                int i16 = at.L0;
                if (i10 == i15) {
                    if (((Integer) objArr[3]).intValue() == this.Z0 && this.f14483u0 != null) {
                        long longValue4 = ((Long) objArr[0]).longValue();
                        ((Integer) objArr[4]).getClass();
                        ArrayList arrayList5 = (ArrayList) objArr[2];
                        if (longValue4 == this.Y0) {
                            c10 = 1;
                        } else {
                            c10 = 0;
                        }
                        if (!arrayList5.isEmpty()) {
                            this.W0[c10] = ((Boolean) objArr[5]).booleanValue();
                        }
                        int i17 = 0;
                        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                            kj kjVar8 = (kj) arrayList5.get(i18);
                            if (!kjVar8.S4() && !hashMap.containsKey(Integer.valueOf(kjVar8.f1()))) {
                                i17++;
                                arrayList4.add(0, kjVar8);
                                hashMap.put(Integer.valueOf(kjVar8.f1()), kjVar8);
                                iArr[c10] = Math.min(iArr[c10], kjVar8.f1());
                            }
                        }
                        t0();
                        int indexOf2 = arrayList4.indexOf(this.f14483u0);
                        if (indexOf2 >= 0) {
                            this.U0 = indexOf2;
                        }
                        this.X0 = false;
                        if (uz.N0) {
                            g();
                        }
                        if (i17 != 0) {
                            at.f(this.f14483u0.I1).k(i16, Integer.valueOf(i17));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (!((Boolean) objArr[2]).booleanValue() && (arrayList = this.f14449e0) != null && !arrayList.isEmpty() && ((Long) objArr[0]).longValue() == kj.B0(((kj) this.f14449e0.get(0)).f16690k)) {
                        ArrayList arrayList6 = (ArrayList) objArr[1];
                        while (i12 < arrayList6.size()) {
                            kj kjVar9 = (kj) arrayList6.get(i12);
                            if ((kj.R4(kjVar9.f16690k) || kjVar9.h4()) && !kjVar9.S4() && !kjVar9.g4() && (!this.f14447d0 || (kjVar9.f16690k.media_unread && !kjVar9.N3()))) {
                                this.f14449e0.add(kjVar9);
                                this.f14452f0.put(kjVar9.f1(), kjVar9);
                            }
                            i12++;
                        }
                        return;
                    }
                    return;
                } else if (i10 == at.H4) {
                    v61 v61Var = (v61) objArr[0];
                    if (this.E0 != v61Var && this.f14458i0 != v61Var) {
                        kj kjVar10 = this.f14483u0;
                        if (kjVar10 != null && I(kjVar10) && !H() && (kjVar10.I3() || kj.R4(kjVar10.f16690k))) {
                            this.f14456h0 = true;
                        }
                        R(kjVar10, true);
                        return;
                    }
                    return;
                } else if (i10 == at.T3 && (qpVar = this.Q0) != null && objArr[0] == qpVar) {
                    int size2 = qpVar.f17804c.size() - arrayList4.size();
                    arrayList4.clear();
                    arrayList4.addAll(this.Q0.f17804c);
                    t0();
                    if (uz.N0) {
                        g();
                    } else {
                        kj kjVar11 = this.f14483u0;
                        if (kjVar11 != null) {
                            int indexOf3 = arrayList4.indexOf(kjVar11);
                            if (indexOf3 >= 0) {
                                this.U0 = indexOf3;
                            } else {
                                int i19 = this.U0;
                                if (i19 < 0 || i19 >= arrayList4.size()) {
                                    this.U0 = 0;
                                }
                                if (arrayList4.size() == 0) {
                                    o();
                                } else {
                                    S((kj) arrayList4.get(0));
                                }
                            }
                        }
                    }
                    if (size2 != 0 && (kjVar = this.f14483u0) != null) {
                        at.f(kjVar.I1).k(i16, Integer.valueOf(size2));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        String str = (String) objArr[0];
        kj kjVar12 = this.f14483u0;
        if (kjVar12 != null && kjVar12.I1 == i11 && b8.r(null, kjVar12.F0()).equals(str)) {
            if (this.A0) {
                this.B0 = true;
                S(this.f14483u0);
            } else if (this.D0 == null) {
                try {
                    b8.G(e20.f15506s0);
                    this.D0 = cf.a.a(b8.N(this.f14483u0.f16690k, false, true));
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    public final void g() {
        kj kjVar;
        ArrayList arrayList = this.R0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            ArrayList arrayList3 = this.T0;
            arrayList3.clear();
            int i10 = this.U0;
            if (i10 >= 0 && i10 < arrayList.size()) {
                kjVar = (kj) arrayList.get(this.U0);
                arrayList2.remove(this.U0);
            } else {
                kjVar = null;
            }
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                int nextInt = Utilities.f14520b.nextInt(arrayList2.size());
                arrayList3.add((kj) arrayList2.get(nextInt));
                arrayList2.remove(nextInt);
            }
            if (kjVar != null) {
                arrayList3.add(kjVar);
                this.U0 = arrayList3.size() - 1;
            }
        }
    }

    public native byte[] getWaveform2(short[] sArr, int i10);

    public final boolean h() {
        kj kjVar = this.f14483u0;
        if (kjVar != null) {
            if ((kjVar.I3() || kj.R4(this.f14483u0.f16690k) || this.f14483u0.h4()) && !this.f14483u0.S4() && !this.f14483u0.g4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h0(kj kjVar, boolean z10, boolean z11, boolean z12) {
        y20 y20Var;
        if (kjVar != null) {
            y20Var = kjVar.f16709p0;
        } else {
            y20Var = null;
        }
        if (kjVar != null && y20Var != null) {
            ArrayList arrayList = this.f14442b0;
            if (!z10 || arrayList.isEmpty()) {
                if (z10) {
                    new File(kjVar.f16690k.attachPath).delete();
                }
                ?? obj = new Object();
                obj.f16623a = kjVar;
                obj.f16625c = kjVar.I1;
                obj.f16624b = y20Var;
                obj.d = z12;
                arrayList.add(obj);
                if (z11) {
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

    public final void i(kj kjVar) {
        if (kjVar != null && !this.f14442b0.isEmpty()) {
            for (int i10 = 0; i10 < this.f14442b0.size(); i10++) {
                kf kfVar = (kf) this.f14442b0.get(i10);
                kj kjVar2 = kfVar.f16623a;
                if (kjVar2.T(kjVar) && kjVar2.I1 == kjVar.I1) {
                    if (i10 == 0) {
                        synchronized (this.f14441b) {
                            kfVar.f16624b.W = true;
                        }
                        return;
                    }
                    this.Z.remove((kf) this.f14442b0.remove(i10));
                    k(true);
                    return;
                }
            }
        }
    }

    public final void i0(kj kjVar, float f7) {
        kj kjVar2 = this.f14483u0;
        if ((this.f14458i0 != null || this.E0 != null) && kjVar != null && kjVar2 != null && L(kjVar)) {
            try {
                v61 v61Var = this.f14458i0;
                if (v61Var != null) {
                    long U = v61Var.U();
                    if (U == -9223372036854775807L) {
                        this.f14481t0 = f7;
                    } else {
                        kjVar2.f16652b0 = f7;
                        long j10 = (int) (((float) U) * f7);
                        this.f14458i0.q0(j10, false);
                        if (!this.S1) {
                            b5.d.v(j10);
                        }
                    }
                } else {
                    v61 v61Var2 = this.E0;
                    if (v61Var2 != null) {
                        v61Var2.p0(((float) v61Var2.U()) * f7);
                        if (!this.S1) {
                            b5.d.v(((float) this.E0.U()) * f7);
                        }
                    }
                }
                at.f(kjVar.I1).k(at.f14724i2, Integer.valueOf(kjVar2.f1()), Float.valueOf(f7));
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    public final void j(kj kjVar) {
        int i10;
        int i11;
        int requestAudioFocus;
        if (!kj.R4(kjVar.f16690k) && !kjVar.h4()) {
            i10 = 1;
        } else if (this.L) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        if (this.U != i10) {
            this.U = i10;
            if (i10 == 3) {
                requestAudioFocus = pt.f17640o0.requestAudioFocus(this, 0, 1);
            } else {
                AudioManager audioManager = pt.f17640o0;
                if (i10 == 2 && !uz.G0) {
                    i11 = 3;
                } else {
                    i11 = 1;
                }
                requestAudioFocus = audioManager.requestAudioFocus(this, 3, i11);
            }
            if (requestAudioFocus == 1) {
                this.X = 2;
            }
        }
    }

    public final void k(boolean z10) {
        if (!this.Z.isEmpty()) {
            this.f14439a0 = (kf) this.Z.get(0);
        } else {
            this.f14439a0 = null;
        }
        if (this.f14439a0 != null || z10) {
            if (VideoEncodingService.e == null) {
                try {
                    w0.f18945b.startService(new Intent(w0.f18945b, VideoEncodingService.class));
                } catch (Exception e) {
                    f8.g(e, true);
                }
            } else if (z10) {
                kf kfVar = B().f14439a0;
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService.f14529b != kfVar) {
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
        org.telegram.ui.k4 k4Var = this.L0;
        if (k4Var != null) {
            if (z10) {
                PipRoundVideoView pipRoundVideoView = this.H0;
                if (pipRoundVideoView != null) {
                    this.I0 = 2;
                    pipRoundVideoView.a(true);
                    this.H0 = null;
                    return;
                }
                if (k4Var.getParent() == null) {
                    this.N0.addView(this.L0);
                }
                this.E0.A0(this.G0);
            } else if (k4Var.getParent() != null) {
                this.I0 = 1;
                this.N0.removeView(this.L0);
            } else {
                if (this.H0 == null) {
                    try {
                        PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                        this.H0 = pipRoundVideoView2;
                        pipRoundVideoView2.d(this.J0, new rd(this, 4));
                    } catch (Exception unused) {
                        this.H0 = null;
                    }
                }
                PipRoundVideoView pipRoundVideoView3 = this.H0;
                if (pipRoundVideoView3 != null) {
                    this.E0.A0(pipRoundVideoView3.f24079c);
                }
            }
        }
    }

    public final void l(int i10) {
        ArrayList arrayList;
        int i11;
        File N;
        b6 q6 = b6.q(i10);
        int e = w0.e();
        int i12 = 2;
        if (e == 1) {
            if (!q6.N.f14572g || !q6.p().d) {
                return;
            }
        } else if (e == 2) {
            if (!q6.O.f14572g || !q6.o().d) {
                return;
            }
        } else if (!q6.M.f14572g || !q6.n().d) {
            return;
        }
        if (uz.N0) {
            arrayList = this.T0;
        } else {
            arrayList = this.R0;
        }
        if (arrayList != null && arrayList.size() >= 2) {
            if (uz.O0) {
                i11 = this.U0 + 1;
                if (i11 >= arrayList.size()) {
                    i11 = 0;
                }
            } else {
                i11 = this.U0 - 1;
                if (i11 < 0) {
                    i11 = arrayList.size() - 1;
                }
            }
            if (i11 >= 0 && i11 < arrayList.size()) {
                kj kjVar = (kj) arrayList.get(i11);
                File file = null;
                if (!TextUtils.isEmpty(kjVar.f16690k.attachPath)) {
                    File file2 = new File(kjVar.f16690k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file != null) {
                    N = file;
                } else {
                    b8.G(i10);
                    N = b8.N(kjVar.f16690k, false, true);
                }
                N.exists();
                if (N != file && !N.exists() && kjVar.I3()) {
                    b8 G = b8.G(i10);
                    TLRPC.Document F0 = kjVar.F0();
                    if (!kj.Q5(kjVar.f16690k)) {
                        i12 = 0;
                    }
                    G.X(F0, kjVar, 0, i12);
                }
            }
        }
    }

    public final void l0(int i10) {
        boolean z10 = uz.N0;
        if (i10 == 2) {
            uz.N0 = true;
            uz.O0 = false;
        } else if (i10 == 1) {
            uz.O0 = true;
            uz.N0 = false;
        } else {
            uz.O0 = false;
            uz.N0 = false;
        }
        MediaController B = B();
        kj kjVar = B.f14483u0;
        if (kjVar != null && kjVar.I3()) {
            B.l(B.f14483u0.I1);
        }
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putBoolean("shuffleMusic", uz.N0);
        edit.putBoolean("playOrderReversed", uz.O0);
        edit.apply();
        boolean z11 = uz.N0;
        if (z10 != z11) {
            if (z11) {
                g();
                return;
            }
            kj kjVar2 = this.f14483u0;
            if (kjVar2 != null) {
                int indexOf = this.R0.indexOf(kjVar2);
                this.U0 = indexOf;
                if (indexOf == -1) {
                    r();
                    q(true, true, false, false);
                }
            }
        }
    }

    public final void m() {
        int i10;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - f14436e2) >= 5000) {
                AudioManager audioManager = (AudioManager) w0.f18945b.getSystemService("audio");
                if (this.L) {
                    i10 = 0;
                } else {
                    i10 = 3;
                }
                int streamVolume = audioManager.getStreamVolume(i10);
                if (streamVolume == 0) {
                    audioManager.adjustStreamVolume(i10, streamVolume, 1);
                    f14436e2 = currentTimeMillis;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void m0(boolean z10, float f7) {
        String str;
        String str2;
        float f10;
        if (z10) {
            if (this.f14473q0 >= 6.0f && f7 == 1.0f && this.f14483u0 != null) {
                this.f14458i0.g0();
                kj kjVar = this.f14483u0;
                i0.h3(new je(this, kjVar, kjVar.f16652b0, 0), 50L);
            }
            this.f14473q0 = f7;
            if (Math.abs(f7 - 1.0f) > 0.001f) {
                this.f14479s0 = f7;
            }
        } else {
            this.f14471p0 = f7;
            if (Math.abs(f7 - 1.0f) > 0.001f) {
                this.f14476r0 = f7;
            }
        }
        v61 v61Var = this.f14458i0;
        if (v61Var != null) {
            v61Var.v0(Math.round(f7 * 10.0f) / 10.0f);
        } else {
            v61 v61Var2 = this.E0;
            if (v61Var2 != null) {
                v61Var2.v0(Math.round(f7 * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor edit = wp.d1().edit();
        if (z10) {
            str = "musicPlaybackSpeed";
        } else {
            str = "playbackSpeed";
        }
        SharedPreferences.Editor putFloat = edit.putFloat(str, f7);
        if (z10) {
            str2 = "fastMusicPlaybackSpeed";
        } else {
            str2 = "fastPlaybackSpeed";
        }
        if (z10) {
            f10 = this.f14479s0;
        } else {
            f10 = this.f14476r0;
        }
        putFloat.putFloat(str2, f10).commit();
        at.e().k(at.J4, new Object[0]);
        if (!this.S1) {
            b5.d.z(f7);
        }
    }

    public final void n(boolean z10) {
        File file;
        File file2;
        boolean z11;
        File file3;
        e0.h hVar;
        e0.h hVar2;
        if (this.G1) {
            yd ydVar = this.F1;
            if (ydVar != null) {
                i0.r(ydVar);
                this.F1 = null;
            }
            if (!z10 && (hVar2 = this.E1) != null) {
                z11 = hVar2.c();
            } else {
                z11 = false;
            }
            if (!z11 && (hVar = this.E1) != null) {
                hVar.f6020b = false;
                ((ki.k) hVar.e).b();
            }
            if (z11 && (file3 = this.f14459i1) != null) {
                c1.b(file3);
            }
            x(!z10);
            return;
        }
        this.f14450e1 = null;
        c1.b(this.f14459i1);
        if (z10 && (file2 = this.f14459i1) != null) {
            try {
                file2.delete();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        this.f14459i1 = null;
        if (z10 && (file = this.f14457h1) != null) {
            file.delete();
        }
        this.f14457h1 = null;
        this.f14491x0 = false;
        this.f14475r = false;
        this.O = false;
    }

    public final void n0() {
        float f7;
        try {
            if (this.X != 1) {
                f7 = 1.0f;
            } else {
                f7 = 0.2f;
            }
            v61 v61Var = this.f14458i0;
            float f10 = 0.0f;
            if (v61Var != null) {
                if (!b5.d.u()) {
                    f10 = this.O1 * f7;
                }
                v61Var.B0(f10);
                return;
            }
            v61 v61Var2 = this.E0;
            if (v61Var2 != null) {
                if (b5.d.u()) {
                    f7 = 0.0f;
                }
                v61Var2.B0(f7);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void o() {
        q(true, true, false, false);
        this.D0 = null;
        this.B0 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            b6 q6 = b6.q(i10);
            q6.f14928b.clear();
            q6.f14929c.clear();
            q6.d.clear();
            q6.e.clear();
            q6.f14930f.clear();
            q6.h.clear();
            q6.F.b();
        }
        this.f14442b0.clear();
        this.f14445c0.clear();
        this.T1 = null;
        this.f14449e0 = null;
        this.f14452f0 = null;
        r();
    }

    public final boolean o0(ArrayList arrayList, kj kjVar, long j10, boolean z10, e2.a0 a0Var) {
        HashMap hashMap;
        kj kjVar2 = this.f14483u0;
        ArrayList arrayList2 = this.R0;
        if (kjVar2 == kjVar) {
            int indexOf = arrayList2.indexOf(kjVar);
            if (indexOf >= 0) {
                this.U0 = indexOf;
            }
            return S(kjVar);
        }
        this.V0 = !z10;
        this.Y0 = j10;
        this.B0 = !arrayList2.isEmpty();
        r();
        this.C0 = a0Var;
        boolean z11 = false;
        if (!arrayList.isEmpty() && o5.C(kj.B0(((kj) arrayList.get(0)).f16690k))) {
            z11 = true;
        }
        int size = arrayList.size() - 1;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        while (true) {
            hashMap = this.S0;
            if (size < 0) {
                break;
            }
            kj kjVar3 = (kj) arrayList.get(size);
            if (kjVar3.I3()) {
                int f12 = kjVar3.f1();
                if (f12 > 0 || z11) {
                    i10 = Math.min(i10, f12);
                    i11 = Math.max(i11, f12);
                }
                arrayList2.add(kjVar3);
                hashMap.put(Integer.valueOf(f12), kjVar3);
            }
            size--;
        }
        t0();
        int indexOf2 = arrayList2.indexOf(kjVar);
        this.U0 = indexOf2;
        if (indexOf2 == -1) {
            r();
            this.U0 = arrayList2.size();
            arrayList2.add(kjVar);
            hashMap.put(Integer.valueOf(kjVar.f1()), kjVar);
        }
        if (kjVar.I3() && !kjVar.f16710p1) {
            if (uz.N0) {
                g();
            }
            if (z10) {
                if (this.C0 == null) {
                    vi b02 = vi.b0(kjVar.I1);
                    b02.getMessagesStorage().f16331a.c(new m2(b02, kj.B0(kjVar.f16690k), i10, i11, 1));
                } else {
                    this.Z0 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return S(kjVar);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        i0.g3(new vd(this, i10, 1));
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public final void p(boolean z10, boolean z11) {
        q(z10, z11, false, false);
    }

    public final void p0(TextureView textureView, org.telegram.ui.k4 k4Var, FrameLayout frameLayout, boolean z10) {
        if (textureView != null) {
            boolean z11 = true;
            if (!z10 && this.G0 == textureView) {
                this.I0 = 1;
                this.G0 = null;
                this.L0 = null;
                this.N0 = null;
                return;
            }
            v61 v61Var = this.E0;
            if (v61Var != null && textureView != this.G0) {
                if (k4Var == null || !k4Var.d) {
                    z11 = false;
                }
                this.M0 = z11;
                this.G0 = textureView;
                PipRoundVideoView pipRoundVideoView = this.H0;
                if (pipRoundVideoView != null) {
                    v61Var.A0(pipRoundVideoView.f24079c);
                } else {
                    v61Var.A0(textureView);
                }
                this.L0 = k4Var;
                this.N0 = frameLayout;
                if (this.P0 && k4Var != null) {
                    k4Var.a(this.O0, 0);
                }
            }
        }
    }

    public final void q(boolean r21, boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.q(boolean, boolean, boolean, boolean):void");
    }

    public final void q0() {
        this.L = true;
        AudioManager audioManager = pt.f17640o0;
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
        int[] iArr = this.f14440a1;
        iArr[1] = Integer.MAX_VALUE;
        iArr[0] = Integer.MAX_VALUE;
        this.X0 = false;
        this.C0 = null;
        this.T1 = null;
    }

    public final void r0(ArrayList arrayList, boolean z10) {
        ArrayList arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        this.f14449e0 = arrayList2;
        if (arrayList2 != null) {
            this.f14447d0 = z10;
            this.f14452f0 = new SparseArray();
            for (int i10 = 0; i10 < this.f14449e0.size(); i10++) {
                kj kjVar = (kj) this.f14449e0.get(i10);
                this.f14452f0.put(kjVar.f1(), kjVar);
            }
        }
    }

    public final void s(ki.g gVar) {
        byte[] bArr;
        TLRPC.TL_document tL_document;
        int i10;
        File file = (File) gVar.f11405b;
        this.f14459i1 = file;
        long j10 = gVar.f11404a;
        this.f14461j1 = j10;
        byte[] bArr2 = (byte[]) gVar.f11406c;
        String str = null;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr2.clone();
        }
        G0(file, j10, bArr);
        if (this.A1 == 3) {
            this.J1 = gVar;
            e0.h hVar = this.E1;
            if (hVar != null) {
                ((ki.k) hVar.e).o();
                hVar.f6021c = true;
                this.E1 = null;
            }
            Y(false);
            j0(false);
            return;
        }
        vi.b0(this.f14455g1).B1(this.l1, this.f14465m1, null);
        if (this.A1 == 1) {
            TLRPC.TL_document tL_document2 = this.f14450e1;
            String absolutePath = file.getAbsolutePath();
            long j11 = this.l1;
            kj kjVar = this.f14472p1;
            kj kjVar2 = this.f14474q1;
            boolean z10 = this.B1;
            int i11 = this.C1;
            if (this.D1) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            pz f7 = pz.f(tL_document2, null, absolutePath, j11, kjVar, kjVar2, null, null, null, null, z10, i11, 0, i10, null, null, false);
            f7.R = this.f14468n1;
            f7.T = this.f14470o1;
            f7.H = this.f14477r1;
            f7.K = this.f14480s1;
            f7.Q = 0L;
            rz.C(this.f14455g1).r0(f7);
        }
        at f10 = at.f(this.f14455g1);
        Integer valueOf = Integer.valueOf(this.f14453f1);
        int i12 = this.A1;
        if (i12 == 2) {
            tL_document = this.f14450e1;
        } else {
            tL_document = null;
        }
        if (i12 == 2) {
            str = file.getAbsolutePath();
        }
        f10.k(at.f14782s2, valueOf, tL_document, str);
        x(true);
    }

    public final void t0() {
        Collections.sort(this.R0, new a4.d(19));
    }

    public final void u0(boolean z10) {
        boolean z11;
        kj kjVar = this.f14483u0;
        if (kjVar != null) {
            int i10 = 0;
            at.f(kjVar.I1).k(at.f14796u2, Boolean.valueOf(this.L));
            v61 v61Var = this.E0;
            if (v61Var != null) {
                if (!this.L) {
                    i10 = 3;
                }
                v61Var.x0(i10);
                if (!z10) {
                    if (this.E0.S() < 1000) {
                        this.E0.p0(0L);
                    }
                    this.E0.h0();
                    return;
                }
                R(this.f14483u0, true);
                return;
            }
            v61 v61Var2 = this.f14458i0;
            if (v61Var2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            kj kjVar2 = this.f14483u0;
            float f7 = kjVar2.f16652b0;
            int i11 = kjVar2.f16679h0;
            if (!z10 && v61Var2 != null && v61Var2.d0() && i11 * f7 <= 1.0f) {
                kjVar2.f16652b0 = 0.0f;
            } else {
                kjVar2.f16652b0 = f7;
            }
            q(false, true, false, false);
            S(kjVar2);
            if (z10) {
                if (z11) {
                    i0.h3(new t6(19, this, kjVar2), 100L);
                } else {
                    R(kjVar2, true);
                }
            }
        }
    }

    public final void v0(kj kjVar) {
        synchronized (this.f14496z0) {
            Timer timer = this.f14494y0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f14494y0 = null;
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
            kjVar.S0();
            Timer timer2 = new Timer();
            this.f14494y0 = timer2;
            timer2.schedule(new we(0, this, kjVar), 0L, 17L);
        }
    }

    public final void w0(org.telegram.ui.un unVar) {
        if (unVar != null) {
            if ((this.f14451f != null || this.f14466n != null) && this.e != null) {
                if (!uz.k(false)) {
                    kj kjVar = this.f14483u0;
                    if (kjVar != null) {
                        if (!kj.R4(kjVar.f16690k) && !this.f14483u0.h4()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f14478s = unVar;
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
                    this.f14493y = 0;
                    this.D = 0;
                    this.F = 0;
                    this.E = 0;
                    Utilities.e.c(new rd(this, 3));
                    this.P = true;
                }
            }
        }
    }

    public final void x(boolean z10) {
        File file;
        Y(false);
        j0(false);
        e0.h hVar = this.E1;
        if (hVar != null) {
            ((ki.k) hVar.e).o();
            hVar.f6021c = true;
            this.E1 = null;
        }
        if (!z10 && (file = this.f14459i1) != null) {
            c1.b(file);
            this.f14459i1.delete();
        }
        Z();
        this.f14491x0 = false;
        this.f14475r = false;
        this.O = false;
    }

    public final void x0(int i10, long j10, kj kjVar, kj kjVar2, TL_stories.StoryItem storyItem, int i11, boolean z10, tw twVar, long j11, pj pjVar) {
        boolean z11;
        long j12;
        long c22;
        long j13;
        kj kjVar3 = this.f14483u0;
        if (kjVar3 != null && I(kjVar3) && !H()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f14491x0 = z10;
        Y(true);
        try {
            this.K0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.G1 && !X()) {
            i0.g3(new ud(i10, i11, 0));
        } else if (s0(i10)) {
            this.G1 = true;
            this.H1 = false;
            this.I1 = false;
            this.f14455g1 = i10;
            this.f14453f1 = i11;
            this.l1 = j10;
            this.f14468n1 = j11;
            this.f14470o1 = pjVar;
            if (kjVar2 == null) {
                c22 = 0;
            } else {
                c22 = kj.c2(i10, kjVar2.f16690k, false, false);
            }
            this.f14465m1 = c22;
            this.f14472p1 = kjVar;
            this.f14474q1 = kjVar2;
            this.f14477r1 = storyItem;
            this.f14480s1 = twVar;
            this.f14457h1 = null;
            this.f14459i1 = null;
            this.f14461j1 = 0L;
            this.f14463k1 = 0;
            this.f14484u1 = 0L;
            this.A1 = 0;
            yd ydVar = new yd(i10, i11, 0, j10, this);
            this.F1 = ydVar;
            if (z11) {
                j13 = 500;
            } else {
                j13 = 50;
            }
            i0.h3(ydVar, j13);
        } else {
            if (v2.f18578a) {
                f8.b("AudioRecorder legacy selected: account=" + i10 + ", dialog=" + j10 + ", guid=" + i11);
            }
            sd sdVar = new sd(this, i10, i11, j10, j11, pjVar, kjVar2, kjVar, storyItem, twVar);
            this.K1 = sdVar;
            if (z11) {
                j12 = 500;
            } else {
                j12 = 50;
            }
            this.L1.d(sdVar, j12);
        }
    }

    public final void y0() {
        if (!this.f14442b0.isEmpty()) {
            kf kfVar = (kf) this.f14442b0.get(0);
            y20 y20Var = kfVar.f16624b;
            synchronized (this.f14441b) {
                if (y20Var != null) {
                    try {
                        y20Var.W = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            new Thread(new a(kfVar, 19)).start();
        }
    }

    public final bi.j4 z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.z():bi.j4");
    }

    public final void z0() {
        synchronized (this.f14496z0) {
            Timer timer = this.f14494y0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f14494y0 = null;
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
