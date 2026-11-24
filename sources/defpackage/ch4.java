package defpackage;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class ch4 extends FrameLayout implements vlb, jm7, g94 {
    public static final SpannableStringBuilder[] t0 = new SpannableStringBuilder[3];
    public sh4 E;
    public long F;
    public long G;
    public long H;
    public long I;
    public String J;
    public boolean K;
    public final Activity L;
    public final d M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public String R;
    public int S;
    public final ug4 T;
    public final vg4 U;
    public final ah4 V;
    public final xg4 W;
    public final fn0 a;
    public final zg4 a0;
    public final fv b;
    public final xg4 b0;
    public final a1b c;
    public final xg4 c0;
    public q59 d;
    public final ArrayList d0;
    public lg4 e;
    public final ArrayList e0;
    public final ArrayList f;
    public boolean f0;
    public final o04 g0;
    public final SparseArray h;
    public final og4 h0;
    public sg4 i0;
    public rv9 j0;
    public final u46 k0;
    public final pg4 l0;
    public final po m0;
    public final ArrayList n;
    public final tg4 n0;
    public final a14 o0;
    public bh4 p0;
    public boolean q0;
    public final HashMap r;
    public int r0;
    public byte s;
    public boolean s0;
    public int w;
    public String x;
    public String y;

    public ch4(d dVar) {
        super(dVar.getParentActivity());
        this.a = new fn0(0, this, d53.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = (byte) 3;
        this.T = new ug4(0, 0L);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.g0 = new o04(this, (byte) 3);
        this.h0 = new og4(this);
        this.m0 = new po(null);
        this.o0 = new a14(this, (byte) 18);
        this.M = dVar;
        Activity parentActivity = dVar.getParentActivity();
        this.L = parentActivity;
        anb.h(cmb.c6, null, this);
        fv fvVar = new fv((byte) 19, parentActivity, this);
        this.b = fvVar;
        fvVar.setOnItemClickListener(new kg4(this, (byte) 0));
        fvVar.setOnItemLongClickListener(new k44(this, (byte) 1));
        u46 u46Var = new u46();
        this.k0 = u46Var;
        fvVar.setLayoutManager(u46Var);
        pg4 pg4Var = new pg4((byte) 0, parentActivity, this);
        this.l0 = pg4Var;
        addView(pg4Var);
        addView(fvVar);
        fvVar.setSectionsType(2);
        fvVar.setSkipDrawSection(true);
        fvVar.setOnScrollListener(new qg4(this));
        tg4 tg4Var = new tg4(parentActivity);
        this.n0 = tg4Var;
        String u = jb6.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(tg4Var.c, u)) {
            tg4Var.c = u;
            tg4Var.a.t(u, true, true);
        }
        addView(tg4Var, qoe.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new vg4(this);
        this.V = new ah4(this, getContext());
        this.W = new xg4(this, getContext(), 1);
        this.a0 = new zg4(this, getContext());
        this.b0 = new xg4(this, getContext(), 4);
        this.c0 = new xg4(this, getContext(), 2);
        a1b a1bVar = new a1b(parentActivity, pg4Var, 1, null);
        this.c = a1bVar;
        addView(a1bVar);
        fvVar.setEmptyView(a1bVar);
        a1bVar.setVisibility(8);
        a();
    }

    public static CharSequence b(k47 k47Var, boolean z) {
        return c(k47Var, z, 0, null);
    }

    public static CharSequence c(k47 k47Var, boolean z, int i, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        Paint.FontMetricsInt fontMetricsInt;
        TLRPC.TL_forumTopic f;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        Paint.FontMetricsInt fontMetricsInt4;
        TLRPC.TL_forumTopic f2;
        int i2;
        int i3;
        if (k47Var != null && (message = k47Var.k) != null) {
            if (k47.a4(message)) {
                oz8 c = pz8.f(k47Var.K1).c(k47.I1(k47Var.k));
                if (c != null) {
                    return c.b;
                }
                return "";
            }
            CharSequence charSequence = null;
            if (k47Var.q4()) {
                if (k47Var.b1) {
                    return jb6.M0(2131744947, null);
                }
                if (k47Var.U0) {
                    return jb6.M0(2131744948, null);
                }
                return jb6.M0(2131744949, null);
            }
            SpannableStringBuilder[] spannableStringBuilderArr = t0;
            if (spannableStringBuilderArr[i] == null) {
                spannableStringBuilderArr[i] = new SpannableStringBuilder(">");
                if (i == 0) {
                    i2 = 2131230876;
                } else if (i == 1) {
                    i2 = 2131232235;
                } else if (i == 2) {
                    i2 = 2131232234;
                } else {
                    return "";
                }
                Drawable mutate = a.b.getDrawable(i2).mutate();
                if (i == 0) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                pn2 pn2Var = new pn2(i3, mutate);
                if (i == 1 || i == 2) {
                    pn2Var.I = 0.85f;
                }
                SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i];
                spannableStringBuilder.setSpan(pn2Var, 0, spannableStringBuilder.length(), 0);
            }
            TLRPC.Message message2 = k47Var.k;
            if (message2.saved_peer_id != null) {
                if (k47Var.P1() >= 0) {
                    user2 = oc7.r1(z8c.t0).W1(Long.valueOf(k47Var.P1()));
                    chat = null;
                } else if (k47Var.P1() < 0) {
                    chat = oc7.r1(z8c.t0).L0(Long.valueOf(-k47Var.P1()));
                    user2 = null;
                    chat2 = null;
                } else {
                    user2 = null;
                    chat = null;
                }
                chat2 = chat;
            } else {
                if (message2.from_id.user_id != 0) {
                    user = oc7.r1(z8c.t0).W1(Long.valueOf(k47Var.k.from_id.user_id));
                } else {
                    user = null;
                }
                if (k47Var.k.from_id.chat_id != 0) {
                    chat = oc7.r1(z8c.t0).L0(Long.valueOf(k47Var.k.peer_id.chat_id));
                } else {
                    chat = null;
                }
                if (chat == null) {
                    if (k47Var.k.from_id.channel_id != 0) {
                        chat = oc7.r1(z8c.t0).L0(Long.valueOf(k47Var.k.peer_id.channel_id));
                    } else {
                        chat = null;
                    }
                }
                if (k47Var.k.peer_id.channel_id != 0) {
                    chat2 = oc7.r1(z8c.t0).L0(Long.valueOf(k47Var.k.peer_id.channel_id));
                } else {
                    chat2 = null;
                }
                if (chat2 == null) {
                    if (k47Var.k.peer_id.chat_id != 0) {
                        chat2 = oc7.r1(z8c.t0).L0(Long.valueOf(k47Var.k.peer_id.chat_id));
                    } else {
                        chat2 = null;
                    }
                }
                if (!sd2.V(chat2) && !z) {
                    chat2 = null;
                }
                user2 = user;
            }
            if (user2 != null) {
                if (chat2 != null) {
                    CharSequence charSequence2 = chat2.title;
                    if (sd2.c0(chat2) && (f2 = oc7.r1(z8c.t0).g4.f(chat2.id, k47.b2(k47Var.K1, k47Var.k, true, false))) != null) {
                        charSequence2 = no4.k(f2, null, null);
                    }
                    if (textPaint == null) {
                        fontMetricsInt3 = null;
                    } else {
                        fontMetricsInt3 = textPaint.getFontMetricsInt();
                    }
                    CharSequence m = gw3.m(charSequence2, fontMetricsInt3, false, null, 0);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    String k = m9c.k(user2, true);
                    if (textPaint == null) {
                        fontMetricsInt4 = null;
                    } else {
                        fontMetricsInt4 = textPaint.getFontMetricsInt();
                    }
                    spannableStringBuilder2.append(gw3.m(k, fontMetricsInt4, false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i]).append((char) 8202).append(m);
                    charSequence = spannableStringBuilder2;
                } else {
                    String r = m9c.r(user2);
                    if (textPaint == null) {
                        fontMetricsInt2 = null;
                    } else {
                        fontMetricsInt2 = textPaint.getFontMetricsInt();
                    }
                    charSequence = gw3.m(r, fontMetricsInt2, false, null, 0);
                }
            } else if (chat != null) {
                CharSequence charSequence3 = chat.title;
                if (sd2.c0(chat) && (f = oc7.r1(z8c.t0).g4.f(chat.id, k47.b2(k47Var.K1, k47Var.k, true, false))) != null) {
                    charSequence3 = no4.k(f, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt = null;
                } else {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                charSequence = gw3.m(charSequence3, fontMetricsInt, false, null, 0);
            }
            if (charSequence != null) {
                return charSequence;
            }
            return "";
        }
        return "";
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            a();
        }
    }

    public final void a() {
        int i;
        float f = this.a.e;
        tg4 tg4Var = this.n0;
        tg4Var.setTranslationY((1.0f - f) * (-gm.L(24.0f)));
        tg4Var.setAlpha(f);
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        tg4Var.setVisibility(i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.j7));
        hashSet.add(Integer.valueOf(cmb.S8));
        hashSet.add(Integer.valueOf(cmb.b9));
        hashSet.add(Integer.valueOf(cmb.c9));
        hashSet.add(Integer.valueOf(cmb.B9));
        hashSet.add(Integer.valueOf(cmb.A9));
        hashSet.add(Integer.valueOf(cmb.y9));
        hashSet.add(Integer.valueOf(cmb.z9));
        hashSet.add(Integer.valueOf(cmb.x9));
        hashSet.add(Integer.valueOf(cmb.w9));
        hashSet.add(Integer.valueOf(cmb.v9));
        hashSet.add(Integer.valueOf(cmb.u9));
        hashSet.add(Integer.valueOf(cmb.t9));
        hashSet.add(Integer.valueOf(cmb.s9));
        hashSet.add(Integer.valueOf(cmb.r9));
        hashSet.add(Integer.valueOf(cmb.p9));
        hashSet.add(Integer.valueOf(cmb.o9));
        hashSet.add(Integer.valueOf(cmb.i9));
        hashSet.add(Integer.valueOf(cmb.l9));
        hashSet.add(Integer.valueOf(cmb.f9));
        hashSet.add(Integer.valueOf(cmb.h9));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.a9));
        hashSet.add(Integer.valueOf(cmb.Z8));
        hashSet.add(Integer.valueOf(cmb.V8));
        hashSet.add(Integer.valueOf(cmb.U8));
        hashSet.add(Integer.valueOf(cmb.T8));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.zi));
        hashSet.add(Integer.valueOf(cmb.Ai));
        hashSet.add(Integer.valueOf(cmb.J6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.rj));
        hashSet.add(Integer.valueOf(cmb.yi));
        hashSet.add(Integer.valueOf(cmb.z6));
    }

    public final void d(java.util.ArrayList r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch4.d(java.util.ArrayList, long):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            fv fvVar = this.b;
            int childCount = fvVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (fvVar.getChildAt(i3) instanceof hg3) {
                    ((hg3) fvVar.getChildAt(i3)).j0(0, true);
                }
                fvVar.getChildAt(i3).invalidate();
            }
        }
    }

    public final void e(int i, View view, k47 k47Var, int i2) {
        TLRPC.WebPage webPage;
        String str;
        if (k47Var != null) {
            if (this.p0.u()) {
                this.p0.i(k47Var, view, i2);
            } else if (view instanceof hg3) {
                this.p0.r(k47Var);
            } else {
                byte b = this.E.d;
                og4 og4Var = this.h0;
                ArrayList arrayList = this.f;
                String str2 = null;
                d dVar = this.M;
                if (b == 0) {
                    PhotoViewer.r0().T1(null, dVar, null);
                    PhotoViewer.r0().n1(arrayList, i, 0L, 0L, 0L, og4Var);
                    this.S = PhotoViewer.r0().c;
                } else if (b != 3 && b != 5) {
                    if (b == 1) {
                        if (view instanceof ida) {
                            ida idaVar = (ida) view;
                            TLRPC.Document F0 = k47Var.F0();
                            if (idaVar.H) {
                                if (k47Var.x()) {
                                    PhotoViewer.r0().T1(null, dVar, null);
                                    int indexOf = arrayList.indexOf(k47Var);
                                    if (indexOf < 0) {
                                        ArrayList u = td4.u(k47Var);
                                        PhotoViewer.r0().T1(null, dVar, null);
                                        PhotoViewer.r0().n1(u, 0, 0L, 0L, 0L, og4Var);
                                        this.S = PhotoViewer.r0().c;
                                        return;
                                    }
                                    PhotoViewer.r0().T1(null, dVar, null);
                                    PhotoViewer.r0().n1(arrayList, indexOf, 0L, 0L, 0L, og4Var);
                                    this.S = PhotoViewer.r0().c;
                                    return;
                                }
                                gm.q2(k47Var, this.L, dVar);
                            } else if (!idaVar.G) {
                                k47 message = idaVar.getMessage();
                                message.P = true;
                                bc4.G(j5.a(z8c.t0).a).X(F0, message, 0, 0);
                                idaVar.f(true);
                            } else {
                                bc4.G(j5.a(z8c.t0).a).f(F0);
                                idaVar.f(true);
                            }
                        }
                    } else if (b == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = k47Var.k.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k47Var) == null) {
                                        dVar.createArticleViewer(false).L(k47Var, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    zv3.I0(this.M, k47Var, this.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((lda) view).F;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                    }
                } else if (view instanceof eda) {
                    ((eda) view).a();
                }
            }
        }
    }

    public final void f(k47 k47Var, View view, int i) {
        if (!this.p0.u()) {
            this.p0.f();
        }
        if (this.p0.u()) {
            this.p0.i(k47Var, view, i);
        }
    }

    public final void g(String str) {
        if (gm.D3(str)) {
            ik.n0(this.M, str, true, true);
        } else {
            l11.u(this.L, str);
        }
    }

    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        arrayList.add(new cnb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g5));
        arrayList.add(new cnb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        int i = cmb.h7;
        fv fvVar = this.b;
        arrayList.add(new cnb(fvVar, 8192, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.j7;
        arrayList.add(new cnb(fvVar, 16384, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(fvVar, 8, new Class[]{ida.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (bnb) null, cmb.pj));
        arrayList.add(new cnb(fvVar, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(fvVar, 8192, new Class[]{eda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(fvVar, 16384, new Class[]{eda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(fvVar, 8192, new Class[]{lda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(fvVar, 16384, new Class[]{lda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        a1b a1bVar = this.c;
        arrayList.add(new cnb(a1bVar.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
        arrayList.add(new cnb(a1bVar.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.x6));
        return arrayList;
    }

    public final void h(final long j, final long j2, final long j3, final long j4, final sh4 sh4Var, final boolean z, String str, boolean z2) {
        final String str2;
        byte b;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Locale locale = Locale.ENGLISH;
        if (sh4Var == null) {
            b = -1;
        } else {
            b = sh4Var.d;
        }
        final String str3 = j + j2 + j3 + j4 + ((int) b) + str2 + z;
        String str4 = this.y;
        if (str4 != null && str4.equals(str3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.E = sh4Var;
        this.F = j;
        this.G = j2;
        this.I = j3;
        this.H = j4;
        this.J = str2;
        this.K = z;
        lg4 lg4Var = this.e;
        if (lg4Var != null) {
            gm.r(lg4Var);
        }
        o04 o04Var = this.g0;
        gm.r(o04Var);
        if (!z3 || !z2) {
            ArrayList arrayList2 = this.e0;
            final boolean z5 = z3;
            ArrayList arrayList3 = this.d0;
            a1b a1bVar = this.c;
            ArrayList arrayList4 = this.f;
            long j5 = 0;
            if (!z4 && (sh4Var != null || j2 != 0 || j != 0 || j3 != 0 || j4 != 0)) {
                if (!z2 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.n.clear();
                this.r.clear();
                this.N = true;
                a1bVar.setVisibility(0);
                q59 q59Var = this.d;
                if (q59Var != null) {
                    q59Var.f();
                }
                this.Q++;
                fv fvVar = this.b;
                if (fvVar.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    fvVar.getPinnedHeader().setAlpha(0.0f);
                } else {
                    arrayList = arrayList4;
                }
                arrayList3.clear();
                arrayList2.clear();
                if (!z4) {
                    return;
                }
            }
            this.N = true;
            q59 q59Var2 = this.d;
            if (q59Var2 != null) {
                q59Var2.f();
            }
            if (!z5) {
                o04Var.run();
                a1bVar.e(true, !z2);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                sg4 sg4Var = this.i0;
                if (sg4Var != null) {
                    ((nh3) sg4Var).h(false, null, null, false);
                }
            }
            final int i = this.Q + 1;
            this.Q = i;
            final int i2 = z8c.t0;
            ?? r0 = new Runnable() {
                @Override
                public final void run() {
                    long j6;
                    int i3;
                    int i4;
                    long j7;
                    int i5;
                    int i6;
                    TLRPC.MessagesFilter messagesFilter;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final ch4 ch4Var = ch4.this;
                    ArrayList arrayList5 = ch4Var.f;
                    final long j8 = j;
                    int i7 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
                    long j9 = j2;
                    String str5 = str2;
                    final sh4 sh4Var2 = sh4Var;
                    int i8 = i2;
                    long j10 = j3;
                    long j11 = j4;
                    final boolean z6 = z5;
                    ArrayList arrayList6 = null;
                    if (i7 != 0 && j9 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.q = str5;
                        tL_messages_search.limit = 20;
                        if (sh4Var2 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = sh4Var2.e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = oc7.r1(j5.a(i8).a).i1(j8);
                        if (j10 > 0) {
                            tL_messages_search.min_date = (int) (j10 / 1000);
                        }
                        if (j11 > 0) {
                            tL_messages_search.max_date = (int) (j11 / 1000);
                        }
                        if (z6) {
                            str5 = str5;
                            if (str5.equals(ch4Var.x) && !arrayList5.isEmpty()) {
                                tL_messages_search.offset_id = ((k47) b10.f(1, arrayList5)).e1();
                                i3 = i8;
                                j7 = j10;
                                tL_messages_searchGlobal = tL_messages_search;
                            }
                        } else {
                            str5 = str5;
                        }
                        tL_messages_search.offset_id = 0;
                        i3 = i8;
                        j7 = j10;
                        tL_messages_searchGlobal = tL_messages_search;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str5);
                        boolean z7 = z;
                        if (!isEmpty) {
                            ArrayList arrayList7 = new ArrayList();
                            j7 = j10;
                            i5 = 20;
                            j6 = j11;
                            i3 = i8;
                            i6 = 1;
                            cf7.Y(i8).J0(0, str5, arrayList7, new ArrayList(), new ArrayList(), null, z7 ? 1 : 0);
                            i4 = z7 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            j6 = j11;
                            i3 = i8;
                            i4 = z7 ? 1 : 0;
                            j7 = j10;
                            i5 = 20;
                            i6 = 1;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i5;
                        tL_messages_searchGlobal2.q = str5;
                        if (sh4Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = sh4Var2.e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = oc7.r1(i3).g1(j9);
                        if (j7 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j7 / 1000);
                        }
                        if (j6 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j6 / 1000);
                        }
                        if (z6 && str5.equals(ch4Var.x) && !arrayList5.isEmpty()) {
                            k47 k47Var = (k47) b10.f(i6, arrayList5);
                            tL_messages_searchGlobal2.offset_id = k47Var.e1();
                            tL_messages_searchGlobal2.offset_rate = ch4Var.w;
                            tL_messages_searchGlobal2.offset_peer = oc7.r1(i3).i1(k47.B1(k47Var.k.peer_id));
                        } else {
                            tL_messages_searchGlobal2.offset_rate = 0;
                            tL_messages_searchGlobal2.offset_id = 0;
                            tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                        tL_messages_searchGlobal2.flags |= i6;
                        tL_messages_searchGlobal2.folder_id = i4;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                    final ArrayList arrayList8 = arrayList6;
                    ch4Var.x = str5;
                    ch4Var.y = str3;
                    final ArrayList arrayList9 = new ArrayList();
                    uh4.B1(ch4Var.x, arrayList9);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                    final int i9 = i;
                    final String str6 = str5;
                    final int i10 = i3;
                    final long j12 = j7;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new jac() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                            final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            final ArrayList arrayList10 = new ArrayList();
                            final int i11 = i10;
                            final String str7 = str6;
                            if (tL_error == null) {
                                int size = messages_messages.messages.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    k47 k47Var2 = new k47(i11, messages_messages.messages.get(i12), false, true);
                                    k47Var2.J5(str7, true);
                                    arrayList10.add(k47Var2);
                                }
                            }
                            final ch4 ch4Var2 = ch4.this;
                            final int i13 = i9;
                            final boolean z8 = z6;
                            final sh4 sh4Var3 = sh4Var2;
                            final long j13 = j8;
                            final long j14 = j12;
                            final ArrayList arrayList11 = arrayList8;
                            final ArrayList arrayList12 = arrayList9;
                            gm.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ng4.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.e = r0;
            gm.d3(r0, (!z5 || arrayList.isEmpty()) ? 350L : 350L);
            pg4 pg4Var = this.l0;
            if (sh4Var == null) {
                pg4Var.setViewType(1);
                return;
            }
            byte b2 = sh4Var.d;
            if (b2 == 0) {
                if (!TextUtils.isEmpty(this.J)) {
                    pg4Var.setViewType(1);
                } else {
                    pg4Var.setViewType(2);
                }
            } else if (b2 == 1) {
                pg4Var.setViewType(3);
            } else if (b2 != 3 && b2 != 5) {
                if (b2 == 2) {
                    pg4Var.setViewType(5);
                }
            } else {
                pg4Var.setViewType(4);
            }
        }
    }

    public final void i(sg4 sg4Var, boolean z) {
        this.i0 = sg4Var;
        if (z && sg4Var != null) {
            ArrayList arrayList = this.d0;
            if (!arrayList.isEmpty()) {
                ((nh3) sg4Var).h(false, arrayList, this.e0, this.f0);
            }
        }
    }

    public final void j(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.s0 = z;
        setPadding(0, i, 0, i2);
        fv fvVar = this.b;
        if (z) {
            fvVar.q1(0, i, 0, i2);
        } else {
            fvVar.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fvVar.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
        this.s0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = z8c.t0;
        this.r0 = i;
        nm7.f(i).b(this, nm7.m4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.r0).n(this, nm7.m4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        q59 q59Var;
        byte b = this.s;
        byte b2 = 3;
        if (gm.O1()) {
            this.s = (byte) 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            b2 = 6;
            this.s = (byte) 6;
        } else {
            this.s = (byte) 3;
        }
        if (b != b2 && (q59Var = this.d) == this.V) {
            this.s0 = true;
            q59Var.f();
            this.s0 = false;
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(km0 km0Var) {
        nm0 nm0Var = new nm0(null);
        nm0Var.e = new w00((byte) 16);
        nm0Var.f(385875968, 402653183);
        nm0Var.e(385875968, 402653183);
        nm0Var.d(0, 0);
        nm0Var.f = 1.0f;
        nm0Var.h = 1.0f;
        tg4 tg4Var = this.n0;
        im0 c = km0Var.c(tg4Var, nm0Var, false);
        tg4Var.b = c;
        c.r(gm.L(11.5f));
        tg4Var.b.q(gm.L(5.0f));
    }

    public void setChatPreviewDelegate(rv9 rv9Var) {
        this.j0 = rv9Var;
    }

    public void setUiCallback(bh4 bh4Var) {
        this.p0 = bh4Var;
    }

    public void setUseFromUserAsAvatar(boolean z) {
        this.q0 = z;
    }

    @Override
    public final void updateColors() {
        try {
            tg4 tg4Var = this.n0;
            if (tg4Var != null) {
                tg4Var.updateColors();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void V(float f, int i) {
    }
}
