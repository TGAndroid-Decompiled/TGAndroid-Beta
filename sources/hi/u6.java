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
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.qc;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.ti;
public final class u6 extends org.telegram.ui.Components.sa implements gs, org.telegram.messenger.y5, te.b {
    public boolean A2;
    public boolean B2;
    public int C2;
    public String D2;
    public int E2;
    public final p6 F2;
    public boolean G2;
    public final te.a T1;
    public final int U1;
    public boolean V1;
    public final u6 W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final hp f15547a2;
    public final y10 f15548b2;
    public gj f15549c2;
    public boolean d2;
    public boolean f15550e2;
    public final FrameLayout f15551f2;
    public final ti f15552g2;
    public final dh.g f15553h2;
    public final ui.c f15554i2;
    public final dh.c f15555j2;
    public final r6 f15556k2;
    public c51 f15557l2;
    public gj f15558m2;
    public String f15559n2;
    public int f15560o2;
    public boolean f15561p2;
    public boolean f15562q2;
    public boolean f15563r2;
    public String f15564s2;
    public int f15565t2;
    public final p6 f15566u2;
    public String f15567v2;
    public boolean f15568w2;
    public boolean f15569x2;
    public boolean f15570y2;
    public TLRPC.User f15571z2;

    public u6(Context context, boolean z10, u6 u6Var, y10 y10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(2, context, h6Var, true);
        int L;
        nr nrVar = nr.h;
        this.T1 = new te.a(0, this, nrVar, 380L, false);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f15565t2 = -1;
        this.f15566u2 = new Runnable(this) {
            public final u6 f15265b;

            {
                this.f15265b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        u6 u6Var2 = this.f15265b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f26931b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                    tL_message.f28455id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = k10.i(u6Var2.f30173a).e();
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
                                        document.f28440id = 0L;
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
                                        arrayList.add(new gj(u6Var2.f30173a, tL_message, false, true));
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
                        org.telegram.messenger.g0.g3(new c(13, u6Var2, arrayList));
                        return;
                    case 1:
                        this.f15265b.i1();
                        return;
                    default:
                        this.f15265b.h1();
                        return;
                }
            }
        };
        this.C2 = -1;
        this.E2 = -2000000000;
        this.F2 = new Runnable(this) {
            public final u6 f15265b;

            {
                this.f15265b = this;
            }

            @Override
            public final void run() {
                Cursor cursor;
                switch (r2) {
                    case 0:
                        u6 u6Var2 = this.f15265b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            Cursor query = org.telegram.messenger.t0.f26931b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                    tL_message.f28455id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = query;
                                    try {
                                        long e10 = k10.i(u6Var2.f30173a).e();
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
                                        document.f28440id = 0L;
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
                                        arrayList.add(new gj(u6Var2.f30173a, tL_message, false, true));
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
                        org.telegram.messenger.g0.g3(new c(13, u6Var2, arrayList));
                        return;
                    case 1:
                        this.f15265b.i1();
                        return;
                    default:
                        this.f15265b.h1();
                        return;
                }
            }
        };
        this.f39539v1 = 0.35f;
        O();
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-20.0f);
        this.V1 = z10;
        this.U1 = org.telegram.messenger.a6.q(this.f30173a).k();
        this.W1 = u6Var;
        this.f15548b2 = y10Var;
        ui.c d = this.Y0.d(new q6(this));
        this.f15554i2 = d;
        if (Build.VERSION.SDK_INT >= 31 && cz.f()) {
            dh.g gVar = new dh.g(false);
            this.f15553h2 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(d);
            fVar.f59050f = d;
            fVar.d = gVar;
            fVar.f59049e = -2;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f15555j2 = cVar;
            cVar.f8411k = true;
            if (qc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8406e = L;
            cVar.f8410j = this.Y0;
        } else {
            this.f15553h2 = null;
            this.f15555j2 = new dh.c(d, d, d);
        }
        this.f15556k2 = new r6(this, 0);
        int i7 = org.telegram.ui.ActionBar.m6.f29324a7;
        ti tiVar = new ti(i7, context, h6Var);
        this.f15552g2 = tiVar;
        tiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15551f2 = frameLayout;
        e10 e10Var = new e10(context, h6Var);
        e10Var.f34642r.setOnFocusChangeListener(new t6(this, 0));
        e10Var.f34645x = true;
        e10Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        e10Var.updateColors();
        e10Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        e10Var.f34642r.addTextChangedListener(new ah.j(this, 7));
        e10Var.f34642r.setHint(hd.N0(2131745640, null));
        frameLayout.addView(tiVar, c8.ma.g());
        frameLayout.addView(e10Var, c8.ma.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        e10Var.setupBlurredBackground(this.f15555j2.c(e10Var, c8.i0.o(h6Var), false));
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f30211u0, 0, org.telegram.messenger.g0.L(8.0f) + this.f30211u0, 0);
        this.f30176b.addView(frameLayout, c8.ma.e(-1, -2, 55));
        w0(i7);
        ek0 ek0Var = this.f39532o1;
        int i10 = this.f30211u0;
        ek0Var.setPadding(i10, 0, i10, 0);
        this.f39532o1.r1();
        v4.k kVar = new v4.k();
        kVar.f59194m = false;
        kVar.C = false;
        kVar.o(nrVar);
        kVar.n(350L);
        this.f39532o1.setItemAnimator(kVar);
        if (!z10) {
            int i11 = this.f30173a;
            hp hpVar = new hp(i11, k10.i(i11).e());
            this.f15547a2 = hpVar;
            hpVar.b();
            i1();
            h1();
        } else {
            this.f15547a2 = null;
            if (this.V1 && !this.G2) {
                this.G2 = true;
                Utilities.f22810e.c(new Runnable(this) {
                    public final u6 f15265b;

                    {
                        this.f15265b = this;
                    }

                    @Override
                    public final void run() {
                        Cursor cursor;
                        switch (r2) {
                            case 0:
                                u6 u6Var2 = this.f15265b;
                                String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                                ArrayList arrayList = new ArrayList();
                                ?? r42 = 1;
                                try {
                                    Cursor query = org.telegram.messenger.t0.f26931b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
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
                                            tL_message.f28455id = i72;
                                            tL_message.peer_id = new TLRPC.TL_peerUser();
                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser;
                                            TLRPC.Peer peer = tL_message.peer_id;
                                            cursor = query;
                                            try {
                                                long e10 = k10.i(u6Var2.f30173a).e();
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
                                                document.f28440id = 0L;
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
                                                arrayList.add(new gj(u6Var2.f30173a, tL_message, false, true));
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
                                org.telegram.messenger.g0.g3(new c(13, u6Var2, arrayList));
                                return;
                            case 1:
                                this.f15265b.i1();
                                return;
                            default:
                                this.f15265b.h1();
                                return;
                        }
                    }
                });
            }
        }
        this.f39532o1.setOnScrollListener(new bi.u1(this, 16));
        this.f39532o1.setOnItemClickListener(new bi.t1(this, y10Var, h6Var, 2));
        this.Y0.b(this.f39532o1);
        this.Y0.i(this.f30176b);
        ri.q qVar = this.Y0;
        qVar.f56739a = new q6(this);
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
            ti tiVar = this.f15552g2;
            tiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            tiVar.setVisibility(i10);
        }
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30173a, 0, false, new o6(this, 0), this.J0);
        this.f15557l2 = c51Var;
        c51Var.f34062r = false;
        return c51Var;
    }

