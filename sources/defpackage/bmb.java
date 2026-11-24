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
public final class bmb implements jm7 {
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
    public xlb j0;
    public int k0;
    public boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public bmb(bmb bmbVar) {
        this.y = 45;
        this.H = true;
        this.V = true;
        this.a0 = -1;
        this.e0 = new LongSparseArray();
        this.f0 = 0;
        this.g0 = 100;
        this.k0 = -1;
        this.a = bmbVar.a;
        this.b = bmbVar.b;
        this.c = bmbVar.c;
        this.d = bmbVar.d;
        this.e = bmbVar.e;
        this.f = bmbVar.f;
        this.h = bmbVar.h;
        this.n = bmbVar.n;
        this.r = bmbVar.r;
        this.s = bmbVar.s;
        this.w = bmbVar.w;
        this.x = bmbVar.x;
        this.y = bmbVar.y;
        this.E = bmbVar.E;
        this.F = bmbVar.F;
        this.G = bmbVar.G;
        this.H = bmbVar.H;
        this.I = bmbVar.I;
        this.J = bmbVar.J;
        this.K = bmbVar.K;
        this.L = bmbVar.L;
        this.M = bmbVar.M;
        this.N = bmbVar.N;
        this.O = bmbVar.O;
        this.P = bmbVar.P;
        this.Q = bmbVar.Q;
        this.R = bmbVar.R;
        this.S = bmbVar.S;
        this.T = bmbVar.T;
        this.U = bmbVar.U;
        this.V = bmbVar.V;
        this.W = bmbVar.W;
        this.X = bmbVar.X;
        this.Y = bmbVar.Y;
        this.Z = bmbVar.Z;
        this.a0 = bmbVar.a0;
        this.b0 = bmbVar.b0;
        this.c0 = bmbVar.c0;
        this.d0 = bmbVar.d0;
        this.g0 = bmbVar.g0;
        this.h0 = bmbVar.h0;
        this.i0 = bmbVar.i0;
        this.j0 = bmbVar.j0;
    }

