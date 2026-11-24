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
public class MediaController implements AudioManager.OnAudioFocusChangeListener, gk7, SensorEventListener {
    public static final String[] W1;
    public static final String[] X1;
    public static final ConcurrentHashMap Y1;
    public static Runnable Z1;
    public static xl6 a2;
    public static xl6 b2;
    public static ArrayList c2;
    public static ArrayList d2;
    public static qt e2;
    public static volatile MediaController f2;
    public static long g2;
    public static boolean h2;
    public boolean B0;
    public boolean C0;
    public byte C1;
    public km6 D0;
    public boolean D1;
    public byte E;
    public g00 E0;
    public int E1;
    public int F;
    public lbc F0;
    public boolean F1;
    public int G;
    public boolean G0;
    public u20 G1;
    public long H;
    public TextureView H0;
    public al6 H1;
    public PipRoundVideoView I0;
    public boolean I1;
    public boolean J;
    public byte J0;
    public boolean J1;
    public boolean K;
    public LaunchActivity K0;
    public boolean K1;
    public ViewGroup L0;
    public m20 L1;
    public boolean M;
    public ix M0;
    public xk6 M1;
    public boolean N;
    public boolean N0;
    public final co3 N1;
    public boolean O;
    public FrameLayout O0;
    public final co3 O1;
    public boolean P;
    public float P0;
    public boolean Q;
    public boolean Q0;
    public float Q1;
    public float R;
    public ia7 R0;
    public ValueAnimator R1;
    public sv T1;
    public boolean U1;
    public byte V;
    public int V0;
    public mm6 V1;
    public boolean W;
    public boolean W0;
    public boolean X;
    public boolean Y0;
    public boolean Z;
    public long Z0;
    public int a1;
    public om6 b0;
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
    public u47 q1;
    public boolean r;
    public k27 r1;
    public mu1 s;
    public k27 s1;
    public TL_stories.StoryItem t1;
    public float u0;
    public j1a u1;
    public k27 v0;
    public boolean w;
    public k27 w0;
    public long w1;
    public long x;
    public gm6 x0;
    public int y;
    public boolean y0;
    public final ByteBuffer z1;
    public final zz a = new zz(this, (byte) 1);
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
    public lbc j0 = null;
    public lbc k0 = null;
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
    public final rl6 d1 = new rl6(this);
    public int h1 = -1;
    public short[] v1 = new short[1024];
    public final Object x1 = new Object();
    public final ArrayList y1 = new ArrayList();
    public int A1 = 1280;
    public char B1 = 48000;
    public final ez3 P1 = new ez3(this, (byte) 24);
    public final ae0 S1 = new ae0(this, (byte) 8);

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
        co3 co3Var = new co3("recordQueue");
        this.N1 = co3Var;
        co3Var.setPriority(10);
        co3 co3Var2 = new co3("fileEncodingQueue");
        this.O1 = co3Var2;
        co3Var2.setPriority(10);
        co3Var.c(new wk6(this, (byte) 0));
        Utilities.e.c(new wk6(this, (byte) 1));
        this.z1 = ByteBuffer.allocateDirect(1920);
        gl.d3(new wk6(this, (byte) 2));
        ContentResolver contentResolver = a.b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new hd1(null, (byte) 1));
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new hd1(null, (byte) 2));
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new hd1(null, (byte) 1));
        } catch (Exception e4) {
            fa4.g(e4, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new hd1(null, (byte) 2));
        } catch (Exception e5) {
            fa4.g(e5, true);
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
                                fa4.g(e, true);
                                return true;
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                fa4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    fa4.g(e5, true);
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
                                    fa4.g(e, true);
                                    return true;
                                }
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                fa4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    fa4.g(e5, true);
                }
            }
            throw th;
        }
    }

    public static void H0(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String n = ug8.n(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
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
            k93.f(de9.k(length, "XMP segment too large: "));
        }
    }

    public static void N(int i) {
        Thread thread = new Thread(new xv0(i, (byte) 6));
        thread.setPriority(1);
        thread.start();
    }

    public static int P(int r5, int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.P(int, int, int, int, int):int");
    }

    public static void c0(String str, String str2, Context context, p8c p8cVar) {
        hd hdVar;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && context != null) {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists() && file2.exists()) {
                if (!gl.G1(Uri.fromFile(file), 0) && !gl.G1(Uri.fromFile(file2), 0)) {
                    boolean[] zArr = {false};
                    boolean[] zArr2 = new boolean[1];
                    try {
                        hd hdVar2 = new hd(2, null, context);
                        hdVar2.m(k96.M0(2131748587, null));
                        hdVar2.setCanceledOnTouchOutside(false);
                        hdVar2.setCancelable(true);
                        hdVar2.setOnCancelListener(new gn1(zArr, (byte) 3));
                        gl.e3(new dl6(zArr2, hdVar2, (byte) 1), 250L);
                        hdVar = hdVar2;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        hdVar = null;
                    }
                    new Thread(new e57(file, file2, zArr, p8cVar, hdVar, zArr2)).start();
                    return;
                }
                return;
            }
            d0(str, context, 0, null, null, p8cVar);
        }
    }

    public static native boolean cropOpusFile(String str, String str2, long j, long j2);

    public static void d0(java.lang.String r12, android.content.Context r13, int r14, java.lang.String r15, java.lang.String r16, defpackage.p8c r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.d0(java.lang.String, android.content.Context, int, java.lang.String, java.lang.String, p8c):void");
    }

    public static Uri e0(int i, File file, String str) {
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String D = ba4.D(file);
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
                    str = gl.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i == 1) {
                if (str == null) {
                    str = gl.p0(1, D);
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
                gl.D(fileInputStream, a.b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static void f0(Context context, j5 j5Var, ArrayList arrayList, uc7 uc7Var) {
        f53 f53Var;
        if (arrayList.isEmpty()) {
            return;
        }
        ?? obj = new Object();
        obj.d = new HashMap();
        obj.a = j5Var;
        obj.c = arrayList;
        obj.s = uc7Var;
        obj.w = ((k27) arrayList.get(0)).I3();
        int i = j5Var.a;
        kk7.f(i).a(obj, kk7.X1);
        kk7.f(i).a(obj, kk7.W1);
        kk7.f(i).a(obj, kk7.Y1);
        if (PhotoViewer.r0().U0()) {
            f53Var = new f53();
        } else {
            f53Var = null;
        }
        hd hdVar = new hd(2, f53Var, context);
        obj.b = hdVar;
        hdVar.m(k96.M0(2131748587, null));
        hdVar.setCancelable(true);
        hdVar.I = true;
        hdVar.setOnCancelListener(new ur0(obj, (byte) 12));
        gl.e3(new dm6(obj, (byte) 1), 250L);
        new Thread(new dm6(obj, (byte) 2)).start();
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
            File f1 = gl.f1();
            f1.mkdirs();
            if (gl.G1(Uri.fromFile(f1), 0)) {
                return null;
            }
            int i = 0;
            do {
                File f12 = gl.f1();
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
            fa4.g(e, true);
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
        im0 im0Var = wcd.b;
        im0Var.a();
        if (im0Var.c) {
            im0Var.a();
            return im0Var.d;
        } else if (!na7.q1(i).k4.k0.f) {
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
            for (AudioDeviceInfo audioDeviceInfo : im7.p0.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            fa4.g(e, true);
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
            fa4.g(e, true);
            i = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        return i;
    }

    public final boolean A() {
        ArrayList arrayList;
        k27 k27Var = this.v0;
        if (k27Var == null || ((!k27.Q4(k27Var.k) && !this.v0.g4()) || (arrayList = this.f0) == null || arrayList.size() <= 1 || !this.f0.contains(this.v0) || this.f0.indexOf(this.v0) >= this.f0.size() - 1)) {
            return true;
        }
        return false;
    }

    public final void A0(final int i, final int i2, final boolean z, final boolean z2) {
        u20 u20Var;
        if (this.I1) {
            m20 m20Var = this.L1;
            if (m20Var != null) {
                this.L1 = null;
                if (i == 0) {
                    s(false);
                    return;
                }
                this.C1 = i;
                this.D1 = z;
                this.E1 = i2;
                this.F1 = z2;
                n(m20Var);
                return;
            } else if (this.J1) {
                if (this.C1 == 3) {
                    this.C1 = i;
                    this.D1 = z;
                    this.E1 = i2;
                    this.F1 = z2;
                    if (i == 0) {
                        u20 u20Var2 = this.G1;
                        if (u20Var2 != null) {
                            u20Var2.a = false;
                            ((h30) u20Var2.e).b();
                        }
                        s(false);
                        return;
                    }
                    return;
                }
                return;
            } else if (i == 2 && (u20Var = this.G1) != null && u20Var.e()) {
                this.y0 = false;
                this.r = false;
                this.P = false;
                return;
            } else {
                al6 al6Var = this.H1;
                if (al6Var != null) {
                    gl.r(al6Var);
                    this.H1 = null;
                }
                this.J1 = true;
                this.C1 = i;
                this.D1 = z;
                this.E1 = i2;
                this.F1 = z2;
                u20 u20Var3 = this.G1;
                if (u20Var3 == null) {
                    s(false);
                } else {
                    h30 h30Var = (h30) u20Var3.e;
                    if (i == 0) {
                        u20Var3.a = false;
                        h30Var.b();
                        s(false);
                    } else {
                        u20Var3.a = true;
                        h30Var.getClass();
                        h30.q();
                        int i3 = h30Var.e().a;
                        if (u20Var3.a && (i3 == 3 || i3 == 5)) {
                            u20Var3.a = false;
                            h30Var.h();
                        }
                    }
                }
                try {
                    this.L0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                final int i4 = this.i1;
                final int i5 = this.h1;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        int i6;
                        String[] strArr = MediaController.W1;
                        kk7 f = kk7.f(i4);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i == 2) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        f.k(kk7.m2, valueOf, Integer.valueOf(i6));
                    }
                });
                return;
            }
        }
        xk6 xk6Var = this.M1;
        co3 co3Var = this.N1;
        if (xk6Var != null) {
            co3Var.a(xk6Var);
            this.M1 = null;
        }
        co3Var.c(new Runnable() {
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
                    fa4.g(e, true);
                    if (mediaController.k1 != null) {
                        if (w01.a) {
                            fa4.d("delete voice file");
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
                gl.d3(new sv1(mediaController, b3, (byte) 4));
            }
        });
    }

    public final void B0(final int i, final int i2, final boolean z, final boolean z2) {
        final MediaController mediaController;
        final File file;
        if (i != 0 && (file = this.k1) != null) {
            final TLRPC.TL_document tL_document = this.g1;
            final File file2 = this.j1;
            if (w01.a) {
                fa4.b("stop recording internal filename " + this.k1.getPath());
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
            s60.b(mediaController.k1);
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
            fa4.g(e, true);
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
            u20 u20Var = this.G1;
            if (u20Var != null) {
                if (u20Var.e()) {
                    X(true);
                    i0(true);
                }
                u20 u20Var2 = this.G1;
                h30 h30Var = (h30) u20Var2.e;
                h30Var.getClass();
                h30.q();
                int i = h30Var.e().a;
                if (i == 3) {
                    ((h30) u20Var2.e).n();
                    return;
                } else if (i == 5) {
                    h30 h30Var2 = (h30) u20Var2.e;
                    h30Var2.getClass();
                    h30.q();
                    if (h30Var2.G == 5) {
                        h30Var2.h.b("resume requested: trim=" + h30Var2.r + ".." + h30Var2.s + ", sourceDurationMs=" + h30Var2.j());
                        h30Var2.p();
                        h30Var2.s(6);
                        f30 f30Var = h30Var2.z;
                        if (f30Var == null) {
                            h30Var2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j = h30Var2.r;
                        long j2 = h30Var2.s;
                        if (j2 >= h30.r(h30Var2.p)) {
                            z2 = true;
                        }
                        h30Var2.k(1);
                        long j3 = ((j2 - j) * 48000) / 1000;
                        h30Var2.p = j3;
                        h30Var2.r = 0L;
                        h30Var2.s = h30.r(j3);
                        h30Var2.d();
                        h30Var2.h.b("resume prefix selected: source=" + f30Var.b.getName() + ", trim=" + j + ".." + j2);
                        File file = f30Var.b;
                        if (z2) {
                            j2 = -1;
                        }
                        h30Var2.u(j, j2, file);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        this.N1.c(new yk6(this, z, (byte) 0));
    }

    public final boolean D(k27 k27Var) {
        k27 k27Var2;
        boolean z;
        if (k27Var == null || !k27Var.j2) {
            if ((this.j0 != null || this.F0 != null) && k27Var != null && (k27Var2 = this.v0) != null) {
                long j = k27Var2.T;
                if (j != 0 && j == k27Var.T) {
                    z = this.B0;
                } else if (G(k27Var)) {
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
        k27 k27Var;
        int i2;
        k27 k27Var2;
        int i3 = this.V0;
        int i4 = 0;
        if (ConnectionsManager.getInstance(y6c.t0).getConnectionState() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.V0 += i;
        if (z) {
            while (this.V0 < arrayList.size() && (i2 = this.V0) >= 0 && ((k27Var2 = (k27) arrayList.get(i2)) == null || !k27Var2.z0)) {
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
                    k27Var = (k27) arrayList.get(i6);
                    if (k27Var == null && k27Var.z0) {
                        break;
                    }
                    this.V0 += i;
                } else {
                    if (i6 < i3) {
                        break;
                    }
                    k27Var = (k27) arrayList.get(i6);
                    if (k27Var == null) {
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
        k27 k27Var = this.v0;
        if (k27Var != null && C() && this.i0 && (k27.Q4(k27Var.k) || k27Var.I3())) {
            R(k27Var);
        }
        this.i0 = false;
    }

    public final boolean F() {
        if (this.I1) {
            u20 u20Var = this.G1;
            if (u20Var != null && u20Var.e()) {
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

    public final boolean G(k27 k27Var) {
        boolean z;
        boolean z2;
        k27 k27Var2 = this.v0;
        if (k27Var2 != null && k27.B0(k27Var2.k) == k27.B0(k27Var.k) && this.v0.e1() == k27Var.e1()) {
            if (this.v0.T == 0) {
                z = true;
            } else {
                z = false;
            }
            if (k27Var.T == 0) {
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

    public final void G0(k27 k27Var, int[] iArr, boolean z, boolean z2, int i) {
        k27 k27Var2;
        if (this.F0 != null) {
            if (i != 4 && i != 1) {
                try {
                    this.K0.getWindow().addFlags(128);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else {
                try {
                    this.K0.getWindow().clearFlags(128);
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
            }
            rl6 rl6Var = this.d1;
            if (i == 3) {
                this.G0 = true;
                k27 k27Var3 = this.v0;
                if (k27Var3 != null && (k27.K4(k27Var3.k) || this.v0.g4())) {
                    gl.r(rl6Var);
                    ba4.G(k27Var.K1).Z(this.v0.F0(), true, false);
                }
                this.Q0 = true;
            } else if (i == 2) {
                if (z2 && (k27Var2 = this.v0) != null) {
                    if (k27.K4(k27Var2.k) || this.v0.g4()) {
                        if (this.G0) {
                            rl6Var.run();
                        } else {
                            gl.e3(rl6Var, 1000L);
                        }
                    }
                }
            } else if (this.F0.c0() && i == 4) {
                k27 k27Var4 = this.v0;
                if (k27Var4 != null && k27.K4(k27Var4.k) && !z && (iArr == null || iArr[0] < 4)) {
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
            File z = ba4.z(1);
            File file3 = new File(z, System.currentTimeMillis() + "_" + ba4.r(null, tL_document));
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

    public final void J(final int i, final int i2, long j, long j2, u47 u47Var, k27 k27Var, k27 k27Var2, TL_stories.StoryItem storyItem, j1a j1aVar) {
        String absolutePath;
        if (this.f1 != null) {
            gl.d3(new Runnable(this) {
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
                            kk7.f(i4).k(156, Integer.valueOf(i3));
                            return;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(156, Integer.valueOf(i3));
                            return;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(156, Integer.valueOf(i3));
                            return;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(155, Integer.valueOf(i3), Boolean.TRUE);
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
        tL_document.id = gba.p();
        this.g1.user_id = y6c.h(i).e();
        TLRPC.TL_document tL_document2 = this.g1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        gba.x();
        File z = ba4.z(1);
        this.k1 = new File(z, System.currentTimeMillis() + "_" + ba4.r(null, this.g1));
        ba4.z(4).mkdirs();
        if (w01.a) {
            fa4.b("start recording internal " + this.k1.getPath() + " " + this.k1.exists());
        }
        File file = this.k1;
        Set set = s60.a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            s60.a.add(absolutePath);
        }
        try {
            if (startRecord(this.k1.getPath(), this.B1) == 0) {
                gl.d3(new Runnable(this) {
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
                                kk7.f(i4).k(156, Integer.valueOf(i3));
                                return;
                            case 1:
                                String[] strArr2 = MediaController.W1;
                                mediaController.M1 = null;
                                kk7.f(i4).k(156, Integer.valueOf(i3));
                                return;
                            case 2:
                                String[] strArr3 = MediaController.W1;
                                mediaController.M1 = null;
                                kk7.f(i4).k(156, Integer.valueOf(i3));
                                return;
                            default:
                                String[] strArr4 = MediaController.W1;
                                mediaController.M1 = null;
                                kk7.f(i4).k(155, Integer.valueOf(i3), Boolean.TRUE);
                                return;
                        }
                    }
                });
                if (w01.a) {
                    fa4.b("cant init encoder");
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
            this.q1 = u47Var;
            if (k27Var != null) {
                j3 = k27.b2(this.i1, k27Var.k, false, false);
            }
            this.o1 = j3;
            this.i1 = i;
            this.r1 = k27Var2;
            this.s1 = k27Var;
            this.t1 = storyItem;
            this.u1 = j1aVar;
            this.z1.rewind();
            this.f1.startRecording();
            this.N1.c(this.P1);
            gl.d3(new Runnable(this) {
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
                            kk7.f(i4).k(156, Integer.valueOf(i3));
                            return;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(156, Integer.valueOf(i3));
                            return;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(156, Integer.valueOf(i3));
                            return;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(155, Integer.valueOf(i3), Boolean.TRUE);
                            return;
                    }
                }
            });
        } catch (Exception e) {
            fa4.g(e, true);
            this.g1 = null;
            stopRecord();
            s60.b(this.k1);
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
                fa4.g(e3, true);
            }
            i0(false);
            gl.d3(new Runnable(this) {
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
                            kk7.f(i4).k(156, Integer.valueOf(i3));
                            return;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(156, Integer.valueOf(i3));
                            return;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(156, Integer.valueOf(i3));
                            return;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(155, Integer.valueOf(i3), Boolean.TRUE);
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
            if (w01.a) {
                fa4.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (w01.a) {
            fa4.b("stop recording internal in queue " + I.exists() + " " + I.length());
        }
        gl.d3(new Runnable() {
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
                boolean z4 = w01.a;
                File file3 = I;
                if (z4) {
                    fa4.b("stop recording internal ".concat(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1));
                }
                if (!file3.exists()) {
                    fa4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1), true);
                }
                hq6.d0(mediaController.i1).D1(mediaController.n1, mediaController.o1, null);
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
                        k27 k27Var = mediaController.r1;
                        k27 k27Var2 = mediaController.s1;
                        if (z2) {
                            i3 = Integer.MAX_VALUE;
                        } else {
                            i3 = 0;
                        }
                        c = 1;
                        b = 2;
                        z3 = false;
                        x3a f = x3a.f(tL_document2, null, absolutePath, j2, k27Var, k27Var2, null, null, null, null, z, i2, 0, i3, null, null, false);
                        f.R = mediaController.p1;
                        f.T = mediaController.q1;
                        f.H = mediaController.t1;
                        f.K = mediaController.u1;
                        f.Q = 0L;
                        z3a.B(mediaController.i1).q0(f);
                    } else {
                        c = 1;
                        b = 2;
                        z3 = false;
                    }
                    kk7 f3 = kk7.f(mediaController.i1);
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
                    f3.k(kk7.r2, objArr);
                } else {
                    z3 = false;
                    kk7.f(mediaController.i1).k(kk7.s2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j));
                    s60.b(file3);
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
            gl.d3(new qg(this, I, z, tL_document, (byte) 24));
        }
    }

    public final void M() {
        this.j1 = this.k1;
        File z = ba4.z(1);
        pl6 pl6Var = new pl6(z, System.currentTimeMillis() + "_" + ba4.r(null, this.g1), (byte) 1);
        this.k1 = pl6Var;
        if (startRecord(pl6Var.getPath(), this.B1) == 0) {
            gl.d3(new wk6(this, (byte) 7));
            if (w01.a) {
                fa4.b("cant resume audio encoder");
                return;
            }
            return;
        }
        gl.d3(new wk6(this, (byte) 8));
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.O():void");
    }

    public final boolean Q(k27 k27Var, boolean z) {
        if ((this.j0 != null || this.F0 != null) && k27Var != null && this.v0 != null && G(k27Var)) {
            y0();
            try {
                if (this.j0 != null) {
                    if (z && !fo.w() && !k27.Q4(this.v0.k) && this.v0.L0() * (1.0f - this.v0.b0) > 1.0d && LaunchActivity.G1) {
                        ValueAnimator valueAnimator = this.R1;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            this.R1.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        this.R1 = ofFloat;
                        ofFloat.addUpdateListener(this.S1);
                        this.R1.setDuration(300L);
                        this.R1.addListener(new v85(this, (byte) 15));
                        this.R1.start();
                    } else {
                        this.j0.f0();
                    }
                } else {
                    lbc lbcVar = this.F0;
                    if (lbcVar != null) {
                        lbcVar.f0();
                    }
                }
                this.h0 = true;
                kk7.f(this.v0.K1).k(kk7.f2, Integer.valueOf(this.v0.e1()));
                try {
                    fo.b(1);
                    if (!this.U1) {
                        if (tg2.D().I()) {
                            tg2.D().X(u());
                        }
                        fo.z(false);
                    }
                    return true;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return true;
                }
            } catch (Exception e3) {
                fa4.g(e3, true);
                this.h0 = false;
            }
        }
        return false;
    }

    public final boolean R(final defpackage.k27 r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.R(k27):boolean");
    }

    public final void S(int i) {
        int i2 = this.V0;
        if (i2 >= 0) {
            ArrayList arrayList = this.S0;
            if (i2 < arrayList.size()) {
                this.V0 = i;
                this.C0 = true;
                k27 k27Var = (k27) arrayList.get(i);
                if (this.v0 != null && !G(k27Var)) {
                    this.v0.F5();
                }
                R(k27Var);
            }
        }
    }

    public final void T(boolean z) {
        ArrayList arrayList;
        boolean z2;
        int i;
        int i2;
        if (gba.K0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (z && (((i2 = gba.P0) == 2 || (i2 == 1 && arrayList.size() == 1)) && !this.W0)) {
            l(false, false, false, false);
            int i3 = this.V0;
            if (i3 >= 0 && i3 < arrayList.size()) {
                k27 k27Var = (k27) arrayList.get(this.V0);
                k27Var.b0 = 0.0f;
                k27Var.i0 = 0;
                R(k27Var);
                return;
            }
            return;
        }
        if (this.R0 != null) {
            if (!gba.L0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = gba.L0;
        }
        if (z2) {
            i = 1;
        } else {
            i = -1;
        }
        if (D0(i, arrayList) && z && gba.P0 == 0 && !this.W0) {
            if (this.j0 == null) {
                lbc lbcVar = this.F0;
                if (lbcVar != null) {
                    this.M0 = null;
                    this.O0 = null;
                    this.Q0 = false;
                    this.H0 = null;
                    lbcVar.l0();
                    this.F0 = null;
                    try {
                        this.K0.getWindow().clearFlags(128);
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    gl.r(this.d1);
                    ba4.G(this.v0.K1).Z(this.v0.F0(), true, false);
                } else {
                    return;
                }
            } else {
                gm6 gm6Var = this.x0;
                if (gm6Var != null) {
                    gm6Var.a();
                    this.x0 = null;
                }
                try {
                    this.j0.l0();
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                this.j0 = null;
                bkb.L1(this.v0);
            }
            y0();
            this.h0 = true;
            k27 k27Var2 = this.v0;
            k27Var2.b0 = 0.0f;
            k27Var2.i0 = 0;
            kk7.f(k27Var2.K1).k(kk7.d2, Integer.valueOf(this.v0.e1()), 0);
            kk7.f(this.v0.K1).k(kk7.f2, Integer.valueOf(this.v0.e1()));
            return;
        }
        int i4 = this.V0;
        if (i4 >= 0 && i4 < arrayList.size()) {
            k27 k27Var3 = this.v0;
            if (k27Var3 != null) {
                k27Var3.F5();
            }
            this.C0 = true;
            R((k27) arrayList.get(this.V0));
        }
    }

    public final void U() {
        ArrayList arrayList;
        int i;
        boolean z;
        int i2;
        if (gba.K0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (!arrayList.isEmpty() && (i = this.V0) >= 0 && i < arrayList.size()) {
            k27 k27Var = (k27) arrayList.get(this.V0);
            if (k27Var.i0 > 10) {
                h0(k27Var, 0.0f);
                return;
            }
            if (this.R0 != null) {
                if (!gba.L0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = gba.L0;
            }
            if (z) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            D0(i2, arrayList);
            if (this.V0 < arrayList.size()) {
                this.C0 = true;
                R((k27) arrayList.get(this.V0));
            }
        }
    }

    public final void V(boolean z) {
        j1a j1aVar;
        long j;
        if (this.g1 != null) {
            C0(false);
        } else if (z) {
            int currentAccount = this.s.getCurrentAccount();
            long a = this.s.a();
            mu1 mu1Var = this.s;
            k27 k27Var = mu1Var.m4;
            int classGuid = mu1Var.getClassGuid();
            mu1 mu1Var2 = this.s;
            u47 u47Var = null;
            if (mu1Var2 != null) {
                j1aVar = mu1Var2.O6();
            } else {
                j1aVar = null;
            }
            mu1 mu1Var3 = this.s;
            if (mu1Var3 != null) {
                j = mu1Var3.a7();
            } else {
                j = 0;
            }
            mu1 mu1Var4 = this.s;
            if (mu1Var4 != null) {
                u47Var = mu1Var4.y5;
            }
            w0(currentAccount, a, null, k27Var, null, classGuid, false, j1aVar, j, u47Var);
        } else {
            A0(2, 0, false, false);
        }
    }

    public final boolean W() {
        m20 m20Var = this.L1;
        if (m20Var != null) {
            File file = (File) m20Var.b;
            s60.b(file);
            file.delete();
            Y();
            return true;
        }
        u20 u20Var = this.G1;
        if (u20Var != null && u20Var.e()) {
            this.G1 = null;
            if (!u20Var.c()) {
                ((h30) u20Var.e).o();
                u20Var.c = true;
            }
            Y();
            return true;
        }
        return false;
    }

    public final void X(boolean z) {
        boolean z2 = this.W;
        zz zzVar = this.a;
        if (z) {
            if (!z2 && gba.B0 && im7.p0.requestAudioFocus(zzVar, 3, 2) == 1) {
                this.W = true;
            }
        } else if (z2) {
            im7.p0.abandonAudioFocus(zzVar);
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
        k27 k27Var;
        mm6 mm6Var = this.V1;
        if (mm6Var != null) {
            k27 k27Var2 = mm6Var.a;
            this.V1 = null;
            if (gba.K0) {
                arrayList = this.U0;
            } else {
                arrayList = this.S0;
            }
            if (arrayList != null && (i = this.V0) >= 0 && i < arrayList.size() && (k27Var = (k27) arrayList.get(this.V0)) != null && k27.B0(k27Var.k) == k27.B0(k27Var2.k) && k27Var.e1() == k27Var2.e1()) {
                this.C0 = false;
                float f = mm6Var.b;
                k27Var.c0 = f;
                k27Var.b0 = f;
                k27Var.d0 = mm6Var.c;
                k27Var.i0 = mm6Var.d;
                R(k27Var);
                Q(k27Var, false);
                return true;
            }
        }
        return false;
    }

    public final void a0(k27 k27Var) {
        if ((this.j0 != null || this.F0 != null) && k27Var != null && this.v0 != null && G(k27Var)) {
            try {
                u0(this.v0);
                ValueAnimator valueAnimator = this.R1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.R1.cancel();
                }
                if (!k27.Q4(k27Var.k) && !k27Var.g4()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 1.0f);
                    this.R1 = ofFloat;
                    ofFloat.addUpdateListener(this.S1);
                    this.R1.setDuration(300L);
                    this.R1.start();
                } else {
                    this.Q1 = 1.0f;
                    m0();
                }
                lbc lbcVar = this.j0;
                if (lbcVar != null) {
                    lbcVar.g0();
                } else {
                    lbc lbcVar2 = this.F0;
                    if (lbcVar2 != null) {
                        lbcVar2.g0();
                    }
                }
                e(k27Var);
                this.h0 = false;
                kk7.f(this.v0.K1).k(kk7.f2, Integer.valueOf(this.v0.e1()));
                try {
                    fo.b(1);
                    if (!this.U1) {
                        fo.z(true);
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
    }

    public final void b() {
        k27 k27Var;
        ArrayList arrayList = this.S0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            ArrayList arrayList3 = this.U0;
            arrayList3.clear();
            int i = this.V0;
            if (i >= 0 && i < arrayList.size()) {
                k27Var = (k27) arrayList.get(this.V0);
                arrayList2.remove(this.V0);
            } else {
                k27Var = null;
            }
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                int nextInt = Utilities.b.nextInt(arrayList2.size());
                arrayList3.add((k27) arrayList2.get(nextInt));
                arrayList2.remove(nextInt);
            }
            if (k27Var != null) {
                arrayList3.add(k27Var);
                this.V0 = arrayList3.size() - 1;
            }
        }
    }

    public final void b0() {
        k27 k27Var;
        lbc lbcVar = this.j0;
        if (lbcVar != null && (k27Var = this.v0) != null && !this.h0) {
            if (lbcVar.d != null && lbcVar.M == 2) {
                l(false, false, false, false);
                R(k27Var);
                return;
            }
            lbcVar.g0();
        }
    }

    public final boolean c() {
        k27 k27Var = this.v0;
        if (k27Var != null) {
            if ((k27Var.I3() || k27.Q4(this.v0.k) || this.v0.g4()) && !this.v0.R4() && !this.v0.f4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d(k27 k27Var) {
        if (k27Var != null && !this.c0.isEmpty()) {
            for (int i = 0; i < this.c0.size(); i++) {
                om6 om6Var = (om6) this.c0.get(i);
                k27 k27Var2 = om6Var.a;
                if (k27Var2.T(k27Var) && k27Var2.K1 == k27Var.K1) {
                    if (i == 0) {
                        synchronized (this.b) {
                            om6Var.b.V = true;
                        }
                        return;
                    }
                    this.a0.remove((om6) this.c0.remove(i));
                    f(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ia7 ia7Var;
        k27 k27Var;
        ArrayList arrayList;
        char c;
        int indexOf;
        int i3 = 0;
        if (i != kk7.X1 && i != kk7.Q1) {
            if (i == kk7.v) {
                if (!((Boolean) objArr[2]).booleanValue()) {
                    long longValue = ((Long) objArr[1]).longValue();
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    k27 k27Var2 = this.v0;
                    if (k27Var2 != null && longValue == k27Var2.k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(k27Var2.e1()))) {
                        l(true, true, false, false);
                    }
                    ArrayList arrayList3 = this.f0;
                    if (arrayList3 != null && !arrayList3.isEmpty() && longValue == ((k27) this.f0.get(0)).k.peer_id.channel_id) {
                        while (i3 < arrayList2.size()) {
                            Integer num = (Integer) arrayList2.get(i3);
                            k27 k27Var3 = (k27) this.g0.get(num.intValue());
                            this.g0.remove(num.intValue());
                            if (k27Var3 != null) {
                                this.f0.remove(k27Var3);
                            }
                            i3++;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i == kk7.d0) {
                long longValue2 = ((Long) objArr[0]).longValue();
                k27 k27Var4 = this.v0;
                if (k27Var4 != null && k27.B0(k27Var4.k) == longValue2) {
                    l(false, true, false, false);
                    return;
                }
                return;
            } else {
                int i4 = kk7.J0;
                int[] iArr = this.c1;
                HashMap hashMap = this.T0;
                ArrayList arrayList4 = this.S0;
                if (i == i4) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    long longValue4 = ((Long) objArr[3]).longValue();
                    k27 k27Var5 = this.v0;
                    if (k27Var5 != null && k27Var5.I3() && k27.B0(this.v0.k) == longValue3 && this.b1 == longValue4 && !this.v0.r1) {
                        arrayList4.addAll(0, (ArrayList) objArr[1]);
                        arrayList4.addAll((ArrayList) objArr[2]);
                        int size = arrayList4.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            k27 k27Var6 = (k27) arrayList4.get(i5);
                            hashMap.put(Integer.valueOf(k27Var6.e1()), k27Var6);
                            iArr[0] = Math.min(iArr[0], k27Var6.e1());
                        }
                        s0();
                        if (gba.K0) {
                            b();
                        } else {
                            k27 k27Var7 = this.v0;
                            if (k27Var7 != null && (indexOf = arrayList4.indexOf(k27Var7)) >= 0) {
                                this.V0 = indexOf;
                            }
                        }
                        this.a1 = ConnectionsManager.generateClassGuid();
                        return;
                    }
                    return;
                }
                int i6 = kk7.U;
                int i7 = kk7.K0;
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
                            k27 k27Var8 = (k27) arrayList5.get(i9);
                            if (!k27Var8.R4() && !hashMap.containsKey(Integer.valueOf(k27Var8.e1()))) {
                                i8++;
                                arrayList4.add(0, k27Var8);
                                hashMap.put(Integer.valueOf(k27Var8.e1()), k27Var8);
                                iArr[c] = Math.min(iArr[c], k27Var8.e1());
                            }
                        }
                        s0();
                        int indexOf2 = arrayList4.indexOf(this.v0);
                        if (indexOf2 >= 0) {
                            this.V0 = indexOf2;
                        }
                        this.Y0 = false;
                        if (gba.K0) {
                            b();
                        }
                        if (i8 != 0) {
                            kk7.f(this.v0.K1).k(i7, Integer.valueOf(i8));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 1) {
                    if (!((Boolean) objArr[2]).booleanValue() && (arrayList = this.f0) != null && !arrayList.isEmpty() && ((Long) objArr[0]).longValue() == k27.B0(((k27) this.f0.get(0)).k)) {
                        ArrayList arrayList6 = (ArrayList) objArr[1];
                        while (i3 < arrayList6.size()) {
                            k27 k27Var9 = (k27) arrayList6.get(i3);
                            if ((k27.Q4(k27Var9.k) || k27Var9.g4()) && !k27Var9.R4() && !k27Var9.f4() && (!this.e0 || (k27Var9.k.media_unread && !k27Var9.N3()))) {
                                this.f0.add(k27Var9);
                                this.g0.put(k27Var9.e1(), k27Var9);
                            }
                            i3++;
                        }
                        return;
                    }
                    return;
                } else if (i == kk7.J4) {
                    lbc lbcVar = (lbc) objArr[0];
                    if (this.F0 != lbcVar && this.j0 != lbcVar) {
                        k27 k27Var10 = this.v0;
                        if (k27Var10 != null && D(k27Var10) && !C() && (k27Var10.I3() || k27.Q4(k27Var10.k))) {
                            this.i0 = true;
                        }
                        Q(k27Var10, true);
                        return;
                    }
                    return;
                } else if (i == kk7.V3 && (ia7Var = this.R0) != null && objArr[0] == ia7Var) {
                    int size2 = ia7Var.c.size() - arrayList4.size();
                    arrayList4.clear();
                    arrayList4.addAll(this.R0.c);
                    s0();
                    if (gba.K0) {
                        b();
                    } else {
                        k27 k27Var11 = this.v0;
                        if (k27Var11 != null) {
                            int indexOf3 = arrayList4.indexOf(k27Var11);
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
                                    R((k27) arrayList4.get(0));
                                }
                            }
                        }
                    }
                    if (size2 != 0 && (k27Var = this.v0) != null) {
                        kk7.f(k27Var.K1).k(i7, Integer.valueOf(size2));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        String str = (String) objArr[0];
        k27 k27Var12 = this.v0;
        if (k27Var12 != null && k27Var12.K1 == i2 && ba4.r(null, k27Var12.F0()).equals(str)) {
            if (this.B0) {
                this.C0 = true;
                R(this.v0);
            } else if (this.E0 == null) {
                try {
                    ba4.G(y6c.t0);
                    this.E0 = g00.a(ba4.M(this.v0.k, false, true));
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    public final void e(k27 k27Var) {
        byte b;
        int i;
        int requestAudioFocus;
        if (!k27.Q4(k27Var.k) && !k27Var.g4()) {
            b = 1;
        } else if (this.M) {
            b = 3;
        } else {
            b = 2;
        }
        if (this.V != b) {
            this.V = b;
            if (b == 3) {
                requestAudioFocus = im7.p0.requestAudioFocus(this, 0, 1);
            } else {
                AudioManager audioManager = im7.p0;
                if (b == 2 && !gba.C0) {
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
        om6 om6Var;
        if (!this.a0.isEmpty()) {
            om6Var = (om6) this.a0.get(0);
            this.b0 = om6Var;
        } else {
            om6Var = null;
            this.b0 = null;
        }
        if (om6Var != null || z) {
            if (VideoEncodingService.e == null) {
                try {
                    a.b.startService(new Intent(a.b, VideoEncodingService.class));
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else if (z) {
                om6 om6Var2 = w().b0;
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService.b != om6Var2) {
                    if (om6Var2 != null) {
                        videoEncodingService.a(om6Var2);
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
        up3 q = up3.q(i);
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
        if (gba.K0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (arrayList != null && arrayList.size() >= 2) {
            if (this.R0 != null) {
                if (!gba.L0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = gba.L0;
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
                k27 k27Var = (k27) arrayList.get(i2);
                File file = null;
                if (!TextUtils.isEmpty(k27Var.k.attachPath)) {
                    File file2 = new File(k27Var.k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file != null) {
                    M = file;
                } else {
                    ba4.G(i);
                    M = ba4.M(k27Var.k, false, true);
                }
                M.exists();
                if (M != file && !M.exists() && k27Var.I3()) {
                    ba4 G = ba4.G(i);
                    TLRPC.Document F0 = k27Var.F0();
                    if (!k27.Q5(k27Var.k)) {
                        i3 = 0;
                    }
                    G.X(F0, k27Var, 0, i3);
                }
            }
        }
    }

    public final boolean g0(k27 k27Var, boolean z, boolean z2, boolean z3) {
        oac oacVar;
        if (k27Var != null) {
            oacVar = k27Var.r0;
        } else {
            oacVar = null;
        }
        if (k27Var != null && oacVar != null) {
            ArrayList arrayList = this.c0;
            if (z) {
                if (arrayList.isEmpty()) {
                    new File(k27Var.k.attachPath).delete();
                }
            }
            ?? obj = new Object();
            obj.a = k27Var;
            obj.c = k27Var.K1;
            obj.b = oacVar;
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

    public final void h0(k27 k27Var, float f) {
        k27 k27Var2 = this.v0;
        if ((this.j0 != null || this.F0 != null) && k27Var != null && k27Var2 != null && G(k27Var)) {
            try {
                lbc lbcVar = this.j0;
                if (lbcVar != null) {
                    long U = lbcVar.U();
                    if (U == -9223372036854775807L) {
                        this.u0 = f;
                    } else {
                        k27Var2.b0 = f;
                        long j = (int) (((float) U) * f);
                        this.j0.p0(j, false);
                        k27Var2.e0 = j;
                        if (!this.U1) {
                            fo.x(j);
                        }
                    }
                } else {
                    lbc lbcVar2 = this.F0;
                    if (lbcVar2 != null) {
                        lbcVar2.o0(((float) lbcVar2.U()) * f);
                        if (!this.U1) {
                            fo.x(((float) this.F0.U()) * f);
                        }
                    }
                }
                kk7.f(k27Var.K1).k(kk7.h2, Integer.valueOf(k27Var2.e1()), Float.valueOf(f));
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void i(boolean z) {
        File file;
        File file2;
        boolean z2;
        File file3;
        u20 u20Var;
        u20 u20Var2;
        if (this.I1) {
            al6 al6Var = this.H1;
            if (al6Var != null) {
                gl.r(al6Var);
                this.H1 = null;
            }
            if (!z && (u20Var2 = this.G1) != null) {
                z2 = u20Var2.c();
            } else {
                z2 = false;
            }
            if (!z2 && (u20Var = this.G1) != null) {
                u20Var.a = false;
                ((h30) u20Var.e).b();
            }
            if (z2 && (file3 = this.k1) != null) {
                s60.b(file3);
            }
            s(!z);
            return;
        }
        this.g1 = null;
        s60.b(this.k1);
        if (z && (file2 = this.k1) != null) {
            try {
                file2.delete();
            } catch (Exception e) {
                fa4.g(e, true);
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
            up3 q = up3.q(i);
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
        ix ixVar = this.M0;
        if (ixVar != null) {
            if (z) {
                PipRoundVideoView pipRoundVideoView = this.I0;
                if (pipRoundVideoView != null) {
                    this.J0 = (byte) 2;
                    pipRoundVideoView.a(true);
                    this.I0 = null;
                    return;
                }
                if (ixVar.getParent() == null) {
                    this.O0.addView(this.M0);
                }
                this.F0.z0(this.H0);
            } else if (ixVar.getParent() != null) {
                this.J0 = (byte) 1;
                this.O0.removeView(this.M0);
            } else {
                if (this.I0 == null) {
                    try {
                        PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                        this.I0 = pipRoundVideoView2;
                        pipRoundVideoView2.d(this.K0, new wk6(this, (byte) 4));
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
        boolean z = gba.K0;
        if (i == 2) {
            gba.K0 = true;
            gba.L0 = false;
        } else if (i == 1) {
            gba.L0 = true;
            gba.K0 = false;
        } else {
            gba.L0 = false;
            gba.K0 = false;
        }
        MediaController w = w();
        k27 k27Var = w.v0;
        if (k27Var != null && k27Var.I3()) {
            w.g(w.v0.K1);
        }
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("shuffleMusic", gba.K0);
        edit.putBoolean("playOrderReversed", gba.L0);
        edit.apply();
        boolean z2 = gba.K0;
        if (z != z2) {
            if (z2) {
                b();
                return;
            }
            k27 k27Var2 = this.v0;
            if (k27Var2 != null) {
                int indexOf = this.S0.indexOf(k27Var2);
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
                k27 k27Var = this.v0;
                gl.e3(new dt(this, k27Var, k27Var.b0, (byte) 1), 50L);
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
        lbc lbcVar = this.j0;
        if (lbcVar != null) {
            lbcVar.u0(Math.round(f * 10.0f) / 10.0f);
        } else {
            lbc lbcVar2 = this.F0;
            if (lbcVar2 != null) {
                lbcVar2.u0(Math.round(f * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor edit = na7.c1().edit();
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
        kk7.e().k(kk7.L4, new Object[0]);
        if (!this.U1) {
            fo.B(f);
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
            lbc lbcVar = this.j0;
            float f3 = 0.0f;
            if (lbcVar != null) {
                if (!fo.w()) {
                    f3 = f * this.Q1;
                }
                lbcVar.A0(f3);
                return;
            }
            lbc lbcVar2 = this.F0;
            if (lbcVar2 != null) {
                if (fo.w()) {
                    f = 0.0f;
                }
                lbcVar2.A0(f);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void n(m20 m20Var) {
        byte[] bArr;
        TLRPC.TL_document tL_document;
        int i;
        File file = (File) m20Var.b;
        this.k1 = file;
        long j = m20Var.a;
        this.l1 = j;
        byte[] bArr2 = (byte[]) m20Var.c;
        String str = null;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr2.clone();
        }
        F0(file, j, bArr);
        if (this.C1 == 3) {
            this.L1 = m20Var;
            u20 u20Var = this.G1;
            if (u20Var != null) {
                ((h30) u20Var.e).o();
                u20Var.c = true;
                this.G1 = null;
            }
            X(false);
            i0(false);
            return;
        }
        hq6.d0(this.i1).D1(this.n1, this.o1, null);
        if (this.C1 == 1) {
            TLRPC.TL_document tL_document2 = this.g1;
            String absolutePath = file.getAbsolutePath();
            long j2 = this.n1;
            k27 k27Var = this.r1;
            k27 k27Var2 = this.s1;
            boolean z = this.D1;
            int i2 = this.E1;
            if (this.F1) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            x3a f = x3a.f(tL_document2, null, absolutePath, j2, k27Var, k27Var2, null, null, null, null, z, i2, 0, i, null, null, false);
            f.R = this.p1;
            f.T = this.q1;
            f.H = this.t1;
            f.K = this.u1;
            f.Q = 0L;
            z3a.B(this.i1).q0(f);
        }
        kk7 f3 = kk7.f(this.i1);
        Integer valueOf = Integer.valueOf(this.h1);
        if (this.C1 == 2) {
            TLRPC.TL_document tL_document3 = this.g1;
            str = file.getAbsolutePath();
            tL_document = tL_document3;
        } else {
            tL_document = null;
        }
        f3.k(kk7.r2, valueOf, tL_document, str);
        s(true);
    }

    public final boolean n0(ArrayList arrayList, k27 k27Var, long j, boolean z, km6 km6Var, long j2) {
        HashMap hashMap;
        k27 k27Var2 = this.v0;
        ArrayList arrayList2 = this.S0;
        if (k27Var2 == k27Var) {
            int indexOf = arrayList2.indexOf(k27Var);
            if (indexOf >= 0) {
                this.V0 = indexOf;
            }
            return R(k27Var);
        }
        this.W0 = !z;
        this.Z0 = j;
        this.C0 = !arrayList2.isEmpty();
        m();
        this.D0 = km6Var;
        this.b1 = j2;
        boolean z2 = false;
        if (!arrayList.isEmpty() && cf3.B(k27.B0(((k27) arrayList.get(0)).k))) {
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
            k27 k27Var3 = (k27) arrayList.get(size);
            if (k27Var3.I3()) {
                int e1 = k27Var3.e1();
                if (e1 > 0 || z2) {
                    i = Math.min(i, e1);
                    i2 = Math.max(i2, e1);
                }
                arrayList2.add(k27Var3);
                hashMap.put(Integer.valueOf(e1), k27Var3);
            }
            size--;
        }
        s0();
        int indexOf2 = arrayList2.indexOf(k27Var);
        this.V0 = indexOf2;
        if (indexOf2 == -1) {
            m();
            this.V0 = arrayList2.size();
            arrayList2.add(k27Var);
            hashMap.put(Integer.valueOf(k27Var.e1()), k27Var);
        }
        if (k27Var.I3() && !k27Var.r1) {
            if (gba.K0) {
                b();
            }
            if (z) {
                if (this.D0 == null) {
                    final hq6 d0 = hq6.d0(k27Var.K1);
                    final long B0 = k27.B0(k27Var.k);
                    final long j3 = this.b1;
                    final long j4 = i;
                    final long j5 = i2;
                    d0.getMessagesStorage().a.c(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.ip6.run():void");
                        }
                    });
                } else {
                    this.a1 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return R(k27Var);
    }

    public final void o0(TextureView textureView, ix ixVar, FrameLayout frameLayout, boolean z) {
        if (textureView != null) {
            boolean z2 = true;
            if (!z && this.H0 == textureView) {
                this.J0 = (byte) 1;
                this.H0 = null;
                this.M0 = null;
                this.O0 = null;
                return;
            }
            lbc lbcVar = this.F0;
            if (lbcVar != null && textureView != this.H0) {
                if (ixVar == null || !ixVar.d) {
                    z2 = false;
                }
                this.N0 = z2;
                this.H0 = textureView;
                PipRoundVideoView pipRoundVideoView = this.I0;
                if (pipRoundVideoView != null) {
                    lbcVar.z0(pipRoundVideoView.c);
                } else {
                    lbcVar.z0(textureView);
                }
                this.M0 = ixVar;
                this.O0 = frameLayout;
                if (this.Q0 && ixVar != null) {
                    ixVar.a(this.P0, 0);
                }
            }
        }
    }

    @Override
    public final void onAudioFocusChange(int i) {
        gl.d3(new sm3(this, i, (byte) 18));
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public final void p0() {
        this.M = true;
        AudioManager audioManager = im7.p0;
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
                k27 k27Var = (k27) this.f0.get(i);
                this.g0.put(k27Var.e1(), k27Var);
            }
        }
    }

    public final void s(boolean z) {
        File file;
        X(false);
        i0(false);
        u20 u20Var = this.G1;
        if (u20Var != null) {
            ((h30) u20Var.e).o();
            u20Var.c = true;
            this.G1 = null;
        }
        if (!z && (file = this.k1) != null) {
            s60.b(file);
            this.k1.delete();
        }
        Y();
        this.y0 = false;
        this.r = false;
        this.P = false;
    }

    public final void s0() {
        Collections.sort(this.S0, new el6((byte) 1));
    }

    public final void t0(boolean z) {
        boolean z2;
        k27 k27Var = this.v0;
        if (k27Var != null) {
            int i = 0;
            kk7.f(k27Var.K1).k(kk7.t2, Boolean.valueOf(this.M));
            lbc lbcVar = this.F0;
            if (lbcVar != null) {
                if (!this.M) {
                    i = 3;
                }
                lbcVar.w0(i);
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
            lbc lbcVar2 = this.j0;
            if (lbcVar2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            k27 k27Var2 = this.v0;
            float f = k27Var2.b0;
            int i2 = k27Var2.j0;
            if (!z && lbcVar2 != null && lbcVar2.c0() && i2 * f <= 1.0f) {
                k27Var2.b0 = 0.0f;
            } else {
                k27Var2.b0 = f;
            }
            l(false, true, false, false);
            R(k27Var2);
            if (z) {
                if (z2) {
                    gl.e3(new oh6(this, k27Var2, (byte) 2), 100L);
                } else {
                    Q(k27Var2, true);
                }
            }
        }
    }

    public final defpackage.yg2 u() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.u():yg2");
    }

    public final void u0(k27 k27Var) {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            k27Var.S0();
            Timer timer2 = new Timer();
            this.z0 = timer2;
            timer2.schedule(new ox2(this, k27Var, (byte) 2), 0L, 17L);
        }
    }

    public final void v0(mu1 mu1Var) {
        if (mu1Var != null) {
            if ((this.f != null || this.n != null) && this.e != null) {
                if (!gba.k(false)) {
                    k27 k27Var = this.v0;
                    if (k27Var != null) {
                        if (!k27.Q4(k27Var.k) && !this.v0.g4()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.s = mu1Var;
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
                    Utilities.e.c(new wk6(this, (byte) 3));
                    this.Q = true;
                }
            }
        }
    }

    public final void w0(int i, long j, k27 k27Var, k27 k27Var2, TL_stories.StoryItem storyItem, int i2, boolean z, j1a j1aVar, long j2, u47 u47Var) {
        boolean z2;
        long j3;
        long b22;
        long j4;
        k27 k27Var3 = this.v0;
        if (k27Var3 != null && D(k27Var3) && !C()) {
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
            gl.d3(new gs2(i, i2, (byte) 5));
        } else if (r0(i)) {
            this.I1 = true;
            this.J1 = false;
            this.K1 = false;
            this.i1 = i;
            this.h1 = i2;
            this.n1 = j;
            this.p1 = j2;
            this.q1 = u47Var;
            if (k27Var2 == null) {
                b22 = 0;
            } else {
                b22 = k27.b2(i, k27Var2.k, false, false);
            }
            this.o1 = b22;
            this.r1 = k27Var;
            this.s1 = k27Var2;
            this.t1 = storyItem;
            this.u1 = j1aVar;
            this.j1 = null;
            this.k1 = null;
            this.l1 = 0L;
            this.m1 = 0;
            this.w1 = 0L;
            this.C1 = (byte) 0;
            al6 al6Var = new al6(this, i, j, i2, (byte) 0);
            this.H1 = al6Var;
            if (z2) {
                j4 = 500;
            } else {
                j4 = 50;
            }
            gl.e3(al6Var, j4);
        } else {
            if (w01.a) {
                fa4.b("AudioRecorder legacy selected: account=" + i + ", dialog=" + j + ", guid=" + i2);
            }
            xk6 xk6Var = new xk6(this, i, i2, j, j2, u47Var, k27Var2, k27Var, storyItem, j1aVar);
            this.M1 = xk6Var;
            if (z2) {
                j3 = 500;
            } else {
                j3 = 50;
            }
            this.N1.d(xk6Var, j3);
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
            om6 om6Var = (om6) this.c0.get(0);
            oac oacVar = om6Var.b;
            synchronized (this.b) {
                if (oacVar != null) {
                    oacVar.V = false;
                }
            }
            new Thread(new vl6(om6Var, (byte) 3)).start();
        }
    }

    public final long y(k27 k27Var) {
        k27 k27Var2 = this.v0;
        if ((this.j0 != null || this.F0 != null) && k27Var != null && k27Var2 != null && G(k27Var)) {
            try {
                lbc lbcVar = this.j0;
                if (lbcVar != null) {
                    return lbcVar.S();
                }
                lbc lbcVar2 = this.F0;
                if (lbcVar2 != null) {
                    return lbcVar2.S();
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
                    fa4.g(e, true);
                }
            }
        }
    }

    public final void z0(mu1 mu1Var, boolean z, boolean z2) {
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
            if ((this.f != null || this.n != null) && this.e != null && this.s == mu1Var) {
                this.s = null;
                this.Q = false;
                this.w = false;
                this.J = false;
                this.r = false;
                this.M = false;
                Utilities.e.c(new wk6(this, (byte) 5));
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
