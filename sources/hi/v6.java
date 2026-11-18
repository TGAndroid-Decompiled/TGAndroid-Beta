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
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.z41;
public final class v6 extends org.telegram.ui.Components.sa implements fs, org.telegram.messenger.y5, te.b {
    public boolean A2;
    public boolean B2;
    public int C2;
    public String D2;
    public int E2;
    public final q6 F2;
    public boolean G2;
    public final te.a T1;
    public final int U1;
    public boolean V1;
    public final v6 W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final gp f15580a2;
    public final x10 f15581b2;
    public fj f15582c2;
    public boolean d2;
    public boolean f15583e2;
    public final FrameLayout f15584f2;
    public final ri f15585g2;
    public final dh.g f15586h2;
    public final ui.c f15587i2;
    public final dh.c f15588j2;
    public final s6 f15589k2;
    public z41 f15590l2;
    public fj f15591m2;
    public String f15592n2;
    public int f15593o2;
    public boolean f15594p2;
    public boolean f15595q2;
    public boolean f15596r2;
    public String f15597s2;
    public int f15598t2;
    public final q6 f15599u2;
    public String f15600v2;
    public boolean f15601w2;
    public boolean f15602x2;
    public boolean f15603y2;
    public TLRPC.User f15604z2;

    public v6(Context context, boolean z10, v6 v6Var, x10 x10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(2, context, i6Var, true);
        int L;
        lr lrVar = lr.h;
        this.T1 = new te.a(0, this, lrVar, 380L, false);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f15598t2 = -1;
        this.f15599u2 = new Runnable(this) {
            public final v6 f15279b;

            {
                this.f15279b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        v6 v6Var2 = this.f15279b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f26915b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                    tL_message.f28426id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = j10.i(v6Var2.f30189a).e();
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
                                        document.f28411id = 0L;
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
                                        arrayList.add(new fj(v6Var2.f30189a, tL_message, false, true));
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
                        org.telegram.messenger.g0.g3(new r1(11, v6Var2, arrayList));
                        return;
                    case 1:
                        this.f15279b.i1();
                        return;
                    default:
                        this.f15279b.h1();
                        return;
                }
            }
        };
        this.C2 = -1;
        this.E2 = -2000000000;
        this.F2 = new Runnable(this) {
            public final v6 f15279b;

            {
                this.f15279b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        v6 v6Var2 = this.f15279b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f26915b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                    tL_message.f28426id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = j10.i(v6Var2.f30189a).e();
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
                                        document.f28411id = 0L;
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
                                        arrayList.add(new fj(v6Var2.f30189a, tL_message, false, true));
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
                        org.telegram.messenger.g0.g3(new r1(11, v6Var2, arrayList));
                        return;
                    case 1:
                        this.f15279b.i1();
                        return;
                    default:
                        this.f15279b.h1();
                        return;
                }
            }
        };
        this.f39541v1 = 0.35f;
        O();
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-20.0f);
        this.V1 = z10;
        this.U1 = org.telegram.messenger.a6.q(this.f30189a).k();
        this.W1 = v6Var;
        this.f15581b2 = x10Var;
        ui.c d = this.Y0.d(new r6(this));
        this.f15587i2 = d;
        if (Build.VERSION.SDK_INT >= 31 && bz.f()) {
            dh.g gVar = new dh.g(false);
            this.f15586h2 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(d);
            fVar.f59007f = d;
            fVar.d = gVar;
            fVar.f59006e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f15588j2 = cVar;
            cVar.f8382k = true;
            if (pc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8377e = L;
            cVar.f8381j = this.Y0;
        } else {
            this.f15586h2 = null;
            this.f15588j2 = new dh.c(d, d, d);
        }
        this.f15589k2 = new s6(this, 0);
        int i7 = org.telegram.ui.ActionBar.n6.f29339a7;
        ri riVar = new ri(i7, context, i6Var);
        this.f15585g2 = riVar;
        riVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15584f2 = frameLayout;
        c10 c10Var = new c10(context, i6Var);
        c10Var.f33845r.setOnFocusChangeListener(new u6(this, 0));
        c10Var.f33848x = true;
        c10Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        c10Var.updateColors();
        c10Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        c10Var.f33845r.addTextChangedListener(new ah.j(this, 7));
        c10Var.f33845r.setHint(gd.M0(2131745641, null));
        frameLayout.addView(riVar, c8.ma.g());
        frameLayout.addView(c10Var, c8.ma.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        c10Var.setupBlurredBackground(this.f15588j2.c(c10Var, c8.i0.o(i6Var), false));
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f30227u0, 0, org.telegram.messenger.g0.L(8.0f) + this.f30227u0, 0);
        this.f30192b.addView(frameLayout, c8.ma.e(-1, -2, 55));
        w0(i7);
        ck0 ck0Var = this.f39534o1;
        int i10 = this.f30227u0;
        ck0Var.setPadding(i10, 0, i10, 0);
        this.f39534o1.r1();
        v4.k kVar = new v4.k();
        kVar.f59151m = false;
        kVar.C = false;
        kVar.o(lrVar);
        kVar.n(350L);
        this.f39534o1.setItemAnimator(kVar);
        if (!z10) {
            int i11 = this.f30189a;
            gp gpVar = new gp(i11, j10.i(i11).e());
            this.f15580a2 = gpVar;
            gpVar.b();
            i1();
            h1();
        } else {
            this.f15580a2 = null;
            if (this.V1 && !this.G2) {
                this.G2 = true;
                Utilities.f22782e.c(new Runnable(this) {
                    public final v6 f15279b;

                    {
                        this.f15279b = this;
                    }

                    @Override
                    public final void run() {
                        Cursor cursor;
                        switch (r2) {
                            case 0:
                                v6 v6Var2 = this.f15279b;
                                String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                                ArrayList arrayList = new ArrayList();
                                ?? r42 = 1;
                                try {
                                    Cursor query = org.telegram.messenger.t0.f26915b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                            tL_message.f28426id = i72;
                                            tL_message.peer_id = new TLRPC.TL_peerUser();
                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser;
                                            TLRPC.Peer peer = tL_message.peer_id;
                                            cursor = query;
                                            try {
                                                long e10 = j10.i(v6Var2.f30189a).e();
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
                                                document.f28411id = 0L;
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
                                                arrayList.add(new fj(v6Var2.f30189a, tL_message, false, true));
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
                                org.telegram.messenger.g0.g3(new r1(11, v6Var2, arrayList));
                                return;
                            case 1:
                                this.f15279b.i1();
                                return;
                            default:
                                this.f15279b.h1();
                                return;
                        }
                    }
                });
            }
        }
        this.f39534o1.setOnScrollListener(new bi.q1(this, 16));
        this.f39534o1.setOnItemClickListener(new bi.p1(this, x10Var, i6Var, 2));
        this.Y0.b(this.f39534o1);
        this.Y0.i(this.f30192b);
        ri.q qVar = this.Y0;
        qVar.f56694a = new r6(this);
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
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            ri riVar = this.f15585g2;
            riVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            riVar.setVisibility(i10);
        }
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.f30189a, 0, false, new p6(this, 0), this.J0);
        this.f15590l2 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final void N(String str) {
        fj fjVar = this.f15582c2;
        if (fjVar != null && TextUtils.equals(fjVar.S0(), str)) {
            this.f15581b2.a(this.f15582c2);
            v6 v6Var = this.W1;
            if (v6Var != null) {
                v6Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final CharSequence P0() {
        return gd.M0(2131744373, null);
    }

    @Override
    public final void X0(Canvas canvas, View view) {
        k1();
        super.X0(canvas, view);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.V3) {
            this.f15590l2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f15591m2 != null && MediaController.B().I(this.f15591m2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.f15591m2 = null;
    }

    public final int e1(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i7) {
        String lowerCase;
        int i10;
        int i11 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f15592n2;
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
                    fjVar.K5(this.f15592n2, true);
                    arrayList3.add(fjVar);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.Y1) {
                    String y12 = fjVar.y1(true);
                    String w12 = fjVar.w1(true);
                    if (j1(lowerCase, M3, y12) || j1(lowerCase, M3, w12)) {
                        fjVar.K5(this.f15592n2, true);
                        arrayList3.add(fjVar);
                    }
                } else {
                    fjVar.K5(null, true);
                    arrayList3.add(fjVar);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(l41.C(null));
                    i10 = org.telegram.messenger.g0.L(12.0f);
                } else {
                    i10 = 0;
                }
                this.f15590l2.V();
                arrayList.add(l41.u(str));
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    di.ta taVar = new di.ta(this, 1);
                    int i13 = org.telegram.ui.Cells.f7.f30620b;
                    l41 K = l41.K(org.telegram.ui.Cells.f7.class);
                    K.H = (fj) obj2;
                    K.I = taVar;
                    arrayList.add(K);
                    i10 += org.telegram.messenger.g0.L(56.0f);
                }
                if (z11) {
                    arrayList.add(l41.p(4));
                    arrayList.add(l41.p(4));
                    arrayList.add(l41.p(4));
                    i10 += org.telegram.messenger.g0.L(56.0f) * 3;
                }
                if (z12 && !z11) {
                    l41 c10 = l41.c(i7, 2131230871, gd.M0(2131745144, null));
                    c10.f37023r = true;
                    arrayList.add(c10);
                    i10 += org.telegram.messenger.g0.L(50.0f);
                }
                this.f15590l2.U();
                return i10;
            }
        }
        return 0;
    }

    public final void f1() {
        if (this.C2 >= 0) {
            ConnectionsManager.getInstance(this.f30189a).cancelRequest(this.C2, true);
        }
        this.C2 = -1;
        this.f15600v2 = "";
        this.f15601w2 = false;
        this.Z1.clear();
        this.f15602x2 = false;
        this.f15603y2 = false;
    }

    public final void g1() {
        if (this.f15598t2 >= 0) {
            ConnectionsManager.getInstance(this.f30189a).cancelRequest(this.f15598t2, true);
        }
        this.f15598t2 = -1;
        this.f15593o2 = 0;
        this.Y1.clear();
        this.f15595q2 = false;
        this.f15596r2 = false;
    }

    @Override
    public final int getObserverTag() {
        return this.U1;
    }

    public final void h1() {
        TLRPC.User user;
        String str = ((org.telegram.messenger.n0) mp.u1(this.f30189a).A7.K.f15539b).f25873c;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.D2;
            String str3 = this.f15592n2;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                f1();
            }
            if (!this.f15602x2 && !TextUtils.isEmpty(this.f15592n2) && this.f15592n2.length() >= 3) {
                ArrayList arrayList = this.Z1;
                if (arrayList.isEmpty() || this.f15601w2) {
                    if (this.f15604z2 == null) {
                        TLObject h22 = mp.u1(this.f30189a).h2(str);
                        if (h22 instanceof TLRPC.User) {
                            user = (TLRPC.User) h22;
                        } else {
                            user = null;
                        }
                        this.f15604z2 = user;
                    }
                    if (this.f15604z2 == null) {
                        if (!this.A2 && !this.B2) {
                            this.A2 = true;
                            mp.u1(this.f30189a).f2().a(str, null, new t6(this, 0));
                            return;
                        }
                        return;
                    }
                    this.f15602x2 = true;
                    TLRPC.User f10 = j10.i(this.f30189a).f();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = mp.u1(this.f30189a).s1(this.f15604z2);
                    tL_messages_getInlineBotResults.peer = mp.p1(f10);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.f15600v2) == null) ? "" : "";
                    String str5 = this.f15592n2;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.D2 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.C2 = ConnectionsManager.getInstance(this.f30189a).sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new p6(this, 1));
                    this.f15590l2.O(true);
                }
            }
        }
    }

    public final void i1() {
        if (!this.V1) {
            String str = this.f15597s2;
            String str2 = this.f15592n2;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                g1();
            }
            if (!this.f15595q2) {
                ArrayList arrayList = this.Y1;
                if (!arrayList.isEmpty() && !this.f15594p2) {
                    return;
                }
                this.f15595q2 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f15592n2;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f15597s2 = str3;
                tL_messages_searchGlobal.f28518q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    fj fjVar = (fj) i5.c.h(1, arrayList);
                    tL_messages_searchGlobal.offset_id = fjVar.e1();
                    tL_messages_searchGlobal.offset_rate = this.f15593o2;
                    tL_messages_searchGlobal.offset_peer = mp.u1(this.f30189a).l1(fj.B1(fjVar.f23968k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f15598t2 = ConnectionsManager.getInstance(this.f30189a).sendRequest(tL_messages_searchGlobal, new ai.e1(this, 10));
                this.f15590l2.O(true);
            }
        }
    }

    public final void k1() {
        float f10 = org.telegram.messenger.g0.f24121q.y;
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            ck0 ck0Var = this.f39534o1;
            if (i7 >= ck0Var.getChildCount()) {
                break;
            }
            View childAt = ck0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        this.f15584f2.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24115m, f10));
        if (f10 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24115m) {
            z10 = true;
        }
        this.T1.a(z10, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30189a).c(this, ks.V3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30189a).n(this, ks.V3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            ui.c cVar = this.f15587i2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void D(float f10, int i7) {
    }

    @Override
    public final void i(long j3, long j10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
