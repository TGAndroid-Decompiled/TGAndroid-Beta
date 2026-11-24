package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class akb implements gk7 {
    public int E;
    public int F;
    public TLRPC.TL_theme G;
    public boolean H;
    public String I;
    public String J;
    public TLRPC.InputFile K;
    public TLRPC.InputFile L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public byte W;
    public int X;
    public int Y;
    public int Z;
    public String a;
    public int a0;
    public String b;
    public SparseArray b0;
    public String c;
    public ArrayList c0;
    public String d;
    public LongSparseArray d0;
    public String e;
    public final LongSparseArray e0;
    public boolean f;
    public int f0;
    public int g0;
    public boolean h;
    public String h0;
    public String i0;
    public vjb j0;
    public int k0;
    public boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public akb(akb akbVar) {
        this.y = 45;
        this.H = true;
        this.V = true;
        this.a0 = -1;
        this.e0 = new LongSparseArray();
        this.f0 = 0;
        this.g0 = 100;
        this.k0 = -1;
        this.a = akbVar.a;
        this.b = akbVar.b;
        this.c = akbVar.c;
        this.d = akbVar.d;
        this.e = akbVar.e;
        this.f = akbVar.f;
        this.h = akbVar.h;
        this.n = akbVar.n;
        this.r = akbVar.r;
        this.s = akbVar.s;
        this.w = akbVar.w;
        this.x = akbVar.x;
        this.y = akbVar.y;
        this.E = akbVar.E;
        this.F = akbVar.F;
        this.G = akbVar.G;
        this.H = akbVar.H;
        this.I = akbVar.I;
        this.J = akbVar.J;
        this.K = akbVar.K;
        this.L = akbVar.L;
        this.M = akbVar.M;
        this.N = akbVar.N;
        this.O = akbVar.O;
        this.P = akbVar.P;
        this.Q = akbVar.Q;
        this.R = akbVar.R;
        this.S = akbVar.S;
        this.T = akbVar.T;
        this.U = akbVar.U;
        this.V = akbVar.V;
        this.W = akbVar.W;
        this.X = akbVar.X;
        this.Y = akbVar.Y;
        this.Z = akbVar.Z;
        this.a0 = akbVar.a0;
        this.b0 = akbVar.b0;
        this.c0 = akbVar.c0;
        this.d0 = akbVar.d0;
        this.g0 = akbVar.g0;
        this.h0 = akbVar.h0;
        this.i0 = akbVar.i0;
        this.j0 = akbVar.j0;
    }

    public static boolean a(zjb zjbVar, TLRPC.ThemeSettings themeSettings) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        long j;
        long j2;
        long j3;
        int i5;
        int i6;
        String str;
        float f;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (themeSettings.message_colors.size() > 0) {
            i = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i = 0;
        }
        if (themeSettings.message_colors.size() > 1) {
            i2 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i2 = 0;
        }
        if (i == i2) {
            i2 = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i3 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i3 = 0;
        }
        if (themeSettings.message_colors.size() > 3) {
            i4 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i4 = 0;
        }
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            i5 = bkb.Y0(wallPaperSettings.background_color);
            int i7 = themeSettings.wallpaper.settings.second_background_color;
            j3 = 4294967296L;
            if (i7 == 0) {
                j = 4294967296L;
            } else {
                j = bkb.Y0(i7);
            }
            int i8 = themeSettings.wallpaper.settings.third_background_color;
            if (i8 == 0) {
                j2 = 4294967296L;
            } else {
                j2 = bkb.Y0(i8);
            }
            int i9 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i9 != 0) {
                j3 = bkb.Y0(i9);
            }
            i6 = gl.q1(themeSettings.wallpaper.settings.rotation, false);
            z = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z2 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f = wallPaper2.settings.intensity / 100.0f;
                long j4 = j2;
                if (themeSettings.accent_color != zjbVar.c && themeSettings.outbox_accent_color == zjbVar.d && i == zjbVar.e && i2 == zjbVar.f && i3 == zjbVar.g && i4 == zjbVar.h && themeSettings.message_colors_animated == zjbVar.i && i5 == zjbVar.j && j == zjbVar.k && j4 == zjbVar.l && j3 == zjbVar.m && i6 == zjbVar.n && TextUtils.equals(str, zjbVar.o) && Math.abs(f - zjbVar.p) < 0.001d) {
                    return z2;
                }
                return z;
            }
        } else {
            z = false;
            z2 = true;
            j = 0;
            j2 = 0;
            j3 = 0;
            i5 = 0;
            i6 = 0;
        }
        str = null;
        f = 0.0f;
        long j42 = j2;
        if (themeSettings.accent_color != zjbVar.c) {
        }
        return z;
    }

    public static akb e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            akb akbVar = new akb();
            akbVar.a = jSONObject.getString("name");
            akbVar.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                akbVar.F = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                akbVar.G = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                akbVar.H = jSONObject.getBoolean("loaded");
            }
            return akbVar;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static akb f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        akb akbVar = new akb();
        akbVar.a = split[0];
        akbVar.b = split[1];
        return akbVar;
    }

    public static void g(zjb zjbVar, TLRPC.ThemeSettings themeSettings) {
        int i;
        int i2;
        int i3;
        int i4;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i5;
        zjbVar.c = themeSettings.accent_color;
        zjbVar.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i = 0;
        }
        zjbVar.e = i;
        if (themeSettings.message_colors.size() > 1) {
            i2 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i2 = 0;
        }
        zjbVar.f = i2;
        if (zjbVar.e == i2) {
            zjbVar.f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i3 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i3 = 0;
        }
        zjbVar.g = i3;
        if (themeSettings.message_colors.size() > 3) {
            i4 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i4 = 0;
        }
        zjbVar.h = i4;
        zjbVar.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                zjbVar.j = 4294967296L;
            } else {
                zjbVar.j = bkb.Y0(i5);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                zjbVar.k = 4294967296L;
            } else {
                zjbVar.k = bkb.Y0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                zjbVar.l = 4294967296L;
            } else {
                zjbVar.l = bkb.Y0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                zjbVar.m = 4294967296L;
            } else {
                zjbVar.m = bkb.Y0(wallPaperSettings4.fourth_background_color);
            }
            zjbVar.n = gl.q1(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                zjbVar.o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                zjbVar.p = wallPaperSettings5.intensity / 100.0f;
                zjbVar.q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean b(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int U0;
        try {
            Bitmap d1 = gl.d1(gl.L(640.0f), gl.L(360.0f), file.getAbsolutePath(), null, 0);
            if (d1 != null && this.r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(d1.getWidth(), d1.getHeight(), d1.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i = this.w;
                if (i != 0) {
                    U0 = ye7.g(this.r, this.s, i, this.x);
                } else {
                    int i2 = this.s;
                    int i3 = this.r;
                    if (i2 != 0) {
                        U0 = gl.w0(i3, i2);
                        GradientDrawable gradientDrawable = new GradientDrawable(wd0.c(this.y), new int[]{this.r, this.s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        U0 = gl.U0(i3, false);
                        canvas.drawColor(this.r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(U0, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.E / 100.0f) * 255.0f));
                canvas.drawBitmap(d1, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                d1 = createBitmap;
            }
            if (this.h) {
                d1 = Utilities.e(d1);
            }
            if (this.w != 0) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            return sqc.c(d1, compressFormat, new File(str));
        } catch (Throwable th) {
            fa4.g(th, true);
            return false;
        }
    }

    public final zjb c(long j, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i, boolean z) {
        if (z) {
            LongSparseArray longSparseArray = this.e0;
            zjb zjbVar = (zjb) longSparseArray.get(j);
            if (zjbVar != null) {
                return zjbVar;
            }
            int i2 = this.f0 + 1;
            this.f0 = i2;
            zjb zjbVar2 = new zjb();
            g(zjbVar2, themeSettings);
            zjbVar2.b = this;
            zjbVar2.a = i2;
            zjbVar2.r = tL_theme;
            zjbVar2.t = i;
            longSparseArray.put(i2, zjbVar2);
            return zjbVar2;
        }
        zjb zjbVar3 = (zjb) this.d0.get(j);
        if (zjbVar3 != null) {
            return zjbVar3;
        }
        int i3 = this.g0 + 1;
        this.g0 = i3;
        zjb zjbVar4 = new zjb();
        g(zjbVar4, themeSettings);
        zjbVar4.b = this;
        zjbVar4.a = i3;
        zjbVar4.r = tL_theme;
        zjbVar4.t = i;
        this.b0.put(i3, zjbVar4);
        this.c0.add(0, zjbVar4);
        bkb.H1(this);
        this.d0.put(j, zjbVar4);
        return zjbVar4;
    }

    public final zjb d(TLRPC.TL_theme tL_theme, int i, int i2) {
        TLRPC.ThemeSettings themeSettings = null;
        if (tL_theme == null) {
            return null;
        }
        if (i2 < tL_theme.settings.size()) {
            themeSettings = tL_theme.settings.get(i2);
        }
        return c(tL_theme.id, themeSettings, tL_theme, i, false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.X1;
        if (i == i3 || i == kk7.Y1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.G;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.h0)) {
                    this.h0 = null;
                    Utilities.e.c(new a5b(this, (File) objArr[1], (byte) 6));
                } else if (str.equals(ba4.r(null, this.G.document))) {
                    s();
                    if (i == i3) {
                        File file = new File(this.b);
                        TLRPC.TL_theme tL_theme2 = this.G;
                        akb k0 = bkb.k0(file, tL_theme2.title, tL_theme2);
                        if (k0 != null && k0.c != null && !new File(k0.c).exists()) {
                            this.r = k0.r;
                            this.s = k0.s;
                            this.w = k0.w;
                            this.x = k0.x;
                            this.y = k0.y;
                            this.h = k0.h;
                            this.E = k0.E;
                            this.i0 = k0.c;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = k0.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(k0.F).sendRequest(getwallpaper, new apa(this, k0, (byte) 12));
                            return;
                        }
                        r();
                    }
                }
            }
        }
    }

    public final String h(zjb zjbVar, boolean z) {
        String o;
        String l;
        if (zjbVar == null) {
            zjbVar = i(false);
        }
        if (zjbVar != null) {
            String str = this.a;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                l = de9.l(sb, zjbVar.a, "_wp_o");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("_");
                l = de9.l(sb2, zjbVar.a, "_wp");
            }
            return l + Utilities.b.nextInt() + ".jpg";
        }
        String str2 = this.a;
        if (z) {
            o = tb4.o(str2, "_wp_o");
        } else {
            o = tb4.o(str2, "_wp");
        }
        return o + Utilities.b.nextInt() + ".jpg";
    }

    public final zjb i(boolean z) {
        zjb zjbVar;
        if (this.c0 == null || (zjbVar = (zjb) this.b0.get(this.Z)) == null) {
            return null;
        }
        if (z) {
            int i = this.g0 + 1;
            this.g0 = i;
            zjb zjbVar2 = new zjb();
            zjbVar2.c = zjbVar.c;
            zjbVar2.d = zjbVar.d;
            zjbVar2.e = zjbVar.e;
            zjbVar2.f = zjbVar.f;
            zjbVar2.g = zjbVar.g;
            zjbVar2.h = zjbVar.h;
            zjbVar2.i = zjbVar.i;
            zjbVar2.j = zjbVar.j;
            zjbVar2.k = zjbVar.k;
            zjbVar2.l = zjbVar.l;
            zjbVar2.m = zjbVar.m;
            zjbVar2.n = zjbVar.n;
            zjbVar2.o = zjbVar.o;
            zjbVar2.p = zjbVar.p;
            zjbVar2.q = zjbVar.q;
            zjbVar2.b = this;
            vjb vjbVar = this.j0;
            if (vjbVar != null) {
                ?? obj = new Object();
                obj.a = "";
                obj.b = "";
                obj.c = "";
                obj.c = vjbVar.c;
                obj.d = vjbVar.d;
                obj.e = vjbVar.e;
                obj.f = vjbVar.f;
                obj.g = vjbVar.g;
                obj.h = vjbVar.h;
                obj.i = vjbVar.i;
                obj.j = vjbVar.j;
                obj.k = vjbVar.k;
                obj.p = this;
                obj.q = zjbVar2;
                if (!TextUtils.isEmpty(vjbVar.a)) {
                    try {
                        File e = sqc.e(vjbVar.a);
                        String h = obj.p.h(obj.q, false);
                        obj.a = h;
                        sqc.a(e, sqc.e(h));
                    } catch (Exception e2) {
                        obj.a = "";
                        fa4.g(e2, true);
                    }
                } else {
                    obj.a = "";
                }
                if (!TextUtils.isEmpty(vjbVar.b)) {
                    if (!vjbVar.b.equals(vjbVar.a)) {
                        try {
                            File e3 = sqc.e(vjbVar.b);
                            String h2 = obj.p.h(obj.q, true);
                            obj.b = h2;
                            sqc.a(e3, sqc.e(h2));
                        } catch (Exception e4) {
                            obj.b = "";
                            fa4.g(e4, true);
                        }
                    } else {
                        obj.b = obj.a;
                    }
                } else {
                    obj.b = "";
                }
                zjbVar2.y = obj;
            }
            this.a0 = this.Z;
            zjbVar2.a = i;
            this.Z = i;
            this.j0 = zjbVar2.y;
            this.b0.put(i, zjbVar2);
            this.c0.add(0, zjbVar2);
            bkb.H1(this);
            return zjbVar2;
        }
        return zjbVar;
    }

    public final int j(int i) {
        zjb zjbVar = (zjb) this.b0.get(i);
        if (zjbVar != null) {
            return zjbVar.c;
        }
        return 0;
    }

    public final String k() {
        if (this.G != null) {
            return "remote" + this.G.id;
        }
        return this.a;
    }

    public final String l() {
        if ("Blue".equals(this.a)) {
            return k96.M0(2131743945, null);
        }
        if ("Dark Blue".equals(this.a)) {
            return k96.M0(2131743942, null);
        }
        if ("Arctic Blue".equals(this.a)) {
            return k96.M0(2131743946, null);
        }
        if ("Day".equals(this.a)) {
            return k96.M0(2131743941, null);
        }
        if ("Night".equals(this.a)) {
            return k96.M0(2131743934, null);
        }
        TLRPC.TL_theme tL_theme = this.G;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.a;
    }

    public final int m() {
        if (this.T && this.Z == bkb.n) {
            return -3155485;
        }
        return this.M;
    }

    public final int n() {
        if (this.T && this.Z == bkb.n) {
            return -983328;
        }
        return this.S;
    }

    public final boolean o() {
        int i = this.k0;
        if (i != -1) {
            if (i != 1) {
                return false;
            }
            return true;
        }
        if (!"Dark Blue".equals(this.a) && !"Night".equals(this.a)) {
            if ("Blue".equals(this.a) || "Arctic Blue".equals(this.a) || "Day".equals(this.a)) {
                this.k0 = 0;
            }
        } else {
            this.k0 = 1;
        }
        if (this.k0 == -1) {
            bkb.G(bkb.R0(new File(this.b), null, new String[1]), this);
        }
        if (this.k0 != 1) {
            return false;
        }
        return true;
    }

    public final void p(SharedPreferences sharedPreferences, zjb zjbVar, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                vjb vjbVar = new vjb();
                vjbVar.a = jSONObject.getString("wall");
                vjbVar.b = jSONObject.getString("owall");
                vjbVar.d = jSONObject.getInt("pColor");
                vjbVar.e = jSONObject.getInt("pGrColor");
                vjbVar.f = jSONObject.optInt("pGrColor2");
                vjbVar.g = jSONObject.optInt("pGrColor3");
                vjbVar.h = jSONObject.getInt("pGrAngle");
                vjbVar.c = jSONObject.getString("wallSlug");
                vjbVar.i = jSONObject.getBoolean("wBlur");
                vjbVar.j = jSONObject.getBoolean("wMotion");
                vjbVar.k = (float) jSONObject.getDouble("pIntensity");
                vjbVar.p = this;
                vjbVar.q = zjbVar;
                if (zjbVar != null) {
                    zjbVar.y = vjbVar;
                } else {
                    this.j0 = vjbVar;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    vjbVar.c = "d";
                }
            }
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    public final void q(SharedPreferences sharedPreferences) {
        ArrayList arrayList = this.c0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.c0.size();
            for (int i = 0; i < size; i++) {
                zjb zjbVar = (zjb) this.c0.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append("_");
                p(sharedPreferences, zjbVar, de9.l(sb, zjbVar.a, "_owp"));
            }
            return;
        }
        p(sharedPreferences, null, b00.j(new StringBuilder(), this.a, "_owp"));
    }

    public final void r() {
        boolean z = true;
        this.H = true;
        this.U = false;
        bkb.w1(true, false);
        if (this == bkb.I && bkb.M == null) {
            if (this != bkb.J) {
                z = false;
            }
            bkb.I1(this, z, -1, null);
        }
    }

    public final void s() {
        kk7.f(this.F).n(this, kk7.X1);
        kk7.f(this.F).n(this, kk7.Y1);
    }

    public final void t(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        this.X = iArr.length;
        this.c0 = new ArrayList();
        this.b0 = new SparseArray();
        this.d0 = new LongSparseArray();
        for (int i = 0; i < iArr.length; i++) {
            zjb zjbVar = new zjb();
            zjbVar.a = iArr8[i];
            if (bkb.j1(zjbVar)) {
                zjbVar.z = true;
            }
            zjbVar.c = iArr[i];
            zjbVar.b = this;
            zjbVar.e = iArr2[i];
            zjbVar.f = iArr3[i];
            long j = iArr4[i];
            zjbVar.j = j;
            boolean z = this.T;
            if (z && zjbVar.a == bkb.n) {
                zjbVar.j = 4294967296L;
            } else {
                zjbVar.j = j;
            }
            if (z && zjbVar.a == bkb.n) {
                zjbVar.k = 4294967296L;
            } else {
                zjbVar.k = iArr5[i];
            }
            if (iArr6 != null) {
                if (z && zjbVar.a == bkb.n) {
                    zjbVar.l = 4294967296L;
                } else {
                    zjbVar.l = iArr6[i];
                }
            }
            if (iArr7 != null) {
                if (z && zjbVar.a == bkb.n) {
                    zjbVar.m = 4294967296L;
                } else {
                    zjbVar.m = iArr7[i];
                }
            }
            zjbVar.p = iArr10[i] / 100.0f;
            zjbVar.n = iArr9[i];
            zjbVar.o = strArr[i];
            if ((bkb.j1(zjbVar) && this.a.equals("Dark Blue")) || this.a.equals("Night")) {
                zjbVar.e = -14316059;
                zjbVar.f = -12422433;
                zjbVar.g = -8304937;
                zjbVar.h = -6340950;
                if (this.a.equals("Night")) {
                    zjbVar.p = -0.57f;
                    zjbVar.j = -9666650L;
                    zjbVar.k = -13749173L;
                    zjbVar.l = -8883033L;
                    zjbVar.m = -13421992L;
                }
            }
            this.b0.put(zjbVar.a, zjbVar);
            this.c0.add(zjbVar);
        }
        this.Y = ((zjb) this.b0.get(0)).c;
    }

    public final void u(int i) {
        this.Z = i;
        zjb i2 = i(false);
        if (i2 != null) {
            this.j0 = i2.y;
        }
    }

    public final void v(vjb vjbVar) {
        if (this.j0 != vjbVar) {
            zjb i = i(false);
            vjb vjbVar2 = this.j0;
            if (vjbVar2 != null) {
                vjbVar2.a();
            }
            if (vjbVar != null) {
                vjbVar.q = i;
                vjbVar.p = this;
                vjbVar.c();
            }
            this.j0 = vjbVar;
            if (i != null) {
                i.y = vjbVar;
            }
        }
    }

    public akb() {
        this.y = 45;
        this.H = true;
        this.V = true;
        this.a0 = -1;
        this.e0 = new LongSparseArray();
        this.f0 = 0;
        this.g0 = 100;
        this.k0 = -1;
    }
}
