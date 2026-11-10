package fi;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.fc;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.kp;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
public final class w6 extends org.telegram.ui.Components.ma implements ls, org.telegram.messenger.x5, te.b {
    public boolean A2;
    public int B2;
    public String C2;
    public int D2;
    public final s6 E2;
    public boolean F2;
    public final te.a S1;
    public final int T1;
    public boolean U1;
    public final w6 V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final kp Z1;
    public final c20 f13035a2;
    public ij f13036b2;
    public boolean f13037c2;
    public boolean d2;
    public final FrameLayout f13038e2;
    public final bi f13039f2;
    public final dh.g f13040g2;
    public final ri.c f13041h2;
    public final dh.c f13042i2;
    public final u6 f13043j2;
    public m41 f13044k2;
    public ij f13045l2;
    public String f13046m2;
    public int f13047n2;
    public boolean f13048o2;
    public boolean f13049p2;
    public boolean f13050q2;
    public String f13051r2;
    public int f13052s2;
    public final s6 f13053t2;
    public String f13054u2;
    public boolean f13055v2;
    public boolean f13056w2;
    public boolean f13057x2;
    public TLRPC.User f13058y2;
    public boolean f13059z2;

    public w6(Context context, boolean z9, w6 w6Var, c20 c20Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(2, context, h6Var, true);
        int L;
        wq wqVar = wq.h;
        this.S1 = new te.a(0, this, wqVar, 380L, false);
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.f13052s2 = -1;
        this.f13053t2 = new Runnable(this) {
            public final w6 f12802b;

            {
                this.f12802b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        w6 w6Var2 = this.f12802b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f25570b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                    tL_message.f26981id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = p10.i(w6Var2.f28669a).e();
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
                                        document.f26966id = 0L;
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
                                        arrayList.add(new ij(w6Var2.f28669a, tL_message, false, true));
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
                        org.telegram.messenger.g0.h3(new f2.h(14, w6Var2, arrayList));
                        return;
                    case 1:
                        this.f12802b.h1();
                        return;
                    default:
                        this.f12802b.g1();
                        return;
                }
            }
        };
        this.B2 = -1;
        this.D2 = -2000000000;
        this.E2 = new Runnable(this) {
            public final w6 f12802b;

            {
                this.f12802b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        w6 w6Var2 = this.f12802b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f25570b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                    tL_message.f26981id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = p10.i(w6Var2.f28669a).e();
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
                                        document.f26966id = 0L;
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
                                        arrayList.add(new ij(w6Var2.f28669a, tL_message, false, true));
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
                        org.telegram.messenger.g0.h3(new f2.h(14, w6Var2, arrayList));
                        return;
                    case 1:
                        this.f12802b.h1();
                        return;
                    default:
                        this.f12802b.g1();
                        return;
                }
            }
        };
        this.f35908u1 = 0.35f;
        N();
        Y0();
        this.C1 = org.telegram.messenger.g0.L(4.0f);
        this.D1 = org.telegram.messenger.g0.L(-20.0f);
        this.U1 = z9;
        this.T1 = org.telegram.messenger.z5.q(this.f28669a).k();
        this.V1 = w6Var;
        this.f13035a2 = c20Var;
        ri.c d = this.X0.d(new t6(this));
        this.f13041h2 = d;
        if (Build.VERSION.SDK_INT >= 31 && iz.f()) {
            dh.g gVar = new dh.g(false);
            this.f13040g2 = gVar;
            this.X0.a(gVar);
            ri.f fVar = new ri.f(d);
            fVar.f54584f = d;
            fVar.d = gVar;
            fVar.f54583e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f13042i2 = cVar;
            cVar.f8713k = true;
            if (sc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8708e = L;
            cVar.f8712j = this.X0;
        } else {
            this.f13040g2 = null;
            this.f13042i2 = new dh.c(d, d, d);
        }
        this.f13043j2 = new u6(this, 0);
        int i7 = org.telegram.ui.ActionBar.m6.f27834a7;
        bi biVar = new bi(i7, context, h6Var);
        this.f13039f2 = biVar;
        biVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13038e2 = frameLayout;
        r00 r00Var = new r00(context, h6Var);
        r00Var.f37446r.setOnFocusChangeListener(new v6(this, 0));
        r00Var.f37449x = true;
        r00Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        r00Var.updateColors();
        r00Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        r00Var.f37446r.addTextChangedListener(new ah.j(this, 5));
        r00Var.f37446r.setHint(id.M0(2131745836, null));
        frameLayout.addView(biVar, c8.ha.g());
        frameLayout.addView(r00Var, c8.ha.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        r00Var.setupBlurredBackground(this.f13042i2.c(r00Var, c8.g0.n(h6Var), false));
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f28705t0, 0, org.telegram.messenger.g0.L(8.0f) + this.f28705t0, 0);
        this.f28672b.addView(frameLayout, c8.ha.e(-1, -2, 55));
        w0(i7);
        pj0 pj0Var = this.n1;
        int i10 = this.f28705t0;
        pj0Var.setPadding(i10, 0, i10, 0);
        this.n1.r1();
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(wqVar);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        if (!z9) {
            int i11 = this.f28669a;
            kp kpVar = new kp(i11, p10.i(i11).e());
            this.Z1 = kpVar;
            kpVar.b();
            h1();
            g1();
        } else {
            this.Z1 = null;
            if (this.U1 && !this.F2) {
                this.F2 = true;
                Utilities.f21341e.c(new Runnable(this) {
                    public final w6 f12802b;

                    {
                        this.f12802b = this;
                    }

                    @Override
                    public final void run() {
                        Cursor cursor;
                        switch (r2) {
                            case 0:
                                w6 w6Var2 = this.f12802b;
                                String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                                ArrayList arrayList = new ArrayList();
                                ?? r42 = 1;
                                try {
                                    Cursor query = org.telegram.messenger.t0.f25570b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                            tL_message.f26981id = i72;
                                            tL_message.peer_id = new TLRPC.TL_peerUser();
                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser;
                                            TLRPC.Peer peer = tL_message.peer_id;
                                            cursor = query;
                                            try {
                                                long e10 = p10.i(w6Var2.f28669a).e();
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
                                                document.f26966id = 0L;
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
                                                arrayList.add(new ij(w6Var2.f28669a, tL_message, false, true));
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
                                org.telegram.messenger.g0.h3(new f2.h(14, w6Var2, arrayList));
                                return;
                            case 1:
                                this.f12802b.h1();
                                return;
                            default:
                                this.f12802b.g1();
                                return;
                        }
                    }
                });
            }
        }
        this.n1.setOnScrollListener(new ai.b(this, 12));
        this.n1.setOnItemClickListener(new di.f0(this, c20Var, h6Var, 1));
        this.X0.b(this.n1);
        this.X0.i(this.f28672b);
        oi.q qVar = this.X0;
        qVar.f21104a = new t6(this);
        qVar.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static boolean i1(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !jg.g.A(" ", str, lowerCase)) {
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
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.f28669a, 0, false, new r6(this, 0), this.I0);
        this.f13044k2 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final void M(String str) {
        ij ijVar = this.f13036b2;
        if (ijVar != null && TextUtils.equals(ijVar.S0(), str)) {
            this.f13035a2.a(this.f13036b2);
            w6 w6Var = this.V1;
            if (w6Var != null) {
                w6Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131744608, null);
    }

    @Override
    public final void W0(Canvas canvas, View view) {
        j1();
        super.W0(canvas, view);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            bi biVar = this.f13039f2;
            biVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            biVar.setVisibility(i10);
        }
    }

    public final int d1(boolean z9, ArrayList arrayList, String str, ArrayList arrayList2, boolean z10, boolean z11, int i7) {
        String lowerCase;
        int i10;
        int i11 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z10)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f13046m2;
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
                ij ijVar = (ij) obj;
                if (!z9) {
                    ijVar.K5(this.f13046m2, true);
                    arrayList3.add(ijVar);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.X1) {
                    String y12 = ijVar.y1(true);
                    String w12 = ijVar.w1(true);
                    if (i1(lowerCase, O3, y12) || i1(lowerCase, O3, w12)) {
                        ijVar.K5(this.f13046m2, true);
                        arrayList3.add(ijVar);
                    }
                } else {
                    ijVar.K5(null, true);
                    arrayList3.add(ijVar);
                }
            }
            if (!arrayList3.isEmpty() || z10) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(x31.C(null));
                    i10 = org.telegram.messenger.g0.L(12.0f);
                } else {
                    i10 = 0;
                }
                this.f13044k2.V();
                arrayList.add(x31.u(str));
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    fc fcVar = new fc(this, 1);
                    int i13 = org.telegram.ui.Cells.f7.f29145b;
                    x31 K = x31.K(org.telegram.ui.Cells.f7.class);
                    K.G = (ij) obj2;
                    K.H = fcVar;
                    arrayList.add(K);
                    i10 += org.telegram.messenger.g0.L(56.0f);
                }
                if (z10) {
                    arrayList.add(x31.p(4));
                    arrayList.add(x31.p(4));
                    arrayList.add(x31.p(4));
                    i10 += org.telegram.messenger.g0.L(56.0f) * 3;
                }
                if (z11 && !z10) {
                    x31 c10 = x31.c(i7, 2131230871, id.M0(2131745339, null));
                    c10.f40161q = true;
                    arrayList.add(c10);
                    i10 += org.telegram.messenger.g0.L(50.0f);
                }
                this.f13044k2.U();
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.T3) {
            this.f13044k2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f13045l2 != null && MediaController.B().I(this.f13045l2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.f13045l2 = null;
    }

    public final void e1() {
        if (this.B2 >= 0) {
            ConnectionsManager.getInstance(this.f28669a).cancelRequest(this.B2, true);
        }
        this.B2 = -1;
        this.f13054u2 = "";
        this.f13055v2 = false;
        this.Y1.clear();
        this.f13056w2 = false;
        this.f13057x2 = false;
    }

    public final void f1() {
        if (this.f13052s2 >= 0) {
            ConnectionsManager.getInstance(this.f28669a).cancelRequest(this.f13052s2, true);
        }
        this.f13052s2 = -1;
        this.f13047n2 = 0;
        this.X1.clear();
        this.f13049p2 = false;
        this.f13050q2 = false;
    }

    public final void g1() {
        TLRPC.User user;
        String str = ((org.telegram.messenger.n0) qp.s1(this.f28669a).f24946x7.F.f13557b).f24122c;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.C2;
            String str3 = this.f13046m2;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                e1();
            }
            if (!this.f13056w2 && !TextUtils.isEmpty(this.f13046m2) && this.f13046m2.length() >= 3) {
                ArrayList arrayList = this.Y1;
                if (arrayList.isEmpty() || this.f13055v2) {
                    if (this.f13058y2 == null) {
                        TLObject f22 = qp.s1(this.f28669a).f2(str);
                        if (f22 instanceof TLRPC.User) {
                            user = (TLRPC.User) f22;
                        } else {
                            user = null;
                        }
                        this.f13058y2 = user;
                    }
                    if (this.f13058y2 == null) {
                        if (!this.f13059z2 && !this.A2) {
                            this.f13059z2 = true;
                            qp.s1(this.f28669a).d2().a(str, null, new ai.i(this, 25));
                            return;
                        }
                        return;
                    }
                    this.f13056w2 = true;
                    TLRPC.User f10 = p10.i(this.f28669a).f();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = qp.s1(this.f28669a).q1(this.f13058y2);
                    tL_messages_getInlineBotResults.peer = qp.n1(f10);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.f13054u2) == null) ? "" : "";
                    String str5 = this.f13046m2;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.C2 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.B2 = ConnectionsManager.getInstance(this.f28669a).sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new r6(this, 1));
                    this.f13044k2.O(true);
                }
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.T1;
    }

    public final void h1() {
        if (!this.U1) {
            String str = this.f13051r2;
            String str2 = this.f13046m2;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                f1();
            }
            if (!this.f13049p2) {
                ArrayList arrayList = this.X1;
                if (!arrayList.isEmpty() && !this.f13048o2) {
                    return;
                }
                this.f13049p2 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f13046m2;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f13051r2 = str3;
                tL_messages_searchGlobal.f27073q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    ij ijVar = (ij) jg.g.i(1, arrayList);
                    tL_messages_searchGlobal.offset_id = ijVar.e1();
                    tL_messages_searchGlobal.offset_rate = this.f13047n2;
                    tL_messages_searchGlobal.offset_peer = qp.s1(this.f28669a).j1(ij.B1(ijVar.f23266k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f13052s2 = ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_messages_searchGlobal, new bi.j0(this, 9));
                this.f13044k2.O(true);
            }
        }
    }

    public final void j1() {
        float f10 = org.telegram.messenger.g0.f22567q.y;
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            pj0 pj0Var = this.n1;
            if (i7 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        this.f13038e2.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m, f10));
        if (f10 <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m) {
            z9 = true;
        }
        this.S1.a(z9, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f28669a).c(this, qs.T3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f28669a).n(this, qs.T3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            ri.c cVar = this.f13041h2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void C(boolean z9) {
    }

    @Override
    public final void F(float f10, int i7) {
    }

    @Override
    public final void i(long j3, long j10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
