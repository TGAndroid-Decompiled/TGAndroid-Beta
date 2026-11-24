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
public final class p42 extends a22 {
    public final o42 E;
    public final l32 F;
    public final r7 G;
    public final r7 H;
    public final uh4 I;
    public AnimatorSet J;
    public final tk4 K;
    public boolean L;
    public final c42 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public f42 R;
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
    public final zk f0;
    public ValueAnimator g0;
    public byte n;
    public final d42 r;
    public final d42 s;
    public final h42 w;
    public final h42 x;
    public final wd4 y;

    public p42(int i, i22 i22Var, ylb ylbVar, Context context) {
        super(i22Var, ylbVar, context);
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
        this.f0 = new zk(this, (byte) 3);
        h42 h42Var = new h42(this, context);
        this.w = h42Var;
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
        this.d0 = gda.I0;
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
                            if (j <= oc7.r1(z8c.t0).l4.S0.f() * 1000) {
                                try {
                                    if (j2 <= oc7.r1(z8c.t0).l4.R0.f() && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        i42 i42Var = new i42();
                                        i42Var.b = file.getName();
                                        i42Var.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        i42Var.d = str;
                                        i42Var.c = gm.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            i42Var.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(i42Var);
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
                    fc4.g(e, true);
                }
            } else {
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) h42Var.h, new z32(this, (byte) 1));
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
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
        r7 a = t.a(0, 2131232503);
        a.N();
        a.I = new q20(this, (byte) 2);
        this.G = a;
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        a.setContentDescription(jb6.M0(2131745570, null));
        EditTextBoldCursor searchField = a.getSearchField();
        int i4 = cmb.i5;
        anb.X(searchField, i4, ylbVar);
        anb.v(searchField, i4, ylbVar);
        anb.D(searchField, cmb.Le, ylbVar);
        if (this.d0) {
            i2 = 2131232108;
        } else {
            i2 = 2131232107;
        }
        r7 a2 = t.a(6, i2);
        this.H = a2;
        a2.setContentDescription(jb6.M0(2131754891, null));
        tk4 tk4Var = new tk4(context, ylbVar);
        this.K = tk4Var;
        addView(tk4Var);
        c42 c42Var = new c42(this, context, tk4Var, ylbVar);
        this.M = c42Var;
        addView(c42Var, qoe.c(-1.0f, -1));
        c42Var.setVisibility(8);
        c42Var.setOnTouchListener(new w02((byte) 1));
        d42 d42Var = new d42(this, context, ylbVar, (byte) 0);
        this.s = d42Var;
        d42Var.setSectionsType(2);
        d42Var.setVerticalScrollBarEnabled(false);
        wd4 wd4Var = new wd4(gm.L(56.0f), 0, d42Var);
        this.y = wd4Var;
        d42Var.setLayoutManager(wd4Var);
        d42Var.setClipToPadding(false);
        h42 h42Var2 = new h42(this, context);
        this.x = h42Var2;
        d42Var.setAdapter(h42Var2);
        addView(d42Var, qoe.c(-1.0f, -1));
        d42Var.setVisibility(8);
        d42 d42Var2 = new d42(this, context, ylbVar, (byte) 1);
        this.r = d42Var2;
        d42Var2.r1();
        setBlur3Capture(d42Var2);
        this.d = d42Var2;
        this.h = true;
        this.f = true;
        d42Var2.setSectionsType(2);
        d42Var2.setVerticalScrollBarEnabled(false);
        l32 l32Var = new l32(this, gm.L(56.0f) + gm.m, d42Var2, (byte) 1);
        this.F = l32Var;
        d42Var2.setLayoutManager(l32Var);
        d42Var2.setClipToPadding(false);
        d42Var2.setAdapter(this.w);
        addView(d42Var2, qoe.c(-1.0f, -1));
        this.E = new o42(this, context);
        d42Var2.setOnScrollListener(new y(this, (byte) 20));
        d42Var2.setOnItemClickListener(new f59(this) {
            public final p42 b;

            {
                this.b = this;
            }

            @Override
            public final void g(int i5, View view) {
                sh4 sh4Var;
                byte b = r2;
                p42 p42Var = this.b;
                switch (b) {
                    case 0:
                        p42Var.Q(i5, view);
                        return;
                    default:
                        uh4 uh4Var = p42Var.I;
                        uh4Var.J0(true);
                        o42 o42Var = p42Var.E;
                        ArrayList arrayList = uh4Var.f3;
                        if (arrayList.isEmpty()) {
                            sh4Var = uh4.k3[i5];
                        } else {
                            sh4Var = (sh4) arrayList.get(i5);
                        }
                        i22 i22Var2 = o42Var.Y.b;
                        ArrayList arrayList2 = o42Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                if (sh4Var.b((sh4) arrayList2.get(i6))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(sh4Var);
                        i22Var2.U2.setSearchFilter(sh4Var);
                        i22Var2.U2.setSearchFieldText("");
                        o42Var.a0(null, null, true);
                        return;
                }
            }
        });
        d42Var2.setOnItemLongClickListener(new cd1(this, (byte) 17));
        uh4 uh4Var = new uh4(context, ylbVar);
        this.I = uh4Var;
        uh4Var.setOnItemClickListener(new f59(this) {
            public final p42 b;

            {
                this.b = this;
            }

            @Override
            public final void g(int i5, View view) {
                sh4 sh4Var;
                byte b = r2;
                p42 p42Var = this.b;
                switch (b) {
                    case 0:
                        p42Var.Q(i5, view);
                        return;
                    default:
                        uh4 uh4Var2 = p42Var.I;
                        uh4Var2.J0(true);
                        o42 o42Var = p42Var.E;
                        ArrayList arrayList = uh4Var2.f3;
                        if (arrayList.isEmpty()) {
                            sh4Var = uh4.k3[i5];
                        } else {
                            sh4Var = (sh4) arrayList.get(i5);
                        }
                        i22 i22Var2 = o42Var.Y.b;
                        ArrayList arrayList2 = o42Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                if (sh4Var.b((sh4) arrayList2.get(i6))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(sh4Var);
                        i22Var2.U2.setSearchFilter(sh4Var);
                        i22Var2.U2.setSearchFieldText("");
                        o42Var.a0(null, null, true);
                        return;
                }
            }
        });
        anb.h(cmb.g5, ylbVar, uh4Var);
        addView(uh4Var, qoe.e(-1, 44, 48));
        uh4Var.setTranslationY(-gm.L(44.0f));
        uh4Var.setVisibility(4);
        S();
        a0();
        Y();
    }

    private int getTopForScroll() {
        d42 d42Var = this.r;
        View childAt = d42Var.getChildAt(0);
        u69 G = d42Var.G(childAt);
        int i = -d42Var.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i;
        }
        return i;
    }

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p42.B(int, int):void");
    }

