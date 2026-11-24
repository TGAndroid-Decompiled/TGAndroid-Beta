package org.telegram.messenger;

import android.animation.ValueAnimator;
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
import android.view.ViewGroup;
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
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class MediaController implements AudioManager.OnAudioFocusChangeListener, jm7, SensorEventListener {
    public static final String[] W1;
    public static final String[] X1;
    public static final ConcurrentHashMap Y1;
    public static Runnable Z1;
    public static yn6 a2;
    public static yn6 b2;
    public static ArrayList c2;
    public static ArrayList d2;
    public static qu e2;
    public static volatile MediaController f2;
    public static long g2;
    public static boolean h2;
    public boolean B0;
    public boolean C0;
    public byte C1;
    public ko6 D0;
    public boolean D1;
    public byte E;
    public g10 E0;
    public int E1;
    public int F;
    public ndc F0;
    public boolean F1;
    public int G;
    public boolean G0;
    public u30 G1;
    public long H;
    public TextureView H0;
    public dn6 H1;
    public PipRoundVideoView I0;
    public boolean I1;
    public boolean J;
    public byte J0;
    public boolean J1;
    public boolean K;
    public LaunchActivity K0;
    public boolean K1;
    public ViewGroup L0;
    public m30 L1;
    public boolean M;
    public jy M0;
    public an6 M1;
    public boolean N;
    public boolean N0;
    public final mp3 N1;
    public boolean O;
    public FrameLayout O0;
    public final mp3 O1;
    public boolean P;
    public float P0;
    public boolean Q;
    public boolean Q0;
    public float Q1;
    public float R;
    public jc7 R0;
    public ValueAnimator R1;
    public sw T1;
    public boolean U1;
    public byte V;
    public int V0;
    public mo6 V1;
    public boolean W;
    public boolean W0;
    public boolean X;
    public boolean Y0;
    public boolean Z;
    public long Z0;
    public int a1;
    public oo6 b0;
    public long b1;
    public SensorManager c;
    public PowerManager.WakeLock d;
    public Sensor e;
    public boolean e0;
    public boolean e1;
    public Sensor f;
    public ArrayList f0;
    public AudioRecord f1;
    public SparseArray g0;
    public TLRPC.TL_document g1;
    public Sensor h;
    public int i1;
    public File j1;
    public File k1;
    public long l1;
    public boolean m0;
    public int m1;
    public Sensor n;
    public int n0;
    public long n1;
    public String o0;
    public long o1;
    public long p0;
    public long p1;
    public v67 q1;
    public boolean r;
    public k47 r1;
    public yv1 s;
    public k47 s1;
    public TL_stories.StoryItem t1;
    public float u0;
    public l3a u1;
    public k47 v0;
    public boolean w;
    public k47 w0;
    public long w1;
    public long x;
    public ho6 x0;
    public int y;
    public boolean y0;
    public final ByteBuffer z1;
    public final z00 a = new z00(this, (byte) 1);
    public final Object b = new Object();
    public long I = 0;
    public float L = -100.0f;
    public final float[] S = new float[3];
    public final float[] T = new float[3];
    public final float[] U = new float[3];
    public byte Y = 0;
    public final ArrayList a0 = new ArrayList();
    public final ArrayList c0 = new ArrayList();
    public final HashMap d0 = new HashMap();
    public boolean h0 = false;
    public boolean i0 = false;
    public ndc j0 = null;
    public ndc k0 = null;
    public int l0 = 0;
    public float q0 = 1.0f;
    public float r0 = 1.0f;
    public float s0 = 1.0f;
    public float t0 = 1.0f;
    public Timer z0 = null;
    public final Object A0 = new Object();
    public final ArrayList S0 = new ArrayList();
    public final HashMap T0 = new HashMap();
    public final ArrayList U0 = new ArrayList();
    public final boolean[] X0 = {false, false};
    public final int[] c1 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public final tn6 d1 = new tn6(this);
    public int h1 = -1;
    public short[] v1 = new short[1024];
    public final Object x1 = new Object();
    public final ArrayList y1 = new ArrayList();
    public int A1 = 1280;
    public char B1 = 48000;
    public final o04 P1 = new o04(this, (byte) 24);
    public final af0 S1 = new af0(this, (byte) 8);

    static {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            str = "datetaken";
        } else {
            str = "date_modified";
        }
        W1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str, "orientation", "width", "height", "_size"};
        if (i <= 28) {
            str2 = "datetaken";
        } else {
            str2 = "date_modified";
        }
        X1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", str2, "duration", "width", "height", "_size"};
        Y1 = new ConcurrentHashMap();
        c2 = new ArrayList();
        d2 = new ArrayList();
    }

    public MediaController() {
        mp3 mp3Var = new mp3("recordQueue");
        this.N1 = mp3Var;
        mp3Var.setPriority(10);
        mp3 mp3Var2 = new mp3("fileEncodingQueue");
        this.O1 = mp3Var2;
        mp3Var2.setPriority(10);
        mp3Var.c(new zm6(this, (byte) 0));
        Utilities.e.c(new zm6(this, (byte) 1));
        this.z1 = ByteBuffer.allocateDirect(1920);
        gm.c3(new zm6(this, (byte) 2));
        ContentResolver contentResolver = a.b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new pe1(null, (byte) 1));
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new pe1(null, (byte) 2));
        } catch (Exception e3) {
            fc4.g(e3, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new pe1(null, (byte) 1));
        } catch (Exception e4) {
            fc4.g(e4, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new pe1(null, (byte) 2));
        } catch (Exception e5) {
            fc4.g(e5, true);
        }
    }

    public static boolean B(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = a.b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[3];
                    if (inputStream.read(bArr, 0, 3) == 3) {
                        if (new String(bArr).equalsIgnoreCase("gif")) {
                            try {
                                inputStream.close();
                                return true;
                            } catch (Exception e) {
                                fc4.g(e, true);
                                return true;
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                fc4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    fc4.g(e5, true);
                }
            }
            throw th;
        }
    }

    public static boolean H(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = a.b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[12];
                    if (inputStream.read(bArr, 0, 12) == 12) {
                        String lowerCase = new String(bArr).toLowerCase();
                        if (lowerCase.startsWith("riff")) {
                            if (lowerCase.endsWith("webp")) {
                                try {
                                    inputStream.close();
                                    return true;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return true;
                                }
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                fc4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    fc4.g(e5, true);
                }
            }
            throw th;
        }
    }

    public static void H0(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String n = wi8.n(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = n.getBytes("UTF-8");
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
                            fileInputStream = new FileInputStream(file2);
                            try {
                                byte[] bArr2 = new byte[65536];
                                while (true) {
                                    int read4 = fileInputStream.read(bArr2);
                                    if (read4 <= 0 || (zArr != null && zArr[0])) {
                                        break;
                                    }
                                    outputStream.write(bArr2, 0, read4);
                                }
                                fileInputStream.close();
                                return;
                            } finally {
                            }
                        }
                    }
                } else {
                    throw new IOException("Not a JPEG: " + file);
                }
            } finally {
            }
        } else {
            wa3.d(hg9.j(length, "XMP segment too large: "));
        }
    }

    public static void N(int i) {
        Thread thread = new Thread(new fx0(i, (byte) 6));
        thread.setPriority(1);
        thread.start();
    }

    public static int P(int r5, int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.P(int, int, int, int, int):int");
    }

    public static void c0(String str, String str2, Context context, qac qacVar) {
        he heVar;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && context != null) {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists() && file2.exists()) {
                if (!gm.G1(Uri.fromFile(file), 0) && !gm.G1(Uri.fromFile(file2), 0)) {
                    boolean[] zArr = {false};
                    boolean[] zArr2 = new boolean[1];
                    try {
                        he heVar2 = new he(2, null, context);
                        heVar2.m(jb6.M0(2131748536, null));
                        heVar2.setCanceledOnTouchOutside(false);
                        heVar2.setCancelable(true);
                        heVar2.setOnCancelListener(new wo1(zArr, (byte) 3));
                        gm.d3(new gn6(zArr2, heVar2, (byte) 1), 250L);
                        heVar = heVar2;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        heVar = null;
                    }
                    new Thread(new e77(file, file2, zArr, qacVar, heVar, zArr2)).start();
                    return;
                }
                return;
            }
            d0(str, context, 0, null, null, qacVar);
        }
    }

    public static native boolean cropOpusFile(String str, String str2, long j, long j2);

    public static void d0(java.lang.String r12, android.content.Context r13, int r14, java.lang.String r15, java.lang.String r16, defpackage.qac r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.d0(java.lang.String, android.content.Context, int, java.lang.String, java.lang.String, qac):void");
    }

    public static Uri e0(int i, File file, String str) {
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String D = bc4.D(file);
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D);
            if ((i == 0 || i == 1) && mimeTypeFromExtension != null) {
                if (mimeTypeFromExtension.startsWith("image")) {
                    i = 0;
                }
                if (mimeTypeFromExtension.startsWith("video")) {
                    i = 1;
                }
            }
            if (i == 0) {
                if (str == null) {
                    str = gm.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i == 1) {
                if (str == null) {
                    str = gm.p0(1, D);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i == 2) {
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
            contentValues.put("mime_type", mimeTypeFromExtension);
            Uri insert = a.b.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                gm.D(fileInputStream, a.b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static void f0(Context context, j5 j5Var, ArrayList arrayList, we7 we7Var) {
        r63 r63Var;
        if (arrayList.isEmpty()) {
            return;
        }
        ?? obj = new Object();
        obj.d = new HashMap();
        obj.a = j5Var;
        obj.c = arrayList;
        obj.s = we7Var;
        obj.w = ((k47) arrayList.get(0)).I3();
        int i = j5Var.a;
        nm7.f(i).a(obj, nm7.Y1);
        nm7.f(i).a(obj, nm7.X1);
        nm7.f(i).a(obj, nm7.Z1);
        if (PhotoViewer.r0().V0()) {
            r63Var = new r63();
        } else {
            r63Var = null;
        }
        he heVar = new he(2, r63Var, context);
        obj.b = heVar;
        heVar.m(jb6.M0(2131748536, null));
        heVar.setCancelable(true);
        heVar.I = true;
        heVar.setOnCancelListener(new ct0(obj, (byte) 12));
        gm.d3(new eo6(obj, (byte) 1), 250L);
        new Thread(new eo6(obj, (byte) 2)).start();
    }

    public static native byte[] getWaveform(String str);

    public static void i0(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.i0(boolean):void");
    }

    public static native int isOpusFile(String str);

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    public static java.lang.String o(long r15, android.net.Uri r17, java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.o(long, android.net.Uri, java.lang.String):java.lang.String");
    }

    public static File p(String str) {
        int lastIndexOf;
        File file;
        try {
            File f1 = gm.f1();
            f1.mkdirs();
            if (gm.G1(Uri.fromFile(f1), 0)) {
                return null;
            }
            int i = 0;
            do {
                File f12 = gm.f1();
                if (i == 0) {
                    file = new File(f12, str);
                } else {
                    if (str.lastIndexOf(".") > 0) {
                        file = new File(f12, str.substring(0, lastIndexOf) + " (" + i + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(f12, str + " (" + i + ")");
                    }
                }
                i++;
            } while (file.exists());
            return file;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static int q(int r5, int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.q(int, int, int, boolean):int");
    }

    public static int r(MediaExtractor mediaExtractor, boolean z) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (z) {
                if (string.startsWith("audio/")) {
                    return i;
                }
            } else if (string.startsWith("video/")) {
                return i;
            }
        }
        return -5;
    }

    public static boolean r0(int i) {
        in0 in0Var = yed.b;
        in0Var.a();
        if (in0Var.c) {
            in0Var.a();
            return in0Var.d;
        } else if (!oc7.r1(i).l4.k0.f) {
            return true;
        } else {
            return false;
        }
    }

    private native int startRecord(String str, int i);

    private native void stopRecord();

    public static boolean t() {
        AudioDeviceInfo[] devices;
        try {
            for (AudioDeviceInfo audioDeviceInfo : lo7.p0.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            fc4.g(e, true);
            return false;
        }
    }

    public static java.lang.String v(android.net.Uri r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.v(android.net.Uri):java.lang.String");
    }

    public static MediaController w() {
        MediaController mediaController;
        MediaController mediaController2 = f2;
        if (mediaController2 == null) {
            synchronized (MediaController.class) {
                mediaController = f2;
                if (mediaController == null) {
                    mediaController = new MediaController();
                    f2 = mediaController;
                }
            }
            return mediaController;
        }
        return mediaController2;
    }

    public native int writeFrame(ByteBuffer byteBuffer, int i);

    public static int z(String str) {
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e) {
            fc4.g(e, true);
            i = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        return i;
    }

    public final boolean A() {
        ArrayList arrayList;
        k47 k47Var = this.v0;
        if (k47Var == null || ((!k47.Q4(k47Var.k) && !this.v0.g4()) || (arrayList = this.f0) == null || arrayList.size() <= 1 || !this.f0.contains(this.v0) || this.f0.indexOf(this.v0) >= this.f0.size() - 1)) {
            return true;
        }
        return false;
    }

    public final void A0(final int i, final int i2, final boolean z, final boolean z2) {
        u30 u30Var;
        if (this.I1) {
            m30 m30Var = this.L1;
            if (m30Var != null) {
                this.L1 = null;
                if (i == 0) {
                    s(false);
                    return;
                }
                this.C1 = i;
                this.D1 = z;
                this.E1 = i2;
                this.F1 = z2;
                n(m30Var);
                return;
            } else if (this.J1) {
                if (this.C1 == 3) {
                    this.C1 = i;
                    this.D1 = z;
                    this.E1 = i2;
                    this.F1 = z2;
                    if (i == 0) {
                        u30 u30Var2 = this.G1;
                        if (u30Var2 != null) {
                            u30Var2.a = false;
                            ((h40) u30Var2.e).b();
                        }
                        s(false);
                        return;
                    }
                    return;
                }
                return;
            } else if (i == 2 && (u30Var = this.G1) != null && u30Var.e()) {
                this.y0 = false;
                this.r = false;
                this.P = false;
                return;
            } else {
                dn6 dn6Var = this.H1;
                if (dn6Var != null) {
                    gm.r(dn6Var);
                    this.H1 = null;
                }
                this.J1 = true;
                this.C1 = i;
                this.D1 = z;
                this.E1 = i2;
                this.F1 = z2;
                u30 u30Var3 = this.G1;
                if (u30Var3 == null) {
                    s(false);
                } else {
                    h40 h40Var = (h40) u30Var3.e;
                    if (i == 0) {
                        u30Var3.a = false;
                        h40Var.b();
                        s(false);
                    } else {
                        u30Var3.a = true;
                        h40Var.getClass();
                        h40.q();
                        int i3 = h40Var.e().a;
                        if (u30Var3.a && (i3 == 3 || i3 == 5)) {
                            u30Var3.a = false;
                            h40Var.h();
                        }
                    }
                }
                try {
                    this.L0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                final int i4 = this.i1;
                final int i5 = this.h1;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i6;
                        String[] strArr = MediaController.W1;
                        nm7 f = nm7.f(i4);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i == 2) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        f.k(nm7.n2, valueOf, Integer.valueOf(i6));
                    }
                });
                return;
            }
        }
        an6 an6Var = this.M1;
        mp3 mp3Var = this.N1;
        if (an6Var != null) {
            mp3Var.a(an6Var);
            this.M1 = null;
        }
        mp3Var.c(new Runnable() {
            @Override
            public final void run() {
                String[] strArr = MediaController.W1;
                MediaController mediaController = MediaController.this;
                byte b = mediaController.C1;
                byte b3 = i;
                boolean z3 = z;
                int i6 = i2;
                boolean z4 = z2;
                if (b == 3) {
                    mediaController.C1 = (byte) 0;
                    mediaController.B0(b3, i6, z3, z4);
                    return;
                }
                AudioRecord audioRecord = mediaController.f1;
                if (audioRecord == null) {
                    mediaController.g1 = null;
                    mediaController.y0 = false;
                    mediaController.r = false;
                    mediaController.P = false;
                    return;
                }
                try {
                    mediaController.C1 = b3;
                    mediaController.D1 = z3;
                    mediaController.E1 = i6;
                    mediaController.F1 = z4;
                    audioRecord.stop();
                    MediaController.i0(false);
                } catch (Exception e) {
                    fc4.g(e, true);
                    if (mediaController.k1 != null) {
                        if (e21.a) {
                            fc4.d("delete voice file");
                        }
                        mediaController.k1.delete();
                    }
                }
                if (b3 == 0) {
                    mediaController.B0(0, 0, false, false);
                }
                try {
                    mediaController.L0.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                gm.c3(new ex1(mediaController, b3, (byte) 4));
            }
        });
    }

    public final void B0(final int i, final int i2, final boolean z, final boolean z2) {
        final MediaController mediaController;
        final File file;
        if (i != 0 && (file = this.k1) != null) {
            final TLRPC.TL_document tL_document = this.g1;
            final File file2 = this.j1;
            if (e21.a) {
                fc4.b("stop recording internal filename " + this.k1.getPath());
            }
            mediaController = this;
            mediaController.O1.c(new Runnable() {
                @Override
                public final void run() {
                    String[] strArr = MediaController.W1;
                    MediaController.this.K(file2, file, tL_document, i, z, i2, z2);
                }
            });
        } else {
            mediaController = this;
            s70.b(mediaController.k1);
            File file3 = mediaController.k1;
            if (file3 != null) {
                file3.delete();
            }
            mediaController.X(false);
        }
        try {
            AudioRecord audioRecord = mediaController.f1;
            if (audioRecord != null) {
                audioRecord.release();
                mediaController.f1 = null;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        mediaController.g1 = null;
        mediaController.j1 = null;
        mediaController.k1 = null;
        mediaController.y0 = false;
        mediaController.r = false;
        mediaController.P = false;
    }

    public final boolean C() {
        if (!this.h0 && !this.B0) {
            return false;
        }
        return true;
    }

    public final void C0(boolean z) {
        boolean z2 = false;
        if (this.I1) {
            this.K1 = z;
            u30 u30Var = this.G1;
            if (u30Var != null) {
                if (u30Var.e()) {
                    X(true);
                    i0(true);
                }
                u30 u30Var2 = this.G1;
                h40 h40Var = (h40) u30Var2.e;
                h40Var.getClass();
                h40.q();
                int i = h40Var.e().a;
                if (i == 3) {
                    ((h40) u30Var2.e).n();
                    return;
                } else if (i == 5) {
                    h40 h40Var2 = (h40) u30Var2.e;
                    h40Var2.getClass();
                    h40.q();
                    if (h40Var2.G == 5) {
                        h40Var2.h.b("resume requested: trim=" + h40Var2.r + ".." + h40Var2.s + ", sourceDurationMs=" + h40Var2.j());
                        h40Var2.p();
                        h40Var2.s(6);
                        f40 f40Var = h40Var2.z;
                        if (f40Var == null) {
                            h40Var2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j = h40Var2.r;
                        long j2 = h40Var2.s;
                        if (j2 >= h40.r(h40Var2.p)) {
                            z2 = true;
                        }
                        h40Var2.k(1);
                        long j3 = ((j2 - j) * 48000) / 1000;
                        h40Var2.p = j3;
                        h40Var2.r = 0L;
                        h40Var2.s = h40.r(j3);
                        h40Var2.d();
                        h40Var2.h.b("resume prefix selected: source=" + f40Var.b.getName() + ", trim=" + j + ".." + j2);
                        File file = f40Var.b;
                        if (z2) {
                            j2 = -1;
                        }
                        h40Var2.u(j, j2, file);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        this.N1.c(new bn6(this, z, (byte) 0));
    }

    public final boolean D(k47 k47Var) {
        k47 k47Var2;
        boolean z;
        if (k47Var == null || !k47Var.j2) {
            if ((this.j0 != null || this.F0 != null) && k47Var != null && (k47Var2 = this.v0) != null) {
                long j = k47Var2.T;
                if (j != 0 && j == k47Var.T) {
                    z = this.B0;
                } else if (G(k47Var)) {
                    z = this.B0;
                } else {
                    return false;
                }
                return !z;
            }
            return false;
        }
        return false;
    }

    public final boolean D0(int i, ArrayList arrayList) {
        boolean z;
        int size;
        k47 k47Var;
        int i2;
        k47 k47Var2;
        int i3 = this.V0;
        int i4 = 0;
        if (ConnectionsManager.getInstance(z8c.t0).getConnectionState() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.V0 += i;
        if (z) {
            while (this.V0 < arrayList.size() && (i2 = this.V0) >= 0 && ((k47Var2 = (k47) arrayList.get(i2)) == null || !k47Var2.z0)) {
                this.V0 += i;
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
        if (z) {
            while (true) {
                int i5 = this.V0;
                if (i5 < 0 || i5 >= arrayList.size()) {
                    break;
                }
                int i6 = this.V0;
                if (i > 0) {
                    if (i6 > i3) {
                        break;
                    }
                    k47Var = (k47) arrayList.get(i6);
                    if (k47Var == null && k47Var.z0) {
                        break;
                    }
                    this.V0 += i;
                } else {
                    if (i6 < i3) {
                        break;
                    }
                    k47Var = (k47) arrayList.get(i6);
                    if (k47Var == null) {
                    }
                    this.V0 += i;
                }
            }
            if (this.V0 >= arrayList.size() || this.V0 < 0) {
                if (this.V0 < arrayList.size()) {
                    i4 = arrayList.size() - 1;
                }
                this.V0 = i4;
            }
        }
        return true;
    }

    public final boolean E() {
        if (this.M1 == null && this.H1 == null && this.g1 == null) {
            return false;
        }
        return true;
    }

    public final void E0() {
        k47 k47Var = this.v0;
        if (k47Var != null && C() && this.i0 && (k47.Q4(k47Var.k) || k47Var.I3())) {
            R(k47Var);
        }
        this.i0 = false;
    }

    public final boolean F() {
        if (this.I1) {
            u30 u30Var = this.G1;
            if (u30Var != null && u30Var.e()) {
                return true;
            }
            return false;
        }
        return this.e1;
    }

    public final void F0(File file, long j, byte[] bArr) {
        TLRPC.TL_document tL_document = this.g1;
        if (tL_document == null) {
            return;
        }
        tL_document.date = ConnectionsManager.getInstance(this.i1).getCurrentTime();
        this.g1.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        tL_documentAttributeAudio.waveform = bArr;
        if (bArr != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = j / 1000.0d;
        this.g1.attributes.clear();
        this.g1.attributes.add(tL_documentAttributeAudio);
    }

    public final boolean G(k47 k47Var) {
        boolean z;
        boolean z2;
        k47 k47Var2 = this.v0;
        if (k47Var2 != null && k47.B0(k47Var2.k) == k47.B0(k47Var.k) && this.v0.e1() == k47Var.e1()) {
            if (this.v0.T == 0) {
                z = true;
            } else {
                z = false;
            }
            if (k47Var.T == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                return true;
            }
        }
        return false;
    }

    public final void G0(k47 k47Var, int[] iArr, boolean z, boolean z2, int i) {
        k47 k47Var2;
        if (this.F0 != null) {
            if (i != 4 && i != 1) {
                try {
                    this.K0.getWindow().addFlags(128);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else {
                try {
                    this.K0.getWindow().clearFlags(128);
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
            }
            tn6 tn6Var = this.d1;
            if (i == 3) {
                this.G0 = true;
                k47 k47Var3 = this.v0;
                if (k47Var3 != null && (k47.K4(k47Var3.k) || this.v0.g4())) {
                    gm.r(tn6Var);
                    bc4.G(k47Var.K1).Z(this.v0.F0(), true, false);
                }
                this.Q0 = true;
            } else if (i == 2) {
                if (z2 && (k47Var2 = this.v0) != null) {
                    if (k47.K4(k47Var2.k) || this.v0.g4()) {
                        if (this.G0) {
                            tn6Var.run();
                        } else {
                            gm.d3(tn6Var, 1000L);
                        }
                    }
                }
            } else if (this.F0.c0() && i == 4) {
                k47 k47Var4 = this.v0;
                if (k47Var4 != null && k47.K4(k47Var4.k) && !z && (iArr == null || iArr[0] < 4)) {
                    this.F0.o0(0L);
                    if (iArr != null) {
                        iArr[0] = iArr[0] + 1;
                    }
                } else if (!Z()) {
                    l(true, A(), true, false);
                }
            }
        }
    }

    public final File I(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            File z = bc4.z(1);
            File file3 = new File(z, System.currentTimeMillis() + "_" + bc4.r(null, tL_document));
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), file3.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.k1) {
                    this.k1 = file3;
                }
                file2 = file3;
            }
            file.delete();
            if (file == this.j1) {
                this.j1 = null;
            }
        }
        return file2;
    }

    public final void J(final int i, final int i2, long j, long j2, v67 v67Var, k47 k47Var, k47 k47Var2, TL_stories.StoryItem storyItem, l3a l3aVar) {
        String absolutePath;
        if (this.f1 != null) {
            gm.c3(new Runnable(this) {
                public final MediaController b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r4;
                    int i3 = i2;
                    int i4 = i;
                    MediaController mediaController = this.b;
                    switch (b) {
                        case 0:
                            String[] strArr = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(156, Integer.valueOf(i3), Boolean.TRUE);
                            return;
                    }
                }
            });
            return;
        }
        i0(true);
        this.C1 = (byte) 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.g1 = tL_document;
        this.h1 = i2;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = Integer.MIN_VALUE;
        tL_document.id = gda.p();
        this.g1.user_id = z8c.h(i).e();
        TLRPC.TL_document tL_document2 = this.g1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        gda.x();
        File z = bc4.z(1);
        this.k1 = new File(z, System.currentTimeMillis() + "_" + bc4.r(null, this.g1));
        bc4.z(4).mkdirs();
        if (e21.a) {
            fc4.b("start recording internal " + this.k1.getPath() + " " + this.k1.exists());
        }
        File file = this.k1;
        Set set = s70.a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            s70.a.add(absolutePath);
        }
        try {
            if (startRecord(this.k1.getPath(), this.B1) == 0) {
                gm.c3(new Runnable(this) {
                    public final MediaController b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r4;
                        int i3 = i2;
                        int i4 = i;
                        MediaController mediaController = this.b;
                        switch (b) {
                            case 0:
                                String[] strArr = MediaController.W1;
                                mediaController.M1 = null;
                                nm7.f(i4).k(157, Integer.valueOf(i3));
                                return;
                            case 1:
                                String[] strArr2 = MediaController.W1;
                                mediaController.M1 = null;
                                nm7.f(i4).k(157, Integer.valueOf(i3));
                                return;
                            case 2:
                                String[] strArr3 = MediaController.W1;
                                mediaController.M1 = null;
                                nm7.f(i4).k(157, Integer.valueOf(i3));
                                return;
                            default:
                                String[] strArr4 = MediaController.W1;
                                mediaController.M1 = null;
                                nm7.f(i4).k(156, Integer.valueOf(i3), Boolean.TRUE);
                                return;
                        }
                    }
                });
                if (e21.a) {
                    fc4.b("cant init encoder");
                    return;
                }
                return;
            }
            this.e1 = false;
            this.f1 = new AudioRecord(0, this.B1, 16, 2, this.A1);
            System.currentTimeMillis();
            long j3 = 0;
            this.l1 = 0L;
            this.m1 = 0;
            this.w1 = 0L;
            this.n1 = j;
            this.p1 = j2;
            this.q1 = v67Var;
            if (k47Var != null) {
                j3 = k47.b2(this.i1, k47Var.k, false, false);
            }
            this.o1 = j3;
            this.i1 = i;
            this.r1 = k47Var2;
            this.s1 = k47Var;
            this.t1 = storyItem;
            this.u1 = l3aVar;
            this.z1.rewind();
            this.f1.startRecording();
            this.N1.c(this.P1);
            gm.c3(new Runnable(this) {
                public final MediaController b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r4;
                    int i3 = i2;
                    int i4 = i;
                    MediaController mediaController = this.b;
                    switch (b) {
                        case 0:
                            String[] strArr = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(156, Integer.valueOf(i3), Boolean.TRUE);
                            return;
                    }
                }
            });
        } catch (Exception e) {
            fc4.g(e, true);
            this.g1 = null;
            stopRecord();
            s70.b(this.k1);
            this.k1.delete();
            this.k1 = null;
            File file2 = this.j1;
            if (file2 != null) {
                file2.delete();
                this.j1 = null;
            }
            try {
                this.f1.release();
                this.f1 = null;
            } catch (Exception e3) {
                fc4.g(e3, true);
            }
            i0(false);
            gm.c3(new Runnable(this) {
                public final MediaController b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r4;
                    int i3 = i2;
                    int i4 = i;
                    MediaController mediaController = this.b;
                    switch (b) {
                        case 0:
                            String[] strArr = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(156, Integer.valueOf(i3), Boolean.TRUE);
                            return;
                    }
                }
            });
        }
    }

    public final void K(File file, File file2, final TLRPC.TL_document tL_document, final int i, final boolean z, final int i2, final boolean z2) {
        stopRecord();
        final File I = I(file, file2, tL_document);
        if (I == null) {
            if (e21.a) {
                fc4.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (e21.a) {
            fc4.b("stop recording internal in queue " + I.exists() + " " + I.length());
        }
        gm.c3(new Runnable() {
            @Override
            public final void run() {
                boolean z3;
                char c;
                byte b;
                String str;
                int i3;
                String[] strArr = MediaController.W1;
                MediaController mediaController = MediaController.this;
                mediaController.getClass();
                boolean z4 = e21.a;
                File file3 = I;
                if (z4) {
                    fc4.b("stop recording internal ".concat(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1));
                }
                if (!file3.exists()) {
                    fc4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1), true);
                }
                hs6.d0(mediaController.i1).D1(mediaController.n1, mediaController.o1, null);
                int currentTime = ConnectionsManager.getInstance(mediaController.i1).getCurrentTime();
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
                long j = mediaController.l1;
                tL_documentAttributeAudio.duration = j / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                if (j > 700) {
                    byte b3 = i;
                    if (b3 == 1) {
                        String absolutePath = file3.getAbsolutePath();
                        long j2 = mediaController.n1;
                        k47 k47Var = mediaController.r1;
                        k47 k47Var2 = mediaController.s1;
                        if (z2) {
                            i3 = Integer.MAX_VALUE;
                        } else {
                            i3 = 0;
                        }
                        c = 1;
                        b = 2;
                        z3 = false;
                        y5a f = y5a.f(tL_document2, null, absolutePath, j2, k47Var, k47Var2, null, null, null, null, z, i2, 0, i3, null, null, false);
                        f.R = mediaController.p1;
                        f.T = mediaController.q1;
                        f.H = mediaController.t1;
                        f.K = mediaController.u1;
                        f.Q = 0L;
                        a6a.B(mediaController.i1).q0(f);
                    } else {
                        c = 1;
                        b = 2;
                        z3 = false;
                    }
                    nm7 f3 = nm7.f(mediaController.i1);
                    Integer valueOf = Integer.valueOf(mediaController.h1);
                    if (b3 == b) {
                        str = file3.getAbsolutePath();
                    } else {
                        tL_document2 = null;
                        str = null;
                    }
                    Object[] objArr = new Object[3];
                    objArr[z3 ? 1 : 0] = valueOf;
                    objArr[c] = tL_document2;
                    objArr[b] = str;
                    f3.k(nm7.s2, objArr);
                } else {
                    z3 = false;
                    nm7.f(mediaController.i1).k(nm7.t2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j));
                    s70.b(file3);
                    file3.delete();
                }
                mediaController.X(z3);
            }
        });
    }

    public final void L(boolean z) {
        stopRecord();
        TLRPC.TL_document tL_document = this.g1;
        File I = I(this.j1, this.k1, tL_document);
        if (tL_document != null && I != null) {
            gm.c3(new rh(this, I, z, tL_document, (byte) 24));
        }
    }

    public final void M() {
        this.j1 = this.k1;
        File z = bc4.z(1);
        rn6 rn6Var = new rn6(z, System.currentTimeMillis() + "_" + bc4.r(null, this.g1), (byte) 1);
        this.k1 = rn6Var;
        if (startRecord(rn6Var.getPath(), this.B1) == 0) {
            gm.c3(new zm6(this, (byte) 7));
            if (e21.a) {
                fc4.b("cant resume audio encoder");
                return;
            }
            return;
        }
        gm.c3(new zm6(this, (byte) 8));
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.O():void");
    }

    public final boolean Q(k47 k47Var, boolean z) {
        if ((this.j0 != null || this.F0 != null) && k47Var != null && this.v0 != null && G(k47Var)) {
            y0();
            try {
                if (this.j0 != null) {
                    if (z && !fp.w() && !k47.Q4(this.v0.k) && this.v0.L0() * (1.0f - this.v0.b0) > 1.0d && LaunchActivity.G1) {
                        ValueAnimator valueAnimator = this.R1;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            this.R1.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        this.R1 = ofFloat;
                        ofFloat.addUpdateListener(this.S1);
                        this.R1.setDuration(300L);
                        this.R1.addListener(new v85(this, (byte) 17));
                        this.R1.start();
                    } else {
                        this.j0.f0();
                    }
                } else {
                    ndc ndcVar = this.F0;
                    if (ndcVar != null) {
                        ndcVar.f0();
                    }
                }
                this.h0 = true;
                nm7.f(this.v0.K1).k(nm7.g2, Integer.valueOf(this.v0.e1()));
                try {
                    fp.b(1);
                    if (!this.U1) {
                        if (hi2.v().D()) {
                            hi2.v().Q(u());
                        }
                        fp.z(false);
                    }
                    return true;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return true;
                }
            } catch (Exception e3) {
                fc4.g(e3, true);
                this.h0 = false;
            }
        }
        return false;
    }

    public final boolean R(final defpackage.k47 r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.R(k47):boolean");
    }

    public final void S(int i) {
        int i2 = this.V0;
        if (i2 >= 0) {
            ArrayList arrayList = this.S0;
            if (i2 < arrayList.size()) {
                this.V0 = i;
                this.C0 = true;
                k47 k47Var = (k47) arrayList.get(i);
                if (this.v0 != null && !G(k47Var)) {
                    this.v0.F5();
                }
                R(k47Var);
            }
        }
    }

    public final void T(boolean z) {
        ArrayList arrayList;
        boolean z2;
        int i;
        int i2;
        if (gda.J0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (z && (((i2 = gda.O0) == 2 || (i2 == 1 && arrayList.size() == 1)) && !this.W0)) {
            l(false, false, false, false);
            int i3 = this.V0;
            if (i3 >= 0 && i3 < arrayList.size()) {
                k47 k47Var = (k47) arrayList.get(this.V0);
                k47Var.b0 = 0.0f;
                k47Var.i0 = 0;
                R(k47Var);
                return;
            }
            return;
        }
        if (this.R0 != null) {
            if (!gda.K0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = gda.K0;
        }
        if (z2) {
            i = 1;
        } else {
            i = -1;
        }
        if (D0(i, arrayList) && z && gda.O0 == 0 && !this.W0) {
            if (this.j0 == null) {
                ndc ndcVar = this.F0;
                if (ndcVar != null) {
                    this.M0 = null;
                    this.O0 = null;
                    this.Q0 = false;
                    this.H0 = null;
                    ndcVar.l0();
                    this.F0 = null;
                    try {
                        this.K0.getWindow().clearFlags(128);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    gm.r(this.d1);
                    bc4.G(this.v0.K1).Z(this.v0.F0(), true, false);
                } else {
                    return;
                }
            } else {
                ho6 ho6Var = this.x0;
                if (ho6Var != null) {
                    ho6Var.a();
                    this.x0 = null;
                }
                try {
                    this.j0.l0();
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                this.j0 = null;
                cmb.L1(this.v0);
            }
            y0();
            this.h0 = true;
            k47 k47Var2 = this.v0;
            k47Var2.b0 = 0.0f;
            k47Var2.i0 = 0;
            nm7.f(k47Var2.K1).k(nm7.e2, Integer.valueOf(this.v0.e1()), 0);
            nm7.f(this.v0.K1).k(nm7.g2, Integer.valueOf(this.v0.e1()));
            return;
        }
        int i4 = this.V0;
        if (i4 >= 0 && i4 < arrayList.size()) {
            k47 k47Var3 = this.v0;
            if (k47Var3 != null) {
                k47Var3.F5();
            }
            this.C0 = true;
            R((k47) arrayList.get(this.V0));
        }
    }

    public final void U() {
        ArrayList arrayList;
        int i;
        boolean z;
        int i2;
        if (gda.J0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (!arrayList.isEmpty() && (i = this.V0) >= 0 && i < arrayList.size()) {
            k47 k47Var = (k47) arrayList.get(this.V0);
            if (k47Var.i0 > 10) {
                h0(k47Var, 0.0f);
                return;
            }
            if (this.R0 != null) {
                if (!gda.K0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = gda.K0;
            }
            if (z) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            D0(i2, arrayList);
            if (this.V0 < arrayList.size()) {
                this.C0 = true;
                R((k47) arrayList.get(this.V0));
            }
        }
    }

    public final void V(boolean z) {
        l3a l3aVar;
        long j;
        if (this.g1 != null) {
            C0(false);
        } else if (z) {
            int currentAccount = this.s.getCurrentAccount();
            long a = this.s.a();
            yv1 yv1Var = this.s;
            k47 k47Var = yv1Var.m4;
            int classGuid = yv1Var.getClassGuid();
            yv1 yv1Var2 = this.s;
            v67 v67Var = null;
            if (yv1Var2 != null) {
                l3aVar = yv1Var2.X6();
            } else {
                l3aVar = null;
            }
            yv1 yv1Var3 = this.s;
            if (yv1Var3 != null) {
                j = yv1Var3.k7();
            } else {
                j = 0;
            }
            yv1 yv1Var4 = this.s;
            if (yv1Var4 != null) {
                v67Var = yv1Var4.y5;
            }
            w0(currentAccount, a, null, k47Var, null, classGuid, false, l3aVar, j, v67Var);
        } else {
            A0(2, 0, false, false);
        }
    }

    public final boolean W() {
        m30 m30Var = this.L1;
        if (m30Var != null) {
            File file = (File) m30Var.b;
            s70.b(file);
            file.delete();
            Y();
            return true;
        }
        u30 u30Var = this.G1;
        if (u30Var != null && u30Var.e()) {
            this.G1 = null;
            if (!u30Var.c()) {
                ((h40) u30Var.e).o();
                u30Var.c = true;
            }
            Y();
            return true;
        }
        return false;
    }

    public final void X(boolean z) {
        boolean z2 = this.W;
        z00 z00Var = this.a;
        if (z) {
            if (!z2 && gda.B0 && lo7.p0.requestAudioFocus(z00Var, 3, 2) == 1) {
                this.W = true;
            }
        } else if (z2) {
            lo7.p0.abandonAudioFocus(z00Var);
            this.W = false;
        }
    }

    public final void Y() {
        this.g1 = null;
        this.j1 = null;
        this.k1 = null;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.L1 = null;
        this.C1 = (byte) 0;
    }

    public final boolean Z() {
        ArrayList arrayList;
        int i;
        k47 k47Var;
        mo6 mo6Var = this.V1;
        if (mo6Var != null) {
            k47 k47Var2 = mo6Var.a;
            this.V1 = null;
            if (gda.J0) {
                arrayList = this.U0;
            } else {
                arrayList = this.S0;
            }
            if (arrayList != null && (i = this.V0) >= 0 && i < arrayList.size() && (k47Var = (k47) arrayList.get(this.V0)) != null && k47.B0(k47Var.k) == k47.B0(k47Var2.k) && k47Var.e1() == k47Var2.e1()) {
                this.C0 = false;
                float f = mo6Var.b;
                k47Var.c0 = f;
                k47Var.b0 = f;
                k47Var.d0 = mo6Var.c;
                k47Var.i0 = mo6Var.d;
                R(k47Var);
                Q(k47Var, false);
                return true;
            }
        }
        return false;
    }

    public final void a0(k47 k47Var) {
        if ((this.j0 != null || this.F0 != null) && k47Var != null && this.v0 != null && G(k47Var)) {
            try {
                u0(this.v0);
                ValueAnimator valueAnimator = this.R1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.R1.cancel();
                }
                if (!k47.Q4(k47Var.k) && !k47Var.g4()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 1.0f);
                    this.R1 = ofFloat;
                    ofFloat.addUpdateListener(this.S1);
                    this.R1.setDuration(300L);
                    this.R1.start();
                } else {
                    this.Q1 = 1.0f;
                    m0();
                }
                ndc ndcVar = this.j0;
                if (ndcVar != null) {
                    ndcVar.g0();
                } else {
                    ndc ndcVar2 = this.F0;
                    if (ndcVar2 != null) {
                        ndcVar2.g0();
                    }
                }
                e(k47Var);
                this.h0 = false;
                nm7.f(this.v0.K1).k(nm7.g2, Integer.valueOf(this.v0.e1()));
                try {
                    fp.b(1);
                    if (!this.U1) {
                        fp.z(true);
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } catch (Exception e3) {
                fc4.g(e3, true);
            }
        }
    }

    public final void b() {
        k47 k47Var;
        ArrayList arrayList = this.S0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            ArrayList arrayList3 = this.U0;
            arrayList3.clear();
            int i = this.V0;
            if (i >= 0 && i < arrayList.size()) {
                k47Var = (k47) arrayList.get(this.V0);
                arrayList2.remove(this.V0);
            } else {
                k47Var = null;
            }
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                int nextInt = Utilities.b.nextInt(arrayList2.size());
                arrayList3.add((k47) arrayList2.get(nextInt));
                arrayList2.remove(nextInt);
            }
            if (k47Var != null) {
                arrayList3.add(k47Var);
                this.V0 = arrayList3.size() - 1;
            }
        }
    }

    public final void b0() {
        k47 k47Var;
        ndc ndcVar = this.j0;
        if (ndcVar != null && (k47Var = this.v0) != null && !this.h0) {
            if (ndcVar.d != null && ndcVar.M == 2) {
                l(false, false, false, false);
                R(k47Var);
                return;
            }
            ndcVar.g0();
        }
    }

    public final boolean c() {
        k47 k47Var = this.v0;
        if (k47Var != null) {
            if ((k47Var.I3() || k47.Q4(this.v0.k) || this.v0.g4()) && !this.v0.R4() && !this.v0.f4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d(k47 k47Var) {
        if (k47Var != null && !this.c0.isEmpty()) {
            for (int i = 0; i < this.c0.size(); i++) {
                oo6 oo6Var = (oo6) this.c0.get(i);
                k47 k47Var2 = oo6Var.a;
                if (k47Var2.T(k47Var) && k47Var2.K1 == k47Var.K1) {
                    if (i == 0) {
                        synchronized (this.b) {
                            oo6Var.b.V = true;
                        }
                        return;
                    }
                    this.a0.remove((oo6) this.c0.remove(i));
                    f(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        jc7 jc7Var;
        k47 k47Var;
        ArrayList arrayList;
        char c;
        int indexOf;
        int i3 = 0;
        if (i != nm7.Y1 && i != nm7.R1) {
            if (i == nm7.v) {
                if (!((Boolean) objArr[2]).booleanValue()) {
                    long longValue = ((Long) objArr[1]).longValue();
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    k47 k47Var2 = this.v0;
                    if (k47Var2 != null && longValue == k47Var2.k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(k47Var2.e1()))) {
                        l(true, true, false, false);
                    }
                    ArrayList arrayList3 = this.f0;
                    if (arrayList3 != null && !arrayList3.isEmpty() && longValue == ((k47) this.f0.get(0)).k.peer_id.channel_id) {
                        while (i3 < arrayList2.size()) {
                            Integer num = (Integer) arrayList2.get(i3);
                            k47 k47Var3 = (k47) this.g0.get(num.intValue());
                            this.g0.remove(num.intValue());
                            if (k47Var3 != null) {
                                this.f0.remove(k47Var3);
                            }
                            i3++;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i == nm7.e0) {
                long longValue2 = ((Long) objArr[0]).longValue();
                k47 k47Var4 = this.v0;
                if (k47Var4 != null && k47.B0(k47Var4.k) == longValue2) {
                    l(false, true, false, false);
                    return;
                }
                return;
            } else {
                int i4 = nm7.K0;
                int[] iArr = this.c1;
                HashMap hashMap = this.T0;
                ArrayList arrayList4 = this.S0;
                if (i == i4) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    long longValue4 = ((Long) objArr[3]).longValue();
                    k47 k47Var5 = this.v0;
                    if (k47Var5 != null && k47Var5.I3() && k47.B0(this.v0.k) == longValue3 && this.b1 == longValue4 && !this.v0.r1) {
                        arrayList4.addAll(0, (ArrayList) objArr[1]);
                        arrayList4.addAll((ArrayList) objArr[2]);
                        int size = arrayList4.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            k47 k47Var6 = (k47) arrayList4.get(i5);
                            hashMap.put(Integer.valueOf(k47Var6.e1()), k47Var6);
                            iArr[0] = Math.min(iArr[0], k47Var6.e1());
                        }
                        s0();
                        if (gda.J0) {
                            b();
                        } else {
                            k47 k47Var7 = this.v0;
                            if (k47Var7 != null && (indexOf = arrayList4.indexOf(k47Var7)) >= 0) {
                                this.V0 = indexOf;
                            }
                        }
                        this.a1 = ConnectionsManager.generateClassGuid();
                        return;
                    }
                    return;
                }
                int i6 = nm7.V;
                int i7 = nm7.L0;
                if (i == i6) {
                    if (((Integer) objArr[3]).intValue() == this.a1 && this.v0 != null) {
                        long longValue5 = ((Long) objArr[0]).longValue();
                        ((Integer) objArr[4]).getClass();
                        ArrayList arrayList5 = (ArrayList) objArr[2];
                        if (longValue5 == this.Z0) {
                            c = 1;
                        } else {
                            c = 0;
                        }
                        if (!arrayList5.isEmpty()) {
                            this.X0[c] = ((Boolean) objArr[5]).booleanValue();
                        }
                        int i8 = 0;
                        for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                            k47 k47Var8 = (k47) arrayList5.get(i9);
                            if (!k47Var8.R4() && !hashMap.containsKey(Integer.valueOf(k47Var8.e1()))) {
                                i8++;
                                arrayList4.add(0, k47Var8);
                                hashMap.put(Integer.valueOf(k47Var8.e1()), k47Var8);
                                iArr[c] = Math.min(iArr[c], k47Var8.e1());
                            }
                        }
                        s0();
                        int indexOf2 = arrayList4.indexOf(this.v0);
                        if (indexOf2 >= 0) {
                            this.V0 = indexOf2;
                        }
                        this.Y0 = false;
                        if (gda.J0) {
                            b();
                        }
                        if (i8 != 0) {
                            nm7.f(this.v0.K1).k(i7, Integer.valueOf(i8));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 1) {
                    if (!((Boolean) objArr[2]).booleanValue() && (arrayList = this.f0) != null && !arrayList.isEmpty() && ((Long) objArr[0]).longValue() == k47.B0(((k47) this.f0.get(0)).k)) {
                        ArrayList arrayList6 = (ArrayList) objArr[1];
                        while (i3 < arrayList6.size()) {
                            k47 k47Var9 = (k47) arrayList6.get(i3);
                            if ((k47.Q4(k47Var9.k) || k47Var9.g4()) && !k47Var9.R4() && !k47Var9.f4() && (!this.e0 || (k47Var9.k.media_unread && !k47Var9.N3()))) {
                                this.f0.add(k47Var9);
                                this.g0.put(k47Var9.e1(), k47Var9);
                            }
                            i3++;
                        }
                        return;
                    }
                    return;
                } else if (i == nm7.L4) {
                    ndc ndcVar = (ndc) objArr[0];
                    if (this.F0 != ndcVar && this.j0 != ndcVar) {
                        k47 k47Var10 = this.v0;
                        if (k47Var10 != null && D(k47Var10) && !C() && (k47Var10.I3() || k47.Q4(k47Var10.k))) {
                            this.i0 = true;
                        }
                        Q(k47Var10, true);
                        return;
                    }
                    return;
                } else if (i == nm7.W3 && (jc7Var = this.R0) != null && objArr[0] == jc7Var) {
                    int size2 = jc7Var.c.size() - arrayList4.size();
                    arrayList4.clear();
                    arrayList4.addAll(this.R0.c);
                    s0();
                    if (gda.J0) {
                        b();
                    } else {
                        k47 k47Var11 = this.v0;
                        if (k47Var11 != null) {
                            int indexOf3 = arrayList4.indexOf(k47Var11);
                            if (indexOf3 >= 0) {
                                this.V0 = indexOf3;
                            } else {
                                int i10 = this.V0;
                                if (i10 < 0 || i10 >= arrayList4.size()) {
                                    this.V0 = 0;
                                }
                                if (arrayList4.size() == 0) {
                                    j();
                                } else {
                                    R((k47) arrayList4.get(0));
                                }
                            }
                        }
                    }
                    if (size2 != 0 && (k47Var = this.v0) != null) {
                        nm7.f(k47Var.K1).k(i7, Integer.valueOf(size2));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        String str = (String) objArr[0];
        k47 k47Var12 = this.v0;
        if (k47Var12 != null && k47Var12.K1 == i2 && bc4.r(null, k47Var12.F0()).equals(str)) {
            if (this.B0) {
                this.C0 = true;
                R(this.v0);
            } else if (this.E0 == null) {
                try {
                    bc4.G(z8c.t0);
                    this.E0 = g10.a(bc4.M(this.v0.k, false, true));
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    public final void e(k47 k47Var) {
        byte b;
        int i;
        int requestAudioFocus;
        if (!k47.Q4(k47Var.k) && !k47Var.g4()) {
            b = 1;
        } else if (this.M) {
            b = 3;
        } else {
            b = 2;
        }
        if (this.V != b) {
            this.V = b;
            if (b == 3) {
                requestAudioFocus = lo7.p0.requestAudioFocus(this, 0, 1);
            } else {
                AudioManager audioManager = lo7.p0;
                if (b == 2 && !gda.C0) {
                    i = 3;
                } else {
                    i = 1;
                }
                requestAudioFocus = audioManager.requestAudioFocus(this, 3, i);
            }
            if (requestAudioFocus == 1) {
                this.Y = (byte) 2;
            }
        }
    }

    public final void f(boolean z) {
        oo6 oo6Var;
        if (!this.a0.isEmpty()) {
            oo6Var = (oo6) this.a0.get(0);
            this.b0 = oo6Var;
        } else {
            oo6Var = null;
            this.b0 = null;
        }
        if (oo6Var != null || z) {
            if (VideoEncodingService.e == null) {
                try {
                    a.b.startService(new Intent(a.b, VideoEncodingService.class));
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else if (z) {
                oo6 oo6Var2 = w().b0;
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService.b != oo6Var2) {
                    if (oo6Var2 != null) {
                        videoEncodingService.a(oo6Var2);
                    } else {
                        videoEncodingService.stopSelf();
                    }
                }
            }
        }
    }

    public final void g(int i) {
        ArrayList arrayList;
        boolean z;
        int i2;
        File M;
        er3 q = er3.q(i);
        int e = a.e();
        int i3 = 2;
        if (e == 1) {
            if (!q.O.g || !q.p().d) {
                return;
            }
        } else if (e == 2) {
            if (!q.P.g || !q.o().d) {
                return;
            }
        } else if (!q.N.g || !q.n().d) {
            return;
        }
        if (gda.J0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (arrayList != null && arrayList.size() >= 2) {
            if (this.R0 != null) {
                if (!gda.K0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = gda.K0;
            }
            int i4 = this.V0;
            if (z) {
                i2 = i4 + 1;
                if (i2 >= arrayList.size()) {
                    i2 = 0;
                }
            } else {
                i2 = i4 - 1;
                if (i2 < 0) {
                    i2 = arrayList.size() - 1;
                }
            }
            if (i2 >= 0 && i2 < arrayList.size()) {
                k47 k47Var = (k47) arrayList.get(i2);
                File file = null;
                if (!TextUtils.isEmpty(k47Var.k.attachPath)) {
                    File file2 = new File(k47Var.k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file != null) {
                    M = file;
                } else {
                    bc4.G(i);
                    M = bc4.M(k47Var.k, false, true);
                }
                M.exists();
                if (M != file && !M.exists() && k47Var.I3()) {
                    bc4 G = bc4.G(i);
                    TLRPC.Document F0 = k47Var.F0();
                    if (!k47.Q5(k47Var.k)) {
                        i3 = 0;
                    }
                    G.X(F0, k47Var, 0, i3);
                }
            }
        }
    }

    public final boolean g0(k47 k47Var, boolean z, boolean z2, boolean z3) {
        rcc rccVar;
        if (k47Var != null) {
            rccVar = k47Var.r0;
        } else {
            rccVar = null;
        }
        if (k47Var != null && rccVar != null) {
            ArrayList arrayList = this.c0;
            if (z) {
                if (arrayList.isEmpty()) {
                    new File(k47Var.k.attachPath).delete();
                }
            }
            ?? obj = new Object();
            obj.a = k47Var;
            obj.c = k47Var.K1;
            obj.b = rccVar;
            obj.d = z3;
            arrayList.add(obj);
            if (z2) {
                this.a0.add(obj);
                f(false);
            }
            if (arrayList.size() == 1) {
                x0();
            }
            return true;
        }
        return false;
    }

    public native byte[] getWaveform2(short[] sArr, int i);

    public final void h() {
        int i;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - g2) >= 5000) {
                AudioManager audioManager = (AudioManager) a.b.getSystemService("audio");
                if (this.M) {
                    i = 0;
                } else {
                    i = 3;
                }
                int streamVolume = audioManager.getStreamVolume(i);
                if (streamVolume == 0) {
                    audioManager.adjustStreamVolume(i, streamVolume, 1);
                    g2 = currentTimeMillis;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void h0(k47 k47Var, float f) {
        k47 k47Var2 = this.v0;
        if ((this.j0 != null || this.F0 != null) && k47Var != null && k47Var2 != null && G(k47Var)) {
            try {
                ndc ndcVar = this.j0;
                if (ndcVar != null) {
                    long U = ndcVar.U();
                    if (U == -9223372036854775807L) {
                        this.u0 = f;
                    } else {
                        k47Var2.b0 = f;
                        long j = (int) (((float) U) * f);
                        this.j0.p0(j, false);
                        k47Var2.e0 = j;
                        if (!this.U1) {
                            fp.x(j);
                        }
                    }
                } else {
                    ndc ndcVar2 = this.F0;
                    if (ndcVar2 != null) {
                        ndcVar2.o0(((float) ndcVar2.U()) * f);
                        if (!this.U1) {
                            fp.x(((float) this.F0.U()) * f);
                        }
                    }
                }
                nm7.f(k47Var.K1).k(nm7.i2, Integer.valueOf(k47Var2.e1()), Float.valueOf(f));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void i(boolean z) {
        File file;
        File file2;
        boolean z2;
        File file3;
        u30 u30Var;
        u30 u30Var2;
        if (this.I1) {
            dn6 dn6Var = this.H1;
            if (dn6Var != null) {
                gm.r(dn6Var);
                this.H1 = null;
            }
            if (!z && (u30Var2 = this.G1) != null) {
                z2 = u30Var2.c();
            } else {
                z2 = false;
            }
            if (!z2 && (u30Var = this.G1) != null) {
                u30Var.a = false;
                ((h40) u30Var.e).b();
            }
            if (z2 && (file3 = this.k1) != null) {
                s70.b(file3);
            }
            s(!z);
            return;
        }
        this.g1 = null;
        s70.b(this.k1);
        if (z && (file2 = this.k1) != null) {
            try {
                file2.delete();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        this.k1 = null;
        if (z && (file = this.j1) != null) {
            file.delete();
        }
        this.j1 = null;
        this.y0 = false;
        this.r = false;
        this.P = false;
    }

    public final void j() {
        l(true, true, false, false);
        this.E0 = null;
        this.C0 = false;
        for (int i = 0; i < 4; i++) {
            er3 q = er3.q(i);
            q.b.clear();
            q.c.clear();
            q.d.clear();
            q.e.clear();
            q.f.clear();
            q.h.clear();
            q.G.b();
        }
        this.c0.clear();
        this.d0.clear();
        this.V1 = null;
        this.f0 = null;
        this.g0 = null;
        m();
    }

    public final void j0(boolean z) {
        jy jyVar = this.M0;
        if (jyVar != null) {
            if (z) {
                PipRoundVideoView pipRoundVideoView = this.I0;
                if (pipRoundVideoView != null) {
                    this.J0 = (byte) 2;
                    pipRoundVideoView.a(true);
                    this.I0 = null;
                    return;
                }
                if (jyVar.getParent() == null) {
                    this.O0.addView(this.M0);
                }
                this.F0.z0(this.H0);
            } else if (jyVar.getParent() != null) {
                this.J0 = (byte) 1;
                this.O0.removeView(this.M0);
            } else {
                if (this.I0 == null) {
                    try {
                        PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                        this.I0 = pipRoundVideoView2;
                        pipRoundVideoView2.d(this.K0, new zm6(this, (byte) 4));
                    } catch (Exception unused) {
                        this.I0 = null;
                    }
                }
                PipRoundVideoView pipRoundVideoView3 = this.I0;
                if (pipRoundVideoView3 != null) {
                    this.F0.z0(pipRoundVideoView3.c);
                }
            }
        }
    }

    public final void k(boolean z, boolean z2) {
        l(z, z2, false, false);
    }

    public final void k0(int i) {
        boolean z = gda.J0;
        if (i == 2) {
            gda.J0 = true;
            gda.K0 = false;
        } else if (i == 1) {
            gda.K0 = true;
            gda.J0 = false;
        } else {
            gda.K0 = false;
            gda.J0 = false;
        }
        MediaController w = w();
        k47 k47Var = w.v0;
        if (k47Var != null && k47Var.I3()) {
            w.g(w.v0.K1);
        }
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putBoolean("shuffleMusic", gda.J0);
        edit.putBoolean("playOrderReversed", gda.K0);
        edit.apply();
        boolean z2 = gda.J0;
        if (z != z2) {
            if (z2) {
                b();
                return;
            }
            k47 k47Var2 = this.v0;
            if (k47Var2 != null) {
                int indexOf = this.S0.indexOf(k47Var2);
                this.V0 = indexOf;
                if (indexOf == -1) {
                    m();
                    l(true, true, false, false);
                }
            }
        }
    }

    public final void l(boolean r21, boolean r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.l(boolean, boolean, boolean, boolean):void");
    }

    public final void l0(boolean z, float f) {
        String str;
        float f3;
        String str2;
        if (z) {
            if (this.r0 >= 6.0f && f == 1.0f && this.v0 != null) {
                this.j0.f0();
                k47 k47Var = this.v0;
                gm.d3(new eu(this, k47Var, k47Var.b0, (byte) 1), 50L);
            }
            this.r0 = f;
            if (Math.abs(f - 1.0f) > 0.001f) {
                this.t0 = f;
            }
        } else {
            this.q0 = f;
            if (Math.abs(f - 1.0f) > 0.001f) {
                this.s0 = f;
            }
        }
        ndc ndcVar = this.j0;
        if (ndcVar != null) {
            ndcVar.u0(Math.round(f * 10.0f) / 10.0f);
        } else {
            ndc ndcVar2 = this.F0;
            if (ndcVar2 != null) {
                ndcVar2.u0(Math.round(f * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor edit = oc7.d1().edit();
        if (z) {
            str = "musicPlaybackSpeed";
        } else {
            str = "playbackSpeed";
        }
        SharedPreferences.Editor putFloat = edit.putFloat(str, f);
        if (z) {
            f3 = this.t0;
            str2 = "fastMusicPlaybackSpeed";
        } else {
            f3 = this.s0;
            str2 = "fastPlaybackSpeed";
        }
        putFloat.putFloat(str2, f3).commit();
        nm7.e().k(nm7.N4, new Object[0]);
        if (!this.U1) {
            fp.B(f);
        }
    }

    public final void m() {
        this.R0 = null;
        this.S0.clear();
        this.T0.clear();
        this.U0.clear();
        this.a1 = 0;
        boolean[] zArr = this.X0;
        zArr[1] = false;
        zArr[0] = false;
        this.Z0 = 0L;
        this.b1 = 0L;
        int[] iArr = this.c1;
        iArr[1] = Integer.MAX_VALUE;
        iArr[0] = Integer.MAX_VALUE;
        this.Y0 = false;
        this.D0 = null;
        this.V1 = null;
    }

    public final void m0() {
        float f;
        try {
            if (this.Y != 1) {
                f = 1.0f;
            } else {
                f = 0.2f;
            }
            ndc ndcVar = this.j0;
            float f3 = 0.0f;
            if (ndcVar != null) {
                if (!fp.w()) {
                    f3 = f * this.Q1;
                }
                ndcVar.A0(f3);
                return;
            }
            ndc ndcVar2 = this.F0;
            if (ndcVar2 != null) {
                if (fp.w()) {
                    f = 0.0f;
                }
                ndcVar2.A0(f);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void n(m30 m30Var) {
        byte[] bArr;
        TLRPC.TL_document tL_document;
        int i;
        File file = (File) m30Var.b;
        this.k1 = file;
        long j = m30Var.a;
        this.l1 = j;
        byte[] bArr2 = (byte[]) m30Var.c;
        String str = null;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr2.clone();
        }
        F0(file, j, bArr);
        if (this.C1 == 3) {
            this.L1 = m30Var;
            u30 u30Var = this.G1;
            if (u30Var != null) {
                ((h40) u30Var.e).o();
                u30Var.c = true;
                this.G1 = null;
            }
            X(false);
            i0(false);
            return;
        }
        hs6.d0(this.i1).D1(this.n1, this.o1, null);
        if (this.C1 == 1) {
            TLRPC.TL_document tL_document2 = this.g1;
            String absolutePath = file.getAbsolutePath();
            long j2 = this.n1;
            k47 k47Var = this.r1;
            k47 k47Var2 = this.s1;
            boolean z = this.D1;
            int i2 = this.E1;
            if (this.F1) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            y5a f = y5a.f(tL_document2, null, absolutePath, j2, k47Var, k47Var2, null, null, null, null, z, i2, 0, i, null, null, false);
            f.R = this.p1;
            f.T = this.q1;
            f.H = this.t1;
            f.K = this.u1;
            f.Q = 0L;
            a6a.B(this.i1).q0(f);
        }
        nm7 f3 = nm7.f(this.i1);
        Integer valueOf = Integer.valueOf(this.h1);
        if (this.C1 == 2) {
            TLRPC.TL_document tL_document3 = this.g1;
            str = file.getAbsolutePath();
            tL_document = tL_document3;
        } else {
            tL_document = null;
        }
        f3.k(nm7.s2, valueOf, tL_document, str);
        s(true);
    }

    public final boolean n0(ArrayList arrayList, k47 k47Var, long j, boolean z, ko6 ko6Var, long j2) {
        HashMap hashMap;
        k47 k47Var2 = this.v0;
        ArrayList arrayList2 = this.S0;
        if (k47Var2 == k47Var) {
            int indexOf = arrayList2.indexOf(k47Var);
            if (indexOf >= 0) {
                this.V0 = indexOf;
            }
            return R(k47Var);
        }
        this.W0 = !z;
        this.Z0 = j;
        this.C0 = !arrayList2.isEmpty();
        m();
        this.D0 = ko6Var;
        this.b1 = j2;
        boolean z2 = false;
        if (!arrayList.isEmpty() && pg3.B(k47.B0(((k47) arrayList.get(0)).k))) {
            z2 = true;
        }
        int size = arrayList.size() - 1;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        while (true) {
            hashMap = this.T0;
            if (size < 0) {
                break;
            }
            k47 k47Var3 = (k47) arrayList.get(size);
            if (k47Var3.I3()) {
                int e1 = k47Var3.e1();
                if (e1 > 0 || z2) {
                    i = Math.min(i, e1);
                    i2 = Math.max(i2, e1);
                }
                arrayList2.add(k47Var3);
                hashMap.put(Integer.valueOf(e1), k47Var3);
            }
            size--;
        }
        s0();
        int indexOf2 = arrayList2.indexOf(k47Var);
        this.V0 = indexOf2;
        if (indexOf2 == -1) {
            m();
            this.V0 = arrayList2.size();
            arrayList2.add(k47Var);
            hashMap.put(Integer.valueOf(k47Var.e1()), k47Var);
        }
        if (k47Var.I3() && !k47Var.r1) {
            if (gda.J0) {
                b();
            }
            if (z) {
                if (this.D0 == null) {
                    final hs6 d0 = hs6.d0(k47Var.K1);
                    final long B0 = k47.B0(k47Var.k);
                    final long j3 = this.b1;
                    final long j4 = i;
                    final long j5 = i2;
                    d0.getMessagesStorage().a.c(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.ir6.run():void");
                        }
                    });
                } else {
                    this.a1 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return R(k47Var);
    }

    public final void o0(TextureView textureView, jy jyVar, FrameLayout frameLayout, boolean z) {
        if (textureView != null) {
            boolean z2 = true;
            if (!z && this.H0 == textureView) {
                this.J0 = (byte) 1;
                this.H0 = null;
                this.M0 = null;
                this.O0 = null;
                return;
            }
            ndc ndcVar = this.F0;
            if (ndcVar != null && textureView != this.H0) {
                if (jyVar == null || !jyVar.d) {
                    z2 = false;
                }
                this.N0 = z2;
                this.H0 = textureView;
                PipRoundVideoView pipRoundVideoView = this.I0;
                if (pipRoundVideoView != null) {
                    ndcVar.z0(pipRoundVideoView.c);
                } else {
                    ndcVar.z0(textureView);
                }
                this.M0 = jyVar;
                this.O0 = frameLayout;
                if (this.Q0 && jyVar != null) {
                    jyVar.a(this.P0, 0);
                }
            }
        }
    }

    @Override
    public final void onAudioFocusChange(int i) {
        gm.c3(new bm3(this, i, (byte) 20));
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public final void p0() {
        this.M = true;
        AudioManager audioManager = lo7.p0;
        audioManager.setBluetoothScoOn(false);
        audioManager.setSpeakerphoneOn(false);
    }

    public final void q0(ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        this.f0 = arrayList2;
        if (arrayList2 != null) {
            this.e0 = z;
            this.g0 = new SparseArray();
            for (int i = 0; i < this.f0.size(); i++) {
                k47 k47Var = (k47) this.f0.get(i);
                this.g0.put(k47Var.e1(), k47Var);
            }
        }
    }

    public final void s(boolean z) {
        File file;
        X(false);
        i0(false);
        u30 u30Var = this.G1;
        if (u30Var != null) {
            ((h40) u30Var.e).o();
            u30Var.c = true;
            this.G1 = null;
        }
        if (!z && (file = this.k1) != null) {
            s70.b(file);
            this.k1.delete();
        }
        Y();
        this.y0 = false;
        this.r = false;
        this.P = false;
    }

    public final void s0() {
        Collections.sort(this.S0, new tk6((byte) 2));
    }

    public final void t0(boolean z) {
        boolean z2;
        k47 k47Var = this.v0;
        if (k47Var != null) {
            int i = 0;
            nm7.f(k47Var.K1).k(nm7.u2, Boolean.valueOf(this.M));
            ndc ndcVar = this.F0;
            if (ndcVar != null) {
                if (!this.M) {
                    i = 3;
                }
                ndcVar.w0(i);
                if (!z) {
                    if (this.F0.S() < 1000) {
                        this.F0.o0(0L);
                    }
                    this.F0.g0();
                    return;
                }
                Q(this.v0, true);
                return;
            }
            ndc ndcVar2 = this.j0;
            if (ndcVar2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            k47 k47Var2 = this.v0;
            float f = k47Var2.b0;
            int i2 = k47Var2.j0;
            if (!z && ndcVar2 != null && ndcVar2.c0() && i2 * f <= 1.0f) {
                k47Var2.b0 = 0.0f;
            } else {
                k47Var2.b0 = f;
            }
            l(false, true, false, false);
            R(k47Var2);
            if (z) {
                if (z2) {
                    gm.d3(new lj6(this, k47Var2, (byte) 3), 100L);
                } else {
                    Q(k47Var2, true);
                }
            }
        }
    }

    public final defpackage.mi2 u() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.u():mi2");
    }

    public final void u0(k47 k47Var) {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
            k47Var.S0();
            Timer timer2 = new Timer();
            this.z0 = timer2;
            timer2.schedule(new yy2(this, k47Var, (byte) 2), 0L, 17L);
        }
    }

    public final void v0(yv1 yv1Var) {
        if (yv1Var != null) {
            if ((this.f != null || this.n != null) && this.e != null) {
                if (!gda.k(false)) {
                    k47 k47Var = this.v0;
                    if (k47Var != null) {
                        if (!k47.Q4(k47Var.k) && !this.v0.g4()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.s = yv1Var;
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
                    this.y = 0;
                    this.E = (byte) 0;
                    this.G = 0;
                    this.F = 0;
                    Utilities.e.c(new zm6(this, (byte) 3));
                    this.Q = true;
                }
            }
        }
    }

    public final void w0(int i, long j, k47 k47Var, k47 k47Var2, TL_stories.StoryItem storyItem, int i2, boolean z, l3a l3aVar, long j2, v67 v67Var) {
        boolean z2;
        long j3;
        long b22;
        long j4;
        k47 k47Var3 = this.v0;
        if (k47Var3 != null && D(k47Var3) && !C()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.y0 = z;
        X(true);
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.I1 && !W()) {
            gm.c3(new rt2(i, i2, (byte) 5));
        } else if (r0(i)) {
            this.I1 = true;
            this.J1 = false;
            this.K1 = false;
            this.i1 = i;
            this.h1 = i2;
            this.n1 = j;
            this.p1 = j2;
            this.q1 = v67Var;
            if (k47Var2 == null) {
                b22 = 0;
            } else {
                b22 = k47.b2(i, k47Var2.k, false, false);
            }
            this.o1 = b22;
            this.r1 = k47Var;
            this.s1 = k47Var2;
            this.t1 = storyItem;
            this.u1 = l3aVar;
            this.j1 = null;
            this.k1 = null;
            this.l1 = 0L;
            this.m1 = 0;
            this.w1 = 0L;
            this.C1 = (byte) 0;
            dn6 dn6Var = new dn6(this, i, j, i2, (byte) 0);
            this.H1 = dn6Var;
            if (z2) {
                j4 = 500;
            } else {
                j4 = 50;
            }
            gm.d3(dn6Var, j4);
        } else {
            if (e21.a) {
                fc4.b("AudioRecorder legacy selected: account=" + i + ", dialog=" + j + ", guid=" + i2);
            }
            an6 an6Var = new an6(this, i, i2, j, j2, v67Var, k47Var2, k47Var, storyItem, l3aVar);
            this.M1 = an6Var;
            if (z2) {
                j3 = 500;
            } else {
                j3 = 50;
            }
            this.N1.d(an6Var, j3);
        }
    }

    public final float x(boolean z) {
        if (z) {
            return this.r0;
        }
        return this.q0;
    }

    public final void x0() {
        if (!this.c0.isEmpty()) {
            oo6 oo6Var = (oo6) this.c0.get(0);
            rcc rccVar = oo6Var.b;
            synchronized (this.b) {
                if (rccVar != null) {
                    rccVar.V = false;
                }
            }
            new Thread(new pg6(oo6Var, (byte) 10)).start();
        }
    }

    public final long y(k47 k47Var) {
        k47 k47Var2 = this.v0;
        if ((this.j0 != null || this.F0 != null) && k47Var != null && k47Var2 != null && G(k47Var)) {
            try {
                ndc ndcVar = this.j0;
                if (ndcVar != null) {
                    return ndcVar.S();
                }
                ndc ndcVar2 = this.F0;
                if (ndcVar2 != null) {
                    return ndcVar2.S();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void y0() {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    public final void z0(yv1 yv1Var, boolean z, boolean z2) {
        int i;
        if (this.P) {
            this.P = false;
            return;
        }
        if (z2) {
            if (this.g1 != null && !F()) {
                C0(false);
            } else {
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                A0(i, 0, false, false);
            }
        }
        if (this.Q && !this.P) {
            if ((this.f != null || this.n != null) && this.e != null && this.s == yv1Var) {
                this.s = null;
                this.Q = false;
                this.w = false;
                this.J = false;
                this.r = false;
                this.M = false;
                Utilities.e.c(new zm6(this, (byte) 5));
                PowerManager.WakeLock wakeLock = this.d;
                if (wakeLock != null && wakeLock.isHeld()) {
                    this.d.release();
                }
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
