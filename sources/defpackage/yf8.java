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
public final class yf8 extends FrameLayout {
    public final t1 E;
    public final be0 F;
    public final TextView G;
    public final TextView H;
    public final u41 I;
    public final TextView J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public cm2 S;
    public cm2 T;
    public rk U;
    public final cm2[] V;
    public final vf8 W;
    public final d a;
    public final int b;
    public final q5c c;
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

    public yf8(Activity activity, d dVar) {
        super(activity);
        this.e = new ArrayList();
        this.n = new ArrayList();
        this.L = -1;
        this.M = 0;
        this.P = -1;
        this.V = new cm2[1];
        this.W = new vf8(this, (byte) 1);
        this.a = dVar;
        int currentAccount = dVar.getCurrentAccount();
        this.b = currentAccount;
        q5c q5cVar = new q5c(activity, currentAccount, 0, false, new tf8(this, (byte) 1), new k88(this, (byte) 6), null, null);
        this.c = q5cVar;
        q5cVar.j(new si1(this, dVar, (byte) 7));
        addView(q5cVar, nme.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.y = frameLayout;
        t1 t1Var = new t1((byte) 7, activity, false);
        this.E = t1Var;
        t1Var.setOrientation(1);
        frameLayout.addView(t1Var, nme.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        be0 be0Var = new be0(activity);
        this.F = be0Var;
        be0Var.setVisibility(8);
        t1Var.addView(be0Var, nme.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        this.G = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        t1Var.addView(textView, nme.r(-2, -2, 1));
        TextView textView2 = new TextView(activity);
        this.H = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        t1Var.addView(textView2, nme.t(-2, -2, 1, 0, 9, 0, 0));
        u41 u41Var = new u41(null, activity, true);
        u41Var.setRoundRadius(24);
        this.I = u41Var;
        t1Var.addView(u41Var, nme.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(activity);
        this.J = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        t1Var.addView(textView3, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, nme.e(-1, -1, 119));
        q5cVar.setHideIfEmpty(false);
        q5cVar.setEmptyView(frameLayout);
        q5cVar.X1 = true;
        q5cVar.Y1 = false;
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
            na7 q1 = na7.q1(i);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
            TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
            tL_channels_searchPosts.flags |= 2;
            tL_channels_searchPosts.query = this.x;
            tL_channels_searchPosts.limit = 30;
            if (isEmpty) {
                ArrayList arrayList = this.e;
                if (!arrayList.isEmpty()) {
                    k27 k27Var = (k27) b00.f(1, arrayList);
                    tL_channels_searchPosts.offset_rate = this.f;
                    tL_channels_searchPosts.offset_id = k27Var.L1();
                    tL_channels_searchPosts.offset_peer = q1.k1(k27Var.k.peer_id);
                } else {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
            } else {
                ArrayList arrayList2 = this.n;
                if (!arrayList2.isEmpty()) {
                    k27 k27Var2 = (k27) b00.f(1, arrayList2);
                    tL_channels_searchPosts.offset_rate = this.r;
                    tL_channels_searchPosts.offset_id = k27Var2.L1();
                    tL_channels_searchPosts.offset_peer = q1.k1(k27Var2.k.peer_id);
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
            this.L = connectionsManager.sendRequest(tL_channels_searchPosts, new e10(this, q1, isEmpty, tL_channels_searchPosts, z, j, connectionsManager), 1024);
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
        this.P = ConnectionsManager.getInstance(i2).sendRequest(tL_channels_checkSearchPostsFlood, new n35(this, (byte) 17));
    }

    public final void c() {
        this.y.setBackgroundColor(bkb.w0(null, bkb.c6, false));
        this.G.setTextColor(bkb.w0(null, bkb.F6, false));
        int i = bkb.x6;
        this.J.setTextColor(bkb.w0(null, i, false));
        this.H.setTextColor(bkb.w0(null, i, false));
        q5c q5cVar = this.c;
        q5cVar.setAdapter(null);
        q5cVar.setAdapter(q5cVar.g3);
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
        vf8 vf8Var = this.W;
        gl.r(vf8Var);
        int i = this.b;
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        boolean p = y6c.h(i).p();
        TextView textView = this.H;
        TextView textView2 = this.G;
        be0 be0Var = this.F;
        TextView textView3 = this.J;
        u41 u41Var = this.I;
        if (!p) {
            be0Var.setVisibility(8);
            textView2.setText(k96.M0(2131745521, null));
            textView.setText(k96.M0(2131745522, null));
            u41Var.setVisibility(0);
            u41Var.i(k96.M0(2131745536, null), true, true);
            u41Var.g(null, true);
            u41Var.setOnClickListener(new View.OnClickListener(this) {
                public final yf8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    yf8 yf8Var = this.b;
                    switch (b) {
                        case 0:
                            yf8Var.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            yf8Var.I.setLoading(true);
                            yf8Var.a(true);
                            return;
                        default:
                            yf8Var.I.setLoading(true);
                            yf8Var.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(k96.M0(2131745523, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.x);
        ArrayList arrayList = this.n;
        if (!isEmpty && arrayList.isEmpty() && this.s) {
            if (be0Var.getImageReceiver().T == null) {
                be0Var.setImageDrawable(new oy8(2131624315, gl.L(130.0f), gl.L(130.0f)));
            }
            be0Var.setVisibility(0);
            textView2.setText(k96.M0(2131745525, null));
            textView.setText(k96.a0(null, null, 2131745524, TextUtils.ellipsize(this.x, textView.getPaint(), gl.L(100.0f), TextUtils.TruncateAt.END)));
            u41Var.setVisibility(8);
            textView3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            be0Var.setVisibility(8);
            textView2.setText(k96.M0(2131745529, null));
            textView.setText(k96.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i2 = this.d.wait_till - currentTime;
            int i3 = i2 / 3600;
            int i4 = i2 - (i3 * 3600);
            int i5 = i4 / 60;
            int i6 = i4 - (i5 * 60);
            u41Var.setVisibility(0);
            u41Var.i(jva.T0(k96.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.V), true, true);
            if (i3 > 0) {
                str = oo1.n(i3, ":");
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder(str);
            if (i5 < 10) {
                valueOf = de9.k(i5, "0");
            } else {
                valueOf = Integer.valueOf(i5);
            }
            sb.append(valueOf);
            sb.append(":");
            if (i6 < 10) {
                valueOf2 = de9.k(i6, "0");
            } else {
                valueOf2 = Integer.valueOf(i6);
            }
            sb.append(valueOf2);
            u41Var.g(k96.a0(null, null, 2131745535, sb.toString()), true);
            u41Var.e.r(false, true);
            u41Var.setOnClickListener(new View.OnClickListener(this) {
                public final yf8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    yf8 yf8Var = this.b;
                    switch (b) {
                        case 0:
                            yf8Var.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            yf8Var.I.setLoading(true);
                            yf8Var.a(true);
                            return;
                        default:
                            yf8Var.I.setLoading(true);
                            yf8Var.a(false);
                            return;
                    }
                }
            });
            gl.e3(vf8Var, 1000L);
            textView3.setVisibility(8);
        } else if (arrayList.isEmpty() && !this.w && !TextUtils.isEmpty(this.x)) {
            be0Var.setVisibility(8);
            textView2.setText(k96.M0(2131745521, null));
            textView.setText(k96.M0(2131745522, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.S == null) {
                cm2 cm2Var = new cm2(2131232746, 0);
                this.S = cm2Var;
                cm2Var.I = 0.79f;
                cm2Var.J = 0.79f;
            }
            if (this.U == null) {
                this.U = new rk((byte) 3, bkb.v(bkb.w0(null, bkb.Ei, false), bkb.p1(0.75f, bkb.w0(null, bkb.Ii, false))), false);
            }
            spannableStringBuilder.setSpan(this.S, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) k96.M0(2131745540, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.x, u41Var.getTextPaint(), gl.L(100.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.U, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            cm2 cm2Var2 = this.T;
            if (cm2Var2 == null) {
                cm2Var2 = new cm2(2131232246, 0);
                this.T = cm2Var2;
                cm2Var2.I = 1.05f;
                cm2Var2.J = 1.05f;
            }
            spannableStringBuilder.setSpan(cm2Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            u41Var.setVisibility(0);
            u41Var.i(spannableStringBuilder, true, true);
            u41Var.d.r(false, false);
            u41Var.g(null, true);
            u41Var.setOnClickListener(new View.OnClickListener(this) {
                public final yf8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    yf8 yf8Var = this.b;
                    switch (b) {
                        case 0:
                            yf8Var.a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            yf8Var.I.setLoading(true);
                            yf8Var.a(true);
                            return;
                        default:
                            yf8Var.I.setLoading(true);
                            yf8Var.a(false);
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
                textView3.setText(k96.H(',', "SearchPostsFreeSearches", i7));
                return;
            }
            textView3.setVisibility(8);
        } else {
            be0Var.setVisibility(8);
            textView2.setText(k96.M0(2131745521, null));
            textView.setText(k96.M0(2131745522, null));
            u41Var.setVisibility(8);
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
                int i8 = searchPostsFlood3.remains;
                if (i8 < 1) {
                    i8 = searchPostsFlood3.total_daily;
                }
                textView3.setText(k96.H(',', "SearchPostsFreeSearches", i8));
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
            na7.c1().edit().putInt("searchpostsnew", na7.c1().getInt("searchpostsnew", 0) + 1).apply();
            gta.v(this.b, false).m();
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
