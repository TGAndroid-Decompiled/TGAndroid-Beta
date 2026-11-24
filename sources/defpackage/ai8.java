package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class ai8 extends FrameLayout {
    public final t1 E;
    public final bf0 F;
    public final TextView G;
    public final TextView H;
    public final b61 I;
    public final TextView J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public pn2 S;
    public pn2 T;
    public rl U;
    public final pn2[] V;
    public final xh8 W;
    public final d a;
    public final int b;
    public final q7c c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList e;
    public int f;
    public boolean h;
    public final ArrayList n;
    public int r;
    public boolean s;
    public boolean w;
    public String x;
    public final FrameLayout y;

    public ai8(Activity activity, d dVar) {
        super(activity);
        this.e = new ArrayList();
        this.n = new ArrayList();
        this.L = -1;
        this.M = 0;
        this.P = -1;
        this.V = new pn2[1];
        this.W = new xh8(this, (byte) 1);
        this.a = dVar;
        int currentAccount = dVar.getCurrentAccount();
        this.b = currentAccount;
        q7c q7cVar = new q7c(activity, currentAccount, 0, false, new vh8(this, (byte) 1), new h68(this, (byte) 10), null, null);
        this.c = q7cVar;
        q7cVar.j(new bk1(this, dVar, (byte) 7));
        addView(q7cVar, qoe.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.y = frameLayout;
        t1 t1Var = new t1((byte) 7, activity, false);
        this.E = t1Var;
        t1Var.setOrientation(1);
        frameLayout.addView(t1Var, qoe.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        bf0 bf0Var = new bf0(activity);
        this.F = bf0Var;
        bf0Var.setVisibility(8);
        t1Var.addView(bf0Var, qoe.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        this.G = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        t1Var.addView(textView, qoe.r(-2, -2, 1));
        TextView textView2 = new TextView(activity);
        this.H = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        t1Var.addView(textView2, qoe.t(-2, -2, 1, 0, 9, 0, 0));
        b61 b61Var = new b61(null, activity, true);
        b61Var.setRoundRadius(24);
        this.I = b61Var;
        t1Var.addView(b61Var, qoe.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(activity);
        this.J = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        t1Var.addView(textView3, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, qoe.e(-1, -1, 119));
        q7cVar.setHideIfEmpty(false);
        q7cVar.setEmptyView(frameLayout);
        q7cVar.X1 = true;
        q7cVar.Y1 = false;
        c();
        d();
    }

    public final void a(boolean z) {
        long j;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.w) {
            boolean isEmpty = TextUtils.isEmpty(this.x);
            if (isEmpty) {
                if (this.h) {
                    return;
                }
            } else if (this.s || this.d == null) {
                return;
            }
            this.w = true;
            int i = this.b;
            oc7 r1 = oc7.r1(i);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
            TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
            tL_channels_searchPosts.flags |= 2;
            tL_channels_searchPosts.query = this.x;
            tL_channels_searchPosts.limit = 30;
            if (isEmpty) {
                ArrayList arrayList = this.e;
                if (!arrayList.isEmpty()) {
                    k47 k47Var = (k47) b10.f(1, arrayList);
                    tL_channels_searchPosts.offset_rate = this.f;
                    tL_channels_searchPosts.offset_id = k47Var.L1();
                    tL_channels_searchPosts.offset_peer = r1.l1(k47Var.k.peer_id);
                } else {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
            } else {
                ArrayList arrayList2 = this.n;
                if (!arrayList2.isEmpty()) {
                    k47 k47Var2 = (k47) b10.f(1, arrayList2);
                    tL_channels_searchPosts.offset_rate = this.r;
                    tL_channels_searchPosts.offset_id = k47Var2.L1();
                    tL_channels_searchPosts.offset_peer = r1.l1(k47Var2.k.peer_id);
                } else {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
            }
            if (z && (searchPostsFlood = this.d) != null) {
                tL_channels_searchPosts.flags |= 4;
                j = searchPostsFlood.stars_amount;
                tL_channels_searchPosts.allow_paid_stars = j;
            } else {
                j = 0;
            }
            this.L = connectionsManager.sendRequest(tL_channels_searchPosts, new e20(this, r1, isEmpty, tL_channels_searchPosts, z, j, connectionsManager), 1024);
            d();
            this.c.g3.O(true);
        }
    }

    public final void b(String str) {
        boolean z;
        int i = this.P;
        int i2 = this.b;
        if (i >= 0) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.P, true);
            this.P = -1;
        }
        if (!this.N) {
            if (this.R && (!this.n.isEmpty() || !this.s)) {
                z = true;
            } else {
                z = false;
            }
            this.O = z;
        }
        this.N = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags |= 1;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.P = ConnectionsManager.getInstance(i2).sendRequest(tL_channels_checkSearchPostsFlood, new r15(this, (byte) 18));
    }

    public final void c() {
        this.y.setBackgroundColor(cmb.w0(null, cmb.c6, false));
        this.G.setTextColor(cmb.w0(null, cmb.F6, false));
        int i = cmb.x6;
        this.J.setTextColor(cmb.w0(null, i, false));
        this.H.setTextColor(cmb.w0(null, i, false));
        q7c q7cVar = this.c;
        q7cVar.setAdapter(null);
        q7cVar.setAdapter(q7cVar.g3);
        if (this.U != null) {
            this.U = null;
            d();
        }
    }

    public final void d() {
        TLRPC.SearchPostsFlood searchPostsFlood;
        String str;
        Object valueOf;
        Object valueOf2;
        xh8 xh8Var = this.W;
        gm.r(xh8Var);
        int i = this.b;
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        boolean p = z8c.h(i).p();
        TextView textView = this.H;
        TextView textView2 = this.G;
        bf0 bf0Var = this.F;
        TextView textView3 = this.J;
        b61 b61Var = this.I;
        if (!p) {
            bf0Var.setVisibility(8);
            textView2.setText(jb6.M0(2131745447, null));
            textView.setText(jb6.M0(2131745448, null));
            b61Var.setVisibility(0);
            b61Var.i(jb6.M0(2131745462, null), true, true);
            b61Var.g(null, true);
            b61Var.setOnClickListener(new View.OnClickListener(this) {
                public final ai8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    ai8 ai8Var = this.b;
                    switch (b) {
                        case 0:
                            ai8Var.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ai8Var.I.setLoading(true);
                            ai8Var.a(true);
                            return;
                        default:
                            ai8Var.I.setLoading(true);
                            ai8Var.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(jb6.M0(2131745449, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.x);
        ArrayList arrayList = this.n;
        if (!isEmpty && arrayList.isEmpty() && this.s) {
            if (bf0Var.getImageReceiver().T == null) {
                bf0Var.setImageDrawable(new p09(2131624315, gm.L(130.0f), gm.L(130.0f)));
            }
            bf0Var.setVisibility(0);
            textView2.setText(jb6.M0(2131745451, null));
            textView.setText(jb6.a0(null, null, 2131745450, TextUtils.ellipsize(this.x, textView.getPaint(), gm.L(100.0f), TextUtils.TruncateAt.END)));
            b61Var.setVisibility(8);
            textView3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            bf0Var.setVisibility(8);
            textView2.setText(jb6.M0(2131745455, null));
            textView.setText(jb6.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i2 = this.d.wait_till - currentTime;
            int i3 = i2 / 3600;
            int i4 = i2 - (i3 * 3600);
            int i5 = i4 / 60;
            int i6 = i4 - (i5 * 60);
            b61Var.setVisibility(0);
            b61Var.i(nxa.U0(jb6.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.V), true, true);
            if (i3 > 0) {
                str = aq1.n(i3, ":");
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder(str);
            if (i5 < 10) {
                valueOf = hg9.j(i5, "0");
            } else {
                valueOf = Integer.valueOf(i5);
            }
            sb.append(valueOf);
            sb.append(":");
            if (i6 < 10) {
                valueOf2 = hg9.j(i6, "0");
            } else {
                valueOf2 = Integer.valueOf(i6);
            }
            sb.append(valueOf2);
            b61Var.g(jb6.a0(null, null, 2131745461, sb.toString()), true);
            b61Var.e.r(false, true);
            b61Var.setOnClickListener(new View.OnClickListener(this) {
                public final ai8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    ai8 ai8Var = this.b;
                    switch (b) {
                        case 0:
                            ai8Var.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ai8Var.I.setLoading(true);
                            ai8Var.a(true);
                            return;
                        default:
                            ai8Var.I.setLoading(true);
                            ai8Var.a(false);
                            return;
                    }
                }
            });
            gm.d3(xh8Var, 1000L);
            textView3.setVisibility(8);
        } else if (arrayList.isEmpty() && !this.w && !TextUtils.isEmpty(this.x)) {
            bf0Var.setVisibility(8);
            textView2.setText(jb6.M0(2131745447, null));
            textView.setText(jb6.M0(2131745448, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.S == null) {
                pn2 pn2Var = new pn2(2131232758, 0);
                this.S = pn2Var;
                pn2Var.I = 0.79f;
                pn2Var.J = 0.79f;
            }
            if (this.U == null) {
                this.U = new rl((byte) 3, cmb.v(cmb.w0(null, cmb.Ei, false), cmb.p1(0.75f, cmb.w0(null, cmb.Ii, false))), false);
            }
            spannableStringBuilder.setSpan(this.S, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) jb6.M0(2131745466, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.x, b61Var.getTextPaint(), gm.L(100.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.U, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            pn2 pn2Var2 = this.T;
            if (pn2Var2 == null) {
                pn2Var2 = new pn2(2131232247, 0);
                this.T = pn2Var2;
                pn2Var2.I = 1.05f;
                pn2Var2.J = 1.05f;
            }
            spannableStringBuilder.setSpan(pn2Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            b61Var.setVisibility(0);
            b61Var.i(spannableStringBuilder, true, true);
            b61Var.d.r(false, false);
            b61Var.g(null, true);
            b61Var.setOnClickListener(new View.OnClickListener(this) {
                public final ai8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    ai8 ai8Var = this.b;
                    switch (b) {
                        case 0:
                            ai8Var.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ai8Var.I.setLoading(true);
                            ai8Var.a(true);
                            return;
                        default:
                            ai8Var.I.setLoading(true);
                            ai8Var.a(false);
                            return;
                    }
                }
            });
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood2 = this.d;
                int i7 = searchPostsFlood2.remains;
                if (i7 < 1) {
                    i7 = searchPostsFlood2.total_daily;
                }
                textView3.setText(jb6.H(',', "SearchPostsFreeSearches", i7));
                return;
            }
            textView3.setVisibility(8);
        } else {
            bf0Var.setVisibility(8);
            textView2.setText(jb6.M0(2131745447, null));
            textView.setText(jb6.M0(2131745448, null));
            b61Var.setVisibility(8);
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
                int i8 = searchPostsFlood3.remains;
                if (i8 < 1) {
                    i8 = searchPostsFlood3.total_daily;
                }
                textView3.setText(jb6.H(',', "SearchPostsFreeSearches", i8));
                return;
            }
            textView3.setVisibility(8);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            b(null);
        }
        if (!this.Q) {
            this.Q = true;
            oc7.d1().edit().putInt("searchpostsnew", oc7.d1().getInt("searchpostsnew", 0) + 1).apply();
            jva.v(this.b, false).m();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.K) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i) {
        this.E.animate().translationY((-i) / 2.0f).setDuration(250L).setInterpolator(gb.w).start();
    }
}
