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
public final class r1a extends ny0 implements fn7, jq3, s84 {
    public int A2;
    public String B2;
    public int C2;
    public final p1a D2;
    public boolean E2;
    public final fm0 S1;
    public final int T1;
    public boolean U1;
    public final r1a V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final pc7 Z1;
    public final pcc a2;
    public r47 b2;
    public boolean c2;
    public boolean d2;
    public final FrameLayout e2;
    public final m12 f2;
    public final tq3 g2;
    public final oz4 h2;
    public final mr0 i2;
    public l9c j2;
    public r47 k2;
    public String l2;
    public int m2;
    public boolean n2;
    public boolean o2;
    public boolean p2;
    public String q2;
    public int r2;
    public final p1a s2;
    public String t2;
    public boolean u2;
    public boolean v2;
    public boolean w2;
    public TLRPC.User x2;
    public boolean y2;
    public boolean z2;

    public r1a(Context context, boolean z, r1a r1aVar, pcc pccVar, x53 x53Var) {
        super(2, (vnb) x53Var, context, true);
        ll0 ll0Var;
        int L;
        k43 k43Var = k43.h;
        this.S1 = new fm0(0, this, k43Var, 380L, false);
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.r2 = -1;
        this.s2 = new Runnable(this) {
            public final r1a b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        r1a r1aVar2 = this.b;
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
                                long e = yac.h(r1aVar2.a).e();
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
                                String D = xb4.D(file);
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
                                arrayList.add(new r47(r1aVar2.a, tL_message, false, true));
                                i--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        hl.c3(new en9(r1aVar2, arrayList, (byte) 20));
                        return;
                    case 1:
                        this.b.d1();
                        return;
                    default:
                        this.b.c1();
                        return;
                }
            }
        };
        this.A2 = -1;
        this.C2 = -2000000000;
        this.D2 = new Runnable(this) {
            public final r1a b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        r1a r1aVar2 = this.b;
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
                                long e = yac.h(r1aVar2.a).e();
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
                                String D = xb4.D(file);
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
                                arrayList.add(new r47(r1aVar2.a, tL_message, false, true));
                                i--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        hl.c3(new en9(r1aVar2, arrayList, (byte) 20));
                        return;
                    case 1:
                        this.b.d1();
                        return;
                    default:
                        this.b.c1();
                        return;
                }
            }
        };
        this.u1 = 0.35f;
        J();
        U0();
        this.C1 = hl.L(4.0f);
        this.D1 = hl.L(-20.0f);
        this.U1 = z;
        this.T1 = lq3.q(this.a).k();
        this.V1 = r1aVar;
        this.a2 = pccVar;
        oz4 d = this.X0.d(new q1a(this));
        this.h2 = d;
        if (Build.VERSION.SDK_INT >= 31 && xea.f()) {
            tq3 tq3Var = new tq3(false);
            this.g2 = tq3Var;
            this.X0.a(tq3Var);
            rz4 rz4Var = new rz4(d);
            rz4Var.f = d;
            rz4Var.d = tq3Var;
            rz4Var.e = -2;
            ll0Var = new ll0(rz4Var, rz4Var, rz4Var);
            ll0Var.k = true;
            if (i86.e(262144)) {
                L = hl.L(8.0f);
            } else {
                L = hl.L(48.0f);
            }
            ll0Var.d = L;
            ll0Var.e = L;
            ll0Var.j = this.X0;
        } else {
            this.g2 = null;
            ll0Var = new ll0(d, d, d);
        }
        this.i2 = new mr0(this, (byte) 10);
        int i = aob.a7;
        m12 m12Var = new m12(i, x53Var, context);
        this.f2 = m12Var;
        m12Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e2 = frameLayout;
        rq4 rq4Var = new rq4(context, x53Var);
        rq4Var.r.setOnFocusChangeListener(new nt3(this, (byte) 3));
        rq4Var.x = true;
        rq4Var.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
        rq4Var.updateColors();
        rq4Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        rq4Var.r.addTextChangedListener(new nh6(this, (byte) 11));
        rq4Var.r.setHint(ob6.M0(2131745564, null));
        frameLayout.addView(m12Var, tre.g());
        frameLayout.addView(rq4Var, tre.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        rq4Var.setupBlurredBackground(ll0Var.c(rq4Var, dtd.n(x53Var), false));
        frameLayout.setPadding(hl.L(8.0f) + this.u0, 0, hl.L(8.0f) + this.u0, 0);
        this.b.addView(frameLayout, tre.e(-1, -2, 55));
        t0(i);
        d79 d79Var = this.n1;
        int i2 = this.u0;
        d79Var.setPadding(i2, 0, i2, 0);
        this.n1.s1();
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43Var);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        if (!z) {
            int i3 = this.a;
            pc7 pc7Var = new pc7(i3, yac.h(i3).e());
            this.Z1 = pc7Var;
            pc7Var.b();
            d1();
            c1();
        } else {
            this.Z1 = null;
            if (this.U1 && !this.E2) {
                this.E2 = true;
                Utilities.e.c(new Runnable(this) {
                    public final r1a b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                r1a r1aVar2 = this.b;
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
                                        long e = yac.h(r1aVar2.a).e();
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
                                        String D = xb4.D(file);
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
                                        arrayList.add(new r47(r1aVar2.a, tL_message, false, true));
                                        i4--;
                                    }
                                    query.close();
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                }
                                hl.c3(new en9(r1aVar2, arrayList, (byte) 20));
                                return;
                            case 1:
                                this.b.d1();
                                return;
                            default:
                                this.b.c1();
                                return;
                        }
                    }
                });
            }
        }
        this.n1.setOnScrollListener(new e98(this, (byte) 15));
        this.n1.setOnItemClickListener(new jr(this, pccVar, x53Var, (byte) 4));
        this.X0.b(this.n1);
        this.X0.i(this.b);
        vy4 vy4Var = this.X0;
        vy4Var.a = new q1a(this);
        vy4Var.d = new gz4(hl.L(48.0f));
    }

    public static boolean e1(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !uh9.t(" ", str, lowerCase)) {
                String I3 = hl.I3(lowerCase);
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
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, false, new o1a(this, (byte) 0), this.J0);
        this.j2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131744262, null);
    }

    @Override
    public final void N(String str) {
        r47 r47Var = this.b2;
        if (r47Var != null && TextUtils.equals(r47Var.S0(), str)) {
            this.a2.a(this.b2);
            r1a r1aVar = this.V1;
            if (r1aVar != null) {
                r1aVar.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final void S0(Canvas canvas, View view) {
        f1();
        super.S0(canvas, view);
    }

    public final int Z0(boolean z, ArrayList arrayList, String str, ArrayList arrayList2, boolean z2, boolean z3, int i) {
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
            String I3 = hl.I3(lowerCase);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                r47 r47Var = (r47) obj;
                if (!z) {
                    r47Var.J5(this.l2, true);
                    arrayList3.add(r47Var);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.X1) {
                    String y1 = r47Var.y1(true);
                    String w1 = r47Var.w1(true);
                    if (e1(lowerCase, I3, y1) || e1(lowerCase, I3, w1)) {
                        r47Var.J5(this.l2, true);
                        arrayList3.add(r47Var);
                    }
                } else {
                    r47Var.J5(null, true);
                    arrayList3.add(r47Var);
                }
            }
            if (!arrayList3.isEmpty() || z2) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(b8c.C(null));
                    i2 = hl.L(12.0f);
                } else {
                    i2 = 0;
                }
                this.j2.V();
                arrayList.add(b8c.u(str));
                int size2 = arrayList3.size();
                while (i3 < size2) {
                    Object obj2 = arrayList3.get(i3);
                    i3++;
                    p12 p12Var = new p12(this, (byte) 8);
                    int i5 = uea.b;
                    b8c K = b8c.K(uea.class);
                    K.H = (r47) obj2;
                    K.I = p12Var;
                    arrayList.add(K);
                    i2 += hl.L(56.0f);
                }
                if (z2) {
                    arrayList.add(b8c.p(4));
                    arrayList.add(b8c.p(4));
                    arrayList.add(b8c.p(4));
                    i2 += hl.L(56.0f) * 3;
                }
                if (z3 && !z2) {
                    b8c c = b8c.c(i, 2131230871, ob6.M0(2131745067, null));
                    c.r = true;
                    arrayList.add(c);
                    i2 += hl.L(50.0f);
                }
                this.j2.U();
                return i2;
            }
        }
        return 0;
    }

    public final void a1() {
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

    public final void b1() {
        if (this.r2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.r2, true);
        }
        this.r2 = -1;
        this.m2 = 0;
        this.X1.clear();
        this.o2 = false;
        this.p2 = false;
    }

    public final void c1() {
        String str = uc7.s1(this.a).k4.Q.f;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.B2;
            String str3 = this.l2;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                a1();
            }
            if (!this.v2 && !TextUtils.isEmpty(this.l2) && this.l2.length() >= 3) {
                if (this.Y1.isEmpty() || this.u2) {
                    TLRPC.User user = this.x2;
                    if (user == null) {
                        TLObject c2 = uc7.s1(this.a).c2(str);
                        if (c2 instanceof TLRPC.User) {
                            user = (TLRPC.User) c2;
                        } else {
                            user = null;
                        }
                        this.x2 = user;
                    }
                    if (user == null) {
                        if (!this.y2 && !this.z2) {
                            this.y2 = true;
                            uc7.s1(this.a).a2().a(str, null, new sh9(this, (byte) 3));
                            return;
                        }
                        return;
                    }
                    this.v2 = true;
                    TLRPC.User f = yac.h(this.a).f();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = uc7.s1(this.a).q1(this.x2);
                    tL_messages_getInlineBotResults.peer = uc7.n1(f);
                    tL_messages_getInlineBotResults.offset = (this.Y1.isEmpty() || (r0 = this.t2) == null) ? "" : "";
                    String str5 = this.l2;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.B2 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.A2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getInlineBotResults, new ic((byte) 0), new o1a(this, (byte) 1));
                    this.j2.O(true);
                }
            }
        }
    }

    public final void d1() {
        if (!this.U1) {
            String str = this.q2;
            String str2 = this.l2;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                b1();
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
                    r47 r47Var = (r47) c00.g(1, arrayList);
                    tL_messages_searchGlobal.offset_id = r47Var.e1();
                    tL_messages_searchGlobal.offset_rate = this.m2;
                    tL_messages_searchGlobal.offset_peer = uc7.s1(this.a).j1(r47.B1(r47Var.k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.r2 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_searchGlobal, new yp9(this, (byte) 1));
                this.j2.O(true);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.W3) {
            this.j2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.k2 != null && MediaController.z().H(this.k2)) {
            MediaController.z().m(true, true, false, false);
        }
        this.k2 = null;
    }

    public final void f1() {
        float f = hl.q.y;
        boolean z = false;
        int i = 0;
        while (true) {
            d79 d79Var = this.n1;
            if (i >= d79Var.getChildCount()) {
                break;
            }
            View childAt = d79Var.getChildAt(i);
            if (RecyclerView.S(childAt) >= 1 && childAt.getY() < f) {
                f = childAt.getY();
            }
            i++;
        }
        this.e2.setTranslationY(Math.max(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.m, f));
        if (f <= org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.m) {
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
        jn7.f(this.a).b(this, jn7.W3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.W3);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            oz4 oz4Var = this.h2;
            if (oz4Var != null) {
                oz4Var.a(aob.v0(aob.d6, this.J0));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        if (i == 0) {
            m12 m12Var = this.f2;
            m12Var.setAlpha(f);
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            m12Var.setVisibility(i2);
        }
    }

    @Override
    public final void B(boolean z) {
    }

    @Override
    public final void i(long j, long j2) {
    }

    @Override
    public final void l(long j, long j2) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
