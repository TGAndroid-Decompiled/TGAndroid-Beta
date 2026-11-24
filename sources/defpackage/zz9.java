package defpackage;

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
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zz9 extends mz0 implements jm7, cr3, g94 {
    public int A2;
    public String B2;
    public int C2;
    public final xz9 D2;
    public boolean E2;
    public final fn0 S1;
    public final int T1;
    public boolean U1;
    public final zz9 V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final jc7 Z1;
    public final qac a2;
    public k47 b2;
    public boolean c2;
    public boolean d2;
    public final FrameLayout e2;
    public final h22 f2;
    public final mr3 g2;
    public final kz4 h2;
    public final ms0 i2;
    public l7c j2;
    public k47 k2;
    public String l2;
    public int m2;
    public boolean n2;
    public boolean o2;
    public boolean p2;
    public String q2;
    public int r2;
    public final xz9 s2;
    public String t2;
    public boolean u2;
    public boolean v2;
    public boolean w2;
    public TLRPC.User x2;
    public boolean y2;
    public boolean z2;

    public zz9(Context context, boolean z, zz9 zz9Var, qac qacVar, r63 r63Var) {
        super(2, (ylb) r63Var, context, true);
        km0 km0Var;
        int L;
        d53 d53Var = d53.h;
        this.S1 = new fn0(0, this, d53Var, 380L, false);
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.r2 = -1;
        this.s2 = new Runnable(this) {
            public final zz9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        zz9 zz9Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i = -2000000000;
                            while (query.moveToNext()) {
                                query.getInt(0);
                                String string = query.getString(1);
                                String string2 = query.getString(2);
                                String string3 = query.getString(3);
                                int i2 = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(string3);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.id = i;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = z8c.h(zz9Var2.a).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = string3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = bc4.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb = new StringBuilder();
                                sb.append("audio/");
                                if (D.length() <= 0) {
                                    D = "mp3";
                                }
                                sb.append(D);
                                document.mime_type = sb.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = i2;
                                tL_documentAttributeAudio.title = string2;
                                tL_documentAttributeAudio.performer = string;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                arrayList.add(new k47(zz9Var2.a, tL_message, false, true));
                                i--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                        gm.c3(new il9(zz9Var2, arrayList, (byte) 23));
                        return;
                    case 1:
                        this.b.c1();
                        return;
                    default:
                        this.b.b1();
                        return;
                }
            }
        };
        this.A2 = -1;
        this.C2 = -2000000000;
        this.D2 = new Runnable(this) {
            public final zz9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        zz9 zz9Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i = -2000000000;
                            while (query.moveToNext()) {
                                query.getInt(0);
                                String string = query.getString(1);
                                String string2 = query.getString(2);
                                String string3 = query.getString(3);
                                int i2 = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(string3);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.id = i;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = z8c.h(zz9Var2.a).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = string3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.flags |= 768;
                                String D = bc4.D(file);
                                TLRPC.Document document = tL_message.media.document;
                                document.id = 0L;
                                document.access_hash = 0L;
                                document.file_reference = new byte[0];
                                document.date = tL_message.date;
                                StringBuilder sb = new StringBuilder();
                                sb.append("audio/");
                                if (D.length() <= 0) {
                                    D = "mp3";
                                }
                                sb.append(D);
                                document.mime_type = sb.toString();
                                tL_message.media.document.size = (int) file.length();
                                tL_message.media.document.dc_id = 0;
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.duration = i2;
                                tL_documentAttributeAudio.title = string2;
                                tL_documentAttributeAudio.performer = string;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                arrayList.add(new k47(zz9Var2.a, tL_message, false, true));
                                i--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                        gm.c3(new il9(zz9Var2, arrayList, (byte) 23));
                        return;
                    case 1:
                        this.b.c1();
                        return;
                    default:
                        this.b.b1();
                        return;
                }
            }
        };
        this.u1 = 0.35f;
        J();
        T0();
        this.C1 = gm.L(4.0f);
        this.D1 = gm.L(-20.0f);
        this.U1 = z;
        this.T1 = er3.q(this.a).k();
        this.V1 = zz9Var;
        this.a2 = qacVar;
        kz4 d = this.X0.d(new yz9(this));
        this.h2 = d;
        if (Build.VERSION.SDK_INT >= 31 && gda.f()) {
            mr3 mr3Var = new mr3(false);
            this.g2 = mr3Var;
            this.X0.a(mr3Var);
            nz4 nz4Var = new nz4(d);
            nz4Var.f = d;
            nz4Var.d = mr3Var;
            nz4Var.e = -2;
            km0Var = new km0(nz4Var, nz4Var, nz4Var);
            km0Var.k = true;
            if (e86.e(262144)) {
                L = gm.L(8.0f);
            } else {
                L = gm.L(48.0f);
            }
            km0Var.d = L;
            km0Var.e = L;
            km0Var.j = this.X0;
        } else {
            this.g2 = null;
            km0Var = new km0(d, d, d);
        }
        this.i2 = new ms0(this, (byte) 10);
        int i = cmb.Z6;
        h22 h22Var = new h22(i, r63Var, context);
        this.f2 = h22Var;
        h22Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e2 = frameLayout;
        oq4 oq4Var = new oq4(context, r63Var);
        oq4Var.r.setOnFocusChangeListener(new fu3(this, (byte) 3));
        oq4Var.x = true;
        oq4Var.setPadding(gm.L(3.0f), gm.L(3.0f), gm.L(3.0f), gm.L(3.0f));
        oq4Var.updateColors();
        oq4Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        oq4Var.r.addTextChangedListener(new og6(this, (byte) 11));
        oq4Var.r.setHint(jb6.M0(2131745570, null));
        frameLayout.addView(h22Var, qoe.g());
        frameLayout.addView(oq4Var, qoe.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        oq4Var.setupBlurredBackground(km0Var.c(oq4Var, qqd.n(r63Var), false));
        frameLayout.setPadding(gm.L(8.0f) + this.u0, 0, gm.L(8.0f) + this.u0, 0);
        this.b.addView(frameLayout, qoe.e(-1, -2, 55));
        t0(i);
        r59 r59Var = this.n1;
        int i2 = this.u0;
        r59Var.setPadding(i2, 0, i2, 0);
        this.n1.r1();
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53Var);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        if (!z) {
            int i3 = this.a;
            jc7 jc7Var = new jc7(i3, z8c.h(i3).e());
            this.Z1 = jc7Var;
            jc7Var.b();
            c1();
            b1();
        } else {
            this.Z1 = null;
            if (this.U1 && !this.E2) {
                this.E2 = true;
                Utilities.e.c(new Runnable(this) {
                    public final zz9 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                zz9 zz9Var2 = this.b;
                                String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                                ArrayList arrayList = new ArrayList();
                                try {
                                    Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                                    int i4 = -2000000000;
                                    while (query.moveToNext()) {
                                        query.getInt(0);
                                        String string = query.getString(1);
                                        String string2 = query.getString(2);
                                        String string3 = query.getString(3);
                                        int i22 = (int) (query.getLong(4) / 1000);
                                        query.getString(5);
                                        File file = new File(string3);
                                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                        tL_message.out = true;
                                        tL_message.id = i4;
                                        tL_message.peer_id = new TLRPC.TL_peerUser();
                                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                        tL_message.from_id = tL_peerUser;
                                        TLRPC.Peer peer = tL_message.peer_id;
                                        long e = z8c.h(zz9Var2.a).e();
                                        tL_peerUser.user_id = e;
                                        peer.user_id = e;
                                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                        tL_message.message = "";
                                        tL_message.attachPath = string3;
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                        tL_message.media = tL_messageMediaDocument;
                                        tL_messageMediaDocument.flags |= 3;
                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                        tL_message.flags |= 768;
                                        String D = bc4.D(file);
                                        TLRPC.Document document = tL_message.media.document;
                                        document.id = 0L;
                                        document.access_hash = 0L;
                                        document.file_reference = new byte[0];
                                        document.date = tL_message.date;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("audio/");
                                        if (D.length() <= 0) {
                                            D = "mp3";
                                        }
                                        sb.append(D);
                                        document.mime_type = sb.toString();
                                        tL_message.media.document.size = (int) file.length();
                                        tL_message.media.document.dc_id = 0;
                                        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                        tL_documentAttributeAudio.duration = i22;
                                        tL_documentAttributeAudio.title = string2;
                                        tL_documentAttributeAudio.performer = string;
                                        tL_documentAttributeAudio.flags |= 3;
                                        tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                        tL_documentAttributeFilename.file_name = file.getName();
                                        tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                        arrayList.add(new k47(zz9Var2.a, tL_message, false, true));
                                        i4--;
                                    }
                                    query.close();
                                } catch (Exception e2) {
                                    fc4.g(e2, true);
                                }
                                gm.c3(new il9(zz9Var2, arrayList, (byte) 23));
                                return;
                            case 1:
                                this.b.c1();
                                return;
                            default:
                                this.b.b1();
                                return;
                        }
                    }
                });
            }
        }
        this.n1.setOnScrollListener(new so7(this, (byte) 16));
        this.n1.setOnItemClickListener(new is(this, qacVar, r63Var, (byte) 4));
        this.X0.b(this.n1);
        this.X0.i(this.b);
        sy4 sy4Var = this.X0;
        sy4Var.a = new yz9(this);
        sy4Var.d = new cz4(gm.L(48.0f));
    }

    public static boolean d1(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !hg9.s(" ", str, lowerCase)) {
                String I3 = gm.I3(lowerCase);
                if (!I3.startsWith(str2) && !I3.contains(" ".concat(str2))) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        if (i == 0) {
            h22 h22Var = this.f2;
            h22Var.setAlpha(f);
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            h22Var.setVisibility(i2);
        }
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, false, new wz9(this, (byte) 0), this.J0);
        this.j2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131744294, null);
    }

    @Override
    public final void N(String str) {
        k47 k47Var = this.b2;
        if (k47Var != null && TextUtils.equals(k47Var.S0(), str)) {
            this.a2.a(this.b2);
            zz9 zz9Var = this.V1;
            if (zz9Var != null) {
                zz9Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final void R0(Canvas canvas, View view) {
        e1();
        super.R0(canvas, view);
    }

    public final int Y0(boolean z, ArrayList arrayList, String str, ArrayList arrayList2, boolean z2, boolean z3, int i) {
        String lowerCase;
        int i2;
        int i3 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z2)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.l2;
            if (str2 == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase();
            }
            String I3 = gm.I3(lowerCase);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                k47 k47Var = (k47) obj;
                if (!z) {
                    k47Var.J5(this.l2, true);
                    arrayList3.add(k47Var);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.X1) {
                    String y1 = k47Var.y1(true);
                    String w1 = k47Var.w1(true);
                    if (d1(lowerCase, I3, y1) || d1(lowerCase, I3, w1)) {
                        k47Var.J5(this.l2, true);
                        arrayList3.add(k47Var);
                    }
                } else {
                    k47Var.J5(null, true);
                    arrayList3.add(k47Var);
                }
            }
            if (!arrayList3.isEmpty() || z2) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(c6c.C(null));
                    i2 = gm.L(12.0f);
                } else {
                    i2 = 0;
                }
                this.j2.V();
                arrayList.add(c6c.u(str));
                int size2 = arrayList3.size();
                while (i3 < size2) {
                    Object obj2 = arrayList3.get(i3);
                    i3++;
                    k22 k22Var = new k22(this, (byte) 8);
                    int i5 = dda.b;
                    c6c K = c6c.K(dda.class);
                    K.H = (k47) obj2;
                    K.I = k22Var;
                    arrayList.add(K);
                    i2 += gm.L(56.0f);
                }
                if (z2) {
                    arrayList.add(c6c.p(4));
                    arrayList.add(c6c.p(4));
                    arrayList.add(c6c.p(4));
                    i2 += gm.L(56.0f) * 3;
                }
                if (z3 && !z2) {
                    c6c c = c6c.c(i, 2131230872, jb6.M0(2131745073, null));
                    c.r = true;
                    arrayList.add(c);
                    i2 += gm.L(50.0f);
                }
                this.j2.U();
                return i2;
            }
        }
        return 0;
    }

    public final void Z0() {
        if (this.A2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.A2, true);
        }
        this.A2 = -1;
        this.t2 = "";
        this.u2 = false;
        this.Y1.clear();
        this.v2 = false;
        this.w2 = false;
    }

    public final void a1() {
        if (this.r2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.r2, true);
        }
        this.r2 = -1;
        this.m2 = 0;
        this.X1.clear();
        this.o2 = false;
        this.p2 = false;
    }

    public final void b1() {
        String str = oc7.r1(this.a).l4.J.f;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.B2;
            String str3 = this.l2;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                Z0();
            }
            if (!this.v2 && !TextUtils.isEmpty(this.l2) && this.l2.length() >= 3) {
                if (this.Y1.isEmpty() || this.u2) {
                    TLRPC.User user = this.x2;
                    if (user == null) {
                        TLObject b2 = oc7.r1(this.a).b2(str);
                        if (b2 instanceof TLRPC.User) {
                            user = (TLRPC.User) b2;
                        } else {
                            user = null;
                        }
                        this.x2 = user;
                    }
                    if (user == null) {
                        if (!this.y2 && !this.z2) {
                            this.y2 = true;
                            oc7.r1(this.a).Z1().a(str, null, new eg9(this, (byte) 3));
                            return;
                        }
                        return;
                    }
                    this.v2 = true;
                    TLRPC.User f = z8c.h(this.a).f();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = oc7.r1(this.a).p1(this.x2);
                    tL_messages_getInlineBotResults.peer = oc7.m1(f);
                    tL_messages_getInlineBotResults.offset = (this.Y1.isEmpty() || (r0 = this.t2) == null) ? "" : "";
                    String str5 = this.l2;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.B2 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.A2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getInlineBotResults, new kc((byte) 0), new wz9(this, (byte) 1));
                    this.j2.O(true);
                }
            }
        }
    }

    public final void c1() {
        if (!this.U1) {
            String str = this.q2;
            String str2 = this.l2;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                a1();
            }
            if (!this.o2) {
                ArrayList arrayList = this.X1;
                if (!arrayList.isEmpty() && !this.n2) {
                    return;
                }
                this.o2 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.l2;
                if (str4 != null) {
                    str3 = str4;
                }
                this.q2 = str3;
                tL_messages_searchGlobal.q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    k47 k47Var = (k47) b10.f(1, arrayList);
                    tL_messages_searchGlobal.offset_id = k47Var.e1();
                    tL_messages_searchGlobal.offset_rate = this.m2;
                    tL_messages_searchGlobal.offset_peer = oc7.r1(this.a).i1(k47.B1(k47Var.k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.r2 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_searchGlobal, new go9(this, (byte) 1));
                this.j2.O(true);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.W3) {
            this.j2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.k2 != null && MediaController.w().D(this.k2)) {
            MediaController.w().l(true, true, false, false);
        }
        this.k2 = null;
    }

    public final void e1() {
        float f = gm.q.y;
        boolean z = false;
        int i = 0;
        while (true) {
            r59 r59Var = this.n1;
            if (i >= r59Var.getChildCount()) {
                break;
            }
            View childAt = r59Var.getChildAt(i);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f) {
                f = childAt.getY();
            }
            i++;
        }
        this.e2.setTranslationY(Math.max(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.m, f));
        if (f <= org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.m) {
            z = true;
        }
        this.S1.a(z, true);
    }

    @Override
    public final int getObserverTag() {
        return this.T1;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.W3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.W3);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            kz4 kz4Var = this.h2;
            if (kz4Var != null) {
                kz4Var.a(cmb.v0(cmb.c6, this.J0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void A(boolean z) {
    }

    @Override
    public final void V(float f, int i) {
    }

    @Override
    public final void i(long j, long j2) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
