package gi;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import b8.cd;
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.bp;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
public final class x6 extends org.telegram.ui.Components.ma implements cs, org.telegram.messenger.x5, qe.b {
    public String A2;
    public int B2;
    public final t6 C2;
    public boolean D2;
    public final qe.a Q1;
    public final int R1;
    public boolean S1;
    public final x6 T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final bp X1;
    public final u10 Y1;
    public zi Z1;
    public boolean f13844a2;
    public boolean f13845b2;
    public final FrameLayout c2;
    public final ai f13846d2;
    public final eh.g f13847e2;
    public final si.c f13848f2;
    public final eh.c f13849g2;
    public final v6 f13850h2;
    public f41 f13851i2;
    public zi f13852j2;
    public String f13853k2;
    public int f13854l2;
    public boolean f13855m2;
    public boolean f13856n2;
    public boolean f13857o2;
    public String f13858p2;
    public int f13859q2;
    public final t6 f13860r2;
    public String f13861s2;
    public boolean f13862t2;
    public boolean f13863u2;
    public boolean f13864v2;
    public TLRPC.User f13865w2;
    public boolean f13866x2;
    public boolean f13867y2;
    public int f13868z2;

    public x6(Context context, boolean z10, x6 x6Var, u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2, context, e6Var, true);
        int L;
        xq xqVar = xq.h;
        this.Q1 = new qe.a(0, this, xqVar, 380L, false);
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.f13859q2 = -1;
        this.f13860r2 = new Runnable(this) {
            public final x6 f13619b;

            {
                this.f13619b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        x6 x6Var2 = this.f13619b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f25457b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i3 = -2000000000;
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
                                    tL_message.f27022id = i3;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = h10.i(x6Var2.f28583a).e();
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
                                        document.f27007id = 0L;
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
                                        arrayList.add(new zi(x6Var2.f28583a, tL_message, false, true));
                                        i3--;
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
                        org.telegram.messenger.g0.h3(new g2.c(20, x6Var2, arrayList));
                        return;
                    case 1:
                        this.f13619b.h1();
                        return;
                    default:
                        this.f13619b.g1();
                        return;
                }
            }
        };
        this.f13868z2 = -1;
        this.B2 = -2000000000;
        this.C2 = new Runnable(this) {
            public final x6 f13619b;

            {
                this.f13619b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        x6 x6Var2 = this.f13619b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f25457b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i3 = -2000000000;
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
                                    tL_message.f27022id = i3;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = h10.i(x6Var2.f28583a).e();
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
                                        document.f27007id = 0L;
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
                                        arrayList.add(new zi(x6Var2.f28583a, tL_message, false, true));
                                        i3--;
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
                        org.telegram.messenger.g0.h3(new g2.c(20, x6Var2, arrayList));
                        return;
                    case 1:
                        this.f13619b.h1();
                        return;
                    default:
                        this.f13619b.g1();
                        return;
                }
            }
        };
        this.f36108s1 = 0.35f;
        N();
        Y0();
        this.A1 = org.telegram.messenger.g0.L(4.0f);
        this.B1 = org.telegram.messenger.g0.L(-20.0f);
        this.S1 = z10;
        this.R1 = org.telegram.messenger.z5.q(this.f28583a).k();
        this.T1 = x6Var;
        this.Y1 = u10Var;
        si.c d = this.Y0.d(new u6(this));
        this.f13848f2 = d;
        if (Build.VERSION.SDK_INT >= 31 && az.f()) {
            eh.g gVar = new eh.g(false);
            this.f13847e2 = gVar;
            this.Y0.a(gVar);
            si.f fVar = new si.f(d);
            fVar.f54756f = d;
            fVar.d = gVar;
            fVar.f54755e = -2;
            eh.c cVar = new eh.c(fVar, fVar, fVar);
            this.f13849g2 = cVar;
            cVar.f9988k = true;
            if (lc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f9983e = L;
            cVar.f9987j = this.Y0;
        } else {
            this.f13847e2 = null;
            this.f13849g2 = new eh.c(d, d, d);
        }
        this.f13850h2 = new fh.a() {
            @Override
            public final void b(eh.a aVar, RectF rectF) {
                aVar.f9978a = true;
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                x6 x6Var2 = x6.this;
                tj0 tj0Var = x6Var2.f36102l1;
                jh.d.b(tj0Var, canvas, rectF, tj0Var, x6Var2.f28586b, 255);
            }
        };
        int i3 = org.telegram.ui.ActionBar.k6.f27824a7;
        ai aiVar = new ai(i3, context, e6Var);
        this.f13846d2 = aiVar;
        aiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c2 = frameLayout;
        n00 n00Var = new n00(context, e6Var);
        n00Var.f36302r.setOnFocusChangeListener(new w6(this, 0));
        n00Var.f36305x = true;
        n00Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        n00Var.updateColors();
        n00Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        n00Var.f36302r.addTextChangedListener(new bh.h(this, 5));
        n00Var.f36302r.setHint(bd.M0(2131745846, null));
        frameLayout.addView(aiVar, mf.g());
        frameLayout.addView(n00Var, mf.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        n00Var.setupBlurredBackground(this.f13849g2.c(n00Var, cd.o(e6Var), false));
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f28618u0, 0, org.telegram.messenger.g0.L(8.0f) + this.f28618u0, 0);
        this.f28586b.addView(frameLayout, mf.e(-1, -2, 55));
        w0(i3);
        tj0 tj0Var = this.f36102l1;
        int i10 = this.f28618u0;
        tj0Var.setPadding(i10, 0, i10, 0);
        this.f36102l1.r1();
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        this.f36102l1.setItemAnimator(kVar);
        if (!z10) {
            int i11 = this.f28583a;
            bp bpVar = new bp(i11, h10.i(i11).e());
            this.X1 = bpVar;
            bpVar.b();
            h1();
            g1();
        } else {
            this.X1 = null;
            if (this.S1 && !this.D2) {
                this.D2 = true;
                Utilities.f21387e.c(new Runnable(this) {
                    public final x6 f13619b;

                    {
                        this.f13619b = this;
                    }

                    @Override
                    public final void run() {
                        Cursor cursor;
                        switch (r2) {
                            case 0:
                                x6 x6Var2 = this.f13619b;
                                String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                                ArrayList arrayList = new ArrayList();
                                ?? r42 = 1;
                                try {
                                    Cursor query = org.telegram.messenger.t0.f25457b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                                    int i32 = -2000000000;
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
                                            tL_message.f27022id = i32;
                                            tL_message.peer_id = new TLRPC.TL_peerUser();
                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser;
                                            TLRPC.Peer peer = tL_message.peer_id;
                                            cursor = query;
                                            try {
                                                long e10 = h10.i(x6Var2.f28583a).e();
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
                                                document.f27007id = 0L;
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
                                                arrayList.add(new zi(x6Var2.f28583a, tL_message, false, true));
                                                i32--;
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
                                org.telegram.messenger.g0.h3(new g2.c(20, x6Var2, arrayList));
                                return;
                            case 1:
                                this.f13619b.h1();
                                return;
                            default:
                                this.f13619b.g1();
                                return;
                        }
                    }
                });
            }
        }
        this.f36102l1.setOnScrollListener(new ai.j5(this, 15));
        this.f36102l1.setOnItemClickListener(new ei.h0(this, u10Var, e6Var, 1));
        this.Y0.b(this.f36102l1);
        this.Y0.i(this.f28586b);
        pi.q qVar = this.Y0;
        qVar.f53602a = new u6(this);
        qVar.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static boolean i1(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !k2.p1.z(" ", str, lowerCase)) {
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                if (!O3.startsWith(str2) && !O3.contains(" ".concat(str2))) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, false, new s6(this, 0), this.J0);
        this.f13851i2 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final void M(String str) {
        zi ziVar = this.Z1;
        if (ziVar != null && TextUtils.equals(ziVar.S0(), str)) {
            this.Y1.a(this.Z1);
            x6 x6Var = this.T1;
            if (x6Var != null) {
                x6Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final CharSequence O0() {
        return bd.M0(2131744618, null);
    }

    @Override
    public final void W0(Canvas canvas, View view) {
        j1();
        super.W0(canvas, view);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10;
        if (i3 == 0) {
            ai aiVar = this.f13846d2;
            aiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            aiVar.setVisibility(i10);
        }
    }

    public final int d1(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i3) {
        String lowerCase;
        int i10;
        int i11 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f13853k2;
            if (str2 == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase();
            }
            String O3 = org.telegram.messenger.g0.O3(lowerCase);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                zi ziVar = (zi) obj;
                if (!z10) {
                    ziVar.L5(this.f13853k2, true);
                    arrayList3.add(ziVar);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.V1) {
                    String z13 = ziVar.z1(true);
                    String x12 = ziVar.x1(true);
                    if (i1(lowerCase, O3, z13) || i1(lowerCase, O3, x12)) {
                        ziVar.L5(this.f13853k2, true);
                        arrayList3.add(ziVar);
                    }
                } else {
                    ziVar.L5(null, true);
                    arrayList3.add(ziVar);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(r31.C(null));
                    i10 = org.telegram.messenger.g0.L(12.0f);
                } else {
                    i10 = 0;
                }
                this.f13851i2.V();
                arrayList.add(r31.u(str));
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    ci.ab abVar = new ci.ab(this, 1);
                    int i13 = org.telegram.ui.Cells.e7.f29131b;
                    r31 K = r31.K(org.telegram.ui.Cells.e7.class);
                    K.G = (zi) obj2;
                    K.H = abVar;
                    arrayList.add(K);
                    i10 += org.telegram.messenger.g0.L(56.0f);
                }
                if (z11) {
                    arrayList.add(r31.p(4));
                    arrayList.add(r31.p(4));
                    arrayList.add(r31.p(4));
                    i10 += org.telegram.messenger.g0.L(56.0f) * 3;
                }
                if (z12 && !z11) {
                    r31 c2 = r31.c(i3, 2131230871, bd.M0(2131745349, null));
                    c2.f37632q = true;
                    arrayList.add(c2);
                    i10 += org.telegram.messenger.g0.L(50.0f);
                }
                this.f13851i2.U();
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.T3) {
            this.f13851i2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f13852j2 != null && MediaController.B().I(this.f13852j2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.f13852j2 = null;
    }

    public final void e1() {
        if (this.f13868z2 >= 0) {
            ConnectionsManager.getInstance(this.f28583a).cancelRequest(this.f13868z2, true);
        }
        this.f13868z2 = -1;
        this.f13861s2 = "";
        this.f13862t2 = false;
        this.W1.clear();
        this.f13863u2 = false;
        this.f13864v2 = false;
    }

    public final void f1() {
        if (this.f13859q2 >= 0) {
            ConnectionsManager.getInstance(this.f28583a).cancelRequest(this.f13859q2, true);
        }
        this.f13859q2 = -1;
        this.f13854l2 = 0;
        this.V1.clear();
        this.f13856n2 = false;
        this.f13857o2 = false;
    }

    public final void g1() {
        TLRPC.User user;
        String str = ((org.telegram.messenger.n0) hp.s1(this.f28583a).f23167x7.F.f13798b).f24297c;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.A2;
            String str3 = this.f13853k2;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                e1();
            }
            if (!this.f13863u2 && !TextUtils.isEmpty(this.f13853k2) && this.f13853k2.length() >= 3) {
                ArrayList arrayList = this.W1;
                if (arrayList.isEmpty() || this.f13862t2) {
                    if (this.f13865w2 == null) {
                        TLObject f22 = hp.s1(this.f28583a).f2(str);
                        if (f22 instanceof TLRPC.User) {
                            user = (TLRPC.User) f22;
                        } else {
                            user = null;
                        }
                        this.f13865w2 = user;
                    }
                    if (this.f13865w2 == null) {
                        if (!this.f13866x2 && !this.f13867y2) {
                            this.f13866x2 = true;
                            hp.s1(this.f28583a).d2().a(str, null, new ai.v2(this, 28));
                            return;
                        }
                        return;
                    }
                    this.f13863u2 = true;
                    TLRPC.User f10 = h10.i(this.f28583a).f();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = hp.s1(this.f28583a).q1(this.f13865w2);
                    tL_messages_getInlineBotResults.peer = hp.n1(f10);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.f13861s2) == null) ? "" : "";
                    String str5 = this.f13853k2;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.A2 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.f13868z2 = ConnectionsManager.getInstance(this.f28583a).sendRequestTyped(tL_messages_getInlineBotResults, new c3.b(1), new s6(this, 1));
                    this.f13851i2.O(true);
                }
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.R1;
    }

    public final void h1() {
        if (!this.S1) {
            String str = this.f13858p2;
            String str2 = this.f13853k2;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                f1();
            }
            if (!this.f13856n2) {
                ArrayList arrayList = this.V1;
                if (!arrayList.isEmpty() && !this.f13855m2) {
                    return;
                }
                this.f13856n2 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f13853k2;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f13858p2 = str3;
                tL_messages_searchGlobal.f27114q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    zi ziVar = (zi) k2.p1.h(1, arrayList);
                    tL_messages_searchGlobal.offset_id = ziVar.f1();
                    tL_messages_searchGlobal.offset_rate = this.f13854l2;
                    tL_messages_searchGlobal.offset_peer = hp.s1(this.f28583a).j1(zi.C1(ziVar.f26868k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f13859q2 = ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_messages_searchGlobal, new ci.d0(this, 9));
                this.f13851i2.O(true);
            }
        }
    }

    public final void j1() {
        float f10 = org.telegram.messenger.g0.f22608q.y;
        boolean z10 = false;
        int i3 = 0;
        while (true) {
            tj0 tj0Var = this.f36102l1;
            if (i3 >= tj0Var.getChildCount()) {
                break;
            }
            View childAt = tj0Var.getChildAt(i3);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i3++;
        }
        this.c2.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m, f10));
        if (f10 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m) {
            z10 = true;
        }
        this.Q1.a(z10, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f28583a).c(this, hs.T3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f28583a).n(this, hs.T3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            si.c cVar = this.f13848f2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void F(float f10, int i3) {
    }

    @Override
    public final void i(long j10, long j11) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
