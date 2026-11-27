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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
public final class mj8 extends FrameLayout {
    public final u1 E;
    public final de0 F;
    public final TextView G;
    public final TextView H;
    public final c51 I;
    public final TextView J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public wm2 S;
    public wm2 T;
    public sk U;
    public final wm2[] V;
    public final jj8 W;
    public final e a;
    public final int b;
    public final q9c c;
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

    public mj8(Activity activity, e eVar) {
        super(activity);
        this.e = new ArrayList();
        this.n = new ArrayList();
        this.L = -1;
        this.M = 0;
        this.P = -1;
        this.V = new wm2[1];
        this.W = new jj8(this, (byte) 1);
        this.a = eVar;
        int currentAccount = eVar.getCurrentAccount();
        this.b = currentAccount;
        q9c q9cVar = new q9c(activity, currentAccount, 0, false, new hj8(this, (byte) 1), new jz7(this, (byte) 13), null, null);
        this.c = q9cVar;
        q9cVar.j(new bj1(this, eVar, (byte) 7));
        addView(q9cVar, tre.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.y = frameLayout;
        u1 u1Var = new u1((byte) 7, activity, false);
        this.E = u1Var;
        u1Var.setOrientation(1);
        frameLayout.addView(u1Var, tre.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        de0 de0Var = new de0(activity);
        this.F = de0Var;
        de0Var.setVisibility(8);
        u1Var.addView(de0Var, tre.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        this.G = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        u1Var.addView(textView, tre.r(-2, -2, 1));
        TextView textView2 = new TextView(activity);
        this.H = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        u1Var.addView(textView2, tre.t(-2, -2, 1, 0, 9, 0, 0));
        c51 c51Var = new c51(null, activity, true);
        c51Var.setRoundRadius(24);
        this.I = c51Var;
        u1Var.addView(c51Var, tre.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(activity);
        this.J = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        u1Var.addView(textView3, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, tre.e(-1, -1, 119));
        q9cVar.setHideIfEmpty(false);
        q9cVar.setEmptyView(frameLayout);
        q9cVar.X1 = true;
        q9cVar.Y1 = false;
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
            uc7 s1 = uc7.s1(i);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
            TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
            tL_channels_searchPosts.flags |= 2;
            tL_channels_searchPosts.query = this.x;
            tL_channels_searchPosts.limit = 30;
            if (isEmpty) {
                ArrayList arrayList = this.e;
                if (!arrayList.isEmpty()) {
                    r47 r47Var = (r47) c00.g(1, arrayList);
                    tL_channels_searchPosts.offset_rate = this.f;
                    tL_channels_searchPosts.offset_id = r47Var.L1();
                    tL_channels_searchPosts.offset_peer = s1.m1(r47Var.k.peer_id);
                } else {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
            } else {
                ArrayList arrayList2 = this.n;
                if (!arrayList2.isEmpty()) {
                    r47 r47Var2 = (r47) c00.g(1, arrayList2);
                    tL_channels_searchPosts.offset_rate = this.r;
                    tL_channels_searchPosts.offset_id = r47Var2.L1();
                    tL_channels_searchPosts.offset_peer = s1.m1(r47Var2.k.peer_id);
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
            this.L = connectionsManager.sendRequest(tL_channels_searchPosts, new f10(this, s1, isEmpty, tL_channels_searchPosts, z, j, connectionsManager), 1024);
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
        this.P = ConnectionsManager.getInstance(i2).sendRequest(tL_channels_checkSearchPostsFlood, new w15(this, (byte) 18));
    }

    public final void c() {
        this.y.setBackgroundColor(aob.w0(null, aob.d6, false));
        this.G.setTextColor(aob.w0(null, aob.G6, false));
        int i = aob.y6;
        this.J.setTextColor(aob.w0(null, i, false));
        this.H.setTextColor(aob.w0(null, i, false));
        q9c q9cVar = this.c;
        q9cVar.setAdapter(null);
        q9cVar.setAdapter(q9cVar.g3);
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
        jj8 jj8Var = this.W;
        hl.r(jj8Var);
        int i = this.b;
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        boolean p = yac.h(i).p();
        TextView textView = this.H;
        TextView textView2 = this.G;
        de0 de0Var = this.F;
        TextView textView3 = this.J;
        c51 c51Var = this.I;
        if (!p) {
            de0Var.setVisibility(8);
            textView2.setText(ob6.M0(2131745441, null));
            textView.setText(ob6.M0(2131745442, null));
            c51Var.setVisibility(0);
            c51Var.i(ob6.M0(2131745456, null), true, true);
            c51Var.g(null, true);
            c51Var.setOnClickListener(new View.OnClickListener(this) {
                public final mj8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    mj8 mj8Var = this.b;
                    switch (b) {
                        case 0:
                            mj8Var.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            mj8Var.I.setLoading(true);
                            mj8Var.a(true);
                            return;
                        default:
                            mj8Var.I.setLoading(true);
                            mj8Var.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(ob6.M0(2131745443, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.x);
        ArrayList arrayList = this.n;
        if (!isEmpty && arrayList.isEmpty() && this.s) {
            if (de0Var.getImageReceiver().T == null) {
                de0Var.setImageDrawable(new b29(2131624315, hl.L(130.0f), hl.L(130.0f)));
            }
            de0Var.setVisibility(0);
            textView2.setText(ob6.M0(2131745445, null));
            textView.setText(ob6.a0(null, null, 2131745444, TextUtils.ellipsize(this.x, textView.getPaint(), hl.L(100.0f), TextUtils.TruncateAt.END)));
            c51Var.setVisibility(8);
            textView3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            de0Var.setVisibility(8);
            textView2.setText(ob6.M0(2131745449, null));
            textView.setText(ob6.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i2 = this.d.wait_till - currentTime;
            int i3 = i2 / 3600;
            int i4 = i2 - (i3 * 3600);
            int i5 = i4 / 60;
            int i6 = i4 - (i5 * 60);
            c51Var.setVisibility(0);
            c51Var.i(nza.U0(ob6.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.V), true, true);
            if (i3 > 0) {
                str = bp1.n(i3, ":");
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder(str);
            if (i5 < 10) {
                valueOf = uh9.k(i5, "0");
            } else {
                valueOf = Integer.valueOf(i5);
            }
            sb.append(valueOf);
            sb.append(":");
            if (i6 < 10) {
                valueOf2 = uh9.k(i6, "0");
            } else {
                valueOf2 = Integer.valueOf(i6);
            }
            sb.append(valueOf2);
            c51Var.g(ob6.a0(null, null, 2131745455, sb.toString()), true);
            c51Var.e.r(false, true);
            c51Var.setOnClickListener(new View.OnClickListener(this) {
                public final mj8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    mj8 mj8Var = this.b;
                    switch (b) {
                        case 0:
                            mj8Var.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            mj8Var.I.setLoading(true);
                            mj8Var.a(true);
                            return;
                        default:
                            mj8Var.I.setLoading(true);
                            mj8Var.a(false);
                            return;
                    }
                }
            });
            hl.d3(jj8Var, 1000L);
            textView3.setVisibility(8);
        } else if (arrayList.isEmpty() && !this.w && !TextUtils.isEmpty(this.x)) {
            de0Var.setVisibility(8);
            textView2.setText(ob6.M0(2131745441, null));
            textView.setText(ob6.M0(2131745442, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.S == null) {
                wm2 wm2Var = new wm2(2131232757, 0);
                this.S = wm2Var;
                wm2Var.I = 0.79f;
                wm2Var.J = 0.79f;
            }
            if (this.U == null) {
                this.U = new sk((byte) 3, aob.v(aob.w0(null, aob.Fi, false), aob.p1(0.75f, aob.w0(null, aob.Ji, false))), false);
            }
            spannableStringBuilder.setSpan(this.S, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) ob6.M0(2131745460, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.x, c51Var.getTextPaint(), hl.L(100.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.U, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            wm2 wm2Var2 = this.T;
            if (wm2Var2 == null) {
                wm2Var2 = new wm2(2131232246, 0);
                this.T = wm2Var2;
                wm2Var2.I = 1.05f;
                wm2Var2.J = 1.05f;
            }
            spannableStringBuilder.setSpan(wm2Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            c51Var.setVisibility(0);
            c51Var.i(spannableStringBuilder, true, true);
            c51Var.d.r(false, false);
            c51Var.g(null, true);
            c51Var.setOnClickListener(new View.OnClickListener(this) {
                public final mj8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    mj8 mj8Var = this.b;
                    switch (b) {
                        case 0:
                            mj8Var.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            mj8Var.I.setLoading(true);
                            mj8Var.a(true);
                            return;
                        default:
                            mj8Var.I.setLoading(true);
                            mj8Var.a(false);
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
                textView3.setText(ob6.H(',', "SearchPostsFreeSearches", i7));
                return;
            }
            textView3.setVisibility(8);
        } else {
            de0Var.setVisibility(8);
            textView2.setText(ob6.M0(2131745441, null));
            textView.setText(ob6.M0(2131745442, null));
            c51Var.setVisibility(8);
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
                int i8 = searchPostsFlood3.remains;
                if (i8 < 1) {
                    i8 = searchPostsFlood3.total_daily;
                }
                textView3.setText(ob6.H(',', "SearchPostsFreeSearches", i8));
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
            uc7.e1().edit().putInt("searchpostsnew", uc7.e1().getInt("searchpostsnew", 0) + 1).apply();
            jxa.v(this.b, false).m();
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
        this.E.animate().translationY((-i) / 2.0f).setDuration(250L).setInterpolator(hb.w).start();
    }
}
