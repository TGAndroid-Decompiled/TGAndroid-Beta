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
public final class yx9 extends fy0 implements gk7, sp3, x74 {
    public int A2;
    public String B2;
    public int C2;
    public final vx9 D2;
    public boolean E2;
    public final fm0 S1;
    public final int T1;
    public boolean U1;
    public final yx9 V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ia7 Z1;
    public final p8c a2;
    public k27 b2;
    public boolean c2;
    public boolean d2;
    public final FrameLayout e2;
    public final w02 f2;
    public final cq3 g2;
    public final ix4 h2;
    public final vw0 i2;
    public l5c j2;
    public k27 k2;
    public String l2;
    public int m2;
    public boolean n2;
    public boolean o2;
    public boolean p2;
    public String q2;
    public int r2;
    public final vx9 s2;
    public String t2;
    public boolean u2;
    public boolean v2;
    public boolean w2;
    public TLRPC.User x2;
    public boolean y2;
    public boolean z2;

    public yx9(Context context, boolean z, yx9 yx9Var, p8c p8cVar, f53 f53Var) {
        super(2, (wjb) f53Var, context, true);
        kl0 kl0Var;
        int L;
        s33 s33Var = s33.h;
        this.S1 = new fm0(0, this, s33Var, 380L, false);
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.r2 = -1;
        this.s2 = new Runnable(this) {
            public final yx9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        yx9 yx9Var2 = this.b;
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
                                long e = y6c.h(yx9Var2.a).e();
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
                                String D = ba4.D(file);
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
                                arrayList.add(new k27(yx9Var2.a, tL_message, false, true));
                                i--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        gl.c3(new tj9(yx9Var2, arrayList, (byte) 21));
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
            public final yx9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        yx9 yx9Var2 = this.b;
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
                                long e = y6c.h(yx9Var2.a).e();
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
                                String D = ba4.D(file);
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
                                arrayList.add(new k27(yx9Var2.a, tL_message, false, true));
                                i--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        gl.c3(new tj9(yx9Var2, arrayList, (byte) 21));
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
        K();
        T0();
        this.C1 = gl.L(4.0f);
        this.D1 = gl.L(-20.0f);
        this.U1 = z;
        this.T1 = up3.q(this.a).k();
        this.V1 = yx9Var;
        this.a2 = p8cVar;
        ix4 d = this.X0.d(new xx9(this));
        this.h2 = d;
        if (Build.VERSION.SDK_INT >= 31 && gba.f()) {
            cq3 cq3Var = new cq3(false);
            this.g2 = cq3Var;
            this.X0.a(cq3Var);
            lx4 lx4Var = new lx4(d);
            lx4Var.f = d;
            lx4Var.d = cq3Var;
            lx4Var.e = -2;
            kl0Var = new kl0(lx4Var, lx4Var, lx4Var);
            kl0Var.k = true;
            if (e66.e(262144)) {
                L = gl.L(8.0f);
            } else {
                L = gl.L(48.0f);
            }
            kl0Var.d = L;
            kl0Var.e = L;
            kl0Var.j = this.X0;
        } else {
            this.g2 = null;
            kl0Var = new kl0(d, d, d);
        }
        this.i2 = new vw0(this, (byte) 9);
        int i = bkb.Z6;
        w02 w02Var = new w02(i, f53Var, context);
        this.f2 = w02Var;
        w02Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e2 = frameLayout;
        no4 no4Var = new no4(context, f53Var);
        no4Var.r.setOnFocusChangeListener(new vs3(this, (byte) 3));
        no4Var.x = true;
        no4Var.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
        no4Var.updateColors();
        no4Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        no4Var.r.addTextChangedListener(new jf6(this, (byte) 10));
        no4Var.r.setHint(k96.M0(2131745644, null));
        frameLayout.addView(w02Var, nme.g());
        frameLayout.addView(no4Var, nme.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        no4Var.setupBlurredBackground(kl0Var.c(no4Var, nod.n(f53Var), false));
        frameLayout.setPadding(gl.L(8.0f) + this.u0, 0, gl.L(8.0f) + this.u0, 0);
        this.b.addView(frameLayout, nme.e(-1, -2, 55));
        t0(i);
        o39 o39Var = this.n1;
        int i2 = this.u0;
        o39Var.setPadding(i2, 0, i2, 0);
        this.n1.r1();
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33Var);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        if (!z) {
            int i3 = this.a;
            ia7 ia7Var = new ia7(i3, y6c.h(i3).e());
            this.Z1 = ia7Var;
            ia7Var.b();
            c1();
            b1();
        } else {
            this.Z1 = null;
            if (this.U1 && !this.E2) {
                this.E2 = true;
                Utilities.e.c(new Runnable(this) {
                    public final yx9 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                yx9 yx9Var2 = this.b;
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
                                        long e = y6c.h(yx9Var2.a).e();
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
                                        String D = ba4.D(file);
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
                                        arrayList.add(new k27(yx9Var2.a, tL_message, false, true));
                                        i4--;
                                    }
                                    query.close();
                                } catch (Exception e2) {
                                    fa4.g(e2, true);
                                }
                                gl.c3(new tj9(yx9Var2, arrayList, (byte) 21));
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
        this.n1.setOnScrollListener(new n58(this, (byte) 15));
        this.n1.setOnItemClickListener(new ir(this, p8cVar, f53Var, (byte) 4));
        this.X0.b(this.n1);
        this.X0.i(this.b);
        qw4 qw4Var = this.X0;
        qw4Var.a = new xx9(this);
        qw4Var.d = new ax4(gl.L(48.0f));
    }

    public static boolean d1(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !de9.t(" ", str, lowerCase)) {
                String I3 = gl.I3(lowerCase);
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
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, false, new ux9(this, (byte) 0), this.J0);
        this.j2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131744368, null);
    }

    @Override
    public final void N(String str) {
        k27 k27Var = this.b2;
        if (k27Var != null && TextUtils.equals(k27Var.S0(), str)) {
            this.a2.a(this.b2);
            yx9 yx9Var = this.V1;
            if (yx9Var != null) {
                yx9Var.dismiss();
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
            String I3 = gl.I3(lowerCase);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                k27 k27Var = (k27) obj;
                if (!z) {
                    k27Var.J5(this.l2, true);
                    arrayList3.add(k27Var);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.X1) {
                    String y1 = k27Var.y1(true);
                    String w1 = k27Var.w1(true);
                    if (d1(lowerCase, I3, y1) || d1(lowerCase, I3, w1)) {
                        k27Var.J5(this.l2, true);
                        arrayList3.add(k27Var);
                    }
                } else {
                    k27Var.J5(null, true);
                    arrayList3.add(k27Var);
                }
            }
            if (!arrayList3.isEmpty() || z2) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(c4c.C(null));
                    i2 = gl.L(12.0f);
                } else {
                    i2 = 0;
                }
                this.j2.V();
                arrayList.add(c4c.u(str));
                int size2 = arrayList3.size();
                while (i3 < size2) {
                    Object obj2 = arrayList3.get(i3);
                    i3++;
                    z02 z02Var = new z02(this, (byte) 8);
                    int i5 = dba.b;
                    c4c K = c4c.K(dba.class);
                    K.H = (k27) obj2;
                    K.I = z02Var;
                    arrayList.add(K);
                    i2 += gl.L(56.0f);
                }
                if (z2) {
                    arrayList.add(c4c.p(4));
                    arrayList.add(c4c.p(4));
                    arrayList.add(c4c.p(4));
                    i2 += gl.L(56.0f) * 3;
                }
                if (z3 && !z2) {
                    c4c c = c4c.c(i, 2131230871, k96.M0(2131745147, null));
                    c.r = true;
                    arrayList.add(c);
                    i2 += gl.L(50.0f);
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
        String str = na7.q1(this.a).k4.J.f;
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
                        TLObject a2 = na7.q1(this.a).a2(str);
                        if (a2 instanceof TLRPC.User) {
                            user = (TLRPC.User) a2;
                        } else {
                            user = null;
                        }
                        this.x2 = user;
                    }
                    if (user == null) {
                        if (!this.y2 && !this.z2) {
                            this.y2 = true;
                            na7.q1(this.a).Y1().a(str, null, new ae9(this, (byte) 3));
                            return;
                        }
                        return;
                    }
                    this.v2 = true;
                    TLRPC.User f = y6c.h(this.a).f();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = na7.q1(this.a).o1(this.x2);
                    tL_messages_getInlineBotResults.peer = na7.l1(f);
                    tL_messages_getInlineBotResults.offset = (this.Y1.isEmpty() || (r0 = this.t2) == null) ? "" : "";
                    String str5 = this.l2;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.B2 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.A2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getInlineBotResults, new hc((byte) 0), new ux9(this, (byte) 1));
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
                    k27 k27Var = (k27) b00.f(1, arrayList);
                    tL_messages_searchGlobal.offset_id = k27Var.e1();
                    tL_messages_searchGlobal.offset_rate = this.m2;
                    tL_messages_searchGlobal.offset_peer = na7.q1(this.a).h1(k27.B1(k27Var.k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.r2 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_searchGlobal, new wx9(this, (byte) 0));
                this.j2.O(true);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.V3) {
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
        float f = gl.q.y;
        boolean z = false;
        int i = 0;
        while (true) {
            o39 o39Var = this.n1;
            if (i >= o39Var.getChildCount()) {
                break;
            }
            View childAt = o39Var.getChildAt(i);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f) {
                f = childAt.getY();
            }
            i++;
        }
        this.e2.setTranslationY(Math.max(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.m, f));
        if (f <= org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.m) {
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
        kk7.f(this.a).b(this, kk7.V3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.V3);
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        int i2;
        if (i == 0) {
            w02 w02Var = this.f2;
            w02Var.setAlpha(f);
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            w02Var.setVisibility(i2);
        }
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            ix4 ix4Var = this.h2;
            if (ix4Var != null) {
                ix4Var.a(bkb.v0(bkb.c6, this.J0));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void B(boolean z) {
    }

    @Override
    public final void F(float f, int i) {
    }

    @Override
    public final void i(long j, long j2) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