    public static boolean a(amb ambVar, TLRPC.ThemeSettings themeSettings) {
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
            i5 = cmb.Y0(wallPaperSettings.background_color);
            int i7 = themeSettings.wallpaper.settings.second_background_color;
            j3 = 4294967296L;
            if (i7 == 0) {
                j = 4294967296L;
            } else {
                j = cmb.Y0(i7);
            }
            int i8 = themeSettings.wallpaper.settings.third_background_color;
            if (i8 == 0) {
                j2 = 4294967296L;
            } else {
                j2 = cmb.Y0(i8);
            }
            int i9 = themeSettings.wallpaper.settings.fourth_background_color;
            if (i9 != 0) {
                j3 = cmb.Y0(i9);
            }
            i6 = gm.q1(themeSettings.wallpaper.settings.rotation, false);
            z = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z2 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f = wallPaper2.settings.intensity / 100.0f;
                long j4 = j2;
                if (themeSettings.accent_color != ambVar.c && themeSettings.outbox_accent_color == ambVar.d && i == ambVar.e && i2 == ambVar.f && i3 == ambVar.g && i4 == ambVar.h && themeSettings.message_colors_animated == ambVar.i && i5 == ambVar.j && j == ambVar.k && j4 == ambVar.l && j3 == ambVar.m && i6 == ambVar.n && TextUtils.equals(str, ambVar.o) && Math.abs(f - ambVar.p) < 0.001d) {
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
        if (themeSettings.accent_color != ambVar.c) {
        }
        return z;
    }

    public static bmb e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            bmb bmbVar = new bmb();
            bmbVar.a = jSONObject.getString("name");
            bmbVar.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                bmbVar.F = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                bmbVar.G = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            }
            if (jSONObject.has("loaded")) {
                bmbVar.H = jSONObject.getBoolean("loaded");
            }
            return bmbVar;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static bmb f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        bmb bmbVar = new bmb();
        bmbVar.a = split[0];
        bmbVar.b = split[1];
        return bmbVar;
    }

    public static void g(amb ambVar, TLRPC.ThemeSettings themeSettings) {
        int i;
        int i2;
        int i3;
        int i4;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i5;
        ambVar.c = themeSettings.accent_color;
        ambVar.d = themeSettings.outbox_accent_color;
        if (themeSettings.message_colors.size() > 0) {
            i = themeSettings.message_colors.get(0).intValue() | (-16777216);
        } else {
            i = 0;
        }
        ambVar.e = i;
        if (themeSettings.message_colors.size() > 1) {
            i2 = themeSettings.message_colors.get(1).intValue() | (-16777216);
        } else {
            i2 = 0;
        }
        ambVar.f = i2;
        if (ambVar.e == i2) {
            ambVar.f = 0;
        }
        if (themeSettings.message_colors.size() > 2) {
            i3 = themeSettings.message_colors.get(2).intValue() | (-16777216);
        } else {
            i3 = 0;
        }
        ambVar.g = i3;
        if (themeSettings.message_colors.size() > 3) {
            i4 = themeSettings.message_colors.get(3).intValue() | (-16777216);
        } else {
            i4 = 0;
        }
        ambVar.h = i4;
        ambVar.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
            if (wallPaperSettings.background_color == 0) {
                ambVar.j = 4294967296L;
            } else {
                ambVar.j = cmb.Y0(i5);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                ambVar.k = 4294967296L;
            } else {
                ambVar.k = cmb.Y0(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                ambVar.l = 4294967296L;
            } else {
                ambVar.l = cmb.Y0(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                ambVar.m = 4294967296L;
            } else {
                ambVar.m = cmb.Y0(wallPaperSettings4.fourth_background_color);
            }
            ambVar.n = gm.q1(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                ambVar.o = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
                ambVar.p = wallPaperSettings5.intensity / 100.0f;
                ambVar.q = wallPaperSettings5.motion;
            }
        }
    }

    public final boolean b(File file, String str) {
        Bitmap.CompressFormat compressFormat;
        int U0;
        try {
            Bitmap d1 = gm.d1(gm.L(640.0f), gm.L(360.0f), file.getAbsolutePath(), null, 0);
            if (d1 != null && this.r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(d1.getWidth(), d1.getHeight(), d1.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i = this.w;
                if (i != 0) {
                    U0 = ah7.g(this.r, this.s, i, this.x);
                } else {
                    int i2 = this.s;
                    int i3 = this.r;
                    if (i2 != 0) {
                        U0 = gm.w0(i3, i2);
                        GradientDrawable gradientDrawable = new GradientDrawable(we0.c(this.y), new int[]{this.r, this.s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        U0 = gm.U0(i3, false);
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
            return usc.c(d1, compressFormat, new File(str));
        } catch (Throwable th) {
            fc4.g(th, true);
            return false;
        }
    }

    public final amb c(long j, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i, boolean z) {
        if (z) {
            LongSparseArray longSparseArray = this.e0;
            amb ambVar = (amb) longSparseArray.get(j);
            if (ambVar != null) {
                return ambVar;
            }
            int i2 = this.f0 + 1;
            this.f0 = i2;
            amb ambVar2 = new amb();
            g(ambVar2, themeSettings);
            ambVar2.b = this;
            ambVar2.a = i2;
            ambVar2.r = tL_theme;
            ambVar2.t = i;
            longSparseArray.put(i2, ambVar2);
            return ambVar2;
        }
        amb ambVar3 = (amb) this.d0.get(j);
        if (ambVar3 != null) {
            return ambVar3;
        }
        int i3 = this.g0 + 1;
        this.g0 = i3;
        amb ambVar4 = new amb();
        g(ambVar4, themeSettings);
        ambVar4.b = this;
        ambVar4.a = i3;
        ambVar4.r = tL_theme;
        ambVar4.t = i;
        this.b0.put(i3, ambVar4);
        this.c0.add(0, ambVar4);
        cmb.H1(this);
        this.d0.put(j, ambVar4);
        return ambVar4;
    }

    public final amb d(TLRPC.TL_theme tL_theme, int i, int i2) {
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
        int i3 = nm7.Y1;
        if (i == i3 || i == nm7.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.G;
            if (tL_theme != null && tL_theme.document != null) {
                if (str.equals(this.h0)) {
                    this.h0 = null;
                    Utilities.e.c(new b7b(this, (File) objArr[1], (byte) 8));
                } else if (str.equals(bc4.r(null, this.G.document))) {
                    s();
                    if (i == i3) {
                        File file = new File(this.b);
                        TLRPC.TL_theme tL_theme2 = this.G;
                        bmb k0 = cmb.k0(file, tL_theme2.title, tL_theme2);
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
                            ConnectionsManager.getInstance(k0.F).sendRequest(getwallpaper, new ara(this, k0, (byte) 12));
                            return;
                        }
                        r();
                    }
                }
            }
        }
    }

    public final String h(amb ambVar, boolean z) {
        String p;
        String k;
        if (ambVar == null) {
            ambVar = i(false);
        }
        if (ambVar != null) {
            String str = this.a;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                k = hg9.k(sb, ambVar.a, "_wp_o");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("_");
                k = hg9.k(sb2, ambVar.a, "_wp");
            }
            return k + Utilities.b.nextInt() + ".jpg";
        }
        String str2 = this.a;
        if (z) {
            p = td4.p(str2, "_wp_o");
        } else {
            p = td4.p(str2, "_wp");
        }
        return p + Utilities.b.nextInt() + ".jpg";
    }

    public final amb i(boolean z) {
        amb ambVar;
        if (this.c0 == null || (ambVar = (amb) this.b0.get(this.Z)) == null) {
            return null;
        }
        if (z) {
            int i = this.g0 + 1;
            this.g0 = i;
            amb ambVar2 = new amb();
            ambVar2.c = ambVar.c;
            ambVar2.d = ambVar.d;
            ambVar2.e = ambVar.e;
            ambVar2.f = ambVar.f;
            ambVar2.g = ambVar.g;
            ambVar2.h = ambVar.h;
            ambVar2.i = ambVar.i;
            ambVar2.j = ambVar.j;
            ambVar2.k = ambVar.k;
            ambVar2.l = ambVar.l;
            ambVar2.m = ambVar.m;
            ambVar2.n = ambVar.n;
            ambVar2.o = ambVar.o;
            ambVar2.p = ambVar.p;
            ambVar2.q = ambVar.q;
            ambVar2.b = this;
            xlb xlbVar = this.j0;
            if (xlbVar != null) {
                ?? obj = new Object();
                obj.a = "";
                obj.b = "";
                obj.c = "";
                obj.c = xlbVar.c;
                obj.d = xlbVar.d;
                obj.e = xlbVar.e;
                obj.f = xlbVar.f;
                obj.g = xlbVar.g;
                obj.h = xlbVar.h;
                obj.i = xlbVar.i;
                obj.j = xlbVar.j;
                obj.k = xlbVar.k;
                obj.p = this;
                obj.q = ambVar2;
                if (!TextUtils.isEmpty(xlbVar.a)) {
                    try {
                        File e = usc.e(xlbVar.a);
                        String h = obj.p.h(obj.q, false);
                        obj.a = h;
                        usc.a(e, usc.e(h));
                    } catch (Exception e2) {
                        obj.a = "";
                        fc4.g(e2, true);
                    }
                } else {
                    obj.a = "";
                }
                if (!TextUtils.isEmpty(xlbVar.b)) {
                    if (!xlbVar.b.equals(xlbVar.a)) {
                        try {
                            File e3 = usc.e(xlbVar.b);
                            String h2 = obj.p.h(obj.q, true);
                            obj.b = h2;
                            usc.a(e3, usc.e(h2));
                        } catch (Exception e4) {
                            obj.b = "";
                            fc4.g(e4, true);
                        }
                    } else {
                        obj.b = obj.a;
                    }
                } else {
                    obj.b = "";
                }
                ambVar2.y = obj;
            }
            this.a0 = this.Z;
            ambVar2.a = i;
            this.Z = i;
            this.j0 = ambVar2.y;
            this.b0.put(i, ambVar2);
            this.c0.add(0, ambVar2);
            cmb.H1(this);
            return ambVar2;
        }
        return ambVar;
    }

    public final int j(int i) {
        amb ambVar = (amb) this.b0.get(i);
        if (ambVar != null) {
            return ambVar.c;
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
            return jb6.M0(2131743871, null);
        }
        if ("Dark Blue".equals(this.a)) {
            return jb6.M0(2131743868, null);
        }
        if ("Arctic Blue".equals(this.a)) {
            return jb6.M0(2131743872, null);
        }
        if ("Day".equals(this.a)) {
            return jb6.M0(2131743867, null);
        }
        if ("Night".equals(this.a)) {
            return jb6.M0(2131743860, null);
        }
        TLRPC.TL_theme tL_theme = this.G;
        if (tL_theme != null) {
            return tL_theme.title;
        }
        return this.a;
    }

    public final int m() {
        if (this.T && this.Z == cmb.n) {
            return -3155485;
        }
        return this.M;
    }

    public final int n() {
        if (this.T && this.Z == cmb.n) {
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
            cmb.G(cmb.R0(new File(this.b), null, new String[1]), this);
        }
        if (this.k0 != 1) {
            return false;
        }
        return true;
    }

    public final void p(SharedPreferences sharedPreferences, amb ambVar, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                xlb xlbVar = new xlb();
                xlbVar.a = jSONObject.getString("wall");
                xlbVar.b = jSONObject.getString("owall");
                xlbVar.d = jSONObject.getInt("pColor");
                xlbVar.e = jSONObject.getInt("pGrColor");
                xlbVar.f = jSONObject.optInt("pGrColor2");
                xlbVar.g = jSONObject.optInt("pGrColor3");
                xlbVar.h = jSONObject.getInt("pGrAngle");
                xlbVar.c = jSONObject.getString("wallSlug");
                xlbVar.i = jSONObject.getBoolean("wBlur");
                xlbVar.j = jSONObject.getBoolean("wMotion");
                xlbVar.k = (float) jSONObject.getDouble("pIntensity");
                xlbVar.p = this;
                xlbVar.q = ambVar;
                if (ambVar != null) {
                    ambVar.y = xlbVar;
                } else {
                    this.j0 = xlbVar;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    xlbVar.c = "d";
                }
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    public final void q(SharedPreferences sharedPreferences) {
        ArrayList arrayList = this.c0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.c0.size();
            for (int i = 0; i < size; i++) {
                amb ambVar = (amb) this.c0.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append("_");
                p(sharedPreferences, ambVar, hg9.k(sb, ambVar.a, "_owp"));
            }
            return;
        }
        p(sharedPreferences, null, b10.j(new StringBuilder(), this.a, "_owp"));
    }

    public final void r() {
        boolean z = true;
        this.H = true;
        this.U = false;
        cmb.w1(true, false);
        if (this == cmb.I && cmb.M == null) {
            if (this != cmb.J) {
                z = false;
            }
            cmb.I1(this, z, -1, null);
        }
    }

    public final void s() {
        nm7.f(this.F).n(this, nm7.Y1);
        nm7.f(this.F).n(this, nm7.Z1);
    }

    public final void t(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        this.X = iArr.length;
        this.c0 = new ArrayList();
        this.b0 = new SparseArray();
        this.d0 = new LongSparseArray();
        for (int i = 0; i < iArr.length; i++) {
            amb ambVar = new amb();
            ambVar.a = iArr8[i];
            if (cmb.j1(ambVar)) {
                ambVar.z = true;
            }
            ambVar.c = iArr[i];
            ambVar.b = this;
            ambVar.e = iArr2[i];
            ambVar.f = iArr3[i];
            long j = iArr4[i];
            ambVar.j = j;
            boolean z = this.T;
            if (z && ambVar.a == cmb.n) {
                ambVar.j = 4294967296L;
            } else {
                ambVar.j = j;
            }
            if (z && ambVar.a == cmb.n) {
                ambVar.k = 4294967296L;
            } else {
                ambVar.k = iArr5[i];
            }
            if (iArr6 != null) {
                if (z && ambVar.a == cmb.n) {
                    ambVar.l = 4294967296L;
                } else {
                    ambVar.l = iArr6[i];
                }
            }
            if (iArr7 != null) {
                if (z && ambVar.a == cmb.n) {
                    ambVar.m = 4294967296L;
                } else {
                    ambVar.m = iArr7[i];
                }
            }
            ambVar.p = iArr10[i] / 100.0f;
            ambVar.n = iArr9[i];
            ambVar.o = strArr[i];
            if ((cmb.j1(ambVar) && this.a.equals("Dark Blue")) || this.a.equals("Night")) {
                ambVar.e = -14316059;
                ambVar.f = -12422433;
                ambVar.g = -8304937;
                ambVar.h = -6340950;
                if (this.a.equals("Night")) {
                    ambVar.p = -0.57f;
                    ambVar.j = -9666650L;
                    ambVar.k = -13749173L;
                    ambVar.l = -8883033L;
                    ambVar.m = -13421992L;
                }
            }
            this.b0.put(ambVar.a, ambVar);
            this.c0.add(ambVar);
        }
        this.Y = ((amb) this.b0.get(0)).c;
    }

    public final void u(int i) {
        this.Z = i;
        amb i2 = i(false);
        if (i2 != null) {
            this.j0 = i2.y;
        }
    }

    public final void v(xlb xlbVar) {
        if (this.j0 != xlbVar) {
            amb i = i(false);
            xlb xlbVar2 = this.j0;
            if (xlbVar2 != null) {
                xlbVar2.a();
            }
            if (xlbVar != null) {
                xlbVar.q = i;
                xlbVar.p = this;
                xlbVar.c();
            }
            this.j0 = xlbVar;
            if (i != null) {
                i.y = xlbVar;
            }
        }
    }

    public bmb() {
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
