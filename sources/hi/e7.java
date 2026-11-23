package hi;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.gp;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.si;
public final class e7 extends org.telegram.ui.Components.ra implements fs, org.telegram.messenger.y5, te.b {
    public boolean A2;
    public boolean B2;
    public int C2;
    public String D2;
    public int E2;
    public final z6 F2;
    public boolean G2;
    public final te.a T1;
    public final int U1;
    public boolean V1;
    public final e7 W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final gp f14375a2;
    public final w10 f14376b2;
    public fj f14377c2;
    public boolean d2;
    public boolean f14378e2;
    public final FrameLayout f14379f2;
    public final si f14380g2;
    public final dh.g f14381h2;
    public final ui.c f14382i2;
    public final dh.c f14383j2;
    public final b7 f14384k2;
    public b51 f14385l2;
    public fj f14386m2;
    public String f14387n2;
    public int f14388o2;
    public boolean f14389p2;
    public boolean f14390q2;
    public boolean f14391r2;
    public String f14392s2;
    public int f14393t2;
    public final z6 f14394u2;
    public String f14395v2;
    public boolean f14396w2;
    public boolean f14397x2;
    public boolean f14398y2;
    public TLRPC.User f14399z2;

    public e7(Context context, boolean z10, e7 e7Var, w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(2, context, i6Var, true);
        int L;
        kr krVar = kr.h;
        this.T1 = new te.a(0, this, krVar, 380L, false);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f14393t2 = -1;
        this.f14394u2 = new Runnable(this) {
            public final e7 f15919b;

            {
                this.f15919b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        e7 e7Var2 = this.f15919b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f27013b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i7 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    query.getInt(0);
                                    String string = query.getString(r42);
                                    String string2 = query.getString(2);
                                    String string3 = query.getString(3);
                                    int i10 = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(string3);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = r42;
                                    tL_message.f28513id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = i10.i(e7Var2.f30223a).e();
                                        tL_peerUser.user_id = e10;
                                        peer.user_id = e10;
                                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                        tL_message.message = "";
                                        tL_message.attachPath = string3;
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                        tL_message.media = tL_messageMediaDocument;
                                        tL_messageMediaDocument.flags |= 3;
                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                        tL_message.flags |= 768;
                                        String D = org.telegram.messenger.w7.D(file);
                                        TLRPC.Document document = tL_message.media.document;
                                        document.f28498id = 0L;
                                        document.access_hash = 0L;
                                        document.file_reference = new byte[0];
                                        document.date = tL_message.date;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("audio/");
                                        if (D.length() <= 0) {
                                            D = "mp3";
                                        }
                                        sb2.append(D);
                                        document.mime_type = sb2.toString();
                                        tL_message.media.document.size = (int) file.length();
                                        tL_message.media.document.dc_id = 0;
                                        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                        tL_documentAttributeAudio.duration = i10;
                                        tL_documentAttributeAudio.title = string2;
                                        tL_documentAttributeAudio.performer = string;
                                        tL_documentAttributeAudio.flags |= 3;
                                        tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                        tL_documentAttributeFilename.file_name = file.getName();
                                        tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                        arrayList.add(new fj(e7Var2.f30223a, tL_message, false, true));
                                        i7--;
                                        query = cursor;
                                        r42 = 1;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Throwable th3 = th;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor = query;
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new c(14, e7Var2, arrayList));
                        return;
                    case 1:
                        this.f15919b.i1();
                        return;
                    default:
                        this.f15919b.h1();
                        return;
                }
            }
        };
        this.C2 = -1;
        this.E2 = -2000000000;
        this.F2 = new Runnable(this) {
            public final e7 f15919b;

            {
                this.f15919b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        e7 e7Var2 = this.f15919b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f27013b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i7 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    query.getInt(0);
                                    String string = query.getString(r42);
                                    String string2 = query.getString(2);
                                    String string3 = query.getString(3);
                                    int i10 = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(string3);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = r42;
                                    tL_message.f28513id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = i10.i(e7Var2.f30223a).e();
                                        tL_peerUser.user_id = e10;
                                        peer.user_id = e10;
                                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                        tL_message.message = "";
                                        tL_message.attachPath = string3;
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                        tL_message.media = tL_messageMediaDocument;
                                        tL_messageMediaDocument.flags |= 3;
                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                        tL_message.flags |= 768;
                                        String D = org.telegram.messenger.w7.D(file);
                                        TLRPC.Document document = tL_message.media.document;
                                        document.f28498id = 0L;
                                        document.access_hash = 0L;
                                        document.file_reference = new byte[0];
                                        document.date = tL_message.date;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("audio/");
                                        if (D.length() <= 0) {
                                            D = "mp3";
                                        }
                                        sb2.append(D);
                                        document.mime_type = sb2.toString();
                                        tL_message.media.document.size = (int) file.length();
                                        tL_message.media.document.dc_id = 0;
                                        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                        tL_documentAttributeAudio.duration = i10;
                                        tL_documentAttributeAudio.title = string2;
                                        tL_documentAttributeAudio.performer = string;
                                        tL_documentAttributeAudio.flags |= 3;
                                        tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                        tL_documentAttributeFilename.file_name = file.getName();
                                        tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                        arrayList.add(new fj(e7Var2.f30223a, tL_message, false, true));
                                        i7--;
                                        query = cursor;
                                        r42 = 1;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Throwable th3 = th;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor = query;
                                }
                            }
                            query.close();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        org.telegram.messenger.g0.g3(new c(14, e7Var2, arrayList));
                        return;
                    case 1:
                        this.f15919b.i1();
                        return;
                    default:
                        this.f15919b.h1();
                        return;
                }
            }
        };
        this.f39253v1 = 0.35f;
        O();
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-20.0f);
        this.V1 = z10;
        this.U1 = org.telegram.messenger.a6.q(this.f30223a).k();
        this.W1 = e7Var;
        this.f14376b2 = w10Var;
        ui.c d = this.Y0.d(new a7(this));
        this.f14382i2 = d;
        if (Build.VERSION.SDK_INT >= 31 && bz.f()) {
            dh.g gVar = new dh.g(false);
            this.f14381h2 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(d);
            fVar.f59132f = d;
            fVar.d = gVar;
            fVar.f59131e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f14383j2 = cVar;
            cVar.f8373k = true;
            if (pc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8368e = L;
            cVar.f8372j = this.Y0;
        } else {
            this.f14381h2 = null;
            this.f14383j2 = new dh.c(d, d, d);
        }
        this.f14384k2 = new b7(this, 0);
        int i7 = org.telegram.ui.ActionBar.n6.f29394a7;
        si siVar = new si(i7, context, i6Var);
        this.f14380g2 = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14379f2 = frameLayout;
        c10 c10Var = new c10(context, i6Var);
        c10Var.f33883r.setOnFocusChangeListener(new d7(this, 0));
        c10Var.f33886x = true;
        c10Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        c10Var.updateColors();
        c10Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        c10Var.f33883r.addTextChangedListener(new ah.j(this, 7));
        c10Var.f33883r.setHint(gd.N0(2131745640, null));
        frameLayout.addView(siVar, c8.na.g());
        frameLayout.addView(c10Var, c8.na.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        c10Var.setupBlurredBackground(this.f14383j2.c(c10Var, c8.j0.o(i6Var), false));
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f30261u0, 0, org.telegram.messenger.g0.L(8.0f) + this.f30261u0, 0);
        this.f30226b.addView(frameLayout, c8.na.e(-1, -2, 55));
        w0(i7);
        ek0 ek0Var = this.f39246o1;
        int i10 = this.f30261u0;
        ek0Var.setPadding(i10, 0, i10, 0);
        this.f39246o1.r1();
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(krVar);
        lVar.n(350L);
        this.f39246o1.setItemAnimator(lVar);
        if (!z10) {
            int i11 = this.f30223a;
            gp gpVar = new gp(i11, i10.i(i11).e());
            this.f14375a2 = gpVar;
            gpVar.b();
            i1();
            h1();
        } else {
            this.f14375a2 = null;
            if (this.V1 && !this.G2) {
                this.G2 = true;
                Utilities.f22877e.c(new Runnable(this) {
                    public final e7 f15919b;

                    {
                        this.f15919b = this;
                    }

                    @Override
                    public final void run() {
                        Cursor cursor;
                        switch (r2) {
                            case 0:
                                e7 e7Var2 = this.f15919b;
                                String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                                ArrayList arrayList = new ArrayList();
                                ?? r42 = 1;
                                try {
                                    Cursor query = org.telegram.messenger.t0.f27013b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                                    int i72 = -2000000000;
                                    while (query.moveToNext()) {
                                        try {
                                            query.getInt(0);
                                            String string = query.getString(r42);
                                            String string2 = query.getString(2);
                                            String string3 = query.getString(3);
                                            int i102 = (int) (query.getLong(4) / 1000);
                                            query.getString(5);
                                            File file = new File(string3);
                                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                            tL_message.out = r42;
                                            tL_message.f28513id = i72;
                                            tL_message.peer_id = new TLRPC.TL_peerUser();
                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser;
                                            TLRPC.Peer peer = tL_message.peer_id;
                                            cursor = query;
                                            try {
                                                long e10 = i10.i(e7Var2.f30223a).e();
                                                tL_peerUser.user_id = e10;
                                                peer.user_id = e10;
                                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                                tL_message.message = "";
                                                tL_message.attachPath = string3;
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                                tL_message.media = tL_messageMediaDocument;
                                                tL_messageMediaDocument.flags |= 3;
                                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                                tL_message.flags |= 768;
                                                String D = org.telegram.messenger.w7.D(file);
                                                TLRPC.Document document = tL_message.media.document;
                                                document.f28498id = 0L;
                                                document.access_hash = 0L;
                                                document.file_reference = new byte[0];
                                                document.date = tL_message.date;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("audio/");
                                                if (D.length() <= 0) {
                                                    D = "mp3";
                                                }
                                                sb2.append(D);
                                                document.mime_type = sb2.toString();
                                                tL_message.media.document.size = (int) file.length();
                                                tL_message.media.document.dc_id = 0;
                                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                                tL_documentAttributeAudio.duration = i102;
                                                tL_documentAttributeAudio.title = string2;
                                                tL_documentAttributeAudio.performer = string;
                                                tL_documentAttributeAudio.flags |= 3;
                                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                                tL_documentAttributeFilename.file_name = file.getName();
                                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                                arrayList.add(new fj(e7Var2.f30223a, tL_message, false, true));
                                                i72--;
                                                query = cursor;
                                                r42 = 1;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Throwable th3 = th;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor = query;
                                        }
                                    }
                                    query.close();
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                                org.telegram.messenger.g0.g3(new c(14, e7Var2, arrayList));
                                return;
                            case 1:
                                this.f15919b.i1();
                                return;
                            default:
                                this.f15919b.h1();
                                return;
                        }
                    }
                });
            }
        }
        this.f39246o1.setOnScrollListener(new bi.v1(this, 16));
        this.f39246o1.setOnItemClickListener(new bi.u1(this, w10Var, i6Var, 2));
        this.Y0.b(this.f39246o1);
        this.Y0.i(this.f30226b);
        ri.q qVar = this.Y0;
        qVar.f56817a = new a7(this);
        qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static boolean j1(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !i5.c.B(" ", str, lowerCase)) {
                String M3 = org.telegram.messenger.g0.M3(lowerCase);
                if (!M3.startsWith(str2) && !M3.contains(" ".concat(str2))) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            si siVar = this.f14380g2;
            siVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            siVar.setVisibility(i10);
        }
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.f30223a, 0, false, new y6(this, 0), this.J0);
        this.f14385l2 = b51Var;
        b51Var.f33631r = false;
        return b51Var;
    }

    @Override
    public final void N(String str) {
        fj fjVar = this.f14377c2;
        if (fjVar != null && TextUtils.equals(fjVar.S0(), str)) {
            this.f14376b2.a(this.f14377c2);
            e7 e7Var = this.W1;
            if (e7Var != null) {
                e7Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final CharSequence P0() {
        return gd.N0(2131744364, null);
    }

    @Override
    public final void X0(Canvas canvas, View view) {
        k1();
        super.X0(canvas, view);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.W3) {
            this.f14385l2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f14386m2 != null && MediaController.B().I(this.f14386m2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.f14386m2 = null;
    }

    public final int e1(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i7) {
        String lowerCase;
        int i10;
        int i11 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f14387n2;
            if (str2 == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase();
            }
            String M3 = org.telegram.messenger.g0.M3(lowerCase);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                fj fjVar = (fj) obj;
                if (!z10) {
                    fjVar.K5(this.f14387n2, true);
                    arrayList3.add(fjVar);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.Y1) {
                    String y12 = fjVar.y1(true);
                    String w12 = fjVar.w1(true);
                    if (j1(lowerCase, M3, y12) || j1(lowerCase, M3, w12)) {
                        fjVar.K5(this.f14387n2, true);
                        arrayList3.add(fjVar);
                    }
                } else {
                    fjVar.K5(null, true);
                    arrayList3.add(fjVar);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(n41.C(null));
                    i10 = org.telegram.messenger.g0.L(12.0f);
                } else {
                    i10 = 0;
                }
                this.f14385l2.V();
                arrayList.add(n41.u(str));
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    di.ta taVar = new di.ta(this, 1);
                    int i13 = org.telegram.ui.Cells.f7.f30707b;
                    n41 K = n41.K(org.telegram.ui.Cells.f7.class);
                    K.H = (fj) obj2;
                    K.I = taVar;
                    arrayList.add(K);
                    i10 += org.telegram.messenger.g0.L(56.0f);
                }
                if (z11) {
                    arrayList.add(n41.p(4));
                    arrayList.add(n41.p(4));
                    arrayList.add(n41.p(4));
                    i10 += org.telegram.messenger.g0.L(56.0f) * 3;
                }
                if (z12 && !z11) {
                    n41 c10 = n41.c(i7, 2131230871, gd.N0(2131745143, null));
                    c10.f37660r = true;
                    arrayList.add(c10);
                    i10 += org.telegram.messenger.g0.L(50.0f);
                }
                this.f14385l2.U();
                return i10;
            }
        }
        return 0;
    }

    public final void f1() {
        if (this.C2 >= 0) {
            ConnectionsManager.getInstance(this.f30223a).cancelRequest(this.C2, true);
        }
        this.C2 = -1;
        this.f14395v2 = "";
        this.f14396w2 = false;
        this.Z1.clear();
        this.f14397x2 = false;
        this.f14398y2 = false;
    }

    public final void g1() {
        if (this.f14393t2 >= 0) {
            ConnectionsManager.getInstance(this.f30223a).cancelRequest(this.f14393t2, true);
        }
        this.f14393t2 = -1;
        this.f14388o2 = 0;
        this.Y1.clear();
        this.f14390q2 = false;
        this.f14391r2 = false;
    }

    @Override
    public final int getObserverTag() {
        return this.U1;
    }

    public final void h1() {
        TLRPC.User user;
        String str = ((org.telegram.messenger.n0) mp.u1(this.f30223a).A7.K.f15482b).f25966c;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.D2;
            String str3 = this.f14387n2;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                f1();
            }
            if (!this.f14397x2 && !TextUtils.isEmpty(this.f14387n2) && this.f14387n2.length() >= 3) {
                ArrayList arrayList = this.Z1;
                if (arrayList.isEmpty() || this.f14396w2) {
                    if (this.f14399z2 == null) {
                        TLObject h22 = mp.u1(this.f30223a).h2(str);
                        if (h22 instanceof TLRPC.User) {
                            user = (TLRPC.User) h22;
                        } else {
                            user = null;
                        }
                        this.f14399z2 = user;
                    }
                    if (this.f14399z2 == null) {
                        if (!this.A2 && !this.B2) {
                            this.A2 = true;
                            mp.u1(this.f30223a).f2().a(str, null, new c7(this, 0));
                            return;
                        }
                        return;
                    }
                    this.f14397x2 = true;
                    TLRPC.User f10 = i10.i(this.f30223a).f();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = mp.u1(this.f30223a).s1(this.f14399z2);
                    tL_messages_getInlineBotResults.peer = mp.p1(f10);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.f14395v2) == null) ? "" : "";
                    String str5 = this.f14387n2;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.D2 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.C2 = ConnectionsManager.getInstance(this.f30223a).sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new y6(this, 1));
                    this.f14385l2.O(true);
                }
            }
        }
    }

    public final void i1() {
        if (!this.V1) {
            String str = this.f14392s2;
            String str2 = this.f14387n2;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                g1();
            }
            if (!this.f14390q2) {
                ArrayList arrayList = this.Y1;
                if (!arrayList.isEmpty() && !this.f14389p2) {
                    return;
                }
                this.f14390q2 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f14387n2;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f14392s2 = str3;
                tL_messages_searchGlobal.f28605q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    fj fjVar = (fj) i5.c.h(1, arrayList);
                    tL_messages_searchGlobal.offset_id = fjVar.e1();
                    tL_messages_searchGlobal.offset_rate = this.f14388o2;
                    tL_messages_searchGlobal.offset_peer = mp.u1(this.f30223a).l1(fj.B1(fjVar.f24073k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f14393t2 = ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_messages_searchGlobal, new ai.b1(this, 10));
                this.f14385l2.O(true);
            }
        }
    }

    public final void k1() {
        float f10 = org.telegram.messenger.g0.f24226q.y;
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.f39246o1;
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        this.f14379f2.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m, f10));
        if (f10 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m) {
            z10 = true;
        }
        this.T1.a(z10, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30223a).c(this, ks.W3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30223a).n(this, ks.W3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            ui.c cVar = this.f14382i2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void G(float f10, int i7) {
    }

    @Override
    public final void i(long j3, long j10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