    @Override
    public final void N(String str) {
        gj gjVar = this.f15549c2;
        if (gjVar != null && TextUtils.equals(gjVar.S0(), str)) {
            this.f15548b2.a(this.f15549c2);
            u6 u6Var = this.W1;
            if (u6Var != null) {
                u6Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final CharSequence P0() {
        return hd.N0(2131744365, null);
    }

    @Override
    public final void X0(Canvas canvas, View view) {
        k1();
        super.X0(canvas, view);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.W3) {
            this.f15557l2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f15558m2 != null && MediaController.B().I(this.f15558m2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.f15558m2 = null;
    }

    public final int e1(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i7) {
        String lowerCase;
        int i10;
        int i11 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f15559n2;
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
                gj gjVar = (gj) obj;
                if (!z10) {
                    gjVar.K5(this.f15559n2, true);
                    arrayList3.add(gjVar);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.Y1) {
                    String y12 = gjVar.y1(true);
                    String w12 = gjVar.w1(true);
                    if (j1(lowerCase, M3, y12) || j1(lowerCase, M3, w12)) {
                        gjVar.K5(this.f15559n2, true);
                        arrayList3.add(gjVar);
                    }
                } else {
                    gjVar.K5(null, true);
                    arrayList3.add(gjVar);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(o41.C(null));
                    i10 = org.telegram.messenger.g0.L(12.0f);
                } else {
                    i10 = 0;
                }
                this.f15557l2.V();
                arrayList.add(o41.u(str));
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    di.ta taVar = new di.ta(this, 1);
                    int i13 = org.telegram.ui.Cells.g7.f30710b;
                    o41 K = o41.K(org.telegram.ui.Cells.g7.class);
                    K.H = (gj) obj2;
                    K.I = taVar;
                    arrayList.add(K);
                    i10 += org.telegram.messenger.g0.L(56.0f);
                }
                if (z11) {
                    arrayList.add(o41.p(4));
                    arrayList.add(o41.p(4));
                    arrayList.add(o41.p(4));
                    i10 += org.telegram.messenger.g0.L(56.0f) * 3;
                }
                if (z12 && !z11) {
                    o41 c10 = o41.c(i7, 2131230871, hd.N0(2131745143, null));
                    c10.f38097r = true;
                    arrayList.add(c10);
                    i10 += org.telegram.messenger.g0.L(50.0f);
                }
                this.f15557l2.U();
                return i10;
            }
        }
        return 0;
    }

    public final void f1() {
        if (this.C2 >= 0) {
            ConnectionsManager.getInstance(this.f30173a).cancelRequest(this.C2, true);
        }
        this.C2 = -1;
        this.f15567v2 = "";
        this.f15568w2 = false;
        this.Z1.clear();
        this.f15569x2 = false;
        this.f15570y2 = false;
    }

    public final void g1() {
        if (this.f15565t2 >= 0) {
            ConnectionsManager.getInstance(this.f30173a).cancelRequest(this.f15565t2, true);
        }
        this.f15565t2 = -1;
        this.f15560o2 = 0;
        this.Y1.clear();
        this.f15562q2 = false;
        this.f15563r2 = false;
    }

    @Override
    public final int getObserverTag() {
        return this.U1;
    }

    public final void h1() {
        TLRPC.User user;
        String str = ((org.telegram.messenger.n0) np.u1(this.f30173a).A7.K.f15508b).f25711c;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.D2;
            String str3 = this.f15559n2;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                f1();
            }
            if (!this.f15569x2 && !TextUtils.isEmpty(this.f15559n2) && this.f15559n2.length() >= 3) {
                ArrayList arrayList = this.Z1;
                if (arrayList.isEmpty() || this.f15568w2) {
                    if (this.f15571z2 == null) {
                        TLObject h22 = np.u1(this.f30173a).h2(str);
                        if (h22 instanceof TLRPC.User) {
                            user = (TLRPC.User) h22;
                        } else {
                            user = null;
                        }
                        this.f15571z2 = user;
                    }
                    if (this.f15571z2 == null) {
                        if (!this.A2 && !this.B2) {
                            this.A2 = true;
                            np.u1(this.f30173a).f2().a(str, null, new s6(this, 0));
                            return;
                        }
                        return;
                    }
                    this.f15569x2 = true;
                    TLRPC.User f10 = k10.i(this.f30173a).f();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = np.u1(this.f30173a).s1(this.f15571z2);
                    tL_messages_getInlineBotResults.peer = np.p1(f10);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.f15567v2) == null) ? "" : "";
                    String str5 = this.f15559n2;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.D2 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.C2 = ConnectionsManager.getInstance(this.f30173a).sendRequestTyped(tL_messages_getInlineBotResults, new d3.b(1), new o6(this, 1));
                    this.f15557l2.O(true);
                }
            }
        }
    }

    public final void i1() {
        if (!this.V1) {
            String str = this.f15564s2;
            String str2 = this.f15559n2;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                g1();
            }
            if (!this.f15562q2) {
                ArrayList arrayList = this.Y1;
                if (!arrayList.isEmpty() && !this.f15561p2) {
                    return;
                }
                this.f15562q2 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f15559n2;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f15564s2 = str3;
                tL_messages_searchGlobal.f28547q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    gj gjVar = (gj) i5.c.h(1, arrayList);
                    tL_messages_searchGlobal.offset_id = gjVar.e1();
                    tL_messages_searchGlobal.offset_rate = this.f15560o2;
                    tL_messages_searchGlobal.offset_peer = np.u1(this.f30173a).l1(gj.B1(gjVar.f24213k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f15565t2 = ConnectionsManager.getInstance(this.f30173a).sendRequest(tL_messages_searchGlobal, new ai.g1(this, 10));
                this.f15557l2.O(true);
            }
        }
    }

    public final void k1() {
        float f10 = org.telegram.messenger.g0.f24046q.y;
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.f39532o1;
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        this.f15551f2.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m, f10));
        if (f10 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m) {
            z10 = true;
        }
        this.T1.a(z10, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(this.f30173a).c(this, ls.W3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.f30173a).n(this, ls.W3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            ui.c cVar = this.f15554i2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, this.J0));
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
