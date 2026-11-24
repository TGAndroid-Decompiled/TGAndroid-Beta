package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ep7 extends d implements f42, jm7 {
    public int E;
    public int F;
    public int G;
    public cp7 H;
    public boolean I;
    public final SparseArray J;
    public z82 K;
    public long L;
    public int M;
    public cp7 N;
    public i22 O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public r59 d;
    public ny0 e;
    public final ylb f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public ep7(Bundle bundle, ylb ylbVar) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.f = ylbVar;
    }

    public static void f0(View view, int i, int i2) {
        if (view instanceof y23) {
            y23 y23Var = (y23) view;
            for (int i3 = 0; i3 < y23Var.getChildCount(); i3++) {
                View childAt = y23Var.getChildAt(i3);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof sn2) {
                        sn2 sn2Var = (sn2) imageView.getDrawable();
                        Drawable drawable = sn2Var.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = sn2Var.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String g0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (TextUtils.isEmpty(str) && document != null) {
            return jb6.a0("SoundNameEmpty", null, 2131745012, jb6.u(document.date, true));
        }
        return str;
    }

    public final void c0(cp7 cp7Var) {
        int i = cp7Var.c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i) != null) {
            sparseArray.remove(cp7Var.c);
        } else if (cp7Var.a) {
            sparseArray.put(cp7Var.c, cp7Var);
        } else {
            return;
        }
        h0();
        ny0 ny0Var = this.e;
        ny0Var.l(0, ((ep7) ny0Var.d).h);
    }

    @Override
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bp7(this, context));
        if (this.L == 0) {
            int i = this.M;
            if (i == 1) {
                this.simpleActionBar.setTitle(jb6.M0(2131747601, null));
            } else if (i == 0) {
                this.simpleActionBar.setTitle(jb6.M0(2131747602, null));
            } else if (i == 2) {
                this.simpleActionBar.setTitle(jb6.M0(2131747603, null));
            } else if (i == 3) {
                this.simpleActionBar.setTitle(jb6.M0(2131747599, null));
            } else if (i == 5 || i == 4) {
                this.simpleActionBar.setTitle(jb6.M0(2131747600, null));
            }
        } else {
            this.K = new z82(context, null, false, this.f);
            if (this.L < 0) {
                if (this.Q != 0) {
                    TLRPC.TL_forumTopic f = getMessagesController().g4.f(-this.L, this.Q);
                    no4.q(this.K.getAvatarImageView(), f, false, true, this.f);
                    this.simpleActionBar.setTitle(f.title);
                } else {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.L));
                    this.K.setChatAvatar(L0);
                    this.simpleActionBar.setTitle(L0.title);
                }
            } else {
                TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.L));
                if (W1 != null) {
                    this.K.setUserAvatar(W1);
                    this.simpleActionBar.setTitle(bw2.m(0, W1.first_name, W1.last_name));
                }
            }
            this.simpleActionBar.setSubtitle(jb6.M0(2131747604, null));
            gm.B2(this.K.e);
            this.simpleActionBar.addView(this.K.e, qoe.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        yja q = this.simpleActionBar.q();
        q.c(2, 2131232171, gm.L(54.0f), jb6.M0(2131745193, null));
        q.c(1, 2131232114, gm.L(54.0f), jb6.M0(2131751535, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.d = r59Var;
        r59Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, qoe.c(-1.0f, -1));
        ny0 ny0Var = new ny0(this, (byte) 5);
        this.e = ny0Var;
        ny0Var.C(true);
        this.d.setAdapter(this.e);
        ((sc3) this.d.getItemAnimator()).m = false;
        ((sc3) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new u46());
        this.d.setOnItemClickListener(new k0(this, context, (byte) 17));
        this.d.setOnItemLongClickListener(new cj6(this, (byte) 19));
        getMediaDataController().A0.g(false);
        this.a.clear();
        this.b.clear();
        for (int i2 = 0; i2 < getMediaDataController().A0.e.size(); i2++) {
            jl9 jl9Var = (jl9) getMediaDataController().A0.e.get(i2);
            ?? obj = new Object();
            int i3 = this.G;
            this.G = i3 + 1;
            obj.c = i3;
            obj.a = true;
            obj.d = jl9Var.c;
            TLRPC.Document document3 = jl9Var.a;
            String str = document3.file_name_fixed;
            obj.f = str;
            obj.e = document3;
            obj.f = g0(document3, str);
            obj.g = jl9Var.b;
            cp7 cp7Var = this.N;
            if (cp7Var != null && (document = cp7Var.e) != null && (document2 = jl9Var.a) != null && document.id == document2.id) {
                this.N = null;
                this.H = obj;
            }
            this.a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(a.b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i4 = this.G;
        this.G = i4 + 1;
        obj2.c = i4;
        obj2.f = jb6.M0(2131747885, null);
        this.b.add(obj2);
        ?? obj3 = new Object();
        int i5 = this.G;
        this.G = i5 + 1;
        obj3.c = i5;
        obj3.f = jb6.M0(2131751536, null);
        obj3.b = true;
        this.b.add(obj3);
        cp7 cp7Var2 = this.N;
        if (cp7Var2 != null && cp7Var2.e == null && cp7Var2.g.equals("NoSound")) {
            this.N = null;
            this.H = obj2;
        }
        cp7 cp7Var3 = this.N;
        if (cp7Var3 != null && cp7Var3.e == null && cp7Var3.g.equals("Default")) {
            this.N = null;
            this.H = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i6 = this.G;
            this.G = i6 + 1;
            obj4.c = i6;
            obj4.f = string;
            obj4.g = str2;
            cp7 cp7Var4 = this.N;
            if (cp7Var4 != null && cp7Var4.e == null && cp7Var4.g.equals(str2)) {
                this.N = null;
                this.H = obj4;
            }
            this.b.add(obj4);
        }
        if (getMediaDataController().A0.f && this.H == null) {
            this.H = obj3;
            this.I = true;
        }
        i0();
        i0();
        return this.fragmentView;
    }

    public final void d0() {
        this.J.clear();
        ny0 ny0Var = this.e;
        ny0Var.l(0, ((ep7) ny0Var.d).h);
        h0();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        String name;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i == nm7.i5) {
            HashMap hashMap = new HashMap();
            int i3 = 0;
            while (true) {
                arrayList = this.a;
                if (i3 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((cp7) arrayList.get(i3)).d), (cp7) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            for (int i4 = 0; i4 < getMediaDataController().A0.e.size(); i4++) {
                jl9 jl9Var = (jl9) getMediaDataController().A0.e.get(i4);
                ?? obj = new Object();
                cp7 cp7Var = (cp7) hashMap.get(Integer.valueOf(jl9Var.c));
                if (cp7Var != null) {
                    if (cp7Var == this.H) {
                        this.H = obj;
                    }
                    obj.c = cp7Var.c;
                } else {
                    int i5 = this.G;
                    this.G = i5 + 1;
                    obj.c = i5;
                }
                obj.a = true;
                obj.d = jl9Var.c;
                TLRPC.Document document3 = jl9Var.a;
                if (document3 != null) {
                    name = document3.file_name_fixed;
                    obj.f = name;
                } else {
                    name = new File(jl9Var.b).getName();
                    obj.f = name;
                }
                TLRPC.Document document4 = jl9Var.a;
                obj.e = document4;
                obj.f = g0(document4, name);
                obj.g = jl9Var.b;
                cp7 cp7Var2 = this.N;
                if (cp7Var2 != null && (document = cp7Var2.e) != null && (document2 = jl9Var.a) != null && document.id == document2.id) {
                    this.N = null;
                    this.H = obj;
                }
                arrayList.add(obj);
            }
            i0();
            this.e.f();
            if (getMediaDataController().A0.f && this.H == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (cp7) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(android.content.Context r11, android.view.View r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep7.e0(android.content.Context, android.view.View, int):void");
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ylb getResourceProvider() {
        return this.f;
    }

    public final void h0() {
        SparseArray sparseArray = this.J;
        int size = sparseArray.size();
        rja rjaVar = this.simpleActionBar;
        if (size > 0) {
            rjaVar.F(sparseArray.size(), this.simpleActionBar.x());
            this.simpleActionBar.J();
            return;
        }
        rjaVar.w();
    }

    public final void i0() {
        this.n = -1;
        this.r = -1;
        this.s = -1;
        this.w = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.h = 1;
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            int i = this.h;
            this.n = i;
            int size = arrayList.size() + i;
            this.h = size;
            this.r = size;
        }
        int i2 = this.h;
        this.s = i2;
        this.h = i2 + 2;
        this.w = i2 + 1;
        ArrayList arrayList2 = this.b;
        if (!arrayList2.isEmpty()) {
            int i3 = this.h;
            int i4 = i3 + 1;
            this.h = i4;
            this.y = i3;
            this.E = i4;
            int size2 = arrayList2.size() + i4;
            this.h = size2;
            this.F = size2;
        }
        int i5 = this.h;
        this.h = i5 + 1;
        this.x = i5;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            getMediaDataController().n2((String) arrayList.get(i2));
        }
        getNotificationCenter().k(nm7.i5, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i == 21 && intent != null && this.O != null) {
            Uri data = intent.getData();
            int i3 = nm7.i5;
            boolean z = true;
            boolean z2 = false;
            if (data != null) {
                String S0 = gm.S0(intent.getData());
                if (S0 != null) {
                    if (S0.startsWith("content://")) {
                        S0 = MediaController.o(-1L, intent.getData(), "mp3");
                    }
                    if (this.O.j2.P(new File(S0))) {
                        getMediaDataController().n2(S0);
                        getNotificationCenter().k(i3, new Object[0]);
                        z2 = z;
                    }
                }
                z = false;
                z2 = z;
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                boolean z3 = false;
                for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
                    Uri uri = clipData.getItemAt(i4).getUri();
                    String uri2 = uri.toString();
                    if (uri2.startsWith("content://")) {
                        uri2 = MediaController.o(-1L, uri, "mp3");
                    }
                    if (this.O.j2.P(new File(uri2))) {
                        getMediaDataController().n2(uri2);
                        getNotificationCenter().k(i3, new Object[0]);
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                this.O.dismiss();
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.L = getArguments().getLong("dialog_id", 0L);
            this.Q = getArguments().getLong("topic_id", 0L);
            this.M = getArguments().getInt("type", -1);
        }
        long j = this.L;
        if (j != 0) {
            String p = lo7.p(j, this.Q, false);
            str2 = b10.h("sound_document_id_", p);
            str = b10.h("sound_path_", p);
        } else {
            int i = this.M;
            if (i == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else if (i != 4 && i != 5) {
                zo4.k("Unsupported type");
                return false;
            } else {
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j2 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        ?? obj = new Object();
        this.N = obj;
        if (j2 != 0) {
            obj.e = new TLRPC.TL_document();
            this.N.e.id = j2;
        } else {
            obj.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.H != null && this.I) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (this.L != 0) {
                str = "sound_" + lo7.p(this.L, this.Q, false);
                str2 = "sound_path_" + lo7.p(this.L, this.Q, false);
                str3 = "sound_document_id_" + lo7.p(this.L, this.Q, false);
                edit.putBoolean("sound_enabled_" + lo7.p(this.L, this.Q, false), true);
            } else {
                int i = this.M;
                if (i == 1) {
                    str = "GlobalSound";
                    str2 = "GlobalSoundPath";
                    str3 = "GlobalSoundDocId";
                } else if (i == 0) {
                    str = "GroupSound";
                    str2 = "GroupSoundPath";
                    str3 = "GroupSoundDocId";
                } else if (i == 2) {
                    str = "ChannelSound";
                    str2 = "ChannelSoundPath";
                    str3 = "ChannelSoundDocId";
                } else if (i == 3) {
                    str = "StoriesSound";
                    str2 = "StoriesSoundPath";
                    str3 = "StoriesSoundDocId";
                } else if (i != 5 && i != 4) {
                    zo4.k("Unsupported type");
                    return;
                } else {
                    str = "ReactionSound";
                    str2 = "ReactionSoundPath";
                    str3 = "ReactionSoundDocId";
                }
            }
            cp7 cp7Var = this.H;
            if (cp7Var.a && (document = cp7Var.e) != null) {
                edit.putLong(str3, document.id);
                edit.putString(str, this.H.f);
                edit.putString(str2, "NoSound");
            } else if (cp7Var.g != null) {
                edit.putString(str, cp7Var.f);
                edit.putString(str2, this.H.g);
                edit.remove(str3);
            } else if (cp7Var.b) {
                edit.putString(str, "Default");
                edit.putString(str2, "Default");
                edit.remove(str3);
            } else {
                edit.putString(str, "NoSound");
                edit.putString(str2, "NoSound");
                edit.remove(str3);
            }
            edit.apply();
            if (this.L != 0) {
                getNotificationsController().c0(this.L, this.Q, true);
                return;
            }
            getNotificationsController().b0(this.M);
            getNotificationCenter().k(nm7.f0, new Object[0]);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, nm7.i5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        getNotificationCenter().b(this, nm7.i5);
    }

    @Override
    public final void onThemeColorsChanged() {
        ylb ylbVar = this.f;
        try {
            int v0 = cmb.v0(cmb.M6, ylbVar);
            int v02 = cmb.v0(cmb.j7, ylbVar);
            if (this.d != null) {
                if (v0 != this.R || v02 != this.S) {
                    this.R = v0;
                    this.S = v02;
                    for (int i = 0; i < this.d.getChildCount(); i++) {
                        f0(this.d.getChildAt(i), v0, v02);
                    }
                    for (int i2 = 0; i2 < this.d.getCachedChildCount(); i2++) {
                        f0(this.d.P(i2), v0, v02);
                    }
                    for (int i3 = 0; i3 < this.d.getHiddenChildCount(); i3++) {
                        f0(this.d.W(i3), v0, v02);
                    }
                    for (int i4 = 0; i4 < this.d.getAttachedScrapChildCount(); i4++) {
                        f0(this.d.O(i4), v0, v02);
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void S() {
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