    @Override
    public final void C() {
        h42 h42Var = this.w;
        if (h42Var != null) {
            h42Var.f();
        }
        o42 o42Var = this.E;
        if (o42Var != null) {
            o42Var.f();
        }
    }

    @Override
    public final void H(a22 a22Var) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.w.f.clear();
        S();
        a0();
        Y();
        this.b.U2.setTitle(jb6.M0(2131745391, null));
        this.H.setVisibility(0);
        this.F.g1(0, 0);
    }

    @Override
    public final void J() {
        this.r.z0(0);
    }

    @Override
    public final boolean K(final boolean z, final int i, int i2, final long j, final boolean z2) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (ug4 ug4Var : hashMap.keySet()) {
            arrayList.add((k47) hashMap.get(ug4Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        i22 i22Var = this.b;
        CharSequence[] charSequenceArr = {i22Var.U0().getText()};
        final ArrayList Y = hs6.d0(i22Var.G3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return ik.Y(i22Var.G3, i22Var.V0(), i22Var.R0() + arrayList2.size() + (!TextUtils.isEmpty(charSequence) ? 1 : 0), new qac() {
            @Override
            public final void a(Object obj) {
                p42 p42Var = p42.this;
                p42Var.L = true;
                p42Var.R.k(arrayList2, charSequence, Y, arrayList, z, i, j, z2, ((Long) obj).longValue());
                p42Var.b.a(true);
            }
        }, 0L);
    }

    public final void O(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File j = bc4.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    O(file2);
                } else if (!file2.equals(j)) {
                    i42 i42Var = new i42();
                    i42Var.b = file2.getName();
                    i42Var.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    i42Var.d = str;
                    i42Var.c = gm.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        i42Var.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(i42Var);
                }
            }
        }
    }

    public final boolean P(File file) {
        int i;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(bc4.D(file));
        if (file.length() != 0 && mimeTypeFromExtension != null && kl9.i.contains(mimeTypeFromExtension)) {
            if (file.length() > oc7.r1(z8c.t0).l4.R0.f()) {
                new c41(this.b.c, null).u(jb6.a0("TooLargeError", null, 2131743728, new Object[0]), jb6.a0("ErrorRingtoneSizeTooBig", null, 2131751039, Integer.valueOf(oc7.r1(z8c.t0).l4.R0.f() / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(a.b, Uri.fromFile(file));
                i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i = Integer.MAX_VALUE;
            }
            if (i <= oc7.r1(z8c.t0).l4.S0.f() * 1000) {
                return true;
            }
            new c41(this.b.c, null).u(jb6.a0("TooLongError", null, 2131743727, new Object[0]), jb6.a0("ErrorRingtoneDurationTooLong", null, 2131751041, Integer.valueOf(oc7.r1(z8c.t0).l4.S0.f())), null).j();
            return false;
        }
        new c41(this.b.c, null).u(jb6.a0("InvalidFormatError", null, 2131748938, new Object[0]), jb6.M0(2131751040, null), null).j();
        return false;
    }

    public final void Q(int i, View view) {
        Object O;
        boolean z;
        boolean z2;
        int i2;
        d42 d42Var = this.r;
        y59 adapter = d42Var.getAdapter();
        h42 h42Var = this.w;
        if (adapter == h42Var) {
            O = h42Var.E(i);
        } else {
            o42 o42Var = this.E;
            O = o42Var.O(o42Var.S(i), o42Var.Q(i));
        }
        if (O instanceof i42) {
            i42 i42Var = (i42) O;
            File file = i42Var.f;
            if (Build.VERSION.SDK_INT >= 30) {
                z = Environment.isExternalStorageManager();
            } else {
                z = false;
            }
            boolean z3 = e21.b;
            yv1 yv1Var = null;
            i22 i22Var = this.b;
            if (!z3 && (((i2 = i42Var.a) == 2131231077 || i2 == 2131231075) && !z)) {
                v12 v12Var = i22Var.o3;
                int i3 = i22Var.G3;
                if (i22Var.E3 != null && i22Var.E1 - i22Var.F1 < 0) {
                    if (!oc7.r1(i3).H3() && oc7.r1(i3).l4.h1.f() > i22Var.F1) {
                        new c41(v12Var, i22Var.J0).f(oc7.r1(i3).l4.h1.f(), new vr0(i22Var, (byte) 4)).j();
                        return;
                    } else {
                        new c41(v12Var, i22Var.J0).t(jb6.M0(2131743727, null), i22Var.J0).j();
                        return;
                    }
                }
                this.R.y();
                return;
            } else if (file == null) {
                int i4 = i42Var.a;
                if (i4 == 2131231074) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    d dVar = i22Var.Z1;
                    if (dVar instanceof yv1) {
                        yv1Var = (yv1) dVar;
                    }
                    yv1 yv1Var2 = yv1Var;
                    yn6 yn6Var = MediaController.a2;
                    if (yv1Var2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    w78 w78Var = new w78(0, yn6Var, hashMap, arrayList, 0, z2, yv1Var2, false);
                    w78Var.m0 = true;
                    w78Var.t0 = new mx6(this, hashMap, arrayList);
                    w78Var.k0(this.W, false);
                    d dVar2 = i22Var.Z1;
                    if (dVar2 != null) {
                        dVar2.presentFragment(w78Var);
                    } else {
                        d Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(w78Var);
                        }
                    }
                    i22Var.a(true);
                    return;
                } else if (i4 == 2131231076) {
                    f42 f42Var = this.R;
                    if (f42Var != null) {
                        f42Var.S();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = getTopForScroll();
                    U();
                    g42 g42Var = (g42) td4.m(1, h42Var.f);
                    i22Var.U2.setTitle(g42Var.b);
                    File file2 = g42Var.a;
                    if (file2 != null) {
                        R(file2);
                    } else {
                        S();
                    }
                    a0();
                    this.F.g1(0, topForScroll);
                    W(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = d42Var.getChildAt(0);
                u69 G = d42Var.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.a = this.P;
                    obj.b = i22Var.U2.getTitle();
                    U();
                    h42Var.f.add(obj);
                    if (!R(file)) {
                        h42Var.f.remove((Object) obj);
                        return;
                    }
                    W(1);
                    i22Var.U2.setTitle(i42Var.b);
                    return;
                }
                return;
            } else {
                T(view, i42Var);
                return;
            }
        }
        T(view, O);
    }

    public final boolean R(File file) {
        File file2;
        h42 h42Var;
        String str;
        this.O = false;
        boolean canRead = file.canRead();
        d42 d42Var = this.r;
        String str2 = null;
        h42 h42Var2 = this.w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.P = file;
                h42Var2.e.clear();
                Environment.getExternalStorageState();
                gm.y(d42Var);
                this.V = true;
                h42Var2.f();
                return true;
            }
            X(jb6.M0(2131754710, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(jb6.M0(2131743566, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = h42Var2.e;
            ArrayList arrayList2 = h42Var2.f;
            ArrayList arrayList3 = h42Var2.e;
            arrayList.clear();
            File j = bc4.j(6);
            int i = 0;
            while (i < listFiles.length) {
                File file3 = listFiles[i];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j)) {
                    h42Var = h42Var2;
                } else {
                    i42 i42Var = new i42();
                    i42Var.b = file3.getName();
                    i42Var.f = file3;
                    if (file3.isDirectory()) {
                        i42Var.a = 2131231073;
                        i42Var.c = jb6.M0(2131750617, str2);
                        h42Var = h42Var2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        i42Var.d = str;
                        h42Var = h42Var2;
                        i42Var.c = gm.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            i42Var.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(i42Var);
                }
                i++;
                h42Var2 = h42Var;
                str2 = null;
            }
            h42 h42Var3 = h42Var2;
            i42 i42Var2 = new i42();
            i42Var2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((g42) b10.f(1, arrayList2)).a;
                file2 = null;
                if (file4 == null) {
                    i42Var2.c = jb6.M0(2131750617, null);
                } else {
                    i42Var2.c = file4.toString();
                }
            } else {
                file2 = null;
                i42Var2.c = jb6.M0(2131750617, null);
            }
            i42Var2.a = 2131231073;
            i42Var2.f = file2;
            arrayList3.add(0, i42Var2);
            if (this.P != null) {
                Collections.sort(h42Var3.e, new z32(this, (byte) 0));
            }
            a0();
            gm.y(d42Var);
            this.V = true;
            int topForScroll = getTopForScroll();
            h42Var3.f();
            this.F.g1(0, topForScroll);
            return true;
        } catch (Exception e) {
            X(e.getLocalizedMessage());
            return false;
        }
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p42.S():void");
    }

    public final boolean T(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p42.T(android.view.View, java.lang.Object):boolean");
    }

    public final void U() {
        View m;
        h42 h42Var = this.x;
        h42Var.f.clear();
        ArrayList arrayList = h42Var.f;
        h42 h42Var2 = this.w;
        arrayList.addAll(h42Var2.f);
        ArrayList arrayList2 = h42Var.e;
        arrayList2.clear();
        arrayList2.addAll(h42Var2.e);
        ArrayList arrayList3 = (ArrayList) h42Var.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) h42Var2.h);
        h42Var.f();
        d42 d42Var = this.s;
        d42Var.setVisibility(0);
        d42 d42Var2 = this.r;
        d42Var.setPadding(d42Var2.getPaddingLeft(), d42Var2.getPaddingTop(), d42Var2.getPaddingRight(), d42Var2.getPaddingBottom());
        l32 l32Var = this.F;
        int K0 = l32Var.K0();
        if (K0 >= 0 && (m = l32Var.m(K0)) != null) {
            this.y.g1(K0, m.getTop() - d42Var.getPaddingTop());
        }
    }

    public final void W(final int i) {
        d42 d42Var;
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
            d42Var = this.r;
            if (i2 < childCount) {
                if (getChildAt(i2) == d42Var) {
                    break;
                }
                i2++;
            } else {
                i2 = 0;
                break;
            }
        }
        d42 d42Var2 = this.s;
        if (i == 1) {
            L = gm.L(150.0f);
            d42Var2.setAlpha(1.0f);
            d42Var2.setScaleX(1.0f);
            d42Var2.setScaleY(1.0f);
            d42Var2.setTranslationX(0.0f);
            removeView(d42Var2);
            addView(d42Var2, i2);
            d42Var2.setVisibility(0);
            d42Var.setTranslationX(L);
            d42Var.setAlpha(0.0f);
            ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.g0 = ofFloat;
        } else {
            L = gm.L(150.0f);
            d42Var.setAlpha(0.0f);
            d42Var.setScaleX(0.95f);
            d42Var.setScaleY(0.95f);
            d42Var2.setScaleX(1.0f);
            d42Var2.setScaleY(1.0f);
            d42Var2.setTranslationX(0.0f);
            d42Var2.setAlpha(1.0f);
            removeView(d42Var2);
            addView(d42Var2, i2 + 1);
            d42Var2.setVisibility(0);
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g0 = ofFloat;
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                p42 p42Var = p42.this;
                d42 d42Var3 = p42Var.r;
                d42 d42Var4 = p42Var.s;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                byte b = i;
                float f = L * floatValue;
                if (b == 1) {
                    d42Var3.setTranslationX(f);
                    d42Var3.setAlpha(1.0f - floatValue);
                    d42Var3.invalidate();
                    d42Var4.setAlpha(floatValue);
                    float f2 = (floatValue * 0.05f) + 0.95f;
                    d42Var4.setScaleX(f2);
                    d42Var4.setScaleY(f2);
                    return;
                }
                d42Var4.setTranslationX(f);
                d42Var4.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                d42Var4.invalidate();
                d42Var3.setAlpha(floatValue);
                float f3 = (floatValue * 0.05f) + 0.95f;
                d42Var3.setScaleX(f3);
                d42Var3.setScaleY(f3);
                d42Var4.invalidate();
            }
        });
        this.g0.addListener(new b91(this, (byte) 17));
        ValueAnimator valueAnimator2 = this.g0;
        if (i == 1) {
            valueAnimator2.setDuration(220L);
        } else {
            valueAnimator2.setDuration(200L);
        }
        this.g0.setInterpolator(d53.f);
        this.g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = jb6.M0(2131689472, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = str;
        b10.t(null, 2131747564, alertDialog$Builder, null);
    }

    public final void Y() {
        y59 adapter = this.r.getAdapter();
        int i = 0;
        boolean z = true;
        o42 o42Var = this.E;
        if (adapter != o42Var ? this.w.b() != 1 : !(o42Var.s.isEmpty() && o42Var.Q.isEmpty())) {
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
        c42 c42Var = this.M;
        if (c42Var.getVisibility() != 0 || (childAt = this.r.getChildAt(0)) == null) {
            return;
        }
        float translationY = c42Var.getTranslationY();
        this.N = (childAt.getTop() + (c42Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        c42Var.setTranslationY(translationY);
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
                    r7Var.getSearchField().setCursorColor(cmb.v0(cmb.i5, this.a));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return gm.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        d42 d42Var = this.r;
        if (d42Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        View childAt = d42Var.getChildAt(0);
        b59 b59Var = (b59) d42Var.G(childAt);
        int y = ((((int) childAt.getY()) - gm.m) - gm.L(4.0f)) - gm.L(8.0f);
        if (y > 0 && b59Var != null && b59Var.b() == 0) {
            i = y;
        }
        if (y < 0 || b59Var == null || b59Var.b() != 0) {
            y = i;
        }
        return gm.L(13.0f) + y;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(5.0f) + getListTopPadding();
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
    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        arrayList.add(new cnb(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.i5));
        int i = cmb.z5;
        d42 d42Var = this.r;
        arrayList.add(new cnb(d42Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(d42Var, 32, new Class[]{bba.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.a7));
        arrayList.add(new cnb(d42Var, 48, new Class[]{bba.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        arrayList.add(new cnb(d42Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.h6));
        arrayList.add(new cnb(d42Var, 0, new Class[]{View.class}, cmb.j0, (Drawable[]) null, (bnb) null, cmb.c7));
        arrayList.add(new cnb(d42Var, 4, new Class[]{ida.class}, new String[]{"nameTextView"}, (Drawable[]) null, (bnb) null, cmb.F6));
        arrayList.add(new cnb(d42Var, 4, new Class[]{ida.class}, new String[]{"dateTextView"}, (Drawable[]) null, (bnb) null, cmb.z6));
        arrayList.add(new cnb(d42Var, 8192, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.h7));
        arrayList.add(new cnb(d42Var, 16384, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.j7));
        arrayList.add(new cnb(d42Var, 8, new Class[]{ida.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (bnb) null, cmb.pj));
        arrayList.add(new cnb(d42Var, 40, new Class[]{ida.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (bnb) null, cmb.qj));
        arrayList.add(new cnb(d42Var, 4, new Class[]{ida.class}, new String[]{"extTextView"}, (Drawable[]) null, (bnb) null, cmb.rj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        h42 h42Var = this.w;
        if (h42Var.f.size() <= 0) {
            return false;
        }
        U();
        g42 g42Var = (g42) td4.m(1, h42Var.f);
        this.b.U2.setTitle(g42Var.b);
        int topForScroll = getTopForScroll();
        File file = g42Var.a;
        if (file != null) {
            R(file);
        } else {
            S();
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
    public final void p() {
        try {
            if (this.Q) {
                a.b.unregisterReceiver(this.f0);
                this.Q = false;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        this.b.U2.o(true);
        r6 t = this.b.U2.t();
        t.removeView(this.H);
        t.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z) {
        this.a0 = z;
    }

    public void setDelegate(f42 f42Var) {
        this.R = f42Var;
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
    public final void u() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override
    public final void w(int i) {
        int i2;
        if (i == 6) {
            gda.I0 = !gda.I0;
            SharedPreferences.Editor edit = oc7.d1().edit();
            edit.putBoolean("sortFilesByName", gda.I0);
            edit.apply();
            this.d0 = gda.I0;
            h42 h42Var = this.w;
            Collections.sort((ArrayList) h42Var.h, new z32(this, (byte) 1));
            if (this.P != null) {
                Collections.sort(h42Var.e, new z32(this, (byte) 0));
            }
            h42Var.f();
            if (this.d0) {
                i2 = 2131232108;
            } else {
                i2 = 2131232107;
            }
            this.H.setIcon(i2);
        }
    }
}
