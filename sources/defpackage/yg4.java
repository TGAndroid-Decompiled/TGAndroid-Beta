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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class yg4 extends FrameLayout implements snb, fn7, s84 {
    public static final SpannableStringBuilder[] t0 = new SpannableStringBuilder[3];
    public ph4 E;
    public long F;
    public long G;
    public long H;
    public long I;
    public String J;
    public boolean K;
    public final Activity L;
    public final e M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public String R;
    public int S;
    public final qg4 T;
    public final rg4 U;
    public final wg4 V;
    public final tg4 W;
    public final fm0 a;
    public final vg4 a0;
    public final gu b;
    public final tg4 b0;
    public final z2b c;
    public final tg4 c0;
    public c79 d;
    public final ArrayList d0;
    public hg4 e;
    public final ArrayList e0;
    public final ArrayList f;
    public boolean f0;
    public final zz3 g0;
    public final SparseArray h;
    public final kg4 h0;
    public og4 i0;
    public jx9 j0;
    public final x46 k0;
    public final lg4 l0;
    public final pn m0;
    public final ArrayList n;
    public final pg4 n0;
    public final lw3 o0;
    public xg4 p0;
    public boolean q0;
    public final HashMap r;
    public int r0;
    public byte s;
    public boolean s0;
    public int w;
    public String x;
    public String y;

    public yg4(e eVar) {
        super(eVar.getParentActivity());
        this.a = new fm0(0, this, k43.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = (byte) 3;
        this.T = new qg4(0, 0L);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.g0 = new zz3(this, (byte) 3);
        this.h0 = new kg4(this);
        this.m0 = new pn(null);
        this.o0 = new lw3(this, (byte) 24);
        this.M = eVar;
        Activity parentActivity = eVar.getParentActivity();
        this.L = parentActivity;
        yob.h(aob.d6, null, this);
        gu guVar = new gu((byte) 19, parentActivity, this);
        this.b = guVar;
        guVar.setOnItemClickListener(new bwc(this, (byte) 1));
        guVar.setOnItemLongClickListener(new v34(this, (byte) 1));
        x46 x46Var = new x46();
        this.k0 = x46Var;
        guVar.setLayoutManager(x46Var);
        lg4 lg4Var = new lg4((byte) 0, parentActivity, this);
        this.l0 = lg4Var;
        addView(lg4Var);
        addView(guVar);
        guVar.setSectionsType(2);
        guVar.setSkipDrawSection(true);
        guVar.setOnScrollListener(new mg4(this));
        pg4 pg4Var = new pg4(parentActivity);
        this.n0 = pg4Var;
        String u = ob6.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(pg4Var.c, u)) {
            pg4Var.c = u;
            pg4Var.a.t(u, true, true);
        }
        addView(pg4Var, tre.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new rg4(this);
        this.V = new wg4(this, getContext());
        this.W = new tg4(this, getContext(), 1);
        this.a0 = new vg4(this, getContext());
        this.b0 = new tg4(this, getContext(), 4);
        this.c0 = new tg4(this, getContext(), 2);
        z2b z2bVar = new z2b(parentActivity, lg4Var, 1, null);
        this.c = z2bVar;
        addView(z2bVar);
        guVar.setEmptyView(z2bVar);
        z2bVar.setVisibility(8);
        a();
    }

    public static CharSequence b(r47 r47Var, boolean z) {
        return c(r47Var, z, 0, null);
    }

    public static CharSequence c(r47 r47Var, boolean z, int i, TextPaint textPaint) {
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
        if (r47Var != null && (message = r47Var.k) != null) {
            if (r47.a4(message)) {
                a19 c = b19.f(r47Var.K1).c(r47.I1(r47Var.k));
                if (c != null) {
                    return c.b;
                }
                return "";
            }
            CharSequence charSequence = null;
            if (r47Var.q4()) {
                if (r47Var.b1) {
                    return ob6.M0(2131744915, null);
                }
                if (r47Var.U0) {
                    return ob6.M0(2131744916, null);
                }
                return ob6.M0(2131744917, null);
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
                wm2 wm2Var = new wm2(i3, mutate);
                if (i == 1 || i == 2) {
                    wm2Var.I = 0.85f;
                }
                SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i];
                spannableStringBuilder.setSpan(wm2Var, 0, spannableStringBuilder.length(), 0);
            }
            TLRPC.Message message2 = r47Var.k;
            if (message2.saved_peer_id != null) {
                if (r47Var.P1() >= 0) {
                    user2 = uc7.s1(yac.t0).X1(Long.valueOf(r47Var.P1()));
                    chat = null;
                } else if (r47Var.P1() < 0) {
                    chat = uc7.s1(yac.t0).M0(Long.valueOf(-r47Var.P1()));
                    user2 = null;
                    chat2 = null;
                } else {
                    user2 = null;
                    chat = null;
                }
                chat2 = chat;
            } else {
                if (message2.from_id.user_id != 0) {
                    user = uc7.s1(yac.t0).X1(Long.valueOf(r47Var.k.from_id.user_id));
                } else {
                    user = null;
                }
                if (r47Var.k.from_id.chat_id != 0) {
                    chat = uc7.s1(yac.t0).M0(Long.valueOf(r47Var.k.peer_id.chat_id));
                } else {
                    chat = null;
                }
                if (chat == null) {
                    if (r47Var.k.from_id.channel_id != 0) {
                        chat = uc7.s1(yac.t0).M0(Long.valueOf(r47Var.k.peer_id.channel_id));
                    } else {
                        chat = null;
                    }
                }
                if (r47Var.k.peer_id.channel_id != 0) {
                    chat2 = uc7.s1(yac.t0).M0(Long.valueOf(r47Var.k.peer_id.channel_id));
                } else {
                    chat2 = null;
                }
                if (chat2 == null) {
                    if (r47Var.k.peer_id.chat_id != 0) {
                        chat2 = uc7.s1(yac.t0).M0(Long.valueOf(r47Var.k.peer_id.chat_id));
                    } else {
                        chat2 = null;
                    }
                }
                if (!xc2.V(chat2) && !z) {
                    chat2 = null;
                }
                user2 = user;
            }
            if (user2 != null) {
                if (chat2 != null) {
                    CharSequence charSequence2 = chat2.title;
                    if (xc2.c0(chat2) && (f2 = uc7.s1(yac.t0).g4.f(chat2.id, r47.b2(r47Var.K1, r47Var.k, true, false))) != null) {
                        charSequence2 = ro4.k(f2, null, null);
                    }
                    if (textPaint == null) {
                        fontMetricsInt3 = null;
                    } else {
                        fontMetricsInt3 = textPaint.getFontMetricsInt();
                    }
                    CharSequence m = pv3.m(charSequence2, fontMetricsInt3, false, null, 0);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    String k = lbc.k(user2, true);
                    if (textPaint == null) {
                        fontMetricsInt4 = null;
                    } else {
                        fontMetricsInt4 = textPaint.getFontMetricsInt();
                    }
                    spannableStringBuilder2.append(pv3.m(k, fontMetricsInt4, false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i]).append((char) 8202).append(m);
                    charSequence = spannableStringBuilder2;
                } else {
                    String r = lbc.r(user2);
                    if (textPaint == null) {
                        fontMetricsInt2 = null;
                    } else {
                        fontMetricsInt2 = textPaint.getFontMetricsInt();
                    }
                    charSequence = pv3.m(r, fontMetricsInt2, false, null, 0);
                }
            } else if (chat != null) {
                CharSequence charSequence3 = chat.title;
                if (xc2.c0(chat) && (f = uc7.s1(yac.t0).g4.f(chat.id, r47.b2(r47Var.K1, r47Var.k, true, false))) != null) {
                    charSequence3 = ro4.k(f, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt = null;
                } else {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                charSequence = pv3.m(charSequence3, fontMetricsInt, false, null, 0);
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
        pg4 pg4Var = this.n0;
        pg4Var.setTranslationY((1.0f - f) * (-hl.L(24.0f)));
        pg4Var.setAlpha(f);
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 4;
        }
        pg4Var.setVisibility(i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.k7));
        hashSet.add(Integer.valueOf(aob.T8));
        hashSet.add(Integer.valueOf(aob.c9));
        hashSet.add(Integer.valueOf(aob.d9));
        hashSet.add(Integer.valueOf(aob.C9));
        hashSet.add(Integer.valueOf(aob.B9));
        hashSet.add(Integer.valueOf(aob.z9));
        hashSet.add(Integer.valueOf(aob.A9));
        hashSet.add(Integer.valueOf(aob.y9));
        hashSet.add(Integer.valueOf(aob.x9));
        hashSet.add(Integer.valueOf(aob.w9));
        hashSet.add(Integer.valueOf(aob.v9));
        hashSet.add(Integer.valueOf(aob.u9));
        hashSet.add(Integer.valueOf(aob.t9));
        hashSet.add(Integer.valueOf(aob.s9));
        hashSet.add(Integer.valueOf(aob.q9));
        hashSet.add(Integer.valueOf(aob.p9));
        hashSet.add(Integer.valueOf(aob.j9));
        hashSet.add(Integer.valueOf(aob.m9));
        hashSet.add(Integer.valueOf(aob.g9));
        hashSet.add(Integer.valueOf(aob.i9));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.b9));
        hashSet.add(Integer.valueOf(aob.a9));
        hashSet.add(Integer.valueOf(aob.W8));
        hashSet.add(Integer.valueOf(aob.V8));
        hashSet.add(Integer.valueOf(aob.U8));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Ai));
        hashSet.add(Integer.valueOf(aob.Bi));
        hashSet.add(Integer.valueOf(aob.K6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.sj));
        hashSet.add(Integer.valueOf(aob.zi));
        hashSet.add(Integer.valueOf(aob.A6));
    }

    public final void d(java.util.ArrayList r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg4.d(java.util.ArrayList, long):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            gu guVar = this.b;
            int childCount = guVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (guVar.getChildAt(i3) instanceof of3) {
                    ((of3) guVar.getChildAt(i3)).j0(0, true);
                }
                guVar.getChildAt(i3).invalidate();
            }
        }
    }

    public final void e(int i, View view, r47 r47Var, int i2) {
        TLRPC.WebPage webPage;
        String str;
        if (r47Var != null) {
            if (this.p0.u()) {
                this.p0.h(r47Var, view, i2);
            } else if (view instanceof of3) {
                this.p0.r(r47Var);
            } else {
                byte b = this.E.d;
                kg4 kg4Var = this.h0;
                ArrayList arrayList = this.f;
                String str2 = null;
                e eVar = this.M;
                if (b == 0) {
                    PhotoViewer.q0().T1(null, eVar, null);
                    PhotoViewer.q0().n1(arrayList, i, 0L, 0L, 0L, kg4Var);
                    this.S = PhotoViewer.q0().c;
                } else if (b != 3 && b != 5) {
                    if (b == 1) {
                        if (view instanceof zea) {
                            zea zeaVar = (zea) view;
                            TLRPC.Document F0 = r47Var.F0();
                            if (zeaVar.H) {
                                if (r47Var.x()) {
                                    PhotoViewer.q0().T1(null, eVar, null);
                                    int indexOf = arrayList.indexOf(r47Var);
                                    if (indexOf < 0) {
                                        ArrayList t = qd4.t(r47Var);
                                        PhotoViewer.q0().T1(null, eVar, null);
                                        PhotoViewer.q0().n1(t, 0, 0L, 0L, 0L, kg4Var);
                                        this.S = PhotoViewer.q0().c;
                                        return;
                                    }
                                    PhotoViewer.q0().T1(null, eVar, null);
                                    PhotoViewer.q0().n1(arrayList, indexOf, 0L, 0L, 0L, kg4Var);
                                    this.S = PhotoViewer.q0().c;
                                    return;
                                }
                                hl.q2(r47Var, this.L, eVar);
                            } else if (!zeaVar.G) {
                                r47 message = zeaVar.getMessage();
                                message.P = true;
                                xb4.G(k5.a(yac.t0).a).X(F0, message, 0, 0);
                                zeaVar.f(true);
                            } else {
                                xb4.G(k5.a(yac.t0).a).f(F0);
                                zeaVar.f(true);
                            }
                        }
                    } else if (b == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = r47Var.k.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(r47Var) == null) {
                                        eVar.createArticleViewer(false).L(r47Var, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    iv3.J0(this.M, r47Var, this.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((cfa) view).F;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                } else if (view instanceof vea) {
                    ((vea) view).a();
                }
            }
        }
    }

    public final void f(r47 r47Var, View view, int i) {
        if (!this.p0.u()) {
            this.p0.e();
        }
        if (this.p0.u()) {
            this.p0.h(r47Var, view, i);
        }
    }

    public final void g(String str) {
        if (hl.D3(str)) {
            jj.n0(this.M, str, true, true);
        } else {
            m01.u(this.L, str);
        }
    }

    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        arrayList.add(new apb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h5));
        arrayList.add(new apb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        int i = aob.i7;
        gu guVar = this.b;
        arrayList.add(new apb(guVar, 8192, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.k7;
        arrayList.add(new apb(guVar, 16384, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(guVar, 8, new Class[]{zea.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (zob) null, aob.qj));
        arrayList.add(new apb(guVar, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, aob.h6));
        arrayList.add(new apb(guVar, 8192, new Class[]{vea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(guVar, 16384, new Class[]{vea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(guVar, 8192, new Class[]{cfa.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(guVar, 16384, new Class[]{cfa.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        z2b z2bVar = this.c;
        arrayList.add(new apb(z2bVar.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
        arrayList.add(new apb(z2bVar.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.y6));
        return arrayList;
    }

    public final void h(final long j, final long j2, final long j3, final long j4, final ph4 ph4Var, final boolean z, String str, boolean z2) {
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
        if (ph4Var == null) {
            b = -1;
        } else {
            b = ph4Var.d;
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
        this.E = ph4Var;
        this.F = j;
        this.G = j2;
        this.I = j3;
        this.H = j4;
        this.J = str2;
        this.K = z;
        hg4 hg4Var = this.e;
        if (hg4Var != null) {
            hl.r(hg4Var);
        }
        zz3 zz3Var = this.g0;
        hl.r(zz3Var);
        if (!z3 || !z2) {
            ArrayList arrayList2 = this.e0;
            final boolean z5 = z3;
            ArrayList arrayList3 = this.d0;
            z2b z2bVar = this.c;
            ArrayList arrayList4 = this.f;
            long j5 = 0;
            if (!z4 && (ph4Var != null || j2 != 0 || j != 0 || j3 != 0 || j4 != 0)) {
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
                z2bVar.setVisibility(0);
                c79 c79Var = this.d;
                if (c79Var != null) {
                    c79Var.f();
                }
                this.Q++;
                gu guVar = this.b;
                if (guVar.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    guVar.getPinnedHeader().setAlpha(0.0f);
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
            c79 c79Var2 = this.d;
            if (c79Var2 != null) {
                c79Var2.f();
            }
            if (!z5) {
                zz3Var.run();
                z2bVar.e(true, !z2);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                og4 og4Var = this.i0;
                if (og4Var != null) {
                    ((xg3) og4Var).i(false, null, null, false);
                }
            }
            final int i = this.Q + 1;
            this.Q = i;
            final int i2 = yac.t0;
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
                    final yg4 yg4Var = yg4.this;
                    ArrayList arrayList5 = yg4Var.f;
                    final long j8 = j;
                    int i7 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
                    long j9 = j2;
                    String str5 = str2;
                    final ph4 ph4Var2 = ph4Var;
                    int i8 = i2;
                    long j10 = j3;
                    long j11 = j4;
                    final boolean z6 = z5;
                    ArrayList arrayList6 = null;
                    if (i7 != 0 && j9 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.q = str5;
                        tL_messages_search.limit = 20;
                        if (ph4Var2 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = ph4Var2.e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = uc7.s1(k5.a(i8).a).j1(j8);
                        if (j10 > 0) {
                            tL_messages_search.min_date = (int) (j10 / 1000);
                        }
                        if (j11 > 0) {
                            tL_messages_search.max_date = (int) (j11 / 1000);
                        }
                        if (z6) {
                            str5 = str5;
                            if (str5.equals(yg4Var.x) && !arrayList5.isEmpty()) {
                                tL_messages_search.offset_id = ((r47) c00.g(1, arrayList5)).e1();
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
                            jf7.Y(i8).J0(0, str5, arrayList7, new ArrayList(), new ArrayList(), null, z7 ? 1 : 0);
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
                        if (ph4Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = ph4Var2.e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = uc7.s1(i3).h1(j9);
                        if (j7 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j7 / 1000);
                        }
                        if (j6 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j6 / 1000);
                        }
                        if (z6 && str5.equals(yg4Var.x) && !arrayList5.isEmpty()) {
                            r47 r47Var = (r47) c00.g(i6, arrayList5);
                            tL_messages_searchGlobal2.offset_id = r47Var.e1();
                            tL_messages_searchGlobal2.offset_rate = yg4Var.w;
                            tL_messages_searchGlobal2.offset_peer = uc7.s1(i3).j1(r47.B1(r47Var.k.peer_id));
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
                    yg4Var.x = str5;
                    yg4Var.y = str3;
                    final ArrayList arrayList9 = new ArrayList();
                    rh4.C1(yg4Var.x, arrayList9);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                    final int i9 = i;
                    final String str6 = str5;
                    final int i10 = i3;
                    final long j12 = j7;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new icc() {
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
                                    r47 r47Var2 = new r47(i11, messages_messages.messages.get(i12), false, true);
                                    r47Var2.J5(str7, true);
                                    arrayList10.add(r47Var2);
                                }
                            }
                            final yg4 yg4Var2 = yg4.this;
                            final int i13 = i9;
                            final boolean z8 = z6;
                            final ph4 ph4Var3 = ph4Var2;
                            final long j13 = j8;
                            final long j14 = j12;
                            final ArrayList arrayList11 = arrayList8;
                            final ArrayList arrayList12 = arrayList9;
                            hl.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.jg4.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.e = r0;
            hl.d3(r0, (!z5 || arrayList.isEmpty()) ? 350L : 350L);
            lg4 lg4Var = this.l0;
            if (ph4Var == null) {
                lg4Var.setViewType(1);
                return;
            }
            byte b2 = ph4Var.d;
            if (b2 == 0) {
                if (!TextUtils.isEmpty(this.J)) {
                    lg4Var.setViewType(1);
                } else {
                    lg4Var.setViewType(2);
                }
            } else if (b2 == 1) {
                lg4Var.setViewType(3);
            } else if (b2 != 3 && b2 != 5) {
                if (b2 == 2) {
                    lg4Var.setViewType(5);
                }
            } else {
                lg4Var.setViewType(4);
            }
        }
    }

    public final void i(og4 og4Var, boolean z) {
        this.i0 = og4Var;
        if (z && og4Var != null) {
            ArrayList arrayList = this.d0;
            if (!arrayList.isEmpty()) {
                ((xg3) og4Var).i(false, arrayList, this.e0, this.f0);
            }
        }
    }

    public final void j(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.s0 = z;
        setPadding(0, i, 0, i2);
        gu guVar = this.b;
        if (z) {
            guVar.r1(0, i, 0, i2);
        } else {
            guVar.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) guVar.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
        this.s0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = yac.t0;
        this.r0 = i;
        jn7.f(i).b(this, jn7.l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.r0).n(this, jn7.l4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        c79 c79Var;
        byte b = this.s;
        byte b2 = 3;
        if (hl.O1()) {
            this.s = (byte) 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            b2 = 6;
            this.s = (byte) 6;
        } else {
            this.s = (byte) 3;
        }
        if (b != b2 && (c79Var = this.d) == this.V) {
            this.s0 = true;
            c79Var.f();
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

    public void setBlurredBackgroundDrawableFactory(ll0 ll0Var) {
        ol0 ol0Var = new ol0(null);
        ol0Var.e = new xz((byte) 17);
        ol0Var.f(385875968, 402653183);
        ol0Var.e(385875968, 402653183);
        ol0Var.d(0, 0);
        ol0Var.f = 1.0f;
        ol0Var.h = 1.0f;
        pg4 pg4Var = this.n0;
        jl0 c = ll0Var.c(pg4Var, ol0Var, false);
        pg4Var.b = c;
        c.r(hl.L(11.5f));
        pg4Var.b.q(hl.L(5.0f));
    }

    public void setChatPreviewDelegate(jx9 jx9Var) {
        this.j0 = jx9Var;
    }

    public void setUiCallback(xg4 xg4Var) {
        this.p0 = xg4Var;
    }

    public void setUseFromUserAsAvatar(boolean z) {
        this.q0 = z;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            a();
        }
    }

    @Override
    public final void updateColors() {
        try {
            pg4 pg4Var = this.n0;
            if (pg4Var != null) {
                pg4Var.updateColors();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void v0(float f, int i) {
    }
}
