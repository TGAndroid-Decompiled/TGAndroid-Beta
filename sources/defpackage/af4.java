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
public final class af4 extends FrameLayout implements tjb, gk7, x74 {
    public static final SpannableStringBuilder[] t0 = new SpannableStringBuilder[3];
    public rf4 E;
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
    public final se4 T;
    public final te4 U;
    public final ye4 V;
    public final ve4 W;
    public final fm0 a;
    public final xe4 a0;
    public final fu b;
    public final ve4 b0;
    public final zya c;
    public final ve4 c0;
    public n39 d;
    public final ArrayList d0;
    public je4 e;
    public final ArrayList e0;
    public final ArrayList f;
    public boolean f0;
    public final ez3 g0;
    public final SparseArray h;
    public final me4 h0;
    public qe4 i0;
    public pt9 j0;
    public final t26 k0;
    public final ne4 l0;
    public final on m0;
    public final ArrayList n;
    public final re4 n0;
    public final s54 o0;
    public ze4 p0;
    public boolean q0;
    public final HashMap r;
    public int r0;
    public byte s;
    public boolean s0;
    public int w;
    public String x;
    public String y;

    public af4(d dVar) {
        super(dVar.getParentActivity());
        this.a = new fm0(0, this, s33.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = (byte) 3;
        this.T = new se4(0, 0L);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.g0 = new ez3(this, (byte) 3);
        this.h0 = new me4(this);
        this.m0 = new on(null);
        this.o0 = new s54(this, (byte) 11);
        this.M = dVar;
        Activity parentActivity = dVar.getParentActivity();
        this.L = parentActivity;
        zkb.h(bkb.c6, null, this);
        fu fuVar = new fu((byte) 19, parentActivity, this);
        this.b = fuVar;
        fuVar.setOnItemClickListener(new nrc(this, (byte) 1));
        fuVar.setOnItemLongClickListener(new qx4(this));
        t26 t26Var = new t26();
        this.k0 = t26Var;
        fuVar.setLayoutManager(t26Var);
        ne4 ne4Var = new ne4((byte) 0, parentActivity, this);
        this.l0 = ne4Var;
        addView(ne4Var);
        addView(fuVar);
        fuVar.setSectionsType(2);
        fuVar.setSkipDrawSection(true);
        fuVar.setOnScrollListener(new oe4(this));
        re4 re4Var = new re4(parentActivity);
        this.n0 = re4Var;
        String u = k96.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(re4Var.c, u)) {
            re4Var.c = u;
            re4Var.a.t(u, true, true);
        }
        addView(re4Var, nme.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new te4(this);
        this.V = new ye4(this, getContext());
        this.W = new ve4(this, getContext(), 1);
        this.a0 = new xe4(this, getContext());
        this.b0 = new ve4(this, getContext(), 4);
        this.c0 = new ve4(this, getContext(), 2);
        zya zyaVar = new zya(parentActivity, ne4Var, 1, null);
        this.c = zyaVar;
        addView(zyaVar);
        fuVar.setEmptyView(zyaVar);
        zyaVar.setVisibility(8);
        a();
    }

    public static CharSequence b(k27 k27Var, boolean z) {
        return c(k27Var, z, 0, null);
    }

    public static CharSequence c(k27 k27Var, boolean z, int i, TextPaint textPaint) {
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
        if (k27Var != null && (message = k27Var.k) != null) {
            if (k27.a4(message)) {
                nx8 c = ox8.f(k27Var.K1).c(k27.I1(k27Var.k));
                if (c != null) {
                    return c.b;
                }
                return "";
            }
            CharSequence charSequence = null;
            if (k27Var.q4()) {
                if (k27Var.b1) {
                    return k96.M0(2131745021, null);
                }
                if (k27Var.U0) {
                    return k96.M0(2131745022, null);
                }
                return k96.M0(2131745023, null);
            }
            SpannableStringBuilder[] spannableStringBuilderArr = t0;
            if (spannableStringBuilderArr[i] == null) {
                spannableStringBuilderArr[i] = new SpannableStringBuilder(">");
                if (i == 0) {
                    i2 = 2131230875;
                } else if (i == 1) {
                    i2 = 2131232234;
                } else if (i == 2) {
                    i2 = 2131232233;
                } else {
                    return "";
                }
                Drawable mutate = a.b.getDrawable(i2).mutate();
                if (i == 0) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                cm2 cm2Var = new cm2(i3, mutate);
                if (i == 1 || i == 2) {
                    cm2Var.I = 0.85f;
                }
                SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i];
                spannableStringBuilder.setSpan(cm2Var, 0, spannableStringBuilder.length(), 0);
            }
            TLRPC.Message message2 = k27Var.k;
            if (message2.saved_peer_id != null) {
                if (k27Var.P1() >= 0) {
                    user2 = na7.q1(y6c.t0).V1(Long.valueOf(k27Var.P1()));
                    chat = null;
                } else if (k27Var.P1() < 0) {
                    chat = na7.q1(y6c.t0).K0(Long.valueOf(-k27Var.P1()));
                    user2 = null;
                    chat2 = null;
                } else {
                    user2 = null;
                    chat = null;
                }
                chat2 = chat;
            } else {
                if (message2.from_id.user_id != 0) {
                    user = na7.q1(y6c.t0).V1(Long.valueOf(k27Var.k.from_id.user_id));
                } else {
                    user = null;
                }
                if (k27Var.k.from_id.chat_id != 0) {
                    chat = na7.q1(y6c.t0).K0(Long.valueOf(k27Var.k.peer_id.chat_id));
                } else {
                    chat = null;
                }
                if (chat == null) {
                    if (k27Var.k.from_id.channel_id != 0) {
                        chat = na7.q1(y6c.t0).K0(Long.valueOf(k27Var.k.peer_id.channel_id));
                    } else {
                        chat = null;
                    }
                }
                if (k27Var.k.peer_id.channel_id != 0) {
                    chat2 = na7.q1(y6c.t0).K0(Long.valueOf(k27Var.k.peer_id.channel_id));
                } else {
                    chat2 = null;
                }
                if (chat2 == null) {
                    if (k27Var.k.peer_id.chat_id != 0) {
                        chat2 = na7.q1(y6c.t0).K0(Long.valueOf(k27Var.k.peer_id.chat_id));
                    } else {
                        chat2 = null;
                    }
                }
                if (!hc2.V(chat2) && !z) {
                    chat2 = null;
                }
                user2 = user;
            }
            if (user2 != null) {
                if (chat2 != null) {
                    CharSequence charSequence2 = chat2.title;
                    if (hc2.c0(chat2) && (f2 = na7.q1(y6c.t0).g4.f(chat2.id, k27.b2(k27Var.K1, k27Var.k, true, false))) != null) {
                        charSequence2 = mm4.k(f2, null, null);
                    }
                    if (textPaint == null) {
                        fontMetricsInt3 = null;
                    } else {
                        fontMetricsInt3 = textPaint.getFontMetricsInt();
                    }
                    CharSequence m = vu3.m(charSequence2, fontMetricsInt3, false, null, 0);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    String k = l7c.k(user2, true);
                    if (textPaint == null) {
                        fontMetricsInt4 = null;
                    } else {
                        fontMetricsInt4 = textPaint.getFontMetricsInt();
                    }
                    spannableStringBuilder2.append(vu3.m(k, fontMetricsInt4, false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i]).append((char) 8202).append(m);
                    charSequence = spannableStringBuilder2;
                } else {
                    String r = l7c.r(user2);
                    if (textPaint == null) {
                        fontMetricsInt2 = null;
                    } else {
                        fontMetricsInt2 = textPaint.getFontMetricsInt();
                    }
                    charSequence = vu3.m(r, fontMetricsInt2, false, null, 0);
                }
            } else if (chat != null) {
                CharSequence charSequence3 = chat.title;
                if (hc2.c0(chat) && (f = na7.q1(y6c.t0).g4.f(chat.id, k27.b2(k27Var.K1, k27Var.k, true, false))) != null) {
                    charSequence3 = mm4.k(f, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt = null;
                } else {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                charSequence = vu3.m(charSequence3, fontMetricsInt, false, null, 0);
            }
            if (charSequence != null) {
                return charSequence;
            }
            return "";
        }
        return "";
    }

    public final void a() {
        int i;
        float f = this.a.e;
        re4 re4Var = this.n0;
        re4Var.setTranslationY((1.0f - f) * (-gl.L(24.0f)));
        re4Var.setAlpha(f);
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        re4Var.setVisibility(i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.j7));
        hashSet.add(Integer.valueOf(bkb.S8));
        hashSet.add(Integer.valueOf(bkb.b9));
        hashSet.add(Integer.valueOf(bkb.c9));
        hashSet.add(Integer.valueOf(bkb.B9));
        hashSet.add(Integer.valueOf(bkb.A9));
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.z9));
        hashSet.add(Integer.valueOf(bkb.x9));
        hashSet.add(Integer.valueOf(bkb.w9));
        hashSet.add(Integer.valueOf(bkb.v9));
        hashSet.add(Integer.valueOf(bkb.u9));
        hashSet.add(Integer.valueOf(bkb.t9));
        hashSet.add(Integer.valueOf(bkb.s9));
        hashSet.add(Integer.valueOf(bkb.r9));
        hashSet.add(Integer.valueOf(bkb.p9));
        hashSet.add(Integer.valueOf(bkb.o9));
        hashSet.add(Integer.valueOf(bkb.i9));
        hashSet.add(Integer.valueOf(bkb.l9));
        hashSet.add(Integer.valueOf(bkb.f9));
        hashSet.add(Integer.valueOf(bkb.h9));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.a9));
        hashSet.add(Integer.valueOf(bkb.Z8));
        hashSet.add(Integer.valueOf(bkb.V8));
        hashSet.add(Integer.valueOf(bkb.U8));
        hashSet.add(Integer.valueOf(bkb.T8));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.zi));
        hashSet.add(Integer.valueOf(bkb.Ai));
        hashSet.add(Integer.valueOf(bkb.J6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.rj));
        hashSet.add(Integer.valueOf(bkb.yi));
        hashSet.add(Integer.valueOf(bkb.z6));
    }

    public final void d(java.util.ArrayList r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af4.d(java.util.ArrayList, long):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            fu fuVar = this.b;
            int childCount = fuVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (fuVar.getChildAt(i3) instanceof ue3) {
                    ((ue3) fuVar.getChildAt(i3)).k0(0, true);
                }
                fuVar.getChildAt(i3).invalidate();
            }
        }
    }

    public final void e(int i, View view, k27 k27Var, int i2) {
        TLRPC.WebPage webPage;
        String str;
        if (k27Var != null) {
            if (this.p0.t()) {
                this.p0.f(k27Var, view, i2);
            } else if (view instanceof ue3) {
                this.p0.n(k27Var);
            } else {
                byte b = this.E.d;
                me4 me4Var = this.h0;
                ArrayList arrayList = this.f;
                String str2 = null;
                d dVar = this.M;
                if (b == 0) {
                    PhotoViewer.r0().T1(null, dVar, null);
                    PhotoViewer.r0().j1(arrayList, i, 0L, 0L, 0L, me4Var);
                    this.S = PhotoViewer.r0().c;
                } else if (b != 3 && b != 5) {
                    if (b == 1) {
                        if (view instanceof iba) {
                            iba ibaVar = (iba) view;
                            TLRPC.Document F0 = k27Var.F0();
                            if (ibaVar.H) {
                                if (k27Var.x()) {
                                    PhotoViewer.r0().T1(null, dVar, null);
                                    int indexOf = arrayList.indexOf(k27Var);
                                    if (indexOf < 0) {
                                        ArrayList t = tb4.t(k27Var);
                                        PhotoViewer.r0().T1(null, dVar, null);
                                        PhotoViewer.r0().j1(t, 0, 0L, 0L, 0L, me4Var);
                                        this.S = PhotoViewer.r0().c;
                                        return;
                                    }
                                    PhotoViewer.r0().T1(null, dVar, null);
                                    PhotoViewer.r0().j1(arrayList, indexOf, 0L, 0L, 0L, me4Var);
                                    this.S = PhotoViewer.r0().c;
                                    return;
                                }
                                gl.q2(k27Var, this.L, dVar);
                            } else if (!ibaVar.G) {
                                k27 message = ibaVar.getMessage();
                                message.P = true;
                                ba4.G(j5.a(y6c.t0).a).X(F0, message, 0, 0);
                                ibaVar.f(true);
                            } else {
                                ba4.G(j5.a(y6c.t0).a).f(F0);
                                ibaVar.f(true);
                            }
                        }
                    } else if (b == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = k27Var.k.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k27Var) == null) {
                                        dVar.createArticleViewer(false).L(k27Var, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    ou3.I0(this.M, k27Var, this.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((lba) view).F;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                    }
                } else if (view instanceof eba) {
                    ((eba) view).a();
                }
            }
        }
    }

    public final void f(k27 k27Var, View view, int i) {
        if (!this.p0.t()) {
            this.p0.c();
        }
        if (this.p0.t()) {
            this.p0.f(k27Var, view, i);
        }
    }

    public final void g(String str) {
        if (gl.D3(str)) {
            ij.n0(this.M, str, true, true);
        } else {
            d01.t(this.L, str);
        }
    }

    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        arrayList.add(new blb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g5));
        arrayList.add(new blb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        int i = bkb.h7;
        fu fuVar = this.b;
        arrayList.add(new blb(fuVar, 8192, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.j7;
        arrayList.add(new blb(fuVar, 16384, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(fuVar, 8, new Class[]{iba.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (alb) null, bkb.pj));
        arrayList.add(new blb(fuVar, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(fuVar, 8192, new Class[]{eba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(fuVar, 16384, new Class[]{eba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(fuVar, 8192, new Class[]{lba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(fuVar, 16384, new Class[]{lba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        zya zyaVar = this.c;
        arrayList.add(new blb(zyaVar.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F6));
        arrayList.add(new blb(zyaVar.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.x6));
        return arrayList;
    }

    public final void h(final long j, final long j2, final long j3, final long j4, final rf4 rf4Var, final boolean z, String str, boolean z2) {
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
        if (rf4Var == null) {
            b = -1;
        } else {
            b = rf4Var.d;
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
        this.E = rf4Var;
        this.F = j;
        this.G = j2;
        this.I = j3;
        this.H = j4;
        this.J = str2;
        this.K = z;
        je4 je4Var = this.e;
        if (je4Var != null) {
            gl.r(je4Var);
        }
        ez3 ez3Var = this.g0;
        gl.r(ez3Var);
        if (!z3 || !z2) {
            ArrayList arrayList2 = this.e0;
            final boolean z5 = z3;
            ArrayList arrayList3 = this.d0;
            zya zyaVar = this.c;
            ArrayList arrayList4 = this.f;
            long j5 = 0;
            if (!z4 && (rf4Var != null || j2 != 0 || j != 0 || j3 != 0 || j4 != 0)) {
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
                zyaVar.setVisibility(0);
                n39 n39Var = this.d;
                if (n39Var != null) {
                    n39Var.f();
                }
                this.Q++;
                fu fuVar = this.b;
                if (fuVar.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    fuVar.getPinnedHeader().setAlpha(0.0f);
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
            n39 n39Var2 = this.d;
            if (n39Var2 != null) {
                n39Var2.f();
            }
            if (!z5) {
                ez3Var.run();
                zyaVar.e(true, !z2);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                qe4 qe4Var = this.i0;
                if (qe4Var != null) {
                    ((ag3) qe4Var).h(false, null, null, false);
                }
            }
            final int i = this.Q + 1;
            this.Q = i;
            final int i2 = y6c.t0;
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
                    final af4 af4Var = af4.this;
                    ArrayList arrayList5 = af4Var.f;
                    final long j8 = j;
                    int i7 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
                    long j9 = j2;
                    String str5 = str2;
                    final rf4 rf4Var2 = rf4Var;
                    int i8 = i2;
                    long j10 = j3;
                    long j11 = j4;
                    final boolean z6 = z5;
                    ArrayList arrayList6 = null;
                    if (i7 != 0 && j9 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.q = str5;
                        tL_messages_search.limit = 20;
                        if (rf4Var2 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = rf4Var2.e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = na7.q1(j5.a(i8).a).h1(j8);
                        if (j10 > 0) {
                            tL_messages_search.min_date = (int) (j10 / 1000);
                        }
                        if (j11 > 0) {
                            tL_messages_search.max_date = (int) (j11 / 1000);
                        }
                        if (z6) {
                            str5 = str5;
                            if (str5.equals(af4Var.x) && !arrayList5.isEmpty()) {
                                tL_messages_search.offset_id = ((k27) b00.f(1, arrayList5)).e1();
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
                            ad7.Y(i8).J0(0, str5, arrayList7, new ArrayList(), new ArrayList(), null, z7 ? 1 : 0);
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
                        if (rf4Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = rf4Var2.e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = na7.q1(i3).f1(j9);
                        if (j7 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j7 / 1000);
                        }
                        if (j6 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j6 / 1000);
                        }
                        if (z6 && str5.equals(af4Var.x) && !arrayList5.isEmpty()) {
                            k27 k27Var = (k27) b00.f(i6, arrayList5);
                            tL_messages_searchGlobal2.offset_id = k27Var.e1();
                            tL_messages_searchGlobal2.offset_rate = af4Var.w;
                            tL_messages_searchGlobal2.offset_peer = na7.q1(i3).h1(k27.B1(k27Var.k.peer_id));
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
                    af4Var.x = str5;
                    af4Var.y = str3;
                    final ArrayList arrayList9 = new ArrayList();
                    tf4.B1(af4Var.x, arrayList9);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                    final int i9 = i;
                    final String str6 = str5;
                    final int i10 = i3;
                    final long j12 = j7;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new i8c() {
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
                                    k27 k27Var2 = new k27(i11, messages_messages.messages.get(i12), false, true);
                                    k27Var2.J5(str7, true);
                                    arrayList10.add(k27Var2);
                                }
                            }
                            final af4 af4Var2 = af4.this;
                            final int i13 = i9;
                            final boolean z8 = z6;
                            final rf4 rf4Var3 = rf4Var2;
                            final long j13 = j8;
                            final long j14 = j12;
                            final ArrayList arrayList11 = arrayList8;
                            final ArrayList arrayList12 = arrayList9;
                            gl.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.le4.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.e = r0;
            gl.d3(r0, (!z5 || arrayList.isEmpty()) ? 350L : 350L);
            ne4 ne4Var = this.l0;
            if (rf4Var == null) {
                ne4Var.setViewType(1);
                return;
            }
            byte b2 = rf4Var.d;
            if (b2 == 0) {
                if (!TextUtils.isEmpty(this.J)) {
                    ne4Var.setViewType(1);
                } else {
                    ne4Var.setViewType(2);
                }
            } else if (b2 == 1) {
                ne4Var.setViewType(3);
            } else if (b2 != 3 && b2 != 5) {
                if (b2 == 2) {
                    ne4Var.setViewType(5);
                }
            } else {
                ne4Var.setViewType(4);
            }
        }
    }

    public final void i(qe4 qe4Var, boolean z) {
        this.i0 = qe4Var;
        if (z && qe4Var != null) {
            ArrayList arrayList = this.d0;
            if (!arrayList.isEmpty()) {
                ((ag3) qe4Var).h(false, arrayList, this.e0, this.f0);
            }
        }
    }

    public final void j(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.s0 = z;
        setPadding(0, i, 0, i2);
        fu fuVar = this.b;
        if (z) {
            fuVar.q1(0, i, 0, i2);
        } else {
            fuVar.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fuVar.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
        this.s0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = y6c.t0;
        this.r0 = i;
        kk7.f(i).b(this, kk7.k4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.r0).n(this, kk7.k4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        n39 n39Var;
        byte b = this.s;
        byte b2 = 3;
        if (gl.O1()) {
            this.s = (byte) 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            b2 = 6;
            this.s = (byte) 6;
        } else {
            this.s = (byte) 3;
        }
        if (b != b2 && (n39Var = this.d) == this.V) {
            this.s0 = true;
            n39Var.f();
            this.s0 = false;
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            a();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(kl0 kl0Var) {
        nl0 nl0Var = new nl0(null);
        nl0Var.e = new wz((byte) 16);
        nl0Var.f(385875968, 402653183);
        nl0Var.e(385875968, 402653183);
        nl0Var.d(0, 0);
        nl0Var.f = 1.0f;
        nl0Var.h = 1.0f;
        re4 re4Var = this.n0;
        il0 c = kl0Var.c(re4Var, nl0Var, false);
        re4Var.b = c;
        c.r(gl.L(11.5f));
        re4Var.b.q(gl.L(5.0f));
    }

    public void setChatPreviewDelegate(pt9 pt9Var) {
        this.j0 = pt9Var;
    }

    public void setUiCallback(ze4 ze4Var) {
        this.p0 = ze4Var;
    }

    public void setUseFromUserAsAvatar(boolean z) {
        this.q0 = z;
    }

    @Override
    public final void updateColors() {
        try {
            re4 re4Var = this.n0;
            if (re4Var != null) {
                re4Var.updateColors();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void F(float f, int i) {
    }
}
