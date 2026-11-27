package org.telegram.messenger;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
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
import android.util.Property;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class MediaController implements AudioManager.OnAudioFocusChangeListener, fn7, SensorEventListener {
    public static final String[] W1;
    public static final String[] X1;
    public static final ConcurrentHashMap Y1;
    public static Runnable Z1;
    public static do6 a2;
    public static do6 b2;
    public static ArrayList c2;
    public static ArrayList d2;
    public static st e2;
    public static volatile MediaController f2;
    public static long g2;
    public static boolean h2;
    public boolean B0;
    public boolean C0;
    public byte C1;
    public oo6 D0;
    public boolean D1;
    public byte E;
    public h00 E0;
    public int E1;
    public int F;
    public kfc F0;
    public boolean F1;
    public int G;
    public boolean G0;
    public v20 G1;
    public long H;
    public TextureView H0;
    public gn6 H1;
    public io9 I0;
    public boolean I1;
    public boolean J;
    public ImageView J0;
    public boolean J1;
    public boolean K;
    public LaunchActivity K0;
    public boolean K1;
    public ViewGroup L0;
    public n20 L1;
    public boolean M;
    public jx M0;
    public en6 M1;
    public boolean N;
    public boolean N0;
    public final to3 N1;
    public boolean O;
    public FrameLayout O0;
    public final to3 O1;
    public boolean P;
    public float P0;
    public boolean Q;
    public boolean Q0;
    public float Q1;
    public float R;
    public pc7 R0;
    public ValueAnimator R1;
    public tv T1;
    public boolean U1;
    public byte V;
    public int V0;
    public qo6 V1;
    public boolean W;
    public boolean W0;
    public boolean X;
    public boolean Y0;
    public boolean Z;
    public long Z0;
    public int a1;
    public so6 b0;
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
    public b77 q1;
    public boolean r;
    public r47 r1;
    public zu1 s;
    public r47 s1;
    public TL_stories.StoryItem t1;
    public float u0;
    public c5a u1;
    public r47 v0;
    public boolean w;
    public r47 w0;
    public long w1;
    public long x;
    public lo6 x0;
    public int y;
    public boolean y0;
    public final ByteBuffer z1;
    public final a00 a = new a00(this, (byte) 1);
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
    public kfc j0 = null;
    public kfc k0 = null;
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
    public final xn6 d1 = new xn6(this);
    public int h1 = -1;
    public short[] v1 = new short[1024];
    public final Object x1 = new Object();
    public final ArrayList y1 = new ArrayList();
    public int A1 = 1280;
    public char B1 = 48000;
    public final zz3 P1 = new zz3(this, (byte) 24);
    public final ce0 S1 = new ce0(this, (byte) 8);

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
        to3 to3Var = new to3("recordQueue");
        this.N1 = to3Var;
        to3Var.setPriority(10);
        to3 to3Var2 = new to3("fileEncodingQueue");
        this.O1 = to3Var2;
        to3Var2.setPriority(10);
        to3Var.c(new cn6(this, (byte) 0));
        Utilities.e.c(new cn6(this, (byte) 1));
        this.z1 = ByteBuffer.allocateDirect(1920);
        hl.c3(new cn6(this, (byte) 2));
        ContentResolver contentResolver = a.b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new pd1(null, (byte) 1));
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new pd1(null, (byte) 2));
        } catch (Exception e3) {
            cc4.g(e3, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new pd1(null, (byte) 1));
        } catch (Exception e4) {
            cc4.g(e4, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new pd1(null, (byte) 2));
        } catch (Exception e5) {
            cc4.g(e5, true);
        }
    }

    public static int C(String str) {
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e) {
            cc4.g(e, true);
            i = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        return i;
    }

    public static boolean F(Uri uri) {
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
                                cc4.g(e, true);
                                return true;
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                cc4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    cc4.g(e5, true);
                }
            }
            throw th;
        }
    }

    public static boolean L(Uri uri) {
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
                                    cc4.g(e, true);
                                    return true;
                                }
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                cc4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    cc4.g(e5, true);
                }
            }
            throw th;
        }
    }

    public static void M0(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String n = ik8.n(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
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
            su3.e(uh9.k(length, "XMP segment too large: "));
        }
    }

    public static void R(int i) {
        Thread thread = new Thread(new gw0(i, (byte) 6));
        thread.setPriority(1);
        thread.start();
    }

    public static int T(int r5, int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.T(int, int, int, int, int):int");
    }

    public static native boolean cropOpusFile(String str, String str2, long j, long j2);

    public static void f0(String str, String str2, Context context, pcc pccVar) {
        id idVar;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && context != null) {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists() && file2.exists()) {
                if (!hl.G1(Uri.fromFile(file), 0) && !hl.G1(Uri.fromFile(file2), 0)) {
                    boolean[] zArr = {false};
                    boolean[] zArr2 = new boolean[1];
                    try {
                        id idVar2 = new id(2, null, context);
                        idVar2.m(ob6.M0(2131748533, null));
                        idVar2.setCanceledOnTouchOutside(false);
                        idVar2.setCancelable(true);
                        idVar2.setOnCancelListener(new zn1(zArr, (byte) 3));
                        hl.d3(new in6(zArr2, idVar2, (byte) 1), 250L);
                        idVar = idVar2;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        idVar = null;
                    }
                    new Thread(new z87(file, file2, zArr, pccVar, idVar, zArr2)).start();
                    return;
                }
                return;
            }
            g0(str, context, 0, null, null, pccVar);
        }
    }

    public static void g0(java.lang.String r12, android.content.Context r13, int r14, java.lang.String r15, java.lang.String r16, defpackage.pcc r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.g0(java.lang.String, android.content.Context, int, java.lang.String, java.lang.String, pcc):void");
    }

    public static native byte[] getWaveform(String str);

    public static Uri h0(int i, File file, String str) {
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String D = xb4.D(file);
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
                    str = hl.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i == 1) {
                if (str == null) {
                    str = hl.p0(1, D);
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
                hl.D(fileInputStream, a.b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public static void i0(Context context, k5 k5Var, ArrayList arrayList, ef7 ef7Var) {
        x53 x53Var;
        if (arrayList.isEmpty()) {
            return;
        }
        ?? obj = new Object();
        obj.d = new HashMap();
        obj.a = k5Var;
        obj.c = arrayList;
        obj.s = ef7Var;
        obj.w = ((r47) arrayList.get(0)).I3();
        int i = k5Var.a;
        jn7.f(i).a(obj, jn7.Y1);
        jn7.f(i).a(obj, jn7.X1);
        jn7.f(i).a(obj, jn7.Z1);
        if (PhotoViewer.q0().V0()) {
            x53Var = new x53();
        } else {
            x53Var = null;
        }
        id idVar = new id(2, x53Var, context);
        obj.b = idVar;
        idVar.m(ob6.M0(2131748533, null));
        idVar.setCancelable(true);
        idVar.I = true;
        idVar.setOnCancelListener(new cs0(obj, (byte) 12));
        hl.d3(new io6(obj, (byte) 1), 250L);
        new Thread(new io6(obj, (byte) 2)).start();
    }

    public static native int isOpusFile(String str);

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    public static void l0(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.l0(boolean):void");
    }

    public static java.lang.String q(long r15, android.net.Uri r17, java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.q(long, android.net.Uri, java.lang.String):java.lang.String");
    }

    public static File r(String str) {
        int lastIndexOf;
        File file;
        try {
            File f1 = hl.f1();
            f1.mkdirs();
            if (hl.G1(Uri.fromFile(f1), 0)) {
                return null;
            }
            int i = 0;
            do {
                File f12 = hl.f1();
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
            cc4.g(e, true);
            return null;
        }
    }

    public static int s(int r5, int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.s(int, int, int, boolean):int");
    }

    private native int startRecord(String str, int i);

    private native void stopRecord();

    public static int t(MediaExtractor mediaExtractor, boolean z) {
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

    public static boolean v() {
        AudioDeviceInfo[] devices;
        try {
            for (AudioDeviceInfo audioDeviceInfo : ip7.p0.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            cc4.g(e, true);
            return false;
        }
    }

    public static boolean v0(int i) {
        im0 im0Var = phd.b;
        im0Var.a();
        if (im0Var.c) {
            im0Var.a();
            return im0Var.d;
        } else if (!uc7.s1(i).l4.s0.f) {
            return true;
        } else {
            return false;
        }
    }

    public native int writeFrame(ByteBuffer byteBuffer, int i);

    public static java.lang.String y(android.net.Uri r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.y(android.net.Uri):java.lang.String");
    }

    public static MediaController z() {
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

    public final float A(boolean z) {
        if (z) {
            return this.r0;
        }
        return this.q0;
    }

    public final void A0(zu1 zu1Var) {
        if (zu1Var != null) {
            if ((this.f != null || this.n != null) && this.e != null) {
                if (!xea.k(false)) {
                    r47 r47Var = this.v0;
                    if (r47Var != null) {
                        if (!r47.Q4(r47Var.k) && !this.v0.g4()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.s = zu1Var;
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
                    Utilities.e.c(new cn6(this, (byte) 4));
                    this.Q = true;
                }
            }
        }
    }

    public final long B(r47 r47Var) {
        r47 r47Var2 = this.v0;
        if ((this.j0 != null || this.F0 != null) && r47Var != null && r47Var2 != null && K(r47Var)) {
            try {
                kfc kfcVar = this.j0;
                if (kfcVar != null) {
                    return kfcVar.S();
                }
                kfc kfcVar2 = this.F0;
                if (kfcVar2 != null) {
                    return kfcVar2.S();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void B0(int i, long j, r47 r47Var, r47 r47Var2, TL_stories.StoryItem storyItem, int i2, boolean z, c5a c5aVar, long j2, b77 b77Var) {
        boolean z2;
        long j3;
        long b22;
        long j4;
        r47 r47Var3 = this.v0;
        if (r47Var3 != null && H(r47Var3) && !G()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.y0 = z;
        b0(true);
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.I1 && !a0()) {
            hl.c3(new zs2(i, i2, (byte) 5));
        } else if (v0(i)) {
            this.I1 = true;
            this.J1 = false;
            this.K1 = false;
            this.i1 = i;
            this.h1 = i2;
            this.n1 = j;
            this.p1 = j2;
            this.q1 = b77Var;
            if (r47Var2 == null) {
                b22 = 0;
            } else {
                b22 = r47.b2(i, r47Var2.k, false, false);
            }
            this.o1 = b22;
            this.r1 = r47Var;
            this.s1 = r47Var2;
            this.t1 = storyItem;
            this.u1 = c5aVar;
            this.j1 = null;
            this.k1 = null;
            this.l1 = 0L;
            this.m1 = 0;
            this.w1 = 0L;
            this.C1 = (byte) 0;
            gn6 gn6Var = new gn6(this, i, j, i2, (byte) 0);
            this.H1 = gn6Var;
            if (z2) {
                j4 = 500;
            } else {
                j4 = 50;
            }
            hl.d3(gn6Var, j4);
        } else {
            if (f11.a) {
                cc4.b("AudioRecorder legacy selected: account=" + i + ", dialog=" + j + ", guid=" + i2);
            }
            en6 en6Var = new en6(this, i, i2, j, j2, b77Var, r47Var2, r47Var, storyItem, c5aVar);
            this.M1 = en6Var;
            if (z2) {
                j3 = 500;
            } else {
                j3 = 50;
            }
            this.N1.d(en6Var, j3);
        }
    }

    public final void C0() {
        if (!this.c0.isEmpty()) {
            so6 so6Var = (so6) this.c0.get(0);
            oec oecVar = so6Var.b;
            synchronized (this.b) {
                if (oecVar != null) {
                    oecVar.V = false;
                }
            }
            new Thread(new z96(so6Var, (byte) 16)).start();
        }
    }

    public final boolean D() {
        ArrayList arrayList;
        r47 r47Var = this.v0;
        if (r47Var == null || ((!r47.Q4(r47Var.k) && !this.v0.g4()) || (arrayList = this.f0) == null || arrayList.size() <= 1 || !this.f0.contains(this.v0) || this.f0.indexOf(this.v0) >= this.f0.size() - 1)) {
            return true;
        }
        return false;
    }

    public final void D0() {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public final void E() {
        ImageView imageView = this.J0;
        if (imageView != null) {
            hl.B2(imageView);
            this.J0.setImageDrawable(null);
            this.J0 = null;
        }
    }

    public final void E0(zu1 zu1Var, boolean z, boolean z2) {
        int i;
        if (this.P) {
            this.P = false;
            return;
        }
        if (z2) {
            if (this.g1 != null && !J()) {
                H0(false);
            } else {
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                F0(i, 0, false, false);
            }
        }
        if (this.Q && !this.P) {
            if ((this.f != null || this.n != null) && this.e != null && this.s == zu1Var) {
                this.s = null;
                this.Q = false;
                this.w = false;
                this.J = false;
                this.r = false;
                this.M = false;
                Utilities.e.c(new cn6(this, (byte) 3));
                PowerManager.WakeLock wakeLock = this.d;
                if (wakeLock != null && wakeLock.isHeld()) {
                    this.d.release();
                }
            }
        }
    }

    public final void F0(final int i, final int i2, final boolean z, final boolean z2) {
        v20 v20Var;
        if (this.I1) {
            n20 n20Var = this.L1;
            if (n20Var != null) {
                this.L1 = null;
                if (i == 0) {
                    u(false);
                    return;
                }
                this.C1 = i;
                this.D1 = z;
                this.E1 = i2;
                this.F1 = z2;
                p(n20Var);
                return;
            } else if (this.J1) {
                if (this.C1 == 3) {
                    this.C1 = i;
                    this.D1 = z;
                    this.E1 = i2;
                    this.F1 = z2;
                    if (i == 0) {
                        v20 v20Var2 = this.G1;
                        if (v20Var2 != null) {
                            v20Var2.g = false;
                            v20Var2.b.b();
                        }
                        u(false);
                        return;
                    }
                    return;
                }
                return;
            } else if (i == 2 && (v20Var = this.G1) != null && v20Var.b()) {
                this.y0 = false;
                this.r = false;
                this.P = false;
                return;
            } else {
                gn6 gn6Var = this.H1;
                if (gn6Var != null) {
                    hl.r(gn6Var);
                    this.H1 = null;
                }
                this.J1 = true;
                this.C1 = i;
                this.D1 = z;
                this.E1 = i2;
                this.F1 = z2;
                v20 v20Var3 = this.G1;
                if (v20Var3 == null) {
                    u(false);
                } else {
                    i30 i30Var = v20Var3.b;
                    if (i == 0) {
                        v20Var3.g = false;
                        i30Var.b();
                        u(false);
                    } else {
                        v20Var3.g = true;
                        i30Var.getClass();
                        i30.q();
                        int i3 = i30Var.e().a;
                        if (v20Var3.g && (i3 == 3 || i3 == 5)) {
                            v20Var3.g = false;
                            i30Var.h();
                        }
                    }
                }
                try {
                    this.L0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                final int i4 = this.i1;
                final int i5 = this.h1;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i6;
                        String[] strArr = MediaController.W1;
                        jn7 f = jn7.f(i4);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i == 2) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        f.k(jn7.n2, valueOf, Integer.valueOf(i6));
                    }
                });
                return;
            }
        }
        en6 en6Var = this.M1;
        to3 to3Var = this.N1;
        if (en6Var != null) {
            to3Var.a(en6Var);
            this.M1 = null;
        }
        to3Var.c(new Runnable() {
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
                    mediaController.G0(b3, i6, z3, z4);
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
                    MediaController.l0(false);
                } catch (Exception e) {
                    cc4.g(e, true);
                    if (mediaController.k1 != null) {
                        if (f11.a) {
                            cc4.d("delete voice file");
                        }
                        mediaController.k1.delete();
                    }
                }
                if (b3 == 0) {
                    mediaController.G0(0, 0, false, false);
                }
                try {
                    mediaController.L0.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                hl.c3(new gw1(mediaController, b3, (byte) 4));
            }
        });
    }

    public final boolean G() {
        if (!this.h0 && !this.B0) {
            return false;
        }
        return true;
    }

    public final void G0(final int i, final int i2, final boolean z, final boolean z2) {
        final MediaController mediaController;
        final File file;
        if (i != 0 && (file = this.k1) != null) {
            final TLRPC.TL_document tL_document = this.g1;
            final File file2 = this.j1;
            if (f11.a) {
                cc4.b("stop recording internal filename " + this.k1.getPath());
            }
            mediaController = this;
            mediaController.O1.c(new Runnable() {
                @Override
                public final void run() {
                    String[] strArr = MediaController.W1;
                    MediaController.this.O(file2, file, tL_document, i, z, i2, z2);
                }
            });
        } else {
            mediaController = this;
            u60.b(mediaController.k1);
            File file3 = mediaController.k1;
            if (file3 != null) {
                file3.delete();
            }
            mediaController.b0(false);
        }
        try {
            AudioRecord audioRecord = mediaController.f1;
            if (audioRecord != null) {
                audioRecord.release();
                mediaController.f1 = null;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        mediaController.g1 = null;
        mediaController.j1 = null;
        mediaController.k1 = null;
        mediaController.y0 = false;
        mediaController.r = false;
        mediaController.P = false;
    }

    public final boolean H(r47 r47Var) {
        r47 r47Var2;
        boolean z;
        if (r47Var == null || !r47Var.j2) {
            if ((this.j0 != null || this.F0 != null) && r47Var != null && (r47Var2 = this.v0) != null) {
                long j = r47Var2.T;
                if (j != 0 && j == r47Var.T) {
                    z = this.B0;
                } else if (K(r47Var)) {
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

    public final void H0(boolean z) {
        boolean z2 = false;
        if (this.I1) {
            this.K1 = z;
            v20 v20Var = this.G1;
            if (v20Var != null) {
                if (v20Var.b()) {
                    b0(true);
                    l0(true);
                }
                v20 v20Var2 = this.G1;
                i30 i30Var = v20Var2.b;
                i30Var.getClass();
                i30.q();
                int i = i30Var.e().a;
                if (i == 6) {
                    v20Var2.i = !v20Var2.i;
                    return;
                }
                v20Var2.i = false;
                if (i == 3) {
                    v20Var2.b.n();
                    return;
                } else if (i == 5) {
                    i30 i30Var2 = v20Var2.b;
                    i30Var2.getClass();
                    i30.q();
                    if (i30Var2.G == 5) {
                        i30Var2.h.b("resume requested: trim=" + i30Var2.r + ".." + i30Var2.s + ", sourceDurationMs=" + i30Var2.j());
                        i30Var2.p();
                        i30Var2.s(6);
                        g30 g30Var = i30Var2.z;
                        if (g30Var == null) {
                            i30Var2.g(new IllegalStateException("Output generation is missing"));
                            return;
                        }
                        long j = i30Var2.r;
                        long j2 = i30Var2.s;
                        if (j2 >= i30.r(i30Var2.p)) {
                            z2 = true;
                        }
                        i30Var2.k(1);
                        long j3 = ((j2 - j) * 48000) / 1000;
                        i30Var2.p = j3;
                        i30Var2.r = 0L;
                        i30Var2.s = i30.r(j3);
                        i30Var2.d();
                        i30Var2.h.b("resume prefix selected: source=" + g30Var.b.getName() + ", trim=" + j + ".." + j2);
                        File file = g30Var.b;
                        if (z2) {
                            j2 = -1;
                        }
                        i30Var2.u(j, j2, file);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        this.N1.c(new dn6(this, z, (byte) 0));
    }

    public final boolean I() {
        if (this.M1 == null && this.H1 == null && this.g1 == null) {
            return false;
        }
        return true;
    }

    public final boolean I0(int i, ArrayList arrayList) {
        boolean z;
        int size;
        r47 r47Var;
        int i2;
        r47 r47Var2;
        int i3 = this.V0;
        int i4 = 0;
        if (ConnectionsManager.getInstance(yac.t0).getConnectionState() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.V0 += i;
        if (z) {
            while (this.V0 < arrayList.size() && (i2 = this.V0) >= 0 && ((r47Var2 = (r47) arrayList.get(i2)) == null || !r47Var2.z0)) {
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
                    r47Var = (r47) arrayList.get(i6);
                    if (r47Var == null && r47Var.z0) {
                        break;
                    }
                    this.V0 += i;
                } else {
                    if (i6 < i3) {
                        break;
                    }
                    r47Var = (r47) arrayList.get(i6);
                    if (r47Var == null) {
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

    public final boolean J() {
        if (this.I1) {
            v20 v20Var = this.G1;
            if (v20Var != null && v20Var.b()) {
                return true;
            }
            return false;
        }
        return this.e1;
    }

    public final void J0() {
        r47 r47Var = this.v0;
        if (r47Var != null && G() && this.i0 && (r47.Q4(r47Var.k) || r47Var.I3())) {
            V(r47Var);
        }
        this.i0 = false;
    }

    public final boolean K(r47 r47Var) {
        boolean z;
        boolean z2;
        r47 r47Var2 = this.v0;
        if (r47Var2 != null && r47.B0(r47Var2.k) == r47.B0(r47Var.k) && this.v0.e1() == r47Var.e1()) {
            if (this.v0.T == 0) {
                z = true;
            } else {
                z = false;
            }
            if (r47Var.T == 0) {
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

    public final void K0(File file, long j, byte[] bArr) {
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

    public final void L0(r47 r47Var, int[] iArr, boolean z, boolean z2, int i) {
        r47 r47Var2;
        if (this.F0 != null) {
            if (i != 4 && i != 1) {
                try {
                    this.K0.getWindow().addFlags(128);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            } else {
                try {
                    this.K0.getWindow().clearFlags(128);
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
            }
            xn6 xn6Var = this.d1;
            if (i == 3) {
                this.G0 = true;
                r47 r47Var3 = this.v0;
                if (r47Var3 != null && (r47.K4(r47Var3.k) || this.v0.g4())) {
                    hl.r(xn6Var);
                    xb4.G(r47Var.K1).Z(this.v0.F0(), true, false);
                }
                this.Q0 = true;
            } else if (i == 2) {
                if (z2 && (r47Var2 = this.v0) != null) {
                    if (r47.K4(r47Var2.k) || this.v0.g4()) {
                        if (this.G0) {
                            xn6Var.run();
                        } else {
                            hl.d3(xn6Var, 1000L);
                        }
                    }
                }
            } else if (this.F0.c0() && i == 4) {
                r47 r47Var4 = this.v0;
                if (r47Var4 != null && r47.K4(r47Var4.k) && !z && (iArr == null || iArr[0] < 4)) {
                    this.F0.o0(0L);
                    if (iArr != null) {
                        iArr[0] = iArr[0] + 1;
                    }
                } else if (!d0()) {
                    m(true, D(), true, false);
                }
            }
        }
    }

    public final File M(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            File z = xb4.z(1);
            File file3 = new File(z, System.currentTimeMillis() + "_" + xb4.r(null, tL_document));
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

    public final void N(final int i, final int i2, long j, long j2, b77 b77Var, r47 r47Var, r47 r47Var2, TL_stories.StoryItem storyItem, c5a c5aVar) {
        String absolutePath;
        if (this.f1 != null) {
            hl.c3(new Runnable(this) {
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
                            jn7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(156, Integer.valueOf(i3), Boolean.TRUE);
                            return;
                    }
                }
            });
            return;
        }
        l0(true);
        this.C1 = (byte) 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.g1 = tL_document;
        this.h1 = i2;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = Integer.MIN_VALUE;
        tL_document.id = xea.p();
        this.g1.user_id = yac.h(i).e();
        TLRPC.TL_document tL_document2 = this.g1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        xea.x();
        File z = xb4.z(1);
        this.k1 = new File(z, System.currentTimeMillis() + "_" + xb4.r(null, this.g1));
        xb4.z(4).mkdirs();
        if (f11.a) {
            cc4.b("start recording internal " + this.k1.getPath() + " " + this.k1.exists());
        }
        File file = this.k1;
        Set set = u60.a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            u60.a.add(absolutePath);
        }
        try {
            if (startRecord(this.k1.getPath(), this.B1) == 0) {
                hl.c3(new Runnable(this) {
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
                                jn7.f(i4).k(157, Integer.valueOf(i3));
                                return;
                            case 1:
                                String[] strArr2 = MediaController.W1;
                                mediaController.M1 = null;
                                jn7.f(i4).k(157, Integer.valueOf(i3));
                                return;
                            case 2:
                                String[] strArr3 = MediaController.W1;
                                mediaController.M1 = null;
                                jn7.f(i4).k(157, Integer.valueOf(i3));
                                return;
                            default:
                                String[] strArr4 = MediaController.W1;
                                mediaController.M1 = null;
                                jn7.f(i4).k(156, Integer.valueOf(i3), Boolean.TRUE);
                                return;
                        }
                    }
                });
                if (f11.a) {
                    cc4.b("cant init encoder");
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
            this.q1 = b77Var;
            if (r47Var != null) {
                j3 = r47.b2(this.i1, r47Var.k, false, false);
            }
            this.o1 = j3;
            this.i1 = i;
            this.r1 = r47Var2;
            this.s1 = r47Var;
            this.t1 = storyItem;
            this.u1 = c5aVar;
            this.z1.rewind();
            this.f1.startRecording();
            this.N1.c(this.P1);
            hl.c3(new Runnable(this) {
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
                            jn7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(156, Integer.valueOf(i3), Boolean.TRUE);
                            return;
                    }
                }
            });
        } catch (Exception e) {
            cc4.g(e, true);
            this.g1 = null;
            stopRecord();
            u60.b(this.k1);
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
                cc4.g(e3, true);
            }
            l0(false);
            hl.c3(new Runnable(this) {
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
                            jn7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(157, Integer.valueOf(i3));
                            return;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(156, Integer.valueOf(i3), Boolean.TRUE);
                            return;
                    }
                }
            });
        }
    }

    public final void O(File file, File file2, final TLRPC.TL_document tL_document, final int i, final boolean z, final int i2, final boolean z2) {
        stopRecord();
        final File M = M(file, file2, tL_document);
        if (M == null) {
            if (f11.a) {
                cc4.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (f11.a) {
            cc4.b("stop recording internal in queue " + M.exists() + " " + M.length());
        }
        hl.c3(new Runnable() {
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
                boolean z4 = f11.a;
                File file3 = M;
                if (z4) {
                    cc4.b("stop recording internal ".concat(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1));
                }
                if (!file3.exists()) {
                    cc4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1), true);
                }
                ls6.d0(mediaController.i1).D1(mediaController.n1, mediaController.o1, null);
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
                        r47 r47Var = mediaController.r1;
                        r47 r47Var2 = mediaController.s1;
                        if (z2) {
                            i3 = Integer.MAX_VALUE;
                        } else {
                            i3 = 0;
                        }
                        c = 1;
                        b = 2;
                        z3 = false;
                        p7a f = p7a.f(tL_document2, null, absolutePath, j2, r47Var, r47Var2, null, null, null, null, z, i2, 0, i3, null, null, false);
                        f.R = mediaController.p1;
                        f.T = mediaController.q1;
                        f.H = mediaController.t1;
                        f.K = mediaController.u1;
                        f.Q = 0L;
                        r7a.B(mediaController.i1).q0(f);
                    } else {
                        c = 1;
                        b = 2;
                        z3 = false;
                    }
                    jn7 f3 = jn7.f(mediaController.i1);
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
                    f3.k(jn7.s2, objArr);
                } else {
                    z3 = false;
                    jn7.f(mediaController.i1).k(jn7.t2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j));
                    u60.b(file3);
                    file3.delete();
                }
                mediaController.b0(z3);
            }
        });
    }

    public final void P(boolean z) {
        stopRecord();
        TLRPC.TL_document tL_document = this.g1;
        File M = M(this.j1, this.k1, tL_document);
        if (tL_document != null && M != null) {
            hl.c3(new lg(this, M, z, tL_document, (byte) 24));
        }
    }

    public final void Q() {
        this.j1 = this.k1;
        File z = xb4.z(1);
        vn6 vn6Var = new vn6(z, System.currentTimeMillis() + "_" + xb4.r(null, this.g1), (byte) 1);
        this.k1 = vn6Var;
        if (startRecord(vn6Var.getPath(), this.B1) == 0) {
            hl.c3(new cn6(this, (byte) 6));
            if (f11.a) {
                cc4.b("cant resume audio encoder");
                return;
            }
            return;
        }
        hl.c3(new cn6(this, (byte) 7));
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.S():void");
    }

    public final boolean U(r47 r47Var, boolean z) {
        if ((this.j0 != null || this.F0 != null) && r47Var != null && this.v0 != null && K(r47Var)) {
            D0();
            try {
                if (this.j0 != null) {
                    if (z && !go.w() && !r47.Q4(this.v0.k) && this.v0.L0() * (1.0f - this.v0.b0) > 1.0d && LaunchActivity.G1) {
                        ValueAnimator valueAnimator = this.R1;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            this.R1.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        this.R1 = ofFloat;
                        ofFloat.addUpdateListener(this.S1);
                        this.R1.setDuration(300L);
                        this.R1.addListener(new ad5(this, (byte) 14));
                        this.R1.start();
                    } else {
                        this.j0.f0();
                    }
                } else {
                    kfc kfcVar = this.F0;
                    if (kfcVar != null) {
                        kfcVar.f0();
                    }
                }
                this.h0 = true;
                jn7.f(this.v0.K1).k(jn7.g2, Integer.valueOf(this.v0.e1()));
                try {
                    go.b(1);
                    if (!this.U1) {
                        if (lh2.t().w()) {
                            lh2.t().T(x());
                        }
                        go.z(false);
                    }
                    return true;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return true;
                }
            } catch (Exception e3) {
                cc4.g(e3, true);
                this.h0 = false;
            }
        }
        return false;
    }

    public final boolean V(final defpackage.r47 r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.V(r47):boolean");
    }

    public final void W(int i) {
        int i2 = this.V0;
        if (i2 >= 0) {
            ArrayList arrayList = this.S0;
            if (i2 < arrayList.size()) {
                this.V0 = i;
                this.C0 = true;
                r47 r47Var = (r47) arrayList.get(i);
                if (this.v0 != null && !K(r47Var)) {
                    this.v0.F5();
                }
                V(r47Var);
            }
        }
    }

    public final void X(boolean z) {
        ArrayList arrayList;
        boolean z2;
        int i;
        int i2;
        if (xea.J0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (z && (((i2 = xea.O0) == 2 || (i2 == 1 && arrayList.size() == 1)) && !this.W0)) {
            m(false, false, false, false);
            int i3 = this.V0;
            if (i3 >= 0 && i3 < arrayList.size()) {
                r47 r47Var = (r47) arrayList.get(this.V0);
                r47Var.b0 = 0.0f;
                r47Var.i0 = 0;
                V(r47Var);
                return;
            }
            return;
        }
        if (this.R0 != null) {
            if (!xea.K0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = xea.K0;
        }
        if (z2) {
            i = 1;
        } else {
            i = -1;
        }
        if (I0(i, arrayList) && z && xea.O0 == 0 && !this.W0) {
            if (this.j0 == null) {
                if (this.F0 != null) {
                    E();
                    this.M0 = null;
                    this.O0 = null;
                    this.Q0 = false;
                    this.H0 = null;
                    this.F0.l0();
                    this.F0 = null;
                    try {
                        this.K0.getWindow().clearFlags(128);
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    hl.r(this.d1);
                    xb4.G(this.v0.K1).Z(this.v0.F0(), true, false);
                } else {
                    return;
                }
            } else {
                lo6 lo6Var = this.x0;
                if (lo6Var != null) {
                    lo6Var.a();
                    this.x0 = null;
                }
                try {
                    this.j0.l0();
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                this.j0 = null;
                aob.L1(this.v0);
            }
            D0();
            this.h0 = true;
            r47 r47Var2 = this.v0;
            r47Var2.b0 = 0.0f;
            r47Var2.i0 = 0;
            jn7.f(r47Var2.K1).k(jn7.e2, Integer.valueOf(this.v0.e1()), 0);
            jn7.f(this.v0.K1).k(jn7.g2, Integer.valueOf(this.v0.e1()));
            return;
        }
        int i4 = this.V0;
        if (i4 >= 0 && i4 < arrayList.size()) {
            r47 r47Var3 = this.v0;
            if (r47Var3 != null) {
                r47Var3.F5();
            }
            this.C0 = true;
            V((r47) arrayList.get(this.V0));
        }
    }

    public final void Y() {
        ArrayList arrayList;
        int i;
        boolean z;
        int i2;
        if (xea.J0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (!arrayList.isEmpty() && (i = this.V0) >= 0 && i < arrayList.size()) {
            r47 r47Var = (r47) arrayList.get(this.V0);
            if (r47Var.i0 > 10) {
                k0(r47Var, 0.0f);
                return;
            }
            if (this.R0 != null) {
                if (!xea.K0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = xea.K0;
            }
            if (z) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            I0(i2, arrayList);
            if (this.V0 < arrayList.size()) {
                this.C0 = true;
                V((r47) arrayList.get(this.V0));
            }
        }
    }

    public final void Z(boolean z) {
        c5a c5aVar;
        long j;
        if (this.g1 != null) {
            H0(false);
        } else if (z) {
            int currentAccount = this.s.getCurrentAccount();
            long a = this.s.a();
            zu1 zu1Var = this.s;
            r47 r47Var = zu1Var.m4;
            int classGuid = zu1Var.getClassGuid();
            zu1 zu1Var2 = this.s;
            b77 b77Var = null;
            if (zu1Var2 != null) {
                c5aVar = zu1Var2.X6();
            } else {
                c5aVar = null;
            }
            zu1 zu1Var3 = this.s;
            if (zu1Var3 != null) {
                j = zu1Var3.k7();
            } else {
                j = 0;
            }
            zu1 zu1Var4 = this.s;
            if (zu1Var4 != null) {
                b77Var = zu1Var4.y5;
            }
            B0(currentAccount, a, null, r47Var, null, classGuid, false, c5aVar, j, b77Var);
        } else {
            F0(2, 0, false, false);
        }
    }

    public final boolean a0() {
        n20 n20Var = this.L1;
        if (n20Var != null) {
            File file = (File) n20Var.b;
            u60.b(file);
            file.delete();
            c0();
            return true;
        }
        v20 v20Var = this.G1;
        if (v20Var != null && v20Var.b()) {
            this.G1 = null;
            if (!v20Var.a()) {
                v20Var.b.o();
                v20Var.h = true;
            }
            c0();
            return true;
        }
        return false;
    }

    public final void b() {
        r47 r47Var;
        ArrayList arrayList = this.S0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            ArrayList arrayList3 = this.U0;
            arrayList3.clear();
            int i = this.V0;
            if (i >= 0 && i < arrayList.size()) {
                r47Var = (r47) arrayList.get(this.V0);
                arrayList2.remove(this.V0);
            } else {
                r47Var = null;
            }
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                int nextInt = Utilities.b.nextInt(arrayList2.size());
                arrayList3.add((r47) arrayList2.get(nextInt));
                arrayList2.remove(nextInt);
            }
            if (r47Var != null) {
                arrayList3.add(r47Var);
                this.V0 = arrayList3.size() - 1;
            }
        }
    }

    public final void b0(boolean z) {
        boolean z2 = this.W;
        a00 a00Var = this.a;
        if (z) {
            if (!z2 && xea.B0 && ip7.p0.requestAudioFocus(a00Var, 3, 2) == 1) {
                this.W = true;
            }
        } else if (z2) {
            ip7.p0.abandonAudioFocus(a00Var);
            this.W = false;
        }
    }

    public final boolean c() {
        r47 r47Var = this.v0;
        if (r47Var != null) {
            if ((r47Var.I3() || r47.Q4(this.v0.k) || this.v0.g4()) && !this.v0.R4() && !this.v0.f4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c0() {
        this.g1 = null;
        this.j1 = null;
        this.k1 = null;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.L1 = null;
        this.C1 = (byte) 0;
    }

    public final void d(r47 r47Var) {
        if (r47Var != null && !this.c0.isEmpty()) {
            for (int i = 0; i < this.c0.size(); i++) {
                so6 so6Var = (so6) this.c0.get(i);
                r47 r47Var2 = so6Var.a;
                if (r47Var2.T(r47Var) && r47Var2.K1 == r47Var.K1) {
                    if (i == 0) {
                        synchronized (this.b) {
                            so6Var.b.V = true;
                        }
                        return;
                    }
                    this.a0.remove((so6) this.c0.remove(i));
                    f(true);
                    return;
                }
            }
        }
    }

    public final boolean d0() {
        ArrayList arrayList;
        int i;
        r47 r47Var;
        qo6 qo6Var = this.V1;
        if (qo6Var != null) {
            r47 r47Var2 = qo6Var.a;
            this.V1 = null;
            if (xea.J0) {
                arrayList = this.U0;
            } else {
                arrayList = this.S0;
            }
            if (arrayList != null && (i = this.V0) >= 0 && i < arrayList.size() && (r47Var = (r47) arrayList.get(this.V0)) != null && r47.B0(r47Var.k) == r47.B0(r47Var2.k) && r47Var.e1() == r47Var2.e1()) {
                this.C0 = false;
                float f = qo6Var.b;
                r47Var.c0 = f;
                r47Var.b0 = f;
                r47Var.d0 = qo6Var.c;
                r47Var.i0 = qo6Var.d;
                V(r47Var);
                U(r47Var, false);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        pc7 pc7Var;
        r47 r47Var;
        ArrayList arrayList;
        char c;
        int indexOf;
        int i3 = 0;
        if (i != jn7.Y1 && i != jn7.R1) {
            if (i == jn7.v) {
                if (!((Boolean) objArr[2]).booleanValue()) {
                    long longValue = ((Long) objArr[1]).longValue();
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    r47 r47Var2 = this.v0;
                    if (r47Var2 != null && longValue == r47Var2.k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(r47Var2.e1()))) {
                        m(true, true, false, false);
                    }
                    ArrayList arrayList3 = this.f0;
                    if (arrayList3 != null && !arrayList3.isEmpty() && longValue == ((r47) this.f0.get(0)).k.peer_id.channel_id) {
                        while (i3 < arrayList2.size()) {
                            Integer num = (Integer) arrayList2.get(i3);
                            r47 r47Var3 = (r47) this.g0.get(num.intValue());
                            this.g0.remove(num.intValue());
                            if (r47Var3 != null) {
                                this.f0.remove(r47Var3);
                            }
                            i3++;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i == jn7.e0) {
                long longValue2 = ((Long) objArr[0]).longValue();
                r47 r47Var4 = this.v0;
                if (r47Var4 != null && r47.B0(r47Var4.k) == longValue2) {
                    m(false, true, false, false);
                    return;
                }
                return;
            } else {
                int i4 = jn7.K0;
                int[] iArr = this.c1;
                HashMap hashMap = this.T0;
                ArrayList arrayList4 = this.S0;
                if (i == i4) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    long longValue4 = ((Long) objArr[3]).longValue();
                    r47 r47Var5 = this.v0;
                    if (r47Var5 != null && r47Var5.I3() && r47.B0(this.v0.k) == longValue3 && this.b1 == longValue4 && !this.v0.r1) {
                        arrayList4.addAll(0, (ArrayList) objArr[1]);
                        arrayList4.addAll((ArrayList) objArr[2]);
                        int size = arrayList4.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            r47 r47Var6 = (r47) arrayList4.get(i5);
                            hashMap.put(Integer.valueOf(r47Var6.e1()), r47Var6);
                            iArr[0] = Math.min(iArr[0], r47Var6.e1());
                        }
                        x0();
                        if (xea.J0) {
                            b();
                        } else {
                            r47 r47Var7 = this.v0;
                            if (r47Var7 != null && (indexOf = arrayList4.indexOf(r47Var7)) >= 0) {
                                this.V0 = indexOf;
                            }
                        }
                        this.a1 = ConnectionsManager.generateClassGuid();
                        return;
                    }
                    return;
                }
                int i6 = jn7.V;
                int i7 = jn7.L0;
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
                            r47 r47Var8 = (r47) arrayList5.get(i9);
                            if (!r47Var8.R4() && !hashMap.containsKey(Integer.valueOf(r47Var8.e1()))) {
                                i8++;
                                arrayList4.add(0, r47Var8);
                                hashMap.put(Integer.valueOf(r47Var8.e1()), r47Var8);
                                iArr[c] = Math.min(iArr[c], r47Var8.e1());
                            }
                        }
                        x0();
                        int indexOf2 = arrayList4.indexOf(this.v0);
                        if (indexOf2 >= 0) {
                            this.V0 = indexOf2;
                        }
                        this.Y0 = false;
                        if (xea.J0) {
                            b();
                        }
                        if (i8 != 0) {
                            jn7.f(this.v0.K1).k(i7, Integer.valueOf(i8));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 1) {
                    if (!((Boolean) objArr[2]).booleanValue() && (arrayList = this.f0) != null && !arrayList.isEmpty() && ((Long) objArr[0]).longValue() == r47.B0(((r47) this.f0.get(0)).k)) {
                        ArrayList arrayList6 = (ArrayList) objArr[1];
                        while (i3 < arrayList6.size()) {
                            r47 r47Var9 = (r47) arrayList6.get(i3);
                            if ((r47.Q4(r47Var9.k) || r47Var9.g4()) && !r47Var9.R4() && !r47Var9.f4() && (!this.e0 || (r47Var9.k.media_unread && !r47Var9.N3()))) {
                                this.f0.add(r47Var9);
                                this.g0.put(r47Var9.e1(), r47Var9);
                            }
                            i3++;
                        }
                        return;
                    }
                    return;
                } else if (i == jn7.K4) {
                    kfc kfcVar = (kfc) objArr[0];
                    if (this.F0 != kfcVar && this.j0 != kfcVar) {
                        r47 r47Var10 = this.v0;
                        if (r47Var10 != null && H(r47Var10) && !G() && (r47Var10.I3() || r47.Q4(r47Var10.k))) {
                            this.i0 = true;
                        }
                        U(r47Var10, true);
                        return;
                    }
                    return;
                } else if (i == jn7.W3 && (pc7Var = this.R0) != null && objArr[0] == pc7Var) {
                    int size2 = pc7Var.c.size() - arrayList4.size();
                    arrayList4.clear();
                    arrayList4.addAll(this.R0.c);
                    x0();
                    if (xea.J0) {
                        b();
                    } else {
                        r47 r47Var11 = this.v0;
                        if (r47Var11 != null) {
                            int indexOf3 = arrayList4.indexOf(r47Var11);
                            if (indexOf3 >= 0) {
                                this.V0 = indexOf3;
                            } else {
                                int i10 = this.V0;
                                if (i10 < 0 || i10 >= arrayList4.size()) {
                                    this.V0 = 0;
                                }
                                if (arrayList4.size() == 0) {
                                    k();
                                } else {
                                    V((r47) arrayList4.get(0));
                                }
                            }
                        }
                    }
                    if (size2 != 0 && (r47Var = this.v0) != null) {
                        jn7.f(r47Var.K1).k(i7, Integer.valueOf(size2));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        String str = (String) objArr[0];
        r47 r47Var12 = this.v0;
        if (r47Var12 != null && r47Var12.K1 == i2 && xb4.r(null, r47Var12.F0()).equals(str)) {
            if (this.B0) {
                this.C0 = true;
                V(this.v0);
            } else if (this.E0 == null) {
                try {
                    xb4.G(yac.t0);
                    this.E0 = h00.a(xb4.M(this.v0.k, false, true));
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public final void e(r47 r47Var) {
        byte b;
        int i;
        int requestAudioFocus;
        if (!r47.Q4(r47Var.k) && !r47Var.g4()) {
            b = 1;
        } else if (this.M) {
            b = 3;
        } else {
            b = 2;
        }
        if (this.V != b) {
            this.V = b;
            if (b == 3) {
                requestAudioFocus = ip7.p0.requestAudioFocus(this, 0, 1);
            } else {
                AudioManager audioManager = ip7.p0;
                if (b == 2 && !xea.C0) {
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

    public final void e0() {
        r47 r47Var;
        kfc kfcVar = this.j0;
        if (kfcVar != null && (r47Var = this.v0) != null && !this.h0) {
            if (kfcVar.d != null && kfcVar.M == 2) {
                m(false, false, false, false);
                V(r47Var);
                return;
            }
            kfcVar.g0();
        }
    }

    public final void f(boolean z) {
        so6 so6Var;
        if (!this.a0.isEmpty()) {
            so6Var = (so6) this.a0.get(0);
            this.b0 = so6Var;
        } else {
            so6Var = null;
            this.b0 = null;
        }
        if (so6Var != null || z) {
            if (VideoEncodingService.e == null) {
                try {
                    a.b.startService(new Intent(a.b, VideoEncodingService.class));
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            } else if (z) {
                so6 so6Var2 = z().b0;
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService.b != so6Var2) {
                    if (so6Var2 != null) {
                        videoEncodingService.a(so6Var2);
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
        lq3 q = lq3.q(i);
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
        if (xea.J0) {
            arrayList = this.U0;
        } else {
            arrayList = this.S0;
        }
        if (arrayList != null && arrayList.size() >= 2) {
            if (this.R0 != null) {
                if (!xea.K0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = xea.K0;
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
                r47 r47Var = (r47) arrayList.get(i2);
                File file = null;
                if (!TextUtils.isEmpty(r47Var.k.attachPath)) {
                    File file2 = new File(r47Var.k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file != null) {
                    M = file;
                } else {
                    xb4.G(i);
                    M = xb4.M(r47Var.k, false, true);
                }
                M.exists();
                if (M != file && !M.exists() && r47Var.I3()) {
                    xb4 G = xb4.G(i);
                    TLRPC.Document F0 = r47Var.F0();
                    if (!r47.Q5(r47Var.k)) {
                        i3 = 0;
                    }
                    G.X(F0, r47Var, 0, i3);
                }
            }
        }
    }

    public native byte[] getWaveform2(short[] sArr, int i);

    public final void h(int i) {
        File M;
        ArrayList arrayList = this.f0;
        if (arrayList != null) {
            int i2 = 2;
            if (arrayList.size() >= 2) {
                r47 r47Var = (r47) this.f0.get(1);
                String str = r47Var.k.attachPath;
                File file = null;
                if (str != null && str.length() > 0) {
                    File file2 = new File(r47Var.k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file != null) {
                    M = file;
                } else {
                    xb4.G(i);
                    M = xb4.M(r47Var.k, false, true);
                }
                M.exists();
                if (M != file && !M.exists()) {
                    xb4 G = xb4.G(i);
                    TLRPC.Document F0 = r47Var.F0();
                    if (!r47.Q5(r47Var.k)) {
                        i2 = 0;
                    }
                    G.X(F0, r47Var, 0, i2);
                }
            }
        }
    }

    public final void i() {
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

    public final void j(boolean z) {
        File file;
        File file2;
        boolean z2;
        File file3;
        v20 v20Var;
        v20 v20Var2;
        if (this.I1) {
            gn6 gn6Var = this.H1;
            if (gn6Var != null) {
                hl.r(gn6Var);
                this.H1 = null;
            }
            if (!z && (v20Var2 = this.G1) != null) {
                z2 = v20Var2.a();
            } else {
                z2 = false;
            }
            if (!z2 && (v20Var = this.G1) != null) {
                v20Var.g = false;
                v20Var.b.b();
            }
            if (z2 && (file3 = this.k1) != null) {
                u60.b(file3);
            }
            u(!z);
            return;
        }
        this.g1 = null;
        u60.b(this.k1);
        if (z && (file2 = this.k1) != null) {
            try {
                file2.delete();
            } catch (Exception e) {
                cc4.g(e, true);
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

    public final boolean j0(r47 r47Var, boolean z, boolean z2, boolean z3) {
        oec oecVar;
        if (r47Var != null) {
            oecVar = r47Var.r0;
        } else {
            oecVar = null;
        }
        if (r47Var != null && oecVar != null) {
            ArrayList arrayList = this.c0;
            if (z) {
                if (arrayList.isEmpty()) {
                    new File(r47Var.k.attachPath).delete();
                }
            }
            ?? obj = new Object();
            obj.a = r47Var;
            obj.c = r47Var.K1;
            obj.b = oecVar;
            obj.d = z3;
            arrayList.add(obj);
            if (z2) {
                this.a0.add(obj);
                f(false);
            }
            if (arrayList.size() == 1) {
                C0();
            }
            return true;
        }
        return false;
    }

    public final void k() {
        m(true, true, false, false);
        this.E0 = null;
        this.C0 = false;
        for (int i = 0; i < 4; i++) {
            lq3 q = lq3.q(i);
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
        n();
    }

    public final void k0(r47 r47Var, float f) {
        r47 r47Var2 = this.v0;
        if ((this.j0 != null || this.F0 != null) && r47Var != null && r47Var2 != null && K(r47Var)) {
            try {
                kfc kfcVar = this.j0;
                if (kfcVar != null) {
                    long U = kfcVar.U();
                    if (U == -9223372036854775807L) {
                        this.u0 = f;
                    } else {
                        r47Var2.b0 = f;
                        long j = (int) (((float) U) * f);
                        this.j0.p0(j, false);
                        r47Var2.e0 = j;
                        if (!this.U1) {
                            go.x(j);
                        }
                    }
                } else {
                    kfc kfcVar2 = this.F0;
                    if (kfcVar2 != null) {
                        kfcVar2.o0(((float) kfcVar2.U()) * f);
                        if (!this.U1) {
                            go.x(((float) this.F0.U()) * f);
                        }
                    }
                }
                jn7.f(r47Var.K1).k(jn7.i2, Integer.valueOf(r47Var2.e1()), Float.valueOf(f));
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void l(boolean z, boolean z2) {
        m(z, z2, false, false);
    }

    public final void m(boolean r20, boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.m(boolean, boolean, boolean, boolean):void");
    }

    public final void m0(boolean z) {
        Bitmap bitmap;
        boolean z2;
        if (this.M0 != null && this.F0 != null) {
            io9 io9Var = this.I0;
            if (z) {
                if (io9Var != null) {
                    bitmap = io9Var.a.d();
                } else {
                    bitmap = null;
                }
                if (this.I0 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.M0.getParent() == null) {
                    this.O0.addView(this.M0);
                }
                if (this.N0) {
                    this.M0.setDrawingReady(true);
                }
                this.F0.z0(this.H0);
                if (z2) {
                    E();
                    if (bitmap != null && this.M0 != null) {
                        ImageView imageView = new ImageView(this.M0.getContext());
                        this.J0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        this.J0.setImageBitmap(bitmap);
                        this.M0.addView(this.J0, tre.c(-1.0f, -1));
                    }
                    o();
                    return;
                }
                return;
            }
            if (io9Var == null) {
                w0(w());
            }
            if (this.I0 != null && this.M0.getParent() != null) {
                E();
                this.O0.removeView(this.M0);
            }
        }
    }

    public final void n() {
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

    public final void n0(int i) {
        boolean z = xea.J0;
        if (i == 2) {
            xea.J0 = true;
            xea.K0 = false;
        } else if (i == 1) {
            xea.K0 = true;
            xea.J0 = false;
        } else {
            xea.K0 = false;
            xea.J0 = false;
        }
        MediaController z2 = z();
        r47 r47Var = z2.v0;
        if (r47Var != null && r47Var.I3()) {
            z2.g(z2.v0.K1);
        }
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("shuffleMusic", xea.J0);
        edit.putBoolean("playOrderReversed", xea.K0);
        edit.apply();
        boolean z3 = xea.J0;
        if (z != z3) {
            if (z3) {
                b();
                return;
            }
            r47 r47Var2 = this.v0;
            if (r47Var2 != null) {
                int indexOf = this.S0.indexOf(r47Var2);
                this.V0 = indexOf;
                if (indexOf == -1) {
                    n();
                    m(true, true, false, false);
                }
            }
        }
    }

    public final void o() {
        io9 io9Var = this.I0;
        if (io9Var != null) {
            this.I0 = null;
            io9Var.a();
        }
    }

    public final void o0(boolean z, float f) {
        String str;
        float f3;
        String str2;
        if (z) {
            if (this.r0 >= 6.0f && f == 1.0f && this.v0 != null) {
                this.j0.f0();
                r47 r47Var = this.v0;
                hl.d3(new dt(this, r47Var, r47Var.b0, (byte) 1), 50L);
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
        kfc kfcVar = this.j0;
        if (kfcVar != null) {
            kfcVar.u0(Math.round(f * 10.0f) / 10.0f);
        } else {
            kfc kfcVar2 = this.F0;
            if (kfcVar2 != null) {
                kfcVar2.u0(Math.round(f * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor edit = uc7.e1().edit();
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
        jn7.e().k(jn7.M4, new Object[0]);
        if (!this.U1) {
            go.B(f);
        }
    }

    @Override
    public final void onAudioFocusChange(int i) {
        hl.c3(new hl3(this, i, (byte) 20));
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public final void p(n20 n20Var) {
        byte[] bArr;
        TLRPC.TL_document tL_document;
        int i;
        File file = (File) n20Var.b;
        this.k1 = file;
        long j = n20Var.a;
        this.l1 = j;
        byte[] bArr2 = (byte[]) n20Var.c;
        String str = null;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr2.clone();
        }
        K0(file, j, bArr);
        if (this.C1 == 3) {
            this.L1 = n20Var;
            v20 v20Var = this.G1;
            if (v20Var != null) {
                v20Var.b.o();
                v20Var.h = true;
                this.G1 = null;
            }
            b0(false);
            l0(false);
            return;
        }
        ls6.d0(this.i1).D1(this.n1, this.o1, null);
        if (this.C1 == 1) {
            TLRPC.TL_document tL_document2 = this.g1;
            String absolutePath = file.getAbsolutePath();
            long j2 = this.n1;
            r47 r47Var = this.r1;
            r47 r47Var2 = this.s1;
            boolean z = this.D1;
            int i2 = this.E1;
            if (this.F1) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            p7a f = p7a.f(tL_document2, null, absolutePath, j2, r47Var, r47Var2, null, null, null, null, z, i2, 0, i, null, null, false);
            f.R = this.p1;
            f.T = this.q1;
            f.H = this.t1;
            f.K = this.u1;
            f.Q = 0L;
            r7a.B(this.i1).q0(f);
        }
        jn7 f3 = jn7.f(this.i1);
        Integer valueOf = Integer.valueOf(this.h1);
        if (this.C1 == 2) {
            TLRPC.TL_document tL_document3 = this.g1;
            str = file.getAbsolutePath();
            tL_document = tL_document3;
        } else {
            tL_document = null;
        }
        f3.k(jn7.s2, valueOf, tL_document, str);
        u(true);
    }

    public final void p0() {
        float f;
        try {
            if (this.Y != 1) {
                f = 1.0f;
            } else {
                f = 0.2f;
            }
            kfc kfcVar = this.j0;
            float f3 = 0.0f;
            if (kfcVar != null) {
                if (!go.w()) {
                    f3 = f * this.Q1;
                }
                kfcVar.A0(f3);
                return;
            }
            kfc kfcVar2 = this.F0;
            if (kfcVar2 != null) {
                if (go.w()) {
                    f = 0.0f;
                }
                kfcVar2.A0(f);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final boolean q0(ArrayList arrayList, r47 r47Var, long j, boolean z, oo6 oo6Var, long j2) {
        HashMap hashMap;
        r47 r47Var2 = this.v0;
        ArrayList arrayList2 = this.S0;
        if (r47Var2 == r47Var) {
            int indexOf = arrayList2.indexOf(r47Var);
            if (indexOf >= 0) {
                this.V0 = indexOf;
            }
            return V(r47Var);
        }
        this.W0 = !z;
        this.Z0 = j;
        this.C0 = !arrayList2.isEmpty();
        n();
        this.D0 = oo6Var;
        this.b1 = j2;
        boolean z2 = false;
        if (!arrayList.isEmpty() && wf3.B(r47.B0(((r47) arrayList.get(0)).k))) {
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
            r47 r47Var3 = (r47) arrayList.get(size);
            if (r47Var3.I3()) {
                int e1 = r47Var3.e1();
                if (e1 > 0 || z2) {
                    i = Math.min(i, e1);
                    i2 = Math.max(i2, e1);
                }
                arrayList2.add(r47Var3);
                hashMap.put(Integer.valueOf(e1), r47Var3);
            }
            size--;
        }
        x0();
        int indexOf2 = arrayList2.indexOf(r47Var);
        this.V0 = indexOf2;
        if (indexOf2 == -1) {
            n();
            this.V0 = arrayList2.size();
            arrayList2.add(r47Var);
            hashMap.put(Integer.valueOf(r47Var.e1()), r47Var);
        }
        if (r47Var.I3() && !r47Var.r1) {
            if (xea.J0) {
                b();
            }
            if (z) {
                if (this.D0 == null) {
                    final ls6 d0 = ls6.d0(r47Var.K1);
                    final long B0 = r47.B0(r47Var.k);
                    final long j3 = this.b1;
                    final long j4 = i;
                    final long j5 = i2;
                    d0.getMessagesStorage().a.c(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.rr6.run():void");
                        }
                    });
                } else {
                    this.a1 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return V(r47Var);
    }

    public final void r0(boolean z) {
        xl4 xl4Var;
        float f;
        float f3;
        io9 io9Var = this.I0;
        if (io9Var != null && (xl4Var = io9Var.a.e) != null && xl4Var.P != z && xl4Var.j != null) {
            xl4Var.P = z;
            if (z) {
                xl4Var.d();
            }
            AnimatorSet animatorSet = xl4Var.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            xl4Var.Q = animatorSet2;
            animatorSet2.setDuration(150L);
            xl4Var.Q.setInterpolator(k43.f);
            AnimatorSet animatorSet3 = xl4Var.Q;
            wl4 wl4Var = xl4Var.j;
            Property property = View.ALPHA;
            float f4 = 1.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wl4Var, property, f);
            wl4 wl4Var2 = xl4Var.j;
            Property property2 = View.SCALE_X;
            if (z) {
                f3 = 0.8f;
            } else {
                f3 = 1.0f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wl4Var2, property2, f3);
            wl4 wl4Var3 = xl4Var.j;
            Property property3 = View.SCALE_Y;
            if (z) {
                f4 = 0.8f;
            }
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(wl4Var3, property3, f4));
            xl4Var.Q.start();
        }
    }

    public final void s0(TextureView textureView, jx jxVar, FrameLayout frameLayout, boolean z) {
        boolean z2;
        if (textureView != null) {
            if (!z && this.H0 == textureView) {
                if (this.F0 != null && this.I0 == null) {
                    w0(w());
                }
                E();
                this.H0 = null;
                this.M0 = null;
                this.O0 = null;
            } else if (this.F0 != null && textureView != this.H0) {
                E();
                if (jxVar != null && jxVar.d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.N0 = z2;
                this.H0 = textureView;
                if (this.I0 == null) {
                    this.F0.z0(textureView);
                }
                this.M0 = jxVar;
                this.O0 = frameLayout;
                if (this.Q0 && jxVar != null) {
                    jxVar.a(this.P0, 0);
                }
            }
        }
    }

    public final void t0() {
        this.M = true;
        AudioManager audioManager = ip7.p0;
        audioManager.setBluetoothScoOn(false);
        audioManager.setSpeakerphoneOn(false);
    }

    public final void u(boolean z) {
        File file;
        b0(false);
        l0(false);
        v20 v20Var = this.G1;
        if (v20Var != null) {
            v20Var.b.o();
            v20Var.h = true;
            this.G1 = null;
        }
        if (!z && (file = this.k1) != null) {
            u60.b(file);
            this.k1.delete();
        }
        c0();
        this.y0 = false;
        this.r = false;
        this.P = false;
    }

    public final void u0(ArrayList arrayList, boolean z) {
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
                r47 r47Var = (r47) this.f0.get(i);
                this.g0.put(r47Var.e1(), r47Var);
            }
        }
    }

    public final Bitmap w() {
        jx jxVar;
        if (this.H0 != null && (jxVar = this.M0) != null && jxVar.getParent() != null && this.H0.isAvailable()) {
            try {
                return this.H0.getBitmap();
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        return null;
    }

    public final void w0(Bitmap bitmap) {
        if (this.F0 != null) {
            io9 io9Var = this.I0;
            if (io9Var == null) {
                if (this.K0 == null) {
                    return;
                }
                io9 io9Var2 = new io9();
                this.I0 = io9Var2;
                try {
                    io9Var2.b = io9Var2.a.i(this.K0, bitmap, true);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                if (io9Var2.b == null) {
                    this.I0 = null;
                    io9Var2.a();
                    return;
                }
            } else {
                io9Var.a.e();
            }
            E();
            this.F0.z0(this.I0.b);
        }
    }

    public final defpackage.qh2 x() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaController.x():qh2");
    }

    public final void x0() {
        Collections.sort(this.S0, new vk6((byte) 1));
    }

    public final void y0(boolean z) {
        boolean z2;
        r47 r47Var = this.v0;
        if (r47Var != null) {
            int i = 0;
            jn7.f(r47Var.K1).k(jn7.u2, Boolean.valueOf(this.M));
            kfc kfcVar = this.F0;
            if (kfcVar != null) {
                if (!this.M) {
                    i = 3;
                }
                kfcVar.w0(i);
                if (!z) {
                    if (this.F0.S() < 1000) {
                        this.F0.o0(0L);
                    }
                    this.F0.g0();
                    return;
                }
                U(this.v0, true);
                return;
            }
            kfc kfcVar2 = this.j0;
            if (kfcVar2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            r47 r47Var2 = this.v0;
            float f = r47Var2.b0;
            int i2 = r47Var2.j0;
            if (!z && kfcVar2 != null && kfcVar2.c0() && i2 * f <= 1.0f) {
                r47Var2.b0 = 0.0f;
            } else {
                r47Var2.b0 = f;
            }
            m(false, true, false, false);
            V(r47Var2);
            if (z) {
                if (z2) {
                    hl.d3(new mn6(this, r47Var2, (byte) 1), 100L);
                } else {
                    U(r47Var2, true);
                }
            }
        }
    }

    public final void z0(r47 r47Var) {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            r47Var.S0();
            Timer timer2 = new Timer();
            this.z0 = timer2;
            timer2.schedule(new iy2(this, r47Var, (byte) 2), 0L, 17L);
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
