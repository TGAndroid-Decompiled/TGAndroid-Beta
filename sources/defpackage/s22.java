package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s22 extends a22 implements jm7, g94 {
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public final HashSet J;
    public final jc7 K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public p22 O;
    public k47 P;
    public final boolean Q;
    public final byte R;
    public final byte S;
    public final j22 T;
    public int U;
    public int V;
    public String W;
    public boolean a0;
    public final j22 b0;
    public int c0;
    public boolean d0;
    public int e0;
    public String f0;
    public final j22 g0;
    public boolean h0;
    public TLRPC.User i0;
    public boolean j0;
    public boolean k0;
    public String l0;
    public int m0;
    public final fn0 n;
    public boolean n0;
    public final FrameLayout r;
    public final e22 s;
    public final va w;
    public final h22 x;
    public final qk3 y;

    public s22(i22 i22Var, ylb ylbVar, Context context) {
        super(i22Var, ylbVar, context);
        FrameLayout frameLayout;
        this.n = new fn0(0, this, d53.h, 380L, false);
        this.F = -1;
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.Q = true;
        this.R = (byte) 2;
        this.S = (byte) 3;
        this.T = new Runnable(this) {
            public final s22 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        va vaVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = vaVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < vaVar.getChildCount()) {
                                View childAt = vaVar.getChildAt(i3);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i2 = top;
                                    i = R;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = R;
                                }
                            }
                        }
                        vaVar.g3.O(true);
                        if (!canScrollVertically) {
                            vaVar.f3.g1(0, 0);
                            return;
                        } else if (i >= 0) {
                            vaVar.f3.g1(i, i2 - vaVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        s22 s22Var = this.b;
                        s22Var.O();
                        s22Var.b.H1(s22Var, 0);
                        return;
                    default:
                        s22 s22Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.a = query.getString(1);
                                obj.b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.id = i4;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = z8c.h(s22Var2.b.G3).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
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
                                tL_documentAttributeAudio.duration = obj.c;
                                tL_documentAttributeAudio.title = obj.b;
                                tL_documentAttributeAudio.performer = obj.a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.e = new k47(s22Var2.b.G3, tL_message, false, true);
                                g10 a = g10.a(file);
                                if (a != null && a.o != null) {
                                    int L = gm.L(44.0f);
                                    Bitmap bitmap = a.o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.e.J1 = bitmap;
                                    } else {
                                        float f = L;
                                        float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                        obj.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                }
                                arrayList.add(obj);
                                i4--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                        gm.c3(new lx1(s22Var2, arrayList, (byte) 10));
                        return;
                }
            }
        };
        this.V = -1;
        this.b0 = new Runnable(this) {
            public final s22 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        va vaVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = vaVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < vaVar.getChildCount()) {
                                View childAt = vaVar.getChildAt(i3);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i2 = top;
                                    i = R;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = R;
                                }
                            }
                        }
                        vaVar.g3.O(true);
                        if (!canScrollVertically) {
                            vaVar.f3.g1(0, 0);
                            return;
                        } else if (i >= 0) {
                            vaVar.f3.g1(i, i2 - vaVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        s22 s22Var = this.b;
                        s22Var.O();
                        s22Var.b.H1(s22Var, 0);
                        return;
                    default:
                        s22 s22Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.a = query.getString(1);
                                obj.b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.id = i4;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = z8c.h(s22Var2.b.G3).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
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
                                tL_documentAttributeAudio.duration = obj.c;
                                tL_documentAttributeAudio.title = obj.b;
                                tL_documentAttributeAudio.performer = obj.a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.e = new k47(s22Var2.b.G3, tL_message, false, true);
                                g10 a = g10.a(file);
                                if (a != null && a.o != null) {
                                    int L = gm.L(44.0f);
                                    Bitmap bitmap = a.o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.e.J1 = bitmap;
                                    } else {
                                        float f = L;
                                        float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                        obj.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                }
                                arrayList.add(obj);
                                i4--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                        gm.c3(new lx1(s22Var2, arrayList, (byte) 10));
                        return;
                }
            }
        };
        this.e0 = -1;
        this.g0 = new Runnable(this) {
            public final s22 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        va vaVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = vaVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < vaVar.getChildCount()) {
                                View childAt = vaVar.getChildAt(i3);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i2 = top;
                                    i = R;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = R;
                                }
                            }
                        }
                        vaVar.g3.O(true);
                        if (!canScrollVertically) {
                            vaVar.f3.g1(0, 0);
                            return;
                        } else if (i >= 0) {
                            vaVar.f3.g1(i, i2 - vaVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        s22 s22Var = this.b;
                        s22Var.O();
                        s22Var.b.H1(s22Var, 0);
                        return;
                    default:
                        s22 s22Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.a = query.getString(1);
                                obj.b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.id = i4;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = z8c.h(s22Var2.b.G3).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
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
                                tL_documentAttributeAudio.duration = obj.c;
                                tL_documentAttributeAudio.title = obj.b;
                                tL_documentAttributeAudio.performer = obj.a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.e = new k47(s22Var2.b.G3, tL_message, false, true);
                                g10 a = g10.a(file);
                                if (a != null && a.o != null) {
                                    int L = gm.L(44.0f);
                                    Bitmap bitmap = a.o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.e.J1 = bitmap;
                                    } else {
                                        float f = L;
                                        float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                        obj.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                }
                                arrayList.add(obj);
                                i4--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                        gm.c3(new lx1(s22Var2, arrayList, (byte) 10));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        nm7.f(this.b.G3).b(this, nm7.f2);
        nm7.f(this.b.G3).b(this, nm7.h2);
        nm7.f(this.b.G3).b(this, nm7.g2);
        nm7.f(this.b.G3).b(this, nm7.W3);
        this.H = true;
        Utilities.e.c(new Runnable(this) {
            public final s22 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        va vaVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = vaVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < vaVar.getChildCount()) {
                                View childAt = vaVar.getChildAt(i3);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i2 = top;
                                    i = R;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = R;
                                }
                            }
                        }
                        vaVar.g3.O(true);
                        if (!canScrollVertically) {
                            vaVar.f3.g1(0, 0);
                            return;
                        } else if (i >= 0) {
                            vaVar.f3.g1(i, i2 - vaVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        s22 s22Var = this.b;
                        s22Var.O();
                        s22Var.b.H1(s22Var, 0);
                        return;
                    default:
                        s22 s22Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.a = query.getString(1);
                                obj.b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.id = i4;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = z8c.h(s22Var2.b.G3).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
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
                                tL_documentAttributeAudio.duration = obj.c;
                                tL_documentAttributeAudio.title = obj.b;
                                tL_documentAttributeAudio.performer = obj.a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.e = new k47(s22Var2.b.G3, tL_message, false, true);
                                g10 a = g10.a(file);
                                if (a != null && a.o != null) {
                                    int L = gm.L(44.0f);
                                    Bitmap bitmap = a.o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.e.J1 = bitmap;
                                    } else {
                                        float f = L;
                                        float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                        obj.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                }
                                arrayList.add(obj);
                                i4--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                        gm.c3(new lx1(s22Var2, arrayList, (byte) 10));
                        return;
                }
            }
        });
        h22 h22Var = new h22(cmb.c6, ylbVar, context);
        this.x = h22Var;
        h22Var.setVisibility(4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        e22 e22Var = new e22(this.b, ylbVar, context);
        this.s = e22Var;
        e22Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        e22Var.r.addTextChangedListener(new b7(this, (byte) 8));
        e22Var.r.setHint(jb6.M0(2131745474, null));
        frameLayout2.addView(h22Var, qoe.g());
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += gm.m;
        frameLayout2.addView(e22Var, d);
        ?? qk3Var = new qk3(context);
        this.y = qk3Var;
        qk3Var.setPadding(gm.L(11.0f), gm.L(21.0f), gm.L(11.0f), gm.L(21.0f));
        qk3Var.setOnAnimatedHeightChangedListener(new Runnable(this) {
            public final s22 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        va vaVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = vaVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < vaVar.getChildCount()) {
                                View childAt = vaVar.getChildAt(i3);
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= 0) {
                                    i2 = top;
                                    i = R;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = R;
                                }
                            }
                        }
                        vaVar.g3.O(true);
                        if (!canScrollVertically) {
                            vaVar.f3.g1(0, 0);
                            return;
                        } else if (i >= 0) {
                            vaVar.f3.g1(i, i2 - vaVar.getPaddingTop());
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        s22 s22Var = this.b;
                        s22Var.O();
                        s22Var.b.H1(s22Var, 0);
                        return;
                    default:
                        s22 s22Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                ?? obj = new Object();
                                query.getInt(0);
                                obj.a = query.getString(1);
                                obj.b = query.getString(2);
                                obj.d = query.getString(3);
                                obj.c = (int) (query.getLong(4) / 1000);
                                query.getString(5);
                                File file = new File(obj.d);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.id = i4;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = z8c.h(s22Var2.b.G3).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = obj.d;
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
                                tL_documentAttributeAudio.duration = obj.c;
                                tL_documentAttributeAudio.title = obj.b;
                                tL_documentAttributeAudio.performer = obj.a;
                                tL_documentAttributeAudio.flags |= 3;
                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = file.getName();
                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                obj.e = new k47(s22Var2.b.G3, tL_message, false, true);
                                g10 a = g10.a(file);
                                if (a != null && a.o != null) {
                                    int L = gm.L(44.0f);
                                    Bitmap bitmap = a.o;
                                    if (bitmap.getWidth() <= L && bitmap.getHeight() <= L) {
                                        obj.e.J1 = bitmap;
                                    } else {
                                        float f = L;
                                        float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                        obj.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                    }
                                }
                                arrayList.add(obj);
                                i4--;
                            }
                            query.close();
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                        gm.c3(new lx1(s22Var2, arrayList, (byte) 10));
                        return;
                }
            }
        });
        if (i22Var.Z1 != null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            qk3Var.addView(frameLayout3);
            qk3Var.j(frameLayout3, true, false);
            o22 o22Var = new o22(this, context, i22Var.Z1, frameLayout2, ylbVar, frameLayout3);
            frameLayout = frameLayout2;
            frameLayout3.addView(o22Var);
            qk3Var.setCallFragmentContextView(o22Var);
        } else {
            frameLayout = frameLayout2;
        }
        FrameLayout.LayoutParams d2 = qoe.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = hg9.v(27.0f, gm.m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        frameLayout.addView(qk3Var, d2);
        va vaVar = new va((s22) this, context, i22Var.G3, new f(this, (byte) 27), new m22(this), new m22(this), ylbVar);
        this.w = vaVar;
        vaVar.g3.r = false;
        vaVar.r1();
        setBlur3Capture(vaVar);
        this.d = vaVar;
        this.h = true;
        this.f = true;
        vaVar.setClipToPadding(false);
        vaVar.setHorizontalScrollBarEnabled(false);
        vaVar.setVerticalScrollBarEnabled(false);
        addView(vaVar, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        anb.l(vaVar, 21, cmb.z5, ylbVar);
        vaVar.setOnScrollListener(new y(this, (byte) 17));
        addView(frameLayout, qoe.e(-1, 200, 51));
        vaVar.g3.O(false);
        O();
        int i = this.b.G3;
        this.K = new jc7(i, z8c.h(i).e());
    }

    @Override
    public final void B(int i, int i2) {
        this.U = i2;
        O();
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        if (i == 0) {
            h22 h22Var = this.x;
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
    public final void H(a22 a22Var) {
        Q();
        this.K.b();
        va vaVar = this.w;
        vaVar.f3.g1(0, 0);
        vaVar.g3.O(false);
    }

    @Override
    public final void J() {
        this.w.z0(0);
    }

    @Override
    public final boolean K(final boolean z, final int i, final int i2, final long j, final boolean z2) {
        HashSet hashSet = this.J;
        if (hashSet.size() != 0 && this.O != null && !this.G) {
            this.G = true;
            final ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((zn6) it.next()).e);
            }
            i22 i22Var = this.b;
            return ik.Y(i22Var.G3, i22Var.V0(), i22Var.R0() + arrayList.size(), new qac() {
                @Override
                public final void a(Object obj) {
                    s22 s22Var = s22.this;
                    p22 p22Var = s22Var.O;
                    i22 i22Var2 = s22Var.b;
                    p22Var.f(arrayList, i22Var2.U0().getText(), z, i, i2, j, z2, ((Long) obj).longValue());
                    i22Var2.a(true);
                }
            }, 0L);
        }
        return false;
    }

    public final void O() {
        int i;
        i22 i22Var = this.b;
        if (i22Var.o3.Q() > gm.L(20.0f)) {
            i = gm.L(8.0f);
            i22Var.r0 = false;
        } else {
            if (!gm.O1()) {
                Point point = gm.q;
                if (point.x > point.y) {
                    i = (int) (this.U / 3.5f);
                    i22Var.r0 = true;
                }
            }
            i = (this.U / 5) << 1;
            i22Var.r0 = true;
        }
        int i2 = i + gm.m;
        this.w.setPadding(0, (int) (this.y.c(0.0f) + gm.L(56.0f) + i2), 0, this.e);
    }

    public final void P(c6c c6cVar, View view) {
        if (c6cVar != null) {
            int i = c6cVar.d;
            if (i == this.S) {
                this.K.b();
                return;
            } else if (i == this.Q) {
                Q();
                return;
            } else if (i == this.R) {
                R();
                return;
            }
        }
        if (!(view instanceof eda)) {
            return;
        }
        eda edaVar = (eda) view;
        zn6 zn6Var = (zn6) edaVar.getTag();
        i22 i22Var = this.b;
        i22Var.getClass();
        int i2 = 1;
        if (i22Var.B1) {
            this.G = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(zn6Var.e);
            this.O.f(arrayList, i22Var.U0().getText(), false, 0, 0, 0L, false, 0L);
        } else {
            HashSet hashSet = this.J;
            if (hashSet.contains(zn6Var)) {
                hashSet.remove(zn6Var);
                c6cVar.e = false;
                edaVar.e(false, true);
                i2 = 2;
            } else {
                if (this.F >= 0) {
                    int size = hashSet.size();
                    int i3 = this.F;
                    if (size >= i3) {
                        String a0 = jb6.a0(null, null, 2131747184, jb6.G(i3, "Files", new Object[0]));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
                        String M0 = jb6.M0(2131689472, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = a0;
                        b10.t(null, 2131747564, alertDialog$Builder, null);
                        return;
                    }
                }
                c6cVar.e = true;
                hashSet.add(zn6Var);
                edaVar.e(true, true);
            }
        }
        i22Var.F1(i2);
    }

    public final void Q() {
        gm.r(this.b0);
        String str = this.E;
        int i = 3;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.a0) {
                this.a0 = false;
                S();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.c0 = 0;
            this.d0 = false;
        }
        if (!arrayList.isEmpty() && !this.d0) {
            if (this.a0) {
                this.a0 = false;
                S();
                return;
            }
            return;
        }
        int i2 = this.b.G3;
        oc7 r1 = oc7.r1(i2);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
        int i3 = this.V;
        if (i3 >= 0) {
            connectionsManager.cancelRequest(i3, true);
            this.V = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.E;
        this.W = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.q = str2;
        if (!arrayList.isEmpty()) {
            i = 15;
        }
        tL_messages_searchGlobal.limit = i;
        if (arrayList.size() > 0) {
            k47 k47Var = ((zn6) b10.f(1, arrayList)).e;
            tL_messages_searchGlobal.offset_id = k47Var.e1();
            tL_messages_searchGlobal.offset_rate = this.c0;
            tL_messages_searchGlobal.offset_peer = r1.i1(k47.B1(k47Var.k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new kc((byte) 0), new l22(this, r1, i2, (byte) 1));
        S();
    }

    public final void R() {
        gm.r(this.g0);
        if (!TextUtils.isEmpty(this.E) && this.E.length() >= 3) {
            if (!TextUtils.equals(this.f0, this.E)) {
                this.N.clear();
                this.h0 = false;
            }
            int i = this.b.G3;
            oc7 r1 = oc7.r1(i);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
            int i2 = this.e0;
            if (i2 >= 0) {
                connectionsManager.cancelRequest(i2, true);
                this.e0 = -1;
            }
            String str = r1.l4.J.f;
            if (!TextUtils.isEmpty(str)) {
                TLRPC.User user = this.i0;
                if (user == null) {
                    TLObject b2 = r1.b2(str);
                    if (b2 instanceof TLRPC.User) {
                        user = (TLRPC.User) b2;
                    } else {
                        user = null;
                    }
                    this.i0 = user;
                }
                if (user == null) {
                    if (!this.j0 && !this.k0) {
                        this.j0 = true;
                        r1.Z1().a(str, null, new qy1(this, r1, (byte) 4));
                        return;
                    }
                    return;
                }
                TLRPC.User f = z8c.h(i).f();
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = r1.p1(this.i0);
                tL_messages_getInlineBotResults.peer = oc7.m1(f);
                String str2 = "";
                tL_messages_getInlineBotResults.offset = (this.N.isEmpty() || (r4 = this.l0) == null) ? "" : "";
                String str3 = this.E;
                if (str3 != null) {
                    str2 = str3;
                }
                this.f0 = str2;
                tL_messages_getInlineBotResults.query = str2;
                this.e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new kc((byte) 0), new l22(this, r1, i, (byte) 0));
                S();
            }
        } else if (this.n0) {
            this.n0 = false;
            S();
        }
    }

    public final void S() {
        j22 j22Var = this.T;
        gm.r(j22Var);
        gm.c3(j22Var);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.g2;
        int i4 = nm7.h2;
        va vaVar = this.w;
        int i5 = nm7.f2;
        if (i != i5 && i != i4 && i != i3) {
            if (i == nm7.W3 && objArr[0] == this.K && vaVar != null) {
                vaVar.g3.O(true);
            }
        } else if (i != i5 && i != i3) {
            if (i == i4 && ((k47) objArr[0]).T == 0) {
                int childCount = vaVar.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = vaVar.getChildAt(i6);
                    if (childAt instanceof eda) {
                        eda edaVar = (eda) childAt;
                        if (edaVar.getMessage() != null) {
                            edaVar.g(false, true);
                        }
                    }
                }
            }
        } else {
            int childCount2 = vaVar.getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = vaVar.getChildAt(i7);
                if (childAt2 instanceof eda) {
                    eda edaVar2 = (eda) childAt2;
                    if (edaVar2.getMessage() != null) {
                        edaVar2.g(false, true);
                    }
                }
            }
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i;
        va vaVar = this.w;
        if (vaVar.getChildCount() > 0) {
            boolean z = false;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < vaVar.getChildCount(); i3++) {
                View childAt = vaVar.getChildAt(i3);
                int R = RecyclerView.R(childAt);
                if (R == 0) {
                    z = true;
                }
                if (R >= 0 && childAt.getTop() < i2) {
                    i2 = childAt.getTop();
                }
            }
            if (i2 != Integer.MAX_VALUE) {
                int L = (((i2 - gm.L(56.0f)) - ((int) this.y.c(0.0f))) - gm.m) - gm.L(8.0f);
                if (L > 0 && z) {
                    i = L;
                } else {
                    i = 0;
                }
                fn0 fn0Var = this.n;
                if (L >= 0 && z) {
                    fn0Var.a(false, true);
                } else {
                    fn0Var.a(true, true);
                    L = i;
                }
                this.r.setTranslationY(L);
                return gm.L(12.0f) + L;
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.w.getPaddingTop() - gm.L(56.0f)) - ((int) this.y.c(0.0f));
    }

    public ArrayList<k47> getSelected() {
        ArrayList<k47> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((zn6) it.next()).e);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override
    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        int i = cmb.z5;
        va vaVar = this.w;
        arrayList.add(new cnb(vaVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(vaVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.h6));
        arrayList.add(new cnb(vaVar, 0, new Class[]{View.class}, cmb.j0, (Drawable[]) null, (bnb) null, cmb.c7));
        arrayList.add(new cnb(vaVar, 8192, new Class[]{eda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.h7));
        arrayList.add(new cnb(vaVar, 16384, new Class[]{eda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.j7));
        arrayList.add(new cnb(vaVar, 4, new Class[]{eda.class}, cmb.e3, (Drawable[]) null, (bnb) null, cmb.F6));
        arrayList.add(new cnb(vaVar, 4, new Class[]{eda.class}, cmb.f3, (Drawable[]) null, (bnb) null, cmb.y6));
        return arrayList;
    }

    @Override
    public final void p() {
        u();
        i22 i22Var = this.b;
        nm7.f(i22Var.G3).n(this, nm7.f2);
        int i = i22Var.G3;
        nm7.f(i).n(this, nm7.h2);
        nm7.f(i).n(this, nm7.g2);
        nm7.f(i).n(this, nm7.W3);
    }

    @Override
    public final boolean q() {
        if (this.P != null && MediaController.w().D(this.P)) {
            MediaController.w().l(true, true, false, false);
        }
        return false;
    }

    public void setDelegate(p22 p22Var) {
        this.O = p22Var;
    }

    public void setMaxSelectedFiles(int i) {
        this.F = i;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(km0 km0Var) {
        ylb ylbVar = this.a;
        e22 e22Var = this.s;
        if (e22Var != null) {
            e22Var.setupBlurredBackground(km0Var.c(e22Var, qqd.n(ylbVar), false));
        }
        qk3 qk3Var = this.y;
        if (qk3Var != null) {
            im0 c = km0Var.c(qk3Var, qqd.n(ylbVar), false);
            c.r(gm.L(24.0f));
            c.q(gm.L(7.0f));
            qk3Var.setBlurredBackground(c);
        }
    }

    @Override
    public final void t() {
        this.J.clear();
    }

    @Override
    public final void u() {
        if (this.P != null && MediaController.w().D(this.P)) {
            MediaController.w().l(true, true, false, false);
        }
        this.P = null;
    }

    @Override
    public final void m(float f) {
    }

    @Override
    public final void V(float f, int i) {
    }
}
