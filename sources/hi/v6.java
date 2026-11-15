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
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.qc;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v00;
public final class v6 extends org.telegram.ui.Components.ja implements is, org.telegram.messenger.x5, te.b {
    public boolean A2;
    public boolean B2;
    public int C2;
    public String D2;
    public int E2;
    public final r6 F2;
    public boolean G2;
    public final te.a T1;
    public final int U1;
    public boolean V1;
    public final v6 W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final hp f15220a2;
    public final z10 f15221b2;
    public gj f15222c2;
    public boolean d2;
    public boolean f15223e2;
    public final FrameLayout f15224f2;
    public final ji f15225g2;
    public final dh.g f15226h2;
    public final ui.c f15227i2;
    public final dh.c f15228j2;
    public final t6 f15229k2;
    public p41 f15230l2;
    public gj f15231m2;
    public String f15232n2;
    public int f15233o2;
    public boolean f15234p2;
    public boolean f15235q2;
    public boolean f15236r2;
    public String f15237s2;
    public int f15238t2;
    public final r6 f15239u2;
    public String f15240v2;
    public boolean f15241w2;
    public boolean f15242x2;
    public boolean f15243y2;
    public TLRPC.User f15244z2;

    public v6(Context context, boolean z10, v6 v6Var, z10 z10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2, context, e6Var, true);
        int L;
        er erVar = er.h;
        this.T1 = new te.a(0, this, erVar, 380L, false);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f15238t2 = -1;
        this.f15239u2 = new Runnable(this) {
            public final v6 f14995b;

            {
                this.f14995b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        v6 v6Var2 = this.f14995b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f26600b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                    tL_message.f28072id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = m10.i(v6Var2.f29679a).e();
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
                                        document.f28057id = 0L;
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
                                        arrayList.add(new gj(v6Var2.f29679a, tL_message, false, true));
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
                        org.telegram.messenger.g0.h3(new h4(9, v6Var2, arrayList));
                        return;
                    case 1:
                        this.f14995b.h1();
                        return;
                    default:
                        this.f14995b.g1();
                        return;
                }
            }
        };
        this.C2 = -1;
        this.E2 = -2000000000;
        this.F2 = new Runnable(this) {
            public final v6 f14995b;

            {
                this.f14995b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        v6 v6Var2 = this.f14995b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f26600b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                    tL_message.f28072id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = m10.i(v6Var2.f29679a).e();
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
                                        document.f28057id = 0L;
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
                                        arrayList.add(new gj(v6Var2.f29679a, tL_message, false, true));
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
                        org.telegram.messenger.g0.h3(new h4(9, v6Var2, arrayList));
                        return;
                    case 1:
                        this.f14995b.h1();
                        return;
                    default:
                        this.f14995b.g1();
                        return;
                }
            }
        };
        this.f35943v1 = 0.35f;
        O();
        Y0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-20.0f);
        this.V1 = z10;
        this.U1 = org.telegram.messenger.z5.q(this.f29679a).k();
        this.W1 = v6Var;
        this.f15221b2 = z10Var;
        ui.c d = this.Y0.d(new s6(this));
        this.f15227i2 = d;
        if (Build.VERSION.SDK_INT >= 31 && gz.f()) {
            dh.g gVar = new dh.g(false);
            this.f15226h2 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(d);
            fVar.f58440f = d;
            fVar.d = gVar;
            fVar.f58439e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f15228j2 = cVar;
            cVar.f8097k = true;
            if (qc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8092e = L;
            cVar.f8096j = this.Y0;
        } else {
            this.f15226h2 = null;
            this.f15228j2 = new dh.c(d, d, d);
        }
        this.f15229k2 = new t6(this, 0);
        int i7 = org.telegram.ui.ActionBar.j6.f28792a7;
        ji jiVar = new ji(i7, context, e6Var);
        this.f15225g2 = jiVar;
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15224f2 = frameLayout;
        v00 v00Var = new v00(context, e6Var);
        v00Var.f40202r.setOnFocusChangeListener(new u6(this, 0));
        v00Var.f40205x = true;
        v00Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        v00Var.updateColors();
        v00Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        v00Var.f40202r.addTextChangedListener(new ah.j(this, 6));
        v00Var.f40202r.setHint(hd.M0(2131745836, null));
        frameLayout.addView(jiVar, c8.ja.g());
        frameLayout.addView(v00Var, c8.ja.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        v00Var.setupBlurredBackground(this.f15228j2.c(v00Var, c8.g0.n(e6Var), false));
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f29717u0, 0, org.telegram.messenger.g0.L(8.0f) + this.f29717u0, 0);
        this.f29682b.addView(frameLayout, c8.ja.e(-1, -2, 55));
        w0(i7);
        uj0 uj0Var = this.f35936o1;
        int i10 = this.f29717u0;
        uj0Var.setPadding(i10, 0, i10, 0);
        this.f35936o1.r1();
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(erVar);
        kVar.n(350L);
        this.f35936o1.setItemAnimator(kVar);
        if (!z10) {
            int i11 = this.f29679a;
            hp hpVar = new hp(i11, m10.i(i11).e());
            this.f15220a2 = hpVar;
            hpVar.b();
            h1();
            g1();
        } else {
            this.f15220a2 = null;
            if (this.V1 && !this.G2) {
                this.G2 = true;
                Utilities.f22416e.c(new Runnable(this) {
                    public final v6 f14995b;

                    {
                        this.f14995b = this;
                    }

                    @Override
                    public final void run() {
                        Cursor cursor;
                        switch (r2) {
                            case 0:
                                v6 v6Var2 = this.f14995b;
                                String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                                ArrayList arrayList = new ArrayList();
                                ?? r42 = 1;
                                try {
                                    Cursor query = org.telegram.messenger.t0.f26600b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                            tL_message.f28072id = i72;
                                            tL_message.peer_id = new TLRPC.TL_peerUser();
                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser;
                                            TLRPC.Peer peer = tL_message.peer_id;
                                            cursor = query;
                                            try {
                                                long e10 = m10.i(v6Var2.f29679a).e();
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
                                                document.f28057id = 0L;
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
                                                arrayList.add(new gj(v6Var2.f29679a, tL_message, false, true));
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
                                org.telegram.messenger.g0.h3(new h4(9, v6Var2, arrayList));
                                return;
                            case 1:
                                this.f14995b.h1();
                                return;
                            default:
                                this.f14995b.g1();
                                return;
                        }
                    }
                });
            }
        }
        this.f35936o1.setOnScrollListener(new bi.z4(this, 15));
        this.f35936o1.setOnItemClickListener(new fi.f0(this, z10Var, e6Var, 1));
        this.Y0.b(this.f35936o1);
        this.Y0.i(this.f29682b);
        ri.q qVar = this.Y0;
        qVar.f56120a = new s6(this);
        qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static boolean i1(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !i5.c.A(" ", str, lowerCase)) {
                String N3 = org.telegram.messenger.g0.N3(lowerCase);
                if (!N3.startsWith(str2) && !N3.contains(" ".concat(str2))) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            ji jiVar = this.f15225g2;
            jiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            jiVar.setVisibility(i10);
        }
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.f29679a, 0, false, new q6(this, 0), this.J0);
        this.f15230l2 = p41Var;
        p41Var.f38201r = false;
        return p41Var;
    }

    @Override
    public final void N(String str) {
        gj gjVar = this.f15222c2;
        if (gjVar != null && TextUtils.equals(gjVar.S0(), str)) {
            this.f15221b2.a(this.f15222c2);
            v6 v6Var = this.W1;
            if (v6Var != null) {
                v6Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131744608, null);
    }

    @Override
    public final void W0(Canvas canvas, View view) {
        j1();
        super.W0(canvas, view);
    }

    public final int d1(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i7) {
        String lowerCase;
        int i10;
        int i11 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f15232n2;
            if (str2 == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase();
            }
            String N3 = org.telegram.messenger.g0.N3(lowerCase);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                gj gjVar = (gj) obj;
                if (!z10) {
                    gjVar.K5(this.f15232n2, true);
                    arrayList3.add(gjVar);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.Y1) {
                    String y12 = gjVar.y1(true);
                    String w12 = gjVar.w1(true);
                    if (i1(lowerCase, N3, y12) || i1(lowerCase, N3, w12)) {
                        gjVar.K5(this.f15232n2, true);
                        arrayList3.add(gjVar);
                    }
                } else {
                    gjVar.K5(null, true);
                    arrayList3.add(gjVar);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(b41.C(null));
                    i10 = org.telegram.messenger.g0.L(12.0f);
                } else {
                    i10 = 0;
                }
                this.f15230l2.V();
                arrayList.add(b41.u(str));
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    di.qa qaVar = new di.qa(this, 1);
                    int i13 = org.telegram.ui.Cells.e7.f30187b;
                    b41 K = b41.K(org.telegram.ui.Cells.e7.class);
                    K.G = (gj) obj2;
                    K.H = qaVar;
                    arrayList.add(K);
                    i10 += org.telegram.messenger.g0.L(56.0f);
                }
                if (z11) {
                    arrayList.add(b41.p(4));
                    arrayList.add(b41.p(4));
                    arrayList.add(b41.p(4));
                    i10 += org.telegram.messenger.g0.L(56.0f) * 3;
                }
                if (z12 && !z11) {
                    b41 c10 = b41.c(i7, 2131230871, hd.M0(2131745339, null));
                    c10.f33186q = true;
                    arrayList.add(c10);
                    i10 += org.telegram.messenger.g0.L(50.0f);
                }
                this.f15230l2.U();
                return i10;
            }
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.T3) {
            this.f15230l2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f15231m2 != null && MediaController.B().I(this.f15231m2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.f15231m2 = null;
    }

    public final void e1() {
        if (this.C2 >= 0) {
            ConnectionsManager.getInstance(this.f29679a).cancelRequest(this.C2, true);
        }
        this.C2 = -1;
        this.f15240v2 = "";
        this.f15241w2 = false;
        this.Z1.clear();
        this.f15242x2 = false;
        this.f15243y2 = false;
    }

    public final void f1() {
        if (this.f15238t2 >= 0) {
            ConnectionsManager.getInstance(this.f29679a).cancelRequest(this.f15238t2, true);
        }
        this.f15238t2 = -1;
        this.f15233o2 = 0;
        this.Y1.clear();
        this.f15235q2 = false;
        this.f15236r2 = false;
    }

    public final void g1() {
        TLRPC.User user;
        String str = ((org.telegram.messenger.n0) np.s1(this.f29679a).f25448y7.F.f15881b).f25130c;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.D2;
            String str3 = this.f15232n2;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                e1();
            }
            if (!this.f15242x2 && !TextUtils.isEmpty(this.f15232n2) && this.f15232n2.length() >= 3) {
                ArrayList arrayList = this.Z1;
                if (arrayList.isEmpty() || this.f15241w2) {
                    if (this.f15244z2 == null) {
                        TLObject f22 = np.s1(this.f29679a).f2(str);
                        if (f22 instanceof TLRPC.User) {
                            user = (TLRPC.User) f22;
                        } else {
                            user = null;
                        }
                        this.f15244z2 = user;
                    }
                    if (this.f15244z2 == null) {
                        if (!this.A2 && !this.B2) {
                            this.A2 = true;
                            np.s1(this.f29679a).d2().a(str, null, new ai.f0(this, 29));
                            return;
                        }
                        return;
                    }
                    this.f15242x2 = true;
                    TLRPC.User f10 = m10.i(this.f29679a).f();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = np.s1(this.f29679a).q1(this.f15244z2);
                    tL_messages_getInlineBotResults.peer = np.n1(f10);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.f15240v2) == null) ? "" : "";
                    String str5 = this.f15232n2;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.D2 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.C2 = ConnectionsManager.getInstance(this.f29679a).sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new q6(this, 1));
                    this.f15230l2.O(true);
                }
            }
        }
    }

    @Override
    public final int getObserverTag() {
        return this.U1;
    }

    public final void h1() {
        if (!this.V1) {
            String str = this.f15237s2;
            String str2 = this.f15232n2;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                f1();
            }
            if (!this.f15235q2) {
                ArrayList arrayList = this.Y1;
                if (!arrayList.isEmpty() && !this.f15234p2) {
                    return;
                }
                this.f15235q2 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f15232n2;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f15237s2 = str3;
                tL_messages_searchGlobal.f28164q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    gj gjVar = (gj) i5.c.h(1, arrayList);
                    tL_messages_searchGlobal.offset_id = gjVar.e1();
                    tL_messages_searchGlobal.offset_rate = this.f15233o2;
                    tL_messages_searchGlobal.offset_peer = np.s1(this.f29679a).j1(gj.B1(gjVar.f23817k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f15238t2 = ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_messages_searchGlobal, new ai.d1(this, 10));
                this.f15230l2.O(true);
            }
        }
    }

    public final void j1() {
        float f10 = org.telegram.messenger.g0.f23609q.y;
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            uj0 uj0Var = this.f35936o1;
            if (i7 >= uj0Var.getChildCount()) {
                break;
            }
            View childAt = uj0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        this.f15224f2.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m, f10));
        if (f10 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m) {
            z10 = true;
        }
        this.T1.a(z10, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.f29679a).c(this, ns.T3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f29679a).n(this, ns.T3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            ui.c cVar = this.f15227i2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void E(float f10, int i7) {
    }

    @Override
    public final void i(long j3, long j10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
