package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class d32 extends p02 {
    public final c32 E;
    public final z12 F;
    public final r7 G;
    public final r7 H;
    public final tf4 I;
    public AnimatorSet J;
    public final pi4 K;
    public boolean L;
    public final q22 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public t22 R;
    public final HashMap S;
    public final ArrayList T;
    public final HashMap U;
    public boolean V;
    public int W;
    public boolean a0;
    public final boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public final zj f0;
    public ValueAnimator g0;
    public byte n;
    public final r22 r;
    public final r22 s;
    public final v22 w;
    public final v22 x;
    public final wb4 y;

    public d32(int i, x02 x02Var, wjb wjbVar, Context context) {
        super(x02Var, wjbVar, context);
        boolean z;
        boolean z2;
        int i2;
        Cursor cursor;
        String str;
        this.Q = false;
        this.S = new HashMap();
        this.T = new ArrayList();
        this.U = new HashMap();
        this.W = -1;
        int i3 = 3;
        this.f0 = new zj(this, (byte) 3);
        v22 v22Var = new v22(this, context);
        this.w = v22Var;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.b0 = z;
        if (i == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.e0 = z2;
        this.d0 = gba.I0;
        try {
            if (z2) {
                try {
                    Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j = query.getLong(2);
                            long j2 = query.getLong(i3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j <= na7.q1(y6c.t0).k4.S0.f() * 1000) {
                                try {
                                    if (j2 <= na7.q1(y6c.t0).k4.R0.f() && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        w22 w22Var = new w22();
                                        w22Var.b = file.getName();
                                        w22Var.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        w22Var.d = str;
                                        w22Var.c = gl.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            w22Var.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(w22Var);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th2;
                                }
                            }
                            query = cursor;
                            i3 = 3;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    query.close();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else {
                P(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) v22Var.h, new n22(this, (byte) 1));
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        this.c0 = false;
        if (!this.Q) {
            this.Q = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
            intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
            intentFilter.addAction("android.intent.action.MEDIA_EJECT");
            intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_NOFS");
            intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
            intentFilter.addAction("android.intent.action.MEDIA_SHARED");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
            intentFilter.addDataScheme("file");
            if (Build.VERSION.SDK_INT >= 33) {
                a.b.registerReceiver(this.f0, intentFilter, 4);
            } else {
                a.b.registerReceiver(this.f0, intentFilter);
            }
        }
        r6 t = this.b.U2.t();
        r7 a = t.a(0, 2131232491);
        a.N();
        a.I = new q10(this, (byte) 2);
        this.G = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        a.setContentDescription(k96.M0(2131745644, null));
        EditTextBoldCursor searchField = a.getSearchField();
        int i4 = bkb.i5;
        zkb.X(searchField, i4, wjbVar);
        zkb.v(searchField, i4, wjbVar);
        zkb.D(searchField, bkb.Le, wjbVar);
        if (this.d0) {
            i2 = 2131232107;
        } else {
            i2 = 2131232106;
        }
        r7 a2 = t.a(6, i2);
        this.H = a2;
        a2.setContentDescription(k96.M0(2131754891, null));
        pi4 pi4Var = new pi4(context, wjbVar);
        this.K = pi4Var;
        addView(pi4Var);
        q22 q22Var = new q22(this, context, pi4Var, wjbVar);
        this.M = q22Var;
        addView(q22Var, nme.c(-1.0f, -1));
        q22Var.setVisibility(8);
        q22Var.setOnTouchListener(new jz1((byte) 1));
        r22 r22Var = new r22(this, context, wjbVar, (byte) 0);
        this.s = r22Var;
        r22Var.setSectionsType(2);
        r22Var.setVerticalScrollBarEnabled(false);
        wb4 wb4Var = new wb4(gl.L(56.0f), 0, r22Var);
        this.y = wb4Var;
        r22Var.setLayoutManager(wb4Var);
        r22Var.setClipToPadding(false);
        v22 v22Var2 = new v22(this, context);
        this.x = v22Var2;
        r22Var.setAdapter(v22Var2);
        addView(r22Var, nme.c(-1.0f, -1));
        r22Var.setVisibility(8);
        r22 r22Var2 = new r22(this, context, wjbVar, (byte) 1);
        this.r = r22Var2;
        r22Var2.r1();
        setBlur3Capture(r22Var2);
        this.d = r22Var2;
        this.h = true;
        this.f = true;
        r22Var2.setSectionsType(2);
        r22Var2.setVerticalScrollBarEnabled(false);
        z12 z12Var = new z12(this, gl.L(56.0f) + gl.m, r22Var2, (byte) 1);
        this.F = z12Var;
        r22Var2.setLayoutManager(z12Var);
        r22Var2.setClipToPadding(false);
        r22Var2.setAdapter(this.w);
        addView(r22Var2, nme.c(-1.0f, -1));
        this.E = new c32(this, context);
        r22Var2.setOnScrollListener(new y(this, (byte) 19));
        r22Var2.setOnItemClickListener(new c39(this) {
            public final d32 b;

            {
                this.b = this;
            }

            @Override
            public final void d(int i5, View view) {
                rf4 rf4Var;
                byte b = r2;
                d32 d32Var = this.b;
                switch (b) {
                    case 0:
                        d32Var.R(i5, view);
                        return;
                    default:
                        tf4 tf4Var = d32Var.I;
                        tf4Var.J0(true);
                        c32 c32Var = d32Var.E;
                        ArrayList arrayList = tf4Var.f3;
                        if (arrayList.isEmpty()) {
                            rf4Var = tf4.k3[i5];
                        } else {
                            rf4Var = (rf4) arrayList.get(i5);
                        }
                        x02 x02Var2 = c32Var.Y.b;
                        ArrayList arrayList2 = c32Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                if (rf4Var.b((rf4) arrayList2.get(i6))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(rf4Var);
                        x02Var2.U2.setSearchFilter(rf4Var);
                        x02Var2.U2.setSearchFieldText("");
                        c32Var.a0(null, null, true);
                        return;
                }
            }
        });
        r22Var2.setOnItemLongClickListener(new rh1(this, (byte) 14));
        tf4 tf4Var = new tf4(context, wjbVar);
        this.I = tf4Var;
        tf4Var.setOnItemClickListener(new c39(this) {
            public final d32 b;

            {
                this.b = this;
            }

            @Override
            public final void d(int i5, View view) {
                rf4 rf4Var;
                byte b = r2;
                d32 d32Var = this.b;
                switch (b) {
                    case 0:
                        d32Var.R(i5, view);
                        return;
                    default:
                        tf4 tf4Var2 = d32Var.I;
                        tf4Var2.J0(true);
                        c32 c32Var = d32Var.E;
                        ArrayList arrayList = tf4Var2.f3;
                        if (arrayList.isEmpty()) {
                            rf4Var = tf4.k3[i5];
                        } else {
                            rf4Var = (rf4) arrayList.get(i5);
                        }
                        x02 x02Var2 = c32Var.Y.b;
                        ArrayList arrayList2 = c32Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                if (rf4Var.b((rf4) arrayList2.get(i6))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(rf4Var);
                        x02Var2.U2.setSearchFilter(rf4Var);
                        x02Var2.U2.setSearchFieldText("");
                        c32Var.a0(null, null, true);
                        return;
                }
            }
        });
        zkb.h(bkb.g5, wjbVar, tf4Var);
        addView(tf4Var, nme.e(-1, 44, 48));
        tf4Var.setTranslationY(-gl.L(44.0f));
        tf4Var.setVisibility(4);
        T();
        a0();
        Y();
    }

    private int getTopForScroll() {
        r22 r22Var = this.r;
        View childAt = r22Var.getChildAt(0);
        s49 G = r22Var.G(childAt);
        int i = -r22Var.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i;
        }
        return i;
    }

    @Override
    public final void C(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d32.C(int, int):void");
    }

    @Override
    public final void D() {
        v22 v22Var = this.w;
        if (v22Var != null) {
            v22Var.f();
        }
        c32 c32Var = this.E;
        if (c32Var != null) {
            c32Var.f();
        }
    }

    @Override
    public final void I(p02 p02Var) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.w.f.clear();
        T();
        a0();
        Y();
        this.b.U2.setTitle(k96.M0(2131745465, null));
        this.H.setVisibility(0);
        this.F.g1(0, 0);
    }

    @Override
    public final void K() {
        this.r.z0(0);
    }

    @Override
    public final boolean M(final boolean z, final int i, int i2, final long j, final boolean z2) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (se4 se4Var : hashMap.keySet()) {
            arrayList.add((k27) hashMap.get(se4Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        x02 x02Var = this.b;
        CharSequence[] charSequenceArr = {x02Var.U0().getText()};
        final ArrayList Y = hq6.d0(x02Var.G3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return ij.Y(x02Var.G3, x02Var.V0(), x02Var.R0() + arrayList2.size() + (!TextUtils.isEmpty(charSequence) ? 1 : 0), new p8c() {
            @Override
            public final void a(Object obj) {
                d32 d32Var = d32.this;
                d32Var.L = true;
                d32Var.R.k(arrayList2, charSequence, Y, arrayList, z, i, j, z2, ((Long) obj).longValue());
                d32Var.b.a(true);
            }
        }, 0L);
    }

    public final void P(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File j = ba4.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    P(file2);
                } else if (!file2.equals(j)) {
                    w22 w22Var = new w22();
                    w22Var.b = file2.getName();
                    w22Var.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    w22Var.d = str;
                    w22Var.c = gl.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        w22Var.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(w22Var);
                }
            }
        }
    }

    public final boolean Q(File file) {
        int i;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(ba4.D(file));
        if (file.length() != 0 && mimeTypeFromExtension != null && ij9.i.contains(mimeTypeFromExtension)) {
            if (file.length() > na7.q1(y6c.t0).k4.R0.f()) {
                new u21(this.b.c, null).u(k96.a0("TooLargeError", null, 2131743802, new Object[0]), k96.a0("ErrorRingtoneSizeTooBig", null, 2131751090, Integer.valueOf(na7.q1(y6c.t0).k4.R0.f() / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(a.b, Uri.fromFile(file));
                i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i = Integer.MAX_VALUE;
            }
            if (i <= na7.q1(y6c.t0).k4.S0.f() * 1000) {
                return true;
            }
            new u21(this.b.c, null).u(k96.a0("TooLongError", null, 2131743801, new Object[0]), k96.a0("ErrorRingtoneDurationTooLong", null, 2131751092, Integer.valueOf(na7.q1(y6c.t0).k4.S0.f())), null).j();
            return false;
        }
        new u21(this.b.c, null).u(k96.a0("InvalidFormatError", null, 2131748989, new Object[0]), k96.M0(2131751091, null), null).j();
        return false;
    }

    public final void R(int i, View view) {
        Object O;
        boolean z;
        boolean z2;
        int i2;
        r22 r22Var = this.r;
        w39 adapter = r22Var.getAdapter();
        v22 v22Var = this.w;
        if (adapter == v22Var) {
            O = v22Var.E(i);
        } else {
            c32 c32Var = this.E;
            O = c32Var.O(c32Var.S(i), c32Var.Q(i));
        }
        if (O instanceof w22) {
            w22 w22Var = (w22) O;
            File file = w22Var.f;
            if (Build.VERSION.SDK_INT >= 30) {
                z = Environment.isExternalStorageManager();
            } else {
                z = false;
            }
            boolean z3 = w01.b;
            mu1 mu1Var = null;
            x02 x02Var = this.b;
            if (!z3 && (((i2 = w22Var.a) == 2131231076 || i2 == 2131231074) && !z)) {
                k02 k02Var = x02Var.o3;
                int i3 = x02Var.G3;
                if (x02Var.E3 != null && x02Var.E1 - x02Var.F1 < 0) {
                    if (!na7.q1(i3).F3() && na7.q1(i3).k4.h1.f() > x02Var.F1) {
                        new u21(k02Var, x02Var.J0).f(na7.q1(i3).k4.h1.f(), new vq0(x02Var, (byte) 4)).j();
                        return;
                    } else {
                        new u21(k02Var, x02Var.J0).t(k96.M0(2131743801, null), x02Var.J0).j();
                        return;
                    }
                }
                this.R.z();
                return;
            } else if (file == null) {
                int i4 = w22Var.a;
                if (i4 == 2131231073) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    d dVar = x02Var.Z1;
                    if (dVar instanceof mu1) {
                        mu1Var = (mu1) dVar;
                    }
                    mu1 mu1Var2 = mu1Var;
                    xl6 xl6Var = MediaController.a2;
                    if (mu1Var2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    u58 u58Var = new u58(0, xl6Var, hashMap, arrayList, 0, z2, mu1Var2, false);
                    u58Var.m0 = true;
                    u58Var.t0 = new mv6(this, hashMap, arrayList);
                    u58Var.j0(this.W, false);
                    d dVar2 = x02Var.Z1;
                    if (dVar2 != null) {
                        dVar2.presentFragment(u58Var);
                    } else {
                        d Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(u58Var);
                        }
                    }
                    x02Var.a(true);
                    return;
                } else if (i4 == 2131231075) {
                    t22 t22Var = this.R;
                    if (t22Var != null) {
                        t22Var.S();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = getTopForScroll();
                    V();
                    u22 u22Var = (u22) tb4.l(1, v22Var.f);
                    x02Var.U2.setTitle(u22Var.b);
                    File file2 = u22Var.a;
                    if (file2 != null) {
                        S(file2);
                    } else {
                        T();
                    }
                    a0();
                    this.F.g1(0, topForScroll);
                    W(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = r22Var.getChildAt(0);
                s49 G = r22Var.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.a = this.P;
                    obj.b = x02Var.U2.getTitle();
                    V();
                    v22Var.f.add(obj);
                    if (!S(file)) {
                        v22Var.f.remove((Object) obj);
                        return;
                    }
                    W(1);
                    x02Var.U2.setTitle(w22Var.b);
                    return;
                }
                return;
            } else {
                U(view, w22Var);
                return;
            }
        }
        U(view, O);
    }

    public final boolean S(File file) {
        File file2;
        v22 v22Var;
        String str;
        this.O = false;
        boolean canRead = file.canRead();
        r22 r22Var = this.r;
        String str2 = null;
        v22 v22Var2 = this.w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.P = file;
                v22Var2.e.clear();
                Environment.getExternalStorageState();
                gl.y(r22Var);
                this.V = true;
                v22Var2.f();
                return true;
            }
            X(k96.M0(2131754710, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(k96.M0(2131743640, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = v22Var2.e;
            ArrayList arrayList2 = v22Var2.f;
            ArrayList arrayList3 = v22Var2.e;
            arrayList.clear();
            File j = ba4.j(6);
            int i = 0;
            while (i < listFiles.length) {
                File file3 = listFiles[i];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j)) {
                    v22Var = v22Var2;
                } else {
                    w22 w22Var = new w22();
                    w22Var.b = file3.getName();
                    w22Var.f = file3;
                    if (file3.isDirectory()) {
                        w22Var.a = 2131231072;
                        w22Var.c = k96.M0(2131750668, str2);
                        v22Var = v22Var2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        w22Var.d = str;
                        v22Var = v22Var2;
                        w22Var.c = gl.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            w22Var.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(w22Var);
                }
                i++;
                v22Var2 = v22Var;
                str2 = null;
            }
            v22 v22Var3 = v22Var2;
            w22 w22Var2 = new w22();
            w22Var2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((u22) b00.f(1, arrayList2)).a;
                file2 = null;
                if (file4 == null) {
                    w22Var2.c = k96.M0(2131750668, null);
                } else {
                    w22Var2.c = file4.toString();
                }
            } else {
                file2 = null;
                w22Var2.c = k96.M0(2131750668, null);
            }
            w22Var2.a = 2131231072;
            w22Var2.f = file2;
            arrayList3.add(0, w22Var2);
            if (this.P != null) {
                Collections.sort(v22Var3.e, new n22(this, (byte) 0));
            }
            a0();
            gl.y(r22Var);
            this.V = true;
            int topForScroll = getTopForScroll();
            v22Var3.f();
            this.F.g1(0, topForScroll);
            return true;
        } catch (Exception e) {
            X(e.getLocalizedMessage());
            return false;
        }
    }

    public final void T() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d32.T():void");
    }

    public final boolean U(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d32.U(android.view.View, java.lang.Object):boolean");
    }

    public final void V() {
        View m;
        v22 v22Var = this.x;
        v22Var.f.clear();
        ArrayList arrayList = v22Var.f;
        v22 v22Var2 = this.w;
        arrayList.addAll(v22Var2.f);
        ArrayList arrayList2 = v22Var.e;
        arrayList2.clear();
        arrayList2.addAll(v22Var2.e);
        ArrayList arrayList3 = (ArrayList) v22Var.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) v22Var2.h);
        v22Var.f();
        r22 r22Var = this.s;
        r22Var.setVisibility(0);
        r22 r22Var2 = this.r;
        r22Var.setPadding(r22Var2.getPaddingLeft(), r22Var2.getPaddingTop(), r22Var2.getPaddingRight(), r22Var2.getPaddingBottom());
        z12 z12Var = this.F;
        int K0 = z12Var.K0();
        if (K0 >= 0 && (m = z12Var.m(K0)) != null) {
            this.y.g1(K0, m.getTop() - r22Var.getPaddingTop());
        }
    }

    public final void W(final int i) {
        r22 r22Var;
        final float L;
        ValueAnimator ofFloat;
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = i;
        int i2 = 0;
        while (true) {
            int childCount = getChildCount();
            r22Var = this.r;
            if (i2 < childCount) {
                if (getChildAt(i2) == r22Var) {
                    break;
                }
                i2++;
            } else {
                i2 = 0;
                break;
            }
        }
        r22 r22Var2 = this.s;
        if (i == 1) {
            L = gl.L(150.0f);
            r22Var2.setAlpha(1.0f);
            r22Var2.setScaleX(1.0f);
            r22Var2.setScaleY(1.0f);
            r22Var2.setTranslationX(0.0f);
            removeView(r22Var2);
            addView(r22Var2, i2);
            r22Var2.setVisibility(0);
            r22Var.setTranslationX(L);
            r22Var.setAlpha(0.0f);
            ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.g0 = ofFloat;
        } else {
            L = gl.L(150.0f);
            r22Var.setAlpha(0.0f);
            r22Var.setScaleX(0.95f);
            r22Var.setScaleY(0.95f);
            r22Var2.setScaleX(1.0f);
            r22Var2.setScaleY(1.0f);
            r22Var2.setTranslationX(0.0f);
            r22Var2.setAlpha(1.0f);
            removeView(r22Var2);
            addView(r22Var2, i2 + 1);
            r22Var2.setVisibility(0);
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g0 = ofFloat;
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                d32 d32Var = d32.this;
                r22 r22Var3 = d32Var.r;
                r22 r22Var4 = d32Var.s;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                byte b = i;
                float f = L * floatValue;
                if (b == 1) {
                    r22Var3.setTranslationX(f);
                    r22Var3.setAlpha(1.0f - floatValue);
                    r22Var3.invalidate();
                    r22Var4.setAlpha(floatValue);
                    float f2 = (floatValue * 0.05f) + 0.95f;
                    r22Var4.setScaleX(f2);
                    r22Var4.setScaleY(f2);
                    return;
                }
                r22Var4.setTranslationX(f);
                r22Var4.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                r22Var4.invalidate();
                r22Var3.setAlpha(floatValue);
                float f3 = (floatValue * 0.05f) + 0.95f;
                r22Var3.setScaleX(f3);
                r22Var3.setScaleY(f3);
                r22Var4.invalidate();
            }
        });
        this.g0.addListener(new bb1(this, (byte) 15));
        ValueAnimator valueAnimator2 = this.g0;
        if (i == 1) {
            valueAnimator2.setDuration(220L);
        } else {
            valueAnimator2.setDuration(200L);
        }
        this.g0.setInterpolator(s33.f);
        this.g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = k96.M0(2131689472, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = str;
        b00.t(null, 2131747638, alertDialog$Builder, null);
    }

    public final void Y() {
        w39 adapter = this.r.getAdapter();
        int i = 0;
        boolean z = true;
        c32 c32Var = this.E;
        if (adapter != c32Var ? this.w.b() != 1 : !(c32Var.s.isEmpty() && c32Var.Q.isEmpty())) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        this.M.setVisibility(i);
        Z();
    }

    public final void Z() {
        View childAt;
        q22 q22Var = this.M;
        if (q22Var.getVisibility() != 0 || (childAt = this.r.getChildAt(0)) == null) {
            return;
        }
        float translationY = q22Var.getTranslationY();
        this.N = (childAt.getTop() + (q22Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        q22Var.setTranslationY(translationY);
    }

    public final void a0() {
        int i;
        r7 r7Var = this.G;
        if (r7Var != null && !r7Var.w()) {
            if (!this.O && !this.w.f.isEmpty()) {
                i = 8;
            } else {
                i = 0;
            }
            r7Var.setVisibility(i);
        }
    }

    @Override
    public final void d() {
        r7 r7Var = this.G;
        if (r7Var != null) {
            try {
                if (r7Var.getSearchField() != null) {
                    r7Var.getSearchField().setCursorColor(bkb.v0(bkb.i5, this.a));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return gl.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        r22 r22Var = this.r;
        if (r22Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        View childAt = r22Var.getChildAt(0);
        y29 y29Var = (y29) r22Var.G(childAt);
        int y = ((((int) childAt.getY()) - gl.m) - gl.L(4.0f)) - gl.L(8.0f);
        if (y > 0 && y29Var != null && y29Var.b() == 0) {
            i = y;
        }
        if (y < 0 || y29Var == null || y29Var.b() != 0) {
            y = i;
        }
        return gl.L(13.0f) + y;
    }

    @Override
    public int getFirstOffset() {
        return gl.L(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override
    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        arrayList.add(new blb(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.i5));
        int i = bkb.z5;
        r22 r22Var = this.r;
        arrayList.add(new blb(r22Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(r22Var, 32, new Class[]{b9a.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.a7));
        arrayList.add(new blb(r22Var, 48, new Class[]{b9a.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        arrayList.add(new blb(r22Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.h6));
        arrayList.add(new blb(r22Var, 0, new Class[]{View.class}, bkb.j0, (Drawable[]) null, (alb) null, bkb.c7));
        arrayList.add(new blb(r22Var, 4, new Class[]{iba.class}, new String[]{"nameTextView"}, (Drawable[]) null, (alb) null, bkb.F6));
        arrayList.add(new blb(r22Var, 4, new Class[]{iba.class}, new String[]{"dateTextView"}, (Drawable[]) null, (alb) null, bkb.z6));
        arrayList.add(new blb(r22Var, 8192, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.h7));
        arrayList.add(new blb(r22Var, 16384, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.j7));
        arrayList.add(new blb(r22Var, 8, new Class[]{iba.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (alb) null, bkb.pj));
        arrayList.add(new blb(r22Var, 40, new Class[]{iba.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (alb) null, bkb.qj));
        arrayList.add(new blb(r22Var, 4, new Class[]{iba.class}, new String[]{"extTextView"}, (Drawable[]) null, (alb) null, bkb.rj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        v22 v22Var = this.w;
        if (v22Var.f.size() <= 0) {
            return false;
        }
        V();
        u22 u22Var = (u22) tb4.l(1, v22Var.f);
        this.b.U2.setTitle(u22Var.b);
        int topForScroll = getTopForScroll();
        File file = u22Var.a;
        if (file != null) {
            S(file);
        } else {
            T();
        }
        a0();
        this.F.g1(0, topForScroll);
        W(2);
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Z();
    }

    @Override
    public final void q() {
        try {
            if (this.Q) {
                a.b.unregisterReceiver(this.f0);
                this.Q = false;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        this.b.U2.n(true);
        r6 t = this.b.U2.t();
        t.removeView(this.H);
        t.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z) {
        this.a0 = z;
    }

    public void setDelegate(t22 t22Var) {
        this.R = t22Var;
    }

    public void setMaxSelectedFiles(int i) {
        this.W = i;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    @Override
    public final void v() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override
    public final void x(int i) {
        int i2;
        if (i == 6) {
            gba.I0 = !gba.I0;
            SharedPreferences.Editor edit = na7.c1().edit();
            edit.putBoolean("sortFilesByName", gba.I0);
            edit.apply();
            this.d0 = gba.I0;
            v22 v22Var = this.w;
            Collections.sort((ArrayList) v22Var.h, new n22(this, (byte) 1));
            if (this.P != null) {
                Collections.sort(v22Var.e, new n22(this, (byte) 0));
            }
            v22Var.f();
            if (this.d0) {
                i2 = 2131232107;
            } else {
                i2 = 2131232106;
            }
            this.H.setIcon(i2);
        }
    }
}
