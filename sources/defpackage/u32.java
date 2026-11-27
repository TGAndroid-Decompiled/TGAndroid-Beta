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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class u32 extends f12 {
    public final t32 E;
    public final q22 F;
    public final s7 G;
    public final s7 H;
    public final rh4 I;
    public AnimatorSet J;
    public final tk4 K;
    public boolean L;
    public final h32 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public k32 R;
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
    public final ak f0;
    public ValueAnimator g0;
    public byte n;
    public final i32 r;
    public final i32 s;
    public final m32 w;
    public final m32 x;
    public final td4 y;

    public u32(int i, n12 n12Var, vnb vnbVar, Context context) {
        super(n12Var, vnbVar, context);
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
        this.f0 = new ak(this, (byte) 3);
        m32 m32Var = new m32(this, context);
        this.w = m32Var;
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
        this.d0 = xea.I0;
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
                            if (j <= uc7.s1(yac.t0).k4.a1.f() * 1000) {
                                try {
                                    if (j2 <= uc7.s1(yac.t0).k4.Z0.f() && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        n32 n32Var = new n32();
                                        n32Var.b = file.getName();
                                        n32Var.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        n32Var.d = str;
                                        n32Var.c = hl.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            n32Var.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(n32Var);
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
                    cc4.g(e, true);
                }
            } else {
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) m32Var.h, new e32(this, (byte) 1));
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
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
        s6 u = this.b.U2.u();
        s7 a = u.a(0, 2131232502);
        a.N();
        a.I = new r10(this, (byte) 2);
        this.G = a;
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        a.setContentDescription(ob6.M0(2131745564, null));
        EditTextBoldCursor searchField = a.getSearchField();
        int i4 = aob.j5;
        yob.X(searchField, i4, vnbVar);
        yob.v(searchField, i4, vnbVar);
        yob.D(searchField, aob.Me, vnbVar);
        if (this.d0) {
            i2 = 2131232107;
        } else {
            i2 = 2131232106;
        }
        s7 a2 = u.a(6, i2);
        this.H = a2;
        a2.setContentDescription(ob6.M0(2131754887, null));
        tk4 tk4Var = new tk4(context, vnbVar);
        this.K = tk4Var;
        addView(tk4Var);
        h32 h32Var = new h32(this, context, tk4Var, vnbVar);
        this.M = h32Var;
        addView(h32Var, tre.c(-1.0f, -1));
        h32Var.setVisibility(8);
        h32Var.setOnTouchListener(new b02((byte) 1));
        i32 i32Var = new i32(this, context, vnbVar, (byte) 0);
        this.s = i32Var;
        i32Var.setSectionsType(2);
        i32Var.setVerticalScrollBarEnabled(false);
        td4 td4Var = new td4(hl.L(56.0f), 0, i32Var);
        this.y = td4Var;
        i32Var.setLayoutManager(td4Var);
        i32Var.setClipToPadding(false);
        m32 m32Var2 = new m32(this, context);
        this.x = m32Var2;
        i32Var.setAdapter(m32Var2);
        addView(i32Var, tre.c(-1.0f, -1));
        i32Var.setVisibility(8);
        i32 i32Var2 = new i32(this, context, vnbVar, (byte) 1);
        this.r = i32Var2;
        i32Var2.s1();
        setBlur3Capture(i32Var2);
        this.d = i32Var2;
        this.h = true;
        this.f = true;
        i32Var2.setSectionsType(2);
        i32Var2.setVerticalScrollBarEnabled(false);
        q22 q22Var = new q22(this, hl.L(56.0f) + hl.m, i32Var2, (byte) 1);
        this.F = q22Var;
        i32Var2.setLayoutManager(q22Var);
        i32Var2.setClipToPadding(false);
        i32Var2.setAdapter(this.w);
        addView(i32Var2, tre.c(-1.0f, -1));
        this.E = new t32(this, context);
        i32Var2.setOnScrollListener(new y(this, (byte) 19));
        i32Var2.setOnItemClickListener(new r69(this) {
            public final u32 b;

            {
                this.b = this;
            }

            @Override
            public final void e(int i5, View view) {
                ph4 ph4Var;
                byte b = r2;
                u32 u32Var = this.b;
                switch (b) {
                    case 0:
                        u32Var.Q(i5, view);
                        return;
                    default:
                        rh4 rh4Var = u32Var.I;
                        rh4Var.K0(true);
                        t32 t32Var = u32Var.E;
                        ArrayList arrayList = rh4Var.f3;
                        if (arrayList.isEmpty()) {
                            ph4Var = rh4.k3[i5];
                        } else {
                            ph4Var = (ph4) arrayList.get(i5);
                        }
                        n12 n12Var2 = t32Var.Y.b;
                        ArrayList arrayList2 = t32Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                if (ph4Var.b((ph4) arrayList2.get(i6))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(ph4Var);
                        n12Var2.U2.setSearchFilter(ph4Var);
                        n12Var2.U2.setSearchFieldText("");
                        t32Var.a0(null, null, true);
                        return;
                }
            }
        });
        i32Var2.setOnItemLongClickListener(new rd1(this, (byte) 16));
        rh4 rh4Var = new rh4(context, vnbVar);
        this.I = rh4Var;
        rh4Var.setOnItemClickListener(new r69(this) {
            public final u32 b;

            {
                this.b = this;
            }

            @Override
            public final void e(int i5, View view) {
                ph4 ph4Var;
                byte b = r2;
                u32 u32Var = this.b;
                switch (b) {
                    case 0:
                        u32Var.Q(i5, view);
                        return;
                    default:
                        rh4 rh4Var2 = u32Var.I;
                        rh4Var2.K0(true);
                        t32 t32Var = u32Var.E;
                        ArrayList arrayList = rh4Var2.f3;
                        if (arrayList.isEmpty()) {
                            ph4Var = rh4.k3[i5];
                        } else {
                            ph4Var = (ph4) arrayList.get(i5);
                        }
                        n12 n12Var2 = t32Var.Y.b;
                        ArrayList arrayList2 = t32Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                if (ph4Var.b((ph4) arrayList2.get(i6))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(ph4Var);
                        n12Var2.U2.setSearchFilter(ph4Var);
                        n12Var2.U2.setSearchFieldText("");
                        t32Var.a0(null, null, true);
                        return;
                }
            }
        });
        yob.h(aob.h5, vnbVar, rh4Var);
        addView(rh4Var, tre.e(-1, 44, 48));
        rh4Var.setTranslationY(-hl.L(44.0f));
        rh4Var.setVisibility(4);
        S();
        Z();
        X();
    }

    private int getTopForScroll() {
        i32 i32Var = this.r;
        View childAt = i32Var.getChildAt(0);
        f89 H = i32Var.H(childAt);
        int i = -i32Var.getPaddingTop();
        if (H != null && H.b() == 0) {
            return childAt.getTop() + i;
        }
        return i;
    }

    @Override
    public final void C(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u32.C(int, int):void");
    }

    @Override
    public final void D() {
        m32 m32Var = this.w;
        if (m32Var != null) {
            m32Var.f();
        }
        t32 t32Var = this.E;
        if (t32Var != null) {
            t32Var.f();
        }
    }

    @Override
    public final void H(f12 f12Var) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.w.f.clear();
        S();
        Z();
        X();
        this.b.U2.setTitle(ob6.M0(2131745385, null));
        this.H.setVisibility(0);
        this.F.g1(0, 0);
    }

    @Override
    public final void J() {
        this.r.A0(0);
    }

    @Override
    public final boolean K(final boolean z, final int i, int i2, final long j, final boolean z2) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (qg4 qg4Var : hashMap.keySet()) {
            arrayList.add((r47) hashMap.get(qg4Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        n12 n12Var = this.b;
        CharSequence[] charSequenceArr = {n12Var.V0().getText()};
        final ArrayList Y = ls6.d0(n12Var.G3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return jj.Y(n12Var.G3, n12Var.W0(), n12Var.S0() + arrayList2.size() + (!TextUtils.isEmpty(charSequence) ? 1 : 0), new pcc() {
            @Override
            public final void a(Object obj) {
                u32 u32Var = u32.this;
                u32Var.L = true;
                u32Var.R.k(arrayList2, charSequence, Y, arrayList, z, i, j, z2, ((Long) obj).longValue());
                u32Var.b.a(true);
            }
        }, 0L);
    }

    public final void O(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File j = xb4.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    O(file2);
                } else if (!file2.equals(j)) {
                    n32 n32Var = new n32();
                    n32Var.b = file2.getName();
                    n32Var.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    n32Var.d = str;
                    n32Var.c = hl.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        n32Var.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(n32Var);
                }
            }
        }
    }

    public final boolean P(File file) {
        int i;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(xb4.D(file));
        if (file.length() != 0 && mimeTypeFromExtension != null && wm9.i.contains(mimeTypeFromExtension)) {
            if (file.length() > uc7.s1(yac.t0).k4.Z0.f()) {
                new d31(this.b.c, null).u(ob6.a0("TooLargeError", null, 2131743696, new Object[0]), ob6.a0("ErrorRingtoneSizeTooBig", null, 2131751067, Integer.valueOf(uc7.s1(yac.t0).k4.Z0.f() / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(a.b, Uri.fromFile(file));
                i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i = Integer.MAX_VALUE;
            }
            if (i <= uc7.s1(yac.t0).k4.a1.f() * 1000) {
                return true;
            }
            new d31(this.b.c, null).u(ob6.a0("TooLongError", null, 2131743695, new Object[0]), ob6.a0("ErrorRingtoneDurationTooLong", null, 2131751069, Integer.valueOf(uc7.s1(yac.t0).k4.a1.f())), null).j();
            return false;
        }
        new d31(this.b.c, null).u(ob6.a0("InvalidFormatError", null, 2131748935, new Object[0]), ob6.M0(2131751068, null), null).j();
        return false;
    }

    public final void Q(int i, View view) {
        Object O;
        boolean z;
        boolean z2;
        int i2;
        i32 i32Var = this.r;
        j79 adapter = i32Var.getAdapter();
        m32 m32Var = this.w;
        if (adapter == m32Var) {
            O = m32Var.E(i);
        } else {
            t32 t32Var = this.E;
            O = t32Var.O(t32Var.S(i), t32Var.Q(i));
        }
        if (O instanceof n32) {
            n32 n32Var = (n32) O;
            File file = n32Var.f;
            if (Build.VERSION.SDK_INT >= 30) {
                z = Environment.isExternalStorageManager();
            } else {
                z = false;
            }
            boolean z3 = f11.b;
            zu1 zu1Var = null;
            n12 n12Var = this.b;
            if (!z3 && (((i2 = n32Var.a) == 2131231076 || i2 == 2131231074) && !z)) {
                a12 a12Var = n12Var.o3;
                int i3 = n12Var.G3;
                if (n12Var.E3 != null && n12Var.E1 - n12Var.F1 < 0) {
                    if (!uc7.s1(i3).M3() && uc7.s1(i3).k4.p1.f() > n12Var.F1) {
                        new d31(a12Var, n12Var.J0).f(uc7.s1(i3).k4.p1.f(), new vq0(n12Var, (byte) 5)).j();
                        return;
                    } else {
                        new d31(a12Var, n12Var.J0).t(ob6.M0(2131743695, null), n12Var.J0).j();
                        return;
                    }
                }
                this.R.z();
                return;
            } else if (file == null) {
                int i4 = n32Var.a;
                if (i4 == 2131231073) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    e eVar = n12Var.Z1;
                    if (eVar instanceof zu1) {
                        zu1Var = (zu1) eVar;
                    }
                    zu1 zu1Var2 = zu1Var;
                    do6 do6Var = MediaController.a2;
                    if (zu1Var2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    l98 l98Var = new l98(0, do6Var, hashMap, arrayList, 0, z2, zu1Var2, false);
                    l98Var.m0 = true;
                    l98Var.t0 = new rx6(this, hashMap, arrayList);
                    l98Var.j0(this.W, false);
                    e eVar2 = n12Var.Z1;
                    if (eVar2 != null) {
                        eVar2.presentFragment(l98Var);
                    } else {
                        e Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(l98Var);
                        }
                    }
                    n12Var.a(true);
                    return;
                } else if (i4 == 2131231075) {
                    k32 k32Var = this.R;
                    if (k32Var != null) {
                        k32Var.S();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = getTopForScroll();
                    U();
                    l32 l32Var = (l32) qd4.l(1, m32Var.f);
                    n12Var.U2.setTitle(l32Var.b);
                    File file2 = l32Var.a;
                    if (file2 != null) {
                        R(file2);
                    } else {
                        S();
                    }
                    Z();
                    this.F.g1(0, topForScroll);
                    V(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = i32Var.getChildAt(0);
                f89 H = i32Var.H(childAt);
                if (H != null) {
                    H.b();
                    childAt.getTop();
                    obj.a = this.P;
                    obj.b = n12Var.U2.getTitle();
                    U();
                    m32Var.f.add(obj);
                    if (!R(file)) {
                        m32Var.f.remove((Object) obj);
                        return;
                    }
                    V(1);
                    n12Var.U2.setTitle(n32Var.b);
                    return;
                }
                return;
            } else {
                T(view, n32Var);
                return;
            }
        }
        T(view, O);
    }

    public final boolean R(File file) {
        File file2;
        m32 m32Var;
        String str;
        this.O = false;
        boolean canRead = file.canRead();
        i32 i32Var = this.r;
        String str2 = null;
        m32 m32Var2 = this.w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.P = file;
                m32Var2.e.clear();
                Environment.getExternalStorageState();
                hl.y(i32Var);
                this.V = true;
                m32Var2.f();
                return true;
            }
            W(ob6.M0(2131754706, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                W(ob6.M0(2131743534, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = m32Var2.e;
            ArrayList arrayList2 = m32Var2.f;
            ArrayList arrayList3 = m32Var2.e;
            arrayList.clear();
            File j = xb4.j(6);
            int i = 0;
            while (i < listFiles.length) {
                File file3 = listFiles[i];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j)) {
                    m32Var = m32Var2;
                } else {
                    n32 n32Var = new n32();
                    n32Var.b = file3.getName();
                    n32Var.f = file3;
                    if (file3.isDirectory()) {
                        n32Var.a = 2131231072;
                        n32Var.c = ob6.M0(2131750645, str2);
                        m32Var = m32Var2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        n32Var.d = str;
                        m32Var = m32Var2;
                        n32Var.c = hl.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            n32Var.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(n32Var);
                }
                i++;
                m32Var2 = m32Var;
                str2 = null;
            }
            m32 m32Var3 = m32Var2;
            n32 n32Var2 = new n32();
            n32Var2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((l32) c00.g(1, arrayList2)).a;
                file2 = null;
                if (file4 == null) {
                    n32Var2.c = ob6.M0(2131750645, null);
                } else {
                    n32Var2.c = file4.toString();
                }
            } else {
                file2 = null;
                n32Var2.c = ob6.M0(2131750645, null);
            }
            n32Var2.a = 2131231072;
            n32Var2.f = file2;
            arrayList3.add(0, n32Var2);
            if (this.P != null) {
                Collections.sort(m32Var3.e, new e32(this, (byte) 0));
            }
            Z();
            hl.y(i32Var);
            this.V = true;
            int topForScroll = getTopForScroll();
            m32Var3.f();
            this.F.g1(0, topForScroll);
            return true;
        } catch (Exception e) {
            W(e.getLocalizedMessage());
            return false;
        }
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u32.S():void");
    }

    public final boolean T(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u32.T(android.view.View, java.lang.Object):boolean");
    }

    public final void U() {
        View m;
        m32 m32Var = this.x;
        m32Var.f.clear();
        ArrayList arrayList = m32Var.f;
        m32 m32Var2 = this.w;
        arrayList.addAll(m32Var2.f);
        ArrayList arrayList2 = m32Var.e;
        arrayList2.clear();
        arrayList2.addAll(m32Var2.e);
        ArrayList arrayList3 = (ArrayList) m32Var.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) m32Var2.h);
        m32Var.f();
        i32 i32Var = this.s;
        i32Var.setVisibility(0);
        i32 i32Var2 = this.r;
        i32Var.setPadding(i32Var2.getPaddingLeft(), i32Var2.getPaddingTop(), i32Var2.getPaddingRight(), i32Var2.getPaddingBottom());
        q22 q22Var = this.F;
        int K0 = q22Var.K0();
        if (K0 >= 0 && (m = q22Var.m(K0)) != null) {
            this.y.g1(K0, m.getTop() - i32Var.getPaddingTop());
        }
    }

    public final void V(final int i) {
        i32 i32Var;
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
            i32Var = this.r;
            if (i2 < childCount) {
                if (getChildAt(i2) == i32Var) {
                    break;
                }
                i2++;
            } else {
                i2 = 0;
                break;
            }
        }
        i32 i32Var2 = this.s;
        if (i == 1) {
            L = hl.L(150.0f);
            i32Var2.setAlpha(1.0f);
            i32Var2.setScaleX(1.0f);
            i32Var2.setScaleY(1.0f);
            i32Var2.setTranslationX(0.0f);
            removeView(i32Var2);
            addView(i32Var2, i2);
            i32Var2.setVisibility(0);
            i32Var.setTranslationX(L);
            i32Var.setAlpha(0.0f);
            ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.g0 = ofFloat;
        } else {
            L = hl.L(150.0f);
            i32Var.setAlpha(0.0f);
            i32Var.setScaleX(0.95f);
            i32Var.setScaleY(0.95f);
            i32Var2.setScaleX(1.0f);
            i32Var2.setScaleY(1.0f);
            i32Var2.setTranslationX(0.0f);
            i32Var2.setAlpha(1.0f);
            removeView(i32Var2);
            addView(i32Var2, i2 + 1);
            i32Var2.setVisibility(0);
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g0 = ofFloat;
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                u32 u32Var = u32.this;
                i32 i32Var3 = u32Var.r;
                i32 i32Var4 = u32Var.s;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                byte b = i;
                float f = L * floatValue;
                if (b == 1) {
                    i32Var3.setTranslationX(f);
                    i32Var3.setAlpha(1.0f - floatValue);
                    i32Var3.invalidate();
                    i32Var4.setAlpha(floatValue);
                    float f2 = (floatValue * 0.05f) + 0.95f;
                    i32Var4.setScaleX(f2);
                    i32Var4.setScaleY(f2);
                    return;
                }
                i32Var4.setTranslationX(f);
                i32Var4.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                i32Var4.invalidate();
                i32Var3.setAlpha(floatValue);
                float f3 = (floatValue * 0.05f) + 0.95f;
                i32Var3.setScaleX(f3);
                i32Var3.setScaleY(f3);
                i32Var4.invalidate();
            }
        });
        this.g0.addListener(new jb1(this, (byte) 15));
        ValueAnimator valueAnimator2 = this.g0;
        if (i == 1) {
            valueAnimator2.setDuration(220L);
        } else {
            valueAnimator2.setDuration(200L);
        }
        this.g0.setInterpolator(k43.f);
        this.g0.start();
    }

    public final void W(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = ob6.M0(2131689472, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = str;
        c00.u(null, 2131747558, alertDialog$Builder, null);
    }

    public final void X() {
        j79 adapter = this.r.getAdapter();
        int i = 0;
        boolean z = true;
        t32 t32Var = this.E;
        if (adapter != t32Var ? this.w.b() != 1 : !(t32Var.s.isEmpty() && t32Var.Q.isEmpty())) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        this.M.setVisibility(i);
        Y();
    }

    public final void Y() {
        View childAt;
        h32 h32Var = this.M;
        if (h32Var.getVisibility() != 0 || (childAt = this.r.getChildAt(0)) == null) {
            return;
        }
        float translationY = h32Var.getTranslationY();
        this.N = (childAt.getTop() + (h32Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        h32Var.setTranslationY(translationY);
    }

    public final void Z() {
        int i;
        s7 s7Var = this.G;
        if (s7Var != null && !s7Var.w()) {
            if (!this.O && !this.w.f.isEmpty()) {
                i = 8;
            } else {
                i = 0;
            }
            s7Var.setVisibility(i);
        }
    }

    @Override
    public final void d() {
        s7 s7Var = this.G;
        if (s7Var != null) {
            try {
                if (s7Var.getSearchField() != null) {
                    s7Var.getSearchField().setCursorColor(aob.v0(aob.j5, this.a));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return hl.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        i32 i32Var = this.r;
        if (i32Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        View childAt = i32Var.getChildAt(0);
        n69 n69Var = (n69) i32Var.H(childAt);
        int y = ((((int) childAt.getY()) - hl.m) - hl.L(4.0f)) - hl.L(8.0f);
        if (y > 0 && n69Var != null && n69Var.b() == 0) {
            i = y;
        }
        if (y < 0 || n69Var == null || n69Var.b() != 0) {
            y = i;
        }
        return hl.L(13.0f) + y;
    }

    @Override
    public int getFirstOffset() {
        return hl.L(5.0f) + getListTopPadding();
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
    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        arrayList.add(new apb(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.j5));
        int i = aob.A5;
        i32 i32Var = this.r;
        arrayList.add(new apb(i32Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(i32Var, 32, new Class[]{rca.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.b7));
        arrayList.add(new apb(i32Var, 48, new Class[]{rca.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        arrayList.add(new apb(i32Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i6));
        arrayList.add(new apb(i32Var, 0, new Class[]{View.class}, aob.j0, (Drawable[]) null, (zob) null, aob.d7));
        arrayList.add(new apb(i32Var, 4, new Class[]{zea.class}, new String[]{"nameTextView"}, (Drawable[]) null, (zob) null, aob.G6));
        arrayList.add(new apb(i32Var, 4, new Class[]{zea.class}, new String[]{"dateTextView"}, (Drawable[]) null, (zob) null, aob.A6));
        arrayList.add(new apb(i32Var, 8192, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.i7));
        arrayList.add(new apb(i32Var, 16384, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.k7));
        arrayList.add(new apb(i32Var, 8, new Class[]{zea.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (zob) null, aob.qj));
        arrayList.add(new apb(i32Var, 40, new Class[]{zea.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (zob) null, aob.rj));
        arrayList.add(new apb(i32Var, 4, new Class[]{zea.class}, new String[]{"extTextView"}, (Drawable[]) null, (zob) null, aob.sj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        m32 m32Var = this.w;
        if (m32Var.f.size() <= 0) {
            return false;
        }
        U();
        l32 l32Var = (l32) qd4.l(1, m32Var.f);
        this.b.U2.setTitle(l32Var.b);
        int topForScroll = getTopForScroll();
        File file = l32Var.a;
        if (file != null) {
            R(file);
        } else {
            S();
        }
        Z();
        this.F.g1(0, topForScroll);
        V(2);
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Y();
    }

    @Override
    public final void p() {
        try {
            if (this.Q) {
                a.b.unregisterReceiver(this.f0);
                this.Q = false;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.b.U2.o(true);
        s6 u = this.b.U2.u();
        u.removeView(this.H);
        u.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z) {
        this.a0 = z;
    }

    public void setDelegate(k32 k32Var) {
        this.R = k32Var;
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
            xea.I0 = !xea.I0;
            SharedPreferences.Editor edit = uc7.e1().edit();
            edit.putBoolean("sortFilesByName", xea.I0);
            edit.apply();
            this.d0 = xea.I0;
            m32 m32Var = this.w;
            Collections.sort((ArrayList) m32Var.h, new e32(this, (byte) 1));
            if (this.P != null) {
                Collections.sort(m32Var.e, new e32(this, (byte) 0));
            }
            m32Var.f();
            if (this.d0) {
                i2 = 2131232107;
            } else {
                i2 = 2131232106;
            }
            this.H.setIcon(i2);
        }
    }
}
